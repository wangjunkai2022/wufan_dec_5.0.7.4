package com.swift.sandhook.wrapper;

import android.text.TextUtils;
import com.swift.sandhook.SandHook;
import com.swift.sandhook.annotation.HookClass;
import com.swift.sandhook.annotation.HookMethod;
import com.swift.sandhook.annotation.HookMethodBackup;
import com.swift.sandhook.annotation.HookReflectClass;
import com.swift.sandhook.annotation.MethodParams;
import com.swift.sandhook.annotation.MethodReflectParams;
import com.swift.sandhook.annotation.Param;
import com.swift.sandhook.annotation.SkipParamCheck;
import com.swift.sandhook.annotation.ThisObject;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class HookWrapper {
    public static void addHookClass(Class<?>... clsArr) throws HookErrorException {
        addHookClass((ClassLoader) null, clsArr);
    }

    public static void checkSignature(Member member, Method method, Class[] clsArr) throws HookErrorException {
        Class<?> returnType;
        if (Modifier.isStatic(method.getModifiers())) {
            if (member instanceof Constructor) {
                if (!method.getReturnType().equals(Void.TYPE)) {
                    throw new HookErrorException("error return type! - " + method.getName());
                }
            } else if ((member instanceof Method) && (returnType = ((Method) member).getReturnType()) != method.getReturnType() && !returnType.isAssignableFrom(returnType)) {
                throw new HookErrorException("error return type! - " + method.getName());
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes == null) {
                parameterTypes = new Class[0];
            }
            if (clsArr == null) {
                clsArr = new Class[0];
            }
            if (clsArr.length == 0 && parameterTypes.length == 0) {
                return;
            }
            int i4 = 1;
            if (!Modifier.isStatic(member.getModifiers())) {
                if (parameterTypes.length != 0) {
                    if (parameterTypes[0] != member.getDeclaringClass() && !parameterTypes[0].isAssignableFrom(member.getDeclaringClass())) {
                        throw new HookErrorException("first par must be this! " + method.getName());
                    } else if (parameterTypes.length != clsArr.length + 1) {
                        throw new HookErrorException("hook method pars must match the origin method! " + method.getName());
                    }
                } else {
                    throw new HookErrorException("first par must be this! " + method.getName());
                }
            } else if (parameterTypes.length != clsArr.length) {
                throw new HookErrorException("hook method pars must match the origin method! " + method.getName());
            } else {
                i4 = 0;
            }
            for (int i5 = 0; i5 < clsArr.length; i5++) {
                int i6 = i5 + i4;
                if (parameterTypes[i6] != clsArr[i5] && !parameterTypes[i6].isAssignableFrom(clsArr[i5])) {
                    throw new HookErrorException("hook method pars must match the origin method! " + method.getName());
                }
            }
            return;
        }
        throw new HookErrorException("hook method must static! - " + method.getName());
    }

    private static Class classNameToClass(String str, ClassLoader classLoader) throws ClassNotFoundException {
        str.hashCode();
        char c5 = 65535;
        switch (str.hashCode()) {
            case -1325958191:
                if (str.equals(MethodReflectParams.DOUBLE)) {
                    c5 = 0;
                    break;
                }
                break;
            case 104431:
                if (str.equals(MethodReflectParams.INT)) {
                    c5 = 1;
                    break;
                }
                break;
            case 3039496:
                if (str.equals(MethodReflectParams.BYTE)) {
                    c5 = 2;
                    break;
                }
                break;
            case 3052374:
                if (str.equals(MethodReflectParams.CHAR)) {
                    c5 = 3;
                    break;
                }
                break;
            case 3327612:
                if (str.equals(MethodReflectParams.LONG)) {
                    c5 = 4;
                    break;
                }
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    c5 = 5;
                    break;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    c5 = 6;
                    break;
                }
                break;
            case 109413500:
                if (str.equals(MethodReflectParams.SHORT)) {
                    c5 = 7;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                return Double.TYPE;
            case 1:
                return Integer.TYPE;
            case 2:
                return Byte.TYPE;
            case 3:
                return Character.TYPE;
            case 4:
                return Long.TYPE;
            case 5:
                return Boolean.TYPE;
            case 6:
                return Float.TYPE;
            case 7:
                return Short.TYPE;
            default:
                if (classLoader == null) {
                    return Class.forName(str);
                }
                return Class.forName(str, true, classLoader);
        }
    }

    private static void fillBackupMethod(ClassLoader classLoader, Class<?> cls, Map<Member, HookEntity> map) {
        Field[] fieldArr;
        HookMethodBackup hookMethodBackup;
        try {
            fieldArr = cls.getDeclaredFields();
        } catch (Throwable unused) {
            fieldArr = null;
        }
        if (fieldArr == null || fieldArr.length == 0 || map.isEmpty()) {
            return;
        }
        for (Field field : fieldArr) {
            if (Modifier.isStatic(field.getModifiers()) && (hookMethodBackup = (HookMethodBackup) field.getAnnotation(HookMethodBackup.class)) != null) {
                for (HookEntity hookEntity : map.values()) {
                    if (TextUtils.equals(hookEntity.isCtor() ? "<init>" : hookEntity.target.getName(), hookMethodBackup.value()) && samePars(classLoader, field, hookEntity.pars)) {
                        field.setAccessible(true);
                        if (hookEntity.backup == null) {
                            hookEntity.backup = StubMethodsFactory.getStubMethod();
                            hookEntity.hookIsStub = true;
                            hookEntity.resolveDexCache = false;
                        }
                        if (hookEntity.backup != null) {
                            try {
                                if (field.getType() == Method.class) {
                                    field.set(null, hookEntity.backup);
                                } else if (field.getType() == HookEntity.class) {
                                    field.set(null, hookEntity);
                                }
                            } catch (IllegalAccessException e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }

    private static Map<Member, HookEntity> getHookMethods(ClassLoader classLoader, Class cls, Class<?> cls2) throws HookErrorException {
        Method[] methodArr;
        Member declaredMethod;
        Member declaredMethod2;
        HashMap hashMap = new HashMap();
        try {
            methodArr = cls2.getDeclaredMethods();
        } catch (Throwable unused) {
            methodArr = null;
        }
        if (methodArr != null && methodArr.length != 0) {
            for (Method method : methodArr) {
                HookMethod hookMethod = (HookMethod) method.getAnnotation(HookMethod.class);
                HookMethodBackup hookMethodBackup = (HookMethodBackup) method.getAnnotation(HookMethodBackup.class);
                if (hookMethod != null) {
                    String value = hookMethod.value();
                    Class<?>[] parseMethodPars = parseMethodPars(classLoader, method);
                    try {
                        if (value.equals("<init>")) {
                            declaredMethod2 = cls.getConstructor(parseMethodPars);
                        } else {
                            declaredMethod2 = cls.getDeclaredMethod(value, parseMethodPars);
                        }
                        if (!method.isAnnotationPresent(SkipParamCheck.class)) {
                            checkSignature(declaredMethod2, method, parseMethodPars);
                        }
                        HookEntity hookEntity = (HookEntity) hashMap.get(declaredMethod2);
                        if (hookEntity == null) {
                            hookEntity = new HookEntity(declaredMethod2);
                            hashMap.put(declaredMethod2, hookEntity);
                        }
                        hookEntity.pars = parseMethodPars;
                        hookEntity.hook = method;
                    } catch (NoSuchMethodException e5) {
                        throw new HookErrorException("can not find target method: " + value, e5);
                    }
                } else if (hookMethodBackup != null) {
                    String value2 = hookMethodBackup.value();
                    Class<?>[] parseMethodPars2 = parseMethodPars(classLoader, method);
                    try {
                        if (value2.equals("<init>")) {
                            declaredMethod = cls.getConstructor(parseMethodPars2);
                        } else {
                            declaredMethod = cls.getDeclaredMethod(value2, parseMethodPars2);
                        }
                        if (!method.isAnnotationPresent(SkipParamCheck.class)) {
                            checkSignature(declaredMethod, method, parseMethodPars2);
                        }
                        HookEntity hookEntity2 = (HookEntity) hashMap.get(declaredMethod);
                        if (hookEntity2 == null) {
                            hookEntity2 = new HookEntity(declaredMethod);
                            hashMap.put(declaredMethod, hookEntity2);
                        }
                        hookEntity2.pars = parseMethodPars2;
                        hookEntity2.backup = method;
                    } catch (NoSuchMethodException e6) {
                        throw new HookErrorException("can not find target method: " + value2, e6);
                    }
                } else {
                    continue;
                }
            }
            return hashMap;
        }
        throw new HookErrorException("error hook wrapper class :" + cls.getName());
    }

    private static int getParsCount(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes == null) {
            return 0;
        }
        return parameterTypes.length;
    }

    private static Class getRealParType(ClassLoader classLoader, Class cls, Annotation[] annotationArr, boolean z4) throws Exception {
        if (annotationArr != null && annotationArr.length != 0) {
            for (Annotation annotation : annotationArr) {
                if (annotation instanceof Param) {
                    Param param = (Param) annotation;
                    if (TextUtils.isEmpty(param.value())) {
                        return cls;
                    }
                    Class<?> classNameToClass = classNameToClass(param.value(), classLoader);
                    if (z4 || classNameToClass.equals(cls) || cls.isAssignableFrom(classNameToClass)) {
                        return classNameToClass;
                    }
                    throw new ClassCastException("hook method par cast error!");
                }
            }
        }
        return cls;
    }

    private static Class getTargetHookClass(ClassLoader classLoader, Class<?> cls) {
        HookClass hookClass = (HookClass) cls.getAnnotation(HookClass.class);
        HookReflectClass hookReflectClass = (HookReflectClass) cls.getAnnotation(HookReflectClass.class);
        if (hookClass != null) {
            return hookClass.value();
        }
        if (hookReflectClass != null) {
            try {
                if (classLoader == null) {
                    return Class.forName(hookReflectClass.value());
                }
                return Class.forName(hookReflectClass.value(), true, classLoader);
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    private static boolean hasThisObject(Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (parameterAnnotations == null || parameterAnnotations.length == 0) {
            return false;
        }
        return isThisObject(parameterAnnotations[0]);
    }

    private static boolean isThisObject(Annotation[] annotationArr) {
        if (annotationArr != null && annotationArr.length != 0) {
            for (Annotation annotation : annotationArr) {
                if (annotation instanceof ThisObject) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Class[] parseMethodPars(ClassLoader classLoader, Method method) throws HookErrorException {
        MethodParams methodParams = (MethodParams) method.getAnnotation(MethodParams.class);
        MethodReflectParams methodReflectParams = (MethodReflectParams) method.getAnnotation(MethodReflectParams.class);
        if (methodParams != null) {
            return methodParams.value();
        }
        if (methodReflectParams != null) {
            if (methodReflectParams.value().length == 0) {
                return null;
            }
            Class[] clsArr = new Class[methodReflectParams.value().length];
            for (int i4 = 0; i4 < methodReflectParams.value().length; i4++) {
                try {
                    clsArr[i4] = classNameToClass(methodReflectParams.value()[i4], classLoader);
                } catch (ClassNotFoundException e5) {
                    throw new HookErrorException("hook method pars error: " + method.getName(), e5);
                }
            }
            return clsArr;
        } else if (getParsCount(method) > 0) {
            if (getParsCount(method) == 1) {
                if (hasThisObject(method)) {
                    return parseMethodParsNew(classLoader, method);
                }
                return null;
            }
            return parseMethodParsNew(classLoader, method);
        } else {
            return null;
        }
    }

    private static Class[] parseMethodParsNew(ClassLoader classLoader, Method method) throws HookErrorException {
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class[] clsArr = null;
        if (parameterTypes != null && parameterTypes.length != 0) {
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int i4 = 0;
            for (int i5 = 0; i5 < parameterAnnotations.length; i5++) {
                Class<?> cls = parameterTypes[i5];
                Annotation[] annotationArr = parameterAnnotations[i5];
                try {
                    if (i5 == 0) {
                        if (isThisObject(annotationArr)) {
                            clsArr = new Class[parameterAnnotations.length - 1];
                        } else {
                            clsArr = new Class[parameterAnnotations.length];
                        }
                    }
                    clsArr[i4] = getRealParType(classLoader, cls, annotationArr, method.isAnnotationPresent(SkipParamCheck.class));
                    i4++;
                } catch (Exception e5) {
                    throw new HookErrorException("hook method <" + method.getName() + "> parser pars error", e5);
                }
            }
        }
        return clsArr;
    }

    private static boolean samePars(ClassLoader classLoader, Field field, Class[] clsArr) {
        try {
            Class[] parseMethodPars = parseMethodPars(classLoader, field);
            if (parseMethodPars == null && field.isAnnotationPresent(SkipParamCheck.class)) {
                return true;
            }
            if (clsArr == null) {
                clsArr = new Class[0];
            }
            if (parseMethodPars == null) {
                parseMethodPars = new Class[0];
            }
            if (clsArr.length != parseMethodPars.length) {
                return false;
            }
            for (int i4 = 0; i4 < clsArr.length; i4++) {
                if (clsArr[i4] != parseMethodPars[i4]) {
                    return false;
                }
            }
            return true;
        } catch (HookErrorException unused) {
            return false;
        }
    }

    public static void addHookClass(ClassLoader classLoader, Class<?>... clsArr) throws HookErrorException {
        for (Class<?> cls : clsArr) {
            addHookClass(classLoader, cls);
        }
    }

    public static void addHookClass(ClassLoader classLoader, Class<?> cls) throws HookErrorException {
        Class targetHookClass = getTargetHookClass(classLoader, cls);
        if (targetHookClass != null) {
            Map<Member, HookEntity> hookMethods = getHookMethods(classLoader, targetHookClass, cls);
            try {
                fillBackupMethod(classLoader, cls, hookMethods);
                for (HookEntity hookEntity : hookMethods.values()) {
                    SandHook.hook(hookEntity);
                }
                return;
            } catch (Throwable th) {
                throw new HookErrorException("fillBackupMethod error!", th);
            }
        }
        throw new HookErrorException("error hook wrapper class :" + cls.getName());
    }

    /* loaded from: classes.dex */
    public static class HookEntity {
        public Method backup;
        public boolean backupIsStub;
        public Method hook;
        public boolean hookIsStub;
        public int hookMode;
        public boolean initClass;
        public Class[] pars;
        public boolean resolveDexCache;
        public Member target;

        public HookEntity(Member member) {
            this.hookIsStub = false;
            this.resolveDexCache = true;
            this.backupIsStub = true;
            this.initClass = true;
            this.target = member;
        }

        public Object callOrigin(Object obj, Object... objArr) throws Throwable {
            return SandHook.callOriginMethod(this.backupIsStub, this.target, this.backup, obj, objArr);
        }

        public boolean isCtor() {
            return this.target instanceof Constructor;
        }

        public HookEntity(Member member, Method method, Method method2) {
            this.hookIsStub = false;
            this.resolveDexCache = true;
            this.backupIsStub = true;
            this.initClass = true;
            this.target = member;
            this.hook = method;
            this.backup = method2;
        }

        public HookEntity(Member member, Method method, Method method2, boolean z4) {
            this.hookIsStub = false;
            this.resolveDexCache = true;
            this.backupIsStub = true;
            this.initClass = true;
            this.target = member;
            this.hook = method;
            this.backup = method2;
            this.resolveDexCache = z4;
        }
    }

    private static Class[] parseMethodPars(ClassLoader classLoader, Field field) throws HookErrorException {
        MethodParams methodParams = (MethodParams) field.getAnnotation(MethodParams.class);
        MethodReflectParams methodReflectParams = (MethodReflectParams) field.getAnnotation(MethodReflectParams.class);
        if (methodParams != null) {
            return methodParams.value();
        }
        Class[] clsArr = null;
        if (methodReflectParams != null) {
            if (methodReflectParams.value().length == 0) {
                return null;
            }
            clsArr = new Class[methodReflectParams.value().length];
            for (int i4 = 0; i4 < methodReflectParams.value().length; i4++) {
                try {
                    clsArr[i4] = classNameToClass(methodReflectParams.value()[i4], classLoader);
                } catch (ClassNotFoundException e5) {
                    throw new HookErrorException("hook method pars error: " + field.getName(), e5);
                }
            }
        }
        return clsArr;
    }
}

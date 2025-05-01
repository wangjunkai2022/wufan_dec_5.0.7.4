package com.mob.tools.utils;

import android.content.BroadcastReceiver;
import com.join.mgps.Util.h0;
import com.mob.commons.m;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.swift.sandhook.annotation.MethodReflectParams;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public class ReflectHelper implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static HashSet<String> f56992a;

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, Class<?>> f56993b;

    /* renamed from: c  reason: collision with root package name */
    private static HashMap<Class<?>, String> f56994c;

    /* renamed from: d  reason: collision with root package name */
    private static LinkedHashMap<String, Method> f56995d;

    /* renamed from: e  reason: collision with root package name */
    private static LinkedHashMap<String, Constructor<?>> f56996e;

    /* loaded from: classes5.dex */
    public interface a<ArgType, RetType> {
        RetType a(ArgType argtype);
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f56992a = hashSet;
        hashSet.add(m.a("009ZfeUb)bb1b2bjQebcJch"));
        f56992a.add(m.a("007Wfe7b(bb+b$bjbgbi"));
        f56992a.add(m.a("0084feEbZbbSb3bjUc*bgbi"));
        f56992a.add("java.net");
        f56992a.add(m.a("009Bfe5b!bbSb=bjbe+gXbg^e"));
        HashMap<String, Class<?>> hashMap = new HashMap<>();
        f56993b = hashMap;
        hashMap.put(m.a("006Mbabibedd=ed"), Double.TYPE);
        f56993b.put(m.a("005]cd8eObi.bg"), Float.TYPE);
        f56993b.put(MethodReflectParams.LONG, Long.TYPE);
        f56993b.put(m.a("003Lbg_cg"), Integer.TYPE);
        f56993b.put(MethodReflectParams.SHORT, Short.TYPE);
        f56993b.put(MethodReflectParams.BYTE, Byte.TYPE);
        f56993b.put(m.a("004afbEbh"), Character.TYPE);
        f56993b.put("boolean", Boolean.TYPE);
        f56993b.put("Object", Object.class);
        f56993b.put("String", String.class);
        f56993b.put("Thread", Thread.class);
        f56993b.put(m.a("0081ehbeRccb0dd:ed"), Runnable.class);
        f56993b.put(m.a("006*cjcadg,gd$bd"), System.class);
        f56993b.put(m.a("006ObabibeddKed"), Double.class);
        f56993b.put("Float", Float.class);
        f56993b.put("Long", Long.class);
        f56993b.put("Integer", Integer.class);
        f56993b.put(m.a("005+cj0fAbibh,g"), Short.class);
        f56993b.put("Byte", Byte.class);
        f56993b.put(m.a("009Wcb>fb3bh5bagdYbh"), Character.class);
        f56993b.put("Boolean", Boolean.class);
        f56994c = new HashMap<>();
        for (Map.Entry<String, Class<?>> entry : f56993b.entrySet()) {
            f56994c.put(entry.getValue(), entry.getKey());
        }
        f56995d = new LinkedHashMap<String, Method>() { // from class: com.mob.tools.utils.ReflectHelper.1
            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<String, Method> entry2) {
                return size() > 10;
            }
        };
        f56996e = new LinkedHashMap<String, Constructor<?>>() { // from class: com.mob.tools.utils.ReflectHelper.2
            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<String, Constructor<?>> entry2) {
                return size() > 10;
            }
        };
    }

    private static synchronized Class<?> a(String str) {
        Class<?> cls;
        synchronized (ReflectHelper.class) {
            cls = f56993b.get(str);
            if (cls == null) {
                Iterator<String> it2 = f56992a.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    try {
                        importClass(next + h0.f27805a + str);
                    } catch (Throwable unused) {
                    }
                    cls = f56993b.get(str);
                    if (cls != null) {
                        break;
                    }
                }
            }
        }
        return cls;
    }

    private static boolean b(Class<?>[] clsArr, Class<?>[] clsArr2) {
        boolean z4;
        if (clsArr.length - clsArr2.length == 1) {
            int i4 = 0;
            while (true) {
                if (i4 >= clsArr2.length) {
                    z4 = true;
                    break;
                } else if (clsArr2[i4] != null && !a(clsArr[i4], clsArr2[i4]) && !clsArr[i4].isAssignableFrom(clsArr2[i4])) {
                    z4 = false;
                    break;
                } else {
                    i4++;
                }
            }
            return z4 && clsArr[clsArr.length - 1].isArray();
        }
        return false;
    }

    public static Object createProxy(HashMap<String, a<Object, Object[]>> hashMap, Class<?>... clsArr) throws Throwable {
        HashMap hashMap2 = new HashMap();
        for (final Map.Entry<String, a<Object, Object[]>> entry : hashMap.entrySet()) {
            hashMap2.put(entry.getKey(), new a<Object[], Object>() { // from class: com.mob.tools.utils.ReflectHelper.3
                @Override // com.mob.tools.utils.ReflectHelper.a
                public Object a(Object[] objArr) {
                    return ((Object[]) ((a) entry.getValue()).a(objArr))[0];
                }
            });
        }
        return createProxy((Map<String, a<Object[], Object>>) hashMap2, clsArr);
    }

    public static Class<?> getClass(String str) throws Throwable {
        Class<?> a5 = a(str);
        if (a5 == null) {
            try {
                a5 = Class.forName(str);
                f56993b.put(str, a5);
                return a5;
            } catch (Throwable unused) {
                return a5;
            }
        }
        return a5;
    }

    public static <T> T getInstanceField(Object obj, String str, T t4) {
        try {
            return (T) getInstanceField(obj, str);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return t4;
        }
    }

    public static String getName(Class<?> cls) throws Throwable {
        String str = f56994c.get(cls);
        if (str == null) {
            str = cls.getSimpleName();
            if (f56993b.containsKey(str)) {
                f56994c.remove(f56993b.get(str));
            }
            f56993b.put(str, cls);
            f56994c.put(cls, str);
        }
        return str;
    }

    public static <T> T getStaticField(String str, String str2, T t4) {
        try {
            getStaticField(str, str2);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        return t4;
    }

    public static String importClass(String str) throws Throwable {
        return importClass(null, str);
    }

    public static String importClassNoThrow(String str, String str2) {
        try {
            return importClass(str);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return str2;
        }
    }

    public static <T> T invokeInstanceMethod(Object obj, String str, Object[] objArr, Class<?>[] clsArr, T t4) {
        try {
            return (T) invokeInstanceMethod(obj, str, objArr, clsArr);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return t4;
        }
    }

    public static <T> T invokeInstanceMethodNoThrow(Object obj, String str, T t4, Object... objArr) {
        try {
            return (T) invokeInstanceMethod(obj, str, objArr);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return t4;
        }
    }

    public static <T> T invokeStaticMethod(String str, String str2, Object[] objArr, Class<?>[] clsArr, T t4) {
        try {
            invokeStaticMethod(str, str2, objArr, clsArr);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        return t4;
    }

    public static <T> T invokeStaticMethodNoThrow(String str, String str2, T t4, Object... objArr) {
        try {
            return (T) invokeStaticMethod(str, str2, objArr);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return t4;
        }
    }

    public static Object newInstance(String str, Object... objArr) throws Throwable {
        try {
            return a(str, objArr);
        } catch (Throwable th) {
            if (th instanceof NoSuchMethodException) {
                throw th;
            }
            throw new Throwable("className: " + str + ", methodName: <init>", th);
        }
    }

    public static void setInstanceField(Object obj, String str, Object obj2) throws Throwable {
        try {
            a(obj, str, obj2);
        } catch (Throwable th) {
            if (th instanceof NoSuchFieldException) {
                throw th;
            }
            throw new Throwable("className: " + obj.getClass() + ", fieldName: " + str + ", value: " + String.valueOf(obj2), th);
        }
    }

    public static void setStaticField(String str, String str2, Object obj) throws Throwable {
        try {
            a(str, str2, obj);
        } catch (Throwable th) {
            if (th instanceof NoSuchFieldException) {
                throw th;
            }
            throw new Throwable("className: " + str + ", fieldName: " + str2 + ", value: " + String.valueOf(obj), th);
        }
    }

    public static synchronized String importClass(String str, String str2) throws Throwable {
        synchronized (ReflectHelper.class) {
            if (str2.endsWith(".*")) {
                f56992a.add(str2.substring(0, str2.length() - 2));
                return WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD;
            }
            Class<?> cls = Class.forName(str2);
            if (str == null) {
                str = cls.getSimpleName();
            }
            if (f56993b.containsKey(str)) {
                f56994c.remove(f56993b.get(str));
            }
            f56993b.put(str, cls);
            f56994c.put(cls, str);
            return str;
        }
    }

    public static <T> T getInstanceField(Object obj, String str) throws Throwable {
        try {
            return (T) a(obj, str);
        } catch (Throwable th) {
            if (th instanceof NoSuchFieldException) {
                throw th;
            }
            throw new Throwable("className: " + obj.getClass() + ", fieldName: " + str, th);
        }
    }

    public static <T> T getStaticField(String str, String str2) throws Throwable {
        try {
            return (T) a(str, str2);
        } catch (Throwable th) {
            if (th instanceof NoSuchFieldException) {
                throw th;
            }
            throw new Throwable("className: " + str + ", fieldName: " + str2, th);
        }
    }

    public static <T> T invokeInstanceMethod(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws Throwable {
        return (T) a(null, obj, str, objArr, clsArr);
    }

    public static <T> T invokeStaticMethod(String str, String str2, Object[] objArr, Class<?>[] clsArr) throws Throwable {
        return (T) a(str, null, str2, objArr, clsArr);
    }

    public static <T> T invokeInstanceMethod(Object obj, String str, Object... objArr) throws Throwable {
        try {
            return (T) a(null, obj, str, objArr);
        } catch (Throwable th) {
            if (th instanceof NoSuchMethodException) {
                throw th;
            }
            throw new Throwable("className: " + obj.getClass() + ", methodName: " + str, th);
        }
    }

    public static <T> T invokeStaticMethod(String str, String str2, Object... objArr) throws Throwable {
        try {
            return (T) a(str, null, str2, objArr);
        } catch (Throwable th) {
            if (th instanceof NoSuchMethodException) {
                throw th;
            }
            throw new Throwable("className: " + str + ", methodName: " + str2, th);
        }
    }

    public static Object createProxy(final Map<String, a<Object[], Object>> map, Class<?>... clsArr) throws Throwable {
        if (clsArr.length == 0) {
            return null;
        }
        return Proxy.newProxyInstance(clsArr[0].getClassLoader(), clsArr, new InvocationHandler() { // from class: com.mob.tools.utils.ReflectHelper.4
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                a aVar = (a) map.get(method.getName());
                if (aVar != null) {
                    return aVar.a(objArr);
                }
                return null;
            }
        });
    }

    private static Class<?>[] a(Object[] objArr) {
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i4 = 0; i4 < objArr.length; i4++) {
            if (objArr[i4] instanceof BroadcastReceiver) {
                clsArr[i4] = BroadcastReceiver.class;
            } else {
                clsArr[i4] = objArr[i4] == null ? null : objArr[i4].getClass();
            }
        }
        return clsArr;
    }

    private static Object b(String str, Object... objArr) throws Throwable {
        Class<?> a5;
        int i4 = 0;
        String str2 = str;
        while (str2.startsWith("[")) {
            i4++;
            str2 = str2.substring(1);
        }
        int[] iArr = null;
        if (i4 == objArr.length) {
            int[] iArr2 = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                try {
                    iArr2[i5] = Integer.parseInt(String.valueOf(objArr[i5]));
                } catch (Throwable unused) {
                }
            }
            iArr = iArr2;
        }
        if (iArr != null) {
            if ("B".equals(str2)) {
                a5 = Byte.TYPE;
            } else if ("S".equals(str2)) {
                a5 = Short.TYPE;
            } else if ("I".equals(str2)) {
                a5 = Integer.TYPE;
            } else if ("J".equals(str2)) {
                a5 = Long.TYPE;
            } else if ("F".equals(str2)) {
                a5 = Float.TYPE;
            } else if ("D".equals(str2)) {
                a5 = Double.TYPE;
            } else if ("Z".equals(str2)) {
                a5 = Boolean.TYPE;
            } else if ("C".equals(str2)) {
                a5 = Character.TYPE;
            } else {
                a5 = a(str2);
            }
            if (a5 != null) {
                return Array.newInstance(a5, iArr);
            }
        }
        throw new NoSuchMethodException("className: [" + str + ", methodName: <init>");
    }

    private static boolean a(Class<?> cls, Class<?> cls2) {
        return (cls == Byte.TYPE && cls2 == Byte.class) || (cls == Short.TYPE && (cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Character.TYPE && (cls2 == Character.class || cls2 == Short.class || cls2 == Byte.class)) || ((cls == Integer.TYPE && (cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Long.TYPE && (cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Float.TYPE && (cls2 == Float.class || cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Double.TYPE && (cls2 == Double.class || cls2 == Float.class || cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || (cls == Boolean.TYPE && cls2 == Boolean.class))))));
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length == clsArr2.length) {
            for (int i4 = 0; i4 < clsArr2.length; i4++) {
                if (clsArr2[i4] != null && !a(clsArr[i4], clsArr2[i4]) && !clsArr[i4].isAssignableFrom(clsArr2[i4])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static Object a(String str, Object... objArr) throws Throwable {
        boolean z4;
        if (str.startsWith("[")) {
            return b(str, objArr);
        }
        Class<?> a5 = a(str);
        String str2 = a5.getName() + "#" + objArr.length;
        Constructor<?> constructor = f56996e.get(str2);
        Class<?>[] a6 = a(objArr);
        if (constructor != null && a(constructor.getParameterTypes(), a6)) {
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        }
        Constructor<?>[] declaredConstructors = a5.getDeclaredConstructors();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Constructor<?> constructor2 : declaredConstructors) {
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            if (a(parameterTypes, a6)) {
                f56996e.put(str2, constructor2);
                constructor2.setAccessible(true);
                return constructor2.newInstance(objArr);
            }
            if (parameterTypes.length > 0 && parameterTypes[parameterTypes.length - 1].isArray() && a6.length >= parameterTypes.length - 1) {
                arrayList.add(constructor2);
                arrayList2.add(parameterTypes);
            }
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            Class[] clsArr = (Class[]) arrayList2.get(i4);
            Class<?> componentType = clsArr[clsArr.length - 1].getComponentType();
            if (b(clsArr, a6)) {
                Object[] objArr2 = new Object[objArr.length + 1];
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                objArr2[objArr.length] = Array.newInstance(componentType, 0);
                Constructor constructor3 = (Constructor) arrayList.get(i4);
                constructor3.setAccessible(true);
                return constructor3.newInstance(objArr);
            }
            int length = clsArr.length - 1;
            while (true) {
                if (length >= a6.length) {
                    z4 = true;
                    break;
                } else if (!a6[length].equals(componentType)) {
                    z4 = false;
                    break;
                } else {
                    length++;
                }
            }
            if (z4) {
                int length2 = (a6.length - clsArr.length) + 1;
                Object newInstance = Array.newInstance(componentType, length2);
                for (int i5 = 0; i5 < length2; i5++) {
                    Array.set(newInstance, i5, objArr[(clsArr.length - 1) + i5]);
                }
                Object[] objArr3 = new Object[objArr.length + 1];
                System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
                objArr3[objArr.length] = newInstance;
                Constructor constructor4 = (Constructor) arrayList.get(i4);
                constructor4.setAccessible(true);
                return constructor4.newInstance(objArr);
            }
        }
        throw new NoSuchMethodException("className: " + str + ", methodName: <init>");
    }

    private static Object b(Object obj, String str) throws Throwable {
        int i4;
        int i5;
        if (obj instanceof List) {
            if (str.startsWith("[") && str.endsWith("]")) {
                try {
                    i5 = Integer.parseInt(str.substring(1, str.length() - 1));
                } catch (Throwable unused) {
                    i5 = -1;
                }
                if (i5 != -1) {
                    return ((List) obj).get(i5);
                }
            }
        } else if (m.a("006edc-chAgf").equals(str)) {
            return Integer.valueOf(Array.getLength(obj));
        } else {
            if (str.startsWith("[") && str.endsWith("]")) {
                try {
                    i4 = Integer.parseInt(str.substring(1, str.length() - 1));
                } catch (Throwable unused2) {
                    i4 = -1;
                }
                if (i4 != -1) {
                    return Array.get(obj, i4);
                }
            }
        }
        throw new NoSuchFieldException("className: " + obj.getClass() + ", fieldName: " + str);
    }

    private static void b(Object obj, String str, Object obj2) throws Throwable {
        int i4;
        int i5;
        if (obj instanceof List) {
            if (str.startsWith("[") && str.endsWith("]")) {
                try {
                    i5 = Integer.parseInt(str.substring(1, str.length() - 1));
                } catch (Throwable unused) {
                    i5 = -1;
                }
                if (i5 != -1) {
                    ((List) obj).set(i5, obj2);
                    return;
                }
            }
        } else if (str.startsWith("[") && str.endsWith("]")) {
            try {
                i4 = Integer.parseInt(str.substring(1, str.length() - 1));
            } catch (Throwable unused2) {
                i4 = -1;
            }
            if (i4 != -1) {
                String name = obj.getClass().getName();
                while (name.startsWith("[")) {
                    name = name.substring(1);
                }
                Class<?> cls = obj2.getClass();
                if (!"B".equals(name)) {
                    Object obj3 = null;
                    if ("S".equals(name)) {
                        if (cls == Short.class) {
                            obj3 = obj2;
                        } else if (cls == Byte.class) {
                            obj3 = Short.valueOf(((Byte) obj2).byteValue());
                        }
                        if (obj3 != null) {
                            Array.set(obj, i4, obj3);
                            return;
                        }
                    } else if ("I".equals(name)) {
                        if (cls == Integer.class) {
                            obj3 = obj2;
                        } else if (cls == Short.class) {
                            obj3 = Integer.valueOf(((Short) obj2).shortValue());
                        } else if (cls == Byte.class) {
                            obj3 = Integer.valueOf(((Byte) obj2).byteValue());
                        }
                        if (obj3 != null) {
                            Array.set(obj, i4, obj3);
                            return;
                        }
                    } else if ("J".equals(name)) {
                        if (cls == Long.class) {
                            obj3 = obj2;
                        } else if (cls == Integer.class) {
                            obj3 = Long.valueOf(((Integer) obj2).intValue());
                        } else if (cls == Short.class) {
                            obj3 = Long.valueOf(((Short) obj2).shortValue());
                        } else if (cls == Byte.class) {
                            obj3 = Long.valueOf(((Byte) obj2).byteValue());
                        }
                        if (obj3 != null) {
                            Array.set(obj, i4, obj3);
                            return;
                        }
                    } else if ("F".equals(name)) {
                        if (cls == Float.class) {
                            obj3 = obj2;
                        } else if (cls == Long.class) {
                            obj3 = Float.valueOf((float) ((Long) obj2).longValue());
                        } else if (cls == Integer.class) {
                            obj3 = Float.valueOf(((Integer) obj2).intValue());
                        } else if (cls == Short.class) {
                            obj3 = Float.valueOf(((Short) obj2).shortValue());
                        } else if (cls == Byte.class) {
                            obj3 = Float.valueOf(((Byte) obj2).byteValue());
                        }
                        if (obj3 != null) {
                            Array.set(obj, i4, obj3);
                            return;
                        }
                    } else if ("D".equals(name)) {
                        if (cls == Double.class) {
                            obj3 = obj2;
                        } else if (cls == Float.class) {
                            obj3 = Double.valueOf(((Float) obj2).floatValue());
                        } else if (cls == Long.class) {
                            obj3 = Double.valueOf(((Long) obj2).longValue());
                        } else if (cls == Integer.class) {
                            obj3 = Double.valueOf(((Integer) obj2).intValue());
                        } else if (cls == Short.class) {
                            obj3 = Double.valueOf(((Short) obj2).shortValue());
                        } else if (cls == Byte.class) {
                            obj3 = Double.valueOf(((Byte) obj2).byteValue());
                        }
                        if (obj3 != null) {
                            Array.set(obj, i4, obj3);
                            return;
                        }
                    } else if ("Z".equals(name)) {
                        if (cls == Boolean.class) {
                            Array.set(obj, i4, obj2);
                            return;
                        }
                    } else if ("C".equals(name)) {
                        if (cls == Character.class) {
                            Array.set(obj, i4, obj2);
                            return;
                        }
                    } else if (name.equals(cls.getName())) {
                        Array.set(obj, i4, obj2);
                        return;
                    }
                } else if (cls == Byte.class) {
                    Array.set(obj, i4, obj2);
                    return;
                }
            }
        }
        throw new NoSuchFieldException("className: " + obj.getClass() + ", fieldName: " + str + ", value: " + String.valueOf(obj2));
    }

    private static <T> T a(String str, Object obj, String str2, Object[] objArr, Class<?>[] clsArr) throws Throwable {
        Class<?> cls;
        if (objArr == null) {
            objArr = new Object[0];
        }
        if (clsArr == null) {
            clsArr = new Class[0];
        }
        if (obj == null) {
            cls = a(str);
        } else {
            cls = obj.getClass();
        }
        String str3 = cls.getName() + "#" + str2 + "#" + objArr.length;
        Method method = f56995d.get(str3);
        if (method != null) {
            method.setAccessible(true);
            try {
                if (method.getReturnType() == Void.TYPE) {
                    method.invoke(obj, objArr);
                    return null;
                }
                return (T) method.invoke(obj, objArr);
            } catch (InvocationTargetException e5) {
                throw e5;
            }
        }
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str2, clsArr);
                f56995d.put(str3, declaredMethod);
                declaredMethod.setAccessible(true);
                if (declaredMethod.getReturnType() == Void.TYPE) {
                    declaredMethod.invoke(obj, objArr);
                    return null;
                }
                return (T) declaredMethod.invoke(obj, objArr);
            } catch (InvocationTargetException e6) {
                throw e6;
            } catch (Throwable unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("className: ");
        Class<?> cls2 = str;
        if (obj != null) {
            cls2 = obj.getClass();
        }
        sb.append((Object) cls2);
        sb.append(", methodName: ");
        sb.append(str2);
        throw new NoSuchMethodException(sb.toString());
    }

    private static <T> T a(String str, Object obj, String str2, Object... objArr) throws Throwable {
        Class<?> cls;
        Class<?>[] a5;
        if (obj == null) {
            cls = a(str);
        } else {
            cls = obj.getClass();
        }
        boolean z4 = false;
        if (str2.equals(m.a("009Dch%dgVfa;dgf9biba")) && objArr != null && objArr.length == 2) {
            a5 = new Class[]{String.class, Class[].class};
            if (objArr[1] == String.class) {
                Class[] clsArr = new Class[1];
                clsArr[0] = String.class;
                objArr[1] = clsArr;
            }
        } else if (str2.equals("getDeviceId") && objArr != null && objArr.length == 1) {
            a5 = new Class[]{Integer.TYPE};
        } else if (str2.equals(m.a("006ZbgAcYbbbicf6d")) && objArr != null && objArr.length == 2) {
            a5 = new Class[]{Object.class, Object[].class};
        } else {
            a5 = (str2.equals(m.a("013 dg)dgPdb8aad.dgdgbgddDed")) && objArr != null && objArr.length == 1) ? new Class[]{Boolean.TYPE} : a(objArr);
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = a5.length;
        for (int i4 = 0; i4 < length; i4++) {
            Class<?> cls2 = a5[i4];
            stringBuffer.append(cls2 == null ? "" : cls2.getName());
        }
        String str3 = cls.getName() + "#" + str2 + "#" + objArr.length + stringBuffer.toString();
        Method method = f56995d.get(str3);
        if (method != null) {
            boolean isStatic = Modifier.isStatic(method.getModifiers());
            if (obj == null) {
                z4 = isStatic;
            } else if (!isStatic) {
                z4 = true;
            }
            if (z4 && a(method.getParameterTypes(), a5)) {
                method.setAccessible(true);
                try {
                    if (method.getReturnType() == Void.TYPE) {
                        method.invoke(obj, objArr);
                        return null;
                    }
                    return (T) method.invoke(obj, objArr);
                } catch (InvocationTargetException e5) {
                    throw e5;
                }
            }
        }
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str2, a5);
                f56995d.put(str3, declaredMethod);
                declaredMethod.setAccessible(true);
                if (declaredMethod.getReturnType() == Void.TYPE) {
                    declaredMethod.invoke(obj, objArr);
                    return null;
                }
                return (T) declaredMethod.invoke(obj, objArr);
            } catch (InvocationTargetException e6) {
                throw e6;
            } catch (Throwable unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("className: ");
        Class<?> cls3 = str;
        if (obj != null) {
            cls3 = obj.getClass();
        }
        sb.append((Object) cls3);
        sb.append(", methodName: ");
        sb.append(str2);
        throw new NoSuchMethodException(sb.toString());
    }

    private static <T> T a(String str, String str2) throws Throwable {
        Field field;
        ArrayList arrayList = new ArrayList();
        for (Class<?> a5 = a(str); a5 != null; a5 = a5.getSuperclass()) {
            arrayList.add(a5);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                field = ((Class) it2.next()).getDeclaredField(str2);
            } catch (Throwable unused) {
                field = null;
            }
            if (field != null && Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                return (T) field.get(null);
            }
        }
        throw new NoSuchFieldException("className: " + str + ", fieldName: " + str2);
    }

    private static void a(String str, String str2, Object obj) throws Throwable {
        Field field;
        ArrayList arrayList = new ArrayList();
        for (Class<?> a5 = a(str); a5 != null; a5 = a5.getSuperclass()) {
            arrayList.add(a5);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                field = ((Class) it2.next()).getDeclaredField(str2);
            } catch (Throwable unused) {
                field = null;
            }
            if (field != null && Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                field.set(null, obj);
                return;
            }
        }
        throw new NoSuchFieldException("className: " + str + ", fieldName: " + str2 + ", value: " + String.valueOf(obj));
    }

    private static <T> T a(Object obj, String str) throws Throwable {
        if (!(obj instanceof List) && !obj.getClass().isArray()) {
            if (obj instanceof Map) {
                return (T) ((Map) obj).get(str);
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                arrayList.add(cls);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Field field = null;
                try {
                    field = ((Class) it2.next()).getDeclaredField(str);
                } catch (Throwable unused) {
                }
                if (field != null && !Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    return (T) field.get(obj);
                }
            }
            throw new NoSuchFieldException("className: " + obj.getClass() + ", fieldName: " + str);
        }
        return (T) b(obj, str);
    }

    private static void a(Object obj, String str, Object obj2) throws Throwable {
        if (!(obj instanceof List) && !obj.getClass().isArray()) {
            if (obj instanceof Map) {
                ((Map) obj).put(str, obj2);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                arrayList.add(cls);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Field field = null;
                try {
                    field = ((Class) it2.next()).getDeclaredField(str);
                } catch (Throwable unused) {
                }
                if (field != null && !Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    field.set(obj, obj2);
                    return;
                }
            }
            throw new NoSuchFieldException("className: " + obj.getClass() + ", fieldName: " + str + ", value: " + String.valueOf(obj2));
        }
        b(obj, str, obj2);
    }
}

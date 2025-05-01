package org.aspectj.internal.lang.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.aspectj.internal.lang.annotation.ajcDeclareEoW;
import org.aspectj.internal.lang.annotation.ajcDeclareParents;
import org.aspectj.internal.lang.annotation.ajcDeclarePrecedence;
import org.aspectj.internal.lang.annotation.ajcDeclareSoft;
import org.aspectj.internal.lang.annotation.ajcITD;
import org.aspectj.internal.lang.annotation.ajcPrivileged;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareError;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.DeclarePrecedence;
import org.aspectj.lang.annotation.DeclareWarning;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.AdviceKind;
import org.aspectj.lang.reflect.DeclareAnnotation;
import org.aspectj.lang.reflect.NoSuchAdviceException;
import org.aspectj.lang.reflect.NoSuchPointcutException;
import org.aspectj.lang.reflect.PerClauseKind;
import org.aspectj.lang.reflect.u;
import org.aspectj.lang.reflect.v;
/* compiled from: AjTypeImpl.java */
/* loaded from: classes7.dex */
public class b<T> implements org.aspectj.lang.reflect.c<T> {

    /* renamed from: m  reason: collision with root package name */
    private static final String f72116m = "ajc$";

    /* renamed from: b  reason: collision with root package name */
    private Class<T> f72117b;

    /* renamed from: c  reason: collision with root package name */
    private v[] f72118c = null;

    /* renamed from: d  reason: collision with root package name */
    private v[] f72119d = null;

    /* renamed from: e  reason: collision with root package name */
    private org.aspectj.lang.reflect.a[] f72120e = null;

    /* renamed from: f  reason: collision with root package name */
    private org.aspectj.lang.reflect.a[] f72121f = null;

    /* renamed from: g  reason: collision with root package name */
    private org.aspectj.lang.reflect.q[] f72122g = null;

    /* renamed from: h  reason: collision with root package name */
    private org.aspectj.lang.reflect.q[] f72123h = null;

    /* renamed from: i  reason: collision with root package name */
    private org.aspectj.lang.reflect.p[] f72124i = null;

    /* renamed from: j  reason: collision with root package name */
    private org.aspectj.lang.reflect.p[] f72125j = null;

    /* renamed from: k  reason: collision with root package name */
    private org.aspectj.lang.reflect.n[] f72126k = null;

    /* renamed from: l  reason: collision with root package name */
    private org.aspectj.lang.reflect.n[] f72127l = null;

    public b(Class<T> cls) {
        this.f72117b = cls;
    }

    private void b0(List<org.aspectj.lang.reflect.i> list) {
        Field[] declaredFields;
        for (Field field : this.f72117b.getDeclaredFields()) {
            if (field.isAnnotationPresent(DeclareParents.class) && field.getType().isInterface()) {
                list.add(new e(((DeclareParents) field.getAnnotation(DeclareParents.class)).value(), field.getType().getName(), false, this));
            }
        }
    }

    private void c0(List<org.aspectj.lang.reflect.p> list, boolean z4) {
    }

    private void d0(List<org.aspectj.lang.reflect.q> list, boolean z4) {
        Field[] declaredFields;
        Method[] declaredMethods;
        if (S()) {
            for (Field field : this.f72117b.getDeclaredFields()) {
                if (field.getType().isInterface() && field.isAnnotationPresent(DeclareParents.class) && ((DeclareParents) field.getAnnotation(DeclareParents.class)).defaultImpl() != DeclareParents.class) {
                    for (Method method : field.getType().getDeclaredMethods()) {
                        if (Modifier.isPublic(method.getModifiers()) || !z4) {
                            list.add(new k(this, org.aspectj.lang.reflect.d.a(field.getType()), method, 1));
                        }
                    }
                }
            }
        }
    }

    private org.aspectj.lang.reflect.a e0(Method method) {
        if (method.getAnnotations().length == 0) {
            return null;
        }
        Before before = (Before) method.getAnnotation(Before.class);
        if (before != null) {
            return new a(method, before.value(), AdviceKind.BEFORE);
        }
        After after = (After) method.getAnnotation(After.class);
        if (after != null) {
            return new a(method, after.value(), AdviceKind.AFTER);
        }
        AfterReturning afterReturning = (AfterReturning) method.getAnnotation(AfterReturning.class);
        if (afterReturning != null) {
            String pointcut = afterReturning.pointcut();
            if (pointcut.equals("")) {
                pointcut = afterReturning.value();
            }
            return new a(method, pointcut, AdviceKind.AFTER_RETURNING, afterReturning.returning());
        }
        AfterThrowing afterThrowing = (AfterThrowing) method.getAnnotation(AfterThrowing.class);
        if (afterThrowing != null) {
            String pointcut2 = afterThrowing.pointcut();
            if (pointcut2 == null) {
                pointcut2 = afterThrowing.value();
            }
            return new a(method, pointcut2, AdviceKind.AFTER_THROWING, afterThrowing.throwing());
        }
        Around around = (Around) method.getAnnotation(Around.class);
        if (around != null) {
            return new a(method, around.value(), AdviceKind.AROUND);
        }
        return null;
    }

    private v f0(Method method) {
        int indexOf;
        Pointcut pointcut = (Pointcut) method.getAnnotation(Pointcut.class);
        if (pointcut != null) {
            String name = method.getName();
            if (name.startsWith(f72116m) && (indexOf = (name = name.substring(name.indexOf("$$") + 2, name.length())).indexOf("$")) != -1) {
                name = name.substring(0, indexOf);
            }
            return new o(name, pointcut.value(), method, org.aspectj.lang.reflect.d.a(method.getDeclaringClass()), pointcut.argNames());
        }
        return null;
    }

    private org.aspectj.lang.reflect.a[] g0(Set set) {
        org.aspectj.lang.reflect.a[] aVarArr;
        if (this.f72121f == null) {
            i0();
        }
        ArrayList arrayList = new ArrayList();
        for (org.aspectj.lang.reflect.a aVar : this.f72121f) {
            if (set.contains(aVar.getKind())) {
                arrayList.add(aVar);
            }
        }
        org.aspectj.lang.reflect.a[] aVarArr2 = new org.aspectj.lang.reflect.a[arrayList.size()];
        arrayList.toArray(aVarArr2);
        return aVarArr2;
    }

    private org.aspectj.lang.reflect.a[] h0(Set set) {
        org.aspectj.lang.reflect.a[] aVarArr;
        if (this.f72120e == null) {
            j0();
        }
        ArrayList arrayList = new ArrayList();
        for (org.aspectj.lang.reflect.a aVar : this.f72120e) {
            if (set.contains(aVar.getKind())) {
                arrayList.add(aVar);
            }
        }
        org.aspectj.lang.reflect.a[] aVarArr2 = new org.aspectj.lang.reflect.a[arrayList.size()];
        arrayList.toArray(aVarArr2);
        return aVarArr2;
    }

    private void i0() {
        Method[] methods = this.f72117b.getMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            org.aspectj.lang.reflect.a e02 = e0(method);
            if (e02 != null) {
                arrayList.add(e02);
            }
        }
        org.aspectj.lang.reflect.a[] aVarArr = new org.aspectj.lang.reflect.a[arrayList.size()];
        this.f72121f = aVarArr;
        arrayList.toArray(aVarArr);
    }

    private void j0() {
        Method[] declaredMethods = this.f72117b.getDeclaredMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            org.aspectj.lang.reflect.a e02 = e0(method);
            if (e02 != null) {
                arrayList.add(e02);
            }
        }
        org.aspectj.lang.reflect.a[] aVarArr = new org.aspectj.lang.reflect.a[arrayList.size()];
        this.f72120e = aVarArr;
        arrayList.toArray(aVarArr);
    }

    private boolean k0(Method method) {
        if (method.getName().startsWith(f72116m)) {
            return false;
        }
        if (method.getAnnotations().length == 0) {
            return true;
        }
        return (method.isAnnotationPresent(Pointcut.class) || method.isAnnotationPresent(Before.class) || method.isAnnotationPresent(After.class) || method.isAnnotationPresent(AfterReturning.class) || method.isAnnotationPresent(AfterThrowing.class) || method.isAnnotationPresent(Around.class)) ? false : true;
    }

    private org.aspectj.lang.reflect.c<?>[] l0(Class<?>[] clsArr) {
        int length = clsArr.length;
        org.aspectj.lang.reflect.c<?>[] cVarArr = new org.aspectj.lang.reflect.c[length];
        for (int i4 = 0; i4 < length; i4++) {
            cVarArr[i4] = org.aspectj.lang.reflect.d.a(clsArr[i4]);
        }
        return cVarArr;
    }

    private Class<?>[] m0(org.aspectj.lang.reflect.c<?>[] cVarArr) {
        int length = cVarArr.length;
        Class<?>[] clsArr = new Class[length];
        for (int i4 = 0; i4 < length; i4++) {
            clsArr[i4] = cVarArr[i4].Z();
        }
        return clsArr;
    }

    @Override // org.aspectj.lang.reflect.c
    public Package A() {
        return this.f72117b.getPackage();
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.p[] B() {
        Method[] methods;
        List<org.aspectj.lang.reflect.p> arrayList = new ArrayList<>();
        if (this.f72125j == null) {
            for (Method method : this.f72117b.getMethods()) {
                if (method.isAnnotationPresent(ajcITD.class)) {
                    ajcITD ajcitd = (ajcITD) method.getAnnotation(ajcITD.class);
                    if (method.getName().contains("ajc$interFieldInit") && Modifier.isPublic(ajcitd.modifiers())) {
                        try {
                            Method declaredMethod = method.getDeclaringClass().getDeclaredMethod(method.getName().replace("FieldInit", "FieldGetDispatch"), method.getParameterTypes());
                            arrayList.add(new j(this, ajcitd.targetType(), ajcitd.modifiers(), ajcitd.name(), org.aspectj.lang.reflect.d.a(declaredMethod.getReturnType()), declaredMethod.getGenericReturnType()));
                        } catch (NoSuchMethodException unused) {
                            throw new IllegalStateException("Can't find field get dispatch method for " + method.getName());
                        }
                    }
                }
            }
            c0(arrayList, true);
            org.aspectj.lang.reflect.p[] pVarArr = new org.aspectj.lang.reflect.p[arrayList.size()];
            this.f72125j = pVarArr;
            arrayList.toArray(pVarArr);
        }
        return this.f72125j;
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.q[] C() {
        Method[] declaredMethods;
        if (this.f72123h == null) {
            List<org.aspectj.lang.reflect.q> arrayList = new ArrayList<>();
            for (Method method : this.f72117b.getDeclaredMethods()) {
                if (method.getName().contains("ajc$interMethod$") && method.isAnnotationPresent(ajcITD.class)) {
                    ajcITD ajcitd = (ajcITD) method.getAnnotation(ajcITD.class);
                    if (Modifier.isPublic(ajcitd.modifiers())) {
                        arrayList.add(new k(this, ajcitd.targetType(), ajcitd.modifiers(), ajcitd.name(), method));
                    }
                }
            }
            d0(arrayList, true);
            org.aspectj.lang.reflect.q[] qVarArr = new org.aspectj.lang.reflect.q[arrayList.size()];
            this.f72123h = qVarArr;
            arrayList.toArray(qVarArr);
        }
        return this.f72123h;
    }

    @Override // org.aspectj.lang.reflect.c
    public Constructor D(org.aspectj.lang.reflect.c<?>... cVarArr) throws NoSuchMethodException {
        return this.f72117b.getDeclaredConstructor(m0(cVarArr));
    }

    @Override // org.aspectj.lang.reflect.c
    public boolean E() {
        return this.f72117b.isLocalClass() && !S();
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.i[] F() {
        Method[] declaredMethods;
        List<org.aspectj.lang.reflect.i> arrayList = new ArrayList<>();
        for (Method method : this.f72117b.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ajcDeclareParents.class)) {
                ajcDeclareParents ajcdeclareparents = (ajcDeclareParents) method.getAnnotation(ajcDeclareParents.class);
                arrayList.add(new e(ajcdeclareparents.targetTypePattern(), ajcdeclareparents.parentTypes(), ajcdeclareparents.isExtends(), this));
            }
        }
        b0(arrayList);
        if (W().S()) {
            arrayList.addAll(Arrays.asList(W().F()));
        }
        org.aspectj.lang.reflect.i[] iVarArr = new org.aspectj.lang.reflect.i[arrayList.size()];
        arrayList.toArray(iVarArr);
        return iVarArr;
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.c<?> G() {
        Class<?> enclosingClass = this.f72117b.getEnclosingClass();
        if (enclosingClass != null) {
            return new b(enclosingClass);
        }
        return null;
    }

    @Override // org.aspectj.lang.reflect.c
    public Method[] H() {
        Method[] declaredMethods = this.f72117b.getDeclaredMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            if (k0(method)) {
                arrayList.add(method);
            }
        }
        Method[] methodArr = new Method[arrayList.size()];
        arrayList.toArray(methodArr);
        return methodArr;
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.a[] I(AdviceKind... adviceKindArr) {
        EnumSet enumSet;
        if (adviceKindArr.length == 0) {
            enumSet = EnumSet.allOf(AdviceKind.class);
        } else {
            EnumSet noneOf = EnumSet.noneOf(AdviceKind.class);
            noneOf.addAll(Arrays.asList(adviceKindArr));
            enumSet = noneOf;
        }
        return g0(enumSet);
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.p[] J() {
        Method[] declaredMethods;
        List<org.aspectj.lang.reflect.p> arrayList = new ArrayList<>();
        if (this.f72124i == null) {
            for (Method method : this.f72117b.getDeclaredMethods()) {
                if (method.isAnnotationPresent(ajcITD.class) && method.getName().contains("ajc$interFieldInit")) {
                    ajcITD ajcitd = (ajcITD) method.getAnnotation(ajcITD.class);
                    try {
                        Method declaredMethod = this.f72117b.getDeclaredMethod(method.getName().replace("FieldInit", "FieldGetDispatch"), method.getParameterTypes());
                        arrayList.add(new j(this, ajcitd.targetType(), ajcitd.modifiers(), ajcitd.name(), org.aspectj.lang.reflect.d.a(declaredMethod.getReturnType()), declaredMethod.getGenericReturnType()));
                    } catch (NoSuchMethodException unused) {
                        throw new IllegalStateException("Can't find field get dispatch method for " + method.getName());
                    }
                }
            }
            c0(arrayList, false);
            org.aspectj.lang.reflect.p[] pVarArr = new org.aspectj.lang.reflect.p[arrayList.size()];
            this.f72124i = pVarArr;
            arrayList.toArray(pVarArr);
        }
        return this.f72124i;
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.q[] K() {
        Method[] declaredMethods;
        if (this.f72122g == null) {
            List<org.aspectj.lang.reflect.q> arrayList = new ArrayList<>();
            for (Method method : this.f72117b.getDeclaredMethods()) {
                if (method.getName().contains("ajc$interMethodDispatch1$") && method.isAnnotationPresent(ajcITD.class)) {
                    ajcITD ajcitd = (ajcITD) method.getAnnotation(ajcITD.class);
                    arrayList.add(new k(this, ajcitd.targetType(), ajcitd.modifiers(), ajcitd.name(), method));
                }
            }
            d0(arrayList, false);
            org.aspectj.lang.reflect.q[] qVarArr = new org.aspectj.lang.reflect.q[arrayList.size()];
            this.f72122g = qVarArr;
            arrayList.toArray(qVarArr);
        }
        return this.f72122g;
    }

    @Override // org.aspectj.lang.reflect.c
    public v L(String str) throws NoSuchPointcutException {
        v[] Y;
        for (v vVar : Y()) {
            if (vVar.getName().equals(str)) {
                return vVar;
            }
        }
        throw new NoSuchPointcutException(str);
    }

    @Override // org.aspectj.lang.reflect.c
    public T[] M() {
        return this.f72117b.getEnumConstants();
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.n N(org.aspectj.lang.reflect.c<?> cVar, org.aspectj.lang.reflect.c<?>... cVarArr) throws NoSuchMethodException {
        org.aspectj.lang.reflect.n[] d5;
        for (org.aspectj.lang.reflect.n nVar : d()) {
            try {
                if (nVar.h().equals(cVar)) {
                    org.aspectj.lang.reflect.c<?>[] c5 = nVar.c();
                    if (c5.length == cVarArr.length) {
                        for (int i4 = 0; i4 < c5.length; i4++) {
                            if (!c5[i4].equals(cVarArr[i4])) {
                                break;
                            }
                        }
                        return nVar;
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException();
    }

    @Override // org.aspectj.lang.reflect.c
    public Field O(String str) throws NoSuchFieldException {
        Field field = this.f72117b.getField(str);
        if (field.getName().startsWith(f72116m)) {
            throw new NoSuchFieldException(str);
        }
        return field;
    }

    @Override // org.aspectj.lang.reflect.c
    public Method P() {
        return this.f72117b.getEnclosingMethod();
    }

    @Override // org.aspectj.lang.reflect.c
    public Constructor[] Q() {
        return this.f72117b.getDeclaredConstructors();
    }

    @Override // org.aspectj.lang.reflect.c
    public Method R(String str, org.aspectj.lang.reflect.c<?>... cVarArr) throws NoSuchMethodException {
        Method declaredMethod = this.f72117b.getDeclaredMethod(str, m0(cVarArr));
        if (k0(declaredMethod)) {
            return declaredMethod;
        }
        throw new NoSuchMethodException(str);
    }

    @Override // org.aspectj.lang.reflect.c
    public boolean S() {
        return this.f72117b.getAnnotation(Aspect.class) != null;
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.p T(String str, org.aspectj.lang.reflect.c<?> cVar) throws NoSuchFieldException {
        org.aspectj.lang.reflect.p[] B;
        for (org.aspectj.lang.reflect.p pVar : B()) {
            if (pVar.getName().equals(str)) {
                try {
                    if (pVar.h().equals(cVar)) {
                        return pVar;
                    }
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            }
        }
        throw new NoSuchFieldException(str);
    }

    @Override // org.aspectj.lang.reflect.c
    public Type U() {
        return this.f72117b.getGenericSuperclass();
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.a V(String str) throws NoSuchAdviceException {
        org.aspectj.lang.reflect.a[] aVarArr;
        if (!str.equals("")) {
            if (this.f72120e == null) {
                j0();
            }
            for (org.aspectj.lang.reflect.a aVar : this.f72120e) {
                if (aVar.getName().equals(str)) {
                    return aVar;
                }
            }
            throw new NoSuchAdviceException(str);
        }
        throw new IllegalArgumentException("use getAdvice(AdviceType...) instead for un-named advice");
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.c<? super T> W() {
        Class<? super T> superclass = this.f72117b.getSuperclass();
        if (superclass == null) {
            return null;
        }
        return new b(superclass);
    }

    @Override // org.aspectj.lang.reflect.c
    public u X() {
        if (S()) {
            String value = ((Aspect) this.f72117b.getAnnotation(Aspect.class)).value();
            if (value.equals("")) {
                if (W().S()) {
                    return W().X();
                }
                return new l(PerClauseKind.SINGLETON);
            } else if (value.startsWith("perthis(")) {
                return new m(PerClauseKind.PERTHIS, value.substring(8, value.length() - 1));
            } else {
                if (value.startsWith("pertarget(")) {
                    return new m(PerClauseKind.PERTARGET, value.substring(10, value.length() - 1));
                }
                if (value.startsWith("percflow(")) {
                    return new m(PerClauseKind.PERCFLOW, value.substring(9, value.length() - 1));
                }
                if (value.startsWith("percflowbelow(")) {
                    return new m(PerClauseKind.PERCFLOWBELOW, value.substring(14, value.length() - 1));
                }
                if (value.startsWith("pertypewithin")) {
                    return new r(PerClauseKind.PERTYPEWITHIN, value.substring(14, value.length() - 1));
                }
                throw new IllegalStateException("Per-clause not recognized: " + value);
            }
        }
        return null;
    }

    @Override // org.aspectj.lang.reflect.c
    public v[] Y() {
        v[] vVarArr = this.f72118c;
        if (vVarArr != null) {
            return vVarArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Method method : this.f72117b.getDeclaredMethods()) {
            v f02 = f0(method);
            if (f02 != null) {
                arrayList.add(f02);
            }
        }
        v[] vVarArr2 = new v[arrayList.size()];
        arrayList.toArray(vVarArr2);
        this.f72118c = vVarArr2;
        return vVarArr2;
    }

    @Override // org.aspectj.lang.reflect.c
    public Class<T> Z() {
        return this.f72117b;
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.c<?> a() {
        Class<?> declaringClass = this.f72117b.getDeclaringClass();
        if (declaringClass != null) {
            return new b(declaringClass);
        }
        return null;
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.h[] a0() {
        Field[] declaredFields;
        Method[] declaredMethods;
        ArrayList arrayList = new ArrayList();
        for (Field field : this.f72117b.getDeclaredFields()) {
            try {
                if (field.isAnnotationPresent(DeclareWarning.class)) {
                    DeclareWarning declareWarning = (DeclareWarning) field.getAnnotation(DeclareWarning.class);
                    if (Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers())) {
                        arrayList.add(new d(declareWarning.value(), (String) field.get(null), false, this));
                    }
                } else if (field.isAnnotationPresent(DeclareError.class)) {
                    DeclareError declareError = (DeclareError) field.getAnnotation(DeclareError.class);
                    if (Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers())) {
                        arrayList.add(new d(declareError.value(), (String) field.get(null), true, this));
                    }
                }
            } catch (IllegalAccessException | IllegalArgumentException unused) {
            }
        }
        for (Method method : this.f72117b.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ajcDeclareEoW.class)) {
                ajcDeclareEoW ajcdeclareeow = (ajcDeclareEoW) method.getAnnotation(ajcDeclareEoW.class);
                arrayList.add(new d(ajcdeclareeow.pointcut(), ajcdeclareeow.message(), ajcdeclareeow.isError(), this));
            }
        }
        org.aspectj.lang.reflect.h[] hVarArr = new org.aspectj.lang.reflect.h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return hVarArr;
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.c<?>[] b() {
        return l0(this.f72117b.getDeclaredClasses());
    }

    @Override // org.aspectj.lang.reflect.c
    public Field c(String str) throws NoSuchFieldException {
        Field declaredField = this.f72117b.getDeclaredField(str);
        if (declaredField.getName().startsWith(f72116m)) {
            throw new NoSuchFieldException(str);
        }
        return declaredField;
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.n[] d() {
        Method[] methods;
        if (this.f72126k == null) {
            ArrayList arrayList = new ArrayList();
            for (Method method : this.f72117b.getMethods()) {
                if (method.getName().contains("ajc$postInterConstructor") && method.isAnnotationPresent(ajcITD.class)) {
                    ajcITD ajcitd = (ajcITD) method.getAnnotation(ajcITD.class);
                    if (Modifier.isPublic(ajcitd.modifiers())) {
                        arrayList.add(new h(this, ajcitd.targetType(), ajcitd.modifiers(), method));
                    }
                }
            }
            org.aspectj.lang.reflect.n[] nVarArr = new org.aspectj.lang.reflect.n[arrayList.size()];
            this.f72126k = nVarArr;
            arrayList.toArray(nVarArr);
        }
        return this.f72126k;
    }

    @Override // org.aspectj.lang.reflect.c
    public int e() {
        return this.f72117b.getModifiers();
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f72117b.equals(this.f72117b);
        }
        return false;
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.p f(String str, org.aspectj.lang.reflect.c<?> cVar) throws NoSuchFieldException {
        org.aspectj.lang.reflect.p[] J;
        for (org.aspectj.lang.reflect.p pVar : J()) {
            if (pVar.getName().equals(str)) {
                try {
                    if (pVar.h().equals(cVar)) {
                        return pVar;
                    }
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            }
        }
        throw new NoSuchFieldException(str);
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.n[] g() {
        Method[] declaredMethods;
        if (this.f72127l == null) {
            ArrayList arrayList = new ArrayList();
            for (Method method : this.f72117b.getDeclaredMethods()) {
                if (method.getName().contains("ajc$postInterConstructor") && method.isAnnotationPresent(ajcITD.class)) {
                    ajcITD ajcitd = (ajcITD) method.getAnnotation(ajcITD.class);
                    arrayList.add(new h(this, ajcitd.targetType(), ajcitd.modifiers(), method));
                }
            }
            org.aspectj.lang.reflect.n[] nVarArr = new org.aspectj.lang.reflect.n[arrayList.size()];
            this.f72127l = nVarArr;
            arrayList.toArray(nVarArr);
        }
        return this.f72127l;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f72117b.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        return this.f72117b.getAnnotations();
    }

    @Override // org.aspectj.lang.reflect.c
    public Constructor[] getConstructors() {
        return this.f72117b.getConstructors();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        return this.f72117b.getDeclaredAnnotations();
    }

    @Override // org.aspectj.lang.reflect.c
    public Field[] getFields() {
        Field[] fields = this.f72117b.getFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (!field.getName().startsWith(f72116m) && !field.isAnnotationPresent(DeclareWarning.class) && !field.isAnnotationPresent(DeclareError.class)) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = new Field[arrayList.size()];
        arrayList.toArray(fieldArr);
        return fieldArr;
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.c<?>[] getInterfaces() {
        return l0(this.f72117b.getInterfaces());
    }

    @Override // org.aspectj.lang.reflect.c
    public Method[] getMethods() {
        Method[] methods = this.f72117b.getMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            if (k0(method)) {
                arrayList.add(method);
            }
        }
        Method[] methodArr = new Method[arrayList.size()];
        arrayList.toArray(methodArr);
        return methodArr;
    }

    @Override // org.aspectj.lang.reflect.c
    public String getName() {
        return this.f72117b.getName();
    }

    @Override // org.aspectj.lang.reflect.c
    public TypeVariable<Class<T>>[] getTypeParameters() {
        return this.f72117b.getTypeParameters();
    }

    @Override // org.aspectj.lang.reflect.c
    public DeclareAnnotation[] h() {
        Method[] declaredMethods;
        Annotation annotation;
        ArrayList arrayList = new ArrayList();
        for (Method method : this.f72117b.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ajcDeclareAnnotation.class)) {
                ajcDeclareAnnotation ajcdeclareannotation = (ajcDeclareAnnotation) method.getAnnotation(ajcDeclareAnnotation.class);
                Annotation[] annotations = method.getAnnotations();
                int length = annotations.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        annotation = null;
                        break;
                    }
                    Annotation annotation2 = annotations[i4];
                    if (annotation2.annotationType() != ajcDeclareAnnotation.class) {
                        annotation = annotation2;
                        break;
                    }
                    i4++;
                }
                arrayList.add(new c(this, ajcdeclareannotation.kind(), ajcdeclareannotation.pattern(), annotation, ajcdeclareannotation.annotation()));
            }
        }
        if (W().S()) {
            arrayList.addAll(Arrays.asList(W().h()));
        }
        DeclareAnnotation[] declareAnnotationArr = new DeclareAnnotation[arrayList.size()];
        arrayList.toArray(declareAnnotationArr);
        return declareAnnotationArr;
    }

    public int hashCode() {
        return this.f72117b.hashCode();
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.n i(org.aspectj.lang.reflect.c<?> cVar, org.aspectj.lang.reflect.c<?>... cVarArr) throws NoSuchMethodException {
        org.aspectj.lang.reflect.n[] g4;
        for (org.aspectj.lang.reflect.n nVar : g()) {
            try {
                if (nVar.h().equals(cVar)) {
                    org.aspectj.lang.reflect.c<?>[] c5 = nVar.c();
                    if (c5.length == cVarArr.length) {
                        for (int i4 = 0; i4 < c5.length; i4++) {
                            if (!c5[i4].equals(cVarArr[i4])) {
                                break;
                            }
                        }
                        return nVar;
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f72117b.isAnnotationPresent(cls);
    }

    @Override // org.aspectj.lang.reflect.c
    public boolean isArray() {
        return this.f72117b.isArray();
    }

    @Override // org.aspectj.lang.reflect.c
    public boolean isInstance(Object obj) {
        return this.f72117b.isInstance(obj);
    }

    @Override // org.aspectj.lang.reflect.c
    public boolean isInterface() {
        return this.f72117b.isInterface();
    }

    @Override // org.aspectj.lang.reflect.c
    public boolean isPrimitive() {
        return this.f72117b.isPrimitive();
    }

    @Override // org.aspectj.lang.reflect.c
    public v[] j() {
        v[] vVarArr = this.f72119d;
        if (vVarArr != null) {
            return vVarArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Method method : this.f72117b.getMethods()) {
            v f02 = f0(method);
            if (f02 != null) {
                arrayList.add(f02);
            }
        }
        v[] vVarArr2 = new v[arrayList.size()];
        arrayList.toArray(vVarArr2);
        this.f72119d = vVarArr2;
        return vVarArr2;
    }

    @Override // org.aspectj.lang.reflect.c
    public boolean k() {
        return this.f72117b.isMemberClass() && !S();
    }

    @Override // org.aspectj.lang.reflect.c
    public v l(String str) throws NoSuchPointcutException {
        v[] j4;
        for (v vVar : j()) {
            if (vVar.getName().equals(str)) {
                return vVar;
            }
        }
        throw new NoSuchPointcutException(str);
    }

    @Override // org.aspectj.lang.reflect.c
    public boolean m() {
        return this.f72117b.isEnum();
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.a[] n(AdviceKind... adviceKindArr) {
        EnumSet enumSet;
        if (adviceKindArr.length == 0) {
            enumSet = EnumSet.allOf(AdviceKind.class);
        } else {
            EnumSet noneOf = EnumSet.noneOf(AdviceKind.class);
            noneOf.addAll(Arrays.asList(adviceKindArr));
            enumSet = noneOf;
        }
        return h0(enumSet);
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.c<?>[] o() {
        return l0(this.f72117b.getClasses());
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.q p(String str, org.aspectj.lang.reflect.c<?> cVar, org.aspectj.lang.reflect.c<?>... cVarArr) throws NoSuchMethodException {
        org.aspectj.lang.reflect.q[] K;
        for (org.aspectj.lang.reflect.q qVar : K()) {
            try {
                if (qVar.getName().equals(str) && qVar.h().equals(cVar)) {
                    org.aspectj.lang.reflect.c<?>[] c5 = qVar.c();
                    if (c5.length == cVarArr.length) {
                        for (int i4 = 0; i4 < c5.length; i4++) {
                            if (!c5[i4].equals(cVarArr[i4])) {
                                break;
                            }
                        }
                        return qVar;
                    }
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException(str);
    }

    @Override // org.aspectj.lang.reflect.c
    public boolean q() {
        return this.f72117b.isMemberClass() && S();
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.j[] r() {
        Method[] declaredMethods;
        ArrayList arrayList = new ArrayList();
        if (this.f72117b.isAnnotationPresent(DeclarePrecedence.class)) {
            arrayList.add(new f(((DeclarePrecedence) this.f72117b.getAnnotation(DeclarePrecedence.class)).value(), this));
        }
        for (Method method : this.f72117b.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ajcDeclarePrecedence.class)) {
                arrayList.add(new f(((ajcDeclarePrecedence) method.getAnnotation(ajcDeclarePrecedence.class)).value(), this));
            }
        }
        if (W().S()) {
            arrayList.addAll(Arrays.asList(W().r()));
        }
        org.aspectj.lang.reflect.j[] jVarArr = new org.aspectj.lang.reflect.j[arrayList.size()];
        arrayList.toArray(jVarArr);
        return jVarArr;
    }

    @Override // org.aspectj.lang.reflect.c
    public Method s(String str, org.aspectj.lang.reflect.c<?>... cVarArr) throws NoSuchMethodException {
        Method method = this.f72117b.getMethod(str, m0(cVarArr));
        if (k0(method)) {
            return method;
        }
        throw new NoSuchMethodException(str);
    }

    @Override // org.aspectj.lang.reflect.c
    public Field[] t() {
        Field[] declaredFields = this.f72117b.getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (!field.getName().startsWith(f72116m) && !field.isAnnotationPresent(DeclareWarning.class) && !field.isAnnotationPresent(DeclareError.class)) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = new Field[arrayList.size()];
        arrayList.toArray(fieldArr);
        return fieldArr;
    }

    public String toString() {
        return getName();
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.k[] u() {
        Method[] declaredMethods;
        ArrayList arrayList = new ArrayList();
        for (Method method : this.f72117b.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ajcDeclareSoft.class)) {
                ajcDeclareSoft ajcdeclaresoft = (ajcDeclareSoft) method.getAnnotation(ajcDeclareSoft.class);
                arrayList.add(new g(this, ajcdeclaresoft.pointcut(), ajcdeclaresoft.exceptionType()));
            }
        }
        if (W().S()) {
            arrayList.addAll(Arrays.asList(W().u()));
        }
        org.aspectj.lang.reflect.k[] kVarArr = new org.aspectj.lang.reflect.k[arrayList.size()];
        arrayList.toArray(kVarArr);
        return kVarArr;
    }

    @Override // org.aspectj.lang.reflect.c
    public boolean v() {
        return S() && this.f72117b.isAnnotationPresent(ajcPrivileged.class);
    }

    @Override // org.aspectj.lang.reflect.c
    public Constructor w(org.aspectj.lang.reflect.c<?>... cVarArr) throws NoSuchMethodException {
        return this.f72117b.getConstructor(m0(cVarArr));
    }

    @Override // org.aspectj.lang.reflect.c
    public Constructor x() {
        return this.f72117b.getEnclosingConstructor();
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.a y(String str) throws NoSuchAdviceException {
        org.aspectj.lang.reflect.a[] aVarArr;
        if (!str.equals("")) {
            if (this.f72121f == null) {
                i0();
            }
            for (org.aspectj.lang.reflect.a aVar : this.f72121f) {
                if (aVar.getName().equals(str)) {
                    return aVar;
                }
            }
            throw new NoSuchAdviceException(str);
        }
        throw new IllegalArgumentException("use getAdvice(AdviceType...) instead for un-named advice");
    }

    @Override // org.aspectj.lang.reflect.c
    public org.aspectj.lang.reflect.q z(String str, org.aspectj.lang.reflect.c<?> cVar, org.aspectj.lang.reflect.c<?>... cVarArr) throws NoSuchMethodException {
        org.aspectj.lang.reflect.q[] C;
        for (org.aspectj.lang.reflect.q qVar : C()) {
            try {
                if (qVar.getName().equals(str) && qVar.h().equals(cVar)) {
                    org.aspectj.lang.reflect.c<?>[] c5 = qVar.c();
                    if (c5.length == cVarArr.length) {
                        for (int i4 = 0; i4 < c5.length; i4++) {
                            if (!c5[i4].equals(cVarArr[i4])) {
                                break;
                            }
                        }
                        return qVar;
                    }
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException(str);
    }
}

package org.aspectj.lang.reflect;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* compiled from: AjType.java */
/* loaded from: classes7.dex */
public interface c<T> extends Type, AnnotatedElement {
    Package A();

    p[] B();

    q[] C();

    Constructor D(c<?>... cVarArr) throws NoSuchMethodException;

    boolean E();

    i[] F();

    c<?> G();

    Method[] H();

    a[] I(AdviceKind... adviceKindArr);

    p[] J();

    q[] K();

    v L(String str) throws NoSuchPointcutException;

    T[] M();

    n N(c<?> cVar, c<?>... cVarArr) throws NoSuchMethodException;

    Field O(String str) throws NoSuchFieldException;

    Method P();

    Constructor[] Q();

    Method R(String str, c<?>... cVarArr) throws NoSuchMethodException;

    boolean S();

    p T(String str, c<?> cVar) throws NoSuchFieldException;

    Type U();

    a V(String str) throws NoSuchAdviceException;

    c<?> W();

    u X();

    v[] Y();

    Class<T> Z();

    c<?> a();

    h[] a0();

    c<?>[] b();

    Field c(String str) throws NoSuchFieldException;

    n[] d();

    int e();

    p f(String str, c<?> cVar) throws NoSuchFieldException;

    n[] g();

    Constructor[] getConstructors();

    Field[] getFields();

    c<?>[] getInterfaces();

    Method[] getMethods();

    String getName();

    TypeVariable<Class<T>>[] getTypeParameters();

    DeclareAnnotation[] h();

    n i(c<?> cVar, c<?>... cVarArr) throws NoSuchMethodException;

    boolean isArray();

    boolean isInstance(Object obj);

    boolean isInterface();

    boolean isPrimitive();

    v[] j();

    boolean k();

    v l(String str) throws NoSuchPointcutException;

    boolean m();

    a[] n(AdviceKind... adviceKindArr);

    c<?>[] o();

    q p(String str, c<?> cVar, c<?>... cVarArr) throws NoSuchMethodException;

    boolean q();

    j[] r();

    Method s(String str, c<?>... cVarArr) throws NoSuchMethodException;

    Field[] t();

    k[] u();

    boolean v();

    Constructor w(c<?>... cVarArr) throws NoSuchMethodException;

    Constructor x();

    a y(String str) throws NoSuchAdviceException;

    q z(String str, c<?> cVar, c<?>... cVarArr) throws NoSuchMethodException;
}

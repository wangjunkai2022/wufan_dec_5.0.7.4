package org.aspectj.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* compiled from: InterTypeMethodDeclaration.java */
/* loaded from: classes7.dex */
public interface q extends o {
    c<?>[] c();

    c<?>[] d();

    Type[] f();

    Type g();

    String getName();

    c<?> getReturnType();

    TypeVariable<Method>[] getTypeParameters();
}

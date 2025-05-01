package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
/* compiled from: InterTypeConstructorDeclarationImpl.java */
/* loaded from: classes7.dex */
public class h extends i implements org.aspectj.lang.reflect.n {

    /* renamed from: e  reason: collision with root package name */
    private Method f72153e;

    public h(org.aspectj.lang.reflect.c<?> cVar, String str, int i4, Method method) {
        super(cVar, str, i4);
        this.f72153e = method;
    }

    @Override // org.aspectj.lang.reflect.n
    public org.aspectj.lang.reflect.c<?>[] c() {
        Class<?>[] parameterTypes = this.f72153e.getParameterTypes();
        org.aspectj.lang.reflect.c<?>[] cVarArr = new org.aspectj.lang.reflect.c[parameterTypes.length - 1];
        for (int i4 = 1; i4 < parameterTypes.length; i4++) {
            cVarArr[i4 - 1] = org.aspectj.lang.reflect.d.a(parameterTypes[i4]);
        }
        return cVarArr;
    }

    @Override // org.aspectj.lang.reflect.n
    public org.aspectj.lang.reflect.c<?>[] d() {
        Class<?>[] exceptionTypes = this.f72153e.getExceptionTypes();
        org.aspectj.lang.reflect.c<?>[] cVarArr = new org.aspectj.lang.reflect.c[exceptionTypes.length];
        for (int i4 = 0; i4 < exceptionTypes.length; i4++) {
            cVarArr[i4] = org.aspectj.lang.reflect.d.a(exceptionTypes[i4]);
        }
        return cVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.aspectj.lang.reflect.n
    public Type[] f() {
        Type[] genericParameterTypes = this.f72153e.getGenericParameterTypes();
        org.aspectj.lang.reflect.c[] cVarArr = new org.aspectj.lang.reflect.c[genericParameterTypes.length - 1];
        for (int i4 = 1; i4 < genericParameterTypes.length; i4++) {
            if (genericParameterTypes[i4] instanceof Class) {
                cVarArr[i4 - 1] = org.aspectj.lang.reflect.d.a((Class) genericParameterTypes[i4]);
            } else {
                cVarArr[i4 - 1] = genericParameterTypes[i4];
            }
        }
        return cVarArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Modifier.toString(e()));
        stringBuffer.append(" ");
        stringBuffer.append(this.f72155b);
        stringBuffer.append(".new");
        stringBuffer.append("(");
        org.aspectj.lang.reflect.c<?>[] c5 = c();
        for (int i4 = 0; i4 < c5.length - 1; i4++) {
            stringBuffer.append(c5[i4].toString());
            stringBuffer.append(", ");
        }
        if (c5.length > 0) {
            stringBuffer.append(c5[c5.length - 1].toString());
        }
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}

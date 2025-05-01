package org.aspectj.internal.lang.reflect;

import com.join.mgps.Util.h0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* compiled from: InterTypeMethodDeclarationImpl.java */
/* loaded from: classes7.dex */
public class k extends i implements org.aspectj.lang.reflect.q {

    /* renamed from: e  reason: collision with root package name */
    private String f72161e;

    /* renamed from: f  reason: collision with root package name */
    private Method f72162f;

    /* renamed from: g  reason: collision with root package name */
    private int f72163g;

    /* renamed from: h  reason: collision with root package name */
    private org.aspectj.lang.reflect.c<?>[] f72164h;

    /* renamed from: i  reason: collision with root package name */
    private Type[] f72165i;

    /* renamed from: j  reason: collision with root package name */
    private org.aspectj.lang.reflect.c<?> f72166j;

    /* renamed from: k  reason: collision with root package name */
    private Type f72167k;

    /* renamed from: l  reason: collision with root package name */
    private org.aspectj.lang.reflect.c<?>[] f72168l;

    public k(org.aspectj.lang.reflect.c<?> cVar, String str, int i4, String str2, Method method) {
        super(cVar, str, i4);
        this.f72163g = 1;
        this.f72161e = str2;
        this.f72162f = method;
    }

    @Override // org.aspectj.lang.reflect.q
    public org.aspectj.lang.reflect.c<?>[] c() {
        Class<?>[] parameterTypes = this.f72162f.getParameterTypes();
        int length = parameterTypes.length;
        int i4 = this.f72163g;
        org.aspectj.lang.reflect.c<?>[] cVarArr = new org.aspectj.lang.reflect.c[length - i4];
        while (i4 < parameterTypes.length) {
            cVarArr[i4 - this.f72163g] = org.aspectj.lang.reflect.d.a(parameterTypes[i4]);
            i4++;
        }
        return cVarArr;
    }

    @Override // org.aspectj.lang.reflect.q
    public org.aspectj.lang.reflect.c<?>[] d() {
        Class<?>[] exceptionTypes = this.f72162f.getExceptionTypes();
        org.aspectj.lang.reflect.c<?>[] cVarArr = new org.aspectj.lang.reflect.c[exceptionTypes.length];
        for (int i4 = 0; i4 < exceptionTypes.length; i4++) {
            cVarArr[i4] = org.aspectj.lang.reflect.d.a(exceptionTypes[i4]);
        }
        return cVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.aspectj.lang.reflect.q
    public Type[] f() {
        Type[] genericParameterTypes = this.f72162f.getGenericParameterTypes();
        int length = genericParameterTypes.length;
        int i4 = this.f72163g;
        org.aspectj.lang.reflect.c[] cVarArr = new org.aspectj.lang.reflect.c[length - i4];
        while (i4 < genericParameterTypes.length) {
            if (genericParameterTypes[i4] instanceof Class) {
                cVarArr[i4 - this.f72163g] = org.aspectj.lang.reflect.d.a((Class) genericParameterTypes[i4]);
            } else {
                cVarArr[i4 - this.f72163g] = genericParameterTypes[i4];
            }
            i4++;
        }
        return cVarArr;
    }

    @Override // org.aspectj.lang.reflect.q
    public Type g() {
        Type genericReturnType = this.f72162f.getGenericReturnType();
        return genericReturnType instanceof Class ? org.aspectj.lang.reflect.d.a((Class) genericReturnType) : genericReturnType;
    }

    @Override // org.aspectj.lang.reflect.q
    public String getName() {
        return this.f72161e;
    }

    @Override // org.aspectj.lang.reflect.q
    public org.aspectj.lang.reflect.c<?> getReturnType() {
        return org.aspectj.lang.reflect.d.a(this.f72162f.getReturnType());
    }

    @Override // org.aspectj.lang.reflect.q
    public TypeVariable<Method>[] getTypeParameters() {
        return this.f72162f.getTypeParameters();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Modifier.toString(e()));
        stringBuffer.append(" ");
        stringBuffer.append(getReturnType().toString());
        stringBuffer.append(" ");
        stringBuffer.append(this.f72155b);
        stringBuffer.append(h0.f27805a);
        stringBuffer.append(getName());
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

    public k(org.aspectj.lang.reflect.c<?> cVar, org.aspectj.lang.reflect.c<?> cVar2, Method method, int i4) {
        super(cVar, cVar2, i4);
        this.f72163g = 1;
        this.f72163g = 0;
        this.f72161e = method.getName();
        this.f72162f = method;
    }
}

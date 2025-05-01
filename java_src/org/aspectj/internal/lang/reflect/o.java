package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.util.StringTokenizer;
import org.aspectj.lang.reflect.v;
import org.aspectj.lang.reflect.x;
/* compiled from: PointcutImpl.java */
/* loaded from: classes7.dex */
public class o implements v {

    /* renamed from: a  reason: collision with root package name */
    private final String f72173a;

    /* renamed from: b  reason: collision with root package name */
    private final x f72174b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f72175c;

    /* renamed from: d  reason: collision with root package name */
    private final org.aspectj.lang.reflect.c f72176d;

    /* renamed from: e  reason: collision with root package name */
    private String[] f72177e;

    /* JADX INFO: Access modifiers changed from: protected */
    public o(String str, String str2, Method method, org.aspectj.lang.reflect.c cVar, String str3) {
        this.f72177e = new String[0];
        this.f72173a = str;
        this.f72174b = new n(str2);
        this.f72175c = method;
        this.f72176d = cVar;
        this.f72177e = d(str3);
    }

    private String[] d(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int countTokens = stringTokenizer.countTokens();
        String[] strArr = new String[countTokens];
        for (int i4 = 0; i4 < countTokens; i4++) {
            strArr[i4] = stringTokenizer.nextToken().trim();
        }
        return strArr;
    }

    @Override // org.aspectj.lang.reflect.v
    public org.aspectj.lang.reflect.c a() {
        return this.f72176d;
    }

    @Override // org.aspectj.lang.reflect.v
    public x b() {
        return this.f72174b;
    }

    @Override // org.aspectj.lang.reflect.v
    public org.aspectj.lang.reflect.c<?>[] c() {
        Class<?>[] parameterTypes = this.f72175c.getParameterTypes();
        int length = parameterTypes.length;
        org.aspectj.lang.reflect.c<?>[] cVarArr = new org.aspectj.lang.reflect.c[length];
        for (int i4 = 0; i4 < length; i4++) {
            cVarArr[i4] = org.aspectj.lang.reflect.d.a(parameterTypes[i4]);
        }
        return cVarArr;
    }

    @Override // org.aspectj.lang.reflect.v
    public int e() {
        return this.f72175c.getModifiers();
    }

    @Override // org.aspectj.lang.reflect.v
    public String[] g() {
        return this.f72177e;
    }

    @Override // org.aspectj.lang.reflect.v
    public String getName() {
        return this.f72173a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getName());
        stringBuffer.append("(");
        org.aspectj.lang.reflect.c<?>[] c5 = c();
        int i4 = 0;
        while (i4 < c5.length) {
            stringBuffer.append(c5[i4].getName());
            String[] strArr = this.f72177e;
            if (strArr != null && strArr[i4] != null) {
                stringBuffer.append(" ");
                stringBuffer.append(this.f72177e[i4]);
            }
            i4++;
            if (i4 < c5.length) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(") : ");
        stringBuffer.append(b().a());
        return stringBuffer.toString();
    }
}

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.x;
/* compiled from: DeclareSoftImpl.java */
/* loaded from: classes7.dex */
public class g implements org.aspectj.lang.reflect.k {

    /* renamed from: a  reason: collision with root package name */
    private org.aspectj.lang.reflect.c<?> f72149a;

    /* renamed from: b  reason: collision with root package name */
    private x f72150b;

    /* renamed from: c  reason: collision with root package name */
    private org.aspectj.lang.reflect.c<?> f72151c;

    /* renamed from: d  reason: collision with root package name */
    private String f72152d;

    public g(org.aspectj.lang.reflect.c<?> cVar, String str, String str2) {
        this.f72149a = cVar;
        this.f72150b = new n(str);
        try {
            this.f72151c = org.aspectj.lang.reflect.d.a(Class.forName(str2, false, cVar.Z().getClassLoader()));
        } catch (ClassNotFoundException unused) {
            this.f72152d = str2;
        }
    }

    @Override // org.aspectj.lang.reflect.k
    public org.aspectj.lang.reflect.c a() {
        return this.f72149a;
    }

    @Override // org.aspectj.lang.reflect.k
    public x b() {
        return this.f72150b;
    }

    @Override // org.aspectj.lang.reflect.k
    public org.aspectj.lang.reflect.c c() throws ClassNotFoundException {
        if (this.f72152d == null) {
            return this.f72151c;
        }
        throw new ClassNotFoundException(this.f72152d);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("declare soft : ");
        String str = this.f72152d;
        if (str != null) {
            stringBuffer.append(this.f72151c.getName());
        } else {
            stringBuffer.append(str);
        }
        stringBuffer.append(" : ");
        stringBuffer.append(b().a());
        return stringBuffer.toString();
    }
}

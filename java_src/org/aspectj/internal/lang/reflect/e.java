package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Type;
import org.aspectj.lang.reflect.a0;
/* compiled from: DeclareParentsImpl.java */
/* loaded from: classes7.dex */
public class e implements org.aspectj.lang.reflect.i {

    /* renamed from: a  reason: collision with root package name */
    private org.aspectj.lang.reflect.c<?> f72139a;

    /* renamed from: b  reason: collision with root package name */
    private a0 f72140b;

    /* renamed from: c  reason: collision with root package name */
    private Type[] f72141c;

    /* renamed from: d  reason: collision with root package name */
    private String f72142d;

    /* renamed from: e  reason: collision with root package name */
    private String f72143e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f72144f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f72145g;

    public e(String str, String str2, boolean z4, org.aspectj.lang.reflect.c<?> cVar) {
        this.f72145g = false;
        this.f72140b = new s(str);
        this.f72144f = z4;
        this.f72139a = cVar;
        this.f72142d = str2;
        try {
            this.f72141c = q.a(str2, cVar.Z());
        } catch (ClassNotFoundException e5) {
            this.f72145g = true;
            this.f72143e = e5.getMessage();
        }
    }

    @Override // org.aspectj.lang.reflect.i
    public org.aspectj.lang.reflect.c a() {
        return this.f72139a;
    }

    @Override // org.aspectj.lang.reflect.i
    public boolean b() {
        return !this.f72144f;
    }

    @Override // org.aspectj.lang.reflect.i
    public Type[] c() throws ClassNotFoundException {
        if (!this.f72145g) {
            return this.f72141c;
        }
        throw new ClassNotFoundException(this.f72143e);
    }

    @Override // org.aspectj.lang.reflect.i
    public a0 d() {
        return this.f72140b;
    }

    @Override // org.aspectj.lang.reflect.i
    public boolean isExtends() {
        return this.f72144f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("declare parents : ");
        stringBuffer.append(d().a());
        stringBuffer.append(isExtends() ? " extends " : " implements ");
        stringBuffer.append(this.f72142d);
        return stringBuffer.toString();
    }
}

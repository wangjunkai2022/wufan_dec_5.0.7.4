package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.x;
/* compiled from: DeclareErrorOrWarningImpl.java */
/* loaded from: classes7.dex */
public class d implements org.aspectj.lang.reflect.h {

    /* renamed from: a  reason: collision with root package name */
    private x f72135a;

    /* renamed from: b  reason: collision with root package name */
    private String f72136b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f72137c;

    /* renamed from: d  reason: collision with root package name */
    private org.aspectj.lang.reflect.c f72138d;

    public d(String str, String str2, boolean z4, org.aspectj.lang.reflect.c cVar) {
        this.f72135a = new n(str);
        this.f72136b = str2;
        this.f72137c = z4;
        this.f72138d = cVar;
    }

    @Override // org.aspectj.lang.reflect.h
    public org.aspectj.lang.reflect.c a() {
        return this.f72138d;
    }

    @Override // org.aspectj.lang.reflect.h
    public x b() {
        return this.f72135a;
    }

    @Override // org.aspectj.lang.reflect.h
    public String getMessage() {
        return this.f72136b;
    }

    @Override // org.aspectj.lang.reflect.h
    public boolean isError() {
        return this.f72137c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("declare ");
        stringBuffer.append(isError() ? "error : " : "warning : ");
        stringBuffer.append(b().a());
        stringBuffer.append(" : ");
        stringBuffer.append(m.a.f71493g);
        stringBuffer.append(getMessage());
        stringBuffer.append(m.a.f71493g);
        return stringBuffer.toString();
    }
}

package org.aspectj.internal.lang.reflect;
/* compiled from: InterTypeDeclarationImpl.java */
/* loaded from: classes7.dex */
public class i implements org.aspectj.lang.reflect.o {

    /* renamed from: a  reason: collision with root package name */
    private org.aspectj.lang.reflect.c<?> f72154a;

    /* renamed from: b  reason: collision with root package name */
    protected String f72155b;

    /* renamed from: c  reason: collision with root package name */
    private org.aspectj.lang.reflect.c<?> f72156c;

    /* renamed from: d  reason: collision with root package name */
    private int f72157d;

    public i(org.aspectj.lang.reflect.c<?> cVar, String str, int i4) {
        this.f72154a = cVar;
        this.f72155b = str;
        this.f72157d = i4;
        try {
            this.f72156c = (org.aspectj.lang.reflect.c) q.c(str, cVar.Z());
        } catch (ClassNotFoundException unused) {
        }
    }

    @Override // org.aspectj.lang.reflect.o
    public org.aspectj.lang.reflect.c<?> a() {
        return this.f72154a;
    }

    @Override // org.aspectj.lang.reflect.o
    public int e() {
        return this.f72157d;
    }

    @Override // org.aspectj.lang.reflect.o
    public org.aspectj.lang.reflect.c<?> h() throws ClassNotFoundException {
        org.aspectj.lang.reflect.c<?> cVar = this.f72156c;
        if (cVar != null) {
            return cVar;
        }
        throw new ClassNotFoundException(this.f72155b);
    }

    public i(org.aspectj.lang.reflect.c<?> cVar, org.aspectj.lang.reflect.c<?> cVar2, int i4) {
        this.f72154a = cVar;
        this.f72156c = cVar2;
        this.f72155b = cVar2.getName();
        this.f72157d = i4;
    }
}

package org.aspectj.runtime.internal;
/* compiled from: AroundClosure.java */
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected Object[] f72217a;

    /* renamed from: b  reason: collision with root package name */
    protected int f72218b = 1048576;

    /* renamed from: c  reason: collision with root package name */
    protected Object[] f72219c;

    public a() {
    }

    public int a() {
        return this.f72218b;
    }

    public Object[] b() {
        return this.f72219c;
    }

    public Object[] c() {
        return this.f72217a;
    }

    public org.aspectj.lang.d d() {
        Object[] objArr = this.f72217a;
        org.aspectj.lang.d dVar = (org.aspectj.lang.d) objArr[objArr.length - 1];
        dVar.j(this);
        return dVar;
    }

    public org.aspectj.lang.d e(int i4) {
        Object[] objArr = this.f72217a;
        org.aspectj.lang.d dVar = (org.aspectj.lang.d) objArr[objArr.length - 1];
        dVar.j(this);
        this.f72218b = i4;
        return dVar;
    }

    public abstract Object f(Object[] objArr) throws Throwable;

    public a(Object[] objArr) {
        this.f72217a = objArr;
    }
}

package org.aspectj.runtime.internal;
/* compiled from: CFlowPlusState.java */
/* loaded from: classes7.dex */
public class c extends b4.a {

    /* renamed from: b  reason: collision with root package name */
    private Object[] f72222b;

    public c(Object[] objArr) {
        this.f72222b = objArr;
    }

    @Override // b4.a
    public Object a(int i4) {
        return this.f72222b[i4];
    }

    public c(Object[] objArr, Object obj) {
        super(obj);
        this.f72222b = objArr;
    }
}

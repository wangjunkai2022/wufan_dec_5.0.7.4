package com.switfpass.pay.thread;
/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private a f61799a;

    public abstract Object a();

    public void b(a aVar) {
        this.f61799a = aVar;
    }

    public void c(int i4) {
        a aVar = this.f61799a;
        if (aVar != null) {
            aVar.a(i4);
        }
    }
}

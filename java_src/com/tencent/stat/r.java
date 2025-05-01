package com.tencent.stat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.tencent.stat.a.e f63020a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f63021b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ n f63022c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(n nVar, com.tencent.stat.a.e eVar, c cVar) {
        this.f63022c = nVar;
        this.f63020a = eVar;
        this.f63021b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f63022c.b(this.f63020a, this.f63021b);
    }
}

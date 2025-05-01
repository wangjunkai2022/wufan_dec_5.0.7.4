package com.tencent.stat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f63023a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n f63024b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(n nVar, b bVar) {
        this.f63024b = nVar;
        this.f63023a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f63024b.b(this.f63023a);
    }
}

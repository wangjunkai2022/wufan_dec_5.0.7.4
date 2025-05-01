package com.tencent.stat;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f63018a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n f63019b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(n nVar, List list) {
        this.f63019b = nVar;
        this.f63018a = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f63019b.b(this.f63018a);
    }
}

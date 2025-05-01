package com.tencent.stat;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f63015a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f63016b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ n f63017c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(n nVar, List list, int i4) {
        this.f63017c = nVar;
        this.f63015a = list;
        this.f63016b = i4;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f63017c.b(this.f63015a, this.f63016b);
    }
}

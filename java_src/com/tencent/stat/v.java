package com.tencent.stat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f63029a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n f63030b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(n nVar, int i4) {
        this.f63030b = nVar;
        this.f63029a = i4;
    }

    @Override // java.lang.Runnable
    public void run() {
        int a5 = StatConfig.a();
        int i4 = this.f63029a;
        if (i4 == -1) {
            i4 = this.f63030b.f63010b;
        }
        int i5 = i4 / a5;
        int i6 = i4 % a5;
        for (int i7 = 0; i7 < i5 + 1; i7++) {
            this.f63030b.b(a5);
        }
        if (i6 > 0) {
            this.f63030b.b(i6);
        }
    }
}

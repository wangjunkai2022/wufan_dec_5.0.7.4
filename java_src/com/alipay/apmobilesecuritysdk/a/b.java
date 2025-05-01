package com.alipay.apmobilesecuritysdk.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b extends Thread {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f4628b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f4629c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f4630d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a f4631e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, String str, String str2, String str3) {
        this.f4631e = aVar;
        this.f4628b = str;
        this.f4629c = str2;
        this.f4630d = str3;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a.c(this.f4631e, this.f4628b, this.f4629c, this.f4630d);
    }
}

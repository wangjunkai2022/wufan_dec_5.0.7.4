package com.switfpass.pay.activity;
/* loaded from: classes5.dex */
final class a0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ BasePayActivity f61552b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f61553c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(BasePayActivity basePayActivity, String str) {
        this.f61552b = basePayActivity;
        this.f61553c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new com.switfpass.pay.utils.e0().a(this.f61552b, this.f61553c);
    }
}

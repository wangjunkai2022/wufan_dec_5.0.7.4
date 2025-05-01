package com.switfpass.pay.activity;

import android.app.ProgressDialog;
import android.content.Context;
/* loaded from: classes5.dex */
final class d0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ PayPlugin f61557b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Context f61558c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f61559d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(PayPlugin payPlugin, Context context, String str) {
        this.f61557b = payPlugin;
        this.f61558c = context;
        this.f61559d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PayPlugin payPlugin = this.f61557b;
        if (payPlugin.f61519e == null) {
            payPlugin.f61519e = new ProgressDialog(this.f61558c);
        }
        this.f61557b.f61519e.setMessage(this.f61559d);
        this.f61557b.f61519e.show();
    }
}

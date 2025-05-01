package com.alipay.sdk.auth;

import android.webkit.WebView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f4771b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AuthActivity f4772c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(AuthActivity authActivity, String str) {
        this.f4772c = authActivity;
        this.f4771b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        try {
            webView = this.f4772c.f4756b;
            webView.loadUrl("javascript:" + this.f4771b);
        } catch (Exception unused) {
        }
    }
}

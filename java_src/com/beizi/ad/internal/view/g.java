package com.beizi.ad.internal.view;

import android.graphics.Canvas;
import com.beizi.ad.internal.view.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdWebView.java */
/* loaded from: classes2.dex */
public class g extends AdWebView {

    /* renamed from: d  reason: collision with root package name */
    f f6412d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(AdViewImpl adViewImpl, f fVar) {
        super(adViewImpl);
        this.f6278b = f.f6375a[f.b.STARTING_EXPANDED.ordinal()];
        this.f6412d = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.beizi.ad.internal.view.AdWebView
    public void e() {
        super.e();
        this.f6412d.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beizi.ad.internal.view.AdWebView, android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}

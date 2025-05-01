package com.heepay.plugin.d.a;

import android.webkit.WebView;
import java.lang.ref.WeakReference;
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private int f14402a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14403b = true;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<WebView> f14404c;

    /* renamed from: d  reason: collision with root package name */
    private String f14405d;

    public e(WebView webView, String str, int i4) {
        this.f14404c = new WeakReference<>(webView);
        this.f14405d = str;
        this.f14402a = i4;
    }
}

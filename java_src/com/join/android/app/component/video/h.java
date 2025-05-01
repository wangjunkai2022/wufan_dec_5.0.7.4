package com.join.android.app.component.video;

import android.graphics.Bitmap;
/* compiled from: VideoSwitchBackListUtil.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static StandardVideoView f15409a;

    /* renamed from: b  reason: collision with root package name */
    private static s2.a f15410b;

    /* renamed from: c  reason: collision with root package name */
    private static Bitmap f15411c;

    public static void a(StandardVideoView standardVideoView) {
        standardVideoView.f(f15409a);
    }

    public static Bitmap b() {
        return f15411c;
    }

    public static void c(StandardVideoView standardVideoView, String str, boolean z4, String str2) {
        standardVideoView.setSwitchUrl(str);
        standardVideoView.setSwitchCache(z4);
        standardVideoView.setSwitchTitle(str2);
    }

    public static void d() {
        f15409a = null;
        f15410b = null;
    }

    public static void e(Bitmap bitmap) {
        f15411c = bitmap;
    }

    public static void f(StandardVideoView standardVideoView) {
        f15409a = standardVideoView.i();
        f15410b = standardVideoView;
    }
}

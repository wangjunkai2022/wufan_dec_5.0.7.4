package com.join.android.app.component.video;

import android.graphics.Bitmap;
/* compiled from: VideoSwitchUtil.java */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static StandardVideoView f15412a;

    /* renamed from: b  reason: collision with root package name */
    private static s2.a f15413b;

    /* renamed from: c  reason: collision with root package name */
    private static Bitmap f15414c;

    public static void a(StandardVideoView standardVideoView) {
        standardVideoView.f(f15412a);
    }

    public static Bitmap b() {
        return f15414c;
    }

    public static void c(StandardVideoView standardVideoView, String str, boolean z4, String str2) {
        standardVideoView.setSwitchUrl(str);
        standardVideoView.setSwitchCache(z4);
        standardVideoView.setSwitchTitle(str2);
    }

    public static void d() {
        f15412a = null;
        f15413b = null;
    }

    public static void e(Bitmap bitmap) {
        f15414c = bitmap;
    }

    public static void f(StandardVideoView standardVideoView) {
        f15412a = standardVideoView.i();
        f15413b = standardVideoView;
    }
}

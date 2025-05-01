package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.h;
@DoNotStrip
/* loaded from: classes2.dex */
public class NativeRoundingFilter {
    static {
        b.a();
    }

    public static void a(Bitmap bitmap) {
        b(bitmap, false);
    }

    public static void b(Bitmap bitmap, boolean z4) {
        h.i(bitmap);
        nativeToCircleFilter(bitmap, z4);
    }

    public static void c(Bitmap bitmap, int i4, int i5, boolean z4) {
        h.i(bitmap);
        nativeToCircleWithBorderFilter(bitmap, i4, i5, z4);
    }

    @DoNotStrip
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z4);

    @DoNotStrip
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i4, int i5, boolean z4);
}

package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.h;
@DoNotStrip
/* loaded from: classes2.dex */
public class NativeBlurFilter {
    static {
        b.a();
    }

    public static void a(Bitmap bitmap, int i4, int i5) {
        h.i(bitmap);
        h.d(i4 > 0);
        h.d(i5 > 0);
        nativeIterativeBoxBlur(bitmap, i4, i5);
    }

    @DoNotStrip
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i4, int i5);
}

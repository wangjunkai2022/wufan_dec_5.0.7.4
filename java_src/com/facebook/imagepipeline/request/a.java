package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import javax.annotation.Nullable;
/* compiled from: BasePostprocessor.java */
/* loaded from: classes.dex */
public abstract class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final Bitmap.Config f12492a = Bitmap.Config.ARGB_8888;

    private static void d(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            Bitmaps.a(bitmap, bitmap2);
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // com.facebook.imagepipeline.request.d
    @Nullable
    public com.facebook.cache.common.c a() {
        return null;
    }

    @Override // com.facebook.imagepipeline.request.d
    public com.facebook.common.references.a<Bitmap> c(Bitmap bitmap, com.facebook.imagepipeline.bitmaps.f fVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f12492a;
        }
        com.facebook.common.references.a<Bitmap> z4 = fVar.z(width, height, config);
        try {
            f(z4.k(), bitmap);
            return com.facebook.common.references.a.d(z4);
        } finally {
            com.facebook.common.references.a.h(z4);
        }
    }

    public void e(Bitmap bitmap) {
    }

    public void f(Bitmap bitmap, Bitmap bitmap2) {
        d(bitmap, bitmap2);
        e(bitmap);
    }

    @Override // com.facebook.imagepipeline.request.d
    public String getName() {
        return "Unknown postprocessor";
    }
}

package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.h;
import com.facebook.common.internal.m;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import java.util.Locale;
import javax.annotation.Nullable;
@DoNotStrip
/* loaded from: classes.dex */
public abstract class DalvikPurgeableDecoder implements com.facebook.imagepipeline.platform.f {

    /* renamed from: b  reason: collision with root package name */
    protected static final byte[] f12074b;

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.a f12075a = com.facebook.imagepipeline.memory.c.a();

    static {
        a.a();
        f12074b = new byte[]{-1, -39};
    }

    @VisibleForTesting
    public static boolean g(com.facebook.common.references.a<PooledByteBuffer> aVar, int i4) {
        PooledByteBuffer k4 = aVar.k();
        return i4 >= 2 && k4.f(i4 + (-2)) == -1 && k4.f(i4 - 1) == -39;
    }

    @VisibleForTesting
    public static BitmapFactory.Options h(int i4, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i4;
        if (Build.VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    @DoNotStrip
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // com.facebook.imagepipeline.platform.f
    public com.facebook.common.references.a<Bitmap> a(com.facebook.imagepipeline.image.e eVar, Bitmap.Config config, @Nullable Rect rect) {
        return b(eVar, config, rect, false);
    }

    @Override // com.facebook.imagepipeline.platform.f
    public com.facebook.common.references.a<Bitmap> b(com.facebook.imagepipeline.image.e eVar, Bitmap.Config config, @Nullable Rect rect, boolean z4) {
        BitmapFactory.Options h4 = h(eVar.y(), config);
        com.facebook.common.references.a<PooledByteBuffer> h5 = eVar.h();
        h.i(h5);
        try {
            return i(e(h5, h4));
        } finally {
            com.facebook.common.references.a.h(h5);
        }
    }

    @Override // com.facebook.imagepipeline.platform.f
    public com.facebook.common.references.a<Bitmap> c(com.facebook.imagepipeline.image.e eVar, Bitmap.Config config, @Nullable Rect rect, int i4, boolean z4) {
        BitmapFactory.Options h4 = h(eVar.y(), config);
        com.facebook.common.references.a<PooledByteBuffer> h5 = eVar.h();
        h.i(h5);
        try {
            return i(f(h5, i4, h4));
        } finally {
            com.facebook.common.references.a.h(h5);
        }
    }

    @Override // com.facebook.imagepipeline.platform.f
    public com.facebook.common.references.a<Bitmap> d(com.facebook.imagepipeline.image.e eVar, Bitmap.Config config, @Nullable Rect rect, int i4) {
        return c(eVar, config, rect, i4, false);
    }

    protected abstract Bitmap e(com.facebook.common.references.a<PooledByteBuffer> aVar, BitmapFactory.Options options);

    protected abstract Bitmap f(com.facebook.common.references.a<PooledByteBuffer> aVar, int i4, BitmapFactory.Options options);

    public com.facebook.common.references.a<Bitmap> i(Bitmap bitmap) {
        h.i(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f12075a.g(bitmap)) {
                return com.facebook.common.references.a.v(bitmap, this.f12075a.e());
            }
            int g4 = com.facebook.imageutils.a.g(bitmap);
            bitmap.recycle();
            throw new TooManyBitmapsException(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(g4), Integer.valueOf(this.f12075a.b()), Long.valueOf(this.f12075a.f()), Integer.valueOf(this.f12075a.c()), Integer.valueOf(this.f12075a.d())));
        } catch (Exception e5) {
            bitmap.recycle();
            throw m.d(e5);
        }
    }
}

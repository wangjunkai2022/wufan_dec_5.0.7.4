package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import javax.annotation.Nullable;
/* compiled from: PlatformBitmapFactory.java */
/* loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlatformBitmapFactory.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11614a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f11614a = iArr;
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11614a[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11614a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11614a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static Bitmap.Config C(Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap.Config config2 = bitmap.getConfig();
        if (config2 != null) {
            int i4 = a.f11614a[config2.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    return Bitmap.Config.ARGB_8888;
                }
                return Bitmap.Config.ALPHA_8;
            }
            return Bitmap.Config.RGB_565;
        }
        return config;
    }

    private static void D(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setDensity(bitmap.getDensity());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 12) {
            bitmap2.setHasAlpha(bitmap.hasAlpha());
        }
        if (i4 >= 19) {
            bitmap2.setPremultiplied(bitmap.isPremultiplied());
        }
    }

    private static void a(Bitmap bitmap, int i4, int i5, int i6, int i7) {
        com.facebook.common.internal.h.e(i4 + i6 <= bitmap.getWidth(), "x + width must be <= bitmap.width()");
        com.facebook.common.internal.h.e(i5 + i7 <= bitmap.getHeight(), "y + height must be <= bitmap.height()");
    }

    private static void b(int i4, int i5) {
        com.facebook.common.internal.h.e(i4 > 0, "width must be > 0");
        com.facebook.common.internal.h.e(i5 > 0, "height must be > 0");
    }

    private static void c(int i4, int i5) {
        com.facebook.common.internal.h.e(i4 >= 0, "x must be >= 0");
        com.facebook.common.internal.h.e(i5 >= 0, "y must be >= 0");
    }

    private com.facebook.common.references.a<Bitmap> g(int i4, int i5, Bitmap.Config config, boolean z4) {
        return h(i4, i5, config, z4, null);
    }

    private com.facebook.common.references.a<Bitmap> h(int i4, int i5, Bitmap.Config config, boolean z4, @Nullable Object obj) {
        return s(null, i4, i5, config, z4, obj);
    }

    private com.facebook.common.references.a<Bitmap> r(DisplayMetrics displayMetrics, int i4, int i5, Bitmap.Config config, boolean z4) {
        return s(displayMetrics, i4, i5, config, z4, null);
    }

    private com.facebook.common.references.a<Bitmap> s(DisplayMetrics displayMetrics, int i4, int i5, Bitmap.Config config, boolean z4, @Nullable Object obj) {
        b(i4, i5);
        com.facebook.common.references.a<Bitmap> z5 = z(i4, i5, config);
        Bitmap k4 = z5.k();
        if (displayMetrics != null) {
            k4.setDensity(displayMetrics.densityDpi);
        }
        if (Build.VERSION.SDK_INT >= 12) {
            k4.setHasAlpha(z4);
        }
        if (config == Bitmap.Config.ARGB_8888 && !z4) {
            k4.eraseColor(-16777216);
        }
        return z5;
    }

    public com.facebook.common.references.a<Bitmap> A(Bitmap bitmap, int i4, int i5, boolean z4) {
        return B(bitmap, i4, i5, z4, null);
    }

    public com.facebook.common.references.a<Bitmap> B(Bitmap bitmap, int i4, int i5, boolean z4, @Nullable Object obj) {
        b(i4, i5);
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        matrix.setScale(i4 / width, i5 / height);
        return m(bitmap, 0, 0, width, height, matrix, z4, obj);
    }

    public com.facebook.common.references.a<Bitmap> d(int i4, int i5) {
        return e(i4, i5, Bitmap.Config.ARGB_8888);
    }

    public com.facebook.common.references.a<Bitmap> e(int i4, int i5, Bitmap.Config config) {
        return f(i4, i5, config, null);
    }

    public com.facebook.common.references.a<Bitmap> f(int i4, int i5, Bitmap.Config config, @Nullable Object obj) {
        return z(i4, i5, config);
    }

    public com.facebook.common.references.a<Bitmap> i(int i4, int i5, @Nullable Object obj) {
        return f(i4, i5, Bitmap.Config.ARGB_8888, obj);
    }

    public com.facebook.common.references.a<Bitmap> j(Bitmap bitmap) {
        return o(bitmap, null);
    }

    public com.facebook.common.references.a<Bitmap> k(Bitmap bitmap, int i4, int i5, int i6, int i7) {
        return n(bitmap, i4, i5, i6, i7, null);
    }

    public com.facebook.common.references.a<Bitmap> l(Bitmap bitmap, int i4, int i5, int i6, int i7, @Nullable Matrix matrix, boolean z4) {
        return m(bitmap, i4, i5, i6, i7, matrix, z4, null);
    }

    public com.facebook.common.references.a<Bitmap> m(Bitmap bitmap, int i4, int i5, int i6, int i7, @Nullable Matrix matrix, boolean z4, @Nullable Object obj) {
        com.facebook.common.references.a<Bitmap> h4;
        Canvas canvas;
        Paint paint;
        com.facebook.common.internal.h.j(bitmap, "Source bitmap cannot be null");
        c(i4, i5);
        b(i6, i7);
        a(bitmap, i4, i5, i6, i7);
        Rect rect = new Rect(i4, i5, i4 + i6, i5 + i7);
        RectF rectF = new RectF(0.0f, 0.0f, i6, i7);
        Bitmap.Config C = C(bitmap);
        if (matrix != null && !matrix.isIdentity()) {
            boolean z5 = !matrix.rectStaysRect();
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            int round = Math.round(rectF2.width());
            int round2 = Math.round(rectF2.height());
            if (z5) {
                C = Bitmap.Config.ARGB_8888;
            }
            h4 = h(round, round2, C, z5 || bitmap.hasAlpha(), obj);
            D(bitmap, h4.k());
            canvas = new Canvas(h4.k());
            canvas.translate(-rectF2.left, -rectF2.top);
            canvas.concat(matrix);
            paint = new Paint();
            paint.setFilterBitmap(z4);
            if (z5) {
                paint.setAntiAlias(true);
            }
        } else {
            h4 = h(i6, i7, C, bitmap.hasAlpha(), obj);
            D(bitmap, h4.k());
            canvas = new Canvas(h4.k());
            paint = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
        canvas.setBitmap(null);
        return h4;
    }

    public com.facebook.common.references.a<Bitmap> n(Bitmap bitmap, int i4, int i5, int i6, int i7, @Nullable Object obj) {
        return m(bitmap, i4, i5, i6, i7, null, false, obj);
    }

    public com.facebook.common.references.a<Bitmap> o(Bitmap bitmap, @Nullable Object obj) {
        return n(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), obj);
    }

    public com.facebook.common.references.a<Bitmap> p(DisplayMetrics displayMetrics, int i4, int i5, Bitmap.Config config) {
        return q(displayMetrics, i4, i5, config, null);
    }

    public com.facebook.common.references.a<Bitmap> q(DisplayMetrics displayMetrics, int i4, int i5, Bitmap.Config config, @Nullable Object obj) {
        return s(displayMetrics, i4, i5, config, true, obj);
    }

    public com.facebook.common.references.a<Bitmap> t(DisplayMetrics displayMetrics, int[] iArr, int i4, int i5, int i6, int i7, Bitmap.Config config) {
        return u(displayMetrics, iArr, i4, i5, i6, i7, config, null);
    }

    public com.facebook.common.references.a<Bitmap> u(DisplayMetrics displayMetrics, int[] iArr, int i4, int i5, int i6, int i7, Bitmap.Config config, @Nullable Object obj) {
        com.facebook.common.references.a<Bitmap> q4 = q(displayMetrics, i6, i7, config, obj);
        q4.k().setPixels(iArr, i4, i5, 0, 0, i6, i7);
        return q4;
    }

    public com.facebook.common.references.a<Bitmap> v(DisplayMetrics displayMetrics, int[] iArr, int i4, int i5, Bitmap.Config config) {
        return w(displayMetrics, iArr, i4, i5, config, null);
    }

    public com.facebook.common.references.a<Bitmap> w(DisplayMetrics displayMetrics, int[] iArr, int i4, int i5, Bitmap.Config config, @Nullable Object obj) {
        return u(displayMetrics, iArr, 0, i4, i4, i5, config, obj);
    }

    public com.facebook.common.references.a<Bitmap> x(int[] iArr, int i4, int i5, Bitmap.Config config) {
        return y(iArr, i4, i5, config, null);
    }

    public com.facebook.common.references.a<Bitmap> y(int[] iArr, int i4, int i5, Bitmap.Config config, @Nullable Object obj) {
        com.facebook.common.references.a<Bitmap> z4 = z(i4, i5, config);
        z4.k().setPixels(iArr, 0, i4, 0, 0, i4, i5);
        return z4;
    }

    public abstract com.facebook.common.references.a<Bitmap> z(int i4, int i5, Bitmap.Config config);
}

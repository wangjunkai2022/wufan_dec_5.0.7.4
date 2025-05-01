package com.facebook.imagepipeline.transcoder;

import android.graphics.Matrix;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.common.RotationOptions;
import javax.annotation.Nullable;
/* compiled from: JpegTranscoderUtils.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final int f12500a = 360;

    /* renamed from: b  reason: collision with root package name */
    public static final int f12501b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f12502c = 100;

    /* renamed from: d  reason: collision with root package name */
    public static final int f12503d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f12504e = 16;

    /* renamed from: f  reason: collision with root package name */
    public static final int f12505f = 8;

    /* renamed from: g  reason: collision with root package name */
    public static final ImmutableList<Integer> f12506g = ImmutableList.b(2, 7, 4, 5);
    @VisibleForTesting

    /* renamed from: h  reason: collision with root package name */
    public static final int f12507h = 85;

    @VisibleForTesting
    public static int a(int i4) {
        return Math.max(1, 8 / i4);
    }

    @VisibleForTesting
    public static float b(com.facebook.imagepipeline.common.d dVar, int i4, int i5) {
        if (dVar == null) {
            return 1.0f;
        }
        float f5 = i4;
        float f6 = i5;
        float max = Math.max(dVar.f11726a / f5, dVar.f11727b / f6);
        float f7 = dVar.f11728c;
        if (f5 * max > f7) {
            max = f7 / f5;
        }
        return f6 * max > f7 ? f7 / f6 : max;
    }

    private static int c(com.facebook.imagepipeline.image.e eVar) {
        int v2 = eVar.v();
        if (v2 == 90 || v2 == 180 || v2 == 270) {
            return eVar.v();
        }
        return 0;
    }

    public static int d(RotationOptions rotationOptions, com.facebook.imagepipeline.image.e eVar) {
        int l4 = eVar.l();
        ImmutableList<Integer> immutableList = f12506g;
        int indexOf = immutableList.indexOf(Integer.valueOf(l4));
        if (indexOf >= 0) {
            return immutableList.get((indexOf + ((rotationOptions.h() ? 0 : rotationOptions.f()) / 90)) % immutableList.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    public static int e(RotationOptions rotationOptions, com.facebook.imagepipeline.image.e eVar) {
        if (rotationOptions.g()) {
            int c5 = c(eVar);
            return rotationOptions.h() ? c5 : (c5 + rotationOptions.f()) % f12500a;
        }
        return 0;
    }

    public static int f(RotationOptions rotationOptions, @Nullable com.facebook.imagepipeline.common.d dVar, com.facebook.imagepipeline.image.e eVar, boolean z4) {
        if (z4 && dVar != null) {
            int e5 = e(rotationOptions, eVar);
            boolean z5 = false;
            int d5 = f12506g.contains(Integer.valueOf(eVar.l())) ? d(rotationOptions, eVar) : 0;
            z5 = (e5 == 90 || e5 == 270 || d5 == 5 || d5 == 7) ? true : true;
            int k4 = k(b(dVar, z5 ? eVar.r() : eVar.B(), z5 ? eVar.B() : eVar.r()), dVar.f11729d);
            if (k4 > 8) {
                return 8;
            }
            if (k4 < 1) {
                return 1;
            }
            return k4;
        }
        return 8;
    }

    @Nullable
    public static Matrix g(com.facebook.imagepipeline.image.e eVar, RotationOptions rotationOptions) {
        if (f12506g.contains(Integer.valueOf(eVar.l()))) {
            return h(d(rotationOptions, eVar));
        }
        int e5 = e(rotationOptions, eVar);
        if (e5 != 0) {
            Matrix matrix = new Matrix();
            matrix.setRotate(e5);
            return matrix;
        }
        return null;
    }

    @Nullable
    private static Matrix h(int i4) {
        Matrix matrix = new Matrix();
        if (i4 == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i4 == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i4 == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i4 != 5) {
            return null;
        } else {
            matrix.setRotate(90.0f);
            matrix.postScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    public static boolean i(int i4) {
        switch (i4) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static boolean j(int i4) {
        return i4 >= 0 && i4 <= 270 && i4 % 90 == 0;
    }

    @VisibleForTesting
    public static int k(float f5, float f6) {
        return (int) (f6 + (f5 * 8.0f));
    }
}

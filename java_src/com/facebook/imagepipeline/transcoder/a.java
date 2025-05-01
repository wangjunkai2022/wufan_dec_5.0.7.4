package com.facebook.imagepipeline.transcoder;

import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.common.RotationOptions;
import javax.annotation.Nullable;
/* compiled from: DownsampleUtil.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12497a = 1;

    /* renamed from: b  reason: collision with root package name */
    private static final float f12498b = 0.33333334f;

    private a() {
    }

    @VisibleForTesting
    public static float a(RotationOptions rotationOptions, @Nullable com.facebook.imagepipeline.common.d dVar, com.facebook.imagepipeline.image.e eVar) {
        com.facebook.common.internal.h.d(com.facebook.imagepipeline.image.e.D(eVar));
        if (dVar == null || dVar.f11727b <= 0 || dVar.f11726a <= 0 || eVar.B() == 0 || eVar.r() == 0) {
            return 1.0f;
        }
        int c5 = c(rotationOptions, eVar);
        boolean z4 = c5 == 90 || c5 == 270;
        int r4 = z4 ? eVar.r() : eVar.B();
        int B = z4 ? eVar.B() : eVar.r();
        float f5 = dVar.f11726a / r4;
        float f6 = dVar.f11727b / B;
        float max = Math.max(f5, f6);
        com.facebook.common.logging.a.i0("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(dVar.f11726a), Integer.valueOf(dVar.f11727b), Integer.valueOf(r4), Integer.valueOf(B), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(max));
        return max;
    }

    public static int b(RotationOptions rotationOptions, @Nullable com.facebook.imagepipeline.common.d dVar, com.facebook.imagepipeline.image.e eVar, int i4) {
        int d5;
        if (com.facebook.imagepipeline.image.e.D(eVar)) {
            float a5 = a(rotationOptions, dVar, eVar);
            if (eVar.t() == com.facebook.imageformat.b.f11528a) {
                d5 = e(a5);
            } else {
                d5 = d(a5);
            }
            int max = Math.max(eVar.r(), eVar.B());
            float f5 = dVar != null ? dVar.f11728c : i4;
            while (max / d5 > f5) {
                d5 = eVar.t() == com.facebook.imageformat.b.f11528a ? d5 * 2 : d5 + 1;
            }
            return d5;
        }
        return 1;
    }

    private static int c(RotationOptions rotationOptions, com.facebook.imagepipeline.image.e eVar) {
        boolean z4 = false;
        if (rotationOptions.h()) {
            int v2 = eVar.v();
            com.facebook.common.internal.h.d((v2 == 0 || v2 == 90 || v2 == 180 || v2 == 270) ? true : true);
            return v2;
        }
        return 0;
    }

    @VisibleForTesting
    public static int d(float f5) {
        if (f5 > 0.6666667f) {
            return 1;
        }
        int i4 = 2;
        while (true) {
            double d5 = i4;
            double pow = Math.pow(d5, 2.0d);
            Double.isNaN(d5);
            Double.isNaN(d5);
            if ((1.0d / d5) + ((1.0d / (pow - d5)) * 0.3333333432674408d) <= f5) {
                return i4 - 1;
            }
            i4++;
        }
    }

    @VisibleForTesting
    public static int e(float f5) {
        if (f5 > 0.6666667f) {
            return 1;
        }
        int i4 = 2;
        while (true) {
            int i5 = i4 * 2;
            double d5 = i5;
            Double.isNaN(d5);
            double d6 = 1.0d / d5;
            if (d6 + (0.3333333432674408d * d6) <= f5) {
                return i4;
            }
            i4 = i5;
        }
    }

    @VisibleForTesting
    public static int f(int i4) {
        int i5 = 1;
        while (i5 < i4) {
            i5 *= 2;
        }
        return i5;
    }
}

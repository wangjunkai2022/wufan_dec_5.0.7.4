package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import com.facebook.drawee.drawable.h;
import com.facebook.drawee.drawable.i;
import com.facebook.drawee.drawable.l;
import com.facebook.drawee.drawable.m;
import com.facebook.drawee.drawable.n;
import com.facebook.drawee.drawable.p;
import com.facebook.drawee.drawable.q;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.generic.RoundingParams;
import javax.annotation.Nullable;
/* compiled from: WrappingUtils.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f11357a = "WrappingUtils";

    /* renamed from: b  reason: collision with root package name */
    private static final Drawable f11358b = new ColorDrawable(0);

    private static Drawable a(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            m mVar = new m(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            b(mVar, roundingParams);
            return mVar;
        } else if (drawable instanceof NinePatchDrawable) {
            p pVar = new p((NinePatchDrawable) drawable);
            b(pVar, roundingParams);
            return pVar;
        } else if ((drawable instanceof ColorDrawable) && Build.VERSION.SDK_INT >= 11) {
            n d5 = n.d((ColorDrawable) drawable);
            b(d5, roundingParams);
            return d5;
        } else {
            com.facebook.common.logging.a.q0(f11357a, "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
    }

    static void b(l lVar, RoundingParams roundingParams) {
        lVar.c(roundingParams.k());
        lVar.r(roundingParams.g());
        lVar.a(roundingParams.e(), roundingParams.f());
        lVar.g(roundingParams.j());
        lVar.l(roundingParams.m());
    }

    static com.facebook.drawee.drawable.d c(com.facebook.drawee.drawable.d dVar) {
        while (true) {
            Drawable p4 = dVar.p();
            if (p4 == dVar || !(p4 instanceof com.facebook.drawee.drawable.d)) {
                break;
            }
            dVar = (com.facebook.drawee.drawable.d) p4;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable d(@Nullable Drawable drawable, @Nullable RoundingParams roundingParams, Resources resources) {
        try {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && roundingParams != null && roundingParams.l() == RoundingParams.RoundingMethod.BITMAP_ONLY) {
                if (drawable instanceof h) {
                    com.facebook.drawee.drawable.d c5 = c((h) drawable);
                    c5.f(a(c5.f(f11358b), roundingParams, resources));
                    return drawable;
                }
                Drawable a5 = a(drawable, roundingParams, resources);
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
                return a5;
            }
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
            return drawable;
        } finally {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }

    @Nullable
    static Drawable e(@Nullable Drawable drawable, @Nullable Matrix matrix) {
        return (drawable == null || matrix == null) ? drawable : new i(drawable, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable f(@Nullable Drawable drawable, @Nullable RoundingParams roundingParams) {
        try {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && roundingParams != null && roundingParams.l() == RoundingParams.RoundingMethod.OVERLAY_COLOR) {
                RoundedCornersDrawable roundedCornersDrawable = new RoundedCornersDrawable(drawable);
                b(roundedCornersDrawable, roundingParams);
                roundedCornersDrawable.y(roundingParams.i());
                return roundedCornersDrawable;
            }
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
            return drawable;
        } finally {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static Drawable g(@Nullable Drawable drawable, @Nullable r.c cVar) {
        return h(drawable, cVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static Drawable h(@Nullable Drawable drawable, @Nullable r.c cVar, @Nullable PointF pointF) {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable != null && cVar != null) {
            q qVar = new q(drawable, cVar);
            if (pointF != null) {
                qVar.B(pointF);
            }
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
            return qVar;
        }
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return drawable;
    }

    static void i(l lVar) {
        lVar.c(false);
        lVar.setRadius(0.0f);
        lVar.a(0, 0.0f);
        lVar.g(0.0f);
        lVar.l(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(com.facebook.drawee.drawable.d dVar, @Nullable RoundingParams roundingParams, Resources resources) {
        com.facebook.drawee.drawable.d c5 = c(dVar);
        Drawable p4 = c5.p();
        if (roundingParams != null && roundingParams.l() == RoundingParams.RoundingMethod.BITMAP_ONLY) {
            if (p4 instanceof l) {
                b((l) p4, roundingParams);
            } else if (p4 != null) {
                c5.f(f11358b);
                c5.f(a(p4, roundingParams, resources));
            }
        } else if (p4 instanceof l) {
            i((l) p4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(com.facebook.drawee.drawable.d dVar, @Nullable RoundingParams roundingParams) {
        Drawable p4 = dVar.p();
        if (roundingParams != null && roundingParams.l() == RoundingParams.RoundingMethod.OVERLAY_COLOR) {
            if (p4 instanceof RoundedCornersDrawable) {
                RoundedCornersDrawable roundedCornersDrawable = (RoundedCornersDrawable) p4;
                b(roundedCornersDrawable, roundingParams);
                roundedCornersDrawable.y(roundingParams.i());
                return;
            }
            dVar.f(f(dVar.f(f11358b), roundingParams));
        } else if (p4 instanceof RoundedCornersDrawable) {
            Drawable drawable = f11358b;
            dVar.f(((RoundedCornersDrawable) p4).v(drawable));
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q l(com.facebook.drawee.drawable.d dVar, r.c cVar) {
        Drawable g4 = g(dVar.f(f11358b), cVar);
        dVar.f(g4);
        com.facebook.common.internal.h.j(g4, "Parent has no child drawable!");
        return (q) g4;
    }
}

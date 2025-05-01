package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.s0;
/* compiled from: GradientStrokeContent.java */
/* loaded from: classes2.dex */
public class i extends a {
    private static final int C = 32;
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> A;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.q B;

    /* renamed from: r  reason: collision with root package name */
    private final String f3684r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f3685s;

    /* renamed from: t  reason: collision with root package name */
    private final LongSparseArray<LinearGradient> f3686t;

    /* renamed from: u  reason: collision with root package name */
    private final LongSparseArray<RadialGradient> f3687u;

    /* renamed from: v  reason: collision with root package name */
    private final RectF f3688v;

    /* renamed from: w  reason: collision with root package name */
    private final GradientType f3689w;

    /* renamed from: x  reason: collision with root package name */
    private final int f3690x;

    /* renamed from: y  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> f3691y;

    /* renamed from: z  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f3692z;

    public i(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.f fVar) {
        super(lottieDrawable, bVar, fVar.b().toPaintCap(), fVar.g().toPaintJoin(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f3686t = new LongSparseArray<>();
        this.f3687u = new LongSparseArray<>();
        this.f3688v = new RectF();
        this.f3684r = fVar.j();
        this.f3689w = fVar.f();
        this.f3685s = fVar.n();
        this.f3690x = (int) (lottieDrawable.N().d() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> a5 = fVar.e().a();
        this.f3691y = a5;
        a5.a(this);
        bVar.i(a5);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a6 = fVar.l().a();
        this.f3692z = a6;
        a6.a(this);
        bVar.i(a6);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a7 = fVar.d().a();
        this.A = a7;
        a7.a(this);
        bVar.i(a7);
    }

    private int[] j(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.q qVar = this.B;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i4 = 0;
            if (iArr.length == numArr.length) {
                while (i4 < iArr.length) {
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i4 < numArr.length) {
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            }
        }
        return iArr;
    }

    private int k() {
        int round = Math.round(this.f3692z.f() * this.f3690x);
        int round2 = Math.round(this.A.f() * this.f3690x);
        int round3 = Math.round(this.f3691y.f() * this.f3690x);
        int i4 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i4 = i4 * 31 * round2;
        }
        return round3 != 0 ? i4 * 31 * round3 : i4;
    }

    private LinearGradient l() {
        long k4 = k();
        LinearGradient linearGradient = this.f3686t.get(k4);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF h4 = this.f3692z.h();
        PointF h5 = this.A.h();
        com.airbnb.lottie.model.content.d h6 = this.f3691y.h();
        LinearGradient linearGradient2 = new LinearGradient(h4.x, h4.y, h5.x, h5.y, j(h6.a()), h6.b(), Shader.TileMode.CLAMP);
        this.f3686t.put(k4, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient m() {
        float f5;
        float f6;
        long k4 = k();
        RadialGradient radialGradient = this.f3687u.get(k4);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF h4 = this.f3692z.h();
        PointF h5 = this.A.h();
        com.airbnb.lottie.model.content.d h6 = this.f3691y.h();
        int[] j4 = j(h6.a());
        float[] b5 = h6.b();
        RadialGradient radialGradient2 = new RadialGradient(h4.x, h4.y, (float) Math.hypot(h5.x - f5, h5.y - f6), j4, b5, Shader.TileMode.CLAMP);
        this.f3687u.put(k4, radialGradient2);
        return radialGradient2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.model.e
    public <T> void d(T t4, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        super.d(t4, jVar);
        if (t4 == s0.L) {
            com.airbnb.lottie.animation.keyframe.q qVar = this.B;
            if (qVar != null) {
                this.f3614f.G(qVar);
            }
            if (jVar == null) {
                this.B = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.B = qVar2;
            qVar2.a(this);
            this.f3614f.i(this.B);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f3684r;
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        Shader m4;
        if (this.f3685s) {
            return;
        }
        f(this.f3688v, matrix, false);
        if (this.f3689w == GradientType.LINEAR) {
            m4 = l();
        } else {
            m4 = m();
        }
        m4.setLocalMatrix(matrix);
        this.f3617i.setShader(m4);
        super.h(canvas, matrix, i4);
    }
}

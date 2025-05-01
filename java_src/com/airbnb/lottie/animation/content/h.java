package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.s0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GradientFillContent.java */
/* loaded from: classes2.dex */
public class h implements e, a.b, k {

    /* renamed from: v  reason: collision with root package name */
    private static final int f3662v = 32;
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private final String f3663a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3664b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f3665c;

    /* renamed from: d  reason: collision with root package name */
    private final LongSparseArray<LinearGradient> f3666d = new LongSparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    private final LongSparseArray<RadialGradient> f3667e = new LongSparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private final Path f3668f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f3669g;

    /* renamed from: h  reason: collision with root package name */
    private final RectF f3670h;

    /* renamed from: i  reason: collision with root package name */
    private final List<n> f3671i;

    /* renamed from: j  reason: collision with root package name */
    private final GradientType f3672j;

    /* renamed from: k  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> f3673k;

    /* renamed from: l  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f3674l;

    /* renamed from: m  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f3675m;

    /* renamed from: n  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f3676n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f3677o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.q f3678p;

    /* renamed from: q  reason: collision with root package name */
    private final LottieDrawable f3679q;

    /* renamed from: r  reason: collision with root package name */
    private final int f3680r;
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f3681s;

    /* renamed from: t  reason: collision with root package name */
    float f3682t;
    @Nullable

    /* renamed from: u  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.c f3683u;

    public h(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.e eVar) {
        Path path = new Path();
        this.f3668f = path;
        this.f3669g = new com.airbnb.lottie.animation.a(1);
        this.f3670h = new RectF();
        this.f3671i = new ArrayList();
        this.f3682t = 0.0f;
        this.f3665c = bVar;
        this.f3663a = eVar.f();
        this.f3664b = eVar.i();
        this.f3679q = lottieDrawable;
        this.f3672j = eVar.e();
        path.setFillType(eVar.c());
        this.f3680r = (int) (lottieDrawable.N().d() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> a5 = eVar.d().a();
        this.f3673k = a5;
        a5.a(this);
        bVar.i(a5);
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a6 = eVar.g().a();
        this.f3674l = a6;
        a6.a(this);
        bVar.i(a6);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a7 = eVar.h().a();
        this.f3675m = a7;
        a7.a(this);
        bVar.i(a7);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a8 = eVar.b().a();
        this.f3676n = a8;
        a8.a(this);
        bVar.i(a8);
        if (bVar.v() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a9 = bVar.v().a().a();
            this.f3681s = a9;
            a9.a(this);
            bVar.i(this.f3681s);
        }
        if (bVar.x() != null) {
            this.f3683u = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.x());
        }
    }

    private int[] g(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.q qVar = this.f3678p;
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

    private int i() {
        int round = Math.round(this.f3675m.f() * this.f3680r);
        int round2 = Math.round(this.f3676n.f() * this.f3680r);
        int round3 = Math.round(this.f3673k.f() * this.f3680r);
        int i4 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i4 = i4 * 31 * round2;
        }
        return round3 != 0 ? i4 * 31 * round3 : i4;
    }

    private LinearGradient j() {
        long i4 = i();
        LinearGradient linearGradient = this.f3666d.get(i4);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF h4 = this.f3675m.h();
        PointF h5 = this.f3676n.h();
        com.airbnb.lottie.model.content.d h6 = this.f3673k.h();
        LinearGradient linearGradient2 = new LinearGradient(h4.x, h4.y, h5.x, h5.y, g(h6.a()), h6.b(), Shader.TileMode.CLAMP);
        this.f3666d.put(i4, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient k() {
        long i4 = i();
        RadialGradient radialGradient = this.f3667e.get(i4);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF h4 = this.f3675m.h();
        PointF h5 = this.f3676n.h();
        com.airbnb.lottie.model.content.d h6 = this.f3673k.h();
        int[] g4 = g(h6.a());
        float[] b5 = h6.b();
        float f5 = h4.x;
        float f6 = h4.y;
        float hypot = (float) Math.hypot(h5.x - f5, h5.y - f6);
        RadialGradient radialGradient2 = new RadialGradient(f5, f6, hypot <= 0.0f ? 0.001f : hypot, g4, b5, Shader.TileMode.CLAMP);
        this.f3667e.put(i4, radialGradient2);
        return radialGradient2;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f3679q.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < list2.size(); i4++) {
            c cVar = list2.get(i4);
            if (cVar instanceof n) {
                this.f3671i.add((n) cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.e
    public <T> void d(T t4, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t4 == s0.f4272d) {
            this.f3674l.n(jVar);
        } else if (t4 == s0.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f3677o;
            if (aVar != null) {
                this.f3665c.G(aVar);
            }
            if (jVar == null) {
                this.f3677o = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f3677o = qVar;
            qVar.a(this);
            this.f3665c.i(this.f3677o);
        } else if (t4 == s0.L) {
            com.airbnb.lottie.animation.keyframe.q qVar2 = this.f3678p;
            if (qVar2 != null) {
                this.f3665c.G(qVar2);
            }
            if (jVar == null) {
                this.f3678p = null;
                return;
            }
            this.f3666d.clear();
            this.f3667e.clear();
            com.airbnb.lottie.animation.keyframe.q qVar3 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f3678p = qVar3;
            qVar3.a(this);
            this.f3665c.i(this.f3678p);
        } else if (t4 == s0.f4278j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f3681s;
            if (aVar2 != null) {
                aVar2.n(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar4 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f3681s = qVar4;
            qVar4.a(this);
            this.f3665c.i(this.f3681s);
        } else if (t4 == s0.f4273e && (cVar5 = this.f3683u) != null) {
            cVar5.c(jVar);
        } else if (t4 == s0.G && (cVar4 = this.f3683u) != null) {
            cVar4.f(jVar);
        } else if (t4 == s0.H && (cVar3 = this.f3683u) != null) {
            cVar3.d(jVar);
        } else if (t4 == s0.I && (cVar2 = this.f3683u) != null) {
            cVar2.e(jVar);
        } else if (t4 != s0.J || (cVar = this.f3683u) == null) {
        } else {
            cVar.g(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void e(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.g.m(dVar, i4, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        this.f3668f.reset();
        for (int i4 = 0; i4 < this.f3671i.size(); i4++) {
            this.f3668f.addPath(this.f3671i.get(i4).getPath(), matrix);
        }
        this.f3668f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f3663a;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        Shader k4;
        if (this.f3664b) {
            return;
        }
        com.airbnb.lottie.e.a("GradientFillContent#draw");
        this.f3668f.reset();
        for (int i5 = 0; i5 < this.f3671i.size(); i5++) {
            this.f3668f.addPath(this.f3671i.get(i5).getPath(), matrix);
        }
        this.f3668f.computeBounds(this.f3670h, false);
        if (this.f3672j == GradientType.LINEAR) {
            k4 = j();
        } else {
            k4 = k();
        }
        k4.setLocalMatrix(matrix);
        this.f3669g.setShader(k4);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f3677o;
        if (aVar != null) {
            this.f3669g.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f3681s;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f3669g.setMaskFilter(null);
            } else if (floatValue != this.f3682t) {
                this.f3669g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f3682t = floatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f3683u;
        if (cVar != null) {
            cVar.b(this.f3669g);
        }
        this.f3669g.setAlpha(com.airbnb.lottie.utils.g.d((int) ((((i4 / 255.0f) * this.f3674l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f3668f, this.f3669g);
        com.airbnb.lottie.e.b("GradientFillContent#draw");
    }
}

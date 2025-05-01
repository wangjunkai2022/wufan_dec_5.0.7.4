package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.s0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FillContent.java */
/* loaded from: classes2.dex */
public class g implements e, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    private final Path f3649a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f3650b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f3651c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3652d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3653e;

    /* renamed from: f  reason: collision with root package name */
    private final List<n> f3654f;

    /* renamed from: g  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f3655g;

    /* renamed from: h  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f3656h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f3657i;

    /* renamed from: j  reason: collision with root package name */
    private final LottieDrawable f3658j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f3659k;

    /* renamed from: l  reason: collision with root package name */
    float f3660l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.c f3661m;

    public g(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.k kVar) {
        Path path = new Path();
        this.f3649a = path;
        this.f3650b = new com.airbnb.lottie.animation.a(1);
        this.f3654f = new ArrayList();
        this.f3651c = bVar;
        this.f3652d = kVar.d();
        this.f3653e = kVar.f();
        this.f3658j = lottieDrawable;
        if (bVar.v() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = bVar.v().a().a();
            this.f3659k = a5;
            a5.a(this);
            bVar.i(this.f3659k);
        }
        if (bVar.x() != null) {
            this.f3661m = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.x());
        }
        if (kVar.b() != null && kVar.e() != null) {
            path.setFillType(kVar.c());
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a6 = kVar.b().a();
            this.f3655g = a6;
            a6.a(this);
            bVar.i(a6);
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a7 = kVar.e().a();
            this.f3656h = a7;
            a7.a(this);
            bVar.i(a7);
            return;
        }
        this.f3655g = null;
        this.f3656h = null;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f3658j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < list2.size(); i4++) {
            c cVar = list2.get(i4);
            if (cVar instanceof n) {
                this.f3654f.add((n) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void d(T t4, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t4 == s0.f4269a) {
            this.f3655g.n(jVar);
        } else if (t4 == s0.f4272d) {
            this.f3656h.n(jVar);
        } else if (t4 == s0.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f3657i;
            if (aVar != null) {
                this.f3651c.G(aVar);
            }
            if (jVar == null) {
                this.f3657i = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f3657i = qVar;
            qVar.a(this);
            this.f3651c.i(this.f3657i);
        } else if (t4 == s0.f4278j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f3659k;
            if (aVar2 != null) {
                aVar2.n(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f3659k = qVar2;
            qVar2.a(this);
            this.f3651c.i(this.f3659k);
        } else if (t4 == s0.f4273e && (cVar5 = this.f3661m) != null) {
            cVar5.c(jVar);
        } else if (t4 == s0.G && (cVar4 = this.f3661m) != null) {
            cVar4.f(jVar);
        } else if (t4 == s0.H && (cVar3 = this.f3661m) != null) {
            cVar3.d(jVar);
        } else if (t4 == s0.I && (cVar2 = this.f3661m) != null) {
            cVar2.e(jVar);
        } else if (t4 != s0.J || (cVar = this.f3661m) == null) {
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
        this.f3649a.reset();
        for (int i4 = 0; i4 < this.f3654f.size(); i4++) {
            this.f3649a.addPath(this.f3654f.get(i4).getPath(), matrix);
        }
        this.f3649a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f3652d;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        if (this.f3653e) {
            return;
        }
        com.airbnb.lottie.e.a("FillContent#draw");
        this.f3650b.setColor((com.airbnb.lottie.utils.g.d((int) ((((i4 / 255.0f) * this.f3656h.h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.airbnb.lottie.animation.keyframe.b) this.f3655g).p() & 16777215));
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f3657i;
        if (aVar != null) {
            this.f3650b.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f3659k;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f3650b.setMaskFilter(null);
            } else if (floatValue != this.f3660l) {
                this.f3650b.setMaskFilter(this.f3651c.w(floatValue));
            }
            this.f3660l = floatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f3661m;
        if (cVar != null) {
            cVar.b(this.f3650b);
        }
        this.f3649a.reset();
        for (int i5 = 0; i5 < this.f3654f.size(); i5++) {
            this.f3649a.addPath(this.f3654f.get(i5).getPath(), matrix);
        }
        canvas.drawPath(this.f3649a, this.f3650b);
        com.airbnb.lottie.e.b("FillContent#draw");
    }
}

package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.s0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BaseStrokeContent.java */
/* loaded from: classes2.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e  reason: collision with root package name */
    private final LottieDrawable f3613e;

    /* renamed from: f  reason: collision with root package name */
    protected final com.airbnb.lottie.model.layer.b f3614f;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f3616h;

    /* renamed from: i  reason: collision with root package name */
    final Paint f3617i;

    /* renamed from: j  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f3618j;

    /* renamed from: k  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Integer> f3619k;

    /* renamed from: l  reason: collision with root package name */
    private final List<com.airbnb.lottie.animation.keyframe.a<?, Float>> f3620l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f3621m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f3622n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f3623o;

    /* renamed from: p  reason: collision with root package name */
    float f3624p;
    @Nullable

    /* renamed from: q  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.c f3625q;

    /* renamed from: a  reason: collision with root package name */
    private final PathMeasure f3609a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    private final Path f3610b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Path f3611c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final RectF f3612d = new RectF();

    /* renamed from: g  reason: collision with root package name */
    private final List<b> f3615g = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseStrokeContent.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<n> f3626a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        private final v f3627b;

        private b(@Nullable v vVar) {
            this.f3626a = new ArrayList();
            this.f3627b = vVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, Paint.Cap cap, Paint.Join join, float f5, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.b bVar3) {
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a(1);
        this.f3617i = aVar;
        this.f3624p = 0.0f;
        this.f3613e = lottieDrawable;
        this.f3614f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f5);
        this.f3619k = dVar.a();
        this.f3618j = bVar2.a();
        if (bVar3 == null) {
            this.f3621m = null;
        } else {
            this.f3621m = bVar3.a();
        }
        this.f3620l = new ArrayList(list.size());
        this.f3616h = new float[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f3620l.add(list.get(i4).a());
        }
        bVar.i(this.f3619k);
        bVar.i(this.f3618j);
        for (int i5 = 0; i5 < this.f3620l.size(); i5++) {
            bVar.i(this.f3620l.get(i5));
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = this.f3621m;
        if (aVar2 != null) {
            bVar.i(aVar2);
        }
        this.f3619k.a(this);
        this.f3618j.a(this);
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.f3620l.get(i6).a(this);
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar3 = this.f3621m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.v() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = bVar.v().a().a();
            this.f3623o = a5;
            a5.a(this);
            bVar.i(this.f3623o);
        }
        if (bVar.x() != null) {
            this.f3625q = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.x());
        }
    }

    private void g(Matrix matrix) {
        com.airbnb.lottie.e.a("StrokeContent#applyDashPattern");
        if (this.f3620l.isEmpty()) {
            com.airbnb.lottie.e.b("StrokeContent#applyDashPattern");
            return;
        }
        float g4 = com.airbnb.lottie.utils.h.g(matrix);
        for (int i4 = 0; i4 < this.f3620l.size(); i4++) {
            this.f3616h[i4] = this.f3620l.get(i4).h().floatValue();
            if (i4 % 2 == 0) {
                float[] fArr = this.f3616h;
                if (fArr[i4] < 1.0f) {
                    fArr[i4] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f3616h;
                if (fArr2[i4] < 0.1f) {
                    fArr2[i4] = 0.1f;
                }
            }
            float[] fArr3 = this.f3616h;
            fArr3[i4] = fArr3[i4] * g4;
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f3621m;
        this.f3617i.setPathEffect(new DashPathEffect(this.f3616h, aVar == null ? 0.0f : g4 * aVar.h().floatValue()));
        com.airbnb.lottie.e.b("StrokeContent#applyDashPattern");
    }

    private void i(Canvas canvas, b bVar, Matrix matrix) {
        com.airbnb.lottie.e.a("StrokeContent#applyTrimPath");
        if (bVar.f3627b == null) {
            com.airbnb.lottie.e.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f3610b.reset();
        for (int size = bVar.f3626a.size() - 1; size >= 0; size--) {
            this.f3610b.addPath(((n) bVar.f3626a.get(size)).getPath(), matrix);
        }
        float floatValue = bVar.f3627b.i().h().floatValue() / 100.0f;
        float floatValue2 = bVar.f3627b.e().h().floatValue() / 100.0f;
        float floatValue3 = bVar.f3627b.g().h().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.f3610b, this.f3617i);
            com.airbnb.lottie.e.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f3609a.setPath(this.f3610b, false);
        float length = this.f3609a.getLength();
        while (this.f3609a.nextContour()) {
            length += this.f3609a.getLength();
        }
        float f5 = floatValue3 * length;
        float f6 = (floatValue * length) + f5;
        float min = Math.min((floatValue2 * length) + f5, (f6 + length) - 1.0f);
        float f7 = 0.0f;
        for (int size2 = bVar.f3626a.size() - 1; size2 >= 0; size2--) {
            this.f3611c.set(((n) bVar.f3626a.get(size2)).getPath());
            this.f3611c.transform(matrix);
            this.f3609a.setPath(this.f3611c, false);
            float length2 = this.f3609a.getLength();
            if (min > length) {
                float f8 = min - length;
                if (f8 < f7 + length2 && f7 < f8) {
                    com.airbnb.lottie.utils.h.a(this.f3611c, f6 > length ? (f6 - length) / length2 : 0.0f, Math.min(f8 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f3611c, this.f3617i);
                    f7 += length2;
                }
            }
            float f9 = f7 + length2;
            if (f9 >= f6 && f7 <= min) {
                if (f9 <= min && f6 < f7) {
                    canvas.drawPath(this.f3611c, this.f3617i);
                } else {
                    com.airbnb.lottie.utils.h.a(this.f3611c, f6 < f7 ? 0.0f : (f6 - f7) / length2, min > f9 ? 1.0f : (min - f7) / length2, 0.0f);
                    canvas.drawPath(this.f3611c, this.f3617i);
                }
            }
            f7 += length2;
        }
        com.airbnb.lottie.e.b("StrokeContent#applyTrimPath");
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f3613e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        v vVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof v) {
                v vVar2 = (v) cVar;
                if (vVar2.getType() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    vVar = vVar2;
                }
            }
        }
        if (vVar != null) {
            vVar.d(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof v) {
                v vVar3 = (v) cVar2;
                if (vVar3.getType() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f3615g.add(bVar);
                    }
                    bVar = new b(vVar3);
                    vVar3.d(this);
                }
            }
            if (cVar2 instanceof n) {
                if (bVar == null) {
                    bVar = new b(vVar);
                }
                bVar.f3626a.add((n) cVar2);
            }
        }
        if (bVar != null) {
            this.f3615g.add(bVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    @CallSuper
    public <T> void d(T t4, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t4 == s0.f4272d) {
            this.f3619k.n(jVar);
        } else if (t4 == s0.f4287s) {
            this.f3618j.n(jVar);
        } else if (t4 == s0.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f3622n;
            if (aVar != null) {
                this.f3614f.G(aVar);
            }
            if (jVar == null) {
                this.f3622n = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f3622n = qVar;
            qVar.a(this);
            this.f3614f.i(this.f3622n);
        } else if (t4 == s0.f4278j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f3623o;
            if (aVar2 != null) {
                aVar2.n(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f3623o = qVar2;
            qVar2.a(this);
            this.f3614f.i(this.f3623o);
        } else if (t4 == s0.f4273e && (cVar5 = this.f3625q) != null) {
            cVar5.c(jVar);
        } else if (t4 == s0.G && (cVar4 = this.f3625q) != null) {
            cVar4.f(jVar);
        } else if (t4 == s0.H && (cVar3 = this.f3625q) != null) {
            cVar3.d(jVar);
        } else if (t4 == s0.I && (cVar2 = this.f3625q) != null) {
            cVar2.e(jVar);
        } else if (t4 != s0.J || (cVar = this.f3625q) == null) {
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
        com.airbnb.lottie.e.a("StrokeContent#getBounds");
        this.f3610b.reset();
        for (int i4 = 0; i4 < this.f3615g.size(); i4++) {
            b bVar = this.f3615g.get(i4);
            for (int i5 = 0; i5 < bVar.f3626a.size(); i5++) {
                this.f3610b.addPath(((n) bVar.f3626a.get(i5)).getPath(), matrix);
            }
        }
        this.f3610b.computeBounds(this.f3612d, false);
        float p4 = ((com.airbnb.lottie.animation.keyframe.d) this.f3618j).p();
        RectF rectF2 = this.f3612d;
        float f5 = p4 / 2.0f;
        rectF2.set(rectF2.left - f5, rectF2.top - f5, rectF2.right + f5, rectF2.bottom + f5);
        rectF.set(this.f3612d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.e.b("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        com.airbnb.lottie.e.a("StrokeContent#draw");
        if (com.airbnb.lottie.utils.h.h(matrix)) {
            com.airbnb.lottie.e.b("StrokeContent#draw");
            return;
        }
        this.f3617i.setAlpha(com.airbnb.lottie.utils.g.d((int) ((((i4 / 255.0f) * ((com.airbnb.lottie.animation.keyframe.f) this.f3619k).p()) / 100.0f) * 255.0f), 0, 255));
        this.f3617i.setStrokeWidth(((com.airbnb.lottie.animation.keyframe.d) this.f3618j).p() * com.airbnb.lottie.utils.h.g(matrix));
        if (this.f3617i.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.e.b("StrokeContent#draw");
            return;
        }
        g(matrix);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f3622n;
        if (aVar != null) {
            this.f3617i.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f3623o;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f3617i.setMaskFilter(null);
            } else if (floatValue != this.f3624p) {
                this.f3617i.setMaskFilter(this.f3614f.w(floatValue));
            }
            this.f3624p = floatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f3625q;
        if (cVar != null) {
            cVar.b(this.f3617i);
        }
        for (int i5 = 0; i5 < this.f3615g.size(); i5++) {
            b bVar = this.f3615g.get(i5);
            if (bVar.f3627b != null) {
                i(canvas, bVar, matrix);
            } else {
                com.airbnb.lottie.e.a("StrokeContent#buildPath");
                this.f3610b.reset();
                for (int size = bVar.f3626a.size() - 1; size >= 0; size--) {
                    this.f3610b.addPath(((n) bVar.f3626a.get(size)).getPath(), matrix);
                }
                com.airbnb.lottie.e.b("StrokeContent#buildPath");
                com.airbnb.lottie.e.a("StrokeContent#drawPath");
                canvas.drawPath(this.f3610b, this.f3617i);
                com.airbnb.lottie.e.b("StrokeContent#drawPath");
            }
        }
        com.airbnb.lottie.e.b("StrokeContent#draw");
    }
}

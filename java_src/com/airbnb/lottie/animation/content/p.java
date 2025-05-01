package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.s0;
import java.util.List;
/* compiled from: RectangleContent.java */
/* loaded from: classes2.dex */
public class p implements a.b, k, n {

    /* renamed from: c  reason: collision with root package name */
    private final String f3720c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3721d;

    /* renamed from: e  reason: collision with root package name */
    private final LottieDrawable f3722e;

    /* renamed from: f  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f3723f;

    /* renamed from: g  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f3724g;

    /* renamed from: h  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f3725h;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3728k;

    /* renamed from: a  reason: collision with root package name */
    private final Path f3718a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final RectF f3719b = new RectF();

    /* renamed from: i  reason: collision with root package name */
    private final b f3726i = new b();
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f3727j = null;

    public p(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.g gVar) {
        this.f3720c = gVar.c();
        this.f3721d = gVar.f();
        this.f3722e = lottieDrawable;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a5 = gVar.d().a();
        this.f3723f = a5;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a6 = gVar.e().a();
        this.f3724g = a6;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a7 = gVar.b().a();
        this.f3725h = a7;
        bVar.i(a5);
        bVar.i(a6);
        bVar.i(a7);
        a5.a(this);
        a6.a(this);
        a7.a(this);
    }

    private void g() {
        this.f3728k = false;
        this.f3722e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        g();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            c cVar = list.get(i4);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.getType() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f3726i.a(vVar);
                    vVar.d(this);
                }
            }
            if (cVar instanceof r) {
                this.f3727j = ((r) cVar).g();
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void d(T t4, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        if (t4 == s0.f4280l) {
            this.f3724g.n(jVar);
        } else if (t4 == s0.f4282n) {
            this.f3723f.n(jVar);
        } else if (t4 == s0.f4281m) {
            this.f3725h.n(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void e(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.g.m(dVar, i4, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f3720c;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar;
        if (this.f3728k) {
            return this.f3718a;
        }
        this.f3718a.reset();
        if (this.f3721d) {
            this.f3728k = true;
            return this.f3718a;
        }
        PointF h4 = this.f3724g.h();
        float f5 = h4.x / 2.0f;
        float f6 = h4.y / 2.0f;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = this.f3725h;
        float p4 = aVar2 == null ? 0.0f : ((com.airbnb.lottie.animation.keyframe.d) aVar2).p();
        if (p4 == 0.0f && (aVar = this.f3727j) != null) {
            p4 = Math.min(aVar.h().floatValue(), Math.min(f5, f6));
        }
        float min = Math.min(f5, f6);
        if (p4 > min) {
            p4 = min;
        }
        PointF h5 = this.f3723f.h();
        this.f3718a.moveTo(h5.x + f5, (h5.y - f6) + p4);
        this.f3718a.lineTo(h5.x + f5, (h5.y + f6) - p4);
        if (p4 > 0.0f) {
            RectF rectF = this.f3719b;
            float f7 = h5.x;
            float f8 = p4 * 2.0f;
            float f9 = h5.y;
            rectF.set((f7 + f5) - f8, (f9 + f6) - f8, f7 + f5, f9 + f6);
            this.f3718a.arcTo(this.f3719b, 0.0f, 90.0f, false);
        }
        this.f3718a.lineTo((h5.x - f5) + p4, h5.y + f6);
        if (p4 > 0.0f) {
            RectF rectF2 = this.f3719b;
            float f10 = h5.x;
            float f11 = h5.y;
            float f12 = p4 * 2.0f;
            rectF2.set(f10 - f5, (f11 + f6) - f12, (f10 - f5) + f12, f11 + f6);
            this.f3718a.arcTo(this.f3719b, 90.0f, 90.0f, false);
        }
        this.f3718a.lineTo(h5.x - f5, (h5.y - f6) + p4);
        if (p4 > 0.0f) {
            RectF rectF3 = this.f3719b;
            float f13 = h5.x;
            float f14 = h5.y;
            float f15 = p4 * 2.0f;
            rectF3.set(f13 - f5, f14 - f6, (f13 - f5) + f15, (f14 - f6) + f15);
            this.f3718a.arcTo(this.f3719b, 180.0f, 90.0f, false);
        }
        this.f3718a.lineTo((h5.x + f5) - p4, h5.y - f6);
        if (p4 > 0.0f) {
            RectF rectF4 = this.f3719b;
            float f16 = h5.x;
            float f17 = p4 * 2.0f;
            float f18 = h5.y;
            rectF4.set((f16 + f5) - f17, f18 - f6, f16 + f5, (f18 - f6) + f17);
            this.f3718a.arcTo(this.f3719b, 270.0f, 90.0f, false);
        }
        this.f3718a.close();
        this.f3726i.b(this.f3718a);
        this.f3728k = true;
        return this.f3718a;
    }
}

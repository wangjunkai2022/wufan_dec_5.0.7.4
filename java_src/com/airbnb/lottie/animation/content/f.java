package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.s0;
import java.util.List;
/* compiled from: EllipseContent.java */
/* loaded from: classes2.dex */
public class f implements n, a.b, k {

    /* renamed from: i  reason: collision with root package name */
    private static final float f3640i = 0.55228f;

    /* renamed from: b  reason: collision with root package name */
    private final String f3642b;

    /* renamed from: c  reason: collision with root package name */
    private final LottieDrawable f3643c;

    /* renamed from: d  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f3644d;

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f3645e;

    /* renamed from: f  reason: collision with root package name */
    private final com.airbnb.lottie.model.content.b f3646f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3648h;

    /* renamed from: a  reason: collision with root package name */
    private final Path f3641a = new Path();

    /* renamed from: g  reason: collision with root package name */
    private final b f3647g = new b();

    public f(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.b bVar2) {
        this.f3642b = bVar2.b();
        this.f3643c = lottieDrawable;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a5 = bVar2.d().a();
        this.f3644d = a5;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a6 = bVar2.c().a();
        this.f3645e = a6;
        this.f3646f = bVar2;
        bVar.i(a5);
        bVar.i(a6);
        a5.a(this);
        a6.a(this);
    }

    private void g() {
        this.f3648h = false;
        this.f3643c.invalidateSelf();
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
                    this.f3647g.a(vVar);
                    vVar.d(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void d(T t4, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        if (t4 == s0.f4279k) {
            this.f3644d.n(jVar);
        } else if (t4 == s0.f4282n) {
            this.f3645e.n(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void e(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.g.m(dVar, i4, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f3642b;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        if (this.f3648h) {
            return this.f3641a;
        }
        this.f3641a.reset();
        if (this.f3646f.e()) {
            this.f3648h = true;
            return this.f3641a;
        }
        PointF h4 = this.f3644d.h();
        float f5 = h4.x / 2.0f;
        float f6 = h4.y / 2.0f;
        float f7 = f5 * f3640i;
        float f8 = f3640i * f6;
        this.f3641a.reset();
        if (this.f3646f.f()) {
            float f9 = -f6;
            this.f3641a.moveTo(0.0f, f9);
            float f10 = 0.0f - f7;
            float f11 = -f5;
            float f12 = 0.0f - f8;
            this.f3641a.cubicTo(f10, f9, f11, f12, f11, 0.0f);
            float f13 = f8 + 0.0f;
            this.f3641a.cubicTo(f11, f13, f10, f6, 0.0f, f6);
            float f14 = f7 + 0.0f;
            this.f3641a.cubicTo(f14, f6, f5, f13, f5, 0.0f);
            this.f3641a.cubicTo(f5, f12, f14, f9, 0.0f, f9);
        } else {
            float f15 = -f6;
            this.f3641a.moveTo(0.0f, f15);
            float f16 = f7 + 0.0f;
            float f17 = 0.0f - f8;
            this.f3641a.cubicTo(f16, f15, f5, f17, f5, 0.0f);
            float f18 = f8 + 0.0f;
            this.f3641a.cubicTo(f5, f18, f16, f6, 0.0f, f6);
            float f19 = 0.0f - f7;
            float f20 = -f5;
            this.f3641a.cubicTo(f19, f6, f20, f18, f20, 0.0f);
            this.f3641a.cubicTo(f20, f17, f19, f15, 0.0f, f15);
        }
        PointF h5 = this.f3645e.h();
        this.f3641a.offset(h5.x, h5.y);
        this.f3641a.close();
        this.f3647g.b(this.f3641a);
        this.f3648h = true;
        return this.f3641a;
    }
}

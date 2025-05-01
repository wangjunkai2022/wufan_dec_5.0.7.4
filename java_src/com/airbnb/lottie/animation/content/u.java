package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.s0;
/* compiled from: StrokeContent.java */
/* loaded from: classes2.dex */
public class u extends a {

    /* renamed from: r  reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f3752r;

    /* renamed from: s  reason: collision with root package name */
    private final String f3753s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f3754t;

    /* renamed from: u  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f3755u;
    @Nullable

    /* renamed from: v  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f3756v;

    public u(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, ShapeStroke shapeStroke) {
        super(lottieDrawable, bVar, shapeStroke.b().toPaintCap(), shapeStroke.e().toPaintJoin(), shapeStroke.g(), shapeStroke.i(), shapeStroke.j(), shapeStroke.f(), shapeStroke.d());
        this.f3752r = bVar;
        this.f3753s = shapeStroke.h();
        this.f3754t = shapeStroke.k();
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a5 = shapeStroke.c().a();
        this.f3755u = a5;
        a5.a(this);
        bVar.i(a5);
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.model.e
    public <T> void d(T t4, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        super.d(t4, jVar);
        if (t4 == s0.f4270b) {
            this.f3755u.n(jVar);
        } else if (t4 == s0.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f3756v;
            if (aVar != null) {
                this.f3752r.G(aVar);
            }
            if (jVar == null) {
                this.f3756v = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f3756v = qVar;
            qVar.a(this);
            this.f3752r.i(this.f3755u);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f3753s;
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        if (this.f3754t) {
            return;
        }
        this.f3617i.setColor(((com.airbnb.lottie.animation.keyframe.b) this.f3755u).p());
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f3756v;
        if (aVar != null) {
            this.f3617i.setColorFilter(aVar.h());
        }
        super.h(canvas, matrix, i4);
    }
}

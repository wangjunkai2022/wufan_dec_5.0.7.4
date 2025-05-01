package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
/* compiled from: RepeaterContent.java */
/* loaded from: classes2.dex */
public class q implements e, n, j, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f3729a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final Path f3730b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final LottieDrawable f3731c;

    /* renamed from: d  reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f3732d;

    /* renamed from: e  reason: collision with root package name */
    private final String f3733e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3734f;

    /* renamed from: g  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f3735g;

    /* renamed from: h  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f3736h;

    /* renamed from: i  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.p f3737i;

    /* renamed from: j  reason: collision with root package name */
    private d f3738j;

    public q(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.h hVar) {
        this.f3731c = lottieDrawable;
        this.f3732d = bVar;
        this.f3733e = hVar.c();
        this.f3734f = hVar.f();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = hVar.b().a();
        this.f3735g = a5;
        bVar.i(a5);
        a5.a(this);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a6 = hVar.d().a();
        this.f3736h = a6;
        bVar.i(a6);
        a6.a(this);
        com.airbnb.lottie.animation.keyframe.p b5 = hVar.e().b();
        this.f3737i = b5;
        b5.a(bVar);
        b5.b(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f3731c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        this.f3738j.b(list, list2);
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void d(T t4, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        if (this.f3737i.c(t4, jVar)) {
            return;
        }
        if (t4 == s0.f4289u) {
            this.f3735g.n(jVar);
        } else if (t4 == s0.f4290v) {
            this.f3736h.n(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void e(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.g.m(dVar, i4, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        this.f3738j.f(rectF, matrix, z4);
    }

    @Override // com.airbnb.lottie.animation.content.j
    public void g(ListIterator<c> listIterator) {
        if (this.f3738j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f3738j = new d(this.f3731c, this.f3732d, "Repeater", this.f3734f, arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f3733e;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        Path path = this.f3738j.getPath();
        this.f3730b.reset();
        float floatValue = this.f3735g.h().floatValue();
        float floatValue2 = this.f3736h.h().floatValue();
        for (int i4 = ((int) floatValue) - 1; i4 >= 0; i4--) {
            this.f3729a.set(this.f3737i.g(i4 + floatValue2));
            this.f3730b.addPath(path, this.f3729a);
        }
        return this.f3730b;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        float floatValue = this.f3735g.h().floatValue();
        float floatValue2 = this.f3736h.h().floatValue();
        float floatValue3 = this.f3737i.i().h().floatValue() / 100.0f;
        float floatValue4 = this.f3737i.e().h().floatValue() / 100.0f;
        for (int i5 = ((int) floatValue) - 1; i5 >= 0; i5--) {
            this.f3729a.set(matrix);
            float f5 = i5;
            this.f3729a.preConcat(this.f3737i.g(f5 + floatValue2));
            this.f3738j.h(canvas, this.f3729a, (int) (i4 * com.airbnb.lottie.utils.g.k(floatValue3, floatValue4, f5 / floatValue)));
        }
    }
}

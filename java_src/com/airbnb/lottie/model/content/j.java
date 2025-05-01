package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShapeData.java */
/* loaded from: classes2.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.airbnb.lottie.model.a> f4026a;

    /* renamed from: b  reason: collision with root package name */
    private PointF f4027b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4028c;

    public j(PointF pointF, boolean z4, List<com.airbnb.lottie.model.a> list) {
        this.f4027b = pointF;
        this.f4028c = z4;
        this.f4026a = new ArrayList(list);
    }

    public List<com.airbnb.lottie.model.a> a() {
        return this.f4026a;
    }

    public PointF b() {
        return this.f4027b;
    }

    public void c(j jVar, j jVar2, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        if (this.f4027b == null) {
            this.f4027b = new PointF();
        }
        this.f4028c = jVar.d() || jVar2.d();
        if (jVar.a().size() != jVar2.a().size()) {
            com.airbnb.lottie.utils.d.e("Curves must have the same number of control points. Shape 1: " + jVar.a().size() + "\tShape 2: " + jVar2.a().size());
        }
        int min = Math.min(jVar.a().size(), jVar2.a().size());
        if (this.f4026a.size() < min) {
            for (int size = this.f4026a.size(); size < min; size++) {
                this.f4026a.add(new com.airbnb.lottie.model.a());
            }
        } else if (this.f4026a.size() > min) {
            for (int size2 = this.f4026a.size() - 1; size2 >= min; size2--) {
                List<com.airbnb.lottie.model.a> list = this.f4026a;
                list.remove(list.size() - 1);
            }
        }
        PointF b5 = jVar.b();
        PointF b6 = jVar2.b();
        f(com.airbnb.lottie.utils.g.k(b5.x, b6.x, f5), com.airbnb.lottie.utils.g.k(b5.y, b6.y, f5));
        for (int size3 = this.f4026a.size() - 1; size3 >= 0; size3--) {
            com.airbnb.lottie.model.a aVar = jVar.a().get(size3);
            com.airbnb.lottie.model.a aVar2 = jVar2.a().get(size3);
            PointF a5 = aVar.a();
            PointF b7 = aVar.b();
            PointF c5 = aVar.c();
            PointF a6 = aVar2.a();
            PointF b8 = aVar2.b();
            PointF c6 = aVar2.c();
            this.f4026a.get(size3).d(com.airbnb.lottie.utils.g.k(a5.x, a6.x, f5), com.airbnb.lottie.utils.g.k(a5.y, a6.y, f5));
            this.f4026a.get(size3).e(com.airbnb.lottie.utils.g.k(b7.x, b8.x, f5), com.airbnb.lottie.utils.g.k(b7.y, b8.y, f5));
            this.f4026a.get(size3).g(com.airbnb.lottie.utils.g.k(c5.x, c6.x, f5), com.airbnb.lottie.utils.g.k(c5.y, c6.y, f5));
        }
    }

    public boolean d() {
        return this.f4028c;
    }

    public void e(boolean z4) {
        this.f4028c = z4;
    }

    public void f(float f5, float f6) {
        if (this.f4027b == null) {
            this.f4027b = new PointF();
        }
        this.f4027b.set(f5, f6);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f4026a.size() + "closed=" + this.f4028c + '}';
    }

    public j() {
        this.f4026a = new ArrayList();
    }
}

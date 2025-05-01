package com.airbnb.lottie.animation.content;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RoundedCornersContent.java */
/* loaded from: classes2.dex */
public class r implements t, a.b {

    /* renamed from: e  reason: collision with root package name */
    private static final float f3739e = 0.5519f;

    /* renamed from: a  reason: collision with root package name */
    private final LottieDrawable f3740a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3741b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f3742c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private com.airbnb.lottie.model.content.j f3743d;

    public r(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.i iVar) {
        this.f3740a = lottieDrawable;
        this.f3741b = iVar.c();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = iVar.b().a();
        this.f3742c = a5;
        bVar.i(a5);
        a5.a(this);
    }

    private static int d(int i4, int i5) {
        int i6 = i4 / i5;
        return ((i4 ^ i5) >= 0 || i5 * i6 == i4) ? i6 : i6 - 1;
    }

    private static int e(int i4, int i5) {
        return i4 - (d(i4, i5) * i5);
    }

    @NonNull
    private com.airbnb.lottie.model.content.j i(com.airbnb.lottie.model.content.j jVar) {
        List<com.airbnb.lottie.model.a> a5 = jVar.a();
        boolean d5 = jVar.d();
        int size = a5.size() - 1;
        int i4 = 0;
        while (size >= 0) {
            com.airbnb.lottie.model.a aVar = a5.get(size);
            com.airbnb.lottie.model.a aVar2 = a5.get(e(size - 1, a5.size()));
            PointF c5 = (size != 0 || d5) ? aVar2.c() : jVar.b();
            i4 = (((size != 0 || d5) ? aVar2.b() : c5).equals(c5) && aVar.a().equals(c5) && !(!jVar.d() && size == 0 && size == a5.size() - 1)) ? i4 + 2 : i4 + 1;
            size--;
        }
        com.airbnb.lottie.model.content.j jVar2 = this.f3743d;
        if (jVar2 == null || jVar2.a().size() != i4) {
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(new com.airbnb.lottie.model.a());
            }
            this.f3743d = new com.airbnb.lottie.model.content.j(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f3743d.e(d5);
        return this.f3743d;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f3740a.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
    }

    @Override // com.airbnb.lottie.animation.content.t
    public com.airbnb.lottie.model.content.j c(com.airbnb.lottie.model.content.j jVar) {
        List<com.airbnb.lottie.model.a> list;
        List<com.airbnb.lottie.model.a> a5 = jVar.a();
        if (a5.size() <= 2) {
            return jVar;
        }
        float floatValue = this.f3742c.h().floatValue();
        if (floatValue == 0.0f) {
            return jVar;
        }
        com.airbnb.lottie.model.content.j i4 = i(jVar);
        i4.f(jVar.b().x, jVar.b().y);
        List<com.airbnb.lottie.model.a> a6 = i4.a();
        boolean d5 = jVar.d();
        int i5 = 0;
        int i6 = 0;
        while (i5 < a5.size()) {
            com.airbnb.lottie.model.a aVar = a5.get(i5);
            com.airbnb.lottie.model.a aVar2 = a5.get(e(i5 - 1, a5.size()));
            com.airbnb.lottie.model.a aVar3 = a5.get(e(i5 - 2, a5.size()));
            PointF c5 = (i5 != 0 || d5) ? aVar2.c() : jVar.b();
            PointF b5 = (i5 != 0 || d5) ? aVar2.b() : c5;
            PointF a7 = aVar.a();
            PointF c6 = aVar3.c();
            PointF c7 = aVar.c();
            boolean z4 = !jVar.d() && i5 == 0 && i5 == a5.size() + (-1);
            if (b5.equals(c5) && a7.equals(c5) && !z4) {
                float f5 = c5.x;
                float f6 = f5 - c6.x;
                float f7 = c5.y;
                float f8 = c7.x - f5;
                list = a5;
                float min = Math.min(floatValue / ((float) Math.hypot(f6, f7 - c6.y)), 0.5f);
                float min2 = Math.min(floatValue / ((float) Math.hypot(f8, c7.y - f7)), 0.5f);
                float f9 = c5.x;
                float f10 = ((c6.x - f9) * min) + f9;
                float f11 = c5.y;
                float f12 = ((c6.y - f11) * min) + f11;
                float f13 = ((c7.x - f9) * min2) + f9;
                float f14 = ((c7.y - f11) * min2) + f11;
                float f15 = f10 - ((f10 - f9) * f3739e);
                float f16 = f12 - ((f12 - f11) * f3739e);
                float f17 = f13 - ((f13 - f9) * f3739e);
                float f18 = f14 - ((f14 - f11) * f3739e);
                com.airbnb.lottie.model.a aVar4 = a6.get(e(i6 - 1, a6.size()));
                com.airbnb.lottie.model.a aVar5 = a6.get(i6);
                aVar4.e(f10, f12);
                aVar4.g(f10, f12);
                if (i5 == 0) {
                    i4.f(f10, f12);
                }
                aVar5.d(f15, f16);
                i6++;
                aVar5.e(f17, f18);
                aVar5.g(f13, f14);
                a6.get(i6).d(f13, f14);
            } else {
                list = a5;
                com.airbnb.lottie.model.a aVar6 = a6.get(e(i6 - 1, a6.size()));
                aVar6.e(aVar2.c().x, aVar2.c().y);
                aVar6.g(aVar2.c().x, aVar2.c().y);
                a6.get(i6).d(aVar.c().x, aVar.c().y);
            }
            i6++;
            i5++;
            a5 = list;
        }
        return i4;
    }

    public com.airbnb.lottie.animation.keyframe.a<Float, Float> g() {
        return this.f3742c;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f3741b;
    }
}

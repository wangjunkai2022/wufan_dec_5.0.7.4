package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShapeContent.java */
/* loaded from: classes2.dex */
public class s implements n, a.b {

    /* renamed from: b  reason: collision with root package name */
    private final String f3745b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3746c;

    /* renamed from: d  reason: collision with root package name */
    private final LottieDrawable f3747d;

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.m f3748e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private List<t> f3749f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3750g;

    /* renamed from: a  reason: collision with root package name */
    private final Path f3744a = new Path();

    /* renamed from: h  reason: collision with root package name */
    private final b f3751h = new b();

    public s(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.m mVar) {
        this.f3745b = mVar.b();
        this.f3746c = mVar.d();
        this.f3747d = lottieDrawable;
        com.airbnb.lottie.animation.keyframe.m a5 = mVar.c().a();
        this.f3748e = a5;
        bVar.i(a5);
        a5.a(this);
    }

    private void d() {
        this.f3750g = false;
        this.f3747d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        d();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < list.size(); i4++) {
            c cVar = list.get(i4);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.getType() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f3751h.a(vVar);
                    vVar.d(this);
                }
            }
            if (cVar instanceof t) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((t) cVar);
            }
        }
        this.f3748e.q(arrayList);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f3745b;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        if (this.f3750g) {
            return this.f3744a;
        }
        this.f3744a.reset();
        if (this.f3746c) {
            this.f3750g = true;
            return this.f3744a;
        }
        Path h4 = this.f3748e.h();
        if (h4 == null) {
            return this.f3744a;
        }
        this.f3744a.set(h4);
        this.f3744a.setFillType(Path.FillType.EVEN_ODD);
        this.f3751h.b(this.f3744a);
        this.f3750g = true;
        return this.f3744a;
    }
}

package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ContentGroup.java */
/* loaded from: classes2.dex */
public class d implements e, n, a.b, com.airbnb.lottie.model.e {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f3629a;

    /* renamed from: b  reason: collision with root package name */
    private final RectF f3630b;

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f3631c;

    /* renamed from: d  reason: collision with root package name */
    private final Path f3632d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f3633e;

    /* renamed from: f  reason: collision with root package name */
    private final String f3634f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f3635g;

    /* renamed from: h  reason: collision with root package name */
    private final List<c> f3636h;

    /* renamed from: i  reason: collision with root package name */
    private final LottieDrawable f3637i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private List<n> f3638j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.p f3639k;

    public d(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.l lVar) {
        this(lottieDrawable, bVar, lVar.c(), lVar.d(), g(lottieDrawable, bVar, lVar.b()), i(lVar.b()));
    }

    private static List<c> g(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, List<com.airbnb.lottie.model.content.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            c a5 = list.get(i4).a(lottieDrawable, bVar);
            if (a5 != null) {
                arrayList.add(a5);
            }
        }
        return arrayList;
    }

    @Nullable
    static com.airbnb.lottie.model.animatable.l i(List<com.airbnb.lottie.model.content.c> list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            com.airbnb.lottie.model.content.c cVar = list.get(i4);
            if (cVar instanceof com.airbnb.lottie.model.animatable.l) {
                return (com.airbnb.lottie.model.animatable.l) cVar;
            }
        }
        return null;
    }

    private boolean l() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.f3636h.size(); i5++) {
            if ((this.f3636h.get(i5) instanceof e) && (i4 = i4 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f3637i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f3636h.size());
        arrayList.addAll(list);
        for (int size = this.f3636h.size() - 1; size >= 0; size--) {
            c cVar = this.f3636h.get(size);
            cVar.b(arrayList, this.f3636h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void d(T t4, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.p pVar = this.f3639k;
        if (pVar != null) {
            pVar.c(t4, jVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void e(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        if (dVar.h(getName(), i4) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                dVar2 = dVar2.a(getName());
                if (dVar.c(getName(), i4)) {
                    list.add(dVar2.j(this));
                }
            }
            if (dVar.i(getName(), i4)) {
                int e5 = i4 + dVar.e(getName(), i4);
                for (int i5 = 0; i5 < this.f3636h.size(); i5++) {
                    c cVar = this.f3636h.get(i5);
                    if (cVar instanceof com.airbnb.lottie.model.e) {
                        ((com.airbnb.lottie.model.e) cVar).e(dVar, e5, list, dVar2);
                    }
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        this.f3631c.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.f3639k;
        if (pVar != null) {
            this.f3631c.preConcat(pVar.f());
        }
        this.f3633e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f3636h.size() - 1; size >= 0; size--) {
            c cVar = this.f3636h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).f(this.f3633e, this.f3631c, z4);
                rectF.union(this.f3633e);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f3634f;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        this.f3631c.reset();
        com.airbnb.lottie.animation.keyframe.p pVar = this.f3639k;
        if (pVar != null) {
            this.f3631c.set(pVar.f());
        }
        this.f3632d.reset();
        if (this.f3635g) {
            return this.f3632d;
        }
        for (int size = this.f3636h.size() - 1; size >= 0; size--) {
            c cVar = this.f3636h.get(size);
            if (cVar instanceof n) {
                this.f3632d.addPath(((n) cVar).getPath(), this.f3631c);
            }
        }
        return this.f3632d;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        if (this.f3635g) {
            return;
        }
        this.f3631c.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.f3639k;
        if (pVar != null) {
            this.f3631c.preConcat(pVar.f());
            i4 = (int) (((((this.f3639k.h() == null ? 100 : this.f3639k.h().h().intValue()) / 100.0f) * i4) / 255.0f) * 255.0f);
        }
        boolean z4 = this.f3637i.k0() && l() && i4 != 255;
        if (z4) {
            this.f3630b.set(0.0f, 0.0f, 0.0f, 0.0f);
            f(this.f3630b, this.f3631c, true);
            this.f3629a.setAlpha(i4);
            com.airbnb.lottie.utils.h.n(canvas, this.f3630b, this.f3629a);
        }
        if (z4) {
            i4 = 255;
        }
        for (int size = this.f3636h.size() - 1; size >= 0; size--) {
            c cVar = this.f3636h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).h(canvas, this.f3631c, i4);
            }
        }
        if (z4) {
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<n> j() {
        if (this.f3638j == null) {
            this.f3638j = new ArrayList();
            for (int i4 = 0; i4 < this.f3636h.size(); i4++) {
                c cVar = this.f3636h.get(i4);
                if (cVar instanceof n) {
                    this.f3638j.add((n) cVar);
                }
            }
        }
        return this.f3638j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Matrix k() {
        com.airbnb.lottie.animation.keyframe.p pVar = this.f3639k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f3631c.reset();
        return this.f3631c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, String str, boolean z4, List<c> list, @Nullable com.airbnb.lottie.model.animatable.l lVar) {
        this.f3629a = new com.airbnb.lottie.animation.a();
        this.f3630b = new RectF();
        this.f3631c = new Matrix();
        this.f3632d = new Path();
        this.f3633e = new RectF();
        this.f3634f = str;
        this.f3637i = lottieDrawable;
        this.f3635g = z4;
        this.f3636h = list;
        if (lVar != null) {
            com.airbnb.lottie.animation.keyframe.p b5 = lVar.b();
            this.f3639k = b5;
            b5.a(bVar);
            this.f3639k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).g(list.listIterator(list.size()));
        }
    }
}

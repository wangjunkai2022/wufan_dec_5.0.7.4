package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.drawee.drawable.g;
import com.facebook.drawee.drawable.h;
import com.facebook.drawee.drawable.i;
import com.facebook.drawee.drawable.q;
import com.facebook.drawee.drawable.r;
import javax.annotation.Nullable;
/* compiled from: GenericDraweeHierarchy.java */
/* loaded from: classes.dex */
public class a implements o0.c {

    /* renamed from: g  reason: collision with root package name */
    private static final int f11320g = 0;

    /* renamed from: h  reason: collision with root package name */
    private static final int f11321h = 1;

    /* renamed from: i  reason: collision with root package name */
    private static final int f11322i = 2;

    /* renamed from: j  reason: collision with root package name */
    private static final int f11323j = 3;

    /* renamed from: k  reason: collision with root package name */
    private static final int f11324k = 4;

    /* renamed from: l  reason: collision with root package name */
    private static final int f11325l = 5;

    /* renamed from: m  reason: collision with root package name */
    private static final int f11326m = 6;

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f11327a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f11328b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private RoundingParams f11329c;

    /* renamed from: d  reason: collision with root package name */
    private final d f11330d;

    /* renamed from: e  reason: collision with root package name */
    private final g f11331e;

    /* renamed from: f  reason: collision with root package name */
    private final h f11332f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar) {
        int i4 = 0;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f11327a = colorDrawable;
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("GenericDraweeHierarchy()");
        }
        this.f11328b = bVar.getResources();
        this.f11329c = bVar.r();
        h hVar = new h(colorDrawable);
        this.f11332f = hVar;
        int i5 = 1;
        int size = (bVar.j() != null ? bVar.j().size() : 1) + (bVar.m() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[size + 6];
        drawableArr[0] = g(bVar.e(), null);
        drawableArr[1] = g(bVar.k(), bVar.l());
        drawableArr[2] = f(hVar, bVar.d(), bVar.c(), bVar.b());
        drawableArr[3] = g(bVar.n(), bVar.o());
        drawableArr[4] = g(bVar.p(), bVar.q());
        drawableArr[5] = g(bVar.h(), bVar.i());
        if (size > 0) {
            if (bVar.j() != null) {
                for (Drawable drawable : bVar.j()) {
                    drawableArr[i4 + 6] = g(drawable, null);
                    i4++;
                }
                i5 = i4;
            }
            if (bVar.m() != null) {
                drawableArr[i5 + 6] = g(bVar.m(), null);
            }
        }
        g gVar = new g(drawableArr);
        this.f11331e = gVar;
        gVar.y(bVar.g());
        d dVar = new d(e.f(gVar, this.f11329c));
        this.f11330d = dVar;
        dVar.mutate();
        u();
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    private void M(float f5) {
        Drawable b5 = this.f11331e.b(3);
        if (b5 == null) {
            return;
        }
        if (f5 >= 0.999f) {
            if (b5 instanceof Animatable) {
                ((Animatable) b5).stop();
            }
            j(3);
        } else {
            if (b5 instanceof Animatable) {
                ((Animatable) b5).start();
            }
            h(3);
        }
        b5.setLevel(Math.round(f5 * 10000.0f));
    }

    @Nullable
    private Drawable f(Drawable drawable, @Nullable r.c cVar, @Nullable PointF pointF, @Nullable ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return e.h(drawable, cVar, pointF);
    }

    @Nullable
    private Drawable g(@Nullable Drawable drawable, @Nullable r.c cVar) {
        return e.g(e.d(drawable, this.f11329c, this.f11328b), cVar);
    }

    private void h(int i4) {
        if (i4 >= 0) {
            this.f11331e.l(i4);
        }
    }

    private void i() {
        j(1);
        j(2);
        j(3);
        j(4);
        j(5);
    }

    private void j(int i4) {
        if (i4 >= 0) {
            this.f11331e.o(i4);
        }
    }

    private com.facebook.drawee.drawable.d n(int i4) {
        com.facebook.drawee.drawable.d c5 = this.f11331e.c(i4);
        if (c5.p() instanceof i) {
            c5 = (i) c5.p();
        }
        return c5.p() instanceof q ? (q) c5.p() : c5;
    }

    private q p(int i4) {
        com.facebook.drawee.drawable.d n4 = n(i4);
        if (n4 instanceof q) {
            return (q) n4;
        }
        return e.l(n4, r.c.f11294a);
    }

    private boolean s(int i4) {
        return n(i4) instanceof q;
    }

    private void t() {
        this.f11332f.f(this.f11327a);
    }

    private void u() {
        g gVar = this.f11331e;
        if (gVar != null) {
            gVar.g();
            this.f11331e.k();
            i();
            h(1);
            this.f11331e.r();
            this.f11331e.j();
        }
    }

    private void z(int i4, @Nullable Drawable drawable) {
        if (drawable == null) {
            this.f11331e.f(i4, null);
            return;
        }
        n(i4).f(e.d(drawable, this.f11329c, this.f11328b));
    }

    public void A(int i4) {
        this.f11331e.y(i4);
    }

    public void B(int i4) {
        D(this.f11328b.getDrawable(i4));
    }

    public void C(int i4, r.c cVar) {
        E(this.f11328b.getDrawable(i4), cVar);
    }

    public void D(@Nullable Drawable drawable) {
        z(5, drawable);
    }

    public void E(Drawable drawable, r.c cVar) {
        z(5, drawable);
        p(5).C(cVar);
    }

    public void F(int i4, @Nullable Drawable drawable) {
        com.facebook.common.internal.h.e(i4 >= 0 && i4 + 6 < this.f11331e.d(), "The given index does not correspond to an overlay image.");
        z(i4 + 6, drawable);
    }

    public void G(@Nullable Drawable drawable) {
        F(0, drawable);
    }

    public void H(int i4) {
        J(this.f11328b.getDrawable(i4));
    }

    public void I(int i4, r.c cVar) {
        K(this.f11328b.getDrawable(i4), cVar);
    }

    public void J(@Nullable Drawable drawable) {
        z(1, drawable);
    }

    public void K(Drawable drawable, r.c cVar) {
        z(1, drawable);
        p(1).C(cVar);
    }

    public void L(PointF pointF) {
        com.facebook.common.internal.h.i(pointF);
        p(1).B(pointF);
    }

    public void N(int i4) {
        P(this.f11328b.getDrawable(i4));
    }

    public void O(int i4, r.c cVar) {
        Q(this.f11328b.getDrawable(i4), cVar);
    }

    public void P(@Nullable Drawable drawable) {
        z(3, drawable);
    }

    public void Q(Drawable drawable, r.c cVar) {
        z(3, drawable);
        p(3).C(cVar);
    }

    public void R(int i4) {
        T(this.f11328b.getDrawable(i4));
    }

    public void S(int i4, r.c cVar) {
        U(this.f11328b.getDrawable(i4), cVar);
    }

    public void T(@Nullable Drawable drawable) {
        z(4, drawable);
    }

    public void U(Drawable drawable, r.c cVar) {
        z(4, drawable);
        p(4).C(cVar);
    }

    public void V(@Nullable RoundingParams roundingParams) {
        this.f11329c = roundingParams;
        e.k(this.f11330d, roundingParams);
        for (int i4 = 0; i4 < this.f11331e.d(); i4++) {
            e.j(n(i4), this.f11329c, this.f11328b);
        }
    }

    @Override // o0.c
    public void a(Throwable th) {
        this.f11331e.g();
        i();
        if (this.f11331e.b(4) != null) {
            h(4);
        } else {
            h(1);
        }
        this.f11331e.j();
    }

    @Override // o0.c
    public void b(float f5, boolean z4) {
        if (this.f11331e.b(3) == null) {
            return;
        }
        this.f11331e.g();
        M(f5);
        if (z4) {
            this.f11331e.r();
        }
        this.f11331e.j();
    }

    @Override // o0.b
    public Drawable c() {
        return this.f11330d;
    }

    @Override // o0.c
    public void d(Drawable drawable, float f5, boolean z4) {
        Drawable d5 = e.d(drawable, this.f11329c, this.f11328b);
        d5.mutate();
        this.f11332f.f(d5);
        this.f11331e.g();
        i();
        h(2);
        M(f5);
        if (z4) {
            this.f11331e.r();
        }
        this.f11331e.j();
    }

    @Override // o0.c
    public void e(@Nullable Drawable drawable) {
        this.f11330d.x(drawable);
    }

    public void k(RectF rectF) {
        this.f11332f.t(rectF);
    }

    @Nullable
    public r.c l() {
        if (s(2)) {
            return p(2).A();
        }
        return null;
    }

    public int m() {
        return this.f11331e.t();
    }

    @Nullable
    public RoundingParams o() {
        return this.f11329c;
    }

    @VisibleForTesting
    public boolean q() {
        return this.f11332f.p() != this.f11327a;
    }

    public boolean r() {
        return this.f11331e.b(1) != null;
    }

    @Override // o0.c
    public void reset() {
        t();
        u();
    }

    @Override // o0.c
    public void setFailure(Throwable th) {
        this.f11331e.g();
        i();
        if (this.f11331e.b(5) != null) {
            h(5);
        } else {
            h(1);
        }
        this.f11331e.j();
    }

    public void v(ColorFilter colorFilter) {
        this.f11332f.setColorFilter(colorFilter);
    }

    public void w(PointF pointF) {
        com.facebook.common.internal.h.i(pointF);
        p(2).B(pointF);
    }

    public void x(r.c cVar) {
        com.facebook.common.internal.h.i(cVar);
        p(2).C(cVar);
    }

    public void y(@Nullable Drawable drawable) {
        z(0, drawable);
    }
}

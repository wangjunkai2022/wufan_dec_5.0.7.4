package com.facebook.drawee.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.internal.g;
import com.facebook.common.internal.h;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.drawable.u;
import com.facebook.drawee.drawable.v;
import com.umeng.analytics.pro.f;
import javax.annotation.Nullable;
import o0.b;
/* compiled from: DraweeHolder.java */
/* loaded from: classes.dex */
public class b<DH extends o0.b> implements v {

    /* renamed from: d  reason: collision with root package name */
    private DH f11371d;

    /* renamed from: a  reason: collision with root package name */
    private boolean f11368a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11369b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11370c = true;

    /* renamed from: e  reason: collision with root package name */
    private o0.a f11372e = null;

    /* renamed from: f  reason: collision with root package name */
    private final DraweeEventTracker f11373f = DraweeEventTracker.b();

    public b(@Nullable DH dh) {
        if (dh != null) {
            r(dh);
        }
    }

    private void b() {
        if (this.f11368a) {
            return;
        }
        this.f11373f.c(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        this.f11368a = true;
        o0.a aVar = this.f11372e;
        if (aVar == null || aVar.e() == null) {
            return;
        }
        this.f11372e.c();
    }

    private void c() {
        if (this.f11369b && this.f11370c) {
            b();
        } else {
            e();
        }
    }

    public static <DH extends o0.b> b<DH> d(@Nullable DH dh, Context context) {
        b<DH> bVar = new b<>(dh);
        bVar.p(context);
        return bVar;
    }

    private void e() {
        if (this.f11368a) {
            this.f11373f.c(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
            this.f11368a = false;
            if (l()) {
                this.f11372e.onDetach();
            }
        }
    }

    private void s(@Nullable v vVar) {
        Drawable i4 = i();
        if (i4 instanceof u) {
            ((u) i4).o(vVar);
        }
    }

    @Override // com.facebook.drawee.drawable.v
    public void a() {
        if (this.f11368a) {
            return;
        }
        com.facebook.common.logging.a.m0(DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f11372e)), toString());
        this.f11369b = true;
        this.f11370c = true;
        c();
    }

    @Nullable
    public o0.a f() {
        return this.f11372e;
    }

    protected DraweeEventTracker g() {
        return this.f11373f;
    }

    public DH h() {
        return (DH) h.i(this.f11371d);
    }

    @Nullable
    public Drawable i() {
        DH dh = this.f11371d;
        if (dh == null) {
            return null;
        }
        return dh.c();
    }

    public boolean j() {
        return this.f11371d != null;
    }

    public boolean k() {
        return this.f11369b;
    }

    public boolean l() {
        o0.a aVar = this.f11372e;
        return aVar != null && aVar.e() == this.f11371d;
    }

    public void m() {
        this.f11373f.c(DraweeEventTracker.Event.ON_HOLDER_ATTACH);
        this.f11369b = true;
        c();
    }

    public void n() {
        this.f11373f.c(DraweeEventTracker.Event.ON_HOLDER_DETACH);
        this.f11369b = false;
        c();
    }

    public boolean o(MotionEvent motionEvent) {
        if (l()) {
            return this.f11372e.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.facebook.drawee.drawable.v
    public void onVisibilityChange(boolean z4) {
        if (this.f11370c == z4) {
            return;
        }
        this.f11373f.c(z4 ? DraweeEventTracker.Event.ON_DRAWABLE_SHOW : DraweeEventTracker.Event.ON_DRAWABLE_HIDE);
        this.f11370c = z4;
        c();
    }

    public void p(Context context) {
    }

    public void q(@Nullable o0.a aVar) {
        boolean z4 = this.f11368a;
        if (z4) {
            e();
        }
        if (l()) {
            this.f11373f.c(DraweeEventTracker.Event.ON_CLEAR_OLD_CONTROLLER);
            this.f11372e.a(null);
        }
        this.f11372e = aVar;
        if (aVar != null) {
            this.f11373f.c(DraweeEventTracker.Event.ON_SET_CONTROLLER);
            this.f11372e.a(this.f11371d);
        } else {
            this.f11373f.c(DraweeEventTracker.Event.ON_CLEAR_CONTROLLER);
        }
        if (z4) {
            b();
        }
    }

    public void r(DH dh) {
        this.f11373f.c(DraweeEventTracker.Event.ON_SET_HIERARCHY);
        boolean l4 = l();
        s(null);
        DH dh2 = (DH) h.i(dh);
        this.f11371d = dh2;
        Drawable c5 = dh2.c();
        onVisibilityChange(c5 == null || c5.isVisible());
        s(this);
        if (l4) {
            this.f11372e.a(dh);
        }
    }

    public String toString() {
        return g.f(this).g("controllerAttached", this.f11368a).g("holderAttached", this.f11369b).g("drawableVisible", this.f11370c).f(f.ax, this.f11373f.toString()).toString();
    }
}

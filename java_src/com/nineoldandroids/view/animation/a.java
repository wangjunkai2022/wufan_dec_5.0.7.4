package com.nineoldandroids.view.animation;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* compiled from: AnimatorProxy.java */
/* loaded from: classes5.dex */
public final class a extends Animation {

    /* renamed from: r  reason: collision with root package name */
    public static final boolean f57796r;

    /* renamed from: s  reason: collision with root package name */
    private static final WeakHashMap<View, a> f57797s;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<View> f57798b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f57800d;

    /* renamed from: f  reason: collision with root package name */
    private float f57802f;

    /* renamed from: g  reason: collision with root package name */
    private float f57803g;

    /* renamed from: h  reason: collision with root package name */
    private float f57804h;

    /* renamed from: i  reason: collision with root package name */
    private float f57805i;

    /* renamed from: j  reason: collision with root package name */
    private float f57806j;

    /* renamed from: m  reason: collision with root package name */
    private float f57809m;

    /* renamed from: n  reason: collision with root package name */
    private float f57810n;

    /* renamed from: c  reason: collision with root package name */
    private final Camera f57799c = new Camera();

    /* renamed from: e  reason: collision with root package name */
    private float f57801e = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    private float f57807k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    private float f57808l = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    private final RectF f57811o = new RectF();

    /* renamed from: p  reason: collision with root package name */
    private final RectF f57812p = new RectF();

    /* renamed from: q  reason: collision with root package name */
    private final Matrix f57813q = new Matrix();

    static {
        f57796r = Integer.valueOf(Build.VERSION.SDK).intValue() < 11;
        f57797s = new WeakHashMap<>();
    }

    private a(View view) {
        setDuration(0L);
        setFillAfter(true);
        view.setAnimation(this);
        this.f57798b = new WeakReference<>(view);
    }

    private void F(Matrix matrix, View view) {
        float width = view.getWidth();
        float height = view.getHeight();
        boolean z4 = this.f57800d;
        float f5 = z4 ? this.f57802f : width / 2.0f;
        float f6 = z4 ? this.f57803g : height / 2.0f;
        float f7 = this.f57804h;
        float f8 = this.f57805i;
        float f9 = this.f57806j;
        if (f7 != 0.0f || f8 != 0.0f || f9 != 0.0f) {
            Camera camera = this.f57799c;
            camera.save();
            camera.rotateX(f7);
            camera.rotateY(f8);
            camera.rotateZ(-f9);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f5, -f6);
            matrix.postTranslate(f5, f6);
        }
        float f10 = this.f57807k;
        float f11 = this.f57808l;
        if (f10 != 1.0f || f11 != 1.0f) {
            matrix.postScale(f10, f11);
            matrix.postTranslate((-(f5 / width)) * ((f10 * width) - width), (-(f6 / height)) * ((f11 * height) - height));
        }
        matrix.postTranslate(this.f57809m, this.f57810n);
    }

    public static a G(View view) {
        WeakHashMap<View, a> weakHashMap = f57797s;
        a aVar = weakHashMap.get(view);
        if (aVar == null || aVar != view.getAnimation()) {
            a aVar2 = new a(view);
            weakHashMap.put(view, aVar2);
            return aVar2;
        }
        return aVar;
    }

    private void a(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        Matrix matrix = this.f57813q;
        matrix.reset();
        F(matrix, view);
        this.f57813q.mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        float f5 = rectF.right;
        float f6 = rectF.left;
        if (f5 < f6) {
            rectF.right = f6;
            rectF.left = f5;
        }
        float f7 = rectF.bottom;
        float f8 = rectF.top;
        if (f7 < f8) {
            rectF.top = f7;
            rectF.bottom = f8;
        }
    }

    private void p() {
        View view = this.f57798b.get();
        if (view == null || view.getParent() == null) {
            return;
        }
        RectF rectF = this.f57812p;
        a(rectF, view);
        rectF.union(this.f57811o);
        ((View) view.getParent()).invalidate((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void q() {
        View view = this.f57798b.get();
        if (view != null) {
            a(this.f57811o, view);
        }
    }

    public void A(int i4) {
        View view = this.f57798b.get();
        if (view != null) {
            view.scrollTo(view.getScrollX(), i4);
        }
    }

    public void B(float f5) {
        if (this.f57809m != f5) {
            q();
            this.f57809m = f5;
            p();
        }
    }

    public void C(float f5) {
        if (this.f57810n != f5) {
            q();
            this.f57810n = f5;
            p();
        }
    }

    public void D(float f5) {
        View view = this.f57798b.get();
        if (view != null) {
            B(f5 - view.getLeft());
        }
    }

    public void E(float f5) {
        View view = this.f57798b.get();
        if (view != null) {
            C(f5 - view.getTop());
        }
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f5, Transformation transformation) {
        View view = this.f57798b.get();
        if (view != null) {
            transformation.setAlpha(this.f57801e);
            F(transformation.getMatrix(), view);
        }
    }

    public float b() {
        return this.f57801e;
    }

    public float c() {
        return this.f57802f;
    }

    public float d() {
        return this.f57803g;
    }

    public float e() {
        return this.f57806j;
    }

    public float f() {
        return this.f57804h;
    }

    public float g() {
        return this.f57805i;
    }

    public float h() {
        return this.f57807k;
    }

    public float i() {
        return this.f57808l;
    }

    public int j() {
        View view = this.f57798b.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollX();
    }

    public int k() {
        View view = this.f57798b.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollY();
    }

    public float l() {
        return this.f57809m;
    }

    public float m() {
        return this.f57810n;
    }

    public float n() {
        View view = this.f57798b.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getLeft() + this.f57809m;
    }

    public float o() {
        View view = this.f57798b.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getTop() + this.f57810n;
    }

    public void r(float f5) {
        if (this.f57801e != f5) {
            this.f57801e = f5;
            View view = this.f57798b.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public void s(float f5) {
        if (this.f57800d && this.f57802f == f5) {
            return;
        }
        q();
        this.f57800d = true;
        this.f57802f = f5;
        p();
    }

    public void t(float f5) {
        if (this.f57800d && this.f57803g == f5) {
            return;
        }
        q();
        this.f57800d = true;
        this.f57803g = f5;
        p();
    }

    public void u(float f5) {
        if (this.f57806j != f5) {
            q();
            this.f57806j = f5;
            p();
        }
    }

    public void v(float f5) {
        if (this.f57804h != f5) {
            q();
            this.f57804h = f5;
            p();
        }
    }

    public void w(float f5) {
        if (this.f57805i != f5) {
            q();
            this.f57805i = f5;
            p();
        }
    }

    public void x(float f5) {
        if (this.f57807k != f5) {
            q();
            this.f57807k = f5;
            p();
        }
    }

    public void y(float f5) {
        if (this.f57808l != f5) {
            q();
            this.f57808l = f5;
            p();
        }
    }

    public void z(int i4) {
        View view = this.f57798b.get();
        if (view != null) {
            view.scrollTo(i4, view.getScrollY());
        }
    }
}

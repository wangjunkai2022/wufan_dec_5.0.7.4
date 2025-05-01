package com.join.mgps.ptr.header;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.util.ArrayList;
/* compiled from: MaterialProgressDrawable.java */
/* loaded from: classes4.dex */
public class a extends Drawable implements Animatable {
    private static final float A = 3.0f;
    private static final int B = 1333;
    private static final float C = 5.0f;
    private static final int D = 10;
    private static final int E = 5;
    private static final float F = 5.0f;
    private static final int G = 12;
    private static final int H = 6;
    private static final float I = 0.8f;
    private static final int J = 503316480;
    private static final int K = 1023410176;
    private static final float L = 3.5f;
    private static final float M = 0.0f;
    private static final float N = 1.75f;

    /* renamed from: p  reason: collision with root package name */
    public static final int f53775p = 0;

    /* renamed from: q  reason: collision with root package name */
    public static final int f53776q = 1;

    /* renamed from: r  reason: collision with root package name */
    private static final Interpolator f53777r = new LinearInterpolator();

    /* renamed from: s  reason: collision with root package name */
    private static final Interpolator f53778s = new f(null);

    /* renamed from: t  reason: collision with root package name */
    private static final Interpolator f53779t = new i(null);

    /* renamed from: u  reason: collision with root package name */
    private static final Interpolator f53780u = new AccelerateDecelerateInterpolator();

    /* renamed from: v  reason: collision with root package name */
    private static final int f53781v = 40;

    /* renamed from: w  reason: collision with root package name */
    private static final float f53782w = 8.75f;

    /* renamed from: x  reason: collision with root package name */
    private static final float f53783x = 2.5f;

    /* renamed from: y  reason: collision with root package name */
    private static final int f53784y = 56;

    /* renamed from: z  reason: collision with root package name */
    private static final float f53785z = 12.5f;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f53786b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<Animation> f53787c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final h f53788d;

    /* renamed from: e  reason: collision with root package name */
    private final Drawable.Callback f53789e;

    /* renamed from: f  reason: collision with root package name */
    private float f53790f;

    /* renamed from: g  reason: collision with root package name */
    private Resources f53791g;

    /* renamed from: h  reason: collision with root package name */
    private View f53792h;

    /* renamed from: i  reason: collision with root package name */
    private Animation f53793i;

    /* renamed from: j  reason: collision with root package name */
    private float f53794j;

    /* renamed from: k  reason: collision with root package name */
    private double f53795k;

    /* renamed from: l  reason: collision with root package name */
    private double f53796l;

    /* renamed from: m  reason: collision with root package name */
    private Animation f53797m;

    /* renamed from: n  reason: collision with root package name */
    private int f53798n;

    /* renamed from: o  reason: collision with root package name */
    private ShapeDrawable f53799o;

    /* compiled from: MaterialProgressDrawable.java */
    /* renamed from: com.join.mgps.ptr.header.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0376a implements Drawable.Callback {
        C0376a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            a.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
            a.this.scheduleSelf(runnable, j4);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            a.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: classes4.dex */
    public class b extends Animation {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f53801b;

        b(h hVar) {
            this.f53801b = hVar;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            float floor = (float) (Math.floor(this.f53801b.j() / a.I) + 1.0d);
            this.f53801b.B(this.f53801b.k() + ((this.f53801b.i() - this.f53801b.k()) * f5));
            this.f53801b.z(this.f53801b.j() + ((floor - this.f53801b.j()) * f5));
            this.f53801b.r(1.0f - f5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: classes4.dex */
    public class c implements Animation.AnimationListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f53803b;

        c(h hVar) {
            this.f53803b = hVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f53803b.m();
            this.f53803b.D();
            this.f53803b.A(false);
            a.this.f53792h.startAnimation(a.this.f53793i);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: classes4.dex */
    public class d extends Animation {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f53805b;

        d(h hVar) {
            this.f53805b = hVar;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            double l4 = this.f53805b.l();
            Double.isNaN(l4);
            float radians = (float) Math.toRadians(l4 / (this.f53805b.d() * 6.283185307179586d));
            float i4 = this.f53805b.i();
            float k4 = this.f53805b.k();
            float j4 = this.f53805b.j();
            this.f53805b.x(i4 + ((a.I - radians) * a.f53779t.getInterpolation(f5)));
            this.f53805b.B(k4 + (a.f53778s.getInterpolation(f5) * a.I));
            this.f53805b.z(j4 + (0.25f * f5));
            a.this.l((f5 * 144.0f) + ((a.this.f53794j / 5.0f) * 720.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: classes4.dex */
    public class e implements Animation.AnimationListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f53807b;

        e(h hVar) {
            this.f53807b = hVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            this.f53807b.D();
            this.f53807b.m();
            h hVar = this.f53807b;
            hVar.B(hVar.e());
            a aVar = a.this;
            aVar.f53794j = (aVar.f53794j + 1.0f) % 5.0f;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.this.f53794j = 0.0f;
        }
    }

    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: classes4.dex */
    private static class f extends AccelerateDecelerateInterpolator {
        private f() {
        }

        @Override // android.view.animation.AccelerateDecelerateInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            return super.getInterpolation(Math.max(0.0f, (f5 - 0.5f) * 2.0f));
        }

        /* synthetic */ f(C0376a c0376a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: classes4.dex */
    public class g extends OvalShape {

        /* renamed from: b  reason: collision with root package name */
        private RadialGradient f53809b;

        /* renamed from: c  reason: collision with root package name */
        private int f53810c;

        /* renamed from: d  reason: collision with root package name */
        private Paint f53811d = new Paint();

        /* renamed from: e  reason: collision with root package name */
        private int f53812e;

        public g(int i4, int i5) {
            this.f53810c = i4;
            this.f53812e = i5;
            int i6 = this.f53812e;
            RadialGradient radialGradient = new RadialGradient(i6 / 2, i6 / 2, this.f53810c, new int[]{a.K, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f53809b = radialGradient;
            this.f53811d.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = a.this.getBounds().width() / 2;
            float height = a.this.getBounds().height() / 2;
            canvas.drawCircle(width, height, (this.f53812e / 2) + this.f53810c, this.f53811d);
            canvas.drawCircle(width, height, this.f53812e / 2, paint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: classes4.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        private final RectF f53814a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        private final Paint f53815b;

        /* renamed from: c  reason: collision with root package name */
        private final Paint f53816c;

        /* renamed from: d  reason: collision with root package name */
        private final Drawable.Callback f53817d;

        /* renamed from: e  reason: collision with root package name */
        private final Paint f53818e;

        /* renamed from: f  reason: collision with root package name */
        private float f53819f;

        /* renamed from: g  reason: collision with root package name */
        private float f53820g;

        /* renamed from: h  reason: collision with root package name */
        private float f53821h;

        /* renamed from: i  reason: collision with root package name */
        private float f53822i;

        /* renamed from: j  reason: collision with root package name */
        private float f53823j;

        /* renamed from: k  reason: collision with root package name */
        private int[] f53824k;

        /* renamed from: l  reason: collision with root package name */
        private int f53825l;

        /* renamed from: m  reason: collision with root package name */
        private float f53826m;

        /* renamed from: n  reason: collision with root package name */
        private float f53827n;

        /* renamed from: o  reason: collision with root package name */
        private float f53828o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f53829p;

        /* renamed from: q  reason: collision with root package name */
        private Path f53830q;

        /* renamed from: r  reason: collision with root package name */
        private float f53831r;

        /* renamed from: s  reason: collision with root package name */
        private double f53832s;

        /* renamed from: t  reason: collision with root package name */
        private int f53833t;

        /* renamed from: u  reason: collision with root package name */
        private int f53834u;

        /* renamed from: v  reason: collision with root package name */
        private int f53835v;

        /* renamed from: w  reason: collision with root package name */
        private int f53836w;

        public h(Drawable.Callback callback) {
            Paint paint = new Paint();
            this.f53815b = paint;
            Paint paint2 = new Paint();
            this.f53816c = paint2;
            Paint paint3 = new Paint();
            this.f53818e = paint3;
            this.f53819f = 0.0f;
            this.f53820g = 0.0f;
            this.f53821h = 0.0f;
            this.f53822i = 5.0f;
            this.f53823j = a.f53783x;
            this.f53817d = callback;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setAntiAlias(true);
        }

        private void b(Canvas canvas, float f5, float f6, Rect rect) {
            if (this.f53829p) {
                Path path = this.f53830q;
                if (path == null) {
                    Path path2 = new Path();
                    this.f53830q = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float f7 = (((int) this.f53823j) / 2) * this.f53831r;
                double cos = this.f53832s * Math.cos(0.0d);
                double exactCenterX = rect.exactCenterX();
                Double.isNaN(exactCenterX);
                double sin = this.f53832s * Math.sin(0.0d);
                double exactCenterY = rect.exactCenterY();
                Double.isNaN(exactCenterY);
                float f8 = (float) (sin + exactCenterY);
                this.f53830q.moveTo(0.0f, 0.0f);
                this.f53830q.lineTo(this.f53833t * this.f53831r, 0.0f);
                Path path3 = this.f53830q;
                float f9 = this.f53831r;
                path3.lineTo((this.f53833t * f9) / 2.0f, this.f53834u * f9);
                this.f53830q.offset(((float) (cos + exactCenterX)) - f7, f8);
                this.f53830q.close();
                this.f53816c.setColor(this.f53824k[this.f53825l]);
                this.f53816c.setAlpha(this.f53835v);
                canvas.rotate((f5 + f6) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.f53830q, this.f53816c);
            }
        }

        private void n() {
            this.f53817d.invalidateDrawable(null);
        }

        public void A(boolean z4) {
            if (this.f53829p != z4) {
                this.f53829p = z4;
                n();
            }
        }

        public void B(float f5) {
            this.f53819f = f5;
            n();
        }

        public void C(float f5) {
            this.f53822i = f5;
            this.f53815b.setStrokeWidth(f5);
            n();
        }

        public void D() {
            this.f53826m = this.f53819f;
            this.f53827n = this.f53820g;
            this.f53828o = this.f53821h;
        }

        public void a(Canvas canvas, Rect rect) {
            this.f53818e.setColor(this.f53836w);
            this.f53818e.setAlpha(this.f53835v);
            canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, this.f53818e);
            RectF rectF = this.f53814a;
            rectF.set(rect);
            float f5 = this.f53823j;
            rectF.inset(f5, f5);
            float f6 = this.f53819f;
            float f7 = this.f53821h;
            float f8 = (f6 + f7) * 360.0f;
            float f9 = ((this.f53820g + f7) * 360.0f) - f8;
            this.f53815b.setColor(this.f53824k[this.f53825l]);
            this.f53815b.setAlpha(this.f53835v);
            canvas.drawArc(rectF, f8, f9, false, this.f53815b);
            b(canvas, f8, f9, rect);
        }

        public int c() {
            return this.f53835v;
        }

        public double d() {
            return this.f53832s;
        }

        public float e() {
            return this.f53820g;
        }

        public float f() {
            return this.f53823j;
        }

        public float g() {
            return this.f53821h;
        }

        public float h() {
            return this.f53819f;
        }

        public float i() {
            return this.f53827n;
        }

        public float j() {
            return this.f53828o;
        }

        public float k() {
            return this.f53826m;
        }

        public float l() {
            return this.f53822i;
        }

        public void m() {
            this.f53825l = (this.f53825l + 1) % this.f53824k.length;
        }

        public void o() {
            this.f53826m = 0.0f;
            this.f53827n = 0.0f;
            this.f53828o = 0.0f;
            B(0.0f);
            x(0.0f);
            z(0.0f);
        }

        public void p(int i4) {
            this.f53835v = i4;
        }

        public void q(float f5, float f6) {
            this.f53833t = (int) f5;
            this.f53834u = (int) f6;
        }

        public void r(float f5) {
            if (f5 != this.f53831r) {
                this.f53831r = f5;
                n();
            }
        }

        public void s(int i4) {
            this.f53836w = i4;
        }

        public void t(double d5) {
            this.f53832s = d5;
        }

        public void u(ColorFilter colorFilter) {
            this.f53815b.setColorFilter(colorFilter);
            n();
        }

        public void v(int i4) {
            this.f53825l = i4;
        }

        public void w(int[] iArr) {
            this.f53824k = iArr;
            v(0);
        }

        public void x(float f5) {
            this.f53820g = f5;
            n();
        }

        public void y(int i4, int i5) {
            double ceil;
            float min = Math.min(i4, i5);
            double d5 = this.f53832s;
            if (d5 > 0.0d && min >= 0.0f) {
                double d6 = min / 2.0f;
                Double.isNaN(d6);
                ceil = d6 - d5;
            } else {
                ceil = Math.ceil(this.f53822i / 2.0f);
            }
            this.f53823j = (float) ceil;
        }

        public void z(float f5) {
            this.f53821h = f5;
            n();
        }
    }

    /* compiled from: MaterialProgressDrawable.java */
    /* loaded from: classes4.dex */
    private static class i extends AccelerateDecelerateInterpolator {
        private i() {
        }

        @Override // android.view.animation.AccelerateDecelerateInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            return super.getInterpolation(Math.min(1.0f, f5 * 2.0f));
        }

        /* synthetic */ i(C0376a c0376a) {
            this();
        }
    }

    public a(Context context, View view) {
        int[] iArr = {-3591113, -13149199, -536002, -13327536};
        this.f53786b = iArr;
        C0376a c0376a = new C0376a();
        this.f53789e = c0376a;
        this.f53792h = view;
        this.f53791g = context.getResources();
        h hVar = new h(c0376a);
        this.f53788d = hVar;
        hVar.w(iArr);
        r(1);
        p();
    }

    private float g() {
        return this.f53790f;
    }

    private void m(double d5, double d6, double d7, double d8, float f5, float f6) {
        h hVar = this.f53788d;
        float f7 = this.f53791g.getDisplayMetrics().density;
        double d9 = f7;
        Double.isNaN(d9);
        this.f53795k = d5 * d9;
        Double.isNaN(d9);
        this.f53796l = d6 * d9;
        hVar.C(((float) d8) * f7);
        Double.isNaN(d9);
        hVar.t(d7 * d9);
        hVar.v(0);
        hVar.q(f5 * f7, f6 * f7);
        hVar.y((int) this.f53795k, (int) this.f53796l);
        o(this.f53795k);
    }

    private void o(double d5) {
        com.join.mgps.ptr.util.b.c(this.f53792h.getContext());
        int b5 = com.join.mgps.ptr.util.b.b(1.75f);
        int b6 = com.join.mgps.ptr.util.b.b(0.0f);
        int b7 = com.join.mgps.ptr.util.b.b(L);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new g(b7, (int) d5));
        this.f53799o = shapeDrawable;
        if (Build.VERSION.SDK_INT >= 11) {
            this.f53792h.setLayerType(1, shapeDrawable.getPaint());
        }
        this.f53799o.getPaint().setShadowLayer(b7, b6, b5, J);
    }

    private void p() {
        h hVar = this.f53788d;
        b bVar = new b(hVar);
        bVar.setInterpolator(f53780u);
        bVar.setDuration(666L);
        bVar.setAnimationListener(new c(hVar));
        d dVar = new d(hVar);
        dVar.setRepeatCount(-1);
        dVar.setRepeatMode(1);
        dVar.setInterpolator(f53777r);
        dVar.setDuration(1333L);
        dVar.setAnimationListener(new e(hVar));
        this.f53797m = bVar;
        this.f53793i = dVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f53799o;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(this.f53798n);
            this.f53799o.draw(canvas);
        }
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f53790f, bounds.exactCenterX(), bounds.exactCenterY());
        this.f53788d.a(canvas, bounds);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f53788d.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f53796l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.f53795k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(float f5) {
        this.f53788d.r(f5);
    }

    public void i(int i4) {
        this.f53798n = i4;
        this.f53788d.s(i4);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ArrayList<Animation> arrayList = this.f53787c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Animation animation = arrayList.get(i4);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    public void j(int... iArr) {
        this.f53788d.w(iArr);
        this.f53788d.v(0);
    }

    public void k(float f5) {
        this.f53788d.z(f5);
    }

    void l(float f5) {
        this.f53790f = f5;
        invalidateSelf();
    }

    public void n(float f5, float f6) {
        this.f53788d.B(f5);
        this.f53788d.x(f6);
    }

    public void q(boolean z4) {
        this.f53788d.A(z4);
    }

    public void r(int i4) {
        if (i4 == 0) {
            m(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            m(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f53788d.p(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f53788d.u(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f53793i.reset();
        this.f53788d.D();
        if (this.f53788d.e() != this.f53788d.h()) {
            this.f53792h.startAnimation(this.f53797m);
            return;
        }
        this.f53788d.v(0);
        this.f53788d.o();
        this.f53792h.startAnimation(this.f53793i);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f53792h.clearAnimation();
        l(0.0f);
        this.f53788d.A(false);
        this.f53788d.v(0);
        this.f53788d.o();
    }
}

package com.join.mgps.customview.swiperefresh;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.join.android.app.mgsim.wufun.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class MaterialProgressDrawable extends Drawable implements Animatable {
    private static final float A = 0.5f;
    private static final int B = 1332;
    private static final float C = 5.0f;
    private static final int D = 10;
    private static final int E = 5;
    private static final float F = 5.0f;
    private static final int G = 12;
    private static final int H = 6;
    private static final float I = 0.8f;
    public static Bitmap J = null;

    /* renamed from: o  reason: collision with root package name */
    private static final float f48693o = 1080.0f;

    /* renamed from: p  reason: collision with root package name */
    static final int f48694p = 0;

    /* renamed from: q  reason: collision with root package name */
    static final int f48695q = 1;

    /* renamed from: r  reason: collision with root package name */
    private static final int f48696r = 40;

    /* renamed from: s  reason: collision with root package name */
    private static final float f48697s = 8.75f;

    /* renamed from: t  reason: collision with root package name */
    private static final float f48698t = 2.5f;

    /* renamed from: u  reason: collision with root package name */
    private static final int f48699u = 40;

    /* renamed from: v  reason: collision with root package name */
    private static final float f48700v = 12.5f;

    /* renamed from: w  reason: collision with root package name */
    private static final float f48701w = 3.0f;

    /* renamed from: y  reason: collision with root package name */
    private static final float f48703y = 0.75f;

    /* renamed from: z  reason: collision with root package name */
    private static final float f48704z = 0.5f;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<Animation> f48705b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final d f48706c;

    /* renamed from: d  reason: collision with root package name */
    private float f48707d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f48708e;

    /* renamed from: f  reason: collision with root package name */
    private View f48709f;

    /* renamed from: g  reason: collision with root package name */
    private Animation f48710g;

    /* renamed from: h  reason: collision with root package name */
    float f48711h;

    /* renamed from: i  reason: collision with root package name */
    private double f48712i;

    /* renamed from: j  reason: collision with root package name */
    private double f48713j;

    /* renamed from: k  reason: collision with root package name */
    boolean f48714k;

    /* renamed from: l  reason: collision with root package name */
    private final Drawable.Callback f48715l;

    /* renamed from: m  reason: collision with root package name */
    private static final Interpolator f48691m = new LinearInterpolator();

    /* renamed from: n  reason: collision with root package name */
    static final Interpolator f48692n = new FastOutSlowInInterpolator();

    /* renamed from: x  reason: collision with root package name */
    private static final int[] f48702x = {-16777216};

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ProgressDrawableSize {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends Animation {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f48716b;

        a(d dVar) {
            this.f48716b = dVar;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            MaterialProgressDrawable materialProgressDrawable = MaterialProgressDrawable.this;
            if (materialProgressDrawable.f48714k) {
                materialProgressDrawable.a(f5, this.f48716b);
                return;
            }
            float c5 = materialProgressDrawable.c(this.f48716b);
            float l4 = this.f48716b.l();
            float n4 = this.f48716b.n();
            float m4 = this.f48716b.m();
            MaterialProgressDrawable.this.n(f5, this.f48716b);
            if (f5 <= 0.5f) {
                float f6 = MaterialProgressDrawable.I - c5;
                Interpolator interpolator = MaterialProgressDrawable.f48692n;
                this.f48716b.F(n4 + (f6 * interpolator.getInterpolation(f5 / 0.5f)));
            }
            if (f5 > 0.5f) {
                float f7 = MaterialProgressDrawable.I - c5;
                Interpolator interpolator2 = MaterialProgressDrawable.f48692n;
                this.f48716b.B(l4 + (f7 * interpolator2.getInterpolation((f5 - 0.5f) / 0.5f)));
            }
            this.f48716b.D(m4 + (0.25f * f5));
            MaterialProgressDrawable materialProgressDrawable2 = MaterialProgressDrawable.this;
            materialProgressDrawable2.i((f5 * 216.0f) + ((materialProgressDrawable2.f48711h / 5.0f) * MaterialProgressDrawable.f48693o));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Animation.AnimationListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f48718b;

        b(d dVar) {
            this.f48718b = dVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            this.f48718b.H();
            this.f48718b.p();
            d dVar = this.f48718b;
            dVar.F(dVar.e());
            MaterialProgressDrawable materialProgressDrawable = MaterialProgressDrawable.this;
            if (materialProgressDrawable.f48714k) {
                materialProgressDrawable.f48714k = false;
                animation.setDuration(1332L);
                this.f48718b.E(false);
                return;
            }
            materialProgressDrawable.f48711h = (materialProgressDrawable.f48711h + 1.0f) % 5.0f;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MaterialProgressDrawable.this.f48711h = 0.0f;
        }
    }

    /* loaded from: classes4.dex */
    class c implements Drawable.Callback {
        c() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            MaterialProgressDrawable.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
            MaterialProgressDrawable.this.scheduleSelf(runnable, j4);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            MaterialProgressDrawable.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final RectF f48721a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        private final Paint f48722b;

        /* renamed from: c  reason: collision with root package name */
        private final Paint f48723c;

        /* renamed from: d  reason: collision with root package name */
        private final Drawable.Callback f48724d;

        /* renamed from: e  reason: collision with root package name */
        private float f48725e;

        /* renamed from: f  reason: collision with root package name */
        private float f48726f;

        /* renamed from: g  reason: collision with root package name */
        private float f48727g;

        /* renamed from: h  reason: collision with root package name */
        private float f48728h;

        /* renamed from: i  reason: collision with root package name */
        private float f48729i;

        /* renamed from: j  reason: collision with root package name */
        private int[] f48730j;

        /* renamed from: k  reason: collision with root package name */
        private int f48731k;

        /* renamed from: l  reason: collision with root package name */
        private float f48732l;

        /* renamed from: m  reason: collision with root package name */
        private float f48733m;

        /* renamed from: n  reason: collision with root package name */
        private float f48734n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f48735o;

        /* renamed from: p  reason: collision with root package name */
        private Path f48736p;

        /* renamed from: q  reason: collision with root package name */
        private float f48737q;

        /* renamed from: r  reason: collision with root package name */
        private double f48738r;

        /* renamed from: s  reason: collision with root package name */
        private int f48739s;

        /* renamed from: t  reason: collision with root package name */
        private int f48740t;

        /* renamed from: u  reason: collision with root package name */
        private int f48741u;

        /* renamed from: v  reason: collision with root package name */
        private final Paint f48742v;

        /* renamed from: w  reason: collision with root package name */
        private int f48743w;

        /* renamed from: x  reason: collision with root package name */
        private int f48744x;

        d(Drawable.Callback callback) {
            Paint paint = new Paint();
            this.f48722b = paint;
            Paint paint2 = new Paint();
            this.f48723c = paint2;
            this.f48725e = 0.0f;
            this.f48726f = 0.0f;
            this.f48727g = 0.0f;
            this.f48728h = 5.0f;
            this.f48729i = MaterialProgressDrawable.f48698t;
            this.f48742v = new Paint(1);
            this.f48724d = callback;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }

        private void b(Canvas canvas, float f5, float f6, Rect rect) {
            if (this.f48735o) {
                Path path = this.f48736p;
                if (path == null) {
                    Path path2 = new Path();
                    this.f48736p = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float f7 = (((int) this.f48729i) / 2) * this.f48737q;
                double cos = this.f48738r * Math.cos(0.0d);
                double exactCenterX = rect.exactCenterX();
                Double.isNaN(exactCenterX);
                double sin = this.f48738r * Math.sin(0.0d);
                double exactCenterY = rect.exactCenterY();
                Double.isNaN(exactCenterY);
                float f8 = (float) (sin + exactCenterY);
                this.f48736p.moveTo(0.0f, 0.0f);
                this.f48736p.lineTo(this.f48739s * this.f48737q, 0.0f);
                Path path3 = this.f48736p;
                float f9 = this.f48737q;
                path3.lineTo((this.f48739s * f9) / 2.0f, this.f48740t * f9);
                this.f48736p.offset(((float) (cos + exactCenterX)) - f7, f8);
                this.f48736p.close();
                this.f48723c.setColor(this.f48744x);
                canvas.rotate((f5 + f6) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.f48736p, this.f48723c);
            }
        }

        private int h() {
            return (this.f48731k + 1) % this.f48730j.length;
        }

        private void q() {
            this.f48724d.invalidateDrawable(null);
        }

        public void A(@NonNull int[] iArr) {
            this.f48730j = iArr;
            z(0);
        }

        public void B(float f5) {
            this.f48726f = f5;
            q();
        }

        public void C(int i4, int i5) {
            double ceil;
            float min = Math.min(i4, i5);
            double d5 = this.f48738r;
            if (d5 > 0.0d && min >= 0.0f) {
                double d6 = min / 2.0f;
                Double.isNaN(d6);
                ceil = d6 - d5;
            } else {
                ceil = Math.ceil(this.f48728h / 2.0f);
            }
            this.f48729i = (float) ceil;
        }

        public void D(float f5) {
            this.f48727g = f5;
            q();
        }

        public void E(boolean z4) {
            if (this.f48735o != z4) {
                this.f48735o = z4;
                q();
            }
        }

        public void F(float f5) {
            this.f48725e = f5;
            q();
        }

        public void G(float f5) {
            this.f48728h = f5;
            this.f48722b.setStrokeWidth(f5);
            q();
        }

        public void H() {
            this.f48732l = this.f48725e;
            this.f48733m = this.f48726f;
            this.f48734n = this.f48727g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f48721a;
            rectF.set(rect);
            float f5 = this.f48729i;
            rectF.inset(f5, f5);
            float f6 = this.f48725e;
            float f7 = this.f48727g;
            float f8 = (f6 + f7) * 360.0f;
            this.f48722b.setColor(this.f48744x);
            canvas.rotate((f8 + (((this.f48726f + f7) * 360.0f) - f8)) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
            canvas.drawBitmap(MaterialProgressDrawable.J, rect, rectF, this.f48722b);
            if (this.f48741u < 255) {
                this.f48742v.setColor(this.f48743w);
                this.f48742v.setAlpha(0);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, this.f48742v);
            }
        }

        public int c() {
            return this.f48741u;
        }

        public double d() {
            return this.f48738r;
        }

        public float e() {
            return this.f48726f;
        }

        public float f() {
            return this.f48729i;
        }

        public int g() {
            return this.f48730j[h()];
        }

        public float i() {
            return this.f48727g;
        }

        public float j() {
            return this.f48725e;
        }

        public int k() {
            return this.f48730j[this.f48731k];
        }

        public float l() {
            return this.f48733m;
        }

        public float m() {
            return this.f48734n;
        }

        public float n() {
            return this.f48732l;
        }

        public float o() {
            return this.f48728h;
        }

        public void p() {
            z(h());
        }

        public void r() {
            this.f48732l = 0.0f;
            this.f48733m = 0.0f;
            this.f48734n = 0.0f;
            F(0.0f);
            B(0.0f);
            D(0.0f);
        }

        public void s(int i4) {
            this.f48741u = i4;
        }

        public void t(float f5, float f6) {
            this.f48739s = (int) f5;
            this.f48740t = (int) f6;
        }

        public void u(float f5) {
            if (f5 != this.f48737q) {
                this.f48737q = f5;
                q();
            }
        }

        public void v(int i4) {
            this.f48743w = i4;
        }

        public void w(double d5) {
            this.f48738r = d5;
        }

        public void x(int i4) {
            this.f48744x = i4;
        }

        public void y(ColorFilter colorFilter) {
            this.f48722b.setColorFilter(colorFilter);
            q();
        }

        public void z(int i4) {
            this.f48731k = i4;
            this.f48744x = this.f48730j[i4];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MaterialProgressDrawable(Context context, View view) {
        c cVar = new c();
        this.f48715l = cVar;
        this.f48709f = view;
        Resources resources = context.getResources();
        this.f48708e = resources;
        J = BitmapFactory.decodeResource(resources, R.drawable.icon);
        d dVar = new d(cVar);
        this.f48706c = dVar;
        dVar.A(f48702x);
        o(1);
        l();
    }

    private int b(float f5, int i4, int i5) {
        int intValue = Integer.valueOf(i4).intValue();
        int i6 = (intValue >> 24) & 255;
        int i7 = (intValue >> 16) & 255;
        int i8 = (intValue >> 8) & 255;
        int i9 = intValue & 255;
        int intValue2 = Integer.valueOf(i5).intValue();
        return ((i6 + ((int) ((((intValue2 >> 24) & 255) - i6) * f5))) << 24) | ((i7 + ((int) ((((intValue2 >> 16) & 255) - i7) * f5))) << 16) | ((i8 + ((int) ((((intValue2 >> 8) & 255) - i8) * f5))) << 8) | (i9 + ((int) (f5 * ((intValue2 & 255) - i9))));
    }

    private float d() {
        return this.f48707d;
    }

    private void j(double d5, double d6, double d7, double d8, float f5, float f6) {
        d dVar = this.f48706c;
        float f7 = this.f48708e.getDisplayMetrics().density;
        double d9 = f7;
        Double.isNaN(d9);
        this.f48712i = d5 * d9;
        Double.isNaN(d9);
        this.f48713j = d6 * d9;
        dVar.G(((float) d8) * f7);
        Double.isNaN(d9);
        dVar.w(d7 * d9);
        dVar.z(0);
        dVar.t(f5 * f7, f6 * f7);
        dVar.C((int) this.f48712i, (int) this.f48713j);
    }

    private void l() {
        d dVar = this.f48706c;
        a aVar = new a(dVar);
        aVar.setRepeatCount(-1);
        aVar.setRepeatMode(1);
        aVar.setInterpolator(f48691m);
        aVar.setAnimationListener(new b(dVar));
        this.f48710g = aVar;
    }

    void a(float f5, d dVar) {
        n(f5, dVar);
        dVar.F(dVar.n() + (((dVar.l() - c(dVar)) - dVar.n()) * f5));
        dVar.B(dVar.l());
        dVar.D(dVar.m() + ((((float) (Math.floor(dVar.m() / I) + 1.0d)) - dVar.m()) * f5));
    }

    float c(d dVar) {
        double o4 = dVar.o();
        Double.isNaN(o4);
        return (float) Math.toRadians(o4 / (dVar.d() * 6.283185307179586d));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f48707d, bounds.exactCenterX(), bounds.exactCenterY());
        this.f48706c.a(canvas, bounds);
        canvas.restoreToCount(save);
    }

    public void e(float f5) {
        this.f48706c.u(f5);
    }

    public void f(int i4) {
        this.f48706c.v(i4);
    }

    public void g(int... iArr) {
        this.f48706c.A(iArr);
        this.f48706c.z(0);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f48706c.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f48713j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.f48712i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(float f5) {
        this.f48706c.D(f5);
    }

    void i(float f5) {
        this.f48707d = f5;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ArrayList<Animation> arrayList = this.f48705b;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Animation animation = arrayList.get(i4);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    public void k(float f5, float f6) {
        this.f48706c.F(f5);
        this.f48706c.B(f6);
    }

    public void m(boolean z4) {
        this.f48706c.E(z4);
    }

    void n(float f5, d dVar) {
        if (f5 > 0.75f) {
            dVar.x(b((f5 - 0.75f) / 0.25f, dVar.k(), dVar.g()));
        }
    }

    public void o(int i4) {
        if (i4 == 0) {
            j(40.0d, 40.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            j(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f48706c.s(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f48706c.y(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f48710g.reset();
        this.f48706c.H();
        if (this.f48706c.e() != this.f48706c.j()) {
            this.f48714k = true;
            this.f48710g.setDuration(666L);
            this.f48709f.startAnimation(this.f48710g);
            return;
        }
        this.f48706c.z(0);
        this.f48706c.r();
        this.f48710g.setDuration(1332L);
        this.f48709f.startAnimation(this.f48710g);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f48709f.clearAnimation();
        i(0.0f);
        this.f48706c.E(false);
        this.f48706c.z(0);
        this.f48706c.r();
    }
}

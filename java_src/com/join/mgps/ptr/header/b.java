package com.join.mgps.ptr.header;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: RentalsSunDrawable.java */
/* loaded from: classes4.dex */
public class b extends Drawable implements Animatable {
    private static final float A = 0.65f;
    private static final float B = 1.05f;
    private static final float C = 0.22f;
    private static final float D = 1.2f;
    private static final float E = 1.3f;
    private static final float F = 0.75f;
    private static final float G = 1.2f;
    private static final float H = 1.5f;
    private static final Interpolator I = new LinearInterpolator();

    /* renamed from: y  reason: collision with root package name */
    private static final float f53837y = 0.3f;

    /* renamed from: z  reason: collision with root package name */
    private static final int f53838z = 1000;

    /* renamed from: b  reason: collision with root package name */
    private View f53839b;

    /* renamed from: d  reason: collision with root package name */
    private Animation f53841d;

    /* renamed from: e  reason: collision with root package name */
    private int f53842e;

    /* renamed from: f  reason: collision with root package name */
    private int f53843f;

    /* renamed from: g  reason: collision with root package name */
    private int f53844g;

    /* renamed from: h  reason: collision with root package name */
    private float f53845h;

    /* renamed from: i  reason: collision with root package name */
    private float f53846i;

    /* renamed from: j  reason: collision with root package name */
    private int f53847j;

    /* renamed from: k  reason: collision with root package name */
    private float f53848k;

    /* renamed from: l  reason: collision with root package name */
    private float f53849l;

    /* renamed from: m  reason: collision with root package name */
    private float f53850m;

    /* renamed from: o  reason: collision with root package name */
    private float f53852o;

    /* renamed from: p  reason: collision with root package name */
    private float f53853p;

    /* renamed from: s  reason: collision with root package name */
    private Bitmap f53856s;

    /* renamed from: t  reason: collision with root package name */
    private Bitmap f53857t;

    /* renamed from: u  reason: collision with root package name */
    private Bitmap f53858u;

    /* renamed from: w  reason: collision with root package name */
    private Context f53860w;

    /* renamed from: x  reason: collision with root package name */
    private int f53861x;

    /* renamed from: n  reason: collision with root package name */
    private int f53851n = 100;

    /* renamed from: q  reason: collision with root package name */
    private float f53854q = 0.0f;

    /* renamed from: r  reason: collision with root package name */
    private float f53855r = 0.0f;

    /* renamed from: v  reason: collision with root package name */
    private boolean f53859v = false;

    /* renamed from: c  reason: collision with root package name */
    private Matrix f53840c = new Matrix();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RentalsSunDrawable.java */
    /* loaded from: classes4.dex */
    public class a extends Animation {
        a() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            b.this.j(f5);
        }
    }

    public b(Context context, View view) {
        this.f53860w = context;
        this.f53839b = view;
        f();
        a();
        k();
    }

    private void a() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.rentals_sky);
        this.f53856s = decodeResource;
        this.f53856s = Bitmap.createScaledBitmap(decodeResource, this.f53843f, this.f53844g, true);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.about_papa_icon);
        this.f53858u = decodeResource2;
        int i4 = this.f53843f;
        this.f53858u = Bitmap.createScaledBitmap(decodeResource2, i4, (int) (i4 * C), true);
        Bitmap decodeResource3 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.rentals_sun);
        this.f53857t = decodeResource3;
        int i5 = this.f53851n;
        this.f53857t = Bitmap.createScaledBitmap(decodeResource3, i5, i5, true);
    }

    private void b(Canvas canvas) {
        Matrix matrix = this.f53840c;
        matrix.reset();
        int max = Math.max(0, this.f53842e - this.f53861x);
        float min = Math.min(1.0f, Math.abs(this.f53854q));
        float f5 = min - f53837y;
        float f6 = B;
        if (f5 > 0.0f) {
            f6 = B - ((f5 / 0.7f) * 0.049999952f);
        }
        int i4 = this.f53843f;
        matrix.postScale(f6, f6);
        matrix.postTranslate((-((i4 * f6) - i4)) / 2.0f, (((max + 50) + this.f53845h) - ((this.f53844g * (f6 - 1.0f)) / 2.0f)) + (this.f53846i * min));
        canvas.drawBitmap(this.f53856s, matrix, null);
    }

    private void c(Canvas canvas) {
        float f5;
        float f6;
        Matrix matrix = this.f53840c;
        matrix.reset();
        float f7 = this.f53854q;
        if (f7 > 1.0f) {
            f7 = (f7 + 9.0f) / 10.0f;
        }
        float f8 = this.f53851n / 2.0f;
        float f9 = 1.2f;
        float f10 = this.f53852o;
        float f11 = this.f53853p + ((this.f53861x / 2) * (1.0f - f7));
        float f12 = f7 - f53837y;
        if (f12 > 0.0f) {
            float f13 = f12 / 0.7f;
            float f14 = 1.0f - (0.25f * f13);
            f9 = 1.2f + (f13 * 0.29999995f);
            float f15 = f8 * f14;
            float f16 = f11 * (2.0f - f14);
            matrix.preTranslate((f8 - f15) + f10, f16);
            matrix.preScale(f14, f14);
            f5 = f10 + f8;
            f6 = f16 + f15;
        } else {
            matrix.postTranslate(f10, f11);
            f5 = f10 + f8;
            f6 = f11 + f8;
        }
        boolean z4 = this.f53859v;
        matrix.postRotate((z4 ? -360 : 360) * this.f53855r * (z4 ? 1.0f : f9), f5, f6);
        canvas.drawBitmap(this.f53857t, matrix, null);
    }

    private void d(Canvas canvas) {
        float f5;
        float f6;
        Matrix matrix = this.f53840c;
        matrix.reset();
        int max = Math.max(0, this.f53842e - this.f53861x);
        float min = Math.min(1.0f, Math.abs(this.f53854q));
        float f7 = min - f53837y;
        float f8 = 1.2f;
        if (f7 > 0.0f) {
            float f9 = f7 / 0.7f;
            f8 = 1.2f + (0.099999905f * f9);
            float f10 = this.f53848k;
            f6 = f10 - ((this.f53849l - f10) * f9);
            f5 = this.f53850m * (1.0f - f9);
        } else {
            float f11 = min / f53837y;
            float f12 = this.f53848k;
            f5 = f11 * this.f53850m;
            f6 = f12;
        }
        int i4 = this.f53843f;
        matrix.postScale(f8, f8);
        matrix.postTranslate((-((i4 * f8) - i4)) / 2.0f, ((max + f6) - ((this.f53847j * (f8 - 1.0f)) / 2.0f)) + f5);
        canvas.drawBitmap(this.f53858u, matrix, null);
    }

    private void f() {
        com.join.mgps.ptr.util.b.c(this.f53860w);
        this.f53861x = com.join.mgps.ptr.util.b.b(120.0f);
        int i4 = getContext().getResources().getDisplayMetrics().widthPixels;
        this.f53843f = i4;
        int i5 = (int) (i4 * A);
        this.f53844g = i5;
        this.f53845h = -(i5 * 0.28f);
        this.f53846i = com.join.mgps.ptr.util.b.a(15.0f);
        int i6 = (int) (this.f53843f * C);
        this.f53847j = i6;
        int i7 = this.f53861x;
        this.f53848k = (i7 - (i6 * 1.2f)) + (i7 * 0.42f);
        this.f53849l = (i7 - (i6 * E)) + (i7 * 0.42f);
        this.f53850m = com.join.mgps.ptr.util.b.a(10.0f);
        this.f53852o = this.f53843f * f53837y;
        this.f53853p = this.f53861x * 0.5f;
        this.f53842e = 0;
    }

    private Context getContext() {
        return this.f53860w;
    }

    private void k() {
        a aVar = new a();
        this.f53841d = aVar;
        aVar.setRepeatCount(-1);
        this.f53841d.setRepeatMode(1);
        this.f53841d.setInterpolator(I);
        this.f53841d.setDuration(1000L);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, this.f53861x - this.f53842e);
        b(canvas);
        c(canvas);
        d(canvas);
        canvas.restoreToCount(save);
    }

    public int e() {
        return this.f53861x;
    }

    public void g(int i4) {
        this.f53842e = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h() {
        i(0.0f);
        j(0.0f);
    }

    public void i(float f5) {
        this.f53854q = f5;
        j(f5);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    public void j(float f5) {
        this.f53855r = f5;
        this.f53839b.invalidate();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i4, int i5, int i6, int i7) {
        super.setBounds(i4, i5, i6, this.f53844g + i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f53841d.reset();
        this.f53859v = true;
        this.f53839b.startAnimation(this.f53841d);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f53839b.clearAnimation();
        this.f53859v = false;
        h();
    }
}

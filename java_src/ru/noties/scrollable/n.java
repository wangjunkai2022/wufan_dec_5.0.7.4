package ru.noties.scrollable;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
/* compiled from: ScrollableScroller.java */
/* loaded from: classes7.dex */
public class n {
    private static final int A = 0;
    private static final int B = 1;
    private static final float D = 0.35f;
    private static final float E = 0.5f;
    private static final float F = 1.0f;
    private static final float G = 0.175f;
    private static final float H = 0.35000002f;
    private static final int I = 100;

    /* renamed from: a  reason: collision with root package name */
    private final Interpolator f73324a;

    /* renamed from: b  reason: collision with root package name */
    private int f73325b;

    /* renamed from: c  reason: collision with root package name */
    private int f73326c;

    /* renamed from: d  reason: collision with root package name */
    private int f73327d;

    /* renamed from: e  reason: collision with root package name */
    private int f73328e;

    /* renamed from: f  reason: collision with root package name */
    private int f73329f;

    /* renamed from: g  reason: collision with root package name */
    private int f73330g;

    /* renamed from: h  reason: collision with root package name */
    private int f73331h;

    /* renamed from: i  reason: collision with root package name */
    private int f73332i;

    /* renamed from: j  reason: collision with root package name */
    private int f73333j;

    /* renamed from: k  reason: collision with root package name */
    private int f73334k;

    /* renamed from: l  reason: collision with root package name */
    private int f73335l;

    /* renamed from: m  reason: collision with root package name */
    private long f73336m;

    /* renamed from: n  reason: collision with root package name */
    private int f73337n;

    /* renamed from: o  reason: collision with root package name */
    private float f73338o;

    /* renamed from: p  reason: collision with root package name */
    private float f73339p;

    /* renamed from: q  reason: collision with root package name */
    private float f73340q;

    /* renamed from: s  reason: collision with root package name */
    private boolean f73342s;

    /* renamed from: t  reason: collision with root package name */
    private float f73343t;

    /* renamed from: u  reason: collision with root package name */
    private float f73344u;

    /* renamed from: v  reason: collision with root package name */
    private int f73345v;

    /* renamed from: x  reason: collision with root package name */
    private float f73347x;

    /* renamed from: y  reason: collision with root package name */
    private final float f73348y;

    /* renamed from: z  reason: collision with root package name */
    private float f73349z;
    private static float C = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final float[] J = new float[101];

    /* renamed from: w  reason: collision with root package name */
    private float f73346w = ViewConfiguration.getScrollFriction();

    /* renamed from: r  reason: collision with root package name */
    private boolean f73341r = true;

    /* compiled from: ScrollableScroller.java */
    /* loaded from: classes7.dex */
    static class a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        private static final float f73350a = 8.0f;

        /* renamed from: b  reason: collision with root package name */
        private static final float f73351b;

        /* renamed from: c  reason: collision with root package name */
        private static final float f73352c;

        static {
            float a5 = 1.0f / a(1.0f);
            f73351b = a5;
            f73352c = 1.0f - (a5 * a(1.0f));
        }

        a() {
        }

        private static float a(float f5) {
            float f6 = f5 * f73350a;
            if (f6 < 1.0f) {
                return f6 - (1.0f - ((float) Math.exp(-f6)));
            }
            return ((1.0f - ((float) Math.exp(1.0f - f6))) * 0.63212055f) + 0.36787945f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            float a5 = f73351b * a(f5);
            return a5 > 0.0f ? a5 + f73352c : a5;
        }
    }

    static {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i4 = 0; i4 < 100; i4++) {
            float f11 = i4 / 100.0f;
            float f12 = 1.0f;
            while (true) {
                f5 = ((f12 - f9) / 2.0f) + f9;
                f6 = 1.0f - f5;
                f7 = f5 * 3.0f * f6;
                f8 = f5 * f5 * f5;
                float f13 = (((0.175f * f6) + (H * f5)) * f7) + f8;
                if (Math.abs(f13 - f11) < 1.0E-5d) {
                    break;
                } else if (f13 > f11) {
                    f12 = f5;
                } else {
                    f9 = f5;
                }
            }
            J[i4] = (f7 * ((f6 * 0.5f) + f5)) + f8;
            float f14 = 1.0f;
            while (true) {
                float f15 = ((f14 - f10) / 2.0f) + f10;
                float f16 = 1.0f - f15;
                float f17 = (f15 * 3.0f * f16 * ((f16 * 0.5f) + f15)) + (f15 * f15 * f15);
                if (Math.abs(f17 - f11) < 1.0E-5d) {
                    break;
                } else if (f17 > f11) {
                    f14 = f15;
                } else {
                    f10 = f15;
                }
            }
        }
        J[100] = 1.0f;
    }

    public n(Context context, Interpolator interpolator, boolean z4) {
        if (interpolator == null) {
            this.f73324a = new a();
        } else {
            this.f73324a = interpolator;
        }
        this.f73348y = context.getResources().getDisplayMetrics().density * 160.0f;
        this.f73347x = b(ViewConfiguration.getScrollFriction());
        this.f73342s = z4;
        this.f73349z = b(0.84f);
    }

    private float b(float f5) {
        return this.f73348y * 386.0878f * f5;
    }

    private double i(float f5) {
        return Math.log((Math.abs(f5) * D) / (this.f73346w * this.f73349z));
    }

    private double j(float f5) {
        double i4 = i(f5);
        float f6 = C;
        double d5 = f6;
        Double.isNaN(d5);
        double d6 = this.f73346w * this.f73349z;
        double d7 = f6;
        Double.isNaN(d7);
        double exp = Math.exp((d7 / (d5 - 1.0d)) * i4);
        Double.isNaN(d6);
        return d6 * exp;
    }

    public void a() {
        this.f73334k = this.f73328e;
        this.f73335l = this.f73329f;
        this.f73341r = true;
    }

    public boolean c() {
        if (this.f73341r) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f73336m);
        int i4 = this.f73337n;
        if (currentAnimationTimeMillis < i4) {
            int i5 = this.f73325b;
            if (i5 == 0) {
                float interpolation = this.f73324a.getInterpolation(currentAnimationTimeMillis * this.f73338o);
                this.f73334k = this.f73326c + Math.round(this.f73339p * interpolation);
                this.f73335l = this.f73327d + Math.round(interpolation * this.f73340q);
            } else if (i5 == 1) {
                float f5 = currentAnimationTimeMillis / i4;
                int i6 = (int) (f5 * 100.0f);
                float f6 = 1.0f;
                float f7 = 0.0f;
                if (i6 < 100) {
                    float f8 = i6 / 100.0f;
                    int i7 = i6 + 1;
                    float[] fArr = J;
                    float f9 = fArr[i6];
                    f7 = (fArr[i7] - f9) / ((i7 / 100.0f) - f8);
                    f6 = f9 + ((f5 - f8) * f7);
                }
                this.f73344u = ((f7 * this.f73345v) / i4) * 1000.0f;
                int i8 = this.f73326c;
                int round = i8 + Math.round((this.f73328e - i8) * f6);
                this.f73334k = round;
                int min = Math.min(round, this.f73331h);
                this.f73334k = min;
                this.f73334k = Math.max(min, this.f73330g);
                int i9 = this.f73327d;
                int round2 = i9 + Math.round(f6 * (this.f73329f - i9));
                this.f73335l = round2;
                int min2 = Math.min(round2, this.f73333j);
                this.f73335l = min2;
                int max = Math.max(min2, this.f73332i);
                this.f73335l = max;
                if (this.f73334k == this.f73328e && max == this.f73329f) {
                    this.f73341r = true;
                }
            }
        } else {
            this.f73334k = this.f73328e;
            this.f73335l = this.f73329f;
            this.f73341r = true;
        }
        return true;
    }

    public void d(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        if (this.f73342s && !this.f73341r) {
            float e5 = e();
            float f5 = this.f73328e - this.f73326c;
            float f6 = this.f73329f - this.f73327d;
            float hypot = (float) Math.hypot(f5, f6);
            float f7 = (f5 / hypot) * e5;
            float f8 = (f6 / hypot) * e5;
            float f9 = i6;
            if (Math.signum(f9) == Math.signum(f7)) {
                float f10 = i7;
                if (Math.signum(f10) == Math.signum(f8)) {
                    i6 = (int) (f9 + f7);
                    i7 = (int) (f10 + f8);
                }
            }
        }
        this.f73325b = 1;
        this.f73341r = false;
        float hypot2 = (float) Math.hypot(i6, i7);
        this.f73343t = hypot2;
        this.f73337n = k(hypot2);
        this.f73336m = AnimationUtils.currentAnimationTimeMillis();
        this.f73326c = i4;
        this.f73327d = i5;
        float f11 = hypot2 == 0.0f ? 1.0f : i6 / hypot2;
        float f12 = hypot2 != 0.0f ? i7 / hypot2 : 1.0f;
        double j4 = j(hypot2);
        double signum = Math.signum(hypot2);
        Double.isNaN(signum);
        this.f73345v = (int) (signum * j4);
        this.f73330g = i8;
        this.f73331h = i9;
        this.f73332i = i10;
        this.f73333j = i11;
        double d5 = f11;
        Double.isNaN(d5);
        int round = i4 + ((int) Math.round(d5 * j4));
        this.f73328e = round;
        int min = Math.min(round, this.f73331h);
        this.f73328e = min;
        this.f73328e = Math.max(min, this.f73330g);
        double d6 = f12;
        Double.isNaN(d6);
        int round2 = i5 + ((int) Math.round(j4 * d6));
        this.f73329f = round2;
        int min2 = Math.min(round2, this.f73333j);
        this.f73329f = min2;
        this.f73329f = Math.max(min2, this.f73332i);
    }

    public float e() {
        return this.f73325b == 1 ? this.f73344u : this.f73343t - ((this.f73347x * n()) / 2000.0f);
    }

    public final int f() {
        return this.f73335l;
    }

    public final int g() {
        return this.f73337n;
    }

    public final int h() {
        return this.f73329f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k(float f5) {
        double i4 = i(f5);
        double d5 = C;
        Double.isNaN(d5);
        return (int) (Math.exp(i4 / (d5 - 1.0d)) * 1000.0d);
    }

    public void l(int i4) {
        this.f73329f = i4;
        this.f73340q = i4 - this.f73327d;
        this.f73341r = false;
    }

    public final void m(float f5) {
        this.f73347x = b(f5);
        this.f73346w = f5;
    }

    public int n() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - this.f73336m);
    }
}

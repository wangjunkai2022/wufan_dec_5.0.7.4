package it.sephiroth.android.library.widget;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
/* compiled from: OverScroller.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: f  reason: collision with root package name */
    private static final int f69517f = 250;

    /* renamed from: g  reason: collision with root package name */
    private static final int f69518g = 0;

    /* renamed from: h  reason: collision with root package name */
    private static final int f69519h = 1;

    /* renamed from: i  reason: collision with root package name */
    private static float f69520i = 8.0f;

    /* renamed from: j  reason: collision with root package name */
    private static float f69521j = 1.0f / B(1.0f);

    /* renamed from: a  reason: collision with root package name */
    private int f69522a;

    /* renamed from: b  reason: collision with root package name */
    private final a f69523b;

    /* renamed from: c  reason: collision with root package name */
    private final a f69524c;

    /* renamed from: d  reason: collision with root package name */
    private Interpolator f69525d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f69526e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverScroller.java */
    /* loaded from: classes6.dex */
    public static class a {
        private static final int A = 1;
        private static final int B = 2;

        /* renamed from: p  reason: collision with root package name */
        private static final float f69527p = 2000.0f;

        /* renamed from: r  reason: collision with root package name */
        private static final float f69529r = 0.35f;

        /* renamed from: s  reason: collision with root package name */
        private static final float f69530s = 0.5f;

        /* renamed from: t  reason: collision with root package name */
        private static final float f69531t = 1.0f;

        /* renamed from: u  reason: collision with root package name */
        private static final float f69532u = 0.175f;

        /* renamed from: v  reason: collision with root package name */
        private static final float f69533v = 0.35000002f;

        /* renamed from: w  reason: collision with root package name */
        private static final int f69534w = 100;

        /* renamed from: z  reason: collision with root package name */
        private static final int f69537z = 0;

        /* renamed from: a  reason: collision with root package name */
        private int f69538a;

        /* renamed from: b  reason: collision with root package name */
        private int f69539b;

        /* renamed from: c  reason: collision with root package name */
        private int f69540c;

        /* renamed from: d  reason: collision with root package name */
        private int f69541d;

        /* renamed from: e  reason: collision with root package name */
        private float f69542e;

        /* renamed from: f  reason: collision with root package name */
        private float f69543f;

        /* renamed from: g  reason: collision with root package name */
        private long f69544g;

        /* renamed from: h  reason: collision with root package name */
        private int f69545h;

        /* renamed from: i  reason: collision with root package name */
        private int f69546i;

        /* renamed from: j  reason: collision with root package name */
        private int f69547j;

        /* renamed from: l  reason: collision with root package name */
        private int f69549l;

        /* renamed from: o  reason: collision with root package name */
        private float f69552o;

        /* renamed from: q  reason: collision with root package name */
        private static float f69528q = (float) (Math.log(0.78d) / Math.log(0.9d));

        /* renamed from: x  reason: collision with root package name */
        private static final float[] f69535x = new float[101];

        /* renamed from: y  reason: collision with root package name */
        private static final float[] f69536y = new float[101];

        /* renamed from: m  reason: collision with root package name */
        private float f69550m = ViewConfiguration.getScrollFriction();

        /* renamed from: n  reason: collision with root package name */
        private int f69551n = 0;

        /* renamed from: k  reason: collision with root package name */
        private boolean f69548k = true;

        static {
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15 = 0.0f;
            float f16 = 0.0f;
            for (int i4 = 0; i4 < 100; i4++) {
                float f17 = i4 / 100.0f;
                float f18 = 1.0f;
                while (true) {
                    f5 = 2.0f;
                    f6 = ((f18 - f15) / 2.0f) + f15;
                    f7 = 3.0f;
                    f8 = 1.0f - f6;
                    f9 = f6 * 3.0f * f8;
                    f10 = f6 * f6 * f6;
                    float f19 = (((f8 * 0.175f) + (f6 * f69533v)) * f9) + f10;
                    if (Math.abs(f19 - f17) < 1.0E-5d) {
                        break;
                    } else if (f19 > f17) {
                        f18 = f6;
                    } else {
                        f15 = f6;
                    }
                }
                f69535x[i4] = (f9 * ((f8 * 0.5f) + f6)) + f10;
                float f20 = 1.0f;
                while (true) {
                    f11 = ((f20 - f16) / f5) + f16;
                    f12 = 1.0f - f11;
                    f13 = f11 * f7 * f12;
                    f14 = f11 * f11 * f11;
                    float f21 = (((f12 * 0.5f) + f11) * f13) + f14;
                    if (Math.abs(f21 - f17) < 1.0E-5d) {
                        break;
                    }
                    if (f21 > f17) {
                        f20 = f11;
                    } else {
                        f16 = f11;
                    }
                    f5 = 2.0f;
                    f7 = 3.0f;
                }
                f69536y[i4] = (f13 * ((f12 * 0.175f) + (f11 * f69533v))) + f14;
            }
            float[] fArr = f69535x;
            f69536y[100] = 1.0f;
            fArr[100] = 1.0f;
        }

        a(Context context) {
            this.f69552o = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        }

        private void B(int i4, int i5, int i6) {
            this.f69548k = false;
            this.f69551n = 1;
            this.f69538a = i4;
            this.f69540c = i5;
            int i7 = i4 - i5;
            this.f69543f = p(i7);
            this.f69541d = -i7;
            this.f69549l = Math.abs(i7);
            double d5 = i7;
            Double.isNaN(d5);
            double d6 = this.f69543f;
            Double.isNaN(d6);
            this.f69545h = (int) (Math.sqrt((d5 * (-2.0d)) / d6) * 1000.0d);
        }

        private void j(int i4, int i5, int i6) {
            float abs = Math.abs((i6 - i4) / (i5 - i4));
            int i7 = (int) (abs * 100.0f);
            if (i7 < 100) {
                float f5 = i7 / 100.0f;
                int i8 = i7 + 1;
                float[] fArr = f69536y;
                float f6 = fArr[i7];
                this.f69545h = (int) (this.f69545h * (f6 + (((abs - f5) / ((i8 / 100.0f) - f5)) * (fArr[i8] - f6))));
            }
        }

        private void n(int i4, int i5, int i6) {
            float f5 = this.f69543f;
            float f6 = (-i6) / f5;
            double abs = (((i6 * i6) / 2.0f) / Math.abs(f5)) + Math.abs(i5 - i4);
            Double.isNaN(abs);
            double abs2 = Math.abs(this.f69543f);
            Double.isNaN(abs2);
            float sqrt = (float) Math.sqrt((abs * 2.0d) / abs2);
            this.f69544g -= (int) ((sqrt - f6) * 1000.0f);
            this.f69538a = i5;
            this.f69541d = (int) ((-this.f69543f) * sqrt);
        }

        private static float p(int i4) {
            if (i4 > 0) {
                return -2000.0f;
            }
            return f69527p;
        }

        private double q(int i4) {
            return Math.log((Math.abs(i4) * f69529r) / (this.f69550m * this.f69552o));
        }

        private double r(int i4) {
            double q4 = q(i4);
            float f5 = f69528q;
            double d5 = f5;
            Double.isNaN(d5);
            double d6 = this.f69550m * this.f69552o;
            double d7 = f5;
            Double.isNaN(d7);
            double exp = Math.exp((d7 / (d5 - 1.0d)) * q4);
            Double.isNaN(d6);
            return d6 * exp;
        }

        private int s(int i4) {
            double q4 = q(i4);
            double d5 = f69528q;
            Double.isNaN(d5);
            return (int) (Math.exp(q4 / (d5 - 1.0d)) * 1000.0d);
        }

        private void u() {
            int i4 = this.f69541d;
            float abs = (i4 * i4) / (Math.abs(this.f69543f) * 2.0f);
            float signum = Math.signum(this.f69541d);
            int i5 = this.f69549l;
            if (abs > i5) {
                float f5 = -signum;
                int i6 = this.f69541d;
                this.f69543f = ((f5 * i6) * i6) / (i5 * 2.0f);
                abs = i5;
            }
            this.f69549l = (int) abs;
            this.f69551n = 2;
            int i7 = this.f69538a;
            int i8 = this.f69541d;
            if (i8 <= 0) {
                abs = -abs;
            }
            this.f69540c = i7 + ((int) abs);
            this.f69545h = -((int) ((i8 * 1000.0f) / this.f69543f));
        }

        private void y(int i4, int i5, int i6, int i7) {
            if (i4 > i5 && i4 < i6) {
                this.f69548k = true;
                return;
            }
            boolean z4 = i4 > i6;
            int i8 = z4 ? i6 : i5;
            int i9 = i4 - i8;
            if (i9 * i7 >= 0) {
                z(i4, i8, i7);
            } else if (r(i7) > Math.abs(i9)) {
                o(i4, i7, z4 ? i5 : i4, z4 ? i4 : i6, this.f69549l);
            } else {
                B(i4, i8, i7);
            }
        }

        private void z(int i4, int i5, int i6) {
            this.f69543f = p(i6 == 0 ? i4 - i5 : i6);
            n(i4, i5, i6);
            u();
        }

        void A(int i4, int i5, int i6) {
            this.f69548k = false;
            this.f69538a = i4;
            this.f69540c = i4 + i5;
            this.f69544g = AnimationUtils.currentAnimationTimeMillis();
            this.f69545h = i6;
            this.f69543f = 0.0f;
            this.f69541d = 0;
        }

        void C(float f5) {
            int i4 = this.f69538a;
            this.f69539b = i4 + Math.round(f5 * (this.f69540c - i4));
        }

        boolean k() {
            int i4 = this.f69551n;
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                if (i4 == 2) {
                    this.f69544g += this.f69545h;
                    B(this.f69540c, this.f69538a, 0);
                }
            } else if (this.f69545h >= this.f69546i) {
                return false;
            } else {
                this.f69538a = this.f69540c;
                int i5 = (int) this.f69542e;
                this.f69541d = i5;
                this.f69543f = p(i5);
                this.f69544g += this.f69545h;
                u();
            }
            update();
            return true;
        }

        void l(int i4) {
            this.f69545h = ((int) (AnimationUtils.currentAnimationTimeMillis() - this.f69544g)) + i4;
            this.f69548k = false;
        }

        void m() {
            this.f69539b = this.f69540c;
            this.f69548k = true;
        }

        void o(int i4, int i5, int i6, int i7, int i8) {
            this.f69549l = i8;
            this.f69548k = false;
            this.f69541d = i5;
            float f5 = i5;
            this.f69542e = f5;
            this.f69546i = 0;
            this.f69545h = 0;
            this.f69544g = AnimationUtils.currentAnimationTimeMillis();
            this.f69538a = i4;
            this.f69539b = i4;
            if (i4 <= i7 && i4 >= i6) {
                this.f69551n = 0;
                double d5 = 0.0d;
                if (i5 != 0) {
                    int s4 = s(i5);
                    this.f69546i = s4;
                    this.f69545h = s4;
                    d5 = r(i5);
                }
                double signum = Math.signum(f5);
                Double.isNaN(signum);
                int i9 = (int) (d5 * signum);
                this.f69547j = i9;
                int i10 = i4 + i9;
                this.f69540c = i10;
                if (i10 < i6) {
                    j(this.f69538a, i10, i6);
                    this.f69540c = i6;
                }
                int i11 = this.f69540c;
                if (i11 > i7) {
                    j(this.f69538a, i11, i7);
                    this.f69540c = i7;
                    return;
                }
                return;
            }
            y(i4, i6, i7, i5);
        }

        void t(int i4, int i5, int i6) {
            if (this.f69551n == 0) {
                this.f69549l = i6;
                this.f69544g = AnimationUtils.currentAnimationTimeMillis();
                y(i4, i5, i5, (int) this.f69542e);
            }
        }

        boolean update() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f69544g;
            int i4 = this.f69545h;
            if (currentAnimationTimeMillis > i4) {
                return false;
            }
            double d5 = 0.0d;
            int i5 = this.f69551n;
            if (i5 == 0) {
                int i6 = this.f69546i;
                float f5 = ((float) currentAnimationTimeMillis) / i6;
                int i7 = (int) (f5 * 100.0f);
                float f6 = 1.0f;
                float f7 = 0.0f;
                if (i7 < 100) {
                    float f8 = i7 / 100.0f;
                    int i8 = i7 + 1;
                    float[] fArr = f69535x;
                    float f9 = fArr[i7];
                    f7 = (fArr[i8] - f9) / ((i8 / 100.0f) - f8);
                    f6 = f9 + ((f5 - f8) * f7);
                }
                int i9 = this.f69547j;
                d5 = f6 * i9;
                this.f69542e = ((f7 * i9) / i6) * 1000.0f;
            } else if (i5 == 1) {
                float f10 = ((float) currentAnimationTimeMillis) / i4;
                float f11 = f10 * f10;
                float signum = Math.signum(this.f69541d);
                int i10 = this.f69549l;
                this.f69542e = signum * i10 * 6.0f * ((-f10) + f11);
                d5 = i10 * signum * ((3.0f * f11) - ((2.0f * f10) * f11));
            } else if (i5 == 2) {
                float f12 = ((float) currentAnimationTimeMillis) / 1000.0f;
                int i11 = this.f69541d;
                float f13 = this.f69543f;
                this.f69542e = i11 + (f13 * f12);
                d5 = (i11 * f12) + (((f13 * f12) * f12) / 2.0f);
            }
            this.f69539b = this.f69538a + ((int) Math.round(d5));
            return true;
        }

        void v(int i4) {
            this.f69540c = i4;
            this.f69548k = false;
        }

        void w(float f5) {
            this.f69550m = f5;
        }

        boolean x(int i4, int i5, int i6) {
            this.f69548k = true;
            this.f69540c = i4;
            this.f69538a = i4;
            this.f69541d = 0;
            this.f69544g = AnimationUtils.currentAnimationTimeMillis();
            this.f69545h = 0;
            if (i4 < i5) {
                B(i4, i5, 0);
            } else if (i4 > i6) {
                B(i4, i6, 0);
            }
            return !this.f69548k;
        }
    }

    public c(Context context) {
        this(context, null);
    }

    public static float B(float f5) {
        float exp;
        float f6 = f5 * f69520i;
        if (f6 < 1.0f) {
            exp = f6 - (1.0f - ((float) Math.exp(-f6)));
        } else {
            exp = ((1.0f - ((float) Math.exp(1.0f - f6))) * 0.63212055f) + 0.36787945f;
        }
        return exp * f69521j;
    }

    public int A() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - Math.min(this.f69523b.f69544g, this.f69524c.f69544g));
    }

    public void a() {
        this.f69523b.m();
        this.f69524c.m();
    }

    public boolean b() {
        float interpolation;
        if (o()) {
            return false;
        }
        int i4 = this.f69522a;
        if (i4 == 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f69523b.f69544g;
            int i5 = this.f69523b.f69545h;
            if (currentAnimationTimeMillis < i5) {
                float f5 = ((float) currentAnimationTimeMillis) / i5;
                Interpolator interpolator = this.f69525d;
                if (interpolator == null) {
                    interpolation = B(f5);
                } else {
                    interpolation = interpolator.getInterpolation(f5);
                }
                this.f69523b.C(interpolation);
                this.f69524c.C(interpolation);
            } else {
                a();
            }
        } else if (i4 == 1) {
            if (!this.f69523b.f69548k && !this.f69523b.update() && !this.f69523b.k()) {
                this.f69523b.m();
            }
            if (!this.f69524c.f69548k && !this.f69524c.update() && !this.f69524c.k()) {
                this.f69524c.m();
            }
        }
        return true;
    }

    @Deprecated
    public void c(int i4) {
        this.f69523b.l(i4);
        this.f69524c.l(i4);
    }

    public void d(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        e(i4, i5, i6, i7, i8, i9, i10, i11, 0, 0);
    }

    public void e(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        if (!this.f69526e || o()) {
            i14 = i6;
        } else {
            float f5 = this.f69523b.f69542e;
            float f6 = this.f69524c.f69542e;
            i14 = i6;
            float f7 = i14;
            if (Math.signum(f7) == Math.signum(f5)) {
                i15 = i7;
                float f8 = i15;
                if (Math.signum(f8) == Math.signum(f6)) {
                    i16 = (int) (f8 + f6);
                    i17 = (int) (f7 + f5);
                    this.f69522a = 1;
                    this.f69523b.o(i4, i17, i8, i9, i12);
                    this.f69524c.o(i5, i16, i10, i11, i13);
                }
                i16 = i15;
                i17 = i14;
                this.f69522a = 1;
                this.f69523b.o(i4, i17, i8, i9, i12);
                this.f69524c.o(i5, i16, i10, i11, i13);
            }
        }
        i15 = i7;
        i16 = i15;
        i17 = i14;
        this.f69522a = 1;
        this.f69523b.o(i4, i17, i8, i9, i12);
        this.f69524c.o(i5, i16, i10, i11, i13);
    }

    public final void f(boolean z4) {
        this.f69523b.f69548k = this.f69524c.f69548k = z4;
    }

    public float g() {
        return (float) Math.sqrt((this.f69523b.f69542e * this.f69523b.f69542e) + (this.f69524c.f69542e * this.f69524c.f69542e));
    }

    public final int h() {
        return this.f69523b.f69539b;
    }

    public final int i() {
        return this.f69524c.f69539b;
    }

    @Deprecated
    public final int j() {
        return Math.max(this.f69523b.f69545h, this.f69524c.f69545h);
    }

    public final int k() {
        return this.f69523b.f69540c;
    }

    public final int l() {
        return this.f69524c.f69540c;
    }

    public final int m() {
        return this.f69523b.f69538a;
    }

    public final int n() {
        return this.f69524c.f69538a;
    }

    public final boolean o() {
        return this.f69523b.f69548k && this.f69524c.f69548k;
    }

    public boolean p() {
        return ((this.f69523b.f69548k || this.f69523b.f69551n == 0) && (this.f69524c.f69548k || this.f69524c.f69551n == 0)) ? false : true;
    }

    public boolean q(float f5, float f6) {
        return !o() && Math.signum(f5) == Math.signum((float) (this.f69523b.f69540c - this.f69523b.f69538a)) && Math.signum(f6) == Math.signum((float) (this.f69524c.f69540c - this.f69524c.f69538a));
    }

    public void r(int i4, int i5, int i6) {
        this.f69523b.t(i4, i5, i6);
    }

    public void s(int i4, int i5, int i6) {
        this.f69524c.t(i4, i5, i6);
    }

    @Deprecated
    public void t(int i4) {
        this.f69523b.v(i4);
    }

    @Deprecated
    public void u(int i4) {
        this.f69524c.v(i4);
    }

    public final void v(float f5) {
        this.f69523b.w(f5);
        this.f69524c.w(f5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(Interpolator interpolator) {
        this.f69525d = interpolator;
    }

    public boolean x(int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f69522a = 1;
        return this.f69523b.x(i4, i6, i7) || this.f69524c.x(i5, i8, i9);
    }

    public void y(int i4, int i5, int i6, int i7) {
        z(i4, i5, i6, i7, 250);
    }

    public void z(int i4, int i5, int i6, int i7, int i8) {
        this.f69522a = 0;
        this.f69523b.A(i4, i6, i8);
        this.f69524c.A(i5, i7, i8);
    }

    public c(Context context, Interpolator interpolator) {
        this(context, interpolator, true);
    }

    public c(Context context, Interpolator interpolator, boolean z4) {
        this.f69525d = interpolator;
        this.f69526e = z4;
        this.f69523b = new a(context);
        this.f69524c = new a(context);
    }

    public c(Context context, Interpolator interpolator, float f5, float f6) {
        this(context, interpolator, true);
    }

    public c(Context context, Interpolator interpolator, float f5, float f6, boolean z4) {
        this(context, interpolator, z4);
    }
}

package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
/* compiled from: Keyframe.java */
/* loaded from: classes2.dex */
public class a<T> {

    /* renamed from: q  reason: collision with root package name */
    private static final float f4334q = -3987645.8f;

    /* renamed from: r  reason: collision with root package name */
    private static final int f4335r = 784923401;
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final com.airbnb.lottie.k f4336a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final T f4337b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public T f4338c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f4339d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final Interpolator f4340e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator f4341f;

    /* renamed from: g  reason: collision with root package name */
    public final float f4342g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public Float f4343h;

    /* renamed from: i  reason: collision with root package name */
    private float f4344i;

    /* renamed from: j  reason: collision with root package name */
    private float f4345j;

    /* renamed from: k  reason: collision with root package name */
    private int f4346k;

    /* renamed from: l  reason: collision with root package name */
    private int f4347l;

    /* renamed from: m  reason: collision with root package name */
    private float f4348m;

    /* renamed from: n  reason: collision with root package name */
    private float f4349n;

    /* renamed from: o  reason: collision with root package name */
    public PointF f4350o;

    /* renamed from: p  reason: collision with root package name */
    public PointF f4351p;

    public a(com.airbnb.lottie.k kVar, @Nullable T t4, @Nullable T t5, @Nullable Interpolator interpolator, float f5, @Nullable Float f6) {
        this.f4344i = f4334q;
        this.f4345j = f4334q;
        this.f4346k = f4335r;
        this.f4347l = f4335r;
        this.f4348m = Float.MIN_VALUE;
        this.f4349n = Float.MIN_VALUE;
        this.f4350o = null;
        this.f4351p = null;
        this.f4336a = kVar;
        this.f4337b = t4;
        this.f4338c = t5;
        this.f4339d = interpolator;
        this.f4340e = null;
        this.f4341f = null;
        this.f4342g = f5;
        this.f4343h = f6;
    }

    public boolean a(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        return f5 >= e() && f5 < b();
    }

    public float b() {
        if (this.f4336a == null) {
            return 1.0f;
        }
        if (this.f4349n == Float.MIN_VALUE) {
            if (this.f4343h == null) {
                this.f4349n = 1.0f;
            } else {
                this.f4349n = e() + ((this.f4343h.floatValue() - this.f4342g) / this.f4336a.e());
            }
        }
        return this.f4349n;
    }

    public float c() {
        if (this.f4345j == f4334q) {
            this.f4345j = ((Float) this.f4338c).floatValue();
        }
        return this.f4345j;
    }

    public int d() {
        if (this.f4347l == f4335r) {
            this.f4347l = ((Integer) this.f4338c).intValue();
        }
        return this.f4347l;
    }

    public float e() {
        com.airbnb.lottie.k kVar = this.f4336a;
        if (kVar == null) {
            return 0.0f;
        }
        if (this.f4348m == Float.MIN_VALUE) {
            this.f4348m = (this.f4342g - kVar.r()) / this.f4336a.e();
        }
        return this.f4348m;
    }

    public float f() {
        if (this.f4344i == f4334q) {
            this.f4344i = ((Float) this.f4337b).floatValue();
        }
        return this.f4344i;
    }

    public int g() {
        if (this.f4346k == f4335r) {
            this.f4346k = ((Integer) this.f4337b).intValue();
        }
        return this.f4346k;
    }

    public boolean h() {
        return this.f4339d == null && this.f4340e == null && this.f4341f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f4337b + ", endValue=" + this.f4338c + ", startFrame=" + this.f4342g + ", endFrame=" + this.f4343h + ", interpolator=" + this.f4339d + '}';
    }

    public a(com.airbnb.lottie.k kVar, @Nullable T t4, @Nullable T t5, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f5, @Nullable Float f6) {
        this.f4344i = f4334q;
        this.f4345j = f4334q;
        this.f4346k = f4335r;
        this.f4347l = f4335r;
        this.f4348m = Float.MIN_VALUE;
        this.f4349n = Float.MIN_VALUE;
        this.f4350o = null;
        this.f4351p = null;
        this.f4336a = kVar;
        this.f4337b = t4;
        this.f4338c = t5;
        this.f4339d = null;
        this.f4340e = interpolator;
        this.f4341f = interpolator2;
        this.f4342g = f5;
        this.f4343h = f6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(com.airbnb.lottie.k kVar, @Nullable T t4, @Nullable T t5, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f5, @Nullable Float f6) {
        this.f4344i = f4334q;
        this.f4345j = f4334q;
        this.f4346k = f4335r;
        this.f4347l = f4335r;
        this.f4348m = Float.MIN_VALUE;
        this.f4349n = Float.MIN_VALUE;
        this.f4350o = null;
        this.f4351p = null;
        this.f4336a = kVar;
        this.f4337b = t4;
        this.f4338c = t5;
        this.f4339d = interpolator;
        this.f4340e = interpolator2;
        this.f4341f = interpolator3;
        this.f4342g = f5;
        this.f4343h = f6;
    }

    public a(T t4) {
        this.f4344i = f4334q;
        this.f4345j = f4334q;
        this.f4346k = f4335r;
        this.f4347l = f4335r;
        this.f4348m = Float.MIN_VALUE;
        this.f4349n = Float.MIN_VALUE;
        this.f4350o = null;
        this.f4351p = null;
        this.f4336a = null;
        this.f4337b = t4;
        this.f4338c = t4;
        this.f4339d = null;
        this.f4340e = null;
        this.f4341f = null;
        this.f4342g = Float.MIN_VALUE;
        this.f4343h = Float.valueOf(Float.MAX_VALUE);
    }
}

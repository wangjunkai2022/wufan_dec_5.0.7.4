package com.airbnb.lottie.utils;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.k;
/* compiled from: LottieValueAnimator.java */
/* loaded from: classes2.dex */
public class e extends a implements Choreographer.FrameCallback {
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private k f4313k;

    /* renamed from: d  reason: collision with root package name */
    private float f4306d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4307e = false;

    /* renamed from: f  reason: collision with root package name */
    private long f4308f = 0;

    /* renamed from: g  reason: collision with root package name */
    private float f4309g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    private int f4310h = 0;

    /* renamed from: i  reason: collision with root package name */
    private float f4311i = -2.14748365E9f;

    /* renamed from: j  reason: collision with root package name */
    private float f4312j = 2.14748365E9f;
    @VisibleForTesting

    /* renamed from: l  reason: collision with root package name */
    protected boolean f4314l = false;

    private void B() {
        if (this.f4313k == null) {
            return;
        }
        float f5 = this.f4309g;
        if (f5 < this.f4311i || f5 > this.f4312j) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f4311i), Float.valueOf(this.f4312j), Float.valueOf(this.f4309g)));
        }
    }

    private float j() {
        k kVar = this.f4313k;
        if (kVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / kVar.i()) / Math.abs(this.f4306d);
    }

    private boolean n() {
        return m() < 0.0f;
    }

    public void A(float f5) {
        this.f4306d = f5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.utils.a
    public void a() {
        super.a();
        b(n());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        a();
        r();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j4) {
        q();
        if (this.f4313k == null || !isRunning()) {
            return;
        }
        com.airbnb.lottie.e.a("LottieValueAnimator#doFrame");
        long j5 = this.f4308f;
        float j6 = ((float) (j5 != 0 ? j4 - j5 : 0L)) / j();
        float f5 = this.f4309g;
        if (n()) {
            j6 = -j6;
        }
        float f6 = f5 + j6;
        this.f4309g = f6;
        boolean z4 = !g.e(f6, l(), k());
        this.f4309g = g.c(this.f4309g, l(), k());
        this.f4308f = j4;
        e();
        if (z4) {
            if (getRepeatCount() != -1 && this.f4310h >= getRepeatCount()) {
                this.f4309g = this.f4306d < 0.0f ? l() : k();
                r();
                b(n());
            } else {
                c();
                this.f4310h++;
                if (getRepeatMode() == 2) {
                    this.f4307e = !this.f4307e;
                    u();
                } else {
                    this.f4309g = n() ? k() : l();
                }
                this.f4308f = j4;
            }
        }
        B();
        com.airbnb.lottie.e.b("LottieValueAnimator#doFrame");
    }

    public void f() {
        this.f4313k = null;
        this.f4311i = -2.14748365E9f;
        this.f4312j = 2.14748365E9f;
    }

    @MainThread
    public void g() {
        r();
        b(n());
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
        float l4;
        float k4;
        float l5;
        if (this.f4313k == null) {
            return 0.0f;
        }
        if (n()) {
            l4 = k() - this.f4309g;
            k4 = k();
            l5 = l();
        } else {
            l4 = this.f4309g - l();
            k4 = k();
            l5 = l();
        }
        return l4 / (k4 - l5);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(h());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        k kVar = this.f4313k;
        if (kVar == null) {
            return 0L;
        }
        return kVar.d();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float h() {
        k kVar = this.f4313k;
        if (kVar == null) {
            return 0.0f;
        }
        return (this.f4309g - kVar.r()) / (this.f4313k.f() - this.f4313k.r());
    }

    public float i() {
        return this.f4309g;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f4314l;
    }

    public float k() {
        k kVar = this.f4313k;
        if (kVar == null) {
            return 0.0f;
        }
        float f5 = this.f4312j;
        return f5 == 2.14748365E9f ? kVar.f() : f5;
    }

    public float l() {
        k kVar = this.f4313k;
        if (kVar == null) {
            return 0.0f;
        }
        float f5 = this.f4311i;
        return f5 == -2.14748365E9f ? kVar.r() : f5;
    }

    public float m() {
        return this.f4306d;
    }

    @MainThread
    public void o() {
        r();
    }

    @MainThread
    public void p() {
        this.f4314l = true;
        d(n());
        w((int) (n() ? k() : l()));
        this.f4308f = 0L;
        this.f4310h = 0;
        q();
    }

    protected void q() {
        if (isRunning()) {
            s(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @MainThread
    protected void r() {
        s(true);
    }

    @MainThread
    protected void s(boolean z4) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z4) {
            this.f4314l = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i4) {
        super.setRepeatMode(i4);
        if (i4 == 2 || !this.f4307e) {
            return;
        }
        this.f4307e = false;
        u();
    }

    @MainThread
    public void t() {
        this.f4314l = true;
        q();
        this.f4308f = 0L;
        if (n() && i() == l()) {
            this.f4309g = k();
        } else if (n() || i() != k()) {
        } else {
            this.f4309g = l();
        }
    }

    public void u() {
        A(-m());
    }

    public void v(k kVar) {
        boolean z4 = this.f4313k == null;
        this.f4313k = kVar;
        if (z4) {
            y(Math.max(this.f4311i, kVar.r()), Math.min(this.f4312j, kVar.f()));
        } else {
            y((int) kVar.r(), (int) kVar.f());
        }
        float f5 = this.f4309g;
        this.f4309g = 0.0f;
        w((int) f5);
        e();
    }

    public void w(float f5) {
        if (this.f4309g == f5) {
            return;
        }
        this.f4309g = g.c(f5, l(), k());
        this.f4308f = 0L;
        e();
    }

    public void x(float f5) {
        y(this.f4311i, f5);
    }

    public void y(float f5, float f6) {
        if (f5 <= f6) {
            k kVar = this.f4313k;
            float r4 = kVar == null ? -3.4028235E38f : kVar.r();
            k kVar2 = this.f4313k;
            float f7 = kVar2 == null ? Float.MAX_VALUE : kVar2.f();
            float c5 = g.c(f5, r4, f7);
            float c6 = g.c(f6, r4, f7);
            if (c5 == this.f4311i && c6 == this.f4312j) {
                return;
            }
            this.f4311i = c5;
            this.f4312j = c6;
            w((int) g.c(this.f4309g, c5, c6));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f5), Float.valueOf(f6)));
    }

    public void z(int i4) {
        y(i4, (int) this.f4312j);
    }
}

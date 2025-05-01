package com.facebook.rebound;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: Spring.java */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: o  reason: collision with root package name */
    private static int f12594o = 0;

    /* renamed from: p  reason: collision with root package name */
    private static final double f12595p = 0.064d;

    /* renamed from: q  reason: collision with root package name */
    private static final double f12596q = 0.001d;

    /* renamed from: a  reason: collision with root package name */
    private k f12597a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12598b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12599c;

    /* renamed from: g  reason: collision with root package name */
    private double f12603g;

    /* renamed from: h  reason: collision with root package name */
    private double f12604h;

    /* renamed from: n  reason: collision with root package name */
    private final c f12610n;

    /* renamed from: d  reason: collision with root package name */
    private final b f12600d = new b();

    /* renamed from: e  reason: collision with root package name */
    private final b f12601e = new b();

    /* renamed from: f  reason: collision with root package name */
    private final b f12602f = new b();

    /* renamed from: i  reason: collision with root package name */
    private boolean f12605i = true;

    /* renamed from: j  reason: collision with root package name */
    private double f12606j = 0.005d;

    /* renamed from: k  reason: collision with root package name */
    private double f12607k = 0.005d;

    /* renamed from: l  reason: collision with root package name */
    private CopyOnWriteArraySet<m> f12608l = new CopyOnWriteArraySet<>();

    /* renamed from: m  reason: collision with root package name */
    private double f12609m = 0.0d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Spring.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        double f12611a;

        /* renamed from: b  reason: collision with root package name */
        double f12612b;

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(c cVar) {
        if (cVar != null) {
            this.f12610n = cVar;
            StringBuilder sb = new StringBuilder();
            sb.append("spring:");
            int i4 = f12594o;
            f12594o = i4 + 1;
            sb.append(i4);
            this.f12599c = sb.toString();
            B(k.f12625c);
            return;
        }
        throw new IllegalArgumentException("Spring cannot be created outside of a BaseSpringSystem");
    }

    private double g(b bVar) {
        return Math.abs(this.f12604h - bVar.f12611a);
    }

    private void o(double d5) {
        b bVar = this.f12600d;
        b bVar2 = this.f12601e;
        double d6 = 1.0d - d5;
        bVar.f12611a = (bVar.f12611a * d5) + (bVar2.f12611a * d6);
        bVar.f12612b = (bVar.f12612b * d5) + (bVar2.f12612b * d6);
    }

    public i A(double d5) {
        this.f12606j = d5;
        return this;
    }

    public i B(k kVar) {
        if (kVar != null) {
            this.f12597a = kVar;
            return this;
        }
        throw new IllegalArgumentException("springConfig is required");
    }

    public i C(double d5) {
        b bVar = this.f12600d;
        if (d5 == bVar.f12612b) {
            return this;
        }
        bVar.f12612b = d5;
        this.f12610n.a(i());
        return this;
    }

    public boolean D() {
        return (p() && E()) ? false : true;
    }

    public boolean E() {
        return this.f12605i;
    }

    public i a(m mVar) {
        if (mVar != null) {
            this.f12608l.add(mVar);
            return this;
        }
        throw new IllegalArgumentException("newListener is required");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(double d5) {
        double d6;
        boolean z4;
        boolean z5;
        boolean p4 = p();
        if (p4 && this.f12605i) {
            return;
        }
        double d7 = f12595p;
        if (d5 <= f12595p) {
            d7 = d5;
        }
        this.f12609m += d7;
        k kVar = this.f12597a;
        double d8 = kVar.f12627b;
        double d9 = kVar.f12626a;
        b bVar = this.f12600d;
        double d10 = bVar.f12611a;
        double d11 = bVar.f12612b;
        b bVar2 = this.f12602f;
        double d12 = bVar2.f12611a;
        double d13 = bVar2.f12612b;
        while (true) {
            d6 = this.f12609m;
            if (d6 < f12596q) {
                break;
            }
            double d14 = d6 - f12596q;
            this.f12609m = d14;
            if (d14 < f12596q) {
                b bVar3 = this.f12601e;
                bVar3.f12611a = d10;
                bVar3.f12612b = d11;
            }
            double d15 = this.f12604h;
            double d16 = ((d15 - d12) * d8) - (d9 * d11);
            double d17 = d11 + (d16 * f12596q * 0.5d);
            double d18 = ((d15 - (((d11 * f12596q) * 0.5d) + d10)) * d8) - (d9 * d17);
            double d19 = d11 + (d18 * f12596q * 0.5d);
            double d20 = ((d15 - (d10 + ((d17 * f12596q) * 0.5d))) * d8) - (d9 * d19);
            double d21 = d10 + (d19 * f12596q);
            double d22 = d11 + (d20 * f12596q);
            d10 += (d11 + ((d17 + d19) * 2.0d) + d22) * 0.16666666666666666d * f12596q;
            d11 += (d16 + ((d18 + d20) * 2.0d) + (((d15 - d21) * d8) - (d9 * d22))) * 0.16666666666666666d * f12596q;
            d12 = d21;
            d13 = d22;
        }
        b bVar4 = this.f12602f;
        bVar4.f12611a = d12;
        bVar4.f12612b = d13;
        b bVar5 = this.f12600d;
        bVar5.f12611a = d10;
        bVar5.f12612b = d11;
        if (d6 > 0.0d) {
            o(d6 / f12596q);
        }
        boolean z6 = true;
        if (p() || (this.f12598b && r())) {
            if (d8 > 0.0d) {
                double d23 = this.f12604h;
                this.f12603g = d23;
                this.f12600d.f12611a = d23;
            } else {
                double d24 = this.f12600d.f12611a;
                this.f12604h = d24;
                this.f12603g = d24;
            }
            C(0.0d);
            z4 = true;
        } else {
            z4 = p4;
        }
        if (this.f12605i) {
            this.f12605i = false;
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4) {
            this.f12605i = true;
        } else {
            z6 = false;
        }
        Iterator<m> it2 = this.f12608l.iterator();
        while (it2.hasNext()) {
            m next = it2.next();
            if (z5) {
                next.c(this);
            }
            next.a(this);
            if (z6) {
                next.d(this);
            }
        }
    }

    public boolean c(double d5) {
        return Math.abs(f() - d5) <= j();
    }

    public void d() {
        this.f12608l.clear();
        this.f12610n.e(this);
    }

    public double e() {
        return g(this.f12600d);
    }

    public double f() {
        return this.f12600d.f12611a;
    }

    public double h() {
        return this.f12604h;
    }

    public String i() {
        return this.f12599c;
    }

    public double j() {
        return this.f12607k;
    }

    public double k() {
        return this.f12606j;
    }

    public k l() {
        return this.f12597a;
    }

    public double m() {
        return this.f12603g;
    }

    public double n() {
        return this.f12600d.f12612b;
    }

    public boolean p() {
        return Math.abs(this.f12600d.f12612b) <= this.f12606j && (g(this.f12600d) <= this.f12607k || this.f12597a.f12627b == 0.0d);
    }

    public boolean q() {
        return this.f12598b;
    }

    public boolean r() {
        return this.f12597a.f12627b > 0.0d && ((this.f12603g < this.f12604h && f() > this.f12604h) || (this.f12603g > this.f12604h && f() < this.f12604h));
    }

    public i s() {
        this.f12608l.clear();
        return this;
    }

    public i t(m mVar) {
        if (mVar != null) {
            this.f12608l.remove(mVar);
            return this;
        }
        throw new IllegalArgumentException("listenerToRemove is required");
    }

    public i u() {
        b bVar = this.f12600d;
        double d5 = bVar.f12611a;
        this.f12604h = d5;
        this.f12602f.f12611a = d5;
        bVar.f12612b = 0.0d;
        return this;
    }

    public i v(double d5) {
        return w(d5, true);
    }

    public i w(double d5, boolean z4) {
        this.f12603g = d5;
        this.f12600d.f12611a = d5;
        this.f12610n.a(i());
        Iterator<m> it2 = this.f12608l.iterator();
        while (it2.hasNext()) {
            it2.next().a(this);
        }
        if (z4) {
            u();
        }
        return this;
    }

    public i x(double d5) {
        if (this.f12604h == d5 && p()) {
            return this;
        }
        this.f12603g = f();
        this.f12604h = d5;
        this.f12610n.a(i());
        Iterator<m> it2 = this.f12608l.iterator();
        while (it2.hasNext()) {
            it2.next().b(this);
        }
        return this;
    }

    public i y(boolean z4) {
        this.f12598b = z4;
        return this;
    }

    public i z(double d5) {
        this.f12607k = d5;
        return this;
    }
}

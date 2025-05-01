package com.nineoldandroids.view;

import android.view.View;
import android.view.animation.Interpolator;
import com.nineoldandroids.animation.a;
import com.nineoldandroids.animation.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPropertyAnimatorPreHC.java */
/* loaded from: classes5.dex */
public class e extends com.nineoldandroids.view.b {

    /* renamed from: o  reason: collision with root package name */
    private static final int f57850o = 0;

    /* renamed from: p  reason: collision with root package name */
    private static final int f57851p = 1;

    /* renamed from: q  reason: collision with root package name */
    private static final int f57852q = 2;

    /* renamed from: r  reason: collision with root package name */
    private static final int f57853r = 4;

    /* renamed from: s  reason: collision with root package name */
    private static final int f57854s = 8;

    /* renamed from: t  reason: collision with root package name */
    private static final int f57855t = 16;

    /* renamed from: u  reason: collision with root package name */
    private static final int f57856u = 32;

    /* renamed from: v  reason: collision with root package name */
    private static final int f57857v = 64;

    /* renamed from: w  reason: collision with root package name */
    private static final int f57858w = 128;

    /* renamed from: x  reason: collision with root package name */
    private static final int f57859x = 256;

    /* renamed from: y  reason: collision with root package name */
    private static final int f57860y = 512;

    /* renamed from: z  reason: collision with root package name */
    private static final int f57861z = 511;

    /* renamed from: b  reason: collision with root package name */
    private final com.nineoldandroids.view.animation.a f57862b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<View> f57863c;

    /* renamed from: d  reason: collision with root package name */
    private long f57864d;

    /* renamed from: h  reason: collision with root package name */
    private Interpolator f57868h;

    /* renamed from: e  reason: collision with root package name */
    private boolean f57865e = false;

    /* renamed from: f  reason: collision with root package name */
    private long f57866f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f57867g = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f57869i = false;

    /* renamed from: j  reason: collision with root package name */
    private a.InterfaceC0575a f57870j = null;

    /* renamed from: k  reason: collision with root package name */
    private b f57871k = new b(this, null);

    /* renamed from: l  reason: collision with root package name */
    ArrayList<c> f57872l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private Runnable f57873m = new a();

    /* renamed from: n  reason: collision with root package name */
    private HashMap<com.nineoldandroids.animation.a, d> f57874n = new HashMap<>();

    /* compiled from: ViewPropertyAnimatorPreHC.java */
    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewPropertyAnimatorPreHC.java */
    /* loaded from: classes5.dex */
    public class b implements a.InterfaceC0575a, q.g {
        private b() {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void a(com.nineoldandroids.animation.a aVar) {
            if (e.this.f57870j != null) {
                e.this.f57870j.a(aVar);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void b(com.nineoldandroids.animation.a aVar) {
            if (e.this.f57870j != null) {
                e.this.f57870j.b(aVar);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void c(com.nineoldandroids.animation.a aVar) {
            if (e.this.f57870j != null) {
                e.this.f57870j.c(aVar);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void d(com.nineoldandroids.animation.a aVar) {
            if (e.this.f57870j != null) {
                e.this.f57870j.d(aVar);
            }
            e.this.f57874n.remove(aVar);
            if (e.this.f57874n.isEmpty()) {
                e.this.f57870j = null;
            }
        }

        @Override // com.nineoldandroids.animation.q.g
        public void e(q qVar) {
            View view;
            float J = qVar.J();
            d dVar = (d) e.this.f57874n.get(qVar);
            if ((dVar.f57880a & 511) != 0 && (view = (View) e.this.f57863c.get()) != null) {
                view.invalidate();
            }
            ArrayList<c> arrayList = dVar.f57881b;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    c cVar = arrayList.get(i4);
                    e.this.N(cVar.f57877a, cVar.f57878b + (cVar.f57879c * J));
                }
            }
            View view2 = (View) e.this.f57863c.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }

        /* synthetic */ b(e eVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewPropertyAnimatorPreHC.java */
    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        int f57877a;

        /* renamed from: b  reason: collision with root package name */
        float f57878b;

        /* renamed from: c  reason: collision with root package name */
        float f57879c;

        c(int i4, float f5, float f6) {
            this.f57877a = i4;
            this.f57878b = f5;
            this.f57879c = f6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewPropertyAnimatorPreHC.java */
    /* loaded from: classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        int f57880a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<c> f57881b;

        d(int i4, ArrayList<c> arrayList) {
            this.f57880a = i4;
            this.f57881b = arrayList;
        }

        boolean a(int i4) {
            ArrayList<c> arrayList;
            if ((this.f57880a & i4) != 0 && (arrayList = this.f57881b) != null) {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    if (this.f57881b.get(i5).f57877a == i4) {
                        this.f57881b.remove(i5);
                        this.f57880a = (i4 ^ (-1)) & this.f57880a;
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(View view) {
        this.f57863c = new WeakReference<>(view);
        this.f57862b = com.nineoldandroids.view.animation.a.G(view);
    }

    private void J(int i4, float f5) {
        float M = M(i4);
        L(i4, M, f5 - M);
    }

    private void K(int i4, float f5) {
        L(i4, M(i4), f5);
    }

    private void L(int i4, float f5, float f6) {
        if (this.f57874n.size() > 0) {
            com.nineoldandroids.animation.a aVar = null;
            Iterator<com.nineoldandroids.animation.a> it2 = this.f57874n.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                com.nineoldandroids.animation.a next = it2.next();
                d dVar = this.f57874n.get(next);
                if (dVar.a(i4) && dVar.f57880a == 0) {
                    aVar = next;
                    break;
                }
            }
            if (aVar != null) {
                aVar.cancel();
            }
        }
        this.f57872l.add(new c(i4, f5, f6));
        View view = this.f57863c.get();
        if (view != null) {
            view.removeCallbacks(this.f57873m);
            view.post(this.f57873m);
        }
    }

    private float M(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 != 8) {
                        if (i4 != 16) {
                            if (i4 != 32) {
                                if (i4 != 64) {
                                    if (i4 != 128) {
                                        if (i4 != 256) {
                                            if (i4 != 512) {
                                                return 0.0f;
                                            }
                                            return this.f57862b.b();
                                        }
                                        return this.f57862b.o();
                                    }
                                    return this.f57862b.n();
                                }
                                return this.f57862b.g();
                            }
                            return this.f57862b.f();
                        }
                        return this.f57862b.e();
                    }
                    return this.f57862b.i();
                }
                return this.f57862b.h();
            }
            return this.f57862b.m();
        }
        return this.f57862b.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i4, float f5) {
        if (i4 == 1) {
            this.f57862b.B(f5);
        } else if (i4 == 2) {
            this.f57862b.C(f5);
        } else if (i4 == 4) {
            this.f57862b.x(f5);
        } else if (i4 == 8) {
            this.f57862b.y(f5);
        } else if (i4 == 16) {
            this.f57862b.u(f5);
        } else if (i4 == 32) {
            this.f57862b.v(f5);
        } else if (i4 == 64) {
            this.f57862b.w(f5);
        } else if (i4 == 128) {
            this.f57862b.D(f5);
        } else if (i4 == 256) {
            this.f57862b.E(f5);
        } else if (i4 != 512) {
        } else {
            this.f57862b.r(f5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        q U = q.U(1.0f);
        ArrayList arrayList = (ArrayList) this.f57872l.clone();
        this.f57872l.clear();
        int size = arrayList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 |= ((c) arrayList.get(i5)).f57877a;
        }
        this.f57874n.put(U, new d(i4, arrayList));
        U.C(this.f57871k);
        U.a(this.f57871k);
        if (this.f57867g) {
            U.m(this.f57866f);
        }
        if (this.f57865e) {
            U.k(this.f57864d);
        }
        if (this.f57869i) {
            U.l(this.f57868h);
        }
        U.q();
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b A(float f5) {
        K(128, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b B(float f5) {
        J(256, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b C(float f5) {
        K(256, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b a(float f5) {
        J(512, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b b(float f5) {
        K(512, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public void d() {
        if (this.f57874n.size() > 0) {
            for (com.nineoldandroids.animation.a aVar : ((HashMap) this.f57874n.clone()).keySet()) {
                aVar.cancel();
            }
        }
        this.f57872l.clear();
        View view = this.f57863c.get();
        if (view != null) {
            view.removeCallbacks(this.f57873m);
        }
    }

    @Override // com.nineoldandroids.view.b
    public long e() {
        if (this.f57865e) {
            return this.f57864d;
        }
        return new q().d();
    }

    @Override // com.nineoldandroids.view.b
    public long f() {
        if (this.f57867g) {
            return this.f57866f;
        }
        return 0L;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b g(float f5) {
        J(16, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b h(float f5) {
        K(16, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b i(float f5) {
        J(32, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b j(float f5) {
        K(32, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b k(float f5) {
        J(64, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b l(float f5) {
        K(64, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b m(float f5) {
        J(4, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b n(float f5) {
        K(4, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b o(float f5) {
        J(8, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b p(float f5) {
        K(8, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b q(long j4) {
        if (j4 >= 0) {
            this.f57865e = true;
            this.f57864d = j4;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j4);
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b r(Interpolator interpolator) {
        this.f57869i = true;
        this.f57868h = interpolator;
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b s(a.InterfaceC0575a interfaceC0575a) {
        this.f57870j = interfaceC0575a;
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b t(long j4) {
        if (j4 >= 0) {
            this.f57867g = true;
            this.f57866f = j4;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j4);
    }

    @Override // com.nineoldandroids.view.b
    public void u() {
        O();
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b v(float f5) {
        J(1, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b w(float f5) {
        K(1, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b x(float f5) {
        J(2, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b y(float f5) {
        K(2, f5);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b z(float f5) {
        J(128, f5);
        return this;
    }
}

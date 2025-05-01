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
/* compiled from: ViewPropertyAnimatorHC.java */
/* loaded from: classes5.dex */
public class c extends com.nineoldandroids.view.b {

    /* renamed from: n  reason: collision with root package name */
    private static final int f57815n = 0;

    /* renamed from: o  reason: collision with root package name */
    private static final int f57816o = 1;

    /* renamed from: p  reason: collision with root package name */
    private static final int f57817p = 2;

    /* renamed from: q  reason: collision with root package name */
    private static final int f57818q = 4;

    /* renamed from: r  reason: collision with root package name */
    private static final int f57819r = 8;

    /* renamed from: s  reason: collision with root package name */
    private static final int f57820s = 16;

    /* renamed from: t  reason: collision with root package name */
    private static final int f57821t = 32;

    /* renamed from: u  reason: collision with root package name */
    private static final int f57822u = 64;

    /* renamed from: v  reason: collision with root package name */
    private static final int f57823v = 128;

    /* renamed from: w  reason: collision with root package name */
    private static final int f57824w = 256;

    /* renamed from: x  reason: collision with root package name */
    private static final int f57825x = 512;

    /* renamed from: y  reason: collision with root package name */
    private static final int f57826y = 511;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<View> f57827b;

    /* renamed from: c  reason: collision with root package name */
    private long f57828c;

    /* renamed from: g  reason: collision with root package name */
    private Interpolator f57832g;

    /* renamed from: d  reason: collision with root package name */
    private boolean f57829d = false;

    /* renamed from: e  reason: collision with root package name */
    private long f57830e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f57831f = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f57833h = false;

    /* renamed from: i  reason: collision with root package name */
    private a.InterfaceC0575a f57834i = null;

    /* renamed from: j  reason: collision with root package name */
    private b f57835j = new b(this, null);

    /* renamed from: k  reason: collision with root package name */
    ArrayList<C0579c> f57836k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private Runnable f57837l = new a();

    /* renamed from: m  reason: collision with root package name */
    private HashMap<com.nineoldandroids.animation.a, d> f57838m = new HashMap<>();

    /* compiled from: ViewPropertyAnimatorHC.java */
    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewPropertyAnimatorHC.java */
    /* loaded from: classes5.dex */
    public class b implements a.InterfaceC0575a, q.g {
        private b() {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void a(com.nineoldandroids.animation.a aVar) {
            if (c.this.f57834i != null) {
                c.this.f57834i.a(aVar);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void b(com.nineoldandroids.animation.a aVar) {
            if (c.this.f57834i != null) {
                c.this.f57834i.b(aVar);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void c(com.nineoldandroids.animation.a aVar) {
            if (c.this.f57834i != null) {
                c.this.f57834i.c(aVar);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void d(com.nineoldandroids.animation.a aVar) {
            if (c.this.f57834i != null) {
                c.this.f57834i.d(aVar);
            }
            c.this.f57838m.remove(aVar);
            if (c.this.f57838m.isEmpty()) {
                c.this.f57834i = null;
            }
        }

        @Override // com.nineoldandroids.animation.q.g
        public void e(q qVar) {
            View view;
            float J = qVar.J();
            d dVar = (d) c.this.f57838m.get(qVar);
            if ((dVar.f57844a & 511) != 0 && (view = (View) c.this.f57827b.get()) != null) {
                view.invalidate();
            }
            ArrayList<C0579c> arrayList = dVar.f57845b;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C0579c c0579c = arrayList.get(i4);
                    c.this.N(c0579c.f57841a, c0579c.f57842b + (c0579c.f57843c * J));
                }
            }
            View view2 = (View) c.this.f57827b.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }

        /* synthetic */ b(c cVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewPropertyAnimatorHC.java */
    /* renamed from: com.nineoldandroids.view.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0579c {

        /* renamed from: a  reason: collision with root package name */
        int f57841a;

        /* renamed from: b  reason: collision with root package name */
        float f57842b;

        /* renamed from: c  reason: collision with root package name */
        float f57843c;

        C0579c(int i4, float f5, float f6) {
            this.f57841a = i4;
            this.f57842b = f5;
            this.f57843c = f6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewPropertyAnimatorHC.java */
    /* loaded from: classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        int f57844a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<C0579c> f57845b;

        d(int i4, ArrayList<C0579c> arrayList) {
            this.f57844a = i4;
            this.f57845b = arrayList;
        }

        boolean a(int i4) {
            ArrayList<C0579c> arrayList;
            if ((this.f57844a & i4) != 0 && (arrayList = this.f57845b) != null) {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    if (this.f57845b.get(i5).f57841a == i4) {
                        this.f57845b.remove(i5);
                        this.f57844a = (i4 ^ (-1)) & this.f57844a;
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(View view) {
        this.f57827b = new WeakReference<>(view);
    }

    private void J(int i4, float f5) {
        float M = M(i4);
        L(i4, M, f5 - M);
    }

    private void K(int i4, float f5) {
        L(i4, M(i4), f5);
    }

    private void L(int i4, float f5, float f6) {
        if (this.f57838m.size() > 0) {
            com.nineoldandroids.animation.a aVar = null;
            Iterator<com.nineoldandroids.animation.a> it2 = this.f57838m.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                com.nineoldandroids.animation.a next = it2.next();
                d dVar = this.f57838m.get(next);
                if (dVar.a(i4) && dVar.f57844a == 0) {
                    aVar = next;
                    break;
                }
            }
            if (aVar != null) {
                aVar.cancel();
            }
        }
        this.f57836k.add(new C0579c(i4, f5, f6));
        View view = this.f57827b.get();
        if (view != null) {
            view.removeCallbacks(this.f57837l);
            view.post(this.f57837l);
        }
    }

    private float M(int i4) {
        View view = this.f57827b.get();
        if (view != null) {
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
                                                return view.getAlpha();
                                            }
                                            return view.getY();
                                        }
                                        return view.getX();
                                    }
                                    return view.getRotationY();
                                }
                                return view.getRotationX();
                            }
                            return view.getRotation();
                        }
                        return view.getScaleY();
                    }
                    return view.getScaleX();
                }
                return view.getTranslationY();
            }
            return view.getTranslationX();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i4, float f5) {
        View view = this.f57827b.get();
        if (view != null) {
            if (i4 == 1) {
                view.setTranslationX(f5);
            } else if (i4 == 2) {
                view.setTranslationY(f5);
            } else if (i4 == 4) {
                view.setScaleX(f5);
            } else if (i4 == 8) {
                view.setScaleY(f5);
            } else if (i4 == 16) {
                view.setRotation(f5);
            } else if (i4 == 32) {
                view.setRotationX(f5);
            } else if (i4 == 64) {
                view.setRotationY(f5);
            } else if (i4 == 128) {
                view.setX(f5);
            } else if (i4 == 256) {
                view.setY(f5);
            } else if (i4 != 512) {
            } else {
                view.setAlpha(f5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        q U = q.U(1.0f);
        ArrayList arrayList = (ArrayList) this.f57836k.clone();
        this.f57836k.clear();
        int size = arrayList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 |= ((C0579c) arrayList.get(i5)).f57841a;
        }
        this.f57838m.put(U, new d(i4, arrayList));
        U.C(this.f57835j);
        U.a(this.f57835j);
        if (this.f57831f) {
            U.m(this.f57830e);
        }
        if (this.f57829d) {
            U.k(this.f57828c);
        }
        if (this.f57833h) {
            U.l(this.f57832g);
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
        if (this.f57838m.size() > 0) {
            for (com.nineoldandroids.animation.a aVar : ((HashMap) this.f57838m.clone()).keySet()) {
                aVar.cancel();
            }
        }
        this.f57836k.clear();
        View view = this.f57827b.get();
        if (view != null) {
            view.removeCallbacks(this.f57837l);
        }
    }

    @Override // com.nineoldandroids.view.b
    public long e() {
        if (this.f57829d) {
            return this.f57828c;
        }
        return new q().d();
    }

    @Override // com.nineoldandroids.view.b
    public long f() {
        if (this.f57831f) {
            return this.f57830e;
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
            this.f57829d = true;
            this.f57828c = j4;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j4);
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b r(Interpolator interpolator) {
        this.f57833h = true;
        this.f57832g = interpolator;
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b s(a.InterfaceC0575a interfaceC0575a) {
        this.f57834i = interfaceC0575a;
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b t(long j4) {
        if (j4 >= 0) {
            this.f57831f = true;
            this.f57830e = j4;
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

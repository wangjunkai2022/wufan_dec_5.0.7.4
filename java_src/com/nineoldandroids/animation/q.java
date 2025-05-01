package com.nineoldandroids.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.nineoldandroids.animation.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ValueAnimator.java */
/* loaded from: classes5.dex */
public class q extends com.nineoldandroids.animation.a {
    static final int A = 2;
    private static ThreadLocal<f> B = new ThreadLocal<>();
    private static final ThreadLocal<ArrayList<q>> C = new a();
    private static final ThreadLocal<ArrayList<q>> D = new b();
    private static final ThreadLocal<ArrayList<q>> E = new c();
    private static final ThreadLocal<ArrayList<q>> F = new d();
    private static final ThreadLocal<ArrayList<q>> G = new e();
    private static final Interpolator H = new AccelerateDecelerateInterpolator();
    private static final p I = new h();
    private static final p J = new com.nineoldandroids.animation.f();
    private static long K = 10;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = -1;

    /* renamed from: v  reason: collision with root package name */
    private static final long f57764v = 10;

    /* renamed from: w  reason: collision with root package name */
    static final int f57765w = 0;

    /* renamed from: x  reason: collision with root package name */
    static final int f57766x = 1;

    /* renamed from: y  reason: collision with root package name */
    static final int f57767y = 0;

    /* renamed from: z  reason: collision with root package name */
    static final int f57768z = 1;

    /* renamed from: c  reason: collision with root package name */
    long f57769c;

    /* renamed from: i  reason: collision with root package name */
    private long f57775i;

    /* renamed from: t  reason: collision with root package name */
    n[] f57786t;

    /* renamed from: u  reason: collision with root package name */
    HashMap<String, n> f57787u;

    /* renamed from: d  reason: collision with root package name */
    long f57770d = -1;

    /* renamed from: e  reason: collision with root package name */
    private boolean f57771e = false;

    /* renamed from: f  reason: collision with root package name */
    private int f57772f = 0;

    /* renamed from: g  reason: collision with root package name */
    private float f57773g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f57774h = false;

    /* renamed from: j  reason: collision with root package name */
    int f57776j = 0;

    /* renamed from: k  reason: collision with root package name */
    private boolean f57777k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f57778l = false;

    /* renamed from: m  reason: collision with root package name */
    boolean f57779m = false;

    /* renamed from: n  reason: collision with root package name */
    private long f57780n = 300;

    /* renamed from: o  reason: collision with root package name */
    private long f57781o = 0;

    /* renamed from: p  reason: collision with root package name */
    private int f57782p = 0;

    /* renamed from: q  reason: collision with root package name */
    private int f57783q = 1;

    /* renamed from: r  reason: collision with root package name */
    private Interpolator f57784r = H;

    /* renamed from: s  reason: collision with root package name */
    private ArrayList<g> f57785s = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ValueAnimator.java */
    /* loaded from: classes5.dex */
    public static class a extends ThreadLocal<ArrayList<q>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList<q> initialValue() {
            return new ArrayList<>();
        }
    }

    /* compiled from: ValueAnimator.java */
    /* loaded from: classes5.dex */
    static class b extends ThreadLocal<ArrayList<q>> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList<q> initialValue() {
            return new ArrayList<>();
        }
    }

    /* compiled from: ValueAnimator.java */
    /* loaded from: classes5.dex */
    static class c extends ThreadLocal<ArrayList<q>> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList<q> initialValue() {
            return new ArrayList<>();
        }
    }

    /* compiled from: ValueAnimator.java */
    /* loaded from: classes5.dex */
    static class d extends ThreadLocal<ArrayList<q>> {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList<q> initialValue() {
            return new ArrayList<>();
        }
    }

    /* compiled from: ValueAnimator.java */
    /* loaded from: classes5.dex */
    static class e extends ThreadLocal<ArrayList<q>> {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList<q> initialValue() {
            return new ArrayList<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ValueAnimator.java */
    /* loaded from: classes5.dex */
    public static class f extends Handler {
        private f() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z4;
            ArrayList arrayList = (ArrayList) q.C.get();
            ArrayList arrayList2 = (ArrayList) q.E.get();
            int i4 = message.what;
            if (i4 == 0) {
                ArrayList arrayList3 = (ArrayList) q.D.get();
                z4 = arrayList.size() <= 0 && arrayList2.size() <= 0;
                while (arrayList3.size() > 0) {
                    ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                    arrayList3.clear();
                    int size = arrayList4.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        q qVar = (q) arrayList4.get(i5);
                        if (qVar.f57781o == 0) {
                            qVar.m0();
                        } else {
                            arrayList2.add(qVar);
                        }
                    }
                }
            } else if (i4 != 1) {
                return;
            } else {
                z4 = true;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            ArrayList arrayList5 = (ArrayList) q.G.get();
            ArrayList arrayList6 = (ArrayList) q.F.get();
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                q qVar2 = (q) arrayList2.get(i6);
                if (qVar2.H(currentAnimationTimeMillis)) {
                    arrayList5.add(qVar2);
                }
            }
            int size3 = arrayList5.size();
            if (size3 > 0) {
                for (int i7 = 0; i7 < size3; i7++) {
                    q qVar3 = (q) arrayList5.get(i7);
                    qVar3.m0();
                    qVar3.f57777k = true;
                    arrayList2.remove(qVar3);
                }
                arrayList5.clear();
            }
            int size4 = arrayList.size();
            int i8 = 0;
            while (i8 < size4) {
                q qVar4 = (q) arrayList.get(i8);
                if (qVar4.E(currentAnimationTimeMillis)) {
                    arrayList6.add(qVar4);
                }
                if (arrayList.size() == size4) {
                    i8++;
                } else {
                    size4--;
                    arrayList6.remove(qVar4);
                }
            }
            if (arrayList6.size() > 0) {
                for (int i9 = 0; i9 < arrayList6.size(); i9++) {
                    ((q) arrayList6.get(i9)).I();
                }
                arrayList6.clear();
            }
            if (z4) {
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    return;
                }
                sendEmptyMessageDelayed(1, Math.max(0L, q.K - (AnimationUtils.currentAnimationTimeMillis() - currentAnimationTimeMillis)));
            }
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* compiled from: ValueAnimator.java */
    /* loaded from: classes5.dex */
    public interface g {
        void e(q qVar);
    }

    public static void F() {
        C.get().clear();
        D.get().clear();
        E.get().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H(long j4) {
        if (!this.f57774h) {
            this.f57774h = true;
            this.f57775i = j4;
            return false;
        }
        long j5 = j4 - this.f57775i;
        long j6 = this.f57781o;
        if (j5 > j6) {
            this.f57769c = j4 - (j5 - j6);
            this.f57776j = 1;
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        ArrayList<a.InterfaceC0575a> arrayList;
        C.get().remove(this);
        D.get().remove(this);
        E.get().remove(this);
        this.f57776j = 0;
        if (this.f57777k && (arrayList = this.f57659b) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((a.InterfaceC0575a) arrayList2.get(i4)).d(this);
            }
        }
        this.f57777k = false;
        this.f57778l = false;
    }

    public static int M() {
        return C.get().size();
    }

    public static long O() {
        return K;
    }

    public static q U(float... fArr) {
        q qVar = new q();
        qVar.e0(fArr);
        return qVar;
    }

    public static q V(int... iArr) {
        q qVar = new q();
        qVar.g0(iArr);
        return qVar;
    }

    public static q W(p pVar, Object... objArr) {
        q qVar = new q();
        qVar.h0(objArr);
        qVar.d0(pVar);
        return qVar;
    }

    public static q X(n... nVarArr) {
        q qVar = new q();
        qVar.k0(nVarArr);
        return qVar;
    }

    public static void f0(long j4) {
        K = j4;
    }

    private void l0(boolean z4) {
        if (Looper.myLooper() != null) {
            this.f57771e = z4;
            this.f57772f = 0;
            this.f57776j = 0;
            this.f57778l = true;
            this.f57774h = false;
            D.get().add(this);
            if (this.f57781o == 0) {
                b0(N());
                this.f57776j = 0;
                this.f57777k = true;
                ArrayList<a.InterfaceC0575a> arrayList = this.f57659b;
                if (arrayList != null) {
                    ArrayList arrayList2 = (ArrayList) arrayList.clone();
                    int size = arrayList2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((a.InterfaceC0575a) arrayList2.get(i4)).c(this);
                    }
                }
            }
            f fVar = B.get();
            if (fVar == null) {
                fVar = new f(null);
                B.set(fVar);
            }
            fVar.sendEmptyMessage(0);
            return;
        }
        throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        ArrayList<a.InterfaceC0575a> arrayList;
        T();
        C.get().add(this);
        if (this.f57781o <= 0 || (arrayList = this.f57659b) == null) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) arrayList.clone();
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((a.InterfaceC0575a) arrayList2.get(i4)).c(this);
        }
    }

    public void C(g gVar) {
        if (this.f57785s == null) {
            this.f57785s = new ArrayList<>();
        }
        this.f57785s.add(gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(float f5) {
        float interpolation = this.f57784r.getInterpolation(f5);
        this.f57773g = interpolation;
        int length = this.f57786t.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f57786t[i4].a(interpolation);
        }
        ArrayList<g> arrayList = this.f57785s;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f57785s.get(i5).e(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean E(long r10) {
        /*
            r9 = this;
            int r0 = r9.f57776j
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L1a
            r9.f57776j = r3
            long r4 = r9.f57770d
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L12
            r9.f57769c = r10
            goto L1a
        L12:
            long r4 = r10 - r4
            r9.f57769c = r4
            r4 = -1
            r9.f57770d = r4
        L1a:
            int r0 = r9.f57776j
            r4 = 2
            r5 = 0
            if (r0 == r3) goto L23
            if (r0 == r4) goto L23
            goto L82
        L23:
            long r6 = r9.f57780n
            r0 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 <= 0) goto L32
            long r1 = r9.f57769c
            long r10 = r10 - r1
            float r10 = (float) r10
            float r11 = (float) r6
            float r10 = r10 / r11
            goto L34
        L32:
            r10 = 1065353216(0x3f800000, float:1.0)
        L34:
            int r11 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r11 < 0) goto L77
            int r11 = r9.f57772f
            int r1 = r9.f57782p
            if (r11 < r1) goto L47
            r11 = -1
            if (r1 != r11) goto L42
            goto L47
        L42:
            float r10 = java.lang.Math.min(r10, r0)
            goto L78
        L47:
            java.util.ArrayList<com.nineoldandroids.animation.a$a> r11 = r9.f57659b
            if (r11 == 0) goto L60
            int r11 = r11.size()
            r1 = 0
        L50:
            if (r1 >= r11) goto L60
            java.util.ArrayList<com.nineoldandroids.animation.a$a> r2 = r9.f57659b
            java.lang.Object r2 = r2.get(r1)
            com.nineoldandroids.animation.a$a r2 = (com.nineoldandroids.animation.a.InterfaceC0575a) r2
            r2.b(r9)
            int r1 = r1 + 1
            goto L50
        L60:
            int r11 = r9.f57783q
            if (r11 != r4) goto L69
            boolean r11 = r9.f57771e
            r11 = r11 ^ r3
            r9.f57771e = r11
        L69:
            int r11 = r9.f57772f
            int r1 = (int) r10
            int r11 = r11 + r1
            r9.f57772f = r11
            float r10 = r10 % r0
            long r1 = r9.f57769c
            long r3 = r9.f57780n
            long r1 = r1 + r3
            r9.f57769c = r1
        L77:
            r3 = 0
        L78:
            boolean r11 = r9.f57771e
            if (r11 == 0) goto L7e
            float r10 = r0 - r10
        L7e:
            r9.D(r10)
            r5 = r3
        L82:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nineoldandroids.animation.q.E(long):boolean");
    }

    @Override // com.nineoldandroids.animation.a
    /* renamed from: G */
    public q clone() {
        q qVar = (q) super.clone();
        ArrayList<g> arrayList = this.f57785s;
        if (arrayList != null) {
            qVar.f57785s = new ArrayList<>();
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                qVar.f57785s.add(arrayList.get(i4));
            }
        }
        qVar.f57770d = -1L;
        qVar.f57771e = false;
        qVar.f57772f = 0;
        qVar.f57779m = false;
        qVar.f57776j = 0;
        qVar.f57774h = false;
        n[] nVarArr = this.f57786t;
        if (nVarArr != null) {
            int length = nVarArr.length;
            qVar.f57786t = new n[length];
            qVar.f57787u = new HashMap<>(length);
            for (int i5 = 0; i5 < length; i5++) {
                n clone = nVarArr[i5].clone();
                qVar.f57786t[i5] = clone;
                qVar.f57787u.put(clone.f(), clone);
            }
        }
        return qVar;
    }

    public float J() {
        return this.f57773g;
    }

    public Object K() {
        n[] nVarArr = this.f57786t;
        if (nVarArr == null || nVarArr.length <= 0) {
            return null;
        }
        return nVarArr[0].c();
    }

    public Object L(String str) {
        n nVar = this.f57787u.get(str);
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public long N() {
        if (!this.f57779m || this.f57776j == 0) {
            return 0L;
        }
        return AnimationUtils.currentAnimationTimeMillis() - this.f57769c;
    }

    public Interpolator P() {
        return this.f57784r;
    }

    public int Q() {
        return this.f57782p;
    }

    public int R() {
        return this.f57783q;
    }

    public n[] S() {
        return this.f57786t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T() {
        if (this.f57779m) {
            return;
        }
        int length = this.f57786t.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f57786t[i4].g();
        }
        this.f57779m = true;
    }

    public void Y() {
        ArrayList<g> arrayList = this.f57785s;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
        this.f57785s = null;
    }

    public void Z(g gVar) {
        ArrayList<g> arrayList = this.f57785s;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(gVar);
        if (this.f57785s.size() == 0) {
            this.f57785s = null;
        }
    }

    public void a0() {
        this.f57771e = !this.f57771e;
        if (this.f57776j == 1) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f57769c = currentAnimationTimeMillis - (this.f57780n - (currentAnimationTimeMillis - this.f57769c));
            return;
        }
        l0(true);
    }

    public void b0(long j4) {
        T();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.f57776j != 1) {
            this.f57770d = j4;
            this.f57776j = 2;
        }
        this.f57769c = currentAnimationTimeMillis - j4;
        E(currentAnimationTimeMillis);
    }

    @Override // com.nineoldandroids.animation.a
    public void c() {
        if (!C.get().contains(this) && !D.get().contains(this)) {
            this.f57774h = false;
            m0();
        } else if (!this.f57779m) {
            T();
        }
        int i4 = this.f57782p;
        if (i4 > 0 && (i4 & 1) == 1) {
            D(0.0f);
        } else {
            D(1.0f);
        }
        I();
    }

    @Override // com.nineoldandroids.animation.a
    /* renamed from: c0 */
    public q k(long j4) {
        if (j4 >= 0) {
            this.f57780n = j4;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j4);
    }

    @Override // com.nineoldandroids.animation.a
    public void cancel() {
        ArrayList<a.InterfaceC0575a> arrayList;
        if (this.f57776j != 0 || D.get().contains(this) || E.get().contains(this)) {
            if (this.f57777k && (arrayList = this.f57659b) != null) {
                Iterator it2 = ((ArrayList) arrayList.clone()).iterator();
                while (it2.hasNext()) {
                    ((a.InterfaceC0575a) it2.next()).a(this);
                }
            }
            I();
        }
    }

    @Override // com.nineoldandroids.animation.a
    public long d() {
        return this.f57780n;
    }

    public void d0(p pVar) {
        n[] nVarArr;
        if (pVar == null || (nVarArr = this.f57786t) == null || nVarArr.length <= 0) {
            return;
        }
        nVarArr[0].q(pVar);
    }

    public void e0(float... fArr) {
        if (fArr == null || fArr.length == 0) {
            return;
        }
        n[] nVarArr = this.f57786t;
        if (nVarArr == null || nVarArr.length == 0) {
            k0(n.i("", fArr));
        } else {
            nVarArr[0].r(fArr);
        }
        this.f57779m = false;
    }

    @Override // com.nineoldandroids.animation.a
    public long f() {
        return this.f57781o;
    }

    @Override // com.nineoldandroids.animation.a
    public boolean g() {
        return this.f57776j == 1 || this.f57777k;
    }

    public void g0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        n[] nVarArr = this.f57786t;
        if (nVarArr == null || nVarArr.length == 0) {
            k0(n.k("", iArr));
        } else {
            nVarArr[0].s(iArr);
        }
        this.f57779m = false;
    }

    @Override // com.nineoldandroids.animation.a
    public boolean h() {
        return this.f57778l;
    }

    public void h0(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        n[] nVarArr = this.f57786t;
        if (nVarArr == null || nVarArr.length == 0) {
            k0(n.o("", null, objArr));
        } else {
            nVarArr[0].u(objArr);
        }
        this.f57779m = false;
    }

    public void i0(int i4) {
        this.f57782p = i4;
    }

    public void j0(int i4) {
        this.f57783q = i4;
    }

    public void k0(n... nVarArr) {
        int length = nVarArr.length;
        this.f57786t = nVarArr;
        this.f57787u = new HashMap<>(length);
        for (n nVar : nVarArr) {
            this.f57787u.put(nVar.f(), nVar);
        }
        this.f57779m = false;
    }

    @Override // com.nineoldandroids.animation.a
    public void l(Interpolator interpolator) {
        if (interpolator != null) {
            this.f57784r = interpolator;
        } else {
            this.f57784r = new LinearInterpolator();
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void m(long j4) {
        this.f57781o = j4;
    }

    @Override // com.nineoldandroids.animation.a
    public void q() {
        l0(false);
    }

    public String toString() {
        String str = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f57786t != null) {
            for (int i4 = 0; i4 < this.f57786t.length; i4++) {
                str = str + "\n    " + this.f57786t[i4].toString();
            }
        }
        return str;
    }
}

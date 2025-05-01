package com.aggmoread.sdk.z.c.a.a.d.a.d;

import android.app.Activity;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public abstract class i extends com.aggmoread.sdk.z.c.a.a.d.b.a implements com.aggmoread.sdk.z.c.a.a.c.r.a {

    /* renamed from: i  reason: collision with root package name */
    protected AtomicBoolean f2877i;

    /* renamed from: j  reason: collision with root package name */
    protected Map<String, Object> f2878j;

    /* renamed from: k  reason: collision with root package name */
    protected Object[] f2879k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f2880l;

    /* renamed from: m  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.r.d f2881m;

    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.v();
        }
    }

    /* loaded from: classes2.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f2883b;

        b(Activity activity) {
            this.f2883b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.b(this.f2883b);
        }
    }

    /* loaded from: classes2.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f2885b;

        c(ArrayList arrayList) {
            this.f2885b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((com.aggmoread.sdk.z.c.a.a.c.r.b) i.this.f3244c.f3263g).onAdLoaded(this.f2885b);
        }
    }

    public i(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
        this.f2877i = new AtomicBoolean();
        this.f2878j = new HashMap();
        this.f2879k = com.aggmoread.sdk.z.c.a.a.b.b();
        this.f2880l = false;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(int i4) {
        if (com.aggmoread.sdk.z.c.a.a.e.m.g(this.f3245d)) {
            c(i4);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(int i4, int i5, String str) {
        if (com.aggmoread.sdk.z.c.a.a.e.m.g(this.f3245d)) {
            b(i4, i5, str);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.r.a
    public void a(Activity activity) {
        if (com.aggmoread.sdk.z.c.a.a.e.m.a()) {
            b(activity);
        } else {
            com.aggmoread.sdk.z.c.a.a.e.n.a(new b(activity));
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.r.a
    public void a(com.aggmoread.sdk.z.c.a.a.c.r.d dVar) {
        this.f2881m = dVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Map<String, Object> map) {
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(1).b();
        com.aggmoread.sdk.z.c.a.a.c.r.d dVar = this.f2881m;
        if (dVar != null) {
            dVar.onVideoComplete();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.r.a
    public void b() {
        if (com.aggmoread.sdk.z.c.a.a.e.m.a()) {
            v();
        } else {
            com.aggmoread.sdk.z.c.a.a.e.n.a(new a());
        }
    }

    protected void b(Activity activity) {
        v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
        this.f3248g.a();
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(8).a(iVar).b();
        if (this.f2880l) {
            c(iVar);
        } else if (this.f3245d.l()) {
        } else {
            this.f3244c.f3263g.a(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L1b
            java.lang.String r2 = "reward.ERROR_CODE"
            java.lang.Object r2 = r6.get(r2)
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L1b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 1001007000(0x3baa2798, float:0.005192708)
            if (r3 != r2) goto L1b
            r2 = 0
            goto L1c
        L1b:
            r2 = 1
        L1c:
            if (r2 == 0) goto L2f
            com.aggmoread.sdk.z.c.a.a.d.b.k r2 = new com.aggmoread.sdk.z.c.a.a.d.b.k
            com.aggmoread.sdk.z.c.a.a.d.b.d r3 = r5.f3244c
            com.aggmoread.sdk.z.c.a.a.d.b.e r4 = r5.f3245d
            r2.<init>(r3, r4)
            r3 = 7
            com.aggmoread.sdk.z.c.a.a.d.b.k r2 = r2.a(r3)
            r2.b()
        L2f:
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.f2877i
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L54
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "reward "
            r0.append(r1)
            com.aggmoread.sdk.z.c.a.a.c.r.d r1 = r5.f2881m
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.aggmoread.sdk.z.c.a.a.e.e.a(r0)
            com.aggmoread.sdk.z.c.a.a.c.r.d r0 = r5.f2881m
            if (r0 == 0) goto L54
            r0.onReward(r6)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.z.c.a.a.d.a.d.i.b(java.util.Map):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(8).a(iVar).b();
        com.aggmoread.sdk.z.c.a.a.c.r.d dVar = this.f2881m;
        if (dVar != null) {
            dVar.a(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(int i4) {
        this.f2880l = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(3).a(k.b.B, Integer.valueOf(i4)).a(k.b.f3451q, com.aggmoread.sdk.z.c.a.a.e.m.a(this.f3244c, this.f3245d, this.f3243b)).b();
        if (this.f3244c.f3263g instanceof com.aggmoread.sdk.z.c.a.a.c.r.b) {
            com.aggmoread.sdk.z.c.a.a.e.n.a(new c(arrayList));
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.r.a
    public void destroy() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public String getID() {
        return this.f3244c.f3259c;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public Map<String, Object> h() {
        return com.aggmoread.sdk.z.c.a.a.e.m.a(this.f3243b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        com.aggmoread.sdk.z.c.a.a.c.r.d dVar;
        com.aggmoread.sdk.z.c.a.a.d.b.k kVar = new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d);
        boolean a5 = kVar.a(this.f3245d, null, 0L, this.f2879k);
        kVar.b();
        if (a5 && (dVar = this.f2881m) != null) {
            dVar.onAdClicked();
        }
        com.aggmoread.sdk.z.c.a.a.d.b.l.a((Object) this.f2879k, false, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r() {
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(4).b();
        com.aggmoread.sdk.z.c.a.a.c.r.d dVar = this.f2881m;
        if (dVar != null) {
            dVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s() {
        com.aggmoread.sdk.z.c.a.a.e.e.a("exposure");
        com.aggmoread.sdk.z.c.a.a.e.c.f3483f = null;
        a((com.aggmoread.sdk.z.c.a.a.c.e) this.f2881m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t() {
        com.aggmoread.sdk.z.c.a.a.c.r.d dVar = this.f2881m;
        if (dVar != null) {
            dVar.onAdShow();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void u() {
        if (this.f2880l) {
            com.aggmoread.sdk.z.c.a.a.c.f fVar = this.f3244c.f3263g;
            if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.r.b) {
                ((com.aggmoread.sdk.z.c.a.a.c.r.b) fVar).onAdVideoCached();
            }
        }
    }

    protected abstract void v();
}

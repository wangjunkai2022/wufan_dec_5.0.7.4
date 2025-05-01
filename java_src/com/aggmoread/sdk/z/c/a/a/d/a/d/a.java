package com.aggmoread.sdk.z.c.a.a.d.a.d;

import android.view.View;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public abstract class a extends com.aggmoread.sdk.z.c.a.a.d.b.a implements com.aggmoread.sdk.z.c.a.a.c.m.a {

    /* renamed from: i  reason: collision with root package name */
    protected boolean f2814i;

    /* renamed from: j  reason: collision with root package name */
    protected com.aggmoread.sdk.z.c.a.a.c.m.c f2815j;

    /* renamed from: k  reason: collision with root package name */
    protected AtomicBoolean f2816k;

    /* renamed from: l  reason: collision with root package name */
    public Object[] f2817l;

    /* renamed from: m  reason: collision with root package name */
    protected WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> f2818m;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class RunnableC0098a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f2819b;

        RunnableC0098a(ArrayList arrayList) {
            this.f2819b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((com.aggmoread.sdk.z.c.a.a.c.m.b) a.this.f3244c.f3263g).onAdLoaded(this.f2819b);
        }
    }

    public a(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
        this.f2814i = false;
        this.f2816k = new AtomicBoolean();
        this.f2817l = com.aggmoread.sdk.z.c.a.a.b.b();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public final void a(int i4) {
        if (com.aggmoread.sdk.z.c.a.a.e.m.g(this.f3245d)) {
            c(i4);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public final void a(int i4, int i5, String str) {
        if (com.aggmoread.sdk.z.c.a.a.e.m.g(this.f3245d)) {
            b(i4, i5, str);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.m.a
    public void a(com.aggmoread.sdk.z.c.a.a.c.m.c cVar) {
        this.f2815j = cVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(View[] viewArr) {
        WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> weakReference = this.f2818m;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        com.aggmoread.sdk.z.c.a.a.e.e.a("ban apy");
        com.aggmoread.sdk.z.c.a.a.d.b.l.a(this.f3244c.f3258b, this.f2817l, com.aggmoread.sdk.z.c.a.a.c.i.BANNER, this.f2818m.get(), viewArr, null, null, Integer.valueOf(this.f3245d.f()));
        com.aggmoread.sdk.z.c.a.a.d.b.l.b(this.f3244c.f3258b, this.f3245d.e(), this.f3245d.b());
        byte[] b5 = this.f3244c.f3274r.b();
        if (b5 != null) {
            com.aggmoread.sdk.z.c.a.a.d.b.l.a(this.f3244c.f3258b, b5);
        }
        com.aggmoread.sdk.z.c.a.a.d.b.l.a((Object) this.f2817l, true, true);
        com.aggmoread.sdk.z.c.a.a.d.b.l.a(this.f2817l, this.f3245d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
        com.aggmoread.sdk.z.c.a.a.c.f fVar;
        this.f3248g.a();
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(8).a(iVar).b();
        if (this.f2814i) {
            fVar = this.f2815j;
            if (fVar == null) {
                return;
            }
        } else if (this.f3245d.l()) {
            return;
        } else {
            fVar = this.f3244c.f3263g;
        }
        fVar.a(iVar);
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
        com.aggmoread.sdk.z.c.a.a.c.m.c cVar;
        com.aggmoread.sdk.z.c.a.a.d.b.l.a((Object) this.f2817l, false, true);
        com.aggmoread.sdk.z.c.a.a.d.b.k kVar = new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d);
        com.aggmoread.sdk.z.c.a.a.d.b.e eVar = this.f3245d;
        WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> weakReference = this.f2818m;
        boolean a5 = kVar.a(eVar, weakReference == null ? null : weakReference.get(), 0L, this.f2817l);
        kVar.b();
        if (!a5 || (cVar = this.f2815j) == null) {
            return;
        }
        cVar.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r() {
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(4).b();
        com.aggmoread.sdk.z.c.a.a.c.m.c cVar = this.f2815j;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s() {
        com.aggmoread.sdk.z.c.a.a.c.m.c cVar = this.f2815j;
        if (cVar != null) {
            cVar.onADCloseOverlay();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t() {
        com.aggmoread.sdk.z.c.a.a.e.e.a("onAdExposure");
        a((com.aggmoread.sdk.z.c.a.a.c.e) this.f2815j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void u() {
        com.aggmoread.sdk.z.c.a.a.c.m.c cVar = this.f2815j;
        if (cVar != null) {
            cVar.onADLeftApplication();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v() {
        this.f2814i = true;
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(3).a(k.b.f3451q, com.aggmoread.sdk.z.c.a.a.e.m.a(this.f3244c, this.f3245d, this.f3243b)).b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        if (this.f3244c.f3263g instanceof com.aggmoread.sdk.z.c.a.a.c.m.b) {
            com.aggmoread.sdk.z.c.a.a.e.n.a(new RunnableC0098a(arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void w() {
        com.aggmoread.sdk.z.c.a.a.c.m.c cVar = this.f2815j;
        if (cVar != null) {
            cVar.onADOpenOverlay();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x() {
        com.aggmoread.sdk.z.c.a.a.c.m.c cVar = this.f2815j;
        if (cVar != null) {
            cVar.onAdShow();
        }
    }
}

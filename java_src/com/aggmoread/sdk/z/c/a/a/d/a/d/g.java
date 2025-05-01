package com.aggmoread.sdk.z.c.a.a.d.a.d;

import com.aggmoread.sdk.z.c.a.a.d.b.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class g extends com.aggmoread.sdk.z.c.a.a.d.b.a implements com.aggmoread.sdk.z.c.a.a.c.q.b {

    /* renamed from: i  reason: collision with root package name */
    protected boolean f2860i;

    /* renamed from: j  reason: collision with root package name */
    protected Object[] f2861j;

    /* renamed from: k  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.q.a f2862k;

    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f2863b;

        a(List list) {
            this.f2863b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((com.aggmoread.sdk.z.c.a.a.c.q.c) g.this.f3244c.f3263g).onAdLoaded(this.f2863b);
        }
    }

    /* loaded from: classes2.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.i f2865b;

        b(com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
            this.f2865b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f3244c.f3263g.a(this.f2865b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.i f2867b;

        c(com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
            this.f2867b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f2862k.a(this.f2867b);
        }
    }

    /* loaded from: classes2.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((com.aggmoread.sdk.z.c.a.a.c.q.c) g.this.f3244c.f3263g).onAdVideoCached();
        }
    }

    /* loaded from: classes2.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f2862k.a();
        }
    }

    /* loaded from: classes2.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f2862k.onADLeftApplication();
        }
    }

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class RunnableC0101g implements Runnable {
        RunnableC0101g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f2862k.onAdShow();
        }
    }

    /* loaded from: classes2.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f2862k.onAdClicked();
        }
    }

    public g(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
        this.f2860i = false;
        this.f2861j = com.aggmoread.sdk.z.c.a.a.b.b();
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

    @Override // com.aggmoread.sdk.z.c.a.a.c.q.b
    public void a(com.aggmoread.sdk.z.c.a.a.c.q.a aVar) {
        this.f2862k = aVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.q.b
    public void b() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("当前传入Activity为空");
        c(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002009, "show failed,当前传入Activity为空"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(8).a(iVar).b();
        if (this.f2860i) {
            c(iVar);
        } else if (this.f3245d.l()) {
        } else {
            com.aggmoread.sdk.z.c.a.a.e.n.a(new b(iVar));
        }
    }

    protected void c(com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
        if (this.f2862k != null) {
            com.aggmoread.sdk.z.c.a.a.e.n.a(new c(iVar));
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public String getID() {
        return this.f3244c.f3259c;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public Map<String, Object> h() {
        return com.aggmoread.sdk.z.c.a.a.e.m.a(this.f3243b);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void p() {
        if (m()) {
            return;
        }
        super.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        if (this.f2862k != null) {
            com.aggmoread.sdk.z.c.a.a.e.n.a(new f());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r() {
        com.aggmoread.sdk.z.c.a.a.d.b.l.a((Object) this.f2861j, false, true);
        com.aggmoread.sdk.z.c.a.a.d.b.k kVar = new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d);
        boolean a5 = kVar.a(this.f3245d, null, 0L, this.f2861j);
        kVar.b();
        if (!a5 || this.f2862k == null) {
            return;
        }
        com.aggmoread.sdk.z.c.a.a.e.n.a(new h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s() {
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(4).b();
        if (this.f2862k != null) {
            com.aggmoread.sdk.z.c.a.a.e.n.a(new e());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t() {
        com.aggmoread.sdk.z.c.a.a.e.e.a("exposure");
        a((com.aggmoread.sdk.z.c.a.a.c.e) this.f2862k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void u() {
        this.f2860i = true;
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(3).a(k.b.f3451q, com.aggmoread.sdk.z.c.a.a.e.m.a(this.f3244c, this.f3245d, this.f3243b)).b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        if (this.f3244c.f3263g instanceof com.aggmoread.sdk.z.c.a.a.c.q.c) {
            com.aggmoread.sdk.z.c.a.a.e.n.a(new a(arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v() {
        if (this.f2862k != null) {
            com.aggmoread.sdk.z.c.a.a.e.n.a(new RunnableC0101g());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void w() {
        if (this.f2860i && (this.f3244c.f3263g instanceof com.aggmoread.sdk.z.c.a.a.c.q.c)) {
            com.aggmoread.sdk.z.c.a.a.e.n.a(new d());
        }
    }
}

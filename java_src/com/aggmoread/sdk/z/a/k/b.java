package com.aggmoread.sdk.z.a.k;

import android.view.View;
import com.aggmoread.sdk.z.a.g.b;
import com.aggmoread.sdk.z.a.g.e;
import com.aggmoread.sdk.z.a.g.g;
import com.aggmoread.sdk.z.a.k.c;
import com.aggmoread.sdk.z.a.m.l;
/* loaded from: classes2.dex */
public class b extends c {

    /* renamed from: l  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.k.a f2265l;

    /* renamed from: m  reason: collision with root package name */
    private b.a.C0056a f2266m;

    /* renamed from: n  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.g.b f2267n;

    /* renamed from: o  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.r.a f2268o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements c.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a.C0056a f2269a;

        a(b.a.C0056a c0056a) {
            this.f2269a = c0056a;
        }

        @Override // com.aggmoread.sdk.z.a.k.c.k
        public void a() {
            if (b.this.f2265l != null) {
                b.this.f2265l.b(b.this);
            }
            b.a.C0056a c0056a = this.f2269a;
            if (c0056a != null) {
                com.aggmoread.sdk.z.a.q.a.a("onAdExposure", c0056a.q());
            }
        }

        @Override // com.aggmoread.sdk.z.a.k.c.k
        public void a(String str) {
            if (b.this.f2265l != null) {
                b.this.f2265l.a(b.this, new e(50003, str));
            }
        }

        @Override // com.aggmoread.sdk.z.a.k.c.k
        public void b() {
            if (b.this.f2265l != null) {
                b.this.f2265l.d(b.this);
            }
        }

        @Override // com.aggmoread.sdk.z.a.k.c.k
        public void c() {
            b.this.j();
            if (b.this.f2265l != null) {
                b.this.f2265l.c(b.this);
            }
        }

        @Override // com.aggmoread.sdk.z.a.k.c.k
        public void onRenderSuccess() {
            if (b.this.f2265l != null) {
                b.this.f2265l.a(b.this);
            }
        }
    }

    public b(com.aggmoread.sdk.z.a.g.b bVar, b.a.C0056a c0056a, com.aggmoread.sdk.z.a.k.a aVar) {
        super(bVar.d().j());
        this.f2265l = aVar;
        this.f2266m = c0056a;
        this.f2267n = bVar;
        a(c0056a);
    }

    private void a(b.a.C0056a c0056a) {
        if (c0056a != null) {
            g gVar = new g();
            gVar.f2120a = c0056a.j();
            gVar.f2124e = c0056a.f();
            gVar.f2123d = c0056a.a();
            a(gVar);
        }
        a(new a(c0056a));
    }

    private com.aggmoread.sdk.z.a.g.c i() {
        com.aggmoread.sdk.z.a.r.a aVar = this.f2268o;
        return aVar != null ? aVar.a() : new com.aggmoread.sdk.z.a.g.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        com.aggmoread.sdk.z.a.q.a.a("onAdClick", this.f2266m.p(), i());
        l.a(this.f2267n, this.f2266m, i(), this.f2265l);
    }

    @Override // com.aggmoread.sdk.z.a.k.c
    public View a() {
        View a5 = super.a();
        this.f2268o = com.aggmoread.sdk.z.a.r.a.a(a5, null);
        return a5;
    }

    @Override // com.aggmoread.sdk.z.a.k.c
    public int b() {
        return this.f2266m.f2078s;
    }

    @Override // com.aggmoread.sdk.z.a.k.c
    public String c() {
        return this.f2266m.a();
    }
}

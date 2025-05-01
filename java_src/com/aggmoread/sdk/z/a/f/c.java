package com.aggmoread.sdk.z.a.f;

import android.view.View;
import com.aggmoread.sdk.z.a.f.b;
import com.aggmoread.sdk.z.a.g.b;
import com.aggmoread.sdk.z.a.g.e;
import com.aggmoread.sdk.z.a.g.g;
import com.aggmoread.sdk.z.a.m.l;
import java.util.List;
/* loaded from: classes2.dex */
public class c extends b {

    /* renamed from: m  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.f.a f2023m;

    /* renamed from: n  reason: collision with root package name */
    private b.a.C0056a f2024n;

    /* renamed from: o  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.g.b f2025o;

    /* renamed from: p  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.r.a f2026p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements b.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a.C0056a f2027a;

        a(b.a.C0056a c0056a) {
            this.f2027a = c0056a;
        }

        @Override // com.aggmoread.sdk.z.a.f.b.l
        public void a() {
            if (c.this.f2023m != null) {
                c.this.f2023m.a(c.this);
            }
            b.a.C0056a c0056a = this.f2027a;
            if (c0056a != null) {
                com.aggmoread.sdk.z.a.q.a.a("onAdExposure", c0056a.q());
            }
        }

        @Override // com.aggmoread.sdk.z.a.f.b.l
        public void a(String str) {
            if (c.this.f2023m != null) {
                c.this.f2023m.a(c.this, new e(50003, str));
            }
        }

        @Override // com.aggmoread.sdk.z.a.f.b.l
        public void b() {
            if (c.this.f2023m != null) {
                c.this.f2023m.d(c.this);
            }
        }

        @Override // com.aggmoread.sdk.z.a.f.b.l
        public void c() {
            c.this.j();
            if (c.this.f2023m != null) {
                c.this.f2023m.b(c.this);
            }
        }

        @Override // com.aggmoread.sdk.z.a.f.b.l
        public void onRenderSuccess() {
            if (c.this.f2023m != null) {
                c.this.f2023m.c(c.this);
            }
        }
    }

    public c(com.aggmoread.sdk.z.a.g.b bVar, b.a.C0056a c0056a, com.aggmoread.sdk.z.a.f.a aVar) {
        super(bVar.d().j());
        this.f2023m = aVar;
        this.f2024n = c0056a;
        this.f2025o = bVar;
        a(c0056a);
    }

    private void a(b.a.C0056a c0056a) {
        if (c0056a != null) {
            g gVar = new g();
            gVar.f2120a = c0056a.j();
            List<String> g4 = c0056a.g();
            if (g4 != null && g4.size() > 0) {
                gVar.f2124e = g4.get(0);
            }
            gVar.f2123d = c0056a.a();
            a(gVar);
        }
        a(new a(c0056a));
    }

    private com.aggmoread.sdk.z.a.g.c i() {
        com.aggmoread.sdk.z.a.r.a aVar = this.f2026p;
        return aVar != null ? aVar.a() : new com.aggmoread.sdk.z.a.g.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        com.aggmoread.sdk.z.a.q.a.a("onAdClick", this.f2024n.p(), i());
        l.a(this.f2025o, this.f2024n, i(), this.f2023m);
    }

    @Override // com.aggmoread.sdk.z.a.f.b
    public View a() {
        View a5 = super.a();
        this.f2026p = com.aggmoread.sdk.z.a.r.a.a(a5, null);
        return a5;
    }

    @Override // com.aggmoread.sdk.z.a.f.b
    public int b() {
        return this.f2024n.f2078s;
    }

    @Override // com.aggmoread.sdk.z.a.f.b
    public String c() {
        return this.f2024n.a();
    }
}

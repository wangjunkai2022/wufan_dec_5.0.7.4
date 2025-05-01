package com.aggmoread.sdk.z.c.a.a.d.a.d;

import android.text.TextUtils;
import com.aggmoread.sdk.client.AMConst;
import com.aggmoread.sdk.z.c.a.a.d.b.a;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class c extends com.aggmoread.sdk.z.c.a.a.d.a.a implements com.aggmoread.sdk.z.c.a.a.c.o.c {

    /* renamed from: l  reason: collision with root package name */
    protected Map<String, Object> f2831l;

    /* renamed from: m  reason: collision with root package name */
    protected com.aggmoread.sdk.z.c.a.a.d.a.c f2832m;

    /* renamed from: n  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.o.b f2833n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements a.c<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.k f2834a;

        a(com.aggmoread.sdk.z.c.a.a.d.b.k kVar) {
            this.f2834a = kVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.b.a.c
        public void a(String str) {
            com.aggmoread.sdk.z.c.a.a.e.e.b("XXXXX", "title " + str);
            if (!TextUtils.isEmpty(str)) {
                if (com.aggmoread.sdk.z.c.a.a.e.m.i(c.this.f2799e)) {
                    this.f2834a.a(k.b.C, str);
                }
                com.aggmoread.sdk.z.c.a.a.e.m.a(c.this.f2831l, str);
            }
            this.f2834a.b();
            c.this.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.c f2836b;

        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f2838b;

            a(String str) {
                this.f2838b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.c cVar = b.this.f2836b;
                if (cVar != null) {
                    cVar.a(this.f2838b);
                }
            }
        }

        b(a.c cVar) {
            this.f2836b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    Thread.sleep(500L);
                    com.aggmoread.sdk.z.c.a.a.e.n.a(new a(c.this.getTitle()));
                } catch (Exception e5) {
                    com.aggmoread.sdk.z.c.a.a.e.e.b("XXXXX", "title info err " + e5.getMessage());
                    com.aggmoread.sdk.z.c.a.a.e.n.a(new a(null));
                }
            } catch (Throwable th) {
                com.aggmoread.sdk.z.c.a.a.e.n.a(new a(null));
                throw th;
            }
        }
    }

    public c(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Map<String, Object> map) {
        super(dVar, eVar);
        this.f2831l = new HashMap();
        if (map != null) {
            map.put(AMConst.ExtrasKey.AD_ID, this.f2796b);
            this.f2831l.putAll(map);
        }
    }

    private void a(a.c<String> cVar) {
        com.aggmoread.sdk.z.c.a.a.e.n.b(new b(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        com.aggmoread.sdk.z.c.a.a.c.o.b bVar;
        if ((this.f2798d.f3263g instanceof com.aggmoread.sdk.z.c.a.a.c.o.d) && com.aggmoread.sdk.z.c.a.a.e.m.b(this.f2799e) && (bVar = this.f2833n) != null) {
            bVar.onAdExposed();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public final void a(int i4) {
        if (com.aggmoread.sdk.z.c.a.a.e.m.g(this.f2799e)) {
            b(i4);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public final void a(int i4, int i5, String str) {
        if (com.aggmoread.sdk.z.c.a.a.e.m.g(this.f2799e)) {
            b(i4, i5, str);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public void a(com.aggmoread.sdk.z.c.a.a.c.o.a aVar) {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.o.c
    public void a(com.aggmoread.sdk.z.c.a.a.c.o.b bVar) {
        this.f2833n = bVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
        this.f2832m = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(int i4) {
    }

    protected void b(int i4, int i5, String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.aggmoread.sdk.z.c.a.a.d.a.c c() {
        com.aggmoread.sdk.z.c.a.a.d.a.c cVar = this.f2832m;
        return cVar != null ? cVar : this.f2798d.f3276t;
    }

    public void d() {
        com.aggmoread.sdk.z.c.a.a.c.o.b bVar = this.f2833n;
        if (bVar != null) {
            bVar.onADCloseOverlay();
        }
    }

    public void e() {
        com.aggmoread.sdk.z.c.a.a.c.o.b bVar = this.f2833n;
        if (bVar != null) {
            bVar.onADOpenOverlay();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public String getID() {
        return this.f2796b;
    }

    protected abstract String getTitle();

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public Map<String, Object> h() {
        return com.aggmoread.sdk.z.c.a.a.e.m.a(this.f2831l);
    }

    public void i() {
        com.aggmoread.sdk.z.c.a.a.c.o.b bVar;
        com.aggmoread.sdk.z.c.a.a.d.b.k kVar = new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f2798d, this.f2799e);
        boolean a5 = kVar.a(k.b.f3448n, this.f2796b).a(this.f2799e, a(), this.f2801g, this.f2804j);
        kVar.b();
        com.aggmoread.sdk.z.c.a.a.d.b.l.a((Object) this.f2804j, false, true);
        if (!a5 || (bVar = this.f2833n) == null) {
            return;
        }
        bVar.onAdClicked();
    }

    public void j() {
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f2798d, this.f2799e).a(k.b.f3448n, this.f2796b).a(4).b();
        com.aggmoread.sdk.z.c.a.a.c.o.b bVar = this.f2833n;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void k() {
        com.aggmoread.sdk.z.c.a.a.e.e.a("exposure");
        p();
    }

    public void l() {
        com.aggmoread.sdk.z.c.a.a.c.o.b bVar = this.f2833n;
        if (bVar != null) {
            bVar.onADLeftApplication();
        }
    }

    public void n() {
        com.aggmoread.sdk.z.c.a.a.c.o.b bVar = this.f2833n;
        if (bVar != null) {
            bVar.onRenderFail();
        }
    }

    public void o() {
        com.aggmoread.sdk.z.c.a.a.c.o.b bVar = this.f2833n;
        if (bVar != null) {
            bVar.onRenderSuccess();
        }
    }

    public void p() {
        com.aggmoread.sdk.z.c.a.a.d.b.k a5 = new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f2798d, this.f2799e).a(6).a(k.b.f3448n, this.f2796b).a(k.b.f3451q, com.aggmoread.sdk.z.c.a.a.e.m.a(this.f2798d, this.f2799e, this.f2831l));
        if (com.aggmoread.sdk.z.c.a.a.e.m.e()) {
            a(new a(a5));
            return;
        }
        a5.b();
        m();
    }
}

package com.aggmoread.sdk.z.c.a.a.d.a.d;

import android.text.TextUtils;
import com.aggmoread.sdk.client.AMConst;
import com.aggmoread.sdk.z.c.a.a.d.b.a;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class b extends com.aggmoread.sdk.z.c.a.a.d.a.a implements com.aggmoread.sdk.z.c.a.a.c.n.a {

    /* renamed from: l  reason: collision with root package name */
    protected Map<String, Object> f2821l;

    /* renamed from: m  reason: collision with root package name */
    protected com.aggmoread.sdk.z.c.a.a.c.n.d f2822m;

    /* renamed from: n  reason: collision with root package name */
    protected com.aggmoread.sdk.z.c.a.a.c.n.b f2823n;

    /* renamed from: o  reason: collision with root package name */
    protected com.aggmoread.sdk.z.c.a.a.d.a.c f2824o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements a.c<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.k f2825a;

        a(com.aggmoread.sdk.z.c.a.a.d.b.k kVar) {
            this.f2825a = kVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.b.a.c
        public void a(String str) {
            com.aggmoread.sdk.z.c.a.a.e.e.b("XXXXX", "title " + str);
            if (!TextUtils.isEmpty(str)) {
                if (com.aggmoread.sdk.z.c.a.a.e.m.i(b.this.f2799e)) {
                    this.f2825a.a(k.b.C, str);
                }
                com.aggmoread.sdk.z.c.a.a.e.m.a(b.this.f2821l, str);
            }
            this.f2825a.b();
            b.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0099b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.c f2827b;

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.b$b$a */
        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f2829b;

            a(String str) {
                this.f2829b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.c cVar = RunnableC0099b.this.f2827b;
                if (cVar != null) {
                    cVar.a(this.f2829b);
                }
            }
        }

        RunnableC0099b(a.c cVar) {
            this.f2827b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    Thread.sleep(500L);
                    com.aggmoread.sdk.z.c.a.a.e.n.a(new a(b.this.getTitle()));
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

    public b(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Map<String, Object> map) {
        super(dVar, eVar);
        this.f2821l = new HashMap();
        if (map != null) {
            map.put(AMConst.ExtrasKey.AD_ID, this.f2796b);
            this.f2821l.putAll(map);
        }
    }

    private void a(a.c<String> cVar) {
        com.aggmoread.sdk.z.c.a.a.e.n.b(new RunnableC0099b(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f2823n == null || !com.aggmoread.sdk.z.c.a.a.e.m.b(this.f2799e)) {
            return;
        }
        this.f2823n.onAdExposed();
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

    @Override // com.aggmoread.sdk.z.c.a.a.c.n.a
    public void a(com.aggmoread.sdk.z.c.a.a.c.n.b bVar) {
        this.f2823n = bVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.n.a
    public void a(com.aggmoread.sdk.z.c.a.a.c.n.d dVar) {
        this.f2822m = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(int i4) {
    }

    protected abstract void b(int i4, int i5, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public com.aggmoread.sdk.z.c.a.a.d.a.c c() {
        com.aggmoread.sdk.z.c.a.a.d.a.c cVar = this.f2824o;
        return cVar != null ? cVar : this.f2798d.f3276t;
    }

    public void d() {
        com.aggmoread.sdk.z.c.a.a.e.e.a("exposure");
        i();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public String getID() {
        return this.f2796b;
    }

    protected abstract String getTitle();

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public Map<String, Object> h() {
        return com.aggmoread.sdk.z.c.a.a.e.m.a(this.f2821l);
    }

    public void i() {
        com.aggmoread.sdk.z.c.a.a.d.b.k a5 = new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f2798d, this.f2799e).a(6).a(k.b.f3448n, this.f2796b).a(k.b.f3451q, com.aggmoread.sdk.z.c.a.a.e.m.a(this.f2798d, this.f2799e, this.f2821l));
        if (com.aggmoread.sdk.z.c.a.a.e.m.e()) {
            a(new a(a5));
            return;
        }
        a5.b();
        e();
    }
}

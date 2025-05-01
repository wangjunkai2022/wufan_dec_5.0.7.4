package com.aggmoread.sdk.z.c.a.a.d.a.d;

import com.aggmoread.sdk.z.c.a.a.d.b.k;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class h extends com.aggmoread.sdk.z.c.a.a.d.b.a {

    /* renamed from: i  reason: collision with root package name */
    protected boolean f2874i;

    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f2875b;

        a(List list) {
            this.f2875b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((com.aggmoread.sdk.z.c.a.a.c.o.d) h.this.f3244c.f3263g).onAdLoaded(this.f2875b);
        }
    }

    public h(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
        this.f2874i = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void a(int i4, int i5) {
        com.aggmoread.sdk.z.c.a.a.e.e.a("bidding floor " + i4);
        com.aggmoread.sdk.z.c.a.a.d.b.i iVar = new com.aggmoread.sdk.z.c.a.a.d.b.i(1001006004, "广告无填充!");
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(8).a(iVar).a(k.b.f3451q, com.aggmoread.sdk.z.c.a.a.e.m.a(this.f3244c, this.f3245d, i4)).b();
        if (this.f3245d.l()) {
            return;
        }
        this.f3244c.f3263g.a(iVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Object obj, int i4) {
        com.aggmoread.sdk.z.c.a.a.e.e.a("bidding floor " + i4);
        a(obj, 1, i4);
    }

    protected void a(Object obj, int i4, int i5) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
        com.aggmoread.sdk.z.c.a.a.e.e.a("AMHTAG", "onAdError %s", iVar);
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(8).a(iVar).b();
        if (this.f2874i || !this.f3245d.l()) {
            this.f3244c.f3263g.a(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(Object obj, int i4) {
        com.aggmoread.sdk.z.c.a.a.e.e.a("bidding win " + i4);
        if (!com.aggmoread.sdk.z.c.a.a.e.m.h(this.f3245d) && i4 > 0) {
            c(obj, i4);
        }
    }

    protected void c(Object obj, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(List<com.aggmoread.sdk.z.c.a.a.c.o.c> list) {
        if (list == null || list.size() == 0) {
            b(new com.aggmoread.sdk.z.c.a.a.d.b.i(-1000, "广告无填充!"));
            return;
        }
        this.f2874i = true;
        this.f3245d.f3311e = list.size();
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(3).a(k.b.f3451q, com.aggmoread.sdk.z.c.a.a.e.m.a(this.f3244c, this.f3245d, list.get(0).h())).a(k.b.B, Integer.valueOf(list.size())).b();
        if (this.f3244c.f3263g instanceof com.aggmoread.sdk.z.c.a.a.c.o.d) {
            com.aggmoread.sdk.z.c.a.a.e.n.a(new a(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q() {
        return com.aggmoread.sdk.z.c.a.a.e.m.j(this.f3245d);
    }
}

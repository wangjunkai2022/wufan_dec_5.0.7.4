package com.aggmoread.sdk.z.c.a.a.d.a.d.o.f;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.aggmoread.sdk.z.a.h.c;
import com.aggmoread.sdk.z.c.a.a.d.a.d.g;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.e;
import com.aggmoread.sdk.z.c.a.a.e.n;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a extends g {

    /* renamed from: l  reason: collision with root package name */
    private c f2924l;

    /* renamed from: m  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.a f2925m;

    /* renamed from: n  reason: collision with root package name */
    private AtomicBoolean f2926n;

    /* renamed from: o  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.r.c f2927o;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.o.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0102a implements com.aggmoread.sdk.z.a.r.c {

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.o.f.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0103a implements Runnable {

            /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.o.f.a$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class RunnableC0104a implements Runnable {
                RunnableC0104a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    l.a(((g) a.this).f2861j, 2);
                }
            }

            RunnableC0103a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                Object obj = aVar.f3244c.f3258b;
                Object[] objArr = ((g) aVar).f2861j;
                a aVar2 = a.this;
                l.a(obj, objArr, aVar2.f3244c.f3261e, Integer.valueOf(aVar2.f3245d.f()));
                a aVar3 = a.this;
                l.b(aVar3.f3244c.f3258b, aVar3.f3245d.e(), a.this.f3245d.b());
                byte[] b5 = a.this.f3244c.f3274r.b();
                if (b5 != null) {
                    l.a(a.this.f3244c.f3258b, b5);
                }
                l.a((Object) ((g) a.this).f2861j, true, true);
                l.a(((g) a.this).f2861j, a.this.f3245d);
                n.a(new RunnableC0104a(), 500L);
            }
        }

        C0102a() {
        }

        @Override // com.aggmoread.sdk.z.a.r.c
        public void a() {
            e.b("AMITAGBD", "onADClosed");
            a.this.s();
        }

        @Override // com.aggmoread.sdk.z.a.r.c
        public void a(com.aggmoread.sdk.z.a.a aVar) {
            e.b("AMITAGBD", "onAdLoaded");
            a.this.f2925m = aVar;
            int b5 = a.this.f2925m.b();
            if (com.aggmoread.sdk.z.c.a.a.d.a.d.o.b.a(a.this.f3245d, b5)) {
                a.this.a(b5, 0);
                return;
            }
            a.this.b(b5);
            a aVar2 = a.this;
            com.aggmoread.sdk.z.c.a.a.d.a.d.o.b.b(aVar2.f3243b, b5, aVar2.f3245d);
            a.this.u();
        }

        @Override // com.aggmoread.sdk.z.a.i.b
        public void a(com.aggmoread.sdk.z.a.g.e eVar) {
            e.b("AMITAGBD", "onAdError");
            a.this.b(new i(eVar.a(), eVar.b()));
        }

        @Override // com.aggmoread.sdk.z.a.r.c
        public void e() {
            e.b("AMITAGBD", "onADExposure");
            a.this.t();
            n.a(new RunnableC0103a(), 1L);
        }

        @Override // com.aggmoread.sdk.z.a.r.c
        public void onAdClicked() {
            e.b("AMITAGBD", "onADClicked");
            a.this.r();
        }

        @Override // com.aggmoread.sdk.z.a.r.c
        public void onAdShow() {
            e.b("AMITAGBD", "onADOpened");
            a.this.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f2931b;

        b(Activity activity) {
            this.f2931b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f2925m != null) {
                a.this.f2925m.a(this.f2931b, null);
            }
        }
    }

    public a(d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
        this.f2926n = new AtomicBoolean();
        this.f2927o = new C0102a();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.q.b
    public void a(Activity activity) {
        e.b("AMITAGBD", "show #2 activity = " + activity);
        if (this.f2860i && this.f2925m != null && this.f2926n.compareAndSet(false, true)) {
            e.b("AMITAGBD", "show #2 ");
            if (activity == null) {
                super.b();
                return;
            }
            try {
                activity.getWindow().getDecorView().post(new b(activity));
            } catch (Exception e5) {
                e.b("AMITAGBD", "show #3 " + e5.getMessage());
                com.aggmoread.sdk.z.a.a aVar = this.f2925m;
                if (aVar != null) {
                    aVar.a(activity, null);
                }
            }
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.g, com.aggmoread.sdk.z.c.a.a.c.q.b
    public void b() {
        e.b("AMITAGBD", "show()");
        Context context = this.f3244c.f3260d;
        if (context instanceof Activity) {
            a((Activity) context);
        } else {
            super.b();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.q.b
    public void destroy() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public String j() {
        com.aggmoread.sdk.z.a.a aVar = this.f2925m;
        return aVar == null ? "" : aVar.a();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        e.b("AMITAGBD", "handle");
        com.aggmoread.sdk.z.c.a.a.d.a.d.o.c.a().a(this.f3244c.f3260d);
        this.f2860i = false;
        try {
            String c5 = this.f3245d.f3309c.c(e.c.T);
            if (!TextUtils.isEmpty(c5) && c5.contains("inter_")) {
                c5 = c5.replace("inter_", "").trim();
            }
            this.f2924l = new c.b(this.f3244c.f3260d).b(this.f3244c.f3269m).a(true).c(this.f3244c.f3270n).a(c5).b(com.aggmoread.sdk.z.c.a.a.d.a.d.o.b.a(this.f3245d)).d();
            new k(this.f3244c, this.f3245d).a(0).b();
            this.f2924l.a(this.f2927o);
        } catch (Exception e5) {
            e5.printStackTrace();
            b(new i(1001002008, "广告请求失败!"));
        }
    }
}

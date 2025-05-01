package com.aggmoread.sdk.z.c.a.a.d.a.d.p.g;

import android.app.Activity;
import android.content.Context;
import com.aggmoread.sdk.z.c.a.a.d.a.d.g;
import com.aggmoread.sdk.z.c.a.a.d.a.d.p.c;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.e;
import com.aggmoread.sdk.z.c.a.a.e.n;
import com.baidu.mobads.sdk.api.ExpressInterstitialAd;
import com.baidu.mobads.sdk.api.RequestParameters;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a extends g {

    /* renamed from: l  reason: collision with root package name */
    private ExpressInterstitialAd f2994l;

    /* renamed from: m  reason: collision with root package name */
    private AtomicBoolean f2995m;

    /* renamed from: n  reason: collision with root package name */
    private c.j f2996n;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.p.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0113a implements c.j {

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.p.g.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0114a implements Runnable {

            /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.p.g.a$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class RunnableC0115a implements Runnable {
                RunnableC0115a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    l.a(((g) a.this).f2861j, 2);
                }
            }

            RunnableC0114a() {
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
                n.a(new RunnableC0115a(), 3000L);
            }
        }

        C0113a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.j
        public void a(int i4, String str) {
            e.b("AMITAGBD", "onNoAD " + i4 + ", " + str);
            a.this.b(new i(i4, str));
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.j
        public void b() {
            e.b("AMITAGBD", "onAdCacheFailed");
            a.this.b(new i(-1000, "视频素材缓存失败"));
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.j
        public void b(int i4, String str) {
            e.b("AMITAGBD", "onAdFailed " + i4 + ", " + str);
            a.this.b(new i(i4, str));
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.j
        public void c() {
            e.b("AMITAGBD", "onLpClosed");
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.j
        public void e() {
            e.b("AMITAGBD", "onAdCacheSuccess");
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.j
        public void f() {
            e.b("AMITAGBD", "onADReceive");
            int a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a((Object) a.this.f2994l);
            if (com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(a.this.f3245d, a5)) {
                a.this.a(a5, 0);
                return;
            }
            a.this.b(a5);
            ((g) a.this).f2860i = true;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.j
        public void g() {
            e.b("AMITAGBD", "onADClosed");
            a.this.s();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.j
        public void h() {
            e.b("AMITAGBD", "onADExposureFailed");
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.j
        public void onADExposed() {
            e.b("AMITAGBD", "onADExposure");
            a.this.v();
            a.this.t();
            n.a(new RunnableC0114a(), 1L);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.j
        public void onAdClick() {
            e.b("AMITAGBD", "onADClicked");
            a.this.r();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.j
        public void onVideoDownloadFailed() {
            e.b("AMITAGBD", "onVideoDownloadFailed");
            a.this.b(new i(-1000, "视频素材缓存失败"));
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.j
        public void onVideoDownloadSuccess() {
            e.b("AMITAGBD", "onVideoDownloadSuccess");
            if (((g) a.this).f2860i) {
                a aVar = a.this;
                com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.b(aVar.f3243b, com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a((Object) aVar.f2994l), a.this.f3245d);
                a.this.u();
                a.this.w();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f3000b;

        b(Activity activity) {
            this.f3000b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f2994l != null) {
                a.this.f2994l.show(this.f3000b);
            }
        }
    }

    public a(d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
        this.f2995m = new AtomicBoolean();
        this.f2996n = new C0113a();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.q.b
    public void a(Activity activity) {
        e.b("AMITAGBD", "show #2 activity = " + activity);
        if (this.f2860i && this.f2994l != null && this.f2995m.compareAndSet(false, true)) {
            e.b("AMITAGBD", "show #2 ");
            if (activity == null) {
                super.b();
                return;
            }
            try {
                activity.getWindow().getDecorView().post(new b(activity));
            } catch (Exception e5) {
                e.b("AMITAGBD", "show #3 " + e5.getMessage());
                ExpressInterstitialAd expressInterstitialAd = this.f2994l;
                if (expressInterstitialAd != null) {
                    expressInterstitialAd.show(activity);
                }
            }
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.g, com.aggmoread.sdk.z.c.a.a.c.a
    public void a(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
        this.f3246e = cVar;
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

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f2994l, "203");
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void c(int i4) {
        e.c("win " + i4);
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f2994l, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.q.b
    public void destroy() {
        ExpressInterstitialAd expressInterstitialAd = this.f2994l;
        if (expressInterstitialAd != null) {
            expressInterstitialAd.destroy();
            this.f2994l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public String j() {
        return com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a().a(this.f2994l);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        String a5 = this.f3245d.f3309c.a(e.c.X, "");
        Context a6 = com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f3244c, this.f3245d, this.f3248g);
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(a6, a5);
        ExpressInterstitialAd expressInterstitialAd = new ExpressInterstitialAd(a6.getApplicationContext(), this.f3245d.f3309c.c(e.c.T));
        this.f2994l = expressInterstitialAd;
        expressInterstitialAd.setLoadListener(c.a().a(this.f2996n));
        this.f2994l.setAppSid(a5);
        this.f2860i = false;
        new k(this.f3244c, this.f3245d).a(0).b();
        try {
            RequestParameters.Builder builder = new RequestParameters.Builder();
            com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(builder, this.f3244c, this.f3245d);
            com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f2994l, builder.build());
        } catch (Exception unused) {
        }
        this.f2994l.load();
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMITAGBD", "load enter");
    }
}

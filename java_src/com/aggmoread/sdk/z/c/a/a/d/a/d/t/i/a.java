package com.aggmoread.sdk.z.c.a.a.d.a.d.t.i;

import android.app.Activity;
import android.content.Context;
import com.aggmoread.sdk.z.c.a.a.c.f;
import com.aggmoread.sdk.z.c.a.a.c.t.b;
import com.aggmoread.sdk.z.c.a.a.d.a.d.g;
import com.aggmoread.sdk.z.c.a.a.d.a.d.t.d;
import com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b;
import com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.c;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.e;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.aggmoread.sdk.z.c.a.a.e.n;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.comm.util.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a extends g {

    /* renamed from: l  reason: collision with root package name */
    private UnifiedInterstitialAD f3142l;

    /* renamed from: m  reason: collision with root package name */
    private AtomicBoolean f3143m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f3144n;

    /* renamed from: o  reason: collision with root package name */
    private b.a f3145o;

    /* renamed from: p  reason: collision with root package name */
    private c.a f3146p;

    /* renamed from: q  reason: collision with root package name */
    final com.aggmoread.sdk.z.c.a.a.c.t.b f3147q;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0128a implements b.a {

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0129a implements Runnable {

            /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.a$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class RunnableC0130a implements Runnable {
                RunnableC0130a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    l.a(((g) a.this).f2861j, 2);
                }
            }

            RunnableC0129a() {
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
                n.a(new RunnableC0130a(), 500L);
            }
        }

        C0128a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void a() {
            e.b("AMITAGGDT", "onADReceive");
            if (a.this.o()) {
                int a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(a.this.f3142l);
                if (com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(a.this.f3245d, a5)) {
                    a.this.a(a5, 0);
                    a.this.f3144n = false;
                    return;
                }
                a.this.b(a5);
            }
            a aVar = a.this;
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(aVar.f3243b, aVar.f3142l, a.this.f3245d);
            if (a.this.f3144n) {
                return;
            }
            a.this.u();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void b() {
            e.b("AMITAGGDT", "onADClosed");
            a.this.s();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void c() {
            e.b("AMITAGGDT", "onADOpened");
            a.this.v();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void onADClicked() {
            e.b("AMITAGGDT", "onADClicked");
            a.this.r();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void onADExposure() {
            e.b("AMITAGGDT", "onADExposure");
            a.this.t();
            n.a(new RunnableC0129a(), 1L);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void onADLeftApplication() {
            e.b("AMITAGGDT", "onADLeftApplication");
            a.this.q();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void onNoAD(AdError adError) {
            e.b("AMITAGGDT", "onNoAD");
            a.this.b(new i(adError.getErrorCode(), adError.getErrorMsg()));
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void onRenderFail() {
            e.b("AMITAGGDT", "onRenderFail");
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void onRenderSuccess() {
            e.b("AMITAGGDT", "onRenderSuccess");
            if (a.this.f3144n) {
                if (a.this.o()) {
                    if (com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(a.this.f3245d, com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(a.this.f3142l))) {
                        return;
                    }
                }
                e.b("AMITAGGDT", "onRenderSuccess notify");
                a.this.u();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void onVideoCached() {
            e.b("AMITAGGDT", "onVideoCached");
            a.this.w();
        }
    }

    /* loaded from: classes2.dex */
    class b implements c.a {

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0131a implements Runnable {
            RunnableC0131a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ((com.aggmoread.sdk.z.c.a.a.c.l) a.this.f3244c.f3264h).b();
            }
        }

        b() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.c.a
        public void a(long j4) {
            f fVar = a.this.f3244c.f3264h;
            if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.l) {
                ((com.aggmoread.sdk.z.c.a.a.c.l) fVar).a(j4);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.c.a
        public void b() {
            if (a.this.f3244c.f3264h instanceof com.aggmoread.sdk.z.c.a.a.c.l) {
                n.a(new RunnableC0131a(), 2L);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.c.a
        public void c() {
            f fVar = a.this.f3244c.f3264h;
            if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.l) {
                ((com.aggmoread.sdk.z.c.a.a.c.l) fVar).c();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.c.a
        public void onVideoComplete() {
            f fVar = a.this.f3244c.f3264h;
            if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.l) {
                ((com.aggmoread.sdk.z.c.a.a.c.l) fVar).onVideoComplete();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.c.a
        public void onVideoError(AdError adError) {
            f fVar = a.this.f3244c.f3264h;
            if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.l) {
                fVar.a(new i(adError.getErrorCode(), adError.getErrorMsg()));
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.c.a
        public void onVideoInit() {
            f fVar = a.this.f3244c.f3264h;
            if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.l) {
                ((com.aggmoread.sdk.z.c.a.a.c.l) fVar).onVideoInit();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.c.a
        public void onVideoLoading() {
            f fVar = a.this.f3244c.f3264h;
            if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.l) {
                ((com.aggmoread.sdk.z.c.a.a.c.l) fVar).onVideoLoading();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.c.a
        public void onVideoPause() {
            f fVar = a.this.f3244c.f3264h;
            if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.l) {
                ((com.aggmoread.sdk.z.c.a.a.c.l) fVar).onVideoPause();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.c.a
        public void onVideoStart() {
            f fVar = a.this.f3244c.f3264h;
            if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.l) {
                ((com.aggmoread.sdk.z.c.a.a.c.l) fVar).onVideoStart();
            }
        }
    }

    /* loaded from: classes2.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f3153b;

        c(Activity activity) {
            this.f3153b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f3142l != null) {
                a.this.f3142l.show(this.f3153b);
            }
        }
    }

    public a(d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
        this.f3143m = new AtomicBoolean();
        this.f3144n = true;
        this.f3145o = new C0128a();
        this.f3146p = new b();
        this.f3147q = new b.C0097b().b(1).a(1).a(true).b(true).a();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.q.b
    public void a(Activity activity) {
        e.b("AMITAGGDT", "show #2 activity = " + activity);
        if (this.f2860i && this.f3142l != null && this.f3143m.compareAndSet(false, true)) {
            e.b("AMITAGGDT", "show #2 ");
            if (activity == null) {
                super.b();
                return;
            }
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.a.a(this.f3142l, k());
            try {
                activity.getWindow().getDecorView().post(new c(activity));
            } catch (Exception e5) {
                e.b("AMITAGGDT", "show #3 " + e5.getMessage());
                UnifiedInterstitialAD unifiedInterstitialAD = this.f3142l;
                if (unifiedInterstitialAD != null) {
                    unifiedInterstitialAD.show(activity);
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
        if (!(this.f3244c.f3260d instanceof Activity)) {
            super.b();
        } else if (this.f2860i && this.f3142l != null && this.f3143m.compareAndSet(false, true)) {
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.a.a(this.f3142l, k());
            e.b("AMITAGGDT", "show #1 ");
            this.f3142l.show();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3142l, i5, i4, str);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void c(int i4) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3142l, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.q.b
    public void destroy() {
        UnifiedInterstitialAD unifiedInterstitialAD = this.f3142l;
        if (unifiedInterstitialAD != null) {
            unifiedInterstitialAD.setMediaListener(null);
            this.f3142l.destroy();
            this.f3142l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public String j() {
        return com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a().a(this.f3244c);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        Context context = this.f3244c.f3260d;
        com.aggmoread.sdk.z.c.a.a.e.f fVar = this.f3245d.f3309c;
        Object obj = e.c.X;
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(context, fVar.a(obj, ""));
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a().a(this.f3245d, this.f3244c);
        UnifiedInterstitialAD unifiedInterstitialAD = (UnifiedInterstitialAD) com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3244c.f3260d, this.f3245d.f3309c.c(obj), this.f3245d.f3309c.c(e.c.T), d.e.INTERSTITIAL, this.f3247f, new com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b(this.f3145o).a(), new Object[0]);
        this.f3142l = unifiedInterstitialAD;
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.c cVar = new com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.c(this.f3146p);
        if (this.f3244c.f3264h != null) {
            unifiedInterstitialAD.setMediaListener(cVar.a());
        }
        com.aggmoread.sdk.z.c.a.a.c.t.b bVar = this.f3244c.f3275s;
        if (bVar == null) {
            bVar = this.f3147q;
        }
        this.f3142l.setVideoOption(new VideoOption.Builder().setDetailPageMuted(bVar.e()).setAutoPlayMuted(bVar.d()).setAutoPlayPolicy(bVar.a()).build());
        if (bVar.c() >= 5 && bVar.c() <= 61) {
            this.f3142l.setMinVideoDuration(bVar.c());
        }
        if (bVar.b() >= 5 && bVar.b() <= 61) {
            this.f3142l.setMaxVideoDuration(bVar.b());
        }
        this.f2860i = false;
        this.f3144n = m.a("4.371");
        new k(this.f3244c, this.f3245d).a(0).b();
        this.f3142l.loadAD();
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMITAGGDT", "load enter");
    }
}

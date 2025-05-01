package com.aggmoread.sdk.z.c.a.a.d.a.d.u.h;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.aggmoread.sdk.z.c.a.a.c.f;
import com.aggmoread.sdk.z.c.a.a.c.t.b;
import com.aggmoread.sdk.z.c.a.a.d.a.d.g;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.e;
import com.aggmoread.sdk.z.c.a.a.e.n;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsInterstitialAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsVideoPlayConfig;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a extends g {

    /* renamed from: l  reason: collision with root package name */
    private KsInterstitialAd f3215l;

    /* renamed from: m  reason: collision with root package name */
    private AtomicBoolean f3216m;

    /* renamed from: n  reason: collision with root package name */
    private KsVideoPlayConfig f3217n;

    /* renamed from: o  reason: collision with root package name */
    int f3218o;

    /* renamed from: p  reason: collision with root package name */
    final com.aggmoread.sdk.z.c.a.a.c.t.b f3219p;

    /* renamed from: q  reason: collision with root package name */
    private KsLoadManager.InterstitialAdListener f3220q;

    /* renamed from: r  reason: collision with root package name */
    private KsInterstitialAd.AdInteractionListener f3221r;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.u.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0137a implements KsLoadManager.InterstitialAdListener {
        C0137a() {
        }

        @Override // com.kwad.sdk.api.KsLoadManager.InterstitialAdListener
        public void onError(int i4, String str) {
            e.b("AMITAGKS", "onError i " + i4 + ",s  = " + str);
            a.this.b(new i(i4, str));
        }

        @Override // com.kwad.sdk.api.KsLoadManager.InterstitialAdListener
        public void onInterstitialAdLoad(@Nullable List<KsInterstitialAd> list) {
            e.b("AMITAGKS", "onInterstitialAdLoad");
            if (list != null && list.size() > 0) {
                a.this.f3215l = list.get(0);
                a.this.f3215l.setAdInteractionListener(a.this.f3221r);
            }
            int a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a((Object) a.this.f3215l);
            if (com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(a.this.f3245d, a5)) {
                a.this.a(a5, 0);
                return;
            }
            a.this.b(a5);
            a aVar = a.this;
            aVar.f3218o = a5;
            com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.b(aVar.f3243b, a5, aVar.f3245d);
            a.this.u();
        }

        @Override // com.kwad.sdk.api.KsLoadManager.InterstitialAdListener
        public void onRequestResult(int i4) {
            e.b("AMITAGKS", "onRequestResult " + i4);
        }
    }

    /* loaded from: classes2.dex */
    class b implements KsInterstitialAd.AdInteractionListener {

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.u.h.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0138a implements Runnable {
            RunnableC0138a() {
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
                l.a(((g) a.this).f2861j, 2);
            }
        }

        b() {
        }

        @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
        public void onAdClicked() {
            e.b("AMITAGKS", "onADClicked");
            a.this.r();
        }

        @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
        public void onAdClosed() {
            e.b("AMITAGKS", "onADClosed");
            a.this.s();
        }

        @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
        public void onAdShow() {
            e.b("AMITAGKS", "onADExposure");
            a.this.v();
            a.this.t();
            n.a(new RunnableC0138a(), 1L);
        }

        @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
        public void onPageDismiss() {
            e.b("AMITAGKS", "onADLeftApplication");
            a.this.q();
        }

        @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
        public void onSkippedAd() {
        }

        @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
        public void onVideoPlayEnd() {
            f fVar = a.this.f3244c.f3264h;
            if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.l) {
                ((com.aggmoread.sdk.z.c.a.a.c.l) fVar).onVideoComplete();
            }
        }

        @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
        public void onVideoPlayError(int i4, int i5) {
            f fVar = a.this.f3244c.f3264h;
            if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.l) {
                fVar.a(new i(i4, i5 + ""));
            }
        }

        @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
        public void onVideoPlayStart() {
            f fVar = a.this.f3244c.f3264h;
            if (fVar instanceof com.aggmoread.sdk.z.c.a.a.c.l) {
                ((com.aggmoread.sdk.z.c.a.a.c.l) fVar).onVideoStart();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f3225b;

        c(Activity activity) {
            this.f3225b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f3215l.showInterstitialAd(this.f3225b, a.this.f3217n);
        }
    }

    public a(d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
        this.f3216m = new AtomicBoolean();
        this.f3219p = new b.C0097b().b(1).a(1).a(true).a();
        this.f3220q = new C0137a();
        this.f3221r = new b();
    }

    private void x() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.q.b
    public void a(Activity activity) {
        if (this.f2860i && this.f3215l != null && this.f3216m.compareAndSet(false, true)) {
            if (activity == null) {
                super.b();
                return;
            }
            x();
            try {
                activity.getWindow().getDecorView().post(new c(activity));
            } catch (Exception e5) {
                e.b("AMITAGKS", "show #3 " + e5.getMessage());
                this.f3215l.showInterstitialAd(activity, this.f3217n);
            }
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.g, com.aggmoread.sdk.z.c.a.a.c.a
    public void a(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
        this.f3246e = cVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.g, com.aggmoread.sdk.z.c.a.a.c.q.b
    public void b() {
        Context context = this.f3244c.f3260d;
        if (context instanceof Activity) {
            a((Activity) context);
        } else {
            super.b();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(this.f3215l, i5);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void c(int i4) {
        super.c(i4);
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.b(this.f3215l, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.q.b
    public void destroy() {
        if (this.f3215l != null) {
            this.f3215l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public String j() {
        return com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a().a(this.f3215l);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        e.b("AMITAGKS", "handle enter");
        if (!com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(this.f3244c.f3260d, this.f3245d.f3309c.a(e.c.X, ""))) {
            b(new i(1001002008, "广告加载失败！"));
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMITAGKS", "returen #1");
            return;
        }
        try {
            String c5 = this.f3245d.f3309c.c(e.c.T);
            String trim = c5.replace("L", "").trim();
            long parseLong = Long.parseLong(trim);
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMITAGKS", "handle #3");
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMITAGKS", "slotId = " + c5 + ",slotIdStr = " + trim + ",_slotId = " + parseLong);
            KsScene build = new KsScene.Builder(parseLong).build();
            com.aggmoread.sdk.z.c.a.a.c.t.b bVar = this.f3244c.f3275s;
            if (bVar == null) {
                bVar = this.f3219p;
            }
            this.f3217n = null;
            if (bVar != null) {
                KsVideoPlayConfig.Builder builder = new KsVideoPlayConfig.Builder();
                builder.videoSoundEnable(!bVar.d());
                this.f3217n = builder.build();
            }
            this.f2860i = false;
            new k(this.f3244c, this.f3245d).a(0).b();
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMITAGKS", "load ad");
            KsAdSDK.getLoadManager().loadInterstitialAd(build, this.f3220q);
        } catch (Exception unused) {
            b(new i(1001002008, "广告ID配置错误，广告加载失败！"));
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMITAGKS", "returen #2");
        }
    }
}

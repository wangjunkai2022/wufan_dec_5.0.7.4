package com.aggmoread.sdk.z.c.a.a.d.a.d.u.g;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.aggmoread.sdk.z.c.a.a.c.l;
import com.aggmoread.sdk.z.c.a.a.c.t.b;
import com.aggmoread.sdk.z.c.a.a.d.a.d.f;
import com.aggmoread.sdk.z.c.a.a.d.a.d.u.g.b;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.e.e;
import com.aggmoread.sdk.z.c.a.a.e.n;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsFullScreenVideoAd;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsVideoPlayConfig;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a extends f {

    /* renamed from: l  reason: collision with root package name */
    private KsFullScreenVideoAd f3202l;

    /* renamed from: m  reason: collision with root package name */
    private AtomicBoolean f3203m;

    /* renamed from: n  reason: collision with root package name */
    private KsVideoPlayConfig f3204n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f3205o;

    /* renamed from: p  reason: collision with root package name */
    int f3206p;

    /* renamed from: q  reason: collision with root package name */
    final com.aggmoread.sdk.z.c.a.a.c.t.b f3207q;

    /* renamed from: r  reason: collision with root package name */
    private b.a f3208r;

    /* renamed from: s  reason: collision with root package name */
    private KsFullScreenVideoAd.FullScreenVideoAdInteractionListener f3209s;

    /* renamed from: t  reason: collision with root package name */
    int f3210t;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.u.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0136a implements b.a {
        C0136a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.g.b.a
        public void a(@Nullable List<KsFullScreenVideoAd> list) {
            e.b("AMFTAGKS", "onInterstitialAdLoad");
            if (list != null && list.size() > 0) {
                a.this.f3202l = list.get(0);
                a.this.f3202l.setFullScreenVideoAdInteractionListener(a.this.f3209s);
            }
            int a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a((Object) a.this.f3202l);
            if (com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(a.this.f3245d, a5)) {
                a.this.a(a5, 0);
                return;
            }
            a.this.b(a5);
            a aVar = a.this;
            com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.b(aVar.f3243b, a5, aVar.f3245d);
            a aVar2 = a.this;
            aVar2.f3206p = a5;
            aVar2.u();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.g.b.a
        public void b(@Nullable List<KsFullScreenVideoAd> list) {
            e.b("AMFTAGKS", "onFullScreenVideoResult " + list);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.g.b.a
        public void onError(int i4, String str) {
            e.b("AMFTAGKS", "onError i " + i4 + ",s  = " + str);
            a.this.b(new i(i4, str));
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.u.g.b.a
        public void onRequestResult(int i4) {
            e.b("AMFTAGKS", "onRequestResult " + i4);
        }
    }

    /* loaded from: classes2.dex */
    class b implements KsFullScreenVideoAd.FullScreenVideoAdInteractionListener {
        b() {
        }

        @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onAdClicked() {
            e.b("AMFTAGKS", "onADClicked");
            a.this.f3205o = true;
            a.this.r();
        }

        @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onPageDismiss() {
            e.b("AMFTAGKS", "onPageDismiss");
            a.this.s();
        }

        @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onSkippedVideo() {
            e.b("AMFTAGKS", "onSkippedVideo");
            a.this.z();
        }

        @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onVideoPlayEnd() {
            e.b("AMFTAGKS", "onVideoPlayEnd");
            a.this.A();
            a.this.z();
        }

        @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onVideoPlayError(int i4, int i5) {
            e.b("AMFTAGKS", "onVideoPlayError i " + i4 + ",s " + i5);
            com.aggmoread.sdk.z.c.a.a.c.f fVar = a.this.f3244c.f3264h;
            if (fVar instanceof l) {
                fVar.a(new i(i4, i5 + ""));
            }
            a.this.c(new i(i4, String.valueOf(i5)));
        }

        @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onVideoPlayStart() {
            e.b("AMFTAGKS", "onVideoPlayStart");
            a.this.v();
            a.this.t();
            a aVar = a.this;
            Object obj = aVar.f3244c.f3258b;
            Object[] objArr = ((f) aVar).f2846j;
            a aVar2 = a.this;
            com.aggmoread.sdk.z.c.a.a.d.b.l.a(obj, objArr, aVar2.f3244c.f3261e, Integer.valueOf(aVar2.f3245d.f()));
            a aVar3 = a.this;
            com.aggmoread.sdk.z.c.a.a.d.b.l.b(aVar3.f3244c.f3258b, aVar3.f3245d.e(), a.this.f3245d.b());
            if (a.this.f3244c.d() != null) {
                d dVar = a.this.f3244c;
                com.aggmoread.sdk.z.c.a.a.d.b.l.a(dVar.f3258b, dVar.d());
            }
            byte[] b5 = a.this.f3244c.f3274r.b();
            if (b5 != null) {
                com.aggmoread.sdk.z.c.a.a.d.b.l.a(a.this.f3244c.f3258b, b5);
            }
            com.aggmoread.sdk.z.c.a.a.d.b.l.a((Object) ((f) a.this).f2846j, true, true);
            com.aggmoread.sdk.z.c.a.a.d.b.l.a(((f) a.this).f2846j, a.this.f3245d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.aggmoread.sdk.z.c.a.a.d.b.l.a(((f) a.this).f2846j, 2);
            a.this.A();
        }
    }

    public a(d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
        this.f3203m = new AtomicBoolean();
        this.f3205o = false;
        this.f3207q = new b.C0097b().b(1).a(1).a(true).a();
        this.f3208r = new C0136a();
        this.f3209s = new b();
        this.f3210t = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        if (this.f3205o || this.f3210t > 5) {
            return;
        }
        e.b("AMFTAGKS", "find cc ");
        this.f3210t++;
        n.a(new c(), 500L);
    }

    private void b(Activity activity) {
        if (this.f2845i && this.f3202l != null && this.f3203m.compareAndSet(false, true)) {
            if (activity == null) {
                super.b();
                return;
            }
            y();
            this.f3202l.showFullScreenVideoAd(activity, this.f3204n);
        }
    }

    private void y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        com.aggmoread.sdk.z.c.a.a.c.f fVar = this.f3244c.f3264h;
        if (fVar instanceof l) {
            ((l) fVar).onVideoComplete();
        }
        x();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.f, com.aggmoread.sdk.z.c.a.a.c.p.b
    public void a(Activity activity) {
        b(activity);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(com.aggmoread.sdk.z.c.a.a.d.a.c cVar) {
        this.f3246e = cVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.f, com.aggmoread.sdk.z.c.a.a.c.p.b
    public void b() {
        Context context = this.f3244c.f3260d;
        if (context instanceof Activity) {
            b((Activity) context);
        } else {
            super.b();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(this.f3202l, i5);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void c(int i4) {
        super.c(i4);
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.b(this.f3202l, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.p.b
    public void destroy() {
        if (this.f3202l != null) {
            this.f3202l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public String j() {
        return com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a().a(this.f3202l);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        if (!com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(this.f3244c.f3260d, this.f3245d.f3309c.a(e.c.X, ""))) {
            b(new i(1001002008, "广告加载失败！"));
            return;
        }
        try {
            String c5 = this.f3245d.f3309c.c(e.c.T);
            String trim = c5.replace("L", "").trim();
            long parseLong = Long.parseLong(trim);
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMFTAGKS", "slotId = " + c5 + ",slotIdStr = " + trim + ",_slotId = " + parseLong);
            KsScene build = new KsScene.Builder(parseLong).build();
            com.aggmoread.sdk.z.c.a.a.c.t.b bVar = this.f3244c.f3275s;
            if (bVar == null) {
                bVar = this.f3207q;
            }
            this.f3204n = null;
            if (bVar != null) {
                KsVideoPlayConfig.Builder builder = new KsVideoPlayConfig.Builder();
                builder.videoSoundEnable(!bVar.d());
                this.f3204n = builder.build();
            }
            this.f2845i = false;
            new k(this.f3244c, this.f3245d).a(0).b();
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMFTAGKS", "load ad");
            KsAdSDK.getLoadManager().loadFullScreenVideoAd(build, new com.aggmoread.sdk.z.c.a.a.d.a.d.u.g.b(this.f3208r).a());
        } catch (Exception unused) {
            b(new i(1001002008, "广告ID配置错误，广告加载失败！"));
        }
    }
}

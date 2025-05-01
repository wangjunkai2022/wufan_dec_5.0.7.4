package com.aggmoread.sdk.z.c.a.a.d.a.d.t.h;

import android.app.Activity;
import android.content.Context;
import com.aggmoread.sdk.z.c.a.a.c.t.b;
import com.aggmoread.sdk.z.c.a.a.d.a.c;
import com.aggmoread.sdk.z.c.a.a.d.a.d.f;
import com.aggmoread.sdk.z.c.a.a.d.a.d.t.d;
import com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.aggmoread.sdk.z.c.a.a.e.n;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.comm.util.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a extends f {

    /* renamed from: l  reason: collision with root package name */
    private UnifiedInterstitialAD f3136l;

    /* renamed from: m  reason: collision with root package name */
    private AtomicBoolean f3137m;

    /* renamed from: n  reason: collision with root package name */
    private b.a f3138n;

    /* renamed from: o  reason: collision with root package name */
    final com.aggmoread.sdk.z.c.a.a.c.t.b f3139o;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.t.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0126a implements b.a {

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.t.h.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0127a implements Runnable {
            RunnableC0127a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                Object obj = aVar.f3244c.f3258b;
                Object[] objArr = ((f) aVar).f2846j;
                a aVar2 = a.this;
                l.a(obj, objArr, aVar2.f3244c.f3261e, Integer.valueOf(aVar2.f3245d.f()));
                a aVar3 = a.this;
                l.b(aVar3.f3244c.f3258b, aVar3.f3245d.e(), a.this.f3245d.b());
                byte[] b5 = a.this.f3244c.f3274r.b();
                if (b5 != null) {
                    l.a(a.this.f3244c.f3258b, b5);
                }
                l.a((Object) ((f) a.this).f2846j, true, true);
                l.a(((f) a.this).f2846j, a.this.f3245d);
                l.a(((f) a.this).f2846j, 2);
            }
        }

        C0126a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void a() {
            if (a.this.o()) {
                int a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(a.this.f3136l);
                if (com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(a.this.f3245d, a5)) {
                    a.this.a(a5, 0);
                    return;
                }
                a.this.b(a5);
            }
            a aVar = a.this;
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(aVar.f3243b, aVar.f3136l, a.this.f3245d);
            a.this.u();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void b() {
            a.this.s();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void c() {
            a.this.v();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void onADClicked() {
            a.this.r();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void onADExposure() {
            a.this.t();
            n.a(new RunnableC0127a(), 1L);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void onADLeftApplication() {
            a.this.q();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void onNoAD(AdError adError) {
            a.this.b(new i(adError.getErrorCode(), adError.getErrorMsg()));
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void onRenderFail() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void onRenderSuccess() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b.a
        public void onVideoCached() {
            a.this.w();
        }
    }

    public a(d dVar, e eVar) {
        super(dVar, eVar);
        this.f3137m = new AtomicBoolean();
        this.f3138n = new C0126a();
        this.f3139o = new b.C0097b().b(1).a(1).a(true).b(true).a();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.f, com.aggmoread.sdk.z.c.a.a.c.p.b
    public void a(Activity activity) {
        if (this.f2845i && this.f3136l != null && this.f3137m.compareAndSet(false, true)) {
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMFTAGGDT", "show #2 ");
            if (activity == null) {
                super.b();
                return;
            }
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.a.a(this.f3136l, k());
            this.f3136l.showFullScreenAD(activity);
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(c cVar) {
        this.f3246e = cVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.f, com.aggmoread.sdk.z.c.a.a.c.p.b
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
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3136l, i5, i4, str);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void c(int i4) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3136l, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.p.b
    public void destroy() {
        UnifiedInterstitialAD unifiedInterstitialAD = this.f3136l;
        if (unifiedInterstitialAD != null) {
            unifiedInterstitialAD.setMediaListener(null);
            this.f3136l.destroy();
            this.f3136l = null;
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
        this.f3136l = (UnifiedInterstitialAD) com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3244c.f3260d, this.f3245d.f3309c.c(obj), this.f3245d.f3309c.c(e.c.T), d.e.FULLSCREEN, this.f3247f, new com.aggmoread.sdk.z.c.a.a.d.a.d.t.i.b(this.f3138n).a(), new Object[0]);
        com.aggmoread.sdk.z.c.a.a.c.t.b bVar = this.f3244c.f3275s;
        if (bVar == null) {
            bVar = this.f3139o;
        }
        this.f3136l.setVideoOption(new VideoOption.Builder().setDetailPageMuted(bVar.e()).setAutoPlayMuted(bVar.d()).setAutoPlayPolicy(bVar.a()).build());
        if (bVar.c() >= 5 && bVar.c() <= 61) {
            this.f3136l.setMinVideoDuration(bVar.c());
        }
        if (bVar.b() >= 5 && bVar.b() <= 61) {
            this.f3136l.setMaxVideoDuration(bVar.b());
        }
        boolean a5 = m.a("4.390");
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMFTAGGDT", "reward " + a5);
        if (a5) {
            com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.b(this.f3136l, this.f3244c, this.f3245d);
        }
        this.f2845i = false;
        new k(this.f3244c, this.f3245d).a(0).b();
        this.f3136l.loadFullScreenAD();
    }
}

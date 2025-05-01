package com.aggmoread.sdk.z.c.a.a.d.a.d.p.f;

import android.content.Context;
import com.aggmoread.sdk.z.c.a.a.d.a.c;
import com.aggmoread.sdk.z.c.a.a.d.a.d.f;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.e;
import com.aggmoread.sdk.z.c.a.a.e.n;
import com.baidu.mobads.sdk.api.FullScreenVideoAd;
import com.baidu.mobads.sdk.api.RequestParameters;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a extends f {

    /* renamed from: l  reason: collision with root package name */
    private FullScreenVideoAd f2987l;

    /* renamed from: m  reason: collision with root package name */
    private AtomicBoolean f2988m;

    /* renamed from: n  reason: collision with root package name */
    private FullScreenVideoAd.FullScreenVideoAdListener f2989n;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.p.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0111a implements FullScreenVideoAd.FullScreenVideoAdListener {

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.p.f.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0112a implements Runnable {
            RunnableC0112a() {
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
            }
        }

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.p.f.a$a$b */
        /* loaded from: classes2.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l.a(((f) a.this).f2846j, 2);
            }
        }

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.p.f.a$a$c */
        /* loaded from: classes2.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l.a(((f) a.this).f2846j, 2);
            }
        }

        C0111a() {
        }

        public void onAdClick() {
            e.b("AMFTAGBD", "onADClicked");
            a.this.r();
        }

        public void onAdClose(float f5) {
            e.b("AMFTAGBD", "onADClosed playScale = " + f5);
            a.this.s();
        }

        public void onAdFailed(String str) {
            e.b("AMFTAGBD", "failed " + str);
            a.this.b(new i(-1000, str));
        }

        public void onAdLoaded() {
            e.b("AMFTAGBD", "onADReceive");
            int a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a((Object) a.this.f2987l);
            if (com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(a.this.f3245d, a5)) {
                a.this.a(a5, 0);
                return;
            }
            a.this.b(a5);
            a aVar = a.this;
            com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.b(aVar.f3243b, a5, aVar.f3245d);
            a.this.u();
        }

        public void onAdShow() {
            e.b("AMFTAGBD", "onAdShow");
            a.this.v();
            a.this.t();
            n.a(new RunnableC0112a(), 1L);
        }

        public void onAdSkip(float f5) {
            e.b("AMFTAGBD", "onAdSkip playScale = " + f5);
            n.a(new c(), 1000L);
        }

        public void onVideoDownloadFailed() {
            e.b("AMFTAGBD", "onVideoDownloadFailed");
            a.this.b(new i(-1000, "视频素材缓存失败"));
        }

        public void onVideoDownloadSuccess() {
            e.b("AMFTAGBD", "onVideoDownloadSuccess");
            a.this.w();
        }

        public void playCompletion() {
            e.b("AMFTAGBD", "playCompletion");
            n.a(new b(), 1000L);
            a.this.x();
        }
    }

    public a(d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
        this.f2988m = new AtomicBoolean();
        this.f2989n = new C0111a();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(c cVar) {
        this.f3246e = cVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.f, com.aggmoread.sdk.z.c.a.a.c.p.b
    public void b() {
        if (this.f2845i && this.f2987l != null && this.f2988m.compareAndSet(false, true)) {
            e.b("AMFTAGBD", "show #1 ");
            this.f2987l.show();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f2987l, "203");
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void c(int i4) {
        e.c("win " + i4);
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f2987l, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.p.b
    public void destroy() {
        if (this.f2987l != null) {
            this.f2987l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public String j() {
        return com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a().a(this.f2987l);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        if (m()) {
            return;
        }
        Context a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f3244c, this.f3245d, this.f3248g);
        String a6 = this.f3245d.f3309c.a(e.c.X, "");
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(a5, a6);
        FullScreenVideoAd fullScreenVideoAd = new FullScreenVideoAd(a5.getApplicationContext(), this.f3245d.f3309c.c(e.c.T), this.f2989n);
        this.f2987l = fullScreenVideoAd;
        fullScreenVideoAd.setAppSid(a6);
        this.f2845i = false;
        new k(this.f3244c, this.f3245d).a(0).b();
        try {
            RequestParameters.Builder builder = new RequestParameters.Builder();
            com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(builder, this.f3244c, this.f3245d);
            com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f2987l, builder.build());
        } catch (Exception unused) {
        }
        this.f2987l.load();
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMFTAGBD", "load enter");
    }
}

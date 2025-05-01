package com.beizi.fusion.work.b;

import android.content.Context;
import android.view.View;
import com.beizi.fusion.b.d;
import com.beizi.fusion.d.c;
import com.beizi.fusion.d.e;
import com.beizi.fusion.d.h;
import com.beizi.fusion.d.u;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import java.util.List;
import java.util.Map;
/* compiled from: CsjDrawAdWorker.java */
/* loaded from: classes2.dex */
public class a extends com.beizi.fusion.work.a implements c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7456n;

    /* renamed from: o  reason: collision with root package name */
    private String f7457o;

    /* renamed from: p  reason: collision with root package name */
    private long f7458p;

    /* renamed from: q  reason: collision with root package name */
    private long f7459q;

    /* renamed from: r  reason: collision with root package name */
    private TTAdNative f7460r;

    /* renamed from: s  reason: collision with root package name */
    private View f7461s;

    public a(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, e eVar) {
        this.f7456n = context;
        this.f7457o = str;
        this.f7458p = j4;
        this.f7459q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        r();
    }

    @Override // com.beizi.fusion.work.a
    public void ay() {
        v();
        e();
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "CSJ";
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f7376h = this.f7373e.getAppId();
        this.f7377i = this.f7373e.getSpaceId();
        this.f7371c = this.f7373e.getBuyerSpaceUuId();
        af.b("BeiZis", "AdWorker chanel = " + this.f7371c);
        d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.bytedance.sdk.openadsdk.TTAdNative")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.b.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                u.a(this, this.f7456n, this.f7376h, this.f7373e.getDirectDownload());
                this.f7370b.t(TTAdSdk.getAdManager().getSDKVersion());
                au();
            }
        }
    }

    @Override // com.beizi.fusion.work.a
    public void e() {
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(this.f7459q);
        long j4 = this.f7459q;
        if (j4 > 0) {
            this.f7381m.sendEmptyMessageDelayed(1, j4);
            return;
        }
        e eVar = this.f7372d;
        if (eVar == null || eVar.s() >= 1 || this.f7372d.r() == 2) {
            return;
        }
        l();
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        if (av()) {
            return;
        }
        this.f7460r = u.a().createAdNative(this.f7456n);
        this.f7460r.loadExpressDrawFeedAd(new AdSlot.Builder().setCodeId(this.f7377i).setSupportDeepLink(true).setAdCount(1).setExpressViewAcceptedSize(com.beizi.fusion.g.a.a(this.f7456n), 0.0f).build(), new TTAdNative.NativeExpressAdListener() { // from class: com.beizi.fusion.work.b.a.2
            @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
            public void onError(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showCsjDrawAd Callback --> onError code=");
                sb.append(i4);
                sb.append(" , message=");
                sb.append(str);
                a.this.a(str, i4);
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
            public void onNativeExpressAdLoad(List<TTNativeExpressAd> list) {
                ((com.beizi.fusion.work.a) a.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                a.this.y();
                if (list == null || list.size() == 0) {
                    a.this.c(-991);
                } else {
                    a.this.a(list);
                }
            }
        });
    }

    @Override // com.beizi.fusion.work.a
    public View o() {
        return this.f7461s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" DrawAdWorkers:");
        sb.append(q4.toString());
        Z();
        h hVar = this.f7375g;
        if (hVar == h.SUCCESS) {
            if (this.f7461s != null) {
                this.f7372d.a(g(), this.f7461s);
            } else {
                this.f7372d.a(10140);
            }
        } else if (hVar == h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<TTNativeExpressAd> list) {
        TTNativeExpressAd tTNativeExpressAd = list.get(0);
        tTNativeExpressAd.setVideoAdListener(new TTNativeExpressAd.ExpressVideoAdListener() { // from class: com.beizi.fusion.work.b.a.3
            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
            public void onClickRetry() {
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
            public void onProgressUpdate(long j4, long j5) {
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
            public void onVideoAdComplete() {
                if (((com.beizi.fusion.work.a) a.this).f7372d != null) {
                    ((com.beizi.fusion.work.a) a.this).f7372d.l();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
            public void onVideoAdContinuePlay() {
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
            public void onVideoAdPaused() {
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
            public void onVideoAdStartPlay() {
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
            public void onVideoError(int i4, int i5) {
                StringBuilder sb = new StringBuilder();
                sb.append("showCsjDrawAd Callback --> onVideoError() errorCode=");
                sb.append(i4);
                sb.append(", extraCode=");
                sb.append(i5);
                a.this.a(String.valueOf(i5), i4);
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
            public void onVideoLoad() {
            }
        });
        tTNativeExpressAd.setCanInterruptVideoPlay(true);
        tTNativeExpressAd.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() { // from class: com.beizi.fusion.work.b.a.4

            /* renamed from: a  reason: collision with root package name */
            boolean f7465a = false;

            /* renamed from: b  reason: collision with root package name */
            boolean f7466b = false;

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onAdClicked(View view, int i4) {
                if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) a.this).f7372d.d(a.this.g());
                }
                if (this.f7466b) {
                    return;
                }
                this.f7466b = true;
                a.this.E();
                a.this.ai();
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onAdShow(View view, int i4) {
                ((com.beizi.fusion.work.a) a.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) a.this).f7372d.b(a.this.g());
                }
                if (this.f7465a) {
                    return;
                }
                this.f7465a = true;
                a.this.C();
                a.this.D();
                a.this.ah();
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onRenderFail(View view, String str, int i4) {
                StringBuilder sb = new StringBuilder();
                sb.append("showCsjDrawAd Callback --> onRenderFail() code=");
                sb.append(i4);
                sb.append(", error=");
                sb.append(str);
                a.this.a(str, i4);
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onRenderSuccess(View view, float f5, float f6) {
                a.this.f7461s = view;
                if (a.this.Y()) {
                    a.this.b();
                } else {
                    a.this.O();
                }
            }
        });
        tTNativeExpressAd.render();
    }
}

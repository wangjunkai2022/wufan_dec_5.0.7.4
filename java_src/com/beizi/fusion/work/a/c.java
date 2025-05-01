package com.beizi.fusion.work.a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.beizi.fusion.d.e;
import com.beizi.fusion.d.h;
import com.beizi.fusion.d.u;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import java.util.List;
import java.util.Map;
/* compiled from: CsjBannerAdWorker.java */
/* loaded from: classes2.dex */
public class c extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7428n;

    /* renamed from: o  reason: collision with root package name */
    private String f7429o;

    /* renamed from: p  reason: collision with root package name */
    private long f7430p;

    /* renamed from: q  reason: collision with root package name */
    private long f7431q;

    /* renamed from: r  reason: collision with root package name */
    private TTAdNative f7432r;

    /* renamed from: s  reason: collision with root package name */
    private TTNativeExpressAd f7433s;

    /* renamed from: t  reason: collision with root package name */
    private View f7434t;

    /* renamed from: u  reason: collision with root package name */
    private float f7435u;

    /* renamed from: v  reason: collision with root package name */
    private float f7436v;

    /* renamed from: w  reason: collision with root package name */
    private ViewGroup f7437w;

    public c(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, e eVar, float f5, float f6, ViewGroup viewGroup) {
        this.f7428n = context;
        this.f7429o = str;
        this.f7430p = j4;
        this.f7431q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f7435u = f5;
        this.f7436v = f6;
        this.f7437w = viewGroup;
        r();
    }

    @Override // com.beizi.fusion.work.a
    public void ay() {
        v();
        e();
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "CSJ";
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f7376h = this.f7373e.getAppId();
        this.f7377i = this.f7373e.getSpaceId();
        af.b("BeiZis", "AdWorker chanel = " + this.f7371c);
        com.beizi.fusion.b.d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.bytedance.sdk.openadsdk.TTAdNative")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.a.c.1
                        @Override // java.lang.Runnable
                        public void run() {
                            c.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                u.a(this, this.f7428n, this.f7376h, this.f7373e.getDirectDownload());
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
        sb.append(this.f7431q);
        long j4 = this.f7431q;
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
    public void f() {
        ViewGroup viewGroup = this.f7437w;
        if (viewGroup != null && this.f7434t != null) {
            if (viewGroup.getChildCount() > 0) {
                this.f7437w.removeAllViews();
            }
            this.f7437w.addView(this.f7434t);
            return;
        }
        aw();
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
        if (this.f7435u <= 0.0f) {
            this.f7435u = av.j(this.f7428n);
        }
        if (this.f7436v <= 0.0f) {
            this.f7436v = Math.round(this.f7435u / 6.4f);
        }
        if (av()) {
            return;
        }
        this.f7432r = u.a().createAdNative((Activity) this.f7428n);
        this.f7432r.loadBannerExpressAd(new AdSlot.Builder().setCodeId(this.f7377i).setSupportDeepLink(true).setAdCount(1).setExpressViewAcceptedSize(this.f7435u, this.f7436v).build(), new TTAdNative.NativeExpressAdListener() { // from class: com.beizi.fusion.work.a.c.2
            @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
            public void onError(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showCsjBannerAd Callback --> onError:");
                sb.append(str);
                c.this.a(str, i4);
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
            public void onNativeExpressAdLoad(List<TTNativeExpressAd> list) {
                ((com.beizi.fusion.work.a) c.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                c.this.y();
                if (list == null || list.size() == 0) {
                    c.this.c(-991);
                    return;
                }
                c.this.f7433s = list.get(0);
                c.this.f7433s.setSlideIntervalTime(30000);
                c cVar = c.this;
                cVar.a(cVar.f7433s);
                c.this.f7433s.render();
            }
        });
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        TTNativeExpressAd tTNativeExpressAd = this.f7433s;
        if (tTNativeExpressAd != null) {
            tTNativeExpressAd.destroy();
        }
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
        sb.append(" BannerAdWorkers:");
        sb.append(q4.toString());
        Z();
        h hVar = this.f7375g;
        if (hVar == h.SUCCESS) {
            ViewGroup viewGroup = this.f7437w;
            if (viewGroup != null && this.f7434t != null) {
                if (viewGroup.getChildCount() > 0) {
                    this.f7437w.removeAllViews();
                }
                this.f7437w.addView(this.f7434t);
                this.f7372d.a(g(), (View) null);
                return;
            }
            this.f7372d.a(10140);
        } else if (hVar == h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TTNativeExpressAd tTNativeExpressAd) {
        tTNativeExpressAd.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() { // from class: com.beizi.fusion.work.a.c.3
            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onAdClicked(View view, int i4) {
                if (((com.beizi.fusion.work.a) c.this).f7372d != null) {
                    ((com.beizi.fusion.work.a) c.this).f7372d.d(c.this.g());
                }
                c.this.E();
                c.this.ai();
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onAdShow(View view, int i4) {
                ((com.beizi.fusion.work.a) c.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                if (((com.beizi.fusion.work.a) c.this).f7372d != null) {
                    ((com.beizi.fusion.work.a) c.this).f7372d.b(c.this.g());
                }
                c.this.C();
                c.this.D();
                c.this.ah();
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onRenderFail(View view, String str, int i4) {
                c.this.a(str, i4);
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onRenderSuccess(View view, float f5, float f6) {
                StringBuilder sb = new StringBuilder();
                sb.append("showCsjBannerAd Callback --> onRenderSuccess() width== ");
                sb.append(f5);
                sb.append(", height== ");
                sb.append(f6);
                c.this.f7434t = view;
                if (c.this.Y()) {
                    c.this.b();
                } else {
                    c.this.O();
                }
            }
        });
        b(tTNativeExpressAd);
    }

    private void b(TTNativeExpressAd tTNativeExpressAd) {
        try {
            tTNativeExpressAd.setDislikeCallback((Activity) this.f7428n, new TTAdDislike.DislikeInteractionCallback() { // from class: com.beizi.fusion.work.a.c.4
                @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                public void onCancel() {
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                public void onSelected(int i4, String str, boolean z4) {
                    if (((com.beizi.fusion.work.a) c.this).f7372d != null) {
                        ((com.beizi.fusion.work.a) c.this).f7372d.c(c.this.g());
                    }
                    c.this.G();
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                public void onShow() {
                }
            });
        } catch (Exception unused) {
        }
    }
}

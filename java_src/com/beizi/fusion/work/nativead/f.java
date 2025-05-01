package com.beizi.fusion.work.nativead;

import android.app.Activity;
import android.content.Context;
import android.view.View;
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
/* compiled from: CsjNativeAdWorker.java */
/* loaded from: classes2.dex */
public class f extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7869n;

    /* renamed from: o  reason: collision with root package name */
    private String f7870o;

    /* renamed from: p  reason: collision with root package name */
    private long f7871p;

    /* renamed from: q  reason: collision with root package name */
    private long f7872q;

    /* renamed from: r  reason: collision with root package name */
    private TTAdNative f7873r;

    /* renamed from: s  reason: collision with root package name */
    private TTNativeExpressAd f7874s;

    /* renamed from: t  reason: collision with root package name */
    private float f7875t;

    /* renamed from: u  reason: collision with root package name */
    private float f7876u;

    /* renamed from: v  reason: collision with root package name */
    private View f7877v;

    public f(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar, float f5, float f6) {
        this.f7869n = context;
        this.f7870o = str;
        this.f7871p = j4;
        this.f7872q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f7875t = f5;
        this.f7876u = f6;
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
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f7376h = this.f7373e.getAppId();
        this.f7377i = this.f7373e.getSpaceId();
        this.f7371c = this.f7373e.getBuyerSpaceUuId();
        af.b("BeiZis", "AdWorker chanel = " + this.f7371c);
        com.beizi.fusion.b.d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.bytedance.sdk.openadsdk.TTAdNative")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.nativead.f.1
                        @Override // java.lang.Runnable
                        public void run() {
                            f.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                u.a(this, this.f7869n, this.f7376h, this.f7373e.getDirectDownload());
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
        sb.append(this.f7872q);
        long j4 = this.f7872q;
        if (j4 > 0) {
            this.f7381m.sendEmptyMessageDelayed(1, j4);
            return;
        }
        com.beizi.fusion.d.e eVar = this.f7372d;
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
        this.f7873r = u.a().createAdNative(this.f7869n);
        if (this.f7875t <= 0.0f) {
            this.f7875t = av.j(this.f7869n);
        }
        if (this.f7876u <= 0.0f) {
            this.f7876u = 0.0f;
        }
        this.f7873r.loadNativeExpressAd(new AdSlot.Builder().setCodeId(this.f7377i).setSupportDeepLink(true).setAdCount(1).setExpressViewAcceptedSize(this.f7875t, this.f7876u).build(), new TTAdNative.NativeExpressAdListener() { // from class: com.beizi.fusion.work.nativead.f.2
            @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
            public void onError(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showCsjNativeAd Callback --> onError:");
                sb.append(str);
                f.this.a(str, i4);
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
            public void onNativeExpressAdLoad(List<TTNativeExpressAd> list) {
                ((com.beizi.fusion.work.a) f.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                f.this.y();
                if (list == null || list.size() == 0) {
                    f.this.c(-991);
                    return;
                }
                f.this.f7874s = list.get(0);
                f fVar = f.this;
                fVar.a(fVar.f7874s);
                f.this.f7874s.render();
            }
        });
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        TTNativeExpressAd tTNativeExpressAd = this.f7874s;
        if (tTNativeExpressAd != null) {
            tTNativeExpressAd.destroy();
        }
    }

    @Override // com.beizi.fusion.work.a
    public View o() {
        return this.f7877v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" NativeAdWorkers:");
        sb.append(q4.toString());
        Z();
        com.beizi.fusion.d.h hVar = this.f7375g;
        if (hVar == com.beizi.fusion.d.h.SUCCESS) {
            if (this.f7874s != null && this.f7877v != null) {
                this.f7372d.a(g(), this.f7877v);
            } else {
                this.f7372d.a(10140);
            }
        } else if (hVar == com.beizi.fusion.d.h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TTNativeExpressAd tTNativeExpressAd) {
        tTNativeExpressAd.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() { // from class: com.beizi.fusion.work.nativead.f.3

            /* renamed from: a  reason: collision with root package name */
            boolean f7880a = false;

            /* renamed from: b  reason: collision with root package name */
            boolean f7881b = false;

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onAdClicked(View view, int i4) {
                if (((com.beizi.fusion.work.a) f.this).f7372d != null && ((com.beizi.fusion.work.a) f.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) f.this).f7372d.d(f.this.g());
                }
                if (this.f7881b) {
                    return;
                }
                this.f7881b = true;
                f.this.E();
                f.this.ai();
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onAdShow(View view, int i4) {
                ((com.beizi.fusion.work.a) f.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                if (((com.beizi.fusion.work.a) f.this).f7372d != null && ((com.beizi.fusion.work.a) f.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) f.this).f7372d.b(f.this.g());
                }
                if (this.f7880a) {
                    return;
                }
                this.f7880a = true;
                f.this.C();
                f.this.D();
                f.this.ah();
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onRenderFail(View view, String str, int i4) {
                f.this.a(str, i4);
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onRenderSuccess(View view, float f5, float f6) {
                f.this.f7877v = view;
                if (f.this.Y()) {
                    f.this.b();
                } else {
                    f.this.O();
                }
            }
        });
        b(tTNativeExpressAd);
    }

    private void b(TTNativeExpressAd tTNativeExpressAd) {
        try {
            tTNativeExpressAd.setDislikeCallback((Activity) this.f7869n, new TTAdDislike.DislikeInteractionCallback() { // from class: com.beizi.fusion.work.nativead.f.4
                @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                public void onCancel() {
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                public void onSelected(int i4, String str, boolean z4) {
                    if (((com.beizi.fusion.work.a) f.this).f7372d != null && ((com.beizi.fusion.work.a) f.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) f.this).f7372d.b(f.this.g(), f.this.f7877v);
                    }
                    f.this.G();
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                public void onShow() {
                }
            });
        } catch (Exception unused) {
        }
    }
}

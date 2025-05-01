package com.beizi.fusion.work.splash;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.baidu.mobads.sdk.api.AdSettings;
import com.baidu.mobads.sdk.api.RequestParameters;
import com.baidu.mobads.sdk.api.SplashAd;
import com.baidu.mobads.sdk.api.SplashInteractionListener;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.tencent.bugly.Bugly;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* compiled from: BaiduSplashWorker.java */
/* loaded from: classes2.dex */
public class a extends com.beizi.fusion.work.a {
    private float A;

    /* renamed from: n  reason: collision with root package name */
    private Context f7931n;

    /* renamed from: o  reason: collision with root package name */
    private String f7932o;

    /* renamed from: p  reason: collision with root package name */
    private long f7933p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f7934q;

    /* renamed from: r  reason: collision with root package name */
    private View f7935r;

    /* renamed from: s  reason: collision with root package name */
    private ViewGroup f7936s;

    /* renamed from: t  reason: collision with root package name */
    private ViewGroup f7937t;

    /* renamed from: u  reason: collision with root package name */
    private SplashAd f7938u;

    /* renamed from: v  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f7939v;

    /* renamed from: w  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f7940w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f7941x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    private boolean f7942y;

    /* renamed from: z  reason: collision with root package name */
    private float f7943z;

    public a(Context context, String str, long j4, View view, ViewGroup viewGroup, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, List<AdSpacesBean.RenderViewBean> list, com.beizi.fusion.d.e eVar) {
        this.f7931n = context;
        this.f7932o = str;
        this.f7933p = j4;
        this.f7935r = view;
        this.f7936s = viewGroup;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f7937t = new SplashContainer(context);
        this.f7939v = list;
        r();
    }

    private void aG() {
        ViewGroup viewGroup;
        SplashAd splashAd = this.f7938u;
        if (splashAd != null && (viewGroup = this.f7936s) != null) {
            splashAd.show(viewGroup);
        } else {
            aw();
        }
    }

    private void aH() {
        for (int i4 = 0; i4 < this.f7939v.size(); i4++) {
            AdSpacesBean.RenderViewBean renderViewBean = this.f7939v.get(i4);
            String type = renderViewBean.getType();
            if ("SKIPVIEW".equals(type)) {
                this.f7941x.add(renderViewBean);
            } else if ("MATERIALVIEW".equals(type)) {
                this.f7940w.add(renderViewBean);
            }
        }
        if (this.f7940w.size() > 0) {
            Collections.sort(this.f7940w, new Comparator<AdSpacesBean.RenderViewBean>() { // from class: com.beizi.fusion.work.splash.a.3
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(AdSpacesBean.RenderViewBean renderViewBean2, AdSpacesBean.RenderViewBean renderViewBean3) {
                    return renderViewBean3.getLevel() - renderViewBean2.getLevel();
                }
            });
        }
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.f7938u == null) {
            return;
        }
        al();
    }

    @Override // com.beizi.fusion.work.a
    public void az() {
        SplashAd splashAd;
        if (!an() || (splashAd = this.f7938u) == null || TextUtils.isEmpty(splashAd.getECPMLevel()) || this.f7934q) {
            return;
        }
        this.f7934q = true;
        af.a("BeiZis", "showBdSplash channel == Baidu竞价成功");
        af.a("BeiZis", "showBdSplash channel == sendWinNoticeECPM:" + this.f7938u.getECPMLevel());
        SplashAd splashAd2 = this.f7938u;
        splashAd2.biddingSuccess(splashAd2.getECPMLevel());
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "BAIDU";
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
                if (!av.a("com.baidu.mobads.sdk.api.BDAdConfig")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                this.f7370b.v(String.valueOf(AdSettings.getSDKVersion()));
                au();
                com.beizi.fusion.d.f.a(this.f7931n, this.f7376h);
                v();
            }
        }
        long sleepTime = this.f7374f.getSleepTime();
        if (this.f7372d.u()) {
            sleepTime = Math.max(sleepTime, this.f7374f.getHotRequestDelay());
        }
        List<AdSpacesBean.RenderViewBean> list = this.f7939v;
        boolean z4 = list != null && list.size() > 0;
        this.f7942y = z4;
        if (z4) {
            aH();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(sleepTime);
        if (sleepTime > 0) {
            this.f7381m.sendEmptyMessageDelayed(1, sleepTime);
        } else {
            com.beizi.fusion.d.e eVar = this.f7372d;
            if (eVar != null && eVar.s() < 1 && this.f7372d.r() != 2) {
                l();
            }
        }
        this.f7943z = av.l(this.f7931n);
        this.A = av.m(this.f7931n);
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" out make show ad");
        aG();
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        SplashAd splashAd;
        if (an() && (splashAd = this.f7938u) != null) {
            return splashAd.getECPMLevel();
        }
        return null;
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        SplashAd splashAd = new SplashAd((Activity) this.f7931n, this.f7377i, new RequestParameters.Builder().addExtra("fetchAd", Bugly.SDK_IS_DEV).addExtra("shake_logo_size", "80").addExtra("displayDownloadInfo", "true").addExtra("use_dialog_frame", Bugly.SDK_IS_DEV).addExtra("timeout", String.valueOf(this.f7933p)).build(), new SplashInteractionListener() { // from class: com.beizi.fusion.work.splash.a.2

            /* renamed from: a  reason: collision with root package name */
            boolean f7945a = false;

            /* renamed from: b  reason: collision with root package name */
            boolean f7946b = false;

            public void onADLoaded() {
                try {
                    if (a.this.f7938u != null && !TextUtils.isEmpty(a.this.f7938u.getECPMLevel())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("showBdSplash getECPMLevel:");
                        sb.append(a.this.f7938u.getECPMLevel());
                        a aVar = a.this;
                        aVar.a(Double.parseDouble(aVar.f7938u.getECPMLevel()));
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                ((com.beizi.fusion.work.a) a.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                a.this.y();
                if (a.this.Y()) {
                    a.this.b();
                } else {
                    a.this.O();
                }
            }

            public void onAdCacheFailed() {
            }

            public void onAdCacheSuccess() {
            }

            public void onAdClick() {
                if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) a.this).f7372d.d(a.this.g());
                    ((com.beizi.fusion.work.a) a.this).f7381m.sendEmptyMessageDelayed(2, (((com.beizi.fusion.work.a) a.this).f7380l + 5000) - System.currentTimeMillis());
                }
                if (this.f7946b) {
                    return;
                }
                this.f7946b = true;
                a.this.E();
                a.this.ai();
            }

            public void onAdDismissed() {
                if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                    a.this.ac();
                }
                a.this.G();
            }

            public void onAdFailed(String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showBdSplash onAdFailed:");
                sb.append(str);
                a.this.a(str, 3793);
            }

            public void onAdPresent() {
                ((com.beizi.fusion.work.a) a.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                if (this.f7945a) {
                    return;
                }
                this.f7945a = true;
                a.this.az();
                a.this.ab();
                a.this.C();
                a.this.D();
                a.this.ah();
            }

            public void onLpClosed() {
            }
        });
        this.f7938u = splashAd;
        splashAd.load();
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
        sb.append(" splashWorkers:");
        sb.append(q4.toString());
        Z();
        com.beizi.fusion.d.h hVar = this.f7375g;
        if (hVar == com.beizi.fusion.d.h.SUCCESS) {
            ad();
        } else if (hVar == com.beizi.fusion.d.h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beizi.fusion.work.a
    public void a(Message message) {
        com.beizi.fusion.b.b bVar = this.f7370b;
        if (bVar != null) {
            bVar.i(String.valueOf(message.obj));
            au();
            B();
        }
    }

    @Override // com.beizi.fusion.work.a
    public void d(int i4) {
        SplashAd splashAd = this.f7938u;
        if (splashAd == null || TextUtils.isEmpty(splashAd.getECPMLevel()) || this.f7934q) {
            return;
        }
        this.f7934q = true;
        af.a("BeiZis", "showBdSplash channel == Baidu竞价失败:" + i4);
        this.f7938u.biddingFail(i4 != 1 ? i4 != 2 ? "900" : "100" : "203");
    }
}

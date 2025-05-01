package com.beizi.fusion.work.splash;

import android.content.Context;
import android.view.ViewGroup;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.listeners.AdActionListener;
import com.huawei.openalliance.ad.inter.listeners.AdListener;
import com.huawei.openalliance.ad.views.PPSSplashView;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: HwSplashWorker.java */
/* loaded from: classes2.dex */
public class h extends com.beizi.fusion.work.a {

    /* renamed from: n  reason: collision with root package name */
    long f8098n;

    /* renamed from: o  reason: collision with root package name */
    private Context f8099o;

    /* renamed from: p  reason: collision with root package name */
    private String f8100p;

    /* renamed from: q  reason: collision with root package name */
    private long f8101q;

    /* renamed from: r  reason: collision with root package name */
    private ViewGroup f8102r;

    /* renamed from: s  reason: collision with root package name */
    private PPSSplashView f8103s;

    /* renamed from: t  reason: collision with root package name */
    private ViewGroup f8104t;

    public h(Context context, String str, long j4, ViewGroup viewGroup, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar) {
        this.f8099o = context;
        this.f8100p = str;
        this.f8101q = j4;
        this.f8102r = viewGroup;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f8104t = new SplashContainer(context);
        r();
    }

    private void aG() {
        ViewGroup viewGroup = this.f8102r;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            ViewGroup viewGroup2 = this.f8104t;
            if (viewGroup2 != null) {
                this.f8102r.addView(viewGroup2);
                return;
            } else {
                aw();
                return;
            }
        }
        aw();
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "HUAWEI";
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f8098n = System.currentTimeMillis();
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
                if (!av.a("com.huawei.openalliance.ad.views.PPSSplashView")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.h.1
                        @Override // java.lang.Runnable
                        public void run() {
                            h.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                HiAd.getInstance(this.f8099o).initLog(true, 4);
                HiAd.getInstance(this.f8099o).enableUserInfo(true);
                v();
            }
        }
        long sleepTime = this.f7374f.getSleepTime();
        if (this.f7372d.u()) {
            sleepTime = Math.max(sleepTime, this.f7374f.getHotRequestDelay());
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
            return;
        }
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar == null || eVar.s() >= 1 || this.f7372d.r() == 2) {
            return;
        }
        l();
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
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f7377i);
        AdSlotParam.Builder builder = new AdSlotParam.Builder();
        builder.setAdIds(arrayList).setDeviceType(4).setOrientation(1).setTest(false);
        PPSSplashView pPSSplashView = new PPSSplashView(this.f8099o);
        this.f8103s = pPSSplashView;
        pPSSplashView.setAdSlotParam(builder.build());
        this.f8103s.setAdListener(new AdListener() { // from class: com.beizi.fusion.work.splash.h.2
            public void onAdDismissed() {
                h.this.ac();
                h.this.G();
            }

            public void onAdFailedToLoad(int i4) {
                StringBuilder sb = new StringBuilder();
                sb.append("showHwSplash onAdFailedToLoad() ");
                sb.append(i4);
                h.this.a(String.valueOf(i4), i4);
            }

            public void onAdLoaded() {
                h.this.y();
                ((com.beizi.fusion.work.a) h.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                h hVar = h.this;
                hVar.f8104t = hVar.f8103s;
                if (h.this.Y()) {
                    h.this.b();
                } else {
                    h.this.O();
                }
            }
        });
        this.f8103s.setAdActionListener(new AdActionListener() { // from class: com.beizi.fusion.work.splash.h.3
            public void onAdClick() {
                h.this.E();
                if (((com.beizi.fusion.work.a) h.this).f7372d != null) {
                    if (((com.beizi.fusion.work.a) h.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) h.this).f7372d.d(h.this.g());
                    }
                    h.this.ai();
                }
            }

            public void onAdShowed() {
                h.this.C();
                ((com.beizi.fusion.work.a) h.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                h.this.ab();
                h.this.D();
                h.this.ah();
            }
        });
        this.f8103s.loadAd();
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
}

package com.beizi.fusion.work.g;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.beizi.fusion.d.h;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.RewardAdLoader;
import com.huawei.openalliance.ad.inter.data.IRewardAd;
import com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener;
import com.huawei.openalliance.ad.inter.listeners.RewardAdListener;
import java.util.List;
import java.util.Map;
/* compiled from: HwRewardVideoWorker.java */
/* loaded from: classes2.dex */
public class d extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7611n;

    /* renamed from: o  reason: collision with root package name */
    private String f7612o;

    /* renamed from: p  reason: collision with root package name */
    private long f7613p;

    /* renamed from: q  reason: collision with root package name */
    private long f7614q;

    /* renamed from: r  reason: collision with root package name */
    private RewardAdLoader f7615r;

    /* renamed from: s  reason: collision with root package name */
    private List<IRewardAd> f7616s;

    public d(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar) {
        this.f7611n = context;
        this.f7612o = str;
        this.f7613p = j4;
        this.f7614q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aG() {
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" RewardVideoWorkers:");
        sb.append(q4.toString());
        Z();
        h hVar = this.f7375g;
        if (hVar == h.SUCCESS) {
            com.beizi.fusion.d.e eVar2 = this.f7372d;
            if (eVar2 != null) {
                eVar2.a(g(), (View) null);
            }
        } else if (hVar == h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    public String b() {
        return "1020";
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
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
                if (!av.a("com.huawei.openalliance.ad.inter.RewardAdLoader")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.g.d.1
                        @Override // java.lang.Runnable
                        public void run() {
                            d.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                HiAd.getInstance(this.f7611n).initLog(true, 4);
                HiAd.getInstance(this.f7611n).enableUserInfo(true);
                v();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(this.f7614q);
        long j4 = this.f7614q;
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
        RewardAdLoader rewardAdLoader = new RewardAdLoader(this.f7611n, new String[]{this.f7377i});
        this.f7615r = rewardAdLoader;
        rewardAdLoader.setListener(new RewardAdListener() { // from class: com.beizi.fusion.work.g.d.2
            public void onAdFailed(int i4) {
                StringBuilder sb = new StringBuilder();
                sb.append("showHwRewardedVideo Callback --> onAdFailed: errorCode = ");
                sb.append(i4);
                d.this.a(String.valueOf(i4), i4);
            }

            public void onAdsLoaded(Map<String, List<IRewardAd>> map) {
                ((com.beizi.fusion.work.a) d.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                d.this.y();
                if (map == null && map.isEmpty()) {
                    d.this.c(-991);
                    return;
                }
                d dVar = d.this;
                dVar.f7616s = map.get(((com.beizi.fusion.work.a) dVar).f7377i);
                if (d.this.Y()) {
                    d.this.aG();
                } else {
                    d.this.O();
                }
            }
        });
        this.f7615r.loadAds(4, false);
    }

    @Override // com.beizi.fusion.work.a
    public void a(Activity activity) {
        List<IRewardAd> list = this.f7616s;
        if (list != null && !list.isEmpty()) {
            IRewardAd iRewardAd = this.f7616s.get(0);
            if (iRewardAd == null) {
                com.beizi.fusion.d.e eVar = this.f7372d;
                if (eVar != null) {
                    eVar.a(10140);
                    return;
                }
                return;
            } else if (!iRewardAd.isExpired() && iRewardAd.isValid()) {
                iRewardAd.setMute(true);
                iRewardAd.show(this.f7611n, new IRewardAdStatusListener() { // from class: com.beizi.fusion.work.g.d.3

                    /* renamed from: a  reason: collision with root package name */
                    boolean f7619a = false;

                    /* renamed from: b  reason: collision with root package name */
                    boolean f7620b = false;

                    public void onAdClicked() {
                        if (((com.beizi.fusion.work.a) d.this).f7372d != null && ((com.beizi.fusion.work.a) d.this).f7372d.r() != 2) {
                            ((com.beizi.fusion.work.a) d.this).f7372d.d(d.this.g());
                        }
                        if (this.f7620b) {
                            return;
                        }
                        this.f7620b = true;
                        d.this.E();
                        d.this.ai();
                    }

                    public void onAdClosed() {
                        if (((com.beizi.fusion.work.a) d.this).f7372d != null && ((com.beizi.fusion.work.a) d.this).f7372d.r() != 2) {
                            ((com.beizi.fusion.work.a) d.this).f7372d.c(d.this.b());
                        }
                        d.this.G();
                    }

                    public void onAdCompleted() {
                        if (((com.beizi.fusion.work.a) d.this).f7372d != null) {
                            ((com.beizi.fusion.work.a) d.this).f7372d.l();
                        }
                    }

                    public void onAdError(int i4, int i5) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("showHwRewardedVideo Callback --> onAdError: code = ");
                        sb.append(i4);
                        sb.append(" ，extra= ");
                        sb.append(i5);
                        d.this.a(String.valueOf(i4), i5);
                    }

                    public void onAdShown() {
                        ((com.beizi.fusion.work.a) d.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                        if (((com.beizi.fusion.work.a) d.this).f7372d != null && ((com.beizi.fusion.work.a) d.this).f7372d.r() != 2) {
                            ((com.beizi.fusion.work.a) d.this).f7372d.b(d.this.g());
                        }
                        if (this.f7619a) {
                            return;
                        }
                        this.f7619a = true;
                        d.this.C();
                        d.this.D();
                        d.this.ah();
                    }

                    public void onRewarded() {
                        if (((com.beizi.fusion.work.a) d.this).f7372d != null) {
                            d.this.J();
                            ((com.beizi.fusion.work.a) d.this).f7372d.k();
                        }
                    }
                });
                return;
            } else {
                com.beizi.fusion.d.e eVar2 = this.f7372d;
                if (eVar2 != null) {
                    eVar2.a(10140);
                    return;
                }
                return;
            }
        }
        com.beizi.fusion.d.e eVar3 = this.f7372d;
        if (eVar3 != null) {
            eVar3.a(10140);
        }
    }
}

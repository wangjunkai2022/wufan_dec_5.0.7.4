package com.beizi.fusion.work.g;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.baidu.mobads.sdk.api.AdSettings;
import com.baidu.mobads.sdk.api.RewardVideoAd;
import com.beizi.fusion.d.f;
import com.beizi.fusion.d.h;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import java.util.Map;
/* compiled from: BaiduRewardVideoWorker.java */
/* loaded from: classes2.dex */
public class a extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7576n;

    /* renamed from: o  reason: collision with root package name */
    private String f7577o;

    /* renamed from: p  reason: collision with root package name */
    private long f7578p;

    /* renamed from: q  reason: collision with root package name */
    private long f7579q;

    /* renamed from: r  reason: collision with root package name */
    private RewardVideoAd f7580r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f7581s;

    public a(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar) {
        this.f7576n = context;
        this.f7577o = str;
        this.f7578p = j4;
        this.f7579q = j5;
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

    @Override // com.beizi.fusion.work.a
    public void az() {
        RewardVideoAd rewardVideoAd;
        if (!an() || (rewardVideoAd = this.f7580r) == null || TextUtils.isEmpty(rewardVideoAd.getECPMLevel()) || this.f7581s) {
            return;
        }
        this.f7581s = true;
        af.a("BeiZis", "showBdRewardVideo channel == Baidu竞价成功");
        af.a("BeiZis", "showBdRewardVideo channel == sendWinNoticeECPM:" + this.f7580r.getECPMLevel());
        RewardVideoAd rewardVideoAd2 = this.f7580r;
        rewardVideoAd2.biddingSuccess(rewardVideoAd2.getECPMLevel());
    }

    public String b() {
        return "1018";
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
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
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.g.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                this.f7370b.v(String.valueOf(AdSettings.getSDKVersion()));
                f.a(this.f7576n, this.f7376h);
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
        sb.append(this.f7579q);
        long j4 = this.f7579q;
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
    public String j() {
        RewardVideoAd rewardVideoAd;
        if (an() && (rewardVideoAd = this.f7580r) != null) {
            return rewardVideoAd.getECPMLevel();
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
        RewardVideoAd rewardVideoAd = new RewardVideoAd(this.f7576n, this.f7377i, new RewardVideoAd.RewardVideoAdListener() { // from class: com.beizi.fusion.work.g.a.2

            /* renamed from: a  reason: collision with root package name */
            boolean f7583a = false;

            /* renamed from: b  reason: collision with root package name */
            boolean f7584b = false;

            public void onAdClick() {
                if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) a.this).f7372d.d(a.this.g());
                }
                if (this.f7584b) {
                    return;
                }
                this.f7584b = true;
                a.this.E();
                a.this.ai();
            }

            public void onAdClose(float f5) {
                if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) a.this).f7372d.c(a.this.b());
                }
                a.this.G();
            }

            public void onAdFailed(String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showBdRewardedVideo Callback --> onAdFailed: ");
                sb.append(str);
                a.this.a(str, 3793);
            }

            public void onAdLoaded() {
            }

            public void onAdShow() {
                ((com.beizi.fusion.work.a) a.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) a.this).f7372d.b(a.this.g());
                }
                if (this.f7583a) {
                    return;
                }
                this.f7583a = true;
                a.this.C();
                a.this.az();
                a.this.D();
                a.this.ah();
            }

            public void onAdSkip(float f5) {
                StringBuilder sb = new StringBuilder();
                sb.append("showBdRewardedVideo Callback --> onAdSkip():");
                sb.append(f5);
            }

            public void onRewardVerify(boolean z4) {
                StringBuilder sb = new StringBuilder();
                sb.append("showBdRewardedVideo Callback --> onRewardVerify():");
                sb.append(z4);
                if (z4) {
                    a.this.J();
                    if (((com.beizi.fusion.work.a) a.this).f7372d != null) {
                        ((com.beizi.fusion.work.a) a.this).f7372d.k();
                    }
                }
            }

            public void onVideoDownloadFailed() {
                a.this.a("sdk custom error ".concat("onVideoDownloadFailed"), 99991);
            }

            public void onVideoDownloadSuccess() {
                ((com.beizi.fusion.work.a) a.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                a.this.y();
                if (a.this.Y()) {
                    a.this.aG();
                } else {
                    a.this.O();
                }
            }

            public void playCompletion() {
                if (((com.beizi.fusion.work.a) a.this).f7372d != null) {
                    ((com.beizi.fusion.work.a) a.this).f7372d.l();
                }
            }
        }, false);
        this.f7580r = rewardVideoAd;
        rewardVideoAd.setAppSid(this.f7376h);
        this.f7580r.load();
    }

    @Override // com.beizi.fusion.work.a
    public void a(Activity activity) {
        RewardVideoAd rewardVideoAd = this.f7580r;
        if (rewardVideoAd != null && rewardVideoAd.isReady()) {
            this.f7580r.show();
            return;
        }
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar != null) {
            eVar.a(10140);
        }
    }

    @Override // com.beizi.fusion.work.a
    public void d(int i4) {
        RewardVideoAd rewardVideoAd = this.f7580r;
        if (rewardVideoAd == null || TextUtils.isEmpty(rewardVideoAd.getECPMLevel()) || this.f7581s) {
            return;
        }
        this.f7581s = true;
        af.a("BeiZis", "showBdRewardVideo channel == Baidu竞价失败:" + i4);
        this.f7580r.biddingFail(i4 != 1 ? i4 != 2 ? "900" : "100" : "203");
    }
}

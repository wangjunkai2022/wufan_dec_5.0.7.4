package com.beizi.fusion.work.c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.baidu.mobads.sdk.api.AdSettings;
import com.baidu.mobads.sdk.api.FullScreenVideoAd;
import com.beizi.fusion.d.e;
import com.beizi.fusion.d.f;
import com.beizi.fusion.d.h;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import java.util.Map;
/* compiled from: BaiduFullScreenVideoWorker.java */
/* loaded from: classes2.dex */
public class a extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7478n;

    /* renamed from: o  reason: collision with root package name */
    private String f7479o;

    /* renamed from: p  reason: collision with root package name */
    private long f7480p;

    /* renamed from: q  reason: collision with root package name */
    private long f7481q;

    /* renamed from: r  reason: collision with root package name */
    private FullScreenVideoAd f7482r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f7483s;

    public a(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, e eVar) {
        this.f7478n = context;
        this.f7479o = str;
        this.f7480p = j4;
        this.f7481q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aG() {
        e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" FullScreenVideoWorkers:");
        sb.append(q4.toString());
        Z();
        h hVar = this.f7375g;
        if (hVar == h.SUCCESS) {
            e eVar2 = this.f7372d;
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
        FullScreenVideoAd fullScreenVideoAd;
        if (!an() || (fullScreenVideoAd = this.f7482r) == null || TextUtils.isEmpty(fullScreenVideoAd.getECPMLevel()) || this.f7483s) {
            return;
        }
        this.f7483s = true;
        af.a("BeiZis", "showBdFullScreenVideo channel == Baidu竞价成功");
        af.a("BeiZis", "showBdFullScreenVideo channel == sendWinNoticeECPM:" + this.f7482r.getECPMLevel());
        FullScreenVideoAd fullScreenVideoAd2 = this.f7482r;
        fullScreenVideoAd2.biddingSuccess(fullScreenVideoAd2.getECPMLevel());
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
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.c.a.1
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
                f.a(this.f7478n, this.f7376h);
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
        sb.append(this.f7481q);
        long j4 = this.f7481q;
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
    public String j() {
        FullScreenVideoAd fullScreenVideoAd;
        if (an() && (fullScreenVideoAd = this.f7482r) != null) {
            return fullScreenVideoAd.getECPMLevel();
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
        FullScreenVideoAd fullScreenVideoAd = new FullScreenVideoAd(this.f7478n, this.f7377i, new FullScreenVideoAd.FullScreenVideoAdListener() { // from class: com.beizi.fusion.work.c.a.2

            /* renamed from: a  reason: collision with root package name */
            boolean f7485a = false;

            /* renamed from: b  reason: collision with root package name */
            boolean f7486b = false;

            public void onAdClick() {
                if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) a.this).f7372d.d(a.this.g());
                }
                if (this.f7486b) {
                    return;
                }
                this.f7486b = true;
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
                sb.append("showBdFullScreenVideo Callback --> onAdFailed: ");
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
                if (this.f7485a) {
                    return;
                }
                this.f7485a = true;
                a.this.C();
                a.this.az();
                a.this.D();
                a.this.ah();
            }

            public void onAdSkip(float f5) {
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
            }
        }, false);
        this.f7482r = fullScreenVideoAd;
        fullScreenVideoAd.setAppSid(this.f7376h);
        this.f7482r.load();
    }

    @Override // com.beizi.fusion.work.a
    public void a(Activity activity) {
        FullScreenVideoAd fullScreenVideoAd = this.f7482r;
        if (fullScreenVideoAd != null && fullScreenVideoAd.isReady()) {
            this.f7482r.show();
            return;
        }
        e eVar = this.f7372d;
        if (eVar != null) {
            eVar.a(10140);
        }
    }

    @Override // com.beizi.fusion.work.a
    public void d(int i4) {
        FullScreenVideoAd fullScreenVideoAd = this.f7482r;
        if (fullScreenVideoAd == null || TextUtils.isEmpty(fullScreenVideoAd.getECPMLevel()) || this.f7483s) {
            return;
        }
        this.f7483s = true;
        af.a("BeiZis", "showBdFullScreenVideo channel == Baidu竞价失败:" + i4);
        this.f7482r.biddingFail(i4 != 1 ? i4 != 2 ? "900" : "100" : "203");
    }
}

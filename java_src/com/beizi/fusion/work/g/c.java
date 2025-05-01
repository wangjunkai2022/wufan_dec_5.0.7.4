package com.beizi.fusion.work.g;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.beizi.fusion.d.h;
import com.beizi.fusion.d.k;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.ak;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.n;
import com.beizi.fusion.g.v;
import com.beizi.fusion.model.AdSpacesBean;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.ads.rewardvideo.RewardVideoADListener;
import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.comm.managers.status.SDKStatus;
import com.qq.e.comm.util.AdError;
import java.util.Map;
/* compiled from: GdtRewardVideoWorker.java */
/* loaded from: classes2.dex */
public class c extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7599n;

    /* renamed from: o  reason: collision with root package name */
    private String f7600o;

    /* renamed from: p  reason: collision with root package name */
    private long f7601p;

    /* renamed from: q  reason: collision with root package name */
    private long f7602q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f7603r;

    /* renamed from: s  reason: collision with root package name */
    private RewardVideoAD f7604s;

    /* renamed from: t  reason: collision with root package name */
    private String f7605t;

    /* renamed from: u  reason: collision with root package name */
    private String f7606u;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GdtRewardVideoWorker.java */
    /* loaded from: classes2.dex */
    public class a implements RewardVideoADListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f7608a;

        /* renamed from: b  reason: collision with root package name */
        boolean f7609b;

        private a() {
            this.f7608a = false;
            this.f7609b = false;
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADClick() {
            if (((com.beizi.fusion.work.a) c.this).f7372d != null && ((com.beizi.fusion.work.a) c.this).f7372d.r() != 2) {
                ((com.beizi.fusion.work.a) c.this).f7372d.d(c.this.g());
            }
            if (this.f7609b) {
                return;
            }
            this.f7609b = true;
            c.this.E();
            c.this.ai();
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADClose() {
            if (((com.beizi.fusion.work.a) c.this).f7372d != null && ((com.beizi.fusion.work.a) c.this).f7372d.r() != 2) {
                ((com.beizi.fusion.work.a) c.this).f7372d.c(c.this.g());
            }
            c.this.G();
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADExpose() {
            ((com.beizi.fusion.work.a) c.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
            if (((com.beizi.fusion.work.a) c.this).f7372d != null && ((com.beizi.fusion.work.a) c.this).f7372d.r() != 2) {
                ((com.beizi.fusion.work.a) c.this).f7372d.b(c.this.g());
            }
            if (this.f7608a) {
                return;
            }
            this.f7608a = true;
            c.this.az();
            c.this.D();
            c.this.ah();
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADLoad() {
            if (c.this.f7604s.getECPM() > 0) {
                c cVar = c.this;
                cVar.a(cVar.f7604s.getECPM());
            }
            if (v.f7025a) {
                c.this.f7604s.setDownloadConfirmListener(v.f7026b);
            }
            ((com.beizi.fusion.work.a) c.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
            c.this.y();
            if (c.this.Y()) {
                c.this.b();
            } else {
                c.this.O();
            }
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADShow() {
            c.this.C();
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onError(AdError adError) {
            StringBuilder sb = new StringBuilder();
            sb.append("showGdtRewardVideo onError:");
            sb.append(adError.getErrorMsg());
            c.this.a(adError.getErrorMsg(), adError.getErrorCode());
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onReward(Map<String, Object> map) {
            if (map != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("onReward transID = ");
                sb.append(map.get("transId"));
            }
            c.this.J();
            if (((com.beizi.fusion.work.a) c.this).f7372d != null) {
                ((com.beizi.fusion.work.a) c.this).f7372d.k();
            }
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onVideoCached() {
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onVideoComplete() {
            if (((com.beizi.fusion.work.a) c.this).f7372d != null) {
                ((com.beizi.fusion.work.a) c.this).f7372d.l();
            }
        }
    }

    public c(Context context, String str, String str2, String str3, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar) {
        this.f7599n = context;
        this.f7600o = str;
        this.f7601p = j4;
        this.f7602q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f7605t = str2;
        this.f7606u = str3;
        r();
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.f7604s == null) {
            return;
        }
        al();
        int a5 = ak.a(this.f7373e.getPriceDict(), this.f7604s.getECPMLevel());
        if (a5 == -1 || a5 == -2) {
            if (a5 == -2) {
                L();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gdt realPrice = ");
        sb.append(a5);
        a(a5);
    }

    @Override // com.beizi.fusion.work.a
    public void az() {
        RewardVideoAD rewardVideoAD = this.f7604s;
        if (rewardVideoAD == null || rewardVideoAD.getECPM() <= 0 || this.f7603r) {
            return;
        }
        this.f7603r = true;
        af.a("BeiZis", "channel == GDT竞价成功");
        af.a("BeiZis", "channel == sendWinNoticeECPM" + this.f7604s.getECPM());
        RewardVideoAD rewardVideoAD2 = this.f7604s;
        k.a(rewardVideoAD2, rewardVideoAD2.getECPM());
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "GDT";
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f7376h = this.f7373e.getAppId();
        this.f7377i = this.f7373e.getSpaceId();
        this.f7371c = this.f7373e.getBuyerSpaceUuId();
        com.beizi.fusion.b.d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.qq.e.comm.managers.GDTAdSdk")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.g.c.1
                        @Override // java.lang.Runnable
                        public void run() {
                            c.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                k.a(this.f7599n, this.f7376h);
                this.f7370b.s(SDKStatus.getIntegrationSDKVersion());
                au();
                v();
            }
        }
        v.f7025a = !n.a(this.f7373e.getDirectDownload());
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(this.f7602q);
        long j4 = this.f7602q;
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
        RewardVideoAD rewardVideoAD = this.f7604s;
        if (rewardVideoAD != null) {
            int a5 = ak.a(this.f7373e.getPriceDict(), rewardVideoAD.getECPMLevel());
            if (a5 == -1 || a5 == -2) {
                return null;
            }
            return a5 + "";
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
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            this.f7604s = new RewardVideoAD(this.f7599n, this.f7377i, new a(), false, aC());
        } else {
            this.f7604s = new RewardVideoAD(this.f7599n, this.f7377i, new a(), false);
        }
        this.f7604s.setServerSideVerificationOptions(new ServerSideVerificationOptions.Builder().setCustomData(this.f7606u).setUserId(this.f7605t).build());
        this.f7604s.loadAD();
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
    public void a(Activity activity) {
        RewardVideoAD rewardVideoAD = this.f7604s;
        if (rewardVideoAD != null) {
            boolean z4 = !rewardVideoAD.hasShown();
            boolean isValid = this.f7604s.isValid();
            if (z4 && isValid) {
                this.f7604s.showAD();
                return;
            }
            com.beizi.fusion.d.e eVar = this.f7372d;
            if (eVar == null || isValid) {
                return;
            }
            eVar.a(10140);
            return;
        }
        com.beizi.fusion.d.e eVar2 = this.f7372d;
        if (eVar2 != null) {
            eVar2.a(10140);
        }
    }

    @Override // com.beizi.fusion.work.a
    public void d(int i4) {
        RewardVideoAD rewardVideoAD = this.f7604s;
        if (rewardVideoAD == null || rewardVideoAD.getECPM() <= 0 || this.f7603r) {
            return;
        }
        this.f7603r = true;
        af.a("BeiZis", "channel == GDT竞价失败:" + i4);
        k.b(this.f7604s, i4 != 1 ? 10001 : 1);
    }
}

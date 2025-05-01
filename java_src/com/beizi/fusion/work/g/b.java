package com.beizi.fusion.work.g;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.beizi.fusion.d.h;
import com.beizi.fusion.d.u;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import java.util.Map;
/* compiled from: CsjRewardVideoWorker.java */
/* loaded from: classes2.dex */
public class b extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7586n;

    /* renamed from: o  reason: collision with root package name */
    private String f7587o;

    /* renamed from: p  reason: collision with root package name */
    private long f7588p;

    /* renamed from: q  reason: collision with root package name */
    private long f7589q;

    /* renamed from: r  reason: collision with root package name */
    private TTRewardVideoAd f7590r;

    /* renamed from: s  reason: collision with root package name */
    private TTAdNative f7591s;

    /* renamed from: t  reason: collision with root package name */
    private String f7592t;

    /* renamed from: u  reason: collision with root package name */
    private String f7593u;

    public b(Context context, String str, String str2, String str3, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar) {
        this.f7586n = context;
        this.f7587o = str;
        this.f7588p = j4;
        this.f7589q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f7592t = str2;
        this.f7593u = str3;
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
    public void ay() {
        v();
        e();
    }

    public String b() {
        return "1013";
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
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.g.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                u.a(this, this.f7586n, this.f7376h, this.f7373e.getDirectDownload());
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
        sb.append(this.f7589q);
        long j4 = this.f7589q;
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
        this.f7591s = u.a().createAdNative(this.f7586n);
        this.f7591s.loadRewardVideoAd(new AdSlot.Builder().setCodeId(this.f7377i).setSupportDeepLink(true).setExpressViewAcceptedSize(500.0f, 500.0f).setUserID(this.f7592t).setMediaExtra(this.f7593u).setOrientation(1).build(), new TTAdNative.RewardVideoAdListener() { // from class: com.beizi.fusion.work.g.b.2
            private void a() {
                b.this.f7590r.setRewardAdInteractionListener(new TTRewardVideoAd.RewardAdInteractionListener() { // from class: com.beizi.fusion.work.g.b.2.1

                    /* renamed from: a  reason: collision with root package name */
                    boolean f7596a = false;

                    /* renamed from: b  reason: collision with root package name */
                    boolean f7597b = false;

                    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                    public void onAdClose() {
                        if (((com.beizi.fusion.work.a) b.this).f7372d != null && ((com.beizi.fusion.work.a) b.this).f7372d.r() != 2) {
                            ((com.beizi.fusion.work.a) b.this).f7372d.c(b.this.b());
                        }
                        b.this.G();
                    }

                    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                    public void onAdShow() {
                        ((com.beizi.fusion.work.a) b.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                        if (((com.beizi.fusion.work.a) b.this).f7372d != null && ((com.beizi.fusion.work.a) b.this).f7372d.r() != 2) {
                            ((com.beizi.fusion.work.a) b.this).f7372d.b(b.this.g());
                        }
                        if (this.f7596a) {
                            return;
                        }
                        this.f7596a = true;
                        b.this.C();
                        b.this.D();
                        b.this.ah();
                    }

                    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                    public void onAdVideoBarClick() {
                        if (((com.beizi.fusion.work.a) b.this).f7372d != null && ((com.beizi.fusion.work.a) b.this).f7372d.r() != 2) {
                            ((com.beizi.fusion.work.a) b.this).f7372d.d(b.this.g());
                        }
                        if (this.f7597b) {
                            return;
                        }
                        this.f7597b = true;
                        b.this.E();
                        b.this.ai();
                    }

                    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                    public void onRewardArrived(boolean z4, int i4, Bundle bundle) {
                    }

                    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                    public void onRewardVerify(boolean z4, int i4, String str, int i5, String str2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("showCsjRewardedVideo Callback --> onRewardVerify() result== ");
                        sb.append("verify:" + z4);
                        if (z4 && ((com.beizi.fusion.work.a) b.this).f7372d != null) {
                            b.this.J();
                            ((com.beizi.fusion.work.a) b.this).f7372d.k();
                        }
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                        b.this.a(str2, i5);
                    }

                    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                    public void onSkippedVideo() {
                    }

                    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                    public void onVideoComplete() {
                        if (((com.beizi.fusion.work.a) b.this).f7372d != null) {
                            ((com.beizi.fusion.work.a) b.this).f7372d.l();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                    public void onVideoError() {
                        b.this.a("sdk custom error ".concat("onVideoError"), 99991);
                    }
                });
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
            public void onError(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showCsjRewardedVideo Callback --> onError:");
                sb.append(str);
                b.this.a(str, i4);
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
            public void onRewardVideoAdLoad(TTRewardVideoAd tTRewardVideoAd) {
                ((com.beizi.fusion.work.a) b.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                b.this.y();
                if (tTRewardVideoAd == null) {
                    b.this.c(-991);
                    return;
                }
                b.this.f7590r = tTRewardVideoAd;
                a();
                if (b.this.Y()) {
                    b.this.aG();
                } else {
                    b.this.O();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
            public void onRewardVideoCached() {
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
            public void onRewardVideoCached(TTRewardVideoAd tTRewardVideoAd) {
            }
        });
    }

    @Override // com.beizi.fusion.work.a
    public void a(Activity activity) {
        TTRewardVideoAd tTRewardVideoAd = this.f7590r;
        if (tTRewardVideoAd != null && activity != null) {
            tTRewardVideoAd.showRewardVideoAd(activity);
            return;
        }
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar != null) {
            eVar.a(10140);
        }
    }
}

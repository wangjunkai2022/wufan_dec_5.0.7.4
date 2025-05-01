package com.join.mgps.ad;

import android.app.Activity;
import android.content.Context;
import com.join.mgps.Util.w0;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialADListener;
import com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener;
import com.qq.e.comm.listeners.NegativeFeedbackListener;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.setting.GlobalSetting;
import com.qq.e.comm.util.AdError;
/* compiled from: GDTInteractionRewardVideo.java */
/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f39693p;

    /* renamed from: m  reason: collision with root package name */
    private UnifiedInterstitialAD f39694m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f39695n;

    /* renamed from: o  reason: collision with root package name */
    private b f39696o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GDTInteractionRewardVideo.java */
    /* loaded from: classes4.dex */
    public class a implements NegativeFeedbackListener {
        a() {
        }

        @Override // com.qq.e.comm.listeners.NegativeFeedbackListener
        public void onComplainSuccess() {
            String str = f.this.f39680d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GDTInteractionRewardVideo.java */
    /* loaded from: classes4.dex */
    public class b implements UnifiedInterstitialADListener, UnifiedInterstitialMediaListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f39698a = false;

        b() {
        }

        public void a(boolean z4) {
            this.f39698a = z4;
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onADClicked() {
            w0.c(f.this.f39680d, "rewardVideoAd bar click");
            f.this.onADClick();
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onADClosed() {
            d.i(f.this.f39677a, 1004);
            f.this.onADClose();
            f fVar = f.this;
            fVar.c(fVar.f39682f);
            f fVar2 = f.this;
            fVar2.a(fVar2.f39682f, fVar2.f39683g, fVar2.f39684h);
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onADExposure() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onADLeftApplication() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onADOpened() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onADReceive() {
            f.this.f39695n = true;
            f fVar = f.this;
            fVar.f39686j = false;
            fVar.b(this.f39698a);
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onNoAD(AdError adError) {
            f.this.f39695n = false;
            f fVar = f.this;
            fVar.f39686j = false;
            fVar.onError(adError.getErrorCode(), adError.getErrorMsg());
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onRenderFail() {
            f.this.f39695n = false;
            f fVar = f.this;
            fVar.f39686j = false;
            d.i(fVar.f39677a, 1004);
            f.this.onError(-1, "广告渲染失败");
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onRenderSuccess() {
            f.this.f39695n = false;
            d.i(f.this.f39677a, 1003);
            f.this.onADShow();
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onVideoCached() {
            f.this.f39695n = true;
            f fVar = f.this;
            fVar.f39686j = false;
            fVar.onVideoCached();
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoComplete() {
            f.this.onVideoComplete();
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoError(AdError adError) {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoInit() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoLoading() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoPageClose() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoPageOpen() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoPause() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoReady(long j4) {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoStart() {
        }
    }

    public f(Context context, String str, String str2) {
        super("GDT", context, str, str2);
        this.f39695n = false;
    }

    @Override // com.join.mgps.ad.d
    public void e() {
        try {
            if (!f39693p) {
                GDTAdSdk.init(this.f39677a, this.f39678b);
                GlobalSetting.setChannel(1);
                GlobalSetting.setEnableMediationTool(true);
                f39693p = true;
                onInitSuccess();
            } else {
                onInitSuccess();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.ad.d
    protected boolean f() {
        return this.f39694m != null && this.f39695n;
    }

    @Override // com.join.mgps.ad.d
    public void h(boolean z4) {
        this.f39695n = false;
        if (d.f39676l) {
            StringBuilder sb = new StringBuilder();
            sb.append("load:");
            sb.append(z4);
        }
        try {
            if (this.f39696o == null) {
                this.f39696o = new b();
            }
            this.f39696o.a(z4);
            if (this.f39686j) {
                return;
            }
            this.f39686j = true;
            UnifiedInterstitialAD unifiedInterstitialAD = this.f39694m;
            if (unifiedInterstitialAD != null) {
                unifiedInterstitialAD.close();
                this.f39694m.destroy();
            }
            UnifiedInterstitialAD unifiedInterstitialAD2 = new UnifiedInterstitialAD(this.f39681e, this.f39679c, this.f39696o);
            this.f39694m = unifiedInterstitialAD2;
            unifiedInterstitialAD2.setNegativeFeedbackListener(new a());
            this.f39694m.setMediaListener(this.f39696o);
            this.f39694m.loadAD();
        } catch (Exception e5) {
            e5.printStackTrace();
            onError(-1, "广告加载错误");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.ad.d
    public void u(Activity activity) {
        super.u(activity);
        this.f39695n = false;
        this.f39694m.show(activity);
    }

    public void w() {
        UnifiedInterstitialAD unifiedInterstitialAD = this.f39694m;
        if (unifiedInterstitialAD != null) {
            unifiedInterstitialAD.destroy();
        }
    }
}

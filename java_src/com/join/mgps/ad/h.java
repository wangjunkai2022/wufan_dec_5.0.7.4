package com.join.mgps.ad;

import android.app.Activity;
import android.content.Context;
import com.MApplication;
import com.join.mgps.Util.w0;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.ads.rewardvideo.RewardVideoADListener;
import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.comm.util.AdError;
import java.util.Map;
/* compiled from: GDTRewardVideo.java */
/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: m  reason: collision with root package name */
    private RewardVideoAD f39701m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f39702n;

    /* renamed from: o  reason: collision with root package name */
    private a f39703o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GDTRewardVideo.java */
    /* loaded from: classes4.dex */
    public class a implements RewardVideoADListener {

        /* renamed from: b  reason: collision with root package name */
        boolean f39704b = false;

        a() {
        }

        public void a(boolean z4) {
            this.f39704b = z4;
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADClick() {
            d.i(h.this.f39677a, 2);
            MApplication.f1497x.G(true);
            w0.c(h.this.f39680d, "rewardVideoAd bar click");
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADClose() {
            d.i(h.this.f39677a, 3);
            h.this.onADClose();
            h hVar = h.this;
            hVar.c(hVar.f39682f);
            h hVar2 = h.this;
            hVar2.a(hVar2.f39682f, hVar2.f39683g, hVar2.f39684h);
            h hVar3 = h.this;
            hVar3.d(hVar3.f39682f, hVar3.f39683g, hVar3.f39684h, hVar3.f39687k);
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADExpose() {
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADLoad() {
            h.this.f39702n = true;
            h hVar = h.this;
            hVar.f39686j = false;
            hVar.b(this.f39704b);
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onADShow() {
            h.this.f39702n = false;
            d.i(h.this.f39677a, 1);
            h.this.onADShow();
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onError(AdError adError) {
            h.this.f39702n = false;
            h hVar = h.this;
            hVar.f39686j = false;
            Map<String, Object> map = hVar.f39687k;
            if (map != null) {
                d.j(hVar.f39677a, 5, map);
            } else {
                d.i(hVar.f39677a, 5);
            }
            h.this.onError(adError.getErrorCode(), adError.getErrorMsg());
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onReward(Map<String, Object> map) {
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onVideoCached() {
            h.this.f39702n = true;
            h hVar = h.this;
            hVar.f39686j = false;
            hVar.onVideoCached();
        }

        @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
        public void onVideoComplete() {
            d.i(h.this.f39677a, 4);
            h.this.onVideoComplete();
        }
    }

    public h(Context context, String str, String str2) {
        super("GDT", context, str, str2);
        this.f39702n = false;
    }

    @Override // com.join.mgps.ad.d
    public void e() {
        com.join.mgps.ad.adapter.b.a(this.f39677a, this.f39678b, new s1.a() { // from class: com.join.mgps.ad.g
            @Override // s1.a
            public final void a() {
                h.this.onInitSuccess();
            }
        });
    }

    @Override // com.join.mgps.ad.d
    protected boolean f() {
        return this.f39701m != null && this.f39702n;
    }

    @Override // com.join.mgps.ad.d
    public void h(boolean z4) {
        this.f39702n = false;
        if (d.f39676l) {
            StringBuilder sb = new StringBuilder();
            sb.append("load:");
            sb.append(z4);
        }
        try {
            if (this.f39703o == null) {
                this.f39703o = new a();
            }
            this.f39703o.a(z4);
            if (this.f39686j) {
                return;
            }
            this.f39686j = true;
            if (this.f39701m == null) {
                this.f39701m = new RewardVideoAD(this.f39677a, this.f39679c, this.f39703o, true);
            }
            this.f39701m.setServerSideVerificationOptions(new ServerSideVerificationOptions.Builder().build());
            this.f39701m.loadAD();
        } catch (Exception e5) {
            e5.printStackTrace();
            Map<String, Object> map = this.f39687k;
            if (map != null) {
                d.j(this.f39677a, 5, map);
            } else {
                d.i(this.f39677a, 5);
            }
            onError(-1, "广告初始化错误");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.ad.d
    public void u(Activity activity) {
        super.u(activity);
        this.f39701m.showAD(activity);
    }
}

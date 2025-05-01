package com.join.mgps.ad;

import android.app.Activity;
import android.content.Context;
import com.aggmoread.sdk.client.AMAdLoadSlot;
import com.aggmoread.sdk.client.AMAdLoader;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.AMSdk;
import com.aggmoread.sdk.client.AMVideoConfigs;
import com.aggmoread.sdk.client.reward.AMRewardAd;
import com.aggmoread.sdk.client.reward.AMRewardAdListener;
import com.aggmoread.sdk.client.reward.AMRewardInteractionListener;
import com.join.mgps.Util.w0;
import java.util.List;
import java.util.Map;
/* compiled from: RERewardVideo.java */
/* loaded from: classes4.dex */
public class s extends d {

    /* renamed from: m  reason: collision with root package name */
    private AMRewardAd f39727m;

    /* renamed from: n  reason: collision with root package name */
    AMAdLoader f39728n;

    /* renamed from: o  reason: collision with root package name */
    private AMVideoConfigs f39729o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f39730p;

    /* renamed from: q  reason: collision with root package name */
    private a f39731q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RERewardVideo.java */
    /* loaded from: classes4.dex */
    public class a implements AMRewardAdListener, AMRewardInteractionListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f39732a = false;

        a() {
        }

        public void a(boolean z4) {
            this.f39732a = z4;
        }

        @Override // com.aggmoread.sdk.client.reward.AMRewardInteractionListener
        public void onAdClicked() {
            d.i(s.this.f39677a, 2);
            w0.c(s.this.f39680d, "rewardVideoAd bar click");
        }

        @Override // com.aggmoread.sdk.client.reward.AMRewardInteractionListener
        public void onAdClosed() {
            d.i(s.this.f39677a, 3);
            s.this.onADClose();
            s sVar = s.this;
            sVar.c(sVar.f39682f);
            s sVar2 = s.this;
            sVar2.a(sVar2.f39682f, sVar2.f39683g, sVar2.f39684h);
            s sVar3 = s.this;
            sVar3.d(sVar3.f39682f, sVar3.f39683g, sVar3.f39684h, sVar3.f39687k);
        }

        @Override // com.aggmoread.sdk.client.IAMAdInteractionListener
        public void onAdError(AMError aMError) {
            s.this.f39730p = false;
            s sVar = s.this;
            sVar.f39686j = false;
            Map<String, Object> map = sVar.f39687k;
            if (map != null) {
                d.j(sVar.f39677a, 5, map);
            } else {
                d.i(sVar.f39677a, 5);
            }
            if (aMError != null) {
                s.this.onError(aMError.code, aMError.msg);
            } else {
                s.this.onError(-1, "未知错误");
            }
        }

        @Override // com.aggmoread.sdk.client.reward.AMRewardInteractionListener
        public void onAdExposed() {
            s.this.f39730p = false;
            d.i(s.this.f39677a, 1);
            s.this.onADShow();
        }

        @Override // com.aggmoread.sdk.client.IAMAdLoadListener
        public void onAdLoadFail(AMError aMError) {
            s sVar = s.this;
            Map<String, Object> map = sVar.f39687k;
            if (map != null) {
                d.j(sVar.f39677a, 5, map);
            } else {
                d.i(sVar.f39677a, 5);
            }
            if (aMError != null) {
                s.this.onError(aMError.code, aMError.msg);
            } else {
                s.this.onError(-1, "未知错误");
            }
        }

        @Override // com.aggmoread.sdk.client.IAMAdLoadListener
        public void onAdLoaded(List<AMRewardAd> list) {
            w0.c(s.this.f39680d, "rewardVideoAd loaded");
            s.this.f39730p = true;
            s sVar = s.this;
            sVar.f39686j = false;
            if (list != null) {
                sVar.f39727m = list.get(0);
            }
        }

        @Override // com.aggmoread.sdk.client.reward.AMRewardAdListener
        public void onAdVideoCached() {
            w0.c(s.this.f39680d, "rewardVideoAd video cached");
            s.this.f39730p = true;
            s sVar = s.this;
            sVar.f39686j = false;
            sVar.onVideoCached();
            s.this.b(this.f39732a);
        }

        @Override // com.aggmoread.sdk.client.reward.AMRewardInteractionListener
        public void onReward(Map map) {
            d.i(s.this.f39677a, 6);
        }

        @Override // com.aggmoread.sdk.client.reward.AMRewardInteractionListener
        public void onVideoComplete() {
            d.i(s.this.f39677a, 4);
            s.this.onVideoComplete();
        }
    }

    public s(Context context, String str, String str2) {
        super("RE", context, str, str2);
        this.f39730p = false;
    }

    private void x(boolean z4) {
        AMVideoConfigs.Builder builder = new AMVideoConfigs.Builder();
        builder.setAutoPlayMuted(true);
        builder.setAutoPlayPolicy(1);
        builder.setEnableDetailPage(true);
        builder.setDetailPageMuted(true);
        builder.setEnableUserControl(true);
        builder.setNeedCoverImage(true);
        builder.setNeedProgressBar(true);
        this.f39729o = builder.build();
    }

    @Override // com.join.mgps.ad.d
    public void e() {
        if (this.f39731q == null) {
            this.f39731q = new a();
        }
        com.join.mgps.ad.adapter.d.a(this.f39677a, this.f39678b, new s1.a() { // from class: com.join.mgps.ad.r
            @Override // s1.a
            public final void a() {
                s.this.onInitSuccess();
            }
        });
    }

    @Override // com.join.mgps.ad.d
    protected boolean f() {
        if (d.f39676l) {
            StringBuilder sb = new StringBuilder();
            sb.append("RewardVideoAd:");
            sb.append(this.f39727m != null);
            sb.append("hasLoaded:");
            sb.append(this.f39730p);
        }
        return this.f39727m != null && this.f39730p;
    }

    @Override // com.join.mgps.ad.d
    public void h(boolean z4) {
        try {
            this.f39730p = false;
            if (d.f39676l) {
                StringBuilder sb = new StringBuilder();
                sb.append("load:");
                sb.append(z4);
            }
            x(z4);
            if (this.f39731q == null) {
                this.f39731q = new a();
            }
            this.f39731q.a(z4);
            if (this.f39686j) {
                return;
            }
            this.f39686j = true;
            if (this.f39728n == null) {
                this.f39728n = AMSdk.makeAdLoader(new AMAdLoadSlot.Builder().setSlotId(this.f39679c).setVideoConfig(this.f39729o).setAdCount(1).setSSBidToken(null).build());
            }
            AMAdLoader aMAdLoader = this.f39728n;
            if (aMAdLoader != null) {
                aMAdLoader.loadRewardAd(this.f39677a, this.f39731q);
                return;
            }
            Map<String, Object> map = this.f39687k;
            if (map != null) {
                d.j(this.f39677a, 5, map);
            } else {
                d.i(this.f39677a, 5);
            }
            onError(-1, "广告加载错误");
        } catch (Exception e5) {
            e5.printStackTrace();
            this.f39686j = false;
            Map<String, Object> map2 = this.f39687k;
            if (map2 != null) {
                d.j(this.f39677a, 5, map2);
            } else {
                d.i(this.f39677a, 5);
            }
            onError(-1, "广告加载错误");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.ad.d
    public void u(Activity activity) {
        super.u(activity);
        this.f39727m.show(activity, this.f39731q);
        this.f39727m = null;
    }
}

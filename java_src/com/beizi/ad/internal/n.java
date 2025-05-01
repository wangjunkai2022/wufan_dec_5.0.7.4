package com.beizi.ad.internal;

import android.content.Context;
import com.beizi.ad.AdRequest;
import com.beizi.ad.RewardedVideoAd;
import com.beizi.ad.RewardedVideoAdListener;
import com.beizi.ad.internal.utilities.StringUtil;
import com.beizi.ad.internal.view.InterstitialAdViewImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RewardedVideoAdImpl.java */
/* loaded from: classes2.dex */
public final class n implements RewardedVideoAd {

    /* renamed from: a  reason: collision with root package name */
    private final InterstitialAdViewImpl f5933a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Context context) {
        this.f5933a = new InterstitialAdViewImpl(context, true, false);
    }

    @Override // com.beizi.ad.RewardedVideoAd
    public void destroy(Context context) {
        this.f5933a.destroy();
    }

    @Override // com.beizi.ad.RewardedVideoAd
    public String getPrice() {
        return this.f5933a.getPrice();
    }

    @Override // com.beizi.ad.RewardedVideoAd
    public RewardedVideoAdListener getRewardedVideoAdListener() {
        return this.f5933a.getRewaredVideoAdListener();
    }

    @Override // com.beizi.ad.RewardedVideoAd
    public boolean isLoaded() {
        return this.f5933a.isLoaded();
    }

    @Override // com.beizi.ad.RewardedVideoAd
    public void loadAd(String str, AdRequest adRequest) {
        if (StringUtil.isEmpty(str)) {
            return;
        }
        this.f5933a.setAdUnitId(str);
        this.f5933a.loadAd(adRequest.impl());
    }

    @Override // com.beizi.ad.RewardedVideoAd
    public void pause(Context context) {
        this.f5933a.activityOnPause();
    }

    @Override // com.beizi.ad.RewardedVideoAd
    public void resume(Context context) {
        this.f5933a.activityOnResume();
    }

    @Override // com.beizi.ad.RewardedVideoAd
    public void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f5933a.setRewardedVideoAdListener(rewardedVideoAdListener);
    }

    @Override // com.beizi.ad.RewardedVideoAd
    public void show() {
        this.f5933a.show();
    }
}

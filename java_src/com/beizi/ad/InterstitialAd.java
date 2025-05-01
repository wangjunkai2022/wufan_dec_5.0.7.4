package com.beizi.ad;

import android.content.Context;
import androidx.annotation.RequiresPermission;
import com.beizi.ad.internal.view.InterstitialAdViewImpl;
import com.beizi.fusion.model.AdSpacesBean;
import com.kuaishou.weapon.p0.g;
/* loaded from: classes2.dex */
public final class InterstitialAd implements AdLifeControl {

    /* renamed from: a  reason: collision with root package name */
    private final InterstitialAdViewImpl f5183a;

    public InterstitialAd(Context context) {
        this.f5183a = new InterstitialAdViewImpl(context, false, false);
    }

    @Override // com.beizi.ad.AdLifeControl
    public void cancel() {
        this.f5183a.cancel();
    }

    public String getAdId() {
        InterstitialAdViewImpl interstitialAdViewImpl = this.f5183a;
        if (interstitialAdViewImpl == null) {
            return null;
        }
        return interstitialAdViewImpl.getAdId();
    }

    public AdListener getAdListener() {
        return this.f5183a.getAdListener();
    }

    public String getAdUnitId() {
        return this.f5183a.getAdUnitId();
    }

    public String getMediationAdapterClassName() {
        return this.f5183a.getMediationAdapterClassName();
    }

    public String getPrice() {
        return this.f5183a.getPrice();
    }

    public boolean isLoaded() {
        return this.f5183a.isLoaded();
    }

    public boolean isLoading() {
        return this.f5183a.isLoading();
    }

    @RequiresPermission(g.f55581a)
    public void loadAd(AdRequest adRequest) {
        this.f5183a.loadAd(adRequest.impl());
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onCreateLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onDestoryLifeCycle() {
        this.f5183a.onDestoryLifeCycle();
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onPauseLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onRestartLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onResumeLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onStartLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onStopLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void openAdInNativeBrowser(boolean z4) {
        this.f5183a.setOpensNativeBrowser(z4);
    }

    public void setAdBuyerBean(AdSpacesBean.BuyerBean buyerBean) {
        this.f5183a.setAdBuyerBean(buyerBean);
    }

    public void setAdListener(AdListener adListener) {
        this.f5183a.setAdListener(adListener);
    }

    public void setAdUnitId(String str) {
        this.f5183a.setAdUnitId(str);
    }

    public void setCloseMarketDialog(boolean z4) {
        InterstitialAdViewImpl interstitialAdViewImpl = this.f5183a;
        if (interstitialAdViewImpl != null) {
            interstitialAdViewImpl.setCloseMarketDialog(z4);
        }
    }

    public void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f5183a.setRewardedVideoAdListener(rewardedVideoAdListener);
    }

    public void show() {
        this.f5183a.show();
    }

    public void show(Context context) {
        this.f5183a.showInterstitial(context);
    }

    public InterstitialAd(Context context, boolean z4) {
        this.f5183a = new InterstitialAdViewImpl(context, false, z4);
    }
}

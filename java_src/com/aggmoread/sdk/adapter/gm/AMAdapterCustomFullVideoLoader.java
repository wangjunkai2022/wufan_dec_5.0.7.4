package com.aggmoread.sdk.adapter.gm;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.aggmoread.sdk.adapter.helper.AdapterHelper;
import com.aggmoread.sdk.adapter.helper.LogHelper;
import com.aggmoread.sdk.adapter.helper.ThreadHelper;
import com.aggmoread.sdk.client.AMAdLoadSlot;
import com.aggmoread.sdk.client.AMAdLoader;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.AMRewardAdConfig;
import com.aggmoread.sdk.client.AMSdk;
import com.aggmoread.sdk.client.AMVideoConfigs;
import com.aggmoread.sdk.client.fullscreen.AMFullScreenAd;
import com.aggmoread.sdk.client.fullscreen.AMFullScreenAdInteractionListener;
import com.aggmoread.sdk.client.fullscreen.AMFullScreenAdListener;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.mediation.bridge.custom.fullvideo.MediationCustomFullVideoLoader;
import com.bytedance.sdk.openadsdk.mediation.custom.MediationCustomServiceConfig;
import com.bytedance.sdk.openadsdk.mediation.custom.MediationRewardItem;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class AMAdapterCustomFullVideoLoader extends MediationCustomFullVideoLoader {
    private AMFullScreenAd amFullScreenAd;

    /* JADX INFO: Access modifiers changed from: private */
    public AMRewardAdConfig getRewardAdConfig() {
        AMRewardAdConfig aMRewardAdConfig = new AMRewardAdConfig();
        aMRewardAdConfig.setRewardAdListener(new AMRewardAdConfig.RewardListener() { // from class: com.aggmoread.sdk.adapter.gm.AMAdapterCustomFullVideoLoader.3
            @Override // com.aggmoread.sdk.client.AMRewardAdConfig.RewardListener
            public void onReward(final Map<String, Object> map) {
                AMAdapterCustomFullVideoLoader.this.callFullVideoRewardVerify(new MediationRewardItem() { // from class: com.aggmoread.sdk.adapter.gm.AMAdapterCustomFullVideoLoader.3.1
                    @Override // com.bytedance.sdk.openadsdk.mediation.custom.MediationRewardItem
                    public float getAmount() {
                        return 0.0f;
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.custom.MediationRewardItem
                    public Map<String, Object> getCustomData() {
                        return map;
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.custom.MediationRewardItem
                    public String getRewardName() {
                        return null;
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.custom.MediationRewardItem
                    public boolean rewardVerify() {
                        return true;
                    }
                });
            }
        });
        return aMRewardAdConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AMVideoConfigs getVideoOptions(AdSlot adSlot) {
        return AdapterHelper.getVideoOptions(adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.MediationCustomAdBaseLoader
    public void load(final Context context, final AdSlot adSlot, final MediationCustomServiceConfig mediationCustomServiceConfig) {
        LogHelper.log("AMAdapterCustomFullVideoLoader load Ad enter ");
        ThreadHelper.runInWorkerThread(new Runnable() { // from class: com.aggmoread.sdk.adapter.gm.AMAdapterCustomFullVideoLoader.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String aDNNetworkSlotId = mediationCustomServiceConfig.getADNNetworkSlotId();
                    AMAdLoader makeAdLoader = AMSdk.makeAdLoader(new AMAdLoadSlot.Builder().setSlotId(aDNNetworkSlotId).setAdCount(1).setRewardConfig(AMAdapterCustomFullVideoLoader.this.getRewardAdConfig()).setVideoConfig(AMAdapterCustomFullVideoLoader.this.getVideoOptions(adSlot)).build());
                    if (makeAdLoader != null) {
                        makeAdLoader.loadFullScreenAd(context, new AMFullScreenAdListener() { // from class: com.aggmoread.sdk.adapter.gm.AMAdapterCustomFullVideoLoader.2.1
                            @Override // com.aggmoread.sdk.client.IAMAdLoadListener
                            public void onAdLoadFail(AMError aMError) {
                                LogHelper.log("AMAdapterCustomFullVideoLoader onAdLoadFail " + aMError);
                                if (aMError != null) {
                                    LogHelper.log("onNoAD errorCode = " + aMError.code + " errorMessage = " + aMError.msg);
                                    AMAdapterCustomFullVideoLoader.this.callLoadFail(aMError.code, aMError.msg);
                                    return;
                                }
                                AMAdapterCustomFullVideoLoader.this.callLoadFail(AdapterHelper.NO_AD_CODD, "no ad");
                            }

                            @Override // com.aggmoread.sdk.client.IAMAdLoadListener
                            public void onAdLoaded(List<AMFullScreenAd> list) {
                                LogHelper.log("AMAdapterCustomFullVideoLoader onAdLoaded ");
                                if (list != null && !list.isEmpty()) {
                                    AMAdapterCustomFullVideoLoader.this.amFullScreenAd = list.get(0);
                                    int price = AdapterHelper.getPrice(AMAdapterCustomFullVideoLoader.this.amFullScreenAd.getAdExtras());
                                    if (price > 0) {
                                        AMAdapterCustomFullVideoLoader.this.callLoadSuccess(price);
                                        return;
                                    } else {
                                        AMAdapterCustomFullVideoLoader.this.callLoadSuccess();
                                        return;
                                    }
                                }
                                AMAdapterCustomFullVideoLoader.this.callLoadFail(AdapterHelper.NO_AD_CODD, "广告加载失败，没有匹配到合适的广告!");
                            }

                            @Override // com.aggmoread.sdk.client.fullscreen.AMFullScreenAdListener
                            public void onAdVideoCached() {
                            }
                        });
                    } else {
                        AMAdapterCustomFullVideoLoader.this.callLoadFail(AdapterHelper.ERROR_HANDLE_CODE, "广告加载器构建失败!");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    LogHelper.log("reward err " + e5.getMessage());
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.MediationCustomAdBaseLoader
    public void receiveBidResult(boolean z4, double d5, int i4, @Nullable Map<String, Object> map) {
        if (AdapterHelper.notifyBidResult(this.amFullScreenAd, z4, d5, i4)) {
            return;
        }
        super.receiveBidResult(z4, d5, i4, map);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.fullvideo.MediationCustomFullVideoLoader
    public void showAd(Activity activity) {
        AMFullScreenAd aMFullScreenAd = this.amFullScreenAd;
        if (aMFullScreenAd != null) {
            aMFullScreenAd.show(activity, new AMFullScreenAdInteractionListener() { // from class: com.aggmoread.sdk.adapter.gm.AMAdapterCustomFullVideoLoader.1
                @Override // com.aggmoread.sdk.client.fullscreen.AMFullScreenAdInteractionListener
                public void onADLeftApplication() {
                }

                @Override // com.aggmoread.sdk.client.fullscreen.AMFullScreenAdInteractionListener
                public void onAdClicked() {
                    AMAdapterCustomFullVideoLoader.this.callFullVideoAdClick();
                }

                @Override // com.aggmoread.sdk.client.fullscreen.AMFullScreenAdInteractionListener
                public void onAdClosed() {
                    AMAdapterCustomFullVideoLoader.this.callFullVideoAdClosed();
                }

                @Override // com.aggmoread.sdk.client.IAMAdInteractionListener
                public void onAdError(AMError aMError) {
                }

                @Override // com.aggmoread.sdk.client.fullscreen.AMFullScreenAdInteractionListener
                public void onAdExposed() {
                    AMAdapterCustomFullVideoLoader.this.callFullVideoAdShow();
                }

                @Override // com.aggmoread.sdk.client.fullscreen.AMFullScreenAdInteractionListener
                public void onAdVideoCompleted() {
                    AMAdapterCustomFullVideoLoader.this.callFullVideoComplete();
                }
            });
        }
    }
}

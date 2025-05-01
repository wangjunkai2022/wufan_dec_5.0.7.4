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
import com.aggmoread.sdk.client.AMSdk;
import com.aggmoread.sdk.client.AMVideoConfigs;
import com.aggmoread.sdk.client.reward.AMRewardAd;
import com.aggmoread.sdk.client.reward.AMRewardAdListener;
import com.aggmoread.sdk.client.reward.AMRewardInteractionListener;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.mediation.bridge.custom.reward.MediationCustomRewardVideoLoader;
import com.bytedance.sdk.openadsdk.mediation.custom.MediationCustomServiceConfig;
import com.bytedance.sdk.openadsdk.mediation.custom.MediationRewardItem;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class AMAdapterCustomRewardLoader extends MediationCustomRewardVideoLoader {
    private AMRewardAd amRewardAd;
    private Context mContext;

    /* JADX INFO: Access modifiers changed from: private */
    public AMVideoConfigs getVideoOptions(AdSlot adSlot) {
        return AdapterHelper.getVideoOptions(adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.MediationCustomAdBaseLoader
    public void load(final Context context, final AdSlot adSlot, final MediationCustomServiceConfig mediationCustomServiceConfig) {
        LogHelper.log("AMAdapterCustomRewardLoader load Ad enter ");
        ThreadHelper.runInWorkerThread(new Runnable() { // from class: com.aggmoread.sdk.adapter.gm.AMAdapterCustomRewardLoader.2
            @Override // java.lang.Runnable
            public void run() {
                AMAdapterCustomRewardLoader.this.mContext = context;
                try {
                    AMAdLoader makeAdLoader = AMSdk.makeAdLoader(new AMAdLoadSlot.Builder().setSlotId(mediationCustomServiceConfig.getADNNetworkSlotId()).setAdCount(1).setVideoConfig(AMAdapterCustomRewardLoader.this.getVideoOptions(adSlot)).build());
                    if (makeAdLoader != null) {
                        makeAdLoader.loadRewardAd(context, new AMRewardAdListener() { // from class: com.aggmoread.sdk.adapter.gm.AMAdapterCustomRewardLoader.2.1
                            @Override // com.aggmoread.sdk.client.IAMAdLoadListener
                            public void onAdLoadFail(AMError aMError) {
                                LogHelper.log("AMAdapterCustomRewardLoader onAdLoadFail " + aMError);
                                if (aMError != null) {
                                    LogHelper.log("onNoAD errorCode = " + aMError.code + " errorMessage = " + aMError.msg);
                                    AMAdapterCustomRewardLoader.this.callLoadFail(aMError.code, aMError.msg);
                                    return;
                                }
                                AMAdapterCustomRewardLoader.this.callLoadFail(AdapterHelper.NO_AD_CODD, "no ad");
                            }

                            @Override // com.aggmoread.sdk.client.IAMAdLoadListener
                            public void onAdLoaded(List<AMRewardAd> list) {
                                LogHelper.log("AMAdapterCustomRewardLoader onAdLoaded ");
                                if (list != null && !list.isEmpty()) {
                                    AMAdapterCustomRewardLoader.this.amRewardAd = list.get(0);
                                    int price = AdapterHelper.getPrice(AMAdapterCustomRewardLoader.this.amRewardAd.getAdExtras());
                                    if (price > 0) {
                                        AMAdapterCustomRewardLoader.this.callLoadSuccess(price);
                                        return;
                                    } else {
                                        AMAdapterCustomRewardLoader.this.callLoadSuccess();
                                        return;
                                    }
                                }
                                AMAdapterCustomRewardLoader.this.callLoadFail(AdapterHelper.NO_AD_CODD, "广告加载失败，没有匹配到合适的广告!");
                            }

                            @Override // com.aggmoread.sdk.client.reward.AMRewardAdListener
                            public void onAdVideoCached() {
                                AMAdapterCustomRewardLoader.this.callAdVideoCache();
                            }
                        });
                    } else {
                        AMAdapterCustomRewardLoader.this.callLoadFail(AdapterHelper.ERROR_HANDLE_CODE, "广告加载器构建失败!");
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
        if (AdapterHelper.notifyBidResult(this.amRewardAd, z4, d5, i4)) {
            return;
        }
        super.receiveBidResult(z4, d5, i4, map);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.reward.MediationCustomRewardVideoLoader
    public void showAd(Activity activity) {
        AMRewardAd aMRewardAd = this.amRewardAd;
        if (aMRewardAd != null) {
            aMRewardAd.show(activity, new AMRewardInteractionListener() { // from class: com.aggmoread.sdk.adapter.gm.AMAdapterCustomRewardLoader.1
                @Override // com.aggmoread.sdk.client.reward.AMRewardInteractionListener
                public void onAdClicked() {
                    AMAdapterCustomRewardLoader.this.callRewardVideoAdClick();
                }

                @Override // com.aggmoread.sdk.client.reward.AMRewardInteractionListener
                public void onAdClosed() {
                    AMAdapterCustomRewardLoader.this.callRewardVideoAdClosed();
                }

                @Override // com.aggmoread.sdk.client.IAMAdInteractionListener
                public void onAdError(AMError aMError) {
                }

                @Override // com.aggmoread.sdk.client.reward.AMRewardInteractionListener
                public void onAdExposed() {
                    AMAdapterCustomRewardLoader.this.callRewardVideoAdShow();
                }

                @Override // com.aggmoread.sdk.client.reward.AMRewardInteractionListener
                public void onReward(final Map map) {
                    AMAdapterCustomRewardLoader.this.callRewardVideoRewardVerify(new MediationRewardItem() { // from class: com.aggmoread.sdk.adapter.gm.AMAdapterCustomRewardLoader.1.1
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

                @Override // com.aggmoread.sdk.client.reward.AMRewardInteractionListener
                public void onVideoComplete() {
                    AMAdapterCustomRewardLoader.this.callRewardVideoComplete();
                }
            });
        }
    }
}

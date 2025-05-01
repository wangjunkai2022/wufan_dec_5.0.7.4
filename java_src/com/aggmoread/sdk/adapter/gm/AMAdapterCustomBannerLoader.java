package com.aggmoread.sdk.adapter.gm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.aggmoread.sdk.adapter.helper.AdapterHelper;
import com.aggmoread.sdk.adapter.helper.LogHelper;
import com.aggmoread.sdk.adapter.helper.ThreadHelper;
import com.aggmoread.sdk.client.AMAdLoadSlot;
import com.aggmoread.sdk.client.AMAdLoader;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.AMSdk;
import com.aggmoread.sdk.client.banner.AMBannerAd;
import com.aggmoread.sdk.client.banner.AMBannerAdInteractionListener;
import com.aggmoread.sdk.client.banner.AMBannerAdListener;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.mediation.bridge.custom.banner.MediationCustomBannerLoader;
import com.bytedance.sdk.openadsdk.mediation.custom.MediationCustomServiceConfig;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class AMAdapterCustomBannerLoader extends MediationCustomBannerLoader {
    private AMBannerAd amBannerAd;
    private ViewGroup amBannerContainer;
    private Context mContext;

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.banner.MediationCustomBannerLoader
    public View getAdView() {
        if (this.amBannerContainer == null) {
            this.amBannerContainer = new FrameLayout(this.mContext);
        }
        this.amBannerContainer.post(new Runnable() { // from class: com.aggmoread.sdk.adapter.gm.AMAdapterCustomBannerLoader.2
            @Override // java.lang.Runnable
            public void run() {
                LogHelper.log("getAdView runner");
                AMAdapterCustomBannerLoader.this.amBannerAd.showInContainer(AMAdapterCustomBannerLoader.this.amBannerContainer, new AMBannerAdInteractionListener() { // from class: com.aggmoread.sdk.adapter.gm.AMAdapterCustomBannerLoader.2.1
                    @Override // com.aggmoread.sdk.client.banner.AMBannerAdInteractionListener
                    public void onADCloseOverlay() {
                    }

                    @Override // com.aggmoread.sdk.client.banner.AMBannerAdInteractionListener
                    public void onADLeftApplication() {
                    }

                    @Override // com.aggmoread.sdk.client.banner.AMBannerAdInteractionListener
                    public void onADOpenOverlay() {
                    }

                    @Override // com.aggmoread.sdk.client.banner.AMBannerAdInteractionListener
                    public void onAdClicked() {
                        AMAdapterCustomBannerLoader.this.callBannerAdClick();
                    }

                    @Override // com.aggmoread.sdk.client.banner.AMBannerAdInteractionListener
                    public void onAdClosed() {
                        AMAdapterCustomBannerLoader.this.callBannerAdClosed();
                    }

                    @Override // com.aggmoread.sdk.client.IAMAdInteractionListener
                    public void onAdError(AMError aMError) {
                    }

                    @Override // com.aggmoread.sdk.client.banner.AMBannerAdInteractionListener
                    public void onAdExposed() {
                        AMAdapterCustomBannerLoader.this.callBannerAdShow();
                    }
                });
            }
        });
        return this.amBannerContainer;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.MediationCustomAdBaseLoader
    public void load(final Context context, AdSlot adSlot, final MediationCustomServiceConfig mediationCustomServiceConfig) {
        LogHelper.log("AMAdapterCustomFullVideoLoader load Ad enter ");
        ThreadHelper.runInWorkerThread(new Runnable() { // from class: com.aggmoread.sdk.adapter.gm.AMAdapterCustomBannerLoader.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AMAdapterCustomBannerLoader.this.mContext = context;
                    AMAdLoader makeAdLoader = AMSdk.makeAdLoader(new AMAdLoadSlot.Builder().setSlotId(mediationCustomServiceConfig.getADNNetworkSlotId()).setRefreshTime(0).setAdCount(1).build());
                    if (makeAdLoader != null) {
                        makeAdLoader.loadBannerAd(context, new AMBannerAdListener() { // from class: com.aggmoread.sdk.adapter.gm.AMAdapterCustomBannerLoader.1.1
                            @Override // com.aggmoread.sdk.client.IAMAdLoadListener
                            public void onAdLoadFail(AMError aMError) {
                                LogHelper.log("AMAdapterCustomFullVideoLoader onAdLoadFail " + aMError);
                                if (aMError != null) {
                                    LogHelper.log("onNoAD errorCode = " + aMError.code + " errorMessage = " + aMError.msg);
                                    AMAdapterCustomBannerLoader.this.callLoadFail(aMError.code, aMError.msg);
                                    return;
                                }
                                AMAdapterCustomBannerLoader.this.callLoadFail(AdapterHelper.NO_AD_CODD, "no ad");
                            }

                            @Override // com.aggmoread.sdk.client.IAMAdLoadListener
                            public void onAdLoaded(List<AMBannerAd> list) {
                                LogHelper.log("AMAdapterCustomFullVideoLoader onAdLoaded ");
                                if (list != null && !list.isEmpty()) {
                                    AMAdapterCustomBannerLoader.this.amBannerAd = list.get(0);
                                    int price = AdapterHelper.getPrice(AMAdapterCustomBannerLoader.this.amBannerAd.getAdExtras());
                                    if (price > 0) {
                                        AMAdapterCustomBannerLoader.this.callLoadSuccess(price);
                                        return;
                                    } else {
                                        AMAdapterCustomBannerLoader.this.callLoadSuccess();
                                        return;
                                    }
                                }
                                AMAdapterCustomBannerLoader.this.callLoadFail(AdapterHelper.NO_AD_CODD, "广告加载失败，没有匹配到合适的广告!");
                            }
                        });
                    } else {
                        AMAdapterCustomBannerLoader.this.callLoadFail(AdapterHelper.ERROR_HANDLE_CODE, "广告加载器构建失败!");
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
        if (AdapterHelper.notifyBidResult(this.amBannerAd, z4, d5, i4)) {
            return;
        }
        super.receiveBidResult(z4, d5, i4, map);
    }
}

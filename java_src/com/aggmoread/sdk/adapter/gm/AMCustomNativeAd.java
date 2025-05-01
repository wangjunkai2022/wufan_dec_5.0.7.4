package com.aggmoread.sdk.adapter.gm;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.aggmoread.sdk.adapter.helper.AdapterHelper;
import com.aggmoread.sdk.adapter.helper.LogHelper;
import com.aggmoread.sdk.adapter.helper.ThreadHelper;
import com.aggmoread.sdk.client.AMAdMediaListener;
import com.aggmoread.sdk.client.AMAdMediaView;
import com.aggmoread.sdk.client.AMAppInfo;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.feedlist.AMNativeAd;
import com.aggmoread.sdk.client.feedlist.AMNativeInteractionListener;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class AMCustomNativeAd extends MediationCustomNativeAd {
    private static final String TAG = "AMCustomNativeAd";
    private AdSlot mAdSlot;
    private Context mContext;
    private AMNativeAd mNativeUnifiedADData;
    private String VIEW_TAG = "view_tag";
    private boolean statusFlag = true;

    public AMCustomNativeAd(Context context, AMNativeAd aMNativeAd, AdSlot adSlot) {
        this.mContext = context;
        this.mNativeUnifiedADData = aMNativeAd;
        this.mAdSlot = adSlot;
        AMAppInfo appInfo = aMNativeAd.getAppInfo();
        MediationNativeAdAppInfo mediationNativeAdAppInfo = new MediationNativeAdAppInfo();
        if (appInfo != null) {
            mediationNativeAdAppInfo.setAppName(appInfo.getAppName());
            mediationNativeAdAppInfo.setAuthorName(appInfo.getAuthorName());
            mediationNativeAdAppInfo.setPackageSizeBytes(appInfo.getPacakgesSize());
            mediationNativeAdAppInfo.setPermissionsUrl(appInfo.getPermissionsUrl());
            mediationNativeAdAppInfo.setPrivacyAgreement(appInfo.getPrivacyAgreement());
            mediationNativeAdAppInfo.setVersionName(appInfo.getVersionName());
        }
        setNativeAdAppInfo(mediationNativeAdAppInfo);
        setTitle(this.mNativeUnifiedADData.getTitle());
        setDescription(this.mNativeUnifiedADData.getDesc());
        setIconUrl(this.mNativeUnifiedADData.getIconUrl());
        setImageUrl(this.mNativeUnifiedADData.getImageUrl());
        setImageWidth(this.mNativeUnifiedADData.getPictureWidth());
        setImageHeight(this.mNativeUnifiedADData.getPictureHeight());
        setImageList(this.mNativeUnifiedADData.getImageUrlList());
        setStarRating(this.mNativeUnifiedADData.getAppScore());
        setSource(this.mNativeUnifiedADData.getTitle());
        if (this.mNativeUnifiedADData.getAdPatternType() == 2) {
            setAdImageMode(5);
        } else if (this.mNativeUnifiedADData.getAdPatternType() == 1) {
            setAdImageMode(3);
        } else if (this.mNativeUnifiedADData.getAdPatternType() == 3) {
            setAdImageMode(4);
        }
        if (this.mNativeUnifiedADData.isAppAd()) {
            setInteractionType(4);
        } else {
            setInteractionType(3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd, com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void onDestroy() {
        super.onDestroy();
        ThreadHelper.runInMainThread(new Runnable() { // from class: com.aggmoread.sdk.adapter.gm.AMCustomNativeAd.4
            @Override // java.lang.Runnable
            public void run() {
                String unused = AMCustomNativeAd.TAG;
                if (AMCustomNativeAd.this.mNativeUnifiedADData != null) {
                    AMCustomNativeAd.this.mNativeUnifiedADData.destroy();
                    AMCustomNativeAd.this.mNativeUnifiedADData = null;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd, com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void onPause() {
        super.onPause();
        ThreadHelper.runOnUIThreadByThreadPool(new Runnable() { // from class: com.aggmoread.sdk.adapter.gm.AMCustomNativeAd.2
            @Override // java.lang.Runnable
            public void run() {
                String unused = AMCustomNativeAd.TAG;
                if (AMCustomNativeAd.this.mNativeUnifiedADData != null) {
                    AMCustomNativeAd.this.mNativeUnifiedADData.pauseVideo();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd, com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void onResume() {
        super.onResume();
        ThreadHelper.runOnUIThreadByThreadPool(new Runnable() { // from class: com.aggmoread.sdk.adapter.gm.AMCustomNativeAd.3
            @Override // java.lang.Runnable
            public void run() {
                String unused = AMCustomNativeAd.TAG;
                if (AMCustomNativeAd.this.mNativeUnifiedADData != null) {
                    AMCustomNativeAd.this.mNativeUnifiedADData.resume();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd, com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void receiveBidResult(boolean z4, double d5, int i4, Map<String, Object> map) {
        if (AdapterHelper.notifyBidResult(this.mNativeUnifiedADData, z4, d5, i4)) {
            return;
        }
        super.receiveBidResult(z4, d5, i4, map);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd, com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void registerView(final Activity activity, final ViewGroup viewGroup, final List<View> list, List<View> list2, List<View> list3, final MediationViewBinder mediationViewBinder) {
        LogHelper.log("registerView enter ");
        ThreadHelper.runOnUIThreadByThreadPool(new Runnable() { // from class: com.aggmoread.sdk.adapter.gm.AMCustomNativeAd.1
            @Override // java.lang.Runnable
            public void run() {
                if (AMCustomNativeAd.this.mNativeUnifiedADData != null) {
                    ViewGroup viewGroup2 = viewGroup;
                    if (viewGroup2 instanceof FrameLayout) {
                        FrameLayout frameLayout = (FrameLayout) viewGroup2;
                        LogHelper.log("registerView #4 nativeAdContainer " + frameLayout);
                        AMCustomNativeAd.this.mNativeUnifiedADData.bindAdToView(activity, frameLayout, AdapterHelper.getNativeAdLogoParams(AMCustomNativeAd.this.mAdSlot), list, null, new AMNativeInteractionListener() { // from class: com.aggmoread.sdk.adapter.gm.AMCustomNativeAd.1.1
                            @Override // com.aggmoread.sdk.client.feedlist.AMNativeInteractionListener
                            public void onADStatusChanged(int i4) {
                            }

                            @Override // com.aggmoread.sdk.client.feedlist.AMNativeInteractionListener
                            public void onAdClicked() {
                                AMCustomNativeAd.this.callAdClick();
                            }

                            @Override // com.aggmoread.sdk.client.IAMAdInteractionListener
                            public void onAdError(AMError aMError) {
                            }

                            @Override // com.aggmoread.sdk.client.feedlist.AMNativeInteractionListener
                            public void onAdExposed() {
                                AMCustomNativeAd.this.callAdShow();
                            }

                            @Override // com.aggmoread.sdk.client.feedlist.AMNativeInteractionListener
                            public void onLoadApkProgress(int i4) {
                            }
                        });
                        FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(mediationViewBinder.mediaViewId);
                        if (frameLayout2 == null || !AMCustomNativeAd.this.mNativeUnifiedADData.isVideoAd()) {
                            return;
                        }
                        LogHelper.log("registerView media ");
                        AMAdMediaView aMAdMediaView = new AMAdMediaView(AMCustomNativeAd.this.mContext);
                        frameLayout2.removeAllViews();
                        frameLayout2.addView(aMAdMediaView, -1, -1);
                        AMCustomNativeAd.this.mNativeUnifiedADData.bindMediaAdToView(aMAdMediaView, new AMAdMediaListener() { // from class: com.aggmoread.sdk.adapter.gm.AMCustomNativeAd.1.2
                            @Override // com.aggmoread.sdk.client.AMAdMediaListener
                            public void onVideoClicked() {
                                LogHelper.log("onVideoClicked");
                                AMCustomNativeAd.this.callAdClick();
                            }

                            @Override // com.aggmoread.sdk.client.AMAdMediaListener
                            public void onVideoCompleted() {
                                LogHelper.log("onVideoCompleted");
                                AMCustomNativeAd.this.callVideoCompleted();
                            }

                            @Override // com.aggmoread.sdk.client.AMAdMediaListener
                            public void onVideoError(AMError aMError) {
                                if (aMError != null) {
                                    LogHelper.log("onVideoError errorCode = " + aMError.code + " errorMessage = " + aMError.msg);
                                    AMCustomNativeAd.this.callVideoError(aMError.code, aMError.msg);
                                    return;
                                }
                                AMCustomNativeAd.this.callVideoError(AdapterHelper.ERROR_VIDEO_CODD, "video error");
                            }

                            @Override // com.aggmoread.sdk.client.AMAdMediaListener
                            public void onVideoInit() {
                                LogHelper.log("onVideoInit");
                            }

                            @Override // com.aggmoread.sdk.client.AMAdMediaListener
                            public void onVideoLoaded(int i4) {
                                LogHelper.log("onVideoLoaded");
                            }

                            @Override // com.aggmoread.sdk.client.AMAdMediaListener
                            public void onVideoLoading() {
                                LogHelper.log("onVideoLoading");
                            }

                            @Override // com.aggmoread.sdk.client.AMAdMediaListener
                            public void onVideoPause() {
                                LogHelper.log("onVideoPause");
                                AMCustomNativeAd.this.callVideoPause();
                            }

                            @Override // com.aggmoread.sdk.client.AMAdMediaListener
                            public void onVideoReady() {
                                LogHelper.log("onVideoReady");
                            }

                            @Override // com.aggmoread.sdk.client.AMAdMediaListener
                            public void onVideoResume() {
                                LogHelper.log("onVideoResume");
                                AMCustomNativeAd.this.callVideoResume();
                            }

                            @Override // com.aggmoread.sdk.client.AMAdMediaListener
                            public void onVideoStart() {
                                LogHelper.log("onVideoStart");
                                AMCustomNativeAd.this.callVideoStart();
                            }

                            @Override // com.aggmoread.sdk.client.AMAdMediaListener
                            public void onVideoStop() {
                                LogHelper.log("onVideoStop");
                            }
                        });
                    }
                }
            }
        });
    }
}

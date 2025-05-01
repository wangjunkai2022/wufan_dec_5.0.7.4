package com.aggmoread.sdk.adapter.gm;

import android.view.View;
import com.aggmoread.sdk.adapter.helper.AdapterHelper;
import com.aggmoread.sdk.adapter.helper.LogHelper;
import com.aggmoread.sdk.adapter.helper.ThreadHelper;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.draw.AMDrawAd;
import com.aggmoread.sdk.client.draw.AMDrawAdInteractionListener;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.mediation.bridge.custom.draw.MediationCustomDrawAd;
import java.util.Map;
/* loaded from: classes2.dex */
public class AMCustomDrawAd extends MediationCustomDrawAd {
    private static final String TAG = "AMCustomDrawAd";
    private int height;
    private AMDrawAd mNativeExpressADView;
    private int width;

    public AMCustomDrawAd(AMDrawAd aMDrawAd, final AdSlot adSlot) {
        setExpressAd(true);
        this.mNativeExpressADView = aMDrawAd;
        this.width = adSlot.getImgAcceptedWidth();
        this.height = adSlot.getImgAcceptedHeight();
        this.mNativeExpressADView.setVideoListener(new AMDrawAd.DrawVideoListener() { // from class: com.aggmoread.sdk.adapter.gm.AMCustomDrawAd.1
            @Override // com.aggmoread.sdk.client.draw.AMDrawAd.DrawVideoListener
            public void onVideoComplete() {
                AMCustomDrawAd.this.callVideoCompleted();
            }

            @Override // com.aggmoread.sdk.client.draw.AMDrawAd.DrawVideoListener
            public void onVideoError(AMError aMError) {
                if (aMError != null) {
                    LogHelper.log("onVideoError errorCode = " + aMError.code + " errorMessage = " + aMError.msg);
                    AMCustomDrawAd.this.callVideoError(aMError.code, aMError.msg);
                    return;
                }
                AMCustomDrawAd.this.callVideoError(AdapterHelper.ERROR_VIDEO_CODD, "video error");
            }

            @Override // com.aggmoread.sdk.client.draw.AMDrawAd.DrawVideoListener
            public void onVideoPause() {
                AMCustomDrawAd.this.callVideoPause();
            }

            @Override // com.aggmoread.sdk.client.draw.AMDrawAd.DrawVideoListener
            public void onVideoStart() {
                AMCustomDrawAd.this.callVideoStart();
            }
        });
        this.mNativeExpressADView.setInteractionListener(new AMDrawAdInteractionListener() { // from class: com.aggmoread.sdk.adapter.gm.AMCustomDrawAd.2
            @Override // com.aggmoread.sdk.client.draw.AMDrawAdInteractionListener
            public void onADCloseOverlay() {
            }

            @Override // com.aggmoread.sdk.client.draw.AMDrawAdInteractionListener
            public void onADLeftApplication() {
            }

            @Override // com.aggmoread.sdk.client.draw.AMDrawAdInteractionListener
            public void onADOpenOverlay() {
            }

            @Override // com.aggmoread.sdk.client.draw.AMDrawAdInteractionListener
            public void onAdClicked() {
                AMCustomDrawAd.this.callAdClick();
            }

            @Override // com.aggmoread.sdk.client.IAMAdInteractionListener
            public void onAdError(AMError aMError) {
            }

            @Override // com.aggmoread.sdk.client.draw.AMDrawAdInteractionListener
            public void onAdExposed() {
                AMCustomDrawAd.this.callAdShow();
            }

            @Override // com.aggmoread.sdk.client.draw.AMDrawAdInteractionListener
            public void onRenderFail() {
                LogHelper.log("onRenderFail");
                AMCustomDrawAd.this.callRenderFail(null, 99999, "render fail");
            }

            @Override // com.aggmoread.sdk.client.draw.AMDrawAdInteractionListener
            public void onRenderSuccess() {
                LogHelper.log("onRenderSuccess");
                AMCustomDrawAd.this.callRenderSuccess(adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd, com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public View getExpressView() {
        LogHelper.log("getExpressView");
        return this.mNativeExpressADView.getView();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd, com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public boolean hasDislike() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd, com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void onDestroy() {
        super.onDestroy();
        ThreadHelper.runInMainThread(new Runnable() { // from class: com.aggmoread.sdk.adapter.gm.AMCustomDrawAd.4
            @Override // java.lang.Runnable
            public void run() {
                String unused = AMCustomDrawAd.TAG;
                if (AMCustomDrawAd.this.mNativeExpressADView != null) {
                    AMCustomDrawAd.this.mNativeExpressADView.destroy();
                    AMCustomDrawAd.this.mNativeExpressADView = null;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd, com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd, com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd, com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void receiveBidResult(boolean z4, double d5, int i4, Map<String, Object> map) {
        if (AdapterHelper.notifyBidResult(this.mNativeExpressADView, z4, d5, i4)) {
            return;
        }
        super.receiveBidResult(z4, d5, i4, map);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd, com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void render() {
        LogHelper.log("render");
        ThreadHelper.runOnUIThreadByThreadPool(new Runnable() { // from class: com.aggmoread.sdk.adapter.gm.AMCustomDrawAd.3
            @Override // java.lang.Runnable
            public void run() {
                if (AMCustomDrawAd.this.mNativeExpressADView != null) {
                    LogHelper.log("render runner");
                    AMCustomDrawAd.this.mNativeExpressADView.getView();
                    AMCustomDrawAd.this.mNativeExpressADView.render();
                }
            }
        });
    }
}

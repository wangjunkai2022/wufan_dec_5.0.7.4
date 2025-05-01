package com.aggmoread.sdk.adapter.gm;

import android.view.View;
import com.aggmoread.sdk.adapter.helper.AdapterHelper;
import com.aggmoread.sdk.adapter.helper.ThreadHelper;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.feedlist.AMExpressAd;
import com.aggmoread.sdk.client.feedlist.AMExpressInteractionListener;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd;
import java.util.Map;
/* loaded from: classes2.dex */
public class AMCustomExpressAd extends MediationCustomNativeAd {
    private static final String TAG = "AMCustomExpressAd";
    private AMExpressAd mNativeExpressADView;

    public AMCustomExpressAd(AMExpressAd aMExpressAd, AdSlot adSlot) {
        setExpressAd(true);
        this.mNativeExpressADView = aMExpressAd;
        aMExpressAd.setMediaListener(new AMExpressAd.ExpressMediaListener() { // from class: com.aggmoread.sdk.adapter.gm.AMCustomExpressAd.1
            @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd.ExpressMediaListener
            public void onVideoCached(AMExpressAd aMExpressAd2) {
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd.ExpressMediaListener
            public void onVideoComplete(AMExpressAd aMExpressAd2) {
                AMCustomExpressAd.this.callVideoCompleted();
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd.ExpressMediaListener
            public void onVideoError(AMExpressAd aMExpressAd2, AMError aMError) {
                if (aMError != null) {
                    String unused = AMCustomExpressAd.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onVideoError errorCode = ");
                    sb.append(aMError.code);
                    sb.append(" errorMessage = ");
                    sb.append(aMError.msg);
                    AMCustomExpressAd.this.callVideoError(aMError.code, aMError.msg);
                    return;
                }
                AMCustomExpressAd.this.callVideoError(AdapterHelper.ERROR_VIDEO_CODD, "video error");
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd.ExpressMediaListener
            public void onVideoInit(AMExpressAd aMExpressAd2) {
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd.ExpressMediaListener
            public void onVideoLoading(AMExpressAd aMExpressAd2) {
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd.ExpressMediaListener
            public void onVideoPageClose(AMExpressAd aMExpressAd2) {
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd.ExpressMediaListener
            public void onVideoPageOpen(AMExpressAd aMExpressAd2) {
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd.ExpressMediaListener
            public void onVideoPause(AMExpressAd aMExpressAd2) {
                AMCustomExpressAd.this.callVideoPause();
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd.ExpressMediaListener
            public void onVideoReady(AMExpressAd aMExpressAd2, long j4) {
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressAd.ExpressMediaListener
            public void onVideoStart(AMExpressAd aMExpressAd2) {
                AMCustomExpressAd.this.callVideoStart();
            }
        });
        this.mNativeExpressADView.setInteractionListener(new AMExpressInteractionListener() { // from class: com.aggmoread.sdk.adapter.gm.AMCustomExpressAd.2
            @Override // com.aggmoread.sdk.client.feedlist.AMExpressInteractionListener
            public void onADCloseOverlay(AMExpressAd aMExpressAd2) {
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressInteractionListener
            public void onADLeftApplication(AMExpressAd aMExpressAd2) {
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressInteractionListener
            public void onADOpenOverlay(AMExpressAd aMExpressAd2) {
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressInteractionListener
            public void onAdClicked(AMExpressAd aMExpressAd2) {
                AMCustomExpressAd.this.callAdClick();
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressInteractionListener
            public void onAdClosed(AMExpressAd aMExpressAd2) {
                AMCustomExpressAd.this.onDestroy();
            }

            @Override // com.aggmoread.sdk.client.IAMAdInteractionListener
            public void onAdError(AMError aMError) {
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressInteractionListener
            public void onAdExposed(AMExpressAd aMExpressAd2) {
                AMCustomExpressAd.this.callAdShow();
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressInteractionListener
            public void onRenderFail(AMExpressAd aMExpressAd2) {
                AMCustomExpressAd.this.callRenderFail(aMExpressAd2.getView(), 99999, "render fail");
            }

            @Override // com.aggmoread.sdk.client.feedlist.AMExpressInteractionListener
            public void onRenderSuccess(AMExpressAd aMExpressAd2) {
                AMCustomExpressAd.this.callRenderSuccess(-1.0f, -2.0f);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd, com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public View getExpressView() {
        return this.mNativeExpressADView.getView();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd, com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public boolean hasDislike() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad.MediationCustomNativeAd, com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void onDestroy() {
        super.onDestroy();
        ThreadHelper.runInMainThread(new Runnable() { // from class: com.aggmoread.sdk.adapter.gm.AMCustomExpressAd.4
            @Override // java.lang.Runnable
            public void run() {
                String unused = AMCustomExpressAd.TAG;
                if (AMCustomExpressAd.this.mNativeExpressADView != null) {
                    AMCustomExpressAd.this.mNativeExpressADView.destroy();
                    AMCustomExpressAd.this.mNativeExpressADView = null;
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
        ThreadHelper.runOnUIThreadByThreadPool(new Runnable() { // from class: com.aggmoread.sdk.adapter.gm.AMCustomExpressAd.3
            @Override // java.lang.Runnable
            public void run() {
                if (AMCustomExpressAd.this.mNativeExpressADView != null) {
                    AMCustomExpressAd.this.mNativeExpressADView.getView();
                    AMCustomExpressAd.this.mNativeExpressADView.render();
                }
            }
        });
    }
}

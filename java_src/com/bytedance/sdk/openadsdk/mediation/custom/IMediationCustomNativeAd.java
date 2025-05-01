package com.bytedance.sdk.openadsdk.mediation.custom;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public interface IMediationCustomNativeAd {
    void callAdClick();

    void callAdShow();

    void callDislikeCancel();

    void callDislikeSelected(int i4, String str);

    void callDislikeShow();

    void callOnDownloadActive(long j4, long j5);

    void callOnDownloadFailed(long j4, long j5, String str, String str2);

    void callOnDownloadFinished(long j4, String str, String str2);

    void callOnDownloadPaused(long j4, long j5, String str, String str2);

    void callOnIdle();

    void callOnInstalled(String str, String str2);

    void callRenderFail(View view, int i4, String str);

    void callRenderSuccess(float f5, float f6);

    void callVideoCompleted();

    void callVideoError(int i4, String str);

    void callVideoPause();

    void callVideoProgressUpdate(long j4, long j5);

    void callVideoResume();

    void callVideoStart();

    int getBiddingType();

    View getExpressView();

    TTFeedAd.CustomizeVideo getNativeCustomVideoReporter();

    String getVideoUrl();

    boolean hasDislike();

    boolean isClientBidding();

    MediationConstant.AdIsReadyStatus isReadyCondition();

    boolean isServerBidding();

    boolean isUseCustomVideo();

    void onDestroy();

    void onPause();

    void onResume();

    void receiveBidResult(boolean z4, double d5, int i4, Map<String, Object> map);

    void registerView(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, MediationViewBinder mediationViewBinder);

    void render();

    void setActionText(String str);

    void setAdImageMode(int i4);

    void setBiddingPrice(double d5);

    void setDescription(String str);

    void setDislikeDialogCallBack(MediationCustomNativeDislikeDialog mediationCustomNativeDislikeDialog);

    void setExpressAd(boolean z4);

    void setIconUrl(String str);

    void setImageHeight(int i4);

    void setImageList(List<String> list);

    void setImageUrl(String str);

    void setImageWidth(int i4);

    void setInteractionType(int i4);

    void setMediaExtraInfo(Map<String, Object> map);

    void setNativeAdAppInfo(MediationNativeAdAppInfo mediationNativeAdAppInfo);

    void setPackageName(String str);

    void setSource(String str);

    void setStarRating(double d5);

    void setTitle(String str);

    void setVideoHeight(int i4);

    void setVideoWidth(int i4);
}

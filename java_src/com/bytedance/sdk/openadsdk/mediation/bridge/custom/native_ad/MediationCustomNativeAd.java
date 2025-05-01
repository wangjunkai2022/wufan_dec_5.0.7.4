package com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdDislike;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd;
import com.bytedance.sdk.openadsdk.mediation.custom.MediationCustomNativeDislikeDialog;
import com.bytedance.sdk.openadsdk.mediation.vv.vv.k;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class MediationCustomNativeAd implements Bridge, IMediationCustomNativeAd {

    /* renamed from: b  reason: collision with root package name */
    private int f8883b;

    /* renamed from: d  reason: collision with root package name */
    private int f8884d;

    /* renamed from: g  reason: collision with root package name */
    private int f8885g;

    /* renamed from: i  reason: collision with root package name */
    private String f8886i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8887j;
    private int jh;

    /* renamed from: k  reason: collision with root package name */
    private String f8888k;
    private MediationNativeAdAppInfo la;

    /* renamed from: m  reason: collision with root package name */
    private Map<String, Object> f8889m;

    /* renamed from: n  reason: collision with root package name */
    private int f8890n;

    /* renamed from: o  reason: collision with root package name */
    private String f8891o;

    /* renamed from: p  reason: collision with root package name */
    private String f8892p;

    /* renamed from: q  reason: collision with root package name */
    private String f8893q;
    private int qv;

    /* renamed from: r  reason: collision with root package name */
    private double f8894r;

    /* renamed from: t  reason: collision with root package name */
    private List<String> f8895t;

    /* renamed from: u  reason: collision with root package name */
    private String f8896u;
    private double vv;
    private String wv;

    /* renamed from: x  reason: collision with root package name */
    private Bridge f8897x;

    /* renamed from: y  reason: collision with root package name */
    private MediationCustomNativeDislikeDialog f8898y;

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        MediationAdDislike dislikeDialog;
        if (i4 == 8127) {
            this.f8897x = (Bridge) valueSet.objectValue(8034, Bridge.class);
        } else if (i4 == 6083) {
            render();
        } else if (i4 == 6081) {
            return (T) getExpressView();
        } else {
            if (i4 == 8159) {
                registerView((Activity) valueSet.objectValue(20033, Activity.class), (ViewGroup) valueSet.objectValue(8067, ViewGroup.class), (List) valueSet.objectValue(8068, List.class), (List) valueSet.objectValue(8069, List.class), (List) valueSet.objectValue(8070, List.class), BridgeUtil.buildViewBinder((Bridge) valueSet.objectValue(8071, Bridge.class)));
            } else if (i4 == 8135) {
                return (T) Boolean.valueOf(hasDislike());
            } else {
                if (i4 == 8149) {
                    onPause();
                } else if (i4 == 8148) {
                    onResume();
                } else if (i4 == 8109) {
                    onDestroy();
                } else if (i4 == 8121) {
                    return (T) isReadyCondition();
                } else {
                    if (i4 == 8194) {
                        String stringValue = valueSet.stringValue(8036);
                        Map<String, Object> map = (Map) valueSet.objectValue(8075, Map.class);
                        MediationCustomNativeDislikeDialog mediationCustomNativeDislikeDialog = this.f8898y;
                        if (mediationCustomNativeDislikeDialog != null) {
                            mediationCustomNativeDislikeDialog.dislikeClick(stringValue, map);
                        }
                    } else if (i4 == 6072) {
                        Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
                        Map<String, Object> map2 = (Map) valueSet.objectValue(8075, Map.class);
                        MediationCustomNativeDislikeDialog mediationCustomNativeDislikeDialog2 = this.f8898y;
                        if (mediationCustomNativeDislikeDialog2 != null && (dislikeDialog = mediationCustomNativeDislikeDialog2.getDislikeDialog(activity, map2)) != null) {
                            return (T) new k(dislikeDialog);
                        }
                    } else if (i4 == 8320) {
                        return (T) new MediationCustomizeVideoImpl(getNativeCustomVideoReporter());
                    } else {
                        if (i4 == 8228) {
                            return (T) getVideoUrl();
                        }
                        if (i4 == 8225) {
                            MediationApiLog.i("TTMediationSDK", "MediationCustomNativeAd receiveBidResult");
                            receiveBidResult(valueSet.booleanValue(8406), valueSet.doubleValue(8407), valueSet.intValue(8408), (Map) valueSet.objectValue(8075, Map.class));
                        }
                    }
                }
            }
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callAdClick() {
        Bridge bridge = this.f8897x;
        if (bridge != null) {
            bridge.call(8130, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callAdShow() {
        Bridge bridge = this.f8897x;
        if (bridge != null) {
            bridge.call(8113, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callDislikeCancel() {
        Bridge bridge = this.f8897x;
        if (bridge != null) {
            bridge.call(8184, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callDislikeSelected(int i4, String str) {
        if (this.f8897x != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8038, i4);
            create.add(8039, str);
            this.f8897x.call(8132, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callDislikeShow() {
        Bridge bridge = this.f8897x;
        if (bridge != null) {
            bridge.call(8185, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callOnDownloadActive(long j4, long j5) {
        if (this.f8897x != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8062, j4);
            create.add(8063, j5);
            this.f8897x.call(8187, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callOnDownloadFailed(long j4, long j5, String str, String str2) {
        if (this.f8897x != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8062, j4);
            create.add(8063, j5);
            create.add(8066, str);
            create.add(8056, str2);
            this.f8897x.call(8157, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callOnDownloadFinished(long j4, String str, String str2) {
        if (this.f8897x != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8062, j4);
            create.add(8066, str);
            create.add(8056, str2);
            this.f8897x.call(8155, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callOnDownloadPaused(long j4, long j5, String str, String str2) {
        if (this.f8897x != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8062, j4);
            create.add(8063, j5);
            create.add(8066, str);
            create.add(8056, str2);
            this.f8897x.call(8158, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callOnIdle() {
        Bridge bridge = this.f8897x;
        if (bridge != null) {
            bridge.call(8152, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callOnInstalled(String str, String str2) {
        if (this.f8897x != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8066, str);
            create.add(8056, str2);
            this.f8897x.call(8156, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callRenderFail(View view, int i4, String str) {
        if (this.f8897x != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8042, view);
            create.add(8014, i4);
            create.add(8015, str);
            this.f8897x.call(8134, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callRenderSuccess(float f5, float f6) {
        if (this.f8897x != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8040, f5);
            create.add(8041, f6);
            this.f8897x.call(8133, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callVideoCompleted() {
        Bridge bridge = this.f8897x;
        if (bridge != null) {
            bridge.call(8118, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callVideoError(int i4, String str) {
        if (this.f8897x != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8014, i4);
            create.add(8015, str);
            this.f8897x.call(8117, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callVideoPause() {
        Bridge bridge = this.f8897x;
        if (bridge != null) {
            bridge.call(8146, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callVideoProgressUpdate(long j4, long j5) {
        if (this.f8897x != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8072, j4);
            create.add(8073, j5);
            this.f8897x.call(8154, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callVideoResume() {
        Bridge bridge = this.f8897x;
        if (bridge != null) {
            bridge.call(8150, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void callVideoStart() {
        Bridge bridge = this.f8897x;
        if (bridge != null) {
            bridge.call(8145, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public int getBiddingType() {
        Bridge bridge = this.f8897x;
        if (bridge != null) {
            return ((Integer) bridge.call(8226, null, Integer.class)).intValue();
        }
        return 0;
    }

    public View getExpressView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public TTFeedAd.CustomizeVideo getNativeCustomVideoReporter() {
        return null;
    }

    public ValueSet getValueSet() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(8016, this.vv);
        create.add(8006, this.f8889m);
        create.add(8045, this.f8892p);
        create.add(8046, this.f8886i);
        create.add(8048, this.f8891o);
        create.add(8050, this.f8896u);
        create.add(8051, this.qv);
        create.add(8052, this.f8890n);
        create.add(8061, this.wv);
        create.add(8054, this.f8888k);
        create.add(8420, this.f8883b);
        create.add(8421, this.jh);
        create.add(8082, this.f8894r);
        create.add(8053, this.f8895t);
        create.add(8049, this.f8893q);
        create.add(8033, this.f8887j);
        create.add(8060, this.f8884d);
        create.add(8059, this.f8885g);
        MediationNativeAdAppInfo mediationNativeAdAppInfo = this.la;
        if (mediationNativeAdAppInfo != null) {
            create.add(8315, new MediationNativeAppInfoImpl(mediationNativeAdAppInfo));
        }
        return create.build();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public String getVideoUrl() {
        return null;
    }

    public boolean hasDislike() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public boolean isClientBidding() {
        Bridge bridge = this.f8897x;
        if (bridge != null) {
            return ((Boolean) bridge.call(8110, null, Boolean.class)).booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public MediationConstant.AdIsReadyStatus isReadyCondition() {
        return MediationConstant.AdIsReadyStatus.ADN_NO_READY_API;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public boolean isServerBidding() {
        Bridge bridge = this.f8897x;
        if (bridge != null) {
            return ((Boolean) bridge.call(8136, null, Boolean.class)).booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public boolean isUseCustomVideo() {
        Bridge bridge = this.f8897x;
        if (bridge != null) {
            return ((Boolean) bridge.call(8160, null, Boolean.class)).booleanValue();
        }
        return false;
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void receiveBidResult(boolean z4, double d5, int i4, Map<String, Object> map) {
    }

    public void registerView(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, MediationViewBinder mediationViewBinder) {
    }

    public void render() {
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setActionText(String str) {
        this.wv = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setAdImageMode(int i4) {
        this.f8884d = i4;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setBiddingPrice(double d5) {
        this.vv = d5;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setDescription(String str) {
        this.f8886i = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setDislikeDialogCallBack(MediationCustomNativeDislikeDialog mediationCustomNativeDislikeDialog) {
        Bridge bridge = this.f8897x;
        if (bridge != null) {
            this.f8898y = mediationCustomNativeDislikeDialog;
            bridge.call(6085, null, Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setExpressAd(boolean z4) {
        this.f8887j = z4;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setIconUrl(String str) {
        this.f8891o = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setImageHeight(int i4) {
        this.qv = i4;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setImageList(List<String> list) {
        this.f8895t = list;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setImageUrl(String str) {
        this.f8896u = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setImageWidth(int i4) {
        this.f8890n = i4;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setInteractionType(int i4) {
        this.f8885g = i4;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setMediaExtraInfo(Map<String, Object> map) {
        this.f8889m = map;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setNativeAdAppInfo(MediationNativeAdAppInfo mediationNativeAdAppInfo) {
        this.la = mediationNativeAdAppInfo;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setPackageName(String str) {
        this.f8888k = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setSource(String str) {
        this.f8893q = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setStarRating(double d5) {
        this.f8894r = d5;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setTitle(String str) {
        this.f8892p = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setVideoHeight(int i4) {
        this.jh = i4;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.custom.IMediationCustomNativeAd
    public void setVideoWidth(int i4) {
        this.f8883b = i4;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return getValueSet();
    }
}

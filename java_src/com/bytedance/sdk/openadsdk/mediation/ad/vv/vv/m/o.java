package com.bytedance.sdk.openadsdk.mediation.ad.vv.vv.m;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder;
/* loaded from: classes2.dex */
public class o implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final IMediationViewBinder f8861m;
    private ValueSet vv = a.f8190c;

    public o(IMediationViewBinder iMediationViewBinder) {
        this.f8861m = iMediationViewBinder;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        IMediationViewBinder iMediationViewBinder = this.f8861m;
        if (iMediationViewBinder == null) {
            return null;
        }
        switch (i4) {
            case 271021:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getLayoutId()));
            case 271022:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getTitleId()));
            case 271023:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getDecriptionTextId()));
            case 271024:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getCallToActionId()));
            case 271025:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getIconImageId()));
            case 271026:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getMainImageId()));
            case 271027:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getMediaViewId()));
            case 271028:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getSourceId()));
            case 271029:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getGroupImage1Id()));
            case 271030:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getGroupImage2Id()));
            case 271031:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getGroupImage3Id()));
            case 271032:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getLogoLayoutId()));
            case 271033:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getShakeViewContainerId()));
            case 271034:
                return (T) iMediationViewBinder.getExtras();
            default:
                return null;
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}

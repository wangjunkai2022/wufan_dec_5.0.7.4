package com.bytedance.sdk.openadsdk.p.vv.p;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.AdSlot;
/* loaded from: classes2.dex */
public class m {
    public static final ValueSet m(final AdSlot adSlot) {
        a b5 = a.b();
        if (adSlot == null) {
            return null;
        }
        b5.i(260001, adSlot.getAdId());
        b5.i(260002, adSlot.getCreativeId());
        b5.i(260003, adSlot.getExt());
        b5.i(260004, adSlot.getCodeId());
        b5.j(260005, adSlot.isAutoPlay());
        b5.f(260006, adSlot.getImgAcceptedWidth());
        b5.f(260007, adSlot.getImgAcceptedHeight());
        b5.e(260008, adSlot.getExpressViewAcceptedWidth());
        b5.e(260009, adSlot.getExpressViewAcceptedHeight());
        b5.j(260010, adSlot.isSupportDeepLink());
        b5.j(260011, adSlot.isSupportRenderConrol());
        b5.f(2600012, adSlot.getAdCount());
        b5.i(260013, adSlot.getMediaExtra());
        b5.i(260014, adSlot.getUserID());
        b5.f(260015, adSlot.getOrientation());
        b5.f(260016, adSlot.getNativeAdType());
        b5.h(260017, adSlot.getExternalABVid());
        b5.f(260018, adSlot.getAdloadSeq());
        b5.i(260019, adSlot.getPrimeRit());
        b5.f(260020, adSlot.getAdType());
        b5.i(260021, adSlot.getBidAdm());
        b5.i(260022, adSlot.getUserData());
        b5.h(260023, adSlot.getAdLoadType());
        b5.h(260024, new ValueSet.ValueGetter<String>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.m.1
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public String get() {
                return AdSlot.this.getRewardName();
            }
        });
        b5.h(260025, new ValueSet.ValueGetter<Integer>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.m.2
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public Integer get() {
                return Integer.valueOf(AdSlot.this.getRewardAmount());
            }
        });
        b5.h(260026, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.m.3
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public Boolean get() {
                return Boolean.valueOf(AdSlot.this.isSupportIconStyle());
            }
        });
        b5.h(8260028, adSlot.getMediationAdSlot());
        return b5.a();
    }
}

package com.bytedance.sdk.openadsdk.mediation.vv.vv;

import android.app.Activity;
import android.content.Context;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTCustomController;
import com.bytedance.sdk.openadsdk.mediation.IMediationDrawAdTokenCallback;
import com.bytedance.sdk.openadsdk.mediation.IMediationNativeAdTokenCallback;
import com.bytedance.sdk.openadsdk.mediation.IMediationPreloadRequestInfo;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdClassLoader;
import com.bytedance.sdk.openadsdk.mediation.init.MediationConfigUserInfoForSegment;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes2.dex */
public class n extends com.bytedance.sdk.openadsdk.mediation.vv.vv.vv.m {
    private Bridge vv;

    public n(Bridge bridge) {
        super(bridge);
        this.vv = bridge;
    }

    private ValueSet vv(AdSlot adSlot) {
        a k4 = a.k(com.bytedance.sdk.openadsdk.p.vv.p.m.m(adSlot));
        k4.h(8302, MediationAdClassLoader.getInstance());
        if (adSlot != null && adSlot.getMediationAdSlot() != null) {
            k4.h(8260028, new o(adSlot.getMediationAdSlot()));
        }
        return k4.a();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.vv.vv.vv.m, com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void loadDrawToken(Context context, AdSlot adSlot, IMediationDrawAdTokenCallback iMediationDrawAdTokenCallback) {
        if (this.vv != null) {
            a c5 = a.c(3);
            c5.h(0, context);
            c5.h(1, vv(adSlot));
            c5.h(2, new com.bytedance.sdk.openadsdk.mediation.vv.vv.m.vv(iMediationDrawAdTokenCallback));
            c5.h(3, MediationAdClassLoader.getInstance());
            this.vv.call(270022, c5.a(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.vv.vv.vv.m, com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void loadNativeToken(Context context, AdSlot adSlot, IMediationNativeAdTokenCallback iMediationNativeAdTokenCallback) {
        if (this.vv != null) {
            a c5 = a.c(3);
            c5.h(0, context);
            c5.h(1, vv(adSlot));
            c5.h(2, new com.bytedance.sdk.openadsdk.mediation.vv.vv.m.p(iMediationNativeAdTokenCallback));
            c5.h(3, MediationAdClassLoader.getInstance());
            this.vv.call(270021, c5.a(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.vv.vv.vv.m, com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void preload(Activity activity, List<IMediationPreloadRequestInfo> list, int i4, int i5) {
        if (this.vv != null) {
            a c5 = a.c(4);
            c5.h(0, activity);
            if (list != null) {
                LinkedList linkedList = new LinkedList();
                for (IMediationPreloadRequestInfo iMediationPreloadRequestInfo : list) {
                    linkedList.add(new qv(iMediationPreloadRequestInfo));
                }
                c5.h(1, linkedList);
            }
            c5.f(2, i4);
            c5.f(3, i5);
            c5.h(4, MediationAdClassLoader.getInstance());
            this.vv.call(270013, c5.a(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.vv.vv.vv.m, com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void setUserInfoForSegment(MediationConfigUserInfoForSegment mediationConfigUserInfoForSegment) {
        if (this.vv != null) {
            a c5 = a.c(1);
            c5.h(0, com.bytedance.sdk.openadsdk.mediation.init.vv.vv.vv.p.vv(mediationConfigUserInfoForSegment));
            this.vv.call(270014, c5.a(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.vv.vv.vv.m, com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void updatePrivacyConfig(TTCustomController tTCustomController) {
        if (this.vv != null) {
            a c5 = a.c(1);
            c5.h(0, com.bytedance.sdk.openadsdk.p.vv.p.i.vv(tTCustomController));
            this.vv.call(270016, c5.a(), Void.class);
        }
    }
}

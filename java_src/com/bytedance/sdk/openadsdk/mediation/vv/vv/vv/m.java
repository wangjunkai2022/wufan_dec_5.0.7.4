package com.bytedance.sdk.openadsdk.mediation.vv.vv.vv;

import android.app.Activity;
import android.content.Context;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTCustomController;
import com.bytedance.sdk.openadsdk.mediation.IMediationDrawAdTokenCallback;
import com.bytedance.sdk.openadsdk.mediation.IMediationManager;
import com.bytedance.sdk.openadsdk.mediation.IMediationNativeAdTokenCallback;
import com.bytedance.sdk.openadsdk.mediation.IMediationPreloadRequestInfo;
import com.bytedance.sdk.openadsdk.mediation.MediationAppDialogClickListener;
import com.bytedance.sdk.openadsdk.mediation.init.MediationConfigUserInfoForSegment;
import com.bytedance.sdk.openadsdk.mediation.vv.vv.m.o;
import com.bytedance.sdk.openadsdk.p.vv.vv.wv;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class m implements IMediationManager {
    private final Bridge vv;

    public m(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public Map<String, Object> getMediationExtraInfo() {
        return (Map) this.vv.call(270024, a.c(0).a(), Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void loadDrawToken(Context context, AdSlot adSlot, IMediationDrawAdTokenCallback iMediationDrawAdTokenCallback) {
        a c5 = a.c(3);
        c5.h(0, context);
        c5.h(1, adSlot);
        c5.h(2, new com.bytedance.sdk.openadsdk.mediation.vv.vv.m.vv(iMediationDrawAdTokenCallback));
        this.vv.call(270022, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void loadNativeToken(Context context, AdSlot adSlot, IMediationNativeAdTokenCallback iMediationNativeAdTokenCallback) {
        a c5 = a.c(3);
        c5.h(0, context);
        c5.h(1, adSlot);
        c5.h(2, new com.bytedance.sdk.openadsdk.mediation.vv.vv.m.p(iMediationNativeAdTokenCallback));
        this.vv.call(270021, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public Object mtool(int i4, ValueSet valueSet) {
        a c5 = a.c(2);
        c5.f(0, i4);
        c5.h(1, valueSet);
        return this.vv.call(271043, c5.a(), Object.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void preload(Activity activity, List<IMediationPreloadRequestInfo> list, int i4, int i5) {
        a c5 = a.c(4);
        c5.h(0, activity);
        c5.h(1, list);
        c5.f(2, i4);
        c5.f(3, i5);
        this.vv.call(270013, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void requestPermissionIfNecessary(Context context) {
        a c5 = a.c(1);
        c5.h(0, context);
        this.vv.call(270017, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void setPulisherDid(String str) {
        a c5 = a.c(1);
        c5.i(0, str);
        this.vv.call(270015, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void setThemeStatus(int i4) {
        a c5 = a.c(1);
        c5.f(0, i4);
        this.vv.call(270019, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void setUserInfoForSegment(MediationConfigUserInfoForSegment mediationConfigUserInfoForSegment) {
        a c5 = a.c(1);
        c5.h(0, mediationConfigUserInfoForSegment);
        this.vv.call(270014, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public int showOpenOrInstallAppDialog(MediationAppDialogClickListener mediationAppDialogClickListener) {
        a c5 = a.c(1);
        c5.h(0, new o(mediationAppDialogClickListener));
        return ((Integer) this.vv.call(270020, c5.a(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void updateLocalExtra(Map<String, Object> map) {
        a c5 = a.c(1);
        c5.h(0, map);
        this.vv.call(271050, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void updatePrivacyConfig(TTCustomController tTCustomController) {
        a c5 = a.c(1);
        c5.h(0, new wv(tTCustomController));
        this.vv.call(270016, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void requestPermissionIfNecessary(Context context, int[] iArr) {
        a c5 = a.c(2);
        c5.h(0, context);
        c5.h(1, iArr);
        this.vv.call(270018, c5.a(), Void.class);
    }
}

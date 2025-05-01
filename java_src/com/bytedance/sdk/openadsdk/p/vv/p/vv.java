package com.bytedance.sdk.openadsdk.p.vv.p;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.AdConfig;
import java.util.Map;
/* loaded from: classes2.dex */
public class vv {
    public static final ValueSet vv(final AdConfig adConfig) {
        a b5 = a.b();
        if (adConfig == null) {
            return null;
        }
        b5.i(261001, adConfig.getAppId());
        b5.i(261002, adConfig.getAppName());
        b5.j(261003, adConfig.isPaid());
        b5.i(261004, adConfig.getKeywords());
        b5.i(261005, adConfig.getData());
        b5.f(261006, adConfig.getTitleBarTheme());
        b5.j(261007, adConfig.isAllowShowNotify());
        b5.j(261008, adConfig.isDebug());
        b5.h(261009, adConfig.getDirectDownloadNetworkType());
        b5.j(261011, adConfig.isSupportMultiProcess());
        b5.h(261012, adConfig.getCustomController() != null ? i.vv(adConfig.getCustomController()) : null);
        b5.h(261013, new ValueSet.ValueGetter<Integer>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.vv.1
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public Integer get() {
                return Integer.valueOf(AdConfig.this.getPluginUpdateConfig());
            }
        });
        b5.h(261014, new ValueSet.ValueGetter<Integer>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.vv.2
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public Integer get() {
                return Integer.valueOf(AdConfig.this.getAgeGroup());
            }
        });
        b5.h(261015, new ValueSet.ValueGetter<Integer>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.vv.3
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public Integer get() {
                return Integer.valueOf(AdConfig.this.getThemeStatus());
            }
        });
        b5.h(261016, adConfig.getMediationConfig() != null ? com.bytedance.sdk.openadsdk.mediation.init.vv.vv.vv.vv.vv(adConfig.getMediationConfig()) : null);
        b5.j(261017, adConfig.isUseMediation());
        b5.h(261018, new ValueSet.ValueGetter<Map>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.vv.4
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public Map get() {
                return AdConfig.this.getInitExtra();
            }
        });
        return b5.a();
    }
}

package com.bytedance.sdk.openadsdk.p.vv.p;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTCustomController;
/* loaded from: classes2.dex */
public class i {
    public static final ValueSet vv(final TTCustomController tTCustomController) {
        a b5 = a.b();
        if (tTCustomController == null) {
            return null;
        }
        b5.h(262101, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.i.1
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public Boolean get() {
                return Boolean.valueOf(TTCustomController.this.isCanUseLocation());
            }
        });
        b5.h(262102, new ValueSet.ValueGetter<ValueSet>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.i.5
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public ValueSet get() {
                return p.vv(TTCustomController.this.getTTLocation());
            }
        });
        b5.h(262103, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.i.6
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public Boolean get() {
                return Boolean.valueOf(TTCustomController.this.alist());
            }
        });
        b5.h(262104, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.i.7
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public Boolean get() {
                return Boolean.valueOf(TTCustomController.this.isCanUsePhoneState());
            }
        });
        b5.h(262105, new ValueSet.ValueGetter<String>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.i.8
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public String get() {
                return TTCustomController.this.getDevImei();
            }
        });
        b5.h(262106, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.i.9
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public Boolean get() {
                return Boolean.valueOf(TTCustomController.this.isCanUseWifiState());
            }
        });
        b5.h(262107, new ValueSet.ValueGetter<String>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.i.10
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public String get() {
                return TTCustomController.this.getMacAddress();
            }
        });
        b5.h(262108, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.i.11
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public Boolean get() {
                return Boolean.valueOf(TTCustomController.this.isCanUseWriteExternal());
            }
        });
        b5.h(262109, new ValueSet.ValueGetter<String>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.i.12
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public String get() {
                return TTCustomController.this.getDevOaid();
            }
        });
        b5.h(262110, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.i.2
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public Boolean get() {
                return Boolean.valueOf(TTCustomController.this.isCanUseAndroidId());
            }
        });
        b5.h(262113, tTCustomController.getMediationPrivacyConfig() != null ? com.bytedance.sdk.openadsdk.mediation.init.vv.vv.vv.m.vv(tTCustomController.getMediationPrivacyConfig()) : null);
        b5.h(262112, new ValueSet.ValueGetter<String>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.i.3
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public String get() {
                return TTCustomController.this.getAndroidId();
            }
        });
        b5.h(262111, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.p.vv.p.i.4
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: vv */
            public Boolean get() {
                return Boolean.valueOf(TTCustomController.this.isCanUsePermissionRecordAudio());
            }
        });
        return b5.a();
    }
}

package com.bytedance.msdk.adapter.gdt;

import android.content.Context;
import com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationInitConfig;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.qq.e.ads.dfa.GDTAppDialogClickListener;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.setting.GlobalSetting;
import com.qq.e.comm.managers.status.SDKStatus;
import com.umeng.analytics.pro.q;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class GdtAdapterConfiguration extends MediationInitImpl {

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f8205b = false;

    /* renamed from: c  reason: collision with root package name */
    private MediationInitConfig f8206c;

    private boolean b(Context context, String str) {
        if (context != null && str != null) {
            try {
                if (a.g("4.561.1431")) {
                    GDTAdSdk.initWithoutStart(context, str);
                    GDTAdSdk.start(new GDTAdSdk.OnStartListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtAdapterConfiguration.1
                        @Override // com.qq.e.comm.managers.GDTAdSdk.OnStartListener
                        public void onStartFailed(Exception exc) {
                        }

                        @Override // com.qq.e.comm.managers.GDTAdSdk.OnStartListener
                        public void onStartSuccess() {
                        }
                    });
                } else {
                    GDTAdSdk.init(context, str);
                }
                setPrivacyConfig();
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.util.Map, java.util.HashMap] */
    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl
    public <T> T callFunction(int i4, ValueSet valueSet, Class<T> cls) {
        if (i4 == 8101) {
            return BuildConfig.ADAPTER_VERSION;
        }
        if (i4 == 8103) {
            Map map = (Map) valueSet.objectValue(8006, Map.class);
            if (map != null) {
                try {
                    ?? r5 = (T) new HashMap();
                    String buyerId = GDTAdSdk.getGDTAdManger().getBuyerId(null);
                    String sDKInfo = GDTAdSdk.getGDTAdManger().getSDKInfo((String) map.get("slot_id"));
                    r5.put("buyerId", buyerId);
                    r5.put("sdkInfo", sDKInfo);
                    return r5;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return null;
        } else if (i4 == 8104) {
            try {
                return (T) SDKStatus.getIntegrationSDKVersion();
            } catch (Throwable unused) {
                return "0.0";
            }
        } else if (i4 == 8105) {
            return (T) this.f8206c.getGromoreVersion();
        } else {
            if (i4 == 8124) {
                this.f8206c.setMediationCustomControllerValueSet((ValueSet) valueSet.objectValue(8517, ValueSet.class));
                try {
                    setPrivacyConfig();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            } else if (i4 == 8126) {
                return (T) Integer.valueOf(showOpenOrInstallAppDialog());
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl
    public void realInitAdn(Context context, MediationInitConfig mediationInitConfig) {
        this.f8206c = mediationInitConfig;
        synchronized (GdtAdapterConfiguration.class) {
            if (!this.f8205b) {
                if (b(context, mediationInitConfig.getAppId())) {
                    this.f8205b = true;
                } else {
                    notifyFail("gdt init fail");
                }
            }
            notifySuccess();
        }
    }

    public void setPrivacyConfig() {
        a.d(this.f8206c);
        boolean isLimitPersonalAds = this.f8206c.isLimitPersonalAds();
        boolean isCanUseMacAddress = this.f8206c.isCanUseMacAddress();
        boolean isCanUsePhoneState = this.f8206c.isCanUsePhoneState();
        boolean isCanUseAndroidId = this.f8206c.isCanUseAndroidId();
        HashMap hashMap = new HashMap();
        hashMap.put("mac_address", Boolean.valueOf(isCanUseMacAddress));
        hashMap.put("android_id", Boolean.valueOf(isCanUseAndroidId));
        hashMap.put("device_id", Boolean.valueOf(isCanUsePhoneState));
        GlobalSetting.setAgreeReadPrivacyInfo(hashMap);
        GlobalSetting.setPersonalizedState(isLimitPersonalAds ? 1 : 0);
    }

    public int showOpenOrInstallAppDialog() {
        try {
            return GDTAdSdk.getGDTAdManger().showOpenOrInstallAppDialog(new GDTAppDialogClickListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtAdapterConfiguration.2
                @Override // com.qq.e.ads.dfa.GDTAppDialogClickListener
                public void onButtonClick(int i4) {
                    if (GdtAdapterConfiguration.this.f8206c == null || GdtAdapterConfiguration.this.f8206c.getInitCallback() == null) {
                        return;
                    }
                    MediationValueSetBuilder create = MediationValueSetBuilder.create();
                    create.add(8095, i4);
                    GdtAdapterConfiguration.this.f8206c.getInitCallback().call(q.a.D, create.build(), Void.class);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }
}

package com.bytedance.msdk.adapter.ks;

import android.content.Context;
import android.location.Location;
import com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.n;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.IMediationLocation;
import com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationInitConfig;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsCustomController;
import com.kwad.sdk.api.SdkConfig;
import java.util.List;
/* loaded from: classes2.dex */
public class KsAdapterConfiguration extends MediationInitImpl {

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f8209b = false;

    /* renamed from: c  reason: collision with root package name */
    private final KsCustomController f8210c = new KsCustomController() { // from class: com.bytedance.msdk.adapter.ks.KsAdapterConfiguration.2
        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canReadInstalledPackages() {
            return KsAdapterConfiguration.this.mInitConfig.appList();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canReadLocation() {
            return KsAdapterConfiguration.this.mInitConfig.isCanUseLocation();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canUseMacAddress() {
            return KsAdapterConfiguration.this.mInitConfig.isCanUseMacAddress();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canUseNetworkState() {
            return KsAdapterConfiguration.this.mInitConfig.isCanUseWifiState();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canUseOaid() {
            return KsAdapterConfiguration.this.mInitConfig.isCanUseOaid();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canUsePhoneState() {
            return KsAdapterConfiguration.this.mInitConfig.isCanUsePhoneState();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public boolean canUseStoragePermission() {
            return KsAdapterConfiguration.this.mInitConfig.isCanUseWriteExternal();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public String getAndroidId() {
            return KsAdapterConfiguration.this.mInitConfig.getAndroidId();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public String getImei() {
            return KsAdapterConfiguration.this.mInitConfig.getDevImei();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public String[] getImeis() {
            List<String> devImeis = KsAdapterConfiguration.this.mInitConfig.getDevImeis();
            if (devImeis != null) {
                int size = devImeis.size();
                String[] strArr = new String[size];
                for (int i4 = 0; i4 < size; i4++) {
                    strArr[i4] = devImeis.get(i4);
                }
                return strArr;
            }
            return super.getImeis();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public List<String> getInstalledPackages() {
            return KsAdapterConfiguration.this.mInitConfig.getAppList();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public Location getLocation() {
            IMediationLocation location = KsAdapterConfiguration.this.mInitConfig.getLocation();
            if (location != null) {
                Location location2 = new Location("");
                location2.setLatitude(location.getLatitude());
                location2.setLongitude(location.getLongitude());
                return location2;
            }
            return null;
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public String getMacAddress() {
            return KsAdapterConfiguration.this.mInitConfig.getMacAddress();
        }

        @Override // com.kwad.sdk.api.KsCustomController
        public String getOaid() {
            return KsAdapterConfiguration.this.mInitConfig.getDevOaid();
        }
    };

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl
    public <T> T callFunction(int i4, ValueSet valueSet, Class<T> cls) {
        if (i4 == 8101) {
            return BuildConfig.ADAPTER_VERSION;
        }
        if (i4 == 8104) {
            try {
                return (T) KsAdSDK.getSDKVersion();
            } catch (Throwable unused) {
                return "0.0";
            }
        } else if (i4 == 8105) {
            return (T) this.mInitConfig.getGromoreVersion();
        } else {
            if (i4 == 8124) {
                this.mInitConfig.setMediationCustomControllerValueSet((ValueSet) valueSet.objectValue(8517, ValueSet.class));
                setPrivacyConfig();
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl
    public void realInitAdn(final Context context, final MediationInitConfig mediationInitConfig) {
        synchronized (KsAdapterConfiguration.class) {
            if (this.f8209b) {
                notifySuccess();
            } else {
                final String appId = mediationInitConfig.getAppId();
                final String appName = mediationInitConfig.getAppName();
                if (context == null || appId == null) {
                    notifyFail("context or appId is empty");
                    return;
                }
                Thread thread = new Thread(new Runnable() { // from class: com.bytedance.msdk.adapter.ks.KsAdapterConfiguration.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            KsAdSDK.init(context, new SdkConfig.Builder().appId(appId).appName(appName).customController(KsAdapterConfiguration.this.f8210c).build());
                            if (n.k("3.3.61")) {
                                KsAdSDK.start();
                            }
                            KsAdSDK.setPersonalRecommend(!mediationInitConfig.isLimitPersonalAds());
                            KsAdSDK.setProgrammaticRecommend(mediationInitConfig.isProgrammaticRecommend());
                            KsAdapterConfiguration.this.f8209b = true;
                            KsAdapterConfiguration.this.notifySuccess();
                        } catch (Throwable th) {
                            th.printStackTrace();
                            KsAdapterConfiguration.this.notifyFail("ks init fail in other thread");
                        }
                    }
                });
                thread.setName("ks-init-thread");
                thread.start();
            }
        }
    }

    public void setPrivacyConfig() {
        try {
            if (this.f8209b) {
                KsAdSDK.setPersonalRecommend(!this.mInitConfig.isLimitPersonalAds());
                KsAdSDK.setProgrammaticRecommend(this.mInitConfig.isProgrammaticRecommend());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

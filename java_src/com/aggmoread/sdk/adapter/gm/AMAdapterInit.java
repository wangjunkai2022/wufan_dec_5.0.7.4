package com.aggmoread.sdk.adapter.gm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Location;
import com.aggmoread.sdk.adapter.helper.AdapterHelper;
import com.aggmoread.sdk.adapter.helper.LogHelper;
import com.aggmoread.sdk.client.AMAdConfig;
import com.aggmoread.sdk.client.AMCustomController;
import com.aggmoread.sdk.client.AMSdk;
import com.bytedance.sdk.openadsdk.mediation.bridge.custom.MediationCustomInitLoader;
import com.bytedance.sdk.openadsdk.mediation.custom.MediationCustomInitConfig;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class AMAdapterInit extends MediationCustomInitLoader {
    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.MediationCustomInitLoader
    public String getNetworkSdkVersion() {
        return AMSdk.getSDKVersion();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.custom.MediationCustomInitLoader
    public void initializeADN(final Context context, MediationCustomInitConfig mediationCustomInitConfig, final Map<String, Object> map) {
        LogHelper.log("initializeADN enter ");
        if (isInit()) {
            return;
        }
        new Thread(new Runnable() { // from class: com.aggmoread.sdk.adapter.gm.AMAdapterInit.1
            @Override // java.lang.Runnable
            public void run() {
                AMAdConfig.Builder builder = new AMAdConfig.Builder();
                final AMCustomController localCustomController = AdapterHelper.getLocalCustomController(map);
                builder.setCustomController(new AMCustomController() { // from class: com.aggmoread.sdk.adapter.gm.AMAdapterInit.1.1
                    @Override // com.aggmoread.sdk.client.AMCustomController
                    public boolean canReadInstalledPackages() {
                        AMCustomController aMCustomController = localCustomController;
                        if (aMCustomController != null) {
                            aMCustomController.canReadInstalledPackages();
                        }
                        return super.canReadInstalledPackages();
                    }

                    @Override // com.aggmoread.sdk.client.AMCustomController
                    public boolean canReadLocation() {
                        AMCustomController aMCustomController = localCustomController;
                        if (aMCustomController != null) {
                            return aMCustomController.canReadLocation();
                        }
                        return super.canReadLocation();
                    }

                    @Override // com.aggmoread.sdk.client.AMCustomController
                    public boolean canUseAndroidId() {
                        AMCustomController aMCustomController = localCustomController;
                        if (aMCustomController != null) {
                            aMCustomController.canUseAndroidId();
                        }
                        return super.canUseAndroidId();
                    }

                    @Override // com.aggmoread.sdk.client.AMCustomController
                    public boolean canUseMacAddress() {
                        AMCustomController aMCustomController = localCustomController;
                        if (aMCustomController != null) {
                            aMCustomController.canUseMacAddress();
                        }
                        return super.canUseMacAddress();
                    }

                    @Override // com.aggmoread.sdk.client.AMCustomController
                    public boolean canUseNetworkState() {
                        AMCustomController aMCustomController = localCustomController;
                        if (aMCustomController != null) {
                            aMCustomController.canUseNetworkState();
                        }
                        return super.canUseNetworkState();
                    }

                    @Override // com.aggmoread.sdk.client.AMCustomController
                    public boolean canUsePhoneState() {
                        AMCustomController aMCustomController = localCustomController;
                        if (aMCustomController != null) {
                            aMCustomController.canUsePhoneState();
                        }
                        return super.canUsePhoneState();
                    }

                    @Override // com.aggmoread.sdk.client.AMCustomController
                    public boolean canUseStoragePermission() {
                        AMCustomController aMCustomController = localCustomController;
                        if (aMCustomController != null) {
                            aMCustomController.canUseStoragePermission();
                        }
                        return super.canUseStoragePermission();
                    }

                    @Override // com.aggmoread.sdk.client.AMCustomController
                    public String getAndroidId() {
                        AMCustomController aMCustomController = localCustomController;
                        if (aMCustomController != null) {
                            aMCustomController.getAndroidId();
                        }
                        return super.getAndroidId();
                    }

                    @Override // com.aggmoread.sdk.client.AMCustomController
                    public String getDevOaid() {
                        AMCustomController aMCustomController = localCustomController;
                        if (aMCustomController != null) {
                            aMCustomController.getDevOaid();
                        }
                        return super.getDevOaid();
                    }

                    @Override // com.aggmoread.sdk.client.AMCustomController
                    public String getIMSI() {
                        AMCustomController aMCustomController = localCustomController;
                        if (aMCustomController != null) {
                            aMCustomController.getIMSI();
                        }
                        return super.getIMSI();
                    }

                    @Override // com.aggmoread.sdk.client.AMCustomController
                    public String getImei() {
                        AMCustomController aMCustomController = localCustomController;
                        if (aMCustomController != null) {
                            aMCustomController.getImei();
                        }
                        return super.getImei();
                    }

                    @Override // com.aggmoread.sdk.client.AMCustomController
                    public List<PackageInfo> getInstalledPackages() {
                        AMCustomController aMCustomController = localCustomController;
                        if (aMCustomController != null) {
                            aMCustomController.getInstalledPackages();
                        }
                        return super.getInstalledPackages();
                    }

                    @Override // com.aggmoread.sdk.client.AMCustomController
                    public Location getLocation() {
                        AMCustomController aMCustomController = localCustomController;
                        if (aMCustomController != null) {
                            aMCustomController.getLocation();
                        }
                        return super.getLocation();
                    }

                    @Override // com.aggmoread.sdk.client.AMCustomController
                    public String getMacAddress() {
                        AMCustomController aMCustomController = localCustomController;
                        if (aMCustomController != null) {
                            aMCustomController.getMacAddress();
                        }
                        return super.getMacAddress();
                    }

                    @Override // com.aggmoread.sdk.client.AMCustomController
                    public String getSerialNumberInner() {
                        AMCustomController aMCustomController = localCustomController;
                        if (aMCustomController != null) {
                            aMCustomController.getSerialNumberInner();
                        }
                        return super.getSerialNumberInner();
                    }
                });
                LogHelper.log("initializeADN amSdk init ");
                AMSdk.init(context, builder.build());
            }
        }).start();
    }
}

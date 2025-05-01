package com.efs.sdk.h5pagesdk;

import android.webkit.JavascriptInterface;
/* loaded from: classes2.dex */
public class UApmJSBridge {
    @JavascriptInterface
    public String getLaunchOptionsSync() {
        if (H5Manager.getH5ConfigMananger() != null) {
            String generateLaunchOptions = H5Manager.getH5ConfigMananger().generateLaunchOptions();
            boolean z4 = H5Manager.isDebug;
            return generateLaunchOptions;
        }
        boolean z5 = H5Manager.isDebug;
        return "";
    }

    @JavascriptInterface
    public void sendData(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    boolean z4 = H5Manager.isDebug;
                    if (H5Manager.getH5ConfigMananger() != null) {
                        H5Manager.getH5ConfigMananger().sendData(str);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}

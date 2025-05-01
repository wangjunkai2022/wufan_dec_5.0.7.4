package com.aggmoread.sdk.client;

import android.content.Context;
import com.aggmoread.sdk.b.a;
import com.aggmoread.sdk.client.AMAdLoader;
import com.aggmoread.sdk.t;
import com.aggmoread.sdk.z.c.a.a.c.k;
import com.aggmoread.sdk.z.c.a.a.e.c;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class AMSdk {
    private static IAdSdkManager sdkManager;

    /* loaded from: classes2.dex */
    private interface IAdSdkManager {
        void init(Context context, AMAdConfig aMAdConfig);

        void preLoad(Context context, List<AMChannelIdInfo> list);
    }

    /* loaded from: classes2.dex */
    public interface SDKBidInfoCallback {
        void onResult(String str, String str2);
    }

    public static void getSDKBidInfo(String str, Map<String, Object> map, final SDKBidInfoCallback sDKBidInfoCallback) {
        if (sDKBidInfoCallback != null) {
            k.a(str, map, new k.e() { // from class: com.aggmoread.sdk.client.AMSdk.1
                @Override // com.aggmoread.sdk.z.c.a.a.c.k.e
                public void callback(k.f fVar) {
                    String str2;
                    String str3 = null;
                    if (fVar != null) {
                        str3 = fVar.f2770a;
                        str2 = fVar.f2771b;
                    } else {
                        str2 = null;
                    }
                    SDKBidInfoCallback.this.onResult(str3, str2);
                }
            });
        }
    }

    public static String getSDKVersion() {
        return c.q();
    }

    public static void init(Context context, AMAdConfig aMAdConfig) {
        if (sdkManager != null) {
            return;
        }
        synchronized (AMSdk.class) {
            if (sdkManager != null) {
                return;
            }
            IAdSdkManager iAdSdkManager = (IAdSdkManager) a.a(new Class[]{IAdSdkManager.class, AMAdLoader.IAdLoader.class}, context);
            sdkManager = iAdSdkManager;
            iAdSdkManager.init(context, aMAdConfig);
        }
    }

    public static AMAdLoader makeAdLoader(AMAdLoadSlot aMAdLoadSlot) {
        if (sdkManager == null) {
            String str = t.SDK_TAG;
            return null;
        } else if (aMAdLoadSlot == null) {
            String str2 = t.SDK_TAG;
            return null;
        } else {
            return new AMAdLoader(aMAdLoadSlot);
        }
    }

    public static void preLoad(Context context, List<AMChannelIdInfo> list) {
        if (sdkManager == null) {
            String str = t.SDK_TAG;
        } else if (list == null || list.isEmpty()) {
        } else {
            sdkManager.preLoad(context, list);
        }
    }
}

package com.aggmoread.sdk.adapter.helper;

import android.widget.FrameLayout;
import com.aggmoread.sdk.adapter.gm.AMAdapterConst;
import com.aggmoread.sdk.client.AMAdExtras;
import com.aggmoread.sdk.client.AMAdInterface;
import com.aggmoread.sdk.client.AMConst;
import com.aggmoread.sdk.client.AMCustomController;
import com.aggmoread.sdk.client.AMVideoConfigs;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.Map;
/* loaded from: classes2.dex */
public class AdapterHelper {
    public static final int ERROR_HANDLE_CODE = -500000;
    public static final int ERROR_VIDEO_CODD = 500009;
    public static final int NO_AD_CODD = 500005;

    public static AMCustomController getLocalCustomController(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(AMAdapterConst.KEY_AM_INIT_PRIVACY_CONTROL);
            LogHelper.log("KEY_AM_INIT_PRIVACY_CONTROL " + obj);
            if (obj instanceof AMCustomController) {
                return (AMCustomController) obj;
            }
            return null;
        }
        return null;
    }

    public static FrameLayout.LayoutParams getNativeAdLogoParams(AdSlot adSlot) {
        Map<String, Object> extraObject;
        if (adSlot != null && adSlot.getMediationAdSlot() != null && (extraObject = adSlot.getMediationAdSlot().getExtraObject()) != null) {
            Object obj = extraObject.get(AMAdapterConst.KEY_AM_NATIVE_LOGO_PARAMS);
            LogHelper.log("KEY_AM_NATIVE_LOGO_PARAMS " + obj);
            if (obj instanceof FrameLayout.LayoutParams) {
                return (FrameLayout.LayoutParams) obj;
            }
        }
        return null;
    }

    public static int getPrice(AMAdExtras aMAdExtras) {
        if (aMAdExtras != null) {
            try {
                return Integer.parseInt((String) aMAdExtras.getData(AMConst.ExtrasKey.AD_PRICE));
            } catch (Exception unused) {
                return -1;
            }
        }
        return -1;
    }

    public static AMVideoConfigs getVideoOptions(AdSlot adSlot) {
        AMVideoConfigs.Builder builder = new AMVideoConfigs.Builder();
        if (adSlot != null) {
            try {
                if (adSlot.getMediationAdSlot() != null) {
                    builder.setAutoPlayMuted(adSlot.getMediationAdSlot().isMuted());
                    Map<String, Object> extraObject = adSlot.getMediationAdSlot().getExtraObject();
                    if (extraObject != null) {
                        Object obj = extraObject.get(AMAdapterConst.KEY_AM_AUTO_PLAY_MUTED);
                        LogHelper.log("KEY_AM_AUTO_PLAY_MUTED " + obj);
                        if (obj instanceof Boolean) {
                            builder.setAutoPlayMuted(((Boolean) obj).booleanValue());
                        }
                        Object obj2 = extraObject.get(AMAdapterConst.KEY_AM_DETAIL_PAGE_MUTED);
                        LogHelper.log("KEY_AM_DETAIL_PAGE_MUTED " + obj2);
                        if (obj2 instanceof Boolean) {
                            builder.setDetailPageMuted(((Boolean) obj2).booleanValue());
                        }
                        Object obj3 = extraObject.get(AMAdapterConst.KEY_AM_ENABLE_USER_CONTROL);
                        LogHelper.log("KEY_AM_ENABLE_USER_CONTROL " + obj3);
                        if (obj3 instanceof Boolean) {
                            builder.setEnableUserControl(((Boolean) obj3).booleanValue());
                        }
                        Object obj4 = extraObject.get(AMAdapterConst.KEY_AM_AUTO_PLAY_POLICY);
                        LogHelper.log("KEY_AM_AUTO_PLAY_POLICY " + obj4);
                        if (obj4 instanceof Integer) {
                            builder.setAutoPlayPolicy(((Integer) obj4).intValue());
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return builder.build();
    }

    public static boolean notifyBidResult(AMAdInterface aMAdInterface, boolean z4, double d5, int i4) {
        if (aMAdInterface != null) {
            if (z4) {
                sendBidSuccess(aMAdInterface);
                return true;
            }
            sendBidFailed(aMAdInterface, d5, i4);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
        if (r6 == 10001) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void sendBidFailed(com.aggmoread.sdk.client.AMAdInterface r3, double r4, int r6) {
        /*
            if (r3 == 0) goto L15
            r0 = 10001(0x2711, float:1.4014E-41)
            r1 = 2
            r2 = 1
            if (r6 != r2) goto La
        L8:
            r0 = 1
            goto L10
        La:
            if (r6 != r1) goto Le
            r0 = 2
            goto L10
        Le:
            if (r6 != r0) goto L8
        L10:
            int r4 = (int) r4
            r5 = 0
            r3.notifyBidFail(r0, r4, r5)     // Catch: java.lang.Exception -> L15
        L15:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.adapter.helper.AdapterHelper.sendBidFailed(com.aggmoread.sdk.client.AMAdInterface, double, int):void");
    }

    public static void sendBidSuccess(AMAdInterface aMAdInterface) {
        if (aMAdInterface == null || aMAdInterface.getAdExtras() == null) {
            return;
        }
        try {
            aMAdInterface.notifyBidSuccess(Integer.parseInt((String) aMAdInterface.getAdExtras().getData(AMConst.ExtrasKey.AD_PRICE)));
        } catch (Exception unused) {
        }
    }
}

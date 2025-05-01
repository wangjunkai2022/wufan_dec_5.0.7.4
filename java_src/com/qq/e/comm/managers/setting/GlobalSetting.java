package com.qq.e.comm.managers.setting;

import android.text.TextUtils;
import com.qq.e.comm.util.GDTLogger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class GlobalSetting {
    public static final String ADMOB_SDK_WRAPPER = "ADMOB";
    public static final String AGREE_PRIVACY_KEY = "agree_privacy";
    public static final String AGREE_READ_AAID = "allow_read_aaid";
    public static final String APPLOVIN_SDK_WRAPPER = "APPLOVIN";
    public static final String BD_SDK_WRAPPER = "BD";
    public static final String CCPA = "ccpa";
    public static final String CONV_OPTIMIZE_KEY = "conv_opt_info";
    public static final String COPPA = "coppa";
    public static final String FACEBOOK_SDK_WRAPPER = "FACEBOOK";
    public static final String GDPR = "gdpr";
    public static final String KS_SDK_WRAPPER = "KS";
    public static final String OVERSEA_PRIVACY_INFO = "oversea_privacy_info";
    public static final String PAG_SDK_WRAPPER = "PAG";
    public static final String TT_SDK_WRAPPER = "TT";

    /* renamed from: a  reason: collision with root package name */
    private static volatile Integer f59876a = null;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f59877b = false;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f59878c = true;

    /* renamed from: d  reason: collision with root package name */
    private static volatile Integer f59879d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile Boolean f59880e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile Boolean f59881f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile Boolean f59882g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile Map<String, String> f59883h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private static volatile Map<String, String> f59884i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private static final Map<String, String> f59885j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private static final JSONObject f59886k = new JSONObject();

    /* renamed from: l  reason: collision with root package name */
    private static volatile String f59887l = null;

    /* renamed from: m  reason: collision with root package name */
    private static volatile String f59888m = null;

    /* renamed from: n  reason: collision with root package name */
    private static volatile String f59889n = null;

    /* renamed from: o  reason: collision with root package name */
    private static volatile String f59890o = null;

    /* renamed from: p  reason: collision with root package name */
    private static volatile String f59891p = null;

    public static Boolean getAgreeReadAndroidId() {
        return f59882g;
    }

    public static Boolean getAgreeReadDeviceId() {
        return f59881f;
    }

    public static Integer getChannel() {
        return f59876a;
    }

    public static String getCustomADActivityClassName() {
        return f59887l;
    }

    public static String getCustomLandscapeActivityClassName() {
        return f59890o;
    }

    public static String getCustomPortraitActivityClassName() {
        return f59888m;
    }

    public static String getCustomRewardvideoLandscapeActivityClassName() {
        return f59891p;
    }

    public static String getCustomRewardvideoPortraitActivityClassName() {
        return f59889n;
    }

    public static Map<String, String> getExtraUserData() {
        return Collections.unmodifiableMap(f59883h);
    }

    public static Integer getPersonalizedState() {
        return f59879d;
    }

    public static Map<String, String> getPreloadAdapterMaps() {
        return f59885j;
    }

    public static JSONObject getSettings() {
        return f59886k;
    }

    public static boolean isAgreePrivacyStrategy() {
        return f59880e == null || f59880e.booleanValue();
    }

    public static boolean isAgreeReadAndroidId() {
        if (f59882g == null) {
            return true;
        }
        return f59882g.booleanValue();
    }

    public static boolean isAgreeReadDeviceId() {
        if (f59881f == null) {
            return true;
        }
        return f59881f.booleanValue();
    }

    public static boolean isEnableMediationTool() {
        return f59877b;
    }

    public static boolean isEnableVideoDownloadingCache() {
        return f59878c;
    }

    public static void setAgreePrivacyStrategy(boolean z4) {
        if (f59880e == null) {
            f59880e = Boolean.valueOf(z4);
        }
    }

    @Deprecated
    public static void setAgreeReadAndroidId(boolean z4) {
        f59882g = Boolean.valueOf(z4);
    }

    @Deprecated
    public static void setAgreeReadDeviceId(boolean z4) {
        f59881f = Boolean.valueOf(z4);
    }

    public static void setAgreeReadPrivacyInfo(Map<String, Boolean> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        try {
            f59886k.putOpt(AGREE_PRIVACY_KEY, new JSONObject(map));
        } catch (Exception e5) {
            GDTLogger.e("setAgreeReadPrivacyInfo错误：" + e5.toString());
        }
    }

    public static void setChannel(int i4) {
        if (f59876a == null) {
            f59876a = Integer.valueOf(i4);
        }
    }

    public static void setConvOptimizeInfo(Map<String, Boolean> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        try {
            f59886k.putOpt(CONV_OPTIMIZE_KEY, new JSONObject(map));
        } catch (Exception e5) {
            GDTLogger.e("setConvOptimizeInfo错误：" + e5.toString());
        }
    }

    public static void setCustomADActivityClassName(String str) {
        f59887l = str;
    }

    public static void setCustomLandscapeActivityClassName(String str) {
        f59890o = str;
    }

    public static void setCustomPortraitActivityClassName(String str) {
        f59888m = str;
    }

    public static void setCustomRewardvideoLandscapeActivityClassName(String str) {
        f59891p = str;
    }

    public static void setCustomRewardvideoPortraitActivityClassName(String str) {
        f59889n = str;
    }

    public static void setEnableCollectAppInstallStatus(boolean z4) {
        try {
            f59886k.putOpt("ecais", Boolean.valueOf(z4));
        } catch (JSONException unused) {
        }
    }

    public static void setEnableMediationTool(boolean z4) {
        f59877b = z4;
    }

    public static void setEnableVideoDownloadingCache(boolean z4) {
        f59878c = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setExtraUserData(java.util.Map<java.lang.String, java.lang.String> r3) {
        /*
            if (r3 != 0) goto L3
            return
        L3:
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L2f
            java.lang.Object r1 = r1.getValue()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Lb
        L2f:
            java.lang.String r3 = "参数key和value不能为空！"
            com.qq.e.comm.util.GDTLogger.e(r3)
            return
        L35:
            com.qq.e.comm.managers.setting.GlobalSetting.f59883h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qq.e.comm.managers.setting.GlobalSetting.setExtraUserData(java.util.Map):void");
    }

    public static void setMediaExtData(Map<String, String> map, boolean z4) {
        if (map == null) {
            return;
        }
        if (z4) {
            f59884i = new HashMap();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                f59884i.put(entry.getKey(), entry.getValue());
            }
        }
        try {
            f59886k.putOpt("media_ext", new JSONObject(f59884i));
        } catch (JSONException unused) {
            GDTLogger.e("setMediaExtData失败，请检查");
        }
    }

    public static void setPersonalizedState(int i4) {
        f59879d = Integer.valueOf(i4);
    }

    public static void setPreloadAdapters(Map<String, String> map) {
        if (map == null) {
            return;
        }
        f59885j.putAll(map);
    }
}

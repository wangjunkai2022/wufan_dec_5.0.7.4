package com.cmic.sso.sdk.a;

import android.text.TextUtils;
import com.cmic.sso.sdk.e.k;
/* compiled from: UmcConfigUtil.java */
/* loaded from: classes2.dex */
class d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return System.currentTimeMillis() >= k.a("sso_config_xf", "client_valid", 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(boolean z4) {
        return "1".equals(k.a("sso_config_xf", "CLOSE_IPV6_LIST", !z4 ? "0" : "1"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(boolean z4) {
        String str = !z4 ? "0" : "1";
        return "1".equals(k.a("sso_config_xf", "CLOSE_M008_APPID_LIST", str)) || "1".equals(k.a("sso_config_xf", "CLOSE_M008_SDKVERSION_LIST", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(boolean z4) {
        return k.a("sso_config_xf", "CLOSE_FRIEND_WAPKS", z4 ? "CU" : "").contains("CU");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(boolean z4) {
        return k.a("sso_config_xf", "CLOSE_FRIEND_WAPKS", z4 ? "CT" : "").contains("CT");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(boolean z4) {
        return "1".equals(k.a("sso_config_xf", "CLOSE_LOGS_VERSION", z4 ? "1" : "0"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(boolean z4) {
        return "1".equals(k.a("sso_config_xf", "CLOSE_IPV4_LIST", !z4 ? "0" : "1"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) {
        String a5 = k.a("sso_config_xf", "https_get_phone_scrip_host", (String) null);
        return TextUtils.isEmpty(a5) ? str : a5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        String a5 = k.a("sso_config_xf", "config_host", (String) null);
        return TextUtils.isEmpty(a5) ? str : a5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str) {
        String a5 = k.a("sso_config_xf", "logHost", "");
        return TextUtils.isEmpty(a5) ? str : a5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i4) {
        return k.a("sso_config_xf", "pauseTime", i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i4) {
        return k.a("sso_config_xf", "maxFailedLogTimes", i4);
    }
}

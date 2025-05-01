package com.umeng.analytics.pro;

import android.os.Build;
import android.text.TextUtils;
import com.ss.android.download.api.constant.BaseConstants;
/* compiled from: RomUtils.java */
/* loaded from: classes6.dex */
public class as {

    /* renamed from: a  reason: collision with root package name */
    private static String f63347a = "";

    /* renamed from: b  reason: collision with root package name */
    private static String f63348b = "";

    /* renamed from: c  reason: collision with root package name */
    private static final String f63349c = "hw_sc.build.platform.version";

    /* renamed from: d  reason: collision with root package name */
    private static final String f63350d = "ro.build.version.emui";

    /* renamed from: e  reason: collision with root package name */
    private static final String f63351e = "ro.build.version.magic";

    /* renamed from: f  reason: collision with root package name */
    private static final String f63352f = "ro.miui.ui.version.name";

    /* renamed from: g  reason: collision with root package name */
    private static final String f63353g = "ro.build.version.opporom";

    /* renamed from: h  reason: collision with root package name */
    private static final String f63354h = "ro.vivo.os.name";

    /* renamed from: i  reason: collision with root package name */
    private static final String f63355i = "ro.vivo.os.version";

    /* renamed from: j  reason: collision with root package name */
    private static final String f63356j = "ro.build.version.oplusrom";

    /* renamed from: k  reason: collision with root package name */
    private static final String f63357k = "ro.rom.version";

    private static boolean a() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return !TextUtils.isEmpty((String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(f63347a)) {
            e(str);
        }
        return f63348b;
    }

    public static String c(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replaceAll(" ", "").toUpperCase();
    }

    private static String d(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void e(String str) {
        try {
            String c5 = c(str);
            char c6 = 65535;
            switch (c5.hashCode()) {
                case -1881642058:
                    if (c5.equals("REALME")) {
                        c6 = 4;
                        break;
                    }
                    break;
                case -1706170181:
                    if (c5.equals("XIAOMI")) {
                        c6 = 2;
                        break;
                    }
                    break;
                case -602397472:
                    if (c5.equals("ONEPLUS")) {
                        c6 = 7;
                        break;
                    }
                    break;
                case 2432928:
                    if (c5.equals(BaseConstants.ROM_OPPO_UPPER_CONSTANT)) {
                        c6 = 5;
                        break;
                    }
                    break;
                case 2634924:
                    if (c5.equals("VIVO")) {
                        c6 = 6;
                        break;
                    }
                    break;
                case 68924490:
                    if (c5.equals("HONOR")) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 77852109:
                    if (c5.equals("REDMI")) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 2141820391:
                    if (c5.equals("HUAWEI")) {
                        c6 = 0;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    if (a()) {
                        f63348b = d(f63349c);
                        f63347a = "HarmonyOS";
                        return;
                    }
                    f63347a = "EMUI";
                    f63348b = d(f63350d);
                    return;
                case 1:
                    if (!TextUtils.isEmpty(d(f63351e))) {
                        f63347a = "MagicUI";
                        f63348b = d(f63351e);
                        return;
                    }
                    f63347a = "EMUI";
                    f63348b = d(f63350d);
                    return;
                case 2:
                case 3:
                    f63347a = "MIUI";
                    f63348b = d(f63352f);
                    return;
                case 4:
                case 5:
                    f63347a = "ColorOS";
                    f63348b = d(f63353g);
                    return;
                case 6:
                    f63347a = "Funtouch";
                    f63348b = d(f63355i);
                    return;
                case 7:
                    f63347a = "HydrogenOS";
                    String d5 = d(f63357k);
                    if (TextUtils.isEmpty(d5)) {
                        f63347a = "ColorOS";
                        d5 = d(f63356j);
                    }
                    f63348b = d5;
                    return;
                default:
                    f63347a = "Android";
                    f63348b = Build.VERSION.RELEASE;
                    return;
            }
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(f63347a)) {
            e(str);
        }
        return f63347a;
    }
}

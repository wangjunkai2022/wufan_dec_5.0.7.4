package com.ss.android.socialbase.appdownloader.u;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.appdownloader.n;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* loaded from: classes5.dex */
public class o {

    /* renamed from: i  reason: collision with root package name */
    private static String f60890i = "";

    /* renamed from: m  reason: collision with root package name */
    public static String f60891m = "";

    /* renamed from: n  reason: collision with root package name */
    private static String f60892n;

    /* renamed from: o  reason: collision with root package name */
    private static String f60893o;

    /* renamed from: p  reason: collision with root package name */
    public static String f60894p;
    private static Boolean qv;

    /* renamed from: u  reason: collision with root package name */
    private static String f60895u;
    public static String vv;

    @NonNull
    public static String b() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str.trim();
    }

    public static boolean d() {
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("honor")) {
            String str2 = Build.MANUFACTURER;
            return !TextUtils.isEmpty(str2) && str2.toLowerCase().startsWith("honor");
        }
        return true;
    }

    private static void g() {
        if (TextUtils.isEmpty(vv)) {
            com.ss.android.socialbase.downloader.downloader.p.zn();
            vv = com.ss.android.socialbase.downloader.constants.o.f60946m;
            f60890i = "ro.build.version." + com.ss.android.socialbase.downloader.constants.o.f60949p + "rom";
            f60891m = "com." + com.ss.android.socialbase.downloader.constants.o.f60949p + ".market";
        }
    }

    public static boolean i() {
        return vv("VIVO");
    }

    public static boolean j() {
        if (qv == null) {
            qv = Boolean.valueOf(i.n().equals("harmony"));
        }
        return qv.booleanValue();
    }

    @NonNull
    public static String jh() {
        String str = Build.DISPLAY;
        return str == null ? "" : str.trim();
    }

    public static String k() {
        if (f60894p == null) {
            vv("");
        }
        return f60894p;
    }

    private static void la() {
        if (f60892n == null) {
            try {
                f60892n = i("ro.miui.ui.version.name");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            String str = f60892n;
            if (str == null) {
                str = "";
            }
            f60892n = str;
        }
    }

    public static boolean m() {
        return vv("MAGICUI");
    }

    public static boolean n() {
        return vv("SAMSUNG");
    }

    public static boolean o() {
        g();
        return vv(vv);
    }

    public static boolean p() {
        return vv("MIUI");
    }

    public static boolean q() {
        la();
        return "V12".equals(f60892n);
    }

    public static String qv() {
        if (f60893o == null) {
            vv("");
        }
        return f60893o;
    }

    public static boolean r() {
        la();
        return "V10".equals(f60892n);
    }

    public static boolean t() {
        la();
        return "V11".equals(f60892n);
    }

    public static boolean u() {
        return vv("FLYME");
    }

    public static boolean vv() {
        return vv("EMUI") || vv("MAGICUI");
    }

    public static String wv() {
        if (f60895u == null) {
            vv("");
        }
        return f60895u;
    }

    public static String i(String str) {
        if (com.ss.android.socialbase.downloader.n.vv.m().optBoolean("enable_reflect_system_properties", true)) {
            try {
                return p(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return m(str);
    }

    public static String m(String str) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str))).getInputStream()), 1024);
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            com.ss.android.socialbase.downloader.wv.u.vv(bufferedReader);
            return readLine;
        } catch (Throwable unused2) {
            com.ss.android.socialbase.downloader.wv.u.vv(bufferedReader);
            return null;
        }
    }

    public static String p(String str) throws Throwable {
        return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
    }

    public static boolean vv(String str) {
        g();
        String str2 = f60893o;
        if (str2 != null) {
            return str2.equals(str);
        }
        String i4 = i("ro.miui.ui.version.name");
        f60895u = i4;
        if (!TextUtils.isEmpty(i4)) {
            f60893o = "MIUI";
            f60894p = "com.xiaomi.market";
            f60892n = f60895u;
        } else {
            String i5 = i("ro.build.version.emui");
            f60895u = i5;
            if (!TextUtils.isEmpty(i5)) {
                String str3 = d() ? "MAGICUI" : "EMUI";
                f60893o = str3;
                if (TextUtils.equals(str3, "MAGICUI")) {
                    f60894p = "com.hihonor.appmarket";
                } else {
                    f60894p = "com.huawei.appmarket";
                }
            } else {
                String i6 = i(f60890i);
                f60895u = i6;
                if (!TextUtils.isEmpty(i6)) {
                    f60893o = vv;
                    if (n.vv(f60891m) >= 0) {
                        f60894p = f60891m;
                    } else {
                        f60894p = "com.heytap.market";
                    }
                } else {
                    String i7 = i("ro.vivo.os.version");
                    f60895u = i7;
                    if (!TextUtils.isEmpty(i7)) {
                        f60893o = "VIVO";
                        f60894p = "com.bbk.appstore";
                    } else {
                        String i8 = i("ro.smartisan.version");
                        f60895u = i8;
                        if (!TextUtils.isEmpty(i8)) {
                            f60893o = "SMARTISAN";
                            f60894p = "com.smartisanos.appstore";
                        } else {
                            String i9 = i("ro.gn.sv.version");
                            f60895u = i9;
                            if (!TextUtils.isEmpty(i9)) {
                                f60893o = "QIONEE";
                                f60894p = "com.gionee.aora.market";
                            } else {
                                String i10 = i("ro.lenovo.lvp.version");
                                f60895u = i10;
                                if (!TextUtils.isEmpty(i10)) {
                                    f60893o = "LENOVO";
                                    f60894p = "com.lenovo.leos.appstore";
                                } else if (b().toUpperCase().contains("SAMSUNG")) {
                                    f60893o = "SAMSUNG";
                                    f60894p = "com.sec.android.app.samsungapps";
                                } else if (b().toUpperCase().contains("ZTE")) {
                                    f60893o = "ZTE";
                                    f60894p = "zte.com.market";
                                } else if (b().toUpperCase().contains("NUBIA")) {
                                    f60893o = "NUBIA";
                                    f60894p = "cn.nubia.neostore";
                                } else if (jh().toUpperCase().contains("FLYME")) {
                                    f60893o = "FLYME";
                                    f60894p = "com.meizu.mstore";
                                    f60895u = jh();
                                } else if (b().toUpperCase().contains("ONEPLUS")) {
                                    f60893o = "ONEPLUS";
                                    f60895u = i("ro.rom.version");
                                    if (n.vv(f60891m) >= 0) {
                                        f60894p = f60891m;
                                    } else {
                                        f60894p = "com.heytap.market";
                                    }
                                } else {
                                    f60893o = b().toUpperCase();
                                    f60894p = "";
                                    f60895u = "";
                                }
                            }
                        }
                    }
                }
            }
        }
        return f60893o.equals(str);
    }
}

package com.kuaishou.weapon.p0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class aj {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f55243b = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"};

    /* renamed from: a  reason: collision with root package name */
    private Context f55244a;

    public aj(Context context) {
        this.f55244a = context;
    }

    public static boolean b() {
        String a5;
        try {
            a5 = bh.a("ro.build.display.id");
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(a5)) {
            return false;
        }
        if (a5.contains("flyme")) {
            return true;
        }
        return a5.toLowerCase().contains("flyme");
    }

    public int a() {
        boolean z4;
        try {
            String[] a5 = a(bi.f55333z);
            int length = a5.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    z4 = false;
                    break;
                } else if (new File(a5[i4], "su").exists()) {
                    z4 = true;
                    break;
                } else {
                    i4++;
                }
            }
        } catch (Exception unused) {
        }
        return z4 ? 1 : 0;
    }

    public String c() {
        try {
            if (Build.VERSION.SDK_INT > 29) {
                return null;
            }
            return aa.a().b("su -v").replace("\n", "");
        } catch (Exception unused) {
            return null;
        }
    }

    public int d() {
        String a5 = aa.a().a("ro.secure");
        return (a5 == null || !"0".equals(a5)) ? 1 : 0;
    }

    public int e() {
        String a5 = aa.a().a("ro.debuggable");
        return (a5 == null || !"0".equals(a5)) ? 1 : 0;
    }

    public int f() {
        String a5 = aa.a().a("ro.adb.secure");
        return (a5 == null || !"0".equals(a5)) ? 1 : 0;
    }

    public JSONObject g() {
        try {
            JSONObject jSONObject = new JSONObject();
            String a5 = a(" which su ");
            if (!TextUtils.isEmpty(a5) && a5.length() > 2) {
                jSONObject.put("0", 1);
                jSONObject.put("0-p", a5);
            } else {
                jSONObject.put("0", 0);
            }
            String a6 = a(" id ");
            if (!TextUtils.isEmpty(a6)) {
                if (a6.toLowerCase().contains("uid=0")) {
                    jSONObject.put("1", 1);
                } else {
                    jSONObject.put("1", 0);
                }
            }
            String a7 = a(" busybox df ");
            if (!TextUtils.isEmpty(a7) && !a7.contains("not found")) {
                if (a7.length() > 30) {
                    jSONObject.put("2", 1);
                } else {
                    jSONObject.put("2", 0);
                }
            }
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public int h() {
        return new File("/system/app/Superuser.apk").exists() ? 1 : 0;
    }

    public String i() {
        String[] strArr;
        for (String str : f55243b) {
            if (new File(str, "magisk").exists()) {
                return str + "magisk";
            }
        }
        return "";
    }

    public String j() {
        String[] strArr;
        for (String str : f55243b) {
            if (new File(str, "su").exists()) {
                return str + "su";
            }
        }
        return "";
    }

    public String k() {
        StackTraceElement[] stackTrace;
        try {
            throw new Exception("");
        } catch (Exception e5) {
            for (StackTraceElement stackTraceElement : e5.getStackTrace()) {
                if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit") || stackTraceElement.getMethodName().equals("invoked") || stackTraceElement.getMethodName().equals("main") || stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                    return stackTraceElement.getClassName();
                }
            }
            return "";
        }
    }

    private String[] a(String[] strArr) {
        String str;
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        try {
            str = System.getenv("PATH");
        } catch (Exception unused) {
        }
        if (str != null && !"".equals(str)) {
            String[] split = str.split(":");
            int length = split.length;
            for (int i4 = 0; i4 < length; i4++) {
                String str2 = split[i4];
                if (!str2.endsWith(net.lingala.zip4j.util.e.F0)) {
                    str2 = str2 + '/';
                }
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public String a(String str) {
        try {
            return aa.a().b(str).replace("\n", "");
        } catch (Exception unused) {
            return "";
        }
    }
}

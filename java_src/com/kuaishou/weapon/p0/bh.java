package com.kuaishou.weapon.p0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.google.android.material.timepicker.TimeModel;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.join.mgps.activity.BuildQRCodeActivity_;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class bh {

    /* renamed from: a  reason: collision with root package name */
    private static String f55304a;

    /* renamed from: b  reason: collision with root package name */
    private static String f55305b;

    public static String a() {
        return null;
    }

    public static String a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b(Context context) {
        try {
            return c(com.kwad.sdk.e.b.Jd().IR());
        } catch (Throwable unused) {
            return bi.f55311d;
        }
    }

    public static String c(Context context) {
        try {
            return c(com.kwad.sdk.e.b.Jd().IR());
        } catch (Throwable unused) {
            return bi.f55311d;
        }
    }

    public static String d(Context context) {
        try {
            return c(com.kwad.sdk.e.b.Jd().IW());
        } catch (Throwable unused) {
            return bi.f55311d;
        }
    }

    public static String e(Context context) {
        try {
            return c(com.kwad.sdk.e.b.Jd().getIccId());
        } catch (Throwable unused) {
            return bi.f55311d;
        }
    }

    public static String f(Context context) {
        try {
            return c(com.kwad.sdk.e.b.Jd().IS());
        } catch (Throwable unused) {
            return bi.f55311d;
        }
    }

    public static boolean g(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean h(Context context) {
        boolean z4 = false;
        try {
            if (Build.VERSION.SDK_INT <= 16 ? Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0 : Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0) {
                z4 = true;
            }
        } catch (Throwable unused) {
        }
        return z4;
    }

    public static String i(Context context) {
        try {
            List<InputMethodInfo> inputMethodList = ((InputMethodManager) context.getSystemService("input_method")).getInputMethodList();
            StringBuilder sb = new StringBuilder();
            for (InputMethodInfo inputMethodInfo : inputMethodList) {
                sb.append(inputMethodInfo.getId());
                sb.append(";");
            }
            if (TextUtils.isEmpty(sb)) {
                return bi.f55310c;
            }
            String sb2 = sb.toString();
            return sb2.endsWith(";") ? sb2.substring(0, sb2.length() - 1) : sb2;
        } catch (Exception unused) {
            return bi.f55311d;
        }
    }

    public static String j(Context context) {
        List<InputMethodInfo> enabledInputMethodList;
        ActivityInfo activityInfo;
        int i4 = -1;
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                String string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
                if (string == null) {
                    string = "null";
                }
                String str = "1=" + string + ";";
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                if (inputMethodManager != null && (enabledInputMethodList = inputMethodManager.getEnabledInputMethodList()) != null) {
                    str = str + "2=";
                    for (InputMethodInfo inputMethodInfo : enabledInputMethodList) {
                        String packageName = inputMethodInfo.getPackageName();
                        if (packageName == null) {
                            packageName = "null";
                        }
                        String settingsActivity = inputMethodInfo.getSettingsActivity();
                        if (settingsActivity == null) {
                            settingsActivity = "null";
                        }
                        if (packageManager != null) {
                            try {
                                if (!packageName.equals("null") && !settingsActivity.equals("null") && (activityInfo = packageManager.getActivityInfo(new ComponentName(packageName, settingsActivity), 0)) != null) {
                                    i4 = activityInfo.launchMode;
                                }
                            } catch (Exception unused) {
                            }
                        }
                        str = str + packageName + "-" + settingsActivity + "-" + String.format(TimeModel.NUMBER_FORMAT, Integer.valueOf(i4)) + ";";
                    }
                }
                return str;
            } catch (Throwable unused2) {
                return "";
            }
        }
        return "";
    }

    public static String k(Context context) {
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "accessibility_enabled", 0) != 1) {
                return bi.f55312e;
            }
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_accessibility_services");
            return TextUtils.isEmpty(string) ? bi.f55310c : string;
        } catch (Throwable unused) {
            return bi.f55311d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String l(android.content.Context r5) {
        /*
            java.lang.String r0 = "accessibility"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r5 = (android.view.accessibility.AccessibilityManager) r5
            r0 = 0
            if (r5 != 0) goto Lc
            return r0
        Lc:
            java.util.List r5 = r5.getInstalledAccessibilityServiceList()     // Catch: java.lang.Exception -> L43
            if (r5 == 0) goto L43
            int r1 = r5.size()     // Catch: java.lang.Exception -> L43
            if (r1 <= 0) goto L43
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L43
            r1.<init>()     // Catch: java.lang.Exception -> L43
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L41
        L21:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L44
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Exception -> L41
            android.accessibilityservice.AccessibilityServiceInfo r2 = (android.accessibilityservice.AccessibilityServiceInfo) r2     // Catch: java.lang.Exception -> L41
            java.lang.String r2 = a(r2)     // Catch: java.lang.Exception -> L41
            int r3 = r1.indexOf(r2)     // Catch: java.lang.Exception -> L41
            r4 = -1
            if (r3 != r4) goto L21
            r1.append(r2)     // Catch: java.lang.Exception -> L41
            java.lang.String r2 = "|"
            r1.append(r2)     // Catch: java.lang.Exception -> L41
            goto L21
        L41:
            goto L44
        L43:
            r1 = r0
        L44:
            if (r1 != 0) goto L47
            return r0
        L47:
            int r5 = r1.length()
            if (r5 <= 0) goto L56
            int r5 = r1.length()
            int r5 = r5 + (-1)
            r1.deleteCharAt(r5)
        L56:
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.bh.l(android.content.Context):java.lang.String");
    }

    private static String m() {
        return "ANDROID_PHONE";
    }

    public static String m(Context context) {
        StringBuilder sb;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        StringBuilder sb2 = null;
        if (accessibilityManager == null) {
            return null;
        }
        try {
            if (!accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1)) == null || enabledAccessibilityServiceList.size() <= 0) {
                sb = null;
            } else {
                sb = new StringBuilder();
                try {
                    for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                        String a5 = a(accessibilityServiceInfo);
                        if (sb.indexOf(a5) == -1) {
                            sb.append(a5);
                            sb.append("|");
                        }
                    }
                } catch (Exception unused) {
                    sb2 = sb;
                    sb = sb2;
                    return sb.toString();
                }
            }
        } catch (Exception unused2) {
        }
        if (sb == null) {
            return null;
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '|') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String n(Context context) {
        return bi.f55311d;
    }

    public static String o(Context context) {
        return bi.f55310c;
    }

    public static String p(Context context) {
        return bi.f55308a;
    }

    public static String q(Context context) {
        try {
            if (TextUtils.isEmpty(f55304a)) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                f55305b = (String) packageInfo.applicationInfo.loadLabel(context.getPackageManager());
                f55304a = packageInfo.versionName;
            }
        } catch (Throwable unused) {
        }
        return f55304a;
    }

    public static String r(Context context) {
        return f55305b;
    }

    public static String s(Context context) {
        try {
            return context.getPackageName();
        } catch (Throwable unused) {
            return "";
        }
    }

    @TargetApi(23)
    public static int t(Context context) {
        try {
            String c5 = c(com.kwad.sdk.e.b.Jd().IX());
            if (!TextUtils.isEmpty(c5) && !c5.startsWith("RISK")) {
                return Integer.parseInt(c5);
            }
            return -1;
        } catch (Throwable unused) {
            return -2;
        }
    }

    @TargetApi(22)
    public static int u(Context context) {
        try {
            String c5 = c(com.kwad.sdk.e.b.Jd().IY());
            if (!TextUtils.isEmpty(c5) && !c5.startsWith("RISK")) {
                return Integer.parseInt(c5);
            }
            return -1;
        } catch (Throwable unused) {
            return -2;
        }
    }

    public static String v(Context context) {
        return bi.f55310c;
    }

    public static String w(Context context) {
        try {
            return c(com.kwad.sdk.e.b.Jd().getOaid());
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String x(Context context) {
        StringBuilder sb = new StringBuilder();
        try {
            PackageManager packageManager = context.getPackageManager();
            String[] strArr = {"android.hardware.camera", "android.hardware.camera.autofocus", "android.hardware.camera.flash", "android.hardware.location", "android.hardware.location.gps", "android.hardware.location.network", "android.hardware.microphone", "android.hardware.sensor.compass", "android.hardware.sensor.accelerometer", "android.hardware.sensor.light", "android.hardware.sensor.proximity", "android.hardware.telephony", "android.hardware.telephony.cdma", "android.hardware.telephony.gsm", "android.hardware.touchscreen", "android.hardware.touchscreen.multitouch", "android.hardware.touchscreen.multitouch.distinct", "android.hardware.camera.front", "android.hardware.wifi", "android.hardware.bluetooth", "android.hardware.nfc", "android.hardware.fingerprint", "android.hardware.biometrics.face", "android.hardware.screen.portrait", "android.hardware.screen.landscape", "android.hardware.faketouch", "android.hardware.audio.output"};
            for (int i4 = 0; i4 < 27; i4++) {
                if (packageManager.hasSystemFeature(strArr[i4])) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    public static String y(Context context) {
        Iterator<String> keys;
        try {
            StringBuilder sb = new StringBuilder();
            JSONObject z4 = z(context);
            if (z4 != null && (keys = z4.keys()) != null) {
                String str = "";
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = z4.getString(next);
                    sb.append(str);
                    str = ";";
                    sb.append(next);
                    sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                    sb.append(string);
                }
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private static JSONObject z(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = WeaponHI.sUserId;
            String m4 = m();
            String str2 = WeaponHI.sChannel;
            String l4 = l();
            String k4 = k();
            String str3 = "";
            jSONObject.put("userId", TextUtils.isEmpty(str) ? "" : URLEncoder.encode(str, "UTF-8"));
            jSONObject.put("platform", TextUtils.isEmpty(m4) ? "" : URLEncoder.encode(m4, "UTF-8"));
            jSONObject.put("channel", TextUtils.isEmpty(str2) ? "" : URLEncoder.encode(str2, "UTF-8"));
            try {
                if (h.a(context, "re_po_rt").e("a1_p_s_p_s")) {
                    jSONObject.put("mod", TextUtils.isEmpty(l4) ? "" : URLEncoder.encode(l4, "UTF-8"));
                    if (!TextUtils.isEmpty(k4)) {
                        str3 = URLEncoder.encode(k4, "UTF-8");
                    }
                    jSONObject.put("sysver", str3);
                } else {
                    jSONObject.put("mod", "");
                    jSONObject.put("sysver", "");
                }
            } catch (Exception unused) {
            }
            return jSONObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static String b(Context context, int i4) {
        try {
            if (i4 == 1) {
                return c(com.kwad.sdk.e.b.Jd().IU());
            }
            return c(com.kwad.sdk.e.b.Jd().IR());
        } catch (Throwable unused) {
            return bi.f55311d;
        }
    }

    public static double c() {
        try {
            String c5 = c(com.kwad.sdk.e.b.Jd().getLocation());
            if (!TextUtils.isEmpty(c5) && !c5.startsWith("RISK")) {
                return new JSONObject(c5).getDouble("longitude");
            }
            return -1.0d;
        } catch (Throwable unused) {
            return -1.0d;
        }
    }

    public static String d() {
        try {
            String c5 = c(com.kwad.sdk.e.b.Jd().IZ());
            if (!TextUtils.isEmpty(c5) && !c5.startsWith("RISK")) {
                JSONObject jSONObject = new JSONObject(c5);
                return jSONObject.getString("cellId") + ", " + jSONObject.getString("lac");
            }
            return c5;
        } catch (Throwable unused) {
            return bi.f55311d;
        }
    }

    public static String e() {
        try {
            String c5 = c(com.kwad.sdk.e.b.Jd().Jb());
            if (!TextUtils.isEmpty(c5)) {
                c5.startsWith("RISK");
            }
            return c5;
        } catch (Throwable unused) {
            return bi.f55311d;
        }
    }

    public static JSONArray f() {
        try {
            String c5 = c(com.kwad.sdk.e.b.Jd().Ja());
            if (!TextUtils.isEmpty(c5) && !c5.startsWith("RISK")) {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray(c5);
                for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("1", jSONArray2.getJSONObject(i4).getString(BuildQRCodeActivity_.E));
                    jSONObject.put("2", jSONArray2.getJSONObject(i4).getString("bssid"));
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String g() {
        try {
            return c(com.kwad.sdk.e.b.Jd().getIp());
        } catch (Throwable unused) {
            return bi.f55310c;
        }
    }

    public static String a(Context context) {
        try {
            return c(com.kwad.sdk.e.b.Jd().IR());
        } catch (Throwable unused) {
            return bi.f55311d;
        }
    }

    public static Method b(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            if (method != null) {
                return method;
            }
        } catch (Throwable unused) {
        }
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException unused2) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException();
    }

    public static String h() {
        try {
            return c(com.kwad.sdk.e.b.Jd().IT());
        } catch (Throwable unused) {
            return bi.f55310c;
        }
    }

    public static String k() {
        return "ANDROID_" + Build.VERSION.RELEASE;
    }

    public static String a(Context context, int i4) {
        try {
            if (i4 == 1) {
                return c(com.kwad.sdk.e.b.Jd().IU());
            }
            return c(com.kwad.sdk.e.b.Jd().IR());
        } catch (Throwable unused) {
            return bi.f55311d;
        }
    }

    public static String c(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            int i4 = jSONObject.getInt(MediationConstant.KEY_ERROR_CODE);
            if (i4 != 0) {
                return i4 == 3 ? bi.f55310c : i4 == 1 ? bi.f55308a : bi.f55311d;
            }
            str2 = jSONObject.getString("value");
            return str2;
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            Method b5 = b(cls, str, clsArr);
            try {
                b5.setAccessible(true);
                return b5;
            } catch (Throwable unused) {
                return b5;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static String a(AccessibilityServiceInfo accessibilityServiceInfo) {
        String id = accessibilityServiceInfo.getId();
        int lastIndexOf = id.lastIndexOf(net.lingala.zip4j.util.e.F0);
        return lastIndexOf > 0 ? id.substring(0, lastIndexOf) : id;
    }

    public static double b() {
        try {
            String c5 = c(com.kwad.sdk.e.b.Jd().getLocation());
            if (!TextUtils.isEmpty(c5) && !c5.startsWith("RISK")) {
                return new JSONObject(c5).getDouble("latitude");
            }
            return -1.0d;
        } catch (Throwable unused) {
            return -1.0d;
        }
    }

    public static String i() {
        try {
            Locale locale = Locale.getDefault();
            return locale.getLanguage() + "-" + locale.getCountry();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void a(final Context context, String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || h.a(context, "re_po_rt").c(df.br, 1) == 0) {
            return;
        }
        try {
            JSONObject a5 = new cm(str, ck.f55419l).a(context);
            if (map != null && map.size() > 0) {
                a5.put("module_section", new JSONObject(map));
            } else {
                a5.put("module_section", new JSONObject());
            }
            final String jSONObject = a5.toString();
            n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.bh.1
                @Override // java.lang.Runnable
                public final void run() {
                    cp.a(context, jSONObject);
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static int b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            return new JSONObject(str).getBoolean("userSet") ? 1 : 0;
        } catch (Throwable unused) {
            return -2;
        }
    }

    public static String l() {
        return Build.MANUFACTURER + "(" + Build.MODEL + ")";
    }

    public static String j() {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = LocaleList.getDefault().get(0);
        } else {
            locale = Locale.getDefault();
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    public static boolean a(Context context, String str) {
        try {
            context.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}

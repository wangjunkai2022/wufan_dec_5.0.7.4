package com.papa.sim.statistic;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.umeng.commonsdk.UMConfigure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: SystemInfoUtils.java */
/* loaded from: classes5.dex */
public class s {

    /* renamed from: c  reason: collision with root package name */
    static String f59488c = "s";

    /* renamed from: d  reason: collision with root package name */
    static s f59489d = null;

    /* renamed from: e  reason: collision with root package name */
    static String f59490e = null;

    /* renamed from: f  reason: collision with root package name */
    static String f59491f = null;

    /* renamed from: g  reason: collision with root package name */
    static long f59492g = 0;

    /* renamed from: h  reason: collision with root package name */
    static String f59493h = "";

    /* renamed from: i  reason: collision with root package name */
    static String f59494i = "";

    /* renamed from: j  reason: collision with root package name */
    static String f59495j = null;

    /* renamed from: k  reason: collision with root package name */
    static String f59496k = "";

    /* renamed from: a  reason: collision with root package name */
    Context f59497a;

    /* renamed from: b  reason: collision with root package name */
    boolean f59498b = true;

    private s(Context context) {
        this.f59497a = context;
        f59492g = System.currentTimeMillis();
        try {
            String r4 = com.papa.sim.statistic.pref.b.k(context).r();
            if (r4 == null || "".equals(r4)) {
                return;
            }
            f59491f = c.b(r4.getBytes());
        } catch (Exception unused) {
        }
    }

    public static s f(Context context) {
        String str;
        if (f59489d == null) {
            f59489d = new s(context);
        }
        if (f59492g != 0 && (((str = f59490e) == null || "".equals(str)) && System.currentTimeMillis() - f59492g > 3000)) {
            f59492g = 0L;
        }
        return f59489d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
        if ("".equals(r2) == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String h() {
        /*
            r13 = this;
            java.lang.String r0 = ""
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Exception -> L83
            r2 = r0
            r3 = r2
        L8:
            boolean r4 = r1.hasMoreElements()     // Catch: java.lang.Exception -> L81
            if (r4 == 0) goto L78
            java.lang.Object r4 = r1.nextElement()     // Catch: java.lang.Exception -> L81
            java.net.NetworkInterface r4 = (java.net.NetworkInterface) r4     // Catch: java.lang.Exception -> L81
            byte[] r5 = r4.getHardwareAddress()     // Catch: java.lang.Exception -> L81
            if (r5 == 0) goto L8
            int r6 = r5.length     // Catch: java.lang.Exception -> L81
            if (r6 != 0) goto L1e
            goto L8
        L1e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L81
            r6.<init>()     // Catch: java.lang.Exception -> L81
            int r7 = r5.length     // Catch: java.lang.Exception -> L81
            r8 = 0
            r9 = 0
        L26:
            r10 = 1
            if (r9 >= r7) goto L3f
            r11 = r5[r9]     // Catch: java.lang.Exception -> L81
            java.lang.String r12 = "%02X:"
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Exception -> L81
            java.lang.Byte r11 = java.lang.Byte.valueOf(r11)     // Catch: java.lang.Exception -> L81
            r10[r8] = r11     // Catch: java.lang.Exception -> L81
            java.lang.String r10 = java.lang.String.format(r12, r10)     // Catch: java.lang.Exception -> L81
            r6.append(r10)     // Catch: java.lang.Exception -> L81
            int r9 = r9 + 1
            goto L26
        L3f:
            int r5 = r6.length()     // Catch: java.lang.Exception -> L81
            if (r5 <= 0) goto L4d
            int r5 = r6.length()     // Catch: java.lang.Exception -> L81
            int r5 = r5 - r10
            r6.deleteCharAt(r5)     // Catch: java.lang.Exception -> L81
        L4d:
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Exception -> L81
            java.lang.String r5 = "wlan0"
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Exception -> L81
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Exception -> L81
            if (r5 == 0) goto L5e
            r2 = r3
        L5e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L81
            r5.<init>()     // Catch: java.lang.Exception -> L81
            java.lang.String r6 = "interfaceName="
            r5.append(r6)     // Catch: java.lang.Exception -> L81
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Exception -> L81
            r5.append(r4)     // Catch: java.lang.Exception -> L81
            java.lang.String r4 = ", mac="
            r5.append(r4)     // Catch: java.lang.Exception -> L81
            r5.append(r3)     // Catch: java.lang.Exception -> L81
            goto L8
        L78:
            if (r2 == 0) goto L89
            boolean r1 = r0.equals(r2)     // Catch: java.lang.Exception -> L81
            if (r1 != 0) goto L89
            goto L8a
        L81:
            goto L84
        L83:
            r3 = r0
        L84:
            if (r3 == 0) goto L89
            r0.equals(r3)
        L89:
            r2 = r3
        L8a:
            if (r2 == 0) goto L8f
            r0.equals(r2)
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.papa.sim.statistic.s.h():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.net.HttpURLConnection, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0068 -> B:34:0x008f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006d -> B:34:0x008f). Please submit an issue!!! */
    public static String i() {
        HttpURLConnection httpURLConnection;
        String str = "";
        ?? r12 = 0;
        InputStream inputStream = null;
        r12 = 0;
        r12 = 0;
        r12 = 0;
        try {
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL("http://pv.sohu.com/cityjson?ie=utf-8").openConnection();
                } catch (Throwable th) {
                    th = th;
                    try {
                        r12.close();
                        r12.disconnect();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    throw th;
                }
            } catch (MalformedURLException e7) {
                e = e7;
                httpURLConnection = null;
            } catch (IOException e8) {
                e = e8;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                r12.close();
                r12.disconnect();
                throw th;
            }
            try {
                if (httpURLConnection.getResponseCode() == 200) {
                    r12 = httpURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream) r12, "utf-8"));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine + "\n");
                    }
                    Matcher matcher = Pattern.compile("((?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d))))").matcher(sb.toString());
                    inputStream = r12;
                    if (matcher.find()) {
                        str = matcher.group();
                        inputStream = r12;
                    }
                }
                inputStream.close();
                httpURLConnection.disconnect();
            } catch (MalformedURLException e9) {
                e = e9;
                e.printStackTrace();
                r12.close();
                httpURLConnection.disconnect();
                return str;
            } catch (IOException e10) {
                e = e10;
                e.printStackTrace();
                r12.close();
                httpURLConnection.disconnect();
                return str;
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        return str;
    }

    private static void l(Context context) {
        try {
            String r4 = com.papa.sim.statistic.pref.b.k(context).r();
            if (r4 == null || "".equals(r4)) {
                return;
            }
            f59491f = c.b(r4.getBytes());
        } catch (Exception unused) {
        }
    }

    public static String m() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            arrayList.addAll(Arrays.asList(Build.SUPPORTED_ABIS));
        } else {
            arrayList.add(Build.CPU_ABI);
            arrayList.add(Build.CPU_ABI2);
        }
        return q.a("|", arrayList);
    }

    public static boolean s(Context context) {
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY)).getRunningTasks(1);
            if (!runningTasks.isEmpty()) {
                String packageName = runningTasks.get(0).topActivity.getPackageName();
                if (!packageName.equals(context.getPackageName())) {
                    if (!com.papa.sim.statistic.db.b.o(context).j(packageName)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean t(Context context) {
        return !((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    public String a(Context context) {
        if (context != null && TextUtils.isEmpty(f59493h)) {
            f59493h = Settings.System.getString(context.getContentResolver(), "android_id");
        }
        return f59493h;
    }

    public String b() {
        String replaceAll;
        String str;
        try {
            try {
                String str2 = f59496k;
                if ((str2 == null || str2.equals("") || f59496k.startsWith("02") || f59496k.equals(f59495j.replaceAll(":", ""))) && Build.VERSION.SDK_INT < 29 && this.f59498b) {
                    f59496k = ((TelephonyManager) this.f59497a.getSystemService("phone")).getDeviceId();
                }
                str = f59496k;
            } catch (Exception unused) {
                String str3 = f59496k;
                if (str3 == null || str3.equals("000000000000000") || f59496k.equals("") || f59496k.equals("null") || f59496k.equals("02:00:00:00:00:00") || f59496k.equals("0") || f59496k.equals("020000000000")) {
                    String uMIDString = UMConfigure.getUMIDString(this.f59497a);
                    f59496k = uMIDString;
                    if (uMIDString == null) {
                        replaceAll = g().replaceAll(":", "");
                    }
                }
            } catch (Throwable th) {
                String str4 = f59496k;
                if (str4 == null || str4.equals("000000000000000") || f59496k.equals("") || f59496k.equals("null") || f59496k.equals("02:00:00:00:00:00") || f59496k.equals("0") || f59496k.equals("020000000000")) {
                    try {
                        String uMIDString2 = UMConfigure.getUMIDString(this.f59497a);
                        f59496k = uMIDString2;
                        if (uMIDString2 == null) {
                            f59496k = g().replaceAll(":", "");
                        }
                    } catch (Exception unused2) {
                        f59496k = "";
                    }
                }
                throw th;
            }
            if (str == null || str.equals("000000000000000") || f59496k.equals("") || f59496k.equals("null") || f59496k.equals("02:00:00:00:00:00") || f59496k.equals("0") || f59496k.equals("020000000000")) {
                String uMIDString3 = UMConfigure.getUMIDString(this.f59497a);
                f59496k = uMIDString3;
                if (uMIDString3 == null) {
                    replaceAll = g().replaceAll(":", "");
                    f59496k = replaceAll;
                }
            }
        } catch (Exception unused3) {
            f59496k = "";
        }
        String str5 = f59496k;
        if (str5 == null || str5.equals("")) {
            f59496k = c();
        }
        return f59496k;
    }

    public String c() {
        Context context = this.f59497a;
        if (context != null) {
            String j4 = com.papa.sim.statistic.pref.b.k(context).j();
            if (!TextUtils.isEmpty(j4)) {
                return j4;
            }
        }
        String b5 = f.b(this.f59497a);
        com.papa.sim.statistic.pref.b.k(this.f59497a).E(b5);
        return b5;
    }

    public String d() {
        try {
            return (Build.VERSION.SDK_INT >= 29 || !this.f59498b) ? "" : ((TelephonyManager) this.f59497a.getSystemService("phone")).getDeviceId();
        } catch (Exception unused) {
            return "";
        }
    }

    public String e() {
        if (this.f59497a.checkPermission(com.kuaishou.weapon.p0.g.f55583c, Process.myPid(), Process.myUid()) != 0) {
            return "[version:" + q() + ",imei:   ,imsi:    ,model:" + Build.MODEL + ",brand:" + Build.BRAND + ",number:    ]";
        }
        TelephonyManager telephonyManager = (TelephonyManager) this.f59497a.getSystemService("phone");
        if (Build.VERSION.SDK_INT < 29 && this.f59498b) {
            telephonyManager.getDeviceId();
        }
        String subscriberId = telephonyManager.getSubscriberId();
        String str = Build.MODEL;
        String str2 = Build.BRAND;
        String line1Number = telephonyManager.getLine1Number();
        StringBuilder sb = new StringBuilder();
        sb.append("手机IMEI号：");
        sb.append(f59496k);
        sb.append("手机IESI号：");
        sb.append(subscriberId);
        sb.append("手机型号：");
        sb.append(str);
        sb.append("手机品牌：");
        sb.append(str2);
        sb.append("手机号码");
        sb.append(line1Number);
        return "[version:" + q() + ",imei:" + f59496k + ",imsi:" + subscriberId + ",model:" + str + ",brand:" + str2 + ",number:" + line1Number + "]";
    }

    public String g() {
        String str;
        String str2 = f59495j;
        if (str2 == null || str2.equals("")) {
            if (Build.VERSION.SDK_INT > 28) {
                return "";
            }
            try {
                str = ((WifiManager) this.f59497a.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)).getConnectionInfo().getMacAddress();
            } catch (Exception e5) {
                e = e5;
                str = "";
            }
            try {
                f59495j = str;
                if (str == null || str.equals("") || f59495j.equals("0") || f59495j.equals("02:00:00:00:00:00") || f59495j.equals("02_00_00_00_00_00")) {
                    f59495j = h();
                }
            } catch (Exception e6) {
                e = e6;
                e.printStackTrace();
                String str3 = f59495j;
                if (str3 == null || str3.equals("") || f59495j.equals("02:00:00:00:00:00") || f59495j.equals("02_00_00_00_00_00")) {
                    f59495j = h();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("手机macAdd:");
                sb.append(str);
                return f59495j;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("手机macAdd:");
            sb2.append(str);
            return f59495j;
        }
        return f59495j;
    }

    public String j() {
        return f59490e;
    }

    public String k() {
        String str = f59491f;
        if (str == null || "".equals(str)) {
            try {
                String r4 = com.papa.sim.statistic.pref.b.k(this.f59497a).r();
                if (r4 != null && !"".equals(r4)) {
                    f59491f = c.b(r4.getBytes());
                }
            } catch (Exception unused) {
            }
        }
        return f59491f;
    }

    public String n(Context context) {
        return UMConfigure.getUMIDString(context);
    }

    public String o() {
        String property;
        if (TextUtils.isEmpty(f59494i)) {
            try {
                property = WebSettings.getDefaultUserAgent(this.f59497a);
            } catch (Exception unused) {
                property = System.getProperty("http.agent");
            }
            StringBuilder sb = new StringBuilder();
            if (property != null) {
                int length = property.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char charAt = property.charAt(i4);
                    if (charAt <= 31 || charAt >= 127) {
                        sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                    } else {
                        sb.append(charAt);
                    }
                }
            }
            f59494i = sb.toString();
        }
        return f59494i;
    }

    public int p() {
        try {
            return this.f59497a.getPackageManager().getPackageInfo(this.f59497a.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public String q() {
        try {
            return this.f59497a.getPackageManager().getPackageInfo(this.f59497a.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public String[] r() {
        String[] strArr = new String[2];
        try {
            PackageInfo packageInfo = this.f59497a.getPackageManager().getPackageInfo(this.f59497a.getPackageName(), 0);
            strArr[0] = packageInfo.versionCode + "";
            strArr[1] = packageInfo.versionName;
            return strArr;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return strArr;
        }
    }

    public void u(String str) {
        f59490e = str;
    }

    public void v(boolean z4) {
        this.f59498b = z4;
    }
}

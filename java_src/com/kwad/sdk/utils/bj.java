package com.kwad.sdk.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.media.AudioManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.system.Os;
import android.system.StructStat;
import android.system.StructTimespec;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.join.mgps.Util.h0;
import com.kwad.sdk.service.ServiceProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
/* loaded from: classes5.dex */
public final class bj {
    private static String aRA = "";
    private static boolean aRB = false;
    private static String aRC = "";
    private static String aRD = "";
    private static int aRE;
    private static boolean aRF;
    private static int aRG;
    private static boolean aRH;
    private static String aRM;
    private static String aRN;
    private static int aRV;
    private static long aRW;
    private static String aRz;
    private static final String[] aRI = {"", ""};
    private static String aRJ = "";
    private static String aRK = "";
    private static String aRL = "";
    private static int aRO = -1;
    private static boolean aRP = false;
    private static boolean aRQ = false;
    private static boolean aRR = false;
    private static boolean aRS = false;
    private static boolean aRT = false;
    private static boolean aRU = false;
    private static String aRX = "";
    private static String aRY = "";
    public static String aRZ = "";
    private static final List<String> aSa = Arrays.asList("a5f5faddde9e9f02", "8e17f7422b35fbea", "b88c3c236923d9d9", "cb36bf76cca443d0", "5d4e49ed381836c5", "cffa38e9136f93e9", "62bd2daa59ea0173", "b7aad49a2d5bc5d9", "f2138912c5e5dd5c", "330a1e81a2bf9f31", "59c0f432ccbef844", "521376155e535f39", "aa5ec6ce14abd680", "5522a09bb500d82f", "6dfe4a96800edfb4", "ecc9a2dded8cdf72", "399f868043955b11", "34dc327c00dbff94", "d1b4e3862c309f8b", "68bdbf71f863ccac", "01558dd995085a35", "351174200a06da52", "fa0988506c76ff4b", "8eb8ef823312c61a", "a72e81be65c4638b", "416d15a015c8f324", "474086ea2d737519", "befdddf908c8d749", "780ee58a6f57aab6", "cfe86fa07cae3601", "704ff4d1534f0ff4", "9298b9e9bbd7cdea", "7b634c42f236c6e8", "11eacf22b9ceab7d", "2941a4f39eec5864", "87d134dc5ba45550", "fdd2313bb1750eb9", "6560ef232d8424bb", "5d876286e1064482", "f66fefb916f4962d", "7baf82d0ac49f596", "57748921d8d88ed4", "120cd57f1a50b8f5", "e164f9610ddd9fc8", "6256f0e8da6389de", "bcb22df712476416", "714fa9aff63f7adb", "cb8252e4da7cf610", "e18f649aa80e140c", "966790a9db5ea8d8", "e1769e681af901dd", "d23f2574a60964a4", "d717e6298d3c9cb2", "f5ea5e8ba730864e", "a8a0a223d1a42232", "6675a4f231f5c8db", "3edb7c2103e5c75a", "8ce6a9a216b326c4", "af606153eb3be0a7", "7ae255c3d760c920", "e50e94c40048c5fd", "55009bca30f9dc4c", "c37566487909214a", "891b74f7e534d14a", "726e190aae663525", "df473127d30fb669", "bfbcc646d92dfd48", "a4a1954c44751936", "da4a44a3d7c4d8be", "5ff5bca4a775dd30", "14917461e1917c53", "14ce20d0a80955fa", "a56a63de4d3f3d39", "f780246adc7bd556", "3495a541aea0da72", "f7f205ce47fed2a5", "f52db3f434279c3a", "dca17088c97dee5e", "dd53a8b3a2a4ccc0", "52e07629290d45e4", "cda522b0f8f50d9a", "b85a1c8bcd51d82c", "e344a00cd3f5e93a", "fa59d8a66d7bdd88", "68fb1f1393a216e8", "4c30ab1fb10af181", "b1376e0578099143", "88752f72d8d305fd", "fddf20078d27bf3c", "dab2120bffa2be8c", "c7c8dde481793471", "e4b1bdbcabfc284d");

    private static long NC() {
        BufferedReader bufferedReader;
        Throwable th;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            do {
                try {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
                        return 0L;
                    }
                } catch (Exception unused) {
                    bufferedReader2 = bufferedReader;
                    com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader2);
                    return 0L;
                } catch (Throwable th2) {
                    th = th2;
                    com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
                    throw th;
                }
            } while (!readLine.contains("MemTotal"));
            long longValue = Long.valueOf(readLine.split("\\s+")[1]).longValue() << 10;
            com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
            return longValue;
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public static long NE() {
        return com.kwad.sdk.crash.utils.h.K(Environment.getDataDirectory());
    }

    public static long NF() {
        if (((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).ab(1024L)) {
            return 0L;
        }
        return com.kwad.sdk.crash.utils.h.J(Environment.getDataDirectory());
    }

    public static long NG() {
        long freeMemory;
        try {
            freeMemory = Runtime.getRuntime().freeMemory();
        } catch (Throwable unused) {
        }
        if (freeMemory > 0) {
            return freeMemory;
        }
        return 0L;
    }

    public static int NH() {
        int i4 = aRV;
        if (i4 > 0) {
            return i4;
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        aRV = availableProcessors;
        return availableProcessors;
    }

    public static String NI() {
        return Build.MODEL;
    }

    public static synchronized long NJ() {
        long j4;
        synchronized (bj.class) {
            j4 = 0;
            if (av.usePhoneStateDisable() && (!TextUtils.isEmpty(av.MV()) || av.MW() != null)) {
                j4 = 1;
            }
            if (av.MT() && av.MU() != null) {
                j4 |= 64;
            }
            if (av.usePhoneStateDisable() && !TextUtils.isEmpty(av.MX())) {
                j4 |= 2;
            }
            if (av.MY() && !TextUtils.isEmpty(av.MZ())) {
                j4 |= 4;
            }
            if (av.Na() && !TextUtils.isEmpty(av.Nb())) {
                j4 |= 2048;
            }
            if (av.Ne()) {
                if (av.Nf() != null) {
                    j4 |= 16;
                }
            }
        }
        return j4;
    }

    public static String NK() {
        return Build.BRAND;
    }

    public static synchronized long NL() {
        long elapsedRealtime;
        synchronized (bj.class) {
            elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
        }
        return elapsedRealtime;
    }

    public static synchronized long NM() {
        long j4;
        synchronized (bj.class) {
            j4 = Build.TIME;
        }
        return j4;
    }

    public static synchronized String NN() {
        String str;
        synchronized (bj.class) {
            str = Build.FINGERPRINT;
        }
        return str;
    }

    public static synchronized String NO() {
        synchronized (bj.class) {
            if (!TextUtils.isEmpty(aRz)) {
                return aRz;
            }
            String radioVersion = Build.getRadioVersion();
            aRz = radioVersion;
            return radioVersion;
        }
    }

    public static synchronized String NP() {
        String name;
        synchronized (bj.class) {
            name = au.getName();
        }
        return name;
    }

    public static synchronized String NQ() {
        String version;
        synchronized (bj.class) {
            version = au.getVersion();
        }
        return version;
    }

    public static String NR() {
        return Build.MANUFACTURER;
    }

    public static int NS() {
        if (aRO == -1) {
            aRO = dt(((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).getContext()) ? 4 : 3;
        }
        return aRO;
    }

    public static String NT() {
        if (TextUtils.isEmpty(aRN)) {
            aRN = System.getProperty("os.arch");
        }
        return aRN;
    }

    public static int NU() {
        return Build.VERSION.SDK_INT;
    }

    public static String NV() {
        if (av.Nc() || ((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).ab(8L)) {
            return "";
        }
        if (TextUtils.isEmpty(aRZ)) {
            return aRZ;
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if ((nextElement instanceof Inet4Address) && !nextElement.isLoopbackAddress()) {
                        String hostAddress = nextElement.getHostAddress();
                        aRZ = hostAddress;
                        return hostAddress;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    private static String NW() {
        try {
            return a(Long.toHexString(new Random(System.currentTimeMillis()).nextLong()), 16, '0');
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String NX() {
        if (((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).getContext() == null) {
            return null;
        }
        String h4 = y.h("ksadsdk_pref", "android_id", (String) null);
        y.i(h4, "ksadsdk_pref", "android_id");
        return h4;
    }

    public static String NY() {
        if (!TextUtils.isEmpty(aRX)) {
            return aRX;
        }
        try {
            String V = q.V(new File("/proc/sys/kernel/random/boot_id"));
            aRX = TextUtils.isEmpty(V) ? "" : V.substring(0, V.indexOf("\n"));
        } catch (Throwable unused) {
        }
        return aRX;
    }

    private static String a(String str, int i4, char c5) {
        StringBuilder sb = new StringBuilder();
        while (sb.length() + str.length() < 16) {
            sb.append('0');
        }
        sb.append(str);
        return sb.toString();
    }

    @SuppressLint({"HardwareIds"})
    public static String cJ(Context context) {
        if (TextUtils.isEmpty(aRL) && context != null && !aRS) {
            if (av.usePhoneStateDisable()) {
                return av.MX();
            }
            if (!o.LQ()) {
                return aRL;
            }
            try {
                String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                aRL = string;
                if (!hh(string)) {
                    aRL = "";
                }
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(aRL)) {
                aRS = true;
            }
            return aRL;
        }
        return aRL;
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    public static synchronized String cN(Context context) {
        synchronized (bj.class) {
            if (context != null) {
                if (!aRQ && TextUtils.isEmpty(aRJ) && SystemUtil.di(context) && !av.usePhoneStateDisable() && o.LX()) {
                    try {
                        aRJ = ((TelephonyManager) context.getApplicationContext().getSystemService("phone")).getSubscriberId();
                    } catch (Exception unused) {
                    }
                    aRQ = TextUtils.isEmpty(aRJ);
                    return aRJ;
                }
            }
            return aRJ;
        }
    }

    public static String cd(boolean z4) {
        com.kwad.sdk.service.a.f fVar = (com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class);
        if (fVar == null) {
            return "";
        }
        Context context = fVar.getContext();
        String bp = com.kwad.sdk.core.f.a.bp(context);
        return (TextUtils.isEmpty(bp) && !z4 && TextUtils.isEmpty(dm(context))) ? ((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).zl() : bp;
    }

    public static int checkSelfPermission(@NonNull Context context, @NonNull String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static long dj(Context context) {
        if (context == null || ((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).ab(1024L)) {
            return 0L;
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY)).getMemoryInfo(memoryInfo);
            return memoryInfo.availMem;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static int dk(Context context) {
        if (((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).ab(512L)) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((BatteryManager) context.getApplicationContext().getSystemService("batterymanager")).getIntProperty(4);
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static long dl(Context context) {
        long j4 = aRW;
        if (j4 > 0) {
            return j4;
        }
        if (context == null) {
            return 0L;
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getApplicationContext().getSystemService(TTDownloadField.TT_ACTIVITY)).getMemoryInfo(memoryInfo);
            long j5 = memoryInfo.totalMem;
            if (j5 <= 0) {
                j5 = NC();
            }
            aRW = j5;
            return j5;
        } catch (Exception unused) {
            return 0L;
        }
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    private static synchronized String dm(@Nullable Context context) {
        synchronized (bj.class) {
            if (av.usePhoneStateDisable() && !TextUtils.isEmpty(av.MV())) {
                return av.MV();
            } else if (aRP) {
                return aRC;
            } else {
                if (TextUtils.isEmpty(aRC) && context != null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        return aRC;
                    } else if (av.usePhoneStateDisable()) {
                        return aRC;
                    } else if (!o.LW()) {
                        return aRC;
                    } else {
                        boolean z4 = false;
                        try {
                            z4 = SystemUtil.di(context);
                            if (z4) {
                                String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                                aRC = deviceId;
                                if (TextUtils.isEmpty(deviceId)) {
                                    aRP = true;
                                }
                            }
                        } catch (Exception e5) {
                            com.kwad.sdk.core.e.c.printStackTrace(e5);
                            if (z4) {
                                aRP = true;
                            }
                        }
                        return aRC;
                    }
                }
                return aRC;
            }
        }
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    public static synchronized String dn(@Nullable Context context) {
        TelephonyManager telephonyManager;
        synchronized (bj.class) {
            if (aRU) {
                return aRD;
            }
            if (TextUtils.isEmpty(aRD) && context != null) {
                if (av.usePhoneStateDisable()) {
                    return aRD;
                }
                if (!o.LV()) {
                    return aRL;
                }
                boolean z4 = false;
                try {
                    z4 = SystemUtil.di(context);
                    if (z4 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            String meid = telephonyManager.getMeid();
                            aRD = meid;
                            if (TextUtils.isEmpty(meid)) {
                                aRU = true;
                            }
                        } else if (telephonyManager.getPhoneType() == 2) {
                            String deviceId = telephonyManager.getDeviceId();
                            aRD = deviceId;
                            if (TextUtils.isEmpty(deviceId)) {
                                aRU = true;
                            }
                        } else {
                            aRD = null;
                            aRU = true;
                        }
                    }
                } catch (Exception e5) {
                    com.kwad.sdk.core.e.c.printStackTrace(e5);
                    if (z4) {
                        aRU = true;
                    }
                }
                return aRD;
            }
            return aRD;
        }
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    /* renamed from: do  reason: not valid java name */
    public static synchronized String[] m24do(@Nullable Context context) {
        synchronized (bj.class) {
            if (av.usePhoneStateDisable() && av.MW() != null) {
                return av.MW();
            } else if (aRT) {
                return aRI;
            } else {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                    return aRI;
                }
                String[] strArr = aRI;
                boolean z4 = false;
                if (TextUtils.isEmpty(strArr[0]) && TextUtils.isEmpty(strArr[1]) && context != null) {
                    if (av.usePhoneStateDisable()) {
                        return strArr;
                    }
                    if (o.LW()) {
                        try {
                            boolean di = SystemUtil.di(context);
                            if (di) {
                                try {
                                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                                    if (telephonyManager != null) {
                                        if (i4 >= 26) {
                                            int min = Math.min(dp(context), 2);
                                            for (int i5 = 0; i5 < min; i5++) {
                                                aRI[i5] = telephonyManager.getImei(i5);
                                            }
                                            String[] strArr2 = aRI;
                                            if (TextUtils.isEmpty(strArr2[0]) && TextUtils.isEmpty(strArr2[1])) {
                                                aRT = true;
                                            }
                                        } else if (telephonyManager.getPhoneType() == 1) {
                                            if (i4 >= 23) {
                                                int min2 = Math.min(dp(context), 2);
                                                for (int i6 = 0; i6 < min2; i6++) {
                                                    aRI[i6] = telephonyManager.getDeviceId(i6);
                                                }
                                            } else {
                                                strArr[0] = telephonyManager.getDeviceId();
                                                strArr[1] = null;
                                            }
                                            String[] strArr3 = aRI;
                                            if (TextUtils.isEmpty(strArr3[0]) && TextUtils.isEmpty(strArr3[1])) {
                                                aRT = true;
                                            }
                                        } else {
                                            strArr[0] = null;
                                            strArr[1] = null;
                                            aRT = true;
                                        }
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    z4 = di;
                                    com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                                    if (z4) {
                                        aRT = true;
                                    }
                                    return aRI;
                                }
                            }
                        } catch (Exception e6) {
                            e = e6;
                        }
                        return aRI;
                    }
                    return strArr;
                }
                return strArr;
            }
        }
    }

    public static synchronized int dp(Context context) {
        synchronized (bj.class) {
            if (!aRF && aRE <= 0 && Build.VERSION.SDK_INT >= 23 && context != null && !av.usePhoneStateDisable()) {
                try {
                    aRE = ((TelephonyManager) context.getSystemService("phone")).getPhoneCount();
                } catch (Exception unused) {
                }
                int i4 = aRE;
                aRF = i4 == 0;
                return i4;
            }
            return aRE;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static int dq(Context context) {
        if (context != null && aRG <= 0 && !aRH && Build.VERSION.SDK_INT >= 22 && SystemUtil.di(context) && !av.usePhoneStateDisable()) {
            try {
                aRG = ((SubscriptionManager) context.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoCount();
            } catch (Throwable unused) {
            }
            int i4 = aRG;
            aRH = i4 != 0;
            return i4;
        }
        return aRG;
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    public static String dr(Context context) {
        if (TextUtils.isEmpty(aRK) && context != null) {
            if (aRR) {
                return aRK;
            }
            if (av.usePhoneStateDisable()) {
                return aRK;
            }
            if (!o.LY()) {
                return aRK;
            }
            try {
                if (SystemUtil.di(context)) {
                    aRK = ((TelephonyManager) context.getApplicationContext().getSystemService("phone")).getSimSerialNumber();
                }
            } catch (Exception e5) {
                com.kwad.sdk.core.e.c.printStackTrace(e5);
                aRK = null;
            }
            if (TextUtils.isEmpty(aRK)) {
                aRR = true;
            }
            String str = TextUtils.isEmpty(aRK) ? "" : aRK;
            aRK = str;
            return str;
        }
        return aRK;
    }

    public static synchronized int ds(Context context) {
        int ringerMode;
        synchronized (bj.class) {
            try {
                ringerMode = ((AudioManager) context.getSystemService("audio")).getRingerMode();
            } catch (Exception unused) {
                return -1;
            }
        }
        return ringerMode;
    }

    private static boolean dt(Context context) {
        return (context == null || context.getResources() == null || context.getResources().getConfiguration() == null || (context.getResources().getConfiguration().screenLayout & 15) < 3) ? false : true;
    }

    @SuppressLint({"HardwareIds"})
    public static synchronized String du(@Nullable Context context) {
        synchronized (bj.class) {
            if (TextUtils.isEmpty(aRA) && context != null && !aRB) {
                if (av.MY()) {
                    String MZ = av.MZ();
                    aRA = MZ;
                    return MZ;
                } else if (!o.LR()) {
                    return aRA;
                } else {
                    try {
                        WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)).getConnectionInfo();
                        if (connectionInfo != null) {
                            aRA = connectionInfo.getMacAddress();
                        }
                        if (hf(aRA)) {
                            Iterator it2 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                NetworkInterface networkInterface = (NetworkInterface) it2.next();
                                if (networkInterface != null && "wlan0".equals(networkInterface.getName())) {
                                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                                    if (hardwareAddress != null && hardwareAddress.length != 0) {
                                        StringBuilder sb = new StringBuilder();
                                        int length = hardwareAddress.length;
                                        for (int i4 = 0; i4 < length; i4++) {
                                            sb.append(String.format("%02X:", Byte.valueOf(hardwareAddress[i4])));
                                        }
                                        if (sb.length() > 0) {
                                            sb.deleteCharAt(sb.length() - 1);
                                        }
                                        aRA = sb.toString();
                                    }
                                }
                            }
                        }
                        if (hf(aRA)) {
                            aRA = com.kwad.sdk.crash.utils.h.c(Runtime.getRuntime().exec("cat /sys/class/net/wlan0/address ").getInputStream());
                        }
                        if (!hf(aRA)) {
                            aRA = aRA.toUpperCase(Locale.US);
                        }
                    } catch (Exception unused) {
                        aRB = true;
                    }
                    aRB = hf(aRA);
                    return aRA;
                }
            }
            return aRA;
        }
    }

    @Nullable
    public static List<String> dv(@NonNull Context context) {
        String[] list;
        if (c.bS(context)) {
            return new ArrayList();
        }
        if (!dw(context)) {
            return new ArrayList();
        }
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data");
        if (file.exists() && file.isDirectory() && (list = file.list()) != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (!TextUtils.isEmpty(str) && !str.startsWith(h0.f27805a)) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        }
        return null;
    }

    public static boolean dw(@NonNull Context context) {
        if (context.getApplicationInfo().targetSdkVersion < 30 || Build.VERSION.SDK_INT < 30) {
            return context.checkCallingOrSelfPermission(com.kuaishou.weapon.p0.g.f55590j) == 0;
        }
        return false;
    }

    public static String getDeviceId() {
        try {
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e5);
        }
        if (!TextUtils.isEmpty(aRM)) {
            return aRM;
        }
        String NX = NX();
        if (!TextUtils.isEmpty(NX)) {
            String str = "ANDROID_" + NX;
            aRM = str;
            return str;
        }
        String cJ = cJ(((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).getContext());
        if (!TextUtils.isEmpty(cJ) && !hg(cJ) && hh(cJ)) {
            String str2 = "ANDROID_" + cJ;
            aRM = str2;
            return str2;
        }
        String NW = NW();
        if (!TextUtils.isEmpty(NW)) {
            aRM = "ANDROID_" + NW;
            hi(NW);
            return aRM;
        }
        return "ANDROID_";
    }

    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getLocale() {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = LocaleList.getDefault().get(0);
        } else {
            locale = Locale.getDefault();
        }
        if (locale == null) {
            locale = Locale.CHINESE;
        }
        return String.valueOf(locale);
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static int getScreenHeight(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int getScreenWidth(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static boolean hf(String str) {
        return TextUtils.isEmpty(str) || str.equals("02:00:00:00:00:00");
    }

    private static boolean hg(String str) {
        return aSa.contains(str.toLowerCase(Locale.US));
    }

    private static boolean hh(String str) {
        for (int i4 = 0; i4 < str.length(); i4++) {
            try {
                if (str.charAt(i4) != '0') {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static void hi(String str) {
        if (((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).getContext() == null) {
            return;
        }
        y.a("ksadsdk_pref", "android_id", str, true);
    }

    public static String hj(String str) {
        String valueOf;
        if (TextUtils.isEmpty(aRY) && !TextUtils.isEmpty(str)) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 21) {
                try {
                    StructStat stat = Os.stat(str);
                    if (stat == null) {
                        return aRY;
                    }
                    String str2 = "";
                    if (i4 >= 27) {
                        StructTimespec structTimespec = stat.st_atim;
                        if (structTimespec == null) {
                            valueOf = "";
                        } else {
                            str2 = String.valueOf(structTimespec.tv_sec);
                            valueOf = String.valueOf(stat.st_atim.tv_nsec);
                        }
                        aRY = str2 + h0.f27805a + valueOf;
                    } else {
                        long j4 = stat.st_atime;
                        if (j4 != 0) {
                            str2 = String.valueOf(j4);
                        }
                        aRY = str2;
                    }
                } catch (Exception e5) {
                    com.kwad.sdk.core.e.c.printStackTrace(e5);
                }
            }
            return aRY;
        }
        return aRY;
    }

    public static String u(@Nullable Context context, boolean z4) {
        if (av.usePhoneStateDisable() && !TextUtils.isEmpty(av.MV())) {
            return av.MV();
        }
        String dm = dm(context);
        return (TextUtils.isEmpty(dm) && !z4 && TextUtils.isEmpty(com.kwad.sdk.core.f.a.bp(context))) ? ((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).zk() : dm;
    }
}

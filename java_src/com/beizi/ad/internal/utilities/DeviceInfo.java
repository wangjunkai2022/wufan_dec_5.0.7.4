package com.beizi.ad.internal.utilities;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.beizi.ad.R;
import com.beizi.ad.c.e;
import com.beizi.ad.internal.g;
import com.beizi.ad.lance.a.p;
import java.util.Locale;
/* loaded from: classes2.dex */
public class DeviceInfo {
    public static String SDK_UID_KEY = "SDK_UID_KEY";
    public static String SDK_UID_KEY_NEW = "SDK_UID_KEY_NEW";
    public static String density;
    public static String harddiskSizeByte;
    public static String physicalMemoryByte;
    private static DeviceInfo sDeviceInfoInstance;
    public String agVercode;
    public String bootMark;
    public String hmsCoreVersion;
    public String root;
    public String updateMark;
    public boolean wxInstalled;
    public String sdkUID = null;
    public boolean firstLaunch = false;
    public final String os = Build.VERSION.SDK_INT + " (" + Build.VERSION.RELEASE + ")";
    public e.b devType = e.b.DEVICE_OTHER;
    public final String brand = Build.BRAND;
    public final String model = Build.MODEL;
    public final String manufacturer = Build.MANUFACTURER;
    public String resolution = null;
    public String screenSize = null;
    public final String language = Locale.getDefault().getLanguage();

    static {
        try {
            System.loadLibrary("devInfo");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        sDeviceInfoInstance = null;
    }

    private DeviceInfo() {
    }

    public static DeviceInfo getInstance() {
        DeviceInfo deviceInfo;
        synchronized (DeviceInfo.class) {
            if (sDeviceInfoInstance == null) {
                sDeviceInfoInstance = new DeviceInfo();
                HaoboLog.v(HaoboLog.baseLogTag, HaoboLog.getString(R.string.init));
                density = g.a().f5898i.getResources().getDisplayMetrics().density + "";
                physicalMemoryByte = p.m(g.a().f5898i);
                harddiskSizeByte = p.b();
            }
            deviceInfo = sDeviceInfoInstance;
        }
        return deviceInfo;
    }

    public native String getBootMark();

    public long getInstallDate(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return 0L;
        }
    }

    public long getLastUpdateTime(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:3:0x0005, B:6:0x001c, B:14:0x0038, B:16:0x0050, B:18:0x0068, B:20:0x0077, B:22:0x007d, B:23:0x008d, B:12:0x0033), top: B:28:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:3:0x0005, B:6:0x001c, B:14:0x0038, B:16:0x0050, B:18:0x0068, B:20:0x0077, B:22:0x007d, B:23:0x008d, B:12:0x0033), top: B:28:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getMarks(android.content.Context r11) {
        /*
            r10 = this;
            java.lang.String r0 = "0"
            java.lang.String r1 = "SystemMarkStatus"
            r2 = 0
            int r3 = com.beizi.ad.internal.utilities.SPUtils.getInt(r11, r1, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r4.<init>()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r5 = "getMarks status= "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb0
            r4.append(r3)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r4 = "SystemMarkStatusExpireTime"
            r5 = 3
            r6 = 1
            if (r3 != r6) goto L2b
            com.beizi.ad.internal.utilities.SPUtils.putInt(r11, r1, r5)     // Catch: java.lang.Throwable -> Lb0
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Lb0
            com.beizi.ad.internal.utilities.SPUtils.put(r11, r4, r3)     // Catch: java.lang.Throwable -> Lb0
            r3 = 3
        L2b:
            r7 = 2
            if (r3 == 0) goto L33
            if (r3 != r7) goto L31
            goto L33
        L31:
            r6 = r3
            goto L36
        L33:
            com.beizi.ad.internal.utilities.SPUtils.putInt(r11, r1, r6)     // Catch: java.lang.Throwable -> Lb0
        L36:
            if (r6 != r5) goto L77
            long r5 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r3 = com.beizi.ad.internal.utilities.SPUtils.get(r11, r4, r3)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> Lb0
            long r5 = r3.longValue()     // Catch: java.lang.Throwable -> Lb0
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L76
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb0
            long r7 = r3.longValue()     // Catch: java.lang.Throwable -> Lb0
            long r5 = r5 - r7
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lb0
            long r5 = r3.longValue()     // Catch: java.lang.Throwable -> Lb0
            r7 = -1702967296(0xffffffff9a7ec800, double:NaN)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L76
            com.beizi.ad.internal.utilities.SPUtils.putInt(r11, r1, r2)     // Catch: java.lang.Throwable -> Lb0
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Lb0
            com.beizi.ad.internal.utilities.SPUtils.put(r11, r4, r0)     // Catch: java.lang.Throwable -> Lb0
        L76:
            return
        L77:
            java.lang.String r0 = r10.getBootMark()     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto L8d
            r3 = 36
            int r4 = r0.length()     // Catch: java.lang.Throwable -> Lb0
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = r0.substring(r2, r3)     // Catch: java.lang.Throwable -> Lb0
            r10.bootMark = r0     // Catch: java.lang.Throwable -> Lb0
        L8d:
            java.lang.String r0 = r10.getUpdateMark()     // Catch: java.lang.Throwable -> Lb0
            r10.updateMark = r0     // Catch: java.lang.Throwable -> Lb0
            com.beizi.ad.internal.utilities.SPUtils.putInt(r11, r1, r7)     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r11.<init>()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = "bootMark = "
            r11.append(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = r10.bootMark     // Catch: java.lang.Throwable -> Lb0
            r11.append(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = ",updateMark = "
            r11.append(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = r10.updateMark     // Catch: java.lang.Throwable -> Lb0
            r11.append(r0)     // Catch: java.lang.Throwable -> Lb0
            goto Lc5
        Lb0:
            r11 = move-exception
            r11.printStackTrace()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Exception："
            r0.append(r1)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.ad.internal.utilities.DeviceInfo.getMarks(android.content.Context):void");
    }

    public String getPackName(Context context) {
        return context.getPackageName();
    }

    public String getPlatform() {
        return "Android";
    }

    public native String getUpdateMark();
}

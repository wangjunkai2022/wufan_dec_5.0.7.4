package com.tencent.stat;

import android.content.Context;
import com.tencent.stat.common.StatLogger;
/* loaded from: classes6.dex */
public class StatMid {

    /* renamed from: a  reason: collision with root package name */
    private static StatLogger f62854a = com.tencent.stat.common.k.b();

    /* renamed from: b  reason: collision with root package name */
    private static DeviceInfo f62855b = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized DeviceInfo a(Context context) {
        DeviceInfo deviceInfo;
        synchronized (StatMid.class) {
            try {
                a a5 = a.a(context);
                DeviceInfo a6 = a(a5.d(DeviceInfo.TAG_FLAG, null));
                StatLogger statLogger = f62854a;
                statLogger.d("get device info from internal storage:" + a6);
                DeviceInfo a7 = a(a5.f(DeviceInfo.TAG_FLAG, null));
                StatLogger statLogger2 = f62854a;
                statLogger2.d("get device info from setting.system:" + a7);
                DeviceInfo a8 = a(a5.b(DeviceInfo.TAG_FLAG, null));
                StatLogger statLogger3 = f62854a;
                statLogger3.d("get device info from SharedPreference:" + a8);
                DeviceInfo a9 = a(a8, a7, a6);
                f62855b = a9;
                if (a9 == null) {
                    f62855b = new DeviceInfo();
                }
                DeviceInfo b5 = n.a(context).b(context);
                if (b5 != null) {
                    f62855b.d(b5.getImei());
                    f62855b.e(b5.getMac());
                    f62855b.b(b5.getUserType());
                }
                deviceInfo = f62855b;
            }
        }
        return deviceInfo;
    }

    static DeviceInfo a(DeviceInfo deviceInfo, DeviceInfo deviceInfo2) {
        if (deviceInfo != null && deviceInfo2 != null) {
            return deviceInfo.a(deviceInfo2) >= 0 ? deviceInfo : deviceInfo2;
        } else if (deviceInfo != null) {
            return deviceInfo;
        } else {
            if (deviceInfo2 != null) {
                return deviceInfo2;
            }
            return null;
        }
    }

    static DeviceInfo a(DeviceInfo deviceInfo, DeviceInfo deviceInfo2, DeviceInfo deviceInfo3) {
        return a(a(deviceInfo, deviceInfo2), a(deviceInfo2, deviceInfo3));
    }

    private static DeviceInfo a(String str) {
        if (str != null) {
            return DeviceInfo.a(com.tencent.stat.common.k.d(str));
        }
        return null;
    }

    public static DeviceInfo getDeviceInfo(Context context) {
        if (context == null) {
            f62854a.error("Context for StatConfig.getDeviceInfo is null.");
            return null;
        }
        if (f62855b == null) {
            a(context);
        }
        return f62855b;
    }

    public static String getMid(Context context) {
        if (f62855b == null) {
            getDeviceInfo(context);
        }
        return f62855b.getMid();
    }

    public static void updateDeviceInfo(Context context, String str) {
        try {
            getDeviceInfo(context);
            f62855b.c(str);
            DeviceInfo deviceInfo = f62855b;
            deviceInfo.a(deviceInfo.a() + 1);
            f62855b.a(System.currentTimeMillis());
            String jSONObject = f62855b.c().toString();
            StatLogger statLogger = f62854a;
            statLogger.d("save DeviceInfo:" + jSONObject);
            String replace = com.tencent.stat.common.k.c(jSONObject).replace("\n", "");
            a a5 = a.a(context);
            a5.c(DeviceInfo.TAG_FLAG, replace);
            a5.e(DeviceInfo.TAG_FLAG, replace);
            a5.a(DeviceInfo.TAG_FLAG, replace);
        } catch (Throwable th) {
            f62854a.e(th);
        }
    }
}

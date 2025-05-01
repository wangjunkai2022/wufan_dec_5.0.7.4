package com.papa.sim.statistic;

import android.content.Context;
import android.telephony.TelephonyManager;
/* compiled from: RequestBeanUtil.java */
/* loaded from: classes5.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private static String f58845a;

    /* renamed from: b  reason: collision with root package name */
    private static m f58846b;

    private m(Context context) {
        String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        f58845a = deviceId;
        if (deviceId == null || deviceId.equals("")) {
            f58845a = s.f(context).g().replaceAll(":", "");
        }
    }

    public static String a() {
        return f58845a;
    }

    public static m b(Context context) {
        if (f58846b == null) {
            f58846b = new m(context);
        }
        return f58846b;
    }
}

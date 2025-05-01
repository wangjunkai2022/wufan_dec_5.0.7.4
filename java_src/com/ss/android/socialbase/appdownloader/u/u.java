package com.ss.android.socialbase.appdownloader.u;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes5.dex */
public class u {
    private static Boolean vv;

    private static int i() {
        String str = null;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, vv("726f2e736563757265"));
            if (invoke != null) {
                str = (String) invoke;
            }
        } catch (Exception unused) {
        }
        return (str == null || !"0".equals(str)) ? 1 : 0;
    }

    public static boolean m() {
        if (i() == 0) {
            return true;
        }
        return o();
    }

    private static boolean o() {
        String[] strArr = {vv("2f7362696e2f7375"), vv("2f73797374656d2f62696e2f7375"), vv("2f73797374656d2f7862696e2f7375"), vv("2f646174612f6c6f63616c2f7862696e2f7375"), vv("2f646174612f6c6f63616c2f62696e2f7375"), vv("2f73797374656d2f73642f7862696e2f7375"), vv("2f73797374656d2f62696e2f6661696c736166652f7375"), vv("2f646174612f6c6f63616c2f7375")};
        for (int i4 = 0; i4 < 8; i4++) {
            if (new File(strArr[i4]).exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean p(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return registerReceiver != null && registerReceiver.getIntExtra("plugged", -1) == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[Catch: Exception -> 0x0086, TryCatch #0 {Exception -> 0x0086, blocks: (B:2:0x0000, B:3:0x0026, B:5:0x002d, B:7:0x0035, B:9:0x003d, B:10:0x004c, B:11:0x0053, B:13:0x0059, B:16:0x006c, B:19:0x0079), top: B:25:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean u() {
        /*
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Exception -> L86
            r0.<init>()     // Catch: java.lang.Exception -> L86
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = "/proc/"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L86
            int r2 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L86
            r1.append(r2)     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = "/maps"
            r1.append(r2)     // Catch: java.lang.Exception -> L86
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L86
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L86
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Exception -> L86
            r3.<init>(r1)     // Catch: java.lang.Exception -> L86
            r2.<init>(r3)     // Catch: java.lang.Exception -> L86
        L26:
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Exception -> L86
            r3 = 1
            if (r1 == 0) goto L4c
            java.lang.String r4 = ".so"
            boolean r4 = r1.endsWith(r4)     // Catch: java.lang.Exception -> L86
            if (r4 != 0) goto L3d
            java.lang.String r4 = ".jar"
            boolean r4 = r1.endsWith(r4)     // Catch: java.lang.Exception -> L86
            if (r4 == 0) goto L26
        L3d:
            java.lang.String r4 = " "
            int r4 = r1.lastIndexOf(r4)     // Catch: java.lang.Exception -> L86
            int r4 = r4 + r3
            java.lang.String r1 = r1.substring(r4)     // Catch: java.lang.Exception -> L86
            r0.add(r1)     // Catch: java.lang.Exception -> L86
            goto L26
        L4c:
            r2.close()     // Catch: java.lang.Exception -> L86
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L86
        L53:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L86
            if (r1 == 0) goto L86
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L86
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = "636f6d2e73617572696b2e737562737472617465"
            java.lang.String r2 = vv(r2)     // Catch: java.lang.Exception -> L86
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Exception -> L86
            if (r2 == 0) goto L6c
            return r3
        L6c:
            java.lang.String r2 = "58706f7365644272696467652e6a6172"
            java.lang.String r2 = vv(r2)     // Catch: java.lang.Exception -> L86
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Exception -> L86
            if (r2 == 0) goto L79
            return r3
        L79:
            java.lang.String r2 = "6c696273616e64686f6f6b2e656478702e736f"
            java.lang.String r2 = vv(r2)     // Catch: java.lang.Exception -> L86
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Exception -> L86
            if (r1 == 0) goto L53
            return r3
        L86:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.u.u.u():boolean");
    }

    public static boolean vv() {
        Boolean bool = vv;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    public static synchronized void vv(@NonNull Context context) {
        synchronized (u.class) {
            if (vv == null) {
                vv = Boolean.valueOf((m() || m(context) || p(context) || !i(context) || p() || o(context)) ? false : true);
            }
        }
    }

    public static boolean m(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    @WorkerThread
    public static boolean p() {
        try {
            InetAddress.getByName(vv("3132372e302e302e31"));
            new Socket(vv("3132372e302e302e31"), Integer.parseInt(vv("3237303432")));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean i(Context context) {
        int simState;
        try {
            simState = ((TelephonyManager) context.getSystemService("phone")).getSimState();
        } catch (Throwable unused) {
        }
        return (simState == 1 || simState == 0) ? false : true;
    }

    private static String vv(@NonNull String str) {
        return com.ss.android.socialbase.downloader.wv.u.vv(str);
    }

    @WorkerThread
    public static boolean o(Context context) {
        return u() || u(context);
    }

    private static boolean u(Context context) {
        List<String> asList = Arrays.asList(vv("64652e726f62762e616e64726f69642e78706f736564"), vv("636f6d2e746f706a6f686e77752e6d616769736b"), vv("696f2e76612e6578706f736564"), vv("636f6d2e77696e642e636f74746572"), vv("6f72672e6d656f776361742e656478706f7365642e6d616e61676572"), vv("6d652e7765697368752e657870"), vv("636f6d2e73617572696b2e737562737472617465"));
        PackageManager packageManager = context.getPackageManager();
        for (String str : asList) {
            try {
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
            }
            if (packageManager.getPackageInfo(str, 0) != null) {
                return true;
            }
        }
        return false;
    }
}

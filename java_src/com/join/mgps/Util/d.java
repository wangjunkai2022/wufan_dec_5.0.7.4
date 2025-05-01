package com.join.mgps.Util;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.io.File;
import java.io.FileInputStream;
/* compiled from: AntiEmulator.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f27762a = {"/dev/socket/qemud", "/dev/qemu_pipe"};

    /* renamed from: b  reason: collision with root package name */
    private static String[] f27763b = {"goldfish"};

    /* renamed from: c  reason: collision with root package name */
    private static String[] f27764c = {"/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props"};

    /* renamed from: d  reason: collision with root package name */
    private static String[] f27765d = {"15555215554", "15555215556", "15555215558", "15555215560", "15555215562", "15555215564", "15555215566", "15555215568", "15555215570", "15555215572", "15555215574", "15555215576", "15555215578", "15555215580", "15555215582", "15555215584"};

    /* renamed from: e  reason: collision with root package name */
    private static String[] f27766e = {"000000000000000"};

    /* renamed from: f  reason: collision with root package name */
    private static String[] f27767f = {"310260000000000"};

    public static boolean a(Context context) {
        String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        for (String str : f27766e) {
            if (str.equalsIgnoreCase(deviceId)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b() {
        String str = Build.BOARD;
        String str2 = Build.BOOTLOADER;
        String str3 = Build.BRAND;
        String str4 = Build.DEVICE;
        String str5 = Build.HARDWARE;
        String str6 = Build.MODEL;
        String str7 = Build.PRODUCT;
        String str8 = Build.SERIAL;
        return str3.toLowerCase().equals(q.a.f73126a) || str6.toLowerCase().contains(com.umeng.ccg.a.f64025r);
    }

    public static boolean c() {
        int i4 = 0;
        while (true) {
            String[] strArr = f27764c;
            if (i4 >= strArr.length) {
                return false;
            }
            if (new File(strArr[i4]).exists()) {
                return true;
            }
            i4++;
        }
    }

    public static boolean d(Context context) {
        String subscriberId = ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
        for (String str : f27767f) {
            if (str.equalsIgnoreCase(subscriberId)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Context context) {
        String line1Number = ((TelephonyManager) context.getSystemService("phone")).getLine1Number();
        for (String str : f27765d) {
            if (str.equalsIgnoreCase(line1Number)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f() {
        int i4 = 0;
        while (true) {
            String[] strArr = f27762a;
            if (i4 >= strArr.length) {
                return false;
            }
            if (new File(strArr[i4]).exists()) {
                return true;
            }
            i4++;
        }
    }

    public static boolean g() {
        File file = new File("/proc/tty/drivers");
        if (file.exists() && file.canRead()) {
            byte[] bArr = new byte[1024];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                fileInputStream.read(bArr);
                fileInputStream.close();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            String str = new String(bArr);
            for (String str2 : f27763b) {
                if (str.indexOf(str2) != -1) {
                    return true;
                }
            }
        }
        return false;
    }
}

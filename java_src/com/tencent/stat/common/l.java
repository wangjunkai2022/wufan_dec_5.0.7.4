package com.tencent.stat.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new m()).length;
        } catch (Exception e5) {
            e5.printStackTrace();
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b() {
        StatLogger statLogger;
        byte[] bArr;
        int i4 = 0;
        try {
            String str = "";
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            while (inputStream.read(new byte[24]) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
            String trim = str.trim();
            if (trim.length() > 0) {
                i4 = Integer.valueOf(trim).intValue();
            }
        } catch (Exception e5) {
            statLogger = k.f62979f;
            statLogger.e(e5);
        }
        return i4 * 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c() {
        StatLogger statLogger;
        byte[] bArr;
        int i4 = 0;
        try {
            String str = "";
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").start().getInputStream();
            while (inputStream.read(new byte[24]) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
            String trim = str.trim();
            if (trim.length() > 0) {
                i4 = Integer.valueOf(trim).intValue();
            }
        } catch (IOException e5) {
            statLogger = k.f62979f;
            statLogger.e((Exception) e5);
        }
        return i4 * 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d() {
        StatLogger statLogger;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            String[] split = bufferedReader.readLine().split(":\\s+", 2);
            for (int i4 = 0; i4 < split.length; i4++) {
            }
            bufferedReader.close();
            return split[1];
        } catch (Throwable th) {
            statLogger = k.f62979f;
            statLogger.e(th);
            return "";
        }
    }
}

package com.tencent.stat;

import android.content.Context;
import com.tencent.stat.common.StatLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
/* loaded from: classes6.dex */
public class StatNativeCrashReport {
    public static final String PRE_TAG_TOMBSTONE_FNAME = "tombstone_";

    /* renamed from: d  reason: collision with root package name */
    private static boolean f62858d;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f62861c = false;

    /* renamed from: b  reason: collision with root package name */
    private static StatLogger f62857b = com.tencent.stat.common.k.b();

    /* renamed from: a  reason: collision with root package name */
    static StatNativeCrashReport f62856a = new StatNativeCrashReport();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f62859e = false;

    /* renamed from: f  reason: collision with root package name */
    private static String f62860f = null;

    static {
        f62858d = false;
        try {
            System.loadLibrary("MtaNativeCrash");
        } catch (Throwable th) {
            f62858d = false;
            f62857b.w(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append('\n');
            }
            bufferedReader.close();
        } catch (IOException e5) {
            f62857b.e((Exception) e5);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LinkedHashSet<File> a(Context context) {
        File[] listFiles;
        LinkedHashSet<File> linkedHashSet = new LinkedHashSet<>();
        String tombstonesDir = getTombstonesDir(context);
        if (tombstonesDir != null) {
            File file = new File(tombstonesDir);
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.getName().startsWith(PRE_TAG_TOMBSTONE_FNAME) && file2.isFile()) {
                        f62857b.d("get tombstone file:" + file2.getAbsolutePath().toString());
                        linkedHashSet.add(file2.getAbsoluteFile());
                    }
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(File file) {
        try {
            return Long.valueOf(file.getName().replace(PRE_TAG_TOMBSTONE_FNAME, "")).longValue();
        } catch (NumberFormatException e5) {
            f62857b.e((Exception) e5);
            return 0L;
        }
    }

    public static void doNativeCrashTest() {
        f62856a.makeJniCrash();
    }

    public static String getTombstonesDir(Context context) {
        if (f62860f == null) {
            f62860f = com.tencent.stat.common.p.a(context, "__mta_tombstone__", "");
        }
        return f62860f;
    }

    public static void initNativeCrash(Context context, String str) {
        if (f62856a.f62861c) {
            return;
        }
        if (str == null) {
            try {
                str = context.getDir("tombstones", 0).getAbsolutePath();
            } catch (Throwable th) {
                f62857b.w(th);
                return;
            }
        }
        if (str.length() > 128) {
            StatLogger statLogger = f62857b;
            statLogger.e("The length of tombstones dir: " + str + " can't exceeds 200 bytes.");
            return;
        }
        f62860f = str;
        com.tencent.stat.common.p.b(context, "__mta_tombstone__", str);
        setNativeCrashEnable(true);
        f62856a.initJNICrash(str);
        f62856a.f62861c = true;
        f62857b.d("initNativeCrash success.");
    }

    public static boolean isNativeCrashDebugEnable() {
        return f62859e;
    }

    public static boolean isNativeCrashEnable() {
        return f62858d;
    }

    public static String onNativeCrashHappened() {
        try {
            new RuntimeException("MTA has caught a native crash, java stack:\n").printStackTrace();
            return "";
        } catch (RuntimeException e5) {
            return e5.toString();
        }
    }

    public static void setNativeCrashDebugEnable(boolean z4) {
        try {
            f62856a.enableNativeCrashDebug(z4);
            f62859e = z4;
        } catch (Throwable th) {
            f62857b.w(th);
        }
    }

    public static void setNativeCrashEnable(boolean z4) {
        try {
            f62856a.enableNativeCrash(z4);
            f62858d = z4;
        } catch (Throwable th) {
            f62857b.w(th);
        }
    }

    public native void enableNativeCrash(boolean z4);

    public native void enableNativeCrashDebug(boolean z4);

    public native boolean initJNICrash(String str);

    public native String makeJniCrash();

    public native String stringFromJNI();
}

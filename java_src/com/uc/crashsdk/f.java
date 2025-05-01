package com.uc.crashsdk;

import android.util.SparseArray;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.uc.crashsdk.a.h;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f63192a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f63193b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final SparseArray<String> f63194c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private static final Object f63195d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f63196e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i4) {
        a(i4, 1);
    }

    private static boolean b(int i4, int i5) {
        try {
            b.x();
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        try {
            String c5 = c(i4);
            if (c5 == null) {
                com.uc.crashsdk.a.a.a("crashsdk", "Stat type not exists: " + i4, null);
                return false;
            }
            File file = new File(b.c());
            if (!file.exists()) {
                file.createNewFile();
            }
            StringBuffer a5 = a(file);
            if (com.uc.crashsdk.a.g.a(a5)) {
                if (a5 == null) {
                    a5 = new StringBuffer();
                }
                a5.append("[");
                a5.append(e.h());
                a5.append("]\n");
            }
            a(a5, c5, a(a5, c5) + i5);
            return a(file, a5);
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
            return false;
        }
    }

    private static boolean c(String str) {
        if (!com.uc.crashsdk.a.g.a(str) && new File(str).exists()) {
            return a(str, new com.uc.crashsdk.a.e(755, new Object[]{str}));
        }
        return false;
    }

    private static boolean d(String str) {
        if (f63192a || str != null) {
            File file = new File(str);
            StringBuffer a5 = a(file);
            if (com.uc.crashsdk.a.g.a(a5)) {
                return false;
            }
            String a6 = a(a5);
            StringBuffer stringBuffer = null;
            if (a6 != null && a6.length() > 0) {
                SparseArray<String> e5 = e();
                boolean O = g.O();
                if (O) {
                    stringBuffer = new StringBuffer();
                    stringBuffer.append("notifyStatsDetailImpl: processName: ");
                    stringBuffer.append(a6 + "\n");
                }
                boolean z4 = false;
                for (int i4 = 0; i4 < e5.size(); i4++) {
                    try {
                        int keyAt = e5.keyAt(i4);
                        String str2 = e5.get(keyAt);
                        int a7 = a(a5, str2);
                        if (a7 > 0) {
                            if (O) {
                                stringBuffer.append("name: ");
                                stringBuffer.append(str2);
                                stringBuffer.append(", key: ");
                                stringBuffer.append(keyAt);
                                stringBuffer.append(", count: ");
                                stringBuffer.append(a7);
                                stringBuffer.append("\n");
                            }
                            d.a(a6, keyAt, a7);
                            a(a5, str2, 0);
                            z4 = true;
                        }
                    } finally {
                        if (z4) {
                            a(file, a5);
                        }
                    }
                }
                if (O) {
                    com.uc.crashsdk.a.a.a(stringBuffer.toString());
                }
                if (z4) {
                    d.a(a6, 1000000, 0);
                }
                return z4;
            }
            com.uc.crashsdk.a.a.a("crashsdk", "notifyStatsDetailImpl: process name is invalid", null);
            return false;
        }
        throw new AssertionError();
    }

    private static boolean e(String str) {
        if (!com.uc.crashsdk.a.g.a(str) && new File(str).exists()) {
            return a(str, new com.uc.crashsdk.a.e(756, new Object[]{str}));
        }
        return false;
    }

    private static void f() {
        SparseArray<String> sparseArray = f63194c;
        synchronized (sparseArray) {
            if (sparseArray.size() != 0) {
                return;
            }
            sparseArray.put(100, "start_pv");
            sparseArray.put(102, "start_hpv");
            sparseArray.put(1, "all_all");
            sparseArray.put(2, "all_fg");
            sparseArray.put(101, "all_bg");
            sparseArray.put(3, "java_fg");
            sparseArray.put(4, "java_bg");
            sparseArray.put(7, "native_fg");
            sparseArray.put(8, "native_bg");
            sparseArray.put(27, "native_anr_fg");
            sparseArray.put(28, "native_anr_bg");
            sparseArray.put(9, "native_ok");
            sparseArray.put(10, "unexp_anr");
            sparseArray.put(29, "unexp_lowmem");
            sparseArray.put(30, "unexp_killed");
            sparseArray.put(31, "unexp_exit");
            sparseArray.put(32, "unexp_restart");
            sparseArray.put(11, "unexp_fg");
            sparseArray.put(12, "unexp_bg");
            sparseArray.put(40, "anr_fg");
            sparseArray.put(41, "anr_bg");
            sparseArray.put(42, "anr_cr_fg");
            sparseArray.put(43, "anr_cr_bg");
            sparseArray.put(13, "log_up_succ");
            sparseArray.put(14, "log_up_fail");
            sparseArray.put(15, "log_empty");
            sparseArray.put(200, "log_tmp");
            sparseArray.put(16, "log_abd_all");
            sparseArray.put(22, "log_abd_builtin");
            sparseArray.put(23, "log_abd_custom");
            sparseArray.put(17, "log_large");
            sparseArray.put(18, "log_up_all");
            sparseArray.put(19, "log_up_bytes");
            sparseArray.put(20, "log_up_crash");
            sparseArray.put(21, "log_up_custom");
            sparseArray.put(24, "log_zipped");
            sparseArray.put(201, "log_enced");
            sparseArray.put(25, "log_renamed");
            sparseArray.put(26, "log_safe_skip");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i4, int i5) {
        if (i5 == 0) {
            com.uc.crashsdk.a.a.b("Add stat for type " + i4 + " with count 0!");
            return;
        }
        a(b.c(), new com.uc.crashsdk.a.e(751, new Object[]{Integer.valueOf(i4), Integer.valueOf(i5)}));
    }

    private static String c(int i4) {
        String str;
        f();
        SparseArray<String> sparseArray = f63194c;
        synchronized (sparseArray) {
            str = sparseArray.get(i4);
        }
        return str;
    }

    private static SparseArray<String> e() {
        SparseArray<String> clone;
        f();
        SparseArray<String> sparseArray = f63194c;
        synchronized (sparseArray) {
            clone = sparseArray.clone();
        }
        return clone;
    }

    private static StringBuffer a(File file) {
        FileReader fileReader;
        FileReader fileReader2 = null;
        if (file.exists()) {
            char[] d5 = d();
            if (d5 == null) {
                com.uc.crashsdk.a.a.a("crashsdk", "readCrashStatData alloc buffer failed!", null);
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            try {
                try {
                    fileReader = new FileReader(file);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e5) {
                e = e5;
            }
            try {
                int read = fileReader.read(d5);
                if (read > 0) {
                    fileReader2 = null;
                    stringBuffer.append(d5, 0, read);
                }
                com.uc.crashsdk.a.g.a(fileReader);
            } catch (Exception e6) {
                e = e6;
                fileReader2 = fileReader;
                com.uc.crashsdk.a.g.a(e);
                com.uc.crashsdk.a.g.a(fileReader2);
                return stringBuffer;
            } catch (Throwable th2) {
                th = th2;
                fileReader2 = fileReader;
                com.uc.crashsdk.a.g.a(fileReader2);
                throw th;
            }
            return stringBuffer;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(boolean z4) {
        if (g.Q() && !b.L()) {
            e.j();
            if (!h.e()) {
                h.a(z4);
            }
            if (b.F()) {
                d(z4);
                a(b.c(), z4);
                h.b(z4);
            }
        }
    }

    private static String a(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        int indexOf = stringBuffer.indexOf("[");
        if (indexOf < 0) {
            com.uc.crashsdk.a.a.a("crashsdk", "getProcessName: Can not found process name start!", null);
            return null;
        }
        int i4 = indexOf + 1;
        int indexOf2 = stringBuffer.indexOf("]", i4);
        if (indexOf2 < 0) {
            com.uc.crashsdk.a.a.a("crashsdk", "getProcessName: Can not found process name end!", null);
            return null;
        }
        String substring = stringBuffer.substring(i4, indexOf2);
        if (substring.length() <= 0) {
            com.uc.crashsdk.a.a.a("crashsdk", "getProcessName: process name is empty", null);
            return null;
        }
        return substring;
    }

    private static boolean b(String str) {
        File file = new File(str);
        StringBuffer a5 = a(file);
        if (com.uc.crashsdk.a.g.a(a5)) {
            return false;
        }
        String a6 = a(a5);
        StringBuffer stringBuffer = null;
        if (a6 != null && a6.length() > 0) {
            SparseArray<String> e5 = e();
            HashMap hashMap = new HashMap();
            boolean O = g.O();
            if (O) {
                stringBuffer = new StringBuffer();
                stringBuffer.append("reportCrashStatImpl: processName: ");
                stringBuffer.append(a6 + "\n");
            }
            boolean z4 = false;
            for (int i4 = 0; i4 < e5.size(); i4++) {
                try {
                    int keyAt = e5.keyAt(i4);
                    String str2 = e5.get(keyAt);
                    int a7 = a(a5, str2);
                    if (a7 > 0) {
                        if (O) {
                            stringBuffer.append("name: ");
                            stringBuffer.append(str2);
                            stringBuffer.append(", key: ");
                            stringBuffer.append(keyAt);
                            stringBuffer.append(", count: ");
                            stringBuffer.append(a7);
                            stringBuffer.append("\n");
                        }
                        h.a(a6, keyAt, a7);
                        hashMap.put(str2, Integer.valueOf(a7));
                        a(a5, str2, 0);
                        z4 = true;
                    }
                } finally {
                    if (z4) {
                        a(file, a5);
                        if (hashMap.size() > 0) {
                            a(a6, hashMap, b.a(str));
                        }
                    }
                }
            }
            if (O) {
                com.uc.crashsdk.a.a.a(stringBuffer.toString());
            }
            return true;
        }
        com.uc.crashsdk.a.a.a("crashsdk", "reportCrashStatImpl: process name is invalid", null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(700), 3000L);
    }

    private static int a(StringBuffer stringBuffer, String str) {
        int indexOf = stringBuffer.indexOf(str);
        if (indexOf < 0) {
            return 0;
        }
        int indexOf2 = stringBuffer.indexOf(SimpleComparison.EQUAL_TO_OPERATION, indexOf + str.length());
        if (indexOf2 < 0) {
            com.uc.crashsdk.a.a.b(str + " line not contain '='!");
            return 0;
        }
        int i4 = indexOf2 + 1;
        int indexOf3 = stringBuffer.indexOf("\n", i4);
        if (indexOf3 < 0) {
            indexOf3 = stringBuffer.length();
        }
        try {
            int parseInt = Integer.parseInt(stringBuffer.substring(i4, indexOf3));
            if (parseInt < 0) {
                return 0;
            }
            return parseInt;
        } catch (NumberFormatException e5) {
            com.uc.crashsdk.a.g.a(e5);
            return 0;
        }
    }

    private static char[] d() {
        char[] cArr = null;
        int i4 = 1024;
        while (cArr == null && i4 > 0) {
            try {
                cArr = new char[i4];
            } catch (Throwable unused) {
                i4 /= 2;
                if (i4 < 512) {
                    break;
                }
            }
        }
        return cArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a A[Catch: all -> 0x0056, TryCatch #0 {, blocks: (B:7:0x0008, B:9:0x000c, B:11:0x000e, B:13:0x0016, B:15:0x0018, B:17:0x0020, B:19:0x002a, B:27:0x004a, B:28:0x004d, B:29:0x0054, B:21:0x0031, B:23:0x0037, B:25:0x0042), top: B:36:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(boolean r3) {
        /*
            boolean r0 = com.uc.crashsdk.f.f63196e
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Object r0 = com.uc.crashsdk.f.f63195d
            monitor-enter(r0)
            boolean r1 = com.uc.crashsdk.f.f63196e     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return
        Le:
            java.lang.String r1 = "crash detail"
            boolean r3 = com.uc.crashsdk.a.h.a(r3, r1)     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return
        L18:
            r3 = 0
            boolean r1 = com.uc.crashsdk.b.s()     // Catch: java.lang.Throwable -> L56
            r2 = 1
            if (r1 == 0) goto L31
            r3 = 2
            a(r3, r2)     // Catch: java.lang.Throwable -> L56
            boolean r3 = com.uc.crashsdk.b.r()     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L2f
            r3 = 42
            a(r3, r2)     // Catch: java.lang.Throwable -> L56
        L2f:
            r3 = 1
            goto L48
        L31:
            boolean r1 = com.uc.crashsdk.b.t()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L48
            r3 = 101(0x65, float:1.42E-43)
            a(r3, r2)     // Catch: java.lang.Throwable -> L56
            boolean r3 = com.uc.crashsdk.b.r()     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L2f
            r3 = 43
            a(r3, r2)     // Catch: java.lang.Throwable -> L56
            goto L2f
        L48:
            if (r3 == 0) goto L4d
            a(r2, r2)     // Catch: java.lang.Throwable -> L56
        L4d:
            r3 = 100
            a(r3, r2)     // Catch: java.lang.Throwable -> L56
            com.uc.crashsdk.f.f63196e = r2     // Catch: java.lang.Throwable -> L56
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return
        L56:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            goto L5a
        L59:
            throw r3
        L5a:
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.d(boolean):void");
    }

    private static void a(StringBuffer stringBuffer, String str, int i4) {
        int indexOf = stringBuffer.indexOf(str);
        if (indexOf < 0) {
            if (i4 > 0) {
                stringBuffer.append(str);
                stringBuffer.append(SimpleComparison.EQUAL_TO_OPERATION);
                stringBuffer.append(i4);
                stringBuffer.append("\n");
                return;
            }
            return;
        }
        int indexOf2 = stringBuffer.indexOf("\n", indexOf);
        if (indexOf2 < 0) {
            indexOf2 = stringBuffer.length();
        }
        stringBuffer.replace(indexOf, indexOf2, str + SimpleComparison.EQUAL_TO_OPERATION + String.valueOf(i4));
    }

    private static boolean a(File file, StringBuffer stringBuffer) {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(file);
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            String stringBuffer2 = stringBuffer.toString();
            fileWriter.write(stringBuffer2, 0, stringBuffer2.length());
            com.uc.crashsdk.a.g.a(fileWriter);
            return true;
        } catch (Exception e6) {
            e = e6;
            fileWriter2 = fileWriter;
            com.uc.crashsdk.a.g.a(e);
            com.uc.crashsdk.a.g.a(fileWriter2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            com.uc.crashsdk.a.g.a(fileWriter2);
            throw th;
        }
    }

    private static void a(String str, HashMap<String, Integer> hashMap, String str2) {
        if (hashMap.size() <= 0) {
            return;
        }
        if (com.uc.crashsdk.a.g.a(str)) {
            com.uc.crashsdk.a.a.a("crashsdk", "cacheReportedStatsForCallback: processName is null", null);
        } else if (com.uc.crashsdk.a.g.a(str2)) {
            com.uc.crashsdk.a.a.a("crashsdk", "cacheReportedStatsForCallback: callbackCacheFilePathName is null", null);
        } else {
            a(str2, new com.uc.crashsdk.a.e(754, new Object[]{str, hashMap, str2}));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(boolean z4) {
        if (z4) {
            return c(b.e()) ? 1 : 0;
        }
        File[] f5 = b.f();
        if (f5 != null) {
            int i4 = 0;
            for (File file : f5) {
                if (c(file.getAbsolutePath())) {
                    i4++;
                }
            }
            return i4;
        }
        return 0;
    }

    private static void b(String str, HashMap<String, Integer> hashMap, String str2) {
        try {
            b.x();
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        try {
            File file = new File(str2);
            if (!file.exists()) {
                file.createNewFile();
            }
            StringBuffer a5 = a(file);
            if (com.uc.crashsdk.a.g.a(a5)) {
                if (a5 == null) {
                    a5 = new StringBuffer();
                }
                a5.append("[");
                a5.append(str);
                a5.append("]\n");
            }
            boolean z4 = false;
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                int intValue = entry.getValue().intValue();
                if (intValue > 0) {
                    String key = entry.getKey();
                    a(a5, key, intValue + a(a5, key));
                    z4 = true;
                }
            }
            if (z4) {
                a(file, a5);
            }
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
        }
    }

    private static boolean a(String str, com.uc.crashsdk.a.e eVar) {
        return b.a(f63193b, str, eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str, boolean z4) {
        if (h.a(z4, "crash detail report")) {
            return false;
        }
        return a(str, new com.uc.crashsdk.a.e(752, new Object[]{str}));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a() {
        File[] d5 = b.d();
        if (d5 != null) {
            int i4 = 0;
            for (File file : d5) {
                if (a(file.getAbsolutePath(), false)) {
                    i4++;
                }
            }
            return i4;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        return a(str, new com.uc.crashsdk.a.e(753, new Object[]{str}));
    }

    public static boolean a(int i4, Object[] objArr) {
        switch (i4) {
            case 751:
                if (f63192a || objArr != null) {
                    return b(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
                }
                throw new AssertionError();
            case 752:
                if (f63192a || objArr != null) {
                    return b((String) objArr[0]);
                }
                throw new AssertionError();
            case 753:
                if (f63192a || objArr != null) {
                    File file = new File((String) objArr[0]);
                    if (file.exists()) {
                        file.delete();
                        return true;
                    }
                    return false;
                }
                throw new AssertionError();
            case 754:
                if (f63192a || objArr != null) {
                    b((String) objArr[0], (HashMap) objArr[1], (String) objArr[2]);
                    return true;
                }
                throw new AssertionError();
            case 755:
                if (f63192a || objArr != null) {
                    return d((String) objArr[0]);
                }
                throw new AssertionError();
            case 756:
                if (f63192a || objArr != null) {
                    File file2 = new File((String) objArr[0]);
                    if (file2.exists()) {
                        file2.delete();
                        return true;
                    }
                    return false;
                }
                throw new AssertionError();
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(boolean z4) {
        if (z4) {
            return e(b.e()) ? 1 : 0;
        }
        File[] f5 = b.f();
        if (f5 != null) {
            int i4 = 0;
            for (File file : f5) {
                if (e(file.getAbsolutePath())) {
                    i4++;
                }
            }
            return i4;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b() {
        File[] d5 = b.d();
        if (d5 != null) {
            int i4 = 0;
            for (File file : d5) {
                if (a(file.getAbsolutePath())) {
                    i4++;
                }
            }
            return i4;
        }
        return 0;
    }

    public static void b(int i4) {
        if (i4 != 700) {
            return;
        }
        d(false);
    }
}

package com.uc.crashsdk;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Debug;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StatFs;
import android.os.StrictMode;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.join.mgps.activity.SimulatorExitPlayActivity_;
import com.kuaishou.weapon.p0.bi;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.export.LogType;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e implements Thread.UncaughtExceptionHandler {

    /* renamed from: b  reason: collision with root package name */
    private static long f63151b;

    /* renamed from: i  reason: collision with root package name */
    private static String f63157i;

    /* renamed from: e  reason: collision with root package name */
    private final List<FileInputStream> f63175e = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f63150a = true;

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicBoolean f63152c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static boolean f63153d = false;

    /* renamed from: f  reason: collision with root package name */
    private static long f63154f = 0;

    /* renamed from: g  reason: collision with root package name */
    private static long f63155g = -1;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f63156h = true;

    /* renamed from: j  reason: collision with root package name */
    private static String f63158j = "";

    /* renamed from: k  reason: collision with root package name */
    private static String f63159k = null;

    /* renamed from: l  reason: collision with root package name */
    private static String f63160l = null;

    /* renamed from: m  reason: collision with root package name */
    private static String f63161m = null;

    /* renamed from: n  reason: collision with root package name */
    private static final Object f63162n = new Object();

    /* renamed from: o  reason: collision with root package name */
    private static final ConditionVariable f63163o = new ConditionVariable();

    /* renamed from: p  reason: collision with root package name */
    private static final Object f63164p = new Object();

    /* renamed from: q  reason: collision with root package name */
    private static final Object f63165q = new Object();

    /* renamed from: r  reason: collision with root package name */
    private static final Object f63166r = new Object();

    /* renamed from: s  reason: collision with root package name */
    private static final ArrayList<String> f63167s = new ArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    private static int f63168t = 0;

    /* renamed from: u  reason: collision with root package name */
    private static String f63169u = null;

    /* renamed from: v  reason: collision with root package name */
    private static boolean f63170v = false;

    /* renamed from: w  reason: collision with root package name */
    private static String f63171w = null;

    /* renamed from: x  reason: collision with root package name */
    private static String f63172x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final Object f63173y = new Object();

    /* renamed from: z  reason: collision with root package name */
    private static final Object f63174z = new Object();
    private static Map<String, Integer> A = null;
    private static String B = null;
    private static int C = -1;
    private static int D = -1;
    private static int E = -1;
    private static int F = -1;
    private static int G = -1;
    private static int H = -1;
    private static int I = -1;
    private static String J = "?";
    private static boolean K = false;
    private static boolean L = false;
    private static int M = 0;
    private static int N = 0;
    private static boolean O = false;
    private static com.uc.crashsdk.a.e P = new com.uc.crashsdk.a.e(405);
    private static c Q = new c((byte) 0);
    private static boolean R = false;
    private static final com.uc.crashsdk.a.e S = new com.uc.crashsdk.a.e(TTAdConstant.IMAGE_URL_CODE);
    private static Thread.UncaughtExceptionHandler T = null;
    private static Throwable U = null;
    private static boolean V = false;
    private static boolean W = false;
    private static Runnable X = null;
    private static final Object Y = new Object();
    private static int Z = 101;
    private static Runnable aa = new com.uc.crashsdk.a.e(407);
    private static final Object ab = new Object();
    private static volatile boolean ac = false;
    private static Object ad = new Object();
    private static ParcelFileDescriptor ae = null;
    private static boolean af = false;
    private static boolean ag = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b implements Comparator<File> {
        private b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            File file3 = file;
            File file4 = file2;
            if (file3.lastModified() > file4.lastModified()) {
                return 1;
            }
            return file3.lastModified() < file4.lastModified() ? -1 : 0;
        }

        /* synthetic */ b(byte b5) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                int unused = e.C = intent.getIntExtra(SimulatorExitPlayActivity_.O, -1);
                int unused2 = e.D = intent.getIntExtra("scale", -1);
                int unused3 = e.E = intent.getIntExtra("voltage", -1);
                int unused4 = e.F = intent.getIntExtra("health", -1);
                int unused5 = e.G = intent.getIntExtra("plugged", -1);
                int unused6 = e.H = intent.getIntExtra("status", -1);
                int unused7 = e.I = intent.getIntExtra("temperature", -1);
                String unused8 = e.J = intent.getStringExtra("technology");
                if (e.J() >= 2) {
                    e.K();
                    e.L();
                }
            } else if ("android.intent.action.BATTERY_LOW".equals(action) || "android.intent.action.BATTERY_OKAY".equals(action)) {
                boolean unused9 = e.K = "android.intent.action.BATTERY_LOW".equals(action);
                e.K();
            } else if ("android.intent.action.ANR".equals(action)) {
                try {
                    e.d(context);
                } catch (Throwable th) {
                    com.uc.crashsdk.a.g.a(th);
                }
            }
        }

        /* synthetic */ c(byte b5) {
            this();
        }
    }

    public e() {
        try {
            M();
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    public static void A() {
        if (g.q()) {
            com.uc.crashsdk.a.f.a(0, new com.uc.crashsdk.a.e(403), com.join.mgps.data.c.f49010a);
        }
    }

    public static void B() {
        if (ac || com.uc.crashsdk.b.L()) {
            return;
        }
        com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(TTAdConstant.INTERACTION_TYPE_CODE), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void C() {
        com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(TTAdConstant.IMAGE_LIST_CODE), 7000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        if ((java.lang.System.currentTimeMillis() % 3) == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r0 == 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void D() {
        /*
            int r0 = com.uc.crashsdk.g.N()
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L13
            if (r0 == r2) goto L13
            if (r0 != r1) goto Lf
            goto L13
        Lf:
            if (r0 != r3) goto L43
        L11:
            r3 = 0
            goto L43
        L13:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 21
            if (r5 < r6) goto L43
            r6 = 25
            if (r5 > r6) goto L43
            if (r0 != 0) goto L21
            r5 = 0
            goto L22
        L21:
            r5 = 1
        L22:
            r6 = 0
            if (r0 != r2) goto L34
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 10
            long r8 = r8 % r10
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 != 0) goto L33
            r5 = 1
            goto L34
        L33:
            r5 = 0
        L34:
            if (r0 != r1) goto L42
            long r0 = java.lang.System.currentTimeMillis()
            r8 = 3
            long r0 = r0 % r8
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L11
            goto L43
        L42:
            r3 = r5
        L43:
            if (r3 != 0) goto L4c
            java.lang.String r0 = "crashsdk"
            java.lang.String r1 = "SIG 3 is disabled by settings"
            com.uc.crashsdk.a.a.a(r0, r1)
        L4c:
            boolean r0 = com.uc.crashsdk.b.L()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r1 == r2) goto L68
            if (r3 == 0) goto L68
            r1 = 2
            com.uc.crashsdk.a.e r2 = new com.uc.crashsdk.a.e
            r3 = 413(0x19d, float:5.79E-43)
            r2.<init>(r3)
            com.uc.crashsdk.a.f.a(r1, r2)
            goto L69
        L68:
            r4 = r3
        L69:
            r1 = 7
            long r2 = (long) r0
            r0 = 0
            com.uc.crashsdk.JNIBridge.nativeCmd(r1, r2, r0, r0)
            if (r4 == 0) goto L76
            r0 = 8
            com.uc.crashsdk.JNIBridge.cmd(r0)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.D():void");
    }

    public static ParcelFileDescriptor E() {
        if (!com.uc.crashsdk.b.f63118d) {
            com.uc.crashsdk.a.a.d("crashsdk", "Crash so is not loaded!");
            return null;
        }
        synchronized (ad) {
            ParcelFileDescriptor parcelFileDescriptor = ae;
            if (parcelFileDescriptor != null) {
                return parcelFileDescriptor;
            }
            int cmd = (int) JNIBridge.cmd(14);
            if (cmd == -1) {
                return null;
            }
            ParcelFileDescriptor adoptFd = ParcelFileDescriptor.adoptFd(cmd);
            ae = adoptFd;
            af = true;
            return adoptFd;
        }
    }

    public static boolean F() {
        return ag;
    }

    public static void G() {
        String X2 = g.X();
        File file = new File(X2);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                com.uc.crashsdk.a.a.b("Ucebu can not list folder: " + X2);
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.getName().contains("ucebu")) {
                    a(false, false);
                    return;
                }
            }
        }
    }

    static /* synthetic */ boolean I() {
        return O();
    }

    static /* synthetic */ int J() {
        int i4 = M + 1;
        M = i4;
        return i4;
    }

    static /* synthetic */ void K() {
        StringBuilder Y2;
        if (com.uc.crashsdk.b.f63118d && (Y2 = Y()) != null) {
            JNIBridge.set(125, Y2.toString());
        }
        L = true;
        Z();
    }

    static /* synthetic */ int L() {
        M = 0;
        return 0;
    }

    private void M() {
        int I2 = g.I();
        for (int i4 = 0; i4 < I2; i4++) {
            try {
                this.f63175e.add(new FileInputStream("/dev/null"));
            } catch (Exception e5) {
                com.uc.crashsdk.a.g.a(e5);
                return;
            }
        }
    }

    private void N() {
        for (FileInputStream fileInputStream : this.f63175e) {
            com.uc.crashsdk.a.g.a(fileInputStream);
        }
        this.f63175e.clear();
    }

    private static boolean O() {
        if (g.P()) {
            return true;
        }
        return a();
    }

    private static String P() {
        return g.e() + "_";
    }

    private static String Q() {
        return com.uc.crashsdk.b.B() ? "fg" : "bg";
    }

    private static byte[] R() {
        byte[] bArr = null;
        int i4 = 1024;
        while (bArr == null && i4 > 0) {
            try {
                bArr = new byte[i4];
            } catch (Throwable unused) {
                i4 /= 2;
                if (i4 < 16) {
                    break;
                }
            }
        }
        return bArr;
    }

    private static String S() {
        return (!com.uc.crashsdk.b.F() || f63153d) ? LogType.JAVA_TYPE : "ucebujava";
    }

    private static void T() {
        String str;
        BufferedReader bufferedReader;
        Throwable th;
        FileReader fileReader;
        String str2 = "-";
        try {
            str = Build.HARDWARE;
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
            str = "-";
        }
        try {
            fileReader = new FileReader(new File("/proc/cpuinfo"));
            try {
                bufferedReader = new BufferedReader(fileReader, 512);
                int i4 = 0;
                do {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.startsWith("Hardware")) {
                            str = readLine.substring(readLine.indexOf(":") + 1).trim();
                        } else if (readLine.startsWith("Processor")) {
                            str2 = readLine.substring(readLine.indexOf(":") + 1).trim();
                        }
                        i4++;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            com.uc.crashsdk.a.g.a(th);
                            com.uc.crashsdk.a.g.a(fileReader);
                            com.uc.crashsdk.a.g.a(bufferedReader);
                            f63159k = str;
                            f63160l = str2;
                        } catch (Throwable th4) {
                            com.uc.crashsdk.a.g.a(fileReader);
                            com.uc.crashsdk.a.g.a(bufferedReader);
                            throw th4;
                        }
                    }
                } while (i4 < 2);
                com.uc.crashsdk.a.g.a(fileReader);
            } catch (Throwable th5) {
                bufferedReader = null;
                th = th5;
            }
        } catch (Throwable th6) {
            bufferedReader = null;
            th = th6;
            fileReader = null;
        }
        com.uc.crashsdk.a.g.a(bufferedReader);
        f63159k = str;
        f63160l = str2;
    }

    private static String U() {
        return g.W() + "bytes";
    }

    private static boolean V() {
        return Build.VERSION.SDK_INT < 29;
    }

    private static void W() {
        if (O || com.uc.crashsdk.b.F() || com.uc.crashsdk.b.L()) {
            return;
        }
        JNIBridge.cmd(18);
    }

    private static void X() {
        com.uc.crashsdk.a.f.a(3, new com.uc.crashsdk.a.e(TTAdConstant.VIDEO_URL_CODE), 1000L);
    }

    private static StringBuilder Y() {
        String str;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("level: ");
            sb.append(C);
            sb.append("\n");
            sb.append("scale: ");
            sb.append(D);
            sb.append("\n");
            switch (F) {
                case 1:
                    str = " (Unknown)";
                    break;
                case 2:
                    str = " (Good)";
                    break;
                case 3:
                    str = " (Overheat)";
                    break;
                case 4:
                    str = " (Dead)";
                    break;
                case 5:
                    str = " (Over voltage)";
                    break;
                case 6:
                    str = " (Unspecified failure)";
                    break;
                case 7:
                    str = " (Cold)";
                    break;
                default:
                    str = " (?)";
                    break;
            }
            sb.append("health: ");
            sb.append(F);
            sb.append(str);
            sb.append("\n");
            int i4 = G;
            String str2 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 4 ? " (?)" : " (Wireless)" : " (USB port)" : " (AC charger)" : " (None)";
            sb.append("pluged: ");
            sb.append(G);
            sb.append(str2);
            sb.append("\n");
            int i5 = H;
            String str3 = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? " (?)" : " (Full)" : " (Not charging)" : " (Discharging)" : " (Charging)" : " (Unknown)";
            sb.append("status: ");
            sb.append(H);
            sb.append(str3);
            sb.append("\n");
            sb.append("voltage: ");
            sb.append(E);
            sb.append("\n");
            sb.append("temperature: ");
            sb.append(I);
            sb.append("\n");
            sb.append("technology: ");
            sb.append(J);
            sb.append("\n");
            sb.append("battery low: ");
            sb.append(K);
            sb.append("\n");
            return sb;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return null;
        }
    }

    private static void Z() {
        if (com.uc.crashsdk.b.f63117c && L && com.uc.crashsdk.a.f63037c) {
            L = false;
            if (com.uc.crashsdk.a.f.b(P)) {
                return;
            }
            com.uc.crashsdk.a.f.a(0, P, 2000L);
        }
    }

    public static boolean a() {
        if (f63154f == 0) {
            f63154f = 2L;
            if (h(com.uc.crashsdk.b.b("logs")) == 1) {
                f63154f = 1L;
            }
        }
        return f63154f == 1;
    }

    private static boolean aa() {
        return com.uc.crashsdk.b.f63118d && JNIBridge.nativeIsCrashing();
    }

    private static void ab() {
        String Y2 = g.Y();
        File file = new File(Y2);
        if (file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 150) {
                    Arrays.sort(listFiles, new b((byte) 0));
                    int length = listFiles.length - 150;
                    int i4 = length < 0 ? 0 : length;
                    long currentTimeMillis = System.currentTimeMillis();
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < listFiles.length) {
                        File file2 = listFiles[i5];
                        boolean z4 = i5 < i4;
                        if (!z4 && currentTimeMillis - file2.lastModified() >= 432000000) {
                            z4 = true;
                        }
                        if (!z4) {
                            break;
                        }
                        file2.delete();
                        i6++;
                        if (0 >= 3) {
                            break;
                        }
                        i5++;
                    }
                    com.uc.crashsdk.a.a.a("Removed " + i6 + " logs in " + Y2);
                }
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b() {
        if (f63155g == -1) {
            f63155g = h(com.uc.crashsdk.b.b("local"));
        }
        return f63155g;
    }

    private static String j(String str) {
        if (str == null) {
            str = String.valueOf(System.currentTimeMillis()) + new Random().nextInt(65536);
        }
        return String.format(Locale.US, "%s%s_%s_%s_%s_%s_", P(), g.T(), g.V(), i(Build.MODEL), i(Build.VERSION.RELEASE), str);
    }

    private static String k(String str) {
        return String.format(Locale.US, "%s%s_%s_%s.log", d(), n(), Q(), str);
    }

    private static String l(String str) {
        if (com.uc.crashsdk.a.g.b(str)) {
            int indexOf = str.indexOf(0);
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
            return str.trim();
        }
        return "";
    }

    private static String m(String str) {
        String a5 = com.uc.crashsdk.a.b.a(str, g.w(), g.v());
        if (!str.equals(a5)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
        return a5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r7.endsWith(r3) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
        if (r7.indexOf(".log", r7.lastIndexOf(95)) != r7.lastIndexOf(".log")) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean[] n(java.lang.String r7) {
        /*
            boolean r0 = com.uc.crashsdk.g.v()
            boolean r1 = com.uc.crashsdk.g.x()
            r2 = 0
            if (r0 != 0) goto Ld
            if (r1 == 0) goto L6d
        Ld:
            java.lang.String r3 = ".tmp"
            boolean r3 = r7.endsWith(r3)
            if (r3 != 0) goto L6b
            java.lang.String r3 = ".ec"
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L1e
            goto L6b
        L1e:
            char r3 = java.io.File.separatorChar
            int r3 = r7.lastIndexOf(r3)
            if (r3 >= 0) goto L27
            r3 = 0
        L27:
            r4 = 0
        L28:
            r5 = 95
            int r3 = r7.indexOf(r5, r3)
            if (r3 < 0) goto L34
            int r4 = r4 + 1
            int r3 = r3 + 1
        L34:
            if (r3 >= 0) goto L28
            r3 = 8
            if (r4 == r3) goto L3b
            goto L6b
        L3b:
            java.lang.String r3 = com.uc.crashsdk.g.w()
            java.lang.String r4 = ".log"
            boolean r6 = r7.endsWith(r4)
            if (r6 != 0) goto L54
            boolean r0 = com.uc.crashsdk.a.g.a(r3)
            if (r0 != 0) goto L6b
            boolean r7 = r7.endsWith(r3)
            if (r7 != 0) goto L5a
            goto L6b
        L54:
            boolean r3 = com.uc.crashsdk.a.g.a(r3)
            if (r3 == 0) goto L5c
        L5a:
            r0 = 0
            goto L6d
        L5c:
            int r3 = r7.lastIndexOf(r5)
            int r3 = r7.indexOf(r4, r3)
            int r7 = r7.lastIndexOf(r4)
            if (r3 == r7) goto L6d
            goto L5a
        L6b:
            r0 = 0
            r1 = 0
        L6d:
            r7 = 2
            boolean[] r7 = new boolean[r7]
            r7[r2] = r0
            r0 = 1
            r7[r0] = r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.n(java.lang.String):boolean[]");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:3|4|(3:6|(3:9|(1:11)(17:12|13|14|(13:48|49|18|(1:47)(1:21)|22|(1:24)|25|26|27|29|30|31|32)(1:16)|17|18|(0)|47|22|(0)|25|26|27|29|30|31|32)|7)|53)|54|(0)|25|26|27|29|30|31|32) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(3:6|(3:9|(1:11)(17:12|13|14|(13:48|49|18|(1:47)(1:21)|22|(1:24)|25|26|27|29|30|31|32)(1:16)|17|18|(0)|47|22|(0)|25|26|27|29|30|31|32)|7)|53)|26|27|29|30|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e2, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
        com.uc.crashsdk.a.g.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
        com.uc.crashsdk.a.g.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[Catch: all -> 0x00ee, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0005, B:6:0x0033, B:7:0x0041, B:9:0x0047, B:11:0x0051, B:12:0x0056, B:15:0x0068, B:21:0x0078, B:26:0x0083, B:29:0x00ae, B:33:0x00d5, B:44:0x00e8, B:46:0x00ea, B:47:0x00ed, B:43:0x00e5, B:18:0x0072), top: B:53:0x0005, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean o(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.o(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[Catch: all -> 0x0106, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:7:0x0018, B:9:0x0023, B:10:0x002d, B:38:0x00ae, B:49:0x00d3, B:56:0x00ee, B:52:0x00de, B:63:0x00fa, B:66:0x0104, B:11:0x0033, B:13:0x003b, B:14:0x0044, B:16:0x004c, B:18:0x0054, B:20:0x005c, B:26:0x006a, B:28:0x0074, B:30:0x0081, B:32:0x008b, B:33:0x0096, B:35:0x00a0), top: B:73:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[Catch: all -> 0x0106, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:7:0x0018, B:9:0x0023, B:10:0x002d, B:38:0x00ae, B:49:0x00d3, B:56:0x00ee, B:52:0x00de, B:63:0x00fa, B:66:0x0104, B:11:0x0033, B:13:0x003b, B:14:0x0044, B:16:0x004c, B:18:0x0054, B:20:0x005c, B:26:0x006a, B:28:0x0074, B:30:0x0081, B:32:0x008b, B:33:0x0096, B:35:0x00a0), top: B:73:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean p(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.p(java.lang.String):boolean");
    }

    private static Map<String, Integer> q(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("\\|", 30)) {
            String[] split = str2.split(":", 3);
            if (split.length == 2) {
                String trim = split[0].trim();
                if (!com.uc.crashsdk.a.g.a(trim)) {
                    int i4 = 1;
                    try {
                        i4 = Integer.parseInt(split[1].trim(), 10);
                    } catch (Throwable th) {
                        com.uc.crashsdk.a.g.a(th);
                    }
                    hashMap.put(trim, Integer.valueOf(i4));
                }
            }
        }
        return hashMap;
    }

    private static void r(String str) {
        if (g.q()) {
            try {
                ab();
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
            if (str == null || "".equals(str)) {
                return;
            }
            try {
                File file = new File(g.Y());
                if (!file.exists()) {
                    file.mkdirs();
                }
                com.uc.crashsdk.a.a.a("crashsdk", "copy log to: " + file);
                com.uc.crashsdk.a.g.a(new File(str), file);
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
        }
    }

    private static String s(String str) {
        return String.format("$^%s^$", str);
    }

    public static void t() {
        Thread.setDefaultUncaughtExceptionHandler(T);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u() {
        return f63152c.get() || aa();
    }

    public static Throwable v() {
        return U;
    }

    public static int w() {
        if (com.uc.crashsdk.b.I() == 5) {
            return Z;
        }
        return 100;
    }

    public static void x() {
        long o4 = g.o();
        if (o4 < 0) {
            return;
        }
        boolean z4 = com.uc.crashsdk.b.I() == 5;
        com.uc.crashsdk.a.f.a(0, new com.uc.crashsdk.a.e(401));
        if (z4) {
            com.uc.crashsdk.a.e eVar = new com.uc.crashsdk.a.e(402);
            X = eVar;
            com.uc.crashsdk.a.f.a(0, eVar, o4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void y() {
        if (com.uc.crashsdk.b.f63117c && com.uc.crashsdk.a.f63037c && !com.uc.crashsdk.a.f.b(aa)) {
            com.uc.crashsdk.a.f.a(0, aa, 1000L);
        }
    }

    public static boolean z() {
        synchronized (Y) {
            Runnable runnable = X;
            if (runnable == null || W) {
                return false;
            }
            com.uc.crashsdk.a.f.a(runnable);
            X = null;
            return true;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        a(thread, th, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d() {
        String str = f63157i;
        if (str != null) {
            return str;
        }
        String j4 = j(null);
        f63157i = j4;
        return j4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:30|(2:32|33)|34|35|36|(1:40)|41|(1:45)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0141, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0142, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #1 {all -> 0x00d1, blocks: (B:37:0x0098, B:39:0x00ad), top: B:67:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:49:0x00d8, B:51:0x00de, B:53:0x00e6, B:54:0x010c, B:56:0x0112, B:58:0x011a), top: B:65:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:49:0x00d8, B:51:0x00de, B:53:0x00e6, B:54:0x010c, B:56:0x0112, B:58:0x011a), top: B:65:0x00d8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.e():java.lang.String");
    }

    public static String f() {
        if (com.uc.crashsdk.a.g.a(f63159k)) {
            T();
        }
        return f63159k;
    }

    private static long h(String str) {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("getLong", String.class, Long.TYPE);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return ((Long) declaredMethod.invoke(null, str, 0L)).longValue();
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        return 0L;
    }

    private static String i(String str) {
        try {
            return str.replaceAll("[^0-9a-zA-Z-.]", "-");
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static void s() {
        T = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        f63157i = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i() {
        return f63153d;
    }

    public static boolean b(int i4, Object[] objArr) {
        if (i4 == 451) {
            if (f63150a || objArr != null) {
                return a((String) objArr[0], (d) objArr[1]);
            }
            throw new AssertionError();
        } else if (i4 != 452) {
            if (f63150a) {
                return false;
            }
            throw new AssertionError();
        } else if (f63150a || objArr != null) {
            d dVar = (d) objArr[1];
            return com.uc.crashsdk.a.g.a(new File((String) objArr[0]), String.format(Locale.US, "%d %d %d %d", Long.valueOf(dVar.f63181a), Long.valueOf(dVar.f63182b), Integer.valueOf(dVar.f63183c), Integer.valueOf(dVar.f63184d)).getBytes());
        } else {
            throw new AssertionError();
        }
    }

    private static void c(OutputStream outputStream) {
        if (com.uc.crashsdk.b.f63118d) {
            String o4 = com.uc.crashsdk.b.o();
            f63156h = false;
            if (1 == JNIBridge.cmd(17, o4)) {
                File file = new File(o4);
                try {
                    byte[] e5 = com.uc.crashsdk.a.g.e(file);
                    if (e5 != null) {
                        outputStream.write(e5);
                    }
                } catch (Throwable th) {
                    a(th, outputStream);
                }
                try {
                    file.delete();
                } catch (Throwable th2) {
                    a(th2, outputStream);
                }
                f63156h = true;
                a(outputStream);
            }
            f63156h = true;
            return;
        }
        File[] fileArr = null;
        int i4 = 900;
        try {
            i4 = g.J();
            fileArr = new File("/proc/self/fd").listFiles();
            if (fileArr != null) {
                outputStream.write(String.format(Locale.US, "opened file count: %d, write limit: %d.\n", Integer.valueOf(fileArr.length), Integer.valueOf(i4)).getBytes("UTF-8"));
            } else {
                outputStream.write("[DEBUG] listFiles failed!\n".getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            a(th3, outputStream);
        }
        if (fileArr != null) {
            try {
                if (fileArr.length >= i4) {
                    outputStream.write("opened files:\n".getBytes("UTF-8"));
                    StringBuilder sb = new StringBuilder();
                    for (File file2 : fileArr) {
                        sb.append(file2.getName());
                        sb.append(" -> ");
                        sb.append(file2.getCanonicalPath());
                        sb.append("\n");
                    }
                    outputStream.write(sb.toString().getBytes("UTF-8"));
                }
            } catch (Throwable th4) {
                a(th4, outputStream);
            }
        }
        a(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("JavaMax:    ");
            sb.append(Runtime.getRuntime().maxMemory() / 1024);
            sb.append(" kB\n");
            sb.append("JavaTotal:  ");
            sb.append(Runtime.getRuntime().totalMemory() / 1024);
            sb.append(" kB\n");
            sb.append("JavaFree:   ");
            sb.append(Runtime.getRuntime().freeMemory() / 1024);
            sb.append(" kB\n");
            sb.append("NativeHeap: ");
            sb.append(Debug.getNativeHeapSize() / 1024);
            sb.append(" kB\n");
            sb.append("NativeAllocated: ");
            sb.append(Debug.getNativeHeapAllocatedSize() / 1024);
            sb.append(" kB\n");
            sb.append("NativeFree: ");
            sb.append(Debug.getNativeHeapFreeSize() / 1024);
            sb.append(" kB\n");
            ActivityManager activityManager = (ActivityManager) com.uc.crashsdk.a.g.a().getSystemService(TTDownloadField.TT_ACTIVITY);
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                sb.append("availMem:   ");
                sb.append(memoryInfo.availMem / 1024);
                sb.append(" kB\n");
                sb.append("threshold:  ");
                sb.append(memoryInfo.threshold / 1024);
                sb.append(" kB\n");
                sb.append("lowMemory:  ");
                sb.append(memoryInfo.lowMemory);
                sb.append("\n");
            }
            return sb.toString();
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(java.io.OutputStream r12) {
        /*
            java.lang.String r0 = "UTF-8"
            r1 = 0
            r2 = 0
            int r3 = com.uc.crashsdk.g.K()     // Catch: java.lang.Throwable -> L1c
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "/proc/self/task"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            java.io.File[] r2 = r4.listFiles()     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L16
            return
        L16:
            int r4 = r2.length     // Catch: java.lang.Throwable -> L1a
            if (r4 >= r3) goto L23
            return
        L1a:
            r4 = move-exception
            goto L1f
        L1c:
            r4 = move-exception
            r3 = 300(0x12c, float:4.2E-43)
        L1f:
            com.uc.crashsdk.a.g.a(r4)
            r4 = 0
        L23:
            if (r2 != 0) goto L26
            return
        L26:
            java.lang.String r5 = "threads info:\n"
            byte[] r5 = r5.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r5)     // Catch: java.lang.Throwable -> L8e
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = "threads count: %d, dump limit: %d.\n"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L8e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L8e
            r8[r1] = r4     // Catch: java.lang.Throwable -> L8e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L8e
            r4 = 1
            r8[r4] = r3     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = java.lang.String.format(r5, r6, r8)     // Catch: java.lang.Throwable -> L8e
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = " tid     name\n"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r3)     // Catch: java.lang.Throwable -> L8e
            int r3 = r2.length     // Catch: java.lang.Throwable -> L8e
            r5 = 0
        L59:
            if (r5 >= r3) goto L92
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L8e
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L8e
            java.lang.String r9 = r6.getPath()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r10 = "comm"
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> L8e
            r9 = 128(0x80, float:1.794E-43)
            java.lang.String r8 = com.uc.crashsdk.a.g.a(r8, r9, r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r8 = l(r8)     // Catch: java.lang.Throwable -> L8e
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Throwable -> L8e
            java.lang.String r10 = "%5s %s\n"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L8e
            r11[r1] = r6     // Catch: java.lang.Throwable -> L8e
            r11[r4] = r8     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = java.lang.String.format(r9, r10, r11)     // Catch: java.lang.Throwable -> L8e
            byte[] r6 = r6.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r6)     // Catch: java.lang.Throwable -> L8e
            int r5 = r5 + 1
            goto L59
        L8e:
            r0 = move-exception
            a(r0, r12)
        L92:
            a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.d(java.io.OutputStream):void");
    }

    private static void f(OutputStream outputStream) {
        String m4;
        try {
            outputStream.write("recent status:\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            a(th, outputStream);
        }
        try {
            if (ag) {
                m4 = s("LASTVER");
            } else {
                m4 = com.uc.crashsdk.a.m();
            }
            outputStream.write(String.format(Locale.US, "last version: '%s'\n", m4).getBytes("UTF-8"));
        } catch (Throwable th2) {
            a(th2, outputStream);
        }
        try {
            ArrayList<String> arrayList = f63167s;
            synchronized (arrayList) {
                if (f63169u != null) {
                    outputStream.write(String.format(Locale.US, "generating log: %s\n", f63169u).getBytes("UTF-8"));
                }
                if (f63168t > 0 || arrayList.size() > 0) {
                    outputStream.write(String.format(Locale.US, "generated %d logs, recent are:\n", Integer.valueOf(f63168t)).getBytes("UTF-8"));
                    Iterator<String> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        outputStream.write(String.format(Locale.US, "* %s\n", it2.next()).getBytes("UTF-8"));
                    }
                }
            }
            Locale locale = Locale.US;
            outputStream.write(String.format(locale, "dumping all threads: %s\n", Boolean.valueOf(f63170v)).getBytes("UTF-8"));
            String str = f63171w;
            if (str != null) {
                outputStream.write(String.format(locale, "dumping threads: %s\n", str).getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            a(th3, outputStream);
        }
        a(outputStream);
    }

    public static String k() {
        String str = f63172x;
        if (com.uc.crashsdk.a.g.a(str)) {
            synchronized (f63173y) {
                str = com.uc.crashsdk.a.g.a(com.uc.crashsdk.b.i(), g.y(), true);
                f63172x = str;
            }
        }
        return str;
    }

    public static void l() {
        synchronized (f63173y) {
            f63172x = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(int i4, Object[] objArr) {
        int i5;
        switch (i4) {
            case 401:
                JNIBridge.nativeCmd(10, com.uc.crashsdk.b.I() == 5 ? 1L : 0L, null, null);
                com.uc.crashsdk.a.f63037c = true;
                com.uc.crashsdk.a.a(false);
                L = true;
                Z();
                y();
                return;
            case 402:
                Object obj = Y;
                synchronized (obj) {
                    if (X == null) {
                        return;
                    }
                    W = true;
                    if (com.uc.crashsdk.b.q()) {
                        return;
                    }
                    if (!com.uc.crashsdk.a.d.e()) {
                        com.uc.crashsdk.a.a.c("DEBUG", com.uc.crashsdk.a.d.b());
                        return;
                    } else if (!d(LogType.UNEXP_TYPE)) {
                        com.uc.crashsdk.a.a.d("DEBUG", "unexp sample miss");
                        return;
                    } else {
                        int nativeGenerateUnexpLog = JNIBridge.nativeGenerateUnexpLog(g.o(), g.p());
                        if (nativeGenerateUnexpLog != 0) {
                            f.a(11);
                            if ((nativeGenerateUnexpLog & 4352) != 0) {
                                Z = 105;
                                i5 = 30;
                            } else if ((nativeGenerateUnexpLog & LogType.UNEXP_EXIT) != 0) {
                                Z = 104;
                                i5 = 31;
                            } else if ((nativeGenerateUnexpLog & LogType.UNEXP_RESTART) != 0) {
                                Z = 106;
                                i5 = 32;
                            } else {
                                if ((nativeGenerateUnexpLog & LogType.UNEXP_ANR) != 0) {
                                    Z = 103;
                                    f.a(10);
                                } else if ((nativeGenerateUnexpLog & LogType.UNEXP_LOW_MEMORY) != 0) {
                                    Z = 107;
                                    f.a(29);
                                } else {
                                    Z = 102;
                                }
                                a(true);
                            }
                            f.a(i5);
                            a(true);
                        }
                        synchronized (obj) {
                            X = null;
                        }
                        return;
                    }
                }
            case 403:
                ab();
                return;
            case 404:
            default:
                if (!f63150a) {
                    throw new AssertionError();
                }
                return;
            case 405:
                L = false;
                StringBuilder Y2 = Y();
                String g4 = com.uc.crashsdk.b.g();
                if (Y2 != null) {
                    com.uc.crashsdk.a.g.a(new File(g4), Y2.toString());
                    return;
                }
                return;
            case 406:
                if (!f63150a && objArr == null) {
                    throw new AssertionError();
                }
                a((String) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue());
                return;
            case 407:
                try {
                    com.uc.crashsdk.a.d();
                    return;
                } catch (Throwable th) {
                    com.uc.crashsdk.a.g.a(th);
                    return;
                }
            case TTAdConstant.INTERACTION_TYPE_CODE /* 408 */:
                synchronized (ab) {
                    if (!ac && g.Q() && com.uc.crashsdk.b.z()) {
                        com.uc.crashsdk.b.s();
                        h.f();
                        f.c();
                        if (com.uc.crashsdk.b.F()) {
                            C();
                        }
                        if (g.Q()) {
                            a(Calendar.getInstance());
                        }
                        ac = true;
                        return;
                    }
                    return;
                }
            case TTAdConstant.IMAGE_LIST_CODE /* 409 */:
                d(false);
                return;
            case TTAdConstant.IMAGE_LIST_SIZE_CODE /* 410 */:
                a(false, true);
                return;
            case TTAdConstant.IMAGE_CODE /* 411 */:
                if (com.uc.crashsdk.b.f63118d) {
                    JNIBridge.set(28, d(LogType.NATIVE_TYPE));
                    JNIBridge.set(29, d(LogType.ANR_TYPE));
                    return;
                }
                return;
            case TTAdConstant.IMAGE_URL_CODE /* 412 */:
                if (!R && com.uc.crashsdk.b.B() && g.M()) {
                    b(com.uc.crashsdk.a.g.a());
                    return;
                } else if (R) {
                    if (com.uc.crashsdk.b.B() && g.M()) {
                        return;
                    }
                    try {
                        com.uc.crashsdk.a.g.a().unregisterReceiver(Q);
                        R = false;
                        return;
                    } catch (Throwable th2) {
                        com.uc.crashsdk.a.g.a(th2);
                        return;
                    }
                } else {
                    return;
                }
            case TTAdConstant.VIDEO_INFO_CODE /* 413 */:
                JNIBridge.cmd(8);
                return;
            case TTAdConstant.VIDEO_URL_CODE /* 414 */:
                try {
                    if (d(com.uc.crashsdk.a.g.a())) {
                        return;
                    }
                    int i6 = N + 1;
                    N = i6;
                    if (i6 < 10) {
                        X();
                        return;
                    } else if (com.uc.crashsdk.b.f63118d) {
                        JNIBridge.set(130, "(get failed)");
                        return;
                    } else {
                        return;
                    }
                } catch (Throwable th3) {
                    com.uc.crashsdk.a.g.a(th3);
                    return;
                }
            case TTAdConstant.VIDEO_COVER_URL_CODE /* 415 */:
                if (!f63150a && objArr == null) {
                    throw new AssertionError();
                }
                long longValue = ((Long) objArr[0]).longValue();
                Calendar calendar = Calendar.getInstance();
                if (calendar.getTimeInMillis() >= longValue) {
                    h.g();
                    f.a(100);
                    d(true);
                    f.a(true);
                    h.b();
                } else {
                    h.h();
                    h.i();
                    h.c();
                }
                a(calendar);
                break;
            case 416:
                break;
        }
        W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final long f63176a;

        /* renamed from: b  reason: collision with root package name */
        private final OutputStream f63177b;

        /* renamed from: c  reason: collision with root package name */
        private int f63178c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f63179d = 0;

        /* renamed from: e  reason: collision with root package name */
        private boolean f63180e = false;

        a(long j4, OutputStream outputStream) {
            this.f63176a = j4;
            this.f63177b = outputStream;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int a(byte[] r7, int r8, int r9) {
            /*
                r6 = this;
                int r0 = r6.f63179d
                int r0 = r0 + r9
                r6.f63179d = r0
                boolean r0 = r6.f63180e
                if (r0 == 0) goto Lb
                r7 = 0
                return r7
            Lb:
                int r0 = com.uc.crashsdk.g.A()
                if (r0 <= 0) goto L19
                int r1 = r6.f63178c
                int r2 = r1 + r9
                if (r2 <= r0) goto L19
                int r0 = r0 - r1
                goto L1a
            L19:
                r0 = r9
            L1a:
                int r1 = r6.f63178c
                int r1 = r1 + r0
                r6.f63178c = r1
                long r1 = r6.f63176a
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L30
                java.lang.String r1 = new java.lang.String
                r1.<init>(r7, r8, r0)
                r6.b(r1)
                goto L35
            L30:
                java.io.OutputStream r1 = r6.f63177b
                r1.write(r7, r8, r0)
            L35:
                if (r0 >= r9) goto L3a
                r7 = 1
                r6.f63180e = r7
            L3a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a.a(byte[], int, int):int");
        }

        private void b(String str) {
            if (com.uc.crashsdk.b.f63118d) {
                JNIBridge.nativeClientWriteData(this.f63176a, str);
            }
        }

        @Override // java.io.OutputStream
        public final void write(int i4) {
            if (e.f63156h && e.I()) {
                com.uc.crashsdk.a.a.d("DEBUG", String.format(Locale.US, "%c", Integer.valueOf(i4)));
            }
            if (this.f63176a != 0) {
                b(String.format(Locale.US, "%c", Integer.valueOf(i4)));
            } else {
                this.f63177b.write(i4);
            }
            this.f63178c++;
            this.f63179d++;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i4, int i5) {
            if (e.f63156h && e.I()) {
                byte[] bArr2 = new byte[i5];
                System.arraycopy(bArr, i4, bArr2, 0, i5);
                if (i5 != 1 || bArr2[0] != 10) {
                    try {
                        com.uc.crashsdk.a.a.d("DEBUG", new String(bArr2));
                    } catch (Throwable unused) {
                    }
                }
            }
            a(bArr, i4, i5);
        }

        final void a() {
            try {
                if (this.f63179d - this.f63178c > 0) {
                    a("\n");
                    a("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                }
                a(String.format(Locale.US, "Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", Integer.valueOf(this.f63179d), Integer.valueOf(this.f63178c), Integer.valueOf(g.A()), Integer.valueOf(this.f63179d - this.f63178c)));
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            if (e.f63156h && e.I() && (bArr.length != 1 || bArr[0] != 10)) {
                try {
                    com.uc.crashsdk.a.a.d("DEBUG", new String(bArr));
                } catch (Throwable unused) {
                }
            }
            a(bArr, 0, bArr.length);
        }

        final void a(String str) {
            if (e.f63156h && e.I()) {
                com.uc.crashsdk.a.a.d("DEBUG", str);
            }
            if (this.f63176a != 0) {
                b(str);
            } else {
                this.f63177b.write(str.getBytes("UTF-8"));
            }
        }
    }

    public static String h() {
        String str = f63161m;
        if (str != null) {
            return str;
        }
        String a5 = a(Process.myPid());
        f63161m = a5;
        return a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        long f63181a;

        /* renamed from: b  reason: collision with root package name */
        long f63182b;

        /* renamed from: c  reason: collision with root package name */
        int f63183c;

        /* renamed from: d  reason: collision with root package name */
        int f63184d;

        /* renamed from: e  reason: collision with root package name */
        boolean f63185e;

        /* renamed from: f  reason: collision with root package name */
        boolean f63186f;

        /* renamed from: g  reason: collision with root package name */
        boolean f63187g;

        private d() {
            this.f63181a = 0L;
            this.f63182b = 0L;
            this.f63183c = 0;
            this.f63184d = 0;
            this.f63185e = false;
            this.f63186f = false;
            this.f63187g = false;
        }

        /* synthetic */ d(byte b5) {
            this();
        }
    }

    public static void j() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitNetwork().build());
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    public static void m() {
        if (ag) {
            return;
        }
        com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(TTAdConstant.IMAGE_CODE), 1000L);
    }

    public static void p() {
        String str;
        Throwable th;
        if (com.uc.crashsdk.a.g.a(B)) {
            String str2 = null;
            try {
                File file = new File(g.W() + "unique");
                if (file.exists()) {
                    str = com.uc.crashsdk.a.g.a(file, 48, false);
                    try {
                        if (str != null) {
                            try {
                                if (str.length() == 36) {
                                    str2 = str.replaceAll("[^0-9a-zA-Z-]", "-");
                                }
                            } catch (Exception e5) {
                                com.uc.crashsdk.a.g.a(e5);
                            }
                        }
                        str2 = str;
                    } catch (Throwable th2) {
                        th = th2;
                        com.uc.crashsdk.a.g.a(th);
                        str2 = str;
                        B = str2;
                    }
                }
                if (com.uc.crashsdk.a.g.a(str2)) {
                    com.uc.crashsdk.b.G();
                    str2 = UUID.randomUUID().toString();
                    if (!com.uc.crashsdk.a.g.a(str2)) {
                        com.uc.crashsdk.a.g.a(file, str2.getBytes());
                    }
                }
            } catch (Throwable th3) {
                str = str2;
                th = th3;
            }
            B = str2;
        }
    }

    public static String q() {
        return B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r() {
        O = false;
        if (!com.uc.crashsdk.b.B()) {
            com.uc.crashsdk.a.f.a(3, new com.uc.crashsdk.a.e(416), 11000L);
        }
        if (V()) {
            return;
        }
        N = 0;
        X();
    }

    private static void b(OutputStream outputStream, String str, String str2) {
        String str3;
        String str4;
        try {
            outputStream.write("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            a(th, outputStream);
        }
        try {
            Locale locale = Locale.US;
            outputStream.write(String.format(locale, "Basic Information: 'pid: %d/tid: %d/time: %s'\n", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), n()).getBytes("UTF-8"));
            Object[] objArr = new Object[3];
            objArr[0] = e();
            if (com.uc.crashsdk.a.g.a(f63160l)) {
                T();
            }
            objArr[1] = f63160l;
            objArr[2] = f();
            outputStream.write(String.format(locale, "Cpu Information: 'abi: %s/processor: %s/hardware: %s'\n", objArr).getBytes("UTF-8"));
        } catch (Throwable th2) {
            a(th2, outputStream);
        }
        try {
            Locale locale2 = Locale.US;
            outputStream.write(String.format(locale2, "Mobile Information: 'model: %s/version: %s/sdk: %d'\n", Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)).getBytes("UTF-8"));
            outputStream.write(("Build fingerprint: '" + Build.FINGERPRINT + "'\n").getBytes("UTF-8"));
            Object[] objArr2 = new Object[4];
            objArr2[0] = a(new Date(f63151b));
            objArr2[1] = Long.valueOf(Runtime.getRuntime().maxMemory());
            objArr2[2] = com.uc.crashsdk.a.g.d();
            objArr2[3] = com.uc.crashsdk.b.B() ? "fg" : "bg";
            outputStream.write(String.format(locale2, "Runtime Information: 'start: %s/maxheap: %s/primaryabi: %s/ground: %s'\n", objArr2).getBytes("UTF-8"));
        } catch (Throwable th3) {
            a(th3, outputStream);
        }
        try {
            Locale locale3 = Locale.US;
            outputStream.write(String.format(locale3, "Application Information: 'version: %s/subversion: %s/buildseq: %s/versioncode: %d'\n", g.T(), g.U(), g.V(), Integer.valueOf(com.uc.crashsdk.a.c())).getBytes("UTF-8"));
            String str5 = "0";
            String str6 = "";
            if (com.uc.crashsdk.b.f63118d) {
                String nativeGet = JNIBridge.nativeGet(1, 0L, null);
                str4 = JNIBridge.nativeGet(2, 0L, null);
                str5 = nativeGet;
            } else {
                str4 = "";
            }
            outputStream.write(String.format(locale3, "CrashSDK Information: 'version: %s/nativeseq: %s/javaseq: %s/arch: %s/target: %s'\n", "3.3.2.2", str5, "211215141717", str4, "release").getBytes("UTF-8"));
            if (str != null) {
                str6 = str;
            }
            outputStream.write(("Report Name: " + str6.substring(str6.lastIndexOf(47) + 1) + "\n").getBytes("UTF-8"));
        } catch (Throwable th4) {
            a(th4, outputStream);
        }
        try {
            if (ag) {
                str3 = s("UUID");
            } else {
                str3 = B;
            }
            outputStream.write(String.format("UUID: %s\n", str3).getBytes("UTF-8"));
            outputStream.write(("Log Type: " + str2 + "\n").getBytes("UTF-8"));
        } catch (Throwable th5) {
            a(th5, outputStream);
        }
        try {
            String E2 = com.uc.crashsdk.b.E();
            if (com.uc.crashsdk.a.g.a(E2)) {
                E2 = "(none)";
            }
            outputStream.write(("Activity: " + E2 + "\n").getBytes("UTF-8"));
        } catch (Throwable th6) {
            a(th6, outputStream);
        }
        a(outputStream);
        try {
            com.uc.crashsdk.a.a(outputStream, "UTF-8");
            if (ag) {
                f63156h = false;
                outputStream.write(s("HEADER").getBytes("UTF-8"));
                f63156h = true;
            }
        } catch (Throwable th7) {
            a(th7, outputStream);
        }
        a(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String n() {
        return a(new Date());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(String str) {
        if (ag) {
            return true;
        }
        try {
            return p(str);
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(boolean z4) {
        File[] listFiles;
        try {
            if (com.uc.crashsdk.b.y() && (listFiles = new File(g.X()).listFiles()) != null) {
                int l4 = g.l();
                int m4 = g.m();
                if (listFiles.length < Math.min(l4, m4)) {
                    return;
                }
                int i4 = 0;
                int i5 = 0;
                for (File file : listFiles) {
                    if (b(file)) {
                        i4++;
                    } else {
                        i5++;
                    }
                }
                int i6 = (!z4 || i4 < l4) ? 0 : (i4 - l4) + 1;
                int i7 = (z4 || i5 < m4) ? 0 : (i5 - m4) + 1;
                if (i6 == 0 && i7 == 0) {
                    return;
                }
                Arrays.sort(listFiles, new b((byte) 0));
                int i8 = i6;
                int i9 = i7;
                for (File file2 : listFiles) {
                    boolean b5 = b(file2);
                    if (b5 && i8 > 0) {
                        com.uc.crashsdk.a.a.a("crashsdk", "Delete oldest crash log: " + file2.getPath());
                        file2.delete();
                        i8 += -1;
                    } else if (!b5 && i9 > 0) {
                        com.uc.crashsdk.a.a.a("crashsdk", "Delete oldest custom log: " + file2.getPath());
                        file2.delete();
                        i9 += -1;
                    }
                    if (i8 == 0 && i9 == 0) {
                        break;
                    }
                }
                f.a(16, i6 + i7);
                if (i6 > 0) {
                    f.a(22, i6);
                }
                if (i7 > 0) {
                    f.a(23, i7);
                }
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(Context context) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY);
        boolean z4 = false;
        if (activityManager == null || (processesInErrorState = activityManager.getProcessesInErrorState()) == null) {
            return false;
        }
        int myPid = Process.myPid();
        Iterator<ActivityManager.ProcessErrorStateInfo> it2 = processesInErrorState.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ActivityManager.ProcessErrorStateInfo next = it2.next();
            if (next.pid == myPid) {
                O = true;
                if (O()) {
                    com.uc.crashsdk.a.a.d("crashsdk", "ANR occurred in process: " + next.processName);
                }
                if (com.uc.crashsdk.b.f63118d) {
                    JNIBridge.set(130, next.longMsg);
                }
                z4 = true;
            }
        }
        if (!z4 && com.uc.crashsdk.b.f63118d) {
            W();
        }
        return true;
    }

    public static void o() {
        f63151b = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(java.io.OutputStream r11) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.e(java.io.OutputStream):void");
    }

    public static void c(String str) {
        synchronized (f63174z) {
            String l4 = com.uc.crashsdk.b.l();
            com.uc.crashsdk.a.b.a(l4, str + "\n");
        }
    }

    public static void d(boolean z4) {
        f.d(false);
        if (z4) {
            f.a(com.uc.crashsdk.b.c(), false);
            h.i();
            return;
        }
        f.a();
        h.i();
    }

    public static int f(boolean z4) {
        int b5;
        if (z4) {
            b5 = f.a(com.uc.crashsdk.b.c()) ? 1 : 0;
        } else {
            b5 = f.b();
        }
        int b6 = f.b(z4);
        return b6 > b5 ? b6 : b5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(boolean z4) {
        boolean z5 = true;
        if (!R ? !z4 || !g.M() : z4 && g.M()) {
            z5 = false;
        }
        if (z5) {
            com.uc.crashsdk.a.e eVar = S;
            if (com.uc.crashsdk.a.f.b(eVar)) {
                com.uc.crashsdk.a.f.a(eVar);
            }
            com.uc.crashsdk.a.f.a(0, eVar, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static StringBuilder f(String str) {
        return a(Thread.currentThread().getStackTrace(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        r3.write(r4.getBytes("UTF-8"));
        r3.write("\n".getBytes("UTF-8"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r8, java.lang.String r9) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L79
            r1 = 26
            java.lang.String r2 = "ps"
            if (r0 < r1) goto Lf
            java.lang.String r0 = "-ef"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}     // Catch: java.lang.Throwable -> L79
            goto L13
        Lf:
            java.lang.String[] r0 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L79
        L13:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L79
            java.lang.Process r0 = r1.exec(r0)     // Catch: java.lang.Throwable -> L79
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L79
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L79
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L79
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L79
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L79
            boolean r0 = com.uc.crashsdk.a.g.b(r8)     // Catch: java.lang.Throwable -> L79
            boolean r2 = com.uc.crashsdk.a.g.b(r9)     // Catch: java.lang.Throwable -> L79
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L79
            r3.<init>()     // Catch: java.lang.Throwable -> L79
        L36:
            java.lang.String r4 = r1.readLine()     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = "UTF-8"
            if (r4 == 0) goto L74
            r6 = 1
            if (r0 == 0) goto L47
            boolean r7 = r4.contains(r8)     // Catch: java.lang.Throwable -> L79
            if (r7 != 0) goto L61
        L47:
            if (r2 == 0) goto L50
            boolean r7 = r4.contains(r9)     // Catch: java.lang.Throwable -> L79
            if (r7 == 0) goto L50
            goto L61
        L50:
            r7 = 47
            int r7 = r4.indexOf(r7)     // Catch: java.lang.Throwable -> L79
            if (r7 >= 0) goto L60
            r7 = 46
            int r7 = r4.indexOf(r7)     // Catch: java.lang.Throwable -> L79
            if (r7 > 0) goto L61
        L60:
            r6 = 0
        L61:
            if (r6 == 0) goto L36
            byte[] r4 = r4.getBytes(r5)     // Catch: java.lang.Throwable -> L79
            r3.write(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = "\n"
            byte[] r4 = r4.getBytes(r5)     // Catch: java.lang.Throwable -> L79
            r3.write(r4)     // Catch: java.lang.Throwable -> L79
            goto L36
        L74:
            java.lang.String r8 = r3.toString(r5)     // Catch: java.lang.Throwable -> L79
            return r8
        L79:
            r8 = move-exception
            com.uc.crashsdk.a.g.a(r8)
            java.lang.String r8 = "exception exists."
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.String, java.lang.String):java.lang.String");
    }

    private static BufferedReader a(InputStreamReader inputStreamReader) {
        BufferedReader bufferedReader = null;
        int i4 = 8192;
        while (bufferedReader == null && i4 > 0) {
            try {
                bufferedReader = new BufferedReader(inputStreamReader, i4);
            } catch (Throwable unused) {
                i4 /= 2;
                if (i4 < 512) {
                    break;
                }
            }
        }
        return bufferedReader;
    }

    public static boolean e(String str) {
        try {
            if (com.uc.crashsdk.a.g.b(str) && str.startsWith("lib") && str.endsWith(".so")) {
                System.loadLibrary(str.substring(3, str.length() - 3));
                return true;
            }
            return false;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return false;
        }
    }

    private static void a(OutputStream outputStream) {
        try {
            outputStream.write("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            a(th, outputStream);
        }
    }

    private static String a(File file) {
        String str;
        try {
            str = file.getCanonicalPath();
        } catch (Throwable unused) {
            str = null;
        }
        return com.uc.crashsdk.a.g.a(str) ? file.getPath() : str;
    }

    public static int e(boolean z4) {
        return f.a(z4);
    }

    private static long a(StatFs statFs, String str, String str2) {
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                Method declaredMethod = StatFs.class.getDeclaredMethod(str, new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(statFs, new Object[0]);
                if (invoke != null && (invoke instanceof Long)) {
                    return ((Long) invoke).longValue();
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Method declaredMethod2 = StatFs.class.getDeclaredMethod(str2, new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke2 = declaredMethod2.invoke(statFs, new Object[0]);
            if (invoke2 == null || !(invoke2 instanceof Integer)) {
                return 0L;
            }
            return ((Integer) invoke2).intValue();
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return 0L;
        }
    }

    private static void b(OutputStream outputStream) {
        BufferedReader bufferedReader = null;
        try {
            outputStream.write("logcat:\n".getBytes("UTF-8"));
        } finally {
            try {
                com.uc.crashsdk.a.g.a(bufferedReader);
                a(outputStream);
            } finally {
            }
        }
        if (g.n() <= 0) {
            outputStream.write("[DEBUG] custom java logcat lines count is 0!\n".getBytes("UTF-8"));
            a(outputStream);
            return;
        }
        int n4 = g.n();
        bufferedReader = a(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"logcat", "-d", "-b", com.umeng.analytics.pro.f.ax, "-b", "main", "-v", "threadtime", "-t", String.valueOf(n4)}).getInputStream()));
        if (bufferedReader == null) {
            outputStream.write("[DEBUG] alloc buffer failed!\n".getBytes("UTF-8"));
            a(outputStream);
            return;
        }
        f63156h = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            i4++;
            if (i5 < n4 && !readLine.contains(" I auditd ") && !readLine.contains(" I liblog ")) {
                outputStream.write(readLine.getBytes("UTF-8"));
                outputStream.write("\n".getBytes("UTF-8"));
                i5++;
            }
        }
        outputStream.write(String.format(Locale.US, "[DEBUG] Read %d lines, wrote %d lines.\n", Integer.valueOf(i4), Integer.valueOf(i5)).getBytes("UTF-8"));
        f63156h = true;
        com.uc.crashsdk.a.g.a(bufferedReader);
        a(outputStream);
    }

    private static void a(a aVar) {
        try {
            aVar.a(String.format(Locale.US, "log end: %s\n", n()));
        } catch (Throwable th) {
            a(th, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(OutputStream outputStream, String str, int i4) {
        int i5 = 0;
        if (str == null) {
            a(outputStream);
            return 0;
        }
        try {
            String a5 = com.uc.crashsdk.a.b.a(str);
            if (a5 == null) {
                a5 = "file: '" + str + "' not found or decode failed!";
            }
            int length = a5.length();
            if (length <= i4 + 32) {
                i4 = length;
            }
            if (i4 > 0) {
                try {
                    outputStream.write(a5.getBytes("UTF-8"), 0, i4);
                    outputStream.write("\n".getBytes("UTF-8"));
                } catch (Throwable th) {
                    th = th;
                    i5 = i4;
                    a(th, outputStream);
                    i4 = i5;
                    a(outputStream);
                    return i4;
                }
            }
            if (i4 < a5.length()) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", Integer.valueOf(a5.length() - i4)).getBytes("UTF-8"));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        a(outputStream);
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i4) {
        try {
            String a5 = com.uc.crashsdk.a.g.a(new File(String.format(Locale.US, "/proc/%d/cmdline", Integer.valueOf(i4))), 128, false);
            return com.uc.crashsdk.a.g.b(a5) ? l(a5) : "unknown";
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return "unknown";
        }
    }

    private static void b(a aVar) {
        f63156h = false;
        try {
            aVar.write((s("LOG_END") + "\n").getBytes("UTF-8"));
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        f63156h = true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:1|(43:2|3|4|(2:210|211)|6|(2:8|9)(1:209)|10|11|12|13|(1:15)|16|(1:18)|19|20|21|(1:23)|24|(1:28)|29|30|31|32|33|(1:35)|36|37|38|39|40|41|42|43|(3:45|46|47)|48|49|50|51|52|(1:54)(2:198|(1:200))|55|56|57)|(3:59|60|61)(3:145|146|(8:153|154|155|156|157|158|159|(40:161|162|163|164|166|167|168|169|170|171|172|173|174|64|65|66|(3:68|69|70)(7:127|128|(1:130)|131|(1:133)|134|(4:136|(1:138)(1:142)|139|140))|71|72|73|74|(3:76|77|78)|79|80|81|82|(3:84|85|86)|87|88|89|90|(1:92)|93|94|(1:96)|97|98|(1:100)(1:105)|101|102)(29:188|63|64|65|66|(0)(0)|71|72|73|74|(0)|79|80|81|82|(0)|87|88|89|90|(0)|93|94|(0)|97|98|(0)(0)|101|102)))|62|63|64|65|66|(0)(0)|71|72|73|74|(0)|79|80|81|82|(0)|87|88|89|90|(0)|93|94|(0)|97|98|(0)(0)|101|102|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x04d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x04d3, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0430 A[Catch: all -> 0x0494, TRY_LEAVE, TryCatch #25 {all -> 0x0494, blocks: (B:180:0x034b, B:185:0x035c, B:210:0x0417, B:217:0x042c, B:219:0x0430, B:224:0x0445, B:236:0x045b, B:238:0x045f, B:243:0x0474, B:244:0x0477, B:191:0x0376, B:179:0x0348, B:212:0x0423, B:239:0x0462, B:220:0x0433, B:245:0x047d, B:225:0x0448, B:231:0x0452, B:181:0x034e), top: B:304:0x0348 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x045f A[Catch: all -> 0x0494, TRY_LEAVE, TryCatch #25 {all -> 0x0494, blocks: (B:180:0x034b, B:185:0x035c, B:210:0x0417, B:217:0x042c, B:219:0x0430, B:224:0x0445, B:236:0x045b, B:238:0x045f, B:243:0x0474, B:244:0x0477, B:191:0x0376, B:179:0x0348, B:212:0x0423, B:239:0x0462, B:220:0x0433, B:245:0x047d, B:225:0x0448, B:231:0x0452, B:181:0x034e), top: B:304:0x0348 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04c1 A[Catch: all -> 0x04d2, TryCatch #27 {all -> 0x04d2, blocks: (B:273:0x04bd, B:275:0x04c1, B:277:0x04cc), top: B:300:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x037b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.lang.Throwable r23, java.lang.String r24, long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 1259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.Throwable, java.lang.String, long, boolean):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(OutputStream outputStream, String str, int i4) {
        int i5;
        DataInputStream dataInputStream;
        int i6;
        DataInputStream dataInputStream2 = null;
        int i7 = 0;
        try {
            File file = new File(str);
            if (file.exists()) {
                byte[] R2 = R();
                if (R2 == null) {
                    outputStream.write("(alloc buffer failed!)\n".getBytes("UTF-8"));
                    return 0;
                }
                dataInputStream = new DataInputStream(new FileInputStream(file));
                i6 = 0;
                i5 = 0;
                loop0: while (true) {
                    boolean z4 = false;
                    while (true) {
                        try {
                            int read = dataInputStream.read(R2);
                            if (read == -1) {
                                break loop0;
                            }
                            i6 += read;
                            int i8 = i4 - i5;
                            if (read <= i8 + 32) {
                                i8 = read;
                            }
                            if (i8 > 0 && !z4) {
                                outputStream.write(R2, 0, i8);
                                i5 += i8;
                            }
                            if (!z4) {
                                if (i8 < read || i5 >= i4) {
                                    z4 = true;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            i7 = i5;
                            dataInputStream2 = dataInputStream;
                            try {
                                a(th, outputStream);
                                com.uc.crashsdk.a.g.a(dataInputStream2);
                                i5 = i7;
                                a(outputStream);
                                return i5;
                            } finally {
                                com.uc.crashsdk.a.g.a(dataInputStream2);
                            }
                        }
                    }
                }
            } else {
                outputStream.write(("file: '" + str + "' not exists!\n").getBytes("UTF-8"));
                dataInputStream = null;
                i6 = 0;
                i5 = 0;
            }
            if (i5 > 0) {
                outputStream.write("\n".getBytes("UTF-8"));
            }
            if (i5 < i6) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", Integer.valueOf(i6 - i5)).getBytes("UTF-8"));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        a(outputStream);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(boolean z4) {
        try {
            boolean z5 = g.r() && com.uc.crashsdk.b.F() && !f63153d;
            if (!z5) {
                z5 = g.s();
            }
            if (z5) {
                if (z4) {
                    String k4 = k();
                    if (com.uc.crashsdk.a.g.a(k4)) {
                        return;
                    }
                    j();
                    a(k4, false, false);
                    return;
                }
                a(true, false);
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    private static boolean b(File file) {
        int indexOf;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(95);
        if (lastIndexOf > 0 && (indexOf = name.indexOf(46, lastIndexOf)) > 0) {
            String substring = name.substring(lastIndexOf + 1, indexOf);
            return LogType.JAVA_TYPE.equals(substring) || "ucebujava".equals(substring) || LogType.NATIVE_TYPE.equals(substring) || "ucebujni".equals(substring) || LogType.UNEXP_TYPE.equals(substring) || LogType.ANR_TYPE.equals(substring);
        }
        return false;
    }

    private static String b(String str, boolean z4, boolean z5) {
        if (z4) {
            try {
                str = m(str);
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }
        if (z5) {
            try {
                return a(str);
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
                return str;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(String str, String str2, boolean z4) {
        h.a(str, str2, false, z4);
    }

    public static void b(String str) {
        synchronized (f63173y) {
            f63172x = str;
            com.uc.crashsdk.a.b.a(com.uc.crashsdk.b.i(), str + "\n");
        }
    }

    private static void b(String str, String str2) {
        try {
            com.uc.crashsdk.d.a(str, h(), str2);
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    public static void b(Context context) {
        if (g.M()) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                context.registerReceiver(Q, intentFilter, null, com.uc.crashsdk.a.f.a(1));
                R = true;
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }
    }

    public static void b(int i4) {
        com.uc.crashsdk.a.f.a(0, new com.uc.crashsdk.a.e(TTAdConstant.IMAGE_LIST_SIZE_CODE), i4 * 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        int lastIndexOf;
        int indexOf;
        int i4;
        int indexOf2;
        File file;
        byte[] e5;
        if (g.x() && (lastIndexOf = str.lastIndexOf(47)) > 0 && (indexOf = str.indexOf(95, lastIndexOf)) > lastIndexOf && (indexOf2 = str.indexOf(95, (i4 = indexOf + 1))) > indexOf) {
            String d5 = com.uc.crashsdk.a.g.d("CrashSDK" + str.substring(lastIndexOf + 1, indexOf) + str.substring(i4, indexOf2));
            if (d5 == null || (e5 = com.uc.crashsdk.a.g.e((file = new File(str)))) == null || e5.length <= 0) {
                return str;
            }
            byte[] bArr = null;
            try {
                bArr = com.uc.crashsdk.a.c.b(e5, d5.substring(0, 16).getBytes());
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
            if (bArr == null) {
                return str;
            }
            String str2 = str + ".ec";
            File file2 = new File(str2 + ".tmp");
            if (com.uc.crashsdk.a.g.a(file2, bArr)) {
                if (!file2.renameTo(new File(str2))) {
                    file2.delete();
                    return str;
                }
                file.delete();
                return str2;
            }
            return str;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Throwable th, OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.write("[DEBUG] CrashHandler occurred new exception:\n".getBytes("UTF-8"));
                th.printStackTrace(new PrintStream(outputStream));
                outputStream.write("\n\n".getBytes("UTF-8"));
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
        }
        com.uc.crashsdk.a.g.a(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f2 A[Catch: all -> 0x0432, TryCatch #2 {all -> 0x043d, blocks: (B:175:0x042c, B:176:0x042e, B:182:0x043b, B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x0034, B:11:0x003a, B:12:0x004d, B:14:0x005d, B:16:0x0067, B:147:0x03bd, B:18:0x006d, B:20:0x007b, B:22:0x008d, B:25:0x00ae, B:27:0x00be, B:31:0x00cb, B:42:0x00f7, B:38:0x00e9, B:62:0x01c4, B:64:0x01d8, B:66:0x01dc, B:67:0x01de, B:69:0x01e3, B:70:0x01e5, B:71:0x01ea, B:81:0x020d, B:82:0x0223, B:84:0x0229, B:86:0x0232, B:88:0x023e, B:90:0x025d, B:91:0x0270, B:93:0x0282, B:95:0x0290, B:96:0x02a1, B:110:0x02e3, B:113:0x02f2, B:116:0x02fe, B:119:0x030d, B:121:0x031b, B:123:0x0328, B:126:0x032f, B:130:0x033c, B:132:0x0348, B:134:0x0362, B:135:0x0367, B:137:0x0377, B:139:0x0384, B:145:0x03ae, B:150:0x03d1, B:152:0x03d8, B:154:0x03df, B:156:0x03e6, B:158:0x03ed, B:160:0x03f4, B:166:0x0406, B:168:0x040d, B:170:0x0414, B:172:0x041b, B:164:0x03ff, B:138:0x037e, B:140:0x03a1, B:142:0x03a6, B:98:0x02a7, B:100:0x02ad, B:103:0x02b5, B:105:0x02b9, B:107:0x02cd, B:109:0x02d1, B:75:0x01f4, B:77:0x0202, B:79:0x0208, B:61:0x01c1, B:173:0x0423), top: B:195:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0348 A[Catch: all -> 0x0432, TryCatch #2 {all -> 0x043d, blocks: (B:175:0x042c, B:176:0x042e, B:182:0x043b, B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x0034, B:11:0x003a, B:12:0x004d, B:14:0x005d, B:16:0x0067, B:147:0x03bd, B:18:0x006d, B:20:0x007b, B:22:0x008d, B:25:0x00ae, B:27:0x00be, B:31:0x00cb, B:42:0x00f7, B:38:0x00e9, B:62:0x01c4, B:64:0x01d8, B:66:0x01dc, B:67:0x01de, B:69:0x01e3, B:70:0x01e5, B:71:0x01ea, B:81:0x020d, B:82:0x0223, B:84:0x0229, B:86:0x0232, B:88:0x023e, B:90:0x025d, B:91:0x0270, B:93:0x0282, B:95:0x0290, B:96:0x02a1, B:110:0x02e3, B:113:0x02f2, B:116:0x02fe, B:119:0x030d, B:121:0x031b, B:123:0x0328, B:126:0x032f, B:130:0x033c, B:132:0x0348, B:134:0x0362, B:135:0x0367, B:137:0x0377, B:139:0x0384, B:145:0x03ae, B:150:0x03d1, B:152:0x03d8, B:154:0x03df, B:156:0x03e6, B:158:0x03ed, B:160:0x03f4, B:166:0x0406, B:168:0x040d, B:170:0x0414, B:172:0x041b, B:164:0x03ff, B:138:0x037e, B:140:0x03a1, B:142:0x03a6, B:98:0x02a7, B:100:0x02ad, B:103:0x02b5, B:105:0x02b9, B:107:0x02cd, B:109:0x02d1, B:75:0x01f4, B:77:0x0202, B:79:0x0208, B:61:0x01c1, B:173:0x0423), top: B:195:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a1 A[Catch: all -> 0x0432, TryCatch #2 {all -> 0x043d, blocks: (B:175:0x042c, B:176:0x042e, B:182:0x043b, B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x0034, B:11:0x003a, B:12:0x004d, B:14:0x005d, B:16:0x0067, B:147:0x03bd, B:18:0x006d, B:20:0x007b, B:22:0x008d, B:25:0x00ae, B:27:0x00be, B:31:0x00cb, B:42:0x00f7, B:38:0x00e9, B:62:0x01c4, B:64:0x01d8, B:66:0x01dc, B:67:0x01de, B:69:0x01e3, B:70:0x01e5, B:71:0x01ea, B:81:0x020d, B:82:0x0223, B:84:0x0229, B:86:0x0232, B:88:0x023e, B:90:0x025d, B:91:0x0270, B:93:0x0282, B:95:0x0290, B:96:0x02a1, B:110:0x02e3, B:113:0x02f2, B:116:0x02fe, B:119:0x030d, B:121:0x031b, B:123:0x0328, B:126:0x032f, B:130:0x033c, B:132:0x0348, B:134:0x0362, B:135:0x0367, B:137:0x0377, B:139:0x0384, B:145:0x03ae, B:150:0x03d1, B:152:0x03d8, B:154:0x03df, B:156:0x03e6, B:158:0x03ed, B:160:0x03f4, B:166:0x0406, B:168:0x040d, B:170:0x0414, B:172:0x041b, B:164:0x03ff, B:138:0x037e, B:140:0x03a1, B:142:0x03a6, B:98:0x02a7, B:100:0x02ad, B:103:0x02b5, B:105:0x02b9, B:107:0x02cd, B:109:0x02d1, B:75:0x01f4, B:77:0x0202, B:79:0x0208, B:61:0x01c1, B:173:0x0423), top: B:195:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d8 A[Catch: all -> 0x0432, TryCatch #2 {all -> 0x043d, blocks: (B:175:0x042c, B:176:0x042e, B:182:0x043b, B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x0034, B:11:0x003a, B:12:0x004d, B:14:0x005d, B:16:0x0067, B:147:0x03bd, B:18:0x006d, B:20:0x007b, B:22:0x008d, B:25:0x00ae, B:27:0x00be, B:31:0x00cb, B:42:0x00f7, B:38:0x00e9, B:62:0x01c4, B:64:0x01d8, B:66:0x01dc, B:67:0x01de, B:69:0x01e3, B:70:0x01e5, B:71:0x01ea, B:81:0x020d, B:82:0x0223, B:84:0x0229, B:86:0x0232, B:88:0x023e, B:90:0x025d, B:91:0x0270, B:93:0x0282, B:95:0x0290, B:96:0x02a1, B:110:0x02e3, B:113:0x02f2, B:116:0x02fe, B:119:0x030d, B:121:0x031b, B:123:0x0328, B:126:0x032f, B:130:0x033c, B:132:0x0348, B:134:0x0362, B:135:0x0367, B:137:0x0377, B:139:0x0384, B:145:0x03ae, B:150:0x03d1, B:152:0x03d8, B:154:0x03df, B:156:0x03e6, B:158:0x03ed, B:160:0x03f4, B:166:0x0406, B:168:0x040d, B:170:0x0414, B:172:0x041b, B:164:0x03ff, B:138:0x037e, B:140:0x03a1, B:142:0x03a6, B:98:0x02a7, B:100:0x02ad, B:103:0x02b5, B:105:0x02b9, B:107:0x02cd, B:109:0x02d1, B:75:0x01f4, B:77:0x0202, B:79:0x0208, B:61:0x01c1, B:173:0x0423), top: B:195:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020d A[Catch: all -> 0x0432, TryCatch #2 {all -> 0x043d, blocks: (B:175:0x042c, B:176:0x042e, B:182:0x043b, B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x0034, B:11:0x003a, B:12:0x004d, B:14:0x005d, B:16:0x0067, B:147:0x03bd, B:18:0x006d, B:20:0x007b, B:22:0x008d, B:25:0x00ae, B:27:0x00be, B:31:0x00cb, B:42:0x00f7, B:38:0x00e9, B:62:0x01c4, B:64:0x01d8, B:66:0x01dc, B:67:0x01de, B:69:0x01e3, B:70:0x01e5, B:71:0x01ea, B:81:0x020d, B:82:0x0223, B:84:0x0229, B:86:0x0232, B:88:0x023e, B:90:0x025d, B:91:0x0270, B:93:0x0282, B:95:0x0290, B:96:0x02a1, B:110:0x02e3, B:113:0x02f2, B:116:0x02fe, B:119:0x030d, B:121:0x031b, B:123:0x0328, B:126:0x032f, B:130:0x033c, B:132:0x0348, B:134:0x0362, B:135:0x0367, B:137:0x0377, B:139:0x0384, B:145:0x03ae, B:150:0x03d1, B:152:0x03d8, B:154:0x03df, B:156:0x03e6, B:158:0x03ed, B:160:0x03f4, B:166:0x0406, B:168:0x040d, B:170:0x0414, B:172:0x041b, B:164:0x03ff, B:138:0x037e, B:140:0x03a1, B:142:0x03a6, B:98:0x02a7, B:100:0x02ad, B:103:0x02b5, B:105:0x02b9, B:107:0x02cd, B:109:0x02d1, B:75:0x01f4, B:77:0x0202, B:79:0x0208, B:61:0x01c1, B:173:0x0423), top: B:195:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0223 A[Catch: all -> 0x0432, TryCatch #2 {all -> 0x043d, blocks: (B:175:0x042c, B:176:0x042e, B:182:0x043b, B:4:0x000a, B:6:0x0010, B:8:0x001f, B:9:0x0034, B:11:0x003a, B:12:0x004d, B:14:0x005d, B:16:0x0067, B:147:0x03bd, B:18:0x006d, B:20:0x007b, B:22:0x008d, B:25:0x00ae, B:27:0x00be, B:31:0x00cb, B:42:0x00f7, B:38:0x00e9, B:62:0x01c4, B:64:0x01d8, B:66:0x01dc, B:67:0x01de, B:69:0x01e3, B:70:0x01e5, B:71:0x01ea, B:81:0x020d, B:82:0x0223, B:84:0x0229, B:86:0x0232, B:88:0x023e, B:90:0x025d, B:91:0x0270, B:93:0x0282, B:95:0x0290, B:96:0x02a1, B:110:0x02e3, B:113:0x02f2, B:116:0x02fe, B:119:0x030d, B:121:0x031b, B:123:0x0328, B:126:0x032f, B:130:0x033c, B:132:0x0348, B:134:0x0362, B:135:0x0367, B:137:0x0377, B:139:0x0384, B:145:0x03ae, B:150:0x03d1, B:152:0x03d8, B:154:0x03df, B:156:0x03e6, B:158:0x03ed, B:160:0x03f4, B:166:0x0406, B:168:0x040d, B:170:0x0414, B:172:0x041b, B:164:0x03ff, B:138:0x037e, B:140:0x03a1, B:142:0x03a6, B:98:0x02a7, B:100:0x02ad, B:103:0x02b5, B:105:0x02b9, B:107:0x02cd, B:109:0x02d1, B:75:0x01f4, B:77:0x0202, B:79:0x0208, B:61:0x01c1, B:173:0x0423), top: B:195:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.String, boolean, boolean):void");
    }

    public static boolean a(boolean z4, boolean z5) {
        if (!f63153d) {
            if (com.uc.crashsdk.b.f63118d) {
                JNIBridge.set(1, true);
            }
            f63153d = true;
        }
        try {
            String k4 = k();
            if (com.uc.crashsdk.a.g.a(k4)) {
                com.uc.crashsdk.a.a.a("crashsdk", "CrashHandler url is empty!");
                return false;
            }
            if (com.uc.crashsdk.a.f.a(z4 ? 1 : 0, new com.uc.crashsdk.a.e(406, new Object[]{k4, Boolean.valueOf(z5), Boolean.valueOf(z4)})) && z4) {
                ConditionVariable conditionVariable = f63163o;
                conditionVariable.close();
                if (!conditionVariable.block(3000L)) {
                    com.uc.crashsdk.a.a.a("crashsdk", "timeout to wait for uploading");
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    private static boolean a(String str, com.uc.crashsdk.a.e eVar) {
        boolean z4;
        FileChannel fileChannel;
        Exception e5;
        synchronized (f63164p) {
            File file = new File(str);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e6) {
                    com.uc.crashsdk.a.g.a(e6);
                }
            }
            ?? r5 = 0;
            r5 = null;
            FileLock lock = null;
            z4 = false;
            try {
                try {
                    try {
                        fileChannel = new RandomAccessFile(file, net.lingala.zip4j.util.e.f71861e0).getChannel();
                    } catch (Throwable th) {
                        th = th;
                        r5 = file;
                        com.uc.crashsdk.a.g.a((Closeable) r5);
                        throw th;
                    }
                } catch (Exception e7) {
                    try {
                        com.uc.crashsdk.a.g.a(e7);
                        fileChannel = null;
                    } catch (Exception e8) {
                        fileChannel = null;
                        e5 = e8;
                        com.uc.crashsdk.a.g.a(e5);
                        com.uc.crashsdk.a.g.a(fileChannel);
                        return z4;
                    }
                }
                if (fileChannel != null) {
                    try {
                        lock = fileChannel.lock();
                    } catch (Exception e9) {
                        try {
                            com.uc.crashsdk.a.g.a(e9);
                        } catch (Exception e10) {
                            e5 = e10;
                            com.uc.crashsdk.a.g.a(e5);
                            com.uc.crashsdk.a.g.a(fileChannel);
                            return z4;
                        }
                    }
                }
                try {
                    z4 = eVar.a();
                    com.uc.crashsdk.a.g.a(fileChannel);
                } finally {
                    if (lock != null) {
                        try {
                            lock.release();
                        } catch (Exception e11) {
                            com.uc.crashsdk.a.g.a(e11);
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return z4;
    }

    private static boolean a(String str, d dVar) {
        String a5 = com.uc.crashsdk.a.g.a(new File(str), 64, false);
        if (a5 == null) {
            return false;
        }
        try {
            Matcher matcher = Pattern.compile("(\\d+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+)").matcher(a5);
            if (matcher.find()) {
                long parseLong = Long.parseLong(matcher.group(1));
                if (System.currentTimeMillis() - parseLong < 86400000) {
                    dVar.f63182b = Long.parseLong(matcher.group(2));
                    dVar.f63183c = Integer.parseInt(matcher.group(3));
                    dVar.f63184d = Integer.parseInt(matcher.group(4));
                    dVar.f63181a = parseLong;
                }
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    public static boolean a(StringBuffer stringBuffer, String str, long j4, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, String str2) {
        long j5;
        boolean z4;
        boolean a5;
        if (f63152c.get()) {
            com.uc.crashsdk.a.a.b("Processing java crash, skip generate custom log: " + str);
            return false;
        }
        boolean z5 = ag || com.uc.crashsdk.b.L();
        if (!z5 && !com.uc.crashsdk.a.d.e()) {
            com.uc.crashsdk.a.a.c("DEBUG", com.uc.crashsdk.a.d.b());
            return false;
        } else if (!d(str)) {
            com.uc.crashsdk.a.a.d("DEBUG", "custom log sample miss: " + str);
            return false;
        } else if (aa()) {
            com.uc.crashsdk.a.a.b("Processing native crash, skip generate custom log: " + str);
            return false;
        } else if (stringBuffer == null || str == null) {
            return false;
        } else {
            String str3 = g.X() + k(str);
            ?? r11 = (j4 & 32) != 0 ? 1 : 0;
            if (z5) {
                long nativeClientCreateConnection = com.uc.crashsdk.b.f63118d ? JNIBridge.nativeClientCreateConnection(str3, "custom", str, r11) : 0L;
                if (nativeClientCreateConnection == 0) {
                    com.uc.crashsdk.a.a.d("DEBUG", "skip custom log: " + str);
                    return false;
                }
                j5 = nativeClientCreateConnection;
            } else if (a(h(), str, (boolean) r11)) {
                return false;
            } else {
                g.a();
                a(false);
                j5 = 0;
            }
            synchronized (f63165q) {
                z4 = r11;
                a5 = a(str3, j5, stringBuffer, str, j4, arrayList, arrayList2, arrayList3, str2);
            }
            if (a5 && !z5) {
                b(h(), str, z4);
            }
            if (j5 != 0) {
                JNIBridge.nativeClientCloseConnection(j5);
            }
            if (a5) {
                if (!z5) {
                    r(str3);
                }
                if (!z5) {
                    str3 = a(m(str3));
                }
                b(str3, str);
                if (!z4 || z5) {
                    return true;
                }
                try {
                    a(true, false);
                    return true;
                } catch (Throwable th) {
                    com.uc.crashsdk.a.g.a(th);
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str, String str2, boolean z4) {
        if (o(str2)) {
            h.a(str, str2, true, z4);
            com.uc.crashsdk.a.a.b(String.format(Locale.US, "Custom log '%s' has reach max count!", str2));
            return true;
        }
        return false;
    }

    private static void a(a aVar, String str, long j4) {
        String nativeDumpThreads;
        String str2 = null;
        if (com.uc.crashsdk.b.f63118d) {
            try {
                aVar.flush();
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
            nativeDumpThreads = JNIBridge.nativeDumpThreads(str, j4);
            if (ag || nativeDumpThreads == null || nativeDumpThreads.length() >= 512 || !nativeDumpThreads.startsWith(net.lingala.zip4j.util.e.F0) || nativeDumpThreads.indexOf(10) >= 0) {
                str2 = nativeDumpThreads;
            } else {
                if (!new File(nativeDumpThreads).exists()) {
                    str2 = "Can not found " + nativeDumpThreads;
                }
                String str3 = str2;
                str2 = nativeDumpThreads;
                nativeDumpThreads = str3;
            }
        } else {
            nativeDumpThreads = "Native not initialized, skip dump!";
        }
        if (nativeDumpThreads != null) {
            try {
                aVar.write(nativeDumpThreads.getBytes("UTF-8"));
                aVar.write("\n".getBytes("UTF-8"));
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
            a((OutputStream) aVar);
        } else if (str2 != null && !ag) {
            b(aVar, str2, 1048576);
            File file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
        }
        try {
            aVar.flush();
        } catch (Throwable th3) {
            com.uc.crashsdk.a.g.a(th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0043 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(java.lang.String r17, long r18, java.lang.StringBuffer r20, java.lang.String r21, long r22, java.util.ArrayList<java.lang.String> r24, java.util.ArrayList<java.lang.String> r25, java.util.ArrayList<java.lang.String> r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.String, long, java.lang.StringBuffer, java.lang.String, long, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }

    private static String a(Date date) {
        return String.format(Locale.US, "%d%02d%02d%02d%02d%02d", Integer.valueOf(date.getYear() + 1900), Integer.valueOf(date.getMonth() + 1), Integer.valueOf(date.getDate()), Integer.valueOf(date.getHours()), Integer.valueOf(date.getMinutes()), Integer.valueOf(date.getSeconds()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(OutputStream outputStream, String str, String str2, int i4, boolean z4, boolean z5) {
        f63156h = false;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = Integer.valueOf(i4);
            objArr[3] = Integer.valueOf(z4 ? 1 : 0);
            objArr[4] = Integer.valueOf(z5 ? 1 : 0);
            outputStream.write(String.format(locale, "$^%s`%s`%d`%d,%d^$", objArr).getBytes("UTF-8"));
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        f63156h = true;
        a(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(OutputStream outputStream, String str, String str2) {
        f63156h = false;
        try {
            outputStream.write(String.format(Locale.US, "$^%s`%s^$", str, str2).getBytes("UTF-8"));
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        f63156h = true;
    }

    public static void a(Context context) {
        try {
            if (V()) {
                context.registerReceiver(new c((byte) 0), new IntentFilter("android.intent.action.ANR"), null, com.uc.crashsdk.a.f.a(3));
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:145|(3:177|178|(15:181|182|183|(1:150)|151|152|153|154|(1:156)|157|(1:161)|162|(1:165)|167|(2:169|170)(1:171)))|147|(1:150)|151|152|153|154|(0)|157|(2:159|161)|162|(1:165)|167|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:193|(3:225|226|(15:229|230|231|(1:198)|199|200|201|202|(1:204)|205|(1:209)|210|(1:213)|215|(2:217|218)(1:219)))|195|(1:198)|199|200|201|202|(0)|205|(2:207|209)|210|(1:213)|215|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:71|(3:103|104|(15:107|108|109|(1:76)|77|78|79|80|(1:82)|83|(1:87)|88|(1:91)|93|(2:95|96)(1:97)))|73|(1:76)|77|78|79|80|(0)|83|(2:85|87)|88|(1:91)|93|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:365|(1:369)|(3:401|402|(15:405|406|407|(1:374)|375|376|377|378|(1:380)|381|(1:385)|386|(1:389)|391|(2:393|394)(1:395)))|371|(1:374)|375|376|377|378|(0)|381|(2:383|385)|386|(1:389)|391|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:313|314|(1:318)|(3:350|351|(15:354|355|356|(1:323)|324|325|326|327|(1:329)|330|(1:334)|335|(1:338)|340|(2:342|343)(1:344)))|320|(1:323)|324|325|326|327|(0)|330|(2:332|334)|335|(1:338)|340|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:11|(5:14|15|16|(1:18)|12)|66|19|(3:52|53|(15:56|57|58|(1:24)|25|26|27|28|(1:30)|31|(1:35)|36|(1:39)|41|(2:43|44)(1:46)))|21|(1:24)|25|26|27|28|(0)|31|(2:33|35)|36|(1:39)|41|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:473|474|(1:478)|(3:509|510|(17:513|514|515|516|(1:483)|484|485|486|487|(0)|490|(2:492|494)|495|(1:498)|500|(0)|503))|480|(0)|484|485|486|487|(0)|490|(0)|495|(0)|500|(0)|503) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:417|418|(1:420)|422|(1:426)|(3:458|459|(16:462|463|464|465|(1:431)|432|433|434|435|(1:437)|438|(1:442)|443|(1:446)|448|(2:450|451)(1:452)))|428|(1:431)|432|433|434|435|(0)|438|(2:440|442)|443|(1:446)|448|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(34:117|(1:119)|120|(1:122)|123|124|125|126|127|128|(1:526)|132|133|134|135|(7:137|138|139|(1:141)(1:303)|142|143|(15:145|(3:177|178|(15:181|182|183|(1:150)|151|152|153|154|(1:156)|157|(1:161)|162|(1:165)|167|(2:169|170)(1:171)))|147|(1:150)|151|152|153|154|(0)|157|(2:159|161)|162|(1:165)|167|(0)(0))(2:191|(15:193|(3:225|226|(15:229|230|231|(1:198)|199|200|201|202|(1:204)|205|(1:209)|210|(1:213)|215|(2:217|218)(1:219)))|195|(1:198)|199|200|201|202|(0)|205|(2:207|209)|210|(1:213)|215|(0)(0))(1:239)))(5:(1:307)|308|(1:310)(1:415)|311|(17:313|314|(1:318)|(3:350|351|(15:354|355|356|(1:323)|324|325|326|327|(1:329)|330|(1:334)|335|(1:338)|340|(2:342|343)(1:344)))|320|(1:323)|324|325|326|327|(0)|330|(2:332|334)|335|(1:338)|340|(0)(0))(1:(16:365|(1:369)|(3:401|402|(15:405|406|407|(1:374)|375|376|377|378|(1:380)|381|(1:385)|386|(1:389)|391|(2:393|394)(1:395)))|371|(1:374)|375|376|377|378|(0)|381|(2:383|385)|386|(1:389)|391|(0)(0))))|240|(5:245|(1:247)|248|249|250)|251|(1:255)|(3:287|288|(16:291|292|293|294|(1:260)|261|262|263|264|(1:266)|267|(1:271)|272|(1:275)|277|(2:279|280)(1:281)))|257|(1:260)|261|262|263|264|(0)|267|(2:269|271)|272|(1:275)|277|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0132, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0133, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0248, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0249, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0280, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0281, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02c4, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x02fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x02fc, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0363, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0364, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x039b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x039c, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x03e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x03e3, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x041a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x041b, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x04df, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x04e0, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0517, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0518, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0590, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0591, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x05c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x05c9, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0079, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0611, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0612, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0649, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x064a, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b2, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00fa, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00fb, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f3 A[Catch: all -> 0x020a, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x052e, blocks: (B:151:0x0221, B:190:0x0294, B:192:0x029a, B:233:0x0315, B:234:0x031a, B:236:0x031e, B:135:0x01f3, B:142:0x0206, B:146:0x020e), top: B:491:0x01f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x023f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0269 A[Catch: all -> 0x0280, TryCatch #22 {all -> 0x0280, blocks: (B:171:0x024d, B:174:0x0258, B:176:0x0269, B:178:0x026d, B:179:0x0270, B:182:0x0278), top: B:519:0x024d }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0276 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02e4 A[Catch: all -> 0x02fb, TryCatch #18 {all -> 0x02fb, blocks: (B:212:0x02c8, B:215:0x02d3, B:217:0x02e4, B:219:0x02e8, B:220:0x02eb, B:223:0x02f3), top: B:511:0x02c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x035a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0384 A[Catch: all -> 0x039b, TryCatch #44 {all -> 0x039b, blocks: (B:266:0x0368, B:269:0x0373, B:271:0x0384, B:273:0x0388, B:274:0x038b, B:277:0x0393), top: B:556:0x0368 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0391 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0403 A[Catch: all -> 0x041a, TryCatch #43 {all -> 0x041a, blocks: (B:310:0x03e7, B:313:0x03f2, B:315:0x0403, B:317:0x0407, B:318:0x040a, B:321:0x0412), top: B:554:0x03e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x045e A[Catch: all -> 0x052c, TryCatch #6 {all -> 0x052c, blocks: (B:329:0x042e, B:332:0x0440, B:334:0x0446, B:336:0x045e, B:337:0x0461, B:343:0x048f, B:241:0x032c, B:338:0x0486), top: B:491:0x01f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x04d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0500 A[Catch: all -> 0x0517, TryCatch #42 {all -> 0x0517, blocks: (B:369:0x04e4, B:372:0x04ef, B:374:0x0500, B:376:0x0504, B:377:0x0507, B:380:0x050f), top: B:552:0x04e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x050d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0587 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x05b1 A[Catch: all -> 0x05c8, TryCatch #28 {all -> 0x05c8, blocks: (B:423:0x0595, B:426:0x05a0, B:428:0x05b1, B:430:0x05b5, B:431:0x05b8, B:434:0x05c0), top: B:530:0x0595 }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x05be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0608 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0632 A[Catch: all -> 0x0649, TryCatch #31 {all -> 0x0649, blocks: (B:468:0x0616, B:471:0x0621, B:473:0x0632, B:475:0x0636, B:476:0x0639, B:479:0x0641), top: B:536:0x0616 }] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x063f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a A[Catch: all -> 0x00b1, TryCatch #11 {all -> 0x00b1, blocks: (B:45:0x007e, B:48:0x0089, B:50:0x009a, B:52:0x009e, B:53:0x00a1, B:56:0x00a9), top: B:497:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:538:0x04ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:574:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:575:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:576:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:577:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:578:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:579:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:580:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:581:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011b A[Catch: all -> 0x0132, TryCatch #12 {all -> 0x0132, blocks: (B:88:0x00ff, B:91:0x010a, B:93:0x011b, B:95:0x011f, B:96:0x0122, B:99:0x012a), top: B:499:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Thread r20, java.lang.Throwable r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.Thread, java.lang.Throwable, boolean):void");
    }

    private static void a(Throwable th) {
        try {
            com.uc.crashsdk.a.a.d("DEBUG", a(th.getStackTrace(), (String) null).toString());
        } catch (Throwable unused) {
        }
    }

    private static void a(Calendar calendar) {
        if (g.S()) {
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(5, 1);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            long timeInMillis2 = calendar.getTimeInMillis();
            long j4 = timeInMillis2 - timeInMillis;
            long j5 = bi.f55326s;
            if (j4 <= bi.f55326s) {
                j5 = 1000 + j4;
            }
            com.uc.crashsdk.a.f.a(0, new com.uc.crashsdk.a.e(TTAdConstant.VIDEO_COVER_URL_CODE, new Object[]{Long.valueOf(timeInMillis2)}), j5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static StringBuilder a(StackTraceElement[] stackTraceElementArr, String str) {
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            boolean z4 = str == null;
            int i5 = 0;
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                i5++;
                sb.append("  at ");
                sb.append(stackTraceElement.toString());
                sb.append("\n");
                if (!z4 && stackTraceElement.getMethodName().contains(str)) {
                    sb.delete(0, sb.length());
                    z4 = true;
                    i5 = 0;
                }
            }
            i4 = i5;
        }
        if (i4 == 0) {
            sb.append("  (no java stack)\n");
        }
        return sb;
    }

    public static boolean a(ParcelFileDescriptor parcelFileDescriptor) {
        if (af) {
            com.uc.crashsdk.a.a.d("crashsdk", "Can not call setHostFd and getHostFd in the same process!");
            return false;
        } else if (!com.uc.crashsdk.b.f63118d) {
            com.uc.crashsdk.a.a.d("crashsdk", "Crash so is not loaded!");
            return false;
        } else {
            if (ae != null) {
                com.uc.crashsdk.a.a.c("crashsdk", "Has already set host fd!");
            }
            ae = parcelFileDescriptor;
            int fd = parcelFileDescriptor.getFd();
            int nativeCmd = (int) JNIBridge.nativeCmd(13, fd, null, null);
            ag = nativeCmd != -1;
            return fd == -1 || nativeCmd != -1;
        }
    }
}

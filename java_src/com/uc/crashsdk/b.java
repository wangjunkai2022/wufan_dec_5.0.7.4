package com.uc.crashsdk;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.join.mgps.Util.h0;
import com.kuaishou.weapon.p0.t;
import com.tencent.stat.DeviceInfo;
import com.uc.crashsdk.a.h;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    private static boolean A = false;
    private static boolean B = false;
    private static boolean C = false;
    private static boolean D = false;
    private static boolean E = false;
    private static boolean F = false;
    private static String H = null;
    private static int I = 0;
    private static boolean J = false;
    private static boolean K = false;
    private static boolean L = true;
    private static RandomAccessFile M = null;
    private static boolean N = false;
    private static String P = null;
    private static boolean Q = false;
    private static volatile Object[] R = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f63115a = false;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f63116b = false;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f63117c = false;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f63118d = false;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f63120f = false;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f63121g = true;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f63122h = false;

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ boolean f63123i = true;

    /* renamed from: j  reason: collision with root package name */
    private static String f63124j;

    /* renamed from: k  reason: collision with root package name */
    private static String f63125k;

    /* renamed from: l  reason: collision with root package name */
    private static String f63126l;

    /* renamed from: m  reason: collision with root package name */
    private static String f63127m;

    /* renamed from: n  reason: collision with root package name */
    private static String f63128n;

    /* renamed from: o  reason: collision with root package name */
    private static String f63129o;

    /* renamed from: p  reason: collision with root package name */
    private static String f63130p;

    /* renamed from: q  reason: collision with root package name */
    private static String f63131q;

    /* renamed from: r  reason: collision with root package name */
    private static String f63132r;

    /* renamed from: s  reason: collision with root package name */
    private static String f63133s;

    /* renamed from: t  reason: collision with root package name */
    private static String f63134t;

    /* renamed from: u  reason: collision with root package name */
    private static String f63135u;

    /* renamed from: v  reason: collision with root package name */
    private static String f63136v;

    /* renamed from: w  reason: collision with root package name */
    private static String f63137w;

    /* renamed from: x  reason: collision with root package name */
    private static boolean f63138x;

    /* renamed from: y  reason: collision with root package name */
    private static boolean f63139y;

    /* renamed from: z  reason: collision with root package name */
    private static volatile boolean f63140z;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f63119e = new Object();
    private static final Object G = new Object();
    private static final Object O = new Object();
    private static Runnable S = new com.uc.crashsdk.a.e(101);
    private static boolean T = false;
    private static long U = 0;
    private static final Object V = new Object();
    private static long W = 0;
    private static boolean X = false;
    private static boolean Y = false;
    private static boolean Z = false;
    private static long aa = 0;
    private static final WeakHashMap<Activity, Integer> ab = new WeakHashMap<>();
    private static boolean ac = false;
    private static String ad = null;
    private static boolean ae = false;
    private static boolean af = false;
    private static boolean ag = false;
    private static boolean ah = false;
    private static boolean ai = false;
    private static final Object aj = new Object();
    private static PendingIntent ak = null;

    public static boolean A() {
        return Y || !ad();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean B() {
        return Y && !f63138x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void C() {
        com.uc.crashsdk.a.f.a(2, new com.uc.crashsdk.a.e(100));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void D() {
        String str;
        if (!f63118d || (str = ad) == null) {
            return;
        }
        JNIBridge.set(129, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String E() {
        String str = ad;
        return str == null ? "" : str;
    }

    public static boolean F() {
        if (!ae) {
            if (!com.uc.crashsdk.a.g.a(a.f63035a) && a.f63035a.equals(e.h())) {
                af = true;
                if (f63118d) {
                    JNIBridge.set(2, true);
                }
            }
            ae = true;
        }
        return af;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void G() {
        ag = true;
        if (f63118d) {
            JNIBridge.set(34, true);
        }
    }

    public static boolean H() {
        return ag;
    }

    public static int I() {
        boolean U2 = U();
        return t() ? U2 ? 3 : 6 : s() ? U2 ? 2 : 5 : U2 ? 4 : 1;
    }

    public static int J() {
        boolean V2 = V();
        boolean W2 = W();
        boolean X2 = X();
        if (t()) {
            if (V2) {
                return 12;
            }
            if (W2) {
                return 14;
            }
            return X2 ? 16 : 98;
        } else if (s()) {
            if (V2) {
                return 11;
            }
            if (W2) {
                return 13;
            }
            return X2 ? 15 : 97;
        } else {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void K() {
        if (f63118d) {
            JNIBridge.nativeSet(27, I, "12", null);
            JNIBridge.set(30, L);
        }
    }

    public static boolean L() {
        if (!ai) {
            synchronized (aj) {
                if (!ai) {
                    ah = ae();
                    ai = true;
                }
            }
        }
        return ah;
    }

    public static void M() {
        if (e.F() || L() || ak != null || g.h() < 0) {
            return;
        }
        try {
            Context a5 = com.uc.crashsdk.a.g.a();
            Intent launchIntentForPackage = a5.getPackageManager().getLaunchIntentForPackage(a5.getPackageName());
            launchIntentForPackage.addFlags(335544320);
            ak = PendingIntent.getActivity(a5, 0, launchIntentForPackage, 0);
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean N() {
        if (ak == null) {
            com.uc.crashsdk.a.a.b("Restart intent is null!");
            return false;
        }
        try {
            com.uc.crashsdk.a.a.a("crashsdk", "restarting ...");
            ((AlarmManager) com.uc.crashsdk.a.g.a().getSystemService(NotificationCompat.CATEGORY_ALARM)).set(1, System.currentTimeMillis() + 200, ak);
            return true;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean O() {
        ac = true;
        return true;
    }

    private static String Q() {
        if (f63124j == null) {
            f63124j = d("ss");
        }
        return f63124j;
    }

    private static String R() {
        if (f63126l == null) {
            f63126l = d("ctn");
        }
        return f63126l;
    }

    private static String S() {
        if (f63127m == null) {
            f63127m = d("cta");
        }
        return f63127m;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #1 {, blocks: (B:9:0x000d, B:11:0x0011, B:13:0x0013, B:19:0x0057, B:21:0x005b, B:23:0x005f, B:25:0x0063, B:32:0x0079, B:33:0x007b, B:26:0x006b, B:28:0x0071), top: B:39:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void T() {
        /*
            boolean r0 = com.uc.crashsdk.b.f63140z
            if (r0 != 0) goto L80
            boolean r0 = com.uc.crashsdk.b.f63139y
            if (r0 == 0) goto La
            goto L80
        La:
            java.lang.Object r0 = com.uc.crashsdk.b.G
            monitor-enter(r0)
            boolean r1 = com.uc.crashsdk.b.f63140z     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            return
        L13:
            java.lang.String r1 = com.uc.crashsdk.g.W()     // Catch: java.lang.Throwable -> L7d
            f(r1)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = p()     // Catch: java.lang.Throwable -> L7d
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = b()     // Catch: java.lang.Throwable -> L7d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7d
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = R()     // Catch: java.lang.Throwable -> L7d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "f"
            boolean r4 = r4.equals(r1)     // Catch: java.lang.Throwable -> L7d
            com.uc.crashsdk.b.A = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "b"
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L7d
            com.uc.crashsdk.b.B = r1     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r2.exists()     // Catch: java.lang.Throwable -> L7d
            com.uc.crashsdk.b.D = r1     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r3.exists()     // Catch: java.lang.Throwable -> L7d
            com.uc.crashsdk.b.E = r1     // Catch: java.lang.Throwable -> L7d
            boolean r2 = com.uc.crashsdk.b.D     // Catch: java.lang.Throwable -> L7d
            r3 = 1
            if (r2 != 0) goto L56
            if (r1 == 0) goto L54
            goto L56
        L54:
            r1 = 0
            goto L57
        L56:
            r1 = 1
        L57:
            com.uc.crashsdk.b.C = r1     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L6b
            boolean r1 = com.uc.crashsdk.b.A     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L63
            boolean r1 = com.uc.crashsdk.b.B     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L6b
        L63:
            boolean r1 = r()     // Catch: java.lang.Throwable -> L7d
            com.uc.crashsdk.b.F = r1     // Catch: java.lang.Throwable -> L7d
            com.uc.crashsdk.b.C = r1     // Catch: java.lang.Throwable -> L7d
        L6b:
            boolean r1 = z()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L79
            Z()     // Catch: java.lang.Throwable -> L75
            goto L79
        L75:
            r1 = move-exception
            com.uc.crashsdk.a.g.a(r1)     // Catch: java.lang.Throwable -> L7d
        L79:
            com.uc.crashsdk.b.f63140z = r3     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            return
        L7d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            throw r1
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.b.T():void");
    }

    private static boolean U() {
        T();
        return C;
    }

    private static boolean V() {
        T();
        return D;
    }

    private static boolean W() {
        T();
        return E;
    }

    private static boolean X() {
        T();
        return F;
    }

    private static void Y() {
        if (f63118d) {
            JNIBridge.set(26, f63138x);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:29:0x0044). Please submit an issue!!! */
    private static void Z() {
        if (!T) {
            T = true;
            try {
                new File(b()).delete();
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
            try {
                new File(R()).delete();
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
            try {
                if (f63118d) {
                    JNIBridge.cmd(16);
                } else {
                    new File(S()).delete();
                }
            } catch (Throwable th3) {
                com.uc.crashsdk.a.g.a(th3);
            }
        }
        Object[] ab2 = ab();
        if (!ab2[0].equals(P) && R == null) {
            a(ab2);
            return;
        }
        Q = true;
        aa();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        String str = H;
        if (str != null) {
            return str;
        }
        String h4 = e.h();
        if (com.uc.crashsdk.a.g.a(h4)) {
            H = "LLUN";
        } else {
            int i4 = 0;
            if (h4.length() > 48) {
                h4 = h4.substring(0, 48);
                i4 = h4.length() - 48;
            }
            StringBuilder sb = new StringBuilder();
            byte[] bytes = h4.getBytes();
            for (int length = bytes.length - 1; length >= 0; length--) {
                byte b5 = bytes[length];
                if (b5 == 46) {
                    sb.append('0');
                } else if (b5 == 58) {
                    sb.append('1');
                } else if (b5 >= 97 && b5 <= 122) {
                    sb.append((char) ((b5 + 65) - 97));
                } else if (b5 >= 65 && b5 <= 90) {
                    sb.append((char) b5);
                } else if (b5 >= 48 && b5 <= 57) {
                    sb.append((char) b5);
                } else {
                    sb.append('2');
                }
            }
            if (i4 > 0) {
                sb.append(String.valueOf(i4));
            }
            H = sb.toString();
        }
        return H;
    }

    private static void aa() {
        if (!com.uc.crashsdk.a.f.b(S)) {
            com.uc.crashsdk.a.f.a(1, S);
            return;
        }
        Object[] objArr = R;
        if (objArr == null || !ab()[0].equals(objArr[0])) {
            com.uc.crashsdk.a.f.a(S);
            com.uc.crashsdk.a.f.a(1, S);
        }
    }

    private static Object[] ab() {
        synchronized (V) {
            long j4 = W + 1;
            W = j4;
            if (f63138x) {
                return new Object[]{com.kwad.sdk.m.e.TAG, Long.valueOf(j4)};
            } else if (B()) {
                return new Object[]{com.xinzhu.overmind.utils.helpers.f.f68332a, Long.valueOf(W)};
            } else {
                return new Object[]{t.f55693l, Long.valueOf(W)};
            }
        }
    }

    private static Object ac() {
        Object a5;
        Object a6 = a((Application) com.uc.crashsdk.a.g.a(), Application.class, "mLoadedApk");
        if (a6 == null || (a5 = a(a6, (Class<?>) null, "mActivityThread")) == null) {
            try {
                Method declaredMethod = Class.forName(InstrumentationProxy.f64868d).getDeclaredMethod(InstrumentationProxy.f64869e, new Class[0]);
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                    return declaredMethod.invoke(null, new Object[0]);
                }
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
            return null;
        }
        return a5;
    }

    private static boolean ad() {
        String a5 = com.uc.crashsdk.a.g.a(new File("/proc/self/cgroup"), 512, false);
        if (com.uc.crashsdk.a.g.a(a5)) {
            return false;
        }
        return a5.contains("/bg_non_interactive") || a5.contains("/background");
    }

    private static boolean ae() {
        try {
            Method declaredMethod = Process.class.getDeclaredMethod("isIsolated", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null && (invoke instanceof Boolean)) {
                    return ((Boolean) invoke).booleanValue();
                }
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        int myUid = Process.myUid() % 100000;
        return myUid >= 99000 && myUid <= 99999;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b() {
        if (f63125k == null) {
            f63125k = d("ctj");
        }
        return f63125k;
    }

    private static String d(String str) {
        return g.W() + a() + h0.f27805a + str;
    }

    private static File[] e(String str) {
        if (f63123i || str.length() > 0) {
            File[] listFiles = new File(g.W()).listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    if (file.getPath().endsWith(str)) {
                        arrayList.add(file);
                    }
                }
                return (File[]) arrayList.toArray(new File[arrayList.size()]);
            }
            return null;
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File[] f() {
        return e(".stcb");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g() {
        if (f63136v == null) {
            f63136v = d("bati");
        }
        return f63136v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h() {
        if (f63137w == null) {
            f63137w = d("hdr");
        }
        return f63137w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i() {
        if (f63131q == null) {
            f63131q = g.W() + "up";
        }
        return f63131q;
    }

    public static String j() {
        if (f63132r == null) {
            f63132r = g.W() + "authu";
        }
        return f63132r;
    }

    public static String k() {
        if (f63133s == null) {
            f63133s = g.W() + "statu";
        }
        return f63133s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String l() {
        if (f63134t == null) {
            f63134t = g.W() + "poli";
        }
        return f63134t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String m() {
        if (f63135u == null) {
            f63135u = g.W() + DeviceInfo.TAG_VERSION;
        }
        return f63135u;
    }

    public static String n() {
        return g.W() + "bvu";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String o() {
        return g.W() + "fds";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String p() {
        return com.uc.crashsdk.a.g.a(new File(Q()), 8, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q() {
        return f63139y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r() {
        if (!J) {
            if (f63118d) {
                K = JNIBridge.cmd(15) == 1;
            } else {
                K = new File(S()).exists();
            }
            J = true;
        }
        return K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s() {
        T();
        return A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t() {
        T();
        return B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u() {
        return f63138x;
    }

    public static void v() {
        boolean z4;
        f(g.W());
        f63139y = true;
        A = false;
        B = false;
        C = false;
        D = false;
        E = false;
        F = false;
        String[] strArr = {".st", ".wa", ".callback", ".ctn", ".ctj", ".cta", ".signal"};
        String[] strArr2 = {"up", "authu", "statu", "poli"};
        File[] listFiles = new File(g.W()).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                int i4 = 0;
                while (true) {
                    if (i4 >= 7) {
                        z4 = false;
                        break;
                    } else if (name.endsWith(strArr[i4])) {
                        z4 = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (!z4) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= 4) {
                            break;
                        } else if (name.equals(strArr2[i5])) {
                            z4 = true;
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                if (z4) {
                    com.uc.crashsdk.a.a.a("crashsdk", "delete file: " + file.getPath());
                    com.uc.crashsdk.a.g.a(file);
                }
            }
        }
        Z();
    }

    public static void w() {
        if (f63138x) {
            return;
        }
        f63138x = true;
        if (L() || e.u()) {
            return;
        }
        f(g.W());
        Y();
        Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean x() {
        return f(g.W());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean y() {
        return f(g.X());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean z() {
        return X || !ad();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c() {
        if (f63128n == null) {
            f63128n = d("st");
        }
        return f63128n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File[] d() {
        return e(".st");
    }

    private static boolean f(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return true;
        }
        com.uc.crashsdk.a.a.a("crashsdk", "Crash log directory was placed by a file!", null);
        if (file.delete()) {
            file.mkdirs();
            return true;
        }
        return false;
    }

    public static String b(String str) {
        return "debug.crs." + str;
    }

    public static void b(boolean z4) {
        if (e.u()) {
            return;
        }
        if (z4 && f63138x) {
            g.O();
            f63138x = false;
            Y();
        }
        boolean z5 = e.F() || L();
        long currentTimeMillis = System.currentTimeMillis();
        if (X && !Y && z4) {
            long j4 = aa;
            if (j4 != 0 && !z5 && currentTimeMillis - j4 > 1800000) {
                com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(104), 1000L);
            }
        }
        aa = currentTimeMillis;
        Y = z4;
        if (z4) {
            X = true;
        }
        if (f63118d) {
            JNIBridge.nativeSetForeground(z4);
        }
        if (f63138x || z5) {
            return;
        }
        T();
        Z();
        if (z4) {
            a.a(false);
            if (!Z) {
                e.B();
                Z = true;
            }
        }
        if (!N) {
            aa();
        }
        e.c(z4);
    }

    public static boolean c(int i4) {
        return (i4 & I) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e() {
        if (f63129o == null) {
            f63129o = d("stcb");
        }
        return f63129o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        if (str == null || str.length() <= 0 || !str.endsWith(".st")) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(".st");
        if (f63123i || lastIndexOf >= 0) {
            String substring = str.substring(0, lastIndexOf);
            if (substring.length() <= 0) {
                return null;
            }
            return substring + ".stcb";
        }
        throw new AssertionError();
    }

    public static void a(boolean z4) {
        L = z4;
        if (f63118d) {
            JNIBridge.set(30, z4);
        }
    }

    public static void b(int i4) {
        I = i4;
        K();
    }

    private static void a(Object[] objArr) {
        R = objArr;
        synchronized (O) {
            String str = (String) objArr[0];
            long longValue = ((Long) objArr[1]).longValue();
            if (longValue < U) {
                com.uc.crashsdk.a.a.c("crashsdk", String.format(Locale.US, "Update state generation %d, last is: %d", Long.valueOf(longValue), Long.valueOf(U)));
                return;
            }
            U = longValue;
            String Q2 = Q();
            if (f63118d) {
                RandomAccessFile randomAccessFile = M;
                if (randomAccessFile != null) {
                    com.uc.crashsdk.a.g.a(randomAccessFile);
                    M = null;
                }
                boolean nativeChangeState = JNIBridge.nativeChangeState(Q2, str, N);
                N = false;
                if (!nativeChangeState) {
                    com.uc.crashsdk.a.a.b("write state failed: " + str);
                }
            } else {
                RandomAccessFile randomAccessFile2 = M;
                if (randomAccessFile2 == null || N) {
                    if (randomAccessFile2 != null) {
                        com.uc.crashsdk.a.g.a(randomAccessFile2);
                        M = null;
                    }
                    try {
                        RandomAccessFile randomAccessFile3 = new RandomAccessFile(Q2, net.lingala.zip4j.util.e.f71861e0);
                        M = randomAccessFile3;
                        randomAccessFile3.seek(0L);
                        N = false;
                    } catch (Exception e5) {
                        com.uc.crashsdk.a.g.a(e5);
                    }
                }
                try {
                    M.write(str.getBytes());
                    M.seek(0L);
                } catch (Exception e6) {
                    com.uc.crashsdk.a.g.a(e6);
                }
            }
            P = str;
            R = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context) {
        com.uc.crashsdk.a.a.a("Restart APP");
        if (context == null) {
            return;
        }
        if (f63130p == null) {
            f63130p = d("rt");
        }
        File file = new File(f63130p);
        long j4 = -1;
        try {
            j4 = Long.parseLong(com.uc.crashsdk.a.g.d(file));
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        boolean z4 = false;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (g.h() >= 0 && (j4 <= 0 || currentTimeMillis - j4 > g.h())) {
            f(g.W());
            com.uc.crashsdk.a.g.a(file, String.valueOf(currentTimeMillis));
            z4 = true;
        }
        com.uc.crashsdk.a.a.a("lastTime: " + j4 + ", currentTime: " + currentTimeMillis + ", needRestart: " + z4);
        if (z4) {
            try {
                d.a(true);
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
            N();
        }
    }

    public static boolean a(Context context) {
        try {
            ((Application) context).registerActivityLifecycleCallbacks(new c());
            if (g.L()) {
                C();
                return true;
            }
            return true;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return false;
        }
    }

    public static void a(int i4) {
        Object a5;
        Activity activity;
        int i5;
        boolean z4 = false;
        boolean z5 = true;
        switch (i4) {
            case 100:
                Object ac2 = ac();
                if (ac2 == null || (a5 = a(ac2, (Class<?>) null, "mActivities")) == null) {
                    return;
                }
                try {
                    boolean z6 = false;
                    for (Map.Entry entry : ((Map) a5).entrySet()) {
                        Object value = entry.getValue();
                        if (value != null && (activity = (Activity) a(value, (Class<?>) null, TTDownloadField.TT_ACTIVITY)) != null) {
                            boolean booleanValue = ((Boolean) a(value, (Class<?>) null, "paused")).booleanValue();
                            boolean booleanValue2 = ((Boolean) a(value, (Class<?>) null, "stopped")).booleanValue();
                            WeakHashMap<Activity, Integer> weakHashMap = ab;
                            synchronized (weakHashMap) {
                                if (booleanValue || booleanValue2) {
                                    i5 = 2;
                                } else {
                                    i5 = 1;
                                    z6 = true;
                                }
                                weakHashMap.put(activity, Integer.valueOf(i5));
                            }
                        }
                        z4 = true;
                    }
                    if (z4) {
                        b(z6);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    com.uc.crashsdk.a.g.a(th);
                    return;
                }
            case 101:
                try {
                    if (new File(Q()).exists()) {
                        z5 = false;
                    }
                    N = z5;
                    if (z5 || Q) {
                        a(ab());
                        Q = false;
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    com.uc.crashsdk.a.g.a(th2);
                    return;
                }
            case 102:
                com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(103));
                return;
            case 103:
                try {
                    com.uc.crashsdk.a.g.a(new File(S()));
                    return;
                } catch (Throwable th3) {
                    com.uc.crashsdk.a.g.a(th3);
                    return;
                }
            case 104:
                h.d();
                f.a(102);
                if (F()) {
                    e.C();
                    return;
                }
                return;
            default:
                if (!f63123i) {
                    throw new AssertionError();
                }
                return;
        }
    }

    private static Object a(Object obj, Class<?> cls, String str) {
        if (obj == null) {
            return null;
        }
        if (cls == null) {
            cls = obj.getClass();
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return null;
        }
    }

    public static boolean a(Object obj, String str, com.uc.crashsdk.a.e eVar) {
        FileChannel fileChannel;
        boolean z4;
        synchronized (obj) {
            FileChannel fileChannel2 = null;
            r1 = null;
            FileLock lock = null;
            fileChannel2 = null;
            boolean z5 = false;
            if (f63118d) {
                int nativeOpenFile = JNIBridge.nativeOpenFile(str);
                if (nativeOpenFile < 0) {
                    com.uc.crashsdk.a.a.a("crashsdk", "Can not open file: " + str, null);
                    return false;
                }
                boolean nativeLockFile = JNIBridge.nativeLockFile(nativeOpenFile, true);
                try {
                    z4 = eVar.a();
                    JNIBridge.nativeCloseFile(nativeOpenFile);
                } finally {
                    if (nativeLockFile) {
                        JNIBridge.nativeLockFile(nativeOpenFile, false);
                    }
                }
            } else {
                File file = new File(str);
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (Exception e5) {
                        com.uc.crashsdk.a.g.a(e5);
                    }
                }
                try {
                    try {
                        fileChannel = new RandomAccessFile(file, net.lingala.zip4j.util.e.f71861e0).getChannel();
                    } catch (Exception e6) {
                        try {
                            com.uc.crashsdk.a.g.a(e6);
                            fileChannel = null;
                        } catch (Exception e7) {
                            e = e7;
                            com.uc.crashsdk.a.g.a(e);
                            com.uc.crashsdk.a.g.a(fileChannel2);
                            z4 = z5;
                            return z4;
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            try {
                                lock = fileChannel.lock();
                            } catch (Exception e8) {
                                try {
                                    com.uc.crashsdk.a.g.a(e8);
                                } catch (Exception e9) {
                                    e = e9;
                                    fileChannel2 = fileChannel;
                                    com.uc.crashsdk.a.g.a(e);
                                    com.uc.crashsdk.a.g.a(fileChannel2);
                                    z4 = z5;
                                    return z4;
                                }
                            }
                        } catch (Throwable th) {
                            fileChannel2 = fileChannel;
                            th = th;
                            com.uc.crashsdk.a.g.a(fileChannel2);
                            throw th;
                        }
                    }
                    try {
                        z5 = eVar.a();
                        com.uc.crashsdk.a.g.a(fileChannel);
                        z4 = z5;
                    } finally {
                        if (lock != null) {
                            try {
                                lock.release();
                            } catch (Exception e10) {
                                com.uc.crashsdk.a.g.a(e10);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    com.uc.crashsdk.a.g.a(fileChannel2);
                    throw th;
                }
            }
            return z4;
        }
    }
}

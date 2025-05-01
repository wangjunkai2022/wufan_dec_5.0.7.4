package external.org.apache.commons.lang3;

import java.io.File;
import java.io.PrintStream;
/* compiled from: SystemUtils.java */
/* loaded from: classes.dex */
public class f {
    public static final String A;
    public static final boolean A0;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final boolean W;
    public static final boolean X;
    public static final boolean Y;
    public static final boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private static final String f68916a = "Windows";

    /* renamed from: a0  reason: collision with root package name */
    public static final boolean f68917a0;

    /* renamed from: b  reason: collision with root package name */
    private static final String f68918b = "user.home";

    /* renamed from: b0  reason: collision with root package name */
    public static final boolean f68919b0;

    /* renamed from: c  reason: collision with root package name */
    private static final String f68920c = "user.dir";

    /* renamed from: c0  reason: collision with root package name */
    public static final boolean f68921c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final boolean f68923d0;

    /* renamed from: e0  reason: collision with root package name */
    public static final boolean f68925e0;

    /* renamed from: f0  reason: collision with root package name */
    public static final boolean f68927f0;

    /* renamed from: g0  reason: collision with root package name */
    public static final boolean f68929g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final boolean f68931h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final boolean f68933i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final boolean f68935j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final boolean f68937k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final boolean f68939l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final boolean f68941m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final boolean f68943n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final boolean f68945o0;

    /* renamed from: p0  reason: collision with root package name */
    public static final boolean f68947p0;

    /* renamed from: q0  reason: collision with root package name */
    public static final boolean f68949q0;

    /* renamed from: r0  reason: collision with root package name */
    public static final boolean f68951r0;

    /* renamed from: s0  reason: collision with root package name */
    public static final boolean f68953s0;

    /* renamed from: t0  reason: collision with root package name */
    public static final boolean f68955t0;

    /* renamed from: u0  reason: collision with root package name */
    public static final boolean f68957u0;

    /* renamed from: v0  reason: collision with root package name */
    public static final boolean f68959v0;

    /* renamed from: w0  reason: collision with root package name */
    public static final boolean f68961w0;

    /* renamed from: x0  reason: collision with root package name */
    public static final boolean f68963x0;

    /* renamed from: y  reason: collision with root package name */
    public static final String f68964y;

    /* renamed from: y0  reason: collision with root package name */
    public static final boolean f68965y0;

    /* renamed from: z  reason: collision with root package name */
    private static final JavaVersion f68966z;

    /* renamed from: z0  reason: collision with root package name */
    public static final boolean f68967z0;

    /* renamed from: f  reason: collision with root package name */
    public static final String f68926f = f("awt.toolkit");

    /* renamed from: g  reason: collision with root package name */
    public static final String f68928g = f("file.encoding");

    /* renamed from: h  reason: collision with root package name */
    public static final String f68930h = f("file.separator");

    /* renamed from: i  reason: collision with root package name */
    public static final String f68932i = f("java.awt.fonts");

    /* renamed from: j  reason: collision with root package name */
    public static final String f68934j = f("java.awt.graphicsenv");

    /* renamed from: k  reason: collision with root package name */
    public static final String f68936k = f("java.awt.headless");

    /* renamed from: l  reason: collision with root package name */
    public static final String f68938l = f("java.awt.printerjob");

    /* renamed from: m  reason: collision with root package name */
    public static final String f68940m = f("java.class.path");

    /* renamed from: n  reason: collision with root package name */
    public static final String f68942n = f("java.class.version");

    /* renamed from: o  reason: collision with root package name */
    public static final String f68944o = f("java.compiler");

    /* renamed from: p  reason: collision with root package name */
    public static final String f68946p = f("java.endorsed.dirs");

    /* renamed from: q  reason: collision with root package name */
    public static final String f68948q = f("java.ext.dirs");

    /* renamed from: e  reason: collision with root package name */
    private static final String f68924e = "java.home";

    /* renamed from: r  reason: collision with root package name */
    public static final String f68950r = f(f68924e);

    /* renamed from: d  reason: collision with root package name */
    private static final String f68922d = "java.io.tmpdir";

    /* renamed from: s  reason: collision with root package name */
    public static final String f68952s = f(f68922d);

    /* renamed from: t  reason: collision with root package name */
    public static final String f68954t = f("java.library.path");

    /* renamed from: u  reason: collision with root package name */
    public static final String f68956u = f("java.runtime.name");

    /* renamed from: v  reason: collision with root package name */
    public static final String f68958v = f("java.runtime.version");

    /* renamed from: w  reason: collision with root package name */
    public static final String f68960w = f("java.specification.name");

    /* renamed from: x  reason: collision with root package name */
    public static final String f68962x = f("java.specification.vendor");

    static {
        String f5 = f("java.specification.version");
        f68964y = f5;
        f68966z = JavaVersion.get(f5);
        A = f("java.util.prefs.PreferencesFactory");
        B = f("java.vendor");
        C = f("java.vendor.url");
        D = f("java.version");
        E = f("java.vm.info");
        F = f("java.vm.name");
        G = f("java.vm.specification.name");
        H = f("java.vm.specification.vendor");
        I = f("java.vm.specification.version");
        J = f("java.vm.vendor");
        K = f("java.vm.version");
        L = f("line.separator");
        M = f("os.arch");
        N = f("os.name");
        O = f("os.version");
        P = f("path.separator");
        Q = f(f("user.country") == null ? "user.region" : "user.country");
        R = f(f68920c);
        S = f(f68918b);
        T = f("user.language");
        U = f("user.name");
        V = f("user.timezone");
        W = c("1.1");
        X = c(j1.b.f69563b);
        Y = c("1.3");
        Z = c("1.4");
        f68917a0 = c("1.5");
        f68919b0 = c("1.6");
        f68921c0 = c("1.7");
        boolean e5 = e("AIX");
        f68923d0 = e5;
        boolean e6 = e("HP-UX");
        f68925e0 = e6;
        boolean e7 = e("Irix");
        f68927f0 = e7;
        boolean z4 = false;
        boolean z5 = e("Linux") || e("LINUX");
        f68929g0 = z5;
        f68931h0 = e("Mac");
        boolean e8 = e("Mac OS X");
        f68933i0 = e8;
        boolean e9 = e("FreeBSD");
        f68935j0 = e9;
        boolean e10 = e("OpenBSD");
        f68937k0 = e10;
        boolean e11 = e("NetBSD");
        f68939l0 = e11;
        f68941m0 = e("OS/2");
        boolean e12 = e("Solaris");
        f68943n0 = e12;
        boolean e13 = e("SunOS");
        f68945o0 = e13;
        f68947p0 = (e5 || e6 || e7 || z5 || e8 || e12 || e13 || e9 || e10 || e11) ? true : true;
        f68949q0 = e(f68916a);
        f68951r0 = d(f68916a, "5.0");
        f68953s0 = d(f68916a, "5.2");
        f68955t0 = d("Windows Server 2008", "6.1");
        f68957u0 = d("Windows 9", "4.0");
        f68959v0 = d("Windows 9", "4.1");
        f68961w0 = d(f68916a, "4.9");
        f68963x0 = e("Windows NT");
        f68965y0 = d(f68916a, "5.1");
        f68967z0 = d(f68916a, "6.0");
        A0 = d(f68916a, "6.1");
    }

    public static File a() {
        return new File(System.getProperty(f68924e));
    }

    public static File b() {
        return new File(System.getProperty(f68922d));
    }

    private static boolean c(String str) {
        return k(f68964y, str);
    }

    private static boolean d(String str, String str2) {
        return l(N, O, str, str2);
    }

    private static boolean e(String str) {
        return m(N, str);
    }

    private static String f(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            PrintStream printStream = System.err;
            printStream.println("Caught a SecurityException reading the system property '" + str + "'; the SystemUtils property value will default to null.");
            return null;
        }
    }

    public static File g() {
        return new File(System.getProperty(f68920c));
    }

    public static File h() {
        return new File(System.getProperty(f68918b));
    }

    public static boolean i() {
        String str = f68936k;
        if (str != null) {
            return str.equals(Boolean.TRUE.toString());
        }
        return false;
    }

    public static boolean j(JavaVersion javaVersion) {
        return f68966z.atLeast(javaVersion);
    }

    static boolean k(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    static boolean l(String str, String str2, String str3, String str4) {
        return str != null && str2 != null && str.startsWith(str3) && str2.startsWith(str4);
    }

    static boolean m(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }
}

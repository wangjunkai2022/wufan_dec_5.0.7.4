package com.join.mgps.Util;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
/* compiled from: RomUtils.java */
/* loaded from: classes3.dex */
public final class r1 {
    private static final String A = "ro.build.MiFavor_version";
    private static final String B = "ro.rom.version";
    private static final String C = "ro.build.rom.id";
    private static final String D = "unknown";

    /* renamed from: u  reason: collision with root package name */
    private static final String f28024u = "ro.build.version.emui";

    /* renamed from: v  reason: collision with root package name */
    private static final String f28025v = "ro.vivo.os.build.display.id";

    /* renamed from: w  reason: collision with root package name */
    private static final String f28026w = "ro.build.version.incremental";

    /* renamed from: x  reason: collision with root package name */
    private static final String f28027x = "ro.build.version.opporom";

    /* renamed from: y  reason: collision with root package name */
    private static final String f28028y = "ro.letv.release.version";

    /* renamed from: z  reason: collision with root package name */
    private static final String f28029z = "ro.build.uiversion";

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f28004a = {"huawei"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f28005b = {"vivo"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f28006c = {"xiaomi"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f28007d = {"oppo"};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f28008e = {"leeco", "letv"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f28009f = {"360", "qiku"};

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f28010g = {"zte"};

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f28011h = {"oneplus"};

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f28012i = {"nubia"};

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f28013j = {"coolpad", "yulong"};

    /* renamed from: k  reason: collision with root package name */
    private static final String[] f28014k = {"lg", "lge"};

    /* renamed from: l  reason: collision with root package name */
    private static final String[] f28015l = {"google"};

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f28016m = {"samsung"};

    /* renamed from: n  reason: collision with root package name */
    private static final String[] f28017n = {"meizu"};

    /* renamed from: o  reason: collision with root package name */
    private static final String[] f28018o = {"lenovo"};

    /* renamed from: p  reason: collision with root package name */
    private static final String[] f28019p = {"smartisan"};

    /* renamed from: q  reason: collision with root package name */
    private static final String[] f28020q = {"htc"};

    /* renamed from: r  reason: collision with root package name */
    private static final String[] f28021r = {"sony"};

    /* renamed from: s  reason: collision with root package name */
    private static final String[] f28022s = {"gionee", "amigo"};

    /* renamed from: t  reason: collision with root package name */
    private static final String[] f28023t = {"motorola"};
    private static a E = null;

    /* compiled from: RomUtils.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f28030a;

        /* renamed from: b  reason: collision with root package name */
        private String f28031b;

        public String d() {
            return this.f28030a;
        }

        public String e() {
            return this.f28031b;
        }

        public String toString() {
            return "RomInfo{name=" + this.f28030a + ", version=" + this.f28031b + "}";
        }
    }

    private r1() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean A() {
        return f28005b[0].equals(c().f28030a);
    }

    public static boolean B() {
        return f28006c[0].equals(c().f28030a);
    }

    public static boolean C() {
        return f28010g[0].equals(c().f28030a);
    }

    private static String a() {
        try {
            String str = Build.BRAND;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    private static String b() {
        try {
            String str = Build.MANUFACTURER;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static a c() {
        a aVar = E;
        if (aVar != null) {
            return aVar;
        }
        E = new a();
        String a5 = a();
        String b5 = b();
        String[] strArr = f28004a;
        if (w(a5, b5, strArr)) {
            E.f28030a = strArr[0];
            String d5 = d(f28024u);
            String[] split = d5.split("_");
            if (split.length <= 1) {
                E.f28031b = d5;
            } else {
                E.f28031b = split[1];
            }
            return E;
        }
        String[] strArr2 = f28005b;
        if (w(a5, b5, strArr2)) {
            E.f28030a = strArr2[0];
            E.f28031b = d(f28025v);
            return E;
        }
        String[] strArr3 = f28006c;
        if (w(a5, b5, strArr3)) {
            E.f28030a = strArr3[0];
            E.f28031b = d(f28026w);
            return E;
        }
        String[] strArr4 = f28007d;
        if (w(a5, b5, strArr4)) {
            E.f28030a = strArr4[0];
            E.f28031b = d(f28027x);
            return E;
        }
        String[] strArr5 = f28008e;
        if (w(a5, b5, strArr5)) {
            E.f28030a = strArr5[0];
            E.f28031b = d(f28028y);
            return E;
        }
        String[] strArr6 = f28009f;
        if (w(a5, b5, strArr6)) {
            E.f28030a = strArr6[0];
            E.f28031b = d(f28029z);
            return E;
        }
        String[] strArr7 = f28010g;
        if (w(a5, b5, strArr7)) {
            E.f28030a = strArr7[0];
            E.f28031b = d(A);
            return E;
        }
        String[] strArr8 = f28011h;
        if (w(a5, b5, strArr8)) {
            E.f28030a = strArr8[0];
            E.f28031b = d(B);
            return E;
        }
        String[] strArr9 = f28012i;
        if (w(a5, b5, strArr9)) {
            E.f28030a = strArr9[0];
            E.f28031b = d(C);
            return E;
        }
        String[] strArr10 = f28013j;
        if (w(a5, b5, strArr10)) {
            E.f28030a = strArr10[0];
        } else {
            String[] strArr11 = f28014k;
            if (w(a5, b5, strArr11)) {
                E.f28030a = strArr11[0];
            } else {
                String[] strArr12 = f28015l;
                if (w(a5, b5, strArr12)) {
                    E.f28030a = strArr12[0];
                } else {
                    String[] strArr13 = f28016m;
                    if (w(a5, b5, strArr13)) {
                        E.f28030a = strArr13[0];
                    } else {
                        String[] strArr14 = f28017n;
                        if (w(a5, b5, strArr14)) {
                            E.f28030a = strArr14[0];
                        } else {
                            String[] strArr15 = f28018o;
                            if (w(a5, b5, strArr15)) {
                                E.f28030a = strArr15[0];
                            } else {
                                String[] strArr16 = f28019p;
                                if (w(a5, b5, strArr16)) {
                                    E.f28030a = strArr16[0];
                                } else {
                                    String[] strArr17 = f28020q;
                                    if (w(a5, b5, strArr17)) {
                                        E.f28030a = strArr17[0];
                                    } else {
                                        String[] strArr18 = f28021r;
                                        if (w(a5, b5, strArr18)) {
                                            E.f28030a = strArr18[0];
                                        } else {
                                            String[] strArr19 = f28022s;
                                            if (w(a5, b5, strArr19)) {
                                                E.f28030a = strArr19[0];
                                            } else {
                                                String[] strArr20 = f28023t;
                                                if (!w(a5, b5, strArr20)) {
                                                    E.f28030a = b5;
                                                } else {
                                                    E.f28030a = strArr20[0];
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        E.f28031b = d("");
        return E;
    }

    private static String d(String str) {
        String e5 = !TextUtils.isEmpty(str) ? e(str) : "";
        if (TextUtils.isEmpty(e5) || e5.equals("unknown")) {
            try {
                String str2 = Build.DISPLAY;
                if (!TextUtils.isEmpty(str2)) {
                    e5 = str2.toLowerCase();
                }
            } catch (Throwable unused) {
            }
        }
        return TextUtils.isEmpty(e5) ? "unknown" : e5;
    }

    private static String e(String str) {
        String g4 = g(str);
        if (TextUtils.isEmpty(g4)) {
            String h4 = h(str);
            return (TextUtils.isEmpty(h4) && Build.VERSION.SDK_INT < 28) ? f(str) : h4;
        }
        return g4;
    }

    private static String f(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    private static String g(String str) {
        BufferedReader bufferedReader;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                Runtime runtime = Runtime.getRuntime();
                bufferedReader = new BufferedReader(new InputStreamReader(runtime.exec("getprop " + str).getInputStream()), 1024);
            } catch (IOException unused) {
                return "";
            }
        } catch (IOException unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            readLine = bufferedReader.readLine();
        } catch (IOException unused3) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
                return "";
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        if (readLine != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused5) {
            }
            return readLine;
        }
        bufferedReader.close();
        return "";
    }

    private static String h(String str) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
            return properties.getProperty(str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean i() {
        return f28009f[0].equals(c().f28030a);
    }

    public static boolean j() {
        return f28013j[0].equals(c().f28030a);
    }

    public static boolean k() {
        return f28022s[0].equals(c().f28030a);
    }

    public static boolean l() {
        return f28015l[0].equals(c().f28030a);
    }

    public static boolean m() {
        return f28020q[0].equals(c().f28030a);
    }

    public static boolean n() {
        return f28004a[0].equals(c().f28030a);
    }

    public static boolean o() {
        return f28008e[0].equals(c().f28030a);
    }

    public static boolean p() {
        return f28018o[0].equals(c().f28030a);
    }

    public static boolean q() {
        return f28014k[0].equals(c().f28030a);
    }

    public static boolean r() {
        return f28017n[0].equals(c().f28030a);
    }

    public static boolean s() {
        return f28023t[0].equals(c().f28030a);
    }

    public static boolean t() {
        return f28012i[0].equals(c().f28030a);
    }

    public static boolean u() {
        return f28011h[0].equals(c().f28030a);
    }

    public static boolean v() {
        return f28007d[0].equals(c().f28030a);
    }

    private static boolean w(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean x() {
        return f28016m[0].equals(c().f28030a);
    }

    public static boolean y() {
        return f28019p[0].equals(c().f28030a);
    }

    public static boolean z() {
        return f28021r[0].equals(c().f28030a);
    }
}

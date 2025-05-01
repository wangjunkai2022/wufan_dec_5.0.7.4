package com.xinzhu.overmind;

import android.util.ArrayMap;
import android.util.Base64;
import com.join.mgps.mod.utils.d;
import com.xinzhu.overmind.utils.e;
import com.xinzhu.overmind.utils.k;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
/* compiled from: MindEnvironment.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67433a = "a";

    /* renamed from: b  reason: collision with root package name */
    private static File f67434b;

    /* renamed from: c  reason: collision with root package name */
    private static File f67435c;

    /* renamed from: d  reason: collision with root package name */
    private static File f67436d;

    /* renamed from: e  reason: collision with root package name */
    private static File f67437e;

    /* renamed from: f  reason: collision with root package name */
    private static File f67438f;

    /* renamed from: g  reason: collision with root package name */
    private static File f67439g = Overmind.getContext().getExternalFilesDir("virtual");

    /* renamed from: h  reason: collision with root package name */
    public static File f67440h = new File(l(), "junit.jar");

    /* renamed from: i  reason: collision with root package name */
    public static String f67441i = "armeabi-v7a";

    /* renamed from: j  reason: collision with root package name */
    public static String f67442j = d.f53621d;

    /* renamed from: k  reason: collision with root package name */
    public static String f67443k = "arm64-v8a";

    /* renamed from: l  reason: collision with root package name */
    public static ArrayMap<String, String> f67444l = new ArrayMap<>();

    static {
        File parentFile = new File(Overmind.getContext().getApplicationInfo().dataDir).getParentFile();
        f67434b = parentFile;
        try {
            f67434b = parentFile.getCanonicalFile();
        } catch (Throwable unused) {
        }
        f67435c = new File(f67434b, Overmind.getMainPkg());
        f67436d = new File(f67435c, "virtual");
        f67437e = new File(f67434b, Overmind.getPluginPkg());
        f67438f = new File(f67437e, "virtual");
        f67444l.put(f67441i, "arm");
        f67444l.put(f67442j, "arm");
        f67444l.put(f67443k, "arm64");
    }

    public static File A() {
        return new File(U(), "enabled-component.conf");
    }

    public static File B(String str, int i4) {
        return new File(C(str, i4), "cache");
    }

    public static File C(String str, int i4) {
        return new File(F(i4), String.format(Locale.CHINA, "Android/data/%s", str));
    }

    public static File D(String str, int i4) {
        return new File(C(str, i4), "files");
    }

    public static File E() {
        return f67439g;
    }

    public static File F(int i4) {
        return new File(f67439g, String.format(Locale.CHINA, "%d/", Integer.valueOf(i4)));
    }

    public static File G() {
        return f67439g;
    }

    public static File H(String str) {
        return new File(I(str), "base.apk");
    }

    public static File I(String str) {
        byte[] bytes;
        if (e.w()) {
            if (str.length() > 16) {
                bytes = str.substring(0, 16).getBytes(StandardCharsets.UTF_8);
            } else {
                bytes = str.getBytes(StandardCharsets.UTF_8);
            }
            return new File(String.format("/data/app/%s-%s", str, Base64.encodeToString(bytes, 10)));
        }
        return new File(String.format("/data/app/%s-1", str));
    }

    public static File J(String str) {
        return new File(I(str), "lib");
    }

    public static String K(String str) {
        String str2 = f67444l.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new RuntimeException("Invalid abi " + str);
    }

    public static File L(String str) {
        File file = f67436d;
        return new File(file, "data/app/" + str + "/oat/");
    }

    public static File M(String str) {
        File file = f67438f;
        return new File(file, "data/app/" + str + "/oat/");
    }

    public static File N(String str, String str2) {
        File L = L(str);
        return new File(L, str2 + "/base.odex");
    }

    public static File O(String str, String str2) {
        File M = M(str);
        return new File(M, str2 + "/base.odex");
    }

    public static File P(String str, String str2) {
        String substring = str.substring(0, str.lastIndexOf(47));
        return new File(substring, str2 + ".apk");
    }

    public static File Q(String str) {
        return new File(d(str), "package.conf");
    }

    public static File R(String str) {
        return new File(d(str), "package.reliable");
    }

    public static File S(String str, String str2) {
        File file = f67436d;
        return new File(file, "data/app/" + str + "/split_" + str2 + ".apk");
    }

    public static File T(String str, String str2) {
        File file = f67438f;
        return new File(file, "data/app/" + str + "/split_" + str2 + ".apk");
    }

    public static File U() {
        return new File(f67436d, "system");
    }

    public static File V() {
        return new File(f67438f, "system");
    }

    public static File W() {
        return new File(U(), "uid.conf");
    }

    public static File X(int i4) {
        return new File(f67436d, String.format(Locale.CHINA, "data/user/%d", Integer.valueOf(i4)));
    }

    public static File Y(int i4) {
        return new File(f67438f, String.format(Locale.CHINA, "data/user/%d", Integer.valueOf(i4)));
    }

    public static File Z() {
        return new File(U(), "user.conf");
    }

    public static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (file == null) {
                file = new File(str);
            } else {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static File a0() {
        return f67436d;
    }

    public static File b(int i4) {
        return new File(X(i4), "accounts");
    }

    public static File b0() {
        return f67438f;
    }

    public static File c(int i4) {
        return new File(Y(i4), "accounts");
    }

    public static File c0(String str) {
        return new File(d(str), "package.volatile");
    }

    public static File d(String str) {
        File file = f67436d;
        return new File(file, "data/app/" + str);
    }

    public static File d0(String str, String str2) {
        String substring = str.substring(0, str.lastIndexOf(47));
        return new File(substring, "/split_" + str2 + ".apk");
    }

    public static File e(String str) {
        File file = f67438f;
        return new File(file, "data/app/" + str);
    }

    public static File e0() {
        return new File(U(), "xposed-module.conf");
    }

    public static File f(String str) {
        return new File(d(str), "lib");
    }

    public static void f0() {
        k.p(f67436d);
        k.p(f67439g);
        k.p(U());
        k.p(l());
    }

    public static File g(String str) {
        return new File(e(str), "lib");
    }

    public static File h() {
        return d("");
    }

    public static File i() {
        return e("");
    }

    public static File j(String str) {
        File file = f67436d;
        return new File(file, "data/app/" + str + "/base.apk");
    }

    public static File k(String str) {
        File file = f67438f;
        return new File(file, "data/app/" + str + "/base.apk");
    }

    public static File l() {
        return new File(f67436d, "cache");
    }

    public static File m() {
        return new File(f67438f, "cache");
    }

    public static File n(String str, int i4) {
        return new File(r(str, i4), "cache");
    }

    public static File o(String str, int i4) {
        return new File(s(str, i4), "cache");
    }

    public static File p(String str, int i4) {
        return new File(r(str, i4), "databases");
    }

    public static File q(String str, int i4) {
        return new File(s(str, i4), "databases");
    }

    public static File r(String str, int i4) {
        return new File(f67436d, String.format(Locale.CHINA, "data/user/%d/%s", Integer.valueOf(i4), str));
    }

    public static File s(String str, int i4) {
        return new File(f67438f, String.format(Locale.CHINA, "data/user/%d/%s", Integer.valueOf(i4), str));
    }

    public static File t(String str, int i4) {
        return new File(r(str, i4), "files");
    }

    public static File u(String str, int i4) {
        return new File(s(str, i4), "files");
    }

    public static File v(String str, int i4) {
        return new File(r(str, i4), "lib");
    }

    public static File w(String str, int i4) {
        return new File(s(str, i4), "lib");
    }

    public static File x(String str, int i4) {
        return new File(f67436d, String.format(Locale.CHINA, "data/user_de/%d/%s", Integer.valueOf(i4), str));
    }

    public static File y(String str, int i4) {
        return new File(f67438f, String.format(Locale.CHINA, "data/user_de/%d/%s", Integer.valueOf(i4), str));
    }

    public static File z() {
        return new File(U(), "device.conf");
    }
}

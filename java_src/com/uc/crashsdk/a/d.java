package com.uc.crashsdk.a;

import com.j256.ormlite.stmt.query.SimpleComparison;
import com.tencent.bugly.Bugly;
import com.umeng.analytics.pro.bm;
import com.umeng.commonsdk.framework.UMModuleRegister;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f63066a = true;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f63067b = true;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f63069d = false;

    /* renamed from: e  reason: collision with root package name */
    private static String f63070e = "hsdk";

    /* renamed from: f  reason: collision with root package name */
    private static String f63071f = "alid ";

    /* renamed from: g  reason: collision with root package name */
    private static String f63072g;

    /* renamed from: i  reason: collision with root package name */
    private static String f63074i;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f63068c = new Object();

    /* renamed from: h  reason: collision with root package name */
    private static final Object f63073h = new Object();

    public static void a() {
        f.a(0, new e(500), com.uc.crashsdk.b.H() ? 900000L : 90000L);
    }

    public static String b() {
        try {
            return "inv" + f63071f + "cras" + f63070e;
        } catch (Throwable th) {
            g.b(th);
            return "";
        }
    }

    public static void c() {
        synchronized (f63073h) {
            f63074i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] d() {
        return new byte[]{6, 0, BinaryMemcacheOpcodes.QUITQ, 8};
    }

    public static boolean e() {
        if (!com.uc.crashsdk.e.F() && !com.uc.crashsdk.b.L()) {
            a(true);
            return f63067b;
        }
        return true;
    }

    private static String f() {
        String str = f63074i;
        if (g.a(str)) {
            synchronized (f63073h) {
                String str2 = com.uc.crashsdk.g.R() ? "https://errlogos.umeng.com" : "https://errlog.umeng.com";
                str = g.a(com.uc.crashsdk.b.j(), str2 + "/api/crashsdk/validate", true);
                f63074i = str;
            }
        }
        return str;
    }

    private static String g() {
        byte[] bArr;
        String f5;
        byte[] a5;
        byte[] bArr2;
        StringBuilder sb = new StringBuilder();
        a(sb, "platform", com.uc.crashsdk.g.e());
        a(sb, "pkgname", com.uc.crashsdk.a.f63035a);
        a(sb, UMModuleRegister.PROCESS, com.uc.crashsdk.e.h());
        a(sb, "version", com.uc.crashsdk.a.a());
        a(sb, "cver", "3.3.2.2");
        a(sb, "ctag", "release");
        a(sb, "inter", com.uc.crashsdk.g.R() ? "true" : Bugly.SDK_IS_DEV);
        a(sb, bm.f63463x, q.a.f73126a);
        String sb2 = sb.toString();
        byte[] bArr3 = new byte[16];
        c.a(bArr3, 0, h.j());
        c.a(bArr3, 4, c.a());
        c.a(bArr3, 8, d());
        c.a(bArr3, 12, com.uc.crashsdk.a.f());
        try {
            bArr = c.a(sb2.getBytes(), bArr3, true);
        } catch (Throwable th) {
            g.a(th);
            bArr = null;
        }
        if (bArr == null || (f5 = f()) == null || (a5 = c.a(f5, bArr)) == null) {
            return null;
        }
        try {
            bArr2 = c.a(a5, bArr3, false);
        } catch (Throwable th2) {
            g.a(th2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            return new String(bArr2);
        }
        return null;
    }

    public static void a(int i4) {
        if (i4 != 500) {
            if (!f63066a) {
                throw new AssertionError();
            }
            return;
        }
        synchronized (f63068c) {
            f63072g = null;
            a(!com.uc.crashsdk.b.F());
            if (g.b(f63072g)) {
                h.a(f63072g);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(boolean r12) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.d.a(boolean):boolean");
    }

    private static StringBuilder a(StringBuilder sb, String str, String str2) {
        if (sb.length() > 0) {
            sb.append("`");
        }
        sb.append(str);
        sb.append(SimpleComparison.EQUAL_TO_OPERATION);
        sb.append(str2);
        return sb;
    }
}

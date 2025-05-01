package com.alipay.apmobilesecuritysdk.a;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.e;
import com.alipay.apmobilesecuritysdk.e.f;
import com.alipay.security.mobile.module.a.d;
import com.umeng.analytics.pro.bm;
import java.util.Map;
import o.c;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f4626b;

    /* renamed from: a  reason: collision with root package name */
    private final Context f4627a;

    public a(Context context) {
        this.f4627a = context;
    }

    public static String a(Context context) {
        com.alipay.apmobilesecuritysdk.e.b b5;
        String str;
        try {
            String d5 = f.d();
            try {
                if (!com.alipay.security.mobile.module.commonutils.a.b(d5) || (b5 = com.alipay.apmobilesecuritysdk.e.a.b(context)) == null || com.alipay.security.mobile.module.commonutils.a.b(b5.f4650c)) {
                    return d5;
                }
                str = b5.f4650c;
                f.b(b5);
                return str;
            } catch (Throwable unused) {
                return str;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(a aVar, String str, String str2, String str3) {
        try {
            o.a a5 = d.a(aVar.f4627a).a(q.a.f73126a, str, str2, str3);
            if (a5.f71970a) {
                e.a(aVar.f4627a, a5.f71969d, a5.f71968c);
            }
        } catch (Throwable th) {
            try {
                com.alipay.security.mobile.module.commonutils.d.c(th);
            } finally {
                d(false);
            }
        }
    }

    private static synchronized void d(boolean z4) {
        synchronized (a.class) {
            f4626b = z4;
        }
    }

    private static synchronized boolean e() {
        boolean z4;
        synchronized (a.class) {
            z4 = f4626b;
        }
        return z4;
    }

    public static String f(Context context) {
        try {
            String a5 = f.a();
            try {
                if (com.alipay.security.mobile.module.commonutils.a.b(a5)) {
                    com.alipay.apmobilesecuritysdk.e.b b5 = com.alipay.apmobilesecuritysdk.e.a.b(context);
                    if (b5 != null && !com.alipay.security.mobile.module.commonutils.a.b(b5.f4648a)) {
                        f.b(b5);
                        return b5.f4648a;
                    }
                    String b6 = j.a.b(context);
                    if (com.alipay.security.mobile.module.commonutils.a.b(b6)) {
                        String a6 = com.alipay.apmobilesecuritysdk.f.b.a(context);
                        return !com.alipay.security.mobile.module.commonutils.a.b(a6) ? a6 : a6;
                    }
                    return b6;
                }
                return a5;
            } catch (Throwable unused) {
                return a5;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    private c g(Map<String, String> map) {
        String str;
        String str2;
        String str3;
        try {
            Context context = this.f4627a;
            o.d dVar = new o.d();
            String a5 = com.alipay.security.mobile.module.commonutils.a.a(map, bm.f63446g, "");
            com.alipay.apmobilesecuritysdk.e.b d5 = com.alipay.apmobilesecuritysdk.e.a.d(context);
            if (d5 != null) {
                str2 = d5.f4650c;
                str3 = d5.f4648a;
                str = d5.f4651d;
            } else {
                str = "";
                str2 = str;
                str3 = str2;
            }
            com.alipay.apmobilesecuritysdk.e.b a6 = com.alipay.apmobilesecuritysdk.e.a.a();
            String str4 = a6 != null ? a6.f4648a : "";
            if (com.alipay.security.mobile.module.commonutils.a.b(str3) && com.alipay.security.mobile.module.commonutils.a.b(str4)) {
                str3 = j.a.e(context);
                str4 = j.a.a();
            }
            dVar.f71979a = q.a.f73126a;
            dVar.f71982d = str3;
            dVar.f71981c = str4;
            dVar.f71983e = str2;
            dVar.f71984f = a5;
            dVar.f71986h = str;
            dVar.f71985g = "3";
            dVar.f71987i = com.alipay.apmobilesecuritysdk.c.e.b(context, map);
            return d.a(this.f4627a).a(dVar);
        } catch (Throwable th) {
            com.alipay.security.mobile.module.commonutils.d.c(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00fb A[Catch: all -> 0x024b, TryCatch #2 {all -> 0x024b, blocks: (B:5:0x000d, B:7:0x004e, B:9:0x0053, B:11:0x00b9, B:24:0x00fb, B:44:0x0140, B:46:0x0146, B:48:0x014e, B:51:0x0154, B:59:0x0183, B:61:0x0191, B:63:0x0199, B:65:0x01a1, B:67:0x01ac, B:71:0x01e6, B:77:0x0208, B:82:0x0228, B:84:0x022e, B:87:0x0235, B:90:0x023d, B:80:0x0222, B:73:0x01eb, B:74:0x01fb, B:76:0x0202, B:27:0x0105, B:31:0x0110, B:34:0x0122, B:37:0x012c, B:40:0x0135, B:17:0x00c6, B:19:0x00f1), top: B:102:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0110 A[Catch: all -> 0x024b, TryCatch #2 {all -> 0x024b, blocks: (B:5:0x000d, B:7:0x004e, B:9:0x0053, B:11:0x00b9, B:24:0x00fb, B:44:0x0140, B:46:0x0146, B:48:0x014e, B:51:0x0154, B:59:0x0183, B:61:0x0191, B:63:0x0199, B:65:0x01a1, B:67:0x01ac, B:71:0x01e6, B:77:0x0208, B:82:0x0228, B:84:0x022e, B:87:0x0235, B:90:0x023d, B:80:0x0222, B:73:0x01eb, B:74:0x01fb, B:76:0x0202, B:27:0x0105, B:31:0x0110, B:34:0x0122, B:37:0x012c, B:40:0x0135, B:17:0x00c6, B:19:0x00f1), top: B:102:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140 A[Catch: all -> 0x024b, TryCatch #2 {all -> 0x024b, blocks: (B:5:0x000d, B:7:0x004e, B:9:0x0053, B:11:0x00b9, B:24:0x00fb, B:44:0x0140, B:46:0x0146, B:48:0x014e, B:51:0x0154, B:59:0x0183, B:61:0x0191, B:63:0x0199, B:65:0x01a1, B:67:0x01ac, B:71:0x01e6, B:77:0x0208, B:82:0x0228, B:84:0x022e, B:87:0x0235, B:90:0x023d, B:80:0x0222, B:73:0x01eb, B:74:0x01fb, B:76:0x0202, B:27:0x0105, B:31:0x0110, B:34:0x0122, B:37:0x012c, B:40:0x0135, B:17:0x00c6, B:19:0x00f1), top: B:102:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0222 A[Catch: all -> 0x024b, TryCatch #2 {all -> 0x024b, blocks: (B:5:0x000d, B:7:0x004e, B:9:0x0053, B:11:0x00b9, B:24:0x00fb, B:44:0x0140, B:46:0x0146, B:48:0x014e, B:51:0x0154, B:59:0x0183, B:61:0x0191, B:63:0x0199, B:65:0x01a1, B:67:0x01ac, B:71:0x01e6, B:77:0x0208, B:82:0x0228, B:84:0x022e, B:87:0x0235, B:90:0x023d, B:80:0x0222, B:73:0x01eb, B:74:0x01fb, B:76:0x0202, B:27:0x0105, B:31:0x0110, B:34:0x0122, B:37:0x012c, B:40:0x0135, B:17:0x00c6, B:19:0x00f1), top: B:102:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0228 A[Catch: all -> 0x024b, TryCatch #2 {all -> 0x024b, blocks: (B:5:0x000d, B:7:0x004e, B:9:0x0053, B:11:0x00b9, B:24:0x00fb, B:44:0x0140, B:46:0x0146, B:48:0x014e, B:51:0x0154, B:59:0x0183, B:61:0x0191, B:63:0x0199, B:65:0x01a1, B:67:0x01ac, B:71:0x01e6, B:77:0x0208, B:82:0x0228, B:84:0x022e, B:87:0x0235, B:90:0x023d, B:80:0x0222, B:73:0x01eb, B:74:0x01fb, B:76:0x0202, B:27:0x0105, B:31:0x0110, B:34:0x0122, B:37:0x012c, B:40:0x0135, B:17:0x00c6, B:19:0x00f1), top: B:102:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(java.util.Map<java.lang.String, java.lang.String> r27) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.apmobilesecuritysdk.a.a.b(java.util.Map):java.lang.String");
    }
}

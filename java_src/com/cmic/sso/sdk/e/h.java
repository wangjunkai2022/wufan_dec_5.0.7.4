package com.cmic.sso.sdk.e;

import android.content.Context;
import android.text.TextUtils;
import com.cmic.sso.sdk.e.k;
import com.cmic.sso.sdk.e.n;
import com.kuaishou.weapon.p0.bi;
/* compiled from: PhoneScripUtils.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static String f9325a;

    /* renamed from: b  reason: collision with root package name */
    private static String f9326b;

    /* renamed from: c  reason: collision with root package name */
    private static long f9327c;

    private static boolean c() {
        if (TextUtils.isEmpty(f9325a)) {
            return !TextUtils.isEmpty(k.b("phonescripcache", "")) && a(k.a("phonescripstarttime", 0L));
        }
        c.b("PhoneScripUtils", f9326b + " " + f9327c);
        return a(f9327c);
    }

    public static void a(boolean z4, boolean z5) {
        k.a a5 = k.a();
        a5.a("phonescripstarttime");
        a5.a("phonescripcache");
        a5.a("pre_sim_key");
        if (z5) {
            a5.a();
        } else {
            a5.b();
        }
        if (z4) {
            f9325a = null;
            f9326b = null;
            f9327c = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, long j4, String str2) {
        String a5 = b.a(context, str);
        if (TextUtils.isEmpty(a5)) {
            return;
        }
        k.a a6 = k.a();
        a6.a("phonescripcache", a5);
        a6.a("phonescripstarttime", j4);
        a6.a("phonescripversion", 1);
        a6.a("pre_sim_key", str2);
        a6.b();
    }

    public static void a(final Context context, final String str, long j4, final String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || j4 <= 0) {
            return;
        }
        c.b("PhoneScripUtils", "save phone scrip simKey = " + str2);
        f9325a = str;
        long j5 = j4 * 1000;
        f9327c = System.currentTimeMillis() + j5;
        c.b("sLifeTime", f9327c + "");
        f9326b = str2;
        if (!"operator".equals(str3)) {
            n.a(new n.a() { // from class: com.cmic.sso.sdk.e.h.1
                @Override // com.cmic.sso.sdk.e.n.a
                protected void a() {
                    c.b("PhoneScripUtils", "start save scrip to sp in sub thread");
                    h.b(context, str, h.f9327c, str2);
                }
            });
        } else if (j5 > bi.f55326s) {
            f9327c = System.currentTimeMillis() + bi.f55326s;
        } else {
            f9327c = System.currentTimeMillis() + j5;
        }
    }

    public static String a(Context context) {
        if (TextUtils.isEmpty(f9325a)) {
            String b5 = k.b("phonescripcache", "");
            if (TextUtils.isEmpty(b5)) {
                c.a("PhoneScripUtils", "null");
                return null;
            }
            f9327c = k.a("phonescripstarttime", 0L);
            f9326b = k.b("pre_sim_key", "");
            String b6 = b.b(context, b5);
            f9325a = b6;
            return b6;
        }
        return f9325a;
    }

    private static boolean a(long j4) {
        long currentTimeMillis = System.currentTimeMillis();
        c.b("PhoneScripUtils", j4 + "");
        c.b("PhoneScripUtils", currentTimeMillis + "");
        return j4 - currentTimeMillis > com.join.mgps.data.c.f49010a;
    }

    public static long a() {
        long a5;
        long j4;
        long currentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(f9325a)) {
            c.b("PhoneScripUtils", f9326b + " " + f9327c);
            a5 = f9327c;
        } else {
            String b5 = k.b("phonescripcache", "");
            a5 = k.a("phonescripstarttime", 0L);
            if (TextUtils.isEmpty(b5)) {
                j4 = 0;
                return Math.max(j4 / 1000, 0L);
            }
        }
        j4 = (a5 - currentTimeMillis) - com.join.mgps.data.c.f49010a;
        return Math.max(j4 / 1000, 0L);
    }

    private static int a(String str) {
        String b5;
        if (!TextUtils.isEmpty(f9326b)) {
            b5 = f9326b;
        } else {
            b5 = k.b("pre_sim_key", "");
            f9326b = b5;
        }
        if (TextUtils.isEmpty(b5)) {
            return 0;
        }
        return b5.equals(str) ? 1 : 2;
    }

    public static boolean a(com.cmic.sso.sdk.a aVar) {
        int a5 = a(aVar.b("scripKey"));
        aVar.a("imsiState", a5 + "");
        c.b("PhoneScripUtils", "simState = " + a5);
        if (k.a("phonescripversion", 0) != 1 && a5 != 0) {
            a(true, false);
            b.a();
            c.b("PhoneScripUtils", "phoneScriptVersion change");
            return false;
        } else if (a5 != 1) {
            if (a5 == 2) {
                a(true, false);
            }
            return false;
        } else {
            return c();
        }
    }
}

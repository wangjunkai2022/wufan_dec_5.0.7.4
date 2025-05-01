package com.join.mgps.va.overmind;

import android.text.TextUtils;
import com.join.mgps.Util.u;
/* compiled from: VExtModConfig.java */
/* loaded from: classes5.dex */
public class g {
    public static u.c a(String str) {
        return new u(str).b("archiveInfo");
    }

    public static String b(String str) {
        u.c b5 = new u(str).b("gameInfo");
        return b5 == null ? "" : b5.c("gameId");
    }

    public static u.c c(String str) {
        return new u(str).b("switch");
    }

    public static String d(String str) {
        u.c b5 = new u(str).b("soInfo");
        return b5 == null ? "" : b5.c("modPath");
    }

    public static int e(String str) {
        u.c b5 = new u(str).b("soInfo");
        if (b5 == null) {
            return 0;
        }
        String c5 = b5.c("code");
        if (TextUtils.isEmpty(c5)) {
            return 0;
        }
        return Integer.parseInt(c5);
    }

    public static String f(String str) {
        u.c b5 = new u(str).b("soInfo");
        return b5 == null ? "0" : b5.c("version");
    }

    public static void g(String str, String str2, String str3, String str4) {
        u uVar = new u(str);
        u.c b5 = uVar.b("archiveInfo");
        if (b5 == null) {
            b5 = new u.c("archiveInfo");
            uVar.f(b5);
        }
        b5.e("archivePath", str2);
        b5.e("archivePath2", str3);
        b5.e("archiveId", str4);
        uVar.j();
    }

    public static void h(String str, String str2, String str3, int i4, long j4) {
        u uVar = new u(str);
        u.c b5 = uVar.b("soInfo");
        if (b5 == null) {
            b5 = new u.c("soInfo");
            uVar.f(b5);
        }
        b5.e("modPath", str2);
        b5.e("version", str3);
        b5.e("code", i4 + "");
        b5.e("lastModifyTime", j4 + "");
        uVar.j();
    }

    public static void i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        u uVar = new u(str);
        u.c b5 = uVar.b("switch");
        if (b5 == null) {
            b5 = new u.c("switch");
            uVar.f(b5);
        }
        b5.e("goldFingerSwitch", str2);
        b5.e("archiveCloudSwitch", str3);
        u.c b6 = uVar.b("config");
        if (b6 == null) {
            b6 = new u.c("config");
            uVar.f(b6);
        }
        b6.e("channelNum", str4);
        b6.e("targetVersion", str5);
        b6.e("androidId", str6);
        b6.e("platform", str7);
        b6.e("package_type", str8);
        b6.e("typeId", str9);
        uVar.j();
    }

    public static void j(String str, String str2) {
        u uVar = new u(str);
        u.c b5 = uVar.b("gameInfo");
        if (b5 == null) {
            b5 = new u.c("gameInfo");
            uVar.f(b5);
        }
        b5.e("gameId", str2);
        uVar.j();
    }

    public static void k(String str, String str2) {
        u uVar = new u(str);
        u.c b5 = uVar.b("gameInfo");
        if (b5 == null) {
            b5 = new u.c("gameInfo");
            uVar.f(b5);
        }
        b5.e("modPath", str2);
        uVar.j();
    }
}

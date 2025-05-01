package com.mob.commons;

import android.os.SystemClock;
import java.util.List;
/* loaded from: classes5.dex */
public class d {
    public static boolean a() {
        List list = (List) b.b(C0811r.b("003$ehcjOb"), (Object) null);
        return (list != null && list.contains(C0811r.b("003]cjch,c"))) && CSCenter.getInstance().isOaidEnable();
    }

    public static boolean b() {
        return a(C0811r.b("003cfc"));
    }

    public static boolean c() {
        return a(C0811r.b("003Zefch4c"));
    }

    public static boolean d() {
        return a(C0811r.b("003)ef$fc"));
    }

    public static boolean e() {
        return a(C0811r.b("002fc")) && CSCenter.getInstance().isLocationDataEnable();
    }

    public static boolean f() {
        return a(C0811r.b("003 cj>fc")) && CSCenter.getInstance().isLocationDataEnable();
    }

    public static boolean g() {
        return a(C0811r.b("003LdecjEc")) && CSCenter.getInstance().isLocationDataEnable();
    }

    public static boolean h() {
        return a(C0811r.b("003>eeehBc"));
    }

    public static boolean i() {
        return a("na");
    }

    public static boolean j() {
        return SystemClock.elapsedRealtime() - l.a().c() <= ((long) ((Integer) b.a(C0811r.b("003]ehchCh"), 600)).intValue()) * 1000;
    }

    private static boolean a(String str) {
        List list = (List) b.a(C0811r.b("003JehcjTb"), (Object) null);
        return list == null || list.contains(str);
    }
}

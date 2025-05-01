package com.aggmoread.sdk.z.c.a.a.d.a.d.o;

import com.aggmoread.sdk.z.c.a.a.d.a.d.l;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.j;
import com.aggmoread.sdk.z.c.a.a.e.m;
import java.util.Map;
/* loaded from: classes2.dex */
public class b extends l {

    /* renamed from: a  reason: collision with root package name */
    private static b f2906a;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f2906a == null) {
                synchronized (b.class) {
                    if (f2906a == null) {
                        f2906a = new b();
                    }
                }
            }
            bVar = f2906a;
        }
        return bVar;
    }

    public static boolean a(e eVar) {
        int b5;
        try {
            b5 = eVar.f3310d.b(e.c.f3350x);
        } catch (Exception e5) {
            com.aggmoread.sdk.z.c.a.a.e.e.a("test err " + e5);
        }
        if (j.f3430r.booleanValue()) {
            return b5 == 1;
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b("deg ");
        return false;
    }

    public static boolean a(e eVar, int i4) {
        return m.a(eVar, i4);
    }

    public static void b(Map<String, Object> map, int i4, e eVar) {
        a().a(map, i4, eVar);
    }
}

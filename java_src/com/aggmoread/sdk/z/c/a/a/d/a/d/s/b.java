package com.aggmoread.sdk.z.c.a.a.d.a.d.s;

import android.content.Context;
import com.aggmoread.sdk.z.a.d;
import com.aggmoread.sdk.z.a.h.a;
import com.aggmoread.sdk.z.c.a.a.d.b.g;
import com.aggmoread.sdk.z.c.a.a.d.b.h;
import com.aggmoread.sdk.z.c.a.a.d.b.j;
import com.aggmoread.sdk.z.c.a.a.e.c;
/* loaded from: classes2.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f3065b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f3066a;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f3065b == null) {
                synchronized (b.class) {
                    if (f3065b == null) {
                        f3065b = new b();
                    }
                }
            }
            bVar = f3065b;
        }
        return bVar;
    }

    private com.aggmoread.sdk.z.a.g.a b() {
        com.aggmoread.sdk.z.a.g.a aVar = new com.aggmoread.sdk.z.a.g.a();
        try {
            aVar.a(c.d());
            aVar.d(c.g());
            aVar.e(c.j());
            aVar.h(c.r());
            h a5 = g.a();
            if (a5 != null) {
                aVar.f(a5.a());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return aVar;
    }

    public void a(Context context) {
        d.a(j.f3430r.booleanValue());
        if (this.f3066a) {
            return;
        }
        c.x();
        c.A();
        com.aggmoread.sdk.z.a.h.a d5 = com.aggmoread.sdk.z.a.h.a.d();
        a.EnumC0059a enumC0059a = a.EnumC0059a.f2138c;
        this.f3066a = d5.a(context, enumC0059a, b(), null);
        com.aggmoread.sdk.z.a.g.h hVar = new com.aggmoread.sdk.z.a.g.h();
        hVar.f2127b = com.aggmoread.sdk.z.a.m.j.a("iVBORw0KGgoAAAANSUhEUgAAAGoAAAAkCAYAAABhc6+LAAAEgUlEQVRoge2az0sjZxjHH5M07mwybjIbpd2h2zAGyaEJXrLHCrm4oIcFD5LebI859WjRSy8iVDzFP2GDoJCDQvcSKXhKLsEcBMnMFmEuao0YaBoPUp50BnTezDi/k1nnA4HwPvO+82a+med9nud9x8AZIgDwGgBoAAgDQMCh+zwb7BZqHADeAsAEYfGxhJ1CxQAgCQBBwuJjGbuEQjf3nQNvqI+EHWvHK18k57Eq1FeSu/NFchirQrEAECJaPcDS0hJ1fn7+U6lUYp2eLd6jVqvNHR0dvSOMOrEi1AsAYIhWj5DP55mJiYnU8vLyzyiaXbMul8spZRvDMFQ6nf4QiURM38eKUAk9Lq/Vav14dXX1q/whLhiAmT5GKRaL4vHxcTkcDsd3dnaKdox5cHCQWVhYKIqiOHA8nudFolEnVoR6RbR4jMXFxaYoin9SFMXiQ7Y6+3Q63R+jUqlUCKNFzK4vIcn1jTS4JsTj8TjO8fT0lB80V57n+V6v1+10Ot1Bbmt6epoNh8P93zo7O/uJGEAC3efU1FTu4uKijm8rccGQhKKJlhFkZmYmR9N0/+FzHKc5wafsEqpCra+v/yB/bzQa8w9t0WgU80zI5XLvGo3GtLIv2imKirMsWyIGljArVJRoGVHu7u7aiUTiN6uzW11dVQ2c8G1KJpNzeC984Ph5aA+FQv0ggqbpN0obEolE2EAgoBlofNFCXV5etjiOI9yZGTY2Nq7Vum1vbxfwQW9tbf0+6Dp0qRhkVKvVSqFQaBED6MBMMIG1vJdE6zMF86NYLJbBoGSQSHZhRijPuD03wECj2+2Ka2trquuXHZhxfSMRSORyuZf1ev0fwuAyUiToqEhgUihLb5RdCeywRZLXHZACll6v9zdxkYQcTOTz+Q+iKHaJC3Ajb3z8NSbf+F0QhD+UqYBRoQL++vQ/19fXmHv1A4Pb21sRczHiosc0iZbHtBiGYYPBINVut9tKo1GholYr5Tc3N38RjQpomv46GAxqJtSZTOZFs9n8lzC4BCa1xWJRNe+xGzNCWSKVSn18qj/W+mKxWJIwPECPSHKi6QaYZ2WzWdVc6yn29vbE/f191bfSdaHcBJNL2T05DYokr1lmKBQKv2h1MyLUmHS6yDPgAq21yDvB4eFhyUhSi+UmjuPeEwYFRvKoiJeOfWFZB6MoXOgJowcx8uA95fZWVlb6paNOp0NEUF7EiFCeqJjLyHtD9XrdlTXKafQK5an1Cd1eIpH4HhNRJ/aGhoHeYIL20sFK3BvCarYgCI6XdpSo7TmpMTk5qau6r1co1/IRq+CJH4yi7u/vu5ubmzW376+256QGRqYqpkfoEQrPk+u+8bCZn5+fwymcnZ190kog7Yam6X49z+iekxye4x9My03rEeqtlbKRIAinFEV9JgwqhEKhMaN9HoKVj3K5XDO7QWcWPHOBxdSTkxNDe1K7u7v1bDbLV6tVzX5PCTAFAN8SrT6uoxX1Mb5Io4PaG/UGAL4hWn2GhlIoWjpP7qma3nNgTNoIpKXIzhdoFAGA/wDPNGiK1am5VQAAAABJRU5ErkJggg==");
        com.aggmoread.sdk.z.a.h.a.d().a(enumC0059a, hVar);
    }
}

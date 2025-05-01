package com.aggmoread.sdk.z.c.a.a.d.a.d.o;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.aggmoread.sdk.z.a.d;
import com.aggmoread.sdk.z.a.g.a;
import com.aggmoread.sdk.z.a.h.a;
import com.aggmoread.sdk.z.c.a.a.d.b.g;
import com.aggmoread.sdk.z.c.a.a.d.b.h;
import com.aggmoread.sdk.z.c.a.a.d.b.j;
import com.aggmoread.sdk.z.c.a.a.e.p;
/* loaded from: classes2.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f2907b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f2908a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends com.aggmoread.sdk.z.a.g.a {
        final /* synthetic */ h A;

        a(c cVar, h hVar) {
            this.A = hVar;
        }

        @Override // com.aggmoread.sdk.z.a.g.a
        public String a() {
            h hVar = this.A;
            if (hVar != null && hVar.b() != null) {
                String h4 = this.A.b().h();
                if (!TextUtils.isEmpty(h4)) {
                    return h4;
                }
            }
            return com.aggmoread.sdk.z.c.a.a.e.c.d();
        }

        @Override // com.aggmoread.sdk.z.a.g.a
        public String h() {
            h hVar = this.A;
            if (hVar != null && hVar.b() != null) {
                String j4 = this.A.b().j();
                if (!TextUtils.isEmpty(j4)) {
                    return j4;
                }
            }
            return com.aggmoread.sdk.z.c.a.a.e.c.g();
        }

        @Override // com.aggmoread.sdk.z.a.g.a
        public String i() {
            h hVar = this.A;
            if (hVar != null && hVar.b() != null) {
                String i4 = this.A.b().i();
                if (!TextUtils.isEmpty(i4)) {
                    return i4;
                }
            }
            return com.aggmoread.sdk.z.c.a.a.e.c.j();
        }

        @Override // com.aggmoread.sdk.z.a.g.a
        public Location j() {
            h hVar = this.A;
            return (hVar == null || hVar.b() == null) ? super.j() : this.A.b().m();
        }

        @Override // com.aggmoread.sdk.z.a.g.a
        public String k() {
            h hVar = this.A;
            if (hVar != null && hVar.b() != null) {
                String n4 = this.A.b().n();
                if (!TextUtils.isEmpty(n4)) {
                    return n4;
                }
            }
            return super.k();
        }

        @Override // com.aggmoread.sdk.z.a.g.a
        public String o() {
            h hVar = this.A;
            if (hVar != null && hVar.b() != null) {
                String o4 = this.A.b().o();
                if (!TextUtils.isEmpty(o4)) {
                    return o4;
                }
            }
            return com.aggmoread.sdk.z.c.a.a.e.c.i();
        }

        @Override // com.aggmoread.sdk.z.a.g.a
        public String s() {
            h hVar = this.A;
            if (hVar != null && hVar.b() != null) {
                String p4 = this.A.b().p();
                if (!TextUtils.isEmpty(p4)) {
                    return p4;
                }
            }
            return com.aggmoread.sdk.z.c.a.a.e.c.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends a.C0055a {
        b(c cVar) {
        }

        @Override // com.aggmoread.sdk.z.a.g.a.C0055a
        public String a() {
            return com.aggmoread.sdk.z.c.a.a.e.c.m();
        }
    }

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (f2907b == null) {
                synchronized (c.class) {
                    if (f2907b == null) {
                        f2907b = new c();
                    }
                }
            }
            cVar = f2907b;
        }
        return cVar;
    }

    private com.aggmoread.sdk.z.a.g.a b() {
        a aVar = new a(this, g.a());
        try {
            aVar.c(p.b(j.f3429q));
            aVar.a(p.a(j.f3429q));
            aVar.b(com.aggmoread.sdk.z.c.a.a.e.c.c(j.f3429q));
            aVar.j(com.aggmoread.sdk.z.c.a.a.e.c.d(j.f3429q));
            aVar.a(com.aggmoread.sdk.z.c.a.a.e.c.f(j.f3429q));
            aVar.g(com.aggmoread.sdk.z.c.a.a.e.c.p());
            aVar.b(com.aggmoread.sdk.z.c.a.a.e.c.e());
            aVar.c(com.aggmoread.sdk.z.c.a.a.e.c.f());
            aVar.k(com.aggmoread.sdk.z.c.a.a.e.c.v());
            aVar.c(com.aggmoread.sdk.z.c.a.a.e.c.s());
            aVar.i(String.valueOf(com.aggmoread.sdk.z.c.a.a.e.c.t()));
            aVar.b(com.aggmoread.sdk.z.c.a.a.e.c.k());
            aVar.a(com.aggmoread.sdk.z.c.a.a.e.c.h());
            aVar.a(com.aggmoread.sdk.z.c.a.a.e.c.a(j.f3429q));
            aVar.a(new b(this));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return aVar;
    }

    public void a(Context context) {
        d.a(j.f3430r.booleanValue());
        if (this.f2908a) {
            return;
        }
        com.aggmoread.sdk.z.c.a.a.e.c.x();
        com.aggmoread.sdk.z.c.a.a.e.c.A();
        com.aggmoread.sdk.z.a.h.a d5 = com.aggmoread.sdk.z.a.h.a.d();
        a.EnumC0059a enumC0059a = a.EnumC0059a.f2137b;
        this.f2908a = d5.a(context, enumC0059a, b(), null);
        com.aggmoread.sdk.z.a.g.h hVar = new com.aggmoread.sdk.z.a.g.h();
        hVar.f2127b = com.aggmoread.sdk.z.a.m.j.a("iVBORw0KGgoAAAANSUhEUgAAAGoAAAAkCAYAAABhc6+LAAAEgUlEQVRoge2az0sjZxjHH5M07mwybjIbpd2h2zAGyaEJXrLHCrm4oIcFD5LebI859WjRSy8iVDzFP2GDoJCDQvcSKXhKLsEcBMnMFmEuao0YaBoPUp50BnTezDi/k1nnA4HwPvO+82a+med9nud9x8AZIgDwGgBoAAgDQMCh+zwb7BZqHADeAsAEYfGxhJ1CxQAgCQBBwuJjGbuEQjf3nQNvqI+EHWvHK18k57Eq1FeSu/NFchirQrEAECJaPcDS0hJ1fn7+U6lUYp2eLd6jVqvNHR0dvSOMOrEi1AsAYIhWj5DP55mJiYnU8vLyzyiaXbMul8spZRvDMFQ6nf4QiURM38eKUAk9Lq/Vav14dXX1q/whLhiAmT5GKRaL4vHxcTkcDsd3dnaKdox5cHCQWVhYKIqiOHA8nudFolEnVoR6RbR4jMXFxaYoin9SFMXiQ7Y6+3Q63R+jUqlUCKNFzK4vIcn1jTS4JsTj8TjO8fT0lB80V57n+V6v1+10Ot1Bbmt6epoNh8P93zo7O/uJGEAC3efU1FTu4uKijm8rccGQhKKJlhFkZmYmR9N0/+FzHKc5wafsEqpCra+v/yB/bzQa8w9t0WgU80zI5XLvGo3GtLIv2imKirMsWyIGljArVJRoGVHu7u7aiUTiN6uzW11dVQ2c8G1KJpNzeC984Ph5aA+FQv0ggqbpN0obEolE2EAgoBlofNFCXV5etjiOI9yZGTY2Nq7Vum1vbxfwQW9tbf0+6Dp0qRhkVKvVSqFQaBED6MBMMIG1vJdE6zMF86NYLJbBoGSQSHZhRijPuD03wECj2+2Ka2trquuXHZhxfSMRSORyuZf1ev0fwuAyUiToqEhgUihLb5RdCeywRZLXHZACll6v9zdxkYQcTOTz+Q+iKHaJC3Ajb3z8NSbf+F0QhD+UqYBRoQL++vQ/19fXmHv1A4Pb21sRczHiosc0iZbHtBiGYYPBINVut9tKo1GholYr5Tc3N38RjQpomv46GAxqJtSZTOZFs9n8lzC4BCa1xWJRNe+xGzNCWSKVSn18qj/W+mKxWJIwPECPSHKi6QaYZ2WzWdVc6yn29vbE/f191bfSdaHcBJNL2T05DYokr1lmKBQKv2h1MyLUmHS6yDPgAq21yDvB4eFhyUhSi+UmjuPeEwYFRvKoiJeOfWFZB6MoXOgJowcx8uA95fZWVlb6paNOp0NEUF7EiFCeqJjLyHtD9XrdlTXKafQK5an1Cd1eIpH4HhNRJ/aGhoHeYIL20sFK3BvCarYgCI6XdpSo7TmpMTk5qau6r1co1/IRq+CJH4yi7u/vu5ubmzW376+256QGRqYqpkfoEQrPk+u+8bCZn5+fwymcnZ190kog7Yam6X49z+iekxye4x9My03rEeqtlbKRIAinFEV9JgwqhEKhMaN9HoKVj3K5XDO7QWcWPHOBxdSTkxNDe1K7u7v1bDbLV6tVzX5PCTAFAN8SrT6uoxX1Mb5Io4PaG/UGAL4hWn2GhlIoWjpP7qma3nNgTNoIpKXIzhdoFAGA/wDPNGiK1am5VQAAAABJRU5ErkJggg==");
        com.aggmoread.sdk.z.a.h.a.d().a(enumC0059a, hVar);
    }
}

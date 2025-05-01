package com.aggmoread.sdk.z.c.a.a.c;

import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.e.b;
import com.aggmoread.sdk.z.c.a.a.e.d;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.kwad.sdk.core.response.model.SdkConfigData;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class k {

    /* loaded from: classes2.dex */
    static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f2760a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f2761b;

        a(Map map, e eVar) {
            this.f2760a = map;
            this.f2761b = eVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.k.d
        public void a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
            if (iVar == null && eVar != null) {
                com.aggmoread.sdk.z.c.a.a.e.e.b("S2S_TAG", "callback success ");
                this.f2761b.callback(k.b(this.f2760a, eVar));
                return;
            }
            com.aggmoread.sdk.z.c.a.a.e.e.b("S2S_TAG", "callback fail " + iVar);
            this.f2761b.callback(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b implements d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f2762a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f2763b;

        b(d dVar, com.aggmoread.sdk.z.c.a.a.d.b.d dVar2) {
            this.f2762a = dVar;
            this.f2763b = dVar2;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.d.c
        public void a(int i4, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
            if (iVar != null) {
                this.f2762a.a(null, bArr, iVar);
            } else if (i4 != 200) {
                d dVar = this.f2762a;
                dVar.a(null, bArr, new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002001, "HTTP error，statusCode=" + i4));
            } else if (bArr == null) {
                this.f2762a.a(null, bArr, new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002002, "HTTP error，response parse error."));
            } else {
                try {
                    Map<Object, Object> b5 = com.aggmoread.sdk.z.c.a.a.b.b(new String(bArr, "UTF-8"));
                    if (b5 == null) {
                        this.f2762a.a(null, bArr, new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002006, "HTTP error, response parse error, parse json."));
                        return;
                    }
                    com.aggmoread.sdk.z.c.a.a.d.b.e eVar = new com.aggmoread.sdk.z.c.a.a.d.b.e(this.f2763b, b5);
                    com.aggmoread.sdk.z.c.a.a.d.b.i c5 = eVar.c();
                    if (c5 != null) {
                        this.f2762a.a(null, bArr, c5);
                    } else {
                        this.f2762a.a(eVar, bArr, null);
                    }
                } catch (UnsupportedEncodingException unused) {
                    this.f2762a.a(null, bArr, new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002002, "HTTP error，response parse error, encodeing error."));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class c implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f2764a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f2765b;

        /* loaded from: classes2.dex */
        class a implements d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.c.a.a.e.b f2766a;

            a(c cVar, com.aggmoread.sdk.z.c.a.a.e.b bVar) {
                this.f2766a = bVar;
            }

            @Override // com.aggmoread.sdk.z.c.a.a.c.k.d
            public void a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
                if (bArr != null) {
                    this.f2766a.a(bArr);
                }
            }
        }

        /* loaded from: classes2.dex */
        class b implements d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.c.a.a.e.b f2767a;

            /* loaded from: classes2.dex */
            class a implements d {
                a() {
                }

                @Override // com.aggmoread.sdk.z.c.a.a.c.k.d
                public void a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
                    if (bArr != null) {
                        b.this.f2767a.a(bArr);
                    }
                }
            }

            b(com.aggmoread.sdk.z.c.a.a.e.b bVar) {
                this.f2767a = bVar;
            }

            @Override // com.aggmoread.sdk.z.c.a.a.c.k.d
            public void a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
                c.this.f2765b.a(eVar, bArr, iVar);
                k.b(c.this.f2764a, new a());
            }
        }

        c(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, d dVar2) {
            this.f2764a = dVar;
            this.f2765b = dVar2;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.b.c
        public void a(com.aggmoread.sdk.z.c.a.a.e.b bVar) {
            Map<Object, Object> b5;
            com.aggmoread.sdk.z.c.a.a.d.b.e eVar;
            com.aggmoread.sdk.z.c.a.a.d.b.d dVar;
            d bVar2;
            byte[] b6 = bVar != null ? bVar.b() : null;
            if (b6 != null) {
                try {
                    String str = new String(b6, "UTF-8");
                    com.aggmoread.sdk.z.c.a.a.e.e.b("S2S_TAG", "ch data = " + str);
                    b5 = com.aggmoread.sdk.z.c.a.a.b.b(str);
                } catch (UnsupportedEncodingException e5) {
                    e5.printStackTrace();
                }
                if (b5 != null) {
                    eVar = new com.aggmoread.sdk.z.c.a.a.d.b.e(this.f2764a, b5);
                    if (eVar == null && eVar.c() == null) {
                        this.f2765b.a(eVar, b6, null);
                        long b7 = k.b(eVar) * 1000;
                        long currentTimeMillis = System.currentTimeMillis() - bVar.c();
                        com.aggmoread.sdk.z.c.a.a.e.e.a("ct " + currentTimeMillis + ", pct " + b7 + ", db " + bVar.c());
                        if (currentTimeMillis < b7) {
                            return;
                        }
                        bVar.a((byte[]) null);
                        dVar = this.f2764a;
                        bVar2 = new a(this, bVar);
                    } else {
                        dVar = this.f2764a;
                        bVar2 = new b(bVar);
                    }
                    k.b(dVar, bVar2);
                }
            }
            eVar = null;
            if (eVar == null) {
            }
            dVar = this.f2764a;
            bVar2 = new b(bVar);
            k.b(dVar, bVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface d {
        void a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar);
    }

    /* loaded from: classes2.dex */
    public interface e {
        void callback(f fVar);
    }

    /* loaded from: classes2.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public String f2770a;

        /* renamed from: b  reason: collision with root package name */
        public String f2771b;
    }

    private static void a(String str, d dVar) {
        com.aggmoread.sdk.z.c.a.a.d.b.d dVar2 = new com.aggmoread.sdk.z.c.a.a.d.b.d();
        dVar2.f3265i = str;
        com.aggmoread.sdk.z.c.a.a.e.b a5 = com.aggmoread.sdk.z.c.a.a.e.b.a("sc_" + dVar2.f3265i);
        c cVar = new c(dVar2, dVar);
        if (a5 != null) {
            a5.a(cVar);
        } else {
            cVar.a(null);
        }
    }

    public static void a(String str, Map<String, Object> map, e eVar) {
        if (com.aggmoread.sdk.z.c.a.a.d.b.j.f3431s.booleanValue()) {
            a(str, new a(map, eVar));
        } else {
            eVar.callback(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        int b5 = eVar.f3310d.b(e.c.D);
        return b5 > 3600 ? SdkConfigData.DEFAULT_REQUEST_INTERVAL : b5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f b(Map map, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        f fVar = new f();
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        eVar.d();
        String a5 = eVar.f3309c.a(e.c.T, "");
        String a6 = eVar.f3309c.a(e.c.X, "");
        int b5 = eVar.f3309c.b(e.c.Y);
        if (m.j(eVar)) {
            eVar.f3309c.b(e.c.f3321a0);
        }
        if (b5 == 100) {
            String a7 = com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a().a(a5, a6);
            String a8 = com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a().a(map, a6);
            sb.append(a7);
            fVar.f2770a = sb.toString();
            fVar.f2771b = a8;
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, d dVar2) {
        com.aggmoread.sdk.z.c.a.a.e.f fVar = new com.aggmoread.sdk.z.c.a.a.e.f(com.aggmoread.sdk.z.c.a.a.e.d.b(null));
        fVar.b(d.C0143d.f3295a, dVar.f3259c);
        fVar.b(d.C0143d.f3296b, dVar.f3265i);
        String a5 = com.aggmoread.sdk.z.c.a.a.b.a(fVar.f3494a);
        HashMap hashMap = new HashMap();
        hashMap.put("Content-type", HttpHeaders.Values.APPLICATION_JSON);
        try {
            com.aggmoread.sdk.z.c.a.a.e.d.a(com.aggmoread.sdk.z.c.a.a.d.b.j.a(), a5.getBytes("UTF-8"), hashMap, new b(dVar2, dVar));
        } catch (UnsupportedEncodingException unused) {
            dVar2.a(null, null, new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002004, "HTTP error, request error"));
        }
    }
}

package com.aggmoread.sdk.z.c.a.a.d.b;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.aggmoread.sdk.z.c.a.a.c.g;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.e.b;
import com.aggmoread.sdk.z.c.a.a.e.d;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.aggmoread.sdk.z.c.a.a.e.n;
import com.kwad.sdk.core.response.model.SdkConfigData;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    static Map<Integer, com.aggmoread.sdk.z.c.a.a.d.b.b> f3355b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    static com.aggmoread.sdk.z.c.a.a.d.b.h f3356c = com.aggmoread.sdk.z.c.a.a.d.b.h.f3401e;

    /* renamed from: a  reason: collision with root package name */
    private boolean f3357a = false;

    /* loaded from: classes2.dex */
    class a implements d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Handler.Callback f3358a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.h f3359b;

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.b.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0144a implements Runnable {
            RunnableC0144a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Message obtain = Message.obtain();
                obtain.what = 0;
                obtain.obj = Boolean.TRUE;
                a.this.f3358a.handleMessage(obtain);
            }
        }

        a(g gVar, Handler.Callback callback, com.aggmoread.sdk.z.c.a.a.d.b.h hVar) {
            this.f3358a = callback;
            this.f3359b = hVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.d.c
        public void a(int i4, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
            if (iVar != null || bArr == null) {
                return;
            }
            try {
                com.aggmoread.sdk.z.c.a.a.e.f fVar = new com.aggmoread.sdk.z.c.a.a.e.f(com.aggmoread.sdk.z.c.a.a.b.d(new String(bArr, "UTF-8")));
                if (fVar.a(l.f3399a, false)) {
                    com.aggmoread.sdk.z.c.a.a.d.b.j.f3430r = Boolean.TRUE;
                    com.aggmoread.sdk.z.c.a.a.b.c();
                } else {
                    com.aggmoread.sdk.z.c.a.a.d.b.j.f3430r = Boolean.FALSE;
                }
                String str = null;
                fVar.a(l.f3400b, (String) null);
                if (this.f3358a != null) {
                    n.a(new RunnableC0144a());
                }
                com.aggmoread.sdk.z.c.a.a.e.h.a().b("debugLog", com.aggmoread.sdk.z.c.a.a.d.b.j.f3430r.booleanValue());
                com.aggmoread.sdk.z.c.a.a.d.b.h hVar = this.f3359b;
                if (hVar != null) {
                    str = hVar.a();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("init set oaid ");
                sb.append(str);
            } catch (UnsupportedEncodingException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f3361a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f3362b;

        /* loaded from: classes2.dex */
        class a implements k {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.c.a.a.e.b f3364a;

            /* renamed from: com.aggmoread.sdk.z.c.a.a.d.b.g$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class C0145a implements k {
                C0145a() {
                }

                @Override // com.aggmoread.sdk.z.c.a.a.d.b.g.k
                public void a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
                    if (bArr != null) {
                        a.this.f3364a.a(bArr);
                    }
                }
            }

            a(com.aggmoread.sdk.z.c.a.a.e.b bVar) {
                this.f3364a = bVar;
            }

            @Override // com.aggmoread.sdk.z.c.a.a.d.b.g.k
            public void a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
                b.this.f3362b.a(eVar, bArr, iVar);
                b bVar = b.this;
                g.this.b(bVar.f3361a, new C0145a());
            }
        }

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.b.g$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0146b implements k {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.c.a.a.e.b f3367a;

            C0146b(b bVar, com.aggmoread.sdk.z.c.a.a.e.b bVar2) {
                this.f3367a = bVar2;
            }

            @Override // com.aggmoread.sdk.z.c.a.a.d.b.g.k
            public void a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
                if (bArr != null) {
                    this.f3367a.a(bArr);
                }
            }
        }

        /* loaded from: classes2.dex */
        class c implements k {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.c.a.a.e.b f3368a;

            /* loaded from: classes2.dex */
            class a implements k {
                a() {
                }

                @Override // com.aggmoread.sdk.z.c.a.a.d.b.g.k
                public void a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
                    if (bArr != null) {
                        c.this.f3368a.a(bArr);
                    }
                }
            }

            c(com.aggmoread.sdk.z.c.a.a.e.b bVar) {
                this.f3368a = bVar;
            }

            @Override // com.aggmoread.sdk.z.c.a.a.d.b.g.k
            public void a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
                b.this.f3362b.a(eVar, bArr, iVar);
                b bVar = b.this;
                g.this.b(bVar.f3361a, new a());
            }
        }

        b(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, k kVar) {
            this.f3361a = dVar;
            this.f3362b = kVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.b.c
        public void a(com.aggmoread.sdk.z.c.a.a.e.b bVar) {
            Map<Object, Object> b5;
            com.aggmoread.sdk.z.c.a.a.d.b.e eVar;
            g gVar;
            com.aggmoread.sdk.z.c.a.a.d.b.d dVar;
            k cVar;
            byte[] b6 = bVar != null ? bVar.b() : null;
            if (b6 != null) {
                try {
                    String str = new String(b6, "UTF-8");
                    com.aggmoread.sdk.z.c.a.a.e.e.b("AMGTAG", "cached ad data = " + str);
                    b5 = com.aggmoread.sdk.z.c.a.a.b.b(str);
                } catch (UnsupportedEncodingException e5) {
                    e5.printStackTrace();
                }
                if (b5 != null) {
                    eVar = new com.aggmoread.sdk.z.c.a.a.d.b.e(this.f3361a, b5);
                    if (eVar == null && eVar.c() == null) {
                        String d5 = bVar.d();
                        if ("20080717".equals(d5)) {
                            this.f3362b.a(eVar, bVar.b(), null);
                            long a5 = g.this.a(eVar) * 1000;
                            long currentTimeMillis = System.currentTimeMillis() - bVar.c();
                            com.aggmoread.sdk.z.c.a.a.e.e.a("ct " + currentTimeMillis + ", pct " + a5 + ", db " + bVar.c());
                            if (currentTimeMillis < a5) {
                                return;
                            }
                            bVar.a((byte[]) null);
                            gVar = g.this;
                            dVar = this.f3361a;
                            cVar = new C0146b(this, bVar);
                        } else {
                            com.aggmoread.sdk.z.c.a.a.e.e.a("sv " + d5);
                            bVar.a((byte[]) null);
                            gVar = g.this;
                            dVar = this.f3361a;
                            cVar = new a(bVar);
                        }
                    } else {
                        gVar = g.this;
                        dVar = this.f3361a;
                        cVar = new c(bVar);
                    }
                    gVar.b(dVar, cVar);
                }
            }
            eVar = null;
            if (eVar == null) {
            }
            gVar = g.this;
            dVar = this.f3361a;
            cVar = new c(bVar);
            gVar.b(dVar, cVar);
        }
    }

    /* loaded from: classes2.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f3371b;

        c(g gVar, com.aggmoread.sdk.z.c.a.a.d.b.d dVar) {
            this.f3371b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3371b.a(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001003005, "lv:广告无填充"), (com.aggmoread.sdk.z.c.a.a.d.b.e) null);
        }
    }

    /* loaded from: classes2.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f3372b;

        d(g gVar, com.aggmoread.sdk.z.c.a.a.d.b.d dVar) {
            this.f3372b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3372b.a(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001003005, "init: 广告无填充"), (com.aggmoread.sdk.z.c.a.a.d.b.e) null);
        }
    }

    /* loaded from: classes2.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f3373b;

        e(g gVar, com.aggmoread.sdk.z.c.a.a.d.b.d dVar) {
            this.f3373b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3373b.a(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001003005, "sc:广告无填充"), (com.aggmoread.sdk.z.c.a.a.d.b.e) null);
        }
    }

    /* loaded from: classes2.dex */
    class f implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f3374a;

        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.i f3375b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.e f3376c;

            a(com.aggmoread.sdk.z.c.a.a.d.b.i iVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
                this.f3375b = iVar;
                this.f3376c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f3374a.a(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001003005, "err: " + this.f3375b.f3410a + ", " + this.f3375b.f3411b), this.f3376c);
            }
        }

        /* loaded from: classes2.dex */
        class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.e f3378b;

            b(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
                this.f3378b = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f3374a.a(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001005001, "广告无填充"), this.f3378b);
            }
        }

        /* loaded from: classes2.dex */
        class c implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.e f3380b;

            c(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
                this.f3380b = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f3374a.a(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001005000, "广告无填充"), this.f3380b);
            }
        }

        /* loaded from: classes2.dex */
        class d implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.e f3382b;

            d(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
                this.f3382b = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f3374a.a(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001005003, "广告无填充"), this.f3382b);
            }
        }

        /* loaded from: classes2.dex */
        class e implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.e f3384b;

            e(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
                this.f3384b = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f3374a.a(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001005002, "广告无填充"), this.f3384b);
            }
        }

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.b.g$f$f  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0147f implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.e f3386b;

            RunnableC0147f(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
                this.f3386b = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f3374a.a(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001005004, "广告无填充"), this.f3386b);
            }
        }

        f(g gVar, com.aggmoread.sdk.z.c.a.a.d.b.d dVar) {
            this.f3374a = dVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.b.g.k
        public void a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
            if (iVar != null) {
                n.a(new a(iVar, eVar));
                return;
            }
            int a5 = eVar.f3310d.a(e.c.f3339m, 0);
            if (a5 > 0 && a5 <= this.f3374a.C.d()) {
                n.a(new b(eVar));
                return;
            }
            int a6 = eVar.f3310d.a(e.c.f3338l, 0);
            if (a6 > 0 && a6 <= this.f3374a.B.d()) {
                n.a(new c(eVar));
                return;
            }
            int a7 = eVar.f3310d.a(e.c.f3337k, 0);
            if (a7 > 0 && a7 <= this.f3374a.E.d()) {
                n.a(new d(eVar));
                return;
            }
            int a8 = eVar.f3310d.a(e.c.f3336j, 0);
            if (a8 > 0 && a8 <= this.f3374a.D.d()) {
                n.a(new e(eVar));
                return;
            }
            int a9 = eVar.f3310d.a(e.c.f3348v, 0);
            String format = String.format("REQ_%s_LAST", this.f3374a.f3265i);
            if (a9 > 0 && a9 * 1000 >= System.currentTimeMillis() - com.aggmoread.sdk.z.c.a.a.e.h.a().a(format, 0L)) {
                n.a(new RunnableC0147f(eVar));
                return;
            }
            this.f3374a.a(eVar);
            com.aggmoread.sdk.z.c.a.a.e.h.a().b(format, System.currentTimeMillis());
            if (eVar.a()) {
                com.aggmoread.sdk.z.c.a.a.e.e.b("AMSdkThread", "cc bid ");
                if (com.aggmoread.sdk.z.c.a.a.d.a.d.q.d.a().b(this.f3374a, eVar)) {
                    return;
                }
            }
            g.a(this.f3374a, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.b.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class RunnableC0148g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f3388b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f3389c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.e f3390d;

        RunnableC0148g(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, int i4, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
            this.f3388b = dVar;
            this.f3389c = i4;
            this.f3390d = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.aggmoread.sdk.z.c.a.a.d.b.d dVar = this.f3388b;
            dVar.a(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001003005, "不支持的广告源. adSource=" + this.f3389c), this.f3390d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f3391b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f3392c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.e f3393d;

        h(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, int i4, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
            this.f3391b = dVar;
            this.f3392c = i4;
            this.f3393d = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.aggmoread.sdk.z.c.a.a.d.b.d dVar = this.f3391b;
            dVar.a(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001003005, "未检测到广告源，请确认广告源接入是否成功. adSource=" + this.f3392c), this.f3393d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.b f3394b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f3395c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.e f3396d;

        i(com.aggmoread.sdk.z.c.a.a.d.b.b bVar, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
            this.f3394b = bVar;
            this.f3395c = dVar;
            this.f3396d = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f3394b.a(this.f3395c, this.f3396d).p();
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.a(e5.getMessage());
            } catch (OutOfMemoryError e6) {
                e6.printStackTrace();
                com.aggmoread.sdk.z.c.a.a.e.e.b("AMSdkThread", "oom err");
                this.f3395c.a(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001003006, "内存空间不足，广告请求失败！"), this.f3396d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class j implements d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f3397a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f3398b;

        j(g gVar, k kVar, com.aggmoread.sdk.z.c.a.a.d.b.d dVar) {
            this.f3397a = kVar;
            this.f3398b = dVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.d.c
        public void a(int i4, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar) {
            if (iVar != null) {
                this.f3397a.a(null, bArr, iVar);
            } else if (i4 != 200) {
                k kVar = this.f3397a;
                kVar.a(null, bArr, new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002001, "HTTP error，statusCode=" + i4));
            } else if (bArr == null) {
                this.f3397a.a(null, bArr, new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002002, "HTTP error，response parse error."));
            } else {
                try {
                    Map<Object, Object> b5 = com.aggmoread.sdk.z.c.a.a.b.b(new String(bArr, "UTF-8"));
                    if (b5 == null) {
                        this.f3397a.a(null, bArr, new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002006, "HTTP error, response parse error, parse json."));
                        return;
                    }
                    com.aggmoread.sdk.z.c.a.a.d.b.e eVar = new com.aggmoread.sdk.z.c.a.a.d.b.e(this.f3398b, b5);
                    com.aggmoread.sdk.z.c.a.a.d.b.i c5 = eVar.c();
                    if (c5 != null) {
                        this.f3397a.a(null, bArr, c5);
                    } else {
                        this.f3397a.a(eVar, bArr, null);
                    }
                } catch (UnsupportedEncodingException unused) {
                    this.f3397a.a(null, bArr, new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002002, "HTTP error，response parse error, encodeing error."));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface k {
        void a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar);
    }

    /* loaded from: classes2.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        public static final Object f3399a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public static final Object f3400b = new Object();
    }

    public g(Context context) {
        com.aggmoread.sdk.z.c.a.a.d.b.j.f3429q = context;
        com.aggmoread.sdk.z.c.a.a.d.b.j.f3431s = Boolean.FALSE;
        a(100);
        a(10086);
        a(105);
        a(101);
        a(106);
        a(107);
        a(1);
        a(500);
        a(TypedValues.PositionType.TYPE_TRANSITION_EASING);
        a(TypedValues.PositionType.TYPE_DRAWPATH);
        a(TypedValues.PositionType.TYPE_PERCENT_WIDTH);
        a(TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
        a(TypedValues.PositionType.TYPE_SIZE_PERCENT);
        a(TypedValues.PositionType.TYPE_PERCENT_X);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        int b5 = eVar.f3310d.b(e.c.D);
        return b5 > 3600 ? SdkConfigData.DEFAULT_REQUEST_INTERVAL : b5;
    }

    public static com.aggmoread.sdk.z.c.a.a.d.b.h a() {
        return f3356c;
    }

    private void a(int i4) {
        Class cls = i4 != 1 ? i4 != 100 ? i4 != 105 ? i4 != 107 ? i4 != 10086 ? null : com.aggmoread.sdk.z.c.a.a.d.a.d.o.a.class : com.aggmoread.sdk.z.c.a.a.d.a.d.u.a.class : com.aggmoread.sdk.z.c.a.a.d.a.d.s.a.class : com.aggmoread.sdk.z.c.a.a.d.a.d.t.c.class : com.aggmoread.sdk.z.c.a.a.d.a.d.p.b.class;
        if (cls != null) {
            try {
                Constructor constructor = cls.getConstructor(new Class[0]);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(new Object[0]);
                if (newInstance instanceof com.aggmoread.sdk.z.c.a.a.d.b.b) {
                    f3355b.put(Integer.valueOf(i4), (com.aggmoread.sdk.z.c.a.a.d.b.b) newInstance);
                }
            } catch (Exception e5) {
                com.aggmoread.sdk.z.c.a.a.e.e.b("err " + e5.getMessage());
            }
        }
    }

    public static void a(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        int f5 = eVar.f();
        if (f5 == 0) {
            f5 = 10086;
        }
        com.aggmoread.sdk.z.c.a.a.d.b.b bVar = f3355b.get(Integer.valueOf(f5));
        if (bVar == null) {
            n.a(new RunnableC0148g(dVar, f5, eVar));
        } else if (bVar.a()) {
            n.a(new i(bVar, dVar, eVar));
        } else {
            n.a(new h(dVar, f5, eVar));
        }
    }

    public g.a a(Activity activity) {
        return new com.aggmoread.sdk.z.c.a.a.d.b.c(activity);
    }

    public g.a a(Context context) {
        return new com.aggmoread.sdk.z.c.a.a.d.b.c(context);
    }

    public Object a(Handler.Callback callback, com.aggmoread.sdk.z.c.a.a.d.b.h hVar) {
        if (m.a(19)) {
            return null;
        }
        if (hVar != null) {
            f3356c = hVar;
        }
        b();
        com.aggmoread.sdk.z.c.a.a.e.d.a(com.aggmoread.sdk.z.c.a.a.d.b.j.f3429q);
        n.b();
        com.aggmoread.sdk.z.c.a.a.e.h.a().a("debugFile", (String) null);
        com.aggmoread.sdk.z.c.a.a.d.b.j.f3430r = Boolean.valueOf(com.aggmoread.sdk.z.c.a.a.e.h.a().a("debugLog", false));
        com.aggmoread.sdk.z.c.a.a.e.c.w();
        try {
            String a5 = com.aggmoread.sdk.z.c.a.a.b.a(com.aggmoread.sdk.z.c.a.a.e.d.b(null));
            com.aggmoread.sdk.z.c.a.a.b.a(com.aggmoread.sdk.z.c.a.a.d.b.j.f3429q, com.aggmoread.sdk.z.c.a.a.d.b.j.f3430r.booleanValue());
            byte[] bytes = a5.getBytes("UTF-8");
            HashMap hashMap = new HashMap();
            hashMap.put("Content-type", HttpHeaders.Values.APPLICATION_JSON);
            com.aggmoread.sdk.z.c.a.a.e.d.a(com.aggmoread.sdk.z.c.a.a.d.b.j.e(), bytes, hashMap, new a(this, callback, hVar));
            this.f3357a = true;
            com.aggmoread.sdk.z.c.a.a.d.b.j.f3431s = Boolean.TRUE;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    public void a(com.aggmoread.sdk.z.c.a.a.c.g gVar) {
        com.aggmoread.sdk.z.c.a.a.d.b.d dVar = (com.aggmoread.sdk.z.c.a.a.d.b.d) gVar;
        dVar.a();
        if (m.a(19)) {
            n.a(new c(this, dVar));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("init ");
        sb.append(this.f3357a);
        if (!this.f3357a) {
            n.a(new d(this, dVar));
        } else if (m.d() >= 3) {
            n.a(new e(this, dVar));
        } else {
            a(dVar, new f(this, dVar));
        }
    }

    public void a(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, k kVar) {
        com.aggmoread.sdk.z.c.a.a.e.b a5 = com.aggmoread.sdk.z.c.a.a.e.b.a("sc_" + dVar.f3265i);
        b bVar = new b(dVar, kVar);
        if (a5 != null) {
            a5.a(bVar);
        } else {
            bVar.a(null);
        }
    }

    public void b() {
        com.aggmoread.sdk.z.c.a.a.b.a();
        com.aggmoread.sdk.z.c.a.a.d.b.d.f();
        com.aggmoread.sdk.z.c.a.a.d.b.e.i();
        com.aggmoread.sdk.z.c.a.a.d.b.k.a();
        com.aggmoread.sdk.z.c.a.a.b.e(new Object[]{l.f3399a, l.f3400b});
        com.aggmoread.sdk.z.c.a.a.b.e(com.aggmoread.sdk.z.c.a.a.d.b.j.f3413a);
        com.aggmoread.sdk.z.c.a.a.b.f(com.aggmoread.sdk.z.c.a.a.d.b.j.f3424l);
        com.aggmoread.sdk.z.c.a.a.b.m(com.aggmoread.sdk.z.c.a.a.d.b.j.f3415c);
        com.aggmoread.sdk.z.c.a.a.b.n(com.aggmoread.sdk.z.c.a.a.d.b.j.f3417e);
        com.aggmoread.sdk.z.c.a.a.d.b.j.g();
        com.aggmoread.sdk.z.c.a.a.b.o(com.aggmoread.sdk.z.c.a.a.d.b.j.f3414b);
        com.aggmoread.sdk.z.c.a.a.b.p(com.aggmoread.sdk.z.c.a.a.d.b.j.f3426n);
        com.aggmoread.sdk.z.c.a.a.b.q(com.aggmoread.sdk.z.c.a.a.d.b.j.f3422j);
        com.aggmoread.sdk.z.c.a.a.b.r(com.aggmoread.sdk.z.c.a.a.d.b.j.f3418f);
        com.aggmoread.sdk.z.c.a.a.b.s(com.aggmoread.sdk.z.c.a.a.d.b.j.f3427o);
        com.aggmoread.sdk.z.c.a.a.b.t(com.aggmoread.sdk.z.c.a.a.d.b.j.f3420h);
        com.aggmoread.sdk.z.c.a.a.b.g(com.aggmoread.sdk.z.c.a.a.d.b.j.f3421i);
        com.aggmoread.sdk.z.c.a.a.b.h(com.aggmoread.sdk.z.c.a.a.d.b.j.f3419g);
        com.aggmoread.sdk.z.c.a.a.b.i(com.aggmoread.sdk.z.c.a.a.d.b.j.f3425m);
        com.aggmoread.sdk.z.c.a.a.b.j(com.aggmoread.sdk.z.c.a.a.d.b.j.f3423k);
        com.aggmoread.sdk.z.c.a.a.b.k(com.aggmoread.sdk.z.c.a.a.d.b.j.f3416d);
        com.aggmoread.sdk.z.c.a.a.b.l(com.aggmoread.sdk.z.c.a.a.d.b.j.f3428p);
    }

    public void b(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, k kVar) {
        String a5 = com.aggmoread.sdk.z.c.a.a.b.a(dVar.b());
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMGTAG", "params is " + a5);
        HashMap hashMap = new HashMap();
        hashMap.put("Content-type", HttpHeaders.Values.APPLICATION_JSON);
        try {
            com.aggmoread.sdk.z.c.a.a.e.d.a(com.aggmoread.sdk.z.c.a.a.d.b.j.a(), a5.getBytes("UTF-8"), hashMap, new j(this, kVar, dVar));
        } catch (UnsupportedEncodingException unused) {
            kVar.a(null, null, new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002004, "HTTP error, request error"));
        }
    }
}

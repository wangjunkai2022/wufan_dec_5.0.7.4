package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.umeng.analytics.pro.bm;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static a f4660e;

    /* renamed from: f  reason: collision with root package name */
    private static Object f4661f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Context f4662a;

    /* renamed from: c  reason: collision with root package name */
    private Thread f4664c;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f4663b = false;

    /* renamed from: d  reason: collision with root package name */
    private LinkedList<b> f4665d = new LinkedList<>();

    /* renamed from: com.alipay.apmobilesecuritysdk.face.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0157a {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        int f4666a = 0;

        /* renamed from: b  reason: collision with root package name */
        String f4667b;

        /* renamed from: c  reason: collision with root package name */
        String f4668c;

        /* renamed from: d  reason: collision with root package name */
        String f4669d;

        /* renamed from: e  reason: collision with root package name */
        InterfaceC0157a f4670e;

        public b(String str, String str2, String str3) {
            this.f4669d = str3;
            if (com.alipay.security.mobile.module.commonutils.a.b(str)) {
                this.f4667b = com.alipay.apmobilesecuritysdk.d.b.a(a.this.f4662a);
            } else {
                this.f4667b = str;
            }
            this.f4668c = str2;
            this.f4670e = null;
        }

        private void a() {
            if (a.this.f4663b) {
                return;
            }
            a.this.f4663b = true;
            try {
                com.alipay.apmobilesecuritysdk.d.a.a(a.this.f4662a);
                com.alipay.apmobilesecuritysdk.d.a.c();
                HashMap hashMap = new HashMap();
                hashMap.put(com.alipay.sdk.cons.b.f4830c, this.f4668c);
                hashMap.put(com.alipay.sdk.cons.b.f4834g, this.f4667b);
                com.alipay.apmobilesecuritysdk.d.a.a(a.this.f4662a);
                hashMap.put(bm.f63446g, com.alipay.apmobilesecuritysdk.d.a.b());
                hashMap.put("userId", this.f4669d);
                e.a(a.this.f4662a, hashMap);
                if (this.f4670e != null) {
                    c cVar = new c();
                    cVar.f4674c = com.alipay.apmobilesecuritysdk.a.a.f(a.this.f4662a);
                    cVar.f4673b = com.alipay.apmobilesecuritysdk.a.a.a(a.this.f4662a);
                    com.alipay.apmobilesecuritysdk.d.a.a(a.this.f4662a);
                    cVar.f4672a = com.alipay.apmobilesecuritysdk.d.a.b();
                    cVar.f4675d = com.alipay.apmobilesecuritysdk.f.b.a(a.this.f4662a);
                }
            } catch (Throwable unused) {
            }
            a.this.f4663b = false;
        }
    }

    /* loaded from: classes2.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public String f4672a;

        /* renamed from: b  reason: collision with root package name */
        public String f4673b;

        /* renamed from: c  reason: collision with root package name */
        public String f4674c;

        /* renamed from: d  reason: collision with root package name */
        public String f4675d;

        public c() {
        }
    }

    private a(Context context) {
        this.f4662a = context;
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f4661f) {
            if (f4660e == null) {
                f4660e = new a(context);
            }
            aVar = f4660e;
        }
        return aVar;
    }

    private String b() {
        return com.alipay.apmobilesecuritysdk.a.a.a(this.f4662a);
    }

    private c f() {
        c cVar = new c();
        try {
            System.currentTimeMillis();
            cVar.f4673b = com.alipay.apmobilesecuritysdk.a.a.a(this.f4662a);
            System.currentTimeMillis();
            cVar.f4674c = com.alipay.apmobilesecuritysdk.a.a.f(this.f4662a);
            com.alipay.apmobilesecuritysdk.d.a.a(this.f4662a);
            cVar.f4672a = com.alipay.apmobilesecuritysdk.d.a.b();
            cVar.f4675d = com.alipay.apmobilesecuritysdk.f.b.a(this.f4662a);
        } catch (Throwable unused) {
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Thread g(a aVar) {
        aVar.f4664c = null;
        return null;
    }

    public final void d(Map<String, String> map) {
        String a5 = com.alipay.security.mobile.module.commonutils.a.a(map, com.alipay.sdk.cons.b.f4834g, "");
        String a6 = com.alipay.security.mobile.module.commonutils.a.a(map, com.alipay.sdk.cons.b.f4830c, "");
        String a7 = com.alipay.security.mobile.module.commonutils.a.a(map, "userId", "");
        com.alipay.security.mobile.module.a.a.a.b("https://mobilegw.alipay.com/mgw.htm");
        this.f4665d.addLast(new b(a5, a6, a7));
        if (this.f4664c == null) {
            Thread thread = new Thread(new com.alipay.apmobilesecuritysdk.face.b(this));
            this.f4664c = thread;
            thread.setUncaughtExceptionHandler(new com.alipay.apmobilesecuritysdk.face.c(this));
            this.f4664c.start();
        }
    }
}

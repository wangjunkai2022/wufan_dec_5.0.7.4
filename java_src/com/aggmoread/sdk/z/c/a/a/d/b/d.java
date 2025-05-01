package com.aggmoread.sdk.z.c.a.a.d.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.e.b;
import com.aggmoread.sdk.z.c.a.a.e.d;
import com.aggmoread.sdk.z.c.a.a.e.o;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes2.dex */
public class d implements com.aggmoread.sdk.z.c.a.a.c.g, Cloneable {
    private static Map<String, WeakReference<Object>> H = Collections.synchronizedMap(new HashMap());
    public int A;
    public o B;
    public o C;
    public o D;
    public o E;
    public o F;
    public o G;

    /* renamed from: b  reason: collision with root package name */
    public Object f3258b;

    /* renamed from: c  reason: collision with root package name */
    public String f3259c;

    /* renamed from: d  reason: collision with root package name */
    public Context f3260d;

    /* renamed from: e  reason: collision with root package name */
    public com.aggmoread.sdk.z.c.a.a.c.i f3261e;

    /* renamed from: g  reason: collision with root package name */
    public com.aggmoread.sdk.z.c.a.a.c.f f3263g;

    /* renamed from: h  reason: collision with root package name */
    public com.aggmoread.sdk.z.c.a.a.c.f f3264h;

    /* renamed from: i  reason: collision with root package name */
    public String f3265i;

    /* renamed from: j  reason: collision with root package name */
    public ViewGroup f3266j;

    /* renamed from: k  reason: collision with root package name */
    public View f3267k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3268l;

    /* renamed from: o  reason: collision with root package name */
    public int f3271o;

    /* renamed from: r  reason: collision with root package name */
    public com.aggmoread.sdk.z.c.a.a.e.b f3274r;

    /* renamed from: s  reason: collision with root package name */
    public com.aggmoread.sdk.z.c.a.a.c.t.b f3275s;

    /* renamed from: t  reason: collision with root package name */
    public com.aggmoread.sdk.z.c.a.a.d.a.c f3276t;

    /* renamed from: u  reason: collision with root package name */
    public com.aggmoread.sdk.z.c.a.a.a f3277u;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3282z;

    /* renamed from: f  reason: collision with root package name */
    public String f3262f = "2";

    /* renamed from: m  reason: collision with root package name */
    public int f3269m = 1;

    /* renamed from: n  reason: collision with root package name */
    public int f3270n = 5000;

    /* renamed from: p  reason: collision with root package name */
    public com.aggmoread.sdk.z.c.a.a.c.r.c f3272p = com.aggmoread.sdk.z.c.a.a.c.r.c.f2772d;

    /* renamed from: q  reason: collision with root package name */
    public com.aggmoread.sdk.z.c.a.a.c.h f3273q = com.aggmoread.sdk.z.c.a.a.c.h.f2747c;

    /* renamed from: v  reason: collision with root package name */
    public int f3278v = -1;

    /* renamed from: w  reason: collision with root package name */
    public String f3279w = null;

    /* renamed from: x  reason: collision with root package name */
    public String f3280x = null;

    /* renamed from: y  reason: collision with root package name */
    public String f3281y = "-1";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f3283a;

        a(e eVar) {
            this.f3283a = eVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.b.c
        public void a(com.aggmoread.sdk.z.c.a.a.e.b bVar) {
            byte[] b5 = bVar.b();
            int a5 = b5 != null ? com.aggmoread.sdk.z.c.a.a.b.a(b5) : -1;
            int b6 = this.f3283a.f3308b.b(e.c.f3332g);
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMGTAG", String.format("version = %d, server version = %d", Integer.valueOf(a5), Integer.valueOf(b6)));
            if (b6 < 2 || a5 == b6) {
                return;
            }
            d.this.a(b6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f3285a;

        b(int i4) {
            this.f3285a = i4;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.d.c
        public void a(int i4, byte[] bArr, i iVar) {
            Object obj;
            if (iVar != null || i4 != 200 || bArr == null || bArr.length <= 0) {
                return;
            }
            try {
                Map<Object, Object> c5 = com.aggmoread.sdk.z.c.a.a.b.c(new String(bArr, "UTF-8"));
                if (c5 != null) {
                    int b5 = new com.aggmoread.sdk.z.c.a.a.e.f(c5).b(c.f3292f);
                    if (b5 == -1000) {
                        com.aggmoread.sdk.z.c.a.a.e.b bVar = d.this.f3274r;
                        if (bVar != null) {
                            bVar.a((byte[]) null);
                        }
                    } else if (b5 != 1 || (obj = c5.get(c.f3293g)) == null) {
                    } else {
                        d.this.b(new com.aggmoread.sdk.z.c.a.a.e.f((Map) obj).c(c.f3294h), this.f3285a);
                    }
                }
            } catch (UnsupportedEncodingException unused) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final Object f3287a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public static final Object f3288b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public static final Object f3289c = new Object();

        /* renamed from: d  reason: collision with root package name */
        public static final Object f3290d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public static final Object f3291e = new Object();

        /* renamed from: f  reason: collision with root package name */
        public static final Object f3292f = new Object();

        /* renamed from: g  reason: collision with root package name */
        public static final Object f3293g = new Object();

        /* renamed from: h  reason: collision with root package name */
        public static final Object f3294h = new Object();
    }

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.b.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0143d {

        /* renamed from: a  reason: collision with root package name */
        public static final Object f3295a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public static final Object f3296b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public static final Object f3297c = new Object();

        /* renamed from: d  reason: collision with root package name */
        public static final Object f3298d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public static final Object f3299e = new Object();

        /* renamed from: f  reason: collision with root package name */
        public static final Object f3300f = new Object();

        /* renamed from: g  reason: collision with root package name */
        public static final Object f3301g = new Object();

        /* renamed from: h  reason: collision with root package name */
        public static final Object f3302h = new Object();

        /* renamed from: i  reason: collision with root package name */
        public static final Object f3303i = new Object();

        /* renamed from: j  reason: collision with root package name */
        public static final Object f3304j = new Object();

        /* renamed from: k  reason: collision with root package name */
        public static final Object f3305k = new Object();

        /* renamed from: l  reason: collision with root package name */
        public static final Object f3306l = new Object();
    }

    private static Object a(String str) {
        WeakReference<Object> weakReference = H.get(str);
        Object obj = weakReference != null ? weakReference.get() : null;
        if (obj == null) {
            synchronized (H) {
                WeakReference<Object> weakReference2 = H.get(str);
                if (weakReference2 != null) {
                    obj = weakReference2.get();
                }
                if (obj == null) {
                    obj = com.aggmoread.sdk.z.c.a.a.b.b();
                    H.put(str, new WeakReference<>(obj));
                }
            }
        }
        return obj;
    }

    public static void f() {
        com.aggmoread.sdk.z.c.a.a.b.a(new Object[]{C0143d.f3295a, C0143d.f3296b, C0143d.f3297c, C0143d.f3298d, C0143d.f3299e, C0143d.f3300f, C0143d.f3301g, C0143d.f3302h, C0143d.f3303i, C0143d.f3304j, C0143d.f3305k});
        com.aggmoread.sdk.z.c.a.a.b.c(new Object[]{c.f3287a, c.f3288b, c.f3289c, c.f3290d, c.f3291e});
        com.aggmoread.sdk.z.c.a.a.b.d(new Object[]{new Object[]{c.f3292f, c.f3293g}, new Object[]{c.f3294h}});
    }

    public void a() {
        this.f3258b = a(this.f3265i);
        this.B = o.a(this.f3265i, o.c.f3525d);
        this.C = o.a(this.f3265i, o.c.f3526e);
        this.D = o.a(this.f3265i, o.c.f3527f);
        this.E = o.a(this.f3265i, o.c.f3528g);
    }

    public void a(int i4) {
        Map<Object, Object> a5 = com.aggmoread.sdk.z.c.a.a.e.d.a((Map<Object, Object>) null);
        new com.aggmoread.sdk.z.c.a.a.e.f(a5).b(c.f3290d, this.f3265i);
        try {
            byte[] bytes = com.aggmoread.sdk.z.c.a.a.b.b(a5).getBytes("UTF-8");
            HashMap hashMap = new HashMap();
            hashMap.put("Content-type", HttpHeaders.Values.APPLICATION_JSON);
            com.aggmoread.sdk.z.c.a.a.e.d.a(j.c(), bytes, hashMap, new b(i4));
        } catch (UnsupportedEncodingException unused) {
        }
    }

    public void a(e eVar) {
        this.F = o.a(this.f3265i, o.c.f3529h);
        this.G = o.a(this.f3265i, o.c.f3530i);
        com.aggmoread.sdk.z.c.a.a.e.b a5 = com.aggmoread.sdk.z.c.a.a.e.b.a(String.format("%s_%s", this.f3265i, com.aggmoread.sdk.z.c.a.a.e.c.q()));
        this.f3274r = a5;
        if (a5 == null) {
            return;
        }
        a5.a(new a(eVar));
    }

    public void a(i iVar, e eVar) {
        a(iVar, null, eVar, true);
    }

    public void a(i iVar, e eVar, boolean z4) {
        a(iVar, null, eVar, z4);
    }

    public void a(i iVar, Map<Object, Object> map, e eVar, boolean z4) {
        new k(this, eVar).a(8).a(iVar).a(map).b();
        if (z4) {
            this.f3263g.a(iVar);
        }
    }

    public void a(int[] iArr) {
        String str = "sspp" + this.f3265i;
        if (iArr == null) {
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMGTAG", "clear saved point");
            com.aggmoread.sdk.z.c.a.a.e.h.a().a(str);
            return;
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMGTAG", "set saved pint k=" + str + "  v= " + iArr[0] + "," + iArr[1]);
        com.aggmoread.sdk.z.c.a.a.e.h.a().b(str, String.format("%d|%d", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1])));
    }

    public boolean a(String str, int i4) {
        com.aggmoread.sdk.z.c.a.a.a aVar = this.f3277u;
        if (aVar == null) {
            return false;
        }
        aVar.a(str);
        throw null;
    }

    public Map<Object, Object> b() {
        com.aggmoread.sdk.z.c.a.a.e.f fVar = new com.aggmoread.sdk.z.c.a.a.e.f(com.aggmoread.sdk.z.c.a.a.e.d.b(null));
        fVar.b(C0143d.f3295a, this.f3259c);
        fVar.b(C0143d.f3296b, this.f3265i);
        fVar.b(C0143d.f3298d, this.f3261e.a());
        if (this.f3261e == com.aggmoread.sdk.z.c.a.a.c.i.SPLASH) {
            fVar.b(C0143d.f3306l, com.aggmoread.sdk.z.c.a.a.e.c.D() ? 1 : 0);
        }
        return fVar.f3494a;
    }

    public void b(String str, int i4) {
        if (str == null) {
            return;
        }
        try {
            String[] split = str.split("\\#");
            if (split.length < 2) {
                return;
            }
            String[] split2 = split[0].split("\\,");
            if (split2.length < 2) {
                return;
            }
            int parseInt = Integer.parseInt(split2[0]);
            int parseInt2 = Integer.parseInt(split2[1]);
            int i5 = parseInt * parseInt2;
            int i6 = i5 + 1;
            if (split.length < i6) {
                return;
            }
            int[] iArr = new int[i5 + 3];
            iArr[0] = i4;
            iArr[1] = parseInt;
            iArr[2] = parseInt2;
            for (int i7 = 1; i7 < i6; i7++) {
                String[] split3 = split[i7].split("\\,");
                if (split3.length < 3) {
                    return;
                }
                iArr[i7 + 2] = Integer.parseInt(split3[2]);
            }
            byte[] a5 = com.aggmoread.sdk.z.c.a.a.b.a(iArr);
            if (a5 != null) {
                this.f3274r.a(a5);
            }
        } catch (Exception e5) {
            com.aggmoread.sdk.z.c.a.a.e.e.a("err " + e5);
        }
    }

    public long c() {
        com.aggmoread.sdk.z.c.a.a.e.h a5 = com.aggmoread.sdk.z.c.a.a.e.h.a();
        return a5.a("LTCl_" + this.f3265i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public Object clone() {
        d dVar = (d) super.clone();
        dVar.f3259c = UUID.randomUUID().toString();
        return dVar;
    }

    public int[] d() {
        String str;
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMGTAG", "get savedpoint");
        com.aggmoread.sdk.z.c.a.a.e.h a5 = com.aggmoread.sdk.z.c.a.a.e.h.a();
        String a6 = a5.a("sspp" + this.f3265i, (String) null);
        if (a6 != null) {
            com.aggmoread.sdk.z.c.a.a.e.e.b("AMGTAG", "sspp is" + a6);
            String[] split = a6.split("\\|");
            if (split.length > 1) {
                try {
                    com.aggmoread.sdk.z.c.a.a.e.e.b("AMGTAG", "x = " + split[0] + ",y=" + split[1]);
                    return new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1])};
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } else {
                str = "ss.length < 2";
            }
        } else {
            str = "saved point empty";
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b("AMGTAG", str);
        return null;
    }

    public void e() {
        com.aggmoread.sdk.z.c.a.a.e.h a5 = com.aggmoread.sdk.z.c.a.a.e.h.a();
        a5.b("LTCl_" + this.f3265i, System.currentTimeMillis());
        l.a(this.f3258b, System.currentTimeMillis());
    }
}

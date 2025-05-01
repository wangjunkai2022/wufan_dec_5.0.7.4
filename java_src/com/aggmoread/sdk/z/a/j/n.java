package com.aggmoread.sdk.z.a.j;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private String f2225a;

    /* renamed from: b  reason: collision with root package name */
    private String f2226b;

    /* renamed from: c  reason: collision with root package name */
    private String f2227c;

    /* renamed from: d  reason: collision with root package name */
    private String f2228d;

    /* renamed from: g  reason: collision with root package name */
    private i f2231g;

    /* renamed from: k  reason: collision with root package name */
    private Context f2235k;

    /* renamed from: l  reason: collision with root package name */
    private k f2236l;

    /* renamed from: m  reason: collision with root package name */
    private int f2237m;

    /* renamed from: e  reason: collision with root package name */
    private int f2229e = com.join.mgps.socket.entity.b.f54676c;

    /* renamed from: f  reason: collision with root package name */
    private int f2230f = com.join.mgps.socket.entity.b.f54676c;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, String> f2232h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private boolean f2233i = true;

    /* renamed from: j  reason: collision with root package name */
    private int f2234j = 3;

    /* renamed from: n  reason: collision with root package name */
    private final AtomicBoolean f2238n = new AtomicBoolean(false);

    /* renamed from: o  reason: collision with root package name */
    private final p f2239o = p.b();

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f2240a;

        /* renamed from: b  reason: collision with root package name */
        private String f2241b;

        /* renamed from: c  reason: collision with root package name */
        private int f2242c;

        /* renamed from: d  reason: collision with root package name */
        private String f2243d;

        /* renamed from: e  reason: collision with root package name */
        private String f2244e;

        /* renamed from: f  reason: collision with root package name */
        private int f2245f;

        /* renamed from: g  reason: collision with root package name */
        private i f2246g;

        /* renamed from: h  reason: collision with root package name */
        private Context f2247h;

        /* renamed from: j  reason: collision with root package name */
        private boolean f2249j;

        /* renamed from: k  reason: collision with root package name */
        private k f2250k;

        /* renamed from: i  reason: collision with root package name */
        private int f2248i = 3;

        /* renamed from: l  reason: collision with root package name */
        private int f2251l = 3;

        /* renamed from: m  reason: collision with root package name */
        private final Map<String, String> f2252m = new HashMap();

        public a(Context context) {
            this.f2247h = context;
        }

        public a a(int i4) {
            this.f2248i = i4;
            return this;
        }

        public a a(i iVar) {
            this.f2246g = iVar;
            return this;
        }

        public a a(k kVar) {
            this.f2250k = kVar;
            return this;
        }

        public a a(String str) {
            this.f2243d = str;
            return this;
        }

        public a a(boolean z4) {
            this.f2249j = z4;
            return this;
        }

        public n a() {
            n nVar = new n();
            if (!TextUtils.isEmpty(this.f2240a)) {
                nVar.f2225a = this.f2240a;
            }
            nVar.f2226b = this.f2241b;
            if (!TextUtils.isEmpty(this.f2244e)) {
                this.f2244e = this.f2244e.replace("apk", "tmp");
            }
            nVar.f2228d = this.f2244e;
            nVar.f2227c = this.f2243d;
            nVar.f2230f = this.f2245f;
            nVar.f2229e = this.f2242c;
            nVar.f2233i = this.f2249j;
            nVar.f2235k = this.f2247h;
            nVar.f2234j = this.f2248i;
            nVar.f2236l = this.f2250k;
            nVar.f2237m = this.f2251l;
            nVar.f2231g = this.f2250k != null ? new m(this.f2246g, this.f2250k) : this.f2246g;
            nVar.f2232h.putAll(this.f2252m);
            return nVar;
        }

        public a b(int i4) {
            this.f2251l = i4;
            return this;
        }

        public a b(String str) {
            this.f2244e = str;
            return this;
        }

        public a c(String str) {
            this.f2241b = str;
            return this;
        }
    }

    public n() {
        UUID.randomUUID().toString();
    }

    public int a() {
        return this.f2230f;
    }

    public Context b() {
        return this.f2235k;
    }

    public String c() {
        return this.f2227c;
    }

    public i d() {
        i iVar = this.f2231g;
        return iVar == null ? i.f2206a : iVar;
    }

    public String e() {
        return this.f2228d;
    }

    public Map<String, String> f() {
        return this.f2232h;
    }

    public String g() {
        return this.f2226b;
    }

    public int h() {
        return this.f2234j;
    }

    public int i() {
        return this.f2229e;
    }

    public boolean j() {
        return this.f2238n.get();
    }

    public boolean k() {
        return this.f2233i;
    }

    public void l() {
        boolean a5 = this.f2239o.a();
        com.aggmoread.sdk.z.a.d.c("DownloadRequest", "start enter, isStarted = " + a5);
        this.f2239o.a(this);
    }

    public String toString() {
        return "DownloadRequest{httpUrl='" + this.f2226b + "', filePath='" + this.f2227c + "', fileName='" + this.f2228d + "', readTimout=" + this.f2229e + ", connectionTimeout=" + this.f2230f + ", downloadListener=" + this.f2231g + ", skipIfCached=" + this.f2233i + ", maxRedirect=" + this.f2234j + ", context=" + this.f2235k + ", isCanceled=" + this.f2238n + ", isStarted=" + this.f2239o.a() + '}';
    }
}

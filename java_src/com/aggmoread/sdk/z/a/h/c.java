package com.aggmoread.sdk.z.a.h;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.aggmoread.sdk.z.a.e;
import com.aggmoread.sdk.z.a.r.d;
import java.lang.ref.WeakReference;
import java.util.UUID;
/* loaded from: classes2.dex */
public class c extends e {

    /* renamed from: o  reason: collision with root package name */
    public static String f2141o = "";

    /* renamed from: b  reason: collision with root package name */
    private String f2142b;

    /* renamed from: c  reason: collision with root package name */
    private String f2143c;

    /* renamed from: d  reason: collision with root package name */
    private Context f2144d;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<Activity> f2145e;

    /* renamed from: f  reason: collision with root package name */
    private int f2146f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference<ViewGroup> f2147g;

    /* renamed from: h  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.i.a f2148h;

    /* renamed from: i  reason: collision with root package name */
    private int f2149i;

    /* renamed from: j  reason: collision with root package name */
    private View f2150j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2151k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2152l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2153m;

    /* renamed from: n  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.s.c f2154n;

    /* loaded from: classes2.dex */
    public static class b extends e {

        /* renamed from: b  reason: collision with root package name */
        private String f2155b;

        /* renamed from: c  reason: collision with root package name */
        private Activity f2156c;

        /* renamed from: d  reason: collision with root package name */
        private Context f2157d;

        /* renamed from: f  reason: collision with root package name */
        private ViewGroup f2159f;

        /* renamed from: g  reason: collision with root package name */
        private View f2160g;

        /* renamed from: e  reason: collision with root package name */
        private int f2158e = 5000;

        /* renamed from: h  reason: collision with root package name */
        private int f2161h = 1;

        /* renamed from: i  reason: collision with root package name */
        private boolean f2162i = false;

        /* renamed from: j  reason: collision with root package name */
        private boolean f2163j = true;

        /* renamed from: k  reason: collision with root package name */
        private boolean f2164k = false;

        /* renamed from: l  reason: collision with root package name */
        private com.aggmoread.sdk.z.a.s.c f2165l = com.aggmoread.sdk.z.a.s.c.f2491k;

        public b(Context context) {
            if (context instanceof Activity) {
                this.f2156c = (Activity) context;
            }
            this.f2157d = context;
        }

        public b a(View view) {
            this.f2160g = view;
            return this;
        }

        public b a(String str) {
            this.f2155b = str;
            return this;
        }

        public b a(boolean z4) {
            this.f2162i = z4;
            return this;
        }

        public b b(int i4) {
            this.f2161h = i4;
            return this;
        }

        public b b(boolean z4) {
            this.f2164k = z4;
            return this;
        }

        public b c(int i4) {
            this.f2158e = i4;
            return this;
        }

        public c d() {
            c cVar = new c();
            cVar.f2145e = new WeakReference(this.f2156c);
            cVar.f2143c = this.f2155b;
            cVar.f2146f = this.f2158e;
            cVar.f2150j = this.f2160g;
            cVar.f2144d = this.f2157d;
            cVar.f2147g = new WeakReference(this.f2159f);
            cVar.f2149i = this.f2161h;
            cVar.f2151k = this.f2162i;
            cVar.f2152l = this.f2163j;
            cVar.f2154n = this.f2165l;
            cVar.f2153m = this.f2164k;
            cVar.a(this);
            return cVar;
        }
    }

    private c() {
        this.f2146f = 5000;
        this.f2148h = com.aggmoread.sdk.z.a.i.a.f2171g;
        this.f2151k = true;
        this.f2152l = false;
        this.f2153m = false;
        this.f2154n = com.aggmoread.sdk.z.a.s.c.f2491k;
        this.f2142b = UUID.randomUUID().toString();
    }

    private boolean d() {
        return com.aggmoread.sdk.z.a.h.a.d().f();
    }

    public void a(com.aggmoread.sdk.z.a.f.a aVar) {
        if (!d()) {
            aVar.a(com.aggmoread.sdk.z.a.g.e.f2113h);
            return;
        }
        this.f2148h = com.aggmoread.sdk.z.a.i.a.f2169e;
        com.aggmoread.sdk.z.a.r.b.a(this, aVar);
    }

    public void a(com.aggmoread.sdk.z.a.k.a aVar) {
        if (!d()) {
            aVar.a(com.aggmoread.sdk.z.a.g.e.f2113h);
            return;
        }
        this.f2148h = com.aggmoread.sdk.z.a.i.a.f2168d;
        com.aggmoread.sdk.z.a.r.b.a(this, aVar);
    }

    public void a(com.aggmoread.sdk.z.a.l.a aVar) {
        if (!d()) {
            aVar.a(com.aggmoread.sdk.z.a.g.e.f2113h);
            return;
        }
        this.f2148h = com.aggmoread.sdk.z.a.i.a.f2167c;
        com.aggmoread.sdk.z.a.r.b.a(this, aVar);
    }

    public void a(com.aggmoread.sdk.z.a.r.c cVar) {
        if (!d()) {
            cVar.a(com.aggmoread.sdk.z.a.g.e.f2113h);
            return;
        }
        this.f2148h = com.aggmoread.sdk.z.a.i.a.f2170f;
        com.aggmoread.sdk.z.a.r.b.a(this, cVar);
    }

    public void a(d dVar) {
        if (!d()) {
            dVar.a(com.aggmoread.sdk.z.a.g.e.f2113h);
            return;
        }
        this.f2148h = com.aggmoread.sdk.z.a.i.a.f2166b;
        com.aggmoread.sdk.z.a.r.b.a(this, dVar);
    }

    public Activity e() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f2145e;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return null;
        }
        return activity;
    }

    public ViewGroup f() {
        return this.f2147g.get();
    }

    public View g() {
        return this.f2150j;
    }

    public com.aggmoread.sdk.z.a.i.a h() {
        return this.f2148h;
    }

    public String i() {
        return this.f2143c;
    }

    public Context j() {
        return this.f2144d;
    }

    public String k() {
        return this.f2142b;
    }

    public com.aggmoread.sdk.z.a.s.c l() {
        return this.f2154n;
    }

    public boolean m() {
        return this.f2152l;
    }

    public boolean n() {
        return this.f2151k;
    }

    public boolean o() {
        return this.f2153m;
    }

    public String toString() {
        return "JuHeApiRequest{requestId='" + this.f2142b + "', codeId='" + this.f2143c + "', activityWeak=" + this.f2145e + ", timeoutMs=" + this.f2146f + ", adContainerWeak=" + this.f2147g + ", adType=" + this.f2148h + '}';
    }
}

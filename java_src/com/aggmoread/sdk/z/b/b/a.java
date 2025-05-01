package com.aggmoread.sdk.z.b.b;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.aggmoread.sdk.z.a.e;
import com.aggmoread.sdk.z.a.r.d;
import java.lang.ref.WeakReference;
import java.util.UUID;
/* loaded from: classes2.dex */
public class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private String f2636b;

    /* renamed from: c  reason: collision with root package name */
    private String f2637c;

    /* renamed from: d  reason: collision with root package name */
    private String f2638d;

    /* renamed from: e  reason: collision with root package name */
    private Context f2639e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Activity> f2640f;

    /* renamed from: g  reason: collision with root package name */
    private int f2641g;

    /* renamed from: h  reason: collision with root package name */
    private WeakReference<ViewGroup> f2642h;

    /* renamed from: i  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.i.a f2643i;

    /* renamed from: j  reason: collision with root package name */
    private int f2644j;

    /* renamed from: k  reason: collision with root package name */
    private View f2645k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2646l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2647m;

    /* loaded from: classes2.dex */
    public static class b extends e {

        /* renamed from: b  reason: collision with root package name */
        private String f2648b;

        /* renamed from: c  reason: collision with root package name */
        private String f2649c;

        /* renamed from: d  reason: collision with root package name */
        private Activity f2650d;

        /* renamed from: f  reason: collision with root package name */
        private ViewGroup f2652f;

        /* renamed from: g  reason: collision with root package name */
        private View f2653g;

        /* renamed from: i  reason: collision with root package name */
        private Context f2655i;

        /* renamed from: e  reason: collision with root package name */
        private int f2651e = 5000;

        /* renamed from: h  reason: collision with root package name */
        private int f2654h = 1;

        /* renamed from: j  reason: collision with root package name */
        private boolean f2656j = false;

        /* renamed from: k  reason: collision with root package name */
        private boolean f2657k = true;

        public b(Context context) {
            this.f2655i = context;
        }

        public b a(View view) {
            this.f2653g = view;
            return this;
        }

        public b a(String str) {
            this.f2648b = str;
            return this;
        }

        public b a(boolean z4) {
            this.f2656j = z4;
            return this;
        }

        public b b(int i4) {
            this.f2654h = i4;
            return this;
        }

        public b c(int i4) {
            this.f2651e = i4;
            return this;
        }

        public a d() {
            a aVar = new a();
            aVar.f2640f = new WeakReference(this.f2650d);
            aVar.f2637c = this.f2648b;
            aVar.f2641g = this.f2651e;
            aVar.f2642h = new WeakReference(this.f2652f);
            aVar.f2644j = this.f2654h;
            aVar.f2645k = this.f2653g;
            aVar.f2639e = this.f2655i;
            aVar.f2646l = this.f2656j;
            aVar.f2638d = this.f2649c;
            aVar.f2647m = this.f2657k;
            aVar.a(this);
            return aVar;
        }
    }

    private a() {
        this.f2641g = 5000;
        this.f2643i = com.aggmoread.sdk.z.a.i.a.f2171g;
        this.f2646l = false;
        this.f2647m = true;
        this.f2636b = UUID.randomUUID().toString();
    }

    public void a(com.aggmoread.sdk.z.a.l.a aVar) {
        this.f2643i = com.aggmoread.sdk.z.a.i.a.f2167c;
        com.aggmoread.sdk.z.b.c.a.a(this, aVar);
    }

    public void a(d dVar) {
        this.f2643i = com.aggmoread.sdk.z.a.i.a.f2166b;
        if (dVar == null) {
            dVar = d.f2415a;
        }
        com.aggmoread.sdk.z.b.c.a.a(this, dVar);
    }

    public Activity d() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f2640f;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return null;
        }
        return activity;
    }

    public ViewGroup e() {
        return this.f2642h.get();
    }

    public View f() {
        return this.f2645k;
    }

    public com.aggmoread.sdk.z.a.i.a g() {
        return this.f2643i;
    }

    public String h() {
        return this.f2637c;
    }

    public Context i() {
        return this.f2639e;
    }

    public String j() {
        return this.f2636b;
    }

    public boolean k() {
        return this.f2647m;
    }

    public boolean l() {
        return this.f2646l;
    }

    public String toString() {
        return "DspRequest{requestId='" + this.f2636b + "', codeId='" + this.f2637c + "', sdkCodeId='" + this.f2638d + "', activityWeak=" + this.f2640f + ", timeoutMs=" + this.f2641g + ", adContainerWeak=" + this.f2642h + ", adType=" + this.f2643i + '}';
    }
}

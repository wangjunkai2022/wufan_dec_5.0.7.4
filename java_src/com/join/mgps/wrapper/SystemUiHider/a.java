package com.join.mgps.wrapper.SystemUiHider;

import android.app.Activity;
import android.view.View;
/* compiled from: SystemUiHider.java */
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: e  reason: collision with root package name */
    public static final int f54985e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f54986f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f54987g = 6;

    /* renamed from: h  reason: collision with root package name */
    private static b f54988h = new C0389a();

    /* renamed from: a  reason: collision with root package name */
    protected Activity f54989a;

    /* renamed from: b  reason: collision with root package name */
    protected View f54990b;

    /* renamed from: c  reason: collision with root package name */
    protected int f54991c;

    /* renamed from: d  reason: collision with root package name */
    protected b f54992d = f54988h;

    /* compiled from: SystemUiHider.java */
    /* renamed from: com.join.mgps.wrapper.SystemUiHider.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C0389a implements b {
        C0389a() {
        }

        @Override // com.join.mgps.wrapper.SystemUiHider.a.b
        public void onVisibilityChange(boolean z4) {
        }
    }

    /* compiled from: SystemUiHider.java */
    /* loaded from: classes5.dex */
    public interface b {
        void onVisibilityChange(boolean z4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Activity activity, View view, int i4) {
        this.f54989a = activity;
        this.f54990b = view;
        this.f54991c = i4;
    }

    public static a a(Activity activity, View view, int i4) {
        if (com.join.mgps.wrapper.a.f55010b >= 11) {
            return new c(activity, view, i4);
        }
        return new com.join.mgps.wrapper.SystemUiHider.b(activity, view, i4);
    }

    public abstract void b();

    public abstract boolean c();

    public void d(b bVar) {
        if (bVar == null) {
            bVar = f54988h;
        }
        this.f54992d = bVar;
    }

    public abstract void e();

    public abstract void f();

    public void g() {
        if (c()) {
            b();
        } else {
            f();
        }
    }
}

package org.greenrobot.eventbus.util;

import android.content.res.Resources;
/* compiled from: ErrorDialogConfig.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    final Resources f72422a;

    /* renamed from: b  reason: collision with root package name */
    final int f72423b;

    /* renamed from: c  reason: collision with root package name */
    final int f72424c;

    /* renamed from: e  reason: collision with root package name */
    org.greenrobot.eventbus.c f72426e;

    /* renamed from: g  reason: collision with root package name */
    String f72428g;

    /* renamed from: h  reason: collision with root package name */
    int f72429h;

    /* renamed from: i  reason: collision with root package name */
    Class<?> f72430i;

    /* renamed from: f  reason: collision with root package name */
    boolean f72427f = true;

    /* renamed from: d  reason: collision with root package name */
    final d f72425d = new d();

    public b(Resources resources, int i4, int i5) {
        this.f72422a = resources;
        this.f72423b = i4;
        this.f72424c = i5;
    }

    public b a(Class<? extends Throwable> cls, int i4) {
        this.f72425d.a(cls, i4);
        return this;
    }

    public void b() {
        this.f72427f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public org.greenrobot.eventbus.c c() {
        org.greenrobot.eventbus.c cVar = this.f72426e;
        return cVar != null ? cVar : org.greenrobot.eventbus.c.f();
    }

    public int d(Throwable th) {
        Integer b5 = this.f72425d.b(th);
        if (b5 != null) {
            return b5.intValue();
        }
        String str = org.greenrobot.eventbus.c.f72303q;
        StringBuilder sb = new StringBuilder();
        sb.append("No specific message ressource ID found for ");
        sb.append(th);
        return this.f72424c;
    }

    public void e(int i4) {
        this.f72429h = i4;
    }

    public void f(Class<?> cls) {
        this.f72430i = cls;
    }

    public void g(org.greenrobot.eventbus.c cVar) {
        this.f72426e = cVar;
    }

    public void h(String str) {
        this.f72428g = str;
    }
}

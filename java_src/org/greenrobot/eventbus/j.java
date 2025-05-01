package org.greenrobot.eventbus;

import java.lang.reflect.Method;
/* compiled from: SubscriberMethod.java */
/* loaded from: classes7.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    final Method f72359a;

    /* renamed from: b  reason: collision with root package name */
    final ThreadMode f72360b;

    /* renamed from: c  reason: collision with root package name */
    final Class<?> f72361c;

    /* renamed from: d  reason: collision with root package name */
    final int f72362d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f72363e;

    /* renamed from: f  reason: collision with root package name */
    String f72364f;

    public j(Method method, Class<?> cls, ThreadMode threadMode, int i4, boolean z4) {
        this.f72359a = method;
        this.f72360b = threadMode;
        this.f72361c = cls;
        this.f72362d = i4;
        this.f72363e = z4;
    }

    private synchronized void a() {
        if (this.f72364f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f72359a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f72359a.getName());
            sb.append('(');
            sb.append(this.f72361c.getName());
            this.f72364f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            a();
            j jVar = (j) obj;
            jVar.a();
            return this.f72364f.equals(jVar.f72364f);
        }
        return false;
    }

    public int hashCode() {
        return this.f72359a.hashCode();
    }
}

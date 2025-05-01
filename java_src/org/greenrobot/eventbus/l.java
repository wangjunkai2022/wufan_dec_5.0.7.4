package org.greenrobot.eventbus;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Subscription.java */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    final Object f72382a;

    /* renamed from: b  reason: collision with root package name */
    final j f72383b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f72384c = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Object obj, j jVar) {
        this.f72382a = obj;
        this.f72383b = jVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f72382a == lVar.f72382a && this.f72383b.equals(lVar.f72383b);
        }
        return false;
    }

    public int hashCode() {
        return this.f72382a.hashCode() + this.f72383b.f72364f.hashCode();
    }
}

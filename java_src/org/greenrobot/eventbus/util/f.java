package org.greenrobot.eventbus.util;
/* compiled from: ThrowableFailureEvent.java */
/* loaded from: classes7.dex */
public class f implements e {

    /* renamed from: a  reason: collision with root package name */
    protected final Throwable f72433a;

    /* renamed from: b  reason: collision with root package name */
    protected final boolean f72434b;

    /* renamed from: c  reason: collision with root package name */
    private Object f72435c;

    public f(Throwable th) {
        this.f72433a = th;
        this.f72434b = false;
    }

    @Override // org.greenrobot.eventbus.util.e
    public Object a() {
        return this.f72435c;
    }

    @Override // org.greenrobot.eventbus.util.e
    public void b(Object obj) {
        this.f72435c = obj;
    }

    public Throwable c() {
        return this.f72433a;
    }

    public boolean d() {
        return this.f72434b;
    }

    public f(Throwable th, boolean z4) {
        this.f72433a = th;
        this.f72434b = z4;
    }
}

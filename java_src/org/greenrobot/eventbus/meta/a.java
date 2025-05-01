package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.j;
/* compiled from: AbstractSubscriberInfo.java */
/* loaded from: classes7.dex */
public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Class f72385a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<? extends c> f72386b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f72387c;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Class cls, Class<? extends c> cls2, boolean z4) {
        this.f72385a = cls;
        this.f72386b = cls2;
        this.f72387c = z4;
    }

    @Override // org.greenrobot.eventbus.meta.c
    public Class b() {
        return this.f72385a;
    }

    @Override // org.greenrobot.eventbus.meta.c
    public c c() {
        Class<? extends c> cls = this.f72386b;
        if (cls == null) {
            return null;
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // org.greenrobot.eventbus.meta.c
    public boolean d() {
        return this.f72387c;
    }

    protected j e(String str, Class<?> cls) {
        return g(str, cls, ThreadMode.POSTING, 0, false);
    }

    protected j f(String str, Class<?> cls, ThreadMode threadMode) {
        return g(str, cls, threadMode, 0, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j g(String str, Class<?> cls, ThreadMode threadMode, int i4, boolean z4) {
        try {
            return new j(this.f72385a.getDeclaredMethod(str, cls), cls, threadMode, i4, z4);
        } catch (NoSuchMethodException e5) {
            throw new EventBusException("Could not find subscriber method in " + this.f72385a + ". Maybe a missing ProGuard rule?", e5);
        }
    }
}

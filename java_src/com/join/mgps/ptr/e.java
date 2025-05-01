package com.join.mgps.ptr;
/* compiled from: PtrUIHandlerHook.java */
/* loaded from: classes4.dex */
public abstract class e implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final byte f53707d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static final byte f53708e = 1;

    /* renamed from: f  reason: collision with root package name */
    private static final byte f53709f = 2;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f53710b;

    /* renamed from: c  reason: collision with root package name */
    private byte f53711c = 0;

    public void a() {
        this.f53711c = (byte) 0;
    }

    public void b() {
        Runnable runnable = this.f53710b;
        if (runnable != null) {
            runnable.run();
        }
        this.f53711c = (byte) 2;
    }

    public void c(Runnable runnable) {
        this.f53710b = runnable;
    }

    public void d() {
        e(null);
    }

    public void e(Runnable runnable) {
        if (runnable != null) {
            this.f53710b = runnable;
        }
        byte b5 = this.f53711c;
        if (b5 == 0) {
            this.f53711c = (byte) 1;
            run();
        } else if (b5 != 2) {
        } else {
            b();
        }
    }
}

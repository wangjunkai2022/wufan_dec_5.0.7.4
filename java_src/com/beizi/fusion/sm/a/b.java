package com.beizi.fusion.sm.a;

import android.app.Application;
/* compiled from: DeviceIdentifier.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f7113a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile String f7114b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile String f7115c;

    private b() {
    }

    public static void a(Application application) {
        if (f7113a) {
            return;
        }
        synchronized (b.class) {
            if (!f7113a) {
                a.a(application);
                f7113a = true;
            }
        }
    }
}

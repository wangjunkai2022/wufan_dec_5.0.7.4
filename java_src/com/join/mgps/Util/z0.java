package com.join.mgps.Util;

import android.os.Handler;
import android.os.Looper;
/* compiled from: MainHandler.java */
/* loaded from: classes3.dex */
public class z0 extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private static volatile z0 f28158a;

    private z0() {
        super(Looper.getMainLooper());
    }

    public static z0 a() {
        if (f28158a == null) {
            synchronized (z0.class) {
                if (f28158a == null) {
                    f28158a = new z0();
                }
            }
        }
        return f28158a;
    }
}

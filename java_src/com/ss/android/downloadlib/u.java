package com.ss.android.downloadlib;
/* loaded from: classes5.dex */
public class u {
    private static volatile u vv;

    /* renamed from: m  reason: collision with root package name */
    private com.ss.android.download.api.config.u f60732m = null;

    private u() {
    }

    public static u vv() {
        if (vv == null) {
            synchronized (u.class) {
                if (vv == null) {
                    vv = new u();
                }
            }
        }
        return vv;
    }

    public com.ss.android.download.api.config.u m() {
        return this.f60732m;
    }
}

package com.xinzhu.overmind.server;

import android.os.HandlerThread;
/* compiled from: ServiceThread.java */
/* loaded from: classes.dex */
public class j extends HandlerThread {

    /* renamed from: c  reason: collision with root package name */
    private static final String f68005c = "ServiceThread";

    /* renamed from: b  reason: collision with root package name */
    private final boolean f68006b;

    public j(String str, int i4, boolean z4) {
        super(str, i4);
        this.f68006b = z4;
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
    }
}

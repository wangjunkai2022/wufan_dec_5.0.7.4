package com.join.mgps.task;

import com.join.mgps.Util.h0;
/* compiled from: FileDeletRunable.java */
/* loaded from: classes5.dex */
public class b implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    private static final String f54869c = b.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    String f54870b;

    public b(String str) {
        this.f54870b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        h0.i(this.f54870b);
    }
}

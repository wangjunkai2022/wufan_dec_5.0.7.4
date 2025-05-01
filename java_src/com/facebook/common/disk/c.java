package com.facebook.common.disk;

import javax.annotation.Nullable;
/* compiled from: NoOpDiskTrimmableRegistry.java */
/* loaded from: classes.dex */
public class c implements b {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private static c f10826a;

    private c() {
    }

    public static synchronized c c() {
        c cVar;
        synchronized (c.class) {
            if (f10826a == null) {
                f10826a = new c();
            }
            cVar = f10826a;
        }
        return cVar;
    }

    @Override // com.facebook.common.disk.b
    public void a(a aVar) {
    }

    @Override // com.facebook.common.disk.b
    public void b(a aVar) {
    }
}

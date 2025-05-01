package com.facebook.common.memory;
/* compiled from: NoOpMemoryTrimmableRegistry.java */
/* loaded from: classes2.dex */
public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private static d f10874a;

    public static synchronized d c() {
        d dVar;
        synchronized (d.class) {
            if (f10874a == null) {
                f10874a = new d();
            }
            dVar = f10874a;
        }
        return dVar;
    }

    @Override // com.facebook.common.memory.c
    public void a(b bVar) {
    }

    @Override // com.facebook.common.memory.c
    public void b(b bVar) {
    }
}

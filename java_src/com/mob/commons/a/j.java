package com.mob.commons.a;

import java.util.HashMap;
/* loaded from: classes5.dex */
public class j extends c {

    /* renamed from: c  reason: collision with root package name */
    private static com.mob.commons.k f56093c;

    public j() {
        super("p", 0L, null, 0L, 0L);
        a(0);
    }

    private static synchronized boolean m() {
        synchronized (j.class) {
            if (f56093c == null) {
                f56093c = new com.mob.commons.k() { // from class: com.mob.commons.a.j.1
                    @Override // com.mob.commons.k
                    public void a(boolean z4, boolean z5, long j4) {
                        if (z4) {
                            j jVar = new j();
                            jVar.b(false).a(Long.valueOf(System.currentTimeMillis())).a(true);
                            d.a().a(jVar, 0L, 0);
                        }
                    }
                };
                com.mob.commons.l.a().a(f56093c);
                return true;
            }
            return false;
        }
    }

    @Override // com.mob.commons.a.c
    protected void a() {
        if (g()) {
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(com.mob.commons.m.a("004gHca$hd"), "PVMT");
        hashMap.put(com.mob.commons.m.a("008Vba_bgdg,bgbd8d"), this.f56052b);
        if (!com.mob.commons.j.a().f56387a.get()) {
            hashMap.putAll(com.mob.commons.j.a().c());
            com.mob.commons.j.a().f56387a.compareAndSet(false, true);
        }
        com.mob.commons.c.a().a(System.currentTimeMillis(), hashMap);
    }

    @Override // com.mob.commons.a.c
    protected void c() {
        m();
    }
}

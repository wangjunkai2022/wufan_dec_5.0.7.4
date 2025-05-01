package com.mob.commons.a;

import com.mob.commons.ab;
import com.mob.tools.MobLog;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile long f56039c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile HashMap<Long, Long> f56040d;

    public a() {
        super(com.mob.commons.l.a("002fk"), 0L, com.mob.commons.l.a("005fkEgl:fl"), 900L, 0L);
        if (f56040d == null) {
            f56039c = System.currentTimeMillis();
            f56040d = ab.a().f();
        }
    }

    private void m() {
        try {
            HashMap<String, Object> hashMap = new HashMap<>();
            for (Map.Entry<Long, Long> entry : f56040d.entrySet()) {
                if (entry != null) {
                    hashMap.put(com.mob.commons.l.a("008if!fiGgej2hf1k"), entry.getKey());
                    hashMap.put(com.mob.commons.l.a("008!fefiflZfk]fkfmLg"), entry.getValue());
                }
            }
            a("ARSTAMT", hashMap);
            ab.a().a(ab.f56127f, System.currentTimeMillis());
            if (f56040d != null) {
                f56040d.clear();
            }
            ab.a().a((HashMap<Long, Long>) null);
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
        }
    }

    @Override // com.mob.commons.a.c
    protected void a() {
        if (f56040d == null) {
            f56040d = new HashMap<>();
        }
        for (Map.Entry<Long, Long> entry : f56040d.entrySet()) {
            if (entry != null && entry.getKey().longValue() != f56039c) {
                m();
            }
        }
        long currentTimeMillis = System.currentTimeMillis() - f56039c;
        f56040d.put(Long.valueOf(f56039c), Long.valueOf(currentTimeMillis));
        ab.a().a(f56040d);
        long b5 = ab.a().b(ab.f56127f, 0L);
        long l4 = l() * 1000;
        if (currentTimeMillis < l4 || System.currentTimeMillis() - b5 <= l4) {
            return;
        }
        m();
    }

    @Override // com.mob.commons.a.c
    protected void b() {
        long longValue = ((Long) a(d(), (String) 0L)).longValue();
        if (longValue <= 0 || longValue >= 604800) {
            return;
        }
        a(longValue);
    }
}

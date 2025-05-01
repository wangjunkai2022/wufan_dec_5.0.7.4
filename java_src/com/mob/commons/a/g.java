package com.mob.commons.a;

import com.mob.commons.ab;
import com.mob.commons.s;
import com.mob.tools.MobLog;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public class g extends c {

    /* renamed from: c  reason: collision with root package name */
    private static com.mob.commons.k f56087c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f56088d = s.a("014MehXf ecdhHdci0diddWfYdhVg[dkej");

    public g() {
        super(s.a("002Yffdi"), 0L, s.a("005<ffdiej1dj"), 30L, 0L);
    }

    private void b(long j4) {
        if (com.mob.commons.l.a().b()) {
            return;
        }
        g gVar = new g();
        gVar.a(true).b(false).a(new Long[]{3L, Long.valueOf(j4)});
        d.a().a(gVar, l(), 0);
    }

    private void m() {
        try {
            HashMap hashMap = (HashMap) ab.a().c(f56088d, null);
            if (hashMap == null || hashMap.isEmpty()) {
                return;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                long longValue = ((Long) entry.getKey()).longValue();
                long longValue2 = ((Long) entry.getValue()).longValue();
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put(s.a("005Qdg%eiYdiBg"), Long.valueOf(longValue2));
                hashMap2.put(s.a("008<djdg eiEdidf=f0fi"), Long.valueOf(longValue2 - longValue));
                a("BKIOMT", hashMap2);
            }
            ab.a().b(f56088d);
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
        }
    }

    private static synchronized boolean n() {
        synchronized (g.class) {
            if (f56087c == null) {
                f56087c = new com.mob.commons.k() { // from class: com.mob.commons.a.g.1

                    /* renamed from: a  reason: collision with root package name */
                    private volatile long f56089a = 0;

                    @Override // com.mob.commons.k
                    public void a(boolean z4, boolean z5, long j4) {
                        if (z5) {
                            this.f56089a = System.currentTimeMillis();
                            c gVar = new g();
                            gVar.a(new Long[]{0L, Long.valueOf(this.f56089a), Long.valueOf(System.currentTimeMillis())}).b(false).a(true);
                            d.a().a(gVar, 0L, 1);
                        }
                        if (!z4) {
                            if (j4 > 0) {
                                c gVar2 = new g();
                                gVar2.a(new Long[]{2L, Long.valueOf(this.f56089a), Long.valueOf(System.currentTimeMillis())}).b(false).a(true);
                                d.a().a(gVar2, 0L, 1);
                            }
                        } else if (z5) {
                        } else {
                            this.f56089a = System.currentTimeMillis();
                            c gVar3 = new g();
                            gVar3.a(new Long[]{1L, Long.valueOf(this.f56089a), Long.valueOf(System.currentTimeMillis())}).b(false).a(true);
                            d.a().a(gVar3, 0L, 0);
                        }
                    }
                };
                com.mob.commons.l.a().a(f56087c);
                return true;
            }
            return false;
        }
    }

    @Override // com.mob.commons.a.c
    protected void a() {
        long longValue;
        if (g()) {
            return;
        }
        Long[] lArr = (Long[]) this.f56052b;
        long longValue2 = lArr[0].longValue();
        long longValue3 = lArr[1].longValue();
        if (longValue2 == 3 && lArr.length < 3) {
            longValue = System.currentTimeMillis();
        } else {
            longValue = lArr[2].longValue();
        }
        if (longValue2 == 0) {
            m();
            a(longValue3, longValue);
            b(longValue3);
        } else if (longValue2 == 1 || longValue2 == 3) {
            a(longValue3, longValue);
            b(longValue3);
        } else if (longValue2 == 2) {
            a(longValue3, longValue);
            m();
        }
    }

    @Override // com.mob.commons.a.c
    protected void c() {
        n();
    }

    private void a(long j4, long j5) {
        try {
            ab a5 = ab.a();
            String str = f56088d;
            HashMap hashMap = (HashMap) a5.c(str, null);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(Long.valueOf(j4), Long.valueOf(j5));
            ab.a().b(str, hashMap);
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
        }
    }
}

package com.mob.commons.a;

import com.mob.commons.s;
import com.mob.commons.y;
import com.mob.commons.z;
import com.mob.tools.utils.ResHelper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f56074a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f56075b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    private final CopyOnWriteArrayList<c> f56076c = new CopyOnWriteArrayList<>();

    private d() {
    }

    public static d a() {
        if (f56074a == null) {
            synchronized (y.class) {
                if (f56074a == null) {
                    f56074a = new d();
                }
            }
        }
        return f56074a;
    }

    private long c() {
        return ((Integer) ResHelper.forceCast(com.mob.commons.b.a(s.a("0034djWji"), 300), 300)).intValue() * 1000;
    }

    public void b() {
        if (this.f56075b.compareAndSet(false, true)) {
            a(new a(), 0);
            a(new b(), 0);
            a(new e(), 0);
            a(new f(), 0);
            a(new k(), 0);
            g gVar = new g();
            gVar.a(true);
            a(gVar, 0);
            a(new h(), 0);
            a(new j(), 0);
            a(new i(), 0);
            a(new m(), 0);
            a(new n(), 0);
            a(new o(), 0);
            z.f56519c.execute(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f56076c.size() > 0) {
            if (com.mob.commons.b.d() && com.mob.commons.d.j()) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator<c> it2 = this.f56076c.iterator();
                    while (it2.hasNext()) {
                        c next = it2.next();
                        if (currentTimeMillis >= next.j()) {
                            next.h();
                        }
                    }
                } catch (Throwable unused) {
                }
                l.a().d(c(), this);
                return;
            }
            l.a().d(60000L, this);
            return;
        }
        l.a().d(c(), this);
    }

    public <T extends c> void a(T t4, int i4) {
        if (i4 != 1) {
            if (i4 != 3) {
                this.f56076c.add(t4);
                return;
            } else {
                this.f56076c.add(0, t4);
                return;
            }
        }
        Iterator<c> it2 = this.f56076c.iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            if (t4.k() == next.k()) {
                this.f56076c.set(this.f56076c.indexOf(next), t4);
            } else {
                this.f56076c.add(t4);
            }
        }
    }

    public void a(c cVar, long j4, int i4) {
        if (j4 == 0 && (i4 == 0 || i4 == 3)) {
            cVar.h();
        } else {
            l.a().a(j4, (long) cVar, i4);
        }
    }
}

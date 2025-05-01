package org.jboss.netty.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jboss.netty.util.internal.ConcurrentIdentityHashMap;
/* compiled from: HashedWheelTimer.java */
/* loaded from: classes7.dex */
public class c implements g {

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicInteger f72713k = new AtomicInteger();

    /* renamed from: l  reason: collision with root package name */
    private static final org.jboss.netty.util.internal.g f72714l = new org.jboss.netty.util.internal.g();

    /* renamed from: a  reason: collision with root package name */
    private final b f72715a;

    /* renamed from: b  reason: collision with root package name */
    final Thread f72716b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicInteger f72717c;

    /* renamed from: d  reason: collision with root package name */
    private final long f72718d;

    /* renamed from: e  reason: collision with root package name */
    final long f72719e;

    /* renamed from: f  reason: collision with root package name */
    final Set<a>[] f72720f;

    /* renamed from: g  reason: collision with root package name */
    final org.jboss.netty.util.internal.f<a>[] f72721g;

    /* renamed from: h  reason: collision with root package name */
    final int f72722h;

    /* renamed from: i  reason: collision with root package name */
    final ReadWriteLock f72723i;

    /* renamed from: j  reason: collision with root package name */
    volatile int f72724j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HashedWheelTimer.java */
    /* loaded from: classes7.dex */
    public final class a implements f {

        /* renamed from: g  reason: collision with root package name */
        private static final int f72725g = 0;

        /* renamed from: h  reason: collision with root package name */
        private static final int f72726h = 1;

        /* renamed from: i  reason: collision with root package name */
        private static final int f72727i = 2;

        /* renamed from: a  reason: collision with root package name */
        private final h f72728a;

        /* renamed from: b  reason: collision with root package name */
        final long f72729b;

        /* renamed from: c  reason: collision with root package name */
        volatile int f72730c;

        /* renamed from: d  reason: collision with root package name */
        volatile long f72731d;

        /* renamed from: e  reason: collision with root package name */
        private final AtomicInteger f72732e = new AtomicInteger(0);

        a(h hVar, long j4) {
            this.f72728a = hVar;
            this.f72729b = j4;
        }

        @Override // org.jboss.netty.util.f
        public h a() {
            return this.f72728a;
        }

        @Override // org.jboss.netty.util.f
        public g b() {
            return c.this;
        }

        public void c() {
            if (this.f72732e.compareAndSet(0, 2)) {
                try {
                    this.f72728a.a(this);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        @Override // org.jboss.netty.util.f
        public void cancel() {
            if (this.f72732e.compareAndSet(0, 1)) {
                c.this.f72720f[this.f72730c].remove(this);
            }
        }

        @Override // org.jboss.netty.util.f
        public boolean isCancelled() {
            return this.f72732e.get() == 1;
        }

        @Override // org.jboss.netty.util.f
        public boolean isExpired() {
            return this.f72732e.get() != 0;
        }

        public String toString() {
            long currentTimeMillis = this.f72729b - System.currentTimeMillis();
            StringBuilder sb = new StringBuilder(192);
            sb.append(a.class.getSimpleName());
            sb.append('(');
            sb.append("deadline: ");
            if (currentTimeMillis > 0) {
                sb.append(currentTimeMillis);
                sb.append(" ms later, ");
            } else if (currentTimeMillis < 0) {
                sb.append(-currentTimeMillis);
                sb.append(" ms ago, ");
            } else {
                sb.append("now, ");
            }
            if (isCancelled()) {
                sb.append(", cancelled");
            }
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: HashedWheelTimer.java */
    /* loaded from: classes7.dex */
    private final class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private long f72734b;

        /* renamed from: c  reason: collision with root package name */
        private long f72735c;

        b() {
        }

        private void a(List<a> list, long j4) {
            c.this.f72723i.writeLock().lock();
            try {
                c cVar = c.this;
                int i4 = (cVar.f72724j + 1) & c.this.f72722h;
                cVar.f72724j = i4;
                b(list, c.this.f72721g[i4], j4);
            } finally {
                c.this.f72723i.writeLock().unlock();
            }
        }

        private void b(List<a> list, org.jboss.netty.util.internal.f<a> fVar, long j4) {
            fVar.rewind();
            ArrayList<a> arrayList = null;
            while (fVar.hasNext()) {
                a next = fVar.next();
                if (next.f72731d <= 0) {
                    fVar.remove();
                    if (next.f72729b <= j4) {
                        list.add(next);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(next);
                    }
                } else {
                    next.f72731d--;
                }
            }
            if (arrayList != null) {
                for (a aVar : arrayList) {
                    c.this.e(aVar, aVar.f72729b - j4);
                }
            }
        }

        private void c(List<a> list) {
            for (int size = list.size() - 1; size >= 0; size--) {
                list.get(size).c();
            }
            list.clear();
        }

        private long d() {
            long j4 = this.f72734b + (c.this.f72719e * this.f72735c);
            while (true) {
                long currentTimeMillis = (c.this.f72719e * this.f72735c) - (System.currentTimeMillis() - this.f72734b);
                if (org.jboss.netty.util.internal.d.d()) {
                    currentTimeMillis = (currentTimeMillis / 10) * 10;
                }
                if (currentTimeMillis <= 0) {
                    this.f72735c++;
                    return j4;
                }
                try {
                    Thread.sleep(currentTimeMillis);
                } catch (InterruptedException unused) {
                    if (c.this.f72717c.get() != 1) {
                        return -1L;
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList();
            this.f72734b = System.currentTimeMillis();
            this.f72735c = 1L;
            while (c.this.f72717c.get() == 1) {
                long d5 = d();
                if (d5 > 0) {
                    a(arrayList, d5);
                    c(arrayList);
                }
            }
        }
    }

    public c() {
        this(Executors.defaultThreadFactory());
    }

    private static org.jboss.netty.util.internal.f<a>[] b(Set<a>[] setArr) {
        org.jboss.netty.util.internal.f<a>[] fVarArr = new org.jboss.netty.util.internal.f[setArr.length];
        for (int i4 = 0; i4 < setArr.length; i4++) {
            fVarArr[i4] = (org.jboss.netty.util.internal.f) setArr[i4].iterator();
        }
        return fVarArr;
    }

    private static Set<a>[] c(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("ticksPerWheel must be greater than 0: " + i4);
        } else if (i4 <= 1073741824) {
            int d5 = d(i4);
            Set<a>[] setArr = new Set[d5];
            for (int i5 = 0; i5 < d5; i5++) {
                setArr[i5] = new MapBackedSet(new ConcurrentIdentityHashMap(16, 0.95f, 4));
            }
            return setArr;
        } else {
            throw new IllegalArgumentException("ticksPerWheel may not be greater than 2^30: " + i4);
        }
    }

    private static int d(int i4) {
        int i5 = 1;
        while (i5 < i4) {
            i5 <<= 1;
        }
        return i5;
    }

    @Override // org.jboss.netty.util.g
    public f a(h hVar, long j4, TimeUnit timeUnit) {
        long currentTimeMillis = System.currentTimeMillis();
        Objects.requireNonNull(hVar, "task");
        Objects.requireNonNull(timeUnit, "unit");
        f();
        long millis = timeUnit.toMillis(j4);
        a aVar = new a(hVar, currentTimeMillis + millis);
        e(aVar, millis);
        return aVar;
    }

    void e(a aVar, long j4) {
        long j5 = this.f72719e;
        if (j4 < j5) {
            j4 = j5;
        }
        long j6 = this.f72718d;
        long j7 = ((j4 % j6) / j5) + (j4 % j5 != 0 ? 1 : 0);
        long j8 = (j4 / j6) - (j4 % j6 != 0 ? 0 : 1);
        this.f72723i.readLock().lock();
        try {
            int i4 = (int) ((this.f72724j + j7) & this.f72722h);
            aVar.f72730c = i4;
            aVar.f72731d = j8;
            this.f72720f[i4].add(aVar);
        } finally {
            this.f72723i.readLock().unlock();
        }
    }

    public void f() {
        int i4 = this.f72717c.get();
        if (i4 == 0) {
            if (this.f72717c.compareAndSet(0, 1)) {
                this.f72716b.start();
            }
        } else if (i4 != 1) {
            if (i4 != 2) {
                throw new Error();
            }
            throw new IllegalStateException("cannot be started once stopped");
        }
    }

    @Override // org.jboss.netty.util.g
    public Set<f> stop() {
        Set<a>[] setArr;
        if (Thread.currentThread() != this.f72716b) {
            if (this.f72717c.getAndSet(2) != 1) {
                return Collections.emptySet();
            }
            boolean z4 = false;
            while (this.f72716b.isAlive()) {
                this.f72716b.interrupt();
                try {
                    this.f72716b.join(100L);
                } catch (InterruptedException unused) {
                    z4 = true;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
            f72714l.a();
            HashSet hashSet = new HashSet();
            for (Set<a> set : this.f72720f) {
                hashSet.addAll(set);
                set.clear();
            }
            return Collections.unmodifiableSet(hashSet);
        }
        throw new IllegalStateException(c.class.getSimpleName() + ".stop() cannot be called from " + h.class.getSimpleName());
    }

    public c(long j4, TimeUnit timeUnit) {
        this(Executors.defaultThreadFactory(), j4, timeUnit);
    }

    public c(long j4, TimeUnit timeUnit, int i4) {
        this(Executors.defaultThreadFactory(), j4, timeUnit, i4);
    }

    public c(ThreadFactory threadFactory) {
        this(threadFactory, 100L, TimeUnit.MILLISECONDS);
    }

    public c(ThreadFactory threadFactory, long j4, TimeUnit timeUnit) {
        this(threadFactory, j4, timeUnit, 512);
    }

    public c(ThreadFactory threadFactory, long j4, TimeUnit timeUnit, int i4) {
        b bVar = new b();
        this.f72715a = bVar;
        this.f72717c = new AtomicInteger();
        this.f72723i = new ReentrantReadWriteLock();
        Objects.requireNonNull(threadFactory, "threadFactory");
        Objects.requireNonNull(timeUnit, "unit");
        if (j4 <= 0) {
            throw new IllegalArgumentException("tickDuration must be greater than 0: " + j4);
        } else if (i4 > 0) {
            Set<a>[] c5 = c(i4);
            this.f72720f = c5;
            this.f72721g = b(c5);
            this.f72722h = c5.length - 1;
            long millis = timeUnit.toMillis(j4);
            this.f72719e = millis;
            if (millis != Long.MAX_VALUE && millis < Long.MAX_VALUE / c5.length) {
                this.f72718d = millis * c5.length;
                this.f72716b = threadFactory.newThread(new e(bVar, "Hashed wheel timer #" + f72713k.incrementAndGet()));
                f72714l.b();
                return;
            }
            throw new IllegalArgumentException("tickDuration is too long: " + millis + ' ' + timeUnit);
        } else {
            throw new IllegalArgumentException("ticksPerWheel must be greater than 0: " + i4);
        }
    }
}

package com.facebook.cache.disk;

import android.content.Context;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.disk.c;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.statfs.StatFsHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: DiskStorageCache.java */
@ThreadSafe
/* loaded from: classes.dex */
public class d implements h, com.facebook.common.disk.a {

    /* renamed from: s  reason: collision with root package name */
    public static final int f10769s = 1;

    /* renamed from: v  reason: collision with root package name */
    private static final double f10772v = 0.02d;

    /* renamed from: w  reason: collision with root package name */
    private static final long f10773w = -1;

    /* renamed from: x  reason: collision with root package name */
    private static final String f10774x = "disk_entries_list";

    /* renamed from: a  reason: collision with root package name */
    private final long f10775a;

    /* renamed from: b  reason: collision with root package name */
    private final long f10776b;

    /* renamed from: c  reason: collision with root package name */
    private final CountDownLatch f10777c;

    /* renamed from: d  reason: collision with root package name */
    private long f10778d;

    /* renamed from: e  reason: collision with root package name */
    private final CacheEventListener f10779e;
    @VisibleForTesting
    @GuardedBy("mLock")

    /* renamed from: f  reason: collision with root package name */
    final Set<String> f10780f;

    /* renamed from: g  reason: collision with root package name */
    private long f10781g;

    /* renamed from: h  reason: collision with root package name */
    private final long f10782h;

    /* renamed from: i  reason: collision with root package name */
    private final StatFsHelper f10783i;

    /* renamed from: j  reason: collision with root package name */
    private final com.facebook.cache.disk.c f10784j;

    /* renamed from: k  reason: collision with root package name */
    private final g f10785k;

    /* renamed from: l  reason: collision with root package name */
    private final CacheErrorLogger f10786l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f10787m;

    /* renamed from: n  reason: collision with root package name */
    private final b f10788n;

    /* renamed from: o  reason: collision with root package name */
    private final com.facebook.common.time.a f10789o;

    /* renamed from: p  reason: collision with root package name */
    private final Object f10790p = new Object();

    /* renamed from: q  reason: collision with root package name */
    private boolean f10791q;

    /* renamed from: r  reason: collision with root package name */
    private static final Class<?> f10768r = d.class;

    /* renamed from: t  reason: collision with root package name */
    private static final long f10770t = TimeUnit.HOURS.toMillis(2);

    /* renamed from: u  reason: collision with root package name */
    private static final long f10771u = TimeUnit.MINUTES.toMillis(30);

    /* compiled from: DiskStorageCache.java */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this.f10790p) {
                d.this.t();
            }
            d.this.f10791q = true;
            d.this.f10777c.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskStorageCache.java */
    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10793a = false;

        /* renamed from: b  reason: collision with root package name */
        private long f10794b = -1;

        /* renamed from: c  reason: collision with root package name */
        private long f10795c = -1;

        b() {
        }

        public synchronized long a() {
            return this.f10795c;
        }

        public synchronized long b() {
            return this.f10794b;
        }

        public synchronized void c(long j4, long j5) {
            if (this.f10793a) {
                this.f10794b += j4;
                this.f10795c += j5;
            }
        }

        public synchronized boolean d() {
            return this.f10793a;
        }

        public synchronized void e() {
            this.f10793a = false;
            this.f10795c = -1L;
            this.f10794b = -1L;
        }

        public synchronized void f(long j4, long j5) {
            this.f10795c = j5;
            this.f10794b = j4;
            this.f10793a = true;
        }
    }

    /* compiled from: DiskStorageCache.java */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f10796a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10797b;

        /* renamed from: c  reason: collision with root package name */
        public final long f10798c;

        public c(long j4, long j5, long j6) {
            this.f10796a = j4;
            this.f10797b = j5;
            this.f10798c = j6;
        }
    }

    public d(com.facebook.cache.disk.c cVar, g gVar, c cVar2, CacheEventListener cacheEventListener, CacheErrorLogger cacheErrorLogger, @Nullable com.facebook.common.disk.b bVar, Context context, Executor executor, boolean z4) {
        this.f10775a = cVar2.f10797b;
        long j4 = cVar2.f10798c;
        this.f10776b = j4;
        this.f10778d = j4;
        this.f10783i = StatFsHelper.e();
        this.f10784j = cVar;
        this.f10785k = gVar;
        this.f10781g = -1L;
        this.f10779e = cacheEventListener;
        this.f10782h = cVar2.f10796a;
        this.f10786l = cacheErrorLogger;
        this.f10788n = new b();
        this.f10789o = com.facebook.common.time.d.a();
        this.f10787m = z4;
        this.f10780f = new HashSet();
        if (bVar != null) {
            bVar.b(this);
        }
        if (z4) {
            this.f10777c = new CountDownLatch(1);
            executor.execute(new a());
            return;
        }
        this.f10777c = new CountDownLatch(0);
    }

    private e0.a o(c.d dVar, com.facebook.cache.common.c cVar, String str) throws IOException {
        e0.a c5;
        synchronized (this.f10790p) {
            c5 = dVar.c(cVar);
            this.f10780f.add(str);
            this.f10788n.c(c5.size(), 1L);
        }
        return c5;
    }

    @GuardedBy("mLock")
    private void p(long j4, CacheEventListener.EvictionReason evictionReason) throws IOException {
        try {
            Collection<c.InterfaceC0251c> q4 = q(this.f10784j.getEntries());
            long b5 = this.f10788n.b();
            long j5 = b5 - j4;
            int i4 = 0;
            long j6 = 0;
            for (c.InterfaceC0251c interfaceC0251c : q4) {
                if (j6 > j5) {
                    break;
                }
                long d5 = this.f10784j.d(interfaceC0251c);
                this.f10780f.remove(interfaceC0251c.getId());
                if (d5 > 0) {
                    i4++;
                    j6 += d5;
                    j l4 = j.h().q(interfaceC0251c.getId()).n(evictionReason).p(d5).m(b5 - j6).l(j4);
                    this.f10779e.e(l4);
                    l4.i();
                }
            }
            this.f10788n.c(-j6, -i4);
            this.f10784j.b();
        } catch (IOException e5) {
            CacheErrorLogger cacheErrorLogger = this.f10786l;
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.EVICTION;
            Class<?> cls = f10768r;
            cacheErrorLogger.a(cacheErrorCategory, cls, "evictAboveSize: " + e5.getMessage(), e5);
            throw e5;
        }
    }

    private Collection<c.InterfaceC0251c> q(Collection<c.InterfaceC0251c> collection) {
        long now = this.f10789o.now() + f10770t;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (c.InterfaceC0251c interfaceC0251c : collection) {
            if (interfaceC0251c.getTimestamp() > now) {
                arrayList.add(interfaceC0251c);
            } else {
                arrayList2.add(interfaceC0251c);
            }
        }
        Collections.sort(arrayList2, this.f10785k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void s() throws IOException {
        synchronized (this.f10790p) {
            boolean t4 = t();
            x();
            long b5 = this.f10788n.b();
            if (b5 > this.f10778d && !t4) {
                this.f10788n.e();
                t();
            }
            long j4 = this.f10778d;
            if (b5 > j4) {
                p((j4 * 9) / 10, CacheEventListener.EvictionReason.CACHE_FULL);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public boolean t() {
        long now = this.f10789o.now();
        if (this.f10788n.d()) {
            long j4 = this.f10781g;
            if (j4 != -1 && now - j4 <= f10771u) {
                return false;
            }
        }
        return u();
    }

    @GuardedBy("mLock")
    private boolean u() {
        Set<String> hashSet;
        Set<String> set;
        long j4;
        long now = this.f10789o.now();
        long j5 = f10770t + now;
        if (this.f10787m && this.f10780f.isEmpty()) {
            hashSet = this.f10780f;
        } else {
            hashSet = this.f10787m ? new HashSet<>() : null;
        }
        try {
            long j6 = 0;
            long j7 = -1;
            int i4 = 0;
            boolean z4 = false;
            int i5 = 0;
            int i6 = 0;
            for (c.InterfaceC0251c interfaceC0251c : this.f10784j.getEntries()) {
                i5++;
                j6 += interfaceC0251c.getSize();
                if (interfaceC0251c.getTimestamp() > j5) {
                    i6++;
                    i4 = (int) (i4 + interfaceC0251c.getSize());
                    j4 = j5;
                    j7 = Math.max(interfaceC0251c.getTimestamp() - now, j7);
                    z4 = true;
                } else {
                    j4 = j5;
                    if (this.f10787m) {
                        hashSet.add(interfaceC0251c.getId());
                    }
                }
                j5 = j4;
            }
            if (z4) {
                this.f10786l.a(CacheErrorLogger.CacheErrorCategory.READ_INVALID_ENTRY, f10768r, "Future timestamp found in " + i6 + " files , with a total size of " + i4 + " bytes, and a maximum time delta of " + j7 + "ms", null);
            }
            long j8 = i5;
            if (this.f10788n.a() != j8 || this.f10788n.b() != j6) {
                if (this.f10787m && (set = this.f10780f) != hashSet) {
                    set.clear();
                    this.f10780f.addAll(hashSet);
                }
                this.f10788n.f(j6, j8);
            }
            this.f10781g = now;
            return true;
        } catch (IOException e5) {
            this.f10786l.a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, f10768r, "calcFileCacheSize: " + e5.getMessage(), e5);
            return false;
        }
    }

    private c.d v(String str, com.facebook.cache.common.c cVar) throws IOException {
        s();
        return this.f10784j.insert(str, cVar);
    }

    private void w(double d5) {
        synchronized (this.f10790p) {
            try {
                this.f10788n.e();
                t();
                long b5 = this.f10788n.b();
                double d6 = b5;
                Double.isNaN(d6);
                p(b5 - ((long) (d5 * d6)), CacheEventListener.EvictionReason.CACHE_MANAGER_TRIMMED);
            } catch (IOException e5) {
                this.f10786l.a(CacheErrorLogger.CacheErrorCategory.EVICTION, f10768r, "trimBy: " + e5.getMessage(), e5);
            }
        }
    }

    @GuardedBy("mLock")
    private void x() {
        if (this.f10783i.i(this.f10784j.isExternal() ? StatFsHelper.StorageType.EXTERNAL : StatFsHelper.StorageType.INTERNAL, this.f10776b - this.f10788n.b())) {
            this.f10778d = this.f10775a;
        } else {
            this.f10778d = this.f10776b;
        }
    }

    @Override // com.facebook.cache.disk.h
    public c.a a() throws IOException {
        return this.f10784j.a();
    }

    @Override // com.facebook.cache.disk.h
    public boolean b(com.facebook.cache.common.c cVar) {
        String str;
        IOException e5;
        String str2 = null;
        try {
            try {
                synchronized (this.f10790p) {
                    try {
                        List<String> b5 = com.facebook.cache.common.d.b(cVar);
                        int i4 = 0;
                        while (i4 < b5.size()) {
                            String str3 = b5.get(i4);
                            if (this.f10784j.c(str3, cVar)) {
                                this.f10780f.add(str3);
                                return true;
                            }
                            i4++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th) {
                        str = str2;
                        th = th;
                        try {
                            throw th;
                        } catch (IOException e6) {
                            e5 = e6;
                            j o4 = j.h().k(cVar).q(str).o(e5);
                            this.f10779e.c(o4);
                            o4.i();
                            return false;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e7) {
            str = null;
            e5 = e7;
        }
    }

    @Override // com.facebook.cache.disk.h
    @Nullable
    public e0.a c(com.facebook.cache.common.c cVar) {
        e0.a aVar;
        j k4 = j.h().k(cVar);
        try {
            synchronized (this.f10790p) {
                List<String> b5 = com.facebook.cache.common.d.b(cVar);
                String str = null;
                aVar = null;
                for (int i4 = 0; i4 < b5.size(); i4++) {
                    str = b5.get(i4);
                    k4.q(str);
                    aVar = this.f10784j.f(str, cVar);
                    if (aVar != null) {
                        break;
                    }
                }
                if (aVar == null) {
                    this.f10779e.a(k4);
                    this.f10780f.remove(str);
                } else {
                    this.f10779e.h(k4);
                    this.f10780f.add(str);
                }
            }
            return aVar;
        } catch (IOException e5) {
            this.f10786l.a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, f10768r, "getResource", e5);
            k4.o(e5);
            this.f10779e.c(k4);
            return null;
        } finally {
            k4.i();
        }
    }

    @Override // com.facebook.cache.disk.h
    public void clearAll() {
        synchronized (this.f10790p) {
            try {
                this.f10784j.clearAll();
                this.f10780f.clear();
                this.f10779e.f();
            } catch (IOException | NullPointerException e5) {
                CacheErrorLogger cacheErrorLogger = this.f10786l;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.EVICTION;
                Class<?> cls = f10768r;
                cacheErrorLogger.a(cacheErrorCategory, cls, "clearAll: " + e5.getMessage(), e5);
            }
            this.f10788n.e();
        }
    }

    @Override // com.facebook.common.disk.a
    public void d() {
        clearAll();
    }

    @Override // com.facebook.cache.disk.h
    public long e(long j4) {
        long j5;
        long j6;
        synchronized (this.f10790p) {
            try {
                long now = this.f10789o.now();
                Collection<c.InterfaceC0251c> entries = this.f10784j.getEntries();
                long b5 = this.f10788n.b();
                int i4 = 0;
                long j7 = 0;
                j6 = 0;
                for (c.InterfaceC0251c interfaceC0251c : entries) {
                    try {
                        long j8 = now;
                        long max = Math.max(1L, Math.abs(now - interfaceC0251c.getTimestamp()));
                        if (max >= j4) {
                            long d5 = this.f10784j.d(interfaceC0251c);
                            this.f10780f.remove(interfaceC0251c.getId());
                            if (d5 > 0) {
                                i4++;
                                j7 += d5;
                                j m4 = j.h().q(interfaceC0251c.getId()).n(CacheEventListener.EvictionReason.CONTENT_STALE).p(d5).m(b5 - j7);
                                this.f10779e.e(m4);
                                m4.i();
                            }
                        } else {
                            j6 = Math.max(j6, max);
                        }
                        now = j8;
                    } catch (IOException e5) {
                        e = e5;
                        j5 = j6;
                        this.f10786l.a(CacheErrorLogger.CacheErrorCategory.EVICTION, f10768r, "clearOldEntries: " + e.getMessage(), e);
                        j6 = j5;
                        return j6;
                    }
                }
                this.f10784j.b();
                if (i4 > 0) {
                    t();
                    this.f10788n.c(-j7, -i4);
                }
            } catch (IOException e6) {
                e = e6;
                j5 = 0;
            }
        }
        return j6;
    }

    @Override // com.facebook.cache.disk.h
    public boolean f(com.facebook.cache.common.c cVar) {
        synchronized (this.f10790p) {
            List<String> b5 = com.facebook.cache.common.d.b(cVar);
            for (int i4 = 0; i4 < b5.size(); i4++) {
                if (this.f10780f.contains(b5.get(i4))) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.facebook.common.disk.a
    public void g() {
        synchronized (this.f10790p) {
            t();
            long b5 = this.f10788n.b();
            long j4 = this.f10782h;
            if (j4 <= 0 || b5 <= 0 || b5 < j4) {
                return;
            }
            double d5 = j4;
            double d6 = b5;
            Double.isNaN(d5);
            Double.isNaN(d6);
            double d7 = 1.0d - (d5 / d6);
            if (d7 > f10772v) {
                w(d7);
            }
        }
    }

    @Override // com.facebook.cache.disk.h
    public long getCount() {
        return this.f10788n.a();
    }

    @Override // com.facebook.cache.disk.h
    public long getSize() {
        return this.f10788n.b();
    }

    @Override // com.facebook.cache.disk.h
    public void h(com.facebook.cache.common.c cVar) {
        synchronized (this.f10790p) {
            try {
                List<String> b5 = com.facebook.cache.common.d.b(cVar);
                for (int i4 = 0; i4 < b5.size(); i4++) {
                    String str = b5.get(i4);
                    this.f10784j.remove(str);
                    this.f10780f.remove(str);
                }
            } catch (IOException e5) {
                CacheErrorLogger cacheErrorLogger = this.f10786l;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.DELETE_FILE;
                Class<?> cls = f10768r;
                cacheErrorLogger.a(cacheErrorCategory, cls, "delete: " + e5.getMessage(), e5);
            }
        }
    }

    @Override // com.facebook.cache.disk.h
    public boolean i(com.facebook.cache.common.c cVar) {
        synchronized (this.f10790p) {
            if (f(cVar)) {
                return true;
            }
            try {
                List<String> b5 = com.facebook.cache.common.d.b(cVar);
                for (int i4 = 0; i4 < b5.size(); i4++) {
                    String str = b5.get(i4);
                    if (this.f10784j.e(str, cVar)) {
                        this.f10780f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // com.facebook.cache.disk.h
    public e0.a insert(com.facebook.cache.common.c cVar, com.facebook.cache.common.j jVar) throws IOException {
        String a5;
        j k4 = j.h().k(cVar);
        this.f10779e.d(k4);
        synchronized (this.f10790p) {
            a5 = com.facebook.cache.common.d.a(cVar);
        }
        k4.q(a5);
        try {
            try {
                c.d v2 = v(a5, cVar);
                try {
                    v2.b(jVar, cVar);
                    e0.a o4 = o(v2, cVar, a5);
                    k4.p(o4.size()).m(this.f10788n.b());
                    this.f10779e.b(k4);
                    return o4;
                } finally {
                    if (!v2.a()) {
                        com.facebook.common.logging.a.q(f10768r, "Failed to delete temp file");
                    }
                }
            } finally {
                k4.i();
            }
        } catch (IOException e5) {
            k4.o(e5);
            this.f10779e.g(k4);
            com.facebook.common.logging.a.r(f10768r, "Failed inserting a file into the cache", e5);
            throw e5;
        }
    }

    @Override // com.facebook.cache.disk.h
    public boolean isEnabled() {
        return this.f10784j.isEnabled();
    }

    @VisibleForTesting
    protected void n() {
        try {
            this.f10777c.await();
        } catch (InterruptedException unused) {
            com.facebook.common.logging.a.q(f10768r, "Memory Index is not ready yet. ");
        }
    }

    public boolean r() {
        return this.f10791q || !this.f10787m;
    }
}

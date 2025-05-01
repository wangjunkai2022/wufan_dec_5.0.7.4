package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;
/* compiled from: BufferedDiskCache.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: h  reason: collision with root package name */
    private static final Class<?> f11628h = e.class;

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.cache.disk.h f11629a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.memory.g f11630b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.common.memory.j f11631c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f11632d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f11633e;

    /* renamed from: f  reason: collision with root package name */
    private final u f11634f = u.d();

    /* renamed from: g  reason: collision with root package name */
    private final n f11635g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BufferedDiskCache.java */
    /* loaded from: classes2.dex */
    public class a implements Callable<Boolean> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.facebook.cache.common.c f11636b;

        a(com.facebook.cache.common.c cVar) {
            this.f11636b = cVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
            return Boolean.valueOf(e.this.i(this.f11636b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BufferedDiskCache.java */
    /* loaded from: classes.dex */
    public class b implements Callable<com.facebook.imagepipeline.image.e> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f11638b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.facebook.cache.common.c f11639c;

        b(AtomicBoolean atomicBoolean, com.facebook.cache.common.c cVar) {
            this.f11638b = atomicBoolean;
            this.f11639c = cVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        @Nullable
        public com.facebook.imagepipeline.image.e call() throws Exception {
            try {
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.a("BufferedDiskCache#getAsync");
                }
                if (!this.f11638b.get()) {
                    com.facebook.imagepipeline.image.e c5 = e.this.f11634f.c(this.f11639c);
                    if (c5 != null) {
                        com.facebook.common.logging.a.V(e.f11628h, "Found image for %s in staging area", this.f11639c.a());
                        e.this.f11635g.f(this.f11639c);
                    } else {
                        com.facebook.common.logging.a.V(e.f11628h, "Did not find image for %s in staging area", this.f11639c.a());
                        e.this.f11635g.l();
                        try {
                            com.facebook.common.references.a u4 = com.facebook.common.references.a.u(e.this.s(this.f11639c));
                            try {
                                c5 = new com.facebook.imagepipeline.image.e(u4);
                            } finally {
                                com.facebook.common.references.a.h(u4);
                            }
                        } catch (Exception unused) {
                            if (com.facebook.imagepipeline.systrace.b.e()) {
                                com.facebook.imagepipeline.systrace.b.c();
                            }
                            return null;
                        }
                    }
                    if (Thread.interrupted()) {
                        com.facebook.common.logging.a.U(e.f11628h, "Host thread was interrupted, decreasing reference count");
                        c5.close();
                        throw new InterruptedException();
                    }
                    return c5;
                }
                throw new CancellationException();
            } finally {
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
            }
        }
    }

    /* compiled from: BufferedDiskCache.java */
    /* loaded from: classes2.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.facebook.cache.common.c f11641b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.image.e f11642c;

        c(com.facebook.cache.common.c cVar, com.facebook.imagepipeline.image.e eVar) {
            this.f11641b = cVar;
            this.f11642c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.a("BufferedDiskCache#putAsync");
                }
                e.this.u(this.f11641b, this.f11642c);
            } finally {
                e.this.f11634f.h(this.f11641b, this.f11642c);
                com.facebook.imagepipeline.image.e.d(this.f11642c);
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BufferedDiskCache.java */
    /* loaded from: classes2.dex */
    public class d implements Callable<Void> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.facebook.cache.common.c f11644b;

        d(com.facebook.cache.common.c cVar) {
            this.f11644b = cVar;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            try {
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.a("BufferedDiskCache#remove");
                }
                e.this.f11634f.g(this.f11644b);
                e.this.f11629a.h(this.f11644b);
            } finally {
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BufferedDiskCache.java */
    /* renamed from: com.facebook.imagepipeline.cache.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class CallableC0268e implements Callable<Void> {
        CallableC0268e() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            e.this.f11634f.a();
            e.this.f11629a.clearAll();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BufferedDiskCache.java */
    /* loaded from: classes2.dex */
    public class f implements com.facebook.cache.common.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.image.e f11647a;

        f(com.facebook.imagepipeline.image.e eVar) {
            this.f11647a = eVar;
        }

        @Override // com.facebook.cache.common.j
        public void a(OutputStream outputStream) throws IOException {
            e.this.f11631c.a(this.f11647a.u(), outputStream);
        }
    }

    public e(com.facebook.cache.disk.h hVar, com.facebook.common.memory.g gVar, com.facebook.common.memory.j jVar, Executor executor, Executor executor2, n nVar) {
        this.f11629a = hVar;
        this.f11630b = gVar;
        this.f11631c = jVar;
        this.f11632d = executor;
        this.f11633e = executor2;
        this.f11635g = nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(com.facebook.cache.common.c cVar) {
        com.facebook.imagepipeline.image.e c5 = this.f11634f.c(cVar);
        if (c5 != null) {
            c5.close();
            com.facebook.common.logging.a.V(f11628h, "Found image for %s in staging area", cVar.a());
            this.f11635g.f(cVar);
            return true;
        }
        com.facebook.common.logging.a.V(f11628h, "Did not find image for %s in staging area", cVar.a());
        this.f11635g.l();
        try {
            return this.f11629a.i(cVar);
        } catch (Exception unused) {
            return false;
        }
    }

    private bolts.h<Boolean> l(com.facebook.cache.common.c cVar) {
        try {
            return bolts.h.call(new a(cVar), this.f11632d);
        } catch (Exception e5) {
            com.facebook.common.logging.a.n0(f11628h, e5, "Failed to schedule disk-cache read for %s", cVar.a());
            return bolts.h.y(e5);
        }
    }

    private bolts.h<com.facebook.imagepipeline.image.e> o(com.facebook.cache.common.c cVar, com.facebook.imagepipeline.image.e eVar) {
        com.facebook.common.logging.a.V(f11628h, "Found image for %s in staging area", cVar.a());
        this.f11635g.f(cVar);
        return bolts.h.z(eVar);
    }

    private bolts.h<com.facebook.imagepipeline.image.e> q(com.facebook.cache.common.c cVar, AtomicBoolean atomicBoolean) {
        try {
            return bolts.h.call(new b(atomicBoolean, cVar), this.f11632d);
        } catch (Exception e5) {
            com.facebook.common.logging.a.n0(f11628h, e5, "Failed to schedule disk-cache read for %s", cVar.a());
            return bolts.h.y(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public PooledByteBuffer s(com.facebook.cache.common.c cVar) throws IOException {
        try {
            Class<?> cls = f11628h;
            com.facebook.common.logging.a.V(cls, "Disk cache read for %s", cVar.a());
            e0.a c5 = this.f11629a.c(cVar);
            if (c5 == null) {
                com.facebook.common.logging.a.V(cls, "Disk cache miss for %s", cVar.a());
                this.f11635g.k();
                return null;
            }
            com.facebook.common.logging.a.V(cls, "Found entry in disk cache for %s", cVar.a());
            this.f11635g.h(cVar);
            InputStream a5 = c5.a();
            PooledByteBuffer b5 = this.f11630b.b(a5, (int) c5.size());
            a5.close();
            com.facebook.common.logging.a.V(cls, "Successful read from disk cache for %s", cVar.a());
            return b5;
        } catch (IOException e5) {
            com.facebook.common.logging.a.n0(f11628h, e5, "Exception reading from cache for %s", cVar.a());
            this.f11635g.c();
            throw e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(com.facebook.cache.common.c cVar, com.facebook.imagepipeline.image.e eVar) {
        Class<?> cls = f11628h;
        com.facebook.common.logging.a.V(cls, "About to write to disk-cache for key %s", cVar.a());
        try {
            this.f11629a.insert(cVar, new f(eVar));
            com.facebook.common.logging.a.V(cls, "Successful disk-cache write for key %s", cVar.a());
        } catch (IOException e5) {
            com.facebook.common.logging.a.n0(f11628h, e5, "Failed to write to disk-cache for key %s", cVar.a());
        }
    }

    public bolts.h<Void> j() {
        this.f11634f.a();
        try {
            return bolts.h.call(new CallableC0268e(), this.f11633e);
        } catch (Exception e5) {
            com.facebook.common.logging.a.n0(f11628h, e5, "Failed to schedule disk-cache clear", new Object[0]);
            return bolts.h.y(e5);
        }
    }

    public bolts.h<Boolean> k(com.facebook.cache.common.c cVar) {
        if (m(cVar)) {
            return bolts.h.z(Boolean.TRUE);
        }
        return l(cVar);
    }

    public boolean m(com.facebook.cache.common.c cVar) {
        return this.f11634f.b(cVar) || this.f11629a.f(cVar);
    }

    public boolean n(com.facebook.cache.common.c cVar) {
        if (m(cVar)) {
            return true;
        }
        return i(cVar);
    }

    public bolts.h<com.facebook.imagepipeline.image.e> p(com.facebook.cache.common.c cVar, AtomicBoolean atomicBoolean) {
        try {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("BufferedDiskCache#get");
            }
            com.facebook.imagepipeline.image.e c5 = this.f11634f.c(cVar);
            if (c5 != null) {
                return o(cVar, c5);
            }
            bolts.h<com.facebook.imagepipeline.image.e> q4 = q(cVar, atomicBoolean);
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
            return q4;
        } finally {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }

    public void r(com.facebook.cache.common.c cVar, com.facebook.imagepipeline.image.e eVar) {
        try {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("BufferedDiskCache#put");
            }
            com.facebook.common.internal.h.i(cVar);
            com.facebook.common.internal.h.d(com.facebook.imagepipeline.image.e.J(eVar));
            this.f11634f.f(cVar, eVar);
            com.facebook.imagepipeline.image.e b5 = com.facebook.imagepipeline.image.e.b(eVar);
            try {
                this.f11633e.execute(new c(cVar, b5));
            } catch (Exception e5) {
                com.facebook.common.logging.a.n0(f11628h, e5, "Failed to schedule disk-cache write for %s", cVar.a());
                this.f11634f.h(cVar, eVar);
                com.facebook.imagepipeline.image.e.d(b5);
            }
        } finally {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }

    public bolts.h<Void> t(com.facebook.cache.common.c cVar) {
        com.facebook.common.internal.h.i(cVar);
        this.f11634f.g(cVar);
        try {
            return bolts.h.call(new d(cVar), this.f11633e);
        } catch (Exception e5) {
            com.facebook.common.logging.a.n0(f11628h, e5, "Failed to schedule disk-cache remove for %s", cVar.a());
            return bolts.h.y(e5);
        }
    }
}

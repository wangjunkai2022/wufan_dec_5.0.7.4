package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.common.Priority;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: MultiplexProducer.java */
@ThreadSafe
/* loaded from: classes2.dex */
public abstract class b0<K, T extends Closeable> implements i0<T> {
    @VisibleForTesting
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    final Map<K, b0<K, T>.b> f12146a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final i0<T> f12147b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultiplexProducer.java */
    @VisibleForTesting
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private final K f12148a;

        /* renamed from: b  reason: collision with root package name */
        private final CopyOnWriteArraySet<Pair<Consumer<T>, k0>> f12149b = com.facebook.common.internal.j.a();
        @GuardedBy("Multiplexer.this")
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        private T f12150c;
        @GuardedBy("Multiplexer.this")

        /* renamed from: d  reason: collision with root package name */
        private float f12151d;
        @GuardedBy("Multiplexer.this")

        /* renamed from: e  reason: collision with root package name */
        private int f12152e;
        @GuardedBy("Multiplexer.this")
        @Nullable

        /* renamed from: f  reason: collision with root package name */
        private d f12153f;
        @GuardedBy("Multiplexer.this")
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        private b0<K, T>.b.C0275b f12154g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MultiplexProducer.java */
        /* loaded from: classes2.dex */
        public class a extends e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Pair f12156a;

            a(Pair pair) {
                this.f12156a = pair;
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
            public void a() {
                d.h(b.this.r());
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
            public void b() {
                boolean remove;
                List list;
                d dVar;
                List list2;
                List list3;
                synchronized (b.this) {
                    remove = b.this.f12149b.remove(this.f12156a);
                    list = null;
                    if (!remove) {
                        dVar = null;
                        list2 = null;
                    } else if (b.this.f12149b.isEmpty()) {
                        dVar = b.this.f12153f;
                        list2 = null;
                    } else {
                        List s4 = b.this.s();
                        list2 = b.this.t();
                        list3 = b.this.r();
                        dVar = null;
                        list = s4;
                    }
                    list3 = list2;
                }
                d.i(list);
                d.j(list2);
                d.h(list3);
                if (dVar != null) {
                    dVar.k();
                }
                if (remove) {
                    ((Consumer) this.f12156a.first).a();
                }
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
            public void c() {
                d.j(b.this.t());
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
            public void d() {
                d.i(b.this.s());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: MultiplexProducer.java */
        /* renamed from: com.facebook.imagepipeline.producers.b0$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0275b extends com.facebook.imagepipeline.producers.b<T> {
            private C0275b() {
            }

            @Override // com.facebook.imagepipeline.producers.b
            protected void f() {
                try {
                    if (com.facebook.imagepipeline.systrace.b.e()) {
                        com.facebook.imagepipeline.systrace.b.a("MultiplexProducer#onCancellation");
                    }
                    b.this.m(this);
                } finally {
                    if (com.facebook.imagepipeline.systrace.b.e()) {
                        com.facebook.imagepipeline.systrace.b.c();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.b
            protected void g(Throwable th) {
                try {
                    if (com.facebook.imagepipeline.systrace.b.e()) {
                        com.facebook.imagepipeline.systrace.b.a("MultiplexProducer#onFailure");
                    }
                    b.this.n(this, th);
                } finally {
                    if (com.facebook.imagepipeline.systrace.b.e()) {
                        com.facebook.imagepipeline.systrace.b.c();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.b
            protected void i(float f5) {
                try {
                    if (com.facebook.imagepipeline.systrace.b.e()) {
                        com.facebook.imagepipeline.systrace.b.a("MultiplexProducer#onProgressUpdate");
                    }
                    b.this.p(this, f5);
                } finally {
                    if (com.facebook.imagepipeline.systrace.b.e()) {
                        com.facebook.imagepipeline.systrace.b.c();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.producers.b
            /* renamed from: p */
            public void h(T t4, int i4) {
                try {
                    if (com.facebook.imagepipeline.systrace.b.e()) {
                        com.facebook.imagepipeline.systrace.b.a("MultiplexProducer#onNewResult");
                    }
                    b.this.o(this, t4, i4);
                } finally {
                    if (com.facebook.imagepipeline.systrace.b.e()) {
                        com.facebook.imagepipeline.systrace.b.c();
                    }
                }
            }
        }

        public b(K k4) {
            this.f12148a = k4;
        }

        private void g(Pair<Consumer<T>, k0> pair, k0 k0Var) {
            k0Var.c(new a(pair));
        }

        private void i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    throw new RuntimeException(e5);
                }
            }
        }

        private synchronized boolean j() {
            Iterator<Pair<Consumer<T>, k0>> it2 = this.f12149b.iterator();
            while (it2.hasNext()) {
                if (((k0) it2.next().second).d()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized boolean k() {
            Iterator<Pair<Consumer<T>, k0>> it2 = this.f12149b.iterator();
            while (it2.hasNext()) {
                if (!((k0) it2.next().second).e()) {
                    return false;
                }
            }
            return true;
        }

        private synchronized Priority l() {
            Priority priority;
            priority = Priority.LOW;
            Iterator<Pair<Consumer<T>, k0>> it2 = this.f12149b.iterator();
            while (it2.hasNext()) {
                priority = Priority.getHigherPriority(priority, ((k0) it2.next().second).getPriority());
            }
            return priority;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q() {
            synchronized (this) {
                boolean z4 = true;
                com.facebook.common.internal.h.d(this.f12153f == null);
                if (this.f12154g != null) {
                    z4 = false;
                }
                com.facebook.common.internal.h.d(z4);
                if (this.f12149b.isEmpty()) {
                    b0.this.j(this.f12148a, this);
                    return;
                }
                k0 k0Var = (k0) this.f12149b.iterator().next().second;
                this.f12153f = new d(k0Var.a(), k0Var.getId(), k0Var.getListener(), k0Var.b(), k0Var.f(), k(), j(), l());
                b0<K, T>.b.C0275b c0275b = new C0275b();
                this.f12154g = c0275b;
                b0.this.f12147b.b(c0275b, this.f12153f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public synchronized List<l0> r() {
            d dVar = this.f12153f;
            if (dVar == null) {
                return null;
            }
            return dVar.n(j());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public synchronized List<l0> s() {
            d dVar = this.f12153f;
            if (dVar == null) {
                return null;
            }
            return dVar.o(k());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public synchronized List<l0> t() {
            d dVar = this.f12153f;
            if (dVar == null) {
                return null;
            }
            return dVar.p(l());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean h(Consumer<T> consumer, k0 k0Var) {
            Pair<Consumer<T>, k0> create = Pair.create(consumer, k0Var);
            synchronized (this) {
                if (b0.this.h(this.f12148a) != this) {
                    return false;
                }
                this.f12149b.add(create);
                List<l0> s4 = s();
                List<l0> t4 = t();
                List<l0> r4 = r();
                Closeable closeable = this.f12150c;
                float f5 = this.f12151d;
                int i4 = this.f12152e;
                d.i(s4);
                d.j(t4);
                d.h(r4);
                synchronized (create) {
                    synchronized (this) {
                        if (closeable != this.f12150c) {
                            closeable = null;
                        } else if (closeable != null) {
                            closeable = b0.this.f(closeable);
                        }
                    }
                    if (closeable != null) {
                        if (f5 > 0.0f) {
                            consumer.c(f5);
                        }
                        consumer.b(closeable, i4);
                        i(closeable);
                    }
                }
                g(create, k0Var);
                return true;
            }
        }

        public void m(b0<K, T>.b.C0275b c0275b) {
            synchronized (this) {
                if (this.f12154g != c0275b) {
                    return;
                }
                this.f12154g = null;
                this.f12153f = null;
                i(this.f12150c);
                this.f12150c = null;
                q();
            }
        }

        public void n(b0<K, T>.b.C0275b c0275b, Throwable th) {
            synchronized (this) {
                if (this.f12154g != c0275b) {
                    return;
                }
                Iterator<Pair<Consumer<T>, k0>> it2 = this.f12149b.iterator();
                this.f12149b.clear();
                b0.this.j(this.f12148a, this);
                i(this.f12150c);
                this.f12150c = null;
                while (it2.hasNext()) {
                    Pair<Consumer<T>, k0> next = it2.next();
                    synchronized (next) {
                        ((Consumer) next.first).onFailure(th);
                    }
                }
            }
        }

        public void o(b0<K, T>.b.C0275b c0275b, T t4, int i4) {
            synchronized (this) {
                if (this.f12154g != c0275b) {
                    return;
                }
                i(this.f12150c);
                this.f12150c = null;
                Iterator<Pair<Consumer<T>, k0>> it2 = this.f12149b.iterator();
                if (com.facebook.imagepipeline.producers.b.e(i4)) {
                    this.f12150c = (T) b0.this.f(t4);
                    this.f12152e = i4;
                } else {
                    this.f12149b.clear();
                    b0.this.j(this.f12148a, this);
                }
                while (it2.hasNext()) {
                    Pair<Consumer<T>, k0> next = it2.next();
                    synchronized (next) {
                        ((Consumer) next.first).b(t4, i4);
                    }
                }
            }
        }

        public void p(b0<K, T>.b.C0275b c0275b, float f5) {
            synchronized (this) {
                if (this.f12154g != c0275b) {
                    return;
                }
                this.f12151d = f5;
                Iterator<Pair<Consumer<T>, k0>> it2 = this.f12149b.iterator();
                while (it2.hasNext()) {
                    Pair<Consumer<T>, k0> next = it2.next();
                    synchronized (next) {
                        ((Consumer) next.first).c(f5);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b0(i0<T> i0Var) {
        this.f12147b = i0Var;
    }

    private synchronized b0<K, T>.b g(K k4) {
        b0<K, T>.b bVar;
        bVar = new b(k4);
        this.f12146a.put(k4, bVar);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized b0<K, T>.b h(K k4) {
        return this.f12146a.get(k4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j(K k4, b0<K, T>.b bVar) {
        if (this.f12146a.get(k4) == bVar) {
            this.f12146a.remove(k4);
        }
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<T> consumer, k0 k0Var) {
        boolean z4;
        b0<K, T>.b h4;
        try {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("MultiplexProducer#produceResults");
            }
            K i4 = i(k0Var);
            do {
                z4 = false;
                synchronized (this) {
                    h4 = h(i4);
                    if (h4 == null) {
                        h4 = g(i4);
                        z4 = true;
                    }
                }
            } while (!h4.h(consumer, k0Var));
            if (z4) {
                h4.q();
            }
        } finally {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }

    protected abstract T f(T t4);

    protected abstract K i(k0 k0Var);
}

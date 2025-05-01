package com.facebook.common.references;

import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.h;
import com.facebook.infer.annotation.PropagatesNullable;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* compiled from: CloseableReference.java */
/* loaded from: classes.dex */
public final class a<T> implements Cloneable, Closeable {

    /* renamed from: d  reason: collision with root package name */
    private static Class<a> f10892d = a.class;

    /* renamed from: e  reason: collision with root package name */
    private static final c<Closeable> f10893e = new C0255a();
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private boolean f10894b = false;

    /* renamed from: c  reason: collision with root package name */
    private final SharedReference<T> f10895c;

    /* compiled from: CloseableReference.java */
    /* renamed from: com.facebook.common.references.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0255a implements c<Closeable> {
        C0255a() {
        }

        @Override // com.facebook.common.references.c
        /* renamed from: a */
        public void release(Closeable closeable) {
            try {
                com.facebook.common.internal.c.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    private a(SharedReference<T> sharedReference) {
        this.f10895c = (SharedReference) h.i(sharedReference);
        sharedReference.b();
    }

    @Nullable
    public static <T> a<T> d(@Nullable a<T> aVar) {
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public static <T> List<a<T>> g(@PropagatesNullable Collection<a<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (a<T> aVar : collection) {
            arrayList.add(d(aVar));
        }
        return arrayList;
    }

    public static void h(@Nullable a<?> aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    public static void j(@Nullable Iterable<? extends a<?>> iterable) {
        if (iterable != null) {
            for (a<?> aVar : iterable) {
                h(aVar);
            }
        }
    }

    public static boolean t(@Nullable a<?> aVar) {
        return aVar != null && aVar.r();
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)Lcom/facebook/common/references/a<TT;>; */
    public static a u(@PropagatesNullable Closeable closeable) {
        if (closeable == null) {
            return null;
        }
        return new a(closeable, f10893e);
    }

    public static <T> a<T> v(@PropagatesNullable T t4, c<T> cVar) {
        if (t4 == null) {
            return null;
        }
        return new a<>(t4, cVar);
    }

    /* renamed from: a */
    public synchronized a<T> clone() {
        h.o(r());
        return new a<>(this.f10895c);
    }

    @Nullable
    public synchronized a<T> b() {
        if (r()) {
            return clone();
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.f10894b) {
                return;
            }
            this.f10894b = true;
            this.f10895c.d();
        }
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f10894b) {
                    return;
                }
                com.facebook.common.logging.a.m0(f10892d, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f10895c)), this.f10895c.f().getClass().getName());
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public synchronized T k() {
        h.o(!this.f10894b);
        return this.f10895c.f();
    }

    @VisibleForTesting
    public synchronized SharedReference<T> l() {
        return this.f10895c;
    }

    public int p() {
        if (r()) {
            return System.identityHashCode(this.f10895c.f());
        }
        return 0;
    }

    public synchronized boolean r() {
        return !this.f10894b;
    }

    private a(T t4, c<T> cVar) {
        this.f10895c = new SharedReference<>(t4, cVar);
    }
}

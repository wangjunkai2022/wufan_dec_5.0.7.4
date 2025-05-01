package com.sdk.d;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes5.dex */
public class i<E> extends AbstractQueue<E> implements BlockingQueue<E>, Serializable {
    public static final long serialVersionUID = -6903933977591709194L;

    /* renamed from: a  reason: collision with root package name */
    public final int f60025a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f60026b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    public transient com.sdk.d.a<E> f60027c;

    /* renamed from: d  reason: collision with root package name */
    public transient com.sdk.d.a<E> f60028d;

    /* renamed from: e  reason: collision with root package name */
    public final ReentrantLock f60029e;

    /* renamed from: f  reason: collision with root package name */
    public final Condition f60030f;

    /* renamed from: g  reason: collision with root package name */
    public final ReentrantLock f60031g;

    /* renamed from: h  reason: collision with root package name */
    public final Condition f60032h;

    /* loaded from: classes5.dex */
    private class a implements Iterator<E> {

        /* renamed from: a  reason: collision with root package name */
        public com.sdk.d.a<E> f60033a;

        /* renamed from: b  reason: collision with root package name */
        public com.sdk.d.a<E> f60034b;

        /* renamed from: c  reason: collision with root package name */
        public E f60035c;

        public a() {
            i.this.a();
            try {
                com.sdk.d.a<E> aVar = i.this.f60027c.f59996c;
                this.f60033a = aVar;
                if (aVar != null) {
                    this.f60035c = aVar.b();
                }
            } finally {
                i.this.b();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f60033a != null;
        }

        @Override // java.util.Iterator
        public E next() {
            com.sdk.d.a<E> aVar;
            i.this.a();
            try {
                com.sdk.d.a<E> aVar2 = this.f60033a;
                if (aVar2 != null) {
                    E e5 = this.f60035c;
                    this.f60034b = aVar2;
                    while (true) {
                        aVar = aVar2.f59996c;
                        if (aVar != aVar2) {
                            if (aVar == null || aVar.b() != null) {
                                break;
                            }
                            aVar2 = aVar;
                        } else {
                            aVar = i.this.f60027c.f59996c;
                            break;
                        }
                    }
                    this.f60033a = aVar;
                    this.f60035c = aVar == null ? null : aVar.b();
                    return e5;
                }
                throw new NoSuchElementException();
            } finally {
                i.this.b();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
            r4.f60036d.a(r1, r2);
         */
        @Override // java.util.Iterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void remove() {
            /*
                r4 = this;
                com.sdk.d.a<E> r0 = r4.f60034b
                if (r0 == 0) goto L2d
                com.sdk.d.i r0 = com.sdk.d.i.this
                r0.a()
                com.sdk.d.a<E> r0 = r4.f60034b     // Catch: java.lang.Throwable -> L26
                r1 = 0
                r4.f60034b = r1     // Catch: java.lang.Throwable -> L26
                com.sdk.d.i r1 = com.sdk.d.i.this     // Catch: java.lang.Throwable -> L26
                com.sdk.d.a<E> r1 = r1.f60027c     // Catch: java.lang.Throwable -> L26
            L12:
                com.sdk.d.a<T> r2 = r1.f59996c     // Catch: java.lang.Throwable -> L26
                r3 = r2
                r2 = r1
                r1 = r3
                if (r1 == 0) goto L20
                if (r1 != r0) goto L12
                com.sdk.d.i r0 = com.sdk.d.i.this     // Catch: java.lang.Throwable -> L26
                r0.a(r1, r2)     // Catch: java.lang.Throwable -> L26
            L20:
                com.sdk.d.i r0 = com.sdk.d.i.this
                r0.b()
                return
            L26:
                r0 = move-exception
                com.sdk.d.i r1 = com.sdk.d.i.this
                r1.b()
                throw r0
            L2d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                goto L34
            L33:
                throw r0
            L34:
                goto L33
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sdk.d.i.a.remove():void");
        }
    }

    public i() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f60029e = reentrantLock;
        this.f60030f = reentrantLock.newCondition();
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.f60031g = reentrantLock2;
        this.f60032h = reentrantLock2.newCondition();
        this.f60025a = Integer.MAX_VALUE;
        com.sdk.d.a<E> aVar = new com.sdk.d.a<>(null);
        this.f60027c = aVar;
        this.f60028d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f60026b.set(0);
        com.sdk.d.a<E> aVar = new com.sdk.d.a<>(null);
        this.f60027c = aVar;
        this.f60028d = aVar;
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject == null) {
                return;
            }
            add(readObject);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        a();
        try {
            objectOutputStream.defaultWriteObject();
            com.sdk.d.a aVar = this.f60027c;
            while (true) {
                aVar = aVar.f59996c;
                if (aVar == null) {
                    objectOutputStream.writeObject(null);
                    return;
                }
                objectOutputStream.writeObject(aVar.b());
            }
        } finally {
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized E a(com.sdk.d.a<E> aVar) {
        if (aVar == 0) {
            com.sdk.d.a aVar2 = (com.sdk.d.a<E>) this.f60027c;
            com.sdk.d.a<E> aVar3 = (com.sdk.d.a<E>) aVar2.f59996c;
            aVar2.f59996c = aVar2;
            this.f60027c = aVar3;
            E b5 = aVar3.b();
            aVar3.a(null);
            return b5;
        }
        boolean z4 = false;
        com.sdk.d.a aVar4 = this.f60027c;
        while (true) {
            com.sdk.d.a<T> aVar5 = aVar4.f59996c;
            if (aVar5 == 0) {
                break;
            } else if (aVar5.a().ordinal() > aVar.a().ordinal()) {
                aVar4.f59996c = aVar;
                aVar.f59996c = aVar5;
                z4 = true;
                break;
            } else {
                aVar4 = aVar4.f59996c;
            }
        }
        if (!z4) {
            this.f60028d.f59996c = aVar;
            this.f60028d = aVar;
        }
        return null;
    }

    public void a() {
        this.f60031g.lock();
        this.f60029e.lock();
    }

    public void a(com.sdk.d.a<E> aVar, com.sdk.d.a<E> aVar2) {
        aVar.a(null);
        aVar2.f59996c = (com.sdk.d.a<E>) aVar.f59996c;
        if (this.f60028d == aVar) {
            this.f60028d = aVar2;
        }
        if (this.f60026b.getAndDecrement() == this.f60025a) {
            this.f60032h.signal();
        }
    }

    public void b() {
        this.f60029e.unlock();
        this.f60031g.unlock();
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f60029e;
        reentrantLock.lock();
        try {
            this.f60030f.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        a();
        try {
            com.sdk.d.a aVar = (com.sdk.d.a<E>) this.f60027c;
            while (true) {
                com.sdk.d.a aVar2 = aVar.f59996c;
                if (aVar2 == null) {
                    break;
                }
                aVar.f59996c = aVar;
                aVar2.a(null);
                aVar = (com.sdk.d.a<E>) aVar2;
            }
            this.f60027c = this.f60028d;
            if (this.f60026b.getAndSet(0) == this.f60025a) {
                this.f60032h.signal();
            }
        } finally {
            b();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        a();
        try {
            com.sdk.d.a aVar = this.f60027c;
            do {
                aVar = aVar.f59996c;
                if (aVar == null) {
                    return false;
                }
            } while (!obj.equals(aVar.b()));
            b();
            return true;
        } finally {
            b();
        }
    }

    public final void d() {
        ReentrantLock reentrantLock = this.f60031g;
        reentrantLock.lock();
        try {
            this.f60032h.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return drainTo(collection, Integer.MAX_VALUE);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i4) {
        collection.getClass();
        if (collection != this) {
            boolean z4 = false;
            if (i4 <= 0) {
                return 0;
            }
            ReentrantLock reentrantLock = this.f60029e;
            reentrantLock.lock();
            try {
                int min = Math.min(i4, this.f60026b.get());
                com.sdk.d.a<E> aVar = this.f60027c;
                int i5 = 0;
                while (i5 < min) {
                    com.sdk.d.a<E> aVar2 = aVar.f59996c;
                    collection.add((Object) aVar2.b());
                    aVar2.a(null);
                    aVar.f59996c = (com.sdk.d.a<T>) aVar;
                    i5++;
                    aVar = aVar2;
                }
                if (i5 > 0) {
                    this.f60027c = aVar;
                    if (this.f60026b.getAndAdd(-i5) == this.f60025a) {
                        z4 = true;
                    }
                }
                return min;
            } finally {
                reentrantLock.unlock();
                if (0 != 0) {
                    d();
                }
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(E e5) {
        e5.getClass();
        AtomicInteger atomicInteger = this.f60026b;
        if (atomicInteger.get() == this.f60025a) {
            return false;
        }
        int i4 = -1;
        com.sdk.d.a<E> aVar = new com.sdk.d.a<>(e5);
        ReentrantLock reentrantLock = this.f60031g;
        reentrantLock.lock();
        try {
            if (atomicInteger.get() < this.f60025a) {
                a(aVar);
                i4 = atomicInteger.getAndIncrement();
                if (i4 + 1 < this.f60025a) {
                    this.f60032h.signal();
                }
            }
            if (i4 == 0) {
                c();
            }
            return i4 >= 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e5, long j4, TimeUnit timeUnit) {
        e5.getClass();
        long nanos = timeUnit.toNanos(j4);
        ReentrantLock reentrantLock = this.f60031g;
        AtomicInteger atomicInteger = this.f60026b;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == this.f60025a) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return false;
                }
                nanos = this.f60032h.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
        a(new com.sdk.d.a<>(e5));
        int andIncrement = atomicInteger.getAndIncrement();
        if (andIncrement + 1 < this.f60025a) {
            this.f60032h.signal();
        }
        if (andIncrement == 0) {
            c();
            return true;
        }
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        if (this.f60026b.get() == 0) {
            return null;
        }
        ReentrantLock reentrantLock = this.f60029e;
        reentrantLock.lock();
        try {
            com.sdk.d.a<E> aVar = this.f60027c.f59996c;
            if (aVar == null) {
                return null;
            }
            return aVar.b();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.Queue
    public E poll() {
        AtomicInteger atomicInteger = this.f60026b;
        E e5 = null;
        if (atomicInteger.get() == 0) {
            return null;
        }
        int i4 = -1;
        ReentrantLock reentrantLock = this.f60029e;
        reentrantLock.lock();
        try {
            if (atomicInteger.get() > 0) {
                e5 = a(null);
                i4 = atomicInteger.getAndDecrement();
                if (i4 > 1) {
                    this.f60030f.signal();
                }
            }
            reentrantLock.unlock();
            if (i4 == this.f60025a) {
                d();
            }
            return e5;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long j4, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j4);
        AtomicInteger atomicInteger = this.f60026b;
        ReentrantLock reentrantLock = this.f60029e;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == 0) {
            try {
                if (nanos <= 0) {
                    return null;
                }
                nanos = this.f60030f.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
        E a5 = a(null);
        int andDecrement = atomicInteger.getAndDecrement();
        if (andDecrement > 1) {
            this.f60030f.signal();
        }
        reentrantLock.unlock();
        if (andDecrement == this.f60025a) {
            d();
        }
        return a5;
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e5) {
        e5.getClass();
        com.sdk.d.a<E> aVar = new com.sdk.d.a<>(e5);
        ReentrantLock reentrantLock = this.f60031g;
        AtomicInteger atomicInteger = this.f60026b;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == this.f60025a) {
            try {
                this.f60032h.await();
            } finally {
                reentrantLock.unlock();
            }
        }
        a(aVar);
        int andIncrement = atomicInteger.getAndIncrement();
        if (andIncrement + 1 < this.f60025a) {
            this.f60032h.signal();
        }
        if (andIncrement == 0) {
            c();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return this.f60025a - this.f60026b.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
        com.sdk.d.a<E> aVar;
        if (obj == null) {
            return false;
        }
        a();
        try {
            com.sdk.d.a<E> aVar2 = this.f60027c;
            do {
                aVar = aVar2;
                aVar2 = aVar2.f59996c;
                if (aVar2 == null) {
                    return false;
                }
            } while (!obj.equals(aVar2.b()));
            a(aVar2, aVar);
            b();
            return true;
        } finally {
            b();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f60026b.get();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() {
        AtomicInteger atomicInteger = this.f60026b;
        ReentrantLock reentrantLock = this.f60029e;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == 0) {
            try {
                this.f60030f.await();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        E a5 = a(null);
        int andDecrement = atomicInteger.getAndDecrement();
        if (andDecrement > 1) {
            this.f60030f.signal();
        }
        reentrantLock.unlock();
        if (andDecrement == this.f60025a) {
            d();
        }
        return a5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        a();
        try {
            Object[] objArr = new Object[this.f60026b.get()];
            int i4 = 0;
            com.sdk.d.a aVar = this.f60027c;
            while (true) {
                aVar = aVar.f59996c;
                if (aVar == null) {
                    return objArr;
                }
                int i5 = i4 + 1;
                objArr[i4] = aVar.b();
                i4 = i5;
            }
        } finally {
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        a();
        try {
            int i4 = this.f60026b.get();
            if (tArr.length < i4) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i4));
            }
            int i5 = 0;
            com.sdk.d.a aVar = this.f60027c;
            while (true) {
                aVar = aVar.f59996c;
                if (aVar == null) {
                    break;
                }
                tArr[i5] = aVar.b();
                i5++;
            }
            if (tArr.length > i5) {
                tArr[i5] = null;
            }
            return tArr;
        } finally {
            b();
        }
    }
}

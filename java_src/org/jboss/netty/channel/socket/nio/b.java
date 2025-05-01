package org.jboss.netty.channel.socket.nio;

import java.net.InetSocketAddress;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.jboss.netty.channel.i0;
import org.jboss.netty.channel.socket.nio.x;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractNioChannel.java */
/* loaded from: classes7.dex */
public abstract class b<C extends SelectableChannel & WritableByteChannel> extends org.jboss.netty.channel.a {
    volatile InetSocketAddress A;
    final C B;

    /* renamed from: o  reason: collision with root package name */
    final e f72572o;

    /* renamed from: p  reason: collision with root package name */
    final Object f72573p;

    /* renamed from: q  reason: collision with root package name */
    final Runnable f72574q;

    /* renamed from: r  reason: collision with root package name */
    final AtomicBoolean f72575r;

    /* renamed from: s  reason: collision with root package name */
    final Queue<i0> f72576s;

    /* renamed from: t  reason: collision with root package name */
    final AtomicInteger f72577t;

    /* renamed from: u  reason: collision with root package name */
    final AtomicInteger f72578u;

    /* renamed from: v  reason: collision with root package name */
    i0 f72579v;

    /* renamed from: w  reason: collision with root package name */
    x.g f72580w;

    /* renamed from: x  reason: collision with root package name */
    boolean f72581x;

    /* renamed from: y  reason: collision with root package name */
    boolean f72582y;

    /* renamed from: z  reason: collision with root package name */
    private volatile InetSocketAddress f72583z;

    /* compiled from: AbstractNioChannel.java */
    /* loaded from: classes7.dex */
    private final class a implements Queue<i0> {

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ boolean f72584e = false;

        /* renamed from: b  reason: collision with root package name */
        private final org.jboss.netty.util.internal.k f72585b = new org.jboss.netty.util.internal.k();

        /* renamed from: c  reason: collision with root package name */
        private final Queue<i0> f72586c = new ConcurrentLinkedQueue();

        public a() {
        }

        private int c(i0 i0Var) {
            Object message = i0Var.getMessage();
            if (message instanceof org.jboss.netty.buffer.e) {
                return ((org.jboss.netty.buffer.e) message).readableBytes();
            }
            return 0;
        }

        @Override // java.util.Queue, java.util.Collection
        /* renamed from: a */
        public boolean add(i0 i0Var) {
            return this.f72586c.add(i0Var);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends i0> collection) {
            return this.f72586c.addAll(collection);
        }

        @Override // java.util.Queue
        /* renamed from: b */
        public i0 element() {
            return this.f72586c.element();
        }

        @Override // java.util.Collection
        public void clear() {
            this.f72586c.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.f72586c.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return this.f72586c.containsAll(collection);
        }

        @Override // java.util.Queue
        /* renamed from: e */
        public boolean offer(i0 i0Var) {
            this.f72586c.offer(i0Var);
            int c5 = c(i0Var);
            int addAndGet = b.this.f72577t.addAndGet(c5);
            int writeBufferHighWaterMark = b.this.getConfig().getWriteBufferHighWaterMark();
            if (addAndGet < writeBufferHighWaterMark || addAndGet - c5 >= writeBufferHighWaterMark) {
                return true;
            }
            b.this.f72578u.incrementAndGet();
            if (this.f72585b.get().booleanValue()) {
                return true;
            }
            this.f72585b.set(Boolean.TRUE);
            org.jboss.netty.channel.s.u(b.this);
            this.f72585b.set(Boolean.FALSE);
            return true;
        }

        @Override // java.util.Queue
        /* renamed from: f */
        public i0 peek() {
            return this.f72586c.peek();
        }

        @Override // java.util.Queue
        /* renamed from: i */
        public i0 poll() {
            i0 poll = this.f72586c.poll();
            if (poll != null) {
                int c5 = c(poll);
                int addAndGet = b.this.f72577t.addAndGet(-c5);
                int writeBufferLowWaterMark = b.this.getConfig().getWriteBufferLowWaterMark();
                if ((addAndGet == 0 || addAndGet < writeBufferLowWaterMark) && addAndGet + c5 >= writeBufferLowWaterMark) {
                    b.this.f72578u.decrementAndGet();
                    if (b.this.isConnected() && !this.f72585b.get().booleanValue()) {
                        this.f72585b.set(Boolean.TRUE);
                        org.jboss.netty.channel.s.u(b.this);
                        this.f72585b.set(Boolean.FALSE);
                    }
                }
            }
            return poll;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f72586c.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<i0> iterator() {
            return this.f72586c.iterator();
        }

        @Override // java.util.Queue
        /* renamed from: m */
        public i0 remove() {
            return this.f72586c.remove();
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return this.f72586c.removeAll(collection);
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return this.f72586c.retainAll(collection);
        }

        @Override // java.util.Collection
        public int size() {
            return this.f72586c.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return this.f72586c.toArray();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            return this.f72586c.remove(obj);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.f72586c.toArray(tArr);
        }
    }

    /* compiled from: AbstractNioChannel.java */
    /* renamed from: org.jboss.netty.channel.socket.nio.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    private final class RunnableC0800b implements Runnable {
        RunnableC0800b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f72575r.set(false);
            b<?> bVar = b.this;
            bVar.f72572o.x(bVar);
        }
    }

    protected b(Integer num, org.jboss.netty.channel.e eVar, org.jboss.netty.channel.i iVar, org.jboss.netty.channel.n nVar, org.jboss.netty.channel.p pVar, e eVar2, C c5) {
        super(num, eVar, iVar, nVar, pVar);
        this.f72573p = new Object();
        this.f72574q = new RunnableC0800b();
        this.f72575r = new AtomicBoolean();
        this.f72576s = new a();
        this.f72577t = new AtomicInteger();
        this.f72578u = new AtomicInteger();
        this.f72572o = eVar2;
        this.B = c5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.jboss.netty.channel.a
    public boolean E() {
        return super.E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K0(int i4) {
        P(i4);
    }

    @Override // org.jboss.netty.channel.a, org.jboss.netty.channel.e
    public int O() {
        if (isOpen()) {
            int e02 = e0();
            int i4 = this.f72577t.get();
            return (i4 == 0 || (this.f72578u.get() <= 0 ? i4 < getConfig().getWriteBufferHighWaterMark() : i4 < getConfig().getWriteBufferLowWaterMark())) ? e02 & (-5) : e02 | 4;
        }
        return 4;
    }

    @Override // org.jboss.netty.channel.e
    /* renamed from: W */
    public abstract j getConfig();

    abstract InetSocketAddress a0() throws Exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e0() {
        return super.O();
    }

    abstract InetSocketAddress g0() throws Exception;

    public e x0() {
        return this.f72572o;
    }

    @Override // org.jboss.netty.channel.e
    public InetSocketAddress getLocalAddress() {
        InetSocketAddress inetSocketAddress = this.f72583z;
        if (inetSocketAddress == null) {
            try {
                InetSocketAddress a02 = a0();
                if (a02.getAddress().isAnyLocalAddress()) {
                    return a02;
                }
                this.f72583z = a02;
                return a02;
            } catch (Throwable unused) {
                return null;
            }
        }
        return inetSocketAddress;
    }

    @Override // org.jboss.netty.channel.e
    public InetSocketAddress getRemoteAddress() {
        InetSocketAddress inetSocketAddress = this.A;
        if (inetSocketAddress == null) {
            try {
                InetSocketAddress g02 = g0();
                this.A = g02;
                return g02;
            } catch (Throwable unused) {
                return null;
            }
        }
        return inetSocketAddress;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(org.jboss.netty.channel.e eVar, org.jboss.netty.channel.i iVar, org.jboss.netty.channel.n nVar, org.jboss.netty.channel.p pVar, e eVar2, C c5) {
        super(eVar, iVar, nVar, pVar);
        this.f72573p = new Object();
        this.f72574q = new RunnableC0800b();
        this.f72575r = new AtomicBoolean();
        this.f72576s = new a();
        this.f72577t = new AtomicInteger();
        this.f72578u = new AtomicInteger();
        this.f72572o = eVar2;
        this.B = c5;
    }
}

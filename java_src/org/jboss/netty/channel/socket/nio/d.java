package org.jboss.netty.channel.socket.nio;

import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.jboss.netty.channel.ChannelException;
/* compiled from: AbstractNioSelector.java */
/* loaded from: classes7.dex */
abstract class d implements p {

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicInteger f72589k = new AtomicInteger();

    /* renamed from: l  reason: collision with root package name */
    private static final int f72590l = 256;

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ boolean f72591m = false;

    /* renamed from: b  reason: collision with root package name */
    private final int f72592b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f72593c;

    /* renamed from: d  reason: collision with root package name */
    protected volatile Thread f72594d;

    /* renamed from: e  reason: collision with root package name */
    protected volatile Selector f72595e;

    /* renamed from: f  reason: collision with root package name */
    protected final AtomicBoolean f72596f;

    /* renamed from: g  reason: collision with root package name */
    private final Queue<Runnable> f72597g;

    /* renamed from: h  reason: collision with root package name */
    private volatile int f72598h;

    /* renamed from: i  reason: collision with root package name */
    private final CountDownLatch f72599i;

    /* renamed from: j  reason: collision with root package name */
    private volatile boolean f72600j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractNioSelector.java */
    /* loaded from: classes7.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.rebuildSelector();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Executor executor) {
        this(executor, null);
    }

    private void g(org.jboss.netty.util.d dVar) {
        try {
            this.f72595e = Selector.open();
            try {
                org.jboss.netty.util.internal.c.a(this.f72593c, f(this.f72592b, dVar));
            } catch (Throwable th) {
                try {
                    this.f72595e.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                this.f72595e = null;
                throw th;
            }
        } catch (Throwable th3) {
            throw new ChannelException("Failed to create a selector.", th3);
        }
    }

    private void i() {
        while (true) {
            Runnable poll = this.f72597g.poll();
            if (poll == null) {
                return;
            }
            poll.run();
            try {
                a();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a() throws IOException {
        if (this.f72598h >= 256) {
            this.f72598h = 0;
            this.f72595e.selectNow();
            return true;
        }
        return false;
    }

    protected abstract void b(SelectionKey selectionKey);

    protected abstract Runnable c(org.jboss.netty.channel.e eVar, org.jboss.netty.channel.j jVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        this.f72598h++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean e() {
        return Thread.currentThread() == this.f72594d;
    }

    protected abstract org.jboss.netty.util.e f(int i4, org.jboss.netty.util.d dVar);

    protected abstract void h(Selector selector) throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(Runnable runnable) {
        this.f72597g.add(runnable);
        Selector selector = this.f72595e;
        if (selector != null) {
            if (this.f72596f.compareAndSet(false, true)) {
                selector.wakeup();
            }
        } else if (this.f72597g.remove(runnable)) {
            throw new RejectedExecutionException("Worker has already been shutdown");
        }
    }

    protected int k(Selector selector) throws IOException {
        return v.a(selector);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        continue;
     */
    @Override // org.jboss.netty.channel.socket.nio.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void rebuildSelector() {
        /*
            r7 = this;
            boolean r0 = r7.e()
            if (r0 != 0) goto L11
            java.util.Queue<java.lang.Runnable> r0 = r7.f72597g
            org.jboss.netty.channel.socket.nio.d$a r1 = new org.jboss.netty.channel.socket.nio.d$a
            r1.<init>()
            r0.add(r1)
            return
        L11:
            java.nio.channels.Selector r0 = r7.f72595e
            if (r0 != 0) goto L16
            return
        L16:
            java.nio.channels.Selector r1 = java.nio.channels.Selector.open()     // Catch: java.lang.Exception -> L5b
        L1a:
            java.util.Set r2 = r0.keys()     // Catch: java.util.ConcurrentModificationException -> L1a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.util.ConcurrentModificationException -> L1a
        L22:
            boolean r3 = r2.hasNext()     // Catch: java.util.ConcurrentModificationException -> L1a
            if (r3 == 0) goto L50
            java.lang.Object r3 = r2.next()     // Catch: java.util.ConcurrentModificationException -> L1a
            java.nio.channels.SelectionKey r3 = (java.nio.channels.SelectionKey) r3     // Catch: java.util.ConcurrentModificationException -> L1a
            java.nio.channels.SelectableChannel r4 = r3.channel()     // Catch: java.lang.Exception -> L4c
            java.nio.channels.SelectionKey r4 = r4.keyFor(r1)     // Catch: java.lang.Exception -> L4c
            if (r4 == 0) goto L39
            goto L22
        L39:
            int r4 = r3.interestOps()     // Catch: java.lang.Exception -> L4c
            r3.cancel()     // Catch: java.lang.Exception -> L4c
            java.nio.channels.SelectableChannel r5 = r3.channel()     // Catch: java.lang.Exception -> L4c
            java.lang.Object r6 = r3.attachment()     // Catch: java.lang.Exception -> L4c
            r5.register(r1, r4, r6)     // Catch: java.lang.Exception -> L4c
            goto L22
        L4c:
            r7.b(r3)     // Catch: java.util.ConcurrentModificationException -> L1a
            goto L22
        L50:
            r7.f72595e = r1
            r0.close()     // Catch: java.lang.Throwable -> L56
            goto L5a
        L56:
            r0 = move-exception
            r0.printStackTrace()
        L5a:
            return
        L5b:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jboss.netty.channel.socket.nio.d.rebuildSelector():void");
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f72594d = Thread.currentThread();
        Selector selector = this.f72595e;
        if (selector == null) {
            return;
        }
        long j4 = (v.f72645d * 80) / 100;
        while (true) {
            boolean z4 = false;
            int i4 = 0;
            while (true) {
                this.f72596f.set(false);
                try {
                    long nanoTime = System.nanoTime();
                    int k4 = k(selector);
                    if (v.f72646e && k4 == 0 && !z4 && !this.f72596f.get()) {
                        if (System.nanoTime() - nanoTime < j4) {
                            boolean z5 = false;
                            for (SelectionKey selectionKey : selector.keys()) {
                                SelectableChannel channel = selectionKey.channel();
                                try {
                                    if (((channel instanceof DatagramChannel) && !((DatagramChannel) channel).isConnected()) || ((channel instanceof SocketChannel) && !((SocketChannel) channel).isConnected())) {
                                        try {
                                            selectionKey.cancel();
                                        } catch (CancelledKeyException unused) {
                                        }
                                        z5 = true;
                                    }
                                } catch (CancelledKeyException unused2) {
                                }
                            }
                            if (!z5) {
                                i4++;
                                if (i4 == 1024) {
                                    break;
                                }
                            }
                        }
                        i4 = 0;
                        if (i4 == 1024) {
                            break;
                        }
                    } else {
                        i4 = 0;
                    }
                    if (this.f72596f.get()) {
                        try {
                            selector.wakeup();
                            z4 = true;
                        } catch (Throwable th) {
                            th = th;
                            z4 = true;
                            th.printStackTrace();
                            try {
                                Thread.sleep(1000L);
                            } catch (InterruptedException unused3) {
                            }
                        }
                    } else {
                        z4 = false;
                    }
                    this.f72598h = 0;
                    i();
                    selector = this.f72595e;
                } catch (Throwable th2) {
                    th = th2;
                    th.printStackTrace();
                    Thread.sleep(1000L);
                }
                if (this.f72600j) {
                    this.f72595e = null;
                    i();
                    for (SelectionKey selectionKey2 : selector.keys()) {
                        b(selectionKey2);
                    }
                    try {
                        selector.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    this.f72599i.countDown();
                    return;
                }
                h(selector);
            }
            rebuildSelector();
            selector = this.f72595e;
        }
    }

    @Override // org.jboss.netty.channel.socket.nio.p
    public void shutdown() {
        if (!e()) {
            Selector selector = this.f72595e;
            this.f72600j = true;
            if (selector != null) {
                selector.wakeup();
            }
            try {
                this.f72599i.await();
                return;
            } catch (InterruptedException e5) {
                e5.printStackTrace();
                Thread.currentThread().interrupt();
                return;
            }
        }
        throw new IllegalStateException("Must not be called from a I/O-Thread to prevent deadlocks!");
    }

    @Override // org.jboss.netty.channel.socket.nio.p
    public void u(org.jboss.netty.channel.e eVar, org.jboss.netty.channel.j jVar) {
        j(c(eVar, jVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Executor executor, org.jboss.netty.util.d dVar) {
        this.f72592b = f72589k.incrementAndGet();
        this.f72596f = new AtomicBoolean();
        this.f72597g = new ConcurrentLinkedQueue();
        this.f72599i = new CountDownLatch(1);
        this.f72593c = executor;
        g(dVar);
    }
}

package org.jboss.netty.channel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
/* compiled from: DefaultChannelFuture.java */
/* loaded from: classes7.dex */
public class w implements j {

    /* renamed from: j  reason: collision with root package name */
    private static final Throwable f72675j = new Throwable();

    /* renamed from: k  reason: collision with root package name */
    private static volatile boolean f72676k = true;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f72677l;

    /* renamed from: b  reason: collision with root package name */
    private final e f72678b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f72679c;

    /* renamed from: d  reason: collision with root package name */
    private k f72680d;

    /* renamed from: e  reason: collision with root package name */
    private List<k> f72681e;

    /* renamed from: f  reason: collision with root package name */
    private List<l> f72682f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f72683g;

    /* renamed from: h  reason: collision with root package name */
    private Throwable f72684h;

    /* renamed from: i  reason: collision with root package name */
    private int f72685i;

    public w(e eVar, boolean z4) {
        this.f72678b = eVar;
        this.f72679c = z4;
    }

    private boolean f(long j4, boolean z4) throws InterruptedException {
        if (z4 && Thread.interrupted()) {
            throw new InterruptedException();
        }
        long nanoTime = j4 <= 0 ? 0L : System.nanoTime();
        boolean z5 = false;
        try {
            synchronized (this) {
                boolean z6 = this.f72683g;
                if (!z6 && j4 > 0) {
                    g();
                    this.f72685i++;
                    long j5 = j4;
                    do {
                        try {
                            wait(j5 / 1000000, (int) (j5 % 1000000));
                        } catch (InterruptedException e5) {
                            if (z4) {
                                throw e5;
                            }
                            z5 = true;
                        }
                        if (this.f72683g) {
                            this.f72685i--;
                            return true;
                        }
                        j5 = j4 - (System.nanoTime() - nanoTime);
                    } while (j5 > 0);
                    boolean z7 = this.f72683g;
                    this.f72685i--;
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                    return z7;
                }
                return z6;
            }
        } finally {
            if (0 != 0) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private static void g() {
        if (h() && org.jboss.netty.util.internal.c.f72822a.get() != null) {
            throw new IllegalStateException("await*() in I/O thread causes a dead lock or sudden performance drop. Use addListener() instead or call await*() from a different thread.");
        }
    }

    public static boolean h() {
        return f72676k;
    }

    private void i(k kVar) {
        try {
            kVar.a(this);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void j() {
        k kVar = this.f72680d;
        if (kVar != null) {
            i(kVar);
            this.f72680d = null;
            List<k> list = this.f72681e;
            if (list != null) {
                for (k kVar2 : list) {
                    i(kVar2);
                }
                this.f72681e = null;
            }
        }
    }

    private void k(l lVar, long j4, long j5, long j6) {
        try {
            lVar.c(this, j4, j5, j6);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void l() {
        Throwable a5 = a();
        if (a5 == null) {
            return;
        }
        if (!(a5 instanceof RuntimeException)) {
            if (a5 instanceof Error) {
                throw ((Error) a5);
            }
            throw new ChannelException(a5);
        }
        throw ((RuntimeException) a5);
    }

    public static void m(boolean z4) {
        if (!z4 && !f72677l) {
            f72677l = true;
        }
        f72676k = z4;
    }

    @Override // org.jboss.netty.channel.j
    public synchronized Throwable a() {
        Throwable th = this.f72684h;
        if (th != f72675j) {
            return th;
        }
        return null;
    }

    @Override // org.jboss.netty.channel.j
    public j await() throws InterruptedException {
        if (!Thread.interrupted()) {
            synchronized (this) {
                while (!this.f72683g) {
                    g();
                    this.f72685i++;
                    wait();
                    this.f72685i--;
                }
            }
            return this;
        }
        throw new InterruptedException();
    }

    @Override // org.jboss.netty.channel.j
    public j awaitUninterruptibly() {
        boolean z4;
        synchronized (this) {
            z4 = false;
            while (!this.f72683g) {
                g();
                this.f72685i++;
                try {
                    wait();
                    this.f72685i--;
                } catch (InterruptedException unused) {
                    this.f72685i--;
                    z4 = true;
                }
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return this;
    }

    @Override // org.jboss.netty.channel.j
    public void b(k kVar) {
        Objects.requireNonNull(kVar, "listener");
        boolean z4 = false;
        synchronized (this) {
            if (this.f72683g) {
                z4 = true;
            } else {
                if (this.f72680d == null) {
                    this.f72680d = kVar;
                } else {
                    if (this.f72681e == null) {
                        this.f72681e = new ArrayList(1);
                    }
                    this.f72681e.add(kVar);
                }
                if (kVar instanceof l) {
                    if (this.f72682f == null) {
                        this.f72682f = new ArrayList(1);
                    }
                    this.f72682f.add((l) kVar);
                }
            }
        }
        if (z4) {
            i(kVar);
        }
    }

    @Override // org.jboss.netty.channel.j
    public void c(k kVar) {
        Objects.requireNonNull(kVar, "listener");
        synchronized (this) {
            if (!this.f72683g) {
                if (kVar == this.f72680d) {
                    List<k> list = this.f72681e;
                    if (list != null && !list.isEmpty()) {
                        this.f72680d = this.f72681e.remove(0);
                    } else {
                        this.f72680d = null;
                    }
                } else {
                    List<k> list2 = this.f72681e;
                    if (list2 != null) {
                        list2.remove(kVar);
                    }
                }
                if (kVar instanceof l) {
                    this.f72682f.remove(kVar);
                }
            }
        }
    }

    @Override // org.jboss.netty.channel.j
    public boolean cancel() {
        if (this.f72679c) {
            synchronized (this) {
                if (this.f72683g) {
                    return false;
                }
                this.f72684h = f72675j;
                this.f72683g = true;
                if (this.f72685i > 0) {
                    notifyAll();
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override // org.jboss.netty.channel.j
    public boolean d(long j4, long j5, long j6) {
        synchronized (this) {
            if (this.f72683g) {
                return false;
            }
            List<l> list = this.f72682f;
            if (list != null && !list.isEmpty()) {
                for (l lVar : (l[]) list.toArray(new l[list.size()])) {
                    k(lVar, j4, j5, j6);
                }
                return true;
            }
            return true;
        }
    }

    @Override // org.jboss.netty.channel.j
    @Deprecated
    public j e() throws Exception {
        Throwable a5;
        if (isDone() && (a5 = a()) != null) {
            if (!(a5 instanceof Exception)) {
                if (a5 instanceof Error) {
                    throw ((Error) a5);
                }
                throw new RuntimeException(a5);
            }
            throw ((Exception) a5);
        }
        return this;
    }

    @Override // org.jboss.netty.channel.j
    public e getChannel() {
        return this.f72678b;
    }

    @Override // org.jboss.netty.channel.j
    public synchronized boolean isCancelled() {
        return this.f72684h == f72675j;
    }

    @Override // org.jboss.netty.channel.j
    public synchronized boolean isDone() {
        return this.f72683g;
    }

    @Override // org.jboss.netty.channel.j
    public synchronized boolean isSuccess() {
        boolean z4;
        if (this.f72683g) {
            z4 = this.f72684h == null;
        }
        return z4;
    }

    @Override // org.jboss.netty.channel.j
    public boolean setFailure(Throwable th) {
        synchronized (this) {
            if (this.f72683g) {
                return false;
            }
            this.f72684h = th;
            this.f72683g = true;
            if (this.f72685i > 0) {
                notifyAll();
            }
            j();
            return true;
        }
    }

    @Override // org.jboss.netty.channel.j
    public boolean setSuccess() {
        synchronized (this) {
            if (this.f72683g) {
                return false;
            }
            this.f72683g = true;
            if (this.f72685i > 0) {
                notifyAll();
            }
            j();
            return true;
        }
    }

    @Override // org.jboss.netty.channel.j
    public j sync() throws InterruptedException {
        await();
        l();
        return this;
    }

    @Override // org.jboss.netty.channel.j
    public j syncUninterruptibly() {
        awaitUninterruptibly();
        l();
        return this;
    }

    @Override // org.jboss.netty.channel.j
    public boolean await(long j4, TimeUnit timeUnit) throws InterruptedException {
        return f(timeUnit.toNanos(j4), true);
    }

    @Override // org.jboss.netty.channel.j
    public boolean awaitUninterruptibly(long j4, TimeUnit timeUnit) {
        try {
            return f(timeUnit.toNanos(j4), false);
        } catch (InterruptedException unused) {
            throw new InternalError();
        }
    }

    @Override // org.jboss.netty.channel.j
    public boolean await(long j4) throws InterruptedException {
        return f(TimeUnit.MILLISECONDS.toNanos(j4), true);
    }

    @Override // org.jboss.netty.channel.j
    public boolean awaitUninterruptibly(long j4) {
        try {
            return f(TimeUnit.MILLISECONDS.toNanos(j4), false);
        } catch (InterruptedException unused) {
            throw new InternalError();
        }
    }
}

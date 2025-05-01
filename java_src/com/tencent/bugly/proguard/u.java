package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private static u f62696a;

    /* renamed from: c  reason: collision with root package name */
    private final Context f62698c;

    /* renamed from: e  reason: collision with root package name */
    private long f62700e;

    /* renamed from: f  reason: collision with root package name */
    private long f62701f;

    /* renamed from: d  reason: collision with root package name */
    private Map<Integer, Long> f62699d = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private LinkedBlockingQueue<Runnable> f62702g = new LinkedBlockingQueue<>();

    /* renamed from: h  reason: collision with root package name */
    private LinkedBlockingQueue<Runnable> f62703h = new LinkedBlockingQueue<>();

    /* renamed from: i  reason: collision with root package name */
    private final Object f62704i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private int f62705j = 0;

    /* renamed from: b  reason: collision with root package name */
    private final p f62697b = p.a();

    private u(Context context) {
        this.f62698c = context;
    }

    static /* synthetic */ int b(u uVar) {
        int i4 = uVar.f62705j - 1;
        uVar.f62705j = i4;
        return i4;
    }

    private void c(int i4) {
        w a5 = w.a();
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        final LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        synchronized (this.f62704i) {
            x.c("[UploadManager] Try to poll all upload task need and put them into temp queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            int size = this.f62702g.size();
            final int size2 = this.f62703h.size();
            if (size == 0 && size2 == 0) {
                x.c("[UploadManager] There is no upload task in queue.", new Object[0]);
                return;
            }
            size2 = (a5 == null || !a5.c()) ? 0 : 0;
            for (int i5 = 0; i5 < size; i5++) {
                Runnable peek = this.f62702g.peek();
                if (peek == null) {
                    break;
                }
                linkedBlockingQueue.put(peek);
                this.f62702g.poll();
            }
            for (int i6 = 0; i6 < size2; i6++) {
                Runnable peek2 = this.f62703h.peek();
                if (peek2 == null) {
                    break;
                }
                linkedBlockingQueue2.put(peek2);
                this.f62703h.poll();
            }
            if (size > 0) {
                x.c("[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(size), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            }
            for (int i7 = 0; i7 < size; i7++) {
                final Runnable runnable = (Runnable) linkedBlockingQueue.poll();
                if (runnable == null) {
                    break;
                }
                synchronized (this.f62704i) {
                    if (this.f62705j >= 2 && a5 != null) {
                        a5.a(runnable);
                    } else {
                        x.a("[UploadManager] Create and start a new thread to execute a upload task: %s", "BUGLY_ASYNC_UPLOAD");
                        if (z.a(new Runnable() { // from class: com.tencent.bugly.proguard.u.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                runnable.run();
                                synchronized (u.this.f62704i) {
                                    u.b(u.this);
                                }
                            }
                        }, "BUGLY_ASYNC_UPLOAD") != null) {
                            synchronized (this.f62704i) {
                                this.f62705j++;
                            }
                        } else {
                            x.d("[UploadManager] Failed to start a thread to execute asynchronous upload task, will try again next time.", new Object[0]);
                            a(runnable, true);
                        }
                    }
                }
            }
            if (size2 > 0) {
                x.c("[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(size2), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            }
            if (a5 != null) {
                a5.a(new Runnable(this) { // from class: com.tencent.bugly.proguard.u.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable2;
                        for (int i8 = 0; i8 < size2 && (runnable2 = (Runnable) linkedBlockingQueue2.poll()) != null; i8++) {
                            runnable2.run();
                        }
                    }
                });
            }
        }
    }

    public static synchronized u a(Context context) {
        u uVar;
        synchronized (u.class) {
            if (f62696a == null) {
                f62696a = new u(context);
            }
            uVar = f62696a;
        }
        return uVar;
    }

    public final boolean b(int i4) {
        if (com.tencent.bugly.b.f62193c) {
            x.c("Uploading frequency will not be checked if SDK is in debug mode.", new Object[0]);
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - a(i4);
        x.c("[UploadManager] Time interval is %d seconds since last uploading(ID: %d).", Long.valueOf(currentTimeMillis / 1000), Integer.valueOf(i4));
        if (currentTimeMillis < 30000) {
            x.a("[UploadManager] Data only be uploaded once in %d seconds.", 30L);
            return false;
        }
        return true;
    }

    public static synchronized u a() {
        u uVar;
        synchronized (u.class) {
            uVar = f62696a;
        }
        return uVar;
    }

    public final void a(int i4, am amVar, String str, String str2, t tVar, long j4, boolean z4) {
        try {
            try {
                a(new v(this.f62698c, i4, amVar.f62554g, a.a((Object) amVar), str, str2, tVar, true, z4), true, true, j4);
            } catch (Throwable th) {
                th = th;
                if (x.a(th)) {
                    return;
                }
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void a(int i4, am amVar, String str, String str2, t tVar, boolean z4) {
        try {
            try {
                a(new v(this.f62698c, i4, amVar.f62554g, a.a((Object) amVar), str, str2, tVar, 0, 0, false, null), z4, false, 0L);
            } catch (Throwable th) {
                th = th;
                if (x.a(th)) {
                    return;
                }
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final long a(boolean z4) {
        long j4;
        long b5 = z.b();
        int i4 = z4 ? 5 : 3;
        List<r> a5 = this.f62697b.a(i4);
        if (a5 != null && a5.size() > 0) {
            j4 = 0;
            try {
                r rVar = a5.get(0);
                if (rVar.f62690e >= b5) {
                    j4 = z.b(rVar.f62692g);
                    if (i4 == 3) {
                        this.f62700e = j4;
                    } else {
                        this.f62701f = j4;
                    }
                    a5.remove(rVar);
                }
            } catch (Throwable th) {
                x.a(th);
            }
            if (a5.size() > 0) {
                this.f62697b.a(a5);
            }
        } else {
            j4 = z4 ? this.f62701f : this.f62700e;
        }
        x.c("[UploadManager] Local network consume: %d KB", Long.valueOf(j4 / 1024));
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void a(long j4, boolean z4) {
        int i4 = z4 ? 5 : 3;
        r rVar = new r();
        rVar.f62687b = i4;
        rVar.f62690e = z.b();
        rVar.f62688c = "";
        rVar.f62689d = "";
        rVar.f62692g = z.c(j4);
        this.f62697b.b(i4);
        this.f62697b.a(rVar);
        if (z4) {
            this.f62701f = j4;
        } else {
            this.f62700e = j4;
        }
        x.c("[UploadManager] Network total consume: %d KB", Long.valueOf(j4 / 1024));
    }

    public final synchronized void a(int i4, long j4) {
        if (i4 < 0) {
            x.e("[UploadManager] Unknown uploading ID: %d", Integer.valueOf(i4));
            return;
        }
        this.f62699d.put(Integer.valueOf(i4), Long.valueOf(j4));
        r rVar = new r();
        rVar.f62687b = i4;
        rVar.f62690e = j4;
        rVar.f62688c = "";
        rVar.f62689d = "";
        rVar.f62692g = new byte[0];
        this.f62697b.b(i4);
        this.f62697b.a(rVar);
        x.c("[UploadManager] Uploading(ID:%d) time: %s", Integer.valueOf(i4), z.a(j4));
    }

    public final synchronized long a(int i4) {
        if (i4 >= 0) {
            Long l4 = this.f62699d.get(Integer.valueOf(i4));
            if (l4 != null) {
                return l4.longValue();
            }
        } else {
            x.e("[UploadManager] Unknown upload ID: %d", Integer.valueOf(i4));
        }
        return 0L;
    }

    private boolean a(Runnable runnable, boolean z4) {
        if (runnable == null) {
            x.a("[UploadManager] Upload task should not be null", new Object[0]);
            return false;
        }
        try {
            x.c("[UploadManager] Add upload task to queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            synchronized (this.f62704i) {
                if (z4) {
                    this.f62702g.put(runnable);
                } else {
                    this.f62703h.put(runnable);
                }
            }
            return true;
        } catch (Throwable th) {
            x.e("[UploadManager] Failed to add upload task to queue: %s", th.getMessage());
            return false;
        }
    }

    private void a(Runnable runnable, boolean z4, boolean z5, long j4) {
        if (runnable == null) {
            x.d("[UploadManager] Upload task should not be null", new Object[0]);
        }
        x.c("[UploadManager] Add upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (!z5) {
            a(runnable, z4);
            c(0);
        } else if (runnable == null) {
            x.d("[UploadManager] Upload task should not be null", new Object[0]);
        } else {
            x.c("[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            Thread a5 = z.a(runnable, "BUGLY_SYNC_UPLOAD");
            if (a5 == null) {
                x.e("[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue.", new Object[0]);
                a(runnable, true);
                return;
            }
            try {
                a5.join(j4);
            } catch (Throwable th) {
                x.e("[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue.", th.getMessage());
                a(runnable, true);
                c(0);
            }
        }
    }
}

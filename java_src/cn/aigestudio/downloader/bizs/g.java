package cn.aigestudio.downloader.bizs;

import android.content.Context;
import android.text.TextUtils;
import com.github.snowdream.android.app.downloader.DownloadTask;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: DLManager.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    private static final String f442c = "g";

    /* renamed from: d  reason: collision with root package name */
    private static final int f443d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f444e;

    /* renamed from: f  reason: collision with root package name */
    private static final int f445f;

    /* renamed from: g  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f446g;

    /* renamed from: h  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f447h;

    /* renamed from: i  reason: collision with root package name */
    private static final ThreadFactory f448i;

    /* renamed from: j  reason: collision with root package name */
    private static final ThreadFactory f449j;

    /* renamed from: k  reason: collision with root package name */
    private static final ExecutorService f450k;

    /* renamed from: l  reason: collision with root package name */
    private static final ExecutorService f451l;

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap<String, f> f452m;

    /* renamed from: n  reason: collision with root package name */
    private static final List<f> f453n;

    /* renamed from: o  reason: collision with root package name */
    private static final ConcurrentHashMap<String, f> f454o;

    /* renamed from: p  reason: collision with root package name */
    private static g f455p;

    /* renamed from: a  reason: collision with root package name */
    private Context f456a;

    /* renamed from: b  reason: collision with root package name */
    private int f457b = 3;

    /* compiled from: DLManager.java */
    /* loaded from: classes2.dex */
    class a implements ThreadFactory {

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f458b = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "DLTask #" + this.f458b.getAndIncrement());
        }
    }

    /* compiled from: DLManager.java */
    /* loaded from: classes2.dex */
    class b implements ThreadFactory {

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f459b = new AtomicInteger(1);

        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "DLThread #" + this.f459b.getAndIncrement());
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f443d = availableProcessors;
        f444e = availableProcessors + 1;
        f445f = (availableProcessors * 2) + 1;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(56);
        f446g = linkedBlockingQueue;
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue(256);
        f447h = linkedBlockingQueue2;
        a aVar = new a();
        f448i = aVar;
        b bVar = new b();
        f449j = bVar;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f450k = new ThreadPoolExecutor(3, 3, 3L, timeUnit, linkedBlockingQueue, aVar);
        f451l = new ThreadPoolExecutor(3, 3, 2L, timeUnit, linkedBlockingQueue2, bVar);
        f452m = new ConcurrentHashMap<>();
        f453n = Collections.synchronizedList(new ArrayList());
        f454o = new ConcurrentHashMap<>();
    }

    private g(Context context) {
        this.f456a = context;
    }

    public static g q(Context context) {
        if (f455p == null) {
            f455p = new g(context);
        }
        return f455p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized g a() {
        List<f> list = f453n;
        if (!list.isEmpty()) {
            ConcurrentHashMap<String, f> concurrentHashMap = f452m;
            if (concurrentHashMap.size() < this.f457b) {
                f remove = list.remove(0);
                concurrentHashMap.put(remove.f426e, remove);
                f450k.execute(new h(this.f456a, remove));
            }
        }
        return f455p;
    }

    public synchronized g b(i iVar) {
        f451l.execute(iVar);
        return f455p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized g c(f fVar) {
        f454o.put(fVar.f426e, fVar);
        return f455p;
    }

    public void d(String str) {
        f b5;
        ConcurrentHashMap<String, f> concurrentHashMap = f452m;
        if (concurrentHashMap.containsKey(str)) {
            b5 = concurrentHashMap.remove(str);
        } else {
            b5 = c.k(this.f456a).b(str);
        }
        if (b5 != null) {
            b5.f441t = true;
        }
        if (b5 != null && b5.f425d != null) {
            File file = new File(b5.f425d);
            if (file.exists()) {
                file.delete();
            }
        }
        c.k(this.f456a).h(str);
        c.k(this.f456a).i(str);
        n(str);
    }

    public void e(String str) {
        f454o.remove(str);
    }

    public void f() {
        f453n.clear();
    }

    public void g() {
        for (String str : f452m.keySet()) {
            f fVar = f452m.get(str);
            if (!fVar.f437p.isEmpty()) {
                for (j jVar : fVar.f437p) {
                    c.k(this.f456a).f(jVar);
                    jVar.f476g = true;
                    c.k(this.f456a).d(fVar);
                }
            }
        }
    }

    public void h(String str) {
        l(str, "", "", null, null);
    }

    public void i(String str, d.b bVar) {
        l(str, "", "", null, bVar);
    }

    public void j(String str, String str2, d.b bVar) {
        l(str, str2, "", null, bVar);
    }

    public void k(String str, String str2, String str3, d.b bVar) {
        l(str, str2, str3, null, bVar);
    }

    public synchronized void l(String str, String str2, String str3, List<e> list, d.b bVar) {
        f b5;
        boolean z4 = false;
        boolean z5 = bVar != null;
        if (TextUtils.isEmpty(str)) {
            if (z5) {
                bVar.g(str, 2, "Url can not be null.");
            }
        } else if (k.d(this.f456a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("TASK_DLING.size=");
            ConcurrentHashMap<String, f> concurrentHashMap = f452m;
            sb.append(concurrentHashMap.size());
            sb.append(";dlStart.url=");
            sb.append(str);
            for (String str4 : concurrentHashMap.keySet()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("key=");
                sb2.append(str4);
            }
            ConcurrentHashMap<String, f> concurrentHashMap2 = f452m;
            if (concurrentHashMap2.get(str) != null) {
                return;
            }
            if (concurrentHashMap2.containsKey(str)) {
                return;
            }
            ConcurrentHashMap<String, f> concurrentHashMap3 = f454o;
            if (concurrentHashMap3.containsKey(str)) {
                boolean z6 = cn.aigestudio.downloader.bizs.a.f357a;
                b5 = concurrentHashMap3.remove(str);
            } else {
                boolean z7 = cn.aigestudio.downloader.bizs.a.f357a;
                b5 = c.k(this.f456a).b(str);
                if (b5 != null) {
                    boolean z8 = cn.aigestudio.downloader.bizs.a.f357a;
                    b5.f437p.clear();
                    b5.f437p.addAll(c.k(this.f456a).j(str));
                    if (b5.f437p.size() == 0) {
                        b5 = null;
                    }
                }
            }
            if (b5 == null) {
                boolean z9 = cn.aigestudio.downloader.bizs.a.f357a;
                b5 = new f();
                b5.f426e = str;
                b5.f427f = str;
                if (TextUtils.isEmpty(str2)) {
                    str2 = this.f456a.getCacheDir().getAbsolutePath();
                }
                b5.f425d = str2.replace(".zip", "");
                b5.f424c = str3;
            } else {
                b5.f431j = true;
                for (j jVar : b5.f437p) {
                    jVar.f474e = false;
                }
            }
            b5.f429h = 0;
            b5.f436o = k.c(list, b5);
            b5.f438q = bVar;
            b5.f430i = z5;
            ConcurrentHashMap<String, f> concurrentHashMap4 = f452m;
            if (concurrentHashMap4.size() >= this.f457b) {
                boolean z10 = cn.aigestudio.downloader.bizs.a.f357a;
                for (f fVar : f453n) {
                    if (fVar.f426e.equals(b5.f426e)) {
                        z4 = true;
                    }
                }
                if (!z4) {
                    f453n.add(b5);
                }
                if (z5) {
                    bVar.a(str);
                }
                if (cn.aigestudio.downloader.bizs.a.f357a) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("TASK_PREPARE size is ");
                    sb3.append(f453n.size());
                }
            } else {
                if (cn.aigestudio.downloader.bizs.a.f357a) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Prepare download from ");
                    sb4.append(b5.f426e);
                }
                if (z5) {
                    bVar.onPrepare();
                }
                concurrentHashMap4.put(str, b5);
                f450k.execute(new h(this.f456a, b5));
            }
        } else if (z5) {
            bVar.g(str, 0, "Network is not available.");
        }
    }

    public synchronized boolean m(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("mehtod dlStop() called.url=");
        sb.append(str);
        Iterator<f> it2 = f453n.iterator();
        while (it2.hasNext()) {
            f next = it2.next();
            if (next.f426e.equals(str)) {
                it2.remove();
                if (next.f430i) {
                    next.f438q.e(str, -2L);
                    return true;
                }
            }
        }
        ConcurrentHashMap<String, f> concurrentHashMap = f452m;
        if (concurrentHashMap.containsKey(str)) {
            f fVar = concurrentHashMap.get(str);
            if (!fVar.f437p.isEmpty()) {
                for (j jVar : fVar.f437p) {
                    jVar.f474e = true;
                }
                return true;
            }
            fVar.f440s = true;
        }
        return false;
    }

    public synchronized void n(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("mehtod dlStopDel() called.url=");
        sb.append(str);
        Iterator<f> it2 = f453n.iterator();
        while (it2.hasNext()) {
            f next = it2.next();
            if (next.f426e.equals(str)) {
                it2.remove();
                if (next.f430i) {
                    next.f438q.e(str, -1L);
                }
            }
        }
        ConcurrentHashMap<String, f> concurrentHashMap = f452m;
        if (concurrentHashMap.containsKey(str)) {
            f fVar = concurrentHashMap.get(str);
            if (!fVar.f437p.isEmpty()) {
                for (j jVar : fVar.f437p) {
                    jVar.f474e = true;
                }
            }
        }
        f454o.remove(str);
    }

    @Deprecated
    public c o() {
        return c.k(this.f456a);
    }

    public f p(String str) {
        return c.k(this.f456a).b(str);
    }

    public void r(DownloadTask downloadTask) {
        StringBuilder sb = new StringBuilder();
        sb.append("method recoveryTaskInfo() called.url=");
        sb.append(downloadTask.getUrl());
        f452m.clear();
        f454o.clear();
        f b5 = c.k(this.f456a).b(downloadTask.getUrl());
        if (b5 == null) {
            c.k(this.f456a).i(downloadTask.getUrl());
            return;
        }
        List<j> j4 = c.k(this.f456a).j(downloadTask.getUrl());
        File file = new File(b5.f425d);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("check file :");
        sb2.append(b5.f425d);
        if (file.exists() && file.isFile()) {
            b5.f423b.set(file.length());
            c.k(this.f456a).d(b5);
        }
        if (j4 == null || j4.size() <= 0) {
            return;
        }
        j4.get(0).f472c = b5.f423b.get();
        j4.get(0).f476g = true;
        c.k(this.f456a).f(j4.get(0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized g s(String str, int i4) {
        List<j> list;
        StringBuilder sb = new StringBuilder();
        sb.append("removeDLTask() called.url=");
        sb.append(str);
        sb.append(";type=");
        sb.append(i4);
        f remove = f452m.remove(str);
        if (remove != null && (list = remove.f437p) != null && list.size() > 0) {
            for (j jVar : remove.f437p) {
                jVar.f474e = true;
            }
        }
        return f455p;
    }

    public g t(boolean z4) {
        cn.aigestudio.downloader.bizs.a.f357a = z4;
        return f455p;
    }

    public g u(int i4) {
        this.f457b = i4;
        return f455p;
    }
}

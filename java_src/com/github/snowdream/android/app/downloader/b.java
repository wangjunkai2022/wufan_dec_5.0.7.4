package com.github.snowdream.android.app.downloader;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: CommonDownloadFactory.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: f  reason: collision with root package name */
    private static b f13059f;

    /* renamed from: a  reason: collision with root package name */
    InterfaceC0290b f13060a;

    /* renamed from: b  reason: collision with root package name */
    private List<InterfaceC0290b> f13061b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c  reason: collision with root package name */
    private Map<String, c> f13062c = new ConcurrentHashMap(0);

    /* renamed from: d  reason: collision with root package name */
    private ThreadPoolExecutor f13063d = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

    /* renamed from: e  reason: collision with root package name */
    private Handler f13064e = new a();

    /* compiled from: CommonDownloadFactory.java */
    /* loaded from: classes3.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            synchronized (b.this.f13061b) {
                if (b.this.f13060a == null) {
                    return;
                }
                String obj = message.obj.toString();
                InterfaceC0290b interfaceC0290b = b.this.f13060a;
                int i4 = message.what;
                if (i4 == 2) {
                    interfaceC0290b.onStart(message.obj.toString());
                } else if (i4 == 4) {
                    interfaceC0290b.onError(obj);
                    b.this.l(obj);
                } else if (i4 == 3) {
                    interfaceC0290b.onStop(obj);
                    b.this.l(obj);
                } else if (i4 == 1) {
                    interfaceC0290b.onFinish(message.obj.toString());
                    b.this.l(obj);
                } else if (i4 == 7) {
                    interfaceC0290b.updateSize("url", Long.parseLong(message.obj.toString()));
                } else if (i4 == 5) {
                    try {
                        String[] split = message.obj.toString().split(";");
                        interfaceC0290b.onProgress(split[0], Integer.parseInt(split[2]), split[1]);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
    }

    /* compiled from: CommonDownloadFactory.java */
    /* renamed from: com.github.snowdream.android.app.downloader.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0290b {
        void onError(String str);

        void onFinish(String str);

        void onProgress(String str, int i4, String str2);

        void onStart(String str);

        void onStop(String str);

        void onWait(String str);

        void updateSize(String str, long j4);
    }

    private b() {
    }

    public static b e() {
        if (f13059f == null) {
            f13059f = new b();
        }
        return f13059f;
    }

    public String b(c cVar) {
        if (this.f13062c == null) {
            return null;
        }
        if (cVar == null || cVar.l() == null || cVar.l().equals("")) {
            return "";
        }
        String l4 = cVar.l();
        if (this.f13062c.get(cVar.l()) != null) {
            return l4;
        }
        cVar.r(this.f13064e);
        Message obtain = Message.obtain();
        obtain.obj = l4;
        obtain.what = 6;
        this.f13064e.sendMessage(obtain);
        synchronized (this.f13062c) {
            this.f13062c.put(l4, cVar);
        }
        this.f13063d.execute(cVar);
        return l4;
    }

    public void c(String str) {
        c cVar = this.f13062c.get(str);
        if (cVar != null) {
            cVar.e();
        }
    }

    public void d() {
        this.f13062c.clear();
    }

    public InterfaceC0290b f() {
        InterfaceC0290b interfaceC0290b;
        synchronized (this.f13061b) {
            interfaceC0290b = this.f13060a;
        }
        return interfaceC0290b;
    }

    public int g() {
        Map<String, c> map = this.f13062c;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public void h() {
        this.f13063d.purge();
        this.f13063d.getQueue();
    }

    public void i() {
        Map<String, c> map = this.f13062c;
        if (map == null) {
            return;
        }
        for (String str : map.keySet()) {
            this.f13063d.remove(this.f13062c.get(str));
            if (this.f13062c.get(str) != null) {
                this.f13062c.get(str).e();
                this.f13062c.remove(str);
            }
        }
    }

    public void j(InterfaceC0290b interfaceC0290b) {
        synchronized (this.f13061b) {
            Iterator<InterfaceC0290b> it2 = this.f13061b.iterator();
            while (it2.hasNext()) {
                if (interfaceC0290b == it2.next()) {
                    it2.remove();
                }
            }
        }
    }

    public void k(String str) {
        this.f13063d.remove(this.f13062c.get(str));
    }

    public void l(String str) {
        Map<String, c> map = this.f13062c;
        if (map == null) {
            return;
        }
        synchronized (map) {
            if (this.f13060a != null && this.f13062c.get(str) != null) {
                this.f13062c.get(str).e();
                this.f13062c.remove(str);
            }
        }
    }

    public void m(InterfaceC0290b interfaceC0290b) {
        synchronized (this.f13061b) {
            this.f13060a = interfaceC0290b;
        }
    }

    public synchronized void n() {
        Map<String, c> map;
        try {
            this.f13063d.shutdownNow();
            this.f13063d.awaitTermination(1L, TimeUnit.MILLISECONDS);
            this.f13063d = null;
            map = this.f13062c;
        } catch (InterruptedException e5) {
            e5.printStackTrace();
            this.f13063d = null;
            Map<String, c> map2 = this.f13062c;
            if (map2 == null) {
                return;
            }
            map2.clear();
        }
        if (map == null) {
            return;
        }
        map.clear();
        this.f13062c = null;
    }
}

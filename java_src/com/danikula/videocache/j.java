package com.danikula.videocache;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HttpProxyCacheServerClients.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f10100a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    private final String f10101b;

    /* renamed from: c  reason: collision with root package name */
    private volatile g f10102c;

    /* renamed from: d  reason: collision with root package name */
    private final List<d> f10103d;

    /* renamed from: e  reason: collision with root package name */
    private final d f10104e;

    /* renamed from: f  reason: collision with root package name */
    private final e f10105f;

    /* compiled from: HttpProxyCacheServerClients.java */
    /* loaded from: classes2.dex */
    private static final class a extends Handler implements d {

        /* renamed from: b  reason: collision with root package name */
        private final String f10106b;

        /* renamed from: c  reason: collision with root package name */
        private final List<d> f10107c;

        public a(String str, List<d> list) {
            super(Looper.getMainLooper());
            this.f10106b = str;
            this.f10107c = list;
        }

        @Override // com.danikula.videocache.d
        public void g(File file, String str, int i4) {
            Message obtainMessage = obtainMessage();
            obtainMessage.arg1 = i4;
            obtainMessage.obj = file;
            sendMessage(obtainMessage);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            for (d dVar : this.f10107c) {
                dVar.g((File) message.obj, this.f10106b, message.arg1);
            }
        }
    }

    public j(String str, e eVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f10103d = copyOnWriteArrayList;
        this.f10101b = (String) n.d(str);
        this.f10105f = (e) n.d(eVar);
        this.f10104e = new a(str, copyOnWriteArrayList);
    }

    private synchronized void a() {
        if (this.f10100a.decrementAndGet() <= 0) {
            this.f10102c.m();
            this.f10102c = null;
        }
    }

    private g c() throws ProxyCacheException {
        String str = this.f10101b;
        e eVar = this.f10105f;
        g gVar = new g(new k(str, eVar.f10058d, eVar.f10059e), new com.danikula.videocache.file.b(this.f10105f.a(this.f10101b), this.f10105f.f10057c));
        gVar.t(this.f10104e);
        return gVar;
    }

    private synchronized void g() throws ProxyCacheException {
        this.f10102c = this.f10102c == null ? c() : this.f10102c;
    }

    public int b() {
        return this.f10100a.get();
    }

    public void d(f fVar, Socket socket) throws ProxyCacheException, IOException {
        g();
        try {
            this.f10100a.incrementAndGet();
            this.f10102c.s(fVar, socket);
        } finally {
            a();
        }
    }

    public void e(d dVar) {
        this.f10103d.add(dVar);
    }

    public void f() {
        this.f10103d.clear();
        if (this.f10102c != null) {
            this.f10102c.t(null);
            this.f10102c.m();
            this.f10102c = null;
        }
        this.f10100a.set(0);
    }

    public void h(d dVar) {
        this.f10103d.remove(dVar);
    }
}

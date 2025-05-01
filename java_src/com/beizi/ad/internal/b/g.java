package com.beizi.ad.internal.b;

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
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f5805a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    private final String f5806b;

    /* renamed from: c  reason: collision with root package name */
    private volatile e f5807c;

    /* renamed from: d  reason: collision with root package name */
    private final List<b> f5808d;

    /* renamed from: e  reason: collision with root package name */
    private final b f5809e;

    /* renamed from: f  reason: collision with root package name */
    private final c f5810f;

    /* compiled from: HttpProxyCacheServerClients.java */
    /* loaded from: classes2.dex */
    private static final class a extends Handler implements b {

        /* renamed from: a  reason: collision with root package name */
        private final String f5811a;

        /* renamed from: b  reason: collision with root package name */
        private final List<b> f5812b;

        public a(String str, List<b> list) {
            super(Looper.getMainLooper());
            this.f5811a = str;
            this.f5812b = list;
        }

        @Override // com.beizi.ad.internal.b.b
        public void a(File file, String str, int i4) {
            Message obtainMessage = obtainMessage();
            obtainMessage.arg1 = i4;
            obtainMessage.obj = file;
            sendMessage(obtainMessage);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            for (b bVar : this.f5812b) {
                bVar.a((File) message.obj, this.f5811a, message.arg1);
            }
        }
    }

    public g(String str, c cVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f5808d = copyOnWriteArrayList;
        this.f5806b = (String) k.a(str);
        this.f5810f = (c) k.a(cVar);
        this.f5809e = new a(str, copyOnWriteArrayList);
    }

    private synchronized void b() throws m {
        this.f5807c = this.f5807c == null ? d() : this.f5807c;
    }

    private synchronized void c() {
        if (this.f5805a.decrementAndGet() <= 0) {
            this.f5807c.a();
            this.f5807c = null;
        }
    }

    private e d() throws m {
        e eVar = new e(new h(this.f5806b, this.f5810f.f5780d), new com.beizi.ad.internal.b.a.b(this.f5810f.a(this.f5806b), this.f5810f.f5779c));
        eVar.a(this.f5809e);
        return eVar;
    }

    public void a(d dVar, Socket socket) throws m, IOException {
        b();
        try {
            this.f5805a.incrementAndGet();
            this.f5807c.a(dVar, socket);
        } finally {
            c();
        }
    }

    public int a() {
        return this.f5805a.get();
    }
}

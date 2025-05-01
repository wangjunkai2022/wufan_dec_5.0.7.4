package com.kwad.sdk.ip.direct;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.kwad.sdk.utils.bo;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes5.dex */
public final class b {
    private static Handler aJC = new Handler(Looper.getMainLooper());
    static int aJM = 80;
    static int port = 80;

    /* loaded from: classes5.dex */
    static class a extends Thread {
        LinkedList aJO = new LinkedList();
        volatile boolean aJP = false;
        Selector aJN = Selector.open();

        a() {
            setName("Connector");
        }

        private void Jy() {
            synchronized (this.aJO) {
                while (this.aJO.size() > 0) {
                    C0537b c0537b = (C0537b) this.aJO.removeFirst();
                    c0537b.aJT.register(this.aJN, 8, c0537b);
                }
            }
        }

        private void Jz() {
            Iterator<SelectionKey> it2 = this.aJN.selectedKeys().iterator();
            while (it2.hasNext()) {
                SelectionKey next = it2.next();
                it2.remove();
                C0537b c0537b = (C0537b) next.attachment();
                SocketChannel socketChannel = (SocketChannel) next.channel();
                try {
                    if (socketChannel.finishConnect()) {
                        next.cancel();
                        c0537b.aJY = SystemClock.elapsedRealtime();
                        socketChannel.close();
                    }
                } catch (Throwable th) {
                    bo.c(socketChannel);
                    c0537b.aJU = th;
                }
            }
        }

        final void a(C0537b c0537b) {
            final SocketChannel socketChannel;
            try {
                socketChannel = SocketChannel.open();
            } catch (Throwable th) {
                th = th;
                socketChannel = null;
            }
            try {
                socketChannel.configureBlocking(false);
                boolean connect = socketChannel.connect(c0537b.aJS);
                c0537b.aJT = socketChannel;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                c0537b.aJX = elapsedRealtime;
                if (connect) {
                    c0537b.aJY = elapsedRealtime;
                    bo.c(socketChannel);
                } else {
                    synchronized (this.aJO) {
                        this.aJO.add(c0537b);
                    }
                    Selector selector = this.aJN;
                    if (selector != null) {
                        try {
                            selector.wakeup();
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    bo.c(socketChannel);
                    c0537b.aJU = th;
                    try {
                        b.aJC.postDelayed(new Runnable() { // from class: com.kwad.sdk.ip.direct.b.a.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                bo.c(socketChannel);
                            }
                        }, c0537b.aJW);
                    } catch (Throwable unused2) {
                    }
                } finally {
                    try {
                        b.aJC.postDelayed(new Runnable() { // from class: com.kwad.sdk.ip.direct.b.a.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                bo.c(socketChannel);
                            }
                        }, c0537b.aJW);
                    } catch (Throwable unused3) {
                    }
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    if (this.aJN.select() > 0) {
                        Jz();
                    }
                    Jy();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (this.aJP) {
                    Selector selector = this.aJN;
                    if (selector != null) {
                        try {
                            selector.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                }
                continue;
            }
        }

        final void shutdown() {
            this.aJP = true;
            Selector selector = this.aJN;
            if (selector != null) {
                try {
                    selector.wakeup();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.sdk.ip.direct.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0537b {
        InetSocketAddress aJS;
        SocketChannel aJT;
        Throwable aJU;
        private float aJV;
        long aJW;
        long aJX;
        long aJY = 0;
        boolean aJZ = false;
        private boolean success;

        C0537b(String str) {
            try {
                this.aJS = new InetSocketAddress(InetAddress.getByName(str), b.port);
            } catch (Throwable th) {
                this.aJU = th;
            }
        }

        final void JA() {
            String str;
            if (this.aJY != 0) {
                str = Long.toString(this.aJY - this.aJX) + "ms";
                this.aJV = (float) (this.aJY - this.aJX);
                this.success = true;
            } else {
                Throwable th = this.aJU;
                if (th != null) {
                    str = th.toString();
                    this.success = false;
                } else {
                    this.success = false;
                    str = "Timed out";
                }
            }
            com.kwad.sdk.core.e.c.d("IpDirect_Ping", this.aJS + " : " + str);
            this.aJZ = true;
        }
    }

    public static c f(String str, long j4) {
        a aVar;
        long j5 = j4 / 5;
        com.kwad.sdk.core.e.c.d("IpDirect_Ping", "ping:" + str);
        c cVar = new c(str);
        try {
            aVar = new a();
        } catch (Throwable th) {
            th.printStackTrace();
            aVar = null;
        }
        if (aVar == null) {
            return cVar;
        }
        try {
            aVar.start();
            LinkedList linkedList = new LinkedList();
            for (int i4 = 0; i4 < cVar.JB(); i4++) {
                C0537b c0537b = new C0537b(str);
                c0537b.aJW = j4 + j5;
                linkedList.add(c0537b);
                try {
                    aVar.a(c0537b);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            try {
                Thread.sleep(j4 + j5);
                try {
                    aVar.shutdown();
                    aVar.join();
                    float f5 = 0.0f;
                    Iterator it2 = linkedList.iterator();
                    boolean z4 = true;
                    while (it2.hasNext()) {
                        C0537b c0537b2 = (C0537b) it2.next();
                        c0537b2.JA();
                        z4 &= c0537b2.success;
                        cVar.bC(z4);
                        f5 += c0537b2.aJV;
                    }
                    com.kwad.sdk.core.e.c.d("IpDirect_Ping", "sum:" + f5 + "*size:" + linkedList.size());
                    cVar.k(f5 / ((float) linkedList.size()));
                    return cVar;
                } catch (Throwable th3) {
                    th3.printStackTrace();
                    return cVar;
                }
            } catch (Throwable th4) {
                th4.printStackTrace();
                return cVar;
            }
        } catch (Throwable th5) {
            th5.printStackTrace();
            return cVar;
        }
    }
}

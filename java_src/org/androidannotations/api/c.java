package org.androidannotations.api;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewDebug;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ViewServer.java */
/* loaded from: classes7.dex */
public class c implements Runnable {

    /* renamed from: k  reason: collision with root package name */
    private static final int f72061k = 4939;

    /* renamed from: l  reason: collision with root package name */
    private static final int f72062l = 10;

    /* renamed from: m  reason: collision with root package name */
    private static final String f72063m = "user";

    /* renamed from: n  reason: collision with root package name */
    private static final String f72064n = "ViewServer";

    /* renamed from: o  reason: collision with root package name */
    private static final String f72065o = "4";

    /* renamed from: p  reason: collision with root package name */
    private static final String f72066p = "4";

    /* renamed from: q  reason: collision with root package name */
    private static final String f72067q = "PROTOCOL";

    /* renamed from: r  reason: collision with root package name */
    private static final String f72068r = "SERVER";

    /* renamed from: s  reason: collision with root package name */
    private static final String f72069s = "LIST";

    /* renamed from: t  reason: collision with root package name */
    private static final String f72070t = "AUTOLIST";

    /* renamed from: u  reason: collision with root package name */
    private static final String f72071u = "GET_FOCUS";

    /* renamed from: v  reason: collision with root package name */
    private static c f72072v;

    /* renamed from: b  reason: collision with root package name */
    private ServerSocket f72073b;

    /* renamed from: c  reason: collision with root package name */
    private final int f72074c;

    /* renamed from: d  reason: collision with root package name */
    private Thread f72075d;

    /* renamed from: e  reason: collision with root package name */
    private ExecutorService f72076e;

    /* renamed from: f  reason: collision with root package name */
    private final List<e> f72077f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<View, String> f72078g;

    /* renamed from: h  reason: collision with root package name */
    private final ReentrantReadWriteLock f72079h;

    /* renamed from: i  reason: collision with root package name */
    private View f72080i;

    /* renamed from: j  reason: collision with root package name */
    private final ReentrantReadWriteLock f72081j;

    /* compiled from: ViewServer.java */
    /* loaded from: classes7.dex */
    private static final class b extends c {
        @Override // org.androidannotations.api.c
        public void h(Activity activity) {
        }

        @Override // org.androidannotations.api.c
        public void i(View view, String str) {
        }

        @Override // org.androidannotations.api.c
        public boolean n() {
            return false;
        }

        @Override // org.androidannotations.api.c
        public void o(Activity activity) {
        }

        @Override // org.androidannotations.api.c
        public void p(View view) {
        }

        @Override // org.androidannotations.api.c
        public void r(Activity activity) {
        }

        @Override // org.androidannotations.api.c, java.lang.Runnable
        public void run() {
        }

        @Override // org.androidannotations.api.c
        public void s(View view) {
        }

        @Override // org.androidannotations.api.c
        public boolean t() throws IOException {
            return false;
        }

        @Override // org.androidannotations.api.c
        public boolean v() {
            return false;
        }

        private b() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewServer.java */
    /* renamed from: org.androidannotations.api.c$c  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0793c extends OutputStream {

        /* renamed from: b  reason: collision with root package name */
        private final OutputStream f72082b;

        C0793c(OutputStream outputStream) {
            this.f72082b = outputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public boolean equals(Object obj) {
            return this.f72082b.equals(obj);
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f72082b.flush();
        }

        public int hashCode() {
            return this.f72082b.hashCode();
        }

        public String toString() {
            return this.f72082b.toString();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i4, int i5) throws IOException {
            this.f72082b.write(bArr, i4, i5);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f72082b.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i4) throws IOException {
            this.f72082b.write(i4);
        }
    }

    /* compiled from: ViewServer.java */
    /* loaded from: classes7.dex */
    private class d implements Runnable, e {

        /* renamed from: b  reason: collision with root package name */
        private Socket f72083b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f72084c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f72085d;

        /* renamed from: e  reason: collision with root package name */
        private final Object[] f72086e;

        private View c(int i4) {
            if (i4 == -1) {
                c.this.f72079h.readLock().lock();
                try {
                    return c.this.f72080i;
                } finally {
                }
            }
            c.this.f72079h.readLock().lock();
            try {
                for (Map.Entry entry : c.this.f72078g.entrySet()) {
                    if (System.identityHashCode(entry.getKey()) == i4) {
                        return (View) entry.getKey();
                    }
                }
                c.this.f72079h.readLock().unlock();
                return null;
            } finally {
            }
        }

        private boolean d(Socket socket) {
            BufferedWriter bufferedWriter;
            boolean z4 = false;
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 8192);
                } catch (IOException unused) {
                }
            } catch (Exception unused2) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                c.this.f72081j.readLock().lock();
                try {
                    View view = c.this.f72080i;
                    if (view != null) {
                        c.this.f72079h.readLock().lock();
                        try {
                            String str = (String) c.this.f72078g.get(c.this.f72080i);
                            c.this.f72079h.readLock().unlock();
                            bufferedWriter.write(Integer.toHexString(System.identityHashCode(view)));
                            bufferedWriter.write(32);
                            bufferedWriter.append((CharSequence) str);
                        } catch (Throwable th2) {
                            c.this.f72079h.readLock().unlock();
                            throw th2;
                        }
                    }
                    bufferedWriter.write(10);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    z4 = true;
                } finally {
                    c.this.f72081j.readLock().unlock();
                }
            } catch (Exception unused3) {
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    bufferedWriter2.close();
                }
                return z4;
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
            return z4;
        }

        private boolean e(Socket socket) {
            BufferedWriter bufferedWriter;
            boolean z4 = false;
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    c.this.f72079h.readLock().lock();
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 8192);
                } catch (IOException unused) {
                }
            } catch (Exception unused2) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                for (Map.Entry entry : c.this.f72078g.entrySet()) {
                    bufferedWriter.write(Integer.toHexString(System.identityHashCode(entry.getKey())));
                    bufferedWriter.write(32);
                    bufferedWriter.append((CharSequence) entry.getValue());
                    bufferedWriter.write(10);
                }
                bufferedWriter.write("DONE.\n");
                bufferedWriter.flush();
                c.this.f72079h.readLock().unlock();
                bufferedWriter.close();
                z4 = true;
            } catch (Exception unused3) {
                bufferedWriter2 = bufferedWriter;
                c.this.f72079h.readLock().unlock();
                if (bufferedWriter2 != null) {
                    bufferedWriter2.close();
                }
                return z4;
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                c.this.f72079h.readLock().unlock();
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
            return z4;
        }

        private boolean f(Socket socket, String str, String str2) {
            BufferedWriter bufferedWriter = null;
            try {
                try {
                    try {
                        int indexOf = str2.indexOf(32);
                        if (indexOf == -1) {
                            indexOf = str2.length();
                        }
                        int parseLong = (int) Long.parseLong(str2.substring(0, indexOf), 16);
                        str2 = indexOf < str2.length() ? str2.substring(indexOf + 1) : "";
                        View c5 = c(parseLong);
                        if (c5 == null) {
                            return false;
                        }
                        Method declaredMethod = ViewDebug.class.getDeclaredMethod("dispatchCommand", View.class, String.class, String.class, OutputStream.class);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(null, c5, str, str2, new C0793c(socket.getOutputStream()));
                        if (!socket.isOutputShutdown()) {
                            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                            try {
                                bufferedWriter2.write("DONE\n");
                                bufferedWriter2.flush();
                                bufferedWriter = bufferedWriter2;
                            } catch (Exception unused) {
                                bufferedWriter = bufferedWriter2;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Could not send command ");
                                sb.append(str);
                                sb.append(" with parameters ");
                                sb.append(str2);
                                if (bufferedWriter != null) {
                                    bufferedWriter.close();
                                }
                                return false;
                            } catch (Throwable th) {
                                th = th;
                                bufferedWriter = bufferedWriter2;
                                if (bufferedWriter != null) {
                                    try {
                                        bufferedWriter.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        }
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                            return true;
                        }
                        return true;
                    } catch (IOException unused3) {
                        return false;
                    }
                } catch (Exception unused4) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private boolean g() {
            boolean z4;
            boolean z5;
            boolean z6;
            c.this.j(this);
            BufferedWriter bufferedWriter = null;
            try {
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(this.f72083b.getOutputStream()));
                    while (!Thread.interrupted()) {
                        try {
                            synchronized (this.f72086e) {
                                while (true) {
                                    z4 = this.f72084c;
                                    if (z4 || this.f72085d) {
                                        break;
                                    }
                                    this.f72086e.wait();
                                }
                                z5 = false;
                                if (z4) {
                                    this.f72084c = false;
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (this.f72085d) {
                                    this.f72085d = false;
                                    z5 = true;
                                }
                            }
                            if (z6) {
                                bufferedWriter2.write("LIST UPDATE\n");
                                bufferedWriter2.flush();
                            }
                            if (z5) {
                                bufferedWriter2.write("FOCUS UPDATE\n");
                                bufferedWriter2.flush();
                            }
                        } catch (Exception unused) {
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                bufferedWriter.close();
                            }
                            c.this.q(this);
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException unused2) {
                                }
                            }
                            c.this.q(this);
                            throw th;
                        }
                    }
                    bufferedWriter2.close();
                } catch (IOException unused3) {
                }
            } catch (Exception unused4) {
            } catch (Throwable th2) {
                th = th2;
            }
            c.this.q(this);
            return true;
        }

        @Override // org.androidannotations.api.c.e
        public void a() {
            synchronized (this.f72086e) {
                this.f72084c = true;
                this.f72086e.notifyAll();
            }
        }

        @Override // org.androidannotations.api.c.e
        public void b() {
            synchronized (this.f72086e) {
                this.f72085d = true;
                this.f72086e.notifyAll();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            BufferedReader bufferedReader;
            Throwable th;
            String substring;
            boolean w4;
            Socket socket;
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(this.f72083b.getInputStream()), 1024);
                } catch (IOException e5) {
                    e5.printStackTrace();
                    return;
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                bufferedReader = null;
                th = th2;
            }
            try {
                String readLine = bufferedReader.readLine();
                int indexOf = readLine.indexOf(32);
                if (indexOf == -1) {
                    substring = "";
                } else {
                    String substring2 = readLine.substring(0, indexOf);
                    substring = readLine.substring(indexOf + 1);
                    readLine = substring2;
                }
                if (c.f72067q.equalsIgnoreCase(readLine)) {
                    w4 = c.w(this.f72083b, "4");
                } else {
                    w4 = c.f72068r.equalsIgnoreCase(readLine) ? c.w(this.f72083b, "4") : c.f72069s.equalsIgnoreCase(readLine) ? e(this.f72083b) : c.f72071u.equalsIgnoreCase(readLine) ? d(this.f72083b) : c.f72070t.equalsIgnoreCase(readLine) ? g() : f(this.f72083b, readLine, substring);
                }
                if (!w4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("An error occurred with the command: ");
                    sb.append(readLine);
                }
                try {
                    bufferedReader.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                socket = this.f72083b;
            } catch (IOException unused2) {
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                }
                Socket socket2 = this.f72083b;
                if (socket2 != null) {
                    socket2.close();
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                Socket socket3 = this.f72083b;
                if (socket3 != null) {
                    try {
                        socket3.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                throw th;
            }
            if (socket != null) {
                socket.close();
            }
        }

        private d(Socket socket) {
            this.f72086e = new Object[0];
            this.f72083b = socket;
            this.f72084c = false;
            this.f72085d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewServer.java */
    /* loaded from: classes7.dex */
    public interface e {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(e eVar) {
        if (this.f72077f.contains(eVar)) {
            return;
        }
        this.f72077f.add(eVar);
    }

    private void k() {
        for (e eVar : this.f72077f) {
            eVar.b();
        }
    }

    private void l() {
        for (e eVar : this.f72077f) {
            eVar.a();
        }
    }

    public static c m(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if ("user".equals(Build.TYPE) && (applicationInfo.flags & 2) != 0) {
            if (f72072v == null) {
                f72072v = new c((int) f72061k);
            }
            if (!f72072v.n()) {
                try {
                    f72072v.t();
                } catch (IOException unused) {
                }
            }
        } else {
            f72072v = new b();
        }
        return f72072v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(e eVar) {
        this.f72077f.remove(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean w(Socket socket, String str) {
        BufferedWriter bufferedWriter;
        boolean z4 = false;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 8192);
            } catch (IOException unused) {
            }
        } catch (Exception unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str);
            bufferedWriter.write("\n");
            bufferedWriter.flush();
            bufferedWriter.close();
            z4 = true;
        } catch (Exception unused3) {
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                bufferedWriter2.close();
            }
            return z4;
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        return z4;
    }

    public void h(Activity activity) {
        String str;
        String charSequence = activity.getTitle().toString();
        if (TextUtils.isEmpty(charSequence)) {
            str = activity.getClass().getCanonicalName() + "/0x" + System.identityHashCode(activity);
        } else {
            str = charSequence + "(" + activity.getClass().getCanonicalName() + ")";
        }
        i(activity.getWindow().getDecorView(), str);
    }

    public void i(View view, String str) {
        this.f72079h.writeLock().lock();
        try {
            this.f72078g.put(view.getRootView(), str);
            this.f72079h.writeLock().unlock();
            l();
        } catch (Throwable th) {
            this.f72079h.writeLock().unlock();
            throw th;
        }
    }

    public boolean n() {
        Thread thread = this.f72075d;
        return thread != null && thread.isAlive();
    }

    public void o(Activity activity) {
        p(activity.getWindow().getDecorView());
    }

    public void p(View view) {
        this.f72079h.writeLock().lock();
        try {
            View rootView = view.getRootView();
            this.f72078g.remove(rootView);
            this.f72079h.writeLock().unlock();
            this.f72081j.writeLock().lock();
            try {
                if (this.f72080i == rootView) {
                    this.f72080i = null;
                }
                this.f72081j.writeLock().unlock();
                l();
            } catch (Throwable th) {
                this.f72081j.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.f72079h.writeLock().unlock();
            throw th2;
        }
    }

    public void r(Activity activity) {
        s(activity.getWindow().getDecorView());
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:4:0x0010 -> B:5:0x0011). Please submit an issue!!! */
    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f72073b = new ServerSocket(this.f72074c, 10, InetAddress.getLocalHost());
        } catch (Exception unused) {
        }
        while (this.f72073b != null && Thread.currentThread() == this.f72075d) {
            Socket accept = this.f72073b.accept();
            ExecutorService executorService = this.f72076e;
            if (executorService != null) {
                executorService.submit(new d(accept));
            } else {
                try {
                    accept.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public void s(View view) {
        View rootView;
        this.f72081j.writeLock().lock();
        if (view == null) {
            rootView = null;
        } else {
            try {
                rootView = view.getRootView();
            } catch (Throwable th) {
                this.f72081j.writeLock().unlock();
                throw th;
            }
        }
        this.f72080i = rootView;
        this.f72081j.writeLock().unlock();
        k();
    }

    public boolean t() throws IOException {
        if (this.f72075d != null) {
            return false;
        }
        this.f72075d = new Thread(this, "Local View Server [port=" + this.f72074c + "]");
        this.f72076e = Executors.newFixedThreadPool(10);
        this.f72075d.start();
        return true;
    }

    public boolean v() {
        Thread thread = this.f72075d;
        if (thread != null) {
            thread.interrupt();
            ExecutorService executorService = this.f72076e;
            if (executorService != null) {
                try {
                    executorService.shutdownNow();
                } catch (SecurityException unused) {
                }
            }
            this.f72076e = null;
            this.f72075d = null;
            try {
                this.f72073b.close();
                this.f72073b = null;
                return true;
            } catch (IOException unused2) {
            }
        }
        this.f72079h.writeLock().lock();
        try {
            this.f72078g.clear();
            this.f72079h.writeLock().unlock();
            this.f72081j.writeLock().lock();
            try {
                this.f72080i = null;
                this.f72081j.writeLock().unlock();
                return false;
            } catch (Throwable th) {
                this.f72081j.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.f72079h.writeLock().unlock();
            throw th2;
        }
    }

    private c() {
        this.f72077f = new CopyOnWriteArrayList();
        this.f72078g = new HashMap();
        this.f72079h = new ReentrantReadWriteLock();
        this.f72081j = new ReentrantReadWriteLock();
        this.f72074c = -1;
    }

    private c(int i4) {
        this.f72077f = new CopyOnWriteArrayList();
        this.f72078g = new HashMap();
        this.f72079h = new ReentrantReadWriteLock();
        this.f72081j = new ReentrantReadWriteLock();
        this.f72074c = i4;
    }
}

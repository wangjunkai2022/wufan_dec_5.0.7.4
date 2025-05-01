package cn.aigestudio.downloader.bizs;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.join.mgps.Util.g0;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DLTask.java */
/* loaded from: classes2.dex */
public class h implements Runnable, l {

    /* renamed from: g  reason: collision with root package name */
    private static final String f460g = h.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private f f461b;

    /* renamed from: c  reason: collision with root package name */
    private Context f462c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicLong f463d = new AtomicLong();

    /* renamed from: e  reason: collision with root package name */
    private int f464e = 0;

    /* renamed from: f  reason: collision with root package name */
    private AtomicLong f465f = new AtomicLong(System.currentTimeMillis());

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Context context, f fVar) {
        this.f461b = fVar;
        this.f462c = context;
        this.f463d.set(fVar.f423b.get());
        if (fVar.f431j) {
            return;
        }
        c.k(context).e(fVar);
    }

    private void e(HttpURLConnection httpURLConnection) {
        for (e eVar : this.f461b.f436o) {
            httpURLConnection.addRequestProperty(eVar.f420a, eVar.f421b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.InputStream] */
    private void f(HttpURLConnection httpURLConnection) throws Exception {
        FileOutputStream fileOutputStream;
        Throwable th;
        Exception e5;
        int read;
        try {
            try {
                httpURLConnection = httpURLConnection.getInputStream();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.f461b.f439r);
                try {
                    byte[] bArr = new byte[4096];
                    while (!this.f461b.f440s && (read = httpURLConnection.read(bArr)) != -1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("downloading...len=");
                        sb.append(read);
                        sb.append(";url=");
                        sb.append(this.f461b.f426e);
                        fileOutputStream2.write(bArr, 0, read);
                        System.currentTimeMillis();
                        b(this.f461b.f426e, read);
                    }
                    if (this.f461b.f440s) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("wap thread stop now.url=");
                        sb2.append(this.f461b.f426e);
                        i(this.f461b);
                    } else {
                        c(null);
                    }
                    fileOutputStream2.close();
                    httpURLConnection.close();
                } catch (Exception e6) {
                    e5 = e6;
                    e5.printStackTrace();
                    throw new IOException();
                }
            } catch (Exception e7) {
                e5 = e7;
            } catch (Throwable th3) {
                fileOutputStream = null;
                th = th3;
                fileOutputStream.close();
                httpURLConnection.close();
                throw th;
            }
        } catch (Exception e8) {
            e5 = e8;
        } catch (Throwable th4) {
            fileOutputStream = null;
            th = th4;
            httpURLConnection = 0;
        }
    }

    private void g() {
        List<j> j4 = c.k(this.f462c).j(this.f461b.f426e);
        if (j4 != null && j4.size() > 0) {
            for (j jVar : j4) {
                jVar.f474e = true;
            }
            c.k(this.f462c).i(this.f461b.f426e);
        }
        long j5 = 0;
        if (this.f461b.f439r.exists() && this.f461b.f439r.isFile()) {
            j5 = this.f461b.f439r.length();
        }
        String uuid = UUID.randomUUID().toString();
        f fVar = this.f461b;
        j jVar2 = new j(uuid, fVar.f426e, j5, fVar.f422a.get());
        this.f461b.a(jVar2);
        c.k(this.f462c).g(jVar2);
        g.q(this.f462c).b(new i(jVar2, this.f461b, this));
    }

    private void h(HttpURLConnection httpURLConnection, int i4) throws Exception {
        List<j> list;
        StringBuilder sb = new StringBuilder();
        sb.append("method dlInit() called.code= ");
        sb.append(i4);
        sb.append(";url=");
        sb.append(this.f461b.f426e);
        j(httpURLConnection);
        c.k(this.f462c).d(this.f461b);
        if (this.f461b.f430i) {
            f fVar = this.f461b;
            fVar.f438q.c(fVar.f426e, fVar.f424c, fVar.f427f, fVar.f422a.get());
        }
        if (g0.g(this.f461b.f425d)) {
            this.f461b.f439r = new File(this.f461b.f425d);
            if (this.f461b.f439r.exists() && this.f461b.f439r.length() == this.f461b.f422a.get()) {
                if (this.f461b.f430i) {
                    g.q(this.f462c).s(this.f461b.f426e, 7);
                    f fVar2 = this.f461b;
                    fVar2.f438q.f(fVar2.f426e, fVar2.f439r);
                    return;
                }
                return;
            } else if (i4 == 200 && this.f461b.f439r.exists() && this.f461b.f439r.length() > 0) {
                httpURLConnection.disconnect();
                throw new Exception("wap mode.");
            } else if (i4 == 200) {
                f(httpURLConnection);
                return;
            } else if (i4 != 206) {
                return;
            } else {
                if (this.f461b.f422a.get() <= 0) {
                    f(httpURLConnection);
                    return;
                } else if (this.f461b.f431j && (list = this.f461b.f437p) != null && list.size() == 1) {
                    for (j jVar : this.f461b.f437p) {
                        jVar.f477h = false;
                        jVar.f476g = false;
                        jVar.f472c = this.f461b.f439r.length();
                        g.q(this.f462c).b(new i(jVar, this.f461b, this));
                    }
                    return;
                } else {
                    g();
                    return;
                }
            }
        }
        throw new DLException("Can not create file");
    }

    private synchronized void i(f fVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("method onStop() called.url=");
        sb.append(fVar.f426e);
        g.q(this.f462c).s(fVar.f426e, 2);
        if (fVar.f430i) {
            fVar.f438q.e(fVar.f426e, fVar.f439r.length());
        }
        g.q(this.f462c).a();
    }

    private void j(HttpURLConnection httpURLConnection) {
        this.f461b.f434m = httpURLConnection.getHeaderField("Content-Disposition");
        this.f461b.f435n = httpURLConnection.getHeaderField("Content-Location");
        this.f461b.f432k = k.e(httpURLConnection.getContentType());
        String headerField = httpURLConnection.getHeaderField("Transfer-Encoding");
        if (TextUtils.isEmpty(headerField)) {
            try {
                this.f461b.f422a.set(Integer.parseInt(httpURLConnection.getHeaderField("Content-Length")));
            } catch (NumberFormatException unused) {
                this.f461b.f422a.set(-1L);
            }
        } else {
            this.f461b.f422a.set(-1L);
        }
        if (this.f461b.f422a.get() == -1 && (TextUtils.isEmpty(headerField) || !headerField.equalsIgnoreCase(HttpHeaders.Values.CHUNKED))) {
            throw new RuntimeException("Can not obtain size of download file.");
        }
        if (TextUtils.isEmpty(this.f461b.f424c)) {
            f fVar = this.f461b;
            fVar.f424c = k.f(fVar.f427f, fVar.f434m, fVar.f435n);
        }
    }

    @Override // cn.aigestudio.downloader.bizs.l
    public synchronized void a(j jVar) {
        c.k(this.f462c).f(jVar);
        int i4 = this.f464e + 1;
        this.f464e = i4;
        if (i4 >= this.f461b.f437p.size()) {
            this.f461b.f423b.set(this.f463d.get());
            c.k(this.f462c).d(this.f461b);
            this.f464e = 0;
            if (this.f461b.f430i) {
                f fVar = this.f461b;
                fVar.f438q.d(fVar.f426e, this.f463d.get());
            }
        }
    }

    @Override // cn.aigestudio.downloader.bizs.l
    public synchronized void b(String str, int i4) {
        AtomicLong atomicLong = this.f463d;
        atomicLong.set(atomicLong.get() + i4);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f465f.get() > 1000) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f463d.get());
            sb.append("");
            if (this.f461b.f430i) {
                this.f461b.f438q.b(str, this.f463d.get());
            }
            this.f465f.set(currentTimeMillis);
        }
    }

    @Override // cn.aigestudio.downloader.bizs.l
    public synchronized void c(j jVar) {
        if (jVar == null) {
            if (this.f461b.f430i) {
                g.q(this.f462c).s(this.f461b.f426e, 1);
                f fVar = this.f461b;
                fVar.f438q.f(fVar.f426e, fVar.f439r);
            }
            return;
        }
        this.f461b.b(jVar);
        c.k(this.f462c).a(jVar.f470a);
        if (jVar.f472c < jVar.f473d) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread size ");
        sb.append(this.f461b.f437p.size());
        if (this.f461b.f437p.isEmpty()) {
            g.q(this.f462c).s(this.f461b.f426e, 1);
            c.k(this.f462c).h(this.f461b.f426e);
            if (this.f461b.f430i) {
                f fVar2 = this.f461b;
                fVar2.f438q.b(fVar2.f426e, fVar2.f422a.get());
                f fVar3 = this.f461b;
                fVar3.f438q.f(fVar3.f426e, fVar3.f439r);
            }
            g.q(this.f462c).a();
        } else {
            this.f461b.f428g.decrementAndGet();
            for (int i4 = 0; i4 < this.f461b.f437p.size(); i4++) {
                g.q(this.f462c).b(new i(this.f461b.f437p.get(i4), this.f461b, this));
            }
        }
    }

    @Override // cn.aigestudio.downloader.bizs.l
    public synchronized void d(j jVar) {
        c.k(this.f462c).f(jVar);
        int i4 = this.f464e + 1;
        this.f464e = i4;
        if (i4 >= this.f461b.f437p.size()) {
            StringBuilder sb = new StringBuilder();
            sb.append("All the threads was stopped.threadInfo.isError=");
            sb.append(jVar.f475f);
            this.f461b.f423b.set(this.f463d.get());
            g.q(this.f462c).c(this.f461b).s(this.f461b.f426e, 3);
            c.k(this.f462c).d(this.f461b);
            this.f464e = 0;
            if (this.f461b.f430i) {
                if (jVar.f475f) {
                    f fVar = this.f461b;
                    fVar.f438q.g(fVar.f426e, -1, "-1");
                } else {
                    f fVar2 = this.f461b;
                    fVar2.f438q.e(fVar2.f426e, this.f463d.get());
                }
            }
            g.q(this.f462c).a();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        HttpURLConnection httpURLConnection;
        Throwable th;
        Exception e5;
        if (this.f461b.f430i) {
            f fVar = this.f461b;
            fVar.f438q.c(fVar.f426e, fVar.f424c, fVar.f427f, fVar.f422a.get());
        }
        Process.setThreadPriority(10);
        while (this.f461b.f429h < 5) {
            try {
                httpURLConnection = (HttpURLConnection) new URL(this.f461b.f427f).openConnection();
                try {
                    try {
                        f fVar2 = this.f461b;
                        if (fVar2.f440s) {
                            g.q(this.f462c).s(this.f461b.f426e, 4);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                                return;
                            }
                            return;
                        } else if (fVar2.f441t) {
                            g.q(this.f462c).s(this.f461b.f426e, 6);
                            if (this.f461b.f430i) {
                                f fVar3 = this.f461b;
                                fVar3.f438q.g(fVar3.f426e, 138, "delete...");
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                                return;
                            }
                            return;
                        } else {
                            httpURLConnection.setInstanceFollowRedirects(false);
                            httpURLConnection.setConnectTimeout(10000);
                            httpURLConnection.setReadTimeout(30000);
                            e(httpURLConnection);
                            int responseCode = httpURLConnection.getResponseCode();
                            if (responseCode == 200 || responseCode == 206) {
                                h(httpURLConnection, responseCode);
                                httpURLConnection.disconnect();
                                return;
                            } else if (responseCode != 301 && responseCode != 307 && responseCode != 303 && responseCode != 304) {
                                if (this.f461b.f430i) {
                                    f fVar4 = this.f461b;
                                    fVar4.f438q.g(fVar4.f426e, responseCode, httpURLConnection.getResponseMessage());
                                }
                                g.q(this.f462c).s(this.f461b.f426e, 5);
                                httpURLConnection.disconnect();
                                return;
                            } else {
                                String headerField = httpURLConnection.getHeaderField("location");
                                if (!TextUtils.isEmpty(headerField)) {
                                    f fVar5 = this.f461b;
                                    fVar5.f427f = headerField;
                                    fVar5.f429h++;
                                    httpURLConnection.disconnect();
                                } else {
                                    throw new DLException("Can not obtain real url from location in header.");
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Exception e6) {
                    e5 = e6;
                    e5.printStackTrace();
                    g.q(this.f462c).s(this.f461b.f426e, 6);
                    if (this.f461b.f430i) {
                        f fVar6 = this.f461b;
                        fVar6.f438q.g(fVar6.f426e, 138, e5.toString());
                    }
                    g.q(this.f462c).a();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        return;
                    }
                    return;
                }
            } catch (Exception e7) {
                httpURLConnection = null;
                e5 = e7;
            } catch (Throwable th3) {
                httpURLConnection = null;
                th = th3;
            }
        }
        throw new RuntimeException("Too many redirects");
    }
}

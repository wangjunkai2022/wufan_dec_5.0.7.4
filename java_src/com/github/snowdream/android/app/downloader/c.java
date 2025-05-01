package com.github.snowdream.android.app.downloader;

import android.os.Handler;
import android.os.Message;
import com.join.mgps.Util.UtilsMy;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: CommonDownloadTask.java */
/* loaded from: classes3.dex */
public class c implements Runnable {

    /* renamed from: r  reason: collision with root package name */
    public static final int f13066r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f13067s = 3;

    /* renamed from: t  reason: collision with root package name */
    public static final int f13068t = 4;

    /* renamed from: u  reason: collision with root package name */
    public static final int f13069u = 5;

    /* renamed from: v  reason: collision with root package name */
    public static final int f13070v = 2;

    /* renamed from: w  reason: collision with root package name */
    public static final int f13071w = 6;

    /* renamed from: x  reason: collision with root package name */
    public static final int f13072x = 7;

    /* renamed from: c  reason: collision with root package name */
    private Handler f13074c;

    /* renamed from: e  reason: collision with root package name */
    private long f13076e;

    /* renamed from: f  reason: collision with root package name */
    private long f13077f;

    /* renamed from: g  reason: collision with root package name */
    private String f13078g;

    /* renamed from: h  reason: collision with root package name */
    private String f13079h;

    /* renamed from: i  reason: collision with root package name */
    private String f13080i;

    /* renamed from: j  reason: collision with root package name */
    private File f13081j;

    /* renamed from: k  reason: collision with root package name */
    private HttpURLConnection f13082k;

    /* renamed from: l  reason: collision with root package name */
    private HttpURLConnection f13083l;

    /* renamed from: o  reason: collision with root package name */
    private long f13086o;

    /* renamed from: p  reason: collision with root package name */
    String f13087p;

    /* renamed from: q  reason: collision with root package name */
    int f13088q;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f13073b = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    int f13075d = 3;

    /* renamed from: m  reason: collision with root package name */
    private RandomAccessFile f13084m = null;

    /* renamed from: n  reason: collision with root package name */
    private InputStream f13085n = null;

    /* compiled from: CommonDownloadTask.java */
    /* loaded from: classes3.dex */
    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            if (c.this.f13082k != null) {
                c.this.f13082k.disconnect();
                c.this.f13082k = null;
            }
        }
    }

    /* compiled from: CommonDownloadTask.java */
    /* loaded from: classes3.dex */
    class b extends Thread {
        b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            if (c.this.f13083l != null) {
                c.this.f13083l.disconnect();
                c.this.f13083l = null;
            }
        }
    }

    public c(String str, String str2, String str3, long j4) {
        this.f13078g = str;
        this.f13079h = str2;
        this.f13080i = str3;
        if (!str3.endsWith(net.lingala.zip4j.util.e.F0)) {
            this.f13080i = str3 + net.lingala.zip4j.util.e.F0;
        }
        this.f13076e = j4;
    }

    private void f() {
        try {
            HttpURLConnection httpURLConnection = this.f13082k;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Exception unused) {
        }
        try {
            InputStream inputStream = this.f13085n;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        RandomAccessFile randomAccessFile = this.f13084m;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
        HttpURLConnection httpURLConnection2 = this.f13083l;
        if (httpURLConnection2 != null) {
            try {
                httpURLConnection2.disconnect();
                this.f13083l = null;
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    private void m() throws IOException {
        byte[] bArr = new byte[4096];
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            int read = this.f13085n.read(bArr, 0, 4096);
            if (read <= 0) {
                return;
            }
            if (this.f13073b.get()) {
                t();
                return;
            }
            this.f13084m.write(bArr, 0, read);
            this.f13086o += read;
            long currentTimeMillis2 = System.currentTimeMillis();
            long j4 = currentTimeMillis2 - currentTimeMillis;
            if (j4 > 200) {
                this.f13087p = UtilsMy.c((read * 1000) / j4);
                this.f13088q = (int) ((this.f13086o * 100) / this.f13077f);
                n(5);
                currentTimeMillis = currentTimeMillis2;
            }
        }
    }

    private void n(int i4) {
        Message obtain = Message.obtain();
        obtain.what = i4;
        if (i4 == 5) {
            obtain.obj = this.f13078g + ";" + this.f13087p + ";" + this.f13088q;
            obtain.arg1 = this.f13088q;
        } else if (i4 == 7) {
            obtain.obj = Long.valueOf(this.f13077f);
        } else {
            obtain.obj = this.f13078g;
        }
        this.f13074c.sendMessage(obtain);
    }

    private void t() {
        f();
        File file = this.f13081j;
        if (file != null) {
            UtilsMy.delete(file);
        }
        n(3);
    }

    public void e() {
        this.f13073b.set(true);
    }

    public long g() {
        return this.f13077f;
    }

    public String h() {
        return this.f13080i;
    }

    public long i() {
        return this.f13076e;
    }

    public File j() {
        return this.f13081j;
    }

    public String k() {
        return this.f13079h;
    }

    public String l() {
        return this.f13078g;
    }

    public void o(String str) {
        this.f13080i = str;
    }

    public void p(long j4) {
        this.f13076e = j4;
    }

    public void q(String str) {
        this.f13079h = str;
    }

    public void r(Handler handler) {
        this.f13074c = handler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0285, code lost:
        if (r9 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02e1, code lost:
        if (r9 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0322, code lost:
        if (r9 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0353, code lost:
        if (r9 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0385, code lost:
        if (r9 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03ab, code lost:
        if (r9 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03ad, code lost:
        n(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0111, code lost:
        if (r9 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0153, code lost:
        if (r9 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d1, code lost:
        if (r9 == false) goto L51;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.snowdream.android.app.downloader.c.run():void");
    }

    public void s(String str) {
        this.f13078g = str;
    }
}

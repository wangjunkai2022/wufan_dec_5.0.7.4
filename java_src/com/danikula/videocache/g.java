package com.danikula.videocache;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HttpProxyCache.java */
/* loaded from: classes2.dex */
public class g extends o {

    /* renamed from: m  reason: collision with root package name */
    private static final float f10075m = 0.2f;

    /* renamed from: j  reason: collision with root package name */
    private final k f10076j;

    /* renamed from: k  reason: collision with root package name */
    private final com.danikula.videocache.file.b f10077k;

    /* renamed from: l  reason: collision with root package name */
    private d f10078l;

    public g(k kVar, com.danikula.videocache.file.b bVar) {
        super(kVar, bVar);
        this.f10077k = bVar;
        this.f10076j = kVar;
    }

    private String p(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    private boolean q(f fVar) throws ProxyCacheException {
        long length = this.f10076j.length();
        return (((length > 0L ? 1 : (length == 0L ? 0 : -1)) > 0) && fVar.f10064c && ((float) fVar.f10063b) > ((float) this.f10077k.available()) + (((float) length) * 0.2f)) ? false : true;
    }

    private String r(f fVar) throws IOException, ProxyCacheException {
        String d5 = this.f10076j.d();
        boolean z4 = !TextUtils.isEmpty(d5);
        long available = this.f10077k.isCompleted() ? this.f10077k.available() : this.f10076j.length();
        boolean z5 = available >= 0;
        boolean z6 = fVar.f10064c;
        long j4 = z6 ? available - fVar.f10063b : available;
        boolean z7 = z5 && z6;
        StringBuilder sb = new StringBuilder();
        sb.append(fVar.f10064c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb.append("Accept-Ranges: bytes\n");
        sb.append(z5 ? p("Content-Length: %d\n", Long.valueOf(j4)) : "");
        sb.append(z7 ? p("Content-Range: bytes %d-%d/%d\n", Long.valueOf(fVar.f10063b), Long.valueOf(available - 1), Long.valueOf(available)) : "");
        sb.append(z4 ? p("Content-Type: %s\n", d5) : "");
        sb.append("\n");
        return sb.toString();
    }

    private void u(OutputStream outputStream, long j4) throws ProxyCacheException, IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int j5 = j(bArr, j4, 8192);
            if (j5 != -1) {
                outputStream.write(bArr, 0, j5);
                j4 += j5;
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    private void v(OutputStream outputStream, long j4) throws ProxyCacheException, IOException {
        k kVar = new k(this.f10076j);
        try {
            kVar.a((int) j4);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = kVar.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } finally {
            kVar.close();
        }
    }

    @Override // com.danikula.videocache.o
    protected void g(int i4) {
        d dVar = this.f10078l;
        if (dVar != null) {
            dVar.g(this.f10077k.f10067b, this.f10076j.e(), i4);
        }
    }

    public void s(f fVar, Socket socket) throws IOException, ProxyCacheException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(r(fVar).getBytes("UTF-8"));
        long j4 = fVar.f10063b;
        if (q(fVar)) {
            u(bufferedOutputStream, j4);
        } else {
            v(bufferedOutputStream, j4);
        }
    }

    public void t(d dVar) {
        this.f10078l = dVar;
    }
}

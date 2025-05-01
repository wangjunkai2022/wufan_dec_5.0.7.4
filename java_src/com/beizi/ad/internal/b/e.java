package com.beizi.ad.internal.b;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HttpProxyCache.java */
/* loaded from: classes2.dex */
public class e extends l {

    /* renamed from: a  reason: collision with root package name */
    private final h f5786a;

    /* renamed from: b  reason: collision with root package name */
    private final com.beizi.ad.internal.b.a.b f5787b;

    /* renamed from: c  reason: collision with root package name */
    private b f5788c;

    public e(h hVar, com.beizi.ad.internal.b.a.b bVar) {
        super(hVar, bVar);
        this.f5787b = bVar;
        this.f5786a = hVar;
    }

    private String b(d dVar) throws IOException, m {
        String c5 = this.f5786a.c();
        boolean z4 = !TextUtils.isEmpty(c5);
        int a5 = this.f5787b.d() ? this.f5787b.a() : this.f5786a.a();
        boolean z5 = a5 >= 0;
        boolean z6 = dVar.f5785c;
        long j4 = a5;
        if (z6) {
            j4 -= dVar.f5784b;
        }
        boolean z7 = z5 && z6;
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.f5785c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb.append("Accept-Ranges: bytes\n");
        sb.append(z5 ? String.format("Content-Length: %d\n", Long.valueOf(j4)) : "");
        sb.append(z7 ? String.format("Content-Range: bytes %d-%d/%d\n", Long.valueOf(dVar.f5784b), Integer.valueOf(a5 - 1), Integer.valueOf(a5)) : "");
        sb.append(z4 ? String.format("Content-Type: %s\n", c5) : "");
        sb.append("\n");
        return sb.toString();
    }

    public void a(b bVar) {
        this.f5788c = bVar;
    }

    public void a(d dVar, Socket socket) throws IOException, m {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(b(dVar).getBytes("UTF-8"));
        long j4 = dVar.f5784b;
        if (a(dVar)) {
            a(bufferedOutputStream, j4);
        } else {
            b(bufferedOutputStream, j4);
        }
    }

    private boolean a(d dVar) throws m {
        int a5 = this.f5786a.a();
        return ((a5 > 0) && dVar.f5785c && ((float) dVar.f5784b) > ((float) this.f5787b.a()) + (((float) a5) * 0.2f)) ? false : true;
    }

    private void a(OutputStream outputStream, long j4) throws m, IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int a5 = a(bArr, j4, 8192);
            if (a5 != -1) {
                outputStream.write(bArr, 0, a5);
                j4 += a5;
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    private void b(OutputStream outputStream, long j4) throws m, IOException {
        h hVar = new h(this.f5786a);
        try {
            hVar.a((int) j4);
            byte[] bArr = new byte[8192];
            while (true) {
                int a5 = hVar.a(bArr);
                if (a5 != -1) {
                    outputStream.write(bArr, 0, a5);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } finally {
            hVar.b();
        }
    }

    @Override // com.beizi.ad.internal.b.l
    protected void a(int i4) {
        b bVar = this.f5788c;
        if (bVar != null) {
            bVar.a(this.f5787b.f5769a, this.f5786a.d(), i4);
        }
    }
}

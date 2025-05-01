package com.coremedia.iso;

import com.coremedia.iso.boxes.h0;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.channels.WritableByteChannel;
/* compiled from: IsoFile.java */
@DoNotParseDetail
/* loaded from: classes2.dex */
public class f extends com.googlecode.mp4parser.d implements Closeable {

    /* renamed from: k  reason: collision with root package name */
    private static com.googlecode.mp4parser.util.j f10041k = com.googlecode.mp4parser.util.j.a(f.class);

    public f(String str) throws IOException {
        this(new com.googlecode.mp4parser.g(new File(str)));
    }

    public static String B(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 4));
        }
        try {
            return new String(bArr2, "ISO-8859-1");
        } catch (UnsupportedEncodingException e5) {
            throw new Error("Required character encoding is missing", e5);
        }
    }

    public static byte[] C(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i4 = 0; i4 < Math.min(4, str.length()); i4++) {
                bArr[i4] = (byte) str.charAt(i4);
            }
        }
        return bArr;
    }

    public h0 D() {
        for (com.coremedia.iso.boxes.d dVar : t()) {
            if (dVar instanceof h0) {
                return (h0) dVar;
            }
        }
        return null;
    }

    public void a(WritableByteChannel writableByteChannel) throws IOException {
        u(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14081c.close();
    }

    public long getSize() {
        return y();
    }

    @Override // com.googlecode.mp4parser.d
    public String toString() {
        return "model(" + this.f14081c.toString() + ")";
    }

    public f(com.googlecode.mp4parser.e eVar) throws IOException {
        this(eVar, new k(new String[0]));
    }

    public f(com.googlecode.mp4parser.e eVar, c cVar) throws IOException {
        z(eVar, eVar.size(), cVar);
    }
}

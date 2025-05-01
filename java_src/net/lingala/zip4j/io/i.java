package net.lingala.zip4j.io;

import java.io.IOException;
import java.io.OutputStream;
import w3.o;
/* compiled from: ZipOutputStream.java */
/* loaded from: classes7.dex */
public class i extends d {
    public i(OutputStream outputStream) {
        this(outputStream, null);
    }

    @Override // net.lingala.zip4j.io.d, net.lingala.zip4j.io.c, net.lingala.zip4j.io.b, java.io.OutputStream
    public void write(int i4) throws IOException {
        write(new byte[]{(byte) i4}, 0, 1);
    }

    public i(OutputStream outputStream, o oVar) {
        super(outputStream, oVar);
    }

    @Override // net.lingala.zip4j.io.d, net.lingala.zip4j.io.c, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // net.lingala.zip4j.io.d, net.lingala.zip4j.io.c, java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        this.f71794j.update(bArr, i4, i5);
        z(i5);
        super.write(bArr, i4, i5);
    }
}

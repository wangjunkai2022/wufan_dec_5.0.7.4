package com.bytedance.pangle.util.b.a;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f8602a = new byte[2];

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f8603b = new byte[4];

    public final int a(RandomAccessFile randomAccessFile) {
        randomAccessFile.readFully(this.f8603b);
        return b(this.f8603b);
    }

    public final int b(RandomAccessFile randomAccessFile) {
        randomAccessFile.readFully(this.f8602a);
        return a(this.f8602a);
    }

    private static int b(byte[] bArr) {
        return ((((bArr[3] & 255) << 8) | (bArr[2] & 255)) << 16) | (bArr[0] & 255) | ((bArr[1] & 255) << 8);
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        a(this.f8602a, i4);
        byteArrayOutputStream.write(this.f8602a);
    }

    private static void b(byte[] bArr, int i4) {
        bArr[3] = (byte) (i4 >>> 24);
        bArr[2] = (byte) (i4 >>> 16);
        bArr[1] = (byte) (i4 >>> 8);
        bArr[0] = (byte) (i4 & 255);
    }

    public final void a(OutputStream outputStream, int i4) {
        b(this.f8603b, i4);
        outputStream.write(this.f8603b);
    }

    private static int a(byte[] bArr) {
        return ((bArr[1] & 255) << 8) | (bArr[0] & 255);
    }

    public static void a(byte[] bArr, int i4) {
        bArr[1] = (byte) (i4 >>> 8);
        bArr[0] = (byte) (i4 & 255);
    }
}

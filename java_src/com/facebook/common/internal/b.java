package com.facebook.common.internal;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
/* compiled from: ByteStreams.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int f10847a = 4096;

    /* compiled from: ByteStreams.java */
    /* renamed from: com.facebook.common.internal.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0254b extends ByteArrayOutputStream {
        private C0254b() {
        }

        void a(byte[] bArr, int i4) {
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArr, i4, ((ByteArrayOutputStream) this).count);
        }
    }

    private b() {
    }

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        h.i(inputStream);
        h.i(outputStream);
        byte[] bArr = new byte[4096];
        long j4 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j4;
            }
            outputStream.write(bArr, 0, read);
            j4 += read;
        }
    }

    public static int b(InputStream inputStream, byte[] bArr, int i4, int i5) throws IOException {
        h.i(inputStream);
        h.i(bArr);
        if (i5 >= 0) {
            int i6 = 0;
            while (i6 < i5) {
                int read = inputStream.read(bArr, i4 + i6, i5 - i6);
                if (read == -1) {
                    break;
                }
                i6 += read;
            }
            return i6;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }

    public static void c(InputStream inputStream, byte[] bArr, int i4, int i5) throws IOException {
        int b5 = b(inputStream, bArr, i4, i5);
        if (b5 == i5) {
            return;
        }
        throw new EOFException("reached end of stream after reading " + b5 + " bytes; " + i5 + " bytes expected");
    }

    public static byte[] d(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] e(InputStream inputStream, int i4) throws IOException {
        byte[] bArr = new byte[i4];
        int i5 = i4;
        while (i5 > 0) {
            int i6 = i4 - i5;
            int read = inputStream.read(bArr, i6, i5);
            if (read == -1) {
                return Arrays.copyOf(bArr, i6);
            }
            i5 -= read;
        }
        int read2 = inputStream.read();
        if (read2 == -1) {
            return bArr;
        }
        C0254b c0254b = new C0254b();
        c0254b.write(read2);
        a(inputStream, c0254b);
        byte[] bArr2 = new byte[c0254b.size() + i4];
        System.arraycopy(bArr, 0, bArr2, 0, i4);
        c0254b.a(bArr2, i4);
        return bArr2;
    }
}

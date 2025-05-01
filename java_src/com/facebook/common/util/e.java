package com.facebook.common.util;

import com.facebook.common.internal.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: StreamUtil.java */
/* loaded from: classes2.dex */
public class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StreamUtil.java */
    /* loaded from: classes2.dex */
    public static class a extends ByteArrayOutputStream {
        a(int i4) {
            super(i4);
        }

        @Override // java.io.ByteArrayOutputStream
        public byte[] toByteArray() {
            int i4 = ((ByteArrayOutputStream) this).count;
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            return i4 == bArr.length ? bArr : super.toByteArray();
        }
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        return b(inputStream, inputStream.available());
    }

    public static byte[] b(InputStream inputStream, int i4) throws IOException {
        a aVar = new a(i4);
        com.facebook.common.internal.b.a(inputStream, aVar);
        return aVar.toByteArray();
    }

    public static long c(InputStream inputStream, long j4) throws IOException {
        h.i(inputStream);
        h.d(j4 >= 0);
        long j5 = j4;
        while (j5 > 0) {
            long skip = inputStream.skip(j5);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return j4 - j5;
                }
                skip = 1;
            }
            j5 -= skip;
        }
        return j4;
    }
}

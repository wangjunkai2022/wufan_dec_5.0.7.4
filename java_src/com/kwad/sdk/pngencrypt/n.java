package com.kwad.sdk.pngencrypt;

import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
/* loaded from: classes5.dex */
public final class n {
    public static Charset aMJ = Charset.forName("ISO-8859-1");
    public static Charset aMK = Charset.forName("UTF-8");
    private static ThreadLocal<Boolean> aML = new ThreadLocal<Boolean>() { // from class: com.kwad.sdk.pngencrypt.n.1
        private static Boolean KM() {
            return Boolean.FALSE;
        }

        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Boolean initialValue() {
            return KM();
        }
    };

    public static byte[] KL() {
        return new byte[]{-119, 80, 78, 71, 13, 10, BinaryMemcacheOpcodes.PREPENDQ, 10};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int b(int i4, int i5, int i6) {
        int i7 = (i4 + i5) - i6;
        int i8 = i7 >= i4 ? i7 - i4 : i4 - i7;
        int i9 = i7 >= i5 ? i7 - i5 : i5 - i7;
        int i10 = i7 >= i6 ? i7 - i6 : i6 - i7;
        return (i8 > i9 || i8 > i10) ? i9 <= i10 ? i5 : i6 : i4;
    }

    public static int e(InputStream inputStream) {
        try {
            return inputStream.read();
        } catch (IOException e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
            return -1;
        }
    }

    public static int f(InputStream inputStream) {
        try {
            int read = inputStream.read();
            int read2 = inputStream.read();
            int read3 = inputStream.read();
            int read4 = inputStream.read();
            if (read == -1 || read2 == -1 || read3 == -1 || read4 == -1) {
                return -1;
            }
            return (read << 24) | (read2 << 16) | ((read3 << 8) + read4);
        } catch (IOException e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
            return -1;
        }
    }

    public static final int g(byte[] bArr, int i4) {
        return (bArr[i4 + 3] & 255) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
    }

    public static int e(byte[] bArr, int i4) {
        return bArr[i4] & 255;
    }

    public static int f(byte[] bArr, int i4) {
        return (bArr[i4 + 1] & 255) | ((bArr[i4] & 255) << 8);
    }
}

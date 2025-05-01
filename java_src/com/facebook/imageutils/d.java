package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: StreamProcessor.java */
/* loaded from: classes2.dex */
class d {
    d() {
    }

    public static int a(InputStream inputStream, int i4, boolean z4) throws IOException {
        int i5;
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            int read = inputStream.read();
            if (read == -1) {
                throw new IOException("no more bytes");
            }
            if (z4) {
                i5 = (read & 255) << (i7 * 8);
            } else {
                i6 <<= 8;
                i5 = read & 255;
            }
            i6 |= i5;
        }
        return i6;
    }
}

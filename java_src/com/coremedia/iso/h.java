package com.coremedia.iso;

import java.nio.ByteBuffer;
/* compiled from: IsoTypeReaderVariable.java */
/* loaded from: classes2.dex */
public final class h {
    public static long a(ByteBuffer byteBuffer, int i4) {
        int p4;
        if (i4 == 1) {
            p4 = g.p(byteBuffer);
        } else if (i4 == 2) {
            p4 = g.i(byteBuffer);
        } else if (i4 != 3) {
            if (i4 != 4) {
                if (i4 == 8) {
                    return g.o(byteBuffer);
                }
                throw new RuntimeException("I don't know how to read " + i4 + " bytes");
            }
            return g.l(byteBuffer);
        } else {
            p4 = g.k(byteBuffer);
        }
        return p4;
    }
}

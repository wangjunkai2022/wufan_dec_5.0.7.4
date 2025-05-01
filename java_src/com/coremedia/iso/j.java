package com.coremedia.iso;

import java.nio.ByteBuffer;
/* compiled from: IsoTypeWriterVariable.java */
/* loaded from: classes2.dex */
public final class j {
    public static void a(long j4, ByteBuffer byteBuffer, int i4) {
        if (i4 == 1) {
            i.m(byteBuffer, (int) (j4 & 255));
        } else if (i4 == 2) {
            i.f(byteBuffer, (int) (j4 & 65535));
        } else if (i4 == 3) {
            i.h(byteBuffer, (int) (j4 & 16777215));
        } else if (i4 == 4) {
            i.i(byteBuffer, j4);
        } else if (i4 == 8) {
            i.l(byteBuffer, j4);
        } else {
            throw new RuntimeException("I don't know how to read " + i4 + " bytes");
        }
    }
}

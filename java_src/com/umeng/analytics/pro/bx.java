package com.umeng.analytics.pro;

import java.io.ByteArrayOutputStream;
/* compiled from: TByteArrayOutputStream.java */
/* loaded from: classes6.dex */
public class bx extends ByteArrayOutputStream {
    public bx(int i4) {
        super(i4);
    }

    public byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public int b() {
        return ((ByteArrayOutputStream) this).count;
    }

    public bx() {
    }
}

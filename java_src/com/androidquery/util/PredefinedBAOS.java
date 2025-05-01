package com.androidquery.util;

import java.io.ByteArrayOutputStream;
/* loaded from: classes2.dex */
public class PredefinedBAOS extends ByteArrayOutputStream {
    public PredefinedBAOS(int i4) {
        super(i4);
    }

    @Override // java.io.ByteArrayOutputStream
    public byte[] toByteArray() {
        int i4 = ((ByteArrayOutputStream) this).count;
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        return i4 == bArr.length ? bArr : super.toByteArray();
    }
}

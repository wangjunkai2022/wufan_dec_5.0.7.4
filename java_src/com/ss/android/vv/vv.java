package com.ss.android.vv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes5.dex */
public class vv implements m {
    private final RandomAccessFile vv;

    public vv(File file) throws FileNotFoundException {
        this.vv = new RandomAccessFile(file, "r");
    }

    @Override // com.ss.android.vv.m
    public void m() throws IOException {
        this.vv.close();
    }

    @Override // com.ss.android.vv.m
    public long vv() throws IOException {
        return this.vv.length();
    }

    @Override // com.ss.android.vv.m
    public int vv(byte[] bArr, int i4, int i5) throws IOException {
        return this.vv.read(bArr, i4, i5);
    }

    @Override // com.ss.android.vv.m
    public void vv(long j4, long j5) throws IOException {
        this.vv.seek(j4);
    }
}

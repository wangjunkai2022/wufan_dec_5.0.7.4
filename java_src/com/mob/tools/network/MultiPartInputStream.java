package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes5.dex */
public class MultiPartInputStream extends InputStream implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<InputStream> f56803a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private int f56804b;

    private boolean a() {
        ArrayList<InputStream> arrayList = this.f56803a;
        return arrayList == null || arrayList.size() <= 0;
    }

    public void addInputStream(InputStream inputStream) throws Throwable {
        this.f56803a.add(inputStream);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (a()) {
            return 0;
        }
        return this.f56803a.get(this.f56804b).available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Iterator<InputStream> it2 = this.f56803a.iterator();
        while (it2.hasNext()) {
            it2.next().close();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (a()) {
            return -1;
        }
        int read = this.f56803a.get(this.f56804b).read();
        while (read < 0) {
            int i4 = this.f56804b + 1;
            this.f56804b = i4;
            if (i4 >= this.f56803a.size()) {
                break;
            }
            read = this.f56803a.get(this.f56804b).read();
        }
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        throw new IOException();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        if (a()) {
            return -1;
        }
        int read = this.f56803a.get(this.f56804b).read(bArr, i4, i5);
        while (read < 0) {
            int i6 = this.f56804b + 1;
            this.f56804b = i6;
            if (i6 >= this.f56803a.size()) {
                break;
            }
            read = this.f56803a.get(this.f56804b).read(bArr, i4, i5);
        }
        return read;
    }
}

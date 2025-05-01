package com.danikula.videocache;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
/* compiled from: ByteArrayCache.java */
/* loaded from: classes2.dex */
public class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private volatile byte[] f10051a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f10052b;

    public a() {
        this(new byte[0]);
    }

    @Override // com.danikula.videocache.c
    public void a(byte[] bArr, int i4) throws ProxyCacheException {
        n.d(this.f10051a);
        n.b(i4 >= 0 && i4 <= bArr.length);
        byte[] copyOf = Arrays.copyOf(this.f10051a, this.f10051a.length + i4);
        System.arraycopy(bArr, 0, copyOf, this.f10051a.length, i4);
        this.f10051a = copyOf;
    }

    @Override // com.danikula.videocache.c
    public long available() throws ProxyCacheException {
        return this.f10051a.length;
    }

    @Override // com.danikula.videocache.c
    public int b(byte[] bArr, long j4, int i4) throws ProxyCacheException {
        if (j4 >= this.f10051a.length) {
            return -1;
        }
        if (j4 <= 2147483647L) {
            return new ByteArrayInputStream(this.f10051a).read(bArr, (int) j4, i4);
        }
        throw new IllegalArgumentException("Too long offset for memory cache " + j4);
    }

    @Override // com.danikula.videocache.c
    public void close() throws ProxyCacheException {
    }

    @Override // com.danikula.videocache.c
    public void complete() {
        this.f10052b = true;
    }

    @Override // com.danikula.videocache.c
    public boolean isCompleted() {
        return this.f10052b;
    }

    public a(byte[] bArr) {
        this.f10051a = (byte[]) n.d(bArr);
    }
}

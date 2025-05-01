package com.danikula.videocache;

import java.io.ByteArrayInputStream;
/* compiled from: ByteArraySource.java */
/* loaded from: classes2.dex */
public class b implements q {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f10053a;

    /* renamed from: b  reason: collision with root package name */
    private ByteArrayInputStream f10054b;

    public b(byte[] bArr) {
        this.f10053a = bArr;
    }

    @Override // com.danikula.videocache.q
    public void a(long j4) throws ProxyCacheException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f10053a);
        this.f10054b = byteArrayInputStream;
        byteArrayInputStream.skip(j4);
    }

    @Override // com.danikula.videocache.q
    public void close() throws ProxyCacheException {
    }

    @Override // com.danikula.videocache.q
    public long length() throws ProxyCacheException {
        return this.f10053a.length;
    }

    @Override // com.danikula.videocache.q
    public int read(byte[] bArr) throws ProxyCacheException {
        return this.f10054b.read(bArr, 0, bArr.length);
    }
}

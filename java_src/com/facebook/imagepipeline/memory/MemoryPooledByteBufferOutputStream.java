package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.VisibleForTesting;
import java.io.IOException;
import javax.annotation.concurrent.NotThreadSafe;
@NotThreadSafe
/* loaded from: classes2.dex */
public class MemoryPooledByteBufferOutputStream extends com.facebook.common.memory.i {

    /* renamed from: b  reason: collision with root package name */
    private final u f11949b;

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.common.references.a<t> f11950c;

    /* renamed from: d  reason: collision with root package name */
    private int f11951d;

    /* loaded from: classes2.dex */
    public static class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    public MemoryPooledByteBufferOutputStream(u uVar) {
        this(uVar, uVar.C());
    }

    private void b() {
        if (!com.facebook.common.references.a.t(this.f11950c)) {
            throw new InvalidStreamException();
        }
    }

    @Override // com.facebook.common.memory.i, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.facebook.common.references.a.h(this.f11950c);
        this.f11950c = null;
        this.f11951d = -1;
        super.close();
    }

    @VisibleForTesting
    void d(int i4) {
        b();
        if (i4 <= this.f11950c.k().getSize()) {
            return;
        }
        t tVar = this.f11949b.get(i4);
        this.f11950c.k().r(0, tVar, 0, this.f11951d);
        this.f11950c.close();
        this.f11950c = com.facebook.common.references.a.v(tVar, this.f11949b);
    }

    @Override // com.facebook.common.memory.i
    /* renamed from: g */
    public w a() {
        b();
        return new w(this.f11950c, this.f11951d);
    }

    @Override // com.facebook.common.memory.i
    public int size() {
        return this.f11951d;
    }

    @Override // java.io.OutputStream
    public void write(int i4) throws IOException {
        write(new byte[]{(byte) i4});
    }

    public MemoryPooledByteBufferOutputStream(u uVar, int i4) {
        com.facebook.common.internal.h.d(i4 > 0);
        u uVar2 = (u) com.facebook.common.internal.h.i(uVar);
        this.f11949b = uVar2;
        this.f11951d = 0;
        this.f11950c = com.facebook.common.references.a.v(uVar2.get(i4), uVar2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        if (i4 >= 0 && i5 >= 0 && i4 + i5 <= bArr.length) {
            b();
            d(this.f11951d + i5);
            this.f11950c.k().p(this.f11951d, bArr, i4, i5);
            this.f11951d += i5;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i4 + "; regionLength=" + i5);
    }
}

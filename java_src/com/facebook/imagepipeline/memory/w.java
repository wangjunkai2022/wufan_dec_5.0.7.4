package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: MemoryPooledByteBuffer.java */
@ThreadSafe
/* loaded from: classes.dex */
public class w implements PooledByteBuffer {

    /* renamed from: b  reason: collision with root package name */
    private final int f12069b;
    @VisibleForTesting
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    com.facebook.common.references.a<t> f12070c;

    public w(com.facebook.common.references.a<t> aVar, int i4) {
        com.facebook.common.internal.h.i(aVar);
        com.facebook.common.internal.h.d(i4 >= 0 && i4 <= aVar.k().getSize());
        this.f12070c = aVar.clone();
        this.f12069b = i4;
    }

    synchronized void a() {
        if (isClosed()) {
            throw new PooledByteBuffer.ClosedException();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int c(int i4, byte[] bArr, int i5, int i6) {
        a();
        com.facebook.common.internal.h.d(i4 + i6 <= this.f12069b);
        return this.f12070c.k().c(i4, bArr, i5, i6);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        com.facebook.common.references.a.h(this.f12070c);
        this.f12070c = null;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    @Nullable
    public synchronized ByteBuffer e() {
        return this.f12070c.k().e();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized byte f(int i4) {
        a();
        boolean z4 = true;
        com.facebook.common.internal.h.d(i4 >= 0);
        if (i4 >= this.f12069b) {
            z4 = false;
        }
        com.facebook.common.internal.h.d(z4);
        return this.f12070c.k().f(i4);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized long i() throws UnsupportedOperationException {
        a();
        return this.f12070c.k().i();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized boolean isClosed() {
        return !com.facebook.common.references.a.t(this.f12070c);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int size() {
        a();
        return this.f12069b;
    }
}

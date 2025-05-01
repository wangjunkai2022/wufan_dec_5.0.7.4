package com.facebook.imagepipeline.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
/* compiled from: BufferMemoryChunk.java */
/* loaded from: classes.dex */
public class i implements t, Closeable {

    /* renamed from: e  reason: collision with root package name */
    private static final String f12042e = "BufferMemoryChunk";

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f12043b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12044c;

    /* renamed from: d  reason: collision with root package name */
    private final long f12045d = System.identityHashCode(this);

    public i(int i4) {
        this.f12043b = ByteBuffer.allocateDirect(i4);
        this.f12044c = i4;
    }

    private void a(int i4, t tVar, int i5, int i6) {
        if (tVar instanceof i) {
            com.facebook.common.internal.h.o(!isClosed());
            com.facebook.common.internal.h.o(!tVar.isClosed());
            v.b(i4, tVar.getSize(), i5, i6, this.f12044c);
            this.f12043b.position(i4);
            tVar.e().position(i5);
            byte[] bArr = new byte[i6];
            this.f12043b.get(bArr, 0, i6);
            tVar.e().put(bArr, 0, i6);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized int c(int i4, byte[] bArr, int i5, int i6) {
        int a5;
        com.facebook.common.internal.h.i(bArr);
        com.facebook.common.internal.h.o(!isClosed());
        a5 = v.a(i4, i6, this.f12044c);
        v.b(i4, bArr.length, i5, a5, this.f12044c);
        this.f12043b.position(i4);
        this.f12043b.get(bArr, i5, a5);
        return a5;
    }

    @Override // com.facebook.imagepipeline.memory.t, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f12043b = null;
    }

    @Override // com.facebook.imagepipeline.memory.t
    @Nullable
    public synchronized ByteBuffer e() {
        return this.f12043b;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized byte f(int i4) {
        boolean z4 = true;
        com.facebook.common.internal.h.o(!isClosed());
        com.facebook.common.internal.h.d(i4 >= 0);
        if (i4 >= this.f12044c) {
            z4 = false;
        }
        com.facebook.common.internal.h.d(z4);
        return this.f12043b.get(i4);
    }

    @Override // com.facebook.imagepipeline.memory.t
    public int getSize() {
        return this.f12044c;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public long i() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized boolean isClosed() {
        return this.f12043b == null;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public long l() {
        return this.f12045d;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized int p(int i4, byte[] bArr, int i5, int i6) {
        int a5;
        com.facebook.common.internal.h.i(bArr);
        com.facebook.common.internal.h.o(!isClosed());
        a5 = v.a(i4, i6, this.f12044c);
        v.b(i4, bArr.length, i5, a5, this.f12044c);
        this.f12043b.position(i4);
        this.f12043b.put(bArr, i5, a5);
        return a5;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public void r(int i4, t tVar, int i5, int i6) {
        com.facebook.common.internal.h.i(tVar);
        if (tVar.l() == l()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Copying from BufferMemoryChunk ");
            sb.append(Long.toHexString(l()));
            sb.append(" to BufferMemoryChunk ");
            sb.append(Long.toHexString(tVar.l()));
            sb.append(" which are the same ");
            com.facebook.common.internal.h.d(false);
        }
        if (tVar.l() < l()) {
            synchronized (tVar) {
                synchronized (this) {
                    a(i4, tVar, i5, i6);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (tVar) {
                a(i4, tVar, i5, i6);
            }
        }
    }
}

package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.VisibleForTesting;
import java.io.Closeable;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
@DoNotStrip
/* loaded from: classes.dex */
public class NativeMemoryChunk implements t, Closeable {

    /* renamed from: e  reason: collision with root package name */
    private static final String f11952e = "NativeMemoryChunk";

    /* renamed from: b  reason: collision with root package name */
    private final long f11953b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11954c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11955d;

    static {
        com.facebook.imagepipeline.nativecode.a.a();
    }

    public NativeMemoryChunk(int i4) {
        com.facebook.common.internal.h.d(i4 > 0);
        this.f11954c = i4;
        this.f11953b = nativeAllocate(i4);
        this.f11955d = false;
    }

    private void a(int i4, t tVar, int i5, int i6) {
        if (tVar instanceof NativeMemoryChunk) {
            com.facebook.common.internal.h.o(!isClosed());
            com.facebook.common.internal.h.o(!tVar.isClosed());
            v.b(i4, tVar.getSize(), i5, i6, this.f11954c);
            nativeMemcpy(tVar.i() + i5, this.f11953b + i4, i6);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @DoNotStrip
    private static native long nativeAllocate(int i4);

    @DoNotStrip
    private static native void nativeCopyFromByteArray(long j4, byte[] bArr, int i4, int i5);

    @DoNotStrip
    private static native void nativeCopyToByteArray(long j4, byte[] bArr, int i4, int i5);

    @DoNotStrip
    private static native void nativeFree(long j4);

    @DoNotStrip
    private static native void nativeMemcpy(long j4, long j5, int i4);

    @DoNotStrip
    private static native byte nativeReadByte(long j4);

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized int c(int i4, byte[] bArr, int i5, int i6) {
        int a5;
        com.facebook.common.internal.h.i(bArr);
        com.facebook.common.internal.h.o(!isClosed());
        a5 = v.a(i4, i6, this.f11954c);
        v.b(i4, bArr.length, i5, a5, this.f11954c);
        nativeCopyToByteArray(this.f11953b + i4, bArr, i5, a5);
        return a5;
    }

    @Override // com.facebook.imagepipeline.memory.t, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f11955d) {
            this.f11955d = true;
            nativeFree(this.f11953b);
        }
    }

    @Override // com.facebook.imagepipeline.memory.t
    @Nullable
    public ByteBuffer e() {
        return null;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized byte f(int i4) {
        boolean z4 = true;
        com.facebook.common.internal.h.o(!isClosed());
        com.facebook.common.internal.h.d(i4 >= 0);
        if (i4 >= this.f11954c) {
            z4 = false;
        }
        com.facebook.common.internal.h.d(z4);
        return nativeReadByte(this.f11953b + i4);
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("finalize: Chunk ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.imagepipeline.memory.t
    public int getSize() {
        return this.f11954c;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public long i() {
        return this.f11953b;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized boolean isClosed() {
        return this.f11955d;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public long l() {
        return this.f11953b;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized int p(int i4, byte[] bArr, int i5, int i6) {
        int a5;
        com.facebook.common.internal.h.i(bArr);
        com.facebook.common.internal.h.o(!isClosed());
        a5 = v.a(i4, i6, this.f11954c);
        v.b(i4, bArr.length, i5, a5, this.f11954c);
        nativeCopyFromByteArray(this.f11953b + i4, bArr, i5, a5);
        return a5;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public void r(int i4, t tVar, int i5, int i6) {
        com.facebook.common.internal.h.i(tVar);
        if (tVar.l() == l()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Copying from NativeMemoryChunk ");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" to NativeMemoryChunk ");
            sb.append(Integer.toHexString(System.identityHashCode(tVar)));
            sb.append(" which share the same address ");
            sb.append(Long.toHexString(this.f11953b));
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

    @VisibleForTesting
    public NativeMemoryChunk() {
        this.f11954c = 0;
        this.f11953b = 0L;
        this.f11955d = true;
    }
}

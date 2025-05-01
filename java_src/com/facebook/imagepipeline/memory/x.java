package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: MemoryPooledByteBufferFactory.java */
@ThreadSafe
/* loaded from: classes2.dex */
public class x implements com.facebook.common.memory.g {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.common.memory.j f12071a;

    /* renamed from: b  reason: collision with root package name */
    private final u f12072b;

    public x(u uVar, com.facebook.common.memory.j jVar) {
        this.f12072b = uVar;
        this.f12071a = jVar;
    }

    @VisibleForTesting
    w g(InputStream inputStream, MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream) throws IOException {
        this.f12071a.a(inputStream, memoryPooledByteBufferOutputStream);
        return memoryPooledByteBufferOutputStream.a();
    }

    @Override // com.facebook.common.memory.g
    /* renamed from: h */
    public w e(int i4) {
        com.facebook.common.internal.h.d(i4 > 0);
        com.facebook.common.references.a v2 = com.facebook.common.references.a.v(this.f12072b.get(i4), this.f12072b);
        try {
            return new w(v2, i4);
        } finally {
            v2.close();
        }
    }

    @Override // com.facebook.common.memory.g
    /* renamed from: i */
    public w a(InputStream inputStream) throws IOException {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f12072b);
        try {
            return g(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // com.facebook.common.memory.g
    /* renamed from: j */
    public w b(InputStream inputStream, int i4) throws IOException {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f12072b, i4);
        try {
            return g(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // com.facebook.common.memory.g
    /* renamed from: k */
    public w d(byte[] bArr) {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f12072b, bArr.length);
        try {
            try {
                memoryPooledByteBufferOutputStream.write(bArr, 0, bArr.length);
                return memoryPooledByteBufferOutputStream.a();
            } catch (IOException e5) {
                throw com.facebook.common.internal.m.d(e5);
            }
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // com.facebook.common.memory.g
    /* renamed from: l */
    public MemoryPooledByteBufferOutputStream c() {
        return new MemoryPooledByteBufferOutputStream(this.f12072b);
    }

    @Override // com.facebook.common.memory.g
    /* renamed from: m */
    public MemoryPooledByteBufferOutputStream f(int i4) {
        return new MemoryPooledByteBufferOutputStream(this.f12072b, i4);
    }
}

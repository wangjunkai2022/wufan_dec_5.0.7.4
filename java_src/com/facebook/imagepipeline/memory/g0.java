package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.MemoryTrimType;
import java.util.concurrent.Semaphore;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: SharedByteArray.java */
@ThreadSafe
/* loaded from: classes2.dex */
public class g0 implements com.facebook.common.memory.b {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final int f12036a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final int f12037b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    final com.facebook.common.references.b<byte[]> f12038c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    final Semaphore f12039d;

    /* renamed from: e  reason: collision with root package name */
    private final com.facebook.common.references.c<byte[]> f12040e;

    /* compiled from: SharedByteArray.java */
    /* loaded from: classes2.dex */
    class a implements com.facebook.common.references.c<byte[]> {
        a() {
        }

        @Override // com.facebook.common.references.c
        /* renamed from: a */
        public void release(byte[] bArr) {
            g0.this.f12039d.release();
        }
    }

    public g0(com.facebook.common.memory.c cVar, e0 e0Var) {
        com.facebook.common.internal.h.i(cVar);
        com.facebook.common.internal.h.d(e0Var.f12011d > 0);
        com.facebook.common.internal.h.d(e0Var.f12012e >= e0Var.f12011d);
        this.f12037b = e0Var.f12012e;
        this.f12036a = e0Var.f12011d;
        this.f12038c = new com.facebook.common.references.b<>();
        this.f12039d = new Semaphore(1);
        this.f12040e = new a();
        cVar.a(this);
    }

    private synchronized byte[] a(int i4) {
        byte[] bArr;
        this.f12038c.a();
        bArr = new byte[i4];
        this.f12038c.c(bArr);
        return bArr;
    }

    private byte[] e(int i4) {
        int c5 = c(i4);
        byte[] b5 = this.f12038c.b();
        return (b5 == null || b5.length < c5) ? a(c5) : b5;
    }

    public com.facebook.common.references.a<byte[]> b(int i4) {
        com.facebook.common.internal.h.e(i4 > 0, "Size must be greater than zero");
        com.facebook.common.internal.h.e(i4 <= this.f12037b, "Requested size is too big");
        this.f12039d.acquireUninterruptibly();
        try {
            return com.facebook.common.references.a.v(e(i4), this.f12040e);
        } catch (Throwable th) {
            this.f12039d.release();
            throw com.facebook.common.internal.m.d(th);
        }
    }

    @VisibleForTesting
    int c(int i4) {
        return Integer.highestOneBit(Math.max(i4, this.f12036a) - 1) * 2;
    }

    @Override // com.facebook.common.memory.b
    public void d(MemoryTrimType memoryTrimType) {
        if (this.f12039d.tryAcquire()) {
            try {
                this.f12038c.a();
            } finally {
                this.f12039d.release();
            }
        }
    }
}

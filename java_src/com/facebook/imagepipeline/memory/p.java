package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.VisibleForTesting;
import java.util.Map;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: FlexByteArrayPool.java */
@ThreadSafe
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.common.references.c<byte[]> f12057a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final b f12058b;

    /* compiled from: FlexByteArrayPool.java */
    /* loaded from: classes2.dex */
    class a implements com.facebook.common.references.c<byte[]> {
        a() {
        }

        @Override // com.facebook.common.references.c
        /* renamed from: a */
        public void release(byte[] bArr) {
            p.this.d(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlexByteArrayPool.java */
    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static class b extends q {
        public b(com.facebook.common.memory.c cVar, e0 e0Var, f0 f0Var) {
            super(cVar, e0Var, f0Var);
        }

        @Override // com.facebook.imagepipeline.memory.BasePool
        f<byte[]> t(int i4) {
            return new a0(k(i4), this.f11939c.f12015h, 0);
        }
    }

    public p(com.facebook.common.memory.c cVar, e0 e0Var) {
        com.facebook.common.internal.h.d(e0Var.f12015h > 0);
        this.f12058b = new b(cVar, e0Var, z.h());
        this.f12057a = new a();
    }

    public com.facebook.common.references.a<byte[]> a(int i4) {
        return com.facebook.common.references.a.v(this.f12058b.get(i4), this.f12057a);
    }

    public int b() {
        return this.f12058b.C();
    }

    public Map<String, Integer> c() {
        return this.f12058b.l();
    }

    public void d(byte[] bArr) {
        this.f12058b.release(bArr);
    }
}

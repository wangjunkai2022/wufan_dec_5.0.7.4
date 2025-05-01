package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: GenericByteArrayPool.java */
@ThreadSafe
/* loaded from: classes2.dex */
public class q extends BasePool<byte[]> implements com.facebook.common.memory.a {

    /* renamed from: j  reason: collision with root package name */
    private final int[] f12060j;

    public q(com.facebook.common.memory.c cVar, e0 e0Var, f0 f0Var) {
        super(cVar, e0Var, f0Var);
        SparseIntArray sparseIntArray = e0Var.f12010c;
        this.f12060j = new int[sparseIntArray.size()];
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            this.f12060j[i4] = sparseIntArray.keyAt(i4);
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: A */
    public void f(byte[] bArr) {
        com.facebook.common.internal.h.i(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: B */
    public int j(byte[] bArr) {
        com.facebook.common.internal.h.i(bArr);
        return bArr.length;
    }

    public int C() {
        return this.f12060j[0];
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int i(int i4) {
        int[] iArr;
        if (i4 > 0) {
            for (int i5 : this.f12060j) {
                if (i5 >= i4) {
                    return i5;
                }
            }
            return i4;
        }
        throw new BasePool.InvalidSizeException(Integer.valueOf(i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    public int k(int i4) {
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: z */
    public byte[] a(int i4) {
        return new byte[i4];
    }
}

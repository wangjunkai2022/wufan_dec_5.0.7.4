package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: MemoryChunkPool.java */
@ThreadSafe
/* loaded from: classes2.dex */
public abstract class u extends BasePool<t> {

    /* renamed from: j  reason: collision with root package name */
    private final int[] f12068j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(com.facebook.common.memory.c cVar, e0 e0Var, f0 f0Var) {
        super(cVar, e0Var, f0Var);
        SparseIntArray sparseIntArray = e0Var.f12010c;
        this.f12068j = new int[sparseIntArray.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = this.f12068j;
            if (i4 < iArr.length) {
                iArr[i4] = sparseIntArray.keyAt(i4);
                i4++;
            } else {
                o();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: A */
    public void f(t tVar) {
        com.facebook.common.internal.h.i(tVar);
        tVar.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: B */
    public int j(t tVar) {
        com.facebook.common.internal.h.i(tVar);
        return tVar.getSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int C() {
        return this.f12068j[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: D */
    public boolean q(t tVar) {
        com.facebook.common.internal.h.i(tVar);
        return !tVar.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int i(int i4) {
        int[] iArr;
        if (i4 > 0) {
            for (int i5 : this.f12068j) {
                if (i5 >= i4) {
                    return i5;
                }
            }
            return i4;
        }
        throw new BasePool.InvalidSizeException(Integer.valueOf(i4));
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int k(int i4) {
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: z */
    public abstract t a(int i4);
}

package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.internal.h;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.memory.p;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: KitKatPurgeableDecoder.java */
@ThreadSafe
@TargetApi(19)
/* loaded from: classes2.dex */
public class d extends DalvikPurgeableDecoder {

    /* renamed from: c  reason: collision with root package name */
    private final p f12095c;

    public d(p pVar) {
        this.f12095c = pVar;
    }

    private static void j(byte[] bArr, int i4) {
        bArr[i4] = -1;
        bArr[i4 + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap e(com.facebook.common.references.a<PooledByteBuffer> aVar, BitmapFactory.Options options) {
        PooledByteBuffer k4 = aVar.k();
        int size = k4.size();
        com.facebook.common.references.a<byte[]> a5 = this.f12095c.a(size);
        try {
            byte[] k5 = a5.k();
            k4.c(0, k5, 0, size);
            return (Bitmap) h.j(BitmapFactory.decodeByteArray(k5, 0, size, options), "BitmapFactory returned null");
        } finally {
            com.facebook.common.references.a.h(a5);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap f(com.facebook.common.references.a<PooledByteBuffer> aVar, int i4, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.g(aVar, i4) ? null : DalvikPurgeableDecoder.f12074b;
        PooledByteBuffer k4 = aVar.k();
        h.d(i4 <= k4.size());
        int i5 = i4 + 2;
        com.facebook.common.references.a<byte[]> a5 = this.f12095c.a(i5);
        try {
            byte[] k5 = a5.k();
            k4.c(0, k5, 0, i4);
            if (bArr != null) {
                j(k5, i4);
                i4 = i5;
            }
            return (Bitmap) h.j(BitmapFactory.decodeByteArray(k5, 0, i4, options), "BitmapFactory returned null");
        } finally {
            com.facebook.common.references.a.h(a5);
        }
    }
}

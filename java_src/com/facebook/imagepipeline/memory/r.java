package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.MemoryTrimType;
/* compiled from: LruBitmapPool.java */
/* loaded from: classes2.dex */
public class r implements d {

    /* renamed from: a  reason: collision with root package name */
    protected final b0<Bitmap> f12061a = new e();

    /* renamed from: b  reason: collision with root package name */
    private final int f12062b;

    /* renamed from: c  reason: collision with root package name */
    private int f12063c;

    /* renamed from: d  reason: collision with root package name */
    private final f0 f12064d;

    /* renamed from: e  reason: collision with root package name */
    private int f12065e;

    public r(int i4, int i5, f0 f0Var, @Nullable com.facebook.common.memory.c cVar) {
        this.f12062b = i4;
        this.f12063c = i5;
        this.f12064d = f0Var;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    @VisibleForTesting
    private Bitmap a(int i4) {
        this.f12064d.d(i4);
        return Bitmap.createBitmap(1, i4, Bitmap.Config.ALPHA_8);
    }

    private synchronized void e(int i4) {
        Bitmap pop;
        while (this.f12065e > i4 && (pop = this.f12061a.pop()) != null) {
            int a5 = this.f12061a.a(pop);
            this.f12065e -= a5;
            this.f12064d.b(a5);
        }
    }

    @Override // com.facebook.common.memory.e
    /* renamed from: b */
    public synchronized Bitmap get(int i4) {
        int i5 = this.f12065e;
        int i6 = this.f12062b;
        if (i5 > i6) {
            e(i6);
        }
        Bitmap bitmap = this.f12061a.get(i4);
        if (bitmap != null) {
            int a5 = this.f12061a.a(bitmap);
            this.f12065e -= a5;
            this.f12064d.e(a5);
            return bitmap;
        }
        return a(i4);
    }

    @Override // com.facebook.common.memory.e, com.facebook.common.references.c
    /* renamed from: c */
    public void release(Bitmap bitmap) {
        int a5 = this.f12061a.a(bitmap);
        if (a5 <= this.f12063c) {
            this.f12064d.c(a5);
            this.f12061a.put(bitmap);
            synchronized (this) {
                this.f12065e += a5;
            }
        }
    }

    @Override // com.facebook.common.memory.b
    public void d(MemoryTrimType memoryTrimType) {
        double d5 = this.f12062b;
        Double.isNaN(d5);
        e((int) (d5 * (1.0d - memoryTrimType.getSuggestedTrimRatio())));
    }
}

package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: CloseableStaticBitmap.java */
@ThreadSafe
/* loaded from: classes.dex */
public class d extends b {
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.common.references.a<Bitmap> f11912c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Bitmap f11913d;

    /* renamed from: e  reason: collision with root package name */
    private final h f11914e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11915f;

    /* renamed from: g  reason: collision with root package name */
    private final int f11916g;

    public d(Bitmap bitmap, com.facebook.common.references.c<Bitmap> cVar, h hVar, int i4) {
        this(bitmap, cVar, hVar, i4, 0);
    }

    private synchronized com.facebook.common.references.a<Bitmap> k() {
        com.facebook.common.references.a<Bitmap> aVar;
        aVar = this.f11912c;
        this.f11912c = null;
        this.f11913d = null;
        return aVar;
    }

    private static int l(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int p(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    @Override // com.facebook.imagepipeline.image.c, com.facebook.imagepipeline.image.f
    public h a() {
        return this.f11914e;
    }

    @Override // com.facebook.imagepipeline.image.c
    public int b() {
        return com.facebook.imageutils.a.g(this.f11913d);
    }

    @Override // com.facebook.imagepipeline.image.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.facebook.common.references.a<Bitmap> k4 = k();
        if (k4 != null) {
            k4.close();
        }
    }

    @Override // com.facebook.imagepipeline.image.b
    public Bitmap g() {
        return this.f11913d;
    }

    @Override // com.facebook.imagepipeline.image.f
    public int getHeight() {
        int i4;
        if (this.f11915f % 180 == 0 && (i4 = this.f11916g) != 5 && i4 != 7) {
            return l(this.f11913d);
        }
        return p(this.f11913d);
    }

    @Override // com.facebook.imagepipeline.image.f
    public int getWidth() {
        int i4;
        if (this.f11915f % 180 == 0 && (i4 = this.f11916g) != 5 && i4 != 7) {
            return p(this.f11913d);
        }
        return l(this.f11913d);
    }

    @Nullable
    public synchronized com.facebook.common.references.a<Bitmap> h() {
        return com.facebook.common.references.a.d(this.f11912c);
    }

    @Override // com.facebook.imagepipeline.image.c
    public synchronized boolean isClosed() {
        return this.f11912c == null;
    }

    public synchronized com.facebook.common.references.a<Bitmap> j() {
        com.facebook.common.internal.h.j(this.f11912c, "Cannot convert a closed static bitmap");
        return k();
    }

    public int r() {
        return this.f11916g;
    }

    public int t() {
        return this.f11915f;
    }

    public d(Bitmap bitmap, com.facebook.common.references.c<Bitmap> cVar, h hVar, int i4, int i5) {
        this.f11913d = (Bitmap) com.facebook.common.internal.h.i(bitmap);
        this.f11912c = com.facebook.common.references.a.v(this.f11913d, (com.facebook.common.references.c) com.facebook.common.internal.h.i(cVar));
        this.f11914e = hVar;
        this.f11915f = i4;
        this.f11916g = i5;
    }

    public d(com.facebook.common.references.a<Bitmap> aVar, h hVar, int i4) {
        this(aVar, hVar, i4, 0);
    }

    public d(com.facebook.common.references.a<Bitmap> aVar, h hVar, int i4, int i5) {
        com.facebook.common.references.a<Bitmap> aVar2 = (com.facebook.common.references.a) com.facebook.common.internal.h.i(aVar.b());
        this.f11912c = aVar2;
        this.f11913d = aVar2.k();
        this.f11914e = hVar;
        this.f11915f = i4;
        this.f11916g = i5;
    }
}

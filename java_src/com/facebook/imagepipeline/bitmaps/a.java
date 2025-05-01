package com.facebook.imagepipeline.bitmaps;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: ArtBitmapFactory.java */
@ThreadSafe
@TargetApi(21)
/* loaded from: classes2.dex */
public class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.d f11604a;

    public a(com.facebook.imagepipeline.memory.d dVar) {
        this.f11604a = dVar;
    }

    @Override // com.facebook.imagepipeline.bitmaps.f
    public com.facebook.common.references.a<Bitmap> z(int i4, int i5, Bitmap.Config config) {
        Bitmap bitmap = this.f11604a.get(com.facebook.imageutils.a.f(i4, i5, config));
        com.facebook.common.internal.h.d(bitmap.getAllocationByteCount() >= (i4 * i5) * com.facebook.imageutils.a.e(config));
        bitmap.reconfigure(i4, i5, config);
        return com.facebook.common.references.a.v(bitmap, this.f11604a);
    }
}

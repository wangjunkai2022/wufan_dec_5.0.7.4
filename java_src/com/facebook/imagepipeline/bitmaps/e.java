package com.facebook.imagepipeline.bitmaps;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.common.memory.PooledByteBuffer;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: HoneycombBitmapFactory.java */
@ThreadSafe
@TargetApi(11)
/* loaded from: classes2.dex */
public class e extends f {

    /* renamed from: d  reason: collision with root package name */
    private static final String f11610d = "e";

    /* renamed from: a  reason: collision with root package name */
    private final b f11611a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.platform.f f11612b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11613c;

    public e(b bVar, com.facebook.imagepipeline.platform.f fVar) {
        this.f11611a = bVar;
        this.f11612b = fVar;
    }

    private static com.facebook.common.references.a<Bitmap> E(int i4, int i5, Bitmap.Config config) {
        return com.facebook.common.references.a.v(Bitmap.createBitmap(i4, i5, config), h.a());
    }

    @Override // com.facebook.imagepipeline.bitmaps.f
    @TargetApi(12)
    public com.facebook.common.references.a<Bitmap> z(int i4, int i5, Bitmap.Config config) {
        if (this.f11613c) {
            return E(i4, i5, config);
        }
        com.facebook.common.references.a<PooledByteBuffer> a5 = this.f11611a.a((short) i4, (short) i5);
        try {
            com.facebook.imagepipeline.image.e eVar = new com.facebook.imagepipeline.image.e(a5);
            eVar.X(com.facebook.imageformat.b.f11528a);
            com.facebook.common.references.a<Bitmap> d5 = this.f11612b.d(eVar, config, null, a5.k().size());
            if (!d5.k().isMutable()) {
                com.facebook.common.references.a.h(d5);
                this.f11613c = true;
                com.facebook.common.logging.a.w0(f11610d, "Immutable bitmap returned by decoder");
                com.facebook.common.references.a<Bitmap> E = E(i4, i5, config);
                com.facebook.imagepipeline.image.e.d(eVar);
                return E;
            }
            d5.k().setHasAlpha(true);
            d5.k().eraseColor(0);
            com.facebook.imagepipeline.image.e.d(eVar);
            return d5;
        } finally {
            a5.close();
        }
    }
}

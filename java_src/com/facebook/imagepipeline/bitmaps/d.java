package com.facebook.imagepipeline.bitmaps;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.memory.d0;
import com.facebook.imagepipeline.memory.p;
/* compiled from: HoneycombBitmapCreator.java */
/* loaded from: classes2.dex */
public class d implements com.facebook.common.webp.a {

    /* renamed from: a  reason: collision with root package name */
    private final b f11608a;

    /* renamed from: b  reason: collision with root package name */
    private final p f11609b;

    public d(d0 d0Var) {
        this.f11609b = d0Var.c();
        this.f11608a = new b(d0Var.g());
    }

    private static BitmapFactory.Options b(int i4, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i4;
        if (Build.VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    @Override // com.facebook.common.webp.a
    @TargetApi(12)
    public Bitmap a(int i4, int i5, Bitmap.Config config) {
        com.facebook.imagepipeline.image.e eVar;
        com.facebook.common.references.a<PooledByteBuffer> a5 = this.f11608a.a((short) i4, (short) i5);
        com.facebook.common.references.a<byte[]> aVar = null;
        try {
            eVar = new com.facebook.imagepipeline.image.e(a5);
            try {
                eVar.X(com.facebook.imageformat.b.f11528a);
                BitmapFactory.Options b5 = b(eVar.y(), config);
                int size = a5.k().size();
                aVar = this.f11609b.a(size + 2);
                byte[] k4 = aVar.k();
                a5.k().c(0, k4, 0, size);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(k4, 0, size, b5);
                decodeByteArray.setHasAlpha(true);
                decodeByteArray.eraseColor(0);
                com.facebook.common.references.a.h(aVar);
                com.facebook.imagepipeline.image.e.d(eVar);
                com.facebook.common.references.a.h(a5);
                return decodeByteArray;
            } catch (Throwable th) {
                th = th;
                com.facebook.common.references.a.h(aVar);
                com.facebook.imagepipeline.image.e.d(eVar);
                com.facebook.common.references.a.h(a5);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            eVar = null;
        }
    }
}

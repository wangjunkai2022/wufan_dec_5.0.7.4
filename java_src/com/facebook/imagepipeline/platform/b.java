package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.Pools;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: DefaultDecoder.java */
@ThreadSafe
@TargetApi(21)
/* loaded from: classes.dex */
public abstract class b implements f {

    /* renamed from: e  reason: collision with root package name */
    private static final int f12088e = 16384;

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.d f12090a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final PreverificationHelper f12091b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    final Pools.SynchronizedPool<ByteBuffer> f12092c;

    /* renamed from: d  reason: collision with root package name */
    private static final Class<?> f12087d = b.class;

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f12089f = {-1, -39};

    public b(com.facebook.imagepipeline.memory.d dVar, int i4, Pools.SynchronizedPool synchronizedPool) {
        this.f12091b = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f12090a = dVar;
        this.f12092c = synchronizedPool;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f12092c.release(ByteBuffer.allocate(16384));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8 A[Catch: all -> 0x00cb, RuntimeException -> 0x00cd, IllegalArgumentException -> 0x00d6, TRY_LEAVE, TryCatch #7 {IllegalArgumentException -> 0x00d6, RuntimeException -> 0x00cd, blocks: (B:28:0x006e, B:33:0x0085, B:48:0x00a8, B:40:0x0099, B:44:0x00a1, B:45:0x00a4), top: B:77:0x006e, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.common.references.a<android.graphics.Bitmap> e(java.io.InputStream r10, android.graphics.BitmapFactory.Options r11, @javax.annotation.Nullable android.graphics.Rect r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.b.e(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, boolean):com.facebook.common.references.a");
    }

    private static BitmapFactory.Options h(com.facebook.imagepipeline.image.e eVar, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = eVar.y();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(eVar.u(), null, options);
        if (options.outWidth != -1 && options.outHeight != -1) {
            options.inJustDecodeBounds = false;
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inMutable = true;
            return options;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.facebook.imagepipeline.platform.f
    public com.facebook.common.references.a<Bitmap> a(com.facebook.imagepipeline.image.e eVar, Bitmap.Config config, @Nullable Rect rect) {
        return b(eVar, config, rect, false);
    }

    @Override // com.facebook.imagepipeline.platform.f
    public com.facebook.common.references.a<Bitmap> b(com.facebook.imagepipeline.image.e eVar, Bitmap.Config config, @Nullable Rect rect, boolean z4) {
        BitmapFactory.Options h4 = h(eVar, config);
        boolean z5 = h4.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return e(eVar.u(), h4, rect, z4);
        } catch (RuntimeException e5) {
            if (z5) {
                return b(eVar, Bitmap.Config.ARGB_8888, rect, z4);
            }
            throw e5;
        }
    }

    @Override // com.facebook.imagepipeline.platform.f
    public com.facebook.common.references.a<Bitmap> c(com.facebook.imagepipeline.image.e eVar, Bitmap.Config config, @Nullable Rect rect, int i4, boolean z4) {
        boolean C = eVar.C(i4);
        BitmapFactory.Options h4 = h(eVar, config);
        h0.b u4 = eVar.u();
        h.i(u4);
        if (eVar.z() > i4) {
            u4 = new h0.a(u4, i4);
        }
        if (!C) {
            u4 = new h0.b(u4, f12089f);
        }
        boolean z5 = h4.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return e(u4, h4, rect, z4);
        } catch (RuntimeException e5) {
            if (z5) {
                return c(eVar, Bitmap.Config.ARGB_8888, rect, i4, z4);
            }
            throw e5;
        }
    }

    @Override // com.facebook.imagepipeline.platform.f
    public com.facebook.common.references.a<Bitmap> d(com.facebook.imagepipeline.image.e eVar, Bitmap.Config config, @Nullable Rect rect, int i4) {
        return c(eVar, config, rect, i4, false);
    }

    protected com.facebook.common.references.a<Bitmap> f(InputStream inputStream, BitmapFactory.Options options, @Nullable Rect rect) {
        return e(inputStream, options, rect, false);
    }

    public abstract int g(int i4, int i5, BitmapFactory.Options options);
}

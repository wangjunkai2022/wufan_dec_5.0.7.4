package com.facebook.imagepipeline.postprocessors;

import android.graphics.Bitmap;
import com.facebook.cache.common.i;
import com.facebook.common.internal.h;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import javax.annotation.Nullable;
/* compiled from: IterativeBoxBlurPostProcessor.java */
/* loaded from: classes.dex */
public class b extends com.facebook.imagepipeline.request.a {

    /* renamed from: e  reason: collision with root package name */
    private static final int f12102e = 3;

    /* renamed from: b  reason: collision with root package name */
    private final int f12103b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12104c;

    /* renamed from: d  reason: collision with root package name */
    private com.facebook.cache.common.c f12105d;

    public b(int i4) {
        this(3, i4);
    }

    @Override // com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.d
    @Nullable
    public com.facebook.cache.common.c a() {
        if (this.f12105d == null) {
            this.f12105d = new i(String.format(null, "i%dr%d", Integer.valueOf(this.f12103b), Integer.valueOf(this.f12104c)));
        }
        return this.f12105d;
    }

    @Override // com.facebook.imagepipeline.request.a
    public void e(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f12103b, this.f12104c);
    }

    public b(int i4, int i5) {
        h.d(i4 > 0);
        h.d(i5 > 0);
        this.f12103b = i4;
        this.f12104c = i5;
    }
}

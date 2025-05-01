package com.facebook.imagepipeline.postprocessors;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.cache.common.i;
import com.facebook.common.internal.h;
import javax.annotation.Nullable;
/* compiled from: BlurPostProcessor.java */
/* loaded from: classes.dex */
public class a extends com.facebook.imagepipeline.request.a {

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f12096f = u0.c.b();

    /* renamed from: g  reason: collision with root package name */
    private static final int f12097g = 3;

    /* renamed from: b  reason: collision with root package name */
    private final int f12098b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f12099c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12100d;

    /* renamed from: e  reason: collision with root package name */
    private com.facebook.cache.common.c f12101e;

    public a(int i4, Context context, int i5) {
        h.d(i4 > 0 && i4 <= 25);
        h.d(i5 > 0);
        h.i(context);
        this.f12098b = i5;
        this.f12100d = i4;
        this.f12099c = context;
    }

    @Override // com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.d
    @Nullable
    public com.facebook.cache.common.c a() {
        if (this.f12101e == null) {
            this.f12101e = new i(f12096f ? String.format(null, "IntrinsicBlur;%d", Integer.valueOf(this.f12100d)) : String.format(null, "IterativeBoxBlur;%d;%d", Integer.valueOf(this.f12098b), Integer.valueOf(this.f12100d)));
        }
        return this.f12101e;
    }

    @Override // com.facebook.imagepipeline.request.a
    public void e(Bitmap bitmap) {
        u0.b.b(bitmap, this.f12098b, this.f12100d);
    }

    @Override // com.facebook.imagepipeline.request.a
    public void f(Bitmap bitmap, Bitmap bitmap2) {
        if (f12096f) {
            u0.c.a(bitmap, bitmap2, this.f12099c, this.f12100d);
        } else {
            super.f(bitmap, bitmap2);
        }
    }

    public a(int i4, Context context) {
        this(i4, context, 3);
    }
}

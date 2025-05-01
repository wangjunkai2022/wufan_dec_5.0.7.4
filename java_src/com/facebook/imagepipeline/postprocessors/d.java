package com.facebook.imagepipeline.postprocessors;

import android.graphics.Bitmap;
import com.facebook.cache.common.i;
import com.facebook.common.internal.h;
import javax.annotation.Nullable;
/* compiled from: RoundPostprocessor.java */
/* loaded from: classes.dex */
public class d extends com.facebook.imagepipeline.request.a {

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f12109d = true;

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f12110e = u0.d.a();
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.cache.common.c f12111b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12112c;

    public d() {
        this(true);
    }

    @Override // com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.d
    @Nullable
    public com.facebook.cache.common.c a() {
        if (this.f12111b == null) {
            if (f12110e) {
                this.f12111b = new i("XferRoundFilter");
            } else {
                this.f12111b = new i("InPlaceRoundFilter");
            }
        }
        return this.f12111b;
    }

    @Override // com.facebook.imagepipeline.request.a
    public void e(Bitmap bitmap) {
        u0.a.a(bitmap);
    }

    @Override // com.facebook.imagepipeline.request.a
    public void f(Bitmap bitmap, Bitmap bitmap2) {
        h.i(bitmap);
        h.i(bitmap2);
        if (f12110e) {
            u0.d.b(bitmap, bitmap2, this.f12112c);
        } else {
            super.f(bitmap, bitmap2);
        }
    }

    public d(boolean z4) {
        this.f12112c = z4;
    }
}

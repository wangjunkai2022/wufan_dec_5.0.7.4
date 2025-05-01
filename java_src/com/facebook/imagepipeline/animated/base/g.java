package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import java.util.List;
/* compiled from: AnimatedImageResultBuilder.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final d f11568a;

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.common.references.a<Bitmap> f11569b;

    /* renamed from: c  reason: collision with root package name */
    private List<com.facebook.common.references.a<Bitmap>> f11570c;

    /* renamed from: d  reason: collision with root package name */
    private int f11571d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(d dVar) {
        this.f11568a = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.facebook.common.references.a<android.graphics.Bitmap>>, com.facebook.common.references.a<android.graphics.Bitmap>] */
    public f a() {
        try {
            return new f(this);
        } finally {
            com.facebook.common.references.a.h(this.f11569b);
            this.f11569b = null;
            com.facebook.common.references.a.j(this.f11570c);
            this.f11570c = null;
        }
    }

    public List<com.facebook.common.references.a<Bitmap>> b() {
        return com.facebook.common.references.a.g(this.f11570c);
    }

    public int c() {
        return this.f11571d;
    }

    public d d() {
        return this.f11568a;
    }

    public com.facebook.common.references.a<Bitmap> e() {
        return com.facebook.common.references.a.d(this.f11569b);
    }

    public g f(List<com.facebook.common.references.a<Bitmap>> list) {
        this.f11570c = com.facebook.common.references.a.g(list);
        return this;
    }

    public g g(int i4) {
        this.f11571d = i4;
        return this;
    }

    public g h(com.facebook.common.references.a<Bitmap> aVar) {
        this.f11569b = com.facebook.common.references.a.d(aVar);
        return this;
    }
}

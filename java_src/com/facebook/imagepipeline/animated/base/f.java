package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import java.util.List;
import javax.annotation.Nullable;
/* compiled from: AnimatedImageResult.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final d f11564a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11565b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.common.references.a<Bitmap> f11566c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private List<com.facebook.common.references.a<Bitmap>> f11567d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(g gVar) {
        this.f11564a = (d) com.facebook.common.internal.h.i(gVar.d());
        this.f11565b = gVar.c();
        this.f11566c = gVar.e();
        this.f11567d = gVar.b();
    }

    public static f b(d dVar) {
        return new f(dVar);
    }

    public static g h(d dVar) {
        return new g(dVar);
    }

    public synchronized void a() {
        com.facebook.common.references.a.h(this.f11566c);
        this.f11566c = null;
        com.facebook.common.references.a.j(this.f11567d);
        this.f11567d = null;
    }

    @Nullable
    public synchronized com.facebook.common.references.a<Bitmap> c(int i4) {
        List<com.facebook.common.references.a<Bitmap>> list = this.f11567d;
        if (list != null) {
            return com.facebook.common.references.a.d(list.get(i4));
        }
        return null;
    }

    public int d() {
        return this.f11565b;
    }

    public d e() {
        return this.f11564a;
    }

    public synchronized com.facebook.common.references.a<Bitmap> f() {
        return com.facebook.common.references.a.d(this.f11566c);
    }

    public synchronized boolean g(int i4) {
        boolean z4;
        List<com.facebook.common.references.a<Bitmap>> list = this.f11567d;
        if (list != null) {
            z4 = list.get(i4) != null;
        }
        return z4;
    }

    private f(d dVar) {
        this.f11564a = (d) com.facebook.common.internal.h.i(dVar);
        this.f11565b = 0;
    }
}

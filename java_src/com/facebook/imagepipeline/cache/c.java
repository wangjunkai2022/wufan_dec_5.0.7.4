package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.common.RotationOptions;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
/* compiled from: BitmapMemoryCacheKey.java */
@Immutable
/* loaded from: classes.dex */
public class c implements com.facebook.cache.common.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f11617a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.common.d f11618b;

    /* renamed from: c  reason: collision with root package name */
    private final RotationOptions f11619c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.imagepipeline.common.b f11620d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private final com.facebook.cache.common.c f11621e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private final String f11622f;

    /* renamed from: g  reason: collision with root package name */
    private final int f11623g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f11624h;

    /* renamed from: i  reason: collision with root package name */
    private final long f11625i;

    public c(String str, @Nullable com.facebook.imagepipeline.common.d dVar, RotationOptions rotationOptions, com.facebook.imagepipeline.common.b bVar, @Nullable com.facebook.cache.common.c cVar, @Nullable String str2, Object obj) {
        this.f11617a = (String) com.facebook.common.internal.h.i(str);
        this.f11618b = dVar;
        this.f11619c = rotationOptions;
        this.f11620d = bVar;
        this.f11621e = cVar;
        this.f11622f = str2;
        this.f11623g = com.facebook.common.util.b.l(Integer.valueOf(str.hashCode()), Integer.valueOf(dVar != null ? dVar.hashCode() : 0), Integer.valueOf(rotationOptions.hashCode()), bVar, cVar, str2);
        this.f11624h = obj;
        this.f11625i = RealtimeSinceBootClock.get().now();
    }

    @Override // com.facebook.cache.common.c
    public String a() {
        return this.f11617a;
    }

    @Override // com.facebook.cache.common.c
    public boolean b(Uri uri) {
        return a().contains(uri.toString());
    }

    public Object c() {
        return this.f11624h;
    }

    public long d() {
        return this.f11625i;
    }

    @Nullable
    public String e() {
        return this.f11622f;
    }

    @Override // com.facebook.cache.common.c
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f11623g == cVar.f11623g && this.f11617a.equals(cVar.f11617a) && com.facebook.common.internal.g.a(this.f11618b, cVar.f11618b) && com.facebook.common.internal.g.a(this.f11619c, cVar.f11619c) && com.facebook.common.internal.g.a(this.f11620d, cVar.f11620d) && com.facebook.common.internal.g.a(this.f11621e, cVar.f11621e) && com.facebook.common.internal.g.a(this.f11622f, cVar.f11622f);
        }
        return false;
    }

    @Override // com.facebook.cache.common.c
    public int hashCode() {
        return this.f11623g;
    }

    @Override // com.facebook.cache.common.c
    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", this.f11617a, this.f11618b, this.f11619c, this.f11620d, this.f11621e, this.f11622f, Integer.valueOf(this.f11623g));
    }
}

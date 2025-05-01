package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
/* compiled from: ImageDecodeOptions.java */
@Immutable
/* loaded from: classes.dex */
public class b {

    /* renamed from: j  reason: collision with root package name */
    private static final b f11706j = b().a();

    /* renamed from: a  reason: collision with root package name */
    public final int f11707a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11708b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11709c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11710d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11711e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11712f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap.Config f11713g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final com.facebook.imagepipeline.decoder.b f11714h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final w0.a f11715i;

    public b(c cVar) {
        this.f11707a = cVar.h();
        this.f11708b = cVar.f();
        this.f11709c = cVar.j();
        this.f11710d = cVar.e();
        this.f11711e = cVar.g();
        this.f11713g = cVar.b();
        this.f11714h = cVar.d();
        this.f11712f = cVar.i();
        this.f11715i = cVar.c();
    }

    public static b a() {
        return f11706j;
    }

    public static c b() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11708b == bVar.f11708b && this.f11709c == bVar.f11709c && this.f11710d == bVar.f11710d && this.f11711e == bVar.f11711e && this.f11712f == bVar.f11712f && this.f11713g == bVar.f11713g && this.f11714h == bVar.f11714h && this.f11715i == bVar.f11715i;
    }

    public int hashCode() {
        int ordinal = ((((((((((((this.f11707a * 31) + (this.f11708b ? 1 : 0)) * 31) + (this.f11709c ? 1 : 0)) * 31) + (this.f11710d ? 1 : 0)) * 31) + (this.f11711e ? 1 : 0)) * 31) + (this.f11712f ? 1 : 0)) * 31) + this.f11713g.ordinal()) * 31;
        com.facebook.imagepipeline.decoder.b bVar = this.f11714h;
        int hashCode = (ordinal + (bVar != null ? bVar.hashCode() : 0)) * 31;
        w0.a aVar = this.f11715i;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return String.format(null, "%d-%b-%b-%b-%b-%b-%s-%s-%s", Integer.valueOf(this.f11707a), Boolean.valueOf(this.f11708b), Boolean.valueOf(this.f11709c), Boolean.valueOf(this.f11710d), Boolean.valueOf(this.f11711e), Boolean.valueOf(this.f11712f), this.f11713g.name(), this.f11714h, this.f11715i);
    }
}

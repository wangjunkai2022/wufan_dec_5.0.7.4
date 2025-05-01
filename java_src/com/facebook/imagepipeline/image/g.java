package com.facebook.imagepipeline.image;
/* compiled from: ImmutableQualityInfo.java */
/* loaded from: classes2.dex */
public class g implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final h f11933d = d(Integer.MAX_VALUE, true, true);

    /* renamed from: a  reason: collision with root package name */
    int f11934a;

    /* renamed from: b  reason: collision with root package name */
    boolean f11935b;

    /* renamed from: c  reason: collision with root package name */
    boolean f11936c;

    private g(int i4, boolean z4, boolean z5) {
        this.f11934a = i4;
        this.f11935b = z4;
        this.f11936c = z5;
    }

    public static h d(int i4, boolean z4, boolean z5) {
        return new g(i4, z4, z5);
    }

    @Override // com.facebook.imagepipeline.image.h
    public boolean a() {
        return this.f11936c;
    }

    @Override // com.facebook.imagepipeline.image.h
    public boolean b() {
        return this.f11935b;
    }

    @Override // com.facebook.imagepipeline.image.h
    public int c() {
        return this.f11934a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f11934a == gVar.f11934a && this.f11935b == gVar.f11935b && this.f11936c == gVar.f11936c;
        }
        return false;
    }

    public int hashCode() {
        return (this.f11934a ^ (this.f11935b ? 4194304 : 0)) ^ (this.f11936c ? 8388608 : 0);
    }
}

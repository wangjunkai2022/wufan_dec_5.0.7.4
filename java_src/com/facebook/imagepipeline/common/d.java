package com.facebook.imagepipeline.common;

import com.facebook.common.internal.h;
import javax.annotation.Nullable;
/* compiled from: ResizeOptions.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: e  reason: collision with root package name */
    public static final float f11725e = 0.6666667f;

    /* renamed from: a  reason: collision with root package name */
    public final int f11726a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11727b;

    /* renamed from: c  reason: collision with root package name */
    public final float f11728c;

    /* renamed from: d  reason: collision with root package name */
    public final float f11729d;

    public d(int i4, int i5) {
        this(i4, i5, 2048.0f);
    }

    @Nullable
    public static d a(int i4, int i5) {
        if (i4 <= 0 || i5 <= 0) {
            return null;
        }
        return new d(i4, i5);
    }

    @Nullable
    public static d b(int i4) {
        if (i4 <= 0) {
            return null;
        }
        return new d(i4, i4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f11726a == dVar.f11726a && this.f11727b == dVar.f11727b;
        }
        return false;
    }

    public int hashCode() {
        return com.facebook.common.util.b.b(this.f11726a, this.f11727b);
    }

    public String toString() {
        return String.format(null, "%dx%d", Integer.valueOf(this.f11726a), Integer.valueOf(this.f11727b));
    }

    public d(int i4, int i5, float f5) {
        this(i4, i5, f5, 0.6666667f);
    }

    public d(int i4, int i5, float f5, float f6) {
        h.d(i4 > 0);
        h.d(i5 > 0);
        this.f11726a = i4;
        this.f11727b = i5;
        this.f11728c = f5;
        this.f11729d = f6;
    }
}

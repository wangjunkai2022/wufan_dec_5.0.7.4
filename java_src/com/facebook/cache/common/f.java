package com.facebook.cache.common;

import android.net.Uri;
import java.util.List;
/* compiled from: MultiCacheKey.java */
/* loaded from: classes2.dex */
public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    final List<c> f10704a;

    public f(List<c> list) {
        this.f10704a = (List) com.facebook.common.internal.h.i(list);
    }

    @Override // com.facebook.cache.common.c
    public String a() {
        return this.f10704a.get(0).a();
    }

    @Override // com.facebook.cache.common.c
    public boolean b(Uri uri) {
        for (int i4 = 0; i4 < this.f10704a.size(); i4++) {
            if (this.f10704a.get(i4).b(uri)) {
                return true;
            }
        }
        return false;
    }

    public List<c> c() {
        return this.f10704a;
    }

    @Override // com.facebook.cache.common.c
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f10704a.equals(((f) obj).f10704a);
        }
        return false;
    }

    @Override // com.facebook.cache.common.c
    public int hashCode() {
        return this.f10704a.hashCode();
    }

    @Override // com.facebook.cache.common.c
    public String toString() {
        return "MultiCacheKey:" + this.f10704a.toString();
    }
}

package com.facebook.cache.common;

import android.net.Uri;
/* compiled from: SimpleCacheKey.java */
/* loaded from: classes2.dex */
public class i implements c {

    /* renamed from: a  reason: collision with root package name */
    final String f10707a;

    public i(String str) {
        this.f10707a = (String) com.facebook.common.internal.h.i(str);
    }

    @Override // com.facebook.cache.common.c
    public String a() {
        return this.f10707a;
    }

    @Override // com.facebook.cache.common.c
    public boolean b(Uri uri) {
        return this.f10707a.contains(uri.toString());
    }

    @Override // com.facebook.cache.common.c
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f10707a.equals(((i) obj).f10707a);
        }
        return false;
    }

    @Override // com.facebook.cache.common.c
    public int hashCode() {
        return this.f10707a.hashCode();
    }

    @Override // com.facebook.cache.common.c
    public String toString() {
        return this.f10707a;
    }
}

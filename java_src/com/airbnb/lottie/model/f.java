package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import com.airbnb.lottie.k;
/* compiled from: LottieCompositionCache.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class f {

    /* renamed from: b  reason: collision with root package name */
    private static final f f4045b = new f();

    /* renamed from: a  reason: collision with root package name */
    private final LruCache<String, k> f4046a = new LruCache<>(20);

    @VisibleForTesting
    f() {
    }

    public static f c() {
        return f4045b;
    }

    public void a() {
        this.f4046a.evictAll();
    }

    @Nullable
    public k b(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.f4046a.get(str);
    }

    public void d(@Nullable String str, k kVar) {
        if (str == null) {
            return;
        }
        this.f4046a.put(str, kVar);
    }

    public void e(int i4) {
        this.f4046a.resize(i4);
    }
}

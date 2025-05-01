package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;
/* compiled from: LottieResult.java */
/* loaded from: classes2.dex */
public final class t0<V> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final V f4297a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f4298b;

    public t0(V v2) {
        this.f4297a = v2;
        this.f4298b = null;
    }

    @Nullable
    public Throwable a() {
        return this.f4298b;
    }

    @Nullable
    public V b() {
        return this.f4297a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            if (b() == null || !b().equals(t0Var.b())) {
                if (a() == null || t0Var.a() == null) {
                    return false;
                }
                return a().toString().equals(a().toString());
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public t0(Throwable th) {
        this.f4298b = th;
        this.f4297a = null;
    }
}

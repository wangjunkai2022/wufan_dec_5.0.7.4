package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
/* compiled from: MutablePair.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class h<T> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    T f4051a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    T f4052b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(T t4, T t5) {
        this.f4051a = t4;
        this.f4052b = t5;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            return a(pair.first, this.f4051a) && a(pair.second, this.f4052b);
        }
        return false;
    }

    public int hashCode() {
        T t4 = this.f4051a;
        int hashCode = t4 == null ? 0 : t4.hashCode();
        T t5 = this.f4052b;
        return hashCode ^ (t5 != null ? t5.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f4051a + " " + this.f4052b + "}";
    }
}

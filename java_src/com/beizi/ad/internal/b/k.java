package com.beizi.ad.internal.b;

import java.util.Objects;
/* compiled from: Preconditions.java */
/* loaded from: classes2.dex */
public final class k {
    public static <T> T a(T t4) {
        Objects.requireNonNull(t4);
        return t4;
    }

    public static void a(Object... objArr) {
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
        }
    }

    public static <T> T a(T t4, String str) {
        Objects.requireNonNull(t4, str);
        return t4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(boolean z4, String str) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }
}

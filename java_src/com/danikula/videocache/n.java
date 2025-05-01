package com.danikula.videocache;

import java.util.Objects;
/* compiled from: Preconditions.java */
/* loaded from: classes2.dex */
public final class n {
    public static void a(Object... objArr) {
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(boolean z4, String str) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T d(T t4) {
        Objects.requireNonNull(t4);
        return t4;
    }

    public static <T> T e(T t4, String str) {
        Objects.requireNonNull(t4, str);
        return t4;
    }
}

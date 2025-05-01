package com.kwad.sdk.utils;

import android.text.TextUtils;
import androidx.annotation.Nullable;
/* loaded from: classes5.dex */
public final class aq {
    private static void a(RuntimeException runtimeException) {
        com.kwad.sdk.core.e.c.printStackTrace(runtimeException);
    }

    public static String av(String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str)) {
            a(new NullPointerException("Argument cannot be null " + str2));
        }
        return str;
    }

    public static void checkArgument(boolean z4, @Nullable Object obj) {
        if (z4) {
            return;
        }
        a(new IllegalArgumentException("Expression cannot be false " + obj));
    }

    public static <T> T checkNotNull(T t4) {
        return (T) g(t4, "");
    }

    public static void f(Object... objArr) {
        for (int i4 = 0; i4 < 2; i4++) {
            checkNotNull(objArr[i4]);
        }
    }

    public static <T> T g(T t4, @Nullable String str) {
        if (t4 == null) {
            a(new NullPointerException("Argument cannot be null " + str));
        }
        return t4;
    }

    public static String gR(String str) {
        return av(str, "");
    }
}

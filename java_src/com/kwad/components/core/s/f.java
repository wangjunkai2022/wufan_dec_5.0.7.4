package com.kwad.components.core.s;

import androidx.annotation.Nullable;
import com.join.mgps.Util.h0;
/* loaded from: classes5.dex */
public final class f {
    public static String a(StackTraceElement stackTraceElement) {
        return stackTraceElement.getClassName() + h0.f27805a + stackTraceElement.getMethodName();
    }

    public static boolean aB(@Nullable String str) {
        if (str == null) {
            return false;
        }
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (a(stackTraceElement).equals(str)) {
                return true;
            }
        }
        return false;
    }
}

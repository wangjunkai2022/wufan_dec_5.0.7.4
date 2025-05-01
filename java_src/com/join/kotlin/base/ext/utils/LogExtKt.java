package com.join.kotlin.base.ext.utils;

import com.join.android.app.common.http.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: LogExt.kt */
/* loaded from: classes3.dex */
public final class LogExtKt {
    @NotNull
    public static final String TAG = "WF-PLATFORM";

    /* compiled from: LogExt.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LEVEL.values().length];
            try {
                iArr[LEVEL.V.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LEVEL.D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LEVEL.I.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LEVEL.W.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LEVEL.E.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void log(LEVEL level, String str, String str2) {
        if (c.f14632c) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
        }
    }

    public static final void logd(@NotNull String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(LEVEL.D, tag, str);
    }

    public static /* synthetic */ void logd$default(String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = TAG;
        }
        logd(str, str2);
    }

    public static final void loge(@NotNull String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(LEVEL.E, tag, str);
    }

    public static /* synthetic */ void loge$default(String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = TAG;
        }
        loge(str, str2);
    }

    public static final void logi(@NotNull String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(LEVEL.I, tag, str);
    }

    public static /* synthetic */ void logi$default(String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = TAG;
        }
        logi(str, str2);
    }

    public static final void logv(@NotNull String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(LEVEL.V, tag, str);
    }

    public static /* synthetic */ void logv$default(String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = TAG;
        }
        logv(str, str2);
    }

    public static final void logw(@NotNull String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(LEVEL.W, tag, str);
    }

    public static /* synthetic */ void logw$default(String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = TAG;
        }
        logw(str, str2);
    }
}

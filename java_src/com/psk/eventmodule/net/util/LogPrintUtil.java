package com.psk.eventmodule.net.util;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: LogPrintUtil.kt */
/* loaded from: classes5.dex */
public class LogPrintUtil {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    private static final boolean printLog = false;

    /* compiled from: LogPrintUtil.kt */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getPrintLog$annotations() {
        }

        public final boolean getPrintLog() {
            return LogPrintUtil.printLog;
        }

        @JvmStatic
        public final void printOut(@NotNull String tag, @NotNull String msg, @NotNull String headString) {
            boolean startsWith$default;
            boolean startsWith$default2;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Intrinsics.checkNotNullParameter(headString, "headString");
            try {
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(msg, "{", false, 2, null);
                if (startsWith$default) {
                    msg = new JSONObject(msg).toString(4);
                } else {
                    startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(msg, "[", false, 2, null);
                    if (startsWith$default2) {
                        msg = new JSONArray(msg).toString(4);
                    }
                }
                Intrinsics.checkNotNullExpressionValue(msg, "{\n                if (ms…          }\n            }");
            } catch (JSONException unused) {
            }
            String unused2 = LogPrintUtil.LINE_SEPARATOR;
            String unused3 = LogPrintUtil.LINE_SEPARATOR;
            String unused4 = LogPrintUtil.LINE_SEPARATOR;
            String unused5 = LogPrintUtil.LINE_SEPARATOR;
            String unused6 = LogPrintUtil.LINE_SEPARATOR;
        }
    }

    public static final boolean getPrintLog() {
        return Companion.getPrintLog();
    }

    @JvmStatic
    public static final void printOut(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Companion.printOut(str, str2, str3);
    }
}

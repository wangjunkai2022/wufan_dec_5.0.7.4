package androidx.tracing;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
@RequiresApi(29)
/* loaded from: classes2.dex */
final class TraceApi29Impl {
    private TraceApi29Impl() {
    }

    public static void beginAsyncSection(@NonNull String str, int i4) {
        android.os.Trace.beginAsyncSection(str, i4);
    }

    public static void endAsyncSection(@NonNull String str, int i4) {
        android.os.Trace.endAsyncSection(str, i4);
    }

    public static void setCounter(@NonNull String str, int i4) {
        android.os.Trace.setCounter(str, i4);
    }
}

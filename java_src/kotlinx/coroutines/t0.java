package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
/* compiled from: DebugStrings.kt */
/* loaded from: classes6.dex */
public final class t0 {
    @NotNull
    public static final String a(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }

    @NotNull
    public static final String b(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    public static final String c(@NotNull Continuation<?> continuation) {
        String m35constructorimpl;
        if (continuation instanceof kotlinx.coroutines.internal.l) {
            return continuation.toString();
        }
        try {
            Result.Companion companion = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(continuation + '@' + b(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m38exceptionOrNullimpl(m35constructorimpl) != null) {
            m35constructorimpl = ((Object) continuation.getClass().getName()) + '@' + b(continuation);
        }
        return (String) m35constructorimpl;
    }
}

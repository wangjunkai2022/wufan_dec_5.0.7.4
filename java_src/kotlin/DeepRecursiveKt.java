package kotlin;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: DeepRecursive.kt */
/* loaded from: classes6.dex */
public final class DeepRecursiveKt {
    @NotNull
    private static final Object UNDEFINED_RESULT;

    static {
        Object coroutine_suspended;
        Result.Companion companion = Result.Companion;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        UNDEFINED_RESULT = Result.m35constructorimpl(coroutine_suspended);
    }

    private static /* synthetic */ void getUNDEFINED_RESULT$annotations() {
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T, R> R invoke(@NotNull DeepRecursiveFunction<T, R> deepRecursiveFunction, T t4) {
        Intrinsics.checkNotNullParameter(deepRecursiveFunction, "<this>");
        return (R) new DeepRecursiveScopeImpl(deepRecursiveFunction.getBlock$kotlin_stdlib(), t4).runCallLoop();
    }
}

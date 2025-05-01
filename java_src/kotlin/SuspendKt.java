package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Suspend.kt */
/* loaded from: classes6.dex */
public final class SuspendKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = j1.b.f69563b)
    @InlineOnly
    private static final <R> Function1<Continuation<? super R>, Object> suspend(Function1<? super Continuation<? super R>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block;
    }
}

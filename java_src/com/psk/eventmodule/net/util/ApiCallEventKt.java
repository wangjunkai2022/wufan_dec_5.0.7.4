package com.psk.eventmodule.net.util;

import com.psk.eventmodule.net.modle.ResponseModel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ApiCallEvent.kt */
/* loaded from: classes5.dex */
public final class ApiCallEventKt {
    @Nullable
    public static final <T> Object apiCallEvent(@NotNull Function2<? super q0, ? super Continuation<? super ResponseModel<T>>, ? extends Object> function2, @NotNull Continuation<? super ResponseModel<T>> continuation) {
        return i.h(d1.c(), new ApiCallEventKt$apiCallEvent$2(function2, null), continuation);
    }

    private static final <T> Object apiCallEvent$$forInline(Function2<? super q0, ? super Continuation<? super ResponseModel<T>>, ? extends Object> function2, Continuation<? super ResponseModel<T>> continuation) {
        CoroutineDispatcher c5 = d1.c();
        ApiCallEventKt$apiCallEvent$2 apiCallEventKt$apiCallEvent$2 = new ApiCallEventKt$apiCallEvent$2(function2, null);
        InlineMarker.mark(0);
        Object h4 = i.h(c5, apiCallEventKt$apiCallEvent$2, continuation);
        InlineMarker.mark(1);
        return h4;
    }
}

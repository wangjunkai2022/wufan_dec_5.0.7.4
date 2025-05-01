package com.join.kotlin.http.protocol;

import com.join.mgps.dto.ResponseModel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ApiCall.kt */
/* loaded from: classes3.dex */
public final class ApiCallKt {
    @Nullable
    public static final <T> Object apiCall(@NotNull Function2<? super q0, ? super Continuation<? super ResponseModel<T>>, ? extends Object> function2, @NotNull Continuation<? super ResponseModel<T>> continuation) {
        return i.h(d1.c(), new ApiCallKt$apiCall$2(function2, null), continuation);
    }

    private static final <T> Object apiCall$$forInline(Function2<? super q0, ? super Continuation<? super ResponseModel<T>>, ? extends Object> function2, Continuation<? super ResponseModel<T>> continuation) {
        CoroutineDispatcher c5 = d1.c();
        ApiCallKt$apiCall$2 apiCallKt$apiCall$2 = new ApiCallKt$apiCall$2(function2, null);
        InlineMarker.mark(0);
        Object h4 = i.h(c5, apiCallKt$apiCall$2, continuation);
        InlineMarker.mark(1);
        return h4;
    }
}

package com.join.kotlin.base.state;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.net.AppException;
import com.join.kotlin.base.net.ExceptionHandle;
import com.join.mgps.dto.ResponseModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ResultState.kt */
/* loaded from: classes3.dex */
public final class ResultStateKt {
    public static final <T> void paresException(@NotNull MutableLiveData<ResultState<T>> mutableLiveData, @NotNull Throwable e5) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<this>");
        Intrinsics.checkNotNullParameter(e5, "e");
        mutableLiveData.setValue(ResultState.Companion.onRequestError(ExceptionHandle.INSTANCE.handleException(e5)));
    }

    public static final <T> void paresResult(@NotNull MutableLiveData<ResultState<T>> mutableLiveData, @NotNull ResponseModel<T> result) {
        ResultState<T> onRequestError;
        Intrinsics.checkNotNullParameter(mutableLiveData, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.isSuccess()) {
            onRequestError = ResultState.Companion.onRequestSuccess(result.getResponseData());
        } else {
            onRequestError = ResultState.Companion.onRequestError(new AppException(result.getResponseCode(), result.getResponseMsg(), null, null, 12, null));
        }
        mutableLiveData.setValue(onRequestError);
    }

    public static final <T> void paresResult(@NotNull MutableLiveData<ResultState<T>> mutableLiveData, @Nullable T t4) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<this>");
        mutableLiveData.setValue(ResultState.Companion.onRequestSuccess(t4));
    }
}

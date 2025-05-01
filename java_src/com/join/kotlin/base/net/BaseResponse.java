package com.join.kotlin.base.net;

import org.jetbrains.annotations.NotNull;
/* compiled from: BaseResponse.kt */
/* loaded from: classes3.dex */
public abstract class BaseResponse<T> {
    public abstract int getResponseCode();

    public abstract T getResponseData();

    @NotNull
    public abstract String getResponseMsg();

    public abstract boolean isSuccess();
}

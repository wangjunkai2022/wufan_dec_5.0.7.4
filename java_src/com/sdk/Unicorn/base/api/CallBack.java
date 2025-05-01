package com.sdk.Unicorn.base.api;
/* loaded from: classes5.dex */
public interface CallBack<T> {
    void onFailed(int i4, int i5, String str, String str2);

    void onSuccess(int i4, String str, int i5, T t4, String str2);
}

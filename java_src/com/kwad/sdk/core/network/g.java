package com.kwad.sdk.core.network;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.kwad.sdk.core.network.f;
import com.kwad.sdk.core.response.model.BaseResultData;
/* loaded from: classes5.dex */
public interface g<R extends f, T extends BaseResultData> {
    @WorkerThread
    void onError(@NonNull R r4, int i4, String str);

    @WorkerThread
    void onStartRequest(@NonNull R r4);

    @WorkerThread
    void onSuccess(@NonNull R r4, @NonNull T t4);
}

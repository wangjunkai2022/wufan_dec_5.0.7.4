package com.kwad.components.offline.api;

import androidx.annotation.WorkerThread;
/* loaded from: classes5.dex */
public interface InitCallBack {
    @WorkerThread
    void onError(int i4);

    @WorkerThread
    void onSuccess(boolean z4);
}

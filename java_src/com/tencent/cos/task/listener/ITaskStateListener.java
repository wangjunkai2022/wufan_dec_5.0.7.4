package com.tencent.cos.task.listener;

import com.tencent.cos.model.COSResult;
/* loaded from: classes6.dex */
public interface ITaskStateListener {
    void onCancel();

    void onError(int i4, String str);

    void onFail();

    void onPause();

    void onResponse(COSResult cOSResult);

    void onRetry();

    void onSendBegin();

    void onSendFinish();

    void onTimeout();
}

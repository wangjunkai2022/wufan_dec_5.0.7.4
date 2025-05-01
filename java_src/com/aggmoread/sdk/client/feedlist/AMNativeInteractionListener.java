package com.aggmoread.sdk.client.feedlist;

import com.aggmoread.sdk.client.IAMAdInteractionListener;
/* loaded from: classes2.dex */
public interface AMNativeInteractionListener extends IAMAdInteractionListener {
    void onADStatusChanged(int i4);

    void onAdClicked();

    void onAdExposed();

    void onLoadApkProgress(int i4);
}

package com.aggmoread.sdk.client.splash;

import com.aggmoread.sdk.client.IAMAdInteractionListener;
/* loaded from: classes2.dex */
public interface AMSplashInteractionListener extends IAMAdInteractionListener {
    void onAdClicked();

    void onAdClosed();

    void onAdExposed();

    void onAdTick(long j4);
}

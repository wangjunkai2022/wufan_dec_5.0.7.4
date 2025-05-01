package com.beizi.fusion;

import android.view.View;
/* loaded from: classes2.dex */
public interface DrawAdListener extends a {
    void onAdClick();

    void onAdFailed(int i4);

    void onAdLoaded(View view);

    void onAdShown();

    void onVideoComplete();
}

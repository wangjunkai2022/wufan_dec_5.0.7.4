package com.kwad.sdk.api.model;

import androidx.annotation.Keep;
@Keep
/* loaded from: classes5.dex */
public class NativeAdExtraData {
    private boolean enableShake;
    private int showLiveStatus;
    private int showLiveStyle;

    public int getShowLiveStatus() {
        return this.showLiveStatus;
    }

    public int getShowLiveStyle() {
        return this.showLiveStyle;
    }

    public boolean isEnableShake() {
        return this.enableShake;
    }

    public NativeAdExtraData setEnableShake(boolean z4) {
        this.enableShake = z4;
        return this;
    }

    public NativeAdExtraData setShowLiveStatus(int i4) {
        this.showLiveStatus = i4;
        return this;
    }

    public NativeAdExtraData setShowLiveStyle(int i4) {
        this.showLiveStyle = i4;
        return this;
    }
}

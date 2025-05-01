package com.kwad.sdk.api.model;

import androidx.annotation.Keep;
@Keep
/* loaded from: classes5.dex */
public class SplashAdExtraData {
    private boolean isDisableRotate;
    private boolean isDisableShake;
    private boolean isDisableSlide;

    public boolean getDisableRotateStatus() {
        return this.isDisableRotate;
    }

    public boolean getDisableShakeStatus() {
        return this.isDisableShake;
    }

    public boolean getDisableSlideStatus() {
        return this.isDisableSlide;
    }

    public void setDisableRotateStatus(boolean z4) {
        this.isDisableRotate = z4;
    }

    public void setDisableShakeStatus(boolean z4) {
        this.isDisableShake = z4;
    }

    public void setDisableSlideStatus(boolean z4) {
        this.isDisableSlide = z4;
    }
}

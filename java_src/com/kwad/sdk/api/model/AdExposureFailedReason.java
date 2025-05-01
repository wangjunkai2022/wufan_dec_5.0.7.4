package com.kwad.sdk.api.model;

import androidx.annotation.Keep;
@Keep
/* loaded from: classes5.dex */
public class AdExposureFailedReason {
    public String adnName;
    public int adnType;
    public int winEcpm;

    public AdExposureFailedReason setAdnName(String str) {
        this.adnName = str;
        return this;
    }

    public AdExposureFailedReason setAdnType(int i4) {
        this.adnType = i4;
        return this;
    }

    public AdExposureFailedReason setWinEcpm(int i4) {
        this.winEcpm = i4;
        return this;
    }
}

package com.kwad.sdk.api;

import androidx.annotation.Keep;
import com.kwad.sdk.api.core.KsAdSdkApi;
@KsAdSdkApi
@Keep
/* loaded from: classes5.dex */
public interface KsInitCallback {
    void onFail(int i4, String str);

    void onSuccess();
}

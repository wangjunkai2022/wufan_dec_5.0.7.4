package com.bytedance.sdk.openadsdk.mediation;
/* loaded from: classes2.dex */
public interface IMediationNativeAdTokenCallback {
    void onAdTokenLoaded(String str, IMediationNativeTokenInfo iMediationNativeTokenInfo);

    void onAdTokenLoadedFail(int i4, String str);
}

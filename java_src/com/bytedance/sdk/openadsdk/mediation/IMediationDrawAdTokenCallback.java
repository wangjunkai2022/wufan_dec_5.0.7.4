package com.bytedance.sdk.openadsdk.mediation;
/* loaded from: classes2.dex */
public interface IMediationDrawAdTokenCallback {
    void onAdTokenLoaded(String str, IMediationDrawTokenInfo iMediationDrawTokenInfo);

    void onAdTokenLoadedFail(int i4, String str);
}

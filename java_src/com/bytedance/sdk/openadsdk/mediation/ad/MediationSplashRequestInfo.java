package com.bytedance.sdk.openadsdk.mediation.ad;

import androidx.annotation.Nullable;
/* loaded from: classes2.dex */
public abstract class MediationSplashRequestInfo implements IMediationSplashRequestInfo {

    /* renamed from: i  reason: collision with root package name */
    private String f8845i;

    /* renamed from: m  reason: collision with root package name */
    private String f8846m;

    /* renamed from: p  reason: collision with root package name */
    private String f8847p;
    private String vv;

    public MediationSplashRequestInfo(String str, String str2, String str3, String str4) {
        this.vv = str;
        this.f8846m = str2;
        this.f8847p = str3;
        this.f8845i = str4;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationSplashRequestInfo
    @Nullable
    public String getAdnName() {
        return this.vv;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationSplashRequestInfo
    @Nullable
    public String getAdnSlotId() {
        return this.f8846m;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationSplashRequestInfo
    @Nullable
    public String getAppId() {
        return this.f8847p;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationSplashRequestInfo
    @Nullable
    public String getAppkey() {
        return this.f8845i;
    }
}

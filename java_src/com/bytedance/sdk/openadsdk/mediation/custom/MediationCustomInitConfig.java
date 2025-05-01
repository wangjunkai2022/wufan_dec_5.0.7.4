package com.bytedance.sdk.openadsdk.mediation.custom;

import com.bykv.vk.openvk.api.proto.ValueSet;
/* loaded from: classes2.dex */
public class MediationCustomInitConfig {

    /* renamed from: b  reason: collision with root package name */
    private String f8906b;

    /* renamed from: i  reason: collision with root package name */
    private String f8907i;

    /* renamed from: k  reason: collision with root package name */
    private String f8908k;

    /* renamed from: m  reason: collision with root package name */
    private String f8909m;

    /* renamed from: n  reason: collision with root package name */
    private String f8910n;

    /* renamed from: o  reason: collision with root package name */
    private String f8911o;

    /* renamed from: p  reason: collision with root package name */
    private String f8912p;
    private String qv;

    /* renamed from: u  reason: collision with root package name */
    private String f8913u;
    private String vv;
    private String wv;

    public MediationCustomInitConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f8912p = str;
        this.vv = str2;
        this.f8909m = str3;
        this.f8907i = str4;
        this.f8911o = str5;
        this.f8913u = str6;
        this.f8910n = str7;
        this.qv = str8;
        this.wv = str9;
        this.f8908k = str10;
        this.f8906b = str11;
    }

    public String getADNName() {
        return this.f8912p;
    }

    public String getAdnInitClassName() {
        return this.f8907i;
    }

    public String getAppId() {
        return this.vv;
    }

    public String getAppKey() {
        return this.f8909m;
    }

    public String getBannerClassName() {
        return this.f8911o;
    }

    public String getDrawClassName() {
        return this.f8906b;
    }

    public String getFeedClassName() {
        return this.f8908k;
    }

    public String getFullVideoClassName() {
        return this.qv;
    }

    public String getInterstitialClassName() {
        return this.f8913u;
    }

    public String getRewardClassName() {
        return this.f8910n;
    }

    public String getSplashClassName() {
        return this.wv;
    }

    public String toString() {
        return "MediationCustomInitConfig{mAppId='" + this.vv + "', mAppKey='" + this.f8909m + "', mADNName='" + this.f8912p + "', mAdnInitClassName='" + this.f8907i + "', mBannerClassName='" + this.f8911o + "', mInterstitialClassName='" + this.f8913u + "', mRewardClassName='" + this.f8910n + "', mFullVideoClassName='" + this.qv + "', mSplashClassName='" + this.wv + "', mFeedClassName='" + this.f8908k + "', mDrawClassName='" + this.f8906b + "'}";
    }

    public MediationCustomInitConfig(ValueSet valueSet) {
        if (valueSet != null) {
            this.f8912p = valueSet.stringValue(8003);
            this.vv = valueSet.stringValue(8534);
            this.f8909m = valueSet.stringValue(8535);
            this.f8907i = valueSet.stringValue(8536);
            this.f8911o = valueSet.stringValue(8537);
            this.f8913u = valueSet.stringValue(8538);
            this.f8910n = valueSet.stringValue(8539);
            this.qv = valueSet.stringValue(8540);
            this.wv = valueSet.stringValue(8541);
            this.f8908k = valueSet.stringValue(8542);
            this.f8906b = valueSet.stringValue(8543);
        }
    }
}

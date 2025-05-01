package com.bytedance.sdk.openadsdk.mediation.bridge.custom;

import com.bykv.vk.openvk.api.proto.ValueSet;
/* loaded from: classes2.dex */
public class MediationCustomInitConfig {

    /* renamed from: b  reason: collision with root package name */
    private String f8871b;

    /* renamed from: i  reason: collision with root package name */
    private String f8872i;

    /* renamed from: k  reason: collision with root package name */
    private String f8873k;

    /* renamed from: m  reason: collision with root package name */
    private String f8874m;

    /* renamed from: n  reason: collision with root package name */
    private String f8875n;

    /* renamed from: o  reason: collision with root package name */
    private String f8876o;

    /* renamed from: p  reason: collision with root package name */
    private String f8877p;
    private String qv;

    /* renamed from: u  reason: collision with root package name */
    private String f8878u;
    private String vv;
    private String wv;

    public MediationCustomInitConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f8877p = str;
        this.vv = str2;
        this.f8874m = str3;
        this.f8872i = str4;
        this.f8876o = str5;
        this.f8878u = str6;
        this.f8875n = str7;
        this.qv = str8;
        this.wv = str9;
        this.f8873k = str10;
        this.f8871b = str11;
    }

    public String getADNName() {
        return this.f8877p;
    }

    public String getAdnInitClassName() {
        return this.f8872i;
    }

    public String getAppId() {
        return this.vv;
    }

    public String getAppKey() {
        return this.f8874m;
    }

    public String getBannerClassName() {
        return this.f8876o;
    }

    public String getDrawClassName() {
        return this.f8871b;
    }

    public String getFeedClassName() {
        return this.f8873k;
    }

    public String getFullVideoClassName() {
        return this.qv;
    }

    public String getInterstitialClassName() {
        return this.f8878u;
    }

    public String getRewardClassName() {
        return this.f8875n;
    }

    public String getSplashClassName() {
        return this.wv;
    }

    public String toString() {
        return "MediationCustomInitConfig{mAppId='" + this.vv + "', mAppKey='" + this.f8874m + "', mADNName='" + this.f8877p + "', mAdnInitClassName='" + this.f8872i + "', mBannerClassName='" + this.f8876o + "', mInterstitialClassName='" + this.f8878u + "', mRewardClassName='" + this.f8875n + "', mFullVideoClassName='" + this.qv + "', mSplashClassName='" + this.wv + "', mFeedClassName='" + this.f8873k + "', mDrawClassName='" + this.f8871b + "'}";
    }

    public MediationCustomInitConfig(ValueSet valueSet) {
        if (valueSet != null) {
            this.f8877p = valueSet.stringValue(8003);
            this.vv = valueSet.stringValue(8534);
            this.f8874m = valueSet.stringValue(8535);
            this.f8872i = valueSet.stringValue(8536);
            this.f8876o = valueSet.stringValue(8537);
            this.f8878u = valueSet.stringValue(8538);
            this.f8875n = valueSet.stringValue(8539);
            this.qv = valueSet.stringValue(8540);
            this.wv = valueSet.stringValue(8541);
            this.f8873k = valueSet.stringValue(8542);
            this.f8871b = valueSet.stringValue(8543);
        }
    }
}

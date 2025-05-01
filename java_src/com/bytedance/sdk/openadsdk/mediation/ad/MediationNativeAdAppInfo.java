package com.bytedance.sdk.openadsdk.mediation.ad;

import java.util.Map;
/* loaded from: classes2.dex */
public class MediationNativeAdAppInfo {

    /* renamed from: i  reason: collision with root package name */
    private String f8839i;

    /* renamed from: m  reason: collision with root package name */
    private String f8840m;

    /* renamed from: n  reason: collision with root package name */
    private String f8841n;

    /* renamed from: o  reason: collision with root package name */
    private Map<String, String> f8842o;

    /* renamed from: p  reason: collision with root package name */
    private long f8843p;
    private String qv;

    /* renamed from: u  reason: collision with root package name */
    private String f8844u;
    private String vv;
    private Map<String, Object> wv;

    public Map<String, Object> getAppInfoExtra() {
        return this.wv;
    }

    public String getAppName() {
        return this.vv;
    }

    public String getAuthorName() {
        return this.f8840m;
    }

    public String getFunctionDescUrl() {
        return this.qv;
    }

    public long getPackageSizeBytes() {
        return this.f8843p;
    }

    public Map<String, String> getPermissionsMap() {
        return this.f8842o;
    }

    public String getPermissionsUrl() {
        return this.f8839i;
    }

    public String getPrivacyAgreement() {
        return this.f8844u;
    }

    public String getVersionName() {
        return this.f8841n;
    }

    public void setAppInfoExtra(Map<String, Object> map) {
        this.wv = map;
    }

    public void setAppName(String str) {
        this.vv = str;
    }

    public void setAuthorName(String str) {
        this.f8840m = str;
    }

    public void setFunctionDescUrl(String str) {
        this.qv = str;
    }

    public void setPackageSizeBytes(long j4) {
        this.f8843p = j4;
    }

    public void setPermissionsMap(Map<String, String> map) {
        this.f8842o = map;
    }

    public void setPermissionsUrl(String str) {
        this.f8839i = str;
    }

    public void setPrivacyAgreement(String str) {
        this.f8844u = str;
    }

    public void setVersionName(String str) {
        this.f8841n = str;
    }
}

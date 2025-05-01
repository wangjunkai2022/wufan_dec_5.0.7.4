package com.bytedance.sdk.openadsdk.mediation.init;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class MediationConfig implements IMediationConfig {

    /* renamed from: b  reason: collision with root package name */
    private String f8918b;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, Object> f8919i;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8920k;

    /* renamed from: m  reason: collision with root package name */
    private boolean f8921m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f8922n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f8923o;

    /* renamed from: p  reason: collision with root package name */
    private MediationConfigUserInfoForSegment f8924p;
    private String qv;

    /* renamed from: u  reason: collision with root package name */
    private JSONObject f8925u;
    private String vv;
    private boolean wv;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: b  reason: collision with root package name */
        private String f8926b;

        /* renamed from: i  reason: collision with root package name */
        private Map<String, Object> f8927i;

        /* renamed from: k  reason: collision with root package name */
        private boolean f8928k;

        /* renamed from: m  reason: collision with root package name */
        private boolean f8929m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f8930n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f8931o;

        /* renamed from: p  reason: collision with root package name */
        private MediationConfigUserInfoForSegment f8932p;
        private String qv;

        /* renamed from: u  reason: collision with root package name */
        private JSONObject f8933u;
        private String vv;
        private boolean wv;

        public MediationConfig build() {
            MediationConfig mediationConfig = new MediationConfig();
            mediationConfig.vv = this.vv;
            mediationConfig.f8921m = this.f8929m;
            mediationConfig.f8924p = this.f8932p;
            mediationConfig.f8919i = this.f8927i;
            mediationConfig.f8923o = this.f8931o;
            mediationConfig.f8925u = this.f8933u;
            mediationConfig.f8922n = this.f8930n;
            mediationConfig.qv = this.qv;
            mediationConfig.wv = this.wv;
            mediationConfig.f8920k = this.f8928k;
            mediationConfig.f8918b = this.f8926b;
            return mediationConfig;
        }

        public Builder setCustomLocalConfig(JSONObject jSONObject) {
            this.f8933u = jSONObject;
            return this;
        }

        public Builder setHttps(boolean z4) {
            this.f8931o = z4;
            return this;
        }

        public Builder setLocalExtra(Map<String, Object> map) {
            this.f8927i = map;
            return this;
        }

        public Builder setMediationConfigUserInfoForSegment(MediationConfigUserInfoForSegment mediationConfigUserInfoForSegment) {
            this.f8932p = mediationConfigUserInfoForSegment;
            return this;
        }

        public Builder setOpenAdnTest(boolean z4) {
            this.f8929m = z4;
            return this;
        }

        public Builder setOpensdkVer(String str) {
            this.qv = str;
            return this;
        }

        public Builder setPublisherDid(String str) {
            this.vv = str;
            return this;
        }

        public Builder setSupportH265(boolean z4) {
            this.wv = z4;
            return this;
        }

        public Builder setSupportSplashZoomout(boolean z4) {
            this.f8928k = z4;
            return this;
        }

        public Builder setWxAppId(String str) {
            this.f8926b = str;
            return this;
        }

        public Builder setWxInstalled(boolean z4) {
            this.f8930n = z4;
            return this;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public JSONObject getCustomLocalConfig() {
        return this.f8925u;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public boolean getHttps() {
        return this.f8923o;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public Map<String, Object> getLocalExtra() {
        return this.f8919i;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public MediationConfigUserInfoForSegment getMediationConfigUserInfoForSegment() {
        return this.f8924p;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public String getOpensdkVer() {
        return this.qv;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public String getPublisherDid() {
        return this.vv;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public boolean isOpenAdnTest() {
        return this.f8921m;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public boolean isSupportH265() {
        return this.wv;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public boolean isSupportSplashZoomout() {
        return this.f8920k;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public boolean isWxInstalled() {
        return this.f8922n;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig
    public String wxAppId() {
        return this.f8918b;
    }

    private MediationConfig() {
    }
}

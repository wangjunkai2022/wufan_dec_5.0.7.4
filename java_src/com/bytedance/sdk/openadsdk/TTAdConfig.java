package com.bytedance.sdk.openadsdk;

import com.bytedance.sdk.openadsdk.CSJConfig;
import com.bytedance.sdk.openadsdk.live.ITTLiveTokenInjectionAuth;
import com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig;
/* loaded from: classes2.dex */
public final class TTAdConfig extends CSJConfig {
    private ITTLiveTokenInjectionAuth vv;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: m  reason: collision with root package name */
        private CSJConfig.vv f8698m = new CSJConfig.vv();
        private ITTLiveTokenInjectionAuth vv;

        public Builder addExtra(String str, Object obj) {
            this.f8698m.vv(str, obj);
            return this;
        }

        public Builder allowShowNotify(boolean z4) {
            this.f8698m.m(z4);
            return this;
        }

        public Builder appId(String str) {
            this.f8698m.vv(str);
            return this;
        }

        public Builder appName(String str) {
            this.f8698m.m(str);
            return this;
        }

        public TTAdConfig build() {
            TTAdConfig tTAdConfig = new TTAdConfig(this.f8698m);
            tTAdConfig.setInjectionAuth(this.vv);
            return tTAdConfig;
        }

        public Builder customController(TTCustomController tTCustomController) {
            this.f8698m.vv(tTCustomController);
            return this;
        }

        public Builder data(String str) {
            this.f8698m.i(str);
            return this;
        }

        public Builder debug(boolean z4) {
            this.f8698m.p(z4);
            return this;
        }

        public Builder directDownloadNetworkType(int... iArr) {
            this.f8698m.vv(iArr);
            return this;
        }

        public Builder injectionAuth(ITTLiveTokenInjectionAuth iTTLiveTokenInjectionAuth) {
            this.vv = iTTLiveTokenInjectionAuth;
            return this;
        }

        public Builder keywords(String str) {
            this.f8698m.p(str);
            return this;
        }

        public Builder paid(boolean z4) {
            this.f8698m.vv(z4);
            return this;
        }

        public Builder setAgeGroup(int i4) {
            this.f8698m.i(i4);
            return this;
        }

        public Builder setMediationConfig(IMediationConfig iMediationConfig) {
            this.f8698m.vv(iMediationConfig);
            return this;
        }

        public Builder setPluginUpdateConfig(int i4) {
            this.f8698m.p(i4);
            return this;
        }

        public Builder supportMultiProcess(boolean z4) {
            this.f8698m.i(z4);
            return this;
        }

        public Builder themeStatus(int i4) {
            this.f8698m.m(i4);
            return this;
        }

        public Builder titleBarTheme(int i4) {
            this.f8698m.vv(i4);
            return this;
        }

        public Builder useMediation(boolean z4) {
            this.f8698m.o(z4);
            return this;
        }
    }

    public ITTLiveTokenInjectionAuth getInjectionAuth() {
        return this.vv;
    }

    public void setInjectionAuth(ITTLiveTokenInjectionAuth iTTLiveTokenInjectionAuth) {
        this.vv = iTTLiveTokenInjectionAuth;
    }

    private TTAdConfig(CSJConfig.vv vvVar) {
        super(vvVar);
    }
}

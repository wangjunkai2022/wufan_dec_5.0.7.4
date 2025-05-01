package com.aggmoread.sdk.client;
/* loaded from: classes2.dex */
public class AMAdConfig {
    public static final int AGREE_NO = 0;
    public static final int AGREE_YES = 1;
    private String appId;
    private String appName;
    private AMCustomController customController;
    private int isAgreePrivacyRecommend;
    private int isAgreeShake;

    /* loaded from: classes2.dex */
    public static class Builder {
        private String appId;
        private String appName;
        private AMCustomController customController;
        private int isAgreePrivacyRecommend = -1;
        private int isAgreeShake = -1;

        private Builder setAppId(String str) {
            this.appId = str;
            return this;
        }

        public AMAdConfig build() {
            AMAdConfig aMAdConfig = new AMAdConfig();
            aMAdConfig.setAppId(this.appId);
            aMAdConfig.setAppName(this.appName);
            aMAdConfig.setCustomController(this.customController);
            aMAdConfig.setAgreeShake(this.isAgreeShake);
            aMAdConfig.setAgreePrivacyRecommend(this.isAgreePrivacyRecommend);
            return aMAdConfig;
        }

        public Builder setAgreePrivacyRecommend(int i4) {
            this.isAgreePrivacyRecommend = i4;
            return this;
        }

        public Builder setAgreeShake(int i4) {
            this.isAgreeShake = i4;
            return this;
        }

        public Builder setAppName(String str) {
            this.appName = str;
            return this;
        }

        public Builder setCustomController(AMCustomController aMCustomController) {
            this.customController = aMCustomController;
            return this;
        }
    }

    private AMAdConfig() {
        this.isAgreePrivacyRecommend = -1;
        this.isAgreeShake = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppId(String str) {
        this.appId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppName(String str) {
        this.appName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomController(AMCustomController aMCustomController) {
        this.customController = aMCustomController;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public AMCustomController getCustomController() {
        return this.customController;
    }

    public int isAgreePrivacyRecommend() {
        return this.isAgreePrivacyRecommend;
    }

    public int isAgreeShake() {
        return this.isAgreeShake;
    }

    public void setAgreePrivacyRecommend(int i4) {
        this.isAgreePrivacyRecommend = i4;
    }

    public void setAgreeShake(int i4) {
        this.isAgreeShake = i4;
    }
}

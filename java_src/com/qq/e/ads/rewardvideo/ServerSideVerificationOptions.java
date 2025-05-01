package com.qq.e.ads.rewardvideo;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public class ServerSideVerificationOptions {
    public static final String ACTION = "rewardAction";
    public static final String TRANS_ID = "transId";

    /* renamed from: a  reason: collision with root package name */
    private String f59788a;

    /* renamed from: b  reason: collision with root package name */
    private String f59789b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f59790c;

    /* loaded from: classes5.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f59791a;

        /* renamed from: b  reason: collision with root package name */
        private String f59792b;

        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this);
        }

        public Builder setCustomData(String str) {
            this.f59791a = str;
            return this;
        }

        public Builder setUserId(String str) {
            this.f59792b = str;
            return this;
        }
    }

    private ServerSideVerificationOptions(Builder builder) {
        this.f59790c = new JSONObject();
        this.f59788a = builder.f59791a;
        this.f59789b = builder.f59792b;
    }

    public String getCustomData() {
        return this.f59788a;
    }

    public JSONObject getOptions() {
        return this.f59790c;
    }

    public String getUserId() {
        return this.f59789b;
    }
}

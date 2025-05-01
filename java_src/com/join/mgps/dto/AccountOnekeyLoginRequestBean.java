package com.join.mgps.dto;

import com.umeng.analytics.pro.f;
import org.springframework.util.LinkedMultiValueMap;
/* loaded from: classes4.dex */
public class AccountOnekeyLoginRequestBean {
    private String deviceId;
    private String mobile;
    private Params params;
    private String provider;
    private String version;

    /* loaded from: classes4.dex */
    public static class Params {
        private String accessToken;
        private String token;

        public Params(String str, String str2) {
            this.token = str;
            this.accessToken = str2;
        }

        public String getAccessToken() {
            return this.accessToken;
        }

        public String getToken() {
            return this.token;
        }

        public void setAccessToken(String str) {
            this.accessToken = str;
        }

        public void setToken(String str) {
            this.token = str;
        }
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getMobile() {
        return this.mobile;
    }

    public Params getParams() {
        return this.params;
    }

    public LinkedMultiValueMap<String, Object> getParamsMap() {
        LinkedMultiValueMap<String, Object> linkedMultiValueMap = new LinkedMultiValueMap<>();
        linkedMultiValueMap.add("deviceId", this.deviceId);
        linkedMultiValueMap.add("mobile", this.mobile);
        linkedMultiValueMap.add(f.M, this.provider);
        linkedMultiValueMap.add("version", this.version);
        linkedMultiValueMap.add("params", this.params);
        return linkedMultiValueMap;
    }

    public String getProvider() {
        return this.provider;
    }

    public String getVersion() {
        return this.version;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}

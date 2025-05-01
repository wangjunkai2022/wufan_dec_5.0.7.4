package com.beizi.fusion.model;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdPlusConfig {
    @JsonNode(key = "adUrl")
    private String adUrl;
    @JsonNode(key = "version")
    private String version;

    public static AdPlusConfig objectFromData(String str) {
        try {
            return (AdPlusConfig) JsonResolver.fromJson(str, (Class<Object>) AdPlusConfig.class);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public String getAdUrl() {
        return this.adUrl;
    }

    public String getVersion() {
        return this.version;
    }

    public void setAdUrl(String str) {
        this.adUrl = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public static AdPlusConfig objectFromData(String str, String str2) {
        try {
            return (AdPlusConfig) JsonResolver.fromJson(new JSONObject(str).getString(str), (Class<Object>) AdPlusConfig.class);
        } catch (JSONException e5) {
            e5.printStackTrace();
            return null;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }
}

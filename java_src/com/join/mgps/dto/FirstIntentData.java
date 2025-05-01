package com.join.mgps.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.join.mgps.Util.IntentDateBean;
/* loaded from: classes.dex */
public class FirstIntentData {
    private String imageUrl;
    private IntentDateBean intentDateBean;
    @JsonProperty
    private boolean isAPKSplashImage;
    @JsonProperty
    private boolean isAutoDownload;
    @JsonProperty("isCustomApk")
    private boolean isCustomApk;
    @JsonProperty
    private boolean isGoDetail;
    @JsonProperty
    private boolean isIntent;

    public FirstIntentData() {
        this.imageUrl = "/android_asset/splash.png";
        this.isGoDetail = true;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public IntentDateBean getIntentDateBean() {
        return this.intentDateBean;
    }

    public boolean isAPKSplashImage() {
        return this.isAPKSplashImage;
    }

    public boolean isAutoDownload() {
        return this.isAutoDownload;
    }

    public boolean isCustomApk() {
        return this.isCustomApk;
    }

    public boolean isGoDetail() {
        return this.isGoDetail;
    }

    public boolean isIntent() {
        return this.isIntent;
    }

    public void setAPKSplashImage(boolean z4) {
        this.isAPKSplashImage = z4;
    }

    public void setAutoDownload(boolean z4) {
        this.isAutoDownload = z4;
    }

    public void setCustomApk(boolean z4) {
        this.isCustomApk = z4;
    }

    public void setGoDetail(boolean z4) {
        this.isGoDetail = z4;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setIntent(boolean z4) {
        this.isIntent = z4;
    }

    public void setIntentDateBean(IntentDateBean intentDateBean) {
        this.intentDateBean = intentDateBean;
    }

    public String toString() {
        return "FirstIntentData{isCustomApk=" + this.isCustomApk + ", isAutoDownload=" + this.isAutoDownload + ", isAPKSplashImage=" + this.isAPKSplashImage + ", imageUrl='" + this.imageUrl + "', isIntent=" + this.isIntent + ", intentDateBean=" + this.intentDateBean + '}';
    }

    public FirstIntentData(boolean z4, boolean z5, boolean z6, String str, boolean z7, IntentDateBean intentDateBean) {
        this.imageUrl = "/android_asset/splash.png";
        this.isGoDetail = true;
        this.isCustomApk = z4;
        this.isAutoDownload = z5;
        this.isAPKSplashImage = z6;
        this.imageUrl = str;
        this.isIntent = z7;
        this.intentDateBean = intentDateBean;
    }
}

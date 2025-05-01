package com.bytedance.sdk.openadsdk.downloadnew.core;

import org.json.JSONObject;
/* loaded from: classes2.dex */
public class TTDownloadEventModel {

    /* renamed from: i  reason: collision with root package name */
    private JSONObject f8770i;

    /* renamed from: m  reason: collision with root package name */
    private String f8771m;

    /* renamed from: p  reason: collision with root package name */
    private JSONObject f8772p;
    private String vv;

    public static TTDownloadEventModel builder() {
        return new TTDownloadEventModel();
    }

    public JSONObject getExtJson() {
        return this.f8772p;
    }

    public String getLabel() {
        return this.f8771m;
    }

    public JSONObject getMaterialMeta() {
        return this.f8770i;
    }

    public String getTag() {
        return this.vv;
    }

    public TTDownloadEventModel setExtJson(JSONObject jSONObject) {
        this.f8772p = jSONObject;
        return this;
    }

    public TTDownloadEventModel setLabel(String str) {
        this.f8771m = str;
        return this;
    }

    public TTDownloadEventModel setMaterialMeta(JSONObject jSONObject) {
        this.f8770i = jSONObject;
        return this;
    }

    public TTDownloadEventModel setTag(String str) {
        this.vv = str;
        return this;
    }
}

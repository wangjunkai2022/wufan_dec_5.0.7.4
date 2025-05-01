package com.bytedance.sdk.openadsdk.mediation.manager;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class MediationAdEcpmInfo {

    /* renamed from: b  reason: collision with root package name */
    private String f8940b;

    /* renamed from: i  reason: collision with root package name */
    private String f8941i;

    /* renamed from: j  reason: collision with root package name */
    private Map<String, String> f8942j;
    private String jh;

    /* renamed from: k  reason: collision with root package name */
    private String f8943k;

    /* renamed from: m  reason: collision with root package name */
    private String f8944m;

    /* renamed from: n  reason: collision with root package name */
    private String f8945n;

    /* renamed from: o  reason: collision with root package name */
    private String f8946o;

    /* renamed from: p  reason: collision with root package name */
    private String f8947p;

    /* renamed from: q  reason: collision with root package name */
    private String f8948q;
    private String qv;

    /* renamed from: r  reason: collision with root package name */
    private String f8949r;

    /* renamed from: t  reason: collision with root package name */
    private String f8950t;

    /* renamed from: u  reason: collision with root package name */
    private int f8951u;
    private String vv;
    private String wv;

    public MediationAdEcpmInfo() {
        this.f8942j = new HashMap();
    }

    public String getAbTestId() {
        return this.f8950t;
    }

    public String getChannel() {
        return this.jh;
    }

    public Map<String, String> getCustomData() {
        return this.f8942j;
    }

    public String getCustomSdkName() {
        return this.f8944m;
    }

    public String getEcpm() {
        return this.f8946o;
    }

    public String getErrorMsg() {
        return this.f8945n;
    }

    public String getLevelTag() {
        return this.f8941i;
    }

    public int getReqBiddingType() {
        return this.f8951u;
    }

    public String getRequestId() {
        return this.qv;
    }

    public String getRitType() {
        return this.wv;
    }

    public String getScenarioId() {
        return this.f8948q;
    }

    public String getSdkName() {
        return this.vv;
    }

    public String getSegmentId() {
        return this.f8940b;
    }

    public String getSlotId() {
        return this.f8947p;
    }

    public String getSubChannel() {
        return this.f8949r;
    }

    public String getSubRitType() {
        return this.f8943k;
    }

    public MediationAdEcpmInfo(String str, String str2, String str3, String str4, String str5, int i4, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        this.f8942j = hashMap;
        this.vv = str;
        this.f8944m = str2;
        this.f8947p = str3;
        this.f8941i = str4;
        this.f8946o = str5;
        this.f8951u = i4;
        this.f8945n = str6;
        this.qv = str7;
        this.wv = str8;
        this.f8943k = str9;
        this.f8940b = str10;
        this.jh = str11;
        this.f8949r = str12;
        this.f8950t = str13;
        this.f8948q = str14;
        if (map != null) {
            this.f8942j = map;
        } else {
            hashMap.clear();
        }
    }
}

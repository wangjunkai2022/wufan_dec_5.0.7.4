package com.bytedance.sdk.openadsdk.mediation.custom;

import com.bykv.vk.openvk.api.proto.ValueSet;
/* loaded from: classes2.dex */
public final class MediationCustomServiceConfig {

    /* renamed from: i  reason: collision with root package name */
    private int f8914i;

    /* renamed from: m  reason: collision with root package name */
    private String f8915m;

    /* renamed from: o  reason: collision with root package name */
    private String f8916o;

    /* renamed from: p  reason: collision with root package name */
    private int f8917p;
    private String vv;

    public MediationCustomServiceConfig(String str, String str2, int i4, int i5, String str3) {
        this.vv = str;
        this.f8915m = str2;
        this.f8917p = i4;
        this.f8914i = i5;
        this.f8916o = str3;
    }

    public String getADNNetworkName() {
        return this.vv;
    }

    public String getADNNetworkSlotId() {
        return this.f8915m;
    }

    public int getAdStyleType() {
        return this.f8917p;
    }

    public String getCustomAdapterJson() {
        return this.f8916o;
    }

    public int getSubAdtype() {
        return this.f8914i;
    }

    public String toString() {
        return "MediationCustomServiceConfig{mADNNetworkName='" + this.vv + "', mADNNetworkSlotId='" + this.f8915m + "', mAdStyleType=" + this.f8917p + ", mSubAdtype=" + this.f8914i + ", mCustomAdapterJson='" + this.f8916o + "'}";
    }

    public MediationCustomServiceConfig(ValueSet valueSet) {
        if (valueSet != null) {
            this.vv = valueSet.stringValue(8003);
            this.f8915m = valueSet.stringValue(2);
            this.f8917p = valueSet.intValue(8008);
            this.f8914i = valueSet.intValue(8094);
            this.f8916o = valueSet.stringValue(8547);
        }
    }
}

package com.bytedance.sdk.openadsdk.mediation.bridge.custom;

import com.bykv.vk.openvk.api.proto.ValueSet;
/* loaded from: classes2.dex */
public final class MediationCustomServiceConfig {

    /* renamed from: i  reason: collision with root package name */
    private int f8879i;

    /* renamed from: m  reason: collision with root package name */
    private String f8880m;

    /* renamed from: o  reason: collision with root package name */
    private String f8881o;

    /* renamed from: p  reason: collision with root package name */
    private int f8882p;
    private String vv;

    public MediationCustomServiceConfig(String str, String str2, int i4, int i5, String str3) {
        this.vv = str;
        this.f8880m = str2;
        this.f8882p = i4;
        this.f8879i = i5;
        this.f8881o = str3;
    }

    public String getADNNetworkName() {
        return this.vv;
    }

    public String getADNNetworkSlotId() {
        return this.f8880m;
    }

    public int getAdStyleType() {
        return this.f8882p;
    }

    public String getCustomAdapterJson() {
        return this.f8881o;
    }

    public int getSubAdtype() {
        return this.f8879i;
    }

    public String toString() {
        return "MediationCustomServiceConfig{mADNNetworkName='" + this.vv + "', mADNNetworkSlotId='" + this.f8880m + "', mAdStyleType=" + this.f8882p + ", mSubAdtype=" + this.f8879i + ", mCustomAdapterJson='" + this.f8881o + "'}";
    }

    public MediationCustomServiceConfig(ValueSet valueSet) {
        if (valueSet != null) {
            this.vv = valueSet.stringValue(8003);
            this.f8880m = valueSet.stringValue(2);
            this.f8882p = valueSet.intValue(8008);
            this.f8879i = valueSet.intValue(8094);
            this.f8881o = valueSet.stringValue(8547);
        }
    }
}

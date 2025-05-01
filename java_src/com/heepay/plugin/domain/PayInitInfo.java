package com.heepay.plugin.domain;
/* loaded from: classes3.dex */
public class PayInitInfo {
    private String agentBillIdCache;
    private boolean isReCommit;
    private String payType;
    private int payUrlType;
    private int sdkVersion;

    public PayInitInfo() {
        this.sdkVersion = 10;
    }

    public PayInitInfo(String str, int i4, int i5) {
        this.sdkVersion = 10;
        this.payType = str;
        this.sdkVersion = i4;
        this.payUrlType = i5;
    }

    public String getAgentBillIdCache() {
        return this.agentBillIdCache;
    }

    public String getPayType() {
        return this.payType;
    }

    public int getPayUrlType() {
        return this.payUrlType;
    }

    public int getSdkVersion() {
        return this.sdkVersion;
    }

    public boolean isReCommit() {
        return this.isReCommit;
    }

    public void setAgentBillIdCache(String str) {
        this.agentBillIdCache = str;
    }

    public void setPayType(String str) {
        this.payType = str;
    }

    public void setPayUrlType(int i4) {
        this.payUrlType = i4;
    }

    public void setReCommit(boolean z4) {
        this.isReCommit = z4;
    }

    public void setSdkVersion(int i4) {
        this.sdkVersion = i4;
    }
}

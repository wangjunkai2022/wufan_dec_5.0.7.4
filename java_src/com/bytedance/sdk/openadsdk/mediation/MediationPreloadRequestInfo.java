package com.bytedance.sdk.openadsdk.mediation;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.List;
/* loaded from: classes2.dex */
public class MediationPreloadRequestInfo implements IMediationPreloadRequestInfo {

    /* renamed from: m  reason: collision with root package name */
    private AdSlot f8813m;

    /* renamed from: p  reason: collision with root package name */
    private List<String> f8814p;
    private int vv;

    public MediationPreloadRequestInfo(int i4, AdSlot adSlot, List<String> list) {
        this.vv = i4;
        this.f8813m = adSlot;
        this.f8814p = list;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationPreloadRequestInfo
    public AdSlot getAdSlot() {
        return this.f8813m;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationPreloadRequestInfo
    public int getAdType() {
        return this.vv;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationPreloadRequestInfo
    public List<String> getPrimeRitList() {
        return this.f8814p;
    }
}

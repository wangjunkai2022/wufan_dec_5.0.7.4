package com.beizi.ad.internal;

import com.beizi.ad.RewardItem;
/* compiled from: RewardItemImpl.java */
/* loaded from: classes2.dex */
public class m implements RewardItem {

    /* renamed from: a  reason: collision with root package name */
    private String f5931a;

    /* renamed from: b  reason: collision with root package name */
    private int f5932b;

    public m(String str, int i4) {
        this.f5931a = str;
        this.f5932b = i4;
    }

    @Override // com.beizi.ad.RewardItem
    public int getAmount() {
        return this.f5932b;
    }

    @Override // com.beizi.ad.RewardItem
    public String getType() {
        return this.f5931a;
    }
}

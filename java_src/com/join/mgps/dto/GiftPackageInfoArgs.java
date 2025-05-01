package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class GiftPackageInfoArgs extends BaseDto {
    private int gift_package_id;
    private int uid;

    public GiftPackageInfoArgs() {
    }

    public int getGift_package_id() {
        return this.gift_package_id;
    }

    public int getUid() {
        return this.uid;
    }

    public void setGift_package_id(int i4) {
        this.gift_package_id = i4;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public GiftPackageInfoArgs(int i4, int i5) {
        this.uid = i4;
        this.gift_package_id = i5;
    }
}

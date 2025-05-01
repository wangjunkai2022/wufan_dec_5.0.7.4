package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class GiftPackageOperationArgs extends BaseDto {
    private String game_id;
    private int gift_package_id;
    private int uid;

    public GiftPackageOperationArgs() {
    }

    public String getGame_id() {
        return this.game_id;
    }

    public int getGift_package_id() {
        return this.gift_package_id;
    }

    public int getUid() {
        return this.uid;
    }

    public void setGame_id(String str) {
        this.game_id = str;
    }

    public void setGift_package_id(int i4) {
        this.gift_package_id = i4;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public GiftPackageOperationArgs(int i4, int i5, String str) {
        this.uid = i4;
        this.gift_package_id = i5;
        this.game_id = str;
    }
}

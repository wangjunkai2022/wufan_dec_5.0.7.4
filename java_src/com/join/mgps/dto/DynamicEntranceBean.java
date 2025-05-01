package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class DynamicEntranceBean {
    private String name;
    private String tips;
    private int typeId;

    public DynamicEntranceBean(String str, String str2, int i4) {
        this.name = str;
        this.tips = str2;
        this.typeId = i4;
    }

    public String getName() {
        return this.name;
    }

    public String getTips() {
        return this.tips;
    }

    public int getTypeId() {
        return this.typeId;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public void setTypeId(int i4) {
        this.typeId = i4;
    }
}

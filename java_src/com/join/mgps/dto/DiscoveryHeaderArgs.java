package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class DiscoveryHeaderArgs {
    private List<Long> downloadGameIdList;
    private String uid;

    public List<Long> getDownloadGameIdList() {
        return this.downloadGameIdList;
    }

    public String getUid() {
        return this.uid;
    }

    public void setDownloadGameIdList(List<Long> list) {
        this.downloadGameIdList = list;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}

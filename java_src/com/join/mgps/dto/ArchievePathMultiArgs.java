package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class ArchievePathMultiArgs {
    private List<String> downloadedGameIdList;
    private String uid;

    public List<String> getDownloadedGameIdList() {
        return this.downloadedGameIdList;
    }

    public String getUid() {
        return this.uid;
    }

    public void setDownloadedGameIdList(List<String> list) {
        this.downloadedGameIdList = list;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}

package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class RequestEndGameListArgs {
    private List<Long> downloadGameIdList;
    private String ext;
    private String gameId;
    private int page;
    private int type;
    private String uid;

    public List<Long> getDownloadGameIdList() {
        return this.downloadGameIdList;
    }

    public String getExt() {
        return this.ext;
    }

    public String getGameId() {
        return this.gameId;
    }

    public int getPage() {
        return this.page;
    }

    public int getType() {
        return this.type;
    }

    public String getUid() {
        return this.uid;
    }

    public void setDownloadGameIdList(List<Long> list) {
        this.downloadGameIdList = list;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setGameId(String str) {
        this.gameId = str;
    }

    public void setPage(int i4) {
        this.page = i4;
    }

    public void setType(int i4) {
        this.type = i4;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}

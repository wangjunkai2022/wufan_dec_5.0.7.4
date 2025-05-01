package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestMiniGameArgs extends BaseDto {
    private String gameId;
    private int page;
    private int pageSize;
    private int uid;

    public String getGameId() {
        return this.gameId;
    }

    public int getPage() {
        return this.page;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getUid() {
        return this.uid;
    }

    public void setGameId(String str) {
        this.gameId = str;
    }

    public void setPage(int i4) {
        this.page = i4;
    }

    public void setPageSize(int i4) {
        this.pageSize = i4;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }
}

package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class QueryDownloadInfoRequestArgs {
    private String dataType;
    private String gameId;
    private List<String> gameIdList;
    private String isRecommend;
    private int location;
    private String token;
    private String uid;

    public String getDataType() {
        return this.dataType;
    }

    public String getGameId() {
        return this.gameId;
    }

    public List<String> getGameIdList() {
        return this.gameIdList;
    }

    public String getIsRecommend() {
        return this.isRecommend;
    }

    public int getLocation() {
        return this.location;
    }

    public String getToken() {
        return this.token;
    }

    public String getUid() {
        return this.uid;
    }

    public void setDataType(String str) {
        this.dataType = str;
    }

    public void setGameId(String str) {
        this.gameId = str;
    }

    public void setGameIdList(List<String> list) {
        this.gameIdList = list;
    }

    public void setIsRecommend(String str) {
        this.isRecommend = str;
    }

    public void setLocation(int i4) {
        this.location = i4;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}

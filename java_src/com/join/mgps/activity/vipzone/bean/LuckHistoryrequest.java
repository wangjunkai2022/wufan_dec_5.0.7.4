package com.join.mgps.activity.vipzone.bean;

import java.util.List;
/* loaded from: classes4.dex */
public class LuckHistoryrequest {
    private int action;
    private String gameId;
    private String gameType;
    private int page;
    private List<String> positionMark;
    private int type;
    private int uid;
    private String userToken;
    private String platformType = "ANDROID";
    private String apiVersion = "V3";

    public int getAction() {
        return this.action;
    }

    public String getApiVersion() {
        return this.apiVersion;
    }

    public String getGameId() {
        return this.gameId;
    }

    public String getGameType() {
        return this.gameType;
    }

    public int getPage() {
        return this.page;
    }

    public String getPlatformType() {
        return this.platformType;
    }

    public List<String> getPositionMark() {
        return this.positionMark;
    }

    public int getType() {
        return this.type;
    }

    public int getUid() {
        return this.uid;
    }

    public String getUserToken() {
        return this.userToken;
    }

    public void setAction(int i4) {
        this.action = i4;
    }

    public void setApiVersion(String str) {
        this.apiVersion = str;
    }

    public void setGameId(String str) {
        this.gameId = str;
    }

    public void setGameType(String str) {
        this.gameType = str;
    }

    public void setPage(int i4) {
        this.page = i4;
    }

    public void setPlatformType(String str) {
        this.platformType = str;
    }

    public void setPositionMark(List<String> list) {
        this.positionMark = list;
    }

    public void setType(int i4) {
        this.type = i4;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public void setUserToken(String str) {
        this.userToken = str;
    }
}

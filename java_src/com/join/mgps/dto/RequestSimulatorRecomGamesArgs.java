package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class RequestSimulatorRecomGamesArgs {
    private String appVersion;
    private List<Long> downloadedGameIds;
    private String gameId;
    private String uid;

    public String getAppVersion() {
        return this.appVersion;
    }

    public List<Long> getDownloadedGameIds() {
        return this.downloadedGameIds;
    }

    public String getGameId() {
        return this.gameId;
    }

    public String getUid() {
        return this.uid;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setDownloadedGameIds(List<Long> list) {
        this.downloadedGameIds = list;
    }

    public void setGameId(String str) {
        this.gameId = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}

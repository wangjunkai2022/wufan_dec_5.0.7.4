package com.join.mgps.dto;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class RequestModGameRecommendAdArgs {
    private List<Long> downloadedGameIdList;
    private long gameId;
    private int uid;

    public RequestModGameRecommendAdArgs() {
    }

    public List<Long> getDownloadedGameIdList() {
        return this.downloadedGameIdList;
    }

    public long getGameId() {
        return this.gameId;
    }

    public int getUid() {
        return this.uid;
    }

    public void setDownloadedGameIdList(List<Long> list) {
        this.downloadedGameIdList = list;
    }

    public void setGameId(long j4) {
        this.gameId = j4;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public RequestModGameRecommendAdArgs(ArrayList<Long> arrayList, int i4, long j4) {
        this.downloadedGameIdList = arrayList;
        this.uid = i4;
        this.gameId = j4;
    }
}

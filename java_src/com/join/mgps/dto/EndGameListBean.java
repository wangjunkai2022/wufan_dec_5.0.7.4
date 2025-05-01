package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class EndGameListBean {
    private List<EndGameNameListBean> gameList;
    private List<EndGameTypeBean> typeList;

    public List<EndGameNameListBean> getGameList() {
        return this.gameList;
    }

    public List<EndGameTypeBean> getTypeList() {
        return this.typeList;
    }

    public void setGameList(List<EndGameNameListBean> list) {
        this.gameList = list;
    }

    public void setTypeList(List<EndGameTypeBean> list) {
        this.typeList = list;
    }
}

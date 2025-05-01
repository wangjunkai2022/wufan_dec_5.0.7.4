package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class EndGameNameBean {
    private List<EndGameNameListBean> gameList;
    private int post;
    private int room;

    public List<EndGameNameListBean> getGameList() {
        return this.gameList;
    }

    public int getPost() {
        return this.post;
    }

    public int getRoom() {
        return this.room;
    }

    public void setGameList(List<EndGameNameListBean> list) {
        this.gameList = list;
    }

    public void setPost(int i4) {
        this.post = i4;
    }

    public void setRoom(int i4) {
        this.room = i4;
    }
}

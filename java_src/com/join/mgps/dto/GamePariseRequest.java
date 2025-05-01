package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class GamePariseRequest {
    private String comment_id;
    private String game_id;
    private int uid;

    public GamePariseRequest(String str, String str2, int i4) {
        this.game_id = str;
        this.comment_id = str2;
        this.uid = i4;
    }

    public String getComment_id() {
        return this.comment_id;
    }

    public String getGame_id() {
        return this.game_id;
    }

    public int getUid() {
        return this.uid;
    }

    public void setComment_id(String str) {
        this.comment_id = str;
    }

    public void setGame_id(String str) {
        this.game_id = str;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public GamePariseRequest() {
    }
}

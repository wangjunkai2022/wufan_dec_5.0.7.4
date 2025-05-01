package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestSiliencebean {
    private String game_id;
    private int silence_room_switch;
    private int uid;

    public RequestSiliencebean(int i4, int i5, String str) {
        this.uid = i4;
        this.silence_room_switch = i5;
        this.game_id = str;
    }

    public String getGame_id() {
        return this.game_id;
    }

    public int getSilence_room_switch() {
        return this.silence_room_switch;
    }

    public int getUid() {
        return this.uid;
    }

    public void setGame_id(String str) {
        this.game_id = str;
    }

    public void setSilence_room_switch(int i4) {
        this.silence_room_switch = i4;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }
}

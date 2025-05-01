package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestArenaRoomListArgs {
    private String id;
    private int type;

    public RequestArenaRoomListArgs(String str, int i4) {
        this.id = str;
        this.type = i4;
    }

    public String getId() {
        return this.id;
    }

    public int getType() {
        return this.type;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setType(int i4) {
        this.type = i4;
    }
}

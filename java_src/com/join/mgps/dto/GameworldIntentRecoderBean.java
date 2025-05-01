package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class GameworldIntentRecoderBean implements Serializable {
    private long game_id;
    private int uid;

    public GameworldIntentRecoderBean() {
    }

    public long getGame_id() {
        return this.game_id;
    }

    public int getUid() {
        return this.uid;
    }

    public void setGame_id(long j4) {
        this.game_id = j4;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public GameworldIntentRecoderBean(long j4, int i4) {
        this.game_id = j4;
        this.uid = i4;
    }
}

package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class BossBean implements Serializable {
    private String boos;
    private String gameId;
    private Integer index;
    boolean isSelected;
    private String level;

    public String getBoos() {
        return this.boos;
    }

    public String getGameId() {
        return this.gameId;
    }

    public Integer getIndex() {
        return this.index;
    }

    public String getLevel() {
        return this.level;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setBoos(String str) {
        this.boos = str;
    }

    public void setGameId(String str) {
        this.gameId = str;
    }

    public void setIndex(Integer num) {
        this.index = num;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setSelected(boolean z4) {
        this.isSelected = z4;
    }
}

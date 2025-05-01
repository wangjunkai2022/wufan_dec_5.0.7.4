package com.join.mgps.dto;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes4.dex */
public class EndGameNameListBean implements Serializable {
    private List<EndGameBean> gameEndgameVo;
    private String gameIcon;
    private String gameId;
    private String gameName;
    private boolean isSelected;

    public List<EndGameBean> getGameEndgameVo() {
        return this.gameEndgameVo;
    }

    public String getGameIcon() {
        return this.gameIcon;
    }

    public String getGameId() {
        return this.gameId;
    }

    public String getGameName() {
        return this.gameName;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setGameEndgameVo(List<EndGameBean> list) {
        this.gameEndgameVo = list;
    }

    public void setGameIcon(String str) {
        this.gameIcon = str;
    }

    public void setGameId(String str) {
        this.gameId = str;
    }

    public void setGameName(String str) {
        this.gameName = str;
    }

    public void setSelected(boolean z4) {
        this.isSelected = z4;
    }
}

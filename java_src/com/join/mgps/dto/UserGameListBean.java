package com.join.mgps.dto;

import java.util.Objects;
/* loaded from: classes4.dex */
public class UserGameListBean {
    private String gameIcon;
    private String gameId;
    private String gameName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserGameListBean userGameListBean = (UserGameListBean) obj;
        return Objects.equals(this.gameId, userGameListBean.gameId) && Objects.equals(this.gameName, userGameListBean.gameName) && Objects.equals(this.gameIcon, userGameListBean.gameIcon);
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

    public int hashCode() {
        return Objects.hash(this.gameId, this.gameName, this.gameIcon);
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
}

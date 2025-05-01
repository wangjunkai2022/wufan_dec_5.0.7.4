package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class FavoriteGameListBean {
    private List<CommonGameInfoBean> favorites_game_list;
    private int favorites_game_total;

    public List<CommonGameInfoBean> getFavorites_game_list() {
        return this.favorites_game_list;
    }

    public int getFavorites_game_total() {
        return this.favorites_game_total;
    }

    public void setFavorites_game_list(List<CommonGameInfoBean> list) {
        this.favorites_game_list = list;
    }

    public void setFavorites_game_total(int i4) {
        this.favorites_game_total = i4;
    }
}

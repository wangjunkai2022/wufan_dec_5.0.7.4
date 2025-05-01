package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class DiscoveryPaiweiGameDetailBean {
    private String big_img;
    private String game_id;
    private String game_name;
    private DiscoveryPaiweiGameRankBean month_best;
    private int num;
    private List<DiscoveryPaiweiGameRankBean> rank_list;

    public String getBig_img() {
        return this.big_img;
    }

    public String getGame_id() {
        return this.game_id;
    }

    public String getGame_name() {
        return this.game_name;
    }

    public DiscoveryPaiweiGameRankBean getMonth_best() {
        return this.month_best;
    }

    public int getNum() {
        return this.num;
    }

    public List<DiscoveryPaiweiGameRankBean> getRank_list() {
        return this.rank_list;
    }

    public void setBig_img(String str) {
        this.big_img = str;
    }

    public void setGame_id(String str) {
        this.game_id = str;
    }

    public void setGame_name(String str) {
        this.game_name = str;
    }

    public void setMonth_best(DiscoveryPaiweiGameRankBean discoveryPaiweiGameRankBean) {
        this.month_best = discoveryPaiweiGameRankBean;
    }

    public void setNum(int i4) {
        this.num = i4;
    }

    public void setRank_list(List<DiscoveryPaiweiGameRankBean> list) {
        this.rank_list = list;
    }
}

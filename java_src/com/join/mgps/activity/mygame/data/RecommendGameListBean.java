package com.join.mgps.activity.mygame.data;

import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.RecommendGameAdInfo;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes4.dex */
public class RecommendGameListBean implements Serializable {
    private RecommendGameAdInfo ad_info;
    private List<CommonGameInfoBean> fixed_list;
    private int game_count;
    private List<CommonGameInfoBean> recommend_list;

    public RecommendGameAdInfo getAd_info() {
        return this.ad_info;
    }

    public List<CommonGameInfoBean> getFixed_list() {
        return this.fixed_list;
    }

    public int getGame_count() {
        return this.game_count;
    }

    public List<CommonGameInfoBean> getRecommend_list() {
        return this.recommend_list;
    }

    public void setAd_info(RecommendGameAdInfo recommendGameAdInfo) {
        this.ad_info = recommendGameAdInfo;
    }

    public void setFixed_list(List<CommonGameInfoBean> list) {
        this.fixed_list = list;
    }

    public void setGame_count(int i4) {
        this.game_count = i4;
    }

    public void setRecommend_list(List<CommonGameInfoBean> list) {
        this.recommend_list = list;
    }
}

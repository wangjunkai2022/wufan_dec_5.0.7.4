package com.join.mgps.activity.mygame.data;

import com.join.mgps.activity.recomend.GamedownRecomendItemBean;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.RecommendGameAdInfo;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes4.dex */
public class DataGameListBean implements Serializable {
    private int gameCount;
    private List<GamedownRecomendItemBean> gameList;
    private CommonGameInfoBean jumpInfo;
    private DomainInfoBean pdInfo;
    private RecommendGameAdInfo recAd;
    private List<GamedownRecomendItemBean> recommendList;

    public int getGameCount() {
        return this.gameCount;
    }

    public List<GamedownRecomendItemBean> getGameList() {
        return this.gameList;
    }

    public CommonGameInfoBean getJumpInfo() {
        return this.jumpInfo;
    }

    public DomainInfoBean getPdInfo() {
        return this.pdInfo;
    }

    public RecommendGameAdInfo getRecAd() {
        return this.recAd;
    }

    public List<GamedownRecomendItemBean> getRecommendList() {
        return this.recommendList;
    }

    public void setGameCount(int i4) {
        this.gameCount = i4;
    }

    public void setGameList(List<GamedownRecomendItemBean> list) {
        this.gameList = list;
    }

    public void setJumpInfo(CommonGameInfoBean commonGameInfoBean) {
        this.jumpInfo = commonGameInfoBean;
    }

    public void setPdInfo(DomainInfoBean domainInfoBean) {
        this.pdInfo = domainInfoBean;
    }

    public void setRecAd(RecommendGameAdInfo recommendGameAdInfo) {
        this.recAd = recommendGameAdInfo;
    }

    public void setRecommendList(List<GamedownRecomendItemBean> list) {
        this.recommendList = list;
    }
}

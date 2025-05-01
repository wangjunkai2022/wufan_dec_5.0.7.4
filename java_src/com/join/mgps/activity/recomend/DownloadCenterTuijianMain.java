package com.join.mgps.activity.recomend;

import com.join.mgps.dto.CommonGameInfoBean;
import java.util.List;
/* loaded from: classes4.dex */
public class DownloadCenterTuijianMain {
    private List<GamedownRecomendItemBean> collectionList;
    private String gameid;
    private CommonGameInfoBean jumpInfo;

    public List<GamedownRecomendItemBean> getCollectionList() {
        return this.collectionList;
    }

    public String getGameid() {
        return this.gameid;
    }

    public CommonGameInfoBean getJumpInfo() {
        return this.jumpInfo;
    }

    public void setCollectionList(List<GamedownRecomendItemBean> list) {
        this.collectionList = list;
    }

    public void setGameid(String str) {
        this.gameid = str;
    }

    public void setJumpInfo(CommonGameInfoBean commonGameInfoBean) {
        this.jumpInfo = commonGameInfoBean;
    }
}

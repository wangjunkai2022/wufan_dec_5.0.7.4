package com.join.mgps.activity.search;

import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.SearchAutoDataBean;
import java.util.List;
/* loaded from: classes4.dex */
public class SearchAutoData {
    private SearchAutoAdData ad_info;
    private List<CollectionBeanSub> game_list;
    private List<SearchAutoDataBean> search_list;

    public SearchAutoAdData getAd_info() {
        return this.ad_info;
    }

    public List<CollectionBeanSub> getGame_list() {
        return this.game_list;
    }

    public List<SearchAutoDataBean> getSearch_list() {
        return this.search_list;
    }

    public void setAd_info(SearchAutoAdData searchAutoAdData) {
        this.ad_info = searchAutoAdData;
    }

    public void setGame_list(List<CollectionBeanSub> list) {
        this.game_list = list;
    }

    public void setSearch_list(List<SearchAutoDataBean> list) {
        this.search_list = list;
    }
}

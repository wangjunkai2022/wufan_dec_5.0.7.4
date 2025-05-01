package com.join.mgps.activity.search;

import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.SearchGameZoneBean;
import com.join.mgps.dto.SearchResultAdinfo;
import java.util.List;
/* loaded from: classes4.dex */
public class SearchIndexData {
    private SearchResultAdinfo ad_info;
    private CommonGameInfoBean ad_info_v2;
    private List<SearchGameZoneBean> game_zone_entry;
    private List<GameInfoBean> guess_you_like_info;
    private SearchHotAdInfo hot_search_ad_info;
    private List<GameInfoBean> hot_search_ranking;
    private List<GameInfoBean> net_search_ranking;
    private String search_key;
    private List<GameInfoBean> simulator_search_ranking;
    private List<GameInfoBean> standalone_search_ranking;

    public SearchResultAdinfo getAd_info() {
        return this.ad_info;
    }

    public CommonGameInfoBean getAd_info_v2() {
        return this.ad_info_v2;
    }

    public List<SearchGameZoneBean> getGame_zone_entry() {
        return this.game_zone_entry;
    }

    public List<GameInfoBean> getGuess_you_like_info() {
        return this.guess_you_like_info;
    }

    public SearchHotAdInfo getHot_search_ad_info() {
        return this.hot_search_ad_info;
    }

    public List<GameInfoBean> getHot_search_ranking() {
        return this.hot_search_ranking;
    }

    public List<GameInfoBean> getNet_search_ranking() {
        return this.net_search_ranking;
    }

    public String getSearch_key() {
        return this.search_key;
    }

    public List<GameInfoBean> getSimulator_search_ranking() {
        return this.simulator_search_ranking;
    }

    public List<GameInfoBean> getStandalone_search_ranking() {
        return this.standalone_search_ranking;
    }

    public void setAd_info(SearchResultAdinfo searchResultAdinfo) {
        this.ad_info = searchResultAdinfo;
    }

    public void setAd_info_v2(CommonGameInfoBean commonGameInfoBean) {
        this.ad_info_v2 = commonGameInfoBean;
    }

    public void setGame_zone_entry(List<SearchGameZoneBean> list) {
        this.game_zone_entry = list;
    }

    public void setGuess_you_like_info(List<GameInfoBean> list) {
        this.guess_you_like_info = list;
    }

    public void setHot_search_ad_info(SearchHotAdInfo searchHotAdInfo) {
        this.hot_search_ad_info = searchHotAdInfo;
    }

    public void setHot_search_ranking(List<GameInfoBean> list) {
        this.hot_search_ranking = list;
    }

    public void setNet_search_ranking(List<GameInfoBean> list) {
        this.net_search_ranking = list;
    }

    public void setSearch_key(String str) {
        this.search_key = str;
    }

    public void setSimulator_search_ranking(List<GameInfoBean> list) {
        this.simulator_search_ranking = list;
    }

    public void setStandalone_search_ranking(List<GameInfoBean> list) {
        this.standalone_search_ranking = list;
    }
}

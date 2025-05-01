package com.join.mgps.dto;

import com.join.mgps.dto.GameFromPopoWinBeanV2;
import java.util.List;
/* loaded from: classes4.dex */
public class PapaHomeBeanV9 {
    private List<CommonGameInfoBean> banner;
    private List<HomeDynamicListBean> dynamic_module;
    private List<CommonGameInfoBean> eo_playing;
    private List<CommonGameInfoBean> fast_entry;
    private String game_section_id;
    private List<CommonGameInfoBean> guess_you_like;
    private List<GameFromPopoWinBeanV2.DataBean> hot_game_fav;
    private HomeDynamicListBean new_online_game;
    private HomeRankingListBean ranking_list;
    private SScrollingTxtDTOV2 s_scrolling_txt_v2;
    private HomeDynamicListBean simulator_channel;
    private HomeTopChannelBean top_channel;

    public List<CommonGameInfoBean> getBanner() {
        return this.banner;
    }

    public List<HomeDynamicListBean> getDynamic_module() {
        return this.dynamic_module;
    }

    public List<CommonGameInfoBean> getEo_playing() {
        return this.eo_playing;
    }

    public List<CommonGameInfoBean> getFast_entry() {
        return this.fast_entry;
    }

    public String getGame_section_id() {
        return this.game_section_id;
    }

    public List<CommonGameInfoBean> getGuess_you_like() {
        return this.guess_you_like;
    }

    public List<GameFromPopoWinBeanV2.DataBean> getHot_game_fav() {
        return this.hot_game_fav;
    }

    public HomeDynamicListBean getNew_online_game() {
        return this.new_online_game;
    }

    public HomeRankingListBean getRanking_list() {
        return this.ranking_list;
    }

    public SScrollingTxtDTOV2 getS_scrolling_txt_v2() {
        return this.s_scrolling_txt_v2;
    }

    public HomeDynamicListBean getSimulator_channel() {
        return this.simulator_channel;
    }

    public HomeTopChannelBean getTop_channel() {
        return this.top_channel;
    }

    public boolean isEmpty() {
        return this.banner == null && this.fast_entry == null && this.top_channel == null && this.eo_playing == null && this.guess_you_like == null && this.new_online_game == null && this.ranking_list == null && this.simulator_channel == null && this.dynamic_module == null && this.hot_game_fav == null;
    }

    public void setBanner(List<CommonGameInfoBean> list) {
        this.banner = list;
    }

    public void setDynamic_module(List<HomeDynamicListBean> list) {
        this.dynamic_module = list;
    }

    public void setEo_playing(List<CommonGameInfoBean> list) {
        this.eo_playing = list;
    }

    public void setFast_entry(List<CommonGameInfoBean> list) {
        this.fast_entry = list;
    }

    public void setGame_section_id(String str) {
        this.game_section_id = str;
    }

    public void setGuess_you_like(List<CommonGameInfoBean> list) {
        this.guess_you_like = list;
    }

    public void setHot_game_fav(List<GameFromPopoWinBeanV2.DataBean> list) {
        this.hot_game_fav = list;
    }

    public void setNew_online_game(HomeDynamicListBean homeDynamicListBean) {
        this.new_online_game = homeDynamicListBean;
    }

    public void setRanking_list(HomeRankingListBean homeRankingListBean) {
        this.ranking_list = homeRankingListBean;
    }

    public void setS_scrolling_txt_v2(SScrollingTxtDTOV2 sScrollingTxtDTOV2) {
        this.s_scrolling_txt_v2 = sScrollingTxtDTOV2;
    }

    public void setSimulator_channel(HomeDynamicListBean homeDynamicListBean) {
        this.simulator_channel = homeDynamicListBean;
    }

    public void setTop_channel(HomeTopChannelBean homeTopChannelBean) {
        this.top_channel = homeTopChannelBean;
    }
}

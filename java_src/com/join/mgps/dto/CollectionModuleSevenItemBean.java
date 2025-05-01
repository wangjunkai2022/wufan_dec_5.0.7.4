package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class CollectionModuleSevenItemBean {
    private int ad_type;
    private List<CommonGameInfoBean> advert_list;
    private String collection_id;
    private List<CommonGameInfoBean> collection_list;
    private String cover_url;
    private CommonGameInfoBean game_big;
    private List<CommonGameInfoBean> game_big_list;
    private CommonGameInfoBean game_info;
    private List<CommonGameInfoBean> game_list;
    private String sub_title;
    private String title;
    private String tpl_type;
    private String video_url;

    public int getAd_type() {
        return this.ad_type;
    }

    public List<CommonGameInfoBean> getAdvert_list() {
        return this.advert_list;
    }

    public String getCollection_id() {
        return this.collection_id;
    }

    public List<CommonGameInfoBean> getCollection_list() {
        return this.collection_list;
    }

    public String getCover_url() {
        return this.cover_url;
    }

    public CommonGameInfoBean getGame_big() {
        return this.game_big;
    }

    public List<CommonGameInfoBean> getGame_big_list() {
        return this.game_big_list;
    }

    public CommonGameInfoBean getGame_info() {
        return this.game_info;
    }

    public List<CommonGameInfoBean> getGame_list() {
        return this.game_list;
    }

    public String getSub_title() {
        return this.sub_title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTpl_type() {
        return this.tpl_type;
    }

    public String getVideo_url() {
        return this.video_url;
    }

    public void setAd_type(int i4) {
        this.ad_type = i4;
    }

    public void setAdvert_list(List<CommonGameInfoBean> list) {
        this.advert_list = list;
    }

    public void setCollection_id(String str) {
        this.collection_id = str;
    }

    public void setCollection_list(List<CommonGameInfoBean> list) {
        this.collection_list = list;
    }

    public void setCover_url(String str) {
        this.cover_url = str;
    }

    public void setGame_big(CommonGameInfoBean commonGameInfoBean) {
        this.game_big = commonGameInfoBean;
    }

    public void setGame_big_list(List<CommonGameInfoBean> list) {
        this.game_big_list = list;
    }

    public void setGame_info(CommonGameInfoBean commonGameInfoBean) {
        this.game_info = commonGameInfoBean;
    }

    public void setGame_list(List<CommonGameInfoBean> list) {
        this.game_list = list;
    }

    public void setSub_title(String str) {
        this.sub_title = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTpl_type(String str) {
        this.tpl_type = str;
    }

    public void setVideo_url(String str) {
        this.video_url = str;
    }
}

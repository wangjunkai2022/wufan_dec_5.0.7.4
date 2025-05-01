package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class SearchGameListBean {
    private CommonGameInfoBean ad_info;
    private String area_name;
    private String keyword;
    private List<CommonGameInfoBean> list;
    private String page_first_gid;
    private DomainInfoBean pd_info;
    private List<CommonGameInfoBean> recommend_list;
    private SearchGameListSpecialZoneBean special_zone_info;

    public CommonGameInfoBean getAd_info() {
        return this.ad_info;
    }

    public String getArea_name() {
        return this.area_name;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public List<CommonGameInfoBean> getList() {
        return this.list;
    }

    public String getPage_first_gid() {
        return this.page_first_gid;
    }

    public DomainInfoBean getPd_info() {
        return this.pd_info;
    }

    public List<CommonGameInfoBean> getRecommend_list() {
        return this.recommend_list;
    }

    public SearchGameListSpecialZoneBean getSpecial_zone_info() {
        return this.special_zone_info;
    }

    public void setAd_info(CommonGameInfoBean commonGameInfoBean) {
        this.ad_info = commonGameInfoBean;
    }

    public void setArea_name(String str) {
        this.area_name = str;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public void setList(List<CommonGameInfoBean> list) {
        this.list = list;
    }

    public void setPage_first_gid(String str) {
        this.page_first_gid = str;
    }

    public void setPd_info(DomainInfoBean domainInfoBean) {
        this.pd_info = domainInfoBean;
    }

    public void setRecommend_list(List<CommonGameInfoBean> list) {
        this.recommend_list = list;
    }

    public void setSpecial_zone_info(SearchGameListSpecialZoneBean searchGameListSpecialZoneBean) {
        this.special_zone_info = searchGameListSpecialZoneBean;
    }
}

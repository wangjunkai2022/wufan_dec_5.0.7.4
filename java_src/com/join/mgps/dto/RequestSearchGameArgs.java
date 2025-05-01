package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestSearchGameArgs extends BaseDto {
    private String gameId;
    private Integer isRecommend;
    private String keyword;
    private Integer langId;
    private String pageOfFirstGameId;
    private Integer pc;
    private Integer pluginNum;
    private Integer pn;
    private Integer rec_pn;
    private Integer uid;

    public String getGameId() {
        return this.gameId;
    }

    public Integer getIsRecommend() {
        return this.isRecommend;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public Integer getLangId() {
        return this.langId;
    }

    public String getPageOfFirstGameId() {
        return this.pageOfFirstGameId;
    }

    public Integer getPc() {
        return this.pc;
    }

    public Integer getPluginNum() {
        return this.pluginNum;
    }

    public Integer getPn() {
        return this.pn;
    }

    public Integer getRec_pn() {
        return this.rec_pn;
    }

    public Integer getUid() {
        return this.uid;
    }

    public void setGameId(String str) {
        this.gameId = str;
    }

    public void setIsRecommend(Integer num) {
        this.isRecommend = num;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public void setLangId(Integer num) {
        this.langId = num;
    }

    public void setPageOfFirstGameId(String str) {
        this.pageOfFirstGameId = str;
    }

    public void setPc(Integer num) {
        this.pc = num;
    }

    public void setPluginNum(Integer num) {
        this.pluginNum = num;
    }

    public void setPn(Integer num) {
        this.pn = num;
    }

    public void setRec_pn(Integer num) {
        this.rec_pn = num;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }
}

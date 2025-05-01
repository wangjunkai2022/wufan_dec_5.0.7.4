package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class DownloadGameArgsBean implements Serializable {
    int downType;
    String ext;
    String ext1;
    int from;
    boolean fromRecommend;
    int fromType;
    String gameId;
    String keyWord;
    int location;
    String nodeId;
    String packagePath;
    private DomainInfoBean pdInfo;
    String recPosition;
    String remarks;
    boolean showDownRecommend;
    String volcanoOther;

    public int getDownType() {
        return this.downType;
    }

    public String getExt() {
        return this.ext;
    }

    public String getExt1() {
        return this.ext1;
    }

    public int getFrom() {
        return this.from;
    }

    public int getFromType() {
        return this.fromType;
    }

    public String getGameId() {
        return this.gameId;
    }

    public String getKeyWord() {
        return this.keyWord;
    }

    public int getLocation() {
        return this.location;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public String getPackagePath() {
        return this.packagePath;
    }

    public DomainInfoBean getPdInfo() {
        return this.pdInfo;
    }

    public String getRecPosition() {
        return this.recPosition;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getVolcanoOther() {
        return this.volcanoOther;
    }

    public boolean isFromRecommend() {
        return this.fromRecommend;
    }

    public boolean isShowDownRecommend() {
        return this.showDownRecommend;
    }

    public void setDownType(int i4) {
        this.downType = i4;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setExt1(String str) {
        this.ext1 = str;
    }

    public void setFrom(int i4) {
        this.from = i4;
    }

    public void setFromRecommend(boolean z4) {
        this.fromRecommend = z4;
    }

    public void setFromType(int i4) {
        this.fromType = i4;
    }

    public void setGameId(String str) {
        this.gameId = str;
    }

    public void setKeyWord(String str) {
        this.keyWord = str;
    }

    public void setLocation(int i4) {
        this.location = i4;
    }

    public void setNodeId(String str) {
        this.nodeId = str;
    }

    public void setPackagePath(String str) {
        this.packagePath = str;
    }

    public void setPdInfo(DomainInfoBean domainInfoBean) {
        this.pdInfo = domainInfoBean;
    }

    public void setRecPosition(String str) {
        this.recPosition = str;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public void setShowDownRecommend(boolean z4) {
        this.showDownRecommend = z4;
    }

    public void setVolcanoOther(String str) {
        this.volcanoOther = str;
    }
}

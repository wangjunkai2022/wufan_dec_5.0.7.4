package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class ExtBean implements Serializable {
    private int _from_type;
    private String actType;
    private String dataFlag;
    private String from;
    private String from_id;
    private int gameFlag;
    private String isJoin;
    private boolean isOnlineGame;
    private String isResultPage;
    private String keyword;
    private String location;
    private String nodeId;
    private String orginFrom;
    private String position;
    private String qkPosition;
    private String reMarks;
    private String recPosition;
    private String testAbNumber;
    private String volcanoOther;
    private String where;
    private int down_from = 0;
    private boolean keepOrginFrom = false;

    public ExtBean() {
    }

    public String getActType() {
        return this.actType;
    }

    public String getDataFlag() {
        return this.dataFlag;
    }

    public int getDown_from() {
        return this.down_from;
    }

    public String getFrom() {
        return this.from;
    }

    public String getFrom_id() {
        return this.from_id;
    }

    public int getGameFlag() {
        return this.gameFlag;
    }

    public String getIsJoin() {
        return this.isJoin;
    }

    public String getIsResultPage() {
        return this.isResultPage;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public String getLocation() {
        return this.location;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public String getOrginFrom() {
        return this.orginFrom;
    }

    public String getPosition() {
        return this.position;
    }

    public String getQkPosition() {
        return this.qkPosition;
    }

    public String getReMarks() {
        return this.reMarks;
    }

    public String getRecPosition() {
        return this.recPosition;
    }

    public String getTestAbNumber() {
        return this.testAbNumber;
    }

    public String getVolcanoOther() {
        return this.volcanoOther;
    }

    public String getWhere() {
        return this.where;
    }

    public int get_from_type() {
        return this._from_type;
    }

    public boolean isKeepOrginFrom() {
        return this.keepOrginFrom;
    }

    public boolean isOnlineGame() {
        return this.isOnlineGame;
    }

    public void setActType(String str) {
        this.actType = str;
    }

    public ExtBean setDataFlag(String str) {
        this.dataFlag = str;
        return this;
    }

    public void setDown_from(int i4) {
        this.down_from = i4;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setFrom_id(String str) {
        this.from_id = str;
    }

    public void setGameFlag(int i4) {
        this.gameFlag = i4;
    }

    public void setIsJoin(String str) {
        this.isJoin = str;
    }

    public void setIsResultPage(String str) {
        this.isResultPage = str;
    }

    public void setKeepOrginFrom(boolean z4) {
        this.keepOrginFrom = z4;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setNodeId(String str) {
        this.nodeId = str;
    }

    public ExtBean setOnlineGame(boolean z4) {
        this.isOnlineGame = z4;
        return this;
    }

    public void setOrginFrom(String str) {
        this.orginFrom = str;
    }

    public void setPosition(String str) {
        this.position = str;
    }

    public ExtBean setQkPosition(String str) {
        this.qkPosition = str;
        return this;
    }

    public ExtBean setReMarks(String str) {
        this.reMarks = str;
        return this;
    }

    public ExtBean setRecPosition(String str) {
        this.recPosition = str;
        return this;
    }

    public void setTestAbNumber(String str) {
        this.testAbNumber = str;
    }

    public ExtBean setVolcanoOther(String str) {
        this.volcanoOther = str;
        return this;
    }

    public void setWhere(String str) {
        this.where = str;
    }

    public ExtBean set_from_type(int i4) {
        this._from_type = i4;
        return this;
    }

    public ExtBean(int i4) {
        this._from_type = i4;
    }

    public ExtBean(String str, String str2) {
        this.from = str;
        this.position = str2;
    }

    public ExtBean(String str, String str2, String str3) {
        this.from = str;
        this.from_id = str2;
        this.position = str3;
    }
}

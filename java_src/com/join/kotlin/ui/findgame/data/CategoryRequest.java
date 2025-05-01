package com.join.kotlin.ui.findgame.data;
/* loaded from: classes3.dex */
public class CategoryRequest {
    private int featureType;
    private int gameSortType;
    private int gameType;
    private int limit;
    private int modelType;
    private int page;
    private int playType;
    private int tagId;
    private int themeType;
    private int uid;

    public CategoryRequest(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.gameSortType = 1;
        this.page = 1;
        this.limit = 10;
        this.featureType = i4;
        this.gameSortType = i5;
        this.gameType = i6;
        this.modelType = i7;
        this.page = i8;
        this.playType = i9;
        this.tagId = i10;
        this.themeType = i11;
        this.uid = i12;
    }

    public int getFeatureType() {
        return this.featureType;
    }

    public int getGameSortType() {
        return this.gameSortType;
    }

    public int getGameType() {
        return this.gameType;
    }

    public int getLimit() {
        return this.limit;
    }

    public int getModelType() {
        return this.modelType;
    }

    public int getPage() {
        return this.page;
    }

    public int getPlayType() {
        return this.playType;
    }

    public int getTagId() {
        return this.tagId;
    }

    public int getThemeType() {
        return this.themeType;
    }

    public int getUid() {
        return this.uid;
    }

    public void resetData() {
        this.featureType = 0;
        this.gameSortType = 1;
        this.gameType = 0;
        this.modelType = 0;
        this.page = 1;
        this.playType = 0;
        this.tagId = 0;
        this.themeType = 0;
        this.uid = 0;
        this.limit = 10;
    }

    public void setFeatureType(int i4) {
        this.featureType = i4;
    }

    public void setGameSortType(int i4) {
        this.gameSortType = i4;
    }

    public void setGameType(int i4) {
        this.gameType = i4;
    }

    public void setLimit(int i4) {
        this.limit = i4;
    }

    public void setModelType(int i4) {
        this.modelType = i4;
    }

    public void setPage(int i4) {
        this.page = i4;
    }

    public void setPlayType(int i4) {
        this.playType = i4;
    }

    public void setTagId(int i4) {
        this.tagId = i4;
    }

    public void setThemeType(int i4) {
        this.themeType = i4;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public CategoryRequest() {
        this.gameSortType = 1;
        this.page = 1;
        this.limit = 10;
    }
}

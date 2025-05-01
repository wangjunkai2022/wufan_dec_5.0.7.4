package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestEndGameNameListArgs {
    private int modelType;
    private int page;
    private String uid;
    private boolean withEndGame;

    public int getModelType() {
        return this.modelType;
    }

    public int getPage() {
        return this.page;
    }

    public String getUid() {
        return this.uid;
    }

    public boolean isWithEndGame() {
        return this.withEndGame;
    }

    public void setModelType(int i4) {
        this.modelType = i4;
    }

    public void setPage(int i4) {
        this.page = i4;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setWithEndGame(boolean z4) {
        this.withEndGame = z4;
    }
}

package com.papa91.arc.bean;

import java.io.Serializable;
/* loaded from: classes5.dex */
public class EndgameChallengeLevelBean {
    private BoundaryBean boundary;
    private String level;

    /* loaded from: classes5.dex */
    public static class BoundaryBean implements Serializable {
        private int lower;
        private int upper;

        public int getLower() {
            return this.lower;
        }

        public int getUpper() {
            return this.upper;
        }

        public void setLower(int i4) {
            this.lower = i4;
        }

        public void setUpper(int i4) {
            this.upper = i4;
        }
    }

    public BoundaryBean getBoundary() {
        return this.boundary;
    }

    public String getLevel() {
        return this.level;
    }

    public void setBoundary(BoundaryBean boundaryBean) {
        this.boundary = boundaryBean;
    }

    public void setLevel(String str) {
        this.level = str;
    }
}

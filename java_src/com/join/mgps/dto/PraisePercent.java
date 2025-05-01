package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class PraisePercent implements Serializable {
    private int praise_bad;
    private int praise_good;
    private int praise_nice;

    public PraisePercent(int i4, int i5, int i6) {
        this.praise_good = i4;
        this.praise_nice = i5;
        this.praise_bad = i6;
    }

    public int getPraise_bad() {
        return this.praise_bad;
    }

    public int getPraise_good() {
        return this.praise_good;
    }

    public int getPraise_nice() {
        return this.praise_nice;
    }

    public void setPraise_bad(int i4) {
        this.praise_bad = i4;
    }

    public void setPraise_good(int i4) {
        this.praise_good = i4;
    }

    public void setPraise_nice(int i4) {
        this.praise_nice = i4;
    }

    public PraisePercent() {
    }
}

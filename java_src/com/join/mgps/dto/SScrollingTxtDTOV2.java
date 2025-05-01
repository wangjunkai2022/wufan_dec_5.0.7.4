package com.join.mgps.dto;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes4.dex */
public class SScrollingTxtDTOV2 implements Serializable {
    private int interval;
    private List<SScrollingTxtBeanV2> text;

    public int getInterval() {
        return this.interval;
    }

    public List<SScrollingTxtBeanV2> getText() {
        return this.text;
    }

    public void setInterval(int i4) {
        this.interval = i4;
    }

    public void setText(List<SScrollingTxtBeanV2> list) {
        this.text = list;
    }
}

package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class SScrollingTxtBeanV2 implements Serializable {
    private boolean hasExposure;
    private CommonGameInfoBean jumpModelDto;
    private String word;

    public CommonGameInfoBean getJumpModelDto() {
        return this.jumpModelDto;
    }

    public String getWord() {
        return this.word;
    }

    public boolean isHasExposure() {
        return this.hasExposure;
    }

    public void setHasExposure(boolean z4) {
        this.hasExposure = z4;
    }

    public void setJumpModelDto(CommonGameInfoBean commonGameInfoBean) {
        this.jumpModelDto = commonGameInfoBean;
    }

    public void setWord(String str) {
        this.word = str;
    }
}

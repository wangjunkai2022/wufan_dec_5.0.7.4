package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class ExitBean {
    private List<RecomDatabean> info;
    private int isopen;

    public ExitBean(int i4, List<RecomDatabean> list) {
        this.isopen = i4;
        this.info = list;
    }

    public List<RecomDatabean> getInfo() {
        return this.info;
    }

    public int getIsopen() {
        return this.isopen;
    }

    public void setInfo(List<RecomDatabean> list) {
        this.info = list;
    }

    public void setIsopen(int i4) {
        this.isopen = i4;
    }

    public ExitBean() {
    }
}

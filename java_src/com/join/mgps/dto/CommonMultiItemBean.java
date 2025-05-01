package com.join.mgps.dto;

import u1.b;
/* loaded from: classes4.dex */
public class CommonMultiItemBean implements b {
    private Object data;
    private boolean exposure;
    private Object extData;
    private int viewType;

    public CommonMultiItemBean(int i4, Object obj) {
        this.viewType = i4;
        this.data = obj;
    }

    public <T> T getData() {
        return (T) this.data;
    }

    public Object getExtData() {
        return this.extData;
    }

    @Override // u1.b
    public int getItemType() {
        return this.viewType;
    }

    public boolean isExposure() {
        return this.exposure;
    }

    public void setExposure(boolean z4) {
        this.exposure = z4;
    }

    public void setExtData(Object obj) {
        this.extData = obj;
    }

    public void setViewType(int i4) {
        this.viewType = i4;
    }
}

package com.join.mgps.dto;

import u1.b;
/* loaded from: classes4.dex */
public class SimulatorExitListBean<T> implements b {
    private T data;
    private boolean exposure = false;
    private int itemType;
    private Object obj;

    public SimulatorExitListBean(int i4, T t4) {
        this.itemType = i4;
        this.data = t4;
    }

    public <T> T getData() {
        return this.data;
    }

    @Override // u1.b
    public int getItemType() {
        return this.itemType;
    }

    public Object getObj() {
        return this.obj;
    }

    public boolean isExposure() {
        return this.exposure;
    }

    public void setData(T t4) {
        this.data = t4;
    }

    public void setExposure(boolean z4) {
        this.exposure = z4;
    }

    public void setItemType(int i4) {
        this.itemType = i4;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}

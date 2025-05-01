package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class SimulatorFastEntryListBean {
    private Object data;
    private int scrollOffset;
    private int scrollPosition;
    private String tagId;
    private int type;

    public SimulatorFastEntryListBean(int i4, Object obj) {
        this.type = i4;
        this.data = obj;
    }

    public Object getData() {
        return this.data;
    }

    public int getScrollOffset() {
        return this.scrollOffset;
    }

    public int getScrollPosition() {
        return this.scrollPosition;
    }

    public String getTagId() {
        return this.tagId;
    }

    public int getType() {
        return this.type;
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public void setScrollOffset(int i4) {
        this.scrollOffset = i4;
    }

    public void setScrollPosition(int i4) {
        this.scrollPosition = i4;
    }

    public void setTagId(String str) {
        this.tagId = str;
    }

    public void setType(int i4) {
        this.type = i4;
    }

    public SimulatorFastEntryListBean(int i4, Object obj, String str) {
        this.type = i4;
        this.data = obj;
        this.tagId = str;
    }
}

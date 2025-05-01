package com.join.mgps.dto;

import u1.b;
/* loaded from: classes4.dex */
public class CollectionSevenListBean implements b {
    private String collection_id;
    private boolean hasExposure = false;
    private Object item;
    private String subTitle;
    private String title;
    private String tpl_type;
    private int type;

    public CollectionSevenListBean() {
    }

    public String getCollection_id() {
        return this.collection_id;
    }

    public Object getItem() {
        return this.item;
    }

    @Override // u1.b
    public int getItemType() {
        return this.type;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTpl_type() {
        return this.tpl_type;
    }

    public int getType() {
        return this.type;
    }

    public boolean isHasExposure() {
        return this.hasExposure;
    }

    public void setCollection_id(String str) {
        this.collection_id = str;
    }

    public void setHasExposure(boolean z4) {
        this.hasExposure = z4;
    }

    public void setItem(Object obj) {
        this.item = obj;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTpl_type(String str) {
        this.tpl_type = str;
    }

    public void setType(int i4) {
        this.type = i4;
    }

    public CollectionSevenListBean(int i4, Object obj, String str) {
        this.type = i4;
        this.item = obj;
        this.collection_id = str;
    }

    public CollectionSevenListBean(int i4, Object obj) {
        this.type = i4;
        this.item = obj;
    }
}

package com.papa.sim.statistic;
/* loaded from: classes5.dex */
public class ResultMessageBean<E> {
    private E data;
    private String modeltype;

    public ResultMessageBean() {
    }

    public E getData() {
        return this.data;
    }

    public String getModeltype() {
        return this.modeltype;
    }

    public void setData(E e5) {
        this.data = e5;
    }

    public void setModeltype(String str) {
        this.modeltype = str;
    }

    public ResultMessageBean(String str, E e5) {
        this.modeltype = str;
        this.data = e5;
    }
}

package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RecomRequestMessage<E> extends BaseDto {
    private E args;
    private ExtBean ext;
    private String modeltype;

    public RecomRequestMessage(String str, E e5, ExtBean extBean) {
        this.modeltype = str;
        this.args = e5;
        this.ext = extBean;
    }

    public E getArgs() {
        return this.args;
    }

    public ExtBean getExt() {
        return this.ext;
    }

    public String getModeltype() {
        return this.modeltype;
    }

    public void setArgs(E e5) {
        this.args = e5;
    }

    public void setExt(ExtBean extBean) {
        this.ext = extBean;
    }

    public void setModeltype(String str) {
        this.modeltype = str;
    }

    public RecomRequestMessage(String str, E e5) {
        this.modeltype = str;
        this.args = e5;
    }

    public RecomRequestMessage(E e5) {
        this.args = e5;
    }
}

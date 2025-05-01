package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class CommonRequestMessage<E> {
    private E args;
    private ExtBean ext;
    private String modeltype;

    public CommonRequestMessage(String str, E e5) {
        this.modeltype = str;
        this.args = e5;
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

    public CommonRequestMessage(String str, E e5, ExtBean extBean) {
        this.modeltype = str;
        this.args = e5;
        this.ext = extBean;
    }

    public CommonRequestMessage(E e5) {
        this.args = e5;
    }
}

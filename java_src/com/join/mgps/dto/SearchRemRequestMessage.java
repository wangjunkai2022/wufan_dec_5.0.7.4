package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class SearchRemRequestMessage<E> {
    private E args;
    private String modeltype;

    public SearchRemRequestMessage(String str, E e5) {
        this.modeltype = str;
        this.args = e5;
    }

    public E getArgs() {
        return this.args;
    }

    public String getModeltype() {
        return this.modeltype;
    }

    public void setArgs(E e5) {
        this.args = e5;
    }

    public void setModeltype(String str) {
        this.modeltype = str;
    }
}

package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class AccountCommonResponse<E> {
    private E data;
    private int error;

    public E getData() {
        return this.data;
    }

    public int getError() {
        return this.error;
    }

    public void setData(E e5) {
        this.data = e5;
    }

    public void setError(int i4) {
        this.error = i4;
    }
}

package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class ResultResMainBean<E> {
    private int code;
    private E data;
    private int error;
    private String message;

    public int getCode() {
        return this.code;
    }

    public E getData() {
        return this.data;
    }

    public int getError() {
        return this.error;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(int i4) {
        this.code = i4;
    }

    public void setData(E e5) {
        this.data = e5;
    }

    public void setError(int i4) {
        this.error = i4;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}

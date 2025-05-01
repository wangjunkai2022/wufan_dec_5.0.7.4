package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class ForumResponse<E> {
    private E data;
    private int error;
    private String error_message;

    public ForumResponse() {
    }

    public E getData() {
        return this.data;
    }

    public int getError() {
        return this.error;
    }

    public String getError_message() {
        return this.error_message;
    }

    public void setData(E e5) {
        this.data = e5;
    }

    public void setError(int i4) {
        this.error = i4;
    }

    public void setError_message(String str) {
        this.error_message = str;
    }

    public ForumResponse(int i4, E e5) {
        this.error = i4;
        this.data = e5;
    }
}

package com.papa91.arc.bean;
/* loaded from: classes5.dex */
public class Response<T> {
    private int code;
    private T data;
    private int flag;
    private String message;
    private String version;

    public int getCode() {
        return this.code;
    }

    public T getData() {
        return this.data;
    }

    public int getFlag() {
        return this.flag;
    }

    public String getMessage() {
        return this.message;
    }

    public String getVersion() {
        return this.version;
    }

    public void setCode(int i4) {
        this.code = i4;
    }

    public void setData(T t4) {
        this.data = t4;
    }

    public void setFlag(int i4) {
        this.flag = i4;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}

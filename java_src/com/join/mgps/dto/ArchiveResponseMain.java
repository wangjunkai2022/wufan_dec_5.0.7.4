package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class ArchiveResponseMain<T> {
    private int code;
    private T data_info;
    private String msg;
    private int succ;

    public int getCode() {
        return this.code;
    }

    public T getData_info() {
        return this.data_info;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getSucc() {
        return this.succ;
    }

    public void setCode(int i4) {
        this.code = i4;
    }

    public void setData_info(T t4) {
        this.data_info = t4;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setSucc(int i4) {
        this.succ = i4;
    }
}

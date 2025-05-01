package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class UploadResultMainBean<E> {
    private AccountTokenSuccess data;
    private int error;

    public UploadResultMainBean() {
    }

    public AccountTokenSuccess getData() {
        return this.data;
    }

    public int getError() {
        return this.error;
    }

    public void setData(AccountTokenSuccess accountTokenSuccess) {
        this.data = accountTokenSuccess;
    }

    public void setError(int i4) {
        this.error = i4;
    }

    public UploadResultMainBean(int i4, AccountTokenSuccess accountTokenSuccess) {
        this.error = i4;
        this.data = accountTokenSuccess;
    }
}

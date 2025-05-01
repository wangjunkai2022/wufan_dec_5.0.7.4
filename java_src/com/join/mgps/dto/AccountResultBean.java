package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class AccountResultBean<E> {
    private AccountLoginresultData data;
    private int error;

    public AccountResultBean() {
    }

    public AccountLoginresultData getData() {
        return this.data;
    }

    public int getError() {
        return this.error;
    }

    public void setData(AccountLoginresultData accountLoginresultData) {
        this.data = accountLoginresultData;
    }

    public void setError(int i4) {
        this.error = i4;
    }

    public AccountResultBean(int i4, AccountLoginresultData accountLoginresultData) {
        this.error = i4;
        this.data = accountLoginresultData;
    }
}

package com.papa.sim.statistic;
/* loaded from: classes5.dex */
public class AccountResultMainBean<E> {
    private PabiBalanceBean data;
    private int error;

    public AccountResultMainBean() {
    }

    public PabiBalanceBean getData() {
        return this.data;
    }

    public int getError() {
        return this.error;
    }

    public void setData(PabiBalanceBean pabiBalanceBean) {
        this.data = pabiBalanceBean;
    }

    public void setError(int i4) {
        this.error = i4;
    }

    public AccountResultMainBean(int i4, PabiBalanceBean pabiBalanceBean) {
        this.error = i4;
        this.data = pabiBalanceBean;
    }
}

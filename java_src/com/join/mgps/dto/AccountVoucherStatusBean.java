package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class AccountVoucherStatusBean implements Serializable {
    private int count;
    private double money;

    public AccountVoucherStatusBean(double d5, int i4) {
        this.money = d5;
        this.count = i4;
    }

    public int getCount() {
        return this.count;
    }

    public double getMoney() {
        return this.money;
    }

    public void setCount(int i4) {
        this.count = i4;
    }

    public void setMoney(double d5) {
        this.money = d5;
    }

    public String toString() {
        return "AccountVoucherStatusBean{money=" + this.money + ", count=" + this.count + '}';
    }

    public AccountVoucherStatusBean() {
    }
}

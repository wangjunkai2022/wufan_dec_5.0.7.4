package com.join.mgps.dto;

import com.join.mgps.Util.g2;
import java.io.Serializable;
/* loaded from: classes4.dex */
public class PayTagInfo implements Serializable {
    private int amount_check;
    private String game_app_key;
    private int pay_game_amount;

    public int getAmount_check() {
        return this.amount_check;
    }

    public String getGame_app_key() {
        return this.game_app_key;
    }

    public String getPayGameAmount() {
        return g2.m(this.pay_game_amount);
    }

    public int getPay_game_amount() {
        return this.pay_game_amount;
    }

    public void setAmount_check(int i4) {
        this.amount_check = i4;
    }

    public void setGame_app_key(String str) {
        this.game_app_key = str;
    }

    public void setPay_game_amount(int i4) {
        this.pay_game_amount = i4;
    }
}

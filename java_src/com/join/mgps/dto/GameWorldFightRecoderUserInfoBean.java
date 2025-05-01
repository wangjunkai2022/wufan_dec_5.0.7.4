package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class GameWorldFightRecoderUserInfoBean implements Serializable {
    private String avatar_src;
    private String battle_count;
    private String battle_winning_rate;
    private int match_count;
    private int match_curr_ex;
    private int match_defeat_count;
    private int match_level;
    private int match_next_ex;
    private int match_winning_count;
    private int match_winning_rate;
    private String nickname;
    private int papa_money;
    private int uid;
    private int vip_level = 0;
    private int svip_level = 0;
    private long vip_expire_time = 0;

    public GameWorldFightRecoderUserInfoBean() {
    }

    public String getAvatar_src() {
        return this.avatar_src;
    }

    public String getBattle_count() {
        return this.battle_count;
    }

    public String getBattle_winning_rate() {
        return this.battle_winning_rate;
    }

    public int getMatch_count() {
        return this.match_count;
    }

    public int getMatch_curr_ex() {
        return this.match_curr_ex;
    }

    public int getMatch_defeat_count() {
        return this.match_defeat_count;
    }

    public int getMatch_level() {
        return this.match_level;
    }

    public int getMatch_next_ex() {
        return this.match_next_ex;
    }

    public int getMatch_winning_count() {
        return this.match_winning_count;
    }

    public int getMatch_winning_rate() {
        return this.match_winning_rate;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getPapa_money() {
        return this.papa_money;
    }

    public int getSvip_level() {
        return this.svip_level;
    }

    public int getUid() {
        return this.uid;
    }

    public long getVip_expire_time() {
        return this.vip_expire_time;
    }

    public int getVip_level() {
        return this.vip_level;
    }

    public void setAvatar_src(String str) {
        this.avatar_src = str;
    }

    public void setBattle_count(String str) {
        this.battle_count = str;
    }

    public void setBattle_winning_rate(String str) {
        this.battle_winning_rate = str;
    }

    public void setMatch_count(int i4) {
        this.match_count = i4;
    }

    public void setMatch_curr_ex(int i4) {
        this.match_curr_ex = i4;
    }

    public void setMatch_defeat_count(int i4) {
        this.match_defeat_count = i4;
    }

    public void setMatch_level(int i4) {
        this.match_level = i4;
    }

    public void setMatch_next_ex(int i4) {
        this.match_next_ex = i4;
    }

    public void setMatch_winning_count(int i4) {
        this.match_winning_count = i4;
    }

    public void setMatch_winning_rate(int i4) {
        this.match_winning_rate = i4;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setPapa_money(int i4) {
        this.papa_money = i4;
    }

    public void setSvip_level(int i4) {
        this.svip_level = i4;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public void setVip_expire_time(long j4) {
        this.vip_expire_time = j4;
    }

    public void setVip_level(int i4) {
        this.vip_level = i4;
    }

    public String toString() {
        return "GameWorldFightRecoderUserInfoBean{uid=" + this.uid + ", nickname='" + this.nickname + "', papa_money=" + this.papa_money + ", match_next_ex=" + this.match_next_ex + ", match_curr_ex=" + this.match_curr_ex + ", match_level=" + this.match_level + ", match_winning_rate=" + this.match_winning_rate + ", match_count=" + this.match_count + ", match_winning_count=" + this.match_winning_count + ", match_defeat_count=" + this.match_defeat_count + ", avatar_src='" + this.avatar_src + "', battle_winning_rate='" + this.battle_winning_rate + "', battle_count='" + this.battle_count + "'}";
    }

    public GameWorldFightRecoderUserInfoBean(int i4, String str, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.uid = i4;
        this.nickname = str;
        this.papa_money = i5;
        this.match_next_ex = i6;
        this.match_curr_ex = i7;
        this.match_level = i8;
        this.match_winning_rate = i9;
        this.match_count = i10;
        this.match_winning_count = i11;
        this.match_defeat_count = i12;
    }
}

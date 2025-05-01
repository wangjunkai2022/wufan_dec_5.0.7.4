package com.join.mgps.dto;

import com.join.mgps.Util.a;
import com.join.mgps.Util.b;
import com.wufan.user.service.protobuf.n0;
import java.io.Serializable;
/* loaded from: classes4.dex */
public class AccountBean implements Serializable, Cloneable {
    private int account_type;
    private int is_bind_qq;
    private int is_bind_wb;
    private int is_bind_wx;
    private int is_real_name;
    private long member_time;
    private MemberInfo member_title;
    private String pass;
    private int pwd_set_up;
    private String secretKey;
    private boolean status;
    private int uid = 0;
    private String account = "";
    private long papaMoney = 0;
    private long registerTime = 0;
    private String avatarSrc = "";
    private String exp = "";
    private int level = 0;
    private String surplusExp = "";
    private String nickname = "";
    private String mobile = "";
    private String pay_top_tip = "";
    private int gender = 0;
    private String token = "";
    private int vip_level = 0;
    private int svip_level = 0;
    private long vip_exp_time = 0;
    private int live_total_charm = 0;
    private int is_anchor = 0;

    /* loaded from: classes4.dex */
    public static class MemberInfo implements Serializable {
        private String battleTitle;
        private String battleTitleColor;
        private int level;

        public String getBattleTitle() {
            return this.battleTitle;
        }

        public String getBattleTitleColor() {
            return this.battleTitleColor;
        }

        public int getLevel() {
            return this.level;
        }

        public void setBattleTitle(String str) {
            this.battleTitle = str;
        }

        public void setBattleTitleColor(String str) {
            this.battleTitleColor = str;
        }

        public void setLevel(int i4) {
            this.level = i4;
        }
    }

    public static AccountBean convert(n0 n0Var) {
        AccountBean accountBean = new AccountBean();
        accountBean.setUid(n0Var.getUid());
        accountBean.setAccount(n0Var.getAccount());
        accountBean.setPapaMoney(n0Var.O1());
        accountBean.setRegisterTime(n0Var.q2());
        accountBean.setAvatarSrc(n0Var.d0());
        accountBean.setExp(n0Var.Y0() + "");
        accountBean.setLevel(n0Var.i());
        accountBean.setSurplusExp(n0Var.k2() + "");
        accountBean.setNickname(n0Var.getNickname());
        accountBean.setMobile(n0Var.z());
        accountBean.setPay_top_tip(n0Var.y0());
        accountBean.setGender(n0Var.v1());
        accountBean.setToken(n0Var.getToken());
        accountBean.setPwd_set_up(n0Var.z0());
        accountBean.setAccount_type(n0Var.n2());
        try {
            accountBean.setVip_level(Integer.parseInt(b.vl(a.b(n0Var.G()))));
        } catch (Exception unused) {
            accountBean.setVip_level(n0Var.M());
        }
        accountBean.setSvip_level(n0Var.j1());
        accountBean.setVip_exp_time(n0Var.y());
        accountBean.setLive_total_charm(n0Var.x2());
        accountBean.setIs_anchor(n0Var.O2());
        if (n0Var.F2() != null) {
            MemberInfo memberInfo = new MemberInfo();
            memberInfo.setLevel(n0Var.F2().i());
            memberInfo.setBattleTitle(n0Var.F2().getBattleTitle());
            memberInfo.setBattleTitleColor(n0Var.F2().getBattleTitleColor());
            accountBean.setMember_title(memberInfo);
        }
        accountBean.setIs_real_name(n0Var.E0());
        accountBean.setSecretKey(n0Var.G());
        accountBean.setMember_time(n0Var.h0());
        return accountBean;
    }

    public AccountBean cloneNewAccountBean() {
        AccountBean accountBean = new AccountBean();
        accountBean.setUid(this.uid);
        accountBean.setAccount(this.account);
        accountBean.setPapaMoney(this.papaMoney);
        accountBean.setRegisterTime(this.registerTime);
        accountBean.setAvatarSrc(this.avatarSrc);
        accountBean.setExp(this.exp);
        accountBean.setLevel(this.level);
        accountBean.setSurplusExp(this.surplusExp);
        accountBean.setNickname(this.nickname);
        accountBean.setMobile(this.mobile);
        accountBean.setPay_top_tip(this.pay_top_tip);
        accountBean.setGender(this.gender);
        accountBean.setToken(this.token);
        accountBean.setStatus(this.status);
        accountBean.setPwd_set_up(this.pwd_set_up);
        accountBean.setPass(this.pass);
        accountBean.setAccount_type(this.account_type);
        accountBean.setVip_level(this.vip_level);
        accountBean.setSvip_level(this.svip_level);
        accountBean.setVip_exp_time(this.vip_exp_time);
        accountBean.setLive_total_charm(this.live_total_charm);
        accountBean.setIs_anchor(this.is_anchor);
        accountBean.setMember_title(this.member_title);
        accountBean.setIs_real_name(this.is_real_name);
        accountBean.setSecretKey(this.secretKey);
        accountBean.setMember_time(this.member_time);
        return accountBean;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getAccount() {
        return this.account;
    }

    public int getAccount_type() {
        return this.account_type;
    }

    public String getAvatarSrc() {
        return this.avatarSrc;
    }

    public String getExp() {
        return this.exp;
    }

    public int getGender() {
        return this.gender;
    }

    public int getIs_anchor() {
        return this.is_anchor;
    }

    public int getIs_bind_qq() {
        return this.is_bind_qq;
    }

    public int getIs_bind_wb() {
        return this.is_bind_wb;
    }

    public int getIs_bind_wx() {
        return this.is_bind_wx;
    }

    public int getIs_real_name() {
        return this.is_real_name;
    }

    public int getLevel() {
        return this.level;
    }

    public int getLive_total_charm() {
        return this.live_total_charm;
    }

    public long getMember_time() {
        return this.member_time;
    }

    public MemberInfo getMember_title() {
        return this.member_title;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getNickname() {
        return this.nickname;
    }

    public long getPapaMoney() {
        return this.papaMoney;
    }

    public String getPass() {
        return this.pass;
    }

    public String getPay_top_tip() {
        return this.pay_top_tip;
    }

    public int getPwd_set_up() {
        return this.pwd_set_up;
    }

    public long getRegisterTime() {
        return this.registerTime;
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public String getSurplusExp() {
        return this.surplusExp;
    }

    public int getSvip_level() {
        return this.svip_level;
    }

    public String getToken() {
        return this.token;
    }

    public int getUid() {
        return this.uid;
    }

    public long getVip_exp_time() {
        return this.vip_exp_time;
    }

    public int getVip_level() {
        return this.vip_level;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setAccount(String str) {
        this.account = str;
    }

    public void setAccount_type(int i4) {
        this.account_type = i4;
    }

    public void setAvatarSrc(String str) {
        this.avatarSrc = str;
    }

    public void setExp(String str) {
        this.exp = str;
    }

    public void setGender(int i4) {
        this.gender = i4;
    }

    public void setIs_anchor(int i4) {
        this.is_anchor = i4;
    }

    public void setIs_bind_qq(int i4) {
        this.is_bind_qq = i4;
    }

    public void setIs_bind_wb(int i4) {
        this.is_bind_wb = i4;
    }

    public void setIs_bind_wx(int i4) {
        this.is_bind_wx = i4;
    }

    public void setIs_real_name(int i4) {
        this.is_real_name = i4;
    }

    public void setLevel(int i4) {
        this.level = i4;
    }

    public void setLive_total_charm(int i4) {
        this.live_total_charm = i4;
    }

    public void setMember_time(long j4) {
        this.member_time = j4;
    }

    public void setMember_title(MemberInfo memberInfo) {
        this.member_title = memberInfo;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setPapaMoney(long j4) {
        this.papaMoney = j4;
    }

    public void setPass(String str) {
        this.pass = str;
    }

    public void setPay_top_tip(String str) {
        this.pay_top_tip = str;
    }

    public void setPwd_set_up(int i4) {
        this.pwd_set_up = i4;
    }

    public void setRegisterTime(long j4) {
        this.registerTime = j4;
    }

    public void setSecretKey(String str) {
        this.secretKey = str;
    }

    public void setStatus(boolean z4) {
        this.status = z4;
    }

    public void setSurplusExp(String str) {
        this.surplusExp = str;
    }

    public void setSvip_level(int i4) {
        this.svip_level = i4;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public void setVip_exp_time(long j4) {
        this.vip_exp_time = j4;
    }

    public void setVip_level(int i4) {
        this.vip_level = i4;
    }

    public String toString() {
        return "AccountBean{uid=" + this.uid + ", account='" + this.account + "', papaMoney=" + this.papaMoney + ", registerTime=" + this.registerTime + ", avatarSrc='" + this.avatarSrc + "', exp='" + this.exp + "', level=" + this.level + ", surplusExp='" + this.surplusExp + "', nickname='" + this.nickname + "', mobile='" + this.mobile + "', pay_top_tip='" + this.pay_top_tip + "', gender=" + this.gender + ", token='" + this.token + "', status=" + this.status + ", pwd_set_up=" + this.pwd_set_up + ", pass='" + this.pass + "', account_type=" + this.account_type + ", vip_level=" + this.vip_level + ", svip_level=" + this.svip_level + ", vip_exp_time=" + this.vip_exp_time + ", live_total_charm=" + this.live_total_charm + ", is_anchor=" + this.is_anchor + ", is_bind_wb=" + this.is_bind_wb + ", is_bind_wx=" + this.is_bind_wx + ", is_bind_qq=" + this.is_bind_qq + ", is_real_name=" + this.is_real_name + ", member_title=" + this.member_title + ", member_time=" + this.member_time + '}';
    }
}

package com.join.mgps.dto;

import com.join.mgps.Util.v0;
import java.io.Serializable;
/* loaded from: classes4.dex */
public class ArenaUserBean implements Serializable {
    private int curlv;
    private int failcount;
    private String iconurl;
    private String name;
    private int nextexp;
    private int ping;
    private byte posidx;
    private byte state;
    private byte svip;
    private long userid;
    private byte vip;
    private int wincount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.userid == ((ArenaUserBean) obj).userid;
    }

    public int getCurlv() {
        return this.curlv;
    }

    public int getFailcount() {
        return this.failcount;
    }

    public String getIconurl() {
        return this.iconurl;
    }

    public String getName() {
        return this.name;
    }

    public int getNextexp() {
        return this.nextexp;
    }

    public int getPing() {
        return this.ping;
    }

    public byte getPosidx() {
        return this.posidx;
    }

    public byte getState() {
        return this.state;
    }

    public byte getSvip() {
        return this.svip;
    }

    public long getUserid() {
        return this.userid;
    }

    public byte getVip() {
        return this.vip;
    }

    public int getWincount() {
        return this.wincount;
    }

    public int hashCode() {
        long j4 = this.userid;
        return (int) (j4 ^ (j4 >>> 32));
    }

    public void setCurlv(int i4) {
        this.curlv = i4;
    }

    public void setFailcount(int i4) {
        this.failcount = i4;
    }

    public void setIconurl(String str) {
        this.iconurl = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNextexp(int i4) {
        this.nextexp = i4;
    }

    public void setPing(int i4) {
        this.ping = i4;
    }

    public void setPosidx(byte b5) {
        this.posidx = b5;
    }

    public void setState(byte b5) {
        this.state = b5;
    }

    public void setSvip(byte b5) {
        this.svip = b5;
        v0.g("svip-------" + ((int) b5));
    }

    public void setUserid(long j4) {
        this.userid = j4;
    }

    public void setVip(byte b5) {
        v0.g("vip-------" + ((int) b5));
        this.vip = b5;
    }

    public void setWincount(int i4) {
        this.wincount = i4;
    }

    public String toString() {
        return "ArenaUserBean{userid=" + this.userid + ", iconurl='" + this.iconurl + "'}";
    }
}

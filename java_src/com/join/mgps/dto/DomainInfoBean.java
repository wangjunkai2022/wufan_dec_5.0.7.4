package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class DomainInfoBean implements Serializable {
    private String ab_test_number;
    private String ext1;
    private String gameId;
    private int index;
    private String info;
    private String is_join;
    private long launchTime;
    private int location;
    private String pic;
    private String text;

    public String getAb_test_number() {
        return this.ab_test_number;
    }

    public String getExt1() {
        return this.ext1;
    }

    public String getGameId() {
        return this.gameId;
    }

    public int getIndex() {
        return this.index;
    }

    public String getInfo() {
        return this.info;
    }

    public String getIs_join() {
        return this.is_join;
    }

    public long getLaunchTime() {
        return this.launchTime;
    }

    public int getLocation() {
        return this.location;
    }

    public String getPic() {
        return this.pic;
    }

    public String getText() {
        return this.text;
    }

    public void setAb_test_number(String str) {
        this.ab_test_number = str;
    }

    public void setExt1(String str) {
        this.ext1 = str;
    }

    public void setGameId(String str) {
        this.gameId = str;
    }

    public void setIndex(int i4) {
        this.index = i4;
    }

    public void setInfo(String str) {
        this.info = str;
    }

    public void setIs_join(String str) {
        this.is_join = str;
    }

    public void setLaunchTime(long j4) {
        this.launchTime = j4;
    }

    public void setLocation(int i4) {
        this.location = i4;
    }

    public void setPic(String str) {
        this.pic = str;
    }

    public void setText(String str) {
        this.text = str;
    }
}

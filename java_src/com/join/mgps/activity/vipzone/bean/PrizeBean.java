package com.join.mgps.activity.vipzone.bean;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class PrizeBean implements Serializable {
    private boolean hasAddAddress = true;
    private int id;
    private String name;
    private String pic;
    private int prize_type;
    private long time;
    private String title;
    private int type;
    private int uid;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPic() {
        return this.pic;
    }

    public int getPrize_type() {
        return this.prize_type;
    }

    public long getTime() {
        return this.time;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public int getUid() {
        return this.uid;
    }

    public boolean isHasAddAddress() {
        return this.hasAddAddress;
    }

    public void setHasAddAddress(boolean z4) {
        this.hasAddAddress = z4;
    }

    public void setId(int i4) {
        this.id = i4;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPic(String str) {
        this.pic = str;
    }

    public void setPrize_type(int i4) {
        this.prize_type = i4;
    }

    public void setTime(long j4) {
        this.time = j4;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i4) {
        this.type = i4;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }
}

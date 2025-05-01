package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class ArenaSelectServer implements Serializable {
    private int area;
    private boolean is_play;
    private boolean is_recommend;
    private int ping;
    private int server_no;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.server_no == ((ArenaSelectServer) obj).server_no;
    }

    public int getArea() {
        return this.area;
    }

    public int getPing() {
        return this.ping;
    }

    public int getServer_no() {
        return this.server_no;
    }

    public int hashCode() {
        return this.server_no;
    }

    public boolean is_play() {
        return this.is_play;
    }

    public boolean is_recommend() {
        return this.is_recommend;
    }

    public void setArea(int i4) {
        this.area = i4;
    }

    public void setIs_play(boolean z4) {
        this.is_play = z4;
    }

    public void setIs_recommend(boolean z4) {
        this.is_recommend = z4;
    }

    public void setPing(int i4) {
        this.ping = i4;
    }

    public void setServer_no(int i4) {
        this.server_no = i4;
    }
}

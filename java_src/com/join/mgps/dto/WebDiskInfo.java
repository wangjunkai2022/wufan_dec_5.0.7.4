package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class WebDiskInfo implements Serializable {
    private String gameId;
    private String wb_file_date;
    private String wb_file_size;
    private int wb_switch;
    private String wb_url;

    public String getGameId() {
        return this.gameId;
    }

    public String getWb_file_date() {
        return this.wb_file_date;
    }

    public String getWb_file_size() {
        return this.wb_file_size;
    }

    public int getWb_switch() {
        return this.wb_switch;
    }

    public String getWb_url() {
        return this.wb_url;
    }

    public void setGameId(String str) {
        this.gameId = str;
    }

    public void setWb_file_date(String str) {
        this.wb_file_date = str;
    }

    public void setWb_file_size(String str) {
        this.wb_file_size = str;
    }

    public void setWb_switch(int i4) {
        this.wb_switch = i4;
    }

    public void setWb_url(String str) {
        this.wb_url = str;
    }
}

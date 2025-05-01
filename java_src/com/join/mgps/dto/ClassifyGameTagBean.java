package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class ClassifyGameTagBean implements Serializable {
    private String describe;
    private int game_count;
    private String ico_remote;
    private int id;
    private String name;
    private String title;

    public String getDescribe() {
        return this.describe;
    }

    public int getGame_count() {
        return this.game_count;
    }

    public String getIco_remote() {
        return this.ico_remote;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDescribe(String str) {
        this.describe = str;
    }

    public void setGame_count(int i4) {
        this.game_count = i4;
    }

    public void setIco_remote(String str) {
        this.ico_remote = str;
    }

    public void setId(int i4) {
        this.id = i4;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}

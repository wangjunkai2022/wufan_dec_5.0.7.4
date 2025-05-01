package com.papa.sim.statistic;
/* loaded from: classes5.dex */
public class UpLoadGameConfig {
    private String game_explain;
    private String game_name;
    private int game_platform_type;
    private int game_type;
    private String token;
    private int uid;

    public String getGame_explain() {
        return this.game_explain;
    }

    public String getGame_name() {
        return this.game_name;
    }

    public int getGame_platform_type() {
        return this.game_platform_type;
    }

    public int getGame_type() {
        return this.game_type;
    }

    public String getToken() {
        return this.token;
    }

    public int getUid() {
        return this.uid;
    }

    public void setGame_explain(String str) {
        this.game_explain = str;
    }

    public void setGame_name(String str) {
        this.game_name = str;
    }

    public void setGame_platform_type(int i4) {
        this.game_platform_type = i4;
    }

    public void setGame_type(int i4) {
        this.game_type = i4;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public String toString() {
        return this.uid + m.a.f71490d + this.token + m.a.f71490d + this.game_name + m.a.f71490d + this.game_type + m.a.f71490d + this.game_platform_type + m.a.f71490d + this.game_explain;
    }
}

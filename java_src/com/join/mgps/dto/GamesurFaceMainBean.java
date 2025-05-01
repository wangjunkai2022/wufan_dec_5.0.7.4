package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class GamesurFaceMainBean {
    private int code;
    private int flag;
    private GamesurFaceMessageBean messages;
    private String version;

    public GamesurFaceMainBean() {
    }

    public int getCode() {
        return this.code;
    }

    public int getFlag() {
        return this.flag;
    }

    public GamesurFaceMessageBean getMessages() {
        return this.messages;
    }

    public String getVersion() {
        return this.version;
    }

    public void setCode(int i4) {
        this.code = i4;
    }

    public void setFlag(int i4) {
        this.flag = i4;
    }

    public void setMessages(GamesurFaceMessageBean gamesurFaceMessageBean) {
        this.messages = gamesurFaceMessageBean;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return "GamesurFaceMainBean{flag=" + this.flag + ", code=" + this.code + ", version='" + this.version + "', messages=" + this.messages + '}';
    }

    public GamesurFaceMainBean(int i4, int i5, String str, GamesurFaceMessageBean gamesurFaceMessageBean) {
        this.flag = i4;
        this.code = i5;
        this.version = str;
        this.messages = gamesurFaceMessageBean;
    }
}

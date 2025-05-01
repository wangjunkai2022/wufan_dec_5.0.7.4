package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class GameDiscoverMainBean<E> {
    private int code;
    private int flag;
    private GameDiscoverMessageBean messages;
    private String requesttype;
    private String version;

    public GameDiscoverMainBean() {
    }

    public int getCode() {
        return this.code;
    }

    public int getFlag() {
        return this.flag;
    }

    public GameDiscoverMessageBean getMessages() {
        return this.messages;
    }

    public String getRequesttype() {
        return this.requesttype;
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

    public void setMessages(GameDiscoverMessageBean gameDiscoverMessageBean) {
        this.messages = gameDiscoverMessageBean;
    }

    public void setRequesttype(String str) {
        this.requesttype = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public GameDiscoverMainBean(int i4, int i5, String str, String str2, GameDiscoverMessageBean gameDiscoverMessageBean) {
        this.flag = i4;
        this.code = i5;
        this.version = str;
        this.requesttype = str2;
        this.messages = gameDiscoverMessageBean;
    }
}

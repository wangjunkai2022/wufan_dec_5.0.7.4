package com.join.mgps.dto;

import com.wufan.friend.chat.protocol.g0;
import java.io.Serializable;
/* loaded from: classes4.dex */
public class FriendInviteBean implements Serializable {
    private int accountId;
    private String avatar;
    private boolean eliteField;
    private int fromAccountId;
    private String fromNickname;
    private long gameId;
    private String gameName;
    private int lobbyRoomId;
    private String roomPasswd;
    private int source;
    private long timestamp;

    public int getAccountId() {
        return this.accountId;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public int getFromAccountId() {
        return this.fromAccountId;
    }

    public String getFromNickname() {
        return this.fromNickname;
    }

    public long getGameId() {
        return this.gameId;
    }

    public String getGameName() {
        return this.gameName;
    }

    public int getLobbyRoomId() {
        return this.lobbyRoomId;
    }

    public String getRoomPasswd() {
        return this.roomPasswd;
    }

    public int getSource() {
        return this.source;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public boolean isEliteField() {
        return this.eliteField;
    }

    public void set(g0 g0Var) {
        if (g0Var == null) {
            return;
        }
        this.fromAccountId = g0Var.q0();
        this.accountId = g0Var.d();
        this.fromNickname = g0Var.Y();
        this.lobbyRoomId = (int) g0Var.f();
        this.gameId = g0Var.getGameId();
        this.avatar = g0Var.getAvatar();
        this.gameName = g0Var.getGameName();
        this.roomPasswd = g0Var.w();
        this.eliteField = g0Var.A();
        this.source = g0Var.getSource();
        this.timestamp = System.currentTimeMillis();
    }

    public void setAccountId(int i4) {
        this.accountId = i4;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setEliteField(boolean z4) {
        this.eliteField = z4;
    }

    public void setFromAccountId(int i4) {
        this.fromAccountId = i4;
    }

    public void setFromNickname(String str) {
        this.fromNickname = str;
    }

    public void setGameId(long j4) {
        this.gameId = j4;
    }

    public void setGameName(String str) {
        this.gameName = str;
    }

    public void setLobbyRoomId(int i4) {
        this.lobbyRoomId = i4;
    }

    public void setRoomPasswd(String str) {
        this.roomPasswd = str;
    }

    public void setSource(int i4) {
        this.source = i4;
    }

    public void setTimestamp(long j4) {
        this.timestamp = j4;
    }
}

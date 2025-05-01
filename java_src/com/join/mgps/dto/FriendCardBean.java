package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class FriendCardBean {
    private boolean addFriendStatus;
    private boolean friendStatus;
    private int likeCount;
    private boolean likeStatus;
    private boolean onlineStatus;
    private List<GameLevelBean> playGameLevels;
    private FriendBean userInfo;

    public int getLikeCount() {
        return this.likeCount;
    }

    public List<GameLevelBean> getPlayGameLevels() {
        return this.playGameLevels;
    }

    public FriendBean getUserInfo() {
        return this.userInfo;
    }

    public boolean isAddFriendStatus() {
        return this.addFriendStatus;
    }

    public boolean isFriendStatus() {
        return this.friendStatus;
    }

    public boolean isLikeStatus() {
        return this.likeStatus;
    }

    public boolean isOnlineStatus() {
        return this.onlineStatus;
    }

    public void setAddFriendStatus(boolean z4) {
        this.addFriendStatus = z4;
    }

    public void setFriendStatus(boolean z4) {
        this.friendStatus = z4;
    }

    public void setLikeCount(int i4) {
        this.likeCount = i4;
    }

    public void setLikeStatus(boolean z4) {
        this.likeStatus = z4;
    }

    public void setOnlineStatus(boolean z4) {
        this.onlineStatus = z4;
    }

    public void setPlayGameLevels(List<GameLevelBean> list) {
        this.playGameLevels = list;
    }

    public void setUserInfo(FriendBean friendBean) {
        this.userInfo = friendBean;
    }
}

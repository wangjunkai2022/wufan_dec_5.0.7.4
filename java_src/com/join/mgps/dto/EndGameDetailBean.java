package com.join.mgps.dto;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes4.dex */
public class EndGameDetailBean implements Serializable {
    private EndGameBean endgameInfo;
    private RankingListBean myRankings;
    private List<RankingListBean> rankingList;
    private String shareUrl;

    /* loaded from: classes4.dex */
    public static class RankingListBean implements Serializable {
        private String avatar;
        private String challengeId;
        private int change;
        private int elapsedTime;
        private String endgameId;
        private String nickname;
        private boolean playback;
        private String ranking;
        private String uid;

        public String getAvatar() {
            return this.avatar;
        }

        public String getChallengeId() {
            return this.challengeId;
        }

        public int getChange() {
            return this.change;
        }

        public int getElapsedTime() {
            return this.elapsedTime;
        }

        public String getEndgameId() {
            return this.endgameId;
        }

        public String getNickname() {
            return this.nickname;
        }

        public String getRanking() {
            return this.ranking;
        }

        public String getUid() {
            return this.uid;
        }

        public boolean isPlayback() {
            return this.playback;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setChallengeId(String str) {
            this.challengeId = str;
        }

        public void setChange(int i4) {
            this.change = i4;
        }

        public void setElapsedTime(int i4) {
            this.elapsedTime = i4;
        }

        public void setEndgameId(String str) {
            this.endgameId = str;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setPlayback(boolean z4) {
            this.playback = z4;
        }

        public void setRanking(String str) {
            this.ranking = str;
        }

        public void setUid(String str) {
            this.uid = str;
        }
    }

    public EndGameBean getEndgameInfo() {
        return this.endgameInfo;
    }

    public RankingListBean getMyRankings() {
        return this.myRankings;
    }

    public List<RankingListBean> getRankingList() {
        return this.rankingList;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public void setEndgameInfo(EndGameBean endGameBean) {
        this.endgameInfo = endGameBean;
    }

    public void setMyRankings(RankingListBean rankingListBean) {
        this.myRankings = rankingListBean;
    }

    public void setRankingList(List<RankingListBean> list) {
        this.rankingList = list;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }
}

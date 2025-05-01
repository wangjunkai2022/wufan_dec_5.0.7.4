package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class MessageDetailFeedBackBean {
    private FeedbackIssue feedbackIssue;
    private List<FeedbackReplies> feedbackReplies;

    /* loaded from: classes4.dex */
    public static class FeedbackIssue {
        private String appVer;
        private String content;
        private String createBy;
        private long createTime;
        private String gameId;
        private String gameName;
        private String id;
        private int issueType;
        private String mobile;
        private String mobileModel;
        private String mobileVer;
        private String qq;
        private List<String> screenPics;
        private int status;
        private String uid;
        private String updateBy;
        private long updateTime;
        private String username;

        public String getAppVer() {
            return this.appVer;
        }

        public String getContent() {
            return this.content;
        }

        public String getCreateBy() {
            return this.createBy;
        }

        public long getCreateTime() {
            return this.createTime;
        }

        public String getGameId() {
            return this.gameId;
        }

        public String getGameName() {
            return this.gameName;
        }

        public String getId() {
            return this.id;
        }

        public int getIssueType() {
            return this.issueType;
        }

        public String getMobile() {
            return this.mobile;
        }

        public String getMobileModel() {
            return this.mobileModel;
        }

        public String getMobileVer() {
            return this.mobileVer;
        }

        public String getQq() {
            return this.qq;
        }

        public List<String> getScreenPics() {
            return this.screenPics;
        }

        public int getStatus() {
            return this.status;
        }

        public String getUid() {
            return this.uid;
        }

        public String getUpdateBy() {
            return this.updateBy;
        }

        public long getUpdateTime() {
            return this.updateTime;
        }

        public String getUsername() {
            return this.username;
        }

        public void setAppVer(String str) {
            this.appVer = str;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setCreateBy(String str) {
            this.createBy = str;
        }

        public void setCreateTime(long j4) {
            this.createTime = j4;
        }

        public void setGameId(String str) {
            this.gameId = str;
        }

        public void setGameName(String str) {
            this.gameName = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setIssueType(int i4) {
            this.issueType = i4;
        }

        public void setMobile(String str) {
            this.mobile = str;
        }

        public void setMobileModel(String str) {
            this.mobileModel = str;
        }

        public void setMobileVer(String str) {
            this.mobileVer = str;
        }

        public void setQq(String str) {
            this.qq = str;
        }

        public void setScreenPics(List<String> list) {
            this.screenPics = list;
        }

        public void setStatus(int i4) {
            this.status = i4;
        }

        public void setUid(String str) {
            this.uid = str;
        }

        public void setUpdateBy(String str) {
            this.updateBy = str;
        }

        public void setUpdateTime(long j4) {
            this.updateTime = j4;
        }

        public void setUsername(String str) {
            this.username = str;
        }
    }

    /* loaded from: classes4.dex */
    public static class FeedbackReplies {
        private String avatar;
        private long createTime;
        private String replyContent;
        private String replyUid;
        private String username;

        public String getAvatar() {
            return this.avatar;
        }

        public long getCreateTime() {
            return this.createTime;
        }

        public String getReplyContent() {
            return this.replyContent;
        }

        public String getReplyUid() {
            return this.replyUid;
        }

        public String getUsername() {
            return this.username;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setCreateTime(long j4) {
            this.createTime = j4;
        }

        public void setReplyContent(String str) {
            this.replyContent = str;
        }

        public void setReplyUid(String str) {
            this.replyUid = str;
        }

        public void setUsername(String str) {
            this.username = str;
        }
    }

    public FeedbackIssue getFeedbackIssue() {
        return this.feedbackIssue;
    }

    public List<FeedbackReplies> getFeedbackReplies() {
        return this.feedbackReplies;
    }

    public void setFeedbackIssue(FeedbackIssue feedbackIssue) {
        this.feedbackIssue = feedbackIssue;
    }

    public void setFeedbackReplies(List<FeedbackReplies> list) {
        this.feedbackReplies = list;
    }
}

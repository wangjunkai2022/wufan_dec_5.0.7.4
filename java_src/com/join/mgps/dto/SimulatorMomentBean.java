package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class SimulatorMomentBean {
    private List<BasicInfo> basicInfos;
    private List<UpdatesInfo> updatesInfos;

    /* loaded from: classes4.dex */
    public static class Achievement {
        private String icon;
        private String name;
        private String unlockRate;

        public String getIcon() {
            return this.icon;
        }

        public String getName() {
            return this.name;
        }

        public String getUnlockRate() {
            return this.unlockRate;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setUnlockRate(String str) {
            this.unlockRate = str;
        }
    }

    /* loaded from: classes4.dex */
    public static class BasicInfo {
        private String desc;
        private String title;

        public String getDesc() {
            return this.desc;
        }

        public String getTitle() {
            return this.title;
        }

        public void setDesc(String str) {
            this.desc = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }
    }

    /* loaded from: classes4.dex */
    public static class UpdatesInfo {
        private List<Achievement> achievements;
        private String avatar;
        private String dateStr;
        private String describe;
        private String feDate;
        private boolean isExpand;
        private String nickname;
        private int praiseCount;
        private String praiseId;
        private boolean praised;
        private boolean supportPraise;
        private String uid;

        public List<Achievement> getAchievements() {
            return this.achievements;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getDateStr() {
            return this.dateStr;
        }

        public String getDescribe() {
            return this.describe;
        }

        public String getFeDate() {
            return this.feDate;
        }

        public String getNickname() {
            return this.nickname;
        }

        public int getPraiseCount() {
            return this.praiseCount;
        }

        public String getPraiseId() {
            return this.praiseId;
        }

        public String getUid() {
            return this.uid;
        }

        public boolean isExpand() {
            return this.isExpand;
        }

        public boolean isPraised() {
            return this.praised;
        }

        public boolean isSupportPraise() {
            return this.supportPraise;
        }

        public void setAchievements(List<Achievement> list) {
            this.achievements = list;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setDateStr(String str) {
            this.dateStr = str;
        }

        public void setDescribe(String str) {
            this.describe = str;
        }

        public void setExpand(boolean z4) {
            this.isExpand = z4;
        }

        public void setFeDate(String str) {
            this.feDate = str;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setPraiseCount(int i4) {
            this.praiseCount = i4;
        }

        public void setPraiseId(String str) {
            this.praiseId = str;
        }

        public void setPraised(boolean z4) {
            this.praised = z4;
        }

        public void setSupportPraise(boolean z4) {
            this.supportPraise = z4;
        }

        public void setUid(String str) {
            this.uid = str;
        }
    }

    public List<BasicInfo> getBasicInfos() {
        return this.basicInfos;
    }

    public List<UpdatesInfo> getUpdatesInfos() {
        return this.updatesInfos;
    }

    public void setBasicInfos(List<BasicInfo> list) {
        this.basicInfos = list;
    }

    public void setUpdatesInfos(List<UpdatesInfo> list) {
        this.updatesInfos = list;
    }
}

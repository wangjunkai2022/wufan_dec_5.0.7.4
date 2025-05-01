package com.papa91.arc.bean;

import java.util.List;
/* loaded from: classes5.dex */
public class AchievementBean {
    private List<AchievementInfo> achievement_list;
    private int done;
    private int target;

    /* loaded from: classes5.dex */
    public static class AchievementInfo {
        private String condition;
        private int done;
        private String icon;
        private String name;
        private int target;
        private String unlock_date;
        private int unlock_rate;
        private String unlock_time;

        public String getCondition() {
            return this.condition;
        }

        public int getDone() {
            return this.done;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getName() {
            return this.name;
        }

        public int getTarget() {
            return this.target;
        }

        public String getUnlock_date() {
            return this.unlock_date;
        }

        public int getUnlock_rate() {
            return this.unlock_rate;
        }

        public String getUnlock_time() {
            return this.unlock_time;
        }

        public void setCondition(String str) {
            this.condition = str;
        }

        public void setDone(int i4) {
            this.done = i4;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setTarget(int i4) {
            this.target = i4;
        }

        public void setUnlock_date(String str) {
            this.unlock_date = str;
        }

        public void setUnlock_rate(int i4) {
            this.unlock_rate = i4;
        }

        public void setUnlock_time(String str) {
            this.unlock_time = str;
        }
    }

    public List<AchievementInfo> getAchievement_list() {
        return this.achievement_list;
    }

    public int getDone() {
        return this.done;
    }

    public int getTarget() {
        return this.target;
    }

    public void setAchievement_list(List<AchievementInfo> list) {
        this.achievement_list = list;
    }

    public void setDone(int i4) {
        this.done = i4;
    }

    public void setTarget(int i4) {
        this.target = i4;
    }
}

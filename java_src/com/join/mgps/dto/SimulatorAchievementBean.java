package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class SimulatorAchievementBean {
    private List<AchievementInfo> all_lock_achievements;
    private int done;
    private List<HistoryUnlockAchievementBean> history_unlock_achievements;
    private List<AchievementInfo> lock_achievements;
    private int lock_achievements_num;
    private int target;
    private List<AchievementInfo> today_unlock_achievements;
    private List<AchievementInfo> unlock_achievements;
    private int unlock_achievements_num;

    /* loaded from: classes4.dex */
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

    /* loaded from: classes4.dex */
    public static class HistoryUnlockAchievementBean {
        private String date;
        private List<AchievementInfo> unlockAchievements;

        public String getDate() {
            return this.date;
        }

        public List<AchievementInfo> getUnlockAchievements() {
            return this.unlockAchievements;
        }

        public void setDate(String str) {
            this.date = str;
        }

        public void setUnlockAchievements(List<AchievementInfo> list) {
            this.unlockAchievements = list;
        }
    }

    public List<AchievementInfo> getAll_lock_achievements() {
        return this.all_lock_achievements;
    }

    public int getDone() {
        return this.done;
    }

    public List<HistoryUnlockAchievementBean> getHistory_unlock_achievements() {
        return this.history_unlock_achievements;
    }

    public List<AchievementInfo> getLock_achievements() {
        return this.lock_achievements;
    }

    public int getLock_achievements_num() {
        return this.lock_achievements_num;
    }

    public int getTarget() {
        return this.target;
    }

    public List<AchievementInfo> getToday_unlock_achievements() {
        return this.today_unlock_achievements;
    }

    public List<AchievementInfo> getUnlock_achievements() {
        return this.unlock_achievements;
    }

    public int getUnlock_achievements_num() {
        return this.unlock_achievements_num;
    }

    public void setAll_lock_achievements(List<AchievementInfo> list) {
        this.all_lock_achievements = list;
    }

    public void setDone(int i4) {
        this.done = i4;
    }

    public void setHistory_unlock_achievements(List<HistoryUnlockAchievementBean> list) {
        this.history_unlock_achievements = list;
    }

    public void setLock_achievements(List<AchievementInfo> list) {
        this.lock_achievements = list;
    }

    public void setLock_achievements_num(int i4) {
        this.lock_achievements_num = i4;
    }

    public void setTarget(int i4) {
        this.target = i4;
    }

    public void setToday_unlock_achievements(List<AchievementInfo> list) {
        this.today_unlock_achievements = list;
    }

    public void setUnlock_achievements(List<AchievementInfo> list) {
        this.unlock_achievements = list;
    }

    public void setUnlock_achievements_num(int i4) {
        this.unlock_achievements_num = i4;
    }
}

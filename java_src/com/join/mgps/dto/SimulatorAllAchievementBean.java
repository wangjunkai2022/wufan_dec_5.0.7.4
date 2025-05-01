package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class SimulatorAllAchievementBean {
    private List<AchievementInfo> achievement_list;

    /* loaded from: classes4.dex */
    public static class AchievementInfo {
        private String condition;
        private int done;
        private String name;
        private int show;
        private int target;
        private String ver;

        public String getCondition() {
            return this.condition;
        }

        public int getDone() {
            return this.done;
        }

        public String getName() {
            return this.name;
        }

        public int getShow() {
            return this.show;
        }

        public int getTarget() {
            return this.target;
        }

        public String getVer() {
            return this.ver;
        }

        public void setCondition(String str) {
            this.condition = str;
        }

        public void setDone(int i4) {
            this.done = i4;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setShow(int i4) {
            this.show = i4;
        }

        public void setTarget(int i4) {
            this.target = i4;
        }

        public void setVer(String str) {
            this.ver = str;
        }
    }

    public List<AchievementInfo> getAchievement_list() {
        return this.achievement_list;
    }

    public void setAchievement_list(List<AchievementInfo> list) {
        this.achievement_list = list;
    }
}

package com.join.mgps.dto;

import com.join.mgps.dto.SimulatorAchievementBean;
/* loaded from: classes4.dex */
public class UnlockBean {
    private SimulatorAchievementBean achievementBean;
    private SimulatorAchievementBean.AchievementInfo info;
    private boolean isFirst;
    private boolean isLast;
    private boolean isLock;
    private boolean isLockTitle;
    private String timeDesc;
    private int type;

    public UnlockBean(int i4, SimulatorAchievementBean simulatorAchievementBean) {
        this.type = i4;
        this.achievementBean = simulatorAchievementBean;
    }

    public SimulatorAchievementBean getAchievementBean() {
        return this.achievementBean;
    }

    public SimulatorAchievementBean.AchievementInfo getInfo() {
        return this.info;
    }

    public String getTimeDesc() {
        return this.timeDesc;
    }

    public int getType() {
        return this.type;
    }

    public boolean isFirst() {
        return this.isFirst;
    }

    public boolean isLast() {
        return this.isLast;
    }

    public boolean isLock() {
        return this.isLock;
    }

    public boolean isLockTitle() {
        return this.isLockTitle;
    }

    public void setAchievementBean(SimulatorAchievementBean simulatorAchievementBean) {
        this.achievementBean = simulatorAchievementBean;
    }

    public void setFirst(boolean z4) {
        this.isFirst = z4;
    }

    public void setInfo(SimulatorAchievementBean.AchievementInfo achievementInfo) {
        this.info = achievementInfo;
    }

    public void setLast(boolean z4) {
        this.isLast = z4;
    }

    public void setLock(boolean z4) {
        this.isLock = z4;
    }

    public void setLockTitle(boolean z4) {
        this.isLockTitle = z4;
    }

    public void setTimeDesc(String str) {
        this.timeDesc = str;
    }

    public void setType(int i4) {
        this.type = i4;
    }

    public UnlockBean(int i4, String str, boolean z4) {
        this.type = i4;
        this.timeDesc = str;
        this.isLockTitle = z4;
    }

    public UnlockBean(int i4, SimulatorAchievementBean.AchievementInfo achievementInfo, boolean z4) {
        this.type = i4;
        this.info = achievementInfo;
        this.isLock = z4;
    }
}

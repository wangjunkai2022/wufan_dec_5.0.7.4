package com.papa91.arc.bean;

import java.util.List;
/* loaded from: classes5.dex */
public class EndGameAllowBean {
    private List<EndGameAdBean> adVideoConfigList;
    private boolean allowed;
    private int awardCards;
    private boolean awardUnlimited;
    private int cards;
    private String challengeId;
    private String elapsedTimeHint;
    private int multipleAwardCards;
    private List<String> redPacketList;
    private int remainTimes;
    private boolean unlimited;
    private boolean watchAd;
    private boolean welfareSwitch;

    public List<EndGameAdBean> getAdVideoConfigList() {
        return this.adVideoConfigList;
    }

    public int getAwardCards() {
        return this.awardCards;
    }

    public int getCards() {
        return this.cards;
    }

    public String getChallengeId() {
        return this.challengeId;
    }

    public String getElapsedTimeHint() {
        return this.elapsedTimeHint;
    }

    public int getMultipleAwardCards() {
        return this.multipleAwardCards;
    }

    public List<String> getRedPacketList() {
        return this.redPacketList;
    }

    public int getRemainTimes() {
        return this.remainTimes;
    }

    public boolean isAllowed() {
        return this.allowed;
    }

    public boolean isAwardUnlimited() {
        return this.awardUnlimited;
    }

    public boolean isUnlimited() {
        return this.unlimited;
    }

    public boolean isWatchAd() {
        return this.watchAd;
    }

    public boolean isWelfareSwitch() {
        return this.welfareSwitch;
    }

    public void setAdVideoConfigList(List<EndGameAdBean> list) {
        this.adVideoConfigList = list;
    }

    public void setAllowed(boolean z4) {
        this.allowed = z4;
    }

    public void setAwardCards(int i4) {
        this.awardCards = i4;
    }

    public void setAwardUnlimited(boolean z4) {
        this.awardUnlimited = z4;
    }

    public void setCards(int i4) {
        this.cards = i4;
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setElapsedTimeHint(String str) {
        this.elapsedTimeHint = str;
    }

    public void setMultipleAwardCards(int i4) {
        this.multipleAwardCards = i4;
    }

    public void setRedPacketList(List<String> list) {
        this.redPacketList = list;
    }

    public void setRemainTimes(int i4) {
        this.remainTimes = i4;
    }

    public void setUnlimited(boolean z4) {
        this.unlimited = z4;
    }

    public void setWatchAd(boolean z4) {
        this.watchAd = z4;
    }

    public void setWelfareSwitch(boolean z4) {
        this.welfareSwitch = z4;
    }
}

package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class GameworldRankGradeBean {
    private int get_pet;
    private int kill_mob;
    private int level;
    private int medal;
    private int score;

    public GameworldRankGradeBean() {
    }

    public int getGet_pet() {
        return this.get_pet;
    }

    public int getKill_mob() {
        return this.kill_mob;
    }

    public int getLevel() {
        return this.level;
    }

    public int getMedal() {
        return this.medal;
    }

    public int getScore() {
        return this.score;
    }

    public void setGet_pet(int i4) {
        this.get_pet = i4;
    }

    public void setKill_mob(int i4) {
        this.kill_mob = i4;
    }

    public void setLevel(int i4) {
        this.level = i4;
    }

    public void setMedal(int i4) {
        this.medal = i4;
    }

    public void setScore(int i4) {
        this.score = i4;
    }

    public GameworldRankGradeBean(int i4, int i5, int i6, int i7, int i8) {
        this.level = i4;
        this.get_pet = i5;
        this.medal = i6;
        this.kill_mob = i7;
        this.score = i8;
    }
}

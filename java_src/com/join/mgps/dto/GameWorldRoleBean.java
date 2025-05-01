package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class GameWorldRoleBean {
    private int get_pet;
    private int get_pet_r;
    private int grade_r;
    private String icon_src;
    private int kill_mob;
    private int kill_mob_r;
    private int level;
    private int level_r;
    private int medal;
    private int medal_r;
    private String role_name;
    private int score;
    private long update_time;

    public GameWorldRoleBean() {
    }

    public int getGet_pet() {
        return this.get_pet;
    }

    public int getGet_pet_r() {
        return this.get_pet_r;
    }

    public int getGrade_r() {
        return this.grade_r;
    }

    public String getIcon_src() {
        return this.icon_src;
    }

    public int getKill_mob() {
        return this.kill_mob;
    }

    public int getKill_mob_r() {
        return this.kill_mob_r;
    }

    public int getLevel() {
        return this.level;
    }

    public int getLevel_r() {
        return this.level_r;
    }

    public int getMedal() {
        return this.medal;
    }

    public int getMedal_r() {
        return this.medal_r;
    }

    public String getRole_name() {
        return this.role_name;
    }

    public int getScore() {
        return this.score;
    }

    public long getUpdate_time() {
        return this.update_time * 1000;
    }

    public void setGet_pet(int i4) {
        this.get_pet = i4;
    }

    public void setGet_pet_r(int i4) {
        this.get_pet_r = i4;
    }

    public void setGrade_r(int i4) {
        this.grade_r = i4;
    }

    public void setIcon_src(String str) {
        this.icon_src = str;
    }

    public void setKill_mob(int i4) {
        this.kill_mob = i4;
    }

    public void setKill_mob_r(int i4) {
        this.kill_mob_r = i4;
    }

    public void setLevel(int i4) {
        this.level = i4;
    }

    public void setLevel_r(int i4) {
        this.level_r = i4;
    }

    public void setMedal(int i4) {
        this.medal = i4;
    }

    public void setMedal_r(int i4) {
        this.medal_r = i4;
    }

    public void setRole_name(String str) {
        this.role_name = str;
    }

    public void setScore(int i4) {
        this.score = i4;
    }

    public void setUpdate_time(long j4) {
        this.update_time = j4;
    }

    public GameWorldRoleBean(long j4, String str, String str2, int i4, int i5, int i6, int i7, int i8) {
        this.update_time = j4;
        this.icon_src = str;
        this.role_name = str2;
        this.kill_mob = i4;
        this.get_pet = i5;
        this.level = i6;
        this.medal = i7;
        this.score = i8;
    }
}

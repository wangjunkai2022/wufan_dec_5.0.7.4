package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class FirstScreenAdInteractionBean {
    private String action;
    private String mode;
    private ShakeConfBean shake_conf;
    private String tips;

    /* loaded from: classes4.dex */
    public static class ShakeConfBean {
        private int acceleration;
        private int duration;
        private int rotation_angle;

        public int getAcceleration() {
            return this.acceleration;
        }

        public int getDuration() {
            return this.duration;
        }

        public int getRotation_angle() {
            return this.rotation_angle;
        }

        public void setAcceleration(int i4) {
            this.acceleration = i4;
        }

        public void setDuration(int i4) {
            this.duration = i4;
        }

        public void setRotation_angle(int i4) {
            this.rotation_angle = i4;
        }
    }

    public String getAction() {
        return this.action;
    }

    public String getMode() {
        return this.mode;
    }

    public ShakeConfBean getShake_conf() {
        return this.shake_conf;
    }

    public String getTips() {
        return this.tips;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public void setShake_conf(ShakeConfBean shakeConfBean) {
        this.shake_conf = shakeConfBean;
    }

    public void setTips(String str) {
        this.tips = str;
    }
}

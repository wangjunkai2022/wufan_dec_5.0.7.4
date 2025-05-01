package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class WxProgram implements Serializable {
    private String abuid = "0";
    private String app_id;
    private String app_path;
    private String button_pic;
    private String button_text;
    private String code_text;
    private String code_url;
    private String extend;
    private String guide_text;
    private int is_join;
    private String original_id;
    private String sceneType;

    public String getAbuid() {
        return this.abuid;
    }

    public String getApp_id() {
        return this.app_id;
    }

    public String getApp_path() {
        return this.app_path;
    }

    public String getButton_pic() {
        return this.button_pic;
    }

    public String getButton_text() {
        return this.button_text;
    }

    public String getCode_text() {
        return this.code_text;
    }

    public String getCode_url() {
        return this.code_url;
    }

    public String getExtend() {
        return this.extend;
    }

    public String getGuide_text() {
        return this.guide_text;
    }

    public int getIs_join() {
        return this.is_join;
    }

    public String getOriginal_id() {
        return this.original_id;
    }

    public String getSceneType() {
        return this.sceneType;
    }

    public void setAbuid(String str) {
        this.abuid = str;
    }

    public void setApp_id(String str) {
        this.app_id = str;
    }

    public void setApp_path(String str) {
        this.app_path = str;
    }

    public void setButton_pic(String str) {
        this.button_pic = str;
    }

    public void setButton_text(String str) {
        this.button_text = str;
    }

    public void setCode_text(String str) {
        this.code_text = str;
    }

    public void setCode_url(String str) {
        this.code_url = str;
    }

    public void setExtend(String str) {
        this.extend = str;
    }

    public void setGuide_text(String str) {
        this.guide_text = str;
    }

    public void setIs_join(int i4) {
        this.is_join = i4;
    }

    public void setOriginal_id(String str) {
        this.original_id = str;
    }

    public void setSceneType(String str) {
        this.sceneType = str;
    }
}

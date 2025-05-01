package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class APKVersionRequestargs {
    private int plugin;
    private int tag_id;
    private int target_version;
    private int type;
    private int uid;

    public APKVersionRequestargs() {
    }

    public int getPlugin() {
        return this.plugin;
    }

    public int getTag_id() {
        return this.tag_id;
    }

    public int getTarget_version() {
        return this.target_version;
    }

    public int getType() {
        return this.type;
    }

    public int getUid() {
        return this.uid;
    }

    public void setPlugin(int i4) {
        this.plugin = i4;
    }

    public void setTag_id(int i4) {
        this.tag_id = i4;
    }

    public void setTarget_version(int i4) {
        this.target_version = i4;
    }

    public void setType(int i4) {
        this.type = i4;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public APKVersionRequestargs(int i4, int i5, int i6, int i7) {
        this.type = i4;
        this.plugin = i5;
        this.tag_id = i6;
        this.target_version = i7;
    }

    public APKVersionRequestargs(int i4, int i5, int i6, int i7, int i8) {
        this.type = i4;
        this.plugin = i5;
        this.tag_id = i6;
        this.target_version = i7;
        this.uid = i8;
    }
}

package com.papa91.arc.bean;
/* loaded from: classes5.dex */
public class TypeBean {
    private int iconNormal;
    private int iconSelected;
    private boolean isSelected;
    private String name;
    private boolean showDot;
    private int type;

    public TypeBean(int i4, String str, boolean z4, int i5, int i6) {
        this.type = i4;
        this.name = str;
        this.isSelected = z4;
        this.iconNormal = i5;
        this.iconSelected = i6;
    }

    public int getIconNormal() {
        return this.iconNormal;
    }

    public int getIconSelected() {
        return this.iconSelected;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public boolean isShowDot() {
        return this.showDot;
    }

    public void setIconNormal(int i4) {
        this.iconNormal = i4;
    }

    public void setIconSelected(int i4) {
        this.iconSelected = i4;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSelected(boolean z4) {
        this.isSelected = z4;
    }

    public void setShowDot(boolean z4) {
        this.showDot = z4;
    }

    public void setType(int i4) {
        this.type = i4;
    }
}

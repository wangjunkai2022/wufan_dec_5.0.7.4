package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class TagReportReasonBean {
    private boolean checked = false;
    private String text;
    private int type;

    public TagReportReasonBean(int i4, String str) {
        this.type = i4;
        this.text = str;
    }

    public String getText() {
        return this.text;
    }

    public int getType() {
        return this.type;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean z4) {
        this.checked = z4;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setType(int i4) {
        this.type = i4;
    }
}

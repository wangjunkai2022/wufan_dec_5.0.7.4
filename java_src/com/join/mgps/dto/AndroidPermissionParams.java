package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class AndroidPermissionParams implements Serializable {
    private String cancelText;
    private String confirmText;
    private String content;
    private boolean isSingleBtn;

    public AndroidPermissionParams(String str) {
        this(str, "", "", false);
    }

    public String getCancelText() {
        return this.cancelText;
    }

    public String getConfirmText() {
        return this.confirmText;
    }

    public String getContent() {
        return this.content;
    }

    public boolean isSingleBtn() {
        return this.isSingleBtn;
    }

    public void setCancelText(String str) {
        this.cancelText = str;
    }

    public void setConfirmText(String str) {
        this.confirmText = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setSingleBtn(boolean z4) {
        this.isSingleBtn = z4;
    }

    public AndroidPermissionParams(String str, String str2, String str3, boolean z4) {
        this.content = str;
        this.cancelText = str2;
        this.confirmText = str3;
        this.isSingleBtn = z4;
    }
}

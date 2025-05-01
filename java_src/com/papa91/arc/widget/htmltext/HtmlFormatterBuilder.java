package com.papa91.arc.widget.htmltext;

import android.text.Html;
import androidx.annotation.Nullable;
/* loaded from: classes5.dex */
public class HtmlFormatterBuilder {
    private ClickableTableSpan clickableTableSpan;
    private DrawTableLinkSpan drawTableLinkSpan;
    private String html;
    private Html.ImageGetter imageGetter;
    private OnClickATagListener onClickATagListener;
    private float indent = 24.0f;
    private boolean removeTrailingWhiteSpace = true;

    public ClickableTableSpan getClickableTableSpan() {
        return this.clickableTableSpan;
    }

    public DrawTableLinkSpan getDrawTableLinkSpan() {
        return this.drawTableLinkSpan;
    }

    public String getHtml() {
        return this.html;
    }

    public Html.ImageGetter getImageGetter() {
        return this.imageGetter;
    }

    public float getIndent() {
        return this.indent;
    }

    public OnClickATagListener getOnClickATagListener() {
        return this.onClickATagListener;
    }

    public boolean isRemoveTrailingWhiteSpace() {
        return this.removeTrailingWhiteSpace;
    }

    public HtmlFormatterBuilder setClickableTableSpan(@Nullable ClickableTableSpan clickableTableSpan) {
        this.clickableTableSpan = clickableTableSpan;
        return this;
    }

    public HtmlFormatterBuilder setDrawTableLinkSpan(@Nullable DrawTableLinkSpan drawTableLinkSpan) {
        this.drawTableLinkSpan = drawTableLinkSpan;
        return this;
    }

    public HtmlFormatterBuilder setHtml(@Nullable String str) {
        this.html = str;
        return this;
    }

    public HtmlFormatterBuilder setImageGetter(@Nullable Html.ImageGetter imageGetter) {
        this.imageGetter = imageGetter;
        return this;
    }

    public HtmlFormatterBuilder setIndent(float f5) {
        this.indent = f5;
        return this;
    }

    public void setOnClickATagListener(OnClickATagListener onClickATagListener) {
        this.onClickATagListener = onClickATagListener;
    }

    public HtmlFormatterBuilder setRemoveTrailingWhiteSpace(boolean z4) {
        this.removeTrailingWhiteSpace = z4;
        return this;
    }
}

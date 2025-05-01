package com.kwad.sdk.core.response.model;
/* loaded from: classes5.dex */
public final class b {
    private boolean Vo = true;
    private boolean aBo;
    private int mHeight;
    private String mUrl;
    private int mWidth;

    public b(String str, int i4, int i5, boolean z4, boolean z5) {
        this.mUrl = str;
        this.mWidth = i4;
        this.mHeight = i5;
        this.aBo = z5;
    }

    public final int getHeight() {
        return this.mHeight;
    }

    public final String getUrl() {
        return this.mUrl;
    }

    public final int getWidth() {
        return this.mWidth;
    }
}

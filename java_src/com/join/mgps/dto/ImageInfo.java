package com.join.mgps.dto;

import com.join.mgps.Util.g2;
/* loaded from: classes4.dex */
public class ImageInfo {
    private boolean isSelected = false;
    private boolean isVideo;
    private String url;
    private String videoUrl;

    public ImageInfo(String str) {
        this.url = str;
    }

    public String getUrl() {
        return this.url;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public boolean isGif() {
        return g2.i(this.url) && this.url.endsWith(".gif");
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public boolean isVideo() {
        return this.isVideo;
    }

    public void setSelected(boolean z4) {
        this.isSelected = z4;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setVideo(boolean z4) {
        this.isVideo = z4;
    }

    public void setVideoUrl(String str) {
        this.videoUrl = str;
    }

    public ImageInfo(String str, String str2, boolean z4) {
        this.url = str;
        this.videoUrl = str2;
        this.isVideo = z4;
    }
}

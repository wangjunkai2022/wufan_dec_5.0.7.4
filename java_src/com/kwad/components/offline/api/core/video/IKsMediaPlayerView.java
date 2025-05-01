package com.kwad.components.offline.api.core.video;
/* loaded from: classes5.dex */
public interface IKsMediaPlayerView {

    /* loaded from: classes5.dex */
    public interface VideoViewClickListener {
        void onClickRootView();

        void onClickVideoView();
    }

    void adaptVideoSize(int i4, int i5);

    void fixWidth(boolean z4);

    int getTextureViewGravity();

    void setAd(boolean z4);

    void setClickListener(VideoViewClickListener videoViewClickListener);

    void setForce(boolean z4);

    void setHorizontalVideo(boolean z4);

    void setMediaPlayer(IKsMediaPlayer iKsMediaPlayer);

    void setRadius(float f5);

    void updateTextureViewGravity(int i4);
}

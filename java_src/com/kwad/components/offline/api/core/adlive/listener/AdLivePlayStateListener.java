package com.kwad.components.offline.api.core.adlive.listener;
/* loaded from: classes5.dex */
public interface AdLivePlayStateListener {
    void onLiveAudioEnableChange(boolean z4);

    void onLivePlayCompleted();

    void onLivePlayEnd();

    void onLivePlayPause();

    void onLivePlayProgress(long j4);

    void onLivePlayResume();

    void onLivePlayStart();

    void onLivePrepared();
}

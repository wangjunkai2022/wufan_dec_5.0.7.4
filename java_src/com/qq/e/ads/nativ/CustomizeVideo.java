package com.qq.e.ads.nativ;
/* loaded from: classes5.dex */
public interface CustomizeVideo {
    String getVideoUrl();

    void reportVideoCompleted();

    void reportVideoError(long j4, int i4, int i5);

    void reportVideoPause(long j4);

    void reportVideoPreload();

    void reportVideoResume(long j4);

    void reportVideoStart();
}

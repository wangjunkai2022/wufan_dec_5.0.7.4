package com.bytedance.sdk.openadsdk.mediation.bridge;
/* loaded from: classes2.dex */
public interface IMediationCustomizeVideo {
    String getVideoUrl();

    void reportVideoAutoStart();

    void reportVideoBreak(long j4);

    void reportVideoContinue(long j4);

    void reportVideoError(long j4, int i4, int i5);

    void reportVideoFinish();

    void reportVideoPause(long j4);

    void reportVideoStart();

    void reportVideoStartError(int i4, int i5);
}

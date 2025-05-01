package com.kwad.components.offline.api.tk;
/* loaded from: classes5.dex */
public interface IOfflineApkLoadStatusListener {
    void onDownloadFailed();

    void onDownloadFinished();

    void onDownloadStarted();

    void onIdle();

    void onInstalled();

    void onPaused(int i4);

    void onProgressUpdate(int i4);
}

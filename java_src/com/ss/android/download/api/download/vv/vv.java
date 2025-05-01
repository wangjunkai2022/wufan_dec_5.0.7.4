package com.ss.android.download.api.download.vv;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes5.dex */
public interface vv {
    void m(@Nullable DownloadInfo downloadInfo, String str);

    void vv(@NonNull DownloadModel downloadModel, @Nullable DownloadController downloadController, @Nullable DownloadEventConfig downloadEventConfig);

    void vv(@NonNull DownloadInfo downloadInfo);

    void vv(@NonNull DownloadInfo downloadInfo, BaseException baseException, String str);

    void vv(@NonNull DownloadInfo downloadInfo, String str);
}

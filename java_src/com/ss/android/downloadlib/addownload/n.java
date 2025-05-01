package com.ss.android.downloadlib.addownload;

import android.content.Context;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
/* loaded from: classes5.dex */
public interface n {
    long i();

    n m(int i4, DownloadStatusChangeListener downloadStatusChangeListener);

    n m(Context context);

    n m(DownloadController downloadController);

    n m(DownloadEventConfig downloadEventConfig);

    n m(DownloadModel downloadModel);

    void m(int i4);

    boolean m();

    void qv();

    n vv(long j4);

    n vv(IDownloadButtonClickListener iDownloadButtonClickListener);

    n vv(OnItemClickListener onItemClickListener);

    n vv(String str);

    void vv();

    void vv(boolean z4);

    boolean vv(int i4);
}

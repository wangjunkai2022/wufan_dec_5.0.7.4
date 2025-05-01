package com.ss.android.socialbase.downloader.wv;

import android.util.SparseArray;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.la;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes5.dex */
public class p {
    public static void vv(int i4, SparseArray<IDownloadListener> sparseArray, boolean z4, DownloadInfo downloadInfo, BaseException baseException) {
        SparseArray<IDownloadListener> clone;
        if (!z4 || sparseArray == null) {
            return;
        }
        try {
            if (sparseArray.size() <= 0) {
                return;
            }
            synchronized (sparseArray) {
                clone = sparseArray.clone();
            }
            for (int i5 = 0; i5 < clone.size(); i5++) {
                IDownloadListener iDownloadListener = clone.get(clone.keyAt(i5));
                if (iDownloadListener != null) {
                    if (i4 == 1) {
                        iDownloadListener.onPrepare(downloadInfo);
                    } else if (i4 == 2) {
                        iDownloadListener.onStart(downloadInfo);
                    } else if (i4 == 4) {
                        iDownloadListener.onProgress(downloadInfo);
                    } else if (i4 == 5) {
                        iDownloadListener.onRetry(downloadInfo, baseException);
                    } else if (i4 == 6) {
                        iDownloadListener.onFirstStart(downloadInfo);
                    } else if (i4 == 7) {
                        iDownloadListener.onRetryDelay(downloadInfo, baseException);
                    } else if (i4 != 11) {
                        switch (i4) {
                            case -7:
                                if (iDownloadListener instanceof AbsDownloadListener) {
                                    ((AbsDownloadListener) iDownloadListener).onIntercept(downloadInfo);
                                    break;
                                } else {
                                    continue;
                                }
                            case -6:
                                iDownloadListener.onFirstSuccess(downloadInfo);
                                continue;
                            case -5:
                            case -2:
                                iDownloadListener.onPause(downloadInfo);
                                continue;
                            case -4:
                                iDownloadListener.onCanceled(downloadInfo);
                                continue;
                            case -3:
                                iDownloadListener.onSuccessed(downloadInfo);
                                continue;
                            case -1:
                                iDownloadListener.onFailed(downloadInfo, baseException);
                                continue;
                            default:
                                continue;
                        }
                    } else if (iDownloadListener instanceof la) {
                        ((la) iDownloadListener).vv(downloadInfo);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

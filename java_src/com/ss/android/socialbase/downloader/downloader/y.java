package com.ss.android.socialbase.downloader.downloader;

import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
/* loaded from: classes5.dex */
public interface y {

    /* loaded from: classes5.dex */
    public static class vv implements y {
        @Override // com.ss.android.socialbase.downloader.downloader.y
        public IDownloadHttpService m() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.y
        public com.ss.android.socialbase.downloader.network.qv p() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.y
        public com.ss.android.socialbase.downloader.exception.n vv(Throwable th, String str) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.y
        public boolean vv() {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.y
        public boolean vv(Throwable th) {
            return false;
        }
    }

    IDownloadHttpService m();

    com.ss.android.socialbase.downloader.network.qv p();

    com.ss.android.socialbase.downloader.exception.n vv(Throwable th, String str);

    boolean vv();

    boolean vv(Throwable th);
}

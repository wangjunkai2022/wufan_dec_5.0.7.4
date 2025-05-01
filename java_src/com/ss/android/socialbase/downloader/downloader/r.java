package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.a;
import com.ss.android.socialbase.downloader.depend.ot;
import com.ss.android.socialbase.downloader.depend.vu;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
/* loaded from: classes5.dex */
public interface r {
    void b(int i4);

    vu d(int i4);

    a g(int i4);

    List<DownloadInfo> i();

    List<DownloadInfo> i(String str);

    void i(int i4);

    boolean j(int i4);

    boolean jh(int i4);

    void k(int i4);

    IDownloadFileUriProvider la(int i4);

    DownloadInfo m(String str, String str2);

    List<DownloadInfo> m(String str);

    void m(int i4, int i5, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.u uVar, boolean z4);

    void m(int i4, List<com.ss.android.socialbase.downloader.model.m> list);

    void m(int i4, boolean z4);

    void m(DownloadInfo downloadInfo);

    void m(DownloadTask downloadTask);

    void m(List<String> list);

    boolean m();

    boolean m(int i4);

    boolean n();

    boolean n(int i4);

    long o(int i4);

    List<DownloadInfo> o(String str);

    boolean o();

    List<DownloadInfo> p(String str);

    void p(int i4);

    void p(int i4, boolean z4);

    boolean p();

    boolean p(DownloadInfo downloadInfo);

    void q(int i4);

    DownloadInfo qv(int i4);

    int r(int i4);

    void startService();

    boolean t(int i4);

    int u(int i4);

    void u();

    int vv(String str, String str2);

    List<DownloadInfo> vv(String str);

    void vv();

    void vv(int i4);

    void vv(int i4, int i5);

    void vv(int i4, int i5, int i6, int i7);

    void vv(int i4, int i5, int i6, long j4);

    void vv(int i4, int i5, long j4);

    void vv(int i4, int i5, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.u uVar, boolean z4);

    void vv(int i4, int i5, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.u uVar, boolean z4, boolean z5);

    void vv(int i4, long j4);

    void vv(int i4, Notification notification);

    void vv(int i4, vu vuVar);

    void vv(int i4, List<com.ss.android.socialbase.downloader.model.m> list);

    void vv(int i4, boolean z4);

    void vv(ot otVar);

    void vv(DownloadTask downloadTask);

    void vv(com.ss.android.socialbase.downloader.model.m mVar);

    void vv(List<String> list);

    void vv(boolean z4, boolean z5);

    boolean vv(DownloadInfo downloadInfo);

    List<com.ss.android.socialbase.downloader.model.m> wv(int i4);
}

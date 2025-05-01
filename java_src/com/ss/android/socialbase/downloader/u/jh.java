package com.ss.android.socialbase.downloader.u;

import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class jh implements o {

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.model.o f61394m;

    /* renamed from: p  reason: collision with root package name */
    private final o f61395p;
    private final wv vv;

    public jh(DownloadInfo downloadInfo, m mVar, wv wvVar) throws BaseException {
        this.vv = wvVar;
        this.f61394m = vv(downloadInfo, wvVar);
        this.f61395p = new qv(mVar, this);
    }

    public void i() {
        com.ss.android.socialbase.downloader.wv.u.vv(this.f61394m);
    }

    @Override // com.ss.android.socialbase.downloader.u.o
    public void m(@NonNull vv vvVar) throws IOException {
        this.f61394m.vv(vvVar.vv, 0, vvVar.f61444p);
        this.vv.m(vvVar.f61444p);
    }

    public wv o() {
        return this.vv;
    }

    public void p() throws IOException {
        this.f61394m.p();
    }

    public o vv() {
        return this.f61395p;
    }

    private com.ss.android.socialbase.downloader.model.o vv(DownloadInfo downloadInfo, wv wvVar) throws BaseException {
        com.ss.android.socialbase.downloader.model.o vv = com.ss.android.socialbase.downloader.wv.u.vv(downloadInfo, downloadInfo.getTempPath(), downloadInfo.getTempName(), com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("flush_buffer_size_byte", -1));
        try {
            vv.vv(wvVar.o());
            return vv;
        } catch (IOException e5) {
            throw new BaseException(1054, e5);
        }
    }

    public void m() throws IOException {
        this.f61394m.m();
    }
}

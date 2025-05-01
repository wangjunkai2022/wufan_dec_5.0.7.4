package com.ss.android.socialbase.downloader.o;

import com.ss.android.socialbase.downloader.wv.u;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes5.dex */
public class p implements m {

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.u.vv f61312m;
    private final InputStream vv;

    public p(InputStream inputStream, int i4) {
        this.vv = inputStream;
        this.f61312m = new com.ss.android.socialbase.downloader.u.vv(i4);
    }

    @Override // com.ss.android.socialbase.downloader.o.m
    public void m() {
        u.vv(this.vv);
    }

    @Override // com.ss.android.socialbase.downloader.o.m
    public com.ss.android.socialbase.downloader.u.vv vv() throws IOException {
        com.ss.android.socialbase.downloader.u.vv vvVar = this.f61312m;
        vvVar.f61444p = this.vv.read(vvVar.vv);
        return this.f61312m;
    }

    @Override // com.ss.android.socialbase.downloader.o.m
    public void vv(com.ss.android.socialbase.downloader.u.vv vvVar) {
    }
}

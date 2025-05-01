package com.ss.android.socialbase.downloader.network.vv;

import com.ss.android.socialbase.downloader.network.wv;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* loaded from: classes5.dex */
public class i implements wv {

    /* renamed from: i  reason: collision with root package name */
    private boolean f61267i;

    /* renamed from: m  reason: collision with root package name */
    private final List<com.ss.android.socialbase.downloader.model.p> f61268m;

    /* renamed from: o  reason: collision with root package name */
    private long f61269o;

    /* renamed from: p  reason: collision with root package name */
    private wv f61270p;

    /* renamed from: u  reason: collision with root package name */
    private InputStream f61271u;
    protected final Object vv;

    @Override // com.ss.android.socialbase.downloader.network.wv
    public void i() {
        wv wvVar = this.f61270p;
        if (wvVar != null) {
            wvVar.i();
        }
    }

    @Override // com.ss.android.socialbase.downloader.network.n
    public int m() throws IOException {
        wv wvVar = this.f61270p;
        if (wvVar != null) {
            return wvVar.m();
        }
        return 0;
    }

    public boolean n() {
        try {
            wv wvVar = this.f61270p;
            if (wvVar != null) {
                return vv(wvVar.m());
            }
            return false;
        } catch (IOException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public void o() throws InterruptedException {
        synchronized (this.vv) {
            if (this.f61267i && this.f61270p == null) {
                this.vv.wait();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.network.n
    public void p() {
        wv wvVar = this.f61270p;
        if (wvVar != null) {
            wvVar.p();
        }
    }

    public boolean qv() {
        return System.currentTimeMillis() - this.f61269o < m.vv;
    }

    public List<com.ss.android.socialbase.downloader.model.p> u() {
        return this.f61268m;
    }

    @Override // com.ss.android.socialbase.downloader.network.wv
    public InputStream vv() throws IOException {
        InputStream inputStream = this.f61271u;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public boolean vv(int i4) {
        return i4 >= 200 && i4 < 300;
    }

    @Override // com.ss.android.socialbase.downloader.network.n
    public String vv(String str) {
        wv wvVar = this.f61270p;
        if (wvVar != null) {
            return wvVar.vv(str);
        }
        return null;
    }
}

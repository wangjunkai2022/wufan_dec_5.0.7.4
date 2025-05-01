package com.ss.android.socialbase.downloader.model;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.network.n;
import com.ss.android.socialbase.downloader.wv.u;
import java.io.IOException;
/* loaded from: classes5.dex */
public class i {

    /* renamed from: i  reason: collision with root package name */
    private long f61205i;

    /* renamed from: m  reason: collision with root package name */
    public final n f61206m;

    /* renamed from: o  reason: collision with root package name */
    private long f61207o;

    /* renamed from: p  reason: collision with root package name */
    public final int f61208p;
    public final String vv;

    public i(String str, n nVar) throws IOException {
        this.vv = str;
        this.f61208p = nVar.m();
        this.f61206m = nVar;
    }

    public long b() {
        return u.wv(n());
    }

    public String i() {
        return this.f61206m.vv("Content-Type");
    }

    public long k() {
        if (this.f61207o <= 0) {
            if (!wv()) {
                String o4 = o();
                if (!TextUtils.isEmpty(o4)) {
                    this.f61207o = u.m(o4);
                }
            } else {
                this.f61207o = -1L;
            }
        }
        return this.f61207o;
    }

    public boolean m() {
        return u.vv(this.f61208p, this.f61206m.vv("Accept-Ranges"));
    }

    public String n() {
        return u.m(this.f61206m, "Cache-Control");
    }

    public String o() {
        return u.m(this.f61206m, "Content-Range");
    }

    public String p() {
        return this.f61206m.vv("Etag");
    }

    public long qv() {
        if (this.f61205i <= 0) {
            this.f61205i = u.vv(this.f61206m);
        }
        return this.f61205i;
    }

    public String u() {
        String m4 = u.m(this.f61206m, "last-modified");
        return TextUtils.isEmpty(m4) ? u.m(this.f61206m, "Last-Modified") : m4;
    }

    public boolean vv() {
        return u.p(this.f61208p);
    }

    public boolean wv() {
        if (com.ss.android.socialbase.downloader.wv.vv.vv(8)) {
            return u.p(this.f61206m);
        }
        return u.m(qv());
    }
}

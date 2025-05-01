package com.ss.android.socialbase.appdownloader.vv;

import android.content.Context;
/* loaded from: classes5.dex */
public abstract class vv implements o {

    /* renamed from: m  reason: collision with root package name */
    protected final com.ss.android.socialbase.downloader.n.vv f60930m;

    /* renamed from: p  reason: collision with root package name */
    protected final String f60931p;
    protected final Context vv;

    public vv(Context context, com.ss.android.socialbase.downloader.n.vv vvVar, String str) {
        this.vv = context;
        this.f60930m = vvVar;
        this.f60931p = str;
    }

    public boolean vv() {
        if (this.vv == null) {
            return false;
        }
        try {
        } catch (Throwable unused) {
            com.ss.android.socialbase.downloader.p.vv.vv();
        }
        return m().resolveActivity(this.vv.getPackageManager()) != null;
    }
}

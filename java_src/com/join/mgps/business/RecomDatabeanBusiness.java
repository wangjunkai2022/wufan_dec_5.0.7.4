package com.join.mgps.business;

import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.mgps.dto.RecomDatabean;
/* loaded from: classes4.dex */
public class RecomDatabeanBusiness extends RecomDatabean {

    /* renamed from: b  reason: collision with root package name */
    private DownloadTask f46284b;

    /* renamed from: c  reason: collision with root package name */
    private String f46285c;

    /* renamed from: d  reason: collision with root package name */
    private long f46286d;

    public RecomDatabeanBusiness(RecomDatabean recomDatabean) {
        super(recomDatabean);
    }

    public DownloadTask a() {
        return this.f46284b;
    }

    public String b() {
        return this.f46285c;
    }

    public long c() {
        return this.f46286d;
    }

    public void d(DownloadTask downloadTask) {
        this.f46284b = downloadTask;
    }

    public void e(String str) {
        this.f46285c = str;
    }

    public void f(long j4) {
        this.f46286d = j4;
    }
}

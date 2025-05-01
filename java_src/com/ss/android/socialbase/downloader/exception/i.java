package com.ss.android.socialbase.downloader.exception;
/* loaded from: classes5.dex */
public class i extends BaseException {

    /* renamed from: m  reason: collision with root package name */
    private final long f61064m;
    private final long vv;

    public i(long j4, long j5) {
        super(1006, String.format("space is not enough required space is : %s but available space is :%s", String.valueOf(j5), String.valueOf(j4)));
        this.vv = j4;
        this.f61064m = j5;
    }

    public long m() {
        return this.f61064m;
    }

    public long vv() {
        return this.vv;
    }
}

package com.ss.android.socialbase.downloader.exception;
/* loaded from: classes5.dex */
public class n extends BaseException {
    public n(int i4, String str) {
        super(i4, str);
    }

    public n vv(String str) {
        setExtraInfo(str);
        return this;
    }

    public String vv() {
        return getExtraInfo();
    }
}

package com.ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
/* loaded from: classes5.dex */
public class wv implements com.ss.android.socialbase.downloader.downloader.b {
    @Override // com.ss.android.socialbase.downloader.downloader.b
    public int vv(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String o4 = com.ss.android.socialbase.downloader.wv.u.o(String.format("%s_%s", str, str2));
        if (TextUtils.isEmpty(o4)) {
            return 0;
        }
        return o4.hashCode();
    }
}

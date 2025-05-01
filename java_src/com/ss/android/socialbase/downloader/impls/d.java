package com.ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.la;
/* loaded from: classes5.dex */
public class d implements la {
    private final long[] vv;

    public d(String str) {
        this.vv = vv(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.la
    public long vv(int i4, int i5) {
        long[] jArr = this.vv;
        if (jArr == null || jArr.length <= 0) {
            return 0L;
        }
        int i6 = i4 - 1;
        if (i6 < 0) {
            i6 = 0;
        }
        if (i6 > jArr.length - 1) {
            i6 = jArr.length - 1;
        }
        return jArr[i6];
    }

    private long[] vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split.length == 0) {
                return null;
            }
            long[] jArr = new long[split.length];
            for (int i4 = 0; i4 < split.length; i4++) {
                jArr[i4] = Long.parseLong(split[i4]);
            }
            return jArr;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}

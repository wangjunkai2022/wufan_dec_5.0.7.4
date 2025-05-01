package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.downloader.la;
import io.netty.handler.traffic.AbstractTrafficShapingHandler;
import q.a;
/* loaded from: classes5.dex */
public class k implements la {
    @Override // com.ss.android.socialbase.downloader.downloader.la
    public long vv(int i4, int i5) {
        if (i4 == 1) {
            return 3000L;
        }
        if (i4 == 2) {
            return AbstractTrafficShapingHandler.DEFAULT_MAX_TIME;
        }
        if (i4 == 3) {
            return 30000L;
        }
        if (i4 > 3) {
            return a.f73127b;
        }
        return 0L;
    }
}

package com.ss.android.downloadlib.addownload.compliance;
/* loaded from: classes5.dex */
public class p extends com.ss.android.socialbase.downloader.wv.qv<Long, com.ss.android.downloadlib.addownload.m.m> {

    /* loaded from: classes5.dex */
    private static class vv {
        private static p vv = new p();
    }

    public static p vv() {
        return vv.vv;
    }

    private p() {
        super(16, 16);
    }

    public void vv(com.ss.android.downloadlib.addownload.m.m mVar) {
        if (mVar == null) {
            return;
        }
        put(Long.valueOf(mVar.vv()), mVar);
    }

    public com.ss.android.downloadlib.addownload.m.m vv(long j4, long j5) {
        return get(get(Long.valueOf(j4)) != null ? Long.valueOf(j4) : Long.valueOf(j5));
    }

    public com.ss.android.downloadlib.addownload.m.m vv(long j4) {
        return get(Long.valueOf(j4));
    }
}

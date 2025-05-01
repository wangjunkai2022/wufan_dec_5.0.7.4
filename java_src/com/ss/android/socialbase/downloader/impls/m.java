package com.ss.android.socialbase.downloader.impls;
/* loaded from: classes5.dex */
public class m implements com.ss.android.socialbase.downloader.downloader.n {
    @Override // com.ss.android.socialbase.downloader.downloader.n
    public int vv(int i4, com.ss.android.socialbase.downloader.network.jh jhVar) {
        if (jhVar.ordinal() <= com.ss.android.socialbase.downloader.network.jh.MODERATE.ordinal()) {
            return 1;
        }
        return jhVar == com.ss.android.socialbase.downloader.network.jh.GOOD ? i4 - 1 : i4;
    }
}

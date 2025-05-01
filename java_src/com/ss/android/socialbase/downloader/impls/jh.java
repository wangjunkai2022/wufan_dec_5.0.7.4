package com.ss.android.socialbase.downloader.impls;
/* loaded from: classes5.dex */
public class jh {

    /* renamed from: m  reason: collision with root package name */
    private static volatile com.ss.android.socialbase.downloader.downloader.r f61097m;
    private static volatile com.ss.android.socialbase.downloader.downloader.r vv;

    public static com.ss.android.socialbase.downloader.downloader.r vv(boolean z4) {
        if (z4 && com.ss.android.socialbase.downloader.downloader.p.e()) {
            if (f61097m == null) {
                synchronized (jh.class) {
                    if (f61097m == null) {
                        f61097m = com.ss.android.socialbase.downloader.downloader.p.ju().m();
                    }
                }
            }
            return f61097m;
        }
        if (vv == null) {
            synchronized (jh.class) {
                if (vv == null) {
                    vv = new j();
                }
            }
        }
        return vv;
    }
}

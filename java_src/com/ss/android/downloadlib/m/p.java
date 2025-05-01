package com.ss.android.downloadlib.m;

import android.os.Build;
import androidx.annotation.NonNull;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.socialbase.downloader.vv.vv;
/* loaded from: classes5.dex */
public class p {
    public static void vv(final com.ss.android.downloadad.api.vv.m mVar, @NonNull final com.ss.android.downloadlib.guide.install.vv vvVar) {
        boolean m4 = com.ss.android.socialbase.downloader.vv.vv.vv().m();
        if (!m4 && Build.VERSION.SDK_INT >= 29) {
            jh.p();
        }
        boolean m5 = com.ss.android.socialbase.downloader.vv.vv.vv().m();
        if (!m4 && m5 && mVar != null) {
            mVar.jh(true);
        }
        vvVar.vv();
        com.ss.android.socialbase.downloader.p.vv.m("AppInstallOptimiseHelper", "AppInstallOptimiseHelper-->isAppForegroundSecond:::".concat(String.valueOf(m5)));
        if (m5) {
            return;
        }
        com.ss.android.socialbase.downloader.vv.vv.vv().vv(new vv.InterfaceC0653vv() { // from class: com.ss.android.downloadlib.m.p.1
            @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
            public void m() {
                com.ss.android.socialbase.downloader.p.vv.m("AppInstallOptimiseHelper", "AppInstallOptimiseHelper-->onAppForeground");
                com.ss.android.socialbase.downloader.vv.vv.vv().m(this);
                if (jh.m(com.ss.android.downloadad.api.vv.m.this)) {
                    return;
                }
                com.ss.android.downloadad.api.vv.m.this.r(true);
                com.ss.android.downloadlib.i.vv.vv().vv("install_delay_invoke", com.ss.android.downloadad.api.vv.m.this);
                vvVar.vv();
            }

            @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
            public void p() {
            }
        });
    }
}

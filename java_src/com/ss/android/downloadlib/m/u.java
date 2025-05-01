package com.ss.android.downloadlib.m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.socialbase.downloader.vv.vv;
import org.json.JSONException;
import org.json.JSONObject;
import q.a;
/* loaded from: classes5.dex */
public class u {
    private static Handler vv = new Handler(Looper.getMainLooper());

    public static boolean i(com.ss.android.downloadad.api.vv.m mVar) {
        return com.ss.android.downloadlib.n.o.vv(mVar).m("app_link_opt_dialog_switch") == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(com.ss.android.downloadad.api.vv.m mVar) {
        return com.ss.android.downloadlib.n.o.vv(mVar).vv("app_link_check_count", 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(@NonNull final com.ss.android.downloadad.api.vv.m mVar, final int i4) {
        if (i4 <= 0) {
            return;
        }
        com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.m.u.2
            @Override // java.lang.Runnable
            public void run() {
                int i5 = 1;
                if (jh.p(com.ss.android.downloadad.api.vv.m.this.o())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (!com.ss.android.downloadad.api.vv.m.this.ah()) {
                            i5 = 2;
                        }
                        jSONObject.putOpt("deeplink_source", Integer.valueOf(i5));
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                    }
                    com.ss.android.downloadlib.i.vv.vv().vv("deeplink_success_2", jSONObject, com.ss.android.downloadad.api.vv.m.this);
                    return;
                }
                u.m(com.ss.android.downloadad.api.vv.m.this, i4 - 1);
            }
        }, wv(mVar) * 1000);
    }

    public static long o(com.ss.android.downloadad.api.vv.m mVar) {
        if (mVar == null) {
            return 3000L;
        }
        return com.ss.android.downloadlib.n.o.vv(mVar).vv("app_link_opt_back_time_limit", 3) * 1000;
    }

    public static boolean p(com.ss.android.downloadad.api.vv.m mVar) {
        return com.ss.android.downloadlib.n.o.vv(mVar).m("app_link_opt_invoke_switch") == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long qv(com.ss.android.downloadad.api.vv.m mVar) {
        return com.ss.android.downloadlib.n.o.vv(mVar).vv("app_link_check_timeout", a.f73127b);
    }

    private static int wv(com.ss.android.downloadad.api.vv.m mVar) {
        return com.ss.android.downloadlib.n.o.vv(mVar).vv("app_link_check_delay", 1);
    }

    public static void vv(final com.ss.android.downloadad.api.vv.m mVar, @NonNull final qv qvVar) {
        boolean m4 = com.ss.android.socialbase.downloader.vv.vv.vv().m();
        if (!m4 && Build.VERSION.SDK_INT >= 29) {
            jh.p();
        }
        boolean m5 = com.ss.android.socialbase.downloader.vv.vv.vv().m();
        boolean z4 = !m4 && m5;
        if (mVar != null) {
            mVar.jh(z4);
        }
        qvVar.vv(z4);
        if (mVar == null) {
            return;
        }
        m(mVar, k(mVar));
        if (m5) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        com.ss.android.socialbase.downloader.vv.vv.vv().vv(new vv.InterfaceC0653vv() { // from class: com.ss.android.downloadlib.m.u.1
            @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
            public void m() {
                com.ss.android.socialbase.downloader.vv.vv.vv().m(this);
                com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.m.u.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean p4 = jh.p(com.ss.android.downloadad.api.vv.m.this.o());
                        long o4 = u.o(com.ss.android.downloadad.api.vv.m.this);
                        if (!p4 || o4 >= System.currentTimeMillis() - currentTimeMillis) {
                            long qv = u.qv(com.ss.android.downloadad.api.vv.m.this);
                            long currentTimeMillis2 = System.currentTimeMillis();
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            if (currentTimeMillis2 - currentTimeMillis > qv) {
                                com.ss.android.downloadlib.i.vv.vv().vv("deeplink_delay_timeout", com.ss.android.downloadad.api.vv.m.this);
                                return;
                            }
                            com.ss.android.downloadad.api.vv.m.this.jh(true);
                            com.ss.android.downloadlib.i.vv.vv().vv("deeplink_delay_invoke", com.ss.android.downloadad.api.vv.m.this);
                            qvVar.vv(true);
                            com.ss.android.downloadad.api.vv.m mVar2 = com.ss.android.downloadad.api.vv.m.this;
                            u.m(mVar2, u.k(mVar2));
                        }
                    }
                });
            }

            @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
            public void p() {
            }
        });
    }

    public static boolean m(com.ss.android.downloadad.api.vv.m mVar) {
        return com.ss.android.downloadlib.n.o.vv(mVar).m("app_link_opt_install_switch") == 1;
    }

    public static boolean vv(com.ss.android.downloadad.api.vv.m mVar) {
        return com.ss.android.downloadlib.n.o.vv(mVar).m("app_link_opt_switch") == 1;
    }
}

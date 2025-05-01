package com.ss.android.downloadlib.addownload;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.ss.android.downloadlib.addownload.o;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class i {

    /* renamed from: m  reason: collision with root package name */
    private com.ss.android.downloadlib.addownload.m.o f60453m;
    private Handler vv;

    /* renamed from: p  reason: collision with root package name */
    private AtomicBoolean f60454p = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    private AtomicBoolean f60452i = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Handler handler) {
        this.vv = handler;
    }

    private static long i() {
        return com.ss.android.downloadlib.n.jh.m(0L);
    }

    public static long m() {
        if (b.r() != null) {
            return b.r().vv();
        }
        return 0L;
    }

    static /* synthetic */ long p() {
        return i();
    }

    private void m(com.ss.android.downloadad.api.vv.m mVar, JSONObject jSONObject, long j4, long j5) {
        mVar.jh("1");
        com.ss.android.downloadlib.addownload.m.wv.vv().vv(mVar);
        try {
            jSONObject.putOpt("quite_clean_size", Long.valueOf(j5 - j4));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.i.vv.vv().vv("cleanspace_download_after_quite_clean", jSONObject, mVar);
    }

    public void vv(com.ss.android.downloadlib.addownload.m.o oVar) {
        this.f60453m = oVar;
    }

    public boolean vv() {
        return this.f60452i.get();
    }

    public void vv(boolean z4) {
        this.f60452i.set(z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void vv(final int i4, final long j4, long j5, final o.vv vvVar) {
        this.f60452i.set(false);
        if (vvVar == null) {
            return;
        }
        if (com.ss.android.downloadlib.n.o.u(i4) && com.ss.android.downloadlib.n.o.o(i4)) {
            long p4 = com.ss.android.downloadlib.n.o.p(i4);
            this.f60454p.set(false);
            final String downloadUrl = this.f60453m.f60510m.getDownloadUrl();
            com.ss.android.downloadad.api.vv.m m4 = com.ss.android.downloadlib.addownload.m.u.vv().m(downloadUrl);
            if (m4 == null) {
                com.ss.android.downloadlib.addownload.m.o oVar = this.f60453m;
                m4 = new com.ss.android.downloadad.api.vv.m(oVar.f60510m, oVar.f60512p, oVar.f60509i, 0);
                com.ss.android.downloadlib.addownload.m.u.vv().vv(m4);
            }
            final com.ss.android.downloadad.api.vv.m mVar = m4;
            mVar.o(false);
            if (b.r() != null) {
                b.r();
                mVar.m();
            }
            com.ss.android.downloadlib.addownload.p.i.vv().vv(mVar.vv());
            boolean i5 = com.ss.android.downloadlib.n.o.i(i4);
            if (j5 > 0) {
                vv(i4, downloadUrl, j5, mVar, j4, vvVar);
            } else if (i5) {
                vv(downloadUrl, mVar, new o.m() { // from class: com.ss.android.downloadlib.addownload.i.1
                    @Override // com.ss.android.downloadlib.addownload.o.m
                    public void vv(long j6) {
                        i.this.vv(i4, downloadUrl, j6, mVar, j4, vvVar);
                    }
                });
            } else {
                p4 = 0;
            }
            this.vv.postDelayed(new Runnable() { // from class: com.ss.android.downloadlib.addownload.i.2
                @Override // java.lang.Runnable
                public void run() {
                    if (i.this.f60454p.get()) {
                        return;
                    }
                    i.this.f60454p.set(true);
                    vvVar.vv();
                }
            }, p4);
            return;
        }
        vvVar.vv();
    }

    private void vv(String str, com.ss.android.downloadad.api.vv.m mVar, final o.m mVar2) {
        if (mVar2 == null) {
            return;
        }
        com.ss.android.socialbase.downloader.network.vv.m.vv(str, new com.ss.android.socialbase.downloader.network.k() { // from class: com.ss.android.downloadlib.addownload.i.3
            @Override // com.ss.android.socialbase.downloader.network.k
            public void vv(Map<String, String> map) {
                if (i.this.f60454p.get()) {
                    return;
                }
                i.this.f60454p.set(true);
                long vv = i.this.vv(map);
                if (vv > 0) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("apk_size", Long.valueOf(vv));
                        jSONObject.putOpt("available_space", Long.valueOf(i.p()));
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                    }
                }
                mVar2.vv(vv);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long vv(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String value = entry.getValue();
                    if ("content-length".equalsIgnoreCase(entry.getKey())) {
                        return Long.parseLong(value);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(int i4, String str, long j4, final com.ss.android.downloadad.api.vv.m mVar, long j5, final o.vv vvVar) {
        this.f60454p.set(true);
        boolean z4 = false;
        if (j4 > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("apk_size", Long.valueOf(j4));
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            double d5 = j4;
            Double.isNaN(d5);
            long longValue = (Double.valueOf((com.ss.android.downloadlib.n.o.vv(i4) + 1.0d) * d5).longValue() + com.ss.android.downloadlib.n.o.m(i4)) - j5;
            long i5 = i();
            if (i5 < longValue) {
                vv(mVar, jSONObject, longValue, i5);
                vv(mVar);
                long i6 = i();
                if (i6 < longValue) {
                    mVar.i(true);
                    final String vv = mVar.vv();
                    com.ss.android.downloadlib.addownload.p.i.vv().vv(vv, new com.ss.android.downloadlib.addownload.p.o() { // from class: com.ss.android.downloadlib.addownload.i.4
                    });
                    z4 = vv(i4, mVar, str, longValue);
                    if (z4) {
                        mVar.o(true);
                    }
                } else {
                    m(mVar, jSONObject, i5, i6);
                }
            }
        }
        if (z4) {
            return;
        }
        this.vv.post(new Runnable() { // from class: com.ss.android.downloadlib.addownload.i.5
            @Override // java.lang.Runnable
            public void run() {
                vvVar.vv();
            }
        });
    }

    private boolean vv(int i4, @NonNull com.ss.android.downloadad.api.vv.m mVar, String str, long j4) {
        if (com.ss.android.downloadlib.n.o.u(i4)) {
            if (b.r() != null) {
                return b.r().vv(i4, str, true, j4);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("show_dialog_result", 3);
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            com.ss.android.downloadlib.i.vv.vv().vv("cleanspace_window_show", jSONObject, mVar);
            return false;
        }
        return false;
    }

    public static boolean vv(final DownloadInfo downloadInfo, long j4) {
        int id = downloadInfo.getId();
        boolean z4 = false;
        if (com.ss.android.downloadlib.n.o.u(id)) {
            if (b.r() != null && (z4 = b.r().vv(id, downloadInfo.getUrl(), false, j4))) {
                com.ss.android.downloadlib.addownload.p.i.vv().vv(downloadInfo.getUrl(), new com.ss.android.downloadlib.addownload.p.o() { // from class: com.ss.android.downloadlib.addownload.i.6
                });
            }
            return z4;
        }
        return false;
    }

    public static JSONObject vv(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("clean_space_install_params", str);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    public static void vv(int i4) {
        if (com.ss.android.downloadlib.n.o.u(i4) && b.r() != null && b.r().m()) {
            b.r();
        }
    }

    private static void vv(com.ss.android.downloadad.api.vv.m mVar) {
        long i4 = i();
        if (b.r() != null) {
            b.r();
        }
        com.ss.android.downloadlib.addownload.p.p.vv();
        com.ss.android.downloadlib.addownload.p.p.m();
        if (com.ss.android.downloadlib.n.o.n(mVar.la())) {
            com.ss.android.downloadlib.addownload.p.p.vv(b.getContext());
        }
        long i5 = i();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("quite_clean_size", Long.valueOf(i5 - i4));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.i.vv.vv().vv("clean_quite_finish", jSONObject, mVar);
    }

    private void vv(com.ss.android.downloadad.api.vv.m mVar, JSONObject jSONObject, long j4, long j5) {
        try {
            jSONObject.putOpt("available_space", Long.valueOf(j5));
            jSONObject.putOpt("apk_download_need_size", Long.valueOf(j4));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.i.vv.vv().vv("clean_space_no_enough_for_download", jSONObject, mVar);
    }
}

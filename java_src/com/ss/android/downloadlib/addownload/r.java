package com.ss.android.downloadlib.addownload;

import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.impls.g;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class r {

    /* renamed from: m  reason: collision with root package name */
    private static com.ss.android.downloadlib.addownload.vv.p f60576m;
    private static com.ss.android.downloadlib.addownload.vv.i vv;

    public static com.ss.android.downloadlib.addownload.vv.p m() {
        return f60576m;
    }

    public static com.ss.android.downloadlib.addownload.vv.i vv() {
        return vv;
    }

    public static boolean vv(int i4) {
        return i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5 || i4 == 7 || i4 == 8;
    }

    public static void vv(com.ss.android.downloadlib.addownload.vv.i iVar) {
        vv = iVar;
    }

    public static void vv(com.ss.android.downloadlib.addownload.vv.p pVar) {
        f60576m = pVar;
    }

    public static boolean vv(final com.ss.android.downloadad.api.vv.m mVar, DownloadInfo downloadInfo, int i4, final com.ss.android.downloadlib.addownload.i.qv qvVar, final boolean z4, final com.ss.android.downloadlib.addownload.vv.p pVar) {
        boolean m4;
        if (mVar == null) {
            com.ss.android.downloadlib.o.p.vv().vv("tryReverseWifi nativeModel null");
            return false;
        } else if (downloadInfo == null) {
            com.ss.android.downloadlib.o.p.vv().vv("tryReverseWifi info null");
            return false;
        } else {
            final int id = downloadInfo.getId();
            if (z4) {
                m4 = com.ss.android.downloadlib.n.o.p(mVar);
            } else {
                m4 = com.ss.android.downloadlib.n.o.m(mVar);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("switch_status", Integer.valueOf(m4 ? 1 : 0));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (z4) {
                com.ss.android.downloadlib.i.vv.vv().vv("cancel_pause_reserve_wifi_switch_status", jSONObject, mVar);
            } else {
                com.ss.android.downloadlib.i.vv.vv().vv("pause_reserve_wifi_switch_status", jSONObject, mVar);
            }
            if (m4 && vv(i4) && !com.ss.android.socialbase.downloader.wv.u.m(b.getContext())) {
                if (z4 || !downloadInfo.hasPauseReservedOnWifi()) {
                    vv(new com.ss.android.downloadlib.addownload.vv.i() { // from class: com.ss.android.downloadlib.addownload.r.1
                        @Override // com.ss.android.downloadlib.addownload.vv.i
                        public void m() {
                            r.vv((com.ss.android.downloadlib.addownload.vv.i) null);
                            DownloadInfo downloadInfo2 = Downloader.getInstance(b.getContext()).getDownloadInfo(id);
                            if (downloadInfo2 != null) {
                                downloadInfo2.stopPauseReserveOnWifi();
                            }
                            if (z4) {
                                com.ss.android.downloadlib.i.vv.vv().vv("cancel_pause_reserve_wifi_cancel", mVar);
                            } else {
                                com.ss.android.downloadlib.i.vv.vv().m("pause_reserve_wifi_cancel", mVar);
                            }
                            qvVar.vv(mVar);
                        }

                        @Override // com.ss.android.downloadlib.addownload.vv.i
                        public void vv() {
                            r.vv((com.ss.android.downloadlib.addownload.vv.i) null);
                            DownloadInfo downloadInfo2 = Downloader.getInstance(b.getContext()).getDownloadInfo(id);
                            if (downloadInfo2 != null) {
                                downloadInfo2.startPauseReserveOnWifi();
                                g.vv().vv(downloadInfo2);
                                if (z4) {
                                    com.ss.android.downloadlib.i.vv.vv().vv("cancel_pause_reserve_wifi_confirm", mVar);
                                } else {
                                    com.ss.android.downloadlib.i.vv.vv().m("pause_reserve_wifi_confirm", mVar);
                                }
                            }
                            qvVar.vv(mVar);
                        }
                    });
                    if (z4 && pVar != null) {
                        vv(new com.ss.android.downloadlib.addownload.vv.p() { // from class: com.ss.android.downloadlib.addownload.r.2
                            @Override // com.ss.android.downloadlib.addownload.vv.p
                            public void delete() {
                                com.ss.android.downloadlib.i.vv.vv().vv("cancel_pause_reserve_wifi_delete", com.ss.android.downloadad.api.vv.m.this);
                                pVar.delete();
                            }
                        });
                    }
                    if (z4) {
                        TTDelegateActivity.vv(mVar, "删除");
                    } else {
                        TTDelegateActivity.m(mVar);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
    }
}

package com.ss.android.downloadlib.m;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.DeepLink;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.n.jh;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class vv {
    public static void m(com.ss.android.downloadad.api.vv.m mVar) {
        if (mVar == null) {
            return;
        }
        String u4 = com.ss.android.socialbase.downloader.n.vv.p().m("app_link_opt") == 1 ? mVar.u() : null;
        JSONObject vv = com.ss.android.downloadlib.n.u.vv(new JSONObject(), mVar);
        jh.vv(vv, "applink_source", "dialog_click_by_sdk");
        com.ss.android.downloadlib.i.vv.vv().m("applink_click", vv, mVar);
        com.ss.android.downloadlib.addownload.m.n vv2 = com.ss.android.downloadlib.n.wv.vv(u4, mVar);
        if (vv2.getType() == 2) {
            if (!TextUtils.isEmpty(u4)) {
                m("dialog_by_url", vv2, vv, mVar);
            }
            vv2 = com.ss.android.downloadlib.n.wv.vv(b.getContext(), mVar.o(), mVar);
        }
        int type = vv2.getType();
        if (type == 1) {
            m("dialog_by_url", vv, mVar);
        } else if (type == 3) {
            vv("dialog_by_package", vv, mVar);
        } else if (type != 4) {
            com.ss.android.downloadlib.o.p.vv().m("AppLinkClickDialog default");
        } else {
            vv("dialog_by_package", vv2, vv, mVar);
        }
    }

    public static boolean vv(@NonNull com.ss.android.downloadlib.addownload.m.o oVar) {
        boolean z4;
        DeepLink deepLink = oVar.f60510m.getDeepLink();
        String openUrl = deepLink == null ? null : deepLink.getOpenUrl();
        JSONObject vv = com.ss.android.downloadlib.n.u.vv(new JSONObject(), oVar);
        jh.vv(vv, "applink_source", "click_by_sdk");
        com.ss.android.downloadlib.i.vv.vv().m("applink_click", vv, oVar);
        com.ss.android.downloadlib.addownload.m.n vv2 = com.ss.android.downloadlib.n.wv.vv(openUrl, oVar);
        if (vv2.getType() == 2) {
            if (!TextUtils.isEmpty(openUrl)) {
                m("by_url", vv2, vv, oVar);
            }
            vv2 = com.ss.android.downloadlib.n.wv.vv(b.getContext(), oVar.f60510m.getPackageName(), oVar);
        }
        boolean z5 = false;
        if (vv(oVar.vv) && b.wv().optInt("link_ad_click_event") == 1) {
            DownloadModel downloadModel = oVar.f60510m;
            if (downloadModel instanceof AdDownloadModel) {
                ((AdDownloadModel) downloadModel).setFunnelType(4);
            }
            com.ss.android.downloadlib.i.vv.vv().vv(oVar.vv, 0);
            z4 = true;
        } else {
            z4 = false;
        }
        int type = vv2.getType();
        if (type == 1) {
            m("by_url", vv, oVar);
        } else if (type == 3) {
            vv("by_package", vv, oVar);
        } else {
            if (type != 4) {
                com.ss.android.downloadlib.o.p.vv().m("AppLinkClick default");
            } else {
                vv("by_package", vv2, vv, oVar);
            }
            if (z5 && !z4 && ((com.ss.android.downloadlib.i.p.vv().m() && !com.ss.android.downloadlib.i.p.vv().m(oVar.vv, oVar.f60510m.getLogExtra())) || com.ss.android.downloadlib.i.p.vv().p())) {
                com.ss.android.downloadlib.i.vv.vv().vv(oVar.vv, 2);
            }
            return z5;
        }
        z5 = true;
        if (z5) {
            com.ss.android.downloadlib.i.vv.vv().vv(oVar.vv, 2);
        }
        return z5;
    }

    public static void m(String str, @NonNull final JSONObject jSONObject, @NonNull final com.ss.android.downloadad.api.vv.vv vvVar) {
        jh.vv(jSONObject, "applink_source", str);
        jh.vv(jSONObject, "download_scene", Integer.valueOf(vvVar.x()));
        com.ss.android.downloadlib.i.vv.vv().m("deeplink_url_open", jSONObject, vvVar);
        str.hashCode();
        char c5 = 65535;
        switch (str.hashCode()) {
            case -1721882089:
                if (str.equals("auto_by_url")) {
                    c5 = 0;
                    break;
                }
                break;
            case -1374618233:
                if (str.equals("by_url")) {
                    c5 = 1;
                    break;
                }
                break;
            case -129544387:
                if (str.equals("notify_by_url")) {
                    c5 = 2;
                    break;
                }
                break;
            case 829750366:
                if (str.equals("dialog_by_url")) {
                    c5 = 3;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
            case 1:
            case 2:
            case 3:
                if ((b.wv().optInt("check_applink_mode") & 1) != 0) {
                    jh.vv(jSONObject, "check_applink_result_by_sdk", (Object) 1);
                    o.vv().vv(new i() { // from class: com.ss.android.downloadlib.m.vv.2
                        @Override // com.ss.android.downloadlib.m.i
                        public void vv(boolean z4) {
                            com.ss.android.downloadlib.i.vv.vv().m(z4 ? "deeplink_success" : "deeplink_failed", jSONObject, vvVar);
                            if (z4) {
                                b.y();
                                b.getContext();
                                vvVar.y();
                                vvVar.ya();
                                vvVar.v();
                                vvVar.o();
                            }
                        }
                    });
                    return;
                }
                b.m();
                b.getContext();
                vvVar.y();
                vvVar.ya();
                vvVar.v();
                vvVar.o();
                return;
            default:
                return;
        }
    }

    public static void vv(@NonNull com.ss.android.downloadad.api.vv.m mVar) {
        String u4 = mVar.u();
        JSONObject vv = com.ss.android.downloadlib.n.u.vv(new JSONObject(), mVar);
        jh.vv(vv, "applink_source", "notify_click_by_sdk");
        com.ss.android.downloadlib.i.vv.vv().m("applink_click", vv, mVar);
        com.ss.android.downloadlib.addownload.m.n vv2 = com.ss.android.downloadlib.n.wv.vv(u4, mVar);
        if (vv2.getType() == 2) {
            if (!TextUtils.isEmpty(u4)) {
                m("notify_by_url", vv2, vv, mVar);
            }
            vv2 = com.ss.android.downloadlib.n.wv.vv(b.getContext(), mVar.o(), mVar);
        }
        int type = vv2.getType();
        if (type == 1) {
            m("notify_by_url", vv, mVar);
        } else if (type == 3) {
            vv("notify_by_package", vv, mVar);
        } else if (type != 4) {
            com.ss.android.downloadlib.o.p.vv().m("AppLinkClickNotification default");
        } else {
            vv("notify_by_package", vv2, vv, mVar);
        }
    }

    public static void m(String str, @NonNull com.ss.android.downloadlib.addownload.m.n nVar, @NonNull JSONObject jSONObject, @NonNull com.ss.android.downloadad.api.vv.vv vvVar) {
        jh.vv(jSONObject, "applink_source", str);
        jh.vv(jSONObject, "error_code", Integer.valueOf(nVar.vv()));
        jh.vv(jSONObject, "download_scene", Integer.valueOf(vvVar.x()));
        com.ss.android.downloadlib.i.vv.vv().m("deeplink_url_open_fail", jSONObject, vvVar);
    }

    public static boolean vv(String str, @NonNull com.ss.android.downloadad.api.vv.m mVar) {
        if (com.ss.android.downloadlib.addownload.wv.m(mVar.ky())) {
            if (TextUtils.isEmpty(mVar.u()) && TextUtils.isEmpty(str)) {
                return false;
            }
            com.ss.android.socialbase.downloader.notification.m.vv().u(mVar.la());
            JSONObject jSONObject = new JSONObject();
            com.ss.android.downloadlib.n.u.vv(jSONObject, mVar);
            jh.vv(jSONObject, "applink_source", "auto_click");
            com.ss.android.downloadlib.i.vv.vv().m("applink_click", mVar);
            com.ss.android.downloadlib.addownload.m.n vv = com.ss.android.downloadlib.n.wv.vv(mVar, mVar.u(), mVar.o());
            int type = vv.getType();
            if (type == 1) {
                m("auto_by_url", jSONObject, mVar);
                return true;
            } else if (type == 2) {
                m("auto_by_url", vv, jSONObject, mVar);
                return false;
            } else if (type == 3) {
                vv("auto_by_package", jSONObject, mVar);
                return true;
            } else if (type != 4) {
                return false;
            } else {
                vv("auto_by_package", vv, jSONObject, mVar);
                return false;
            }
        }
        return false;
    }

    public static void vv(String str, @NonNull final JSONObject jSONObject, @NonNull final com.ss.android.downloadad.api.vv.vv vvVar) {
        jh.vv(jSONObject, "applink_source", str);
        jh.vv(jSONObject, "download_scene", Integer.valueOf(vvVar.x()));
        com.ss.android.downloadlib.i.vv.vv().m("deeplink_app_open", jSONObject, vvVar);
        str.hashCode();
        char c5 = 65535;
        switch (str.hashCode()) {
            case -1282070764:
                if (str.equals("notify_by_package")) {
                    c5 = 0;
                    break;
                }
                break;
            case -441514770:
                if (str.equals("auto_by_package")) {
                    c5 = 1;
                    break;
                }
                break;
            case -185950114:
                if (str.equals("by_package")) {
                    c5 = 2;
                    break;
                }
                break;
            case 368401333:
                if (str.equals("dialog_by_package")) {
                    c5 = 3;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
            case 1:
            case 2:
            case 3:
                if ((b.wv().optInt("check_applink_mode") & 1) != 0) {
                    jh.vv(jSONObject, "check_applink_result_by_sdk", (Object) 1);
                    o.vv().vv(new i() { // from class: com.ss.android.downloadlib.m.vv.1
                        @Override // com.ss.android.downloadlib.m.i
                        public void vv(boolean z4) {
                            com.ss.android.downloadlib.i.vv.vv().m(z4 ? "deeplink_success" : "deeplink_failed", jSONObject, vvVar);
                            if (z4) {
                                b.y();
                                b.getContext();
                                vvVar.y();
                                vvVar.ya();
                                vvVar.v();
                                vvVar.o();
                            }
                        }
                    });
                    return;
                }
                b.m();
                b.getContext();
                vvVar.y();
                vvVar.ya();
                vvVar.v();
                vvVar.o();
                return;
            default:
                return;
        }
    }

    public static void vv(String str, @NonNull com.ss.android.downloadlib.addownload.m.n nVar, @NonNull JSONObject jSONObject, @NonNull com.ss.android.downloadad.api.vv.vv vvVar) {
        jh.vv(jSONObject, "applink_source", str);
        jh.vv(jSONObject, "error_code", Integer.valueOf(nVar.vv()));
        jh.vv(jSONObject, "download_scene", Integer.valueOf(vvVar.x()));
        com.ss.android.downloadlib.i.vv.vv().m("deeplink_app_open_fail", jSONObject, vvVar);
    }

    public static boolean vv(@NonNull com.ss.android.downloadlib.addownload.m.o oVar, int i4) {
        JSONObject jSONObject = new JSONObject();
        jh.vv(jSONObject, "download_scene", Integer.valueOf(oVar.x()));
        com.ss.android.downloadlib.i.vv.vv().m("market_click_open", jSONObject, oVar);
        com.ss.android.downloadlib.addownload.m.n vv = com.ss.android.downloadlib.n.wv.vv(b.getContext(), oVar, oVar.f60510m.getPackageName());
        String vv2 = jh.vv(vv.m(), "open_market");
        int type = vv.getType();
        if (type == 5) {
            vv(vv2, jSONObject, oVar, true);
        } else if (type == 6) {
            jh.vv(jSONObject, "error_code", Integer.valueOf(vv.vv()));
            jh.vv(jSONObject, "download_scene", Integer.valueOf(oVar.x()));
            com.ss.android.downloadlib.i.vv.vv().m("market_open_failed", jSONObject, oVar);
            return false;
        } else if (type != 7) {
            return false;
        }
        com.ss.android.downloadlib.i.vv.vv().vv(oVar.vv, i4);
        return true;
    }

    public static void vv(final String str, @Nullable final JSONObject jSONObject, final com.ss.android.downloadlib.addownload.m.o oVar, boolean z4) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e5) {
                com.ss.android.downloadlib.o.p.vv().vv(e5, "onMarketSuccess");
                return;
            }
        }
        jh.vv(jSONObject, "applink_source", str);
        jh.vv(jSONObject, "download_scene", Integer.valueOf(oVar.x()));
        if (z4) {
            com.ss.android.downloadlib.i.vv.vv().m("market_open_success", jSONObject, oVar);
        }
        if ((b.wv().optInt("check_applink_mode") & 4) != 0) {
            o.vv().m(new i() { // from class: com.ss.android.downloadlib.m.vv.3
                @Override // com.ss.android.downloadlib.m.i
                public void vv(boolean z5) {
                    if (!z5 && !"open_market".equals(str)) {
                        Context context = b.getContext();
                        vv.vv(com.ss.android.downloadlib.n.wv.vv(context, Uri.parse("market://details?id=" + oVar.o())), oVar, false);
                    }
                    com.ss.android.downloadlib.i.vv.vv().vv(z5 ? "market_delay_success" : "market_delay_failed", jSONObject, oVar);
                    if (z5) {
                        b.y();
                        b.getContext();
                        oVar.f60510m.getPackageName();
                    }
                }
            });
        } else {
            b.m();
            b.getContext();
            oVar.f60510m.getPackageName();
        }
        com.ss.android.downloadad.api.vv.m mVar = new com.ss.android.downloadad.api.vv.m(oVar.f60510m, oVar.f60512p, oVar.f60509i);
        mVar.o(2);
        mVar.u(System.currentTimeMillis());
        mVar.qv(4);
        mVar.wv(2);
        com.ss.android.downloadlib.addownload.m.u.vv().vv(mVar);
    }

    public static void vv(com.ss.android.downloadlib.addownload.m.n nVar, com.ss.android.downloadlib.addownload.m.o oVar, boolean z4) {
        String vv = jh.vv(nVar.m(), "open_market");
        JSONObject jSONObject = new JSONObject();
        jh.vv(jSONObject, "ttdownloader_type", "backup");
        int type = nVar.getType();
        if (type == 5) {
            vv(vv, jSONObject, oVar, z4);
        } else if (type != 6) {
        } else {
            jh.vv(jSONObject, "error_code", Integer.valueOf(nVar.vv()));
            jh.vv(jSONObject, "download_scene", Integer.valueOf(oVar.x()));
            com.ss.android.downloadlib.i.vv.vv().m("market_open_failed", jSONObject, oVar);
        }
    }

    public static boolean vv(long j4) {
        return com.ss.android.downloadlib.addownload.m.u.vv().i(j4) == null;
    }
}

package com.ss.android.downloadlib.addownload;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class wv {
    public static boolean m(int i4) {
        return i4 == 2 || i4 == 1;
    }

    public static boolean m(DownloadModel downloadModel) {
        return downloadModel != null && downloadModel.getModelType() == 2;
    }

    public static boolean vv(int i4) {
        return i4 == 0 || i4 == 1;
    }

    public static boolean vv(DownloadModel downloadModel) {
        return downloadModel.isAd() && (downloadModel instanceof AdDownloadModel) && downloadModel.getModelType() == 1;
    }

    public static boolean vv(DownloadModel downloadModel, IDownloadButtonClickListener iDownloadButtonClickListener) {
        return downloadModel.isAd() && iDownloadButtonClickListener != null;
    }

    public static int vv(@NonNull com.ss.android.downloadlib.addownload.m.o oVar, boolean z4, com.ss.android.socialbase.appdownloader.u uVar) {
        int i4;
        if (uVar == null || TextUtils.isEmpty(uVar.vv()) || uVar.getContext() == null) {
            return 0;
        }
        try {
            i4 = vv(uVar, uVar.vv());
        } catch (Throwable th) {
            b.x().vv(th, "redirectSavePathIfPossible");
            i4 = 4;
        }
        uVar.vv(i4);
        if (i4 == 0) {
            uVar.vv(new com.ss.android.downloadlib.p.vv());
        }
        if (!uVar.ah()) {
            uVar.vv(new com.ss.android.downloadlib.p.m());
        }
        int vv = com.ss.android.socialbase.appdownloader.i.k().vv(uVar);
        com.ss.android.downloadad.api.vv.m vv2 = vv(oVar, vv);
        com.ss.android.downloadlib.addownload.m.u.vv().vv(vv2);
        vv2.n(vv);
        vv2.qv(System.currentTimeMillis());
        vv2.wv(0L);
        com.ss.android.socialbase.downloader.n.vv vv3 = com.ss.android.socialbase.downloader.n.vv.vv(uVar.pl());
        if (!vv(uVar, vv3, vv) && oVar.f60510m.isShowToast()) {
            String startToast = oVar.f60510m.getStartToast();
            if (TextUtils.isEmpty(startToast)) {
                startToast = vv3.p("download_start_toast_text");
            }
            if (TextUtils.isEmpty(startToast)) {
                startToast = z4 ? "已开始下载，可在\"我的\"里查看管理" : "已开始下载";
            }
            b.p().vv(2, uVar.getContext(), oVar.f60510m, startToast, null, 0);
        }
        return vv;
    }

    private static com.ss.android.downloadad.api.vv.m vv(com.ss.android.downloadlib.addownload.m.o oVar, int i4) {
        com.ss.android.downloadad.api.vv.m mVar = new com.ss.android.downloadad.api.vv.m(oVar.f60510m, oVar.f60512p, oVar.f60509i, i4);
        boolean z4 = true;
        if (com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("download_event_opt", 1) > 1) {
            try {
                String packageName = oVar.f60510m.getPackageName();
                if (!TextUtils.isEmpty(packageName)) {
                    if (b.getContext().getPackageManager().getPackageInfo(packageName, 0) == null) {
                        z4 = false;
                    }
                    mVar.qv(z4);
                }
            } catch (Throwable unused) {
            }
        }
        return mVar;
    }

    private static boolean vv(com.ss.android.socialbase.appdownloader.u uVar, @NonNull com.ss.android.socialbase.downloader.n.vv vvVar, int i4) {
        String optString;
        JSONArray o4 = vvVar.o("ah_plans");
        if (o4 != null && o4.length() != 0) {
            int length = o4.length();
            JSONObject jSONObject = null;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    JSONObject optJSONObject = o4.optJSONObject(i5);
                    if (optJSONObject != null && ((optString = optJSONObject.optString("type")) == "plan_c" || com.ss.android.socialbase.appdownloader.u.vv.vv(optJSONObject))) {
                        optString.hashCode();
                        char c5 = 65535;
                        switch (optString.hashCode()) {
                            case -985763637:
                                if (optString.equals("plan_a")) {
                                    c5 = 0;
                                    break;
                                }
                                break;
                            case -985763636:
                                if (optString.equals("plan_b")) {
                                    c5 = 1;
                                    break;
                                }
                                break;
                            case -985763635:
                                if (optString.equals("plan_c")) {
                                    c5 = 2;
                                    break;
                                }
                                break;
                            case -985763634:
                                if (optString.equals("plan_d")) {
                                    c5 = 3;
                                    break;
                                }
                                break;
                            case -985763633:
                                if (optString.equals("plan_e")) {
                                    c5 = 4;
                                    break;
                                }
                                break;
                            case -985763632:
                                if (optString.equals("plan_f")) {
                                    c5 = 5;
                                    break;
                                }
                                break;
                            case -985763631:
                                if (optString.equals("plan_g")) {
                                    c5 = 6;
                                    break;
                                }
                                break;
                            case -985763630:
                                if (optString.equals("plan_h")) {
                                    c5 = 7;
                                    break;
                                }
                                break;
                        }
                        switch (c5) {
                            case 0:
                            case 1:
                            case 4:
                            case 5:
                                if (com.ss.android.socialbase.appdownloader.m.vv(optJSONObject, vvVar).f60926m == 0) {
                                    break;
                                } else {
                                    continue;
                                }
                            case 2:
                                jSONObject = optJSONObject;
                                continue;
                            case 6:
                                if (com.ss.android.socialbase.appdownloader.m.m(optJSONObject, vvVar).f60926m == 0) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                    i5++;
                }
            }
            if (jSONObject != null) {
                if (jSONObject.optInt("show_unknown_source_on_startup") == 1) {
                    return com.ss.android.socialbase.appdownloader.m.vv(com.ss.android.socialbase.downloader.downloader.p.ky(), (Intent) null, jSONObject, i4, new com.ss.android.socialbase.appdownloader.vv());
                }
            }
        }
        return false;
    }

    public static String vv(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return null;
        }
        try {
            String extra = downloadInfo.getExtra();
            if (!TextUtils.isEmpty(extra)) {
                return new JSONObject(extra).optString("notification_jump_url", null);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return null;
    }

    private static int vv(com.ss.android.socialbase.appdownloader.u uVar, String str) {
        com.ss.android.socialbase.downloader.n.vv vv = com.ss.android.socialbase.downloader.n.vv.vv(uVar.pl());
        JSONObject i4 = vv.i("download_dir");
        if (i4 == null || TextUtils.isEmpty(i4.optString("dir_name"))) {
            return -1;
        }
        String m4 = uVar.m();
        String tf = uVar.tf();
        if (TextUtils.isEmpty(tf)) {
            tf = com.ss.android.socialbase.appdownloader.p.vv(str, m4, uVar.jh(), true);
        }
        if (tf.length() > 255) {
            tf = tf.substring(tf.length() - 255);
        }
        if (TextUtils.isEmpty(m4)) {
            m4 = tf;
        }
        String p4 = uVar.p();
        if (TextUtils.isEmpty(p4)) {
            p4 = com.ss.android.socialbase.appdownloader.p.m();
        }
        String str2 = p4 + File.separator + com.ss.android.socialbase.appdownloader.p.vv(m4, vv);
        DownloadInfo vv2 = com.ss.android.socialbase.appdownloader.i.k().vv(uVar.getContext(), str);
        if (vv2 != null && vv2.isSavePathRedirected()) {
            uVar.p(vv2.getSavePath());
            try {
                uVar.vv(new JSONObject(vv2.getDownloadSettingString()));
                return 0;
            } catch (Throwable unused) {
                return 0;
            }
        } else if (vv2 != null || !"application/vnd.android.package-archive".equalsIgnoreCase(com.ss.android.socialbase.appdownloader.i.k().vv(tf, uVar.jh()))) {
            return vv2 != null ? 8 : 9;
        } else {
            int vv3 = com.ss.android.socialbase.appdownloader.m.vv(vv);
            if (vv3 == 0) {
                uVar.p(str2);
                return vv3;
            }
            return vv3;
        }
    }
}

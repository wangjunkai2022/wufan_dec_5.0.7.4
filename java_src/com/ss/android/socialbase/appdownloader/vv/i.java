package com.ss.android.socialbase.appdownloader.vv;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class i {
    public static vv vv(Context context, String str, JSONObject jSONObject, DownloadInfo downloadInfo) {
        if (downloadInfo == null || context == null || jSONObject == null) {
            return null;
        }
        String savePath = downloadInfo.getSavePath();
        if (TextUtils.isEmpty(savePath) || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(savePath);
        com.ss.android.socialbase.downloader.n.vv vv = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo);
        if (str.equals("v1")) {
            return new k(context, vv, downloadInfo.getTargetFilePath());
        }
        if (str.equals("v2")) {
            return new b(context, vv, file.getAbsolutePath());
        }
        if (str.equals("v3")) {
            return new jh(context, vv, file.getAbsolutePath());
        }
        if (str.equals("o1")) {
            return new n(context, vv, file.getAbsolutePath());
        }
        if (str.equals("o2")) {
            return new qv(context, vv, file.getAbsolutePath());
        }
        if (str.equals("o3")) {
            String dBJsonString = downloadInfo.getDBJsonString("file_content_uri");
            if (TextUtils.isEmpty(dBJsonString)) {
                return null;
            }
            return new wv(context, vv, file.getAbsolutePath(), dBJsonString, downloadInfo.getName());
        } else if (str.equals("custom")) {
            return new p(context, vv, file.getAbsolutePath(), jSONObject);
        } else {
            if (str.equals("vbi")) {
                IDownloadFileUriProvider downloadFileUriProvider = Downloader.getInstance(context).getDownloadFileUriProvider(downloadInfo.getId());
                String i4 = com.ss.android.socialbase.appdownloader.i.k().i();
                return new r(context, vv, com.ss.android.socialbase.appdownloader.p.vv(downloadInfo.getId(), downloadFileUriProvider, context, i4, new File(downloadInfo.getSavePath() + File.separator + downloadInfo.getName())).toString());
            }
            return null;
        }
    }

    public static boolean vv(Context context, String str, JSONObject jSONObject, com.ss.android.socialbase.downloader.n.vv vvVar) {
        if (context != null && str != null) {
            vv vvVar2 = null;
            String m4 = com.ss.android.socialbase.appdownloader.p.m();
            if (!TextUtils.isEmpty(m4) && !TextUtils.isEmpty(str)) {
                if (com.ss.android.socialbase.appdownloader.u.o.i() && str.equals("v1")) {
                    vvVar2 = new k(context, vvVar, m4);
                } else if (com.ss.android.socialbase.appdownloader.u.o.i() && str.equals("v2")) {
                    vvVar2 = new b(context, vvVar, m4);
                } else if (com.ss.android.socialbase.appdownloader.u.o.i() && str.equals("v3")) {
                    vvVar2 = new jh(context, vvVar, m4);
                } else if (com.ss.android.socialbase.appdownloader.u.o.o() && str.equals("o1")) {
                    vvVar2 = new n(context, vvVar, m4);
                } else if (com.ss.android.socialbase.appdownloader.u.o.o() && str.equals("o2")) {
                    vvVar2 = new qv(context, vvVar, m4);
                } else if (com.ss.android.socialbase.appdownloader.u.o.o() && str.equals("o3")) {
                    vvVar2 = new wv(context, vvVar, m4, m4, m4);
                } else if (com.ss.android.socialbase.appdownloader.u.o.i() && str.equals("custom")) {
                    vvVar2 = new p(context, vvVar, m4, jSONObject);
                } else if (com.ss.android.socialbase.appdownloader.u.o.i() && str.equals("vbi")) {
                    vvVar2 = new r(context, vvVar, m4);
                }
                if (vvVar2 != null && vvVar2.vv()) {
                    return true;
                }
            }
        }
        return false;
    }
}

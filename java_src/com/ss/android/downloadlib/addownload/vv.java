package com.ss.android.downloadlib.addownload;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.ss.android.downloadlib.n.r;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class vv implements r.vv {

    /* renamed from: m  reason: collision with root package name */
    private static vv f60582m = null;
    private static final String vv = "vv";

    /* renamed from: i  reason: collision with root package name */
    private long f60583i;

    /* renamed from: p  reason: collision with root package name */
    private com.ss.android.downloadlib.n.r f60584p = new com.ss.android.downloadlib.n.r(Looper.getMainLooper(), this);

    private vv() {
    }

    public static vv vv() {
        if (f60582m == null) {
            synchronized (vv.class) {
                if (f60582m == null) {
                    f60582m = new vv();
                }
            }
        }
        return f60582m;
    }

    public void vv(@NonNull DownloadInfo downloadInfo, long j4, long j5, String str, String str2, String str3, String str4) {
        com.ss.android.downloadlib.addownload.m.vv vvVar = new com.ss.android.downloadlib.addownload.m.vv(downloadInfo.getId(), j4, j5, str, str2, str3, str4);
        com.ss.android.socialbase.downloader.n.vv vv2 = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId());
        if (vv2.vv("back_miui_silent_install", 1) == 0 && ((com.ss.android.socialbase.appdownloader.u.o.r() || com.ss.android.socialbase.appdownloader.u.o.t()) && com.ss.android.socialbase.downloader.wv.k.vv(b.getContext(), "com.miui.securitycore", "com.miui.enterprise.service.EntInstallService"))) {
            if (com.ss.android.socialbase.downloader.wv.u.vv(downloadInfo.getTempCacheData().get("extra_silent_install_succeed"), false)) {
                Message obtainMessage = this.f60584p.obtainMessage(200, vvVar);
                obtainMessage.arg1 = 2;
                this.f60584p.sendMessageDelayed(obtainMessage, vv2.vv("check_silent_install_interval", 60000));
                return;
            }
            com.ss.android.downloadad.api.vv.m i4 = com.ss.android.downloadlib.addownload.m.u.vv().i(vvVar.f60524m);
            JSONObject jSONObject = new JSONObject();
            int i5 = -1;
            try {
                jSONObject.put("ttdownloader_type", "miui_silent_install");
                jSONObject.put("ttdownloader_message", "miui_silent_install_failed: has not started service");
                i5 = 5;
            } catch (Exception unused) {
            }
            b.u().vv(null, new BaseException(i5, jSONObject.toString()), i5);
            com.ss.android.downloadlib.i.vv.vv().vv("embeded_ad", "ah_result", jSONObject, i4);
        }
        if (com.ss.android.downloadlib.n.o.p()) {
            long currentTimeMillis = System.currentTimeMillis() - this.f60583i;
            long i6 = com.ss.android.downloadlib.n.o.i();
            if (currentTimeMillis < com.ss.android.downloadlib.n.o.o()) {
                long o4 = com.ss.android.downloadlib.n.o.o() - currentTimeMillis;
                i6 += o4;
                this.f60583i = System.currentTimeMillis() + o4;
            } else {
                this.f60583i = System.currentTimeMillis();
            }
            com.ss.android.downloadlib.n.r rVar = this.f60584p;
            rVar.sendMessageDelayed(rVar.obtainMessage(200, vvVar), i6);
        }
    }

    private void vv(com.ss.android.downloadlib.addownload.m.vv vvVar, int i4) {
        if (b.jh() == null || b.jh().vv() || vvVar == null) {
            return;
        }
        if (2 == i4) {
            com.ss.android.downloadad.api.vv.m i5 = com.ss.android.downloadlib.addownload.m.u.vv().i(vvVar.f60524m);
            JSONObject jSONObject = new JSONObject();
            int i6 = -1;
            try {
                jSONObject.put("ttdownloader_type", "miui_silent_install");
                if (com.ss.android.downloadlib.n.jh.o(b.getContext(), vvVar.f60523i)) {
                    jSONObject.put("ttdownloader_message", "miui_silent_install_succeed");
                    i6 = 4;
                } else {
                    jSONObject.put("ttdownloader_message", "miui_silent_install_failed: has started service");
                    i6 = 5;
                }
            } catch (Exception unused) {
            }
            b.u().vv(null, new BaseException(i6, jSONObject.toString()), i6);
            com.ss.android.downloadlib.i.vv.vv().vv("embeded_ad", "ah_result", jSONObject, i5);
        }
        if (com.ss.android.downloadlib.n.jh.o(b.getContext(), vvVar.f60523i)) {
            com.ss.android.downloadlib.i.vv.vv().vv("delayinstall_installed", vvVar.f60524m);
        } else if (!com.ss.android.downloadlib.n.jh.vv(vvVar.f60525n)) {
            com.ss.android.downloadlib.i.vv.vv().vv("delayinstall_file_lost", vvVar.f60524m);
        } else if (com.ss.android.downloadlib.addownload.vv.vv.vv().vv(vvVar.f60523i)) {
            com.ss.android.downloadlib.i.vv.vv().vv("delayinstall_conflict_with_back_dialog", vvVar.f60524m);
        } else {
            com.ss.android.downloadlib.i.vv.vv().vv("delayinstall_install_start", vvVar.f60524m);
            com.ss.android.socialbase.appdownloader.i.vv(b.getContext(), (int) vvVar.vv);
        }
    }

    @Override // com.ss.android.downloadlib.n.r.vv
    public void vv(Message message) {
        if (message.what != 200) {
            return;
        }
        vv((com.ss.android.downloadlib.addownload.m.vv) message.obj, message.arg1);
    }
}

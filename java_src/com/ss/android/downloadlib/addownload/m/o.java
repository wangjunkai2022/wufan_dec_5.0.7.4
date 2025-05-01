package com.ss.android.downloadlib.addownload.m;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadad.api.download.AdDownloadController;
import com.ss.android.downloadad.api.download.AdDownloadEventConfig;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class o implements com.ss.android.downloadad.api.vv.vv {

    /* renamed from: i  reason: collision with root package name */
    public DownloadController f60509i;

    /* renamed from: m  reason: collision with root package name */
    public DownloadModel f60510m;

    /* renamed from: o  reason: collision with root package name */
    public com.ss.android.downloadad.api.vv.m f60511o;

    /* renamed from: p  reason: collision with root package name */
    public DownloadEventConfig f60512p;
    public long vv;

    public o() {
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public JSONObject b() {
        return this.f60512p.getParamsJson();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public boolean d() {
        return this.f60509i.enableNewActivity();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public JSONObject g() {
        return this.f60510m.getDownloadSettings();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public String i() {
        return this.f60510m.getLogExtra();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public JSONObject j() {
        return this.f60512p.getExtraJson();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public long jh() {
        return this.f60510m.getExtraValue();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public String k() {
        return this.f60512p.getClickButtonTag();
    }

    public boolean l() {
        DownloadModel downloadModel;
        if (this.vv == 0 || (downloadModel = this.f60510m) == null || this.f60512p == null || this.f60509i == null) {
            return true;
        }
        return downloadModel.isAd() && this.vv <= 0;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public int la() {
        return 0;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public long m() {
        return this.f60510m.getId();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public JSONObject n() {
        return this.f60510m.getExtra();
    }

    public boolean ns() {
        if (l()) {
            return false;
        }
        if (this.f60510m.isAd()) {
            DownloadModel downloadModel = this.f60510m;
            return (downloadModel instanceof AdDownloadModel) && !TextUtils.isEmpty(downloadModel.getLogExtra()) && (this.f60512p instanceof AdDownloadEventConfig) && (this.f60509i instanceof AdDownloadController);
        }
        return this.f60510m instanceof AdDownloadModel;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public String o() {
        return this.f60510m.getPackageName();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public boolean p() {
        return this.f60510m.isAd();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public Object q() {
        return this.f60512p.getExtraEventObject();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public int qv() {
        if (this.f60509i.getDownloadMode() == 2) {
            return 2;
        }
        return this.f60510m.getFunnelType();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public boolean r() {
        return this.f60512p.isEnableV3Event();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public List<String> t() {
        return this.f60510m.getClickTrackUrl();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public String u() {
        if (this.f60510m.getDeepLink() != null) {
            return this.f60510m.getDeepLink().getOpenUrl();
        }
        return null;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public DownloadEventConfig v() {
        return this.f60512p;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public String vv() {
        return this.f60510m.getDownloadUrl();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public String wv() {
        return this.f60512p.getRefer();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public int x() {
        return this.f60512p.getDownloadScene();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public DownloadModel y() {
        return this.f60510m;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public DownloadController ya() {
        return this.f60509i;
    }

    public o(long j4, @NonNull DownloadModel downloadModel, @NonNull DownloadEventConfig downloadEventConfig, @NonNull DownloadController downloadController) {
        this.vv = j4;
        this.f60510m = downloadModel;
        this.f60512p = downloadEventConfig;
        this.f60509i = downloadController;
    }
}

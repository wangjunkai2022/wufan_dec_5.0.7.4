package com.ss.android.download.api.download;

import org.json.JSONObject;
@Deprecated
/* loaded from: classes5.dex */
public class p implements DownloadEventConfig {

    /* renamed from: b  reason: collision with root package name */
    private String f60275b;

    /* renamed from: d  reason: collision with root package name */
    private String f60276d;

    /* renamed from: i  reason: collision with root package name */
    private String f60277i;

    /* renamed from: j  reason: collision with root package name */
    private String f60278j;
    private Object jh;

    /* renamed from: k  reason: collision with root package name */
    private String f60279k;

    /* renamed from: m  reason: collision with root package name */
    private boolean f60280m;

    /* renamed from: n  reason: collision with root package name */
    private String f60281n;

    /* renamed from: o  reason: collision with root package name */
    private String f60282o;

    /* renamed from: p  reason: collision with root package name */
    private String f60283p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f60284q;
    private String qv;

    /* renamed from: r  reason: collision with root package name */
    private boolean f60285r;

    /* renamed from: t  reason: collision with root package name */
    private boolean f60286t;

    /* renamed from: u  reason: collision with root package name */
    private String f60287u;
    private String vv;
    private String wv;

    /* loaded from: classes5.dex */
    public static final class vv {

        /* renamed from: b  reason: collision with root package name */
        private String f60288b;

        /* renamed from: d  reason: collision with root package name */
        private String f60289d;

        /* renamed from: i  reason: collision with root package name */
        private String f60290i;

        /* renamed from: j  reason: collision with root package name */
        private String f60291j;
        private Object jh;

        /* renamed from: k  reason: collision with root package name */
        private String f60292k;

        /* renamed from: m  reason: collision with root package name */
        private boolean f60293m;

        /* renamed from: n  reason: collision with root package name */
        private String f60294n;

        /* renamed from: o  reason: collision with root package name */
        private String f60295o;

        /* renamed from: p  reason: collision with root package name */
        private String f60296p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f60297q;
        private String qv;

        /* renamed from: r  reason: collision with root package name */
        private boolean f60298r;

        /* renamed from: t  reason: collision with root package name */
        private boolean f60299t;

        /* renamed from: u  reason: collision with root package name */
        private String f60300u;
        private String vv;
        private String wv;

        public p vv() {
            return new p(this);
        }
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickButtonTag() {
        return this.vv;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickContinueLabel() {
        return this.f60287u;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickInstallLabel() {
        return this.f60281n;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickItemTag() {
        return null;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickLabel() {
        return this.f60283p;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickPauseLabel() {
        return this.f60282o;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getClickStartLabel() {
        return this.f60277i;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public int getDownloadScene() {
        return 0;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public Object getExtraEventObject() {
        return this.jh;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public JSONObject getExtraJson() {
        return null;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public JSONObject getParamsJson() {
        return null;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getRefer() {
        return this.f60276d;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public String getStorageDenyLabel() {
        return this.f60279k;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public boolean isEnableClickEvent() {
        return this.f60280m;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public boolean isEnableV3Event() {
        return this.f60285r;
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public void setDownloadScene(int i4) {
    }

    @Override // com.ss.android.download.api.download.DownloadEventConfig
    public void setRefer(String str) {
    }

    public p() {
    }

    private p(vv vvVar) {
        this.vv = vvVar.vv;
        this.f60280m = vvVar.f60293m;
        this.f60283p = vvVar.f60296p;
        this.f60277i = vvVar.f60290i;
        this.f60282o = vvVar.f60295o;
        this.f60287u = vvVar.f60300u;
        this.f60281n = vvVar.f60294n;
        this.qv = vvVar.qv;
        this.wv = vvVar.wv;
        this.f60279k = vvVar.f60292k;
        this.f60275b = vvVar.f60288b;
        this.jh = vvVar.jh;
        this.f60285r = vvVar.f60298r;
        this.f60286t = vvVar.f60299t;
        this.f60284q = vvVar.f60297q;
        this.f60278j = vvVar.f60291j;
        this.f60276d = vvVar.f60289d;
    }
}

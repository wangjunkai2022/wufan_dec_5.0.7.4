package com.ss.android.downloadad.api.vv;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.DeepLink;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.downloadad.api.download.AdDownloadController;
import com.ss.android.downloadad.api.download.AdDownloadEventConfig;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.b;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class m implements vv {

    /* renamed from: a  reason: collision with root package name */
    private int f60350a;
    private transient boolean ah;

    /* renamed from: b  reason: collision with root package name */
    private String f60351b;

    /* renamed from: c  reason: collision with root package name */
    private String f60352c;
    private long cl;
    private boolean cq;

    /* renamed from: d  reason: collision with root package name */
    private String f60353d;
    private String di;
    @AdBaseConstants.FunnelType
    private int ds;

    /* renamed from: e  reason: collision with root package name */
    private boolean f60354e;
    private long ev;

    /* renamed from: f  reason: collision with root package name */
    private boolean f60355f;
    private long ff;
    private boolean fn;
    private long fo;

    /* renamed from: g  reason: collision with root package name */
    private String f60356g;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f60357i;

    /* renamed from: j  reason: collision with root package name */
    private int f60358j;
    private String jb;
    private String jh;
    private boolean ju;

    /* renamed from: k  reason: collision with root package name */
    private String f60359k;
    private boolean ky;

    /* renamed from: l  reason: collision with root package name */
    private boolean f60360l;
    private String la;
    private boolean lb;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f60361m;

    /* renamed from: n  reason: collision with root package name */
    private String f60362n;
    private String nn;
    private int ns;

    /* renamed from: o  reason: collision with root package name */
    private long f60363o;
    private boolean ot;

    /* renamed from: p  reason: collision with root package name */
    public final AtomicBoolean f60364p;
    private long pd;
    private String pj;
    private boolean pl;

    /* renamed from: q  reason: collision with root package name */
    private int f60365q;
    private boolean qb;
    private boolean qd;
    private int qv;

    /* renamed from: r  reason: collision with root package name */
    private int f60366r;
    private boolean rm;

    /* renamed from: s  reason: collision with root package name */
    private int f60367s;
    private boolean sr;

    /* renamed from: t  reason: collision with root package name */
    private int f60368t;
    private long td;
    private String tf;
    private boolean to;

    /* renamed from: u  reason: collision with root package name */
    private long f60369u;
    private boolean uw;

    /* renamed from: v  reason: collision with root package name */
    private JSONObject f60370v;
    private int vu;
    protected boolean vv;

    /* renamed from: w  reason: collision with root package name */
    private int f60371w;
    private String wv;

    /* renamed from: x  reason: collision with root package name */
    private boolean f60372x;

    /* renamed from: y  reason: collision with root package name */
    private long f60373y;
    private int ya;
    private boolean yj;
    private boolean zn;

    private m() {
        this.qv = 1;
        this.f60372x = true;
        this.f60360l = false;
        this.ns = 0;
        this.vu = 0;
        this.zn = false;
        this.f60355f = false;
        this.ot = true;
        this.cq = true;
        this.vv = true;
        this.f60361m = true;
        this.f60364p = new AtomicBoolean(false);
        this.f60357i = new AtomicBoolean(false);
        this.ds = 1;
        this.f60354e = true;
        this.cl = -1L;
    }

    public int a() {
        return this.f60350a;
    }

    public boolean ah() {
        return this.rm;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public JSONObject b() {
        return null;
    }

    public void b(String str) {
        this.la = str;
    }

    public String c() {
        return this.f60352c;
    }

    public boolean cl() {
        return this.sr;
    }

    public int cq() {
        return this.f60367s;
    }

    public void d(boolean z4) {
        this.ju = z4;
    }

    public AdDownloadModel di() {
        return new AdDownloadModel.Builder().setAdId(this.f60363o).setExtraValue(this.f60369u).setLogExtra(this.f60362n).setPackageName(this.wv).setExtra(this.f60370v).setIsAd(this.f60372x).setVersionCode(this.f60358j).setVersionName(this.f60353d).setDownloadUrl(this.f60359k).setModelType(this.f60366r).setMimeType(this.pj).setAppName(this.f60356g).setAppIcon(this.la).setTaskKey(this.di).setDeepLink(new DeepLink(this.f60351b, this.jh, null)).build();
    }

    public AdDownloadController dj() {
        return new AdDownloadController.Builder().setIsEnableBackDialog(this.f60360l).setLinkMode(this.f60368t).setDownloadMode(this.f60365q).setEnableShowComplianceDialog(this.f60354e).setEnableAH(this.vv).setEnableAM(this.f60361m).build();
    }

    public boolean ds() {
        return this.to;
    }

    public long e() {
        return this.fo;
    }

    public boolean ev() {
        return this.yj;
    }

    public int f() {
        return this.f60358j;
    }

    public synchronized void ff() {
        this.vu++;
    }

    public String fn() {
        return this.di;
    }

    public boolean fo() {
        return this.ky;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public JSONObject g() {
        return null;
    }

    public void g(boolean z4) {
        this.ot = z4;
    }

    public void i(int i4) {
        this.f60350a = i4;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public JSONObject j() {
        return null;
    }

    public void j(boolean z4) {
        this.f60354e = z4;
    }

    public long jb() {
        return this.cl;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public long jh() {
        return this.f60369u;
    }

    public long ju() {
        return this.ev;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public String k() {
        return this.tf;
    }

    public int ky() {
        return this.f60368t;
    }

    public int l() {
        return this.ns;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public int la() {
        return this.ya;
    }

    public String lb() {
        return this.f60356g;
    }

    public void m(int i4) {
        this.vu = i4;
    }

    public AdDownloadEventConfig mm() {
        return new AdDownloadEventConfig.Builder().setClickButtonTag(this.tf).setRefer(this.jb).setIsEnableV3Event(this.lb).build();
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public JSONObject n() {
        return this.f60370v;
    }

    public boolean nn() {
        return this.zn;
    }

    public synchronized void ns() {
        this.ns++;
    }

    public void o(long j4) {
        this.f60369u = j4;
    }

    public String ot() {
        return this.f60353d;
    }

    public void p(long j4) {
        this.pd = j4;
    }

    public long pd() {
        return this.td;
    }

    public long pj() {
        return this.f60373y;
    }

    public boolean pl() {
        return this.uw;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public Object q() {
        return null;
    }

    public void q(boolean z4) {
        this.fn = z4;
    }

    public String qb() {
        return this.pj;
    }

    public boolean qd() {
        return this.pl;
    }

    public void qv(int i4) {
        this.f60367s = i4;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public boolean r() {
        return this.lb;
    }

    public boolean rm() {
        return this.fn;
    }

    public String s() {
        return this.nn;
    }

    public boolean sr() {
        return this.qd;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public List<String> t() {
        return null;
    }

    public void t(boolean z4) {
        this.pl = z4;
    }

    public long td() {
        long j4 = this.ff;
        return j4 == 0 ? this.f60373y : j4;
    }

    public boolean tf() {
        return this.f60360l;
    }

    public boolean to() {
        return this.f60355f;
    }

    public void u(long j4) {
        if (j4 > 0) {
            this.f60373y = j4;
        }
    }

    public JSONObject uw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mId", this.f60363o);
            jSONObject.put("mExtValue", this.f60369u);
            jSONObject.put("mLogExtra", this.f60362n);
            jSONObject.put("mDownloadStatus", this.qv);
            jSONObject.put("mPackageName", this.wv);
            jSONObject.put("mIsAd", this.f60372x);
            jSONObject.put("mTimeStamp", this.f60373y);
            jSONObject.put("mExtras", this.f60370v);
            jSONObject.put("mVersionCode", this.f60358j);
            jSONObject.put("mVersionName", this.f60353d);
            jSONObject.put("mDownloadId", this.ya);
            jSONObject.put("mIsV3Event", this.lb);
            jSONObject.put("mScene", this.f60367s);
            jSONObject.put("mEventTag", this.tf);
            jSONObject.put("mEventRefer", this.jb);
            jSONObject.put("mDownloadUrl", this.f60359k);
            jSONObject.put("mEnableBackDialog", this.f60360l);
            jSONObject.put("hasSendInstallFinish", this.f60364p.get());
            jSONObject.put("hasSendDownloadFailedFinally", this.f60357i.get());
            jSONObject.put("mLastFailedErrCode", this.f60350a);
            jSONObject.put("mLastFailedErrMsg", this.f60352c);
            jSONObject.put("mOpenUrl", this.f60351b);
            jSONObject.put("mLinkMode", this.f60368t);
            jSONObject.put("mDownloadMode", this.f60365q);
            jSONObject.put("mModelType", this.f60366r);
            jSONObject.put("mAppName", this.f60356g);
            jSONObject.put("mAppIcon", this.la);
            jSONObject.put("mDownloadFailedTimes", this.ns);
            long j4 = this.ff;
            if (j4 == 0) {
                j4 = this.f60373y;
            }
            jSONObject.put("mRecentDownloadResumeTime", j4);
            jSONObject.put("mClickPauseTimes", this.vu);
            jSONObject.put("mJumpInstallTime", this.td);
            jSONObject.put("mCancelInstallTime", this.pd);
            jSONObject.put("mLastFailedResumeCount", this.f60371w);
            jSONObject.put("mIsUpdateDownload", this.zn);
            jSONObject.put("mOriginMimeType", this.pj);
            jSONObject.put("mIsPatchApplyHandled", this.f60355f);
            jSONObject.put("downloadFinishReason", this.nn);
            jSONObject.put("clickDownloadTime", this.fo);
            jSONObject.put("clickDownloadSize", this.ev);
            jSONObject.put("installAfterCleanSpace", this.ky);
            jSONObject.put(TTDownloadField.TT_FUNNEL_TYPE, this.ds);
            jSONObject.put(TTDownloadField.TT_WEB_URL, this.jh);
            jSONObject.put(TTDownloadField.TT_ENABLE_SHOW_COMPLIANCE_DIALOG, this.f60354e);
            jSONObject.put(TTDownloadField.TT_IS_AUTO_DOWNLOAD_ON_CARD_SHOW, this.ju);
            int i4 = 1;
            jSONObject.put("enable_new_activity", this.ot ? 1 : 0);
            jSONObject.put("enable_pause", this.cq ? 1 : 0);
            jSONObject.put("enable_ah", this.vv ? 1 : 0);
            if (!this.f60361m) {
                i4 = 0;
            }
            jSONObject.put("enable_am", i4);
            jSONObject.putOpt("intent_jump_browser_success", Boolean.valueOf(this.uw));
            jSONObject.put("task_key", this.di);
        } catch (Exception e5) {
            b.x().vv(e5, "NativeDownloadModel toJson");
        }
        return jSONObject;
    }

    public void v(boolean z4) {
        this.uw = z4;
    }

    public int vu() {
        return this.vu;
    }

    public void vv(int i4) {
        this.ns = i4;
    }

    public int w() {
        return this.f60371w;
    }

    public void wv(int i4) {
        this.ds = i4;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public int x() {
        return -1;
    }

    public void x(boolean z4) {
        this.vv = z4;
    }

    public void y(boolean z4) {
        this.f60361m = z4;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public DownloadController ya() {
        return dj();
    }

    public boolean yj() {
        return this.ah;
    }

    public int zn() {
        return this.qv;
    }

    public void b(int i4) {
        this.f60365q = i4;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public boolean d() {
        return this.ot;
    }

    public void i(long j4) {
        this.f60363o = j4;
    }

    public void jh(int i4) {
        this.f60366r = i4;
    }

    public void k(String str) {
        this.f60356g = str;
    }

    public void la(boolean z4) {
        this.cq = z4;
    }

    public void m(long j4) {
        this.td = j4;
    }

    public void n(int i4) {
        this.ya = i4;
    }

    public void o(int i4) {
        this.qv = i4;
    }

    public void p(int i4) {
        this.f60371w = i4;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public int qv() {
        return this.ds;
    }

    public void r(String str) {
        this.pj = str;
    }

    public void t(String str) {
        this.di = str;
    }

    public void u(int i4) {
        this.f60358j = i4;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public DownloadEventConfig v() {
        return mm();
    }

    public void vv(long j4) {
        this.ff = j4;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public String wv() {
        return this.jb;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public DownloadModel y() {
        return di();
    }

    public void b(boolean z4) {
        this.sr = z4;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public String i() {
        return this.f60362n;
    }

    public void jh(String str) {
        this.nn = str;
    }

    public void k(int i4) {
        this.f60368t = i4;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public long m() {
        return this.f60363o;
    }

    public void n(String str) {
        this.jb = str;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public String o() {
        return this.wv;
    }

    public void p(String str) {
        this.f60362n = str;
    }

    public void qv(String str) {
        this.f60359k = str;
    }

    public void r(boolean z4) {
        this.qd = z4;
    }

    public void u(String str) {
        this.tf = str;
    }

    public void vv(String str) {
        this.f60352c = str;
    }

    public void wv(String str) {
        this.f60351b = str;
    }

    public void i(String str) {
        this.f60353d = str;
    }

    public void jh(boolean z4) {
        this.rm = z4;
    }

    public void k(boolean z4) {
        this.ah = z4;
    }

    public void m(String str) {
        this.wv = str;
    }

    public void n(long j4) {
        this.cl = j4;
    }

    public void o(String str) {
        this.jh = str;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public boolean p() {
        return this.f60372x;
    }

    public void qv(long j4) {
        this.fo = j4;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public String u() {
        return this.f60351b;
    }

    public void vv(boolean z4) {
        this.f60372x = z4;
    }

    public void wv(long j4) {
        this.ev = j4;
    }

    public void i(boolean z4) {
        this.qb = z4;
    }

    public void m(boolean z4) {
        this.lb = z4;
    }

    public void n(boolean z4) {
        this.yj = z4;
    }

    public void o(boolean z4) {
        this.to = z4;
    }

    public void p(boolean z4) {
        this.f60360l = z4;
    }

    public void qv(boolean z4) {
        this.zn = z4;
    }

    public void u(boolean z4) {
        this.ky = z4;
    }

    public void vv(JSONObject jSONObject) {
        this.f60370v = jSONObject;
    }

    public void wv(boolean z4) {
        this.f60355f = z4;
    }

    public static m m(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        m mVar = new m();
        try {
            mVar.i(com.ss.android.download.api.p.m.vv(jSONObject, "mId"));
            mVar.o(com.ss.android.download.api.p.m.vv(jSONObject, "mExtValue"));
            mVar.p(jSONObject.optString("mLogExtra"));
            mVar.o(jSONObject.optInt("mDownloadStatus"));
            mVar.m(jSONObject.optString("mPackageName"));
            boolean z4 = true;
            mVar.vv(jSONObject.optBoolean("mIsAd", true));
            mVar.u(com.ss.android.download.api.p.m.vv(jSONObject, "mTimeStamp"));
            mVar.u(jSONObject.optInt("mVersionCode"));
            mVar.i(jSONObject.optString("mVersionName"));
            mVar.n(jSONObject.optInt("mDownloadId"));
            mVar.m(jSONObject.optBoolean("mIsV3Event"));
            mVar.qv(jSONObject.optInt("mScene"));
            mVar.u(jSONObject.optString("mEventTag"));
            mVar.n(jSONObject.optString("mEventRefer"));
            mVar.qv(jSONObject.optString("mDownloadUrl"));
            mVar.p(jSONObject.optBoolean("mEnableBackDialog"));
            mVar.f60364p.set(jSONObject.optBoolean("hasSendInstallFinish"));
            mVar.f60357i.set(jSONObject.optBoolean("hasSendDownloadFailedFinally"));
            mVar.i(jSONObject.optInt("mLastFailedErrCode"));
            mVar.vv(jSONObject.optString("mLastFailedErrMsg"));
            mVar.wv(jSONObject.optString("mOpenUrl"));
            mVar.k(jSONObject.optInt("mLinkMode"));
            mVar.b(jSONObject.optInt("mDownloadMode"));
            mVar.jh(jSONObject.optInt("mModelType"));
            mVar.k(jSONObject.optString("mAppName"));
            mVar.b(jSONObject.optString("mAppIcon"));
            mVar.vv(jSONObject.optInt("mDownloadFailedTimes", 0));
            mVar.vv(com.ss.android.download.api.p.m.vv(jSONObject, "mRecentDownloadResumeTime"));
            mVar.m(jSONObject.optInt("mClickPauseTimes"));
            mVar.m(com.ss.android.download.api.p.m.vv(jSONObject, "mJumpInstallTime"));
            mVar.p(com.ss.android.download.api.p.m.vv(jSONObject, "mCancelInstallTime"));
            mVar.p(jSONObject.optInt("mLastFailedResumeCount"));
            mVar.jh(jSONObject.optString("downloadFinishReason"));
            mVar.wv(jSONObject.optLong("clickDownloadSize"));
            mVar.qv(jSONObject.optLong("clickDownloadTime"));
            mVar.qv(jSONObject.optBoolean("mIsUpdateDownload"));
            mVar.r(jSONObject.optString("mOriginMimeType"));
            mVar.wv(jSONObject.optBoolean("mIsPatchApplyHandled"));
            mVar.u(jSONObject.optBoolean("installAfterCleanSpace"));
            mVar.wv(jSONObject.optInt(TTDownloadField.TT_FUNNEL_TYPE, 1));
            mVar.o(jSONObject.optString(TTDownloadField.TT_WEB_URL));
            mVar.j(jSONObject.optBoolean(TTDownloadField.TT_ENABLE_SHOW_COMPLIANCE_DIALOG, true));
            mVar.d(jSONObject.optBoolean(TTDownloadField.TT_IS_AUTO_DOWNLOAD_ON_CARD_SHOW));
            mVar.g(jSONObject.optInt("enable_new_activity", 1) == 1);
            mVar.la(jSONObject.optInt("enable_pause", 1) == 1);
            mVar.x(jSONObject.optInt("enable_ah", 1) == 1);
            if (jSONObject.optInt("enable_am", 1) != 1) {
                z4 = false;
            }
            mVar.y(z4);
            mVar.vv(jSONObject.optJSONObject("mExtras"));
            mVar.v(jSONObject.optBoolean("intent_jump_browser_success"));
            mVar.t(jSONObject.optString("task_key"));
        } catch (Exception e5) {
            b.x().vv(e5, "NativeDownloadModel fromJson");
        }
        return mVar;
    }

    @Override // com.ss.android.downloadad.api.vv.vv
    public String vv() {
        return this.f60359k;
    }

    public m(DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        this(downloadModel, downloadEventConfig, downloadController, 0);
    }

    public m(DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, int i4) {
        this.qv = 1;
        this.f60372x = true;
        this.f60360l = false;
        this.ns = 0;
        this.vu = 0;
        this.zn = false;
        this.f60355f = false;
        this.ot = true;
        this.cq = true;
        this.vv = true;
        this.f60361m = true;
        this.f60364p = new AtomicBoolean(false);
        this.f60357i = new AtomicBoolean(false);
        this.ds = 1;
        this.f60354e = true;
        this.cl = -1L;
        this.f60363o = downloadModel.getId();
        this.f60369u = downloadModel.getExtraValue();
        this.f60362n = downloadModel.getLogExtra();
        this.wv = downloadModel.getPackageName();
        this.f60370v = downloadModel.getExtra();
        this.f60372x = downloadModel.isAd();
        this.f60358j = downloadModel.getVersionCode();
        this.f60353d = downloadModel.getVersionName();
        this.f60359k = downloadModel.getDownloadUrl();
        if (downloadModel.getDeepLink() != null) {
            this.f60351b = downloadModel.getDeepLink().getOpenUrl();
            this.jh = downloadModel.getDeepLink().getWebUrl();
        }
        this.f60366r = downloadModel.getModelType();
        this.f60356g = downloadModel.getName();
        this.la = downloadModel.getAppIcon();
        this.pj = downloadModel.getMimeType();
        this.tf = downloadEventConfig.getClickButtonTag();
        this.jb = downloadEventConfig.getRefer();
        this.lb = downloadEventConfig.isEnableV3Event();
        this.f60360l = downloadController.isEnableBackDialog();
        this.f60368t = downloadController.getLinkMode();
        this.f60365q = downloadController.getDownloadMode();
        this.f60354e = downloadController.enableShowComplianceDialog();
        this.ju = downloadController.isAutoDownloadOnCardShow();
        this.ot = downloadController.enableNewActivity();
        this.vv = downloadController.enableAH();
        this.f60361m = downloadController.enableAM();
        this.ya = i4;
        long currentTimeMillis = System.currentTimeMillis();
        this.f60373y = currentTimeMillis;
        this.ff = currentTimeMillis;
        this.f60355f = downloadModel.shouldDownloadWithPatchApply();
        if (downloadModel instanceof AdDownloadModel) {
            this.di = ((AdDownloadModel) downloadModel).getTaskKey();
        }
    }
}

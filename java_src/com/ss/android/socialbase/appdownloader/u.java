package com.ss.android.socialbase.appdownloader;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.a;
import com.ss.android.socialbase.downloader.depend.g;
import com.ss.android.socialbase.downloader.depend.l;
import com.ss.android.socialbase.downloader.depend.r;
import com.ss.android.socialbase.downloader.depend.t;
import com.ss.android.socialbase.downloader.downloader.la;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private String f60860a;
    private int ah;
    private long cl;

    /* renamed from: d  reason: collision with root package name */
    private boolean f60863d;
    private IDownloadFileUriProvider ds;

    /* renamed from: e  reason: collision with root package name */
    private a f60864e;
    private boolean ev;

    /* renamed from: f  reason: collision with root package name */
    private boolean f60865f;
    private boolean ff;
    private String fn;
    private g fo;

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.n f60866g;

    /* renamed from: i  reason: collision with root package name */
    private List<String> f60867i;
    private boolean ju;
    private t ky;

    /* renamed from: l  reason: collision with root package name */
    private String f60870l;
    private com.ss.android.socialbase.downloader.downloader.qv la;
    private l lb;

    /* renamed from: m  reason: collision with root package name */
    private Context f60871m;

    /* renamed from: n  reason: collision with root package name */
    private String f60872n;
    private JSONObject nn;
    private String ns;

    /* renamed from: o  reason: collision with root package name */
    private String f60873o;

    /* renamed from: p  reason: collision with root package name */
    private String f60874p;
    private int pd;
    private boolean pj;

    /* renamed from: q  reason: collision with root package name */
    private String f60875q;
    private String qb;
    private List<com.ss.android.socialbase.downloader.model.p> qv;

    /* renamed from: r  reason: collision with root package name */
    private IDownloadListener f60876r;
    private String rm;

    /* renamed from: s  reason: collision with root package name */
    private com.ss.android.socialbase.appdownloader.p.o f60877s;
    private boolean sr;

    /* renamed from: t  reason: collision with root package name */
    private IDownloadListener f60878t;
    private int tf;

    /* renamed from: u  reason: collision with root package name */
    private String f60879u;
    private int[] uw;

    /* renamed from: v  reason: collision with root package name */
    private boolean f60880v;
    private long vu;
    private Activity vv;

    /* renamed from: w  reason: collision with root package name */
    private boolean f60881w;

    /* renamed from: x  reason: collision with root package name */
    private la f60882x;

    /* renamed from: y  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.notification.vv f60883y;
    private boolean ya;
    private int yj;
    private boolean zn;
    private boolean wv = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f60869k = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f60861b = true;
    private boolean jh = false;

    /* renamed from: j  reason: collision with root package name */
    private String f60868j = "application/vnd.android.package-archive";
    private int td = 5;

    /* renamed from: c  reason: collision with root package name */
    private boolean f60862c = true;
    private EnqueueType ot = EnqueueType.ENQUEUE_NONE;
    private int cq = 150;
    private boolean jb = true;
    private List<r> to = new ArrayList();
    private boolean qd = true;
    private boolean pl = true;

    public u(@NonNull Context context, @NonNull String str) {
        this.f60871m = context.getApplicationContext();
        this.f60874p = str;
    }

    public int a() {
        return this.tf;
    }

    public boolean ah() {
        return this.qd;
    }

    public String b() {
        return this.f60875q;
    }

    public boolean c() {
        return this.pj;
    }

    public boolean cl() {
        return this.sr;
    }

    public boolean cq() {
        return this.ff;
    }

    public boolean d() {
        return this.f60880v;
    }

    public a ds() {
        return this.f60864e;
    }

    public boolean e() {
        return this.ju;
    }

    public String ev() {
        return this.rm;
    }

    public boolean f() {
        return this.ev;
    }

    public boolean ff() {
        return this.f60862c;
    }

    public List<r> fo() {
        return this.to;
    }

    public boolean g() {
        return this.ya;
    }

    public Activity getActivity() {
        return this.vv;
    }

    public Context getContext() {
        return this.f60871m;
    }

    public List<com.ss.android.socialbase.downloader.model.p> i() {
        return this.qv;
    }

    public com.ss.android.socialbase.downloader.downloader.n j() {
        return this.f60866g;
    }

    public l jb() {
        return this.lb;
    }

    public String jh() {
        return this.f60868j;
    }

    public int ju() {
        return this.yj;
    }

    public IDownloadListener k() {
        return this.f60878t;
    }

    public com.ss.android.socialbase.appdownloader.p.o ky() {
        return this.f60877s;
    }

    public int l() {
        return this.pd;
    }

    public int la() {
        return this.ah;
    }

    public t lb() {
        return this.ky;
    }

    public String m() {
        return this.f60873o;
    }

    public boolean n() {
        return this.f60861b;
    }

    public long nn() {
        return this.cl;
    }

    public boolean ns() {
        return this.f60881w;
    }

    public boolean o() {
        return this.wv;
    }

    public EnqueueType ot() {
        return this.ot;
    }

    public String p() {
        return this.f60872n;
    }

    public la pd() {
        return this.f60882x;
    }

    public boolean pj() {
        return this.jb;
    }

    public JSONObject pl() {
        return this.nn;
    }

    public com.ss.android.socialbase.downloader.downloader.qv q() {
        return this.la;
    }

    public boolean qb() {
        return this.pl;
    }

    public List<String> qd() {
        return this.f60867i;
    }

    public boolean qv() {
        return this.jh;
    }

    public boolean r() {
        return this.f60863d;
    }

    public g rm() {
        return this.fo;
    }

    public IDownloadFileUriProvider s() {
        return this.ds;
    }

    public String sr() {
        return this.qb;
    }

    public com.ss.android.socialbase.downloader.notification.vv t() {
        return this.f60883y;
    }

    public boolean td() {
        return this.zn;
    }

    public String tf() {
        return this.f60879u;
    }

    public String to() {
        return this.fn;
    }

    public boolean u() {
        return this.f60869k;
    }

    public long v() {
        return this.vu;
    }

    public String vu() {
        return this.f60860a;
    }

    public String vv() {
        return this.f60874p;
    }

    public int w() {
        return this.cq;
    }

    public IDownloadListener wv() {
        return this.f60876r;
    }

    public String x() {
        return this.f60870l;
    }

    public String y() {
        return this.ns;
    }

    public int ya() {
        return this.td;
    }

    public int[] yj() {
        return this.uw;
    }

    public boolean zn() {
        return this.f60865f;
    }

    public u b(boolean z4) {
        this.pj = z4;
        return this;
    }

    public u i(String str) {
        this.rm = str;
        return this;
    }

    public u j(boolean z4) {
        this.qd = z4;
        return this;
    }

    public u jh(boolean z4) {
        this.f60865f = z4;
        return this;
    }

    public u k(boolean z4) {
        this.zn = z4;
        return this;
    }

    public u m(String str) {
        this.f60879u = str;
        return this;
    }

    public u n(String str) {
        this.f60870l = str;
        return this;
    }

    public u o(String str) {
        this.f60875q = str;
        return this;
    }

    public u p(@NonNull String str) {
        this.f60872n = str;
        return this;
    }

    public u q(boolean z4) {
        this.sr = z4;
        return this;
    }

    public u qv(String str) {
        this.ns = str;
        return this;
    }

    public u r(boolean z4) {
        this.jb = z4;
        return this;
    }

    public u t(boolean z4) {
        this.ff = z4;
        return this;
    }

    public u u(String str) {
        this.f60868j = str;
        return this;
    }

    public void vv(int i4) {
        this.ah = i4;
    }

    public u wv(String str) {
        this.f60860a = str;
        return this;
    }

    public u b(String str) {
        this.qb = str;
        return this;
    }

    public u i(boolean z4) {
        this.f60863d = z4;
        return this;
    }

    public u k(String str) {
        this.fn = str;
        return this;
    }

    public u m(boolean z4) {
        this.f60869k = z4;
        return this;
    }

    public u n(boolean z4) {
        this.f60881w = z4;
        return this;
    }

    public u o(boolean z4) {
        this.f60880v = z4;
        return this;
    }

    public u p(boolean z4) {
        this.jh = z4;
        return this;
    }

    public u qv(boolean z4) {
        this.ev = z4;
        return this;
    }

    public u u(boolean z4) {
        this.ya = z4;
        return this;
    }

    public u vv(String str) {
        this.f60873o = str;
        return this;
    }

    public u wv(boolean z4) {
        this.f60862c = z4;
        return this;
    }

    public u i(int i4) {
        this.cq = i4;
        return this;
    }

    public u m(int i4) {
        this.td = i4;
        return this;
    }

    public u o(int i4) {
        this.tf = i4;
        return this;
    }

    public u p(int i4) {
        this.pd = i4;
        return this;
    }

    public u u(int i4) {
        this.yj = i4;
        return this;
    }

    public u vv(List<com.ss.android.socialbase.downloader.model.p> list) {
        this.qv = list;
        return this;
    }

    public u m(List<String> list) {
        this.f60867i = list;
        return this;
    }

    public u vv(boolean z4) {
        this.wv = z4;
        return this;
    }

    public u vv(IDownloadListener iDownloadListener) {
        this.f60876r = iDownloadListener;
        return this;
    }

    public u vv(long j4) {
        this.vu = j4;
        return this;
    }

    public u vv(EnqueueType enqueueType) {
        this.ot = enqueueType;
        return this;
    }

    public u vv(IDownloadFileUriProvider iDownloadFileUriProvider) {
        this.ds = iDownloadFileUriProvider;
        return this;
    }

    public u vv(g gVar) {
        this.fo = gVar;
        return this;
    }

    public u vv(JSONObject jSONObject) {
        this.nn = jSONObject;
        return this;
    }

    public u vv(r rVar) {
        synchronized (this.to) {
            if (rVar != null) {
                if (!this.to.contains(rVar)) {
                    this.to.add(rVar);
                    return this;
                }
            }
            return this;
        }
    }
}

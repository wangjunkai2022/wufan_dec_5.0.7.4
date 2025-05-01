package com.beizi.ad.internal.network;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.beizi.ad.AdActivity;
import com.beizi.ad.NativeAdResponse;
import com.beizi.ad.R;
import com.beizi.ad.c.b;
import com.beizi.ad.c.e;
import com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity;
import com.beizi.ad.internal.g;
import com.beizi.ad.internal.h;
import com.beizi.ad.internal.i;
import com.beizi.ad.internal.j;
import com.beizi.ad.internal.utilities.HTTPResponse;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.JsonUtil;
import com.beizi.ad.internal.utilities.ReportEventUtil;
import com.beizi.ad.internal.utilities.StringUtil;
import com.beizi.ad.internal.utilities.UrlUtil;
import com.beizi.ad.internal.utilities.WebviewUtil;
import com.beizi.ad.lance.ApkBean;
import com.beizi.ad.lance.a.l;
import com.facebook.common.util.f;
import com.uc.crashsdk.export.LogType;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class ServerResponse {
    public static final String EXTRAS_KEY_MRAID = "MRAID";
    public static final String EXTRAS_KEY_ORIENTATION = "ORIENTATION";
    public static final String EXTRAS_KEY_REWARD_ITEM = "REWARD_ITEM";
    public static final String EXTRAS_KEY_SCALE = "SCALE";
    private int A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String I;
    private String J;
    private String K;
    private String L;
    private b.C0171b.a M;
    private boolean N;
    private b.C0171b O;
    private List<b.h> P;
    private String Q;
    private String R;
    private List<Pair<i, String>> S;
    private String T;
    private String U;
    private String V;
    private String W;
    private LinkedList<String> X;
    private LinkedList<com.beizi.ad.internal.a.a> Y;
    private HashMap<String, Object> Z;

    /* renamed from: a  reason: collision with root package name */
    private String f6043a;
    private boolean aa;
    private boolean ab;
    private String ac;
    private String ad;
    private String ae;
    private String af;
    private String ag;
    private com.beizi.ad.internal.nativead.a ah;

    /* renamed from: b  reason: collision with root package name */
    private String f6044b;

    /* renamed from: c  reason: collision with root package name */
    private e.a f6045c;

    /* renamed from: d  reason: collision with root package name */
    private int f6046d;

    /* renamed from: e  reason: collision with root package name */
    private int f6047e;

    /* renamed from: f  reason: collision with root package name */
    private int f6048f;

    /* renamed from: g  reason: collision with root package name */
    private int f6049g;

    /* renamed from: h  reason: collision with root package name */
    private int f6050h;

    /* renamed from: i  reason: collision with root package name */
    private int f6051i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6052j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6053k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6054l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6055m;
    public String mDetectClickUrl;
    public String mDetectViewUrl;
    public j mMediaType;

    /* renamed from: n  reason: collision with root package name */
    private boolean f6056n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f6057o;

    /* renamed from: p  reason: collision with root package name */
    private int f6058p;

    /* renamed from: q  reason: collision with root package name */
    private int f6059q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6060r;

    /* renamed from: s  reason: collision with root package name */
    private int f6061s;

    /* renamed from: t  reason: collision with root package name */
    private AdLogoInfo f6062t;

    /* renamed from: u  reason: collision with root package name */
    private AdLogoInfo f6063u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6064v;

    /* renamed from: w  reason: collision with root package name */
    private String f6065w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f6066x;

    /* renamed from: y  reason: collision with root package name */
    private b.C0171b.c f6067y;

    /* renamed from: z  reason: collision with root package name */
    private b.C0171b.C0172b f6068z;

    /* loaded from: classes2.dex */
    public static class AdLogoInfo {
        public static int TYPE_PIC = 0;
        public static int TYPE_TEXT = 1;
        String adurl;
        int type = 0;

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdurl(String str) {
            this.adurl = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i4) {
            this.type = i4;
        }

        public String getAdurl() {
            return this.adurl;
        }

        public int getType() {
            return this.type;
        }
    }

    public ServerResponse(HTTPResponse hTTPResponse, j jVar) {
        this.f6046d = 0;
        this.f6047e = 1;
        this.f6048f = 0;
        this.f6049g = 0;
        this.f6050h = 0;
        this.f6051i = 0;
        this.f6052j = false;
        this.f6053k = true;
        this.f6054l = false;
        this.f6055m = false;
        this.f6056n = false;
        this.f6057o = false;
        this.f6058p = 0;
        this.f6059q = 0;
        this.f6060r = false;
        this.f6061s = 0;
        this.f6062t = new AdLogoInfo();
        this.f6063u = new AdLogoInfo();
        this.f6064v = false;
        this.f6066x = false;
        this.S = new LinkedList();
        this.X = new LinkedList<>();
        this.Y = new LinkedList<>();
        this.Z = new HashMap<>();
        this.aa = false;
        this.ab = false;
        this.mMediaType = jVar;
        a(hTTPResponse.getHeaders());
        try {
            a(b.i.a(hTTPResponse.getResponseBinaryBody().toByteArray()));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    private void b() {
        if (this.X.isEmpty()) {
            return;
        }
        final g a5 = g.a();
        a5.c().post(new Runnable() { // from class: com.beizi.ad.internal.network.ServerResponse.1
            @Override // java.lang.Runnable
            public void run() {
                int i4;
                Iterator it2 = ServerResponse.this.X.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    try {
                        InputStream openStream = new URL(a5.b().a(str)).openStream();
                        byte[] bArr = new byte[1024];
                        while (i4 > 0) {
                            int read = openStream.read(bArr);
                            i4 = read != -1 ? i4 - read : 1024000;
                        }
                    } catch (IOException unused) {
                        String str2 = HaoboLog.baseLogTag;
                        HaoboLog.v(str2, "Ignored request: " + str);
                    }
                }
            }
        });
    }

    private boolean c(b.i iVar) {
        if (iVar.a() > 0) {
            b.j jVar = iVar.e().get(0);
            this.f6043a = jVar.a();
            this.f6044b = jVar.b();
            this.f6045c = jVar.c();
            this.f6046d = jVar.d();
            this.f6047e = jVar.e() == e.h.PORTRAIT ? 1 : 2;
            this.f6051i = Integer.parseInt(jVar.f());
            this.f6050h = Integer.parseInt(jVar.g());
            if (jVar.h() != null && (getAdType() == e.a.ADP_TABLE || getAdType() == e.a.ADP_CUSTOMER)) {
                b.g h4 = jVar.h();
                this.f6048f = Integer.parseInt(h4.a());
                this.f6049g = Integer.parseInt(h4.b());
            } else if (!StringUtil.isEmpty(jVar.b()) && getAdType() == e.a.ADP_IVIDEO) {
                addToExtras(EXTRAS_KEY_REWARD_ITEM, jVar.b());
            }
            this.f6052j = jVar.o();
            this.f6053k = jVar.m();
            this.f6054l = jVar.q();
            this.f6055m = jVar.n();
            this.f6056n = jVar.i();
            this.f6057o = jVar.k();
            this.f6058p = jVar.l();
            this.f6059q = jVar.j();
            this.f6060r = jVar.p();
            List<b.d> r4 = jVar.r();
            if (r4 != null && r4.size() > 0) {
                this.f6065w = r4.get(0).i();
                this.R = r4.get(0).b();
            }
            if (this.f6052j && this.f6051i == 0 && this.f6050h == 0) {
                this.f6051i = 720;
                this.f6050h = LogType.UNEXP_ANR;
            }
            if (jVar.s() > 0) {
                int i4 = 0;
                for (b.d dVar : jVar.r()) {
                    if (i4 == 0) {
                        this.R = dVar.b();
                        l.a("BeiZisAd", "mAdid = " + this.R);
                    }
                    if (dVar.h() <= 0 || dVar.g().get(0) == null) {
                        this.Q = dVar.a();
                        b.c e5 = dVar.e();
                        if (e5 != null) {
                            if (e5.a() != null) {
                                this.f6062t.setAdurl(e5.a());
                                this.f6062t.setType(AdLogoInfo.TYPE_PIC);
                            } else {
                                this.f6062t.setAdurl(e5.b());
                                this.f6062t.setType(AdLogoInfo.TYPE_TEXT);
                            }
                            if (e5.c() != null) {
                                this.f6063u.setAdurl(e5.c());
                                this.f6063u.setType(AdLogoInfo.TYPE_PIC);
                            } else {
                                this.f6063u.setAdurl(e5.d());
                                this.f6063u.setType(AdLogoInfo.TYPE_TEXT);
                            }
                        }
                        if (dVar.d() > 0) {
                            for (b.a aVar : dVar.f()) {
                                if (this.f6053k) {
                                    for (int i5 = 0; i5 < aVar.d(); i5++) {
                                        if (!StringUtil.isEmpty(aVar.c().get(i5).a())) {
                                            this.X.add(aVar.c().get(i5).b());
                                        }
                                    }
                                }
                                a(aVar.b());
                                if ((aVar.a() == e.f.RENDER_VIDEO || aVar.a() == e.f.RENDER_VAST_VIDEO) && aVar.d() > 0) {
                                    this.S.add(Pair.create(i.VIDEO, aVar.c().get(0).b()));
                                } else {
                                    String a5 = a(aVar);
                                    this.S.add(Pair.create(i.HTML, a5));
                                    if (a5.contains("mraid.js")) {
                                        addToExtras(EXTRAS_KEY_MRAID, Boolean.TRUE);
                                    }
                                }
                            }
                        }
                        if (dVar.c() != null) {
                            b.C0171b c5 = dVar.c();
                            a(c5);
                            this.U = c5.a();
                            this.W = c5.h();
                            this.V = c5.b();
                            b.h i6 = c5.i();
                            if (i6 != null && !TextUtils.isEmpty(i6.a())) {
                                this.mDetectViewUrl = i6.a();
                            }
                            if (i6 != null && !TextUtils.isEmpty(i6.b())) {
                                this.mDetectClickUrl = i6.b();
                            }
                            if (i6 != null && !TextUtils.isEmpty(i6.c())) {
                                this.T = i6.c();
                            }
                        }
                    }
                    i4++;
                    if (!this.S.isEmpty()) {
                        break;
                    }
                }
            }
        } else {
            HaoboLog.e(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.blank_ad));
        }
        if (this.S.isEmpty()) {
            return false;
        }
        this.aa = true;
        return true;
    }

    private boolean d(b.i iVar) {
        if (iVar.a() > 0) {
            for (b.j jVar : iVar.e()) {
                this.f6053k = jVar.m();
                if (jVar.s() > 0) {
                    for (b.d dVar : jVar.r()) {
                        if (dVar.h() <= 0 || dVar.g().get(0) == null) {
                            if (dVar.d() > 0) {
                                for (b.a aVar : dVar.f()) {
                                    if (this.f6053k) {
                                        for (int i4 = 0; i4 < aVar.d(); i4++) {
                                            if (!StringUtil.isEmpty(aVar.c().get(i4).a())) {
                                                this.X.add(aVar.c().get(i4).b());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.X.isEmpty()) {
            return false;
        }
        this.aa = true;
        return true;
    }

    private boolean e(b.i iVar) {
        if (iVar.a() > 0) {
            b.j jVar = iVar.e().get(0);
            this.f6043a = jVar.a();
            this.f6044b = jVar.b();
            this.f6045c = jVar.c();
            this.f6046d = jVar.d();
            this.f6047e = jVar.e() == e.h.PORTRAIT ? 1 : 2;
            this.f6051i = Integer.parseInt(jVar.f());
            this.f6050h = Integer.parseInt(jVar.g());
            List<b.d> r4 = jVar.r();
            if (r4 != null && r4.size() > 0) {
                this.f6065w = r4.get(0).i();
                this.R = r4.get(0).b();
            }
            this.f6052j = jVar.o();
            this.f6053k = jVar.m();
            this.f6054l = jVar.q();
            this.f6055m = jVar.n();
            this.f6056n = jVar.i();
            this.f6057o = jVar.k();
            this.f6058p = jVar.l();
            this.f6059q = jVar.j();
            this.f6060r = jVar.p();
            if (this.f6052j && this.f6051i == 0 && this.f6050h == 0) {
                this.f6051i = 720;
                this.f6050h = LogType.UNEXP_ANR;
            }
            if (jVar.s() > 0) {
                for (b.d dVar : jVar.r()) {
                    if (dVar.h() <= 0 || dVar.g().get(0) == null) {
                        this.Q = dVar.a();
                        if (dVar.d() >= 0) {
                            for (b.a aVar : dVar.f()) {
                                if (this.f6053k) {
                                    for (int i4 = 0; i4 < aVar.d(); i4++) {
                                        if (!StringUtil.isEmpty(aVar.c().get(i4).a())) {
                                            this.X.add(aVar.c().get(i4).b());
                                        }
                                    }
                                }
                                if (aVar.a() == e.f.RENDER_JSON && aVar.d() > 0) {
                                    try {
                                        b.c e5 = dVar.e();
                                        if (e5 != null) {
                                            if (e5.a() != null) {
                                                this.f6062t.setAdurl(e5.a());
                                                this.f6062t.setType(AdLogoInfo.TYPE_PIC);
                                            } else {
                                                this.f6062t.setAdurl(e5.b());
                                                this.f6062t.setType(AdLogoInfo.TYPE_TEXT);
                                            }
                                            if (e5.c() != null) {
                                                this.f6063u.setAdurl(e5.c());
                                                this.f6063u.setType(AdLogoInfo.TYPE_PIC);
                                            } else {
                                                this.f6063u.setAdurl(e5.d());
                                                this.f6063u.setType(AdLogoInfo.TYPE_TEXT);
                                            }
                                        }
                                        com.beizi.ad.internal.nativead.a a5 = com.beizi.ad.internal.nativead.a.a(new JSONObject(aVar.b()));
                                        this.ah = a5;
                                        a5.b(getLogoUrl());
                                        this.ah.a(getAdUrl());
                                        if (dVar.c() != null) {
                                            a(dVar.c());
                                            b.C0171b c5 = dVar.c();
                                            this.U = c5.a();
                                            this.V = c5.b();
                                            this.W = c5.h();
                                            this.ah.b(!StringUtil.isEmpty(this.U) ? this.U : this.W);
                                            this.ah.c(this.V);
                                            this.ah.a(dVar.c());
                                            b.h i5 = c5.i();
                                            if (i5 != null && !TextUtils.isEmpty(i5.a())) {
                                                this.ah.d(i5.a());
                                            }
                                            if (i5 != null && !TextUtils.isEmpty(i5.b())) {
                                                this.ah.e(i5.b());
                                            }
                                            List<b.h> l4 = c5.l();
                                            if (l4 != null && l4.size() > 0) {
                                                for (int i6 = 0; i6 < l4.size(); i6++) {
                                                    String b5 = l4.get(i6).b();
                                                    if (!TextUtils.isEmpty(b5)) {
                                                        this.ah.e(b5);
                                                    }
                                                    String a6 = l4.get(i6).a();
                                                    if (!TextUtils.isEmpty(a6)) {
                                                        this.ah.d(a6);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (JSONException unused) {
                                    }
                                    if (this.ah != null) {
                                        this.aa = true;
                                        return true;
                                    }
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                }
            }
        } else {
            HaoboLog.e(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.blank_ad));
        }
        if (this.S.isEmpty()) {
            return false;
        }
        this.aa = true;
        return true;
    }

    private boolean f(b.i iVar) {
        if (iVar.a() > 0) {
            b.j jVar = iVar.e().get(0);
            List<b.d> r4 = jVar.r();
            if (r4 != null && r4.size() > 0) {
                b.d dVar = r4.get(0);
                if (dVar.c() != null) {
                    b.C0171b c5 = dVar.c();
                    a(c5);
                    this.U = c5.a();
                    this.W = c5.h();
                    b.h i4 = c5.i();
                    if (i4 != null && !TextUtils.isEmpty(i4.a())) {
                        this.mDetectViewUrl = i4.a();
                    }
                    if (i4 != null && !TextUtils.isEmpty(i4.b())) {
                        this.mDetectClickUrl = i4.b();
                    }
                    if (i4 != null && !TextUtils.isEmpty(i4.c())) {
                        this.T = i4.c();
                    }
                }
            }
            this.f6043a = jVar.a();
            this.f6044b = jVar.b();
            this.f6045c = jVar.c();
            this.f6046d = jVar.d();
            this.f6047e = jVar.e() == e.h.PORTRAIT ? 1 : 2;
            this.f6050h = Integer.parseInt(jVar.f());
            this.f6051i = Integer.parseInt(jVar.g());
            List<b.d> r5 = jVar.r();
            if (r5 != null && r5.size() > 0) {
                this.f6065w = r5.get(0).i();
                this.R = r5.get(0).b();
            }
            this.f6048f = 0;
            this.f6049g = 0;
            if (jVar.h() != null && getAdType() == e.a.ADP_TABLE) {
                b.g h4 = jVar.h();
                this.f6048f = Integer.parseInt(h4.a());
                this.f6049g = Integer.parseInt(h4.b());
            }
            if (jVar.s() > 0) {
                for (b.d dVar2 : jVar.r()) {
                    if (dVar2.h() > 0 && dVar2.g().get(0) != null) {
                        b.f fVar = dVar2.g().get(0);
                        this.Y.add(new com.beizi.ad.internal.a.a(fVar.a(), fVar.c(), this.f6051i, this.f6050h, fVar.b(), ""));
                    }
                }
            }
        }
        if (this.Y.isEmpty()) {
            return false;
        }
        this.aa = true;
        return true;
    }

    public void addToExtras(String str, Object obj) {
        this.Z.put(str, obj);
    }

    public boolean containsAds() {
        return this.aa;
    }

    public String getAdExtInfo() {
        return this.Q;
    }

    public String getAdId() {
        return this.R;
    }

    public b.C0171b getAdInteractInfo() {
        return this.O;
    }

    public int getAdOrientation() {
        return this.f6047e;
    }

    public e.a getAdType() {
        return this.f6045c;
    }

    public AdLogoInfo getAdUrl() {
        return this.f6062t;
    }

    public String getApkName() {
        return this.B;
    }

    public String getAppDesc() {
        return this.D;
    }

    public String getAppDeveloper() {
        return this.G;
    }

    public String getAppDownloadURL() {
        return this.E;
    }

    public String getAppIcon() {
        return this.ag;
    }

    public String getAppIconURL() {
        return this.K;
    }

    public String getAppPermissionsDesc() {
        return this.H;
    }

    public String getAppPermissionsUrl() {
        return this.I;
    }

    public String getAppPrivacyUrl() {
        return this.J;
    }

    public String getAppVersion() {
        return this.F;
    }

    public String getAppintro() {
        return this.L;
    }

    public List<Pair<i, String>> getCreatives() {
        return this.S;
    }

    public HashMap<String, Object> getExtras() {
        return this.Z;
    }

    public b.C0171b.C0172b getFollowTrackExt() {
        return this.f6068z;
    }

    public int getHeight() {
        return this.f6050h;
    }

    public String getImageUrl() {
        return this.af;
    }

    public int getInteractType() {
        return this.A;
    }

    public int getLeft() {
        return this.f6048f;
    }

    public AdLogoInfo getLogoUrl() {
        return this.f6063u;
    }

    public int getMaxTimer() {
        return this.f6059q;
    }

    public LinkedList<com.beizi.ad.internal.a.a> getMediationAds() {
        return this.Y;
    }

    public int getMinTimer() {
        return this.f6058p;
    }

    public NativeAdResponse getNativeAdResponse() {
        return this.ah;
    }

    public String getPackageName() {
        return this.C;
    }

    public LinkedList<String> getPrefetchResources() {
        return this.X;
    }

    public String getPrice() {
        return this.f6065w;
    }

    public int getRefreshInterval() {
        return this.f6046d;
    }

    public String getSubTitle() {
        return this.ad;
    }

    public String getTitle() {
        return this.ac;
    }

    public int getTop() {
        return this.f6049g;
    }

    public b.C0171b.c getVideoTrackExt() {
        return this.f6067y;
    }

    public String getVideoUrl() {
        return this.ae;
    }

    public int getWidth() {
        return this.f6051i;
    }

    public void handleClick(View view, String str, String str2, String str3, String str4, String str5, String str6, boolean z4, String str7) {
        String replaceToTouchEventUrl;
        l.a("BeiZisAd", "handleClick========" + z4);
        if (!z4) {
            if (!StringUtil.isEmpty(this.mDetectClickUrl)) {
                this.mDetectClickUrl = UrlUtil.replaceToTouchEventUrl(this.mDetectClickUrl, str, str2, str3, str4, str5, str6, "");
                new h(this.mDetectClickUrl).execute(new Void[0]);
                this.mDetectClickUrl = "";
            }
            if (this.O != null && this.P != null) {
                for (int i4 = 0; i4 < this.P.size(); i4++) {
                    b.h hVar = this.P.get(i4);
                    if (hVar != null && !TextUtils.isEmpty(hVar.b())) {
                        if (!TextUtils.isEmpty(str7)) {
                            replaceToTouchEventUrl = UrlUtil.replaceToTouchEventUrl(hVar.b(), str, str2, str3, str4, str5, str6, "").replace("__REQUESTUUID__", str7);
                        } else {
                            replaceToTouchEventUrl = UrlUtil.replaceToTouchEventUrl(hVar.b(), str, str2, str3, str4, str5, str6, "");
                        }
                        new h(StringUtil.replaceClick(view, replaceToTouchEventUrl)).executeOnExecutor(com.beizi.ad.lance.a.c.b().d(), new Void[0]);
                    }
                }
                this.P = null;
            }
        }
        l.a("BeiZisAd", "mDeepLinkUrl:" + this.V + ",appDownloadURL = " + this.E + ",mLandingPageUrl = " + this.U);
        Context context = view != null ? view.getContext() : null;
        if (context == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.V)) {
            try {
                if (!com.beizi.ad.lance.a.j.a(context, Uri.decode(this.V)) && !com.beizi.ad.lance.a.h.a(context, this.C)) {
                    b.C0171b.C0172b c0172b = this.f6068z;
                    if (c0172b != null) {
                        ReportEventUtil.report(c0172b.i());
                    }
                    a(context);
                    return;
                }
                b.C0171b.C0172b c0172b2 = this.f6068z;
                if (c0172b2 != null) {
                    ReportEventUtil.report(c0172b2.h());
                }
                b(context);
                b.C0171b.C0172b c0172b3 = this.f6068z;
                if (c0172b3 != null) {
                    ReportEventUtil.report(c0172b3.f());
                    return;
                }
                return;
            } catch (Exception unused) {
                b.C0171b.C0172b c0172b4 = this.f6068z;
                if (c0172b4 != null) {
                    ReportEventUtil.report(c0172b4.g());
                }
                a(context);
                return;
            }
        }
        a(context);
    }

    public void handleConvert(View view) {
        String str = HaoboLog.baseLogTag;
        HaoboLog.e(str, "handleClick called with convertUrl = " + this.T);
        if (StringUtil.isEmpty(this.T)) {
            return;
        }
        new h(this.T).execute(new Void[0]);
    }

    public void handleOnCompletion() {
        List<b.h> l4;
        b.C0171b c0171b = this.O;
        if (c0171b == null || (l4 = c0171b.l()) == null) {
            return;
        }
        for (int i4 = 0; i4 < l4.size(); i4++) {
            UrlUtil.sendOnCompletionInfoToServer(l4.get(i4));
        }
    }

    public void handleOnPause(View view) {
        List<b.h> l4;
        b.C0171b c0171b = this.O;
        if (c0171b == null || (l4 = c0171b.l()) == null) {
            return;
        }
        for (int i4 = 0; i4 < l4.size(); i4++) {
            UrlUtil.sendOnPauseInfoToServer(l4.get(i4));
        }
    }

    public void handleOnStart(View view, int i4) {
        List<b.h> l4;
        b.C0171b c0171b = this.O;
        if (c0171b == null || (l4 = c0171b.l()) == null) {
            return;
        }
        for (int i5 = 0; i5 < l4.size(); i5++) {
            UrlUtil.sendOnStartInfoToServer(l4.get(i5));
        }
    }

    public void handleView(View view, String str) {
        List<b.h> l4;
        String a5;
        int i4 = this.f6061s;
        if (i4 <= 0) {
            this.f6061s = i4 + 1;
            if (!StringUtil.isEmpty(this.mDetectViewUrl)) {
                this.mDetectViewUrl = UrlUtil.replaceToTouchEventUrl(this.mDetectViewUrl, "", "", "", "", "", "", "");
                new h(this.mDetectViewUrl).execute(new Void[0]);
                this.mDetectViewUrl = "";
            }
            b.C0171b c0171b = this.O;
            if (c0171b == null || (l4 = c0171b.l()) == null) {
                return;
            }
            for (int i5 = 0; i5 < l4.size(); i5++) {
                b.h hVar = l4.get(i5);
                if (hVar != null && !TextUtils.isEmpty(hVar.a()) && view != null) {
                    if (!TextUtils.isEmpty(str)) {
                        a5 = hVar.a().replace("__REQUESTUUID__", str);
                    } else {
                        a5 = hVar.a();
                    }
                    new h(StringUtil.replaceView(0, view, a5)).executeOnExecutor(com.beizi.ad.lance.a.c.b().d(), new Void[0]);
                }
            }
        }
    }

    public boolean isAutoClose() {
        return this.f6056n;
    }

    public boolean isAutoPlay() {
        return this.f6060r;
    }

    public boolean isFullScreen() {
        return this.f6052j;
    }

    public boolean isManualClose() {
        return this.f6057o;
    }

    public boolean isMuted() {
        return this.f6055m;
    }

    public boolean isVideo() {
        return !TextUtils.isEmpty(this.ae);
    }

    public boolean isWifiOnly() {
        return this.f6054l;
    }

    public boolean isWifiPreload() {
        return this.f6053k;
    }

    public void setAdOrientation(int i4) {
        this.f6047e = i4;
    }

    public void setCloseMarketDialog(boolean z4) {
        this.f6066x = z4;
    }

    public void setOpenInNativeBrowser(boolean z4) {
        this.f6064v = z4;
    }

    private void a(b.C0171b c0171b) {
        this.O = c0171b;
        this.P = c0171b.l();
        this.f6067y = c0171b.k();
        this.f6068z = c0171b.j();
        this.A = c0171b.c();
        this.B = c0171b.d();
        this.C = c0171b.e();
        this.D = c0171b.f();
        this.E = c0171b.g();
        if (TextUtils.isEmpty(this.C)) {
            this.C = "lance";
        }
        if (TextUtils.isEmpty(this.B)) {
            this.B = "BeiZi";
        }
        if (TextUtils.isEmpty(this.D)) {
            this.D = "Ad Download";
        }
        this.F = c0171b.m();
        this.G = c0171b.n();
        this.H = c0171b.o();
        this.I = c0171b.p();
        this.J = c0171b.q();
        this.K = c0171b.r();
        this.L = c0171b.s();
        b.C0171b.a t4 = c0171b.t();
        this.M = t4;
        if (t4 == null || t4.a() != 1) {
            return;
        }
        this.N = true;
    }

    private boolean b(b.i iVar) {
        if (iVar.b() != 0) {
            HaoboLog.e(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.response_error, iVar.c(), iVar.d()));
            return false;
        }
        return true;
    }

    private void b(Context context) {
        if (context == null) {
            return;
        }
        Uri parse = Uri.parse(Uri.decode(this.V));
        if (parse.getScheme() != null && parse.getScheme().equals("bzopen") && !TextUtils.isEmpty(parse.getHost()) && parse.getPathSegments().size() > 0) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            String queryParameter = parse.getQueryParameter("flags");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    if (!queryParameter.startsWith("0x") && !queryParameter.startsWith("0X")) {
                        intent.setFlags(Integer.parseInt(queryParameter));
                    }
                    intent.setFlags(Integer.parseInt(queryParameter.substring(2), 16));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            intent.setComponent(new ComponentName(parse.getHost(), parse.getPathSegments().get(0)));
            String queryParameter2 = parse.getQueryParameter("rect");
            if (!TextUtils.isEmpty(queryParameter2)) {
                try {
                    String[] split = queryParameter2.split(":");
                    if (split.length == 4) {
                        Rect rect = new Rect();
                        rect.set(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
                        intent.setSourceBounds(rect);
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            context.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", parse);
        intent2.setFlags(805339136);
        context.startActivity(intent2);
    }

    private void a(Map<String, List<String>> map) {
        if (map != null) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    for (String str : entry.getValue()) {
                        if (!TextUtils.isEmpty(str)) {
                            HaoboLog.v(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.response_header, entry.getKey(), str));
                        }
                    }
                }
            }
        }
    }

    public ServerResponse(b.i iVar, Map<String, List<String>> map, j jVar) {
        this.f6046d = 0;
        this.f6047e = 1;
        this.f6048f = 0;
        this.f6049g = 0;
        this.f6050h = 0;
        this.f6051i = 0;
        this.f6052j = false;
        this.f6053k = true;
        this.f6054l = false;
        this.f6055m = false;
        this.f6056n = false;
        this.f6057o = false;
        this.f6058p = 0;
        this.f6059q = 0;
        this.f6060r = false;
        this.f6061s = 0;
        this.f6062t = new AdLogoInfo();
        this.f6063u = new AdLogoInfo();
        this.f6064v = false;
        this.f6066x = false;
        this.S = new LinkedList();
        this.X = new LinkedList<>();
        this.Y = new LinkedList<>();
        this.Z = new HashMap<>();
        this.aa = false;
        this.ab = false;
        if (iVar == null) {
            HaoboLog.clearLastResponse();
            return;
        }
        HaoboLog.setLastResponse(iVar.toString());
        HaoboLog.d(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.response_body, HaoboLog.getLastResponse()));
        this.mMediaType = jVar;
        a(map);
        a(iVar);
        b();
    }

    private void a(b.i iVar) {
        if (b(iVar)) {
            j jVar = this.mMediaType;
            if (jVar == j.PREFETCH) {
                if (d(iVar)) {
                    return;
                }
            } else if (jVar != j.NATIVE) {
                if (c(iVar)) {
                    return;
                }
            } else if (e(iVar)) {
                return;
            }
            f(iVar);
        }
    }

    public void handleClick(View view, com.beizi.ad.c.c cVar, String str, String str2, boolean z4, String str3, int i4) {
        String replaceToTouchEventUrl;
        l.a("BeiZisAd", "handleClick========" + z4);
        if (!z4) {
            if (!StringUtil.isEmpty(this.mDetectClickUrl)) {
                this.mDetectClickUrl = UrlUtil.replaceToTouchEventUrl(this.mDetectClickUrl, cVar, str, str2, "", i4);
                new h(this.mDetectClickUrl).execute(new Void[0]);
                this.mDetectClickUrl = "";
            }
            if (this.O != null && this.P != null) {
                for (int i5 = 0; i5 < this.P.size(); i5++) {
                    b.h hVar = this.P.get(i5);
                    if (hVar != null && !TextUtils.isEmpty(hVar.b())) {
                        if (!TextUtils.isEmpty(str3)) {
                            replaceToTouchEventUrl = UrlUtil.replaceToTouchEventUrl(hVar.b(), cVar, str, str2, "", i4).replace("__REQUESTUUID__", str3);
                        } else {
                            replaceToTouchEventUrl = UrlUtil.replaceToTouchEventUrl(hVar.b(), cVar, str, str2, "", i4);
                        }
                        new h(StringUtil.replaceClick(view, replaceToTouchEventUrl)).executeOnExecutor(com.beizi.ad.lance.a.c.b().d(), new Void[0]);
                    }
                }
                this.P = null;
            }
        }
        l.a("BeiZisAd", "mDeepLinkUrl:" + this.V + ",appDownloadURL = " + this.E + ",mLandingPageUrl = " + this.U);
        Context context = view != null ? view.getContext() : null;
        if (context == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.V)) {
            try {
                if (!com.beizi.ad.lance.a.j.a(context, Uri.decode(this.V)) && !com.beizi.ad.lance.a.h.a(context, this.C)) {
                    b.C0171b.C0172b c0172b = this.f6068z;
                    if (c0172b != null) {
                        ReportEventUtil.report(c0172b.i());
                    }
                    a(context);
                    return;
                }
                b.C0171b.C0172b c0172b2 = this.f6068z;
                if (c0172b2 != null) {
                    ReportEventUtil.report(c0172b2.h());
                }
                b(context);
                b.C0171b.C0172b c0172b3 = this.f6068z;
                if (c0172b3 != null) {
                    ReportEventUtil.report(c0172b3.f());
                    return;
                }
                return;
            } catch (Exception unused) {
                b.C0171b.C0172b c0172b4 = this.f6068z;
                if (c0172b4 != null) {
                    ReportEventUtil.report(c0172b4.g());
                }
                a(context);
                return;
            }
        }
        a(context);
    }

    private String a(b.a aVar) {
        if (aVar.a() == e.f.RENDER_H5 || aVar.a() == e.f.RENDER_PIC) {
            if (aVar.a() == e.f.RENDER_PIC && aVar.d() > 0) {
                return "<!DOCTYPE html>\n<html lang=\"en\" style=\"width: 100%; height: 100%;\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" id=\"viewport\" content=\"width=device-width, height=device-height, initial-scale=1\">\n    <title>Document</title>\n</head>\n<body style=\"width: 100%; height: 100%; padding: 0; margin: 0;\">\n<img style=\"width: 100%; height: 100%\" src=\"__IMAGE_SRC_PATH__\" alt=\"\"/>\n</body>\n</html><!DOCTYPE html>".replace("__IMAGE_SRC_PATH__", aVar.c().get(0).b());
            }
            Matcher matcher = Pattern.compile("\\{(\\d+)\\.value\\}").matcher(aVar.b());
            HashMap hashMap = new HashMap();
            for (int i4 = 0; i4 < aVar.d(); i4++) {
                hashMap.put(Integer.valueOf(i4), aVar.c().get(i4).b());
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                Integer valueOf = Integer.valueOf(Integer.parseInt(matcher.group(1)));
                if (hashMap.get(valueOf) != null) {
                    matcher.appendReplacement(stringBuffer, (String) hashMap.get(valueOf));
                } else {
                    matcher.appendReplacement(stringBuffer, "");
                    HaoboLog.e(HaoboLog.pbLogTag, HaoboLog.getString(R.string.invalid_string_placeholder, matcher.group(0)));
                }
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.ab;
    }

    private void a(Context context) {
        try {
            if (!c()) {
                c(context);
                return;
            }
            int i4 = this.A;
            if (i4 == 2) {
                if (com.beizi.ad.lance.a.h.a(context, this.C)) {
                    com.beizi.ad.lance.a.h.b(context, this.C);
                    b.C0171b.C0172b c0172b = this.f6068z;
                    if (c0172b != null) {
                        ReportEventUtil.report(c0172b.a());
                        return;
                    }
                    return;
                }
                a(context, 1);
            } else if (i4 == 5) {
                if (!com.beizi.ad.lance.a.j.a(context, this.E) && !this.E.contains("market://")) {
                    c(context);
                    return;
                }
                if (this.f6066x) {
                    a(this.E, context);
                    b.C0171b.C0172b c0172b2 = this.f6068z;
                    if (c0172b2 != null) {
                        ReportEventUtil.report(c0172b2.a());
                        return;
                    }
                    return;
                }
                a(context, 2);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public ServerResponse(boolean z4) {
        this.f6046d = 0;
        this.f6047e = 1;
        this.f6048f = 0;
        this.f6049g = 0;
        this.f6050h = 0;
        this.f6051i = 0;
        this.f6052j = false;
        this.f6053k = true;
        this.f6054l = false;
        this.f6055m = false;
        this.f6056n = false;
        this.f6057o = false;
        this.f6058p = 0;
        this.f6059q = 0;
        this.f6060r = false;
        this.f6061s = 0;
        this.f6062t = new AdLogoInfo();
        this.f6063u = new AdLogoInfo();
        this.f6064v = false;
        this.f6066x = false;
        this.S = new LinkedList();
        this.X = new LinkedList<>();
        this.Y = new LinkedList<>();
        this.Z = new HashMap<>();
        this.aa = false;
        this.ab = false;
        this.ab = z4;
    }

    private void a(Context context, int i4) {
        try {
            File a5 = com.beizi.ad.lance.a.h.a(context);
            String absolutePath = a5 != null ? a5.getAbsolutePath() : "";
            ApkBean apkBean = new ApkBean(this.E, this.C + ".apk", this.C, absolutePath, this.B, this.D, context.getPackageName() + ".fileprovider", this.f6068z, this.F, this.G, this.H, this.I, this.J, this.K, this.L);
            Bundle bundle = new Bundle();
            bundle.putSerializable("apkBean", apkBean);
            bundle.putInt("type", i4);
            bundle.putBoolean("isCanJump", this.N);
            if (i4 == 2) {
                b.C0171b.C0172b c0172b = this.f6068z;
                if (c0172b != null) {
                    bundle.putStringArrayList("openList", (ArrayList) c0172b.a());
                }
                bundle.putString("landingPageUrl", this.U);
            }
            Intent intent = new Intent(context, BeiZiDownloadDialogActivity.class);
            intent.putExtra("data", bundle);
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private boolean c() {
        if (TextUtils.isEmpty(this.E) || TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.G) || TextUtils.isEmpty(this.F) || TextUtils.isEmpty(this.J) || TextUtils.isEmpty(this.L)) {
            return false;
        }
        if (TextUtils.isEmpty(this.I) && TextUtils.isEmpty(this.H)) {
            return false;
        }
        int i4 = this.A;
        return i4 == 2 || i4 == 5;
    }

    private void c(Context context) {
        if (context == null || TextUtils.isEmpty(this.U) || !this.U.startsWith(f.f10923a)) {
            return;
        }
        if (this.f6064v) {
            Class a5 = AdActivity.a();
            try {
                WebView webView = new WebView(new MutableContextWrapper(context));
                WebviewUtil.setWebViewSettings(webView);
                webView.loadUrl(this.U, com.beizi.ad.lance.a.i.a());
                com.beizi.ad.internal.activity.a.f5750a.add(webView);
                Intent intent = new Intent(g.a().e(), a5);
                intent.setFlags(268435456);
                intent.putExtra("ACTIVITY_TYPE", "DOWNLOADBROWSER");
                intent.putExtra("ACTIVITY_CAN_JUMP", this.N);
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                l.a(HaoboLog.baseLogTag, HaoboLog.getString(R.string.adactivity_missing, a5.getName()));
                com.beizi.ad.internal.activity.a.f5750a.remove();
                return;
            } catch (Exception e5) {
                String str = HaoboLog.baseLogTag;
                l.a(str, "Exception initializing the redirect webview: " + e5.getMessage());
                return;
            }
        }
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(this.U))));
        } catch (Exception unused2) {
        }
    }

    private void a(String str, Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            HaoboLog.w(HaoboLog.baseLogTag, HaoboLog.getString(R.string.opening_url_failed, str));
        }
    }

    private void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.ac = JsonUtil.getJSONString(jSONObject, "Headline");
            this.ad = JsonUtil.getJSONString(jSONObject, "Body");
            this.ag = JsonUtil.getJSONString(jSONObject, "AppIcon");
            JSONArray jSONArray = JsonUtil.getJSONArray(jSONObject, "Images");
            JSONArray jSONArray2 = JsonUtil.getJSONArray(jSONObject, "Videos");
            if (jSONArray != null && jSONArray.length() > 0) {
                this.af = (String) jSONArray.get(0);
            }
            if (jSONArray2 == null || jSONArray2.length() <= 0) {
                return;
            }
            this.ae = (String) jSONArray2.get(0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

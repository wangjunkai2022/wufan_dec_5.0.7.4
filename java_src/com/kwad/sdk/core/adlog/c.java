package com.kwad.sdk.core.adlog;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.common.statfs.StatFsHelper;
import com.ksad.json.annotation.KsJson;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import com.kwad.sdk.core.adlog.a;
import com.kwad.sdk.core.report.h;
import com.kwad.sdk.core.response.b.e;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.threads.GlobalThreadPools;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.f;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.aj;
import com.kwad.sdk.utils.al;
import com.kwad.sdk.utils.az;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class c {
    private static ExecutorService aqs = GlobalThreadPools.Gq();
    public static JSONObject aqt;
    public static boolean aqu;

    @KsJson
    /* loaded from: classes5.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int code;
        public String msg;

        public a(int i4, String str) {
            this.code = i4;
            this.msg = str;
        }
    }

    private static int BO() {
        return aj.isOrientationPortrait() ? 2 : 1;
    }

    private static boolean G(AdInfo adInfo) {
        f fVar = (f) ServiceProvider.get(f.class);
        if (fVar == null) {
            return false;
        }
        String ax = com.kwad.sdk.core.response.b.a.ax(adInfo);
        if (TextUtils.isEmpty(ax)) {
            return false;
        }
        return al.an(fVar.getContext(), ax);
    }

    public static void a(AdTemplate adTemplate, com.kwad.sdk.core.adlog.c.a aVar, @Nullable JSONObject jSONObject) {
        if (aVar != null) {
            try {
                if (adTemplate.fromCache) {
                    aVar.a(h.bY(adTemplate));
                }
                aVar.e(adTemplate, null, null);
            } catch (Throwable th) {
                ServiceProvider.reportSdkCaughtException(th);
                return;
            }
        }
        a(adTemplate, 2, aVar, jSONObject);
    }

    public static void bG(AdTemplate adTemplate) {
        q(adTemplate, 4);
    }

    public static void bH(AdTemplate adTemplate) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.downloadSource = adTemplate.downloadSource;
        a(adTemplate, 30, aVar, (JSONObject) null);
    }

    public static void bI(AdTemplate adTemplate) {
        q(adTemplate, 36);
    }

    public static void bJ(AdTemplate adTemplate) {
        q(adTemplate, 38);
    }

    public static void bK(AdTemplate adTemplate) {
        q(adTemplate, 41);
    }

    public static void bL(AdTemplate adTemplate) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.arf = com.kwad.sdk.core.response.b.a.ax(e.dS(adTemplate));
        a(adTemplate, 768, aVar, new JSONObject());
    }

    public static void bM(@Nullable AdTemplate adTemplate) {
        f(adTemplate, null);
    }

    public static void bN(@Nullable AdTemplate adTemplate) {
        g(adTemplate, (JSONObject) null);
    }

    public static void bO(@Nullable AdTemplate adTemplate) {
        q(adTemplate, 58);
    }

    public static void bP(AdTemplate adTemplate) {
        q(adTemplate, 914);
    }

    public static void bQ(AdTemplate adTemplate) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.downloadStatus = com.kwad.sdk.core.response.b.a.by(e.dS(adTemplate));
        com.kwad.sdk.core.e.c.d("AdReportManager", "reportDownloadCardClose downloadStatus=" + aVar.downloadStatus);
        a(adTemplate, 713, aVar, (JSONObject) null);
    }

    public static void bR(AdTemplate adTemplate) {
        q(adTemplate, 722);
    }

    public static void bS(AdTemplate adTemplate) {
        q(adTemplate, 721);
    }

    private static boolean bT(AdTemplate adTemplate) {
        if (e.dK(adTemplate)) {
            return true;
        }
        f fVar = (f) ServiceProvider.get(f.class);
        return fVar != null && fVar.aG(adTemplate);
    }

    public static void c(final AdTemplate adTemplate, final JSONObject jSONObject) {
        aqs.submit(new az() { // from class: com.kwad.sdk.core.adlog.c.1
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                com.kwad.sdk.core.adlog.c.b cN = new com.kwad.sdk.core.adlog.c.b().cN(AdTemplate.this.downloadSource);
                c.a(AdTemplate.this, cN);
                c.a(AdTemplate.this, 31, cN.Ca(), jSONObject);
                AdInfo dS = e.dS(AdTemplate.this);
                al.at(dS.downloadFilePath, dS.downloadId);
            }
        });
    }

    public static void d(AdTemplate adTemplate, JSONObject jSONObject) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.downloadSource = adTemplate.downloadSource;
        a(adTemplate, 35, aVar, jSONObject);
    }

    public static void e(final AdTemplate adTemplate, final JSONObject jSONObject) {
        aqs.submit(new az() { // from class: com.kwad.sdk.core.adlog.c.2
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                AdInfo dS = e.dS(AdTemplate.this);
                int au = al.au(dS.downloadId, com.kwad.sdk.core.response.b.a.ax(dS));
                com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
                AdTemplate adTemplate2 = AdTemplate.this;
                aVar.downloadSource = adTemplate2.downloadSource;
                aVar.ara = au;
                aVar.arb = adTemplate2.installFrom;
                c.a(adTemplate2, 32, aVar, jSONObject);
            }
        });
    }

    public static void f(@Nullable AdTemplate adTemplate, @Nullable JSONObject jSONObject) {
        d(adTemplate, 399, jSONObject);
    }

    public static void g(@Nullable AdTemplate adTemplate, @Nullable JSONObject jSONObject) {
        d(adTemplate, (int) StatFsHelper.f10899h, jSONObject);
    }

    public static void h(AdTemplate adTemplate, int i4) {
        adTemplate.mInstallApkFromSDK = true;
        adTemplate.mInstallApkFormUser = i4 == 1;
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.arr = i4;
        a(adTemplate, 37, aVar, (JSONObject) null);
    }

    public static void i(AdTemplate adTemplate, int i4) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.Lj = i4;
        a(adTemplate, 923, aVar, (JSONObject) null);
    }

    public static void j(@Nullable AdTemplate adTemplate, int i4) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.aqZ = i4;
        b(adTemplate, "wxsmallapp", 1, aVar);
    }

    public static void k(@Nullable AdTemplate adTemplate, int i4) {
        d(adTemplate, i4, 0);
    }

    public static void l(AdTemplate adTemplate, int i4) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.aqP = i4;
        a(adTemplate, 759, aVar, (JSONObject) null);
    }

    public static void m(AdTemplate adTemplate, int i4) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.aqO = i4;
        a(adTemplate, 28, aVar, (JSONObject) null);
    }

    public static void n(AdTemplate adTemplate, int i4) {
        if (adTemplate == null) {
            return;
        }
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.arf = com.kwad.sdk.core.response.b.a.ax(e.dS(adTemplate));
        a(adTemplate, i4, aVar, new JSONObject());
    }

    public static void o(AdTemplate adTemplate, int i4) {
        a(adTemplate, i4, new com.kwad.sdk.core.adlog.c.a(), new JSONObject());
    }

    @Deprecated
    public static void p(AdTemplate adTemplate, int i4) {
        e(adTemplate, (JSONObject) null, new com.kwad.sdk.core.adlog.c.b().cM(i4));
    }

    private static void q(AdTemplate adTemplate, int i4) {
        a(adTemplate, i4, (com.kwad.sdk.core.adlog.c.a) null, new JSONObject());
    }

    public static boolean b(@NonNull AdTemplate adTemplate, @Nullable JSONObject jSONObject, @Nullable com.kwad.sdk.core.adlog.c.b bVar) {
        if (adTemplate.mPvReported) {
            return false;
        }
        adTemplate.mPvReported = true;
        AdInfo dS = e.dS(adTemplate);
        if (bVar == null) {
            bVar = new com.kwad.sdk.core.adlog.c.b();
        }
        bVar.cY(BO());
        com.kwad.sdk.core.adlog.c.a Ca = bVar.Ca();
        if (adTemplate.fromCache) {
            Ca.a(h.bY(adTemplate));
        }
        Ca.arm = G(dS) ? 1 : 0;
        return a(adTemplate, 1, Ca, jSONObject);
    }

    public static void c(@Nullable AdTemplate adTemplate, String str, int i4) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.aqX = i4;
        if (!str.equals("")) {
            aVar.aqY = str;
        }
        a(adTemplate, 803, aVar, (JSONObject) null);
    }

    public static void e(AdTemplate adTemplate, int i4, int i5) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.aqR = 69;
        aVar.arh = i4;
        aVar.ari = i5;
        a(adTemplate, (int) TypedValues.PositionType.TYPE_TRANSITION_EASING, aVar, (JSONObject) null);
    }

    public static void g(@Nullable AdTemplate adTemplate, boolean z4) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        a.C0514a c0514a = new a.C0514a();
        if (z4) {
            c0514a.aqm = 1;
        } else {
            c0514a.aqm = 2;
        }
        aVar.a(c0514a);
        a(adTemplate, 323, aVar, (JSONObject) null);
    }

    public static void k(@Nullable AdTemplate adTemplate, long j4) {
        a(adTemplate, 52, com.kwad.sdk.core.adlog.c.a.BZ().an(j4), (JSONObject) null);
    }

    public static void d(@Nullable AdTemplate adTemplate, int i4, int i5) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.arl = i4;
        aVar.Lk = i5;
        a(adTemplate, 323, aVar, (JSONObject) null);
    }

    public static void i(AdTemplate adTemplate, @Nullable JSONObject jSONObject) {
        d(adTemplate, 450, jSONObject);
    }

    public static void j(AdTemplate adTemplate, @Nullable JSONObject jSONObject) {
        d(adTemplate, 451, jSONObject);
    }

    public static void l(AdTemplate adTemplate, long j4) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.aqT = j4;
        a(adTemplate, 600, aVar, (JSONObject) null);
    }

    public static void m(AdTemplate adTemplate, long j4) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.ark = j4;
        a(adTemplate, 401, aVar, (JSONObject) null);
    }

    public static void i(AdTemplate adTemplate, boolean z4) {
        com.kwad.sdk.core.adlog.c.b bVar = new com.kwad.sdk.core.adlog.c.b();
        a.C0514a c0514a = new a.C0514a();
        c0514a.aqj = 1;
        bVar.b(c0514a);
        if (z4) {
            bVar.cT(33);
        }
        a(adTemplate, 804, bVar.Ca(), (JSONObject) null);
    }

    public static void j(AdTemplate adTemplate, boolean z4) {
        com.kwad.sdk.core.adlog.c.b bVar = new com.kwad.sdk.core.adlog.c.b();
        a.C0514a c0514a = new a.C0514a();
        c0514a.aqj = 2;
        bVar.b(c0514a);
        if (z4) {
            bVar.cT(33);
        }
        a(adTemplate, 804, bVar.Ca(), (JSONObject) null);
    }

    @Deprecated
    public static void a(AdTemplate adTemplate, int i4, @Nullable ac.a aVar) {
        com.kwad.sdk.core.adlog.c.a aVar2 = new com.kwad.sdk.core.adlog.c.a();
        aVar2.kl = i4;
        if (aVar != null) {
            aVar2.kn = aVar;
        }
        a(adTemplate, aVar2, (JSONObject) null);
    }

    public static void h(@Nullable AdTemplate adTemplate, boolean z4) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        a.C0514a c0514a = new a.C0514a();
        if (z4) {
            c0514a.aqm = 1;
        } else {
            c0514a.aqm = 2;
        }
        aVar.a(c0514a);
        a(adTemplate, 652, aVar, (JSONObject) null);
    }

    public static void c(AdTemplate adTemplate, @Nullable JSONObject jSONObject, com.kwad.sdk.core.adlog.c.b bVar) {
        a(adTemplate, 451, bVar != null ? bVar.Ca() : null, (JSONObject) null);
    }

    public static void e(AdTemplate adTemplate, JSONObject jSONObject, @Nullable com.kwad.sdk.core.adlog.c.b bVar) {
        if (bVar == null) {
            bVar = new com.kwad.sdk.core.adlog.c.b();
        }
        com.kwad.sdk.core.adlog.c.a Ca = bVar.Ca();
        Ca.e(adTemplate, null, null);
        a(adTemplate, 141, Ca, jSONObject);
    }

    public static void d(AdTemplate adTemplate, @Nullable JSONObject jSONObject, com.kwad.sdk.core.adlog.c.b bVar) {
        if (bVar == null) {
            bVar = new com.kwad.sdk.core.adlog.c.b();
        }
        com.kwad.sdk.core.adlog.c.a Ca = bVar.Ca();
        Ca.e(adTemplate, null, null);
        a(adTemplate, 140, Ca, jSONObject);
    }

    public static void c(AdTemplate adTemplate, int i4, @Nullable JSONObject jSONObject) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.arf = com.kwad.sdk.core.response.b.a.ax(e.dS(adTemplate));
        aVar.aqR = 93;
        a(adTemplate, 140, aVar, (JSONObject) null);
    }

    public static void a(AdTemplate adTemplate, com.kwad.sdk.core.adlog.c.b bVar, JSONObject jSONObject) {
        a(adTemplate, bVar != null ? bVar.Ca() : null, jSONObject);
    }

    public static void a(AdTemplate adTemplate, long j4, @Nullable JSONObject jSONObject) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        a.C0514a c0514a = new a.C0514a();
        if (j4 != -1) {
            c0514a.duration = j4;
            aVar.Li = c0514a;
        }
        a(adTemplate, 934, aVar, (JSONObject) null);
    }

    private static void d(AdTemplate adTemplate, int i4, JSONObject jSONObject) {
        a(adTemplate, i4, (com.kwad.sdk.core.adlog.c.a) null, jSONObject);
    }

    public static void h(AdTemplate adTemplate, @Nullable JSONObject jSONObject) {
        d(adTemplate, (int) TypedValues.PositionType.TYPE_TRANSITION_EASING, jSONObject);
    }

    public static void b(AdTemplate adTemplate, com.kwad.sdk.core.adlog.c.b bVar, @Nullable JSONObject jSONObject) {
        a(adTemplate, 3, bVar != null ? bVar.Ca() : null, jSONObject);
    }

    public static void b(AdTemplate adTemplate, @Nullable JSONObject jSONObject) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.downloadSource = adTemplate.downloadSource;
        a(adTemplate, 34, aVar, jSONObject);
    }

    @Deprecated
    public static void a(AdTemplate adTemplate, int i4, long j4, @Nullable JSONObject jSONObject) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.aqQ = i4;
        a.C0514a c0514a = new a.C0514a();
        c0514a.duration = j4;
        aVar.Li = c0514a;
        a(adTemplate, 3, aVar, jSONObject);
    }

    public static void b(@Nullable AdTemplate adTemplate, String str, int i4, com.kwad.sdk.core.adlog.c.a aVar) {
        if (aVar == null) {
            aVar = new com.kwad.sdk.core.adlog.c.a();
        }
        aVar.aqX = i4;
        if (!str.equals("")) {
            aVar.aqY = str;
        }
        a(adTemplate, 321, aVar, (JSONObject) null);
    }

    public static void a(AdTemplate adTemplate, int i4, long j4, int i5, long j5, @Nullable JSONObject jSONObject) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.vA = j4;
        aVar.aro = i5;
        aVar.aqQ = i4;
        a.C0514a c0514a = new a.C0514a();
        c0514a.duration = j5;
        aVar.Li = c0514a;
        a(adTemplate, 3, aVar, (JSONObject) null);
    }

    public static void b(@Nullable AdTemplate adTemplate, com.kwad.sdk.core.adlog.c.a aVar) {
        a(adTemplate, 59, aVar, (JSONObject) null);
    }

    @Deprecated
    public static void b(AdTemplate adTemplate, int i4, @Nullable JSONObject jSONObject) {
        d(adTemplate, jSONObject, new com.kwad.sdk.core.adlog.c.b().cM(i4));
    }

    public static void a(AdTemplate adTemplate, @Nullable JSONObject jSONObject) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.downloadSource = adTemplate.downloadSource;
        a(adTemplate, 33, aVar, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AdTemplate adTemplate, com.kwad.sdk.core.adlog.c.b bVar) {
        AdInfo dS = e.dS(adTemplate);
        String str = dS.downloadFilePath;
        if (str == null) {
            return;
        }
        String ax = com.kwad.sdk.core.response.b.a.ax(dS);
        String gP = al.gP(str);
        if (gP == null || TextUtils.isEmpty(gP) || gP.equals(ax)) {
            return;
        }
        bVar.m18do(gP);
        bVar.dn(ax);
        dS.adBaseInfo.appPackageName = gP;
    }

    public static void a(AdTemplate adTemplate, a aVar) {
        com.kwad.sdk.core.adlog.c.a aVar2 = new com.kwad.sdk.core.adlog.c.a();
        aVar2.arc = aVar.toJson().toString();
        a(adTemplate, 40, aVar2, (JSONObject) null);
    }

    public static void a(@Nullable AdTemplate adTemplate, String str, int i4, com.kwad.sdk.core.adlog.c.a aVar) {
        if (aVar == null) {
            aVar = new com.kwad.sdk.core.adlog.c.a();
        }
        aVar.aqX = i4;
        if (!str.equals("")) {
            aVar.aqY = str;
        }
        a(adTemplate, 320, aVar, (JSONObject) null);
    }

    public static void a(@Nullable AdTemplate adTemplate, com.kwad.sdk.core.adlog.c.a aVar) {
        a(adTemplate, 50, aVar, (JSONObject) null);
    }

    public static void a(@Nullable AdTemplate adTemplate, com.kwad.sdk.core.adlog.c.a aVar, long j4) {
        aVar.arj = j4;
        a(adTemplate, 51, aVar, (JSONObject) null);
    }

    public static void a(AdTemplate adTemplate, int i4, @Nullable JSONObject jSONObject) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.aqO = i4;
        a(adTemplate, 402, aVar, jSONObject);
    }

    public static void a(AdTemplate adTemplate, int i4, AdExposureFailedReason adExposureFailedReason) {
        if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
            com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
            aVar.aqU = i4;
            if (adExposureFailedReason != null && i4 == 2) {
                aVar.aqV = adExposureFailedReason.winEcpm;
                try {
                    int i5 = adExposureFailedReason.adnType;
                    aVar.adnType = i5;
                    if (i5 == 2) {
                        aVar.adnName = adExposureFailedReason.adnName;
                    }
                } catch (Throwable unused) {
                }
            }
            a(adTemplate, 809, aVar, (JSONObject) null);
        }
    }

    public static void a(AdTemplate adTemplate, int i4, JSONObject jSONObject, String str) {
        com.kwad.sdk.core.adlog.c.a aVar = new com.kwad.sdk.core.adlog.c.a();
        aVar.Lh = str;
        a(adTemplate, i4, aVar, jSONObject);
    }

    public static boolean a(@Nullable AdTemplate adTemplate, int i4, @Nullable com.kwad.sdk.core.adlog.c.a aVar, @Nullable JSONObject jSONObject) {
        if (adTemplate == null || !bT(adTemplate)) {
            return false;
        }
        if (aVar == null) {
            aVar = new com.kwad.sdk.core.adlog.c.a();
        }
        aVar.arn = com.kwad.sdk.core.response.b.a.aS(e.dS(adTemplate));
        aVar.adxResult = adTemplate.adxResult;
        if (i4 == 2 && aqu) {
            if (aVar.Li == null) {
                aVar.Li = new a.C0514a();
            }
            aVar.Li.aqn = aqt;
        }
        aVar.adTemplate = adTemplate;
        aVar.apT = i4;
        aVar.aqN = jSONObject;
        StringBuilder sb = new StringBuilder();
        sb.append(i4);
        com.kwad.sdk.core.e.c.d("AdReportManager", sb.toString());
        b.a(aVar);
        return true;
    }
}

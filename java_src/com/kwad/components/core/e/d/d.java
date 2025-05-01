package com.kwad.components.core.e.d;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.kwad.components.core.e.d.a;
import com.kwad.sdk.core.download.a.b;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.n.l;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.al;
import com.kwad.sdk.utils.bo;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class d {
    private static boolean LC;
    private static final b LD = new b() { // from class: com.kwad.components.core.e.d.d.3
        long LJ;

        @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
        public final void onBackToBackground() {
            super.onBackToBackground();
            this.LJ = System.currentTimeMillis();
        }

        @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
        public final void onBackToForeground() {
            super.onBackToForeground();
            if (this.LJ != 0) {
                com.kwad.sdk.core.adlog.c.m(getAdTemplate(), System.currentTimeMillis() - this.LJ);
            }
            com.kwad.sdk.core.c.b.En();
            com.kwad.sdk.core.c.b.b((com.kwad.sdk.core.c.c) d.LD);
            setAdTemplate(null);
            this.LJ = 0L;
        }
    };

    public static int a(final a.C0457a c0457a, int i4) {
        Context context = c0457a.getContext();
        final AdTemplate adTemplate = c0457a.getAdTemplate();
        String a5 = a(c0457a, adTemplate);
        if (TextUtils.isEmpty(a5)) {
            return 0;
        }
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        Activity dB = l.dB(context);
        if (dB != null && com.kwad.sdk.core.response.b.a.T(dS) && !c0457a.nZ()) {
            c0457a.ak(1);
            com.kwad.components.core.e.e.e.a(dB, c0457a);
            return 2;
        }
        final String a6 = a(a5, c0457a, dS);
        return com.kwad.sdk.core.download.a.b.a(context, a6, new b.a() { // from class: com.kwad.components.core.e.d.d.1
            @Override // com.kwad.sdk.core.download.a.b.a
            public final void oN() {
                com.kwad.sdk.commercial.f.a.g(AdTemplate.this, a6);
            }

            @Override // com.kwad.sdk.core.download.a.b.a
            public final void onError(Throwable th) {
                com.kwad.sdk.core.adlog.c.b(AdTemplate.this, "", r3, null);
                com.kwad.sdk.commercial.f.a.d(AdTemplate.this, a6, bo.t(th));
            }

            @Override // com.kwad.sdk.core.download.a.b.a
            public final void onPreStart() {
                com.kwad.sdk.commercial.f.a.f(AdTemplate.this, a6);
            }

            @Override // com.kwad.sdk.core.download.a.b.a
            public final void onStart() {
                d.LD.setAdTemplate(AdTemplate.this);
                com.kwad.sdk.core.c.b.En();
                com.kwad.sdk.core.c.b.a(d.LD);
                com.kwad.sdk.core.adlog.c.aqt = d.ai(a6);
                com.kwad.sdk.commercial.f.a.h(AdTemplate.this, a6);
            }

            @Override // com.kwad.sdk.core.download.a.b.a
            public final void onSuccess() {
                com.kwad.sdk.commercial.f.a.i(AdTemplate.this, a6);
                com.kwad.sdk.core.adlog.c.a(AdTemplate.this, "", r3, c0457a.ok());
                d.a(AdTemplate.this, a6, r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject ai(String str) {
        try {
            return new JSONObject(Uri.parse(str).getQueryParameter("universeClientInfo"));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void ax(boolean z4) {
        com.kwad.sdk.core.adlog.c.aqu = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ay(boolean z4) {
        LC = z4;
    }

    private static String l(String str, String str2) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("returnBack", "liveunion_" + ServiceProvider.getAppId());
        if (TextUtils.isEmpty(str2)) {
            str2 = "0";
        }
        return appendQueryParameter.appendQueryParameter("back_url", str2).toString();
    }

    private static boolean oL() {
        return LC;
    }

    private static String b(a.C0457a c0457a, AdInfo adInfo, String str) {
        long j4 = c0457a.getAdTemplate().getmCurPlayTime();
        if (j4 > 0) {
            j4 = Math.max(j4 - com.kwad.sdk.core.response.b.a.bl(adInfo), 0L);
        }
        return Uri.parse(str).buildUpon().appendQueryParameter("playStartTime", String.valueOf(j4)).toString();
    }

    private static String a(String str, a.C0457a c0457a, AdInfo adInfo) {
        AdTemplate adTemplate = c0457a.getAdTemplate();
        if (com.kwad.sdk.core.response.b.a.bk(adInfo)) {
            str = b(c0457a, adInfo, str);
        }
        if (com.kwad.sdk.core.response.b.a.cM(adInfo)) {
            str = a(c0457a, adInfo, str);
        }
        return ((com.kwad.sdk.core.response.b.a.cE(adInfo) || com.kwad.sdk.core.response.b.a.cK(adInfo)) && adTemplate.mAdScene != null) ? a(str, c0457a.getContext(), adTemplate.mAdScene) : str;
    }

    private static String a(a.C0457a c0457a, AdTemplate adTemplate) {
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        for (AdInfo.AdConversionInfo.DeeplinkItemInfo deeplinkItemInfo : dS.adConversionInfo.deeplinkConf) {
            boolean contains = deeplinkItemInfo.areaConf.contains(Integer.valueOf(c0457a.cY()));
            boolean contains2 = deeplinkItemInfo.sceneConf.contains(Integer.valueOf(c0457a.od()));
            if ((contains && contains2) || ((contains && deeplinkItemInfo.sceneConf.size() == 0) || (contains2 && deeplinkItemInfo.areaConf.size() == 0))) {
                if (!TextUtils.isEmpty(deeplinkItemInfo.url)) {
                    return deeplinkItemInfo.url + dS.adConversionInfo.deeplinkExtra;
                }
            }
        }
        return com.kwad.sdk.core.response.b.a.cO(dS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final AdTemplate adTemplate, final String str, final int i4) {
        if (oL()) {
            return;
        }
        ay(true);
        int CC = com.kwad.sdk.core.config.d.CC();
        com.kwad.sdk.core.config.d.CD();
        int abs = Math.abs(CC);
        if (abs > 0) {
            bo.a(new Runnable() { // from class: com.kwad.components.core.e.d.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    d.ay(false);
                    com.kwad.sdk.core.c.b.En();
                    if (com.kwad.sdk.core.c.b.isAppOnForeground()) {
                        return;
                    }
                    com.kwad.sdk.core.adlog.c.c(AdTemplate.this, "", i4);
                    com.kwad.sdk.commercial.f.a.j(AdTemplate.this, str);
                }
            }, null, abs * 1000);
        } else {
            ay(false);
        }
    }

    private static String a(a.C0457a c0457a, AdInfo adInfo, String str) {
        String str2;
        if (com.kwad.sdk.core.response.b.a.bh(adInfo)) {
            String str3 = null;
            Callable<String> nY = c0457a.nY();
            if (nY != null) {
                try {
                    str3 = nY.call();
                } catch (Exception unused) {
                }
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = c0457a.nX();
            }
            if (TextUtils.isEmpty(str3)) {
                return (str.contains("__itemId__") || str.contains("__simpleItemId__")) ? com.kwad.sdk.core.response.b.a.cO(adInfo) : str;
            }
            try {
                str2 = String.valueOf(com.kwad.components.core.e.b.a.ad(str3));
            } catch (Throwable unused2) {
                str2 = str3;
            }
            return str.replaceAll("__itemId__", str3).replaceAll("__simpleItemId__", str2);
        }
        return str;
    }

    private static String a(String str, Context context, SceneImpl sceneImpl) {
        if (sceneImpl != null) {
            int i4 = 0;
            if (!al.an(context, "com.smile.gifmaker") && al.an(context, "com.kuaishou.nebula")) {
                i4 = 3;
            }
            String backUrl = sceneImpl.getBackUrl();
            return a(str, i4, TextUtils.isEmpty(backUrl) ? "" : backUrl);
        }
        return "";
    }

    private static String a(String str, int i4, String str2) {
        return TextUtils.isEmpty(str2) ? str : (i4 == 0 || i4 == 3) ? l(str, str2) : str;
    }
}

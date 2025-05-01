package com.kwad.components.ad.splashscreen;

import android.text.TextUtils;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes5.dex */
public final class d {
    public static int Cj;
    private String Ck;
    private int Cl = 2;

    private void T(String str) {
        this.Ck = str;
    }

    private void V(int i4) {
        this.Cl = i4;
    }

    public static d a(AdTemplate adTemplate, AdInfo adInfo, com.kwad.components.core.e.d.c cVar, int i4) {
        d dVar = new d();
        Cj = i4;
        if (adInfo != null && cVar != null) {
            if (i4 != 1 && i4 != 4) {
                if (com.kwad.sdk.core.response.b.a.aE(adInfo)) {
                    int ov = cVar.ov();
                    dVar.T("或点击" + a(adTemplate, adInfo, ov, 0));
                } else {
                    String a5 = com.kwad.sdk.core.config.d.a(com.kwad.components.ad.splashscreen.b.a.CQ);
                    if (TextUtils.isEmpty(a5)) {
                        a5 = "点击跳转详情页或第三方应用";
                    }
                    dVar.T("或" + a5);
                }
            } else {
                dVar.T(a(adTemplate, adInfo, cVar));
            }
        }
        dVar.V(com.kwad.sdk.core.response.b.b.dz(adInfo));
        return dVar;
    }

    public final String kv() {
        return this.Ck;
    }

    public final int kw() {
        return this.Cl;
    }

    public static String a(AdTemplate adTemplate, AdInfo adInfo, int i4, int i5) {
        String aD = com.kwad.sdk.core.response.b.a.aD(adInfo);
        if (i4 == 2) {
            return i5 + "%";
        } else if (i4 != 4) {
            if (i4 != 8) {
                return i4 != 12 ? aD : com.kwad.sdk.core.response.b.a.ab(adInfo);
            }
            return com.kwad.sdk.core.response.b.a.ca(adTemplate);
        } else {
            return "继续下载";
        }
    }

    private static String a(AdInfo adInfo, int i4) {
        return i4 == 1 ? com.kwad.sdk.core.response.b.b.dt(adInfo) != null ? com.kwad.sdk.core.response.b.b.dt(adInfo) : "" : (i4 != 4 || com.kwad.sdk.core.response.b.b.du(adInfo) == null) ? "" : com.kwad.sdk.core.response.b.b.du(adInfo);
    }

    private static String a(AdTemplate adTemplate, AdInfo adInfo, com.kwad.components.core.e.d.c cVar) {
        if (com.kwad.sdk.core.response.b.a.aE(adInfo)) {
            return a(adTemplate, adInfo, cVar.ov(), 0);
        }
        String a5 = a(adInfo, Cj);
        return TextUtils.isEmpty(a5) ? "点击跳转详情页或第三方应用" : a5;
    }
}

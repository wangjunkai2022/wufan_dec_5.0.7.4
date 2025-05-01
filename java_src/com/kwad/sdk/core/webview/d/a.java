package com.kwad.sdk.core.webview.d;

import android.content.Context;
import androidx.annotation.NonNull;
import com.ksad.json.annotation.KsJson;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.components.c;
import com.kwad.sdk.components.g;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.f;
import com.kwad.sdk.utils.ah;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.k;
import com.kwad.sdk.utils.y;
/* loaded from: classes5.dex */
public final class a implements com.kwad.sdk.core.webview.c.a {

    @KsJson
    /* renamed from: com.kwad.sdk.core.webview.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0530a extends com.kwad.sdk.core.response.a.a {
        public int XA;
        public String XB;
        public int XC;
        public String XD;
        public String XE;
        public String XF;
        public int XG;
        public String XH;

        /* renamed from: XI  reason: collision with root package name */
        public int f55903XI;
        public String XJ;
        public String XK;
        public int XL;
        public int XM;
        public int XN;
        public int XO;
        public String Xz;
        public String aAB;
        public String aAG;
        public String aAH;
        public String aAS;
        public String aFT;
        public String aFU;
        public boolean aFV;
        public String aFW;
        public String appId;
        public String appName;
        public String appVersion;
        public String aux;
        public String auy;
        public String azQ;
        public String model;
        public int sdkType;

        public static C0530a HL() {
            C0530a c0530a = new C0530a();
            c0530a.Xz = BuildConfig.VERSION_NAME;
            c0530a.XA = BuildConfig.VERSION_CODE;
            c0530a.azQ = "6.0.7";
            c0530a.aFW = "1.3";
            c0530a.XB = ((f) ServiceProvider.get(f.class)).getApiVersion();
            c0530a.XC = ((f) ServiceProvider.get(f.class)).getApiVersionCode();
            c0530a.sdkType = 1;
            Context context = ((f) ServiceProvider.get(f.class)).getContext();
            c0530a.appVersion = k.cd(context);
            c0530a.appName = ((f) ServiceProvider.get(f.class)).getAppName();
            c0530a.appId = ((f) ServiceProvider.get(f.class)).getAppId();
            c0530a.aFT = "";
            c0530a.aAH = y.Mt();
            g gVar = (g) c.f(g.class);
            if (gVar != null) {
                c0530a.aAG = gVar.oV();
            }
            c0530a.XD = String.valueOf(ah.cx(context));
            c0530a.XE = bj.NR();
            c0530a.model = bj.NI();
            c0530a.XF = bj.NK();
            c0530a.XG = 1;
            c0530a.XH = bj.getOsVersion();
            c0530a.f55903XI = bj.NU();
            c0530a.XJ = bj.getLanguage();
            c0530a.XK = bj.getLocale();
            c0530a.aFV = ((f) ServiceProvider.get(f.class)).yV();
            c0530a.aFU = aw.getDeviceId();
            c0530a.XL = bj.getScreenWidth(context);
            c0530a.XM = bj.getScreenHeight(context);
            c0530a.aux = aw.cI(context);
            c0530a.auy = aw.getOaid();
            c0530a.aAB = aw.cJ(context);
            c0530a.aAS = aw.cK(context);
            c0530a.XN = com.kwad.sdk.c.a.a.getStatusBarHeight(context);
            c0530a.XO = com.kwad.sdk.c.a.a.a(context, 50.0f);
            return c0530a;
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, @NonNull com.kwad.sdk.core.webview.c.c cVar) {
        cVar.a(C0530a.HL());
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @NonNull
    public final String getKey() {
        return "getDeviceInfo";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}

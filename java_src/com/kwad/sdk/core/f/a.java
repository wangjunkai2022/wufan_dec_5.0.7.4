package com.kwad.sdk.core.f;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.kwad.sdk.core.f.a.b;
import com.kwad.sdk.core.f.a.c;
import com.kwad.sdk.core.f.a.d;
import com.kwad.sdk.core.f.a.e;
import com.kwad.sdk.core.f.a.f;
import com.kwad.sdk.core.f.a.g;
import com.kwad.sdk.core.f.a.h;
import com.kwad.sdk.core.f.a.i;
import com.kwad.sdk.core.f.a.j;
import com.kwad.sdk.oaid.OADIDSDKHelper;
import com.kwad.sdk.oaid.OADIDSDKHelper25;
import com.kwad.sdk.utils.av;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.o;
import com.kwad.sdk.utils.y;
import com.ss.android.download.api.constant.BaseConstants;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public final class a {
    private static String ayi = "";
    private static final AtomicBoolean ayj = new AtomicBoolean();
    private static final AtomicBoolean ayk = new AtomicBoolean();
    private static boolean sGetOaidFail;

    private static String Fd() {
        if (ayk.getAndSet(true)) {
            return ayi;
        }
        String h4 = y.h("ksadsdk_pref", "kasd_oaid_key", "");
        ayi = h4;
        return h4;
    }

    static /* synthetic */ String Fe() {
        return Fd();
    }

    static /* synthetic */ void Ff() {
    }

    public static String bp(Context context) {
        if (av.Na() && !TextUtils.isEmpty(av.Nb())) {
            return av.Nb();
        }
        if (!TextUtils.isEmpty(ayi)) {
            return ayi;
        }
        if (!av.Na() && o.LS()) {
            initAsync(context);
            return ayi;
        }
        String Fd = Fd();
        ayi = Fd;
        return Fd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bq(Context context) {
        if (!TextUtils.isEmpty(ayi) || context == null || sGetOaidFail) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String upperCase = Build.MANUFACTURER.toUpperCase();
            char c5 = 65535;
            switch (upperCase.hashCode()) {
                case -2053026509:
                    if (upperCase.equals("LENOVO")) {
                        c5 = 6;
                        break;
                    }
                    break;
                case -1712043046:
                    if (upperCase.equals("SAMSUNG")) {
                        c5 = '\n';
                        break;
                    }
                    break;
                case -1706170181:
                    if (upperCase.equals("XIAOMI")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -1134767290:
                    if (upperCase.equals("BLACKSHARK")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case -602397472:
                    if (upperCase.equals("ONEPLUS")) {
                        c5 = 4;
                        break;
                    }
                    break;
                case 89163:
                    if (upperCase.equals("ZTE")) {
                        c5 = '\f';
                        break;
                    }
                    break;
                case 2018896:
                    if (upperCase.equals("ASUS")) {
                        c5 = 11;
                        break;
                    }
                    break;
                case 2432928:
                    if (upperCase.equals(BaseConstants.ROM_OPPO_UPPER_CONSTANT)) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 2555124:
                    if (upperCase.equals("SSUI")) {
                        c5 = 14;
                        break;
                    }
                    break;
                case 2634924:
                    if (upperCase.equals("VIVO")) {
                        c5 = 5;
                        break;
                    }
                    break;
                case 73239724:
                    if (upperCase.equals("MEIZU")) {
                        c5 = '\b';
                        break;
                    }
                    break;
                case 74632627:
                    if (upperCase.equals("NUBIA")) {
                        c5 = '\t';
                        break;
                    }
                    break;
                case 630905871:
                    if (upperCase.equals("MOTOLORA")) {
                        c5 = 7;
                        break;
                    }
                    break;
                case 976565563:
                    if (upperCase.equals("FERRMEOS")) {
                        c5 = '\r';
                        break;
                    }
                    break;
                case 2141820391:
                    if (upperCase.equals("HUAWEI")) {
                        c5 = 0;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    ayi = new b(applicationContext).getOAID();
                    break;
                case 1:
                case 2:
                    ayi = new i(applicationContext).getOAID();
                    break;
                case 3:
                case 4:
                    ayi = new f(applicationContext).getOAID();
                    break;
                case 5:
                    ayi = new h(applicationContext).getOAID();
                    break;
                case 6:
                case 7:
                    ayi = new c(applicationContext).getOAID();
                    break;
                case '\b':
                    ayi = new d(applicationContext).getOAID();
                    break;
                case '\t':
                    ayi = new e(applicationContext).getOAID();
                    break;
                case '\n':
                    ayi = new g(applicationContext).getOAID();
                    break;
                case 11:
                    ayi = new com.kwad.sdk.core.f.a.a(applicationContext).getOAID();
                    break;
                case '\f':
                case '\r':
                case 14:
                    ayi = new j(applicationContext).getOAID();
                    break;
            }
            com.kwad.sdk.core.e.c.i("OAIDHelper", "manufacturer:" + upperCase + "--OAID:" + ayi);
            if (TextUtils.isEmpty(ayi)) {
                sGetOaidFail = true;
            }
            et(ayi);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void et(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        y.g("ksadsdk_pref", "kasd_oaid_key", str);
    }

    private static void initAsync(final Context context) {
        if (context == null || ayj.getAndSet(true)) {
            return;
        }
        com.kwad.sdk.utils.g.execute(new az() { // from class: com.kwad.sdk.core.f.a.1
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                String unused = a.ayi = a.Fe();
                if (TextUtils.isEmpty(a.ayi)) {
                    a.bq(context);
                    if (OADIDSDKHelper.isSupport()) {
                        OADIDSDKHelper.getOAId(context, new OADIDSDKHelper.a() { // from class: com.kwad.sdk.core.f.a.1.1
                            @Override // com.kwad.sdk.oaid.OADIDSDKHelper.a
                            public final void ew(String str) {
                                String unused2 = a.ayi = str;
                                a.et(str);
                                a.Ff();
                            }
                        });
                    } else if (OADIDSDKHelper25.isSupport()) {
                        OADIDSDKHelper25.getOAId(context, new OADIDSDKHelper25.a() { // from class: com.kwad.sdk.core.f.a.1.2
                            @Override // com.kwad.sdk.oaid.OADIDSDKHelper25.a
                            public final void ew(String str) {
                                String unused2 = a.ayi = str;
                                a.et(str);
                                a.Ff();
                            }
                        });
                    }
                    a.ayj.set(false);
                }
            }
        });
    }
}

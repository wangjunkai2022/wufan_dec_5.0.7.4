package com.beizi.ad.internal.utilities;

import android.content.Context;
import android.text.TextUtils;
import com.beizi.ad.c.b;
import com.beizi.ad.internal.g;
import com.beizi.ad.internal.h;
import com.beizi.ad.lance.a.c;
import java.net.InetAddress;
import java.net.UnknownHostException;
/* loaded from: classes2.dex */
public class UrlUtil {
    public static String CLT_TYPE = "__CLT__";
    public static String CLT_TYPE_999 = "__CLT-999__";
    public static String E_TS_E = ".EVENT_TS_END.";
    public static String E_TS_S = ".EVENT_TS_START.";
    public static String RAW_X_DOWN = ".SCRN_CLK_PT_DOWN_X.";
    public static String RAW_X_DOWN_DP = ".SCRN_CLK_PT_DOWN_X_DP.";
    public static String RAW_X_UP = ".SCRN_CLK_PT_UP_X.";
    public static String RAW_X_UP_DP = ".SCRN_CLK_PT_UP_X_DP.";
    public static String RAW_Y_DOWN = ".SCRN_CLK_PT_DOWN_Y.";
    public static String RAW_Y_DOWN_DP = ".SCRN_CLK_PT_DOWN_Y_DP.";
    public static String RAW_Y_UP = ".SCRN_CLK_PT_UP_Y.";
    public static String RAW_Y_UP_DP = ".SCRN_CLK_PT_UP_Y_DP.";
    public static String TS = ".UTC_TS.";
    public static String V_D = ".VIDEO_DURATION.";
    public static String X_DOWN = ".AD_CLK_PT_DOWN_X.";
    public static String X_DOWN_DP = ".AD_CLK_PT_DOWN_X_DP.";
    public static String X_UP = ".AD_CLK_PT_UP_X.";
    public static String X_UP_DP = ".AD_CLK_PT_UP_X_DP.";
    public static String Y_DOWN = ".AD_CLK_PT_DOWN_Y.";
    public static String Y_DOWN_DP = ".AD_CLK_PT_DOWN_Y_DP.";
    public static String Y_UP = ".AD_CLK_PT_UP_Y.";
    public static String Y_UP_DP = ".AD_CLK_PT_UP_Y_DP.";

    /* loaded from: classes2.dex */
    private static class DNSResolver implements Runnable {
        private String domain;
        private InetAddress inetAddr;

        public DNSResolver(String str) {
            this.domain = str;
        }

        public synchronized InetAddress get() {
            return this.inetAddr;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                set(InetAddress.getByName(this.domain));
            } catch (UnknownHostException unused) {
            }
        }

        public synchronized void set(InetAddress inetAddress) {
            this.inetAddr = inetAddress;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static boolean isSendTouchEventUrl(String str) {
        ?? contains = str.contains(X_DOWN);
        int i4 = contains;
        if (str.contains(Y_DOWN)) {
            i4 = contains + 1;
        }
        int i5 = i4;
        if (str.contains(X_UP)) {
            i5 = i4 + 1;
        }
        int i6 = i5;
        if (str.contains(Y_UP)) {
            i6 = i5 + 1;
        }
        int i7 = i6;
        if (str.contains(RAW_X_DOWN)) {
            i7 = i6 + 1;
        }
        int i8 = i7;
        if (str.contains(RAW_Y_DOWN)) {
            i8 = i7 + 1;
        }
        int i9 = i8;
        if (str.contains(RAW_X_UP)) {
            i9 = i8 + 1;
        }
        int i10 = i9;
        if (str.contains(RAW_Y_UP)) {
            i10 = i9 + 1;
        }
        int i11 = i10;
        if (str.contains(TS)) {
            i11 = i10 + 1;
        }
        return i11 == 9;
    }

    public static String px2dip(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str) && !str.equals("-999") && !str.equals("0")) {
                return String.valueOf((int) ((((float) Double.parseDouble(str)) / context.getResources().getDisplayMetrics().density) + 0.5f));
            }
            return str;
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    public static String replaceToTouchEventUrl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (!TextUtils.isEmpty(str)) {
            if (str.contains(X_DOWN)) {
                str = str.replace(X_DOWN, str2);
            }
            if (str.contains(Y_DOWN)) {
                str = str.replace(Y_DOWN, str3);
            }
            if (str.contains(X_UP)) {
                str = str.replace(X_UP, str2);
            }
            if (str.contains(Y_UP)) {
                str = str.replace(Y_UP, str3);
            }
            if (str.contains(RAW_X_DOWN)) {
                str = str.replace(RAW_X_DOWN, str4);
            }
            if (str.contains(RAW_Y_DOWN)) {
                str = str.replace(RAW_Y_DOWN, str5);
            }
            if (str.contains(RAW_X_UP)) {
                str = str.replace(RAW_X_UP, str4);
            }
            if (str.contains(RAW_Y_UP)) {
                str = str.replace(RAW_Y_UP, str5);
            }
            if (str.contains(TS)) {
                str = str.replace(TS, String.valueOf(System.currentTimeMillis()));
            }
            if (str.contains(E_TS_S)) {
                str = str.replace(E_TS_S, str6);
            }
            if (str.contains(E_TS_E)) {
                str = str.replace(E_TS_E, str7);
            }
            return str.contains(V_D) ? str.replace(V_D, str8) : str;
        }
        throw new IllegalArgumentException("url must no null");
    }

    public static void sendClickInfoToServerWithReplace(b.h hVar, String str, String str2, String str3, String str4) {
        String b5 = hVar.b();
        if (TextUtils.isEmpty(b5)) {
            return;
        }
        new h(replaceToTouchEventUrl(b5, str, str2, str3, str4, "", "", "")).executeOnExecutor(c.b().d(), new Void[0]);
    }

    public static void sendOnCompletionInfoToServer(b.h hVar) {
        String f5 = hVar.f();
        if (TextUtils.isEmpty(f5)) {
            return;
        }
        new h(replaceToTouchEventUrl(f5, "", "", "", "", "", "", "")).executeOnExecutor(c.b().d(), new Void[0]);
    }

    public static void sendOnPauseInfoToServer(b.h hVar) {
        String e5 = hVar.e();
        if (TextUtils.isEmpty(e5)) {
            return;
        }
        new h(replaceToTouchEventUrl(e5, "", "", "", "", "", "", "")).executeOnExecutor(c.b().d(), new Void[0]);
    }

    public static void sendOnStartInfoToServer(b.h hVar) {
        String d5 = hVar.d();
        if (TextUtils.isEmpty(d5)) {
            return;
        }
        new h(replaceToTouchEventUrl(d5, "", "", "", "", "", "", "")).executeOnExecutor(c.b().d(), new Void[0]);
    }

    public static void sendViewShowInfoToServer(b.h hVar) {
        String a5 = hVar.a();
        if (TextUtils.isEmpty(a5)) {
            return;
        }
        new h(replaceToTouchEventUrl(a5, "", "", "", "", "", "", "")).executeOnExecutor(c.b().d(), new Void[0]);
    }

    public static boolean testDNS(String str) {
        try {
            DNSResolver dNSResolver = new DNSResolver("api.htp.ad-scope.com.cn");
            Thread thread = new Thread(dNSResolver);
            thread.start();
            thread.join(1500L);
            return dNSResolver.get() != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String replaceToTouchEventUrl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i4) {
        if (!TextUtils.isEmpty(str)) {
            if (i4 == 2) {
                if (str.contains(CLT_TYPE)) {
                    str2 = "0";
                    str3 = str2;
                    str4 = str3;
                    str5 = str4;
                }
                if (str.contains(CLT_TYPE_999)) {
                    str2 = "-999";
                    str3 = str2;
                    str4 = str3;
                    str5 = str4;
                }
            }
            if (str.contains(X_DOWN)) {
                str = str.replace(X_DOWN, str2);
            }
            if (str.contains(Y_DOWN)) {
                str = str.replace(Y_DOWN, str3);
            }
            if (str.contains(X_UP)) {
                str = str.replace(X_UP, str2);
            }
            if (str.contains(Y_UP)) {
                str = str.replace(Y_UP, str3);
            }
            if (str.contains(RAW_X_DOWN)) {
                str = str.replace(RAW_X_DOWN, str4);
            }
            if (str.contains(RAW_Y_DOWN)) {
                str = str.replace(RAW_Y_DOWN, str5);
            }
            if (str.contains(RAW_X_UP)) {
                str = str.replace(RAW_X_UP, str4);
            }
            if (str.contains(RAW_Y_UP)) {
                str = str.replace(RAW_Y_UP, str5);
            }
            if (str.contains(X_DOWN_DP)) {
                str = str.replace(X_DOWN_DP, px2dip(g.a().f5898i, str2));
            }
            if (str.contains(Y_DOWN_DP)) {
                str = str.replace(Y_DOWN_DP, px2dip(g.a().f5898i, str3));
            }
            if (str.contains(X_UP_DP)) {
                str = str.replace(X_UP_DP, px2dip(g.a().f5898i, str2));
            }
            if (str.contains(Y_UP_DP)) {
                str = str.replace(Y_UP_DP, px2dip(g.a().f5898i, str3));
            }
            if (str.contains(RAW_X_DOWN_DP)) {
                str = str.replace(RAW_X_DOWN_DP, px2dip(g.a().f5898i, str4));
            }
            if (str.contains(RAW_Y_DOWN_DP)) {
                str = str.replace(RAW_Y_DOWN_DP, px2dip(g.a().f5898i, str5));
            }
            if (str.contains(RAW_X_UP_DP)) {
                str = str.replace(RAW_X_UP_DP, px2dip(g.a().f5898i, str4));
            }
            if (str.contains(RAW_Y_UP_DP)) {
                str = str.replace(RAW_Y_UP_DP, px2dip(g.a().f5898i, str5));
            }
            if (str.contains(CLT_TYPE)) {
                str = str.replace(CLT_TYPE, String.valueOf(i4));
            }
            if (str.contains(CLT_TYPE_999)) {
                str = str.replace(CLT_TYPE_999, String.valueOf(i4));
            }
            if (str.contains(TS)) {
                str = str.replace(TS, String.valueOf(System.currentTimeMillis()));
            }
            if (str.contains(E_TS_S)) {
                str = str.replace(E_TS_S, str6);
            }
            if (str.contains(E_TS_E)) {
                str = str.replace(E_TS_E, str7);
            }
            return str.contains(V_D) ? str.replace(V_D, str8) : str;
        }
        throw new IllegalArgumentException("url must no null");
    }

    public static String replaceToTouchEventUrl(String str, com.beizi.ad.c.c cVar, String str2, String str3, String str4) {
        if (str.contains(X_DOWN) && !TextUtils.isEmpty(cVar.a())) {
            str = str.replace(X_DOWN, cVar.a());
        }
        if (str.contains(Y_DOWN) && !TextUtils.isEmpty(cVar.b())) {
            str = str.replace(Y_DOWN, cVar.b());
        }
        if (str.contains(X_UP) && !TextUtils.isEmpty(cVar.e())) {
            str = str.replace(X_UP, cVar.e());
        }
        if (str.contains(Y_UP) && !TextUtils.isEmpty(cVar.f())) {
            str = str.replace(Y_UP, cVar.f());
        }
        if (str.contains(RAW_X_DOWN) && !TextUtils.isEmpty(cVar.c())) {
            str = str.replace(RAW_X_DOWN, cVar.c());
        }
        if (str.contains(RAW_Y_DOWN) && !TextUtils.isEmpty(cVar.d())) {
            str = str.replace(RAW_Y_DOWN, cVar.d());
        }
        if (str.contains(RAW_X_UP) && !TextUtils.isEmpty(cVar.g())) {
            str = str.replace(RAW_X_UP, cVar.g());
        }
        if (str.contains(RAW_Y_UP) && !TextUtils.isEmpty(cVar.h())) {
            str = str.replace(RAW_Y_UP, cVar.h());
        }
        if (str.contains(X_DOWN_DP) && !TextUtils.isEmpty(cVar.a())) {
            str = str.replace(X_DOWN_DP, px2dip(g.a().f5898i, cVar.a()));
        }
        if (str.contains(Y_DOWN_DP) && !TextUtils.isEmpty(cVar.b())) {
            str = str.replace(Y_DOWN_DP, px2dip(g.a().f5898i, cVar.b()));
        }
        if (str.contains(X_UP_DP) && !TextUtils.isEmpty(cVar.e())) {
            str = str.replace(X_UP_DP, px2dip(g.a().f5898i, cVar.e()));
        }
        if (str.contains(Y_UP_DP) && !TextUtils.isEmpty(cVar.f())) {
            str = str.replace(Y_UP_DP, px2dip(g.a().f5898i, cVar.f()));
        }
        if (str.contains(RAW_X_DOWN_DP) && !TextUtils.isEmpty(cVar.c())) {
            str = str.replace(RAW_X_DOWN_DP, px2dip(g.a().f5898i, cVar.c()));
        }
        if (str.contains(RAW_Y_DOWN_DP) && !TextUtils.isEmpty(cVar.d())) {
            str = str.replace(RAW_Y_DOWN_DP, px2dip(g.a().f5898i, cVar.d()));
        }
        if (str.contains(RAW_X_UP_DP) && !TextUtils.isEmpty(cVar.g())) {
            str = str.replace(RAW_X_UP_DP, px2dip(g.a().f5898i, cVar.g()));
        }
        return (!str.contains(RAW_Y_UP_DP) || TextUtils.isEmpty(cVar.h())) ? str : str.replace(RAW_Y_UP_DP, px2dip(g.a().f5898i, cVar.h()));
    }

    public static String replaceToTouchEventUrl(String str, com.beizi.ad.c.c cVar, String str2, String str3, String str4, int i4) {
        if (!TextUtils.isEmpty(str)) {
            if (i4 != 2 && i4 != 5) {
                str = replaceToTouchEventUrl(str, cVar, str2, str3, str4);
            } else {
                com.beizi.ad.c.c cVar2 = new com.beizi.ad.c.c();
                if (str.contains(CLT_TYPE)) {
                    cVar2.a("0");
                    cVar2.b("0");
                    cVar2.c("0");
                    cVar2.d("0");
                    cVar2.e("0");
                    cVar2.f("0");
                    cVar2.g("0");
                    cVar2.h("0");
                    str = replaceToTouchEventUrl(str, cVar2, str2, str3, str4);
                }
                if (str.contains(CLT_TYPE_999)) {
                    cVar2.a("-999");
                    cVar2.b("-999");
                    cVar2.c("-999");
                    cVar2.d("-999");
                    cVar2.e("-999");
                    cVar2.f("-999");
                    cVar2.g("-999");
                    cVar2.h("-999");
                    str = replaceToTouchEventUrl(str, cVar2, str2, str3, str4);
                }
            }
            if (str.contains(CLT_TYPE)) {
                str = str.replace(CLT_TYPE, String.valueOf(i4));
            }
            if (str.contains(CLT_TYPE_999)) {
                str = str.replace(CLT_TYPE_999, String.valueOf(i4));
            }
            if (str.contains(TS)) {
                str = str.replace(TS, String.valueOf(System.currentTimeMillis()));
            }
            if (str.contains(E_TS_S)) {
                str = str.replace(E_TS_S, str2);
            }
            if (str.contains(E_TS_E)) {
                str = str.replace(E_TS_E, str3);
            }
            return str.contains(V_D) ? str.replace(V_D, str4) : str;
        }
        throw new IllegalArgumentException("url must no null");
    }
}

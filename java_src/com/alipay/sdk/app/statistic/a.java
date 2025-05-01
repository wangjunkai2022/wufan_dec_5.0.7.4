package com.alipay.sdk.app.statistic;

import android.content.Context;
import android.text.TextUtils;
import com.j256.ormlite.stmt.query.SimpleComparison;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static c f4724a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f4725b = "alipay_cashier_statistic_record";

    public static void a(Context context) {
        if (f4724a != null) {
            return;
        }
        f4724a = new c(context);
    }

    public static synchronized void b(Context context, String str) {
        String str2;
        String str3;
        String format;
        synchronized (a.class) {
            c cVar = f4724a;
            if (cVar == null) {
                return;
            }
            if (TextUtils.isEmpty(cVar.f4752i)) {
                format = "";
            } else {
                String[] split = str.split(m.a.f71490d);
                if (split != null) {
                    str2 = null;
                    str3 = null;
                    for (String str4 : split) {
                        String[] split2 = str4.split(SimpleComparison.EQUAL_TO_OPERATION);
                        if (split2 != null && split2.length == 2) {
                            if (split2[0].equalsIgnoreCase("partner")) {
                                split2[1].replace(m.a.f71493g, "");
                            } else if (split2[0].equalsIgnoreCase("out_trade_no")) {
                                str2 = split2[1].replace(m.a.f71493g, "");
                            } else if (split2[0].equalsIgnoreCase(c.f4743z)) {
                                str3 = split2[1].replace(m.a.f71493g, "");
                            }
                        }
                    }
                } else {
                    str2 = null;
                    str3 = null;
                }
                String b5 = c.b(str3);
                String b6 = c.b(str2);
                String format2 = String.format("%s,%s,-,%s,-,-,-", b5, b6, c.b(b6));
                cVar.f4745b = format2;
                format = String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", cVar.f4744a, format2, cVar.f4746c, cVar.f4747d, cVar.f4748e, cVar.f4749f, cVar.f4750g, cVar.f4751h, cVar.f4752i, cVar.f4753j);
            }
            new Thread(new b(context, format)).start();
            f4724a = null;
        }
    }

    public static void c(String str, String str2, String str3) {
        c cVar = f4724a;
        if (cVar == null) {
            return;
        }
        cVar.d(str, str2, str3);
    }

    public static void d(String str, String str2, Throwable th) {
        c cVar = f4724a;
        if (cVar == null) {
            return;
        }
        cVar.e(str, str2, th);
    }

    public static void e(String str, Throwable th) {
        if (f4724a == null || th == null) {
            return;
        }
        f4724a.e(str, th.getClass().getSimpleName(), th);
    }

    private static void f(Context context, String str) {
        new Thread(new b(context, str)).start();
    }
}

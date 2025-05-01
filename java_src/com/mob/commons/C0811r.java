package com.mob.commons;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.mob.commons.r  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0811r {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f56456a = null;

    /* renamed from: b  reason: collision with root package name */
    public static volatile String f56457b = null;

    /* renamed from: c  reason: collision with root package name */
    public static volatile String f56458c = null;

    /* renamed from: d  reason: collision with root package name */
    public static volatile String f56459d = null;

    /* renamed from: e  reason: collision with root package name */
    public static volatile InternationalDomain f56460e = null;

    /* renamed from: f  reason: collision with root package name */
    public static volatile boolean f56461f = false;

    /* renamed from: g  reason: collision with root package name */
    public static volatile boolean f56462g = false;

    /* renamed from: h  reason: collision with root package name */
    public static volatile boolean f56463h = true;

    /* renamed from: i  reason: collision with root package name */
    public static volatile boolean f56464i;

    /* renamed from: j  reason: collision with root package name */
    public static volatile String f56465j;

    /* renamed from: k  reason: collision with root package name */
    private static AtomicBoolean f56466k = new AtomicBoolean(false);

    /* renamed from: l  reason: collision with root package name */
    private static final String f56467l = b("0090gbcjeedkekhbckce@h");

    /* renamed from: m  reason: collision with root package name */
    private static final String f56468m = b("011.dk6gcZciIe;dkekhbckceSh");

    /* renamed from: n  reason: collision with root package name */
    private static final String f56469n = b("0108gbcjeefkcfeh?gEckce3h");

    /* renamed from: o  reason: collision with root package name */
    private static final String f56470o = b("012ZdkHebDfj[eEcichdedbckce h");

    /* renamed from: p  reason: collision with root package name */
    private static final String f56471p = b("009Ddkgbdkdkekhbckce^h");

    /* renamed from: q  reason: collision with root package name */
    private static final String f56472q = b("010Vgbcjeeedch3dHdgckce(h");

    /* renamed from: r  reason: collision with root package name */
    private static HashMap<String, HashMap<String, Object>> f56473r = new HashMap<>();

    public static void a(Context context) {
        try {
            if (f56466k.compareAndSet(false, true)) {
                try {
                    if (f56456a == null) {
                        String str = (String) MobMeta.get(null, b("010;gbcjeegjecSiiDhb0e?db"), String.class, null);
                        if (!TextUtils.isEmpty(str)) {
                            f56456a = str;
                            f56458c = str;
                            ab.a().e(str);
                        } else {
                            String k4 = ab.a().k();
                            if (TextUtils.isEmpty(k4)) {
                                k4 = x.i();
                            }
                            if (!TextUtils.isEmpty(k4)) {
                                f56458c = k4;
                                ab.a().e(k4);
                            }
                        }
                    }
                    if (f56457b == null) {
                        String str2 = (String) MobMeta.get(null, b("013Egbcjeegjec_ii0dk(eb=ciYeh"), String.class, null);
                        if (TextUtils.isEmpty(str2)) {
                            str2 = (String) MobMeta.get(null, b("012 gbcjeegjec_ii6dk@eAci!eh"), String.class, null);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            f56457b = str2;
                            f56459d = str2;
                            ab.a().f(str2);
                        } else {
                            String l4 = ab.a().l();
                            if (!TextUtils.isEmpty(l4)) {
                                f56459d = l4;
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
                String str3 = (String) MobMeta.get(null, b("006)ekcjce!c<chCd"), String.class, null);
                if (str3 != null) {
                    f56460e = InternationalDomain.domainOf(str3);
                }
                f56465j = (String) MobMeta.get(null, b("015NgbcjeegjfgcbfjchcccjecHii4ddcb"), String.class, null);
                String b5 = b("0090gbcjeegjejUhhiNeh");
                Class cls = Boolean.TYPE;
                Boolean bool = Boolean.FALSE;
                f56461f = ((Boolean) MobMeta.get(null, b5, cls, bool)).booleanValue();
                f56462g = ((Boolean) MobMeta.get(null, b("006Sgbcjeegjfjgg"), cls, bool)).booleanValue();
                f56463h = ((Boolean) MobMeta.get(null, b("008TgbcjeegjRef5cjdi"), cls, Boolean.TRUE)).booleanValue();
                f56464i = ((Boolean) MobMeta.get(null, b("007?gbcjeegjhcfkfk"), cls, bool)).booleanValue();
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    public static String b(String str) {
        return v.a(str, 98);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T a(java.lang.String r9, java.lang.Class<T> r10, com.mob.commons.MobProduct r11) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.C0811r.a(java.lang.String, java.lang.Class, com.mob.commons.MobProduct):java.lang.Object");
    }

    public static <T> T a(String str) {
        try {
            Bundle bundle = com.mob.tools.b.c.a(MobSDK.getContext()).d().a(MobSDK.getContext().getPackageName(), 128).metaData;
            if (bundle != null) {
                T t4 = (T) bundle.get(str);
                if (b("009Fgbcjeegjej2hhiGeh").equals(str) && t4 != null && (t4 instanceof String)) {
                    return (T) Boolean.valueOf(b("0035dbKe:eh").equalsIgnoreCase(String.valueOf(t4)));
                }
                if (t4 != null) {
                    return t4;
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    private static String a(MobProduct mobProduct) {
        String str;
        String str2 = f56467l;
        if (mobProduct != null) {
            try {
                String productTag = mobProduct.getProductTag();
                if (b("008^dkejecfifhdkekhb").equals(productTag)) {
                    str = f56468m;
                } else if (b("006Bdkgbdkdkekhb").equals(productTag)) {
                    str = f56471p;
                } else if (b("007Kgbfgeieddddfhb").equals(productTag)) {
                    str = f56472q;
                } else if (b("0072gbfgeifkdjdkej").equals(productTag)) {
                    str = f56469n;
                } else if (!b("009[dkfhdcfjfhfiddfbhk").equals(productTag)) {
                    return str2;
                } else {
                    str = f56470o;
                }
                return str;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return str2;
            }
        }
        return str2;
    }
}

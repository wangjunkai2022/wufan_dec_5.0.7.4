package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.join.mgps.Util.h0;
import com.umeng.umcrash.UMCrash;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PathCenter.java */
/* loaded from: classes6.dex */
public class aw {
    public static final String A = "rtd";
    public static final String B = "lepd";
    public static final String C = "ccfg";
    private static Map<String, String> D = null;
    private static String E = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f63370a = "env";

    /* renamed from: b  reason: collision with root package name */
    public static final String f63371b = "exp";

    /* renamed from: c  reason: collision with root package name */
    public static final String f63372c = "imp";

    /* renamed from: d  reason: collision with root package name */
    public static final String f63373d = "ua";

    /* renamed from: e  reason: collision with root package name */
    public static final String f63374e = "zc";

    /* renamed from: f  reason: collision with root package name */
    public static final String f63375f = "id";

    /* renamed from: g  reason: collision with root package name */
    public static final String f63376g = "zf";

    /* renamed from: h  reason: collision with root package name */
    public static final String f63377h = "exid";

    /* renamed from: i  reason: collision with root package name */
    public static final String f63378i = "ucc";

    /* renamed from: j  reason: collision with root package name */
    public static final String f63379j = "ugc";

    /* renamed from: k  reason: collision with root package name */
    public static final String f63380k = "usi";

    /* renamed from: l  reason: collision with root package name */
    public static final String f63381l = "uso";

    /* renamed from: m  reason: collision with root package name */
    public static final String f63382m = "user";

    /* renamed from: n  reason: collision with root package name */
    public static final String f63383n = "uspi";

    /* renamed from: o  reason: collision with root package name */
    public static final String f63384o = "dtfn";

    /* renamed from: p  reason: collision with root package name */
    public static final String f63385p = "pr";

    /* renamed from: q  reason: collision with root package name */
    public static final String f63386q = "upg";

    /* renamed from: r  reason: collision with root package name */
    public static final String f63387r = "pri";

    /* renamed from: s  reason: collision with root package name */
    public static final String f63388s = "probe";

    /* renamed from: t  reason: collision with root package name */
    public static final String f63389t = "bl";

    /* renamed from: u  reason: collision with root package name */
    public static final String f63390u = "wl";

    /* renamed from: v  reason: collision with root package name */
    public static final String f63391v = "subp";

    /* renamed from: w  reason: collision with root package name */
    public static final String f63392w = "subua";

    /* renamed from: x  reason: collision with root package name */
    public static final String f63393x = "sta";

    /* renamed from: y  reason: collision with root package name */
    public static final String f63394y = "emi";

    /* renamed from: z  reason: collision with root package name */
    public static final String f63395z = "sli";

    /* compiled from: PathCenter.java */
    /* loaded from: classes6.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final aw f63396a = new aw();

        private a() {
        }
    }

    static {
        HashMap hashMap = new HashMap();
        D = hashMap;
        E = "";
        hashMap.put(f63370a, "envelope");
        D.put(f63371b, ".umeng");
        D.put(f63372c, ".imprint");
        D.put(f63373d, "ua.db");
        D.put(f63374e, "umeng_zero_cache.db");
        D.put("id", "umeng_it.cache");
        D.put(f63376g, "umeng_zcfg_flag");
        D.put(f63377h, "exid.dat");
        D.put(f63378i, "umeng_common_config");
        D.put(f63379j, "umeng_general_config");
        D.put(f63380k, UMCrash.KEY_CALLBACK_SESSION_ID);
        D.put(f63381l, "umeng_sp_oaid");
        D.put(f63382m, "mobclick_agent_user_");
        D.put(f63383n, "umeng_subprocess_info");
        D.put(f63384o, "delayed_transmission_flag_new");
        D.put("pr", "umeng_policy_result_flag");
        D.put(f63386q, "um_policy_grant");
        D.put(f63387r, "um_pri");
        D.put(f63388s, "UM_PROBE_DATA");
        D.put(f63389t, "ekv_bl");
        D.put(f63390u, "ekv_wl");
        D.put(f63391v, g.f63714a);
        D.put(f63392w, "ua_");
        D.put(f63393x, "stateless");
        D.put(f63394y, ".emitter");
        D.put(f63395z, "um_slmode_sp");
        D.put(A, "um_rtd_conf");
        D.put(B, "");
        D.put(C, ".dmpvedpogjhejs.cfg");
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(E)) {
            if (str.length() > 3) {
                E = str.substring(0, 3) + "_";
                return;
            }
            E = str + "_";
        }
    }

    public String b(String str) {
        if (D.containsKey(str)) {
            String str2 = D.get(str);
            if (!f63371b.equalsIgnoreCase(str) && !f63372c.equalsIgnoreCase(str) && !f63394y.equalsIgnoreCase(str)) {
                return E + str2;
            }
            return h0.f27805a + E + str2.substring(1);
        }
        return "";
    }

    private aw() {
    }

    public void a() {
        E = "";
    }

    public static aw b() {
        return a.f63396a;
    }
}

package com.mob.commons;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mob.MobSDK;
import com.mob.commons.a;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.SharePrefrenceHelper;
import com.umeng.analytics.pro.bm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public class ab {

    /* renamed from: s  reason: collision with root package name */
    private static ab f56140s;

    /* renamed from: t  reason: collision with root package name */
    private SharePrefrenceHelper f56141t;

    /* renamed from: n  reason: collision with root package name */
    private static final String f56135n = m.a("011>bdbiddbfTaBbibdbdbiBcQdg");

    /* renamed from: a  reason: collision with root package name */
    public static final String f56122a = m.a("009_cf[d(cabfbabgch<bh");

    /* renamed from: b  reason: collision with root package name */
    public static final String f56123b = m.a("0109cf,dRcabfMc.beXhDbhPaBba");

    /* renamed from: c  reason: collision with root package name */
    public static final String f56124c = m.a("009NcfVdJcabf.c:beMebe");

    /* renamed from: d  reason: collision with root package name */
    public static final String f56125d = m.a("0105cf]dPcabfdgTcGbe[ebe");

    /* renamed from: e  reason: collision with root package name */
    public static final String f56126e = m.a("011OcfLdQcabf-hh'bfchbh;g'ba");

    /* renamed from: f  reason: collision with root package name */
    public static final String f56127f = m.a("0313cf9d+cabf'cd<cgCg1bfbe,he8bi bPbabfAbhh*bf(bagRbgbbKdAbf>g8bgbd@d");

    /* renamed from: g  reason: collision with root package name */
    public static final String f56128g = m.a("0251cf:d^cabfddbecdcd@dIbh2d babfVeObiVabg3bgbi0c'bfbdbafg");

    /* renamed from: h  reason: collision with root package name */
    public static final String f56129h = m.a("038BcfEdQcabf:cd]cg@g>bfbeQhe$bi<b2babfddbecdcdBdBbhFd!babfLe<bi%abgBbgbiVcIbf!gAbgbdUd");

    /* renamed from: i  reason: collision with root package name */
    public static final String f56130i = m.a("0142debgcdbgbfNeb4dgCg!bfbgUcCcdbi");

    /* renamed from: j  reason: collision with root package name */
    public static final String f56131j = m.a("018;cfZd2cabfdebgcdbgbfFe0bgdg(g+bfKfbGdg4f");

    /* renamed from: k  reason: collision with root package name */
    public static final String f56132k = m.a("030Tcf+d-cabfAcd$cg;g2bfbeKhe,bi7bPbabfdebgcdbgbf<e4bgdgPgVbf6gNbgbd@d");

    /* renamed from: l  reason: collision with root package name */
    public static final String f56133l = m.a("012,cf'dYcabfdgdebgZgafdNdg");

    /* renamed from: m  reason: collision with root package name */
    public static final String f56134m = m.a("022(cfHdIcabfdgdebg5gafdQdgbfFg;bgbd3d5dgUgb6bdEh");

    /* renamed from: o  reason: collision with root package name */
    private static final String f56136o = m.a("019Icf3d4cabf$bhh]bf]bag^bgbb[d)bf-gKbgbdMd");

    /* renamed from: p  reason: collision with root package name */
    private static final String f56137p = m.a("012?cfPd^cabf7afbccde9dg");

    /* renamed from: q  reason: collision with root package name */
    private static AtomicBoolean f56138q = new AtomicBoolean(false);

    /* renamed from: r  reason: collision with root package name */
    private static AtomicBoolean f56139r = new AtomicBoolean(false);

    private ab() {
        if (this.f56141t == null) {
            SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext());
            this.f56141t = sharePrefrenceHelper;
            sharePrefrenceHelper.open(f56135n, 1);
        }
    }

    public static synchronized ab a() {
        ab abVar;
        synchronized (ab.class) {
            if (f56140s == null) {
                f56140s = new ab();
            }
            abVar = f56140s;
        }
        return abVar;
    }

    public static boolean b() {
        if (MobSDK.getContext() != null) {
            Context context = MobSDK.getContext();
            String str = f56135n;
            if (SharePrefrenceHelper.isMpfFileExist(context, str, 1)) {
                return true;
            }
            boolean isMobSpFileExist = SharePrefrenceHelper.isMobSpFileExist(MobSDK.getContext(), str, 1);
            return !isMobSpFileExist ? com.mob.tools.utils.c.a() || com.mob.tools.utils.c.b() : isMobSpFileExist;
        }
        return false;
    }

    public static void r() {
        if (f56138q.compareAndSet(false, true)) {
            new com.mob.tools.utils.j(m.a("004%djgjfied")) { // from class: com.mob.commons.ab.1
                @Override // com.mob.tools.utils.j
                protected void a() {
                    Object obj = p.f56431i;
                    synchronized (obj) {
                        try {
                            obj.wait(TTAdConstant.AD_MAX_EVENT_TIME);
                            h.a().a(11);
                            ConcurrentHashMap<String, Object> e5 = b.e();
                            if (e5 != null && e5.size() > 0) {
                                h.a().a(12);
                                Object obj2 = e5.get(bm.aK);
                                Object obj3 = e5.get(com.kuaishou.weapon.p0.t.f55682a);
                                Object obj4 = e5.get(m.a("001Wdd"));
                                Object obj5 = e5.get("s");
                                Object obj6 = e5.get(m.a("002ac"));
                                Object obj7 = e5.get(m.a("002;cd(c"));
                                e5.clear();
                                c.a(obj2, obj3, obj4, obj5, obj6, obj7);
                            }
                        }
                    }
                }
            }.start();
        }
        t();
    }

    private static String s() {
        return Data.MD5(DH.SyncMtd.getModel());
    }

    private static void t() {
        if (f56139r.compareAndSet(false, true)) {
            new com.mob.tools.utils.j("DS-W") { // from class: com.mob.commons.ab.2
                @Override // com.mob.tools.utils.j
                protected void a() {
                    Object obj = p.f56432j;
                    synchronized (obj) {
                        try {
                            obj.wait();
                            ConcurrentHashMap<String, Object> f5 = b.f();
                            f5.clear();
                            c.a((ArrayList) f5.get(m.a("002eg")), new com.mob.tools.utils.e<Void>() { // from class: com.mob.commons.ab.2.1
                                @Override // com.mob.tools.utils.e
                                public void a(Void r12) {
                                }
                            });
                        }
                    }
                }
            }.start();
        }
    }

    public Object c(String str, Object obj) {
        return this.f56141t.get(str, obj);
    }

    public void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = Base64.encodeToString(Data.AES128Encode(s(), str), 0);
                a(f56134m, System.currentTimeMillis());
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        a("key_gfrt", str);
    }

    public void e() {
        c((String) null);
        d((String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HashMap<Long, Long> f() {
        HashMap fromJson;
        String string = this.f56141t.getString(f56136o);
        HashMap<Long, Long> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(string) && (fromJson = HashonHelper.fromJson(string)) != null && !fromJson.isEmpty()) {
            for (Map.Entry entry : fromJson.entrySet()) {
                if (entry != null) {
                    hashMap.put(Long.valueOf(Long.parseLong((String) entry.getKey())), entry.getValue());
                }
            }
        }
        return hashMap;
    }

    public HashMap<String, Object> g() {
        String b5 = b(f56137p, (String) null);
        if (TextUtils.isEmpty(b5)) {
            return null;
        }
        return HashonHelper.fromJson(b5);
    }

    public int h() {
        return b("key_mstrgy", 0);
    }

    public a.c i() {
        return a.c.a(b("key_duid_param_blacklist", (String) null));
    }

    public a.C0549a j() {
        try {
            String b5 = b("key_duid_entity", (String) null);
            if (!TextUtils.isEmpty(b5)) {
                return a.C0549a.a(Data.AES128Decode(DH.SyncMtd.getModel(), Base64.decode(b5, 0)));
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        return null;
    }

    public String k() {
        return b("key_chd_ak", (String) null);
    }

    public String l() {
        return b("key_chd_as", (String) null);
    }

    public HashMap<String, HashMap<String, ArrayList<String>>> m() {
        return HashonHelper.fromJson(b("key_chd_busi_dm", (String) null));
    }

    public HashMap<String, String> n() {
        return HashonHelper.fromJson(b("key_ckd_busi_dm", (String) null));
    }

    public ArrayList<String> o() {
        HashMap fromJson = HashonHelper.fromJson(b("key_chd_prx_dm", (String) null));
        if (fromJson != null && !fromJson.isEmpty()) {
            return (ArrayList) fromJson.get(m.a("0083cdQbXcfJdeIbgdg3g"));
        }
        return new ArrayList<>();
    }

    public HashMap<String, Long> p() {
        return HashonHelper.fromJson(b("key_dm_ck_tm", (String) null));
    }

    public long q() {
        return b("key_fst_lnch_tm", 0L);
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = Base64.encodeToString(Data.AES128Encode(s(), str), 0);
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        a(f56133l, str);
    }

    public void e(String str) {
        a("key_chd_ak", str);
    }

    public void a(String str, long j4) {
        this.f56141t.putLong(str, Long.valueOf(j4));
    }

    public void e(HashMap<String, Long> hashMap) {
        a("key_dm_ck_tm", HashonHelper.fromHashMap(hashMap));
    }

    public void a(String str, int i4) {
        this.f56141t.putInt(str, Integer.valueOf(i4));
    }

    public long b(String str, long j4) {
        return this.f56141t.getLong(str, j4);
    }

    public void a(String str, boolean z4) {
        this.f56141t.putBoolean(str, Boolean.valueOf(z4));
    }

    public int b(String str, int i4) {
        return this.f56141t.getInt(str, i4);
    }

    public void a(String str, String str2) {
        if (str2 == null) {
            this.f56141t.remove(str);
        } else {
            this.f56141t.putString(str, str2);
        }
    }

    public boolean b(String str, boolean z4) {
        return this.f56141t.getBoolean(str, z4);
    }

    public String b(String str, String str2) {
        return this.f56141t.getString(str, str2);
    }

    public String c() {
        String b5 = b(f56133l, (String) null);
        if (TextUtils.isEmpty(b5)) {
            return b5;
        }
        try {
            String s4 = s();
            return Data.AES128PaddingDecode(s4.getBytes("UTF-8"), Base64.decode(b5, 0));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return b5;
        }
    }

    public String d() {
        String b5 = b("key_gfrt", (String) null);
        if (TextUtils.isEmpty(b5)) {
            return b5;
        }
        try {
            String s4 = s();
            return Data.AES128PaddingDecode(s4.getBytes("UTF-8"), Base64.decode(b5, 0));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return b5;
        }
    }

    public void f(String str) {
        a("key_chd_as", str);
    }

    public void a(String str, Object obj) {
        this.f56141t.put(str, obj);
    }

    public void b(String str, Object obj) {
        this.f56141t.put(str, obj);
    }

    public Object a(String str) {
        return this.f56141t.get(str);
    }

    public void b(String str) {
        this.f56141t.remove(str);
    }

    public void a(HashMap<Long, Long> hashMap) {
        if (hashMap != null && !hashMap.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<Long, Long> entry : hashMap.entrySet()) {
                if (entry != null) {
                    hashMap2.put(String.valueOf(entry.getKey()), entry.getValue());
                }
            }
            this.f56141t.putString(f56136o, HashonHelper.fromHashMap(hashMap2));
            return;
        }
        this.f56141t.remove(f56136o);
    }

    public void b(HashMap<String, Object> hashMap) {
        a(f56137p, HashonHelper.fromHashMap(hashMap));
    }

    public void c(HashMap<String, HashMap<String, ArrayList<String>>> hashMap) {
        a("key_chd_busi_dm", HashonHelper.fromHashMap(hashMap));
    }

    public void d(HashMap<String, String> hashMap) {
        a("key_ckd_busi_dm", HashonHelper.fromHashMap(hashMap));
    }

    public void a(int i4) {
        if (i4 >= 0) {
            a("key_mstrgy", i4);
        }
    }

    public void a(a.c cVar) {
        a("key_duid_param_blacklist", cVar != null ? cVar.a() : null);
    }

    public void a(a.C0549a c0549a) {
        String str = null;
        if (c0549a != null) {
            try {
                str = c0549a.a();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return;
            }
        }
        a("key_duid_entity", Base64.encodeToString(Data.EncodeNoPadding(DH.SyncMtd.getModel(), str), 0));
    }

    public void a(ArrayList<String> arrayList) {
        a("key_chd_prx_dm", (arrayList == null || arrayList.isEmpty()) ? null : HashonHelper.fromObject(arrayList));
    }

    public void a(long j4) {
        a("key_fst_lnch_tm", j4);
    }
}

package com.mob.commons.a;

import android.content.pm.ApplicationInfo;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.commons.CSCenter;
import com.mob.commons.MobProduct;
import com.mob.commons.ab;
import com.mob.commons.u;
import com.mob.tools.MobLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.utils.DH;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes5.dex */
public class m extends c {

    /* renamed from: c  reason: collision with root package name */
    private static final String f56103c = com.mob.commons.m.a("016:dcdbcjdabfciejdcefdbdjbfdaccfaeg");

    /* renamed from: d  reason: collision with root package name */
    private static final String f56104d = com.mob.commons.m.a("0168dcdbcjdabfeadbccdcegdjbfdjdbdadb");

    public m() {
        super(com.mob.commons.m.a("002he"), 0L, com.mob.commons.m.a("005heVchRbh"), 86400L, c.a(com.mob.commons.m.a("002he"), (Long) 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object b(HashMap<String, Object> hashMap) {
        try {
            hashMap.put(com.mob.commons.m.a("005ahe^dbFg"), Long.valueOf(System.currentTimeMillis()));
            return b(hashMap, com.mob.commons.i.a().a("gclg") + com.mob.commons.m.a("004jahe"));
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    private void n() {
        DH.requester(MobSDK.getContext()).getDetailNetworkTypeForStatic().request(new DH.DHResponder() { // from class: com.mob.commons.a.m.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) throws Throwable {
                final List<String> list;
                HashMap<String, Object> hashMap = new HashMap<>();
                String a5 = u.a();
                String a6 = com.mob.commons.e.a((MobProduct) null);
                hashMap.put(com.mob.commons.m.a("006bhh)cfGd3ca"), a5);
                hashMap.put(com.mob.commons.m.a("006bhhhCcfch"), DH.SyncMtd.getPackageName());
                hashMap.put(com.mob.commons.m.a("006bhh9bb;dZbh"), Integer.valueOf(DH.SyncMtd.getAppVersion()));
                hashMap.put(com.mob.commons.m.a("004.babebgba"), a6);
                hashMap.put(com.mob.commons.m.a("004hebg"), Integer.valueOf(DH.SyncMtd.getPlatformCode()));
                hashMap.put(com.mob.commons.m.a("011cdg,debibhcfOgBcaYhd"), dHResponse.getDetailNetworkTypeForStatic());
                hashMap.put(com.mob.commons.m.a("009ebZdg;g!ei[he'db8g"), Long.valueOf(ab.a().b(m.f56103c, 0L)));
                String encodeToString = Base64.encodeToString((a5 + ":" + a6).getBytes("utf-8"), 2);
                hashMap.put(com.mob.commons.m.a("009eb(dgPgWeiHhe!ccba"), encodeToString);
                HashMap hashMap2 = (HashMap) m.b(hashMap, com.mob.commons.i.a().a("gclg") + com.mob.commons.m.a("004jTbb!he"));
                if (hashMap2 == null || hashMap2.size() == 0 || (list = (List) hashMap2.get(com.mob.commons.m.a("004hWcfchdg"))) == null || list.size() <= 0) {
                    return;
                }
                ab.a().a(m.f56103c, System.currentTimeMillis());
                final ArrayList arrayList = new ArrayList();
                MobLog.getInstance().d("[dhss] vpl", new Object[0]);
                DH.RequestBuilder requester = DH.requester(MobSDK.getContext());
                for (String str : list) {
                    requester.getMpfos(DH.GPI_STRATEGY_VALIDITY_3_MINUTE, str, 0);
                }
                requester.request(new DH.DHResponder() { // from class: com.mob.commons.a.m.1.1
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse2) {
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            boolean z4 = true;
                            try {
                                Object mpfos = dHResponse2.getMpfos(i4);
                                if (mpfos != null) {
                                    String str2 = (String) list.get(i4);
                                    ApplicationInfo a7 = com.mob.tools.c.a(mpfos, str2);
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put(com.mob.commons.m.a("006bhhhZcfch"), str2);
                                    hashMap3.put(com.mob.commons.m.a("006bhhLbb;dAbh"), com.mob.tools.c.c(mpfos, str2));
                                    if (a7 != null) {
                                        int i5 = a7.flags;
                                        boolean z5 = (i5 & 1) == 1;
                                        boolean z6 = (i5 & 128) != 0;
                                        String a8 = com.mob.commons.m.a("0053bgdgdgcadg");
                                        if (!z5 && !z6) {
                                            z4 = false;
                                        }
                                        hashMap3.put(a8, Boolean.valueOf(z4));
                                    }
                                    arrayList.add(hashMap3);
                                }
                            } catch (Throwable th) {
                                MobLog.getInstance().d(th);
                            }
                        }
                    }
                });
                hashMap.remove(com.mob.commons.m.a("011cdg7debibhcf*g;ca:hd"));
                hashMap.remove(com.mob.commons.m.a("009eb1dg'gYeiJhe1dbXg"));
                hashMap.remove(com.mob.commons.m.a("009eb1dg<g*eiYhe!ccba"));
                hashMap.put(com.mob.commons.m.a("005;bdbibaQde"), DH.SyncMtd.getModel());
                hashMap.put(com.mob.commons.m.a("008<baNbgdg-bgbd@d"), Long.valueOf(System.currentTimeMillis()));
                hashMap.put(com.mob.commons.m.a("002Ebgba"), encodeToString);
                hashMap.put(com.mob.commons.m.a("004h_cfchdg"), arrayList);
                Object b5 = m.this.b(hashMap);
                if (b5 == null) {
                    b5 = m.this.b(hashMap);
                }
                if (b5 == null) {
                    m.this.a(hashMap);
                }
            }
        });
    }

    @Override // com.mob.commons.a.c
    protected void a() {
        if (CSCenter.getInstance().isAppListDataEnable()) {
            try {
                Thread.sleep(((Long) a(d(), (String) 0L)).longValue() * 1000);
                HashMap<String, Object> hashMap = (HashMap) ab.a().c(f56104d, null);
                if (hashMap != null && !hashMap.isEmpty() && b(hashMap) != null) {
                    a((HashMap<String, Object>) null);
                }
            } catch (Throwable unused) {
            }
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object b(HashMap<String, Object> hashMap, String str) throws Throwable {
        if (com.mob.commons.b.c()) {
            return new NetCommunicator(1024, "009cbd92ccef123be840deec0c6ed0547194c1e471d11b6f375e56038458fb18833e5bab2e1206b261495d7e2d1d9e5aa859e6d4b67" + com.mob.commons.m.a("023VfdUb@fbHab%fgbagifb$dYcd4d.ba!d4fjfb)dXfcfhfd0b0hdcd"), "1dfd1d615cb891ce9a76f42d036af7fce5f8b8efaa11b2f42590ecc4ea4cff28f5f6b0726aeb76254ab5b02a58c1d5b486c39d9da1a58fa6ba2f22196493b3a4cbc283dcf749bf63679ee24d185de70c8dfe05605886c9b53e9f569082eabdf98c4fb0dcf07eb9bb3e647903489ff0b5d933bd004af5be4a1022fdda41f347f1").requestSynchronized(hashMap, str, false);
        }
        return null;
    }

    public synchronized void a(HashMap<String, Object> hashMap) {
        if (hashMap == null) {
            ab.a().b(f56104d);
        } else {
            ab.a().b(f56104d, hashMap);
        }
    }
}

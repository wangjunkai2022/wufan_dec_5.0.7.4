package com.mob.commons.cc;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import com.mob.commons.cc.m;
import com.mob.commons.cc.x;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.MobPersistence;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final r f56257a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static final j f56258b = new j();

    /* renamed from: c  reason: collision with root package name */
    private static final o f56259c = new o();

    /* renamed from: d  reason: collision with root package name */
    private static volatile m f56260d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile m f56261e;

    static {
        try {
            f56260d = new m(new m.a() { // from class: com.mob.commons.cc.a.1
                @Override // com.mob.commons.cc.m.a
                public Object a(String str, ArrayList<Object> arrayList) {
                    try {
                        if (a.f56261e != null) {
                            return a.f56261e.a(str, arrayList);
                        }
                        return null;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
            f56261e = new m(new m.a() { // from class: com.mob.commons.cc.a.2
                @Override // com.mob.commons.cc.m.a
                public Object a(String str, ArrayList<Object> arrayList) {
                    return str + "" + arrayList;
                }
            });
            f56260d.a("tt", null);
        } catch (Throwable unused) {
        }
    }

    public static int a() {
        return x.a();
    }

    public static void a(Context context, byte[] bArr, String str, Method method) throws Throwable {
        a(x.a(bArr), context, str, method);
    }

    public static void a(Context context, String str, String str2, Method method) throws Throwable {
        a(x.a(str), context, str2, method);
    }

    public static void a(Context context, String str, String str2, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) throws Throwable {
        x.c a5 = x.a(str);
        a5.a("ss_dhMap", hashMap).a("ss_dataMaps", hashMap2);
        a(a5, context, str2, (Method) null);
    }

    public static LinkedList<Object> a(Object obj, Object... objArr) throws Throwable {
        return ((z) obj).b(objArr);
    }

    private static void a(x.c cVar, Context context, String str, Method method) throws Throwable {
        cVar.a(com.mob.commons.m.a("012%ef hdYbh2bgAbgbi%c:cjMdg"), j.class).a(com.mob.commons.m.a("003?faceda"), d.class).a("SBSP", o.class).a(com.mob.commons.m.a("004Tfacjejdi"), g.class).a(com.mob.commons.m.a("015_cjdhdi(bcWbaTedYbhda:fHbh@db4ba"), MobHandlerThread.class).a(com.mob.commons.m.a("019?cjdhdhbhbi4bGbaOab*dg1g>eh$dadGbgbbKd!bh"), i.class).a(com.mob.commons.m.a("017@cjdhcbbiWcgdcg,ehJd%dgbi'e.bbSdXbh"), l.class).a(com.mob.commons.m.a("0197cjdhcj,d_bhbbbg%ad<cbbi.ccdag7bgbiNc"), p.class).a(com.mob.commons.m.a("017QcjdhcbbiCcgdcg1efdddgNd@bhbb2dVbh"), k.class).a(com.mob.commons.m.a("017+cjdhceIdgNdebibhcfcb[beeEddSba_cf"), n.class).a(com.mob.commons.m.a("009Lcjdhdi*bc)baLed!bh"), m.class).a(com.mob.commons.m.a("003Ufacecb"), NetCommunicator.class).a(com.mob.commons.m.a("004Sfacedaef"), NetworkHelper.NetworkTimeOut.class).a("NoVaDataException", MobPersistence.NoValidDataException.class).a(com.mob.commons.m.a("003Wdibicc"), com.mob.commons.n.class).a(i.class, i.class).a(k.class, k.class).a(p.class, q.class).a(n.class, n.class).a(r.class, r.class).a(j.class, j.class).a(d.class, d.class).a(g.class, h.class).a(Context.class, c.class).a(PackageManager.class, f.class).a(NotificationManager.class, e.class).a(o.class, o.class).a(com.mob.commons.n.class, b.class).a("ss_sdh", f56259c).a("ss_opSet", f56258b).a("ss_suls", f56257a).a(com.mob.commons.m.a("015UdgdgbfIa]biKcgd.cg1g@ejZbGbhNbYbd"), context).a(com.mob.commons.m.a("014.dgdgbfdg*gbIbhJgZej?bPbhSb]bddg"), str).a(com.mob.commons.m.a("012?dgdgbfdgLgbDbhLg-dabgbdTd"), Long.valueOf(System.currentTimeMillis())).a(com.mob.commons.m.a("006^dgdgbfbdbaIh"), method).a(com.mob.commons.m.a("016aXbibdbdbi)cbh%bjdgbacfbjGa%baRa"));
        cVar.a();
    }
}

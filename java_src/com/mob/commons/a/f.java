package com.mob.commons.a;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.ab;
import com.mob.tools.MobLog;
import com.mob.tools.b.h;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class f extends c {

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        private static volatile a f56082d;

        /* renamed from: a  reason: collision with root package name */
        private long f56083a;

        /* renamed from: b  reason: collision with root package name */
        private long f56084b;

        /* renamed from: c  reason: collision with root package name */
        private AtomicInteger f56085c = new AtomicInteger(0);

        private a() {
            com.mob.tools.utils.f.a().a(new f.a() { // from class: com.mob.commons.a.f.a.1
                @Override // com.mob.tools.utils.f.a
                public void a() {
                    if (com.mob.commons.b.c()) {
                        if (System.currentTimeMillis() - a.this.f56083a >= ((Integer) com.mob.commons.b.a("gpdi", 120)).intValue() * 1000) {
                            MobLog.getInstance().d("[cl] tme > ", new Object[0]);
                            a.this.b();
                            a.this.f56083a = System.currentTimeMillis();
                        }
                        a.this.c();
                    }
                }
            });
        }

        private void d() {
            Object c5 = com.mob.tools.utils.f.a().c();
            this.f56085c.getAndIncrement();
            this.f56084b = System.currentTimeMillis();
            Object b5 = com.mob.tools.utils.f.a().b();
            float f5 = 0.0f;
            if (c5 != null && b5 != null) {
                try {
                    f5 = new h.a(c5).a(b5);
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                    return;
                }
            }
            if (c5 != null) {
                if (b5 == null || f5 > ((Float) com.mob.commons.b.a("gped", Float.valueOf(10.0f))).floatValue()) {
                    MobLog.getInstance().d("[cl] cur != las", new Object[0]);
                    com.mob.tools.utils.f.a().a(c5);
                    f fVar = new f();
                    fVar.a(true).a(c5).b(false);
                    d.a().a(fVar, 0L, 0);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f56085c.getAndSet(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            if (this.f56085c.get() >= 3 || System.currentTimeMillis() - this.f56084b < ((Integer) com.mob.commons.b.a("gpdi", 120)).intValue() * 1000) {
                return;
            }
            d();
        }

        public static a a() {
            if (f56082d == null) {
                synchronized (a.class) {
                    if (f56082d == null) {
                        f56082d = new a();
                    }
                }
            }
            return f56082d;
        }
    }

    public f() {
        super(com.mob.commons.l.a("002Ofm%i"), 0L, com.mob.commons.l.a("006;fm;i-gl+flj"), 60L, c.a(com.mob.commons.l.a("002Ofm%i"), (Long) 0L));
    }

    private void m() {
        DH.requester(MobSDK.getContext()).getPosCommForce(0, 0, true, false).getMbcdi().getMcdi().request(new DH.DHResponder() { // from class: com.mob.commons.a.f.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                List<HashMap<String, Object>> a5;
                JSONObject jSONObject;
                if (dHResponse.getPosCommForce(new int[0]) == null || dHResponse.getPosCommForce(new int[0]).isEmpty() || (a5 = f.this.a(dHResponse.getPosCommForce(new int[0]))) == null || a5.isEmpty()) {
                    return;
                }
                HashMap<String, Object> hashMap = a5.get(a5.size() - 1);
                if (hashMap == null || hashMap.isEmpty()) {
                    return;
                }
                f.this.a(hashMap, hashMap);
                HashMap hashMap2 = hashMap.get("nl") != null ? (HashMap) hashMap.get("nl") : null;
                String mcdi = dHResponse.getMcdi();
                String mbcdi = dHResponse.getMbcdi();
                if (!TextUtils.isEmpty(mbcdi)) {
                    hashMap.put("cbsmt", mbcdi);
                }
                if (!TextUtils.isEmpty(mcdi)) {
                    hashMap.put("cssmt", mcdi);
                }
                if (hashMap2 != null && !hashMap2.isEmpty()) {
                    TreeMap treeMap = new TreeMap();
                    treeMap.put("ltdmt", hashMap2.get("ltdmt"));
                    treeMap.put("lndmt", hashMap2.get("lndmt"));
                    jSONObject = new JSONObject(treeMap);
                } else {
                    jSONObject = new JSONObject(f.this.b(dHResponse.getPosCommForce(new int[0]).get(a5.size() - 1)));
                }
                String MD5 = Data.MD5(jSONObject.toString());
                ab a6 = ab.a();
                String str = ab.f56128g;
                String b5 = a6.b(str, (String) null);
                ab a7 = ab.a();
                String str2 = ab.f56129h;
                long b6 = a7.b(str2, 0L);
                long longValue = ((Long) f.this.a(com.mob.commons.l.a("0066fmYiDgl6fli"), (String) 3600L)).longValue() * 1000;
                long currentTimeMillis = System.currentTimeMillis();
                if (TextUtils.isEmpty(b5) || !b5.equals(MD5) || currentTimeMillis - b6 >= longValue) {
                    int i4 = f.this.g() ? 1 : currentTimeMillis - b6 >= longValue ? 2 : 3;
                    hashMap.put("pt", Integer.valueOf(i4));
                    if (hashMap2 != null && !hashMap2.isEmpty()) {
                        hashMap2.put("pt", Integer.valueOf(i4));
                    }
                    f.this.a("O_LCMT", hashMap);
                    ab.a().a(str, MD5);
                    ab.a().a(str2, currentTimeMillis);
                }
            }
        });
    }

    @Override // com.mob.commons.a.c
    protected void a() {
        HashMap<String, Object> hashMap;
        if (this.f56052b != null) {
            MobLog.getInstance().d("[cl] paramObj not null", new Object[0]);
            Object obj = this.f56052b;
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            List<HashMap<String, Object>> a5 = a((List) arrayList);
            if (a5 == null || a5.isEmpty() || (hashMap = a5.get(a5.size() - 1)) == null || hashMap.isEmpty()) {
                return;
            }
            hashMap.put("pt", 4);
            a("O_LCMT", hashMap);
            return;
        }
        m();
    }

    @Override // com.mob.commons.a.c
    protected void c() {
        a.a();
    }
}

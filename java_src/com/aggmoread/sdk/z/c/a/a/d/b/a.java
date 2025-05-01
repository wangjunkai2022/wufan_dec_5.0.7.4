package com.aggmoread.sdk.z.c.a.a.d.b;

import android.text.TextUtils;
import com.aggmoread.sdk.client.AMConst;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.aggmoread.sdk.z.c.a.a.e.n;
import com.qq.e.comm.constants.Constants;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: h  reason: collision with root package name */
    private static String f3242h = "AMHTAG";

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, Object> f3243b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public d f3244c;

    /* renamed from: d  reason: collision with root package name */
    public e f3245d;

    /* renamed from: e  reason: collision with root package name */
    protected com.aggmoread.sdk.z.c.a.a.d.a.c f3246e;

    /* renamed from: f  reason: collision with root package name */
    protected String f3247f;

    /* renamed from: g  reason: collision with root package name */
    protected com.aggmoread.sdk.z.c.a.a.e.q.f f3248g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0141a implements c<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f3249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.c.e f3250b;

        C0141a(k kVar, com.aggmoread.sdk.z.c.a.a.c.e eVar) {
            this.f3249a = kVar;
            this.f3250b = eVar;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.b.a.c
        public void a(String str) {
            com.aggmoread.sdk.z.c.a.a.e.e.b("XXXXX", "title " + str);
            if (!TextUtils.isEmpty(str)) {
                if (m.i(a.this.f3245d)) {
                    this.f3249a.a(k.b.C, str);
                }
                m.a(a.this.f3243b, str);
            }
            this.f3249a.b();
            a.this.b(this.f3250b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f3252b;

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.b.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0142a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f3254b;

            RunnableC0142a(String str) {
                this.f3254b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = b.this.f3252b;
                if (cVar != null) {
                    cVar.a(this.f3254b);
                }
            }
        }

        b(c cVar) {
            this.f3252b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    Thread.sleep(500L);
                    n.a(new RunnableC0142a(a.this.j()));
                } catch (Exception e5) {
                    com.aggmoread.sdk.z.c.a.a.e.e.b("XXXXX", "title info err " + e5.getMessage());
                    n.a(new RunnableC0142a(null));
                }
            } catch (Throwable th) {
                n.a(new RunnableC0142a(null));
                throw th;
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c<T> {
        void a(T t4);
    }

    public a(d dVar, e eVar) {
        this.f3248g = com.aggmoread.sdk.z.c.a.a.e.q.f.f3539b;
        this.f3244c = dVar;
        this.f3245d = eVar;
        this.f3247f = dVar.f3279w;
        this.f3248g = com.aggmoread.sdk.z.c.a.a.e.q.f.f3538a.a(eVar.f());
        n();
    }

    private void a(c<String> cVar) {
        n.b(new b(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.aggmoread.sdk.z.c.a.a.c.e eVar) {
        if (!m.b(this.f3245d) || eVar == null) {
            return;
        }
        eVar.onAdExposed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i4, int i5) {
        com.aggmoread.sdk.z.c.a.a.e.e.a("bidding floor " + i4 + ", notice price " + i5);
        b(1, i5, null);
        i iVar = new i(1001006004, "广告无填充!");
        new k(this.f3244c, this.f3245d).a(8).a(iVar).a(k.b.f3451q, m.a(this.f3244c, this.f3245d, i4)).b();
        if (this.f3245d.l()) {
            return;
        }
        this.f3244c.f3263g.a(iVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(com.aggmoread.sdk.z.c.a.a.c.e eVar) {
        a((Map<Object, Object>) null, eVar);
    }

    public void a(i iVar) {
        this.f3244c.a(iVar, this.f3245d, true);
        this.f3248g.a();
    }

    protected void a(Map<Object, Object> map, com.aggmoread.sdk.z.c.a.a.c.e eVar) {
        String a5 = m.a(this.f3244c, this.f3245d, this.f3243b);
        k a6 = new k(this.f3244c, this.f3245d).a(6);
        a6.a(k.b.f3451q, a5);
        a6.a(map);
        if (m.e()) {
            a(new C0141a(a6, eVar));
            return;
        }
        a6.b();
        b(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(int i4) {
        com.aggmoread.sdk.z.c.a.a.e.e.a("bidding win " + i4);
        if (!m.h(this.f3245d) && i4 > 0) {
            c(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(int i4, int i5, String str) {
    }

    protected void b(i iVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i4) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i() {
        try {
            Map<Object, Object> a5 = l.a(this.f3244c);
            if (a5 != null) {
                Object obj = a5.get(Constants.KEYS.EXPOSED_CLICK_URL_KEY);
                Object obj2 = a5.get("image");
                Object obj3 = a5.get("mediaId");
                Object obj4 = a5.get("examineId");
                String str = f3242h;
                com.aggmoread.sdk.z.c.a.a.e.e.b(str, "clickUrl = " + obj + ",\t image = " + obj2 + ",\t mediaId = " + obj3);
                this.f3243b.put("ext.MATERIAL_ID", obj3);
                this.f3243b.put("ext.EXAMINE_ID", obj4);
                this.f3243b.put("ext.IMG_URL", obj2);
                this.f3243b.put("ext.CLICK_URL", obj);
            }
        } catch (Exception e5) {
            String str2 = f3242h;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str2, "err " + e5.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String j() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.aggmoread.sdk.z.c.a.a.d.a.c k() {
        com.aggmoread.sdk.z.c.a.a.d.a.c cVar = this.f3246e;
        return cVar != null ? cVar : this.f3244c.f3276t;
    }

    protected void l() {
        a(new i(1001003005, "不支持的广告类型,请检查广告ID和接口是否一致: adType=" + this.f3244c.f3261e.a() + " adSource=" + this.f3245d.f()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean m() {
        return false;
    }

    protected void n() {
        String c5 = this.f3245d.f3309c.c(e.c.T);
        int f5 = this.f3245d.f();
        int b5 = this.f3245d.f3309c.b(e.c.V);
        this.f3243b.put(AMConst.ExtrasKey.AD_PLACEMENT_ID, c5);
        this.f3243b.put(AMConst.ExtrasKey.AD_NETWORK_NAME, Integer.valueOf(f5));
        this.f3243b.put(AMConst.ExtrasKey.AD_PRIORITY, Integer.valueOf(b5));
        this.f3243b.put(AMConst.ExtrasKey.AD_ID, this.f3244c.f3259c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean o() {
        e eVar = this.f3245d;
        if (eVar == null || this.f3244c == null) {
            return true;
        }
        boolean z4 = (!eVar.d() || TextUtils.isEmpty(this.f3244c.f3279w) || TextUtils.isEmpty(this.f3244c.f3280x)) ? false : true;
        com.aggmoread.sdk.z.c.a.a.e.e.a("s2s " + z4);
        return !z4;
    }

    public void p() {
        if (m.c(this.f3245d)) {
            e eVar = this.f3245d;
            if (eVar != null) {
                eVar.a(false);
            }
            l();
            return;
        }
        b(new i(1001003005, "当前版本暂不支持. s =" + this.f3245d.f() + ", version: " + m.f(this.f3245d)));
    }
}

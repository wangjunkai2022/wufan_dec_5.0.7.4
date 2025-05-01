package com.aggmoread.sdk.z.a.r;

import android.os.Handler;
import android.text.TextUtils;
import com.aggmoread.sdk.z.a.g.b;
import com.aggmoread.sdk.z.a.m.m;
import com.aggmoread.sdk.z.a.p.a;
import com.kwad.sdk.core.scene.URLPackage;
import com.xinzhu.overmind.server.user.MindUserHandle;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IMediaPlayer;
/* loaded from: classes2.dex */
public class b {

    /* loaded from: classes2.dex */
    static class a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.a.i.b f2401a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.a.h.c f2402b;

        /* renamed from: com.aggmoread.sdk.z.a.r.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0073a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.a.g.b f2403b;

            RunnableC0073a(com.aggmoread.sdk.z.a.g.b bVar) {
                this.f2403b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    new f().a(this.f2403b, (com.aggmoread.sdk.z.a.r.d) a.this.f2401a);
                } catch (Throwable th) {
                    th.printStackTrace();
                    com.aggmoread.sdk.z.a.i.b bVar = a.this.f2401a;
                    b.a(bVar, new com.aggmoread.sdk.z.a.g.e(50003, "SDK内部处理异常!   -->" + th.toString()));
                }
            }
        }

        /* renamed from: com.aggmoread.sdk.z.a.r.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0074b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.a.g.b f2405b;

            RunnableC0074b(com.aggmoread.sdk.z.a.g.b bVar) {
                this.f2405b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    b.a(this.f2405b, (com.aggmoread.sdk.z.a.l.a) a.this.f2401a);
                } catch (Throwable th) {
                    th.printStackTrace();
                    b.a(a.this.f2401a, new com.aggmoread.sdk.z.a.g.e(50003, "SDK内部处理异常!"));
                }
            }
        }

        /* loaded from: classes2.dex */
        class c implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.a.g.b f2407b;

            c(com.aggmoread.sdk.z.a.g.b bVar) {
                this.f2407b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    new com.aggmoread.sdk.z.a.o.b().a(this.f2407b, (com.aggmoread.sdk.z.a.r.c) a.this.f2401a);
                } catch (Throwable th) {
                    th.printStackTrace();
                    b.a(a.this.f2401a, new com.aggmoread.sdk.z.a.g.e(50003, "SDK内部处理异常!"));
                }
            }
        }

        /* loaded from: classes2.dex */
        class d implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.a.g.b f2409b;

            d(com.aggmoread.sdk.z.a.g.b bVar) {
                this.f2409b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    b.a(this.f2409b, (com.aggmoread.sdk.z.a.k.a) a.this.f2401a);
                } catch (Throwable th) {
                    th.printStackTrace();
                    b.a(a.this.f2401a, new com.aggmoread.sdk.z.a.g.e(50003, "SDK内部处理异常!"));
                }
            }
        }

        /* loaded from: classes2.dex */
        class e implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.a.g.b f2411b;

            e(com.aggmoread.sdk.z.a.g.b bVar) {
                this.f2411b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    b.a(this.f2411b, (com.aggmoread.sdk.z.a.f.a) a.this.f2401a);
                } catch (Throwable th) {
                    th.printStackTrace();
                    b.a(a.this.f2401a, new com.aggmoread.sdk.z.a.g.e(50003, "SDK内部处理异常!"));
                }
            }
        }

        a(com.aggmoread.sdk.z.a.i.b bVar, com.aggmoread.sdk.z.a.h.c cVar) {
            this.f2401a = bVar;
            this.f2402b = cVar;
        }

        @Override // com.aggmoread.sdk.z.a.p.a.f
        public void a(int i4, JSONObject jSONObject, com.aggmoread.sdk.z.a.g.e eVar) {
            Handler a5;
            Runnable eVar2;
            String str = "无广告填充!";
            try {
            } catch (Throwable th) {
                th.printStackTrace();
                b.a(this.f2401a, new com.aggmoread.sdk.z.a.g.e(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, "请求数据解析错误"));
            }
            if (eVar != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(eVar.a());
                sb.append(":");
                if (!TextUtils.isEmpty(eVar.b())) {
                    str = eVar.b();
                }
                sb.append(str);
                b.a(this.f2401a, new com.aggmoread.sdk.z.a.g.e(MindUserHandle.f68252v, sb.toString()));
                return;
            }
            com.aggmoread.sdk.z.a.g.b b5 = com.aggmoread.sdk.z.a.g.b.b(jSONObject);
            if (b5 == null) {
                b.a(this.f2401a, new com.aggmoread.sdk.z.a.g.e(MindUserHandle.f68252v, "无广告填充!"));
                return;
            }
            if (b5.f()) {
                b5.a(this.f2402b);
                if (com.aggmoread.sdk.z.a.i.a.f2166b == this.f2402b.h()) {
                    a5 = m.a();
                    eVar2 = new RunnableC0073a(b5);
                } else if (com.aggmoread.sdk.z.a.i.a.f2167c == this.f2402b.h()) {
                    a5 = m.a();
                    eVar2 = new RunnableC0074b(b5);
                } else if (com.aggmoread.sdk.z.a.i.a.f2170f == this.f2402b.h()) {
                    a5 = m.a();
                    eVar2 = new c(b5);
                } else if (com.aggmoread.sdk.z.a.i.a.f2168d == this.f2402b.h()) {
                    a5 = m.a();
                    eVar2 = new d(b5);
                } else if (com.aggmoread.sdk.z.a.i.a.f2169e == this.f2402b.h()) {
                    a5 = m.a();
                    eVar2 = new e(b5);
                }
                a5.post(eVar2);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b5.f2056c);
                sb2.append(":");
                if (!TextUtils.isEmpty(b5.f2057d)) {
                    str = b5.f2057d;
                }
                sb2.append(str);
                b.a(this.f2401a, new com.aggmoread.sdk.z.a.g.e(MindUserHandle.f68252v, sb2.toString()));
            }
            com.aggmoread.sdk.z.a.d.c("ADRIML", "onResponse: " + jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.aggmoread.sdk.z.a.r.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class RunnableC0075b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.a.g.e f2413b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.a.i.b f2414c;

        RunnableC0075b(com.aggmoread.sdk.z.a.g.e eVar, com.aggmoread.sdk.z.a.i.b bVar) {
            this.f2413b = eVar;
            this.f2414c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.aggmoread.sdk.z.a.d.a("ADRIML", "NFE %s", this.f2413b);
            this.f2414c.a(this.f2413b);
        }
    }

    public static void a(com.aggmoread.sdk.z.a.g.b bVar, com.aggmoread.sdk.z.a.f.a aVar) {
        if (!bVar.e()) {
            aVar.a(new com.aggmoread.sdk.z.a.g.e(MindUserHandle.f68252v, "无数据填充!"));
            return;
        }
        b.a.C0056a a5 = bVar.f2058e.get(0).a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.aggmoread.sdk.z.a.f.c(bVar, a5, aVar));
        aVar.onAdLoaded(arrayList);
    }

    public static void a(com.aggmoread.sdk.z.a.g.b bVar, com.aggmoread.sdk.z.a.k.a aVar) {
        if (!bVar.e()) {
            aVar.a(new com.aggmoread.sdk.z.a.g.e(MindUserHandle.f68252v, "无数据填充!"));
            return;
        }
        b.a.C0056a a5 = bVar.f2058e.get(0).a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.aggmoread.sdk.z.a.k.b(bVar, a5, aVar));
        aVar.onAdLoaded(arrayList);
    }

    public static void a(com.aggmoread.sdk.z.a.g.b bVar, com.aggmoread.sdk.z.a.l.a aVar) {
        if (!bVar.e()) {
            aVar.a(new com.aggmoread.sdk.z.a.g.e(MindUserHandle.f68252v, "无数据填充!"));
            return;
        }
        b.a.C0056a a5 = bVar.f2058e.get(0).a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.aggmoread.sdk.z.a.l.d(bVar, a5));
        aVar.onAdLoaded(arrayList);
    }

    public static void a(com.aggmoread.sdk.z.a.h.c cVar, com.aggmoread.sdk.z.a.i.b bVar) {
        com.aggmoread.sdk.z.a.d.c("ADRIML", "loadData enter , Request = " + cVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("requestId", cVar.k());
            jSONObject.put(com.alipay.sdk.packet.d.f4907p, new com.aggmoread.sdk.z.a.g.d().a(cVar.j()));
            jSONObject.put("network", new com.aggmoread.sdk.z.a.g.f().a(cVar.j()));
            jSONObject.put(URLPackage.KEY_CHANNEL_ID, cVar.i());
            jSONObject.put("pageInfo", new JSONObject());
            jSONObject.put("apiType", com.umeng.ccg.a.f64025r);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        String str = cVar.o() ? "http://a.wearewinner.cn:15921/api/test/ads" : "http://a.wearewinner.cn:15921/api/ads";
        com.aggmoread.sdk.z.a.d.c("ADRIML", "json : " + jSONObject.toString());
        String jSONObject2 = jSONObject.toString();
        com.aggmoread.sdk.z.a.d.d(jSONObject2, "getApiUrl() = " + str);
        com.aggmoread.sdk.z.a.p.a.a(str, jSONObject, (Map<String, String>) null, new a(bVar, cVar));
    }

    public static void a(com.aggmoread.sdk.z.a.i.b bVar, com.aggmoread.sdk.z.a.g.e eVar) {
        m.a().post(new RunnableC0075b(eVar, bVar));
    }
}

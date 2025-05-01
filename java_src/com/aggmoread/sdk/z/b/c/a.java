package com.aggmoread.sdk.z.b.c;

import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.aggmoread.sdk.z.a.g.e;
import com.aggmoread.sdk.z.a.h.a;
import com.aggmoread.sdk.z.a.m.m;
import com.aggmoread.sdk.z.a.p.a;
import com.aggmoread.sdk.z.a.r.d;
import com.aggmoread.sdk.z.b.a.a;
import com.aggmoread.sdk.z.c.a.a.d.b.j;
import com.umeng.analytics.pro.bm;
import com.xinzhu.overmind.server.user.MindUserHandle;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: com.aggmoread.sdk.z.b.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0087a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.a.i.b f2658a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.b.b.a f2659b;

        /* renamed from: com.aggmoread.sdk.z.b.c.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0088a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.b.a.a f2660b;

            RunnableC0088a(com.aggmoread.sdk.z.b.a.a aVar) {
                this.f2660b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    new com.aggmoread.sdk.z.b.d.a().a(this.f2660b, (d) C0087a.this.f2658a);
                } catch (Throwable th) {
                    th.printStackTrace();
                    com.aggmoread.sdk.z.a.i.b bVar = C0087a.this.f2658a;
                    a.a(bVar, new e(50003, "SDK内部处理异常!   -->" + th.toString()));
                }
            }
        }

        /* renamed from: com.aggmoread.sdk.z.b.c.a$a$b */
        /* loaded from: classes2.dex */
        class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.aggmoread.sdk.z.b.a.a f2662b;

            b(com.aggmoread.sdk.z.b.a.a aVar) {
                this.f2662b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.a(this.f2662b, (com.aggmoread.sdk.z.a.l.a) C0087a.this.f2658a);
                } catch (Throwable th) {
                    th.printStackTrace();
                    a.a(C0087a.this.f2658a, new e(50003, "SDK内部处理异常!"));
                }
            }
        }

        C0087a(com.aggmoread.sdk.z.a.i.b bVar, com.aggmoread.sdk.z.b.b.a aVar) {
            this.f2658a = bVar;
            this.f2659b = aVar;
        }

        @Override // com.aggmoread.sdk.z.a.p.a.f
        public void a(int i4, JSONObject jSONObject, e eVar) {
            Handler a5;
            Runnable bVar;
            String str = "无广告填充!";
            try {
            } catch (Throwable th) {
                th.printStackTrace();
                a.a(this.f2658a, new e(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, "请求数据解析错误"));
            }
            if (eVar != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(eVar.a());
                sb.append(":");
                if (!TextUtils.isEmpty(eVar.b())) {
                    str = eVar.b();
                }
                sb.append(str);
                a.a(this.f2658a, new e(MindUserHandle.f68252v, sb.toString()));
                return;
            }
            com.aggmoread.sdk.z.b.a.a b5 = com.aggmoread.sdk.z.b.a.a.b(jSONObject);
            if (b5 == null) {
                a.a(this.f2658a, new e(MindUserHandle.f68252v, "无广告填充!"));
                return;
            }
            if (b5.f()) {
                b5.a(this.f2659b);
                if (com.aggmoread.sdk.z.a.i.a.f2166b == this.f2659b.g()) {
                    a5 = m.a();
                    bVar = new RunnableC0088a(b5);
                } else if (com.aggmoread.sdk.z.a.i.a.f2167c == this.f2659b.g()) {
                    a5 = m.a();
                    bVar = new b(b5);
                }
                a5.post(bVar);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b5.f2614c);
                sb2.append(":");
                if (!TextUtils.isEmpty(b5.f2615d)) {
                    str = b5.f2615d;
                }
                sb2.append(str);
                a.a(this.f2658a, new e(MindUserHandle.f68252v, sb2.toString()));
            }
            com.aggmoread.sdk.z.a.d.c("DSPDRTAG", "onResponse: " + jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f2664b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.a.i.b f2665c;

        b(e eVar, com.aggmoread.sdk.z.a.i.b bVar) {
            this.f2664b = eVar;
            this.f2665c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.aggmoread.sdk.z.a.d.a("DSPDRTAG", "NFE %s", this.f2664b);
            this.f2665c.a(this.f2664b);
        }
    }

    public static void a(com.aggmoread.sdk.z.a.i.b bVar, e eVar) {
        m.a().post(new b(eVar, bVar));
    }

    public static void a(com.aggmoread.sdk.z.b.a.a aVar, com.aggmoread.sdk.z.a.l.a aVar2) {
        if (!aVar.e()) {
            aVar2.a(new e(MindUserHandle.f68252v, "无数据填充!"));
            return;
        }
        a.C0083a.C0084a a5 = aVar.f2616e.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.aggmoread.sdk.z.b.c.b(aVar, a5));
        aVar2.onAdLoaded(arrayList);
    }

    public static void a(com.aggmoread.sdk.z.b.b.a aVar, com.aggmoread.sdk.z.a.i.b bVar) {
        com.aggmoread.sdk.z.a.d.c("DSPDRTAG", "loadData enter , Request = " + aVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("slotCode", aVar.h());
            jSONObject.put("request_id", aVar.j());
            jSONObject.put("slot_type", aVar.g().a());
            com.aggmoread.sdk.z.a.h.a d5 = com.aggmoread.sdk.z.a.h.a.d();
            a.EnumC0059a enumC0059a = a.EnumC0059a.f2138c;
            jSONObject.put("imei", d5.a(enumC0059a).h());
            jSONObject.put("oaid", com.aggmoread.sdk.z.a.h.a.d().a(enumC0059a).o());
            jSONObject.put("os_type", "1");
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put(bm.f63454o, aVar.i().getPackageName());
            jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, com.aggmoread.sdk.z.a.p.e.b(aVar.i()));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        String d6 = j.d();
        com.aggmoread.sdk.z.a.d.c("DSPDRTAG", "getDspUrl() = " + d6);
        com.aggmoread.sdk.z.a.d.d(jSONObject.toString(), "getDspUrl() = Json ");
        com.aggmoread.sdk.z.a.p.a.a(d6, jSONObject, (Map<String, String>) null, new C0087a(bVar, aVar));
    }
}

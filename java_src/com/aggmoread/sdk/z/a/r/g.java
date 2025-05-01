package com.aggmoread.sdk.z.a.r;

import com.aggmoread.sdk.z.a.m.m;
import com.aggmoread.sdk.z.a.p.a;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class g {

    /* loaded from: classes2.dex */
    static class a implements a.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f2448a;

        /* renamed from: com.aggmoread.sdk.z.a.r.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0078a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f2449b;

            RunnableC0078a(b bVar) {
                this.f2449b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2448a.a(this.f2449b);
            }
        }

        a(c cVar) {
            this.f2448a = cVar;
        }

        @Override // com.aggmoread.sdk.z.a.p.a.g
        public void a(int i4, byte[] bArr, com.aggmoread.sdk.z.a.g.e eVar) {
            com.aggmoread.sdk.z.a.d.c("CLKRJTAG", "onResponse enter , err = " + eVar);
            if (eVar == null) {
                if (bArr != null) {
                    try {
                        b bVar = new b();
                        String str = new String(bArr);
                        com.aggmoread.sdk.z.a.d.d(str, "request response");
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("data")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                            if (jSONObject2.has("clickid")) {
                                bVar.f2452a = jSONObject2.getString("clickid");
                            }
                            if (jSONObject2.has("dstlink")) {
                                bVar.f2453b = jSONObject2.getString("dstlink");
                            }
                            m.b(new RunnableC0078a(bVar));
                            return;
                        }
                        return;
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        StringBuilder sb = new StringBuilder();
                        sb.append("get clk err ,");
                        sb.append(e5.getMessage());
                        return;
                    }
                }
                com.aggmoread.sdk.z.a.d.c("CLKRJTAG", "onResponse enter , response = " + ((Object) null));
            }
            this.f2448a.a(b.f2451c);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f2451c = new b();

        /* renamed from: a  reason: collision with root package name */
        public String f2452a;

        /* renamed from: b  reason: collision with root package name */
        public String f2453b;

        public boolean a() {
            return this == f2451c;
        }

        public String toString() {
            return "ClickUrlResponseData{clickId='" + this.f2452a + "', clickUrl='" + this.f2453b + "'}";
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c {
        public abstract void a(b bVar);
    }

    public static void a(String str, c cVar) {
        com.aggmoread.sdk.z.a.p.a.a(str, null, new a(cVar));
    }
}

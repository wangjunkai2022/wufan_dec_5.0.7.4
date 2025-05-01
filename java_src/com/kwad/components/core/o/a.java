package com.kwad.components.core.o;

import android.content.Context;
import androidx.annotation.NonNull;
import com.kwad.components.core.proxy.a.b;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.collector.f;
import com.kwad.sdk.components.c;
import com.kwad.sdk.core.config.d;
import com.kwad.sdk.core.report.g;
import com.kwad.sdk.core.report.n;
import com.kwad.sdk.core.response.b.e;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.l;
import com.kwad.sdk.utils.t;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class a {
    private static boolean RR;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.core.o.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0467a {
        private static final a RT = new a();
    }

    protected a() {
    }

    public static n G(long j4) {
        return new n(j4);
    }

    private static n a(long j4, AdTemplate adTemplate, String str) {
        return new n(j4, adTemplate, str);
    }

    private static n b(long j4, AdTemplate adTemplate) {
        return new n(j4, adTemplate);
    }

    public static a qI() {
        return C0467a.RT;
    }

    public final void aD(int i4) {
        n G = G(10104L);
        G.azp = i4;
        g.a2(G);
    }

    public final void aE(int i4) {
        n G = G(10107L);
        G.azq = i4;
        g.a2(G);
    }

    public final void ap(Context context) {
        n G = G(11L);
        com.kwad.sdk.components.n nVar = (com.kwad.sdk.components.n) c.f(com.kwad.sdk.components.n.class);
        if (nVar != null) {
            JSONArray[] b5 = nVar.b(context, d.zm());
            G.azh = b5[0];
            G.azi = b5[1];
            g.a2(G);
        }
    }

    public final void av(@NonNull AdTemplate adTemplate) {
        g.a2(b(10007L, adTemplate));
    }

    public final void aw(@NonNull AdTemplate adTemplate) {
        g.a2(b(10208L, adTemplate));
    }

    public final void ax(@NonNull AdTemplate adTemplate) {
        g.a2(b(10209L, adTemplate));
    }

    public final void c(@NonNull AdTemplate adTemplate, int i4, int i5) {
        n b5 = b(10002L, adTemplate);
        b5.Fx();
        if (e.dK(adTemplate)) {
            b5.azo = com.kwad.sdk.core.response.b.a.K(e.dS(adTemplate));
        } else {
            b5.azo = e.dU(adTemplate);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("what", i4);
            jSONObject.put("extra", i5);
            b5.errorMsg = jSONObject.toString();
        } catch (JSONException e5) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e5);
        }
        g.a2(b5);
    }

    public final void e(@NonNull JSONObject jSONObject, int i4) {
        n G = G(10201L);
        t.putValue(jSONObject, "appChangeType", i4);
        G.azs = jSONObject;
        g.a2(G);
    }

    public final void f(AdTemplate adTemplate, int i4, String str) {
        n b5 = b(10109L, adTemplate);
        b5.azq = 1;
        b5.azr = str;
        g.a2(b5);
    }

    public final void g(@NonNull AdTemplate adTemplate, long j4) {
        n b5 = b(10202L, adTemplate);
        b5.azx = j4;
        g.a2(b5);
    }

    public final void h(AdTemplate adTemplate, long j4) {
        n b5 = b(10206L, adTemplate);
        b5.azN = j4;
        g.a2(b5);
    }

    public final void i(AdTemplate adTemplate, long j4) {
        n b5 = b(10207L, adTemplate);
        b5.azO = j4;
        g.a2(b5);
    }

    public final n m(String str, String str2) {
        n G = G(12200L);
        G.azW = str;
        G.azX = str2;
        return G;
    }

    public final void qJ() {
        if (RR) {
            return;
        }
        RR = true;
        com.kwad.sdk.utils.g.execute(new az() { // from class: com.kwad.components.core.o.a.1
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                n G = a.G(8L);
                G.azP = f.Bg();
                g.a2(G);
            }
        });
    }

    public final void qK() {
        g.a2(G(10101L));
    }

    public final void qL() {
        g.a2(G(10106L));
    }

    public final void a(@NonNull AdTemplate adTemplate, String str, String str2) {
        n b5 = b(10003L, adTemplate);
        b5.azo = str;
        b5.errorMsg = str2;
        g.a2(b5);
    }

    public final void b(@NonNull AdTemplate adTemplate, int i4, int i5) {
        n b5 = b(12006L, adTemplate);
        b5.Ye = i4;
        b5.are = i5;
        g.a2(b5);
    }

    public final void g(@NonNull AdTemplate adTemplate, int i4, String str) {
        n b5 = b(107L, adTemplate);
        b5.errorCode = i4;
        b5.errorMsg = str;
        g.a2(b5);
    }

    public final void e(AdTemplate adTemplate, int i4) {
        n b5 = b(10108L, adTemplate);
        b5.azq = i4;
        g.a2(b5);
    }

    public final void f(@NonNull AdTemplate adTemplate, int i4) {
        if (d.Dg()) {
            AdInfo dS = e.dS(adTemplate);
            n G = G(20000L);
            G.timestamp = System.currentTimeMillis();
            G.azY = i4;
            G.trace = dS.trace;
            G.azZ = BuildConfig.VERSION_CODE;
            G.posId = e.dL(adTemplate);
            g.a2(G);
        }
    }

    public final void a(int i4, @NonNull AdTemplate adTemplate, String str) {
        g.a2(a(i4, adTemplate, str));
    }

    public final void b(@NonNull AdTemplate adTemplate, String str, String str2) {
        n b5 = b(10005L, adTemplate);
        if (e.dK(adTemplate)) {
            b5.azo = com.kwad.sdk.core.response.b.a.K(e.dS(adTemplate));
        } else {
            b5.azo = e.dU(adTemplate);
        }
        b5.azo = str;
        b5.errorMsg = str2;
        g.a2(b5);
    }

    public final void a(@NonNull AdTemplate adTemplate, long j4, long j5, int i4) {
        n b5 = b(10203L, adTemplate);
        b5.WF = j4;
        b5.blockDuration = j5;
        b5.aze = i4;
        g.a2(b5);
    }

    public final void e(String str, String str2, boolean z4) {
        g.a(m(str, str2), z4);
    }

    public final void a(boolean z4, List<Integer> list) {
        n G = G(10204L);
        G.azz = z4;
        if (list.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (Integer num : list) {
                jSONArray.put(num);
            }
            G.azy = jSONArray;
        }
        g.a2(G);
    }

    public final void c(@NonNull JSONArray jSONArray) {
        n G = G(10200L);
        G.azt = jSONArray;
        g.a2(G);
    }

    public final void b(@NonNull AdTemplate adTemplate, long j4, int i4) {
        n b5 = b(104L, adTemplate);
        b5.clickTime = l.eo(adTemplate);
        b5.azD = j4;
        b5.azE = i4;
        g.a2(b5);
    }

    public final void a(SceneImpl sceneImpl, boolean z4, String str) {
        n G = G(10216L);
        G.azz = z4;
        G.azA = str;
        G.adScene = sceneImpl;
        g.a2(G);
    }

    public final void a(b bVar) {
        n G = G(10215L);
        G.RH = bVar.RH;
        G.RO = bVar.RO;
        G.RP = bVar.RP;
        G.RQ = bVar.RQ;
        g.a2(G);
    }

    public final void a(long j4, int i4) {
        if (d.Dg()) {
            n G = G(20000L);
            G.timestamp = System.currentTimeMillis();
            G.azY = i4;
            G.posId = j4;
            G.azZ = BuildConfig.VERSION_CODE;
            g.a2(G);
        }
    }
}

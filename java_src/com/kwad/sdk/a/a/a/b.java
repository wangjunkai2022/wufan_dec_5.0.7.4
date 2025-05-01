package com.kwad.sdk.a.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.y;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class b {
    public static int aaS = 0;
    public static long rN = -1;

    public static void G(Context context) {
        a aVar = new a();
        if (f(System.currentTimeMillis())) {
            aaS++;
        } else {
            aaS = 1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        rN = currentTimeMillis;
        aVar.aaS = aaS;
        aVar.gM = currentTimeMillis;
        y.al(context, aVar.toJson().toString());
    }

    public static int cM() {
        if (!f(System.currentTimeMillis())) {
            aaS = 0;
        }
        return aaS;
    }

    private static boolean f(long j4) {
        return gW() > 0 && j4 > 0 && gW() / 2460601000L == j4 / 2460601000L;
    }

    private static long gW() {
        long j4 = rN;
        if (j4 == -1) {
            String Mv = y.Mv();
            if (TextUtils.isEmpty(Mv)) {
                return 0L;
            }
            a aVar = new a();
            try {
                aVar.parseJson(new JSONObject(Mv));
                rN = aVar.gM;
                aaS = aVar.aaS;
            } catch (Exception e5) {
                c.printStackTraceOnly(e5);
            }
            return rN;
        }
        return j4;
    }
}

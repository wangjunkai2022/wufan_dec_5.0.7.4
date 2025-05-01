package com.kwad.components.ad.interstitial.c;

import android.content.Context;
import android.text.TextUtils;
import com.ksad.json.annotation.KsJson;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.y;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;
@KsJson
/* loaded from: classes5.dex */
public class b extends com.kwad.sdk.core.response.a.a {
    private static SimpleDateFormat gL = new SimpleDateFormat("yyyy-MM-dd");
    public long gM = -1;
    public int jB = 0;
    public int jC = 0;

    public static void G(Context context) {
        String Mm = y.Mm();
        b bVar = new b();
        if (TextUtils.isEmpty(Mm)) {
            bVar.jB = 1;
            bVar.gM = System.currentTimeMillis();
            y.Z(context, bVar.toJson().toString());
            return;
        }
        try {
            bVar.parseJson(new JSONObject(Mm));
            if (c(bVar.gM, System.currentTimeMillis())) {
                bVar.jB++;
            } else {
                bVar.jB = 1;
                bVar.jC = 0;
                bVar.gM = System.currentTimeMillis();
            }
            y.Z(context, bVar.toJson().toString());
        } catch (Exception e5) {
            c.printStackTraceOnly(e5);
        }
    }

    public static void H(Context context) {
        String Mm = y.Mm();
        b bVar = new b();
        if (TextUtils.isEmpty(Mm)) {
            bVar.jC = 1;
            bVar.gM = System.currentTimeMillis();
            y.Z(context, bVar.toJson().toString());
            return;
        }
        try {
            bVar.parseJson(new JSONObject(Mm));
            if (c(bVar.gM, System.currentTimeMillis())) {
                bVar.jC++;
            } else {
                bVar.jC = 1;
                bVar.jB = 0;
                bVar.gM = System.currentTimeMillis();
            }
            y.Z(context, bVar.toJson().toString());
        } catch (Exception e5) {
            c.printStackTraceOnly(e5);
        }
    }

    private static boolean c(long j4, long j5) {
        if (j4 > 0 && j5 > 0) {
            try {
                return gL.format(new Date(j4)).equals(gL.format(new Date(j5)));
            } catch (Exception e5) {
                c.printStackTraceOnly(e5);
            }
        }
        return false;
    }

    public static int cM() {
        String Mm = y.Mm();
        if (TextUtils.isEmpty(Mm)) {
            return 0;
        }
        b bVar = new b();
        try {
            bVar.parseJson(new JSONObject(Mm));
            return bVar.jB;
        } catch (Exception e5) {
            c.printStackTraceOnly(e5);
            return 0;
        }
    }

    public static int cN() {
        String Mm = y.Mm();
        if (TextUtils.isEmpty(Mm)) {
            return 0;
        }
        b bVar = new b();
        try {
            bVar.parseJson(new JSONObject(Mm));
            return bVar.jC;
        } catch (Exception e5) {
            c.printStackTraceOnly(e5);
            return 0;
        }
    }
}

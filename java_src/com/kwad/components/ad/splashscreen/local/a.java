package com.kwad.components.ad.splashscreen.local;

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
public class a extends com.kwad.sdk.core.response.a.a {
    private static SimpleDateFormat gL = new SimpleDateFormat("yyyy-MM-dd");
    public long gM = 0;
    public int gN = 0;

    public static void R(Context context) {
        String Mp = y.Mp();
        a aVar = new a();
        if (TextUtils.isEmpty(Mp)) {
            aVar.gN = 1;
            aVar.gM = System.currentTimeMillis();
            y.ad(context, aVar.toJson().toString());
            return;
        }
        try {
            aVar.parseJson(new JSONObject(Mp));
            if (c(aVar.gM, System.currentTimeMillis())) {
                aVar.gN++;
            } else {
                aVar.gN = 1;
            }
            aVar.gM = System.currentTimeMillis();
            y.ad(context, aVar.toJson().toString());
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
}

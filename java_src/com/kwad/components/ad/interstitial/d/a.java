package com.kwad.components.ad.interstitial.d;

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
    public long jD = -1;
    public int jE = 0;

    public static void I(Context context) {
        String Mr = y.Mr();
        a aVar = new a();
        if (TextUtils.isEmpty(Mr)) {
            aVar.jE = 1;
            aVar.jD = System.currentTimeMillis();
            y.af(context, aVar.toJson().toString());
            return;
        }
        try {
            aVar.parseJson(new JSONObject(Mr));
            if (c(aVar.jD, System.currentTimeMillis())) {
                aVar.jE++;
            } else {
                aVar.jE = 1;
                aVar.jD = System.currentTimeMillis();
            }
            y.af(context, aVar.toJson().toString());
        } catch (Exception e5) {
            c.printStackTrace(e5);
        }
    }

    private static boolean c(long j4, long j5) {
        if (j4 > 0 && j5 > 0) {
            try {
                return gL.format(new Date(j4)).equals(gL.format(new Date(j5)));
            } catch (Exception e5) {
                c.printStackTrace(e5);
            }
        }
        return false;
    }

    public static int cO() {
        String Mr = y.Mr();
        if (TextUtils.isEmpty(Mr)) {
            return 0;
        }
        a aVar = new a();
        try {
            aVar.parseJson(new JSONObject(Mr));
            if (c(aVar.jD, System.currentTimeMillis())) {
                return aVar.jE;
            }
            return 0;
        } catch (Exception e5) {
            c.printStackTrace(e5);
            return 0;
        }
    }
}

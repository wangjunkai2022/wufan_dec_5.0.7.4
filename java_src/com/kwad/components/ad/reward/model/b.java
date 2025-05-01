package com.kwad.components.ad.reward.model;

import android.content.Context;
import android.text.TextUtils;
import com.ksad.json.annotation.KsJson;
import com.kwad.sdk.utils.y;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;
@KsJson
/* loaded from: classes5.dex */
public class b extends com.kwad.sdk.core.response.a.a {
    private static SimpleDateFormat gL = new SimpleDateFormat("yyyy-MM-dd");
    public long jD = -1;
    public int jE = 0;

    public static void I(Context context) {
        String Mq = y.Mq();
        b bVar = new b();
        if (TextUtils.isEmpty(Mq)) {
            bVar.jE = 1;
            bVar.jD = System.currentTimeMillis();
            y.ae(context, bVar.toJson().toString());
            return;
        }
        try {
            bVar.parseJson(new JSONObject(Mq));
            if (c(bVar.jD, System.currentTimeMillis())) {
                bVar.jE++;
            } else {
                bVar.jE = 1;
                bVar.jD = System.currentTimeMillis();
            }
            y.ae(context, bVar.toJson().toString());
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
        }
    }

    private static boolean c(long j4, long j5) {
        if (j4 > 0 && j5 > 0) {
            try {
                return gL.format(new Date(j4)).equals(gL.format(new Date(j5)));
            } catch (Exception e5) {
                com.kwad.sdk.core.e.c.printStackTrace(e5);
            }
        }
        return false;
    }

    public static int cO() {
        String Mq = y.Mq();
        if (TextUtils.isEmpty(Mq)) {
            return 0;
        }
        b bVar = new b();
        try {
            bVar.parseJson(new JSONObject(Mq));
            if (c(bVar.jD, System.currentTimeMillis())) {
                return bVar.jE;
            }
            return 0;
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
            return 0;
        }
    }
}

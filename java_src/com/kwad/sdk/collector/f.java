package com.kwad.sdk.collector;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ak;
import com.kwad.sdk.utils.an;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
/* loaded from: classes5.dex */
public final class f {
    @Nullable
    public static JSONArray Bg() {
        Context context = ServiceProvider.getContext();
        List<g> aY = aY(context);
        aY.add(aX(context));
        return g.t(aY);
    }

    private static g aX(Context context) {
        boolean cE = an.cE(context);
        com.kwad.sdk.core.e.c.d("InfoCollector", "queryAccessibilityServicePermission result: " + cE);
        return new g(com.kuaishou.weapon.p0.g.f55591k, cE ? g.PERMISSION_GRANTED : g.PERMISSION_DENIED);
    }

    @NonNull
    private static List<g> aY(Context context) {
        String[] cD;
        int i4;
        ArrayList arrayList = new ArrayList();
        if (context != null && (cD = ak.cD(context)) != null) {
            for (String str : cD) {
                int aq = an.aq(context, str);
                if (aq == 0) {
                    i4 = g.PERMISSION_GRANTED;
                } else if (aq == -1) {
                    i4 = g.PERMISSION_DENIED;
                } else {
                    i4 = g.aoF;
                }
                arrayList.add(new g(str, i4));
            }
        }
        return arrayList;
    }
}

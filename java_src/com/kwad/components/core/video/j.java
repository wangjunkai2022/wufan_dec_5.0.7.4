package com.kwad.components.core.video;

import android.content.Context;
import androidx.annotation.NonNull;
import com.kwad.sdk.core.network.a.a;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ae;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes5.dex */
public final class j {
    private static Map<String, Integer> VJ = new ConcurrentHashMap();

    public static boolean a(@NonNull String str, String str2, a.C0525a c0525a) {
        String bx = ae.bx(str2);
        long currentTimeMillis = System.currentTimeMillis();
        com.kwad.sdk.core.e.c.i("VideoCacheHelper", "start cache video key:" + bx + "--url:" + str);
        boolean b5 = com.kwad.sdk.core.diskcache.b.a.DM().b(str, str2, c0525a);
        long currentTimeMillis2 = System.currentTimeMillis();
        com.kwad.sdk.core.e.c.i("VideoCacheHelper", "finish cache video key:" + bx + "--cache time:" + (currentTimeMillis2 - currentTimeMillis) + "--success:" + b5);
        return b5;
    }

    private static int aG(String str) {
        Integer num = VJ.get(str);
        if (num != null) {
            return num.intValue();
        }
        return com.kwad.sdk.core.config.d.zA();
    }

    public static boolean ay(@NonNull AdTemplate adTemplate) {
        File bZ = com.kwad.sdk.core.diskcache.b.a.DM().bZ(com.kwad.sdk.core.response.b.a.K(com.kwad.sdk.core.response.b.e.dS(adTemplate)));
        return bZ != null && bZ.exists();
    }

    public static String f(Context context, @NonNull AdTemplate adTemplate) {
        return a(context, com.kwad.sdk.core.response.b.e.ei(adTemplate), com.kwad.sdk.core.response.b.a.K(com.kwad.sdk.core.response.b.e.dS(adTemplate)));
    }

    public static String g(Context context, String str) {
        return a(context, aG(str), str);
    }

    public static void m(String str, int i4) {
        VJ.put(str, Integer.valueOf(i4));
    }

    private static String a(Context context, int i4, String str) {
        if (i4 >= 0) {
            return i4 > 0 ? com.kwad.sdk.core.videocache.c.a.by(context).eK(str) : str;
        }
        File bZ = com.kwad.sdk.core.diskcache.b.a.DM().bZ(str);
        return (bZ == null || !bZ.exists()) ? str : bZ.getAbsolutePath();
    }
}

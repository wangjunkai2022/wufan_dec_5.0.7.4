package com.kwad.sdk.core.network.a;

import android.util.Log;
import com.kwad.sdk.export.proxy.AdHttpProxy;
import com.kwad.sdk.export.proxy.AdHttpResponseListener;
import com.kwad.sdk.g;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.h;
import java.io.OutputStream;
/* loaded from: classes5.dex */
public final class a {
    private static AdHttpProxy axG;

    /* renamed from: com.kwad.sdk.core.network.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0525a {
        public String msg;
    }

    private static boolean EB() {
        h hVar = (h) ServiceProvider.get(h.class);
        if (hVar != null) {
            return hVar.zv();
        }
        return false;
    }

    public static boolean a(String str, OutputStream outputStream, C0525a c0525a, long j4, AdHttpResponseListener adHttpResponseListener) {
        AdHttpProxy aVar;
        boolean EB = EB();
        AdHttpProxy adHttpProxy = axG;
        if (adHttpProxy == null) {
            com.kwad.sdk.core.e.c.d("VideoCacheHelper", "isAdCacheEnable:" + EB);
            if (EB) {
                aVar = g.yy();
            } else {
                aVar = new com.kwad.sdk.core.network.c.a();
            }
            adHttpProxy = aVar;
            axG = adHttpProxy;
        }
        AdHttpProxy adHttpProxy2 = adHttpProxy;
        if (com.kwad.framework.b.a.md.booleanValue()) {
            if (adHttpProxy2 instanceof com.kwad.sdk.core.network.c.b) {
                com.kwad.sdk.core.e.c.d("VideoCacheHelper", "okHttp");
            } else {
                com.kwad.sdk.core.e.c.d("VideoCacheHelper", "Http");
            }
        }
        try {
            com.kwad.sdk.core.e.c.d("VideoCacheHelper", "downloadUrlToStream success size:" + j4 + " url:" + str);
            adHttpProxy2.downloadUrlToStream(str, outputStream, j4, adHttpResponseListener);
            return true;
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.d("VideoCacheHelper", Log.getStackTraceString(e5));
            c0525a.msg = e5.getMessage();
            return false;
        }
    }
}

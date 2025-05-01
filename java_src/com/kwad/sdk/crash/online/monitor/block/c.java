package com.kwad.sdk.crash.online.monitor.block;

import android.text.TextUtils;
import android.util.Log;
import com.kwad.sdk.m.d;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.h;
/* loaded from: classes5.dex */
public final class c {
    private static volatile boolean aHU;

    private static String a(com.kwad.sdk.crash.online.monitor.a.b bVar) {
        String str = new String(com.kwad.sdk.core.a.c.Ee().decode((bVar == null || TextUtils.isEmpty(bVar.aIn)) ? "b25SZXBvcnRJc3N1ZQ==" : bVar.aIn));
        com.kwad.sdk.core.e.c.d("perfMonitor.Injector", "report methodName:" + str);
        return str;
    }

    public static void b(com.kwad.sdk.crash.online.monitor.a.a aVar) {
        if (aHU) {
            return;
        }
        try {
            com.kwad.sdk.crash.online.monitor.a.b c5 = c(aVar);
            com.kwad.sdk.m.d.a(b(c5), a(c5), new d.a() { // from class: com.kwad.sdk.crash.online.monitor.block.c.1
                @Override // com.kwad.sdk.m.d.a
                public final void a(String str, long j4, long j5, String str2, String str3) {
                    f.a(str, j4, j5, str2, str3, false);
                }

                @Override // com.kwad.sdk.m.d.a
                public final void onError(String str) {
                    c.onError(str);
                }
            });
            aHU = true;
        } catch (Exception e5) {
            onError(Log.getStackTraceString(e5));
        }
    }

    private static com.kwad.sdk.crash.online.monitor.a.b c(com.kwad.sdk.crash.online.monitor.a.a aVar) {
        h hVar = (h) ServiceProvider.get(h.class);
        String appId = hVar != null ? hVar.getAppId() : "";
        if (TextUtils.isEmpty(appId)) {
            return null;
        }
        return aVar.fM(appId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onError(String str) {
        f.fL(str);
        com.kwad.sdk.core.e.c.w("perfMonitor.Injector", str);
    }

    private static String b(com.kwad.sdk.crash.online.monitor.a.b bVar) {
        String str = new String(com.kwad.sdk.core.a.c.Ee().decode((bVar == null || TextUtils.isEmpty(bVar.aIm)) ? "Y29tLnRlbmNlbnQubWF0cml4LnBsdWdpbi5QbHVnaW5MaXN0ZW5lcg==" : bVar.aIm));
        com.kwad.sdk.core.e.c.d("perfMonitor.Injector", "ListenerName:" + str);
        return str;
    }
}

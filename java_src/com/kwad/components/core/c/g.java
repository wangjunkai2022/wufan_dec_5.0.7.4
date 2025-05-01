package com.kwad.components.core.c;

import androidx.annotation.NonNull;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes5.dex */
public class g {
    private static volatile g JJ;
    private ConcurrentHashMap<String, WeakReference<Object>> JI = new ConcurrentHashMap<>();

    private static String am(AdTemplate adTemplate) {
        long dL = com.kwad.sdk.core.response.b.e.dL(adTemplate);
        long ec = com.kwad.sdk.core.response.b.e.ec(adTemplate);
        return dL + "-" + ec;
    }

    private static String b(h hVar) {
        String ng = hVar.ng();
        String nm = hVar.nm();
        return ng + "-" + nm;
    }

    @NonNull
    public static g nf() {
        if (JJ == null) {
            synchronized (g.class) {
                if (JJ == null) {
                    JJ = new g();
                }
            }
        }
        return JJ;
    }

    public final boolean a(h hVar) {
        String b5 = b(hVar);
        com.kwad.sdk.core.e.c.d("AdMemCachePool", "contains key: " + b5);
        boolean z4 = false;
        if (this.JI.containsKey(b5)) {
            WeakReference<Object> weakReference = this.JI.get(b5);
            if (weakReference != null && weakReference.get() != null) {
                z4 = true;
            }
            if (z4) {
                com.kwad.sdk.core.e.c.d("AdMemCachePool", "contains ad: " + weakReference.get());
            }
            return z4;
        }
        return false;
    }

    public final void add(Object obj) {
        if (obj instanceof com.kwad.components.core.internal.api.a) {
            this.JI.put(am(((com.kwad.components.core.internal.api.a) obj).getAdTemplate()), new WeakReference<>(obj));
        }
    }

    public final void al(AdTemplate adTemplate) {
        this.JI.remove(am(adTemplate));
    }
}

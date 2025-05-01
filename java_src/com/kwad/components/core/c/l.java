package com.kwad.components.core.c;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.kwad.sdk.core.response.model.AdResultData;
import com.kwad.sdk.core.threads.GlobalThreadPools;
import com.kwad.sdk.utils.az;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes5.dex */
public final class l implements c {
    @Nullable
    @WorkerThread
    public static AdResultData d(com.kwad.components.core.request.model.a aVar) {
        a mU = a.mU();
        if (mU == null) {
            return null;
        }
        int adNum = aVar.getAdNum();
        List<h> a5 = mU.a(String.valueOf(aVar.getPosId()), System.currentTimeMillis() / 1000, e.s(aVar.getPosId()).nb());
        if (com.kwad.sdk.core.config.d.Di()) {
            k(a5);
        }
        if (a5 == null || a5.size() <= 0) {
            return null;
        }
        Collections.sort(a5);
        return h.j(a5.subList(0, Math.min(a5.size(), adNum)));
    }

    private static void k(List<h> list) {
        if (list == null) {
            return;
        }
        Iterator<h> it2 = list.iterator();
        while (it2.hasNext()) {
            h next = it2.next();
            if (g.nf().a(next)) {
                com.kwad.sdk.core.e.c.d("StrategyLocalCacheFirst", "filterByMemCached contain: " + next.nm());
                it2.remove();
            }
        }
    }

    @Override // com.kwad.components.core.c.c
    public final void c(final com.kwad.components.core.request.model.a aVar) {
        GlobalThreadPools.Gr().submit(new az() { // from class: com.kwad.components.core.c.l.1
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                AdResultData d5 = l.d(aVar);
                if (d5 != null && !d5.isAdResultDataEmpty()) {
                    com.kwad.components.core.request.model.a.a(aVar, d5, true);
                    return;
                }
                com.kwad.components.core.request.model.a aVar2 = aVar;
                n.a(aVar2, new j(aVar2));
            }
        });
    }

    @Override // com.kwad.components.core.c.c
    public final String getName() {
        return "StrategyLocalCacheFirst";
    }
}

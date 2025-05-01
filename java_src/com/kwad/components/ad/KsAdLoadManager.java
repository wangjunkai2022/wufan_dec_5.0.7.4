package com.kwad.components.ad;

import androidx.annotation.NonNull;
import com.kwad.components.ad.adbit.c;
import com.kwad.components.core.c.d;
import com.kwad.components.core.c.g;
import com.kwad.sdk.core.network.e;
import com.kwad.sdk.l;
import java.util.List;
/* loaded from: classes5.dex */
public final class KsAdLoadManager {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum Holder {
        INSTANCE;
        
        private final KsAdLoadManager mInstance = new KsAdLoadManager((byte) 0);

        Holder() {
        }
    }

    /* synthetic */ KsAdLoadManager(byte b5) {
        this();
    }

    public static KsAdLoadManager M() {
        return Holder.INSTANCE.mInstance;
    }

    public static void a(@NonNull com.kwad.components.core.request.model.a aVar) {
        if (!l.zJ().Ag()) {
            e eVar = e.awH;
            com.kwad.components.core.request.model.a.a(aVar, eVar.errorCode, eVar.msg, true);
        } else if (c.b(aVar)) {
        } else {
            d.mX().c(aVar);
        }
    }

    public final synchronized <T> void b(List<T> list) {
        for (T t4 : list) {
            g.nf().add(t4);
        }
    }

    private KsAdLoadManager() {
    }

    public final synchronized <T> void a(T t4) {
        g.nf().add(t4);
    }
}

package com.kwad.components.ad.reward;

import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes5.dex */
public final class i {
    private Map<String, List<AdTemplate>> qf;

    /* loaded from: classes5.dex */
    static class a {
        private static final i qg = new i((byte) 0);
    }

    /* synthetic */ i(byte b5) {
        this();
    }

    public static i gk() {
        return a.qg;
    }

    public final void C(String str) {
        this.qf.remove(str);
    }

    private i() {
        this.qf = new ConcurrentHashMap();
    }
}

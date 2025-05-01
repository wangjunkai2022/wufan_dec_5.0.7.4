package com.kwad.components.core.c;

import com.kwad.sdk.components.DevelopMangerComponents;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.v;
/* loaded from: classes5.dex */
public final class b {
    private static void Z(String str) {
        if (mW() && com.kwad.sdk.l.zJ().yY()) {
            v.P(ServiceProvider.getContext(), str);
        }
    }

    public static void b(e eVar) {
        int na = eVar.na();
        Z("使用缓存策略: " + na);
    }

    public static boolean mW() {
        DevelopMangerComponents developMangerComponents = (DevelopMangerComponents) com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
        return false;
    }
}

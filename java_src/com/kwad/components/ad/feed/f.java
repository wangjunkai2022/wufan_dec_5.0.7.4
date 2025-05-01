package com.kwad.components.ad.feed;

import androidx.annotation.NonNull;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes5.dex */
public final class f {
    public static String c(@NonNull AdTemplate adTemplate) {
        String at = com.kwad.sdk.core.response.b.a.at(com.kwad.sdk.core.response.b.e.dS(adTemplate));
        if (com.kwad.components.core.c.b.mW()) {
            String str = adTemplate.fromCache ? "【cache】" : "";
            return str + at;
        }
        return at;
    }
}

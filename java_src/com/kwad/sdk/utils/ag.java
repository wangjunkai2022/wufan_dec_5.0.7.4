package com.kwad.sdk.utils;

import java.util.Map;
/* loaded from: classes5.dex */
public final class ag {
    private Map<String, com.kwad.sdk.core.webview.a> aQy;
    private Map<String, com.kwad.sdk.core.webview.c.c> aQz;

    public final void a(String str, com.kwad.sdk.core.webview.a aVar) {
        this.aQy.put(str, aVar);
    }

    public final void b(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.aQz.put(str, cVar);
    }

    public final com.kwad.sdk.core.webview.a gK(String str) {
        return this.aQy.get(str);
    }

    public final com.kwad.sdk.core.webview.c.c gL(String str) {
        return this.aQz.get(str);
    }

    public final void release() {
        for (com.kwad.sdk.core.webview.a aVar : this.aQy.values()) {
            aVar.oJ();
        }
        this.aQy.clear();
        this.aQz.clear();
    }
}

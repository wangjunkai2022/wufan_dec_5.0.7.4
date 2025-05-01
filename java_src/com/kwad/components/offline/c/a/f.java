package com.kwad.components.offline.c.a;

import com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoTKBridgeHandler;
/* loaded from: classes5.dex */
public final class f implements IOfflineCompoTKBridgeHandler {
    private final com.kwad.sdk.core.webview.c.g aef;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(com.kwad.sdk.core.webview.c.g gVar) {
        this.aef = gVar;
    }

    @Override // com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoTKBridgeHandler
    public final void callTKBridge(String str) {
        com.kwad.sdk.core.webview.c.g gVar = this.aef;
        if (gVar != null) {
            gVar.callTKBridge(str);
        }
    }
}

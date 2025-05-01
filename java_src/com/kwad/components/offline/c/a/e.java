package com.kwad.components.offline.c.a;

import com.kwad.components.offline.api.tk.IOfflineApkLoader;
import com.kwad.components.offline.api.tk.IOfflineApkLoaderHolder;
import com.kwad.sdk.components.j;
/* loaded from: classes5.dex */
public final class e implements IOfflineApkLoaderHolder {
    private j ZX;

    public e(j jVar) {
        this.ZX = jVar;
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineApkLoaderHolder
    public final IOfflineApkLoader getApkLoader(int i4) {
        return new d(this.ZX.aS(i4));
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineApkLoaderHolder
    public final IOfflineApkLoader getApkLoader(String str) {
        return new d(this.ZX.aW(str));
    }
}

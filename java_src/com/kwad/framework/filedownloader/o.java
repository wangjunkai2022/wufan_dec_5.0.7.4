package com.kwad.framework.filedownloader;

import android.content.Context;
import android.content.Intent;
import com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent;
import com.kwad.framework.filedownloader.services.e;
import com.kwad.sdk.api.proxy.app.FileDownloadService;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class o implements e.a, u {
    private static Class<?> afI;
    private final ArrayList<Runnable> afJ = new ArrayList<>();
    private com.kwad.framework.filedownloader.services.e afK;

    private static Class<?> vt() {
        if (afI == null) {
            afI = FileDownloadService.SharedMainProcessService.class;
        }
        return afI;
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean a(String str, String str2, boolean z4, int i4, int i5, int i6, boolean z5, com.kwad.framework.filedownloader.d.b bVar, boolean z6) {
        if (!isConnected()) {
            return com.kwad.framework.filedownloader.f.a.h(str, str2, z4);
        }
        this.afK.b(str, str2, z4, i4, i5, i6, z5, bVar, z6);
        return true;
    }

    @Override // com.kwad.framework.filedownloader.u
    public final void av(Context context) {
        a(context, null);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean bd(int i4) {
        if (!isConnected()) {
            return com.kwad.framework.filedownloader.f.a.bd(i4);
        }
        return this.afK.bd(i4);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final byte be(int i4) {
        if (!isConnected()) {
            return com.kwad.framework.filedownloader.f.a.be(i4);
        }
        return this.afK.be(i4);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean bf(int i4) {
        if (!isConnected()) {
            return com.kwad.framework.filedownloader.f.a.bf(i4);
        }
        return this.afK.bf(i4);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean isConnected() {
        return this.afK != null;
    }

    @Override // com.kwad.framework.filedownloader.services.e.a
    public final void onDisconnected() {
        this.afK = null;
        f.vd().c(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.disconnected, vt()));
    }

    private void a(Context context, Runnable runnable) {
        context.startService(new Intent(context, vt()));
    }

    @Override // com.kwad.framework.filedownloader.services.e.a
    public final void a(com.kwad.framework.filedownloader.services.e eVar) {
        this.afK = eVar;
        this.afJ.clear();
        for (Runnable runnable : (List) this.afJ.clone()) {
            runnable.run();
        }
        f.vd().c(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.connected, vt()));
    }
}

package com.kwad.framework.filedownloader;

import android.content.Context;
import com.kwad.framework.filedownloader.services.e;
import com.kwad.sdk.api.proxy.app.FileDownloadService;
/* loaded from: classes5.dex */
public final class n implements u {
    private final u afG;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a {
        private static final n afH = new n((byte) 0);
    }

    /* synthetic */ n(byte b5) {
        this();
    }

    public static n vq() {
        return a.afH;
    }

    public static e.a vr() {
        if (vq().afG instanceof o) {
            return (e.a) vq().afG;
        }
        return null;
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean a(String str, String str2, boolean z4, int i4, int i5, int i6, boolean z5, com.kwad.framework.filedownloader.d.b bVar, boolean z6) {
        return this.afG.a(str, str2, z4, i4, i5, i6, z5, bVar, z6);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final void av(Context context) {
        this.afG.av(context);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean bd(int i4) {
        return this.afG.bd(i4);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final byte be(int i4) {
        return this.afG.be(i4);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean bf(int i4) {
        return this.afG.bf(i4);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean isConnected() {
        return this.afG.isConnected();
    }

    private n() {
        u pVar;
        if (com.kwad.framework.filedownloader.f.e.xr().ajf) {
            pVar = new o();
        } else {
            pVar = new p(FileDownloadService.SeparateProcessService.class);
        }
        this.afG = pVar;
    }
}

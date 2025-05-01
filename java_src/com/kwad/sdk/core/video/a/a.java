package com.kwad.sdk.core.video.a;

import android.media.TimedText;
import com.kwad.sdk.core.video.a.c;
/* loaded from: classes5.dex */
public abstract class a implements c {
    private c.e UN;
    private c.i UO;
    private c.b UP;
    private c.InterfaceC0528c UQ;
    private c.d UR;
    private c.a US;
    private c.f aCl;
    private c.g aCm;
    private c.h aCn;

    /* JADX INFO: Access modifiers changed from: protected */
    public static void h(float f5) {
        if (f5 == 0.0f) {
            com.kwad.sdk.core.video.a.a.a.eF("autoMute");
        } else {
            com.kwad.sdk.core.video.a.a.a.eF("autoVoice");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void GH() {
        c.f fVar = this.aCl;
        if (fVar != null) {
            fVar.sc();
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(c.f fVar) {
        this.aCl = fVar;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void b(c.e eVar) {
        this.UN = eVar;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void c(c.d dVar) {
        this.UR = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyOnBufferingUpdate(int i4) {
        c.a aVar = this.US;
        if (aVar != null) {
            aVar.av(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyOnCompletion() {
        c.b bVar = this.UP;
        if (bVar != null) {
            bVar.py();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean notifyOnError(int i4, int i5) {
        com.kwad.sdk.core.video.a.a.a.eF("videoPlayError");
        c.InterfaceC0528c interfaceC0528c = this.UQ;
        return interfaceC0528c != null && interfaceC0528c.l(i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean notifyOnInfo(int i4, int i5) {
        c.d dVar = this.UR;
        return dVar != null && dVar.m(i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyOnPrepared() {
        c.e eVar = this.UN;
        if (eVar != null) {
            eVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyOnSeekComplete() {
        c.g gVar = this.aCm;
        if (gVar != null) {
            gVar.pz();
        }
    }

    public final void resetListeners() {
        this.aCl = null;
        this.UN = null;
        this.US = null;
        this.UP = null;
        this.aCm = null;
        this.UO = null;
        this.UQ = null;
        this.UR = null;
        this.aCn = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(int i4, int i5) {
        c.i iVar = this.UO;
        if (iVar != null) {
            iVar.k(i4, i5);
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(c.b bVar) {
        this.UP = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(TimedText timedText) {
        c.h hVar = this.aCn;
        if (hVar != null) {
            hVar.a(timedText);
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(c.a aVar) {
        this.US = aVar;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(c.g gVar) {
        this.aCm = gVar;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(c.i iVar) {
        this.UO = iVar;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(c.InterfaceC0528c interfaceC0528c) {
        this.UQ = interfaceC0528c;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(c.h hVar) {
        this.aCn = hVar;
    }
}

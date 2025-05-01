package com.kwad.components.ad.reward.m;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.components.ad.reward.g;
import com.kwad.components.core.video.l;
import com.kwad.sdk.utils.h;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes5.dex */
public final class e {
    private g qp;
    @Nullable
    private com.kwad.components.ad.reward.f.a xU;
    @Nullable
    private d xV;
    @Nullable
    private b xW;
    @NonNull
    private com.kwad.components.ad.k.a xX;
    private int xT = 0;
    private int xY = 0;
    private List<l> xZ = new CopyOnWriteArrayList();

    public e(g gVar) {
        this.qp = gVar;
        this.xX = new a(gVar.mAdTemplate);
    }

    private com.kwad.components.ad.k.a jM() {
        return this.xX;
    }

    public final void a(int i4, com.kwad.components.ad.k.a aVar) {
        this.xT = i4;
        if (i4 == 1) {
            this.xV = (d) aVar;
        } else if (i4 == 2) {
            this.xU = (com.kwad.components.ad.reward.f.a) aVar;
        } else if (i4 == 3) {
            this.xW = (b) aVar;
        }
        this.xX = aVar;
        for (l lVar : this.xZ) {
            this.xX.b(lVar);
        }
        this.xZ.clear();
    }

    public final void b(@Nullable l lVar) {
        jM().a(lVar);
        if (lVar != null) {
            this.xZ.remove(lVar);
        }
    }

    public final long getPlayDuration() {
        return jM().getPlayDuration();
    }

    public final void jJ() {
        d dVar = this.xV;
        if (dVar != null) {
            dVar.jJ();
        } else {
            b bVar = this.xW;
            if (bVar != null) {
                bVar.jJ();
            }
        }
        this.qp.fz();
    }

    public final void jK() {
        d dVar = this.xV;
        if (dVar != null) {
            dVar.jK();
        }
    }

    public final boolean jN() {
        return this.xU != null;
    }

    @Nullable
    public final com.kwad.components.ad.reward.f.a jO() {
        return this.xU;
    }

    @Nullable
    public final b jP() {
        return this.xW;
    }

    public final void pause() {
        jM().pause();
    }

    public final void release() {
        jM().release();
    }

    public final void resume() {
        int i4;
        jM().resume();
        com.kwad.components.ad.reward.f.a aVar = this.xU;
        if (aVar == null || (i4 = this.xY) <= 0) {
            return;
        }
        aVar.setAudioEnabled(i4 == 2, false);
    }

    public final void setAudioEnabled(boolean z4, boolean z5) {
        this.xY = z4 ? 2 : 1;
        jM().setAudioEnabled(z4, z5);
    }

    public final void skipToEnd() {
        jM().skipToEnd();
    }

    public final void b(h.a aVar) {
        d dVar = this.xV;
        if (dVar != null) {
            dVar.b(aVar);
        }
    }

    public final void a(@Nullable l lVar) {
        if (jM().jI()) {
            this.xZ.add(lVar);
        } else {
            jM().b(lVar);
        }
    }

    public final void a(h.a aVar) {
        d dVar = this.xV;
        if (dVar != null) {
            dVar.a(aVar);
        }
    }
}

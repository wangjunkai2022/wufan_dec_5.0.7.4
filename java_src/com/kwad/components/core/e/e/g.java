package com.kwad.components.core.e.e;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes5.dex */
public final class g {
    private final List<f> LW;

    /* loaded from: classes5.dex */
    public static class a {
        private static final g LX = new g((byte) 0);
    }

    /* synthetic */ g(byte b5) {
        this();
    }

    public static g oQ() {
        return a.LX;
    }

    public final void a(f fVar) {
        this.LW.add(fVar);
    }

    public final void b(f fVar) {
        if (fVar != null) {
            this.LW.remove(fVar);
        }
    }

    public final void oR() {
        for (f fVar : this.LW) {
            fVar.show();
        }
    }

    public final void oS() {
        for (f fVar : this.LW) {
            fVar.dismiss();
        }
    }

    private g() {
        this.LW = new CopyOnWriteArrayList();
    }
}

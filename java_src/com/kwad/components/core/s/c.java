package com.kwad.components.core.s;

import java.util.HashSet;
import java.util.Set;
/* loaded from: classes5.dex */
public final class c {
    private Set<b> TL;

    /* loaded from: classes5.dex */
    static class a {
        private static c TM = new c((byte) 0);
    }

    /* loaded from: classes5.dex */
    public interface b {
        void onPageClose();
    }

    /* synthetic */ c(byte b5) {
        this();
    }

    public static c rD() {
        return a.TM;
    }

    public final void a(b bVar) {
        this.TL.add(bVar);
    }

    public final void b(b bVar) {
        this.TL.remove(bVar);
    }

    public final void rE() {
        if (this.TL.size() == 0) {
            return;
        }
        for (b bVar : this.TL) {
            bVar.onPageClose();
        }
    }

    private c() {
        this.TL = new HashSet();
    }
}

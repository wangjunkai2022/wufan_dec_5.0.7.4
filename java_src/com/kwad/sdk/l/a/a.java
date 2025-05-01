package com.kwad.sdk.l.a;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public final class a {
    private final List<b> aOm = new ArrayList();

    public final void addBackPressable(b bVar) {
        if (bVar != null) {
            this.aOm.add(bVar);
        }
    }

    public final boolean onBackPressed() {
        for (b bVar : this.aOm) {
            if (bVar.onBackPressed()) {
                return true;
            }
        }
        return false;
    }

    public final void removeBackPressable(b bVar) {
        if (bVar != null) {
            this.aOm.remove(bVar);
        }
    }

    public final void addBackPressable(b bVar, int i4) {
        if (bVar != null) {
            this.aOm.add(i4, bVar);
        }
    }
}

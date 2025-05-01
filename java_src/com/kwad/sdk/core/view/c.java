package com.kwad.sdk.core.view;

import android.view.View;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes5.dex */
public final class c {
    private List<b> aEU = new CopyOnWriteArrayList();

    public final void a(b bVar) {
        this.aEU.add(bVar);
    }

    public final void b(b bVar) {
        this.aEU.remove(bVar);
    }

    public final void j(View view, boolean z4) {
        for (b bVar : this.aEU) {
            bVar.i(view, z4);
        }
    }
}

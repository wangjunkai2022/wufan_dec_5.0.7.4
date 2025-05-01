package com.kwad.sdk.core.network;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes5.dex */
public class h {
    private static volatile h axa;
    private List<a> awZ = new CopyOnWriteArrayList();

    /* loaded from: classes5.dex */
    public interface a {
        void a(f fVar, int i4);
    }

    private h() {
    }

    public static h Ex() {
        if (axa == null) {
            synchronized (h.class) {
                if (axa == null) {
                    axa = new h();
                }
            }
        }
        return axa;
    }

    public final void a(a aVar) {
        this.awZ.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(f fVar, int i4) {
        for (a aVar : this.awZ) {
            aVar.a(fVar, i4);
        }
    }
}

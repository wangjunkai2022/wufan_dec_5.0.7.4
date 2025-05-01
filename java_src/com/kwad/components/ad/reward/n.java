package com.kwad.components.ad.reward;
/* loaded from: classes5.dex */
public final class n {
    public static void a(int i4, int i5, g gVar, com.kwad.components.ad.reward.model.c cVar) {
        if (i4 == 0) {
            com.kwad.sdk.core.adlog.c.l(cVar.getAdTemplate(), 1);
        } else if (i4 == 1) {
            if (i5 == 0) {
                if (gVar.ps.jC()) {
                    com.kwad.sdk.core.adlog.c.l(cVar.getAdTemplate(), 1);
                }
            } else if (gVar.ps.jC()) {
                com.kwad.sdk.core.adlog.c.l(cVar.getAdTemplate(), 5);
            } else {
                com.kwad.sdk.core.adlog.c.l(cVar.getAdTemplate(), 4);
            }
        } else if (i4 != 2) {
        } else {
            if (i5 == 0) {
                if (gVar.pr.jC()) {
                    com.kwad.sdk.core.adlog.c.l(cVar.getAdTemplate(), 1);
                }
            } else if (gVar.pr.jC()) {
                com.kwad.sdk.core.adlog.c.l(cVar.getAdTemplate(), 3);
            } else {
                com.kwad.sdk.core.adlog.c.l(cVar.getAdTemplate(), 2);
            }
        }
    }
}

package com.kwad.sdk.core.video.a;

import android.content.Context;
import androidx.annotation.NonNull;
import com.kwad.sdk.core.report.g;
import com.kwad.sdk.core.report.n;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ao;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public final class e {
    private static boolean Uw = false;
    private static AtomicBoolean aCD = null;
    private static int aCE = -1;
    private static final AtomicBoolean aCF = new AtomicBoolean(false);
    private static final AtomicBoolean aCG = new AtomicBoolean(false);
    private static int aCH;

    private static boolean Bf() {
        return aCG.get() || com.kwad.framework.a.a.IX.booleanValue();
    }

    public static int GP() {
        return aCH;
    }

    private static boolean GQ() {
        AtomicBoolean atomicBoolean = aCD;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
        aCD = atomicBoolean2;
        return atomicBoolean2.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c a(@NonNull Context context, boolean z4, boolean z5, boolean z6, int i4) {
        boolean z7;
        b bVar;
        b bVar2;
        try {
            if (Bf() && z5 && GQ()) {
                com.kwad.sdk.core.e.c.i("MediaPlayerImpl", "constructPlayer KwaiMediaPlayer");
                d dVar = new d(i4);
                aCH = 2;
                dVar.bn(z4);
                bVar2 = dVar;
            } else {
                com.kwad.sdk.core.e.c.i("MediaPlayerImpl", "constructPlayer AndroidMediaPlayer");
                b bVar3 = new b();
                aCH = 1;
                bVar2 = bVar3;
            }
            z7 = false;
            bVar = bVar2;
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.e("MediaPlayerImpl", "constructPlayer exception, using AndroidMediaPlayer", th);
            if (!Uw) {
                Uw = true;
                com.kwad.sdk.service.c.gatherException(th);
            }
            b bVar4 = new b();
            aCH = 1;
            z7 = true;
            bVar = bVar4;
        }
        int a5 = ao.a(Bf(), ServiceProvider.get(com.kwad.sdk.service.a.f.class) != null && ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).yV(), z5, GQ(), z7, z6, bVar.getMediaPlayerType());
        com.kwad.sdk.core.e.c.T("KwaiPlayHelper", "player v=" + Integer.toBinaryString(a5));
        if (aCE != a5) {
            aCE = a5;
            dq(a5);
        }
        return bVar;
    }

    private static void dq(int i4) {
        n nVar = new n(10212L);
        nVar.azC = i4;
        g.a2(nVar);
    }
}

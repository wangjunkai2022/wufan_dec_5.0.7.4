package com.kwad.components.ad.reward;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.bo;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes5.dex */
public final class a {
    private final Set<com.kwad.components.ad.reward.e.j> oh;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.ad.reward.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0421a {
        private static final a ol = new a((byte) 0);
    }

    /* synthetic */ a(byte b5) {
        this();
    }

    public static a eY() {
        return C0421a.ol;
    }

    private void fa() {
        if (this.oh.size() == 0) {
            return;
        }
        for (com.kwad.components.ad.reward.e.j jVar : this.oh) {
            jVar.bY();
        }
    }

    private static boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public final void b(com.kwad.components.ad.reward.e.j jVar) {
        this.oh.remove(jVar);
    }

    public final void c(final PlayableSource playableSource, @Nullable final com.kwad.components.ad.reward.e.n nVar) {
        if (isMainThread()) {
            b(playableSource, nVar);
        } else {
            bo.runOnUiThread(new az() { // from class: com.kwad.components.ad.reward.a.1
                @Override // com.kwad.sdk.utils.az
                public final void doTask() {
                    a.this.b(playableSource, nVar);
                }
            });
        }
    }

    public final void eZ() {
        if (isMainThread()) {
            fa();
        } else {
            bo.runOnUiThread(new az() { // from class: com.kwad.components.ad.reward.a.2
                @Override // com.kwad.sdk.utils.az
                public final void doTask() {
                    a.this.eZ();
                }
            });
        }
    }

    private a() {
        this.oh = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(PlayableSource playableSource, @Nullable com.kwad.components.ad.reward.e.n nVar) {
        if (this.oh.size() == 0) {
            return;
        }
        for (com.kwad.components.ad.reward.e.j jVar : this.oh) {
            jVar.a(playableSource, nVar);
        }
    }

    public final void a(com.kwad.components.ad.reward.e.j jVar) {
        if (jVar != null) {
            this.oh.add(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(PlayableSource playableSource) {
        if (this.oh.size() == 0) {
            return;
        }
        for (com.kwad.components.ad.reward.e.j jVar : this.oh) {
            jVar.bZ();
        }
    }

    public final void a(PlayableSource playableSource) {
        c(playableSource, null);
    }

    public final void b(final PlayableSource playableSource) {
        if (isMainThread()) {
            c(playableSource);
        } else {
            bo.runOnUiThread(new az() { // from class: com.kwad.components.ad.reward.a.3
                @Override // com.kwad.sdk.utils.az
                public final void doTask() {
                    a.this.c(playableSource);
                }
            });
        }
    }
}

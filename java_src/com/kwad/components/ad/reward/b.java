package com.kwad.components.ad.reward;

import android.os.Looper;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.bo;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes5.dex */
public final class b {
    private final Set<com.kwad.components.ad.reward.e.l> om;

    /* loaded from: classes5.dex */
    static class a {
        private static final b oo = new b((byte) 0);
    }

    /* synthetic */ b(byte b5) {
        this();
    }

    public static b fc() {
        return a.oo;
    }

    private void fd() {
        if (this.om.size() == 0) {
            return;
        }
        for (com.kwad.components.ad.reward.e.l lVar : this.om) {
            lVar.onRewardVerify();
        }
    }

    private static boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public final void a(com.kwad.components.ad.reward.e.l lVar) {
        if (lVar != null) {
            this.om.add(lVar);
        }
    }

    public final void b(com.kwad.components.ad.reward.e.l lVar) {
        this.om.remove(lVar);
    }

    public final void notifyRewardVerify() {
        if (isMainThread()) {
            fd();
        } else {
            bo.runOnUiThread(new az() { // from class: com.kwad.components.ad.reward.b.1
                @Override // com.kwad.sdk.utils.az
                public final void doTask() {
                    b.this.notifyRewardVerify();
                }
            });
        }
    }

    private b() {
        this.om = new HashSet();
    }
}

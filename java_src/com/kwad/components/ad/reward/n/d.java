package com.kwad.components.ad.reward.n;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.kwad.sdk.utils.aj;
/* loaded from: classes5.dex */
public abstract class d {
    /* JADX INFO: Access modifiers changed from: protected */
    public void a(r rVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ab(boolean z4) {
    }

    public final void b(@NonNull r rVar) {
        a(rVar);
        gG().getContext();
        ab(aj.ML());
    }

    public abstract ViewGroup gG();

    public void onUnbind() {
    }
}

package com.kwad.components.ad.interstitial.f;

import android.view.View;
import androidx.annotation.NonNull;
import com.kwad.sdk.utils.br;
/* loaded from: classes5.dex */
public final class b extends com.kwad.components.core.widget.a.a {
    private View mRootView;

    public b(@NonNull View view, int i4) {
        super(view, i4);
        this.mRootView = view;
    }

    @Override // com.kwad.components.core.widget.a.a
    public final boolean dX() {
        return br.o(this.mRootView, 100);
    }
}

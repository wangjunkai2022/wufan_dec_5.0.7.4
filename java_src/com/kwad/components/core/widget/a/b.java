package com.kwad.components.core.widget.a;

import android.view.View;
import androidx.annotation.NonNull;
import com.kwad.sdk.utils.br;
/* loaded from: classes5.dex */
public class b extends a {
    private View mRootView;

    public b(@NonNull View view, int i4) {
        super(view, i4);
        this.mRootView = view;
    }

    @Override // com.kwad.components.core.widget.a.a
    public boolean dX() {
        return br.a(this.mRootView, 70, true);
    }
}

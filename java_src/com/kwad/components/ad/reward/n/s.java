package com.kwad.components.ad.reward.n;

import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.IdRes;
/* loaded from: classes5.dex */
public abstract class s extends d {
    protected ViewGroup sA;

    public final void a(ViewGroup viewGroup, @IdRes int i4, @IdRes int i5) {
        if (this.sA != null) {
            return;
        }
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(i4);
        if (viewStub != null) {
            this.sA = (ViewGroup) viewStub.inflate();
        } else {
            this.sA = (ViewGroup) viewGroup.findViewById(i5);
        }
    }

    @Override // com.kwad.components.ad.reward.n.d
    public ViewGroup gG() {
        return this.sA;
    }
}

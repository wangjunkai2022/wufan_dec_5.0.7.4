package com.kwad.components.core.page.recycle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes5.dex */
public class g extends RecyclerView {
    private boolean QE;

    public g(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public void removeDetachedView(View view, boolean z4) {
        if (!this.QE) {
            super.removeDetachedView(view, z4);
        } else {
            super.removeDetachedView(view, z4);
        }
    }

    public void setIngoreTmpDetachedFlag(boolean z4) {
        this.QE = z4;
    }

    public g(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public g(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}

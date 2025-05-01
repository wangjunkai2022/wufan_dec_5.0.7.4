package com.kwad.components.core.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.kwad.sdk.utils.aj;
/* loaded from: classes5.dex */
public final class f extends FrameLayout {
    private boolean ade;
    protected boolean iD;

    /* renamed from: if  reason: not valid java name */
    protected g f2if;
    @NonNull
    protected Context mContext;

    public f(@NonNull Context context) {
        super(context);
        this.mContext = context;
        this.iD = aj.ML();
    }

    private void tY() {
        boolean ML = aj.ML();
        if (!this.ade || ML == this.iD) {
            return;
        }
        this.iD = ML;
        g gVar = this.f2if;
        if (gVar != null) {
            gVar.j(!ML);
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        tY();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        this.ade = i4 == 0;
        tY();
    }

    public final void setOrientationChangeListener(g gVar) {
        this.f2if = gVar;
    }
}

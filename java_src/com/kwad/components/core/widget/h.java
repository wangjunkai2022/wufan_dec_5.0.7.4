package com.kwad.components.core.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
@RequiresApi(api = 21)
/* loaded from: classes5.dex */
public final class h extends ViewOutlineProvider {
    private float adf;

    private h(float f5) {
        this.adf = f5;
    }

    @RequiresApi(api = 21)
    public static void b(View view, float f5) {
        if (f5 <= 0.0f) {
            view.setOutlineProvider(null);
            view.setClipToOutline(false);
            return;
        }
        view.setOutlineProvider(new h(f5));
        view.setClipToOutline(true);
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.adf);
    }
}

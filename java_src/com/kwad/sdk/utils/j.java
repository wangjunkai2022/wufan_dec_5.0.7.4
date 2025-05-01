package com.kwad.sdk.utils;

import android.content.Context;
import androidx.annotation.Nullable;
/* loaded from: classes5.dex */
public abstract class j<T> {
    protected boolean JE;
    protected boolean aPE = false;

    public j(boolean z4) {
        this.JE = z4;
    }

    public final void bQ(boolean z4) {
        this.JE = z4;
    }

    @Nullable
    public final T cb(Context context) {
        if (this.JE && !this.aPE) {
            try {
                return cc(context);
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                return null;
            }
        }
        return null;
    }

    @Nullable
    protected abstract T cc(Context context);
}

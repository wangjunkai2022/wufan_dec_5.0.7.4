package com.kwad.sdk.utils;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
/* loaded from: classes5.dex */
public final class ap {
    private static volatile ap aQF = new ap();
    private volatile boolean aQG;
    private volatile long aQH = 0;
    private volatile PowerManager aQI;

    public static ap MM() {
        return aQF;
    }

    public final boolean cF(Context context) {
        if (this.aQH > 0 && SystemClock.elapsedRealtime() - this.aQH < 600) {
            return this.aQG;
        }
        boolean z4 = false;
        if (this.aQI == null && context != null) {
            synchronized (this) {
                if (this.aQI == null) {
                    this.aQI = (PowerManager) context.getApplicationContext().getSystemService("power");
                }
            }
        }
        if (this.aQI != null) {
            if (Build.VERSION.SDK_INT >= 20) {
                z4 = this.aQI.isInteractive();
            } else {
                z4 = this.aQI.isScreenOn();
            }
        }
        this.aQG = z4;
        this.aQH = SystemClock.elapsedRealtime();
        return this.aQG;
    }
}

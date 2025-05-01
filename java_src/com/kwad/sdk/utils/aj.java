package com.kwad.sdk.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes5.dex */
public final class aj {
    public static boolean ML() {
        return isOrientationPortrait();
    }

    public static void b(Context context, boolean z4) {
        try {
            Activity dB = com.kwad.sdk.n.l.dB(context);
            if (dB == null) {
                return;
            }
            if (z4) {
                if (Build.VERSION.SDK_INT < 19) {
                    dB.getWindow().getDecorView().setSystemUiVisibility(8);
                } else {
                    dB.getWindow().getDecorView().setSystemUiVisibility(1792);
                }
            } else if (Build.VERSION.SDK_INT < 19) {
                dB.getWindow().getDecorView().setSystemUiVisibility(0);
            } else {
                dB.getWindow().getDecorView().setSystemUiVisibility(3846);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public static void cA(Context context) {
        Activity dB = com.kwad.sdk.n.l.dB(context);
        if (dB != null) {
            dB.setRequestedOrientation(0);
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public static void cB(Context context) {
        Activity dB = com.kwad.sdk.n.l.dB(context);
        if (dB != null) {
            dB.setRequestedOrientation(1);
        }
    }

    public static boolean cy(Context context) {
        Activity dB = com.kwad.sdk.n.l.dB(context);
        if (dB != null) {
            Window window = dB.getWindow();
            r0 = (window.getAttributes().flags & 1024) == 1024;
            window.setFlags(1024, 1024);
        }
        return r0;
    }

    public static void cz(Context context) {
        Activity dB = com.kwad.sdk.n.l.dB(context);
        if (dB != null) {
            dB.getWindow().clearFlags(1024);
        }
    }

    public static boolean isOrientationPortrait() {
        return ServiceProvider.Lw().getApplicationContext().getResources().getConfiguration().orientation == 1;
    }
}

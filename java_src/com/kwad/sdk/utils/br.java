package com.kwad.sdk.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
/* loaded from: classes5.dex */
public final class br {
    public static boolean a(View view, int i4, boolean z4) {
        return view != null && b(view, i4, z4) && cF(view.getContext());
    }

    private static boolean b(View view, int i4, boolean z4) {
        if (view == null || view.getParent() == null) {
            return false;
        }
        Activity dB = com.kwad.sdk.n.l.dB(view.getContext());
        if ((dB == null || !dB.isFinishing()) && view.isShown() && view.getVisibility() == 0 && (!z4 || view.hasWindowFocus())) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                long height = rect.height() * rect.width();
                long height2 = view.getHeight() * view.getWidth();
                if (height2 > 0 && height * 100 >= i4 * height2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private static boolean cF(Context context) {
        return ap.MM().cF(context);
    }

    public static double k(View view, boolean z4) {
        Rect rect;
        if (view == null) {
            return -1.0d;
        }
        if (cF(view.getContext())) {
            if (view.getParent() == null) {
                return -3.0d;
            }
            Activity dB = com.kwad.sdk.n.l.dB(view.getContext());
            if (dB == null || !dB.isFinishing()) {
                if (view.isShown() && view.getVisibility() == 0) {
                    if (view.hasWindowFocus()) {
                        if (view.getGlobalVisibleRect(new Rect())) {
                            long height = rect.height() * rect.width();
                            long height2 = view.getHeight() * view.getWidth();
                            if (height2 <= 0) {
                                return -7.0d;
                            }
                            double d5 = height;
                            Double.isNaN(d5);
                            double d6 = height2;
                            Double.isNaN(d6);
                            return (d5 * 100.0d) / d6;
                        }
                        return -8.0d;
                    }
                    return -6.0d;
                }
                return -5.0d;
            }
            return -4.0d;
        }
        return -2.0d;
    }

    public static boolean o(View view, int i4) {
        return view != null && b(view, i4, true) && view.hasWindowFocus() && cF(view.getContext());
    }
}

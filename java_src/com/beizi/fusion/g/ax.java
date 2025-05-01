package com.beizi.fusion.g;

import android.graphics.Rect;
import android.view.View;
/* compiled from: ViewCheckUtil.java */
/* loaded from: classes2.dex */
public class ax {
    public static boolean a(View view) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null || !view.hasWindowFocus()) {
            return false;
        }
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            int height = rect.height() * rect.width();
            double height2 = view.getHeight() * view.getWidth();
            Double.isNaN(height2);
            int i4 = (int) (height2 * 0.95d);
            return i4 > 0 && height >= i4;
        }
        return false;
    }

    public static boolean b(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null && view.hasWindowFocus()) {
                    Rect rect = new Rect();
                    if (view.getGlobalVisibleRect(rect)) {
                        return rect.height() * rect.width() > 0;
                    }
                    return false;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return true;
            }
        }
        return false;
    }
}

package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.color.MaterialColors;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    private EdgeToEdgeUtils() {
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z4) {
        applyEdgeToEdge(window, z4, null, null);
    }

    @TargetApi(21)
    private static int getNavigationBarColor(Context context, boolean z4) {
        if (!z4 || Build.VERSION.SDK_INT >= 27) {
            if (z4) {
                return 0;
            }
            return MaterialColors.getColor(context, 16843858, -16777216);
        }
        return ColorUtils.setAlphaComponent(MaterialColors.getColor(context, 16843858, -16777216), 128);
    }

    @TargetApi(21)
    private static int getStatusBarColor(Context context, boolean z4) {
        if (!z4 || Build.VERSION.SDK_INT >= 23) {
            if (z4) {
                return 0;
            }
            return MaterialColors.getColor(context, 16843857, -16777216);
        }
        return ColorUtils.setAlphaComponent(MaterialColors.getColor(context, 16843857, -16777216), 128);
    }

    private static boolean isUsingLightSystemBar(int i4, boolean z4) {
        return MaterialColors.isColorLight(i4) || (i4 == 0 && z4);
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z4, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        boolean z5 = false;
        boolean z6 = num == null || num.intValue() == 0;
        z5 = (num2 == null || num2.intValue() == 0) ? true : true;
        if (z6 || z5) {
            int color = MaterialColors.getColor(window.getContext(), 16842801, -16777216);
            if (z6) {
                num = Integer.valueOf(color);
            }
            if (z5) {
                num2 = Integer.valueOf(color);
            }
        }
        WindowCompat.setDecorFitsSystemWindows(window, !z4);
        int statusBarColor = getStatusBarColor(window.getContext(), z4);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z4);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        boolean isUsingLightSystemBar = isUsingLightSystemBar(statusBarColor, MaterialColors.isColorLight(num.intValue()));
        boolean isUsingLightSystemBar2 = isUsingLightSystemBar(navigationBarColor, MaterialColors.isColorLight(num2.intValue()));
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        if (insetsController != null) {
            insetsController.setAppearanceLightStatusBars(isUsingLightSystemBar);
            insetsController.setAppearanceLightNavigationBars(isUsingLightSystemBar2);
        }
    }
}

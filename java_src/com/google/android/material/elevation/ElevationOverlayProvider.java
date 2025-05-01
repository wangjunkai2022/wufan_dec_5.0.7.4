package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
/* loaded from: classes3.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(@NonNull Context context) {
        this(MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean isThemeSurfaceColor(@ColorInt int i4) {
        return ColorUtils.setAlphaComponent(i4, 255) == this.colorSurface;
    }

    public int calculateOverlayAlpha(float f5) {
        return Math.round(calculateOverlayAlphaFraction(f5) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f5) {
        float f6 = this.displayDensity;
        if (f6 <= 0.0f || f5 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f5 / f6)) * FORMULA_MULTIPLIER) + 2.0f) / 100.0f, 1.0f);
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i4, float f5, @NonNull View view) {
        return compositeOverlay(i4, f5 + getParentAbsoluteElevation(view));
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i4, float f5, @NonNull View view) {
        return compositeOverlayIfNeeded(i4, f5 + getParentAbsoluteElevation(view));
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f5, @NonNull View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(f5 + getParentAbsoluteElevation(view));
    }

    public float getParentAbsoluteElevation(@NonNull View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    @ColorInt
    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    @ColorInt
    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i4, float f5) {
        int i5;
        float calculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f5);
        int alpha = Color.alpha(i4);
        int layer = MaterialColors.layer(ColorUtils.setAlphaComponent(i4, 255), this.elevationOverlayColor, calculateOverlayAlphaFraction);
        if (calculateOverlayAlphaFraction > 0.0f && (i5 = this.elevationOverlayAccentColor) != 0) {
            layer = MaterialColors.layer(layer, ColorUtils.setAlphaComponent(i5, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return ColorUtils.setAlphaComponent(layer, alpha);
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i4, float f5) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i4)) ? compositeOverlay(i4, f5) : i4;
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f5) {
        return compositeOverlayIfNeeded(this.colorSurface, f5);
    }

    public ElevationOverlayProvider(boolean z4, @ColorInt int i4, @ColorInt int i5, @ColorInt int i6, float f5) {
        this.elevationOverlayEnabled = z4;
        this.elevationOverlayColor = i4;
        this.elevationOverlayAccentColor = i5;
        this.colorSurface = i6;
        this.displayDensity = f5;
    }
}

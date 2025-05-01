package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class CanvasCompat {
    private CanvasCompat() {
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, @Nullable RectF rectF, int i4) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(rectF, i4);
        }
        return canvas.saveLayerAlpha(rectF, i4, 31);
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, float f5, float f6, float f7, float f8, int i4) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f5, f6, f7, f8, i4);
        }
        return canvas.saveLayerAlpha(f5, f6, f7, f8, i4, 31);
    }
}

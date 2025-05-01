package com.google.android.material.shape;

import androidx.annotation.NonNull;
/* loaded from: classes3.dex */
public class EdgeTreatment {
    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean forceIntersection() {
        return false;
    }

    @Deprecated
    public void getEdgePath(float f5, float f6, @NonNull ShapePath shapePath) {
        getEdgePath(f5, f5 / 2.0f, f6, shapePath);
    }

    public void getEdgePath(float f5, float f6, float f7, @NonNull ShapePath shapePath) {
        shapePath.lineTo(f5, 0.0f);
    }
}

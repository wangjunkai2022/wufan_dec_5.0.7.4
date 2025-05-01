package com.google.android.material.shape;

import androidx.annotation.NonNull;
/* loaded from: classes3.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float f5, boolean z4) {
        this.size = f5;
        this.inside = z4;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f5, float f6, float f7, @NonNull ShapePath shapePath) {
        shapePath.lineTo(f6 - (this.size * f7), 0.0f);
        shapePath.lineTo(f6, (this.inside ? this.size : -this.size) * f7);
        shapePath.lineTo(f6 + (this.size * f7), 0.0f);
        shapePath.lineTo(f5, 0.0f);
    }
}

package com.google.android.material.shape;

import androidx.annotation.NonNull;
/* loaded from: classes3.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f5, float f6, float f7) {
        shapePath.reset(0.0f, f7 * f6, 180.0f, 180.0f - f5);
        double sin = Math.sin(Math.toRadians(f5));
        double d5 = f7;
        Double.isNaN(d5);
        double d6 = f6;
        Double.isNaN(d6);
        double sin2 = Math.sin(Math.toRadians(90.0f - f5));
        Double.isNaN(d5);
        Double.isNaN(d6);
        shapePath.lineTo((float) (sin * d5 * d6), (float) (sin2 * d5 * d6));
    }

    @Deprecated
    public CutCornerTreatment(float f5) {
        this.size = -1.0f;
        this.size = f5;
    }
}

package com.google.android.material.shape;

import androidx.annotation.NonNull;
/* loaded from: classes3.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {
    private final float radius;

    public MarkerEdgeTreatment(float f5) {
        this.radius = f5 - 0.001f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.shape.EdgeTreatment
    public boolean forceIntersection() {
        return true;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f5, float f6, float f7, @NonNull ShapePath shapePath) {
        double d5 = this.radius;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d5);
        float f8 = (float) ((d5 * sqrt) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.radius, 2.0d) - Math.pow(f8, 2.0d));
        double d6 = this.radius;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d6);
        double d7 = d6 * sqrt3;
        double d8 = this.radius;
        Double.isNaN(d8);
        shapePath.reset(f6 - f8, ((float) (-(d7 - d8))) + sqrt2);
        double d9 = this.radius;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d9);
        double d10 = d9 * sqrt4;
        double d11 = this.radius;
        Double.isNaN(d11);
        shapePath.lineTo(f6, (float) (-(d10 - d11)));
        double d12 = this.radius;
        double sqrt5 = Math.sqrt(2.0d);
        Double.isNaN(d12);
        double d13 = d12 * sqrt5;
        double d14 = this.radius;
        Double.isNaN(d14);
        shapePath.lineTo(f6 + f8, ((float) (-(d13 - d14))) + sqrt2);
    }
}

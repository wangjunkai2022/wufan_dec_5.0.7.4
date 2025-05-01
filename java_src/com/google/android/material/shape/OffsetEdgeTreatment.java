package com.google.android.material.shape;

import androidx.annotation.NonNull;
/* loaded from: classes3.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {
    private final float offset;
    private final EdgeTreatment other;

    public OffsetEdgeTreatment(@NonNull EdgeTreatment edgeTreatment, float f5) {
        this.other = edgeTreatment;
        this.offset = f5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.shape.EdgeTreatment
    public boolean forceIntersection() {
        return this.other.forceIntersection();
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f5, float f6, float f7, @NonNull ShapePath shapePath) {
        this.other.getEdgePath(f5, f6 - this.offset, f7, shapePath);
    }
}

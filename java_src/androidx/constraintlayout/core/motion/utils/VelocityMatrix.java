package androidx.constraintlayout.core.motion.utils;
/* loaded from: classes.dex */
public class VelocityMatrix {
    private static String TAG = "VelocityMatrix";
    float mDRotate;
    float mDScaleX;
    float mDScaleY;
    float mDTranslateX;
    float mDTranslateY;
    float mRotate;

    public void applyTransform(float f5, float f6, int i4, int i5, float[] fArr) {
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = (f5 - 0.5f) * 2.0f;
        float f10 = (f6 - 0.5f) * 2.0f;
        float f11 = f7 + this.mDTranslateX;
        float f12 = f8 + this.mDTranslateY;
        float f13 = f11 + (this.mDScaleX * f9);
        float f14 = f12 + (this.mDScaleY * f10);
        float radians = (float) Math.toRadians(this.mDRotate);
        double d5 = (-i4) * f9;
        double radians2 = (float) Math.toRadians(this.mRotate);
        double sin = Math.sin(radians2);
        Double.isNaN(d5);
        double d6 = d5 * sin;
        double d7 = i5 * f10;
        double cos = Math.cos(radians2);
        Double.isNaN(d7);
        float f15 = f13 + (((float) (d6 - (cos * d7))) * radians);
        double d8 = i4 * f9;
        double cos2 = Math.cos(radians2);
        Double.isNaN(d8);
        double d9 = d8 * cos2;
        double sin2 = Math.sin(radians2);
        Double.isNaN(d7);
        fArr[0] = f15;
        fArr[1] = f14 + (radians * ((float) (d9 - (d7 * sin2))));
    }

    public void clear() {
        this.mDRotate = 0.0f;
        this.mDTranslateY = 0.0f;
        this.mDTranslateX = 0.0f;
        this.mDScaleY = 0.0f;
        this.mDScaleX = 0.0f;
    }

    public void setRotationVelocity(SplineSet splineSet, float f5) {
        if (splineSet != null) {
            this.mDRotate = splineSet.getSlope(f5);
            this.mRotate = splineSet.get(f5);
        }
    }

    public void setScaleVelocity(SplineSet splineSet, SplineSet splineSet2, float f5) {
        if (splineSet != null) {
            this.mDScaleX = splineSet.getSlope(f5);
        }
        if (splineSet2 != null) {
            this.mDScaleY = splineSet2.getSlope(f5);
        }
    }

    public void setTranslationVelocity(SplineSet splineSet, SplineSet splineSet2, float f5) {
        if (splineSet != null) {
            this.mDTranslateX = splineSet.getSlope(f5);
        }
        if (splineSet2 != null) {
            this.mDTranslateY = splineSet2.getSlope(f5);
        }
    }

    public void setRotationVelocity(KeyCycleOscillator keyCycleOscillator, float f5) {
        if (keyCycleOscillator != null) {
            this.mDRotate = keyCycleOscillator.getSlope(f5);
        }
    }

    public void setScaleVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f5) {
        if (keyCycleOscillator != null) {
            this.mDScaleX = keyCycleOscillator.getSlope(f5);
        }
        if (keyCycleOscillator2 != null) {
            this.mDScaleY = keyCycleOscillator2.getSlope(f5);
        }
    }

    public void setTranslationVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f5) {
        if (keyCycleOscillator != null) {
            this.mDTranslateX = keyCycleOscillator.getSlope(f5);
        }
        if (keyCycleOscillator2 != null) {
            this.mDTranslateY = keyCycleOscillator2.getSlope(f5);
        }
    }
}

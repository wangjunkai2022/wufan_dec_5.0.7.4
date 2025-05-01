package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.DynamicAnimation;
/* loaded from: classes2.dex */
public final class SpringForce implements Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private static final double UNSET = Double.MAX_VALUE;
    private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5d;
    private double mDampedFreq;
    double mDampingRatio;
    private double mFinalPosition;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized;
    private final DynamicAnimation.MassState mMassState;
    double mNaturalFreq;
    private double mValueThreshold;
    private double mVelocityThreshold;

    public SpringForce() {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
    }

    private void init() {
        if (this.mInitialized) {
            return;
        }
        if (this.mFinalPosition != Double.MAX_VALUE) {
            double d5 = this.mDampingRatio;
            if (d5 > 1.0d) {
                double d6 = this.mNaturalFreq;
                this.mGammaPlus = ((-d5) * d6) + (d6 * Math.sqrt((d5 * d5) - 1.0d));
                double d7 = this.mDampingRatio;
                double d8 = this.mNaturalFreq;
                this.mGammaMinus = ((-d7) * d8) - (d8 * Math.sqrt((d7 * d7) - 1.0d));
            } else if (d5 >= 0.0d && d5 < 1.0d) {
                this.mDampedFreq = this.mNaturalFreq * Math.sqrt(1.0d - (d5 * d5));
            }
            this.mInitialized = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float getAcceleration(float f5, float f6) {
        float finalPosition = f5 - getFinalPosition();
        double d5 = this.mNaturalFreq;
        double d6 = d5 * d5;
        double d7 = d5 * 2.0d * this.mDampingRatio;
        double d8 = finalPosition;
        Double.isNaN(d8);
        double d9 = f6;
        Double.isNaN(d9);
        return (float) (((-d6) * d8) - (d7 * d9));
    }

    public float getDampingRatio() {
        return (float) this.mDampingRatio;
    }

    public float getFinalPosition() {
        return (float) this.mFinalPosition;
    }

    public float getStiffness() {
        double d5 = this.mNaturalFreq;
        return (float) (d5 * d5);
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isAtEquilibrium(float f5, float f6) {
        return ((double) Math.abs(f6)) < this.mVelocityThreshold && ((double) Math.abs(f5 - getFinalPosition())) < this.mValueThreshold;
    }

    public SpringForce setDampingRatio(@FloatRange(from = 0.0d) float f5) {
        if (f5 >= 0.0f) {
            this.mDampingRatio = f5;
            this.mInitialized = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public SpringForce setFinalPosition(float f5) {
        this.mFinalPosition = f5;
        return this;
    }

    public SpringForce setStiffness(@FloatRange(from = 0.0d, fromInclusive = false) float f5) {
        if (f5 > 0.0f) {
            this.mNaturalFreq = Math.sqrt(f5);
            this.mInitialized = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValueThreshold(double d5) {
        double abs = Math.abs(d5);
        this.mValueThreshold = abs;
        this.mVelocityThreshold = abs * VELOCITY_THRESHOLD_MULTIPLIER;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DynamicAnimation.MassState updateValues(double d5, double d6, long j4) {
        double cos;
        double d7;
        init();
        double d8 = j4;
        Double.isNaN(d8);
        double d9 = d8 / 1000.0d;
        double d10 = d5 - this.mFinalPosition;
        double d11 = this.mDampingRatio;
        if (d11 > 1.0d) {
            double d12 = this.mGammaMinus;
            double d13 = this.mGammaPlus;
            double d14 = d10 - (((d12 * d10) - d6) / (d12 - d13));
            double d15 = ((d10 * d12) - d6) / (d12 - d13);
            d7 = (Math.pow(2.718281828459045d, d12 * d9) * d14) + (Math.pow(2.718281828459045d, this.mGammaPlus * d9) * d15);
            double d16 = this.mGammaMinus;
            double pow = d14 * d16 * Math.pow(2.718281828459045d, d16 * d9);
            double d17 = this.mGammaPlus;
            cos = pow + (d15 * d17 * Math.pow(2.718281828459045d, d17 * d9));
        } else if (d11 == 1.0d) {
            double d18 = this.mNaturalFreq;
            double d19 = d6 + (d18 * d10);
            double d20 = d10 + (d19 * d9);
            d7 = Math.pow(2.718281828459045d, (-d18) * d9) * d20;
            double pow2 = d20 * Math.pow(2.718281828459045d, (-this.mNaturalFreq) * d9);
            double d21 = this.mNaturalFreq;
            cos = (d19 * Math.pow(2.718281828459045d, (-d21) * d9)) + (pow2 * (-d21));
        } else {
            double d22 = 1.0d / this.mDampedFreq;
            double d23 = this.mNaturalFreq;
            double d24 = d22 * ((d11 * d23 * d10) + d6);
            double pow3 = Math.pow(2.718281828459045d, (-d11) * d23 * d9) * ((Math.cos(this.mDampedFreq * d9) * d10) + (Math.sin(this.mDampedFreq * d9) * d24));
            double d25 = this.mNaturalFreq;
            double d26 = this.mDampingRatio;
            double d27 = (-d25) * pow3 * d26;
            double pow4 = Math.pow(2.718281828459045d, (-d26) * d25 * d9);
            double d28 = this.mDampedFreq;
            double sin = (-d28) * d10 * Math.sin(d28 * d9);
            double d29 = this.mDampedFreq;
            cos = d27 + (pow4 * (sin + (d24 * d29 * Math.cos(d29 * d9))));
            d7 = pow3;
        }
        DynamicAnimation.MassState massState = this.mMassState;
        massState.mValue = (float) (d7 + this.mFinalPosition);
        massState.mVelocity = (float) cos;
        return massState;
    }

    public SpringForce(float f5) {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
        this.mFinalPosition = f5;
    }
}

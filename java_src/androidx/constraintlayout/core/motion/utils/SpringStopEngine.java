package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
/* loaded from: classes.dex */
public class SpringStopEngine implements StopEngine {
    private static final double UNSET = Double.MAX_VALUE;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;
    private float mV;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private int mBoundaryMode = 0;

    private void compute(double d5) {
        double d6 = this.mStiffness;
        double d7 = this.mDamping;
        double d8 = this.mMass;
        Double.isNaN(d8);
        int sqrt = (int) ((9.0d / ((Math.sqrt(d6 / d8) * d5) * 4.0d)) + 1.0d);
        double d9 = sqrt;
        Double.isNaN(d9);
        double d10 = d5 / d9;
        int i4 = 0;
        while (i4 < sqrt) {
            float f5 = this.mPos;
            double d11 = f5;
            double d12 = this.mTargetPos;
            Double.isNaN(d11);
            double d13 = (-d6) * (d11 - d12);
            float f6 = this.mV;
            double d14 = d6;
            double d15 = f6;
            Double.isNaN(d15);
            double d16 = d13 - (d15 * d7);
            float f7 = this.mMass;
            double d17 = d7;
            double d18 = f7;
            Double.isNaN(d18);
            double d19 = d16 / d18;
            double d20 = f6;
            Double.isNaN(d20);
            double d21 = d20 + ((d19 * d10) / 2.0d);
            double d22 = f5;
            Double.isNaN(d22);
            double d23 = f7;
            Double.isNaN(d23);
            double d24 = ((((-((d22 + ((d10 * d21) / 2.0d)) - d12)) * d14) - (d21 * d17)) / d23) * d10;
            double d25 = f6;
            Double.isNaN(d25);
            double d26 = f6;
            Double.isNaN(d26);
            float f8 = (float) (d26 + d24);
            this.mV = f8;
            double d27 = f5;
            Double.isNaN(d27);
            float f9 = (float) (d27 + ((d25 + (d24 / 2.0d)) * d10));
            this.mPos = f9;
            int i5 = this.mBoundaryMode;
            if (i5 > 0) {
                if (f9 < 0.0f && (i5 & 1) == 1) {
                    this.mPos = -f9;
                    this.mV = -f8;
                }
                float f10 = this.mPos;
                if (f10 > 1.0f && (i5 & 2) == 2) {
                    this.mPos = 2.0f - f10;
                    this.mV = -this.mV;
                }
            }
            i4++;
            d6 = d14;
            d7 = d17;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f5) {
        return null;
    }

    public float getAcceleration() {
        double d5 = this.mStiffness;
        double d6 = this.mDamping;
        double d7 = this.mPos;
        double d8 = this.mTargetPos;
        Double.isNaN(d7);
        double d9 = (-d5) * (d7 - d8);
        double d10 = this.mV;
        Double.isNaN(d10);
        return ((float) (d9 - (d6 * d10))) / this.mMass;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f5) {
        compute(f5 - this.mLastTime);
        this.mLastTime = f5;
        return this.mPos;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f5) {
        return this.mV;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d5 = this.mPos;
        double d6 = this.mTargetPos;
        Double.isNaN(d5);
        double d7 = d5 - d6;
        double d8 = this.mStiffness;
        double d9 = this.mV;
        double d10 = this.mMass;
        Double.isNaN(d9);
        Double.isNaN(d9);
        Double.isNaN(d10);
        return Math.sqrt((((d9 * d9) * d10) + ((d8 * d7) * d7)) / d8) <= ((double) this.mStopThreshold);
    }

    void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        PrintStream printStream = System.out;
        printStream.println((".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ") + str);
    }

    public void springConfig(float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i4) {
        this.mTargetPos = f6;
        this.mDamping = f10;
        this.mInitialized = false;
        this.mPos = f5;
        this.mLastVelocity = f7;
        this.mStiffness = f9;
        this.mMass = f8;
        this.mStopThreshold = f11;
        this.mBoundaryMode = i4;
        this.mLastTime = 0.0f;
    }
}

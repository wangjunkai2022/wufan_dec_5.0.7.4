package androidx.constraintlayout.core.motion.utils;
/* loaded from: classes.dex */
public class LinearCurveFit extends CurveFit {
    private static final String TAG = "LinearCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;
    private double[] mT;
    private double mTotalLength;
    private double[][] mY;

    public LinearCurveFit(double[] dArr, double[][] dArr2) {
        this.mTotalLength = Double.NaN;
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.mSlopeTemp = new double[length2];
        this.mT = dArr;
        this.mY = dArr2;
        if (length2 > 2) {
            double d5 = 0.0d;
            double d6 = 0.0d;
            int i4 = 0;
            while (i4 < dArr.length) {
                double d7 = dArr2[i4][0];
                double d8 = dArr2[i4][0];
                if (i4 > 0) {
                    Math.hypot(d7 - d5, d8 - d6);
                }
                i4++;
                d5 = d7;
                d6 = d8;
            }
            this.mTotalLength = 0.0d;
        }
    }

    private double getLength2D(double d5) {
        if (Double.isNaN(this.mTotalLength)) {
            return 0.0d;
        }
        double[] dArr = this.mT;
        int length = dArr.length;
        if (d5 <= dArr[0]) {
            return 0.0d;
        }
        int i4 = length - 1;
        if (d5 >= dArr[i4]) {
            return this.mTotalLength;
        }
        double d6 = 0.0d;
        double d7 = 0.0d;
        double d8 = 0.0d;
        int i5 = 0;
        while (i5 < i4) {
            double[][] dArr2 = this.mY;
            double d9 = dArr2[i5][0];
            double d10 = dArr2[i5][1];
            if (i5 > 0) {
                d6 += Math.hypot(d9 - d7, d10 - d8);
            }
            double[] dArr3 = this.mT;
            if (d5 == dArr3[i5]) {
                return d6;
            }
            int i6 = i5 + 1;
            if (d5 < dArr3[i6]) {
                double d11 = (d5 - dArr3[i5]) / (dArr3[i6] - dArr3[i5]);
                double[][] dArr4 = this.mY;
                double d12 = 1.0d - d11;
                return d6 + Math.hypot(d10 - ((dArr4[i5][1] * d12) + (dArr4[i6][1] * d11)), d9 - ((dArr4[i5][0] * d12) + (dArr4[i6][0] * d11)));
            }
            i5 = i6;
            d7 = d9;
            d8 = d10;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d5, double[] dArr) {
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int i4 = 0;
        int length2 = this.mY[0].length;
        if (this.mExtrapolate) {
            if (d5 <= dArr2[0]) {
                getSlope(dArr2[0], this.mSlopeTemp);
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = this.mY[0][i5] + ((d5 - this.mT[0]) * this.mSlopeTemp[i5]);
                }
                return;
            }
            int i6 = length - 1;
            if (d5 >= dArr2[i6]) {
                getSlope(dArr2[i6], this.mSlopeTemp);
                while (i4 < length2) {
                    dArr[i4] = this.mY[i6][i4] + ((d5 - this.mT[i6]) * this.mSlopeTemp[i4]);
                    i4++;
                }
                return;
            }
        } else if (d5 <= dArr2[0]) {
            for (int i7 = 0; i7 < length2; i7++) {
                dArr[i7] = this.mY[0][i7];
            }
            return;
        } else {
            int i8 = length - 1;
            if (d5 >= dArr2[i8]) {
                while (i4 < length2) {
                    dArr[i4] = this.mY[i8][i4];
                    i4++;
                }
                return;
            }
        }
        int i9 = 0;
        while (i9 < length - 1) {
            if (d5 == this.mT[i9]) {
                for (int i10 = 0; i10 < length2; i10++) {
                    dArr[i10] = this.mY[i9][i10];
                }
            }
            double[] dArr3 = this.mT;
            int i11 = i9 + 1;
            if (d5 < dArr3[i11]) {
                double d6 = (d5 - dArr3[i9]) / (dArr3[i11] - dArr3[i9]);
                while (i4 < length2) {
                    double[][] dArr4 = this.mY;
                    dArr[i4] = (dArr4[i9][i4] * (1.0d - d6)) + (dArr4[i11][i4] * d6);
                    i4++;
                }
                return;
            }
            i9 = i11;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d5, double[] dArr) {
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int length2 = this.mY[0].length;
        if (d5 <= dArr2[0]) {
            d5 = dArr2[0];
        } else {
            int i4 = length - 1;
            if (d5 >= dArr2[i4]) {
                d5 = dArr2[i4];
            }
        }
        int i5 = 0;
        while (i5 < length - 1) {
            double[] dArr3 = this.mT;
            int i6 = i5 + 1;
            if (d5 <= dArr3[i6]) {
                double d6 = dArr3[i6] - dArr3[i5];
                double d7 = dArr3[i5];
                for (int i7 = 0; i7 < length2; i7++) {
                    double[][] dArr4 = this.mY;
                    dArr[i7] = (dArr4[i6][i7] - dArr4[i5][i7]) / d6;
                }
                return;
            }
            i5 = i6;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mT;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d5, int i4) {
        double[] dArr = this.mT;
        int length = dArr.length;
        int i5 = 0;
        if (d5 < dArr[0]) {
            d5 = dArr[0];
        } else {
            int i6 = length - 1;
            if (d5 >= dArr[i6]) {
                d5 = dArr[i6];
            }
        }
        while (i5 < length - 1) {
            double[] dArr2 = this.mT;
            int i7 = i5 + 1;
            if (d5 <= dArr2[i7]) {
                double d6 = dArr2[i7] - dArr2[i5];
                double d7 = dArr2[i5];
                double[][] dArr3 = this.mY;
                return (dArr3[i7][i4] - dArr3[i5][i4]) / d6;
            }
            i5 = i7;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d5, float[] fArr) {
        double[] dArr = this.mT;
        int length = dArr.length;
        int i4 = 0;
        int length2 = this.mY[0].length;
        if (this.mExtrapolate) {
            if (d5 <= dArr[0]) {
                getSlope(dArr[0], this.mSlopeTemp);
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) (this.mY[0][i5] + ((d5 - this.mT[0]) * this.mSlopeTemp[i5]));
                }
                return;
            }
            int i6 = length - 1;
            if (d5 >= dArr[i6]) {
                getSlope(dArr[i6], this.mSlopeTemp);
                while (i4 < length2) {
                    fArr[i4] = (float) (this.mY[i6][i4] + ((d5 - this.mT[i6]) * this.mSlopeTemp[i4]));
                    i4++;
                }
                return;
            }
        } else if (d5 <= dArr[0]) {
            for (int i7 = 0; i7 < length2; i7++) {
                fArr[i7] = (float) this.mY[0][i7];
            }
            return;
        } else {
            int i8 = length - 1;
            if (d5 >= dArr[i8]) {
                while (i4 < length2) {
                    fArr[i4] = (float) this.mY[i8][i4];
                    i4++;
                }
                return;
            }
        }
        int i9 = 0;
        while (i9 < length - 1) {
            if (d5 == this.mT[i9]) {
                for (int i10 = 0; i10 < length2; i10++) {
                    fArr[i10] = (float) this.mY[i9][i10];
                }
            }
            double[] dArr2 = this.mT;
            int i11 = i9 + 1;
            if (d5 < dArr2[i11]) {
                double d6 = (d5 - dArr2[i9]) / (dArr2[i11] - dArr2[i9]);
                while (i4 < length2) {
                    double[][] dArr3 = this.mY;
                    fArr[i4] = (float) ((dArr3[i9][i4] * (1.0d - d6)) + (dArr3[i11][i4] * d6));
                    i4++;
                }
                return;
            }
            i9 = i11;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d5, int i4) {
        double[] dArr = this.mT;
        int length = dArr.length;
        int i5 = 0;
        if (this.mExtrapolate) {
            if (d5 <= dArr[0]) {
                return this.mY[0][i4] + ((d5 - dArr[0]) * getSlope(dArr[0], i4));
            }
            int i6 = length - 1;
            if (d5 >= dArr[i6]) {
                return this.mY[i6][i4] + ((d5 - dArr[i6]) * getSlope(dArr[i6], i4));
            }
        } else if (d5 <= dArr[0]) {
            return this.mY[0][i4];
        } else {
            int i7 = length - 1;
            if (d5 >= dArr[i7]) {
                return this.mY[i7][i4];
            }
        }
        while (i5 < length - 1) {
            double[] dArr2 = this.mT;
            if (d5 == dArr2[i5]) {
                return this.mY[i5][i4];
            }
            int i8 = i5 + 1;
            if (d5 < dArr2[i8]) {
                double d6 = (d5 - dArr2[i5]) / (dArr2[i8] - dArr2[i5]);
                double[][] dArr3 = this.mY;
                return (dArr3[i5][i4] * (1.0d - d6)) + (dArr3[i8][i4] * d6);
            }
            i5 = i8;
        }
        return 0.0d;
    }
}

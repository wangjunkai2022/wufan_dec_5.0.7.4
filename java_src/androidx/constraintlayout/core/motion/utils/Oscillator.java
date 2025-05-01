package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
/* loaded from: classes.dex */
public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    double[] mArea;
    MonotonicCurveFit mCustomCurve;
    String mCustomType;
    int mType;
    float[] mPeriod = new float[0];
    double[] mPosition = new double[0];
    double PI2 = 6.283185307179586d;
    private boolean mNormalized = false;

    public void addPoint(double d5, float f5) {
        int length = this.mPeriod.length + 1;
        int binarySearch = Arrays.binarySearch(this.mPosition, d5);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.mPosition = Arrays.copyOf(this.mPosition, length);
        this.mPeriod = Arrays.copyOf(this.mPeriod, length);
        this.mArea = new double[length];
        double[] dArr = this.mPosition;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.mPosition[binarySearch] = d5;
        this.mPeriod[binarySearch] = f5;
        this.mNormalized = false;
    }

    double getDP(double d5) {
        if (d5 <= 0.0d) {
            d5 = 1.0E-5d;
        } else if (d5 >= 1.0d) {
            d5 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.mPosition, d5);
        if (binarySearch <= 0 && binarySearch != 0) {
            int i4 = (-binarySearch) - 1;
            float[] fArr = this.mPeriod;
            int i5 = i4 - 1;
            double d6 = fArr[i4] - fArr[i5];
            double[] dArr = this.mPosition;
            Double.isNaN(d6);
            double d7 = d6 / (dArr[i4] - dArr[i5]);
            double d8 = d5 * d7;
            double d9 = fArr[i5];
            Double.isNaN(d9);
            return (d9 - (d7 * dArr[i5])) + d8;
        }
        return 0.0d;
    }

    double getP(double d5) {
        if (d5 < 0.0d) {
            d5 = 0.0d;
        } else if (d5 > 1.0d) {
            d5 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.mPosition, d5);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch != 0) {
            int i4 = (-binarySearch) - 1;
            float[] fArr = this.mPeriod;
            int i5 = i4 - 1;
            double d6 = fArr[i4] - fArr[i5];
            double[] dArr = this.mPosition;
            Double.isNaN(d6);
            double d7 = d6 / (dArr[i4] - dArr[i5]);
            double d8 = this.mArea[i5];
            double d9 = fArr[i5];
            Double.isNaN(d9);
            return d8 + ((d9 - (dArr[i5] * d7)) * (d5 - dArr[i5])) + ((d7 * ((d5 * d5) - (dArr[i5] * dArr[i5]))) / 2.0d);
        }
        return 0.0d;
    }

    public double getSlope(double d5, double d6, double d7) {
        double p4 = d6 + getP(d5);
        double dp = getDP(d5) + d7;
        switch (this.mType) {
            case 1:
                return 0.0d;
            case 2:
                return dp * 4.0d * Math.signum((((p4 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return dp * 2.0d;
            case 4:
                return (-dp) * 2.0d;
            case 5:
                double d8 = this.PI2;
                return (-d8) * dp * Math.sin(d8 * p4);
            case 6:
                return dp * 4.0d * ((((p4 * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.mCustomCurve.getSlope(p4 % 1.0d, 0);
            default:
                double d9 = this.PI2;
                return dp * d9 * Math.cos(d9 * p4);
        }
    }

    public double getValue(double d5, double d6) {
        double abs;
        double p4 = getP(d5) + d6;
        switch (this.mType) {
            case 1:
                return Math.signum(0.5d - (p4 % 1.0d));
            case 2:
                abs = Math.abs((((p4 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((p4 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((p4 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.PI2 * (d6 + p4));
            case 6:
                double abs2 = 1.0d - Math.abs(((p4 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.mCustomCurve.getPos(p4 % 1.0d, 0);
            default:
                return Math.sin(this.PI2 * p4);
        }
        return 1.0d - abs;
    }

    public void normalize() {
        double d5 = 0.0d;
        int i4 = 0;
        while (true) {
            float[] fArr = this.mPeriod;
            if (i4 >= fArr.length) {
                break;
            }
            double d6 = fArr[i4];
            Double.isNaN(d6);
            d5 += d6;
            i4++;
        }
        double d7 = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr2 = this.mPeriod;
            if (i5 >= fArr2.length) {
                break;
            }
            int i6 = i5 - 1;
            double[] dArr = this.mPosition;
            double d8 = (fArr2[i6] + fArr2[i5]) / 2.0f;
            Double.isNaN(d8);
            d7 += (dArr[i5] - dArr[i6]) * d8;
            i5++;
        }
        int i7 = 0;
        while (true) {
            float[] fArr3 = this.mPeriod;
            if (i7 >= fArr3.length) {
                break;
            }
            double d9 = fArr3[i7];
            Double.isNaN(d9);
            fArr3[i7] = (float) (d9 * (d5 / d7));
            i7++;
        }
        this.mArea[0] = 0.0d;
        int i8 = 1;
        while (true) {
            float[] fArr4 = this.mPeriod;
            if (i8 < fArr4.length) {
                int i9 = i8 - 1;
                double[] dArr2 = this.mPosition;
                double d10 = dArr2[i8] - dArr2[i9];
                double[] dArr3 = this.mArea;
                double d11 = dArr3[i9];
                double d12 = (fArr4[i9] + fArr4[i8]) / 2.0f;
                Double.isNaN(d12);
                dArr3[i8] = d11 + (d10 * d12);
                i8++;
            } else {
                this.mNormalized = true;
                return;
            }
        }
    }

    public void setType(int i4, String str) {
        this.mType = i4;
        this.mCustomType = str;
        if (str != null) {
            this.mCustomCurve = MonotonicCurveFit.buildWave(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.mPosition) + " period=" + Arrays.toString(this.mPeriod);
    }
}

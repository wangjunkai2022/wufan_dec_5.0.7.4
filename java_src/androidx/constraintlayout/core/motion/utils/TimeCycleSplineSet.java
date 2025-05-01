package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
/* loaded from: classes.dex */
public abstract class TimeCycleSplineSet {
    protected static final int CURVE_OFFSET = 2;
    protected static final int CURVE_PERIOD = 1;
    protected static final int CURVE_VALUE = 0;
    private static final String TAG = "SplineSet";
    protected static float VAL_2PI = 6.2831855f;
    protected int count;
    protected long last_time;
    protected CurveFit mCurveFit;
    protected String mType;
    protected int mWaveShape = 0;
    protected int[] mTimePoints = new int[10];
    protected float[][] mValues = (float[][]) Array.newInstance(float.class, 10, 3);
    protected float[] mCache = new float[3];
    protected boolean mContinue = false;
    protected float last_cycle = Float.NaN;

    /* loaded from: classes.dex */
    public static class CustomSet extends TimeCycleSplineSet {
        String mAttributeName;
        float[] mCache;
        KeyFrameArray.CustomArray mConstraintAttributeList;
        float[] mTempValues;
        KeyFrameArray.FloatArray mWaveProperties = new KeyFrameArray.FloatArray();

        public CustomSet(String str, KeyFrameArray.CustomArray customArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i4, float f5, float f6, int i5, float f7) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public boolean setProperty(MotionWidget motionWidget, float f5, long j4, KeyCache keyCache) {
            this.mCurveFit.getPos(f5, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            long j5 = j4 - this.last_time;
            if (Float.isNaN(this.last_cycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
                this.last_cycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.last_cycle = 0.0f;
                }
            }
            double d5 = this.last_cycle;
            double d6 = j5;
            Double.isNaN(d6);
            double d7 = f6;
            Double.isNaN(d7);
            Double.isNaN(d5);
            float f8 = (float) ((d5 + ((d6 * 1.0E-9d) * d7)) % 1.0d);
            this.last_cycle = f8;
            this.last_time = j4;
            float calcWave = calcWave(f8);
            this.mContinue = false;
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i4 >= fArr2.length) {
                    break;
                }
                boolean z4 = this.mContinue;
                float[] fArr3 = this.mTempValues;
                this.mContinue = z4 | (((double) fArr3[i4]) != 0.0d);
                fArr2[i4] = (fArr3[i4] * calcWave) + f7;
                i4++;
            }
            motionWidget.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), this.mCache);
            if (f6 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i4) {
            float[] fArr;
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i5 = numberOfInterpolatedValues + 2;
            this.mTempValues = new float[i5];
            this.mCache = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, i5);
            for (int i6 = 0; i6 < size; i6++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i6);
                CustomAttribute valueAt = this.mConstraintAttributeList.valueAt(i6);
                float[] valueAt2 = this.mWaveProperties.valueAt(i6);
                double d5 = keyAt;
                Double.isNaN(d5);
                dArr[i6] = d5 * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i7 = 0;
                while (true) {
                    if (i7 < this.mTempValues.length) {
                        dArr2[i6][i7] = fArr[i7];
                        i7++;
                    }
                }
                dArr2[i6][numberOfInterpolatedValues] = valueAt2[0];
                dArr2[i6][numberOfInterpolatedValues + 1] = valueAt2[1];
            }
            this.mCurveFit = CurveFit.get(i4, dArr, dArr2);
        }

        public void setPoint(int i4, CustomAttribute customAttribute, float f5, int i5, float f6) {
            this.mConstraintAttributeList.append(i4, customAttribute);
            this.mWaveProperties.append(i4, new float[]{f5, f6});
            this.mWaveShape = Math.max(this.mWaveShape, i5);
        }
    }

    /* loaded from: classes.dex */
    public static class CustomVarSet extends TimeCycleSplineSet {
        String mAttributeName;
        float[] mCache;
        KeyFrameArray.CustomVar mConstraintAttributeList;
        float[] mTempValues;
        KeyFrameArray.FloatArray mWaveProperties = new KeyFrameArray.FloatArray();

        public CustomVarSet(String str, KeyFrameArray.CustomVar customVar) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i4, float f5, float f6, int i5, float f7) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public boolean setProperty(MotionWidget motionWidget, float f5, long j4, KeyCache keyCache) {
            this.mCurveFit.getPos(f5, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            long j5 = j4 - this.last_time;
            if (Float.isNaN(this.last_cycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
                this.last_cycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.last_cycle = 0.0f;
                }
            }
            double d5 = this.last_cycle;
            double d6 = j5;
            Double.isNaN(d6);
            double d7 = f6;
            Double.isNaN(d7);
            Double.isNaN(d5);
            float f8 = (float) ((d5 + ((d6 * 1.0E-9d) * d7)) % 1.0d);
            this.last_cycle = f8;
            this.last_time = j4;
            float calcWave = calcWave(f8);
            this.mContinue = false;
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i4 >= fArr2.length) {
                    break;
                }
                boolean z4 = this.mContinue;
                float[] fArr3 = this.mTempValues;
                this.mContinue = z4 | (((double) fArr3[i4]) != 0.0d);
                fArr2[i4] = (fArr3[i4] * calcWave) + f7;
                i4++;
            }
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(motionWidget, this.mCache);
            if (f6 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i4) {
            float[] fArr;
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i5 = numberOfInterpolatedValues + 2;
            this.mTempValues = new float[i5];
            this.mCache = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, i5);
            for (int i6 = 0; i6 < size; i6++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i6);
                CustomVariable valueAt = this.mConstraintAttributeList.valueAt(i6);
                float[] valueAt2 = this.mWaveProperties.valueAt(i6);
                double d5 = keyAt;
                Double.isNaN(d5);
                dArr[i6] = d5 * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i7 = 0;
                while (true) {
                    if (i7 < this.mTempValues.length) {
                        dArr2[i6][i7] = fArr[i7];
                        i7++;
                    }
                }
                dArr2[i6][numberOfInterpolatedValues] = valueAt2[0];
                dArr2[i6][numberOfInterpolatedValues + 1] = valueAt2[1];
            }
            this.mCurveFit = CurveFit.get(i4, dArr, dArr2);
        }

        public void setPoint(int i4, CustomVariable customVariable, float f5, int i5, float f6) {
            this.mConstraintAttributeList.append(i4, customVariable);
            this.mWaveProperties.append(i4, new float[]{f5, f6});
            this.mWaveShape = Math.max(this.mWaveShape, i5);
        }
    }

    /* loaded from: classes.dex */
    protected static class Sort {
        protected Sort() {
        }

        static void doubleQuickSort(int[] iArr, float[][] fArr, int i4, int i5) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i5;
            iArr2[1] = i4;
            int i6 = 2;
            while (i6 > 0) {
                int i7 = i6 - 1;
                int i8 = iArr2[i7];
                i6 = i7 - 1;
                int i9 = iArr2[i6];
                if (i8 < i9) {
                    int partition = partition(iArr, fArr, i8, i9);
                    int i10 = i6 + 1;
                    iArr2[i6] = partition - 1;
                    int i11 = i10 + 1;
                    iArr2[i10] = i8;
                    int i12 = i11 + 1;
                    iArr2[i11] = i9;
                    i6 = i12 + 1;
                    iArr2[i12] = partition + 1;
                }
            }
        }

        private static int partition(int[] iArr, float[][] fArr, int i4, int i5) {
            int i6 = iArr[i5];
            int i7 = i4;
            while (i4 < i5) {
                if (iArr[i4] <= i6) {
                    swap(iArr, fArr, i7, i4);
                    i7++;
                }
                i4++;
            }
            swap(iArr, fArr, i7, i5);
            return i7;
        }

        private static void swap(int[] iArr, float[][] fArr, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float[] fArr2 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = fArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float calcWave(float f5) {
        float abs;
        switch (this.mWaveShape) {
            case 1:
                return Math.signum(f5 * VAL_2PI);
            case 2:
                abs = Math.abs(f5);
                break;
            case 3:
                return (((f5 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f5 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f5 * VAL_2PI);
            case 6:
                float abs2 = 1.0f - Math.abs(((f5 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f5 * VAL_2PI);
        }
        return 1.0f - abs;
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setPoint(int i4, float f5, float f6, int i5, float f7) {
        int[] iArr = this.mTimePoints;
        int i6 = this.count;
        iArr[i6] = i4;
        float[][] fArr = this.mValues;
        fArr[i6][0] = f5;
        fArr[i6][1] = f6;
        fArr[i6][2] = f7;
        this.mWaveShape = Math.max(this.mWaveShape, i5);
        this.count++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setStartTime(long j4) {
        this.last_time = j4;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setup(int i4) {
        int i5;
        int i6 = this.count;
        if (i6 == 0) {
            System.err.println("Error no points added to " + this.mType);
            return;
        }
        Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i6 - 1);
        int i7 = 1;
        int i8 = 0;
        while (true) {
            int[] iArr = this.mTimePoints;
            if (i7 >= iArr.length) {
                break;
            }
            if (iArr[i7] != iArr[i7 - 1]) {
                i8++;
            }
            i7++;
        }
        if (i8 == 0) {
            i8 = 1;
        }
        double[] dArr = new double[i8];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, i8, 3);
        int i9 = 0;
        while (i5 < this.count) {
            if (i5 > 0) {
                int[] iArr2 = this.mTimePoints;
                i5 = iArr2[i5] == iArr2[i5 + (-1)] ? i5 + 1 : 0;
            }
            double d5 = this.mTimePoints[i5];
            Double.isNaN(d5);
            dArr[i9] = d5 * 0.01d;
            double[] dArr3 = dArr2[i9];
            float[][] fArr = this.mValues;
            dArr3[0] = fArr[i5][0];
            dArr2[i9][1] = fArr[i5][1];
            dArr2[i9][2] = fArr[i5][2];
            i9++;
        }
        this.mCurveFit = CurveFit.get(i4, dArr, dArr2);
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i4 = 0; i4 < this.count; i4++) {
            str = str + "[" + this.mTimePoints[i4] + " , " + decimalFormat.format(this.mValues[i4]) + "] ";
        }
        return str;
    }
}

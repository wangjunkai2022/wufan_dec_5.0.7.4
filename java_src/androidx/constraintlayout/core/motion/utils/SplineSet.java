package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class SplineSet {
    private static final String TAG = "SplineSet";
    private int count;
    protected CurveFit mCurveFit;
    private String mType;
    protected int[] mTimePoints = new int[10];
    protected float[] mValues = new float[10];

    /* loaded from: classes.dex */
    private static class CoreSpline extends SplineSet {
        long start;
        String type;

        public CoreSpline(String str, long j4) {
            this.type = str;
            this.start = j4;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(TypedValues typedValues, float f5) {
            typedValues.setValue(typedValues.getId(this.type), get(f5));
        }
    }

    /* loaded from: classes.dex */
    public static class CustomSet extends SplineSet {
        String mAttributeName;
        KeyFrameArray.CustomArray mConstraintAttributeList;
        float[] mTempValues;

        public CustomSet(String str, KeyFrameArray.CustomArray customArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i4, float f5) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setProperty(WidgetFrame widgetFrame, float f5) {
            this.mCurveFit.getPos(f5, this.mTempValues);
            widgetFrame.setCustomValue(this.mConstraintAttributeList.valueAt(0), this.mTempValues);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i4) {
            float[] fArr;
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, numberOfInterpolatedValues);
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i5);
                CustomAttribute valueAt = this.mConstraintAttributeList.valueAt(i5);
                double d5 = keyAt;
                Double.isNaN(d5);
                dArr[i5] = d5 * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i6 = 0;
                while (true) {
                    if (i6 < this.mTempValues.length) {
                        dArr2[i5][i6] = fArr[i6];
                        i6++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i4, dArr, dArr2);
        }

        public void setPoint(int i4, CustomAttribute customAttribute) {
            this.mConstraintAttributeList.append(i4, customAttribute);
        }
    }

    /* loaded from: classes.dex */
    public static class CustomSpline extends SplineSet {
        String mAttributeName;
        KeyFrameArray.CustomVar mConstraintAttributeList;
        float[] mTempValues;

        public CustomSpline(String str, KeyFrameArray.CustomVar customVar) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i4, float f5) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(TypedValues typedValues, float f5) {
            setProperty((MotionWidget) typedValues, f5);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i4) {
            float[] fArr;
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, numberOfInterpolatedValues);
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i5);
                CustomVariable valueAt = this.mConstraintAttributeList.valueAt(i5);
                double d5 = keyAt;
                Double.isNaN(d5);
                dArr[i5] = d5 * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i6 = 0;
                while (true) {
                    if (i6 < this.mTempValues.length) {
                        dArr2[i5][i6] = fArr[i6];
                        i6++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i4, dArr, dArr2);
        }

        public void setPoint(int i4, CustomVariable customVariable) {
            this.mConstraintAttributeList.append(i4, customVariable);
        }

        public void setProperty(MotionWidget motionWidget, float f5) {
            this.mCurveFit.getPos(f5, this.mTempValues);
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(motionWidget, this.mTempValues);
        }
    }

    /* loaded from: classes.dex */
    private static class Sort {
        private Sort() {
        }

        static void doubleQuickSort(int[] iArr, float[] fArr, int i4, int i5) {
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

        private static int partition(int[] iArr, float[] fArr, int i4, int i5) {
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

        private static void swap(int[] iArr, float[] fArr, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float f5 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = f5;
        }
    }

    public static SplineSet makeCustomSpline(String str, KeyFrameArray.CustomArray customArray) {
        return new CustomSet(str, customArray);
    }

    public static SplineSet makeCustomSplineSet(String str, KeyFrameArray.CustomVar customVar) {
        return new CustomSpline(str, customVar);
    }

    public static SplineSet makeSpline(String str, long j4) {
        return new CoreSpline(str, j4);
    }

    public float get(float f5) {
        return (float) this.mCurveFit.getPos(f5, 0);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f5) {
        return (float) this.mCurveFit.getSlope(f5, 0);
    }

    public void setPoint(int i4, float f5) {
        int[] iArr = this.mTimePoints;
        if (iArr.length < this.count + 1) {
            this.mTimePoints = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.mValues;
            this.mValues = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.mTimePoints;
        int i5 = this.count;
        iArr2[i5] = i4;
        this.mValues[i5] = f5;
        this.count = i5 + 1;
    }

    public void setProperty(TypedValues typedValues, float f5) {
        typedValues.setValue(a.a(this.mType), get(f5));
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setup(int i4) {
        int i5;
        int i6 = this.count;
        if (i6 == 0) {
            return;
        }
        Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i6 - 1);
        int i7 = 1;
        for (int i8 = 1; i8 < this.count; i8++) {
            int[] iArr = this.mTimePoints;
            if (iArr[i8 - 1] != iArr[i8]) {
                i7++;
            }
        }
        double[] dArr = new double[i7];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, i7, 1);
        int i9 = 0;
        while (i5 < this.count) {
            if (i5 > 0) {
                int[] iArr2 = this.mTimePoints;
                i5 = iArr2[i5] == iArr2[i5 + (-1)] ? i5 + 1 : 0;
            }
            double d5 = this.mTimePoints[i5];
            Double.isNaN(d5);
            dArr[i9] = d5 * 0.01d;
            dArr2[i9][0] = this.mValues[i5];
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

package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class KeyCycleOscillator {
    private static final String TAG = "KeyCycleOscillator";
    private CurveFit mCurveFit;
    private CycleOscillator mCycleOscillator;
    private String mType;
    private int mWaveShape = 0;
    private String mWaveString = null;
    public int mVariesBy = 0;
    ArrayList<WavePoint> mWavePoints = new ArrayList<>();

    /* loaded from: classes.dex */
    private static class CoreSpline extends KeyCycleOscillator {
        String type;
        int typeId;

        public CoreSpline(String str) {
            this.type = str;
            this.typeId = c.a(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f5) {
            motionWidget.setValue(this.typeId, get(f5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class CycleOscillator {
        private static final String TAG = "CycleOscillator";
        static final int UNSET = -1;
        private final int OFFST;
        private final int PHASE;
        private final int VALUE;
        CurveFit mCurveFit;
        float[] mOffset;
        Oscillator mOscillator;
        float mPathLength;
        float[] mPeriod;
        float[] mPhase;
        double[] mPosition;
        float[] mScale;
        double[] mSplineSlopeCache;
        double[] mSplineValueCache;
        float[] mValues;
        private final int mVariesBy;
        int mWaveShape;

        CycleOscillator(int i4, String str, int i5, int i6) {
            Oscillator oscillator = new Oscillator();
            this.mOscillator = oscillator;
            this.OFFST = 0;
            this.PHASE = 1;
            this.VALUE = 2;
            this.mWaveShape = i4;
            this.mVariesBy = i5;
            oscillator.setType(i4, str);
            this.mValues = new float[i6];
            this.mPosition = new double[i6];
            this.mPeriod = new float[i6];
            this.mOffset = new float[i6];
            this.mPhase = new float[i6];
            this.mScale = new float[i6];
        }

        public double getLastPhase() {
            return this.mSplineValueCache[1];
        }

        public double getSlope(float f5) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                double d5 = f5;
                curveFit.getSlope(d5, this.mSplineSlopeCache);
                this.mCurveFit.getPos(d5, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineSlopeCache;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d6 = f5;
            double value = this.mOscillator.getValue(d6, this.mSplineValueCache[1]);
            double slope = this.mOscillator.getSlope(d6, this.mSplineValueCache[1], this.mSplineSlopeCache[1]);
            double[] dArr2 = this.mSplineSlopeCache;
            return dArr2[0] + (value * dArr2[2]) + (slope * this.mSplineValueCache[2]);
        }

        public double getValues(float f5) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                curveFit.getPos(f5, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineValueCache;
                dArr[0] = this.mOffset[0];
                dArr[1] = this.mPhase[0];
                dArr[2] = this.mValues[0];
            }
            double[] dArr2 = this.mSplineValueCache;
            return dArr2[0] + (this.mOscillator.getValue(f5, dArr2[1]) * this.mSplineValueCache[2]);
        }

        public void setPoint(int i4, int i5, float f5, float f6, float f7, float f8) {
            double[] dArr = this.mPosition;
            double d5 = i5;
            Double.isNaN(d5);
            dArr[i4] = d5 / 100.0d;
            this.mPeriod[i4] = f5;
            this.mOffset[i4] = f6;
            this.mPhase[i4] = f7;
            this.mValues[i4] = f8;
        }

        public void setup(float f5) {
            this.mPathLength = f5;
            double[][] dArr = (double[][]) Array.newInstance(double.class, this.mPosition.length, 3);
            float[] fArr = this.mValues;
            this.mSplineValueCache = new double[fArr.length + 2];
            this.mSplineSlopeCache = new double[fArr.length + 2];
            if (this.mPosition[0] > 0.0d) {
                this.mOscillator.addPoint(0.0d, this.mPeriod[0]);
            }
            double[] dArr2 = this.mPosition;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.mOscillator.addPoint(1.0d, this.mPeriod[length]);
            }
            for (int i4 = 0; i4 < dArr.length; i4++) {
                dArr[i4][0] = this.mOffset[i4];
                dArr[i4][1] = this.mPhase[i4];
                dArr[i4][2] = this.mValues[i4];
                this.mOscillator.addPoint(this.mPosition[i4], this.mPeriod[i4]);
            }
            this.mOscillator.normalize();
            double[] dArr3 = this.mPosition;
            if (dArr3.length > 1) {
                this.mCurveFit = CurveFit.get(0, dArr3, dArr);
            } else {
                this.mCurveFit = null;
            }
        }
    }

    /* loaded from: classes.dex */
    private static class IntDoubleSort {
        private IntDoubleSort() {
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

        static void sort(int[] iArr, float[] fArr, int i4, int i5) {
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

        private static void swap(int[] iArr, float[] fArr, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float f5 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = f5;
        }
    }

    /* loaded from: classes.dex */
    private static class IntFloatFloatSort {
        private IntFloatFloatSort() {
        }

        private static int partition(int[] iArr, float[] fArr, float[] fArr2, int i4, int i5) {
            int i6 = iArr[i5];
            int i7 = i4;
            while (i4 < i5) {
                if (iArr[i4] <= i6) {
                    swap(iArr, fArr, fArr2, i7, i4);
                    i7++;
                }
                i4++;
            }
            swap(iArr, fArr, fArr2, i7, i5);
            return i7;
        }

        static void sort(int[] iArr, float[] fArr, float[] fArr2, int i4, int i5) {
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
                    int partition = partition(iArr, fArr, fArr2, i8, i9);
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

        private static void swap(int[] iArr, float[] fArr, float[] fArr2, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float f5 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = f5;
            float f6 = fArr2[i4];
            fArr2[i4] = fArr2[i5];
            fArr2[i5] = f6;
        }
    }

    /* loaded from: classes.dex */
    public static class PathRotateSet extends KeyCycleOscillator {
        String type;
        int typeId;

        public PathRotateSet(String str) {
            this.type = str;
            this.typeId = c.a(str);
        }

        public void setPathRotate(MotionWidget motionWidget, float f5, double d5, double d6) {
            motionWidget.setRotationZ(get(f5) + ((float) Math.toDegrees(Math.atan2(d6, d5))));
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f5) {
            motionWidget.setValue(this.typeId, get(f5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class WavePoint {
        float mOffset;
        float mPeriod;
        float mPhase;
        int mPosition;
        float mValue;

        public WavePoint(int i4, float f5, float f6, float f7, float f8) {
            this.mPosition = i4;
            this.mValue = f8;
            this.mOffset = f6;
            this.mPeriod = f5;
            this.mPhase = f7;
        }
    }

    public static KeyCycleOscillator makeWidgetCycle(String str) {
        if (str.equals("pathRotate")) {
            return new PathRotateSet(str);
        }
        return new CoreSpline(str);
    }

    public float get(float f5) {
        return (float) this.mCycleOscillator.getValues(f5);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f5) {
        return (float) this.mCycleOscillator.getSlope(f5);
    }

    protected void setCustom(Object obj) {
    }

    public void setPoint(int i4, int i5, String str, int i6, float f5, float f6, float f7, float f8, Object obj) {
        this.mWavePoints.add(new WavePoint(i4, f5, f6, f7, f8));
        if (i6 != -1) {
            this.mVariesBy = i6;
        }
        this.mWaveShape = i5;
        setCustom(obj);
        this.mWaveString = str;
    }

    public void setProperty(MotionWidget motionWidget, float f5) {
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setup(float f5) {
        int size = this.mWavePoints.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.mWavePoints, new Comparator<WavePoint>() { // from class: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.1
            @Override // java.util.Comparator
            public int compare(WavePoint wavePoint, WavePoint wavePoint2) {
                return Integer.compare(wavePoint.mPosition, wavePoint2.mPosition);
            }
        });
        double[] dArr = new double[size];
        char c5 = 0;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, 3);
        this.mCycleOscillator = new CycleOscillator(this.mWaveShape, this.mWaveString, this.mVariesBy, size);
        Iterator<WavePoint> it2 = this.mWavePoints.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            WavePoint next = it2.next();
            float f6 = next.mPeriod;
            double d5 = f6;
            Double.isNaN(d5);
            dArr[i4] = d5 * 0.01d;
            double[] dArr3 = dArr2[i4];
            float f7 = next.mValue;
            dArr3[c5] = f7;
            double[] dArr4 = dArr2[i4];
            float f8 = next.mOffset;
            dArr4[1] = f8;
            double[] dArr5 = dArr2[i4];
            float f9 = next.mPhase;
            dArr5[2] = f9;
            this.mCycleOscillator.setPoint(i4, next.mPosition, f6, f8, f9, f7);
            i4++;
            c5 = 0;
        }
        this.mCycleOscillator.setup(f5);
        this.mCurveFit = CurveFit.get(0, dArr, dArr2);
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<WavePoint> it2 = this.mWavePoints.iterator();
        while (it2.hasNext()) {
            WavePoint next = it2.next();
            str = str + "[" + next.mPosition + " , " + decimalFormat.format(next.mValue) + "] ";
        }
        return str;
    }

    public boolean variesByPath() {
        return this.mVariesBy == 1;
    }

    public void setPoint(int i4, int i5, String str, int i6, float f5, float f6, float f7, float f8) {
        this.mWavePoints.add(new WavePoint(i4, f5, f6, f7, f8));
        if (i6 != -1) {
            this.mVariesBy = i6;
        }
        this.mWaveShape = i5;
        this.mWaveString = str;
    }
}

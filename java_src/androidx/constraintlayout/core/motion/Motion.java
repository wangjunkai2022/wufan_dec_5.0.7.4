package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.motion.utils.ViewState;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class Motion implements TypedValues {
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    String[] attributeTable;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private String[] mAttributeNames;
    private HashMap<String, SplineSet> mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private HashMap<String, KeyCycleOscillator> mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private MotionKeyTrigger[] mKeyTriggers;
    private CurveFit[] mSpline;
    private HashMap<String, TimeCycleSplineSet> mTimeCycleAttributesMap;
    MotionWidget mView;
    Rect mTempRect = new Rect();
    private int mCurveFitType = -1;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int MAX_DIMENSION = 4;
    private float[] mValuesBuff = new float[4];
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    private float[] mVelocity = new float[1];
    private ArrayList<MotionKey> mKeyList = new ArrayList<>();
    private int mPathMotionArc = -1;
    private int mTransformPivotTarget = -1;
    private MotionWidget mTransformPivotView = null;
    private int mQuantizeMotionSteps = -1;
    private float mQuantizeMotionPhase = Float.NaN;
    private DifferentialInterpolator mQuantizeMotionInterpolator = null;
    private boolean mNoMovement = false;

    public Motion(MotionWidget motionWidget) {
        setView(motionWidget);
    }

    private float getAdjustedPosition(float f5, float[] fArr) {
        float f6 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f7 = this.mStaggerScale;
            if (f7 != 1.0d) {
                float f8 = this.mStaggerOffset;
                if (f5 < f8) {
                    f5 = 0.0f;
                }
                if (f5 > f8 && f5 < 1.0d) {
                    f5 = Math.min((f5 - f8) * f7, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        float f9 = Float.NaN;
        Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
        while (it2.hasNext()) {
            MotionPaths next = it2.next();
            Easing easing2 = next.mKeyFrameEasing;
            if (easing2 != null) {
                float f10 = next.time;
                if (f10 < f5) {
                    easing = easing2;
                    f6 = f10;
                } else if (Float.isNaN(f9)) {
                    f9 = next.time;
                }
            }
        }
        if (easing != null) {
            float f11 = (Float.isNaN(f9) ? 1.0f : f9) - f6;
            double d5 = (f5 - f6) / f11;
            f5 = (((float) easing.get(d5)) * f11) + f6;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d5);
            }
        }
        return f5;
    }

    private static DifferentialInterpolator getInterpolator(int i4, String str, int i5) {
        if (i4 != -1) {
            return null;
        }
        final Easing interpolator = Easing.getInterpolator(str);
        return new DifferentialInterpolator() { // from class: androidx.constraintlayout.core.motion.Motion.1
            float mX;

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getInterpolation(float f5) {
                this.mX = f5;
                return (float) Easing.this.get(f5);
            }

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getVelocity() {
                return (float) Easing.this.getDiff(this.mX);
            }
        };
    }

    private float getPreCycleDistance() {
        char c5;
        float f5;
        float f6;
        float[] fArr = new float[2];
        float f7 = 1.0f / 99;
        double d5 = 0.0d;
        double d6 = 0.0d;
        float f8 = 0.0f;
        int i4 = 0;
        while (i4 < 100) {
            float f9 = i4 * f7;
            double d7 = f9;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
            float f10 = Float.NaN;
            float f11 = 0.0f;
            while (it2.hasNext()) {
                MotionPaths next = it2.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f12 = next.time;
                    if (f12 < f9) {
                        easing = easing2;
                        f11 = f12;
                    } else if (Float.isNaN(f10)) {
                        f10 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f10)) {
                    f10 = 1.0f;
                }
                d7 = (((float) easing.get((f9 - f11) / f6)) * (f10 - f11)) + f11;
            }
            this.mSpline[0].getPos(d7, this.mInterpolateData);
            float f13 = f8;
            int i5 = i4;
            this.mStartMotionPath.getCenter(d7, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i5 > 0) {
                double d8 = f13;
                double d9 = fArr[1];
                Double.isNaN(d9);
                c5 = 0;
                double d10 = fArr[0];
                Double.isNaN(d10);
                double hypot = Math.hypot(d6 - d9, d5 - d10);
                Double.isNaN(d8);
                f5 = (float) (d8 + hypot);
            } else {
                c5 = 0;
                f5 = f13;
            }
            d5 = fArr[c5];
            i4 = i5 + 1;
            f8 = f5;
            d6 = fArr[1];
        }
        return f8;
    }

    private void insertKey(MotionPaths motionPaths) {
        Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
        MotionPaths motionPaths2 = null;
        while (it2.hasNext()) {
            MotionPaths next = it2.next();
            if (motionPaths.position == next.position) {
                motionPaths2 = next;
            }
        }
        if (motionPaths2 != null) {
            this.mMotionPaths.remove(motionPaths2);
        }
        int binarySearch = Collections.binarySearch(this.mMotionPaths, motionPaths);
        if (binarySearch == 0) {
            Utils.loge(TAG, " KeyPath position \"" + motionPaths.position + "\" outside of range");
        }
        this.mMotionPaths.add((-binarySearch) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds(this.mView.getX(), this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void addKey(MotionKey motionKey) {
        this.mKeyList.add(motionKey);
    }

    void addKeys(ArrayList<MotionKey> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    void buildBounds(float[] fArr, int i4) {
        float f5;
        float f6 = 1.0f / (i4 - 1);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            float f7 = i5 * f6;
            float f8 = this.mStaggerScale;
            float f9 = 0.0f;
            if (f8 != 1.0f) {
                float f10 = this.mStaggerOffset;
                if (f7 < f10) {
                    f7 = 0.0f;
                }
                if (f7 > f10 && f7 < 1.0d) {
                    f7 = Math.min((f7 - f10) * f8, 1.0f);
                }
            }
            double d5 = f7;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f11 = Float.NaN;
            Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
            while (it2.hasNext()) {
                MotionPaths next = it2.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f12 = next.time;
                    if (f12 < f7) {
                        easing = easing2;
                        f9 = f12;
                    } else if (Float.isNaN(f11)) {
                        f11 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f11)) {
                    f11 = 1.0f;
                }
                d5 = (((float) easing.get((f7 - f9) / f5)) * (f11 - f9)) + f9;
            }
            this.mSpline[0].getPos(d5, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d5, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i5 * 2);
        }
    }

    int buildKeyBounds(float[] fArr, int[] iArr) {
        if (fArr != null) {
            double[] timePoints = this.mSpline[0].getTimePoints();
            if (iArr != null) {
                Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    iArr[i4] = it2.next().mMode;
                    i4++;
                }
            }
            int i5 = 0;
            for (double d5 : timePoints) {
                this.mSpline[0].getPos(d5, this.mInterpolateData);
                this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i5);
                i5 += 2;
            }
            return i5 / 2;
        }
        return 0;
    }

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr != null) {
            double[] timePoints = this.mSpline[0].getTimePoints();
            if (iArr != null) {
                Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    iArr[i4] = it2.next().mMode;
                    i4++;
                }
            }
            if (iArr2 != null) {
                Iterator<MotionPaths> it3 = this.mMotionPaths.iterator();
                int i5 = 0;
                while (it3.hasNext()) {
                    iArr2[i5] = (int) (it3.next().position * 100.0f);
                    i5++;
                }
            }
            int i6 = 0;
            for (int i7 = 0; i7 < timePoints.length; i7++) {
                this.mSpline[0].getPos(timePoints[i7], this.mInterpolateData);
                this.mStartMotionPath.getCenter(timePoints[i7], this.mInterpolateVariables, this.mInterpolateData, fArr, i6);
                i6 += 2;
            }
            return i6 / 2;
        }
        return 0;
    }

    public void buildPath(float[] fArr, int i4) {
        double d5;
        float f5;
        float f6 = 1.0f;
        float f7 = 1.0f / (i4 - 1);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        SplineSet splineSet = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        SplineSet splineSet2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, KeyCycleOscillator> hashMap3 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i5 = 0;
        while (i5 < i4) {
            float f8 = i5 * f7;
            float f9 = this.mStaggerScale;
            if (f9 != f6) {
                float f10 = this.mStaggerOffset;
                if (f8 < f10) {
                    f8 = 0.0f;
                }
                if (f8 > f10 && f8 < 1.0d) {
                    f8 = Math.min((f8 - f10) * f9, f6);
                }
            }
            float f11 = f8;
            double d6 = f11;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f12 = Float.NaN;
            Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
            float f13 = 0.0f;
            while (it2.hasNext()) {
                MotionPaths next = it2.next();
                Easing easing2 = next.mKeyFrameEasing;
                double d7 = d6;
                if (easing2 != null) {
                    float f14 = next.time;
                    if (f14 < f11) {
                        f13 = f14;
                        easing = easing2;
                    } else if (Float.isNaN(f12)) {
                        f12 = next.time;
                    }
                }
                d6 = d7;
            }
            double d8 = d6;
            if (easing != null) {
                if (Float.isNaN(f12)) {
                    f12 = 1.0f;
                }
                d5 = (((float) easing.get((f11 - f13) / f5)) * (f12 - f13)) + f13;
            } else {
                d5 = d8;
            }
            this.mSpline[0].getPos(d5, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d5, dArr);
                }
            }
            int i6 = i5 * 2;
            int i7 = i5;
            this.mStartMotionPath.getCenter(d5, this.mInterpolateVariables, this.mInterpolateData, fArr, i6);
            if (keyCycleOscillator != null) {
                fArr[i6] = fArr[i6] + keyCycleOscillator.get(f11);
            } else if (splineSet != null) {
                fArr[i6] = fArr[i6] + splineSet.get(f11);
            }
            if (keyCycleOscillator2 != null) {
                int i8 = i6 + 1;
                fArr[i8] = fArr[i8] + keyCycleOscillator2.get(f11);
            } else if (splineSet2 != null) {
                int i9 = i6 + 1;
                fArr[i9] = fArr[i9] + splineSet2.get(f11);
            }
            i5 = i7 + 1;
            f6 = 1.0f;
        }
    }

    public void buildRect(float f5, float[] fArr, int i4) {
        this.mSpline[0].getPos(getAdjustedPosition(f5, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i4);
    }

    void buildRectangles(float[] fArr, int i4) {
        float f5 = 1.0f / (i4 - 1);
        for (int i5 = 0; i5 < i4; i5++) {
            this.mSpline[0].getPos(getAdjustedPosition(i5 * f5, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i5 * 8);
        }
    }

    void endTrigger(boolean z4) {
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    int getAttributeValues(String str, float[] fArr, int i4) {
        SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i5 = 0; i5 < fArr.length; i5++) {
            fArr[i5] = splineSet.get(i5 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void getCenter(double d5, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d5, dArr);
        this.mSpline[0].getSlope(d5, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.mStartMotionPath.getCenter(d5, this.mInterpolateVariables, dArr, fArr, dArr2, fArr2);
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    void getDpDt(float f5, float f6, float f7, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f5, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i4 = 0;
        if (curveFitArr != null) {
            double d5 = adjustedPosition;
            curveFitArr[0].getSlope(d5, this.mInterpolateVelocity);
            this.mSpline[0].getPos(d5, this.mInterpolateData);
            float f8 = this.mVelocity[0];
            while (true) {
                dArr = this.mInterpolateVelocity;
                if (i4 >= dArr.length) {
                    break;
                }
                double d6 = dArr[i4];
                double d7 = f8;
                Double.isNaN(d7);
                dArr[i4] = d6 * d7;
                i4++;
            }
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr2 = this.mInterpolateData;
                if (dArr2.length > 0) {
                    curveFit.getPos(d5, dArr2);
                    this.mArcSpline.getSlope(d5, this.mInterpolateVelocity);
                    this.mStartMotionPath.setDpDt(f6, f7, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
                    return;
                }
                return;
            }
            this.mStartMotionPath.setDpDt(f6, f7, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        MotionPaths motionPaths = this.mEndMotionPath;
        float f9 = motionPaths.f45x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f10 = f9 - motionPaths2.f45x;
        float f11 = motionPaths.f46y - motionPaths2.f46y;
        float f12 = (motionPaths.width - motionPaths2.width) + f10;
        float f13 = (motionPaths.height - motionPaths2.height) + f11;
        fArr[0] = (f10 * (1.0f - f6)) + (f12 * f6);
        fArr[1] = (f11 * (1.0f - f7)) + (f13 * f7);
    }

    public int getDrawPath() {
        int i4 = this.mStartMotionPath.mDrawPath;
        Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
        while (it2.hasNext()) {
            i4 = Math.max(i4, it2.next().mDrawPath);
        }
        return Math.max(i4, this.mEndMotionPath.mDrawPath);
    }

    public float getFinalHeight() {
        return this.mEndMotionPath.height;
    }

    public float getFinalWidth() {
        return this.mEndMotionPath.width;
    }

    public float getFinalX() {
        return this.mEndMotionPath.f45x;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f46y;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public MotionPaths getKeyFrame(int i4) {
        return this.mMotionPaths.get(i4);
    }

    public int getKeyFrameInfo(int i4, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<MotionKey> it2 = this.mKeyList.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it2.hasNext()) {
            MotionKey next = it2.next();
            int i7 = next.mType;
            if (i7 == i4 || i4 != -1) {
                iArr[i6] = 0;
                int i8 = i6 + 1;
                iArr[i8] = i7;
                int i9 = i8 + 1;
                int i10 = next.mFramePosition;
                iArr[i9] = i10;
                double d5 = i10 / 100.0f;
                this.mSpline[0].getPos(d5, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d5, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                int i11 = i9 + 1;
                iArr[i11] = Float.floatToIntBits(fArr[0]);
                int i12 = i11 + 1;
                iArr[i12] = Float.floatToIntBits(fArr[1]);
                if (next instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) next;
                    int i13 = i12 + 1;
                    iArr[i13] = motionKeyPosition.mPositionType;
                    int i14 = i13 + 1;
                    iArr[i14] = Float.floatToIntBits(motionKeyPosition.mPercentX);
                    i12 = i14 + 1;
                    iArr[i12] = Float.floatToIntBits(motionKeyPosition.mPercentY);
                }
                int i15 = i12 + 1;
                iArr[i6] = i15 - i6;
                i5++;
                i6 = i15;
            }
        }
        return i5;
    }

    float getKeyFrameParameter(int i4, float f5, float f6) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f7 = motionPaths.f45x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f8 = motionPaths2.f45x;
        float f9 = f7 - f8;
        float f10 = motionPaths.f46y;
        float f11 = motionPaths2.f46y;
        float f12 = f10 - f11;
        float f13 = f8 + (motionPaths2.width / 2.0f);
        float f14 = f11 + (motionPaths2.height / 2.0f);
        float hypot = (float) Math.hypot(f9, f12);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f15 = f5 - f13;
        float f16 = f6 - f14;
        if (((float) Math.hypot(f15, f16)) == 0.0f) {
            return 0.0f;
        }
        float f17 = (f15 * f9) + (f16 * f12);
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                return 0.0f;
                            }
                            return f16 / f12;
                        }
                        return f15 / f12;
                    }
                    return f16 / f9;
                }
                return f15 / f9;
            }
            return (float) Math.sqrt((hypot * hypot) - (f17 * f17));
        }
        return f17 / hypot;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        Iterator<MotionKey> it2 = this.mKeyList.iterator();
        int i4 = 0;
        int i5 = 0;
        while (it2.hasNext()) {
            MotionKey next = it2.next();
            int i6 = next.mFramePosition;
            iArr[i4] = (next.mType * 1000) + i6;
            double d5 = i6 / 100.0f;
            this.mSpline[0].getPos(d5, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d5, this.mInterpolateVariables, this.mInterpolateData, fArr, i5);
            i5 += 2;
            i4++;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double[] getPos(double d5) {
        this.mSpline[0].getPos(d5, this.mInterpolateData);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(d5, dArr);
            }
        }
        return this.mInterpolateData;
    }

    MotionKeyPosition getPositionKeyframe(int i4, int i5, float f5, float f6) {
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f7 = motionPaths.f45x;
        floatRect.left = f7;
        float f8 = motionPaths.f46y;
        floatRect.top = f8;
        floatRect.right = f7 + motionPaths.width;
        floatRect.bottom = f8 + motionPaths.height;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f9 = motionPaths2.f45x;
        floatRect2.left = f9;
        float f10 = motionPaths2.f46y;
        floatRect2.top = f10;
        floatRect2.right = f9 + motionPaths2.width;
        floatRect2.bottom = f10 + motionPaths2.height;
        Iterator<MotionKey> it2 = this.mKeyList.iterator();
        while (it2.hasNext()) {
            MotionKey next = it2.next();
            if (next instanceof MotionKeyPosition) {
                MotionKeyPosition motionKeyPosition = (MotionKeyPosition) next;
                if (motionKeyPosition.intersects(i4, i5, floatRect, floatRect2, f5, f6)) {
                    return motionKeyPosition;
                }
            }
        }
        return null;
    }

    void getPostLayoutDvDp(float f5, int i4, int i5, float f6, float f7, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f5, this.mVelocity);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        SplineSet splineSet = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        SplineSet splineSet2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, SplineSet> hashMap3 = this.mAttributesMap;
        SplineSet splineSet3 = hashMap3 == null ? null : hashMap3.get("rotationZ");
        HashMap<String, SplineSet> hashMap4 = this.mAttributesMap;
        SplineSet splineSet4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, SplineSet> hashMap5 = this.mAttributesMap;
        SplineSet splineSet5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, KeyCycleOscillator> hashMap6 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, KeyCycleOscillator> hashMap7 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, KeyCycleOscillator> hashMap8 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator3 = hashMap8 == null ? null : hashMap8.get("rotationZ");
        HashMap<String, KeyCycleOscillator> hashMap9 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator4 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, KeyCycleOscillator> hashMap10 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator5 = hashMap10 != null ? hashMap10.get("scaleY") : null;
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
        velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d5 = adjustedPosition;
                curveFit.getPos(d5, dArr);
                this.mArcSpline.getSlope(d5, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f6, f7, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f6, f7, i4, i5, fArr);
            return;
        }
        int i6 = 0;
        if (this.mSpline != null) {
            double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
            this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
            this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
            float f8 = this.mVelocity[0];
            while (true) {
                double[] dArr2 = this.mInterpolateVelocity;
                if (i6 < dArr2.length) {
                    double d6 = dArr2[i6];
                    double d7 = f8;
                    Double.isNaN(d7);
                    dArr2[i6] = d6 * d7;
                    i6++;
                } else {
                    this.mStartMotionPath.setDpDt(f6, f7, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                    velocityMatrix.applyTransform(f6, f7, i4, i5, fArr);
                    return;
                }
            }
        } else {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f9 = motionPaths.f45x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f10 = f9 - motionPaths2.f45x;
            float f11 = motionPaths.f46y - motionPaths2.f46y;
            KeyCycleOscillator keyCycleOscillator6 = keyCycleOscillator4;
            float f12 = (motionPaths.height - motionPaths2.height) + f11;
            fArr[0] = (f10 * (1.0f - f6)) + (((motionPaths.width - motionPaths2.width) + f10) * f6);
            fArr[1] = (f11 * (1.0f - f7)) + (f12 * f7);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator6, keyCycleOscillator5, adjustedPosition);
            velocityMatrix.applyTransform(f6, f7, i4, i5, fArr);
        }
    }

    public float getStartHeight() {
        return this.mStartMotionPath.height;
    }

    public float getStartWidth() {
        return this.mStartMotionPath.width;
    }

    public float getStartX() {
        return this.mStartMotionPath.f45x;
    }

    public float getStartY() {
        return this.mStartMotionPath.f46y;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public MotionWidget getView() {
        return this.mView;
    }

    public boolean interpolate(MotionWidget motionWidget, float f5, long j4, KeyCache keyCache) {
        double d5;
        MotionWidget motionWidget2;
        float f6;
        float adjustedPosition = getAdjustedPosition(f5, null);
        int i4 = this.mQuantizeMotionSteps;
        if (i4 != -1) {
            float f7 = 1.0f / i4;
            float floor = ((float) Math.floor(adjustedPosition / f7)) * f7;
            float f8 = (adjustedPosition % f7) / f7;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f8 = (f8 + this.mQuantizeMotionPhase) % 1.0f;
            }
            DifferentialInterpolator differentialInterpolator = this.mQuantizeMotionInterpolator;
            if (differentialInterpolator != null) {
                f6 = differentialInterpolator.getInterpolation(f8);
            } else {
                f6 = ((double) f8) > 0.5d ? 1.0f : 0.0f;
            }
            adjustedPosition = (f6 * f7) + floor;
        }
        float f9 = adjustedPosition;
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            for (SplineSet splineSet : hashMap.values()) {
                splineSet.setProperty(motionWidget, f9);
            }
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d6 = f9;
            curveFitArr[0].getPos(d6, this.mInterpolateData);
            this.mSpline[0].getSlope(d6, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d6, dArr);
                    this.mArcSpline.getSlope(d6, this.mInterpolateVelocity);
                }
            }
            if (this.mNoMovement) {
                d5 = d6;
            } else {
                d5 = d6;
                this.mStartMotionPath.setView(f9, motionWidget, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null);
            }
            if (this.mTransformPivotTarget != -1) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = motionWidget.getParent().findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float top = (motionWidget2.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (motionWidget.getRight() - motionWidget.getLeft() > 0 && motionWidget.getBottom() - motionWidget.getTop() > 0) {
                        motionWidget.setPivotX(left - motionWidget.getLeft());
                        motionWidget.setPivotY(top - motionWidget.getTop());
                    }
                }
            }
            int i5 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i5 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i5].getPos(d5, this.mValuesBuff);
                this.mStartMotionPath.customAttributes.get(this.mAttributeNames[i5 - 1]).setInterpolatedValue(motionWidget, this.mValuesBuff);
                i5++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (f9 <= 0.0f) {
                    motionWidget.setVisibility(motionConstrainedPoint.visibility);
                } else if (f9 >= 1.0f) {
                    motionWidget.setVisibility(this.mEndPoint.visibility);
                } else if (this.mEndPoint.visibility != motionConstrainedPoint.visibility) {
                    motionWidget.setVisibility(4);
                }
            }
            if (this.mKeyTriggers != null) {
                int i6 = 0;
                while (true) {
                    MotionKeyTrigger[] motionKeyTriggerArr = this.mKeyTriggers;
                    if (i6 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i6].conditionallyFire(f9, motionWidget);
                    i6++;
                }
            }
        } else {
            MotionPaths motionPaths = this.mStartMotionPath;
            float f10 = motionPaths.f45x;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float f11 = f10 + ((motionPaths2.f45x - f10) * f9);
            float f12 = motionPaths.f46y;
            float f13 = f12 + ((motionPaths2.f46y - f12) * f9);
            float f14 = motionPaths.width;
            float f15 = f14 + ((motionPaths2.width - f14) * f9);
            float f16 = motionPaths.height;
            float f17 = f11 + 0.5f;
            float f18 = f13 + 0.5f;
            motionWidget.layout((int) f17, (int) f18, (int) (f17 + f15), (int) (f18 + f16 + ((motionPaths2.height - f16) * f9)));
        }
        HashMap<String, KeyCycleOscillator> hashMap2 = this.mCycleMap;
        if (hashMap2 != null) {
            for (KeyCycleOscillator keyCycleOscillator : hashMap2.values()) {
                if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                    double[] dArr2 = this.mInterpolateVelocity;
                    ((KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(motionWidget, f9, dArr2[0], dArr2[1]);
                } else {
                    keyCycleOscillator.setProperty(motionWidget, f9);
                }
            }
            return false;
        }
        return false;
    }

    String name() {
        return this.mView.getName();
    }

    void positionKeyframe(MotionWidget motionWidget, MotionKeyPosition motionKeyPosition, float f5, float f6, String[] strArr, float[] fArr) {
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f7 = motionPaths.f45x;
        floatRect.left = f7;
        float f8 = motionPaths.f46y;
        floatRect.top = f8;
        floatRect.right = f7 + motionPaths.width;
        floatRect.bottom = f8 + motionPaths.height;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f9 = motionPaths2.f45x;
        floatRect2.left = f9;
        float f10 = motionPaths2.f46y;
        floatRect2.top = f10;
        floatRect2.right = f9 + motionPaths2.width;
        floatRect2.bottom = f10 + motionPaths2.height;
        motionKeyPosition.positionAttributes(motionWidget, floatRect, floatRect2, f5, f6, strArr, fArr);
    }

    void rotate(Rect rect, Rect rect2, int i4, int i5, int i6) {
        if (i4 == 1) {
            int i7 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i6 - ((i7 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i4 == 2) {
            int i8 = rect.left + rect.right;
            rect2.left = i5 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i8 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i4 == 3) {
            int i9 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i9 / 2);
            rect2.top = i6 - ((i9 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i4 != 4) {
        } else {
            int i10 = rect.left + rect.right;
            rect2.left = i5 - (((rect.bottom + rect.top) + rect.width()) / 2);
            rect2.top = (i10 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        }
    }

    void setBothStates(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartPoint.setState(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setDrawPath(int i4) {
        this.mStartMotionPath.mDrawPath = i4;
    }

    public void setEnd(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.time = 1.0f;
        motionPaths.position = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds(motionWidget.getLeft(), motionWidget.getTop(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.applyParameters(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setPathMotionArc(int i4) {
        this.mPathMotionArc = i4;
    }

    public void setStart(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartMotionPath.applyParameters(motionWidget);
        this.mStartPoint.setState(motionWidget);
    }

    public void setStartState(ViewState viewState, MotionWidget motionWidget, int i4, int i5, int i6) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        Rect rect = new Rect();
        if (i4 == 1) {
            int i7 = viewState.left + viewState.right;
            rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i5 - ((i7 + viewState.height()) / 2);
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        } else if (i4 == 2) {
            int i8 = viewState.left + viewState.right;
            rect.left = i6 - (((viewState.top + viewState.bottom) + viewState.width()) / 2);
            rect.top = (i8 - viewState.height()) / 2;
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        }
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, motionWidget, i4, viewState.rotation);
    }

    public void setTransformPivotTarget(int i4) {
        this.mTransformPivotTarget = i4;
        this.mTransformPivotView = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i4, float f5) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i4, int i5) {
        if (i4 != 509) {
            return i4 == 704;
        }
        setPathMotionArc(i5);
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i4, boolean z4) {
        return false;
    }

    public void setView(MotionWidget motionWidget) {
        this.mView = motionWidget;
    }

    public void setup(int i4, int i5, float f5, long j4) {
        ArrayList arrayList;
        String[] strArr;
        Class<double> cls;
        int i6;
        CustomVariable customVariable;
        SplineSet makeSpline;
        CustomVariable customVariable2;
        Integer num;
        Iterator<String> it2;
        SplineSet makeSpline2;
        CustomVariable customVariable3;
        Class<double> cls2 = double.class;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i7 = this.mPathMotionArc;
        if (i7 != -1) {
            this.mStartMotionPath.mPathMotionArc = i7;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<MotionKey> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            Iterator<MotionKey> it3 = arrayList2.iterator();
            arrayList = null;
            while (it3.hasNext()) {
                MotionKey next = it3.next();
                if (next instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) next;
                    insertKey(new MotionPaths(i4, i5, motionKeyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i8 = motionKeyPosition.mCurveFit;
                    if (i8 != -1) {
                        this.mCurveFitType = i8;
                    }
                } else if (next instanceof MotionKeyCycle) {
                    next.getAttributeNames(hashSet3);
                } else if (next instanceof MotionKeyTimeCycle) {
                    next.getAttributeNames(hashSet);
                } else if (next instanceof MotionKeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((MotionKeyTrigger) next);
                } else {
                    next.setInterpolation(hashMap);
                    next.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (MotionKeyTrigger[]) arrayList.toArray(new MotionKeyTrigger[0]);
        }
        char c5 = 1;
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                String next2 = it4.next();
                if (next2.startsWith("CUSTOM,")) {
                    KeyFrameArray.CustomVar customVar = new KeyFrameArray.CustomVar();
                    String str = next2.split(",")[c5];
                    Iterator<MotionKey> it5 = this.mKeyList.iterator();
                    while (it5.hasNext()) {
                        MotionKey next3 = it5.next();
                        Iterator<String> it6 = it4;
                        HashMap<String, CustomVariable> hashMap2 = next3.mCustom;
                        if (hashMap2 != null && (customVariable3 = hashMap2.get(str)) != null) {
                            customVar.append(next3.mFramePosition, customVariable3);
                        }
                        it4 = it6;
                    }
                    it2 = it4;
                    makeSpline2 = SplineSet.makeCustomSplineSet(next2, customVar);
                } else {
                    it2 = it4;
                    makeSpline2 = SplineSet.makeSpline(next2, j4);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(next2);
                    this.mAttributesMap.put(next2, makeSpline2);
                }
                it4 = it2;
                c5 = 1;
            }
            ArrayList<MotionKey> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                Iterator<MotionKey> it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    MotionKey next4 = it7.next();
                    if (next4 instanceof MotionKeyAttributes) {
                        next4.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str2 : this.mAttributesMap.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                SplineSet splineSet = this.mAttributesMap.get(str2);
                if (splineSet != null) {
                    splineSet.setup(intValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap<>();
            }
            Iterator<String> it8 = hashSet.iterator();
            while (it8.hasNext()) {
                String next5 = it8.next();
                if (!this.mTimeCycleAttributesMap.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        KeyFrameArray.CustomVar customVar2 = new KeyFrameArray.CustomVar();
                        String str3 = next5.split(",")[1];
                        Iterator<MotionKey> it9 = this.mKeyList.iterator();
                        while (it9.hasNext()) {
                            MotionKey next6 = it9.next();
                            HashMap<String, CustomVariable> hashMap3 = next6.mCustom;
                            if (hashMap3 != null && (customVariable2 = hashMap3.get(str3)) != null) {
                                customVar2.append(next6.mFramePosition, customVariable2);
                            }
                        }
                        makeSpline = SplineSet.makeCustomSplineSet(next5, customVar2);
                    } else {
                        makeSpline = SplineSet.makeSpline(next5, j4);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(next5);
                    }
                }
            }
            ArrayList<MotionKey> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                Iterator<MotionKey> it10 = arrayList4.iterator();
                while (it10.hasNext()) {
                    MotionKey next7 = it10.next();
                    if (next7 instanceof MotionKeyTimeCycle) {
                        ((MotionKeyTimeCycle) next7).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str4 : this.mTimeCycleAttributesMap.keySet()) {
                this.mTimeCycleAttributesMap.get(str4).setup(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int i9 = 2;
        int size = this.mMotionPaths.size() + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[size];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size - 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == MotionKey.UNSET) {
            this.mCurveFitType = 0;
        }
        Iterator<MotionPaths> it11 = this.mMotionPaths.iterator();
        int i10 = 1;
        while (it11.hasNext()) {
            motionPathsArr[i10] = it11.next();
            i10++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.mEndMotionPath.customAttributes.keySet()) {
            if (this.mStartMotionPath.customAttributes.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpolatorCount = new int[strArr2.length];
        int i11 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i11 >= strArr.length) {
                break;
            }
            String str6 = strArr[i11];
            this.mAttributeInterpolatorCount[i11] = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                if (motionPathsArr[i12].customAttributes.containsKey(str6) && (customVariable = motionPathsArr[i12].customAttributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i11] = iArr[i11] + customVariable.numberOfInterpolatedValues();
                    break;
                }
                i12++;
            }
            i11++;
        }
        boolean z4 = motionPathsArr[0].mPathMotionArc != -1;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i13 = 1; i13 < size; i13++) {
            motionPathsArr[i13].different(motionPathsArr[i13 - 1], zArr, this.mAttributeNames, z4);
        }
        int i14 = 0;
        for (int i15 = 1; i15 < length; i15++) {
            if (zArr[i15]) {
                i14++;
            }
        }
        this.mInterpolateVariables = new int[i14];
        int max = Math.max(2, i14);
        this.mInterpolateData = new double[max];
        this.mInterpolateVelocity = new double[max];
        int i16 = 0;
        for (int i17 = 1; i17 < length; i17++) {
            if (zArr[i17]) {
                this.mInterpolateVariables[i16] = i17;
                i16++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls2, size, this.mInterpolateVariables.length);
        double[] dArr2 = new double[size];
        for (int i18 = 0; i18 < size; i18++) {
            motionPathsArr[i18].fillStandard(dArr[i18], this.mInterpolateVariables);
            dArr2[i18] = motionPathsArr[i18].time;
        }
        int i19 = 0;
        while (true) {
            int[] iArr2 = this.mInterpolateVariables;
            if (i19 >= iArr2.length) {
                break;
            }
            if (iArr2[i19] < MotionPaths.names.length) {
                String str7 = MotionPaths.names[this.mInterpolateVariables[i19]] + " [";
                for (int i20 = 0; i20 < size; i20++) {
                    str7 = str7 + dArr[i20][i19];
                }
            }
            i19++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i21 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i21 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i21];
            int i22 = 0;
            int i23 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i22 < size) {
                if (motionPathsArr[i22].hasCustomData(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i9];
                        iArr3[1] = motionPathsArr[i22].getCustomDataCount(str8);
                        i6 = 0;
                        iArr3[0] = size;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls2, iArr3);
                    } else {
                        i6 = 0;
                    }
                    cls = cls2;
                    dArr3[i23] = motionPathsArr[i22].time;
                    motionPathsArr[i22].getCustomData(str8, dArr4[i23], i6);
                    i23++;
                } else {
                    cls = cls2;
                }
                i22++;
                cls2 = cls;
                i9 = 2;
            }
            i21++;
            this.mSpline[i21] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i23), (double[][]) Arrays.copyOf(dArr4, i23));
            cls2 = cls2;
            i9 = 2;
        }
        Class<double> cls3 = cls2;
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != -1) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls3, size, 2);
            for (int i24 = 0; i24 < size; i24++) {
                iArr4[i24] = motionPathsArr[i24].mPathMotionArc;
                dArr5[i24] = motionPathsArr[i24].time;
                dArr6[i24][0] = motionPathsArr[i24].f45x;
                dArr6[i24][1] = motionPathsArr[i24].f46y;
            }
            this.mArcSpline = CurveFit.getArc(iArr4, dArr5, dArr6);
        }
        float f6 = Float.NaN;
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it12 = hashSet3.iterator();
            while (it12.hasNext()) {
                String next8 = it12.next();
                KeyCycleOscillator makeWidgetCycle = KeyCycleOscillator.makeWidgetCycle(next8);
                if (makeWidgetCycle != null) {
                    if (makeWidgetCycle.variesByPath() && Float.isNaN(f6)) {
                        f6 = getPreCycleDistance();
                    }
                    makeWidgetCycle.setType(next8);
                    this.mCycleMap.put(next8, makeWidgetCycle);
                }
            }
            Iterator<MotionKey> it13 = this.mKeyList.iterator();
            while (it13.hasNext()) {
                MotionKey next9 = it13.next();
                if (next9 instanceof MotionKeyCycle) {
                    ((MotionKeyCycle) next9).addCycleValues(this.mCycleMap);
                }
            }
            for (KeyCycleOscillator keyCycleOscillator : this.mCycleMap.values()) {
                keyCycleOscillator.setup(f6);
            }
        }
    }

    public void setupRelative(Motion motion) {
        this.mStartMotionPath.setupRelative(motion, motion.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motion, motion.mEndMotionPath);
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.f45x + " y: " + this.mStartMotionPath.f46y + " end: x: " + this.mEndMotionPath.f45x + " y: " + this.mEndMotionPath.f46y;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i4, String str) {
        if (705 == i4) {
            PrintStream printStream = System.out;
            printStream.println("TYPE_INTERPOLATOR  " + str);
            this.mQuantizeMotionInterpolator = getInterpolator(-1, str, 0);
        }
        return false;
    }
}

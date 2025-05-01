package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    public static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] names = {"position", "x", "y", "width", "height", "pathRotate"};
    HashMap<String, CustomVariable> customAttributes;
    float height;
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    int mDrawPath;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPathRotate;
    float mProgress;
    float mRelativeAngle;
    Motion mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;

    /* renamed from: x  reason: collision with root package name */
    float f45x;

    /* renamed from: y  reason: collision with root package name */
    float f46y;

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = -1;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.customAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float f5, float f6) {
        return (Float.isNaN(f5) || Float.isNaN(f6)) ? Float.isNaN(f5) != Float.isNaN(f6) : Math.abs(f5 - f6) > 1.0E-6f;
    }

    private static final float xRotate(float f5, float f6, float f7, float f8, float f9, float f10) {
        return (((f9 - f7) * f6) - ((f10 - f8) * f5)) + f7;
    }

    private static final float yRotate(float f5, float f6, float f7, float f8, float f9, float f10) {
        return ((f9 - f7) * f5) + ((f10 - f8) * f6) + f8;
    }

    public void applyParameters(MotionWidget motionWidget) {
        this.mKeyFrameEasing = Easing.getInterpolator(motionWidget.motion.mTransitionEasing);
        MotionWidget.Motion motion = motionWidget.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = motionWidget.propertySet.mProgress;
        this.mRelativeAngle = 0.0f;
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.customAttributes.put(str, customAttribute);
            }
        }
    }

    public void configureRelativeTo(Motion motion) {
        motion.getPos(this.mProgress);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z4) {
        boolean diff = diff(this.f45x, motionPaths.f45x);
        boolean diff2 = diff(this.f46y, motionPaths.f46y);
        zArr[0] = zArr[0] | diff(this.position, motionPaths.position);
        boolean z5 = diff | diff2 | z4;
        zArr[1] = zArr[1] | z5;
        zArr[2] = z5 | zArr[2];
        zArr[3] = zArr[3] | diff(this.width, motionPaths.width);
        zArr[4] = diff(this.height, motionPaths.height) | zArr[4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f45x, this.f46y, this.width, this.height, this.mPathRotate};
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            if (iArr[i5] < 6) {
                dArr[i4] = fArr[iArr[i5]];
                i4++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f5 = this.width;
        float f6 = this.height;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f7 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 3) {
                f5 = f7;
            } else if (i6 == 4) {
                f6 = f7;
            }
        }
        fArr[i4] = f5;
        fArr[i4 + 1] = f6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getCenter(double d5, int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f5 = this.f45x;
        float f6 = this.f46y;
        float f7 = this.width;
        float f8 = this.height;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f9 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f5 = f9;
            } else if (i6 == 2) {
                f6 = f9;
            } else if (i6 == 3) {
                f7 = f9;
            } else if (i6 == 4) {
                f8 = f9;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d5, fArr2, new float[2]);
            float f10 = fArr2[0];
            float f11 = fArr2[1];
            double d6 = f10;
            double d7 = f5;
            double d8 = f6;
            double sin = Math.sin(d8);
            Double.isNaN(d7);
            Double.isNaN(d6);
            double d9 = d6 + (sin * d7);
            double d10 = f7 / 2.0f;
            Double.isNaN(d10);
            float f12 = (float) (d9 - d10);
            double d11 = f11;
            double cos = Math.cos(d8);
            Double.isNaN(d7);
            Double.isNaN(d11);
            double d12 = d11 - (d7 * cos);
            double d13 = f8 / 2.0f;
            Double.isNaN(d13);
            f5 = f12;
            f6 = (float) (d12 - d13);
        }
        fArr[i4] = f5 + (f7 / 2.0f) + 0.0f;
        fArr[i4 + 1] = f6 + (f8 / 2.0f) + 0.0f;
    }

    void getCenterVelocity(double d5, int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f5 = this.f45x;
        float f6 = this.f46y;
        float f7 = this.width;
        float f8 = this.height;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f9 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f5 = f9;
            } else if (i6 == 2) {
                f6 = f9;
            } else if (i6 == 3) {
                f7 = f9;
            } else if (i6 == 4) {
                f8 = f9;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d5, fArr2, new float[2]);
            float f10 = fArr2[0];
            float f11 = fArr2[1];
            double d6 = f10;
            double d7 = f5;
            double d8 = f6;
            double sin = Math.sin(d8);
            Double.isNaN(d7);
            Double.isNaN(d6);
            double d9 = d6 + (sin * d7);
            double d10 = f7 / 2.0f;
            Double.isNaN(d10);
            float f12 = (float) (d9 - d10);
            double d11 = f11;
            double cos = Math.cos(d8);
            Double.isNaN(d7);
            Double.isNaN(d11);
            double d12 = d11 - (d7 * cos);
            double d13 = f8 / 2.0f;
            Double.isNaN(d13);
            f5 = f12;
            f6 = (float) (d12 - d13);
        }
        fArr[i4] = f5 + (f7 / 2.0f) + 0.0f;
        fArr[i4 + 1] = f6 + (f8 / 2.0f) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCustomData(String str, double[] dArr, int i4) {
        CustomVariable customVariable = this.customAttributes.get(str);
        int i5 = 0;
        if (customVariable == null) {
            return 0;
        }
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i4] = customVariable.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        float[] fArr = new float[numberOfInterpolatedValues];
        customVariable.getValuesToInterpolate(fArr);
        while (i5 < numberOfInterpolatedValues) {
            dArr[i4] = fArr[i5];
            i5++;
            i4++;
        }
        return numberOfInterpolatedValues;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCustomDataCount(String str) {
        CustomVariable customVariable = this.customAttributes.get(str);
        if (customVariable == null) {
            return 0;
        }
        return customVariable.numberOfInterpolatedValues();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f5 = this.f45x;
        float f6 = this.f46y;
        float f7 = this.width;
        float f8 = this.height;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f9 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f5 = f9;
            } else if (i6 == 2) {
                f6 = f9;
            } else if (i6 == 3) {
                f7 = f9;
            } else if (i6 == 4) {
                f8 = f9;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float centerX = motion.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d5 = centerX;
            double d6 = f5;
            double d7 = f6;
            double sin = Math.sin(d7);
            Double.isNaN(d6);
            Double.isNaN(d5);
            double d8 = d5 + (sin * d6);
            double d9 = f7 / 2.0f;
            Double.isNaN(d9);
            double d10 = centerY;
            double cos = Math.cos(d7);
            Double.isNaN(d6);
            Double.isNaN(d10);
            double d11 = f8 / 2.0f;
            Double.isNaN(d11);
            f6 = (float) ((d10 - (d6 * cos)) - d11);
            f5 = (float) (d8 - d9);
        }
        float f10 = f7 + f5;
        float f11 = f8 + f6;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i7 = i4 + 1;
        fArr[i4] = f5 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f6 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f10 + 0.0f;
        int i10 = i9 + 1;
        fArr[i9] = f6 + 0.0f;
        int i11 = i10 + 1;
        fArr[i10] = f10 + 0.0f;
        int i12 = i11 + 1;
        fArr[i11] = f11 + 0.0f;
        fArr[i12] = f5 + 0.0f;
        fArr[i12 + 1] = f11 + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasCustomData(String str) {
        return this.customAttributes.containsKey(str);
    }

    void initCartesian(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f5 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f5;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f6 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f5 : motionKeyPosition.mPercentWidth;
        float f7 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f5 : motionKeyPosition.mPercentHeight;
        float f8 = motionPaths2.width;
        float f9 = motionPaths.width;
        float f10 = motionPaths2.height;
        float f11 = motionPaths.height;
        this.position = this.time;
        float f12 = motionPaths.f45x;
        float f13 = motionPaths.f46y;
        float f14 = (motionPaths2.f45x + (f8 / 2.0f)) - ((f9 / 2.0f) + f12);
        float f15 = (motionPaths2.f46y + (f10 / 2.0f)) - (f13 + (f11 / 2.0f));
        float f16 = (f8 - f9) * f6;
        float f17 = f16 / 2.0f;
        this.f45x = (int) ((f12 + (f14 * f5)) - f17);
        float f18 = (f10 - f11) * f7;
        float f19 = f18 / 2.0f;
        this.f46y = (int) ((f13 + (f15 * f5)) - f19);
        this.width = (int) (f9 + f16);
        this.height = (int) (f11 + f18);
        float f20 = Float.isNaN(motionKeyPosition.mPercentX) ? f5 : motionKeyPosition.mPercentX;
        float f21 = Float.isNaN(motionKeyPosition.mAltPercentY) ? 0.0f : motionKeyPosition.mAltPercentY;
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            f5 = motionKeyPosition.mPercentY;
        }
        float f22 = Float.isNaN(motionKeyPosition.mAltPercentX) ? 0.0f : motionKeyPosition.mAltPercentX;
        this.mMode = 0;
        this.f45x = (int) (((motionPaths.f45x + (f20 * f14)) + (f22 * f15)) - f17);
        this.f46y = (int) (((motionPaths.f46y + (f14 * f21)) + (f15 * f5)) - f19);
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    void initPath(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f5;
        float f6;
        float f7 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f7;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f8 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f7 : motionKeyPosition.mPercentWidth;
        float f9 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f7 : motionKeyPosition.mPercentHeight;
        float f10 = motionPaths2.width - motionPaths.width;
        float f11 = motionPaths2.height - motionPaths.height;
        this.position = this.time;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            f7 = motionKeyPosition.mPercentX;
        }
        float f12 = motionPaths.f45x;
        float f13 = motionPaths.width;
        float f14 = motionPaths.f46y;
        float f15 = motionPaths.height;
        float f16 = (motionPaths2.f45x + (motionPaths2.width / 2.0f)) - ((f13 / 2.0f) + f12);
        float f17 = (motionPaths2.f46y + (motionPaths2.height / 2.0f)) - ((f15 / 2.0f) + f14);
        float f18 = f16 * f7;
        float f19 = (f10 * f8) / 2.0f;
        this.f45x = (int) ((f12 + f18) - f19);
        float f20 = f7 * f17;
        float f21 = (f11 * f9) / 2.0f;
        this.f46y = (int) ((f14 + f20) - f21);
        this.width = (int) (f13 + f5);
        this.height = (int) (f15 + f6);
        float f22 = Float.isNaN(motionKeyPosition.mPercentY) ? 0.0f : motionKeyPosition.mPercentY;
        this.mMode = 1;
        float f23 = (int) ((motionPaths.f45x + f18) - f19);
        this.f45x = f23;
        float f24 = (int) ((motionPaths.f46y + f20) - f21);
        this.f46y = f24;
        this.f45x = f23 + ((-f17) * f22);
        this.f46y = f24 + (f16 * f22);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    void initPolar(int i4, int i5, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float min;
        float f5;
        float f6 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f6;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mMode = motionKeyPosition.mPositionType;
        float f7 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f6 : motionKeyPosition.mPercentWidth;
        float f8 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f6 : motionKeyPosition.mPercentHeight;
        float f9 = motionPaths2.width;
        float f10 = motionPaths.width;
        float f11 = motionPaths2.height;
        float f12 = motionPaths.height;
        this.position = this.time;
        this.width = (int) (f10 + ((f9 - f10) * f7));
        this.height = (int) (f12 + ((f11 - f12) * f8));
        int i6 = motionKeyPosition.mPositionType;
        if (i6 == 1) {
            float f13 = Float.isNaN(motionKeyPosition.mPercentX) ? f6 : motionKeyPosition.mPercentX;
            float f14 = motionPaths2.f45x;
            float f15 = motionPaths.f45x;
            this.f45x = (f13 * (f14 - f15)) + f15;
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f6 = motionKeyPosition.mPercentY;
            }
            float f16 = motionPaths2.f46y;
            float f17 = motionPaths.f46y;
            this.f46y = (f6 * (f16 - f17)) + f17;
        } else if (i6 != 2) {
            float f18 = Float.isNaN(motionKeyPosition.mPercentX) ? f6 : motionKeyPosition.mPercentX;
            float f19 = motionPaths2.f45x;
            float f20 = motionPaths.f45x;
            this.f45x = (f18 * (f19 - f20)) + f20;
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f6 = motionKeyPosition.mPercentY;
            }
            float f21 = motionPaths2.f46y;
            float f22 = motionPaths.f46y;
            this.f46y = (f6 * (f21 - f22)) + f22;
        } else {
            if (Float.isNaN(motionKeyPosition.mPercentX)) {
                float f23 = motionPaths2.f45x;
                float f24 = motionPaths.f45x;
                min = ((f23 - f24) * f6) + f24;
            } else {
                min = Math.min(f8, f7) * motionKeyPosition.mPercentX;
            }
            this.f45x = min;
            if (Float.isNaN(motionKeyPosition.mPercentY)) {
                float f25 = motionPaths2.f46y;
                float f26 = motionPaths.f46y;
                f5 = (f6 * (f25 - f26)) + f26;
            } else {
                f5 = motionKeyPosition.mPercentY;
            }
            this.f46y = f5;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    void initScreen(int i4, int i5, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f5 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f5;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f6 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f5 : motionKeyPosition.mPercentWidth;
        float f7 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f5 : motionKeyPosition.mPercentHeight;
        float f8 = motionPaths2.width;
        float f9 = motionPaths.width;
        float f10 = motionPaths2.height;
        float f11 = motionPaths.height;
        this.position = this.time;
        float f12 = motionPaths.f45x;
        float f13 = motionPaths.f46y;
        float f14 = motionPaths2.f45x + (f8 / 2.0f);
        float f15 = motionPaths2.f46y + (f10 / 2.0f);
        float f16 = (f8 - f9) * f6;
        this.f45x = (int) ((f12 + ((f14 - ((f9 / 2.0f) + f12)) * f5)) - (f16 / 2.0f));
        float f17 = (f10 - f11) * f7;
        this.f46y = (int) ((f13 + ((f15 - (f13 + (f11 / 2.0f))) * f5)) - (f17 / 2.0f));
        this.width = (int) (f9 + f16);
        this.height = (int) (f11 + f17);
        this.mMode = 2;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            this.f45x = (int) (motionKeyPosition.mPercentX * ((int) (i4 - this.width)));
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            this.f46y = (int) (motionKeyPosition.mPercentY * ((int) (i5 - this.height)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBounds(float f5, float f6, float f7, float f8) {
        this.f45x = f5;
        this.f46y = f6;
        this.width = f7;
        this.height = f8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDpDt(float f5, float f6, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            float f11 = (float) dArr[i4];
            double d5 = dArr2[i4];
            int i5 = iArr[i4];
            if (i5 == 1) {
                f7 = f11;
            } else if (i5 == 2) {
                f9 = f11;
            } else if (i5 == 3) {
                f8 = f11;
            } else if (i5 == 4) {
                f10 = f11;
            }
        }
        float f12 = f7 - ((0.0f * f8) / 2.0f);
        float f13 = f9 - ((0.0f * f10) / 2.0f);
        fArr[0] = (f12 * (1.0f - f5)) + (((f8 * 1.0f) + f12) * f5) + 0.0f;
        fArr[1] = (f13 * (1.0f - f6)) + (((f10 * 1.0f) + f13) * f6) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setView(float f5, MotionWidget motionWidget, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f6;
        float f7;
        float f8 = this.f45x;
        float f9 = this.f46y;
        float f10 = this.width;
        float f11 = this.height;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i4 = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i4];
            this.mTempDelta = new double[i4];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.mTempValue[iArr[i5]] = dArr[i5];
            this.mTempDelta[iArr[i5]] = dArr2[i5];
        }
        float f12 = Float.NaN;
        int i6 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (true) {
            double[] dArr4 = this.mTempValue;
            if (i6 >= dArr4.length) {
                break;
            }
            if (Double.isNaN(dArr4[i6]) && (dArr3 == null || dArr3[i6] == 0.0d)) {
                f7 = f12;
            } else {
                double d5 = dArr3 != null ? dArr3[i6] : 0.0d;
                if (!Double.isNaN(this.mTempValue[i6])) {
                    d5 = this.mTempValue[i6] + d5;
                }
                f7 = f12;
                float f17 = (float) d5;
                float f18 = (float) this.mTempDelta[i6];
                if (i6 == 1) {
                    f12 = f7;
                    f13 = f18;
                    f8 = f17;
                } else if (i6 == 2) {
                    f12 = f7;
                    f14 = f18;
                    f9 = f17;
                } else if (i6 == 3) {
                    f12 = f7;
                    f15 = f18;
                    f10 = f17;
                } else if (i6 == 4) {
                    f12 = f7;
                    f16 = f18;
                    f11 = f17;
                } else if (i6 == 5) {
                    f12 = f17;
                }
                i6++;
            }
            f12 = f7;
            i6++;
        }
        float f19 = f12;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motion.getCenter(f5, fArr, fArr2);
            float f20 = fArr[0];
            float f21 = fArr[1];
            float f22 = fArr2[0];
            float f23 = fArr2[1];
            double d6 = f20;
            double d7 = f8;
            double d8 = f9;
            double sin = Math.sin(d8);
            Double.isNaN(d7);
            Double.isNaN(d6);
            double d9 = f10 / 2.0f;
            Double.isNaN(d9);
            float f24 = (float) ((d6 + (sin * d7)) - d9);
            double d10 = f21;
            double cos = Math.cos(d8);
            Double.isNaN(d7);
            Double.isNaN(d10);
            double d11 = d10 - (cos * d7);
            f6 = f11;
            double d12 = f11 / 2.0f;
            Double.isNaN(d12);
            float f25 = (float) (d11 - d12);
            double d13 = f22;
            double d14 = f13;
            double sin2 = Math.sin(d8);
            Double.isNaN(d14);
            Double.isNaN(d13);
            double d15 = d13 + (sin2 * d14);
            double cos2 = Math.cos(d8);
            Double.isNaN(d7);
            double d16 = f14;
            Double.isNaN(d16);
            float f26 = (float) (d15 + (cos2 * d7 * d16));
            double d17 = f23;
            double cos3 = Math.cos(d8);
            Double.isNaN(d14);
            Double.isNaN(d17);
            double sin3 = Math.sin(d8);
            Double.isNaN(d7);
            Double.isNaN(d16);
            float f27 = (float) ((d17 - (d14 * cos3)) + (d7 * sin3 * d16));
            if (dArr2.length >= 2) {
                dArr2[0] = f26;
                dArr2[1] = f27;
            }
            if (!Float.isNaN(f19)) {
                double d18 = f19;
                double degrees = Math.toDegrees(Math.atan2(f27, f26));
                Double.isNaN(d18);
                motionWidget.setRotationZ((float) (d18 + degrees));
            }
            f8 = f24;
            f9 = f25;
        } else {
            f6 = f11;
            if (!Float.isNaN(f19)) {
                double d19 = 0.0f;
                double d20 = f19;
                double degrees2 = Math.toDegrees(Math.atan2(f14 + (f16 / 2.0f), f13 + (f15 / 2.0f)));
                Double.isNaN(d20);
                Double.isNaN(d19);
                motionWidget.setRotationZ((float) (d19 + d20 + degrees2));
            }
        }
        float f28 = f8 + 0.5f;
        float f29 = f9 + 0.5f;
        motionWidget.layout((int) f28, (int) f29, (int) (f28 + f10), (int) (f29 + f6));
    }

    public void setupRelative(Motion motion, MotionPaths motionPaths) {
        double d5 = ((this.f45x + (this.width / 2.0f)) - motionPaths.f45x) - (motionPaths.width / 2.0f);
        double d6 = ((this.f46y + (this.height / 2.0f)) - motionPaths.f46y) - (motionPaths.height / 2.0f);
        this.mRelativeToController = motion;
        this.f45x = (float) Math.hypot(d6, d5);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.f46y = (float) (Math.atan2(d6, d5) + 1.5707963267948966d);
        } else {
            this.f46y = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public MotionPaths(int i4, int i5, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = -1;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.customAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != -1) {
            initPolar(i4, i5, motionKeyPosition, motionPaths, motionPaths2);
            return;
        }
        int i6 = motionKeyPosition.mPositionType;
        if (i6 == 1) {
            initPath(motionKeyPosition, motionPaths, motionPaths2);
        } else if (i6 != 2) {
            initCartesian(motionKeyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i4, i5, motionKeyPosition, motionPaths, motionPaths2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getCenter(double d5, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f5;
        float f6 = this.f45x;
        float f7 = this.f46y;
        float f8 = this.width;
        float f9 = this.height;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            float f14 = (float) dArr[i4];
            float f15 = (float) dArr2[i4];
            int i5 = iArr[i4];
            if (i5 == 1) {
                f6 = f14;
                f10 = f15;
            } else if (i5 == 2) {
                f7 = f14;
                f12 = f15;
            } else if (i5 == 3) {
                f8 = f14;
                f11 = f15;
            } else if (i5 == 4) {
                f9 = f14;
                f13 = f15;
            }
        }
        float f16 = 2.0f;
        float f17 = (f11 / 2.0f) + f10;
        float f18 = (f13 / 2.0f) + f12;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.getCenter(d5, fArr3, fArr4);
            float f19 = fArr3[0];
            float f20 = fArr3[1];
            float f21 = fArr4[0];
            float f22 = fArr4[1];
            double d6 = f19;
            double d7 = f6;
            double d8 = f7;
            double sin = Math.sin(d8);
            Double.isNaN(d7);
            Double.isNaN(d6);
            double d9 = d6 + (sin * d7);
            f5 = f8;
            double d10 = f8 / 2.0f;
            Double.isNaN(d10);
            float f23 = (float) (d9 - d10);
            double d11 = f20;
            double cos = Math.cos(d8);
            Double.isNaN(d7);
            Double.isNaN(d11);
            double d12 = d11 - (d7 * cos);
            double d13 = f9 / 2.0f;
            Double.isNaN(d13);
            double d14 = f21;
            double d15 = f10;
            double sin2 = Math.sin(d8);
            Double.isNaN(d15);
            Double.isNaN(d14);
            double d16 = d14 + (sin2 * d15);
            double cos2 = Math.cos(d8);
            double d17 = f12;
            Double.isNaN(d17);
            float f24 = (float) (d16 + (cos2 * d17));
            double d18 = f22;
            double cos3 = Math.cos(d8);
            Double.isNaN(d15);
            Double.isNaN(d18);
            double sin3 = Math.sin(d8);
            Double.isNaN(d17);
            f18 = (float) ((d18 - (d15 * cos3)) + (sin3 * d17));
            f17 = f24;
            f6 = f23;
            f7 = (float) (d12 - d13);
            f16 = 2.0f;
        } else {
            f5 = f8;
        }
        fArr[0] = f6 + (f5 / f16) + 0.0f;
        fArr[1] = f7 + (f9 / f16) + 0.0f;
        fArr2[0] = f17;
        fArr2[1] = f18;
    }
}

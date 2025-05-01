package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.Arrays;
import java.util.LinkedHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    static final int PERPENDICULAR = 1;
    static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] names = {"position", "x", "y", "width", "height", "pathRotate"};
    LinkedHashMap<String, ConstraintAttribute> attributes;
    float height;
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mRelativeAngle;
    MotionController mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;

    /* renamed from: x  reason: collision with root package name */
    float f68x;

    /* renamed from: y  reason: collision with root package name */
    float f69y;
    int mDrawPath = 0;
    float mPathRotate = Float.NaN;
    float mProgress = Float.NaN;

    public MotionPaths() {
        int i4 = Key.UNSET;
        this.mPathMotionArc = i4;
        this.mAnimateRelativeTo = i4;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float a5, float b5) {
        return (Float.isNaN(a5) || Float.isNaN(b5)) ? Float.isNaN(a5) != Float.isNaN(b5) : Math.abs(a5 - b5) > 1.0E-6f;
    }

    private static final float xRotate(float sin, float cos, float cx, float cy, float x4, float y2) {
        return (((x4 - cx) * cos) - ((y2 - cy) * sin)) + cx;
    }

    private static final float yRotate(float sin, float cos, float cx, float cy, float x4, float y2) {
        return ((x4 - cx) * sin) + ((y2 - cy) * cos) + cy;
    }

    public void applyParameters(ConstraintSet.Constraint c5) {
        this.mKeyFrameEasing = Easing.getInterpolator(c5.motion.mTransitionEasing);
        ConstraintSet.Motion motion = c5.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = c5.propertySet.mProgress;
        this.mRelativeAngle = c5.layout.circleAngle;
        for (String str : c5.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = c5.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.attributes.put(str, constraintAttribute);
            }
        }
    }

    public void configureRelativeTo(MotionController toOrbit) {
        toOrbit.getPos(this.mProgress);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void different(MotionPaths points, boolean[] mask, String[] custom, boolean arcMode) {
        boolean diff = diff(this.f68x, points.f68x);
        boolean diff2 = diff(this.f69y, points.f69y);
        mask[0] = mask[0] | diff(this.position, points.position);
        boolean z4 = diff | diff2 | arcMode;
        mask[1] = mask[1] | z4;
        mask[2] = z4 | mask[2];
        mask[3] = mask[3] | diff(this.width, points.width);
        mask[4] = diff(this.height, points.height) | mask[4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void fillStandard(double[] data, int[] toUse) {
        float[] fArr = {this.position, this.f68x, this.f69y, this.width, this.height, this.mPathRotate};
        int i4 = 0;
        for (int i5 = 0; i5 < toUse.length; i5++) {
            if (toUse[i5] < 6) {
                data[i4] = fArr[toUse[i5]];
                i4++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getBounds(int[] toUse, double[] data, float[] point, int offset) {
        float f5 = this.width;
        float f6 = this.height;
        for (int i4 = 0; i4 < toUse.length; i4++) {
            float f7 = (float) data[i4];
            int i5 = toUse[i4];
            if (i5 == 3) {
                f5 = f7;
            } else if (i5 == 4) {
                f6 = f7;
            }
        }
        point[offset] = f5;
        point[offset + 1] = f6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getCenter(double p4, int[] toUse, double[] data, float[] point, int offset) {
        float f5 = this.f68x;
        float f6 = this.f69y;
        float f7 = this.width;
        float f8 = this.height;
        for (int i4 = 0; i4 < toUse.length; i4++) {
            float f9 = (float) data[i4];
            int i5 = toUse[i4];
            if (i5 == 1) {
                f5 = f9;
            } else if (i5 == 2) {
                f6 = f9;
            } else if (i5 == 3) {
                f7 = f9;
            } else if (i5 == 4) {
                f8 = f9;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            motionController.getCenter(p4, fArr, new float[2]);
            float f10 = fArr[0];
            float f11 = fArr[1];
            double d5 = f10;
            double d6 = f5;
            double d7 = f6;
            double sin = Math.sin(d7);
            Double.isNaN(d6);
            Double.isNaN(d5);
            double d8 = d5 + (sin * d6);
            double d9 = f7 / 2.0f;
            Double.isNaN(d9);
            float f12 = (float) (d8 - d9);
            double d10 = f11;
            double cos = Math.cos(d7);
            Double.isNaN(d6);
            Double.isNaN(d10);
            double d11 = d10 - (d6 * cos);
            double d12 = f8 / 2.0f;
            Double.isNaN(d12);
            f5 = f12;
            f6 = (float) (d11 - d12);
        }
        point[offset] = f5 + (f7 / 2.0f) + 0.0f;
        point[offset + 1] = f6 + (f8 / 2.0f) + 0.0f;
    }

    void getCenterVelocity(double p4, int[] toUse, double[] data, float[] point, int offset) {
        float f5 = this.f68x;
        float f6 = this.f69y;
        float f7 = this.width;
        float f8 = this.height;
        for (int i4 = 0; i4 < toUse.length; i4++) {
            float f9 = (float) data[i4];
            int i5 = toUse[i4];
            if (i5 == 1) {
                f5 = f9;
            } else if (i5 == 2) {
                f6 = f9;
            } else if (i5 == 3) {
                f7 = f9;
            } else if (i5 == 4) {
                f8 = f9;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            motionController.getCenter(p4, fArr, new float[2]);
            float f10 = fArr[0];
            float f11 = fArr[1];
            double d5 = f10;
            double d6 = f5;
            double d7 = f6;
            double sin = Math.sin(d7);
            Double.isNaN(d6);
            Double.isNaN(d5);
            double d8 = d5 + (sin * d6);
            double d9 = f7 / 2.0f;
            Double.isNaN(d9);
            float f12 = (float) (d8 - d9);
            double d10 = f11;
            double cos = Math.cos(d7);
            Double.isNaN(d6);
            Double.isNaN(d10);
            double d11 = d10 - (d6 * cos);
            double d12 = f8 / 2.0f;
            Double.isNaN(d12);
            f5 = f12;
            f6 = (float) (d11 - d12);
        }
        point[offset] = f5 + (f7 / 2.0f) + 0.0f;
        point[offset + 1] = f6 + (f8 / 2.0f) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCustomData(String name, double[] value, int offset) {
        ConstraintAttribute constraintAttribute = this.attributes.get(name);
        int i4 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            value[offset] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        float[] fArr = new float[numberOfInterpolatedValues];
        constraintAttribute.getValuesToInterpolate(fArr);
        while (i4 < numberOfInterpolatedValues) {
            value[offset] = fArr[i4];
            i4++;
            offset++;
        }
        return numberOfInterpolatedValues;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCustomDataCount(String name) {
        ConstraintAttribute constraintAttribute = this.attributes.get(name);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.numberOfInterpolatedValues();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getRect(int[] toUse, double[] data, float[] path, int offset) {
        float f5 = this.f68x;
        float f6 = this.f69y;
        float f7 = this.width;
        float f8 = this.height;
        for (int i4 = 0; i4 < toUse.length; i4++) {
            float f9 = (float) data[i4];
            int i5 = toUse[i4];
            if (i5 == 1) {
                f5 = f9;
            } else if (i5 == 2) {
                f6 = f9;
            } else if (i5 == 3) {
                f7 = f9;
            } else if (i5 == 4) {
                f8 = f9;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
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
        int i6 = offset + 1;
        path[offset] = f5 + 0.0f;
        int i7 = i6 + 1;
        path[i6] = f6 + 0.0f;
        int i8 = i7 + 1;
        path[i7] = f10 + 0.0f;
        int i9 = i8 + 1;
        path[i8] = f6 + 0.0f;
        int i10 = i9 + 1;
        path[i9] = f10 + 0.0f;
        int i11 = i10 + 1;
        path[i10] = f11 + 0.0f;
        path[i11] = f5 + 0.0f;
        path[i11 + 1] = f11 + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasCustomData(String name) {
        return this.attributes.containsKey(name);
    }

    void initCartesian(KeyPosition c5, MotionPaths startTimePoint, MotionPaths endTimePoint) {
        float f5 = c5.mFramePosition / 100.0f;
        this.time = f5;
        this.mDrawPath = c5.mDrawPath;
        float f6 = Float.isNaN(c5.mPercentWidth) ? f5 : c5.mPercentWidth;
        float f7 = Float.isNaN(c5.mPercentHeight) ? f5 : c5.mPercentHeight;
        float f8 = endTimePoint.width;
        float f9 = startTimePoint.width;
        float f10 = endTimePoint.height;
        float f11 = startTimePoint.height;
        this.position = this.time;
        float f12 = startTimePoint.f68x;
        float f13 = startTimePoint.f69y;
        float f14 = (endTimePoint.f68x + (f8 / 2.0f)) - ((f9 / 2.0f) + f12);
        float f15 = (endTimePoint.f69y + (f10 / 2.0f)) - (f13 + (f11 / 2.0f));
        float f16 = (f8 - f9) * f6;
        float f17 = f16 / 2.0f;
        this.f68x = (int) ((f12 + (f14 * f5)) - f17);
        float f18 = (f10 - f11) * f7;
        float f19 = f18 / 2.0f;
        this.f69y = (int) ((f13 + (f15 * f5)) - f19);
        this.width = (int) (f9 + f16);
        this.height = (int) (f11 + f18);
        float f20 = Float.isNaN(c5.mPercentX) ? f5 : c5.mPercentX;
        float f21 = Float.isNaN(c5.mAltPercentY) ? 0.0f : c5.mAltPercentY;
        if (!Float.isNaN(c5.mPercentY)) {
            f5 = c5.mPercentY;
        }
        float f22 = Float.isNaN(c5.mAltPercentX) ? 0.0f : c5.mAltPercentX;
        this.mMode = 0;
        this.f68x = (int) (((startTimePoint.f68x + (f20 * f14)) + (f22 * f15)) - f17);
        this.f69y = (int) (((startTimePoint.f69y + (f14 * f21)) + (f15 * f5)) - f19);
        this.mKeyFrameEasing = Easing.getInterpolator(c5.mTransitionEasing);
        this.mPathMotionArc = c5.mPathMotionArc;
    }

    void initPath(KeyPosition c5, MotionPaths startTimePoint, MotionPaths endTimePoint) {
        float f5;
        float f6;
        float f7 = c5.mFramePosition / 100.0f;
        this.time = f7;
        this.mDrawPath = c5.mDrawPath;
        float f8 = Float.isNaN(c5.mPercentWidth) ? f7 : c5.mPercentWidth;
        float f9 = Float.isNaN(c5.mPercentHeight) ? f7 : c5.mPercentHeight;
        float f10 = endTimePoint.width - startTimePoint.width;
        float f11 = endTimePoint.height - startTimePoint.height;
        this.position = this.time;
        if (!Float.isNaN(c5.mPercentX)) {
            f7 = c5.mPercentX;
        }
        float f12 = startTimePoint.f68x;
        float f13 = startTimePoint.width;
        float f14 = startTimePoint.f69y;
        float f15 = startTimePoint.height;
        float f16 = (endTimePoint.f68x + (endTimePoint.width / 2.0f)) - ((f13 / 2.0f) + f12);
        float f17 = (endTimePoint.f69y + (endTimePoint.height / 2.0f)) - ((f15 / 2.0f) + f14);
        float f18 = f16 * f7;
        float f19 = (f10 * f8) / 2.0f;
        this.f68x = (int) ((f12 + f18) - f19);
        float f20 = f7 * f17;
        float f21 = (f11 * f9) / 2.0f;
        this.f69y = (int) ((f14 + f20) - f21);
        this.width = (int) (f13 + f5);
        this.height = (int) (f15 + f6);
        float f22 = Float.isNaN(c5.mPercentY) ? 0.0f : c5.mPercentY;
        this.mMode = 1;
        float f23 = (int) ((startTimePoint.f68x + f18) - f19);
        this.f68x = f23;
        float f24 = (int) ((startTimePoint.f69y + f20) - f21);
        this.f69y = f24;
        this.f68x = f23 + ((-f17) * f22);
        this.f69y = f24 + (f16 * f22);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(c5.mTransitionEasing);
        this.mPathMotionArc = c5.mPathMotionArc;
    }

    void initPolar(int parentWidth, int parentHeight, KeyPosition c5, MotionPaths s4, MotionPaths e5) {
        float min;
        float f5;
        float f6 = c5.mFramePosition / 100.0f;
        this.time = f6;
        this.mDrawPath = c5.mDrawPath;
        this.mMode = c5.mPositionType;
        float f7 = Float.isNaN(c5.mPercentWidth) ? f6 : c5.mPercentWidth;
        float f8 = Float.isNaN(c5.mPercentHeight) ? f6 : c5.mPercentHeight;
        float f9 = e5.width;
        float f10 = s4.width;
        float f11 = e5.height;
        float f12 = s4.height;
        this.position = this.time;
        this.width = (int) (f10 + ((f9 - f10) * f7));
        this.height = (int) (f12 + ((f11 - f12) * f8));
        int i4 = c5.mPositionType;
        if (i4 == 1) {
            float f13 = Float.isNaN(c5.mPercentX) ? f6 : c5.mPercentX;
            float f14 = e5.f68x;
            float f15 = s4.f68x;
            this.f68x = (f13 * (f14 - f15)) + f15;
            if (!Float.isNaN(c5.mPercentY)) {
                f6 = c5.mPercentY;
            }
            float f16 = e5.f69y;
            float f17 = s4.f69y;
            this.f69y = (f6 * (f16 - f17)) + f17;
        } else if (i4 != 2) {
            float f18 = Float.isNaN(c5.mPercentX) ? f6 : c5.mPercentX;
            float f19 = e5.f68x;
            float f20 = s4.f68x;
            this.f68x = (f18 * (f19 - f20)) + f20;
            if (!Float.isNaN(c5.mPercentY)) {
                f6 = c5.mPercentY;
            }
            float f21 = e5.f69y;
            float f22 = s4.f69y;
            this.f69y = (f6 * (f21 - f22)) + f22;
        } else {
            if (Float.isNaN(c5.mPercentX)) {
                float f23 = e5.f68x;
                float f24 = s4.f68x;
                min = ((f23 - f24) * f6) + f24;
            } else {
                min = Math.min(f8, f7) * c5.mPercentX;
            }
            this.f68x = min;
            if (Float.isNaN(c5.mPercentY)) {
                float f25 = e5.f69y;
                float f26 = s4.f69y;
                f5 = (f6 * (f25 - f26)) + f26;
            } else {
                f5 = c5.mPercentY;
            }
            this.f69y = f5;
        }
        this.mAnimateRelativeTo = s4.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(c5.mTransitionEasing);
        this.mPathMotionArc = c5.mPathMotionArc;
    }

    void initScreen(int parentWidth, int parentHeight, KeyPosition c5, MotionPaths startTimePoint, MotionPaths endTimePoint) {
        float f5 = c5.mFramePosition / 100.0f;
        this.time = f5;
        this.mDrawPath = c5.mDrawPath;
        float f6 = Float.isNaN(c5.mPercentWidth) ? f5 : c5.mPercentWidth;
        float f7 = Float.isNaN(c5.mPercentHeight) ? f5 : c5.mPercentHeight;
        float f8 = endTimePoint.width;
        float f9 = startTimePoint.width;
        float f10 = endTimePoint.height;
        float f11 = startTimePoint.height;
        this.position = this.time;
        float f12 = startTimePoint.f68x;
        float f13 = startTimePoint.f69y;
        float f14 = endTimePoint.f68x + (f8 / 2.0f);
        float f15 = endTimePoint.f69y + (f10 / 2.0f);
        float f16 = (f8 - f9) * f6;
        this.f68x = (int) ((f12 + ((f14 - ((f9 / 2.0f) + f12)) * f5)) - (f16 / 2.0f));
        float f17 = (f10 - f11) * f7;
        this.f69y = (int) ((f13 + ((f15 - (f13 + (f11 / 2.0f))) * f5)) - (f17 / 2.0f));
        this.width = (int) (f9 + f16);
        this.height = (int) (f11 + f17);
        this.mMode = 2;
        if (!Float.isNaN(c5.mPercentX)) {
            this.f68x = (int) (c5.mPercentX * ((int) (parentWidth - this.width)));
        }
        if (!Float.isNaN(c5.mPercentY)) {
            this.f69y = (int) (c5.mPercentY * ((int) (parentHeight - this.height)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(c5.mTransitionEasing);
        this.mPathMotionArc = c5.mPathMotionArc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBounds(float x4, float y2, float w4, float h4) {
        this.f68x = x4;
        this.f69y = y2;
        this.width = w4;
        this.height = h4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDpDt(float locationX, float locationY, float[] mAnchorDpDt, int[] toUse, double[] deltaData, double[] data) {
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        for (int i4 = 0; i4 < toUse.length; i4++) {
            float f9 = (float) deltaData[i4];
            double d5 = data[i4];
            int i5 = toUse[i4];
            if (i5 == 1) {
                f5 = f9;
            } else if (i5 == 2) {
                f7 = f9;
            } else if (i5 == 3) {
                f6 = f9;
            } else if (i5 == 4) {
                f8 = f9;
            }
        }
        float f10 = f5 - ((0.0f * f6) / 2.0f);
        float f11 = f7 - ((0.0f * f8) / 2.0f);
        mAnchorDpDt[0] = (f10 * (1.0f - locationX)) + (((f6 * 1.0f) + f10) * locationX) + 0.0f;
        mAnchorDpDt[1] = (f11 * (1.0f - locationY)) + (((f8 * 1.0f) + f11) * locationY) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setView(float position, View view, int[] toUse, double[] data, double[] slope, double[] cycle, boolean mForceMeasure) {
        float f5;
        boolean z4;
        float f6;
        float f7 = this.f68x;
        float f8 = this.f69y;
        float f9 = this.width;
        float f10 = this.height;
        if (toUse.length != 0 && this.mTempValue.length <= toUse[toUse.length - 1]) {
            int i4 = toUse[toUse.length - 1] + 1;
            this.mTempValue = new double[i4];
            this.mTempDelta = new double[i4];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i5 = 0; i5 < toUse.length; i5++) {
            this.mTempValue[toUse[i5]] = data[i5];
            this.mTempDelta[toUse[i5]] = slope[i5];
        }
        float f11 = Float.NaN;
        int i6 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (true) {
            double[] dArr = this.mTempValue;
            if (i6 >= dArr.length) {
                break;
            }
            if (Double.isNaN(dArr[i6]) && (cycle == null || cycle[i6] == 0.0d)) {
                f6 = f11;
            } else {
                double d5 = cycle != null ? cycle[i6] : 0.0d;
                if (!Double.isNaN(this.mTempValue[i6])) {
                    d5 = this.mTempValue[i6] + d5;
                }
                f6 = f11;
                float f16 = (float) d5;
                float f17 = (float) this.mTempDelta[i6];
                if (i6 == 1) {
                    f11 = f6;
                    f12 = f17;
                    f7 = f16;
                } else if (i6 == 2) {
                    f11 = f6;
                    f13 = f17;
                    f8 = f16;
                } else if (i6 == 3) {
                    f11 = f6;
                    f14 = f17;
                    f9 = f16;
                } else if (i6 == 4) {
                    f11 = f6;
                    f15 = f17;
                    f10 = f16;
                } else if (i6 == 5) {
                    f11 = f16;
                }
                i6++;
            }
            f11 = f6;
            i6++;
        }
        float f18 = f11;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(position, fArr, fArr2);
            float f19 = fArr[0];
            float f20 = fArr[1];
            float f21 = fArr2[0];
            float f22 = fArr2[1];
            double d6 = f19;
            double d7 = f7;
            double d8 = f8;
            double sin = Math.sin(d8);
            Double.isNaN(d7);
            Double.isNaN(d6);
            double d9 = f9 / 2.0f;
            Double.isNaN(d9);
            float f23 = (float) ((d6 + (sin * d7)) - d9);
            double d10 = f20;
            double cos = Math.cos(d8);
            Double.isNaN(d7);
            Double.isNaN(d10);
            double d11 = d10 - (cos * d7);
            f5 = f10;
            double d12 = f10 / 2.0f;
            Double.isNaN(d12);
            float f24 = (float) (d11 - d12);
            double d13 = f21;
            double d14 = f12;
            double sin2 = Math.sin(d8);
            Double.isNaN(d14);
            Double.isNaN(d13);
            double d15 = d13 + (sin2 * d14);
            double cos2 = Math.cos(d8);
            Double.isNaN(d7);
            double d16 = f13;
            Double.isNaN(d16);
            float f25 = (float) (d15 + (cos2 * d7 * d16));
            double d17 = f22;
            double cos3 = Math.cos(d8);
            Double.isNaN(d14);
            Double.isNaN(d17);
            double sin3 = Math.sin(d8);
            Double.isNaN(d7);
            Double.isNaN(d16);
            float f26 = (float) ((d17 - (d14 * cos3)) + (d7 * sin3 * d16));
            if (slope.length >= 2) {
                z4 = false;
                slope[0] = f25;
                slope[1] = f26;
            } else {
                z4 = false;
            }
            if (!Float.isNaN(f18)) {
                double d18 = f18;
                double degrees = Math.toDegrees(Math.atan2(f26, f25));
                Double.isNaN(d18);
                view.setRotation((float) (d18 + degrees));
            }
            f7 = f23;
            f8 = f24;
        } else {
            f5 = f10;
            z4 = false;
            if (!Float.isNaN(f18)) {
                double d19 = 0.0f;
                double d20 = f18;
                double degrees2 = Math.toDegrees(Math.atan2(f13 + (f15 / 2.0f), f12 + (f14 / 2.0f)));
                Double.isNaN(d20);
                Double.isNaN(d19);
                view.setRotation((float) (d19 + d20 + degrees2));
            }
        }
        if (view instanceof FloatLayout) {
            ((FloatLayout) view).layout(f7, f8, f9 + f7, f8 + f5);
            return;
        }
        float f27 = f7 + 0.5f;
        int i7 = (int) f27;
        float f28 = f8 + 0.5f;
        int i8 = (int) f28;
        int i9 = (int) (f27 + f9);
        int i10 = (int) (f28 + f5);
        int i11 = i9 - i7;
        int i12 = i10 - i8;
        if (((i11 == view.getMeasuredWidth() && i12 == view.getMeasuredHeight()) ? true : true) || mForceMeasure) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        }
        view.layout(i7, i8, i9, i10);
    }

    public void setupRelative(MotionController mc, MotionPaths relative) {
        double d5 = ((this.f68x + (this.width / 2.0f)) - relative.f68x) - (relative.width / 2.0f);
        double d6 = ((this.f69y + (this.height / 2.0f)) - relative.f69y) - (relative.height / 2.0f);
        this.mRelativeToController = mc;
        this.f68x = (float) Math.hypot(d6, d5);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.f69y = (float) (Math.atan2(d6, d5) + 1.5707963267948966d);
        } else {
            this.f69y = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull MotionPaths o4) {
        return Float.compare(this.position, o4.position);
    }

    public MotionPaths(int parentWidth, int parentHeight, KeyPosition c5, MotionPaths startTimePoint, MotionPaths endTimePoint) {
        int i4 = Key.UNSET;
        this.mPathMotionArc = i4;
        this.mAnimateRelativeTo = i4;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (startTimePoint.mAnimateRelativeTo != Key.UNSET) {
            initPolar(parentWidth, parentHeight, c5, startTimePoint, endTimePoint);
            return;
        }
        int i5 = c5.mPositionType;
        if (i5 == 1) {
            initPath(c5, startTimePoint, endTimePoint);
        } else if (i5 != 2) {
            initCartesian(c5, startTimePoint, endTimePoint);
        } else {
            initScreen(parentWidth, parentHeight, c5, startTimePoint, endTimePoint);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getCenter(double p4, int[] toUse, double[] data, float[] point, double[] vdata, float[] velocity) {
        float f5;
        float f6 = this.f68x;
        float f7 = this.f69y;
        float f8 = this.width;
        float f9 = this.height;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i4 = 0; i4 < toUse.length; i4++) {
            float f14 = (float) data[i4];
            float f15 = (float) vdata[i4];
            int i5 = toUse[i4];
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
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(p4, fArr, fArr2);
            float f19 = fArr[0];
            float f20 = fArr[1];
            float f21 = fArr2[0];
            float f22 = fArr2[1];
            double d5 = f19;
            double d6 = f6;
            double d7 = f7;
            double sin = Math.sin(d7);
            Double.isNaN(d6);
            Double.isNaN(d5);
            double d8 = d5 + (sin * d6);
            f5 = f8;
            double d9 = f8 / 2.0f;
            Double.isNaN(d9);
            float f23 = (float) (d8 - d9);
            double d10 = f20;
            double cos = Math.cos(d7);
            Double.isNaN(d6);
            Double.isNaN(d10);
            double d11 = d10 - (d6 * cos);
            double d12 = f9 / 2.0f;
            Double.isNaN(d12);
            double d13 = f21;
            double d14 = f10;
            double sin2 = Math.sin(d7);
            Double.isNaN(d14);
            Double.isNaN(d13);
            double d15 = d13 + (sin2 * d14);
            double cos2 = Math.cos(d7);
            double d16 = f12;
            Double.isNaN(d16);
            float f24 = (float) (d15 + (cos2 * d16));
            double d17 = f22;
            double cos3 = Math.cos(d7);
            Double.isNaN(d14);
            Double.isNaN(d17);
            double sin3 = Math.sin(d7);
            Double.isNaN(d16);
            f18 = (float) ((d17 - (d14 * cos3)) + (sin3 * d16));
            f17 = f24;
            f6 = f23;
            f7 = (float) (d11 - d12);
            f16 = 2.0f;
        } else {
            f5 = f8;
        }
        point[0] = f6 + (f5 / f16) + 0.0f;
        point[1] = f7 + (f9 / f16) + 0.0f;
        velocity[0] = f17;
        velocity[1] = f18;
    }
}

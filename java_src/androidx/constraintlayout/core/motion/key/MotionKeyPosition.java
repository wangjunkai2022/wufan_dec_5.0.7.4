package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.f;
import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes.dex */
public class MotionKeyPosition extends MotionKey {
    static final int KEY_TYPE = 2;
    static final String NAME = "KeyPosition";
    protected static final float SELECTION_SLOPE = 20.0f;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    public float mAltPercentX;
    public float mAltPercentY;
    private float mCalculatedPositionX;
    private float mCalculatedPositionY;
    public int mCurveFit;
    public int mDrawPath;
    public int mPathMotionArc;
    public float mPercentHeight;
    public float mPercentWidth;
    public float mPercentX;
    public float mPercentY;
    public int mPositionType;
    public String mTransitionEasing;

    public MotionKeyPosition() {
        int i4 = MotionKey.UNSET;
        this.mCurveFit = i4;
        this.mTransitionEasing = null;
        this.mPathMotionArc = i4;
        this.mDrawPath = 0;
        this.mPercentWidth = Float.NaN;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = Float.NaN;
        this.mPercentY = Float.NaN;
        this.mAltPercentX = Float.NaN;
        this.mAltPercentY = Float.NaN;
        this.mPositionType = 0;
        this.mCalculatedPositionX = Float.NaN;
        this.mCalculatedPositionY = Float.NaN;
        this.mType = 2;
    }

    private void calcCartesianPosition(float f5, float f6, float f7, float f8) {
        float f9 = f7 - f5;
        float f10 = f8 - f6;
        float f11 = Float.isNaN(this.mPercentX) ? 0.0f : this.mPercentX;
        float f12 = Float.isNaN(this.mAltPercentY) ? 0.0f : this.mAltPercentY;
        float f13 = Float.isNaN(this.mPercentY) ? 0.0f : this.mPercentY;
        this.mCalculatedPositionX = (int) (f5 + (f11 * f9) + ((Float.isNaN(this.mAltPercentX) ? 0.0f : this.mAltPercentX) * f10));
        this.mCalculatedPositionY = (int) (f6 + (f9 * f12) + (f10 * f13));
    }

    private void calcPathPosition(float f5, float f6, float f7, float f8) {
        float f9 = f7 - f5;
        float f10 = f8 - f6;
        float f11 = this.mPercentX;
        float f12 = this.mPercentY;
        this.mCalculatedPositionX = f5 + (f9 * f11) + ((-f10) * f12);
        this.mCalculatedPositionY = f6 + (f10 * f11) + (f9 * f12);
    }

    private void calcScreenPosition(int i4, int i5) {
        float f5 = this.mPercentX;
        float f6 = 0;
        this.mCalculatedPositionX = ((i4 - 0) * f5) + f6;
        this.mCalculatedPositionY = ((i5 - 0) * f5) + f6;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
    }

    void calcPosition(int i4, int i5, float f5, float f6, float f7, float f8) {
        int i6 = this.mPositionType;
        if (i6 == 1) {
            calcPathPosition(f5, f6, f7, f8);
        } else if (i6 != 2) {
            calcCartesianPosition(f5, f6, f7, f8);
        } else {
            calcScreenPosition(i4, i5);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey copy(MotionKey motionKey) {
        super.copy(motionKey);
        MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
        this.mTransitionEasing = motionKeyPosition.mTransitionEasing;
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mPercentWidth = motionKeyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = motionKeyPosition.mPercentX;
        this.mPercentY = motionKeyPosition.mPercentY;
        this.mAltPercentX = motionKeyPosition.mAltPercentX;
        this.mAltPercentY = motionKeyPosition.mAltPercentY;
        this.mCalculatedPositionX = motionKeyPosition.mCalculatedPositionX;
        this.mCalculatedPositionY = motionKeyPosition.mCalculatedPositionY;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return f.a(str);
    }

    float getPositionX() {
        return this.mCalculatedPositionX;
    }

    float getPositionY() {
        return this.mCalculatedPositionY;
    }

    public boolean intersects(int i4, int i5, FloatRect floatRect, FloatRect floatRect2, float f5, float f6) {
        calcPosition(i4, i5, floatRect.centerX(), floatRect.centerY(), floatRect2.centerX(), floatRect2.centerY());
        return Math.abs(f5 - this.mCalculatedPositionX) < SELECTION_SLOPE && Math.abs(f6 - this.mCalculatedPositionY) < SELECTION_SLOPE;
    }

    public void positionAttributes(MotionWidget motionWidget, FloatRect floatRect, FloatRect floatRect2, float f5, float f6, String[] strArr, float[] fArr) {
        int i4 = this.mPositionType;
        if (i4 == 1) {
            positionPathAttributes(floatRect, floatRect2, f5, f6, strArr, fArr);
        } else if (i4 != 2) {
            positionCartAttributes(floatRect, floatRect2, f5, f6, strArr, fArr);
        } else {
            positionScreenAttributes(motionWidget, floatRect, floatRect2, f5, f6, strArr, fArr);
        }
    }

    void positionCartAttributes(FloatRect floatRect, FloatRect floatRect2, float f5, float f6, String[] strArr, float[] fArr) {
        float centerX = floatRect.centerX();
        float centerY = floatRect.centerY();
        float centerX2 = floatRect2.centerX() - centerX;
        float centerY2 = floatRect2.centerY() - centerY;
        if (strArr[0] != null) {
            if ("percentX".equals(strArr[0])) {
                fArr[0] = (f5 - centerX) / centerX2;
                fArr[1] = (f6 - centerY) / centerY2;
                return;
            }
            fArr[1] = (f5 - centerX) / centerX2;
            fArr[0] = (f6 - centerY) / centerY2;
            return;
        }
        strArr[0] = "percentX";
        fArr[0] = (f5 - centerX) / centerX2;
        strArr[1] = "percentY";
        fArr[1] = (f6 - centerY) / centerY2;
    }

    void positionPathAttributes(FloatRect floatRect, FloatRect floatRect2, float f5, float f6, String[] strArr, float[] fArr) {
        float centerX = floatRect.centerX();
        float centerY = floatRect.centerY();
        float centerX2 = floatRect2.centerX() - centerX;
        float centerY2 = floatRect2.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f7 = centerX2 / hypot;
        float f8 = centerY2 / hypot;
        float f9 = f6 - centerY;
        float f10 = f5 - centerX;
        float f11 = ((f7 * f9) - (f10 * f8)) / hypot;
        float f12 = ((f7 * f10) + (f8 * f9)) / hypot;
        if (strArr[0] != null) {
            if ("percentX".equals(strArr[0])) {
                fArr[0] = f12;
                fArr[1] = f11;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f12;
        fArr[1] = f11;
    }

    void positionScreenAttributes(MotionWidget motionWidget, FloatRect floatRect, FloatRect floatRect2, float f5, float f6, String[] strArr, float[] fArr) {
        floatRect.centerX();
        floatRect.centerY();
        floatRect2.centerX();
        floatRect2.centerY();
        MotionWidget parent = motionWidget.getParent();
        int width = parent.getWidth();
        int height = parent.getHeight();
        if (strArr[0] != null) {
            if ("percentX".equals(strArr[0])) {
                fArr[0] = f5 / width;
                fArr[1] = f6 / height;
                return;
            }
            fArr[1] = f5 / width;
            fArr[0] = f6 / height;
            return;
        }
        strArr[0] = "percentX";
        fArr[0] = f5 / width;
        strArr[1] = "percentY";
        fArr[1] = f6 / height;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i4, int i5) {
        if (i4 == 100) {
            this.mFramePosition = i5;
            return true;
        } else if (i4 == 508) {
            this.mCurveFit = i5;
            return true;
        } else if (i4 != 510) {
            return super.setValue(i4, i5);
        } else {
            this.mPositionType = i5;
            return true;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public MotionKey mo3clone() {
        return new MotionKeyPosition().copy(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i4, float f5) {
        switch (i4) {
            case TypedValues.PositionType.TYPE_PERCENT_WIDTH /* 503 */:
                this.mPercentWidth = f5;
                return true;
            case TypedValues.PositionType.TYPE_PERCENT_HEIGHT /* 504 */:
                this.mPercentHeight = f5;
                return true;
            case TypedValues.PositionType.TYPE_SIZE_PERCENT /* 505 */:
                this.mPercentWidth = f5;
                this.mPercentHeight = f5;
                return true;
            case TypedValues.PositionType.TYPE_PERCENT_X /* 506 */:
                this.mPercentX = f5;
                return true;
            case TypedValues.PositionType.TYPE_PERCENT_Y /* 507 */:
                this.mPercentY = f5;
                return true;
            default:
                return super.setValue(i4, f5);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i4, String str) {
        if (i4 != 501) {
            return super.setValue(i4, str);
        }
        this.mTransitionEasing = str.toString();
        return true;
    }
}

package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;
/* loaded from: classes.dex */
public class KeyPosition extends KeyPositionBase {
    public static final String DRAWPATH = "drawPath";
    static final int KEY_TYPE = 2;
    static final String NAME = "KeyPosition";
    public static final String PERCENT_HEIGHT = "percentHeight";
    public static final String PERCENT_WIDTH = "percentWidth";
    public static final String PERCENT_X = "percentX";
    public static final String PERCENT_Y = "percentY";
    public static final String SIZE_PERCENT = "sizePercent";
    private static final String TAG = "KeyPosition";
    public static final String TRANSITION_EASING = "transitionEasing";
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    String mTransitionEasing = null;
    int mPathMotionArc = Key.UNSET;
    int mDrawPath = 0;
    float mPercentWidth = Float.NaN;
    float mPercentHeight = Float.NaN;
    float mPercentX = Float.NaN;
    float mPercentY = Float.NaN;
    float mAltPercentX = Float.NaN;
    float mAltPercentY = Float.NaN;
    int mPositionType = 0;
    private float mCalculatedPositionX = Float.NaN;
    private float mCalculatedPositionY = Float.NaN;

    /* loaded from: classes.dex */
    private static class Loader {
        private static final int CURVE_FIT = 4;
        private static final int DRAW_PATH = 5;
        private static final int FRAME_POSITION = 2;
        private static final int PATH_MOTION_ARC = 10;
        private static final int PERCENT_HEIGHT = 12;
        private static final int PERCENT_WIDTH = 11;
        private static final int PERCENT_X = 6;
        private static final int PERCENT_Y = 7;
        private static final int SIZE_PERCENT = 8;
        private static final int TARGET_ID = 1;
        private static final int TRANSITION_EASING = 3;
        private static final int TYPE = 9;
        private static SparseIntArray mAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyPosition_motionTarget, 1);
            mAttrMap.append(R.styleable.KeyPosition_framePosition, 2);
            mAttrMap.append(R.styleable.KeyPosition_transitionEasing, 3);
            mAttrMap.append(R.styleable.KeyPosition_curveFit, 4);
            mAttrMap.append(R.styleable.KeyPosition_drawPath, 5);
            mAttrMap.append(R.styleable.KeyPosition_percentX, 6);
            mAttrMap.append(R.styleable.KeyPosition_percentY, 7);
            mAttrMap.append(R.styleable.KeyPosition_keyPositionType, 9);
            mAttrMap.append(R.styleable.KeyPosition_sizePercent, 8);
            mAttrMap.append(R.styleable.KeyPosition_percentWidth, 11);
            mAttrMap.append(R.styleable.KeyPosition_percentHeight, 12);
            mAttrMap.append(R.styleable.KeyPosition_pathMotionArc, 10);
        }

        private Loader() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void read(KeyPosition c5, TypedArray a5) {
            int indexCount = a5.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = a5.getIndex(i4);
                switch (mAttrMap.get(index)) {
                    case 1:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = a5.getResourceId(index, c5.mTargetId);
                            c5.mTargetId = resourceId;
                            if (resourceId == -1) {
                                c5.mTargetString = a5.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (a5.peekValue(index).type == 3) {
                            c5.mTargetString = a5.getString(index);
                            break;
                        } else {
                            c5.mTargetId = a5.getResourceId(index, c5.mTargetId);
                            break;
                        }
                    case 2:
                        c5.mFramePosition = a5.getInt(index, c5.mFramePosition);
                        break;
                    case 3:
                        if (a5.peekValue(index).type == 3) {
                            c5.mTransitionEasing = a5.getString(index);
                            break;
                        } else {
                            c5.mTransitionEasing = Easing.NAMED_EASING[a5.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        c5.mCurveFit = a5.getInteger(index, c5.mCurveFit);
                        break;
                    case 5:
                        c5.mDrawPath = a5.getInt(index, c5.mDrawPath);
                        break;
                    case 6:
                        c5.mPercentX = a5.getFloat(index, c5.mPercentX);
                        break;
                    case 7:
                        c5.mPercentY = a5.getFloat(index, c5.mPercentY);
                        break;
                    case 8:
                        float f5 = a5.getFloat(index, c5.mPercentHeight);
                        c5.mPercentWidth = f5;
                        c5.mPercentHeight = f5;
                        break;
                    case 9:
                        c5.mPositionType = a5.getInt(index, c5.mPositionType);
                        break;
                    case 10:
                        c5.mPathMotionArc = a5.getInt(index, c5.mPathMotionArc);
                        break;
                    case 11:
                        c5.mPercentWidth = a5.getFloat(index, c5.mPercentWidth);
                        break;
                    case 12:
                        c5.mPercentHeight = a5.getFloat(index, c5.mPercentHeight);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(mAttrMap.get(index));
                        break;
                }
            }
            int i5 = c5.mFramePosition;
        }
    }

    public KeyPosition() {
        this.mType = 2;
    }

    private void calcCartesianPosition(float start_x, float start_y, float end_x, float end_y) {
        float f5 = end_x - start_x;
        float f6 = end_y - start_y;
        float f7 = Float.isNaN(this.mPercentX) ? 0.0f : this.mPercentX;
        float f8 = Float.isNaN(this.mAltPercentY) ? 0.0f : this.mAltPercentY;
        float f9 = Float.isNaN(this.mPercentY) ? 0.0f : this.mPercentY;
        this.mCalculatedPositionX = (int) (start_x + (f7 * f5) + ((Float.isNaN(this.mAltPercentX) ? 0.0f : this.mAltPercentX) * f6));
        this.mCalculatedPositionY = (int) (start_y + (f5 * f8) + (f6 * f9));
    }

    private void calcPathPosition(float start_x, float start_y, float end_x, float end_y) {
        float f5 = end_x - start_x;
        float f6 = end_y - start_y;
        float f7 = this.mPercentX;
        float f8 = this.mPercentY;
        this.mCalculatedPositionX = start_x + (f5 * f7) + ((-f6) * f8);
        this.mCalculatedPositionY = start_y + (f6 * f7) + (f5 * f8);
    }

    private void calcScreenPosition(int layoutWidth, int layoutHeight) {
        float f5 = this.mPercentX;
        float f6 = 0;
        this.mCalculatedPositionX = ((layoutWidth - 0) * f5) + f6;
        this.mCalculatedPositionY = ((layoutHeight - 0) * f5) + f6;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> splines) {
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    void calcPosition(int layoutWidth, int layoutHeight, float start_x, float start_y, float end_x, float end_y) {
        int i4 = this.mPositionType;
        if (i4 == 1) {
            calcPathPosition(start_x, start_y, end_x, end_y);
        } else if (i4 != 2) {
            calcCartesianPosition(start_x, start_y, end_x, end_y);
        } else {
            calcScreenPosition(layoutWidth, layoutHeight);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key src) {
        super.copy(src);
        KeyPosition keyPosition = (KeyPosition) src;
        this.mTransitionEasing = keyPosition.mTransitionEasing;
        this.mPathMotionArc = keyPosition.mPathMotionArc;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mPercentWidth = keyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = keyPosition.mPercentX;
        this.mPercentY = keyPosition.mPercentY;
        this.mAltPercentX = keyPosition.mAltPercentX;
        this.mAltPercentY = keyPosition.mAltPercentY;
        this.mCalculatedPositionX = keyPosition.mCalculatedPositionX;
        this.mCalculatedPositionY = keyPosition.mCalculatedPositionY;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    float getPositionX() {
        return this.mCalculatedPositionX;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    float getPositionY() {
        return this.mCalculatedPositionY;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public boolean intersects(int layoutWidth, int layoutHeight, RectF start, RectF end, float x4, float y2) {
        calcPosition(layoutWidth, layoutHeight, start.centerX(), start.centerY(), end.centerX(), end.centerY());
        return Math.abs(x4 - this.mCalculatedPositionX) < 20.0f && Math.abs(y2 - this.mCalculatedPositionY) < 20.0f;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attrs) {
        Loader.read(this, context.obtainStyledAttributes(attrs, R.styleable.KeyPosition));
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public void positionAttributes(View view, RectF start, RectF end, float x4, float y2, String[] attribute, float[] value) {
        int i4 = this.mPositionType;
        if (i4 == 1) {
            positionPathAttributes(start, end, x4, y2, attribute, value);
        } else if (i4 != 2) {
            positionCartAttributes(start, end, x4, y2, attribute, value);
        } else {
            positionScreenAttributes(view, start, end, x4, y2, attribute, value);
        }
    }

    void positionCartAttributes(RectF start, RectF end, float x4, float y2, String[] attribute, float[] value) {
        float centerX = start.centerX();
        float centerY = start.centerY();
        float centerX2 = end.centerX() - centerX;
        float centerY2 = end.centerY() - centerY;
        if (attribute[0] != null) {
            if ("percentX".equals(attribute[0])) {
                value[0] = (x4 - centerX) / centerX2;
                value[1] = (y2 - centerY) / centerY2;
                return;
            }
            value[1] = (x4 - centerX) / centerX2;
            value[0] = (y2 - centerY) / centerY2;
            return;
        }
        attribute[0] = "percentX";
        value[0] = (x4 - centerX) / centerX2;
        attribute[1] = "percentY";
        value[1] = (y2 - centerY) / centerY2;
    }

    void positionPathAttributes(RectF start, RectF end, float x4, float y2, String[] attribute, float[] value) {
        float centerX = start.centerX();
        float centerY = start.centerY();
        float centerX2 = end.centerX() - centerX;
        float centerY2 = end.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            value[0] = 0.0f;
            value[1] = 0.0f;
            return;
        }
        float f5 = centerX2 / hypot;
        float f6 = centerY2 / hypot;
        float f7 = y2 - centerY;
        float f8 = x4 - centerX;
        float f9 = ((f5 * f7) - (f8 * f6)) / hypot;
        float f10 = ((f5 * f8) + (f6 * f7)) / hypot;
        if (attribute[0] != null) {
            if ("percentX".equals(attribute[0])) {
                value[0] = f10;
                value[1] = f9;
                return;
            }
            return;
        }
        attribute[0] = "percentX";
        attribute[1] = "percentY";
        value[0] = f10;
        value[1] = f9;
    }

    void positionScreenAttributes(View view, RectF start, RectF end, float x4, float y2, String[] attribute, float[] value) {
        start.centerX();
        start.centerY();
        end.centerX();
        end.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        if (attribute[0] != null) {
            if ("percentX".equals(attribute[0])) {
                value[0] = x4 / width;
                value[1] = y2 / height;
                return;
            }
            value[1] = x4 / width;
            value[0] = y2 / height;
            return;
        }
        attribute[0] = "percentX";
        value[0] = x4 / width;
        attribute[1] = "percentY";
        value[1] = y2 / height;
    }

    public void setType(int type) {
        this.mPositionType = type;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String tag, Object value) {
        tag.hashCode();
        char c5 = 65535;
        switch (tag.hashCode()) {
            case -1812823328:
                if (tag.equals("transitionEasing")) {
                    c5 = 0;
                    break;
                }
                break;
            case -1127236479:
                if (tag.equals("percentWidth")) {
                    c5 = 1;
                    break;
                }
                break;
            case -1017587252:
                if (tag.equals("percentHeight")) {
                    c5 = 2;
                    break;
                }
                break;
            case -827014263:
                if (tag.equals("drawPath")) {
                    c5 = 3;
                    break;
                }
                break;
            case -200259324:
                if (tag.equals("sizePercent")) {
                    c5 = 4;
                    break;
                }
                break;
            case 428090547:
                if (tag.equals("percentX")) {
                    c5 = 5;
                    break;
                }
                break;
            case 428090548:
                if (tag.equals("percentY")) {
                    c5 = 6;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                this.mTransitionEasing = value.toString();
                return;
            case 1:
                this.mPercentWidth = toFloat(value);
                return;
            case 2:
                this.mPercentHeight = toFloat(value);
                return;
            case 3:
                this.mDrawPath = toInt(value);
                return;
            case 4:
                float f5 = toFloat(value);
                this.mPercentWidth = f5;
                this.mPercentHeight = f5;
                return;
            case 5:
                this.mPercentX = toFloat(value);
                return;
            case 6:
                this.mPercentY = toFloat(value);
                return;
            default:
                return;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public Key mo4clone() {
        return new KeyPosition().copy(this);
    }
}

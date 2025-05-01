package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;
    private ConstraintWidget[] mDisplayedWidgets;
    private int mHorizontalStyle = -1;
    private int mVerticalStyle = -1;
    private int mFirstHorizontalStyle = -1;
    private int mFirstVerticalStyle = -1;
    private int mLastHorizontalStyle = -1;
    private int mLastVerticalStyle = -1;
    private float mHorizontalBias = 0.5f;
    private float mVerticalBias = 0.5f;
    private float mFirstHorizontalBias = 0.5f;
    private float mFirstVerticalBias = 0.5f;
    private float mLastHorizontalBias = 0.5f;
    private float mLastVerticalBias = 0.5f;
    private int mHorizontalGap = 0;
    private int mVerticalGap = 0;
    private int mHorizontalAlign = 2;
    private int mVerticalAlign = 2;
    private int mWrapMode = 0;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    private ArrayList<WidgetsList> mChainList = new ArrayList<>();
    private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private int[] mAlignedDimensions = null;
    private int mDisplayedWidgetsCount = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class WidgetsList {
        private ConstraintAnchor mBottom;
        private ConstraintAnchor mLeft;
        private int mMax;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private ConstraintAnchor mRight;
        private ConstraintAnchor mTop;
        private ConstraintWidget biggest = null;
        int biggestDimension = 0;
        private int mWidth = 0;
        private int mHeight = 0;
        private int mStartIndex = 0;
        private int mCount = 0;
        private int mNbMatchConstraintsWidgets = 0;

        public WidgetsList(int i4, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i5) {
            this.mOrientation = 0;
            this.mPaddingLeft = 0;
            this.mPaddingTop = 0;
            this.mPaddingRight = 0;
            this.mPaddingBottom = 0;
            this.mMax = 0;
            this.mOrientation = i4;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = Flow.this.getPaddingLeft();
            this.mPaddingTop = Flow.this.getPaddingTop();
            this.mPaddingRight = Flow.this.getPaddingRight();
            this.mPaddingBottom = Flow.this.getPaddingBottom();
            this.mMax = i5;
        }

        private void recomputeDimensions() {
            this.mWidth = 0;
            this.mHeight = 0;
            this.biggest = null;
            this.biggestDimension = 0;
            int i4 = this.mCount;
            for (int i5 = 0; i5 < i4 && this.mStartIndex + i5 < Flow.this.mDisplayedWidgetsCount; i5++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i5];
                if (this.mOrientation != 0) {
                    int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                    int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    int i6 = Flow.this.mVerticalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i6 = 0;
                    }
                    this.mHeight += widgetHeight + i6;
                    if (this.biggest == null || this.biggestDimension < widgetWidth) {
                        this.biggest = constraintWidget;
                        this.biggestDimension = widgetWidth;
                        this.mWidth = widgetWidth;
                    }
                } else {
                    int width = constraintWidget.getWidth();
                    int i7 = Flow.this.mHorizontalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i7 = 0;
                    }
                    this.mWidth += width + i7;
                    int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    if (this.biggest == null || this.biggestDimension < widgetHeight2) {
                        this.biggest = constraintWidget;
                        this.biggestDimension = widgetHeight2;
                        this.mHeight = widgetHeight2;
                    }
                }
            }
        }

        public void add(ConstraintWidget constraintWidget) {
            if (this.mOrientation == 0) {
                int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetWidth = 0;
                }
                this.mWidth += widgetWidth + (constraintWidget.getVisibility() != 8 ? Flow.this.mHorizontalGap : 0);
                int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (this.biggest == null || this.biggestDimension < widgetHeight) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = widgetHeight;
                    this.mHeight = widgetHeight;
                }
            } else {
                int widgetWidth2 = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetHeight2 = 0;
                }
                this.mHeight += widgetHeight2 + (constraintWidget.getVisibility() != 8 ? Flow.this.mVerticalGap : 0);
                if (this.biggest == null || this.biggestDimension < widgetWidth2) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = widgetWidth2;
                    this.mWidth = widgetWidth2;
                }
            }
            this.mCount++;
        }

        public void clear() {
            this.biggestDimension = 0;
            this.biggest = null;
            this.mWidth = 0;
            this.mHeight = 0;
            this.mStartIndex = 0;
            this.mCount = 0;
            this.mNbMatchConstraintsWidgets = 0;
        }

        public void createConstraints(boolean z4, int i4, boolean z5) {
            ConstraintWidget constraintWidget;
            float f5;
            float f6;
            int i5 = this.mCount;
            for (int i6 = 0; i6 < i5 && this.mStartIndex + i6 < Flow.this.mDisplayedWidgetsCount; i6++) {
                ConstraintWidget constraintWidget2 = Flow.this.mDisplayedWidgets[this.mStartIndex + i6];
                if (constraintWidget2 != null) {
                    constraintWidget2.resetAnchors();
                }
            }
            if (i5 == 0 || this.biggest == null) {
                return;
            }
            boolean z6 = z5 && i4 == 0;
            int i7 = -1;
            int i8 = -1;
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = z4 ? (i5 - 1) - i9 : i9;
                if (this.mStartIndex + i10 >= Flow.this.mDisplayedWidgetsCount) {
                    break;
                }
                ConstraintWidget constraintWidget3 = Flow.this.mDisplayedWidgets[this.mStartIndex + i10];
                if (constraintWidget3 != null && constraintWidget3.getVisibility() == 0) {
                    if (i7 == -1) {
                        i7 = i9;
                    }
                    i8 = i9;
                }
            }
            ConstraintWidget constraintWidget4 = null;
            if (this.mOrientation == 0) {
                ConstraintWidget constraintWidget5 = this.biggest;
                constraintWidget5.setVerticalChainStyle(Flow.this.mVerticalStyle);
                int i11 = this.mPaddingTop;
                if (i4 > 0) {
                    i11 += Flow.this.mVerticalGap;
                }
                constraintWidget5.mTop.connect(this.mTop, i11);
                if (z5) {
                    constraintWidget5.mBottom.connect(this.mBottom, this.mPaddingBottom);
                }
                if (i4 > 0) {
                    this.mTop.mOwner.mBottom.connect(constraintWidget5.mTop, 0);
                }
                if (Flow.this.mVerticalAlign == 3 && !constraintWidget5.hasBaseline()) {
                    for (int i12 = 0; i12 < i5; i12++) {
                        int i13 = z4 ? (i5 - 1) - i12 : i12;
                        if (this.mStartIndex + i13 >= Flow.this.mDisplayedWidgetsCount) {
                            break;
                        }
                        constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i13];
                        if (constraintWidget.hasBaseline()) {
                            break;
                        }
                    }
                }
                constraintWidget = constraintWidget5;
                int i14 = 0;
                while (i14 < i5) {
                    int i15 = z4 ? (i5 - 1) - i14 : i14;
                    if (this.mStartIndex + i15 >= Flow.this.mDisplayedWidgetsCount) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = Flow.this.mDisplayedWidgets[this.mStartIndex + i15];
                    if (constraintWidget6 == null) {
                        constraintWidget6 = constraintWidget4;
                    } else {
                        if (i14 == 0) {
                            constraintWidget6.connect(constraintWidget6.mLeft, this.mLeft, this.mPaddingLeft);
                        }
                        if (i15 == 0) {
                            int i16 = Flow.this.mHorizontalStyle;
                            float f7 = Flow.this.mHorizontalBias;
                            if (z4) {
                                f7 = 1.0f - f7;
                            }
                            if (this.mStartIndex != 0 || Flow.this.mFirstHorizontalStyle == -1) {
                                if (z5 && Flow.this.mLastHorizontalStyle != -1) {
                                    i16 = Flow.this.mLastHorizontalStyle;
                                    if (z4) {
                                        f6 = Flow.this.mLastHorizontalBias;
                                        f5 = 1.0f - f6;
                                        f7 = f5;
                                    } else {
                                        f5 = Flow.this.mLastHorizontalBias;
                                        f7 = f5;
                                    }
                                }
                            } else {
                                i16 = Flow.this.mFirstHorizontalStyle;
                                if (z4) {
                                    f6 = Flow.this.mFirstHorizontalBias;
                                    f5 = 1.0f - f6;
                                    f7 = f5;
                                } else {
                                    f5 = Flow.this.mFirstHorizontalBias;
                                    f7 = f5;
                                }
                            }
                            constraintWidget6.setHorizontalChainStyle(i16);
                            constraintWidget6.setHorizontalBiasPercent(f7);
                        }
                        if (i14 == i5 - 1) {
                            constraintWidget6.connect(constraintWidget6.mRight, this.mRight, this.mPaddingRight);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.mLeft.connect(constraintWidget4.mRight, Flow.this.mHorizontalGap);
                            if (i14 == i7) {
                                constraintWidget6.mLeft.setGoneMargin(this.mPaddingLeft);
                            }
                            constraintWidget4.mRight.connect(constraintWidget6.mLeft, 0);
                            if (i14 == i8 + 1) {
                                constraintWidget4.mRight.setGoneMargin(this.mPaddingRight);
                            }
                        }
                        if (constraintWidget6 != constraintWidget5) {
                            if (Flow.this.mVerticalAlign != 3 || !constraintWidget.hasBaseline() || constraintWidget6 == constraintWidget || !constraintWidget6.hasBaseline()) {
                                int i17 = Flow.this.mVerticalAlign;
                                if (i17 == 0) {
                                    constraintWidget6.mTop.connect(constraintWidget5.mTop, 0);
                                } else if (i17 == 1) {
                                    constraintWidget6.mBottom.connect(constraintWidget5.mBottom, 0);
                                } else if (z6) {
                                    constraintWidget6.mTop.connect(this.mTop, this.mPaddingTop);
                                    constraintWidget6.mBottom.connect(this.mBottom, this.mPaddingBottom);
                                } else {
                                    constraintWidget6.mTop.connect(constraintWidget5.mTop, 0);
                                    constraintWidget6.mBottom.connect(constraintWidget5.mBottom, 0);
                                }
                            } else {
                                constraintWidget6.mBaseline.connect(constraintWidget.mBaseline, 0);
                            }
                            i14++;
                            constraintWidget4 = constraintWidget6;
                        }
                    }
                    i14++;
                    constraintWidget4 = constraintWidget6;
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.biggest;
            constraintWidget7.setHorizontalChainStyle(Flow.this.mHorizontalStyle);
            int i18 = this.mPaddingLeft;
            if (i4 > 0) {
                i18 += Flow.this.mHorizontalGap;
            }
            if (z4) {
                constraintWidget7.mRight.connect(this.mRight, i18);
                if (z5) {
                    constraintWidget7.mLeft.connect(this.mLeft, this.mPaddingRight);
                }
                if (i4 > 0) {
                    this.mRight.mOwner.mLeft.connect(constraintWidget7.mRight, 0);
                }
            } else {
                constraintWidget7.mLeft.connect(this.mLeft, i18);
                if (z5) {
                    constraintWidget7.mRight.connect(this.mRight, this.mPaddingRight);
                }
                if (i4 > 0) {
                    this.mLeft.mOwner.mRight.connect(constraintWidget7.mLeft, 0);
                }
            }
            for (int i19 = 0; i19 < i5 && this.mStartIndex + i19 < Flow.this.mDisplayedWidgetsCount; i19++) {
                ConstraintWidget constraintWidget8 = Flow.this.mDisplayedWidgets[this.mStartIndex + i19];
                if (constraintWidget8 != null) {
                    if (i19 == 0) {
                        constraintWidget8.connect(constraintWidget8.mTop, this.mTop, this.mPaddingTop);
                        int i20 = Flow.this.mVerticalStyle;
                        float f8 = Flow.this.mVerticalBias;
                        if (this.mStartIndex != 0 || Flow.this.mFirstVerticalStyle == -1) {
                            if (z5 && Flow.this.mLastVerticalStyle != -1) {
                                i20 = Flow.this.mLastVerticalStyle;
                                f8 = Flow.this.mLastVerticalBias;
                            }
                        } else {
                            i20 = Flow.this.mFirstVerticalStyle;
                            f8 = Flow.this.mFirstVerticalBias;
                        }
                        constraintWidget8.setVerticalChainStyle(i20);
                        constraintWidget8.setVerticalBiasPercent(f8);
                    }
                    if (i19 == i5 - 1) {
                        constraintWidget8.connect(constraintWidget8.mBottom, this.mBottom, this.mPaddingBottom);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.mTop.connect(constraintWidget4.mBottom, Flow.this.mVerticalGap);
                        if (i19 == i7) {
                            constraintWidget8.mTop.setGoneMargin(this.mPaddingTop);
                        }
                        constraintWidget4.mBottom.connect(constraintWidget8.mTop, 0);
                        if (i19 == i8 + 1) {
                            constraintWidget4.mBottom.setGoneMargin(this.mPaddingBottom);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        if (z4) {
                            int i21 = Flow.this.mHorizontalAlign;
                            if (i21 == 0) {
                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                            } else if (i21 == 1) {
                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                            } else if (i21 == 2) {
                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                            }
                        } else {
                            int i22 = Flow.this.mHorizontalAlign;
                            if (i22 == 0) {
                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                            } else if (i22 == 1) {
                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                            } else if (i22 == 2) {
                                if (z6) {
                                    constraintWidget8.mLeft.connect(this.mLeft, this.mPaddingLeft);
                                    constraintWidget8.mRight.connect(this.mRight, this.mPaddingRight);
                                } else {
                                    constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                    constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                                }
                            }
                            constraintWidget4 = constraintWidget8;
                        }
                    }
                    constraintWidget4 = constraintWidget8;
                }
            }
        }

        public int getHeight() {
            if (this.mOrientation == 1) {
                return this.mHeight - Flow.this.mVerticalGap;
            }
            return this.mHeight;
        }

        public int getWidth() {
            if (this.mOrientation == 0) {
                return this.mWidth - Flow.this.mHorizontalGap;
            }
            return this.mWidth;
        }

        public void measureMatchConstraints(int i4) {
            int i5 = this.mNbMatchConstraintsWidgets;
            if (i5 == 0) {
                return;
            }
            int i6 = this.mCount;
            int i7 = i4 / i5;
            for (int i8 = 0; i8 < i6 && this.mStartIndex + i8 < Flow.this.mDisplayedWidgetsCount; i8++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i8];
                if (this.mOrientation == 0) {
                    if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                        Flow.this.measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i7, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                    }
                } else if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    Flow.this.measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i7);
                }
            }
            recomputeDimensions();
        }

        public void setStartIndex(int i4) {
            this.mStartIndex = i4;
        }

        public void setup(int i4, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i5, int i6, int i7, int i8, int i9) {
            this.mOrientation = i4;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i5;
            this.mPaddingTop = i6;
            this.mPaddingRight = i7;
            this.mPaddingBottom = i8;
            this.mMax = i9;
        }
    }

    private void createAlignedConstraints(boolean z4) {
        ConstraintWidget constraintWidget;
        float f5;
        int i4;
        if (this.mAlignedDimensions == null || this.mAlignedBiggestElementsInCols == null || this.mAlignedBiggestElementsInRows == null) {
            return;
        }
        for (int i5 = 0; i5 < this.mDisplayedWidgetsCount; i5++) {
            this.mDisplayedWidgets[i5].resetAnchors();
        }
        int[] iArr = this.mAlignedDimensions;
        int i6 = iArr[0];
        int i7 = iArr[1];
        ConstraintWidget constraintWidget2 = null;
        float f6 = this.mHorizontalBias;
        int i8 = 0;
        while (i8 < i6) {
            if (z4) {
                i4 = (i6 - i8) - 1;
                f5 = 1.0f - this.mHorizontalBias;
            } else {
                f5 = f6;
                i4 = i8;
            }
            ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[i4];
            if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                if (i8 == 0) {
                    constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                    constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                    constraintWidget3.setHorizontalBiasPercent(f5);
                }
                if (i8 == i6 - 1) {
                    constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                }
                if (i8 > 0 && constraintWidget2 != null) {
                    constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                    constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
            i8++;
            f6 = f5;
        }
        for (int i9 = 0; i9 < i7; i9++) {
            ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i9];
            if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                if (i9 == 0) {
                    constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                    constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                    constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                }
                if (i9 == i7 - 1) {
                    constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                }
                if (i9 > 0 && constraintWidget2 != null) {
                    constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                    constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i10 = 0; i10 < i6; i10++) {
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = (i11 * i6) + i10;
                if (this.mOrientation == 1) {
                    i12 = (i10 * i7) + i11;
                }
                ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                if (i12 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i12]) != null && constraintWidget.getVisibility() != 8) {
                    ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i10];
                    ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i11];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                        constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                        constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWidgetHeight(ConstraintWidget constraintWidget, int i4) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i5 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (constraintWidget.mMatchConstraintPercentHeight * i4);
                if (i6 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i6);
                }
                return i6;
            } else if (i5 == 1) {
                return constraintWidget.getHeight();
            } else {
                if (i5 == 3) {
                    return (int) ((constraintWidget.getWidth() * constraintWidget.mDimensionRatio) + 0.5f);
                }
            }
        }
        return constraintWidget.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWidgetWidth(ConstraintWidget constraintWidget, int i4) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i5 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (constraintWidget.mMatchConstraintPercentWidth * i4);
                if (i6 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i6, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i6;
            } else if (i5 == 1) {
                return constraintWidget.getWidth();
            } else {
                if (i5 == 3) {
                    return (int) ((constraintWidget.getHeight() * constraintWidget.mDimensionRatio) + 0.5f);
                }
            }
        }
        return constraintWidget.getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x011b -> B:42:0x0063). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x011d -> B:42:0x0063). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0123 -> B:42:0x0063). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0125 -> B:42:0x0063). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[] r17, int r18, int r19, int r20, int[] r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void measureChainWrap(ConstraintWidget[] constraintWidgetArr, int i4, int i5, int i6, int[] iArr) {
        int i7;
        int i8;
        int i9;
        ConstraintAnchor constraintAnchor;
        int paddingRight;
        ConstraintAnchor constraintAnchor2;
        int paddingBottom;
        int i10;
        if (i4 == 0) {
            return;
        }
        this.mChainList.clear();
        WidgetsList widgetsList = new WidgetsList(i5, this.mLeft, this.mTop, this.mRight, this.mBottom, i6);
        this.mChainList.add(widgetsList);
        if (i5 == 0) {
            i7 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i4) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i12];
                int widgetWidth = getWidgetWidth(constraintWidget, i6);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i13 = i7;
                boolean z4 = (i11 == i6 || (this.mHorizontalGap + i11) + widgetWidth > i6) && widgetsList.biggest != null;
                if (!z4 && i12 > 0 && (i10 = this.mMaxElementsWrap) > 0 && i12 % i10 == 0) {
                    z4 = true;
                }
                if (z4) {
                    widgetsList = new WidgetsList(i5, this.mLeft, this.mTop, this.mRight, this.mBottom, i6);
                    widgetsList.setStartIndex(i12);
                    this.mChainList.add(widgetsList);
                } else if (i12 > 0) {
                    i11 += this.mHorizontalGap + widgetWidth;
                    widgetsList.add(constraintWidget);
                    i12++;
                    i7 = i13;
                }
                i11 = widgetWidth;
                widgetsList.add(constraintWidget);
                i12++;
                i7 = i13;
            }
        } else {
            i7 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i15 < i4) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i15];
                int widgetHeight = getWidgetHeight(constraintWidget2, i6);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i16 = i7;
                boolean z5 = (i14 == i6 || (this.mVerticalGap + i14) + widgetHeight > i6) && widgetsList.biggest != null;
                if (!z5 && i15 > 0 && (i8 = this.mMaxElementsWrap) > 0 && i15 % i8 == 0) {
                    z5 = true;
                }
                if (z5) {
                    widgetsList = new WidgetsList(i5, this.mLeft, this.mTop, this.mRight, this.mBottom, i6);
                    widgetsList.setStartIndex(i15);
                    this.mChainList.add(widgetsList);
                } else if (i15 > 0) {
                    i14 += this.mVerticalGap + widgetHeight;
                    widgetsList.add(constraintWidget2);
                    i15++;
                    i7 = i16;
                }
                i14 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i15++;
                i7 = i16;
            }
        }
        int size = this.mChainList.size();
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        ConstraintAnchor constraintAnchor5 = this.mRight;
        ConstraintAnchor constraintAnchor6 = this.mBottom;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z6 = horizontalDimensionBehaviour == dimensionBehaviour || getVerticalDimensionBehaviour() == dimensionBehaviour;
        if (i7 > 0 && z6) {
            for (int i17 = 0; i17 < size; i17++) {
                WidgetsList widgetsList2 = this.mChainList.get(i17);
                if (i5 == 0) {
                    widgetsList2.measureMatchConstraints(i6 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i6 - widgetsList2.getHeight());
                }
            }
        }
        int i18 = paddingTop;
        int i19 = paddingRight2;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i24 = paddingBottom2;
        while (i22 < size) {
            WidgetsList widgetsList3 = this.mChainList.get(i22);
            if (i5 == 0) {
                if (i22 < size - 1) {
                    constraintAnchor2 = this.mChainList.get(i22 + 1).biggest.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor9 = widgetsList3.biggest.mBottom;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i25 = i20;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i26 = i21;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i9 = i22;
                widgetsList3.setup(i5, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i23, i18, i19, paddingBottom, i6);
                int max = Math.max(i26, widgetsList3.getWidth());
                i20 = i25 + widgetsList3.getHeight();
                if (i9 > 0) {
                    i20 += this.mVerticalGap;
                }
                constraintAnchor8 = constraintAnchor11;
                i21 = max;
                constraintAnchor7 = constraintAnchor9;
                i18 = 0;
                constraintAnchor = constraintAnchor14;
                int i27 = paddingBottom;
                constraintAnchor6 = constraintAnchor2;
                i24 = i27;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i28 = i20;
                int i29 = i21;
                i9 = i22;
                if (i9 < size - 1) {
                    constraintAnchor = this.mChainList.get(i9 + 1).biggest.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                ConstraintAnchor constraintAnchor16 = widgetsList3.biggest.mRight;
                widgetsList3.setup(i5, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i23, i18, paddingRight, i24, i6);
                i21 = i29 + widgetsList3.getWidth();
                int max2 = Math.max(i28, widgetsList3.getHeight());
                if (i9 > 0) {
                    i21 += this.mHorizontalGap;
                }
                i20 = max2;
                i19 = paddingRight;
                constraintAnchor8 = constraintAnchor16;
                i23 = 0;
            }
            i22 = i9 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i21;
        iArr[1] = i20;
    }

    private void measureChainWrap_new(ConstraintWidget[] constraintWidgetArr, int i4, int i5, int i6, int[] iArr) {
        int i7;
        int i8;
        int i9;
        ConstraintAnchor constraintAnchor;
        int paddingRight;
        ConstraintAnchor constraintAnchor2;
        int paddingBottom;
        int i10;
        if (i4 == 0) {
            return;
        }
        this.mChainList.clear();
        WidgetsList widgetsList = new WidgetsList(i5, this.mLeft, this.mTop, this.mRight, this.mBottom, i6);
        this.mChainList.add(widgetsList);
        if (i5 == 0) {
            int i11 = 0;
            i7 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i13 < i4) {
                int i14 = i11 + 1;
                ConstraintWidget constraintWidget = constraintWidgetArr[i13];
                int widgetWidth = getWidgetWidth(constraintWidget, i6);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i15 = i7;
                boolean z4 = (i12 == i6 || (this.mHorizontalGap + i12) + widgetWidth > i6) && widgetsList.biggest != null;
                if (!z4 && i13 > 0 && (i10 = this.mMaxElementsWrap) > 0 && i14 > i10) {
                    z4 = true;
                }
                if (z4) {
                    widgetsList = new WidgetsList(i5, this.mLeft, this.mTop, this.mRight, this.mBottom, i6);
                    widgetsList.setStartIndex(i13);
                    this.mChainList.add(widgetsList);
                    i11 = i14;
                    i12 = widgetWidth;
                } else {
                    i12 = i13 > 0 ? i12 + this.mHorizontalGap + widgetWidth : widgetWidth;
                    i11 = 0;
                }
                widgetsList.add(constraintWidget);
                i13++;
                i7 = i15;
            }
        } else {
            int i16 = 0;
            i7 = 0;
            int i17 = 0;
            while (i17 < i4) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i17];
                int widgetHeight = getWidgetHeight(constraintWidget2, i6);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i18 = i7;
                boolean z5 = (i16 == i6 || (this.mVerticalGap + i16) + widgetHeight > i6) && widgetsList.biggest != null;
                if (!z5 && i17 > 0 && (i8 = this.mMaxElementsWrap) > 0 && i8 < 0) {
                    z5 = true;
                }
                if (z5) {
                    widgetsList = new WidgetsList(i5, this.mLeft, this.mTop, this.mRight, this.mBottom, i6);
                    widgetsList.setStartIndex(i17);
                    this.mChainList.add(widgetsList);
                } else if (i17 > 0) {
                    i16 += this.mVerticalGap + widgetHeight;
                    widgetsList.add(constraintWidget2);
                    i17++;
                    i7 = i18;
                }
                i16 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i17++;
                i7 = i18;
            }
        }
        int size = this.mChainList.size();
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        ConstraintAnchor constraintAnchor5 = this.mRight;
        ConstraintAnchor constraintAnchor6 = this.mBottom;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z6 = horizontalDimensionBehaviour == dimensionBehaviour || getVerticalDimensionBehaviour() == dimensionBehaviour;
        if (i7 > 0 && z6) {
            for (int i19 = 0; i19 < size; i19++) {
                WidgetsList widgetsList2 = this.mChainList.get(i19);
                if (i5 == 0) {
                    widgetsList2.measureMatchConstraints(i6 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i6 - widgetsList2.getHeight());
                }
            }
        }
        int i20 = paddingTop;
        int i21 = paddingRight2;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i26 = paddingBottom2;
        while (i24 < size) {
            WidgetsList widgetsList3 = this.mChainList.get(i24);
            if (i5 == 0) {
                if (i24 < size - 1) {
                    constraintAnchor2 = this.mChainList.get(i24 + 1).biggest.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor9 = widgetsList3.biggest.mBottom;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i27 = i22;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i28 = i23;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i9 = i24;
                widgetsList3.setup(i5, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i25, i20, i21, paddingBottom, i6);
                int max = Math.max(i28, widgetsList3.getWidth());
                i22 = i27 + widgetsList3.getHeight();
                if (i9 > 0) {
                    i22 += this.mVerticalGap;
                }
                constraintAnchor8 = constraintAnchor11;
                i23 = max;
                constraintAnchor7 = constraintAnchor9;
                i20 = 0;
                constraintAnchor = constraintAnchor14;
                int i29 = paddingBottom;
                constraintAnchor6 = constraintAnchor2;
                i26 = i29;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i30 = i22;
                int i31 = i23;
                i9 = i24;
                if (i9 < size - 1) {
                    constraintAnchor = this.mChainList.get(i9 + 1).biggest.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                ConstraintAnchor constraintAnchor16 = widgetsList3.biggest.mRight;
                widgetsList3.setup(i5, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i25, i20, paddingRight, i26, i6);
                i23 = i31 + widgetsList3.getWidth();
                int max2 = Math.max(i30, widgetsList3.getHeight());
                if (i9 > 0) {
                    i23 += this.mHorizontalGap;
                }
                i22 = max2;
                i21 = paddingRight;
                constraintAnchor8 = constraintAnchor16;
                i25 = 0;
            }
            i24 = i9 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i23;
        iArr[1] = i22;
    }

    private void measureNoWrap(ConstraintWidget[] constraintWidgetArr, int i4, int i5, int i6, int[] iArr) {
        WidgetsList widgetsList;
        if (i4 == 0) {
            return;
        }
        if (this.mChainList.size() == 0) {
            widgetsList = new WidgetsList(i5, this.mLeft, this.mTop, this.mRight, this.mBottom, i6);
            this.mChainList.add(widgetsList);
        } else {
            WidgetsList widgetsList2 = this.mChainList.get(0);
            widgetsList2.clear();
            widgetsList = widgetsList2;
            widgetsList.setup(i5, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i6);
        }
        for (int i7 = 0; i7 < i4; i7++) {
            widgetsList.add(constraintWidgetArr[i7]);
        }
        iArr[0] = widgetsList.getWidth();
        iArr[1] = widgetsList.getHeight();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z4) {
        super.addToSolver(linearSystem, z4);
        boolean z5 = getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl();
        int i4 = this.mWrapMode;
        if (i4 != 0) {
            if (i4 == 1) {
                int size = this.mChainList.size();
                int i5 = 0;
                while (i5 < size) {
                    this.mChainList.get(i5).createConstraints(z5, i5, i5 == size + (-1));
                    i5++;
                }
            } else if (i4 == 2) {
                createAlignedConstraints(z5);
            } else if (i4 == 3) {
                int size2 = this.mChainList.size();
                int i6 = 0;
                while (i6 < size2) {
                    this.mChainList.get(i6).createConstraints(z5, i6, i6 == size2 + (-1));
                    i6++;
                }
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(z5, 0, true);
        }
        needsCallbackFromSolver(false);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Flow flow = (Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    public float getMaxElementsWrap() {
        return this.mMaxElementsWrap;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0114  */
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void measure(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.measure(int, int, int, int):void");
    }

    public void setFirstHorizontalBias(float f5) {
        this.mFirstHorizontalBias = f5;
    }

    public void setFirstHorizontalStyle(int i4) {
        this.mFirstHorizontalStyle = i4;
    }

    public void setFirstVerticalBias(float f5) {
        this.mFirstVerticalBias = f5;
    }

    public void setFirstVerticalStyle(int i4) {
        this.mFirstVerticalStyle = i4;
    }

    public void setHorizontalAlign(int i4) {
        this.mHorizontalAlign = i4;
    }

    public void setHorizontalBias(float f5) {
        this.mHorizontalBias = f5;
    }

    public void setHorizontalGap(int i4) {
        this.mHorizontalGap = i4;
    }

    public void setHorizontalStyle(int i4) {
        this.mHorizontalStyle = i4;
    }

    public void setLastHorizontalBias(float f5) {
        this.mLastHorizontalBias = f5;
    }

    public void setLastHorizontalStyle(int i4) {
        this.mLastHorizontalStyle = i4;
    }

    public void setLastVerticalBias(float f5) {
        this.mLastVerticalBias = f5;
    }

    public void setLastVerticalStyle(int i4) {
        this.mLastVerticalStyle = i4;
    }

    public void setMaxElementsWrap(int i4) {
        this.mMaxElementsWrap = i4;
    }

    public void setOrientation(int i4) {
        this.mOrientation = i4;
    }

    public void setVerticalAlign(int i4) {
        this.mVerticalAlign = i4;
    }

    public void setVerticalBias(float f5) {
        this.mVerticalBias = f5;
    }

    public void setVerticalGap(int i4) {
        this.mVerticalGap = i4;
    }

    public void setVerticalStyle(int i4) {
        this.mVerticalStyle = i4;
    }

    public void setWrapMode(int i4) {
        this.mWrapMode = i4;
    }
}

package com.cpoopc.scrollablelayoutlib;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes2.dex */
public class ScrollableLayout extends LinearLayout {
    private ViewPager childViewPager;
    private boolean isClickHead;
    private boolean isClickHeadExpand;
    private int mCurY;
    private DIRECTION mDirection;
    private boolean mDisallowIntercept;
    private float mDownX;
    private float mDownY;
    private int mExpandHeight;
    private int mHeadHeight;
    private View mHeadView;
    private ScrollableHelper mHelper;
    private int mLastScrollerY;
    private float mLastY;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private Scroller mScroller;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private int maxY;
    private int minY;
    private boolean needCheckUpdown;
    private OnScrollListener onScrollListener;
    private final String tag;
    private boolean updown;

    /* loaded from: classes2.dex */
    enum DIRECTION {
        UP,
        DOWN
    }

    /* loaded from: classes2.dex */
    public interface OnScrollListener {
        void onScroll(int i4, int i5);
    }

    public ScrollableLayout(Context context) {
        super(context);
        this.tag = "cp:scrollableLayout";
        this.minY = 0;
        this.maxY = 0;
        init(context);
    }

    private int calcDuration(int i4, int i5) {
        return i4 - i5;
    }

    private void checkIsClickHead(int i4, int i5, int i6) {
        this.isClickHead = i4 + i6 <= i5;
    }

    private void checkIsClickHeadExpand(int i4, int i5, int i6) {
        int i7 = this.mExpandHeight;
        if (i7 <= 0) {
            this.isClickHeadExpand = false;
        }
        this.isClickHeadExpand = i4 + i6 <= i5 + i7;
    }

    @TargetApi(14)
    private int getScrollerVelocity(int i4, int i5) {
        Scroller scroller = this.mScroller;
        if (scroller == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            return (int) scroller.getCurrVelocity();
        }
        return i4 / i5;
    }

    private void init(Context context) {
        this.mHelper = new ScrollableHelper();
        this.mScroller = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void initOrResetVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void initVelocityTrackerIfNotExists() {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    private void recycleVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public boolean canPtr() {
        return this.updown && this.mCurY == this.minY && this.mHelper.isTop();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mScroller.computeScrollOffset()) {
            int currY = this.mScroller.getCurrY();
            if (this.mDirection == DIRECTION.UP) {
                if (isSticked()) {
                    int finalY = this.mScroller.getFinalY() - currY;
                    int calcDuration = calcDuration(this.mScroller.getDuration(), this.mScroller.timePassed());
                    this.mHelper.smoothScrollBy(getScrollerVelocity(finalY, calcDuration), finalY, calcDuration);
                    this.mScroller.forceFinished(true);
                    return;
                }
                scrollTo(0, currY);
            } else {
                if (this.mHelper.isTop() || this.isClickHeadExpand) {
                    scrollTo(0, getScrollY() + (currY - this.mLastScrollerY));
                    if (this.mCurY <= this.minY) {
                        this.mScroller.forceFinished(true);
                        return;
                    }
                }
                invalidate();
            }
            this.mLastScrollerY = currY;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y2 = motionEvent.getY();
        int abs = (int) Math.abs(x4 - this.mDownX);
        int abs2 = (int) Math.abs(y2 - this.mDownY);
        int action = motionEvent.getAction();
        boolean z4 = false;
        if (action == 0) {
            this.mDisallowIntercept = false;
            this.needCheckUpdown = true;
            this.updown = true;
            this.mDownX = x4;
            this.mDownY = y2;
            this.mLastY = y2;
            int i4 = (int) y2;
            checkIsClickHead(i4, this.mHeadHeight, getScrollY());
            checkIsClickHeadExpand(i4, this.mHeadHeight, getScrollY());
            initOrResetVelocityTracker();
            this.mVelocityTracker.addMovement(motionEvent);
            this.mScroller.forceFinished(true);
        } else if (action != 1) {
            if (action == 2 && !this.mDisallowIntercept) {
                initVelocityTrackerIfNotExists();
                this.mVelocityTracker.addMovement(motionEvent);
                float f5 = this.mLastY - y2;
                if (this.needCheckUpdown) {
                    int i5 = this.mTouchSlop;
                    if (abs > i5 && abs > abs2) {
                        this.needCheckUpdown = false;
                        this.updown = false;
                    } else if (abs2 > i5 && abs2 > abs) {
                        this.needCheckUpdown = false;
                        this.updown = true;
                    }
                }
                if (this.updown && abs2 > this.mTouchSlop && abs2 > abs && (!isSticked() || this.mHelper.isTop() || this.isClickHeadExpand)) {
                    ViewPager viewPager = this.childViewPager;
                    if (viewPager != null) {
                        viewPager.requestDisallowInterceptTouchEvent(true);
                    }
                    double d5 = f5;
                    Double.isNaN(d5);
                    scrollBy(0, (int) (d5 + 0.5d));
                }
                this.mLastY = y2;
            }
        } else if (this.updown && abs2 > abs && abs2 > this.mTouchSlop) {
            this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            float f6 = -this.mVelocityTracker.getYVelocity();
            if (Math.abs(f6) > this.mMinimumVelocity) {
                DIRECTION direction = f6 > 0.0f ? DIRECTION.UP : DIRECTION.DOWN;
                this.mDirection = direction;
                if ((direction == DIRECTION.UP && isSticked()) || (!isSticked() && getScrollY() == 0 && this.mDirection == DIRECTION.DOWN)) {
                    z4 = true;
                } else {
                    this.mScroller.fling(0, getScrollY(), 0, (int) f6, 0, 0, -2147483647, Integer.MAX_VALUE);
                    this.mScroller.computeScrollOffset();
                    this.mLastScrollerY = getScrollY();
                    invalidate();
                }
            }
            if (!z4 && (this.isClickHead || !isSticked())) {
                int action2 = motionEvent.getAction();
                motionEvent.setAction(3);
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                motionEvent.setAction(action2);
                return dispatchTouchEvent;
            }
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public ScrollableHelper getHelper() {
        return this.mHelper;
    }

    public int getMaxY() {
        return this.maxY;
    }

    public boolean isHeadTop() {
        return this.mCurY == this.minY;
    }

    public boolean isSticked() {
        return this.mCurY == this.maxY;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        View view = this.mHeadView;
        if (view != null && !view.isClickable()) {
            this.mHeadView.setClickable(true);
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null && (childAt instanceof ViewPager)) {
                this.childViewPager = (ViewPager) childAt;
            }
        }
        super.onFinishInflate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        View childAt = getChildAt(0);
        this.mHeadView = childAt;
        measureChildWithMargins(childAt, i4, 0, 0, 0);
        this.maxY = this.mHeadView.getMeasuredHeight();
        this.mHeadHeight = this.mHeadView.getMeasuredHeight();
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5) + this.maxY, 1073741824));
    }

    public void requestScrollableLayoutDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        this.mDisallowIntercept = z4;
    }

    @Override // android.view.View
    public void scrollBy(int i4, int i5) {
        int scrollY = getScrollY();
        int i6 = i5 + scrollY;
        int i7 = this.maxY;
        if (i6 >= i7 || i6 <= (i7 = this.minY)) {
            i6 = i7;
        }
        super.scrollBy(i4, i6 - scrollY);
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        int i6 = this.maxY;
        if (i5 >= i6) {
            i5 = i6;
        } else {
            int i7 = this.minY;
            if (i5 <= i7) {
                i5 = i7;
            }
        }
        this.mCurY = i5;
        OnScrollListener onScrollListener = this.onScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScroll(i5, i6);
        }
        super.scrollTo(i4, i5);
    }

    public void setClickHeadExpand(int i4) {
        this.mExpandHeight = i4;
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.onScrollListener = onScrollListener;
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tag = "cp:scrollableLayout";
        this.minY = 0;
        this.maxY = 0;
        init(context);
    }

    @TargetApi(11)
    public ScrollableLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.tag = "cp:scrollableLayout";
        this.minY = 0;
        this.maxY = 0;
        init(context);
    }

    @TargetApi(21)
    public ScrollableLayout(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.tag = "cp:scrollableLayout";
        this.minY = 0;
        this.maxY = 0;
        init(context);
    }
}

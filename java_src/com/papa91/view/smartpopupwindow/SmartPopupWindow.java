package com.papa91.view.smartpopupwindow;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.core.widget.PopupWindowCompat;
/* loaded from: classes5.dex */
public class SmartPopupWindow extends PopupWindow {
    private boolean isOnlyGetWH;
    private boolean isTouchOutsideDismiss;
    private float mAlpha;
    private View mAnchorView;
    private int mAnimationStyle;
    private View mContentView;
    private Context mContext;
    private int mHeight;
    private int mHorizontalGravity;
    private int mOffsetX;
    private int mOffsetY;
    private final ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    private int mVerticalGravity;
    private int mWidth;

    /* loaded from: classes5.dex */
    public static class Builder {
        private SmartPopupWindow mWindow;

        private Builder(Activity activity, View view) {
            SmartPopupWindow smartPopupWindow = new SmartPopupWindow(activity);
            this.mWindow = smartPopupWindow;
            smartPopupWindow.mContext = activity;
            this.mWindow.mContentView = view;
        }

        public static Builder build(Activity activity, View view) {
            return new Builder(activity, view);
        }

        public SmartPopupWindow createPopupWindow() {
            this.mWindow.init();
            return this.mWindow;
        }

        public Builder setAlpha(float f5) {
            this.mWindow.mAlpha = f5;
            return this;
        }

        public Builder setAnimationStyle(int i4) {
            this.mWindow.mAnimationStyle = i4;
            return this;
        }

        public Builder setOutsideTouchDismiss(boolean z4) {
            this.mWindow.isTouchOutsideDismiss = z4;
            return this;
        }

        public Builder setSize(int i4, int i5) {
            this.mWindow.mWidth = i4;
            this.mWindow.mHeight = i5;
            return this;
        }
    }

    public SmartPopupWindow(Context context) {
        this(context, null);
    }

    private void addGlobalLayoutListener(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
    }

    private int calculateX(View view, int i4, int i5, int i6) {
        int width;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    width = view.getWidth();
                } else if (i4 != 4) {
                    return i6;
                } else {
                    i5 -= view.getWidth();
                }
            }
            return i6 - i5;
        }
        width = (view.getWidth() / 2) - (i5 / 2);
        return i6 + width;
    }

    private int calculateY(View view, int i4, int i5, int i6) {
        int height;
        if (i4 != 0) {
            if (i4 == 1) {
                i5 += view.getHeight();
            } else if (i4 == 3) {
                height = view.getHeight();
            } else if (i4 != 4) {
                return i6;
            }
            return i6 - i5;
        }
        height = (view.getHeight() / 2) + (i5 / 2);
        return i6 - height;
    }

    private void dismissBackgroundAnimator() {
        float f5 = this.mAlpha;
        if (f5 >= 1.0f) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.papa91.view.smartpopupwindow.SmartPopupWindow.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartPopupWindow.this.setWindowBackgroundAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setDuration(360L);
        ofFloat.start();
    }

    private static int getDropDownMeasureSpecMode(int i4) {
        return i4 != -2 ? 1073741824 : 0;
    }

    private static int makeDropDownMeasureSpec(int i4) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), getDropDownMeasureSpecMode(i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGlobalLayoutListener() {
        if (getContentView() != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                getContentView().getViewTreeObserver().removeOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
            } else {
                getContentView().getViewTreeObserver().removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWindowBackgroundAlpha(float f5) {
        Context context = this.mContext;
        if (context != null && (context instanceof Activity)) {
            Window window = ((Activity) context).getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = f5;
            window.setAttributes(attributes);
        }
    }

    private void showBackgroundAnimator() {
        float f5 = this.mAlpha;
        if (f5 >= 1.0f) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f5);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.papa91.view.smartpopupwindow.SmartPopupWindow.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartPopupWindow.this.setWindowBackgroundAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setDuration(360L);
        ofFloat.start();
    }

    private void touchOutsideDismiss(boolean z4) {
        if (!z4) {
            setFocusable(true);
            setOutsideTouchable(false);
            setBackgroundDrawable(null);
            getContentView().setFocusable(true);
            getContentView().setFocusableInTouchMode(true);
            getContentView().setOnKeyListener(new View.OnKeyListener() { // from class: com.papa91.view.smartpopupwindow.SmartPopupWindow.1
                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view, int i4, KeyEvent keyEvent) {
                    if (i4 == 4) {
                        SmartPopupWindow.this.dismiss();
                        return true;
                    }
                    return false;
                }
            });
            setTouchInterceptor(new View.OnTouchListener() { // from class: com.papa91.view.smartpopupwindow.SmartPopupWindow.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int x4 = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    return (motionEvent.getAction() == 0 && (x4 < 0 || x4 >= SmartPopupWindow.this.mWidth || y2 < 0 || y2 >= SmartPopupWindow.this.mHeight)) || motionEvent.getAction() == 4;
                }
            });
            return;
        }
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLocation(int i4, int i5, @NonNull View view, int i6, int i7, int i8, int i9) {
        update(view, calculateX(view, i7, i4, i8), calculateY(view, i6, i5, i9), i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        dismissBackgroundAnimator();
        removeGlobalLayoutListener();
    }

    public void init() {
        setContentView(this.mContentView);
        setHeight(this.mHeight);
        setWidth(this.mWidth);
        touchOutsideDismiss(this.isTouchOutsideDismiss);
        int i4 = this.mAnimationStyle;
        if (i4 != -1) {
            setAnimationStyle(i4);
        }
    }

    public void showAtAnchorView(@NonNull View view, int i4, int i5) {
        showAtAnchorView(view, i4, i5, true);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View view, int i4, int i5, int i6) {
        this.isOnlyGetWH = true;
        this.mAnchorView = view;
        this.mOffsetX = i5;
        this.mOffsetY = i6;
        addGlobalLayoutListener(getContentView());
        super.showAtLocation(view, i4, i5, i6);
    }

    public SmartPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void showAtAnchorView(@NonNull View view, int i4, int i5, boolean z4) {
        showAtAnchorView(view, i4, i5, 0, 0, z4);
    }

    public SmartPopupWindow(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mWidth = -2;
        this.mHeight = -2;
        this.mAlpha = 1.0f;
        this.isTouchOutsideDismiss = true;
        this.mAnimationStyle = -1;
        this.isOnlyGetWH = true;
        this.mVerticalGravity = 2;
        this.mHorizontalGravity = 1;
        this.mOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.papa91.view.smartpopupwindow.SmartPopupWindow.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                SmartPopupWindow smartPopupWindow = SmartPopupWindow.this;
                smartPopupWindow.mWidth = smartPopupWindow.getContentView().getWidth();
                SmartPopupWindow smartPopupWindow2 = SmartPopupWindow.this;
                smartPopupWindow2.mHeight = smartPopupWindow2.getContentView().getHeight();
                if (SmartPopupWindow.this.isOnlyGetWH) {
                    SmartPopupWindow.this.removeGlobalLayoutListener();
                    return;
                }
                SmartPopupWindow smartPopupWindow3 = SmartPopupWindow.this;
                smartPopupWindow3.updateLocation(smartPopupWindow3.mWidth, SmartPopupWindow.this.mHeight, SmartPopupWindow.this.mAnchorView, SmartPopupWindow.this.mVerticalGravity, SmartPopupWindow.this.mHorizontalGravity, SmartPopupWindow.this.mOffsetX, SmartPopupWindow.this.mOffsetY);
                SmartPopupWindow.this.removeGlobalLayoutListener();
            }
        };
        this.mContext = context;
    }

    public void showAtAnchorView(@NonNull View view, int i4, int i5, int i6, int i7) {
        showAtAnchorView(view, i4, i5, i6, i7, true);
    }

    public void showAtAnchorView(@NonNull View view, int i4, int i5, int i6, int i7, boolean z4) {
        this.isOnlyGetWH = false;
        this.mAnchorView = view;
        this.mOffsetX = i6;
        this.mOffsetY = i7;
        this.mVerticalGravity = i4;
        this.mHorizontalGravity = i5;
        showBackgroundAnimator();
        View contentView = getContentView();
        addGlobalLayoutListener(contentView);
        setClippingEnabled(z4);
        contentView.measure(makeDropDownMeasureSpec(getWidth()), makeDropDownMeasureSpec(getHeight()));
        int measuredWidth = contentView.getMeasuredWidth();
        int measuredHeight = contentView.getMeasuredHeight();
        if (!z4) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            i6 += iArr[0];
            i7 += iArr[1] + view.getHeight();
        }
        int calculateY = calculateY(view, i4, measuredHeight, i7);
        int calculateX = calculateX(view, i5, measuredWidth, i6);
        if (z4) {
            PopupWindowCompat.showAsDropDown(this, view, calculateX, calculateY, 0);
        } else {
            showAtLocation(view, 0, calculateX, calculateY);
        }
    }
}

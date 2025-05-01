package com.papa91.wrapper;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
/* loaded from: classes5.dex */
public class KeyboardListenLayout extends RelativeLayout {
    private String TAG;
    private OnSoftKeyboardListener onSoftKeyboardListener;

    /* loaded from: classes5.dex */
    public interface OnSoftKeyboardListener {
        void onHidden();

        void onShown();
    }

    public KeyboardListenLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "KeyboardListenLayout";
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int size = View.MeasureSpec.getSize(i5);
        int measuredHeight = getMeasuredHeight();
        int width = getWidth();
        int height = getHeight();
        StringBuilder sb = new StringBuilder();
        sb.append("height=");
        sb.append(height);
        sb.append(" w=");
        sb.append(width);
        sb.append("");
        OnSoftKeyboardListener onSoftKeyboardListener = this.onSoftKeyboardListener;
        if (onSoftKeyboardListener != null) {
            if (measuredHeight > size) {
                onSoftKeyboardListener.onShown();
            } else {
                onSoftKeyboardListener.onHidden();
            }
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        StringBuilder sb = new StringBuilder();
        sb.append("oldh=");
        sb.append(i7);
        sb.append(" h=");
        sb.append(i5);
        sb.append("");
        super.onSizeChanged(i4, i5, i6, i7);
    }

    public final void setOnSoftKeyboardListener(OnSoftKeyboardListener onSoftKeyboardListener) {
        this.onSoftKeyboardListener = onSoftKeyboardListener;
    }

    public KeyboardListenLayout(Context context) {
        super(context);
        this.TAG = "KeyboardListenLayout";
    }
}

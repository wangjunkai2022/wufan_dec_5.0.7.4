package com.beizi.ad.internal.utilities;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.beizi.ad.lance.a.l;
/* loaded from: classes2.dex */
public class TouchDelegate extends android.view.TouchDelegate {
    public static final int ABOVE = 1;
    public static final int BELOW = 2;
    public static final int TO_LEFT = 4;
    public static final int TO_RIGHT = 8;
    private Rect mBounds;
    private boolean mDelegateTargeted;
    private View mDelegateView;
    private int mSlop;
    private Rect mSlopBounds;

    public TouchDelegate(Rect rect, View view) {
        super(rect, view);
        this.mBounds = rect;
        this.mSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        Rect rect2 = new Rect(rect);
        this.mSlopBounds = rect2;
        int i4 = this.mSlop;
        rect2.inset(-i4, -i4);
        this.mDelegateView = view;
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int x4 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                if (actionMasked == 3) {
                    z4 = this.mDelegateTargeted;
                    this.mDelegateTargeted = false;
                } else if (actionMasked != 5 && actionMasked != 6) {
                    z4 = false;
                }
            }
            boolean z5 = this.mDelegateTargeted;
            r3 = z5 ? this.mSlopBounds.contains(x4, y2) : true;
            z4 = z5;
        } else {
            l.c("BeiZisAd", "TouchDelegate mBounds = " + this.mBounds + ",x = " + x4 + ",y = " + y2);
            this.mDelegateTargeted = this.mBounds.contains(x4, y2);
            StringBuilder sb = new StringBuilder();
            sb.append("TouchDelegate onTouchEvent mDelegateTargeted = ");
            sb.append(this.mDelegateTargeted);
            l.c("BeiZisAd", sb.toString());
            z4 = this.mDelegateTargeted;
        }
        if (z4) {
            View view = this.mDelegateView;
            if (r3) {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            } else {
                float f5 = -(this.mSlop * 2);
                motionEvent.setLocation(f5, f5);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
        return false;
    }
}

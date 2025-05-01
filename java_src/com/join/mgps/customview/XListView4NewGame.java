package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
/* loaded from: classes4.dex */
public class XListView4NewGame extends XListView2 {
    public static final String I = "XListView4NewGame";
    private int G;
    private GestureDetector H;

    /* loaded from: classes4.dex */
    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            return Math.abs(f6) > Math.abs(f5) * 1.5f;
        }
    }

    public XListView4NewGame(Context context) {
        super(context);
        this.G = 0;
        this.H = new GestureDetector(new a());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.H.onTouchEvent(motionEvent)) {
            if (this.G != 0) {
                return false;
            }
            this.G = 1;
            if (motionEvent.getAction() == 1) {
                this.G = 0;
            }
        }
        this.G = 0;
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.join.mgps.customview.XListView2, android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            motionEvent.getRawY();
            this.f48162b = motionEvent.getRawY();
            motionEvent.getRawX();
            this.f48163c = motionEvent.getRawX();
            if (!this.H.onTouchEvent(motionEvent)) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public XListView4NewGame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = 0;
        this.H = new GestureDetector(new a());
    }

    public XListView4NewGame(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.G = 0;
        this.H = new GestureDetector(new a());
    }
}

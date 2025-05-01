package com.join.mgps.customview;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes4.dex */
public class HorizontalRecyclerView extends RecyclerView {

    /* renamed from: b  reason: collision with root package name */
    private LinearLayoutManager f47193b;

    /* renamed from: c  reason: collision with root package name */
    private double f47194c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f47195d;

    /* renamed from: e  reason: collision with root package name */
    private float f47196e;

    /* renamed from: f  reason: collision with root package name */
    private float f47197f;

    /* renamed from: g  reason: collision with root package name */
    private int f47198g;

    /* renamed from: h  reason: collision with root package name */
    private int f47199h;

    /* loaded from: classes4.dex */
    public static class MyLinearSmoothScroller extends LinearSmoothScroller {

        /* renamed from: a  reason: collision with root package name */
        private static final float f47200a = 400.0f;

        public MyLinearSmoothScroller(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDtToFit(int i4, int i5, int i6, int i7, int i8) {
            if (i8 != -1 && i8 != 0) {
                if (i8 == 1) {
                    return i7 - i5;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            return i6 - i4;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return f47200a / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends LinearLayoutManager {

        /* renamed from: a  reason: collision with root package name */
        public double f47201a;

        /* renamed from: com.join.mgps.customview.HorizontalRecyclerView$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class C0353a extends MyLinearSmoothScroller {
            C0353a(Context context) {
                super(context);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public PointF computeScrollVectorForPosition(int i4) {
                return super.computeScrollVectorForPosition(i4);
            }
        }

        a(Context context) {
            super(context);
            this.f47201a = 0.8199999928474426d;
        }

        public void a(double d5) {
            this.f47201a = d5;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public int scrollHorizontallyBy(int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
            double d5 = this.f47201a;
            double d6 = i4;
            Double.isNaN(d6);
            int scrollHorizontallyBy = super.scrollHorizontallyBy((int) (d5 * d6), recycler, state);
            double d7 = this.f47201a;
            Double.isNaN(d6);
            return scrollHorizontallyBy == ((int) (d7 * d6)) ? i4 : scrollHorizontallyBy;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i4) {
            C0353a c0353a = new C0353a(recyclerView.getContext());
            c0353a.setTargetPosition(i4);
            startSmoothScroll(c0353a);
        }
    }

    public HorizontalRecyclerView(Context context) {
        super(context);
        this.f47194c = 1.2d;
        this.f47195d = false;
        a(context);
    }

    private void a(Context context) {
        a aVar = new a(context);
        this.f47193b = aVar;
        aVar.setOrientation(0);
        setLayoutManager(this.f47193b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f47198g = (int) motionEvent.getX();
            this.f47199h = (int) motionEvent.getY();
        } else if (action == 2) {
            int x4 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (Math.abs(x4 - this.f47198g) > Math.abs(y2 - this.f47199h)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.f47198g = x4;
            this.f47199h = y2;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i4, int i5) {
        double d5 = i4;
        double d6 = this.f47194c;
        Double.isNaN(d5);
        return super.fling((int) (d5 * d6), i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f47196e = motionEvent.getRawX();
            this.f47197f = motionEvent.getRawY();
        } else if (action == 2) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (Math.abs(rawX - this.f47196e) > Math.abs(rawY - this.f47197f) && this.f47195d) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.f47196e = motionEvent.getRawX();
            this.f47197f = motionEvent.getRawY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setRequestDisallowInterceptTouchEvent(boolean z4) {
        this.f47195d = z4;
    }

    public HorizontalRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47194c = 1.2d;
        this.f47195d = false;
        a(context);
    }

    public HorizontalRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47194c = 1.2d;
        this.f47195d = false;
        a(context);
    }
}

package com.join.mgps.customview;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import java.util.LinkedList;
import java.util.Queue;
/* loaded from: classes4.dex */
public class HorizontalListView extends android.widget.AdapterView<ListAdapter> {

    /* renamed from: b  reason: collision with root package name */
    public boolean f47173b;

    /* renamed from: c  reason: collision with root package name */
    protected ListAdapter f47174c;

    /* renamed from: d  reason: collision with root package name */
    private int f47175d;

    /* renamed from: e  reason: collision with root package name */
    private int f47176e;

    /* renamed from: f  reason: collision with root package name */
    protected int f47177f;

    /* renamed from: g  reason: collision with root package name */
    protected int f47178g;

    /* renamed from: h  reason: collision with root package name */
    private int f47179h;

    /* renamed from: i  reason: collision with root package name */
    private int f47180i;

    /* renamed from: j  reason: collision with root package name */
    protected Scroller f47181j;

    /* renamed from: k  reason: collision with root package name */
    private GestureDetector f47182k;

    /* renamed from: l  reason: collision with root package name */
    private Queue<View> f47183l;

    /* renamed from: m  reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f47184m;

    /* renamed from: n  reason: collision with root package name */
    private AdapterView.OnItemClickListener f47185n;

    /* renamed from: o  reason: collision with root package name */
    private AdapterView.OnItemLongClickListener f47186o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f47187p;

    /* renamed from: q  reason: collision with root package name */
    private DataSetObserver f47188q;

    /* renamed from: r  reason: collision with root package name */
    private GestureDetector.OnGestureListener f47189r;

    /* loaded from: classes4.dex */
    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            synchronized (HorizontalListView.this) {
                HorizontalListView.this.f47187p = true;
            }
            HorizontalListView.this.invalidate();
            HorizontalListView.this.requestLayout();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            HorizontalListView.this.p();
            HorizontalListView.this.invalidate();
            HorizontalListView.this.requestLayout();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HorizontalListView.this.requestLayout();
        }
    }

    /* loaded from: classes4.dex */
    class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        private boolean a(MotionEvent motionEvent, View view) {
            Rect rect = new Rect();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i4 = iArr[0];
            int i5 = iArr[1];
            rect.set(i4, i5, view.getWidth() + i4, view.getHeight() + i5);
            return rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return HorizontalListView.this.l(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            return HorizontalListView.this.m(motionEvent, motionEvent2, f5, f6);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            int childCount = HorizontalListView.this.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = HorizontalListView.this.getChildAt(i4);
                if (a(motionEvent, childAt)) {
                    if (HorizontalListView.this.f47186o != null) {
                        AdapterView.OnItemLongClickListener onItemLongClickListener = HorizontalListView.this.f47186o;
                        HorizontalListView horizontalListView = HorizontalListView.this;
                        int i5 = horizontalListView.f47175d + 1 + i4;
                        HorizontalListView horizontalListView2 = HorizontalListView.this;
                        onItemLongClickListener.onItemLongClick(horizontalListView, childAt, i5, horizontalListView2.f47174c.getItemId(horizontalListView2.f47175d + 1 + i4));
                        return;
                    }
                    return;
                }
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            HorizontalListView horizontalListView;
            synchronized (HorizontalListView.this) {
                horizontalListView = HorizontalListView.this;
                horizontalListView.f47178g += (int) f5;
            }
            horizontalListView.requestLayout();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            int i4 = 0;
            while (true) {
                if (i4 >= HorizontalListView.this.getChildCount()) {
                    break;
                }
                View childAt = HorizontalListView.this.getChildAt(i4);
                if (a(motionEvent, childAt)) {
                    if (HorizontalListView.this.f47185n != null) {
                        AdapterView.OnItemClickListener onItemClickListener = HorizontalListView.this.f47185n;
                        HorizontalListView horizontalListView = HorizontalListView.this;
                        int i5 = horizontalListView.f47175d + 1 + i4;
                        HorizontalListView horizontalListView2 = HorizontalListView.this;
                        onItemClickListener.onItemClick(horizontalListView, childAt, i5, horizontalListView2.f47174c.getItemId(horizontalListView2.f47175d + 1 + i4));
                    }
                    if (HorizontalListView.this.f47184m != null) {
                        AdapterView.OnItemSelectedListener onItemSelectedListener = HorizontalListView.this.f47184m;
                        HorizontalListView horizontalListView3 = HorizontalListView.this;
                        int i6 = horizontalListView3.f47175d + 1 + i4;
                        HorizontalListView horizontalListView4 = HorizontalListView.this;
                        onItemSelectedListener.onItemSelected(horizontalListView3, childAt, i6, horizontalListView4.f47174c.getItemId(horizontalListView4.f47175d + 1 + i4));
                    }
                } else {
                    i4++;
                }
            }
            return true;
        }
    }

    public HorizontalListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47173b = true;
        this.f47175d = -1;
        this.f47176e = 0;
        this.f47179h = Integer.MAX_VALUE;
        this.f47180i = 0;
        this.f47183l = new LinkedList();
        this.f47187p = false;
        this.f47188q = new a();
        this.f47189r = new c();
        k();
    }

    private void g(View view, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        addViewInLayout(view, i4, layoutParams, true);
        view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
    }

    private void h(int i4) {
        View childAt = getChildAt(getChildCount() - 1);
        j(childAt != null ? childAt.getRight() : 0, i4);
        View childAt2 = getChildAt(0);
        i(childAt2 != null ? childAt2.getLeft() : 0, i4);
    }

    private void i(int i4, int i5) {
        int i6;
        while (i4 + i5 > 0 && (i6 = this.f47175d) >= 0) {
            View view = this.f47174c.getView(i6, this.f47183l.poll(), this);
            g(view, 0);
            i4 -= view.getMeasuredWidth();
            this.f47175d--;
            this.f47180i -= view.getMeasuredWidth();
        }
    }

    private void j(int i4, int i5) {
        while (i4 + i5 < getWidth() && this.f47176e < this.f47174c.getCount()) {
            View view = this.f47174c.getView(this.f47176e, this.f47183l.poll(), this);
            g(view, -1);
            i4 += view.getMeasuredWidth();
            if (this.f47176e == this.f47174c.getCount() - 1) {
                this.f47179h = (this.f47177f + i4) - getWidth();
            }
            if (this.f47179h < 0) {
                this.f47179h = 0;
            }
            this.f47176e++;
        }
    }

    private synchronized void k() {
        this.f47175d = -1;
        this.f47176e = 0;
        this.f47180i = 0;
        this.f47177f = 0;
        this.f47178g = 0;
        this.f47179h = Integer.MAX_VALUE;
        this.f47181j = new Scroller(getContext());
        this.f47182k = new GestureDetector(getContext(), this.f47189r);
    }

    private void n(int i4) {
        if (getChildCount() > 0) {
            int i5 = this.f47180i + i4;
            this.f47180i = i5;
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                int measuredWidth = childAt.getMeasuredWidth();
                childAt.layout(i5, 0, i5 + measuredWidth, childAt.getMeasuredHeight());
                i5 += measuredWidth + childAt.getPaddingRight();
            }
        }
    }

    private void o(int i4) {
        View childAt = getChildAt(0);
        while (childAt != null && childAt.getRight() + i4 <= 0) {
            this.f47180i += childAt.getMeasuredWidth();
            this.f47183l.offer(childAt);
            removeViewInLayout(childAt);
            this.f47175d++;
            childAt = getChildAt(0);
        }
        View childAt2 = getChildAt(getChildCount() - 1);
        while (childAt2 != null && childAt2.getLeft() + i4 >= getWidth()) {
            this.f47183l.offer(childAt2);
            removeViewInLayout(childAt2);
            this.f47176e--;
            childAt2 = getChildAt(getChildCount() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void p() {
        k();
        removeAllViewsInLayout();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f47182k.onTouchEvent(motionEvent) | super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.AdapterView
    public View getSelectedView() {
        return null;
    }

    protected boolean l(MotionEvent motionEvent) {
        this.f47181j.forceFinished(true);
        return true;
    }

    protected boolean m(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
        synchronized (this) {
            this.f47181j.fling(this.f47178g, 0, (int) (-f5), (int) (f6 / 4.0f), 0, this.f47179h, 0, 0);
        }
        requestLayout();
        return true;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected synchronized void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (this.f47174c == null) {
            return;
        }
        if (this.f47187p) {
            int i8 = this.f47177f;
            k();
            removeAllViewsInLayout();
            this.f47178g = i8;
            this.f47187p = false;
        }
        if (this.f47181j.computeScrollOffset()) {
            this.f47178g = this.f47181j.getCurrX();
        }
        if (this.f47178g <= 0) {
            this.f47178g = 0;
            this.f47181j.forceFinished(true);
        }
        int i9 = this.f47178g;
        int i10 = this.f47179h;
        if (i9 >= i10) {
            this.f47178g = i10;
            this.f47181j.forceFinished(true);
        }
        int i11 = this.f47177f - this.f47178g;
        o(i11);
        h(i11);
        n(i11);
        this.f47177f = this.f47178g;
        if (!this.f47181j.isFinished()) {
            post(new b());
        }
    }

    public synchronized void q(int i4) {
        Scroller scroller = this.f47181j;
        int i5 = this.f47178g;
        scroller.startScroll(i5, 0, i4 - (i5 * 2), 0);
        requestLayout();
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f47185n = onItemClickListener;
    }

    @Override // android.widget.AdapterView
    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.f47186o = onItemLongClickListener;
    }

    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f47184m = onItemSelectedListener;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i4) {
    }

    @Override // android.widget.AdapterView
    public ListAdapter getAdapter() {
        return this.f47174c;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.f47174c;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(this.f47188q);
        }
        this.f47174c = listAdapter;
        listAdapter.registerDataSetObserver(this.f47188q);
        p();
    }
}

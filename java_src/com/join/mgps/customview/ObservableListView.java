package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.view.MotionEventCompat;
import com.join.mgps.enums.ScrollState;
/* loaded from: classes4.dex */
public class ObservableListView extends ListView {

    /* renamed from: u  reason: collision with root package name */
    private static final String f47490u = ObservableListView.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private w1.m f47491b;

    /* renamed from: c  reason: collision with root package name */
    private int f47492c;

    /* renamed from: d  reason: collision with root package name */
    private int f47493d;

    /* renamed from: e  reason: collision with root package name */
    private int f47494e;

    /* renamed from: f  reason: collision with root package name */
    private SparseIntArray f47495f;

    /* renamed from: g  reason: collision with root package name */
    private int f47496g;

    /* renamed from: h  reason: collision with root package name */
    private int f47497h;

    /* renamed from: i  reason: collision with root package name */
    private ScrollState f47498i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f47499j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f47500k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f47501l;

    /* renamed from: m  reason: collision with root package name */
    private AbsListView.OnScrollListener f47502m;

    /* renamed from: n  reason: collision with root package name */
    private AbsListView.OnScrollListener f47503n;

    /* renamed from: o  reason: collision with root package name */
    private float f47504o;

    /* renamed from: p  reason: collision with root package name */
    private float f47505p;

    /* renamed from: q  reason: collision with root package name */
    float f47506q;

    /* renamed from: r  reason: collision with root package name */
    float f47507r;

    /* renamed from: s  reason: collision with root package name */
    boolean f47508s;

    /* renamed from: t  reason: collision with root package name */
    private int f47509t;

    /* loaded from: classes4.dex */
    class a implements AbsListView.OnScrollListener {
        a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
            if (ObservableListView.this.f47502m != null) {
                ObservableListView.this.f47502m.onScroll(absListView, i4, i5, i6);
            }
            ObservableListView.this.d();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
            if (ObservableListView.this.f47502m != null) {
                ObservableListView.this.f47502m.onScrollStateChanged(absListView, i4);
            }
        }
    }

    public ObservableListView(Context context) {
        super(context);
        this.f47493d = -1;
        this.f47501l = false;
        this.f47503n = new a();
        this.f47504o = 0.0f;
        this.f47505p = 0.0f;
        this.f47508s = false;
        this.f47509t = 0;
        c();
    }

    private void c() {
        this.f47495f = new SparseIntArray();
        super.setOnScrollListener(this.f47503n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int i4;
        int height;
        int i5;
        int height2;
        if (this.f47491b == null || getChildCount() <= 0) {
            return;
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        int firstVisiblePosition2 = getFirstVisiblePosition();
        int i6 = 0;
        while (firstVisiblePosition2 <= getLastVisiblePosition()) {
            if (this.f47495f.indexOfKey(firstVisiblePosition2) < 0 || getChildAt(i6).getHeight() != this.f47495f.get(firstVisiblePosition2)) {
                this.f47495f.put(firstVisiblePosition2, getChildAt(i6).getHeight());
            }
            firstVisiblePosition2++;
            i6++;
        }
        View childAt = getChildAt(0);
        if (childAt != null) {
            int i7 = this.f47492c;
            if (i7 < firstVisiblePosition) {
                if (firstVisiblePosition - i7 != 1) {
                    i5 = 0;
                    for (int i8 = firstVisiblePosition - 1; i8 > this.f47492c; i8--) {
                        if (this.f47495f.indexOfKey(i8) > 0) {
                            height2 = this.f47495f.get(i8);
                        } else {
                            height2 = childAt.getHeight();
                        }
                        i5 += height2;
                    }
                } else {
                    i5 = 0;
                }
                this.f47494e += this.f47493d + i5;
                this.f47493d = childAt.getHeight();
            } else if (firstVisiblePosition < i7) {
                if (i7 - firstVisiblePosition != 1) {
                    i4 = 0;
                    for (int i9 = i7 - 1; i9 > firstVisiblePosition; i9--) {
                        if (this.f47495f.indexOfKey(i9) > 0) {
                            height = this.f47495f.get(i9);
                        } else {
                            height = childAt.getHeight();
                        }
                        i4 += height;
                    }
                } else {
                    i4 = 0;
                }
                this.f47494e -= childAt.getHeight() + i4;
                this.f47493d = childAt.getHeight();
            } else if (firstVisiblePosition == 0) {
                this.f47493d = childAt.getHeight();
            }
            if (this.f47493d < 0) {
                this.f47493d = 0;
            }
            this.f47497h = this.f47494e - childAt.getTop();
            this.f47492c = firstVisiblePosition;
            if (childAt.getTop() == 0) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f47491b.a(this.f47497h, this.f47499j, this.f47500k);
            if (this.f47499j) {
                this.f47499j = false;
            }
            int i10 = this.f47496g;
            int i11 = this.f47497h;
            if (i10 < i11) {
                this.f47498i = ScrollState.UP;
            } else if (i11 < i10) {
                this.f47498i = ScrollState.DOWN;
            } else {
                this.f47498i = ScrollState.STOP;
            }
            this.f47496g = i11;
        }
    }

    public int getCurrentScrollY() {
        return this.f47497h;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (MotionEventCompat.getActionMasked(motionEvent) == 0) {
            this.f47500k = false;
            this.f47504o = x4;
            this.f47505p = y2;
        }
        if (this.f47501l) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f47491b != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f47508s = false;
                this.f47500k = true;
                this.f47499j = true;
                this.f47506q = motionEvent.getX();
                this.f47507r = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (actionMasked == 1) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (actionMasked == 2) {
                if (!this.f47508s) {
                    if (Math.abs(motionEvent.getX() - this.f47506q) > Math.abs(motionEvent.getY() - this.f47507r)) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f47508s = true;
                }
                if (this.f47497h == 0) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            } else if (actionMasked == 3) {
                this.f47500k = false;
                this.f47491b.b(this.f47498i);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f47502m = onScrollListener;
    }

    public void setScrollViewCallbacks(w1.m mVar) {
        this.f47491b = mVar;
    }

    public ObservableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47493d = -1;
        this.f47501l = false;
        this.f47503n = new a();
        this.f47504o = 0.0f;
        this.f47505p = 0.0f;
        this.f47508s = false;
        this.f47509t = 0;
        c();
    }

    public ObservableListView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47493d = -1;
        this.f47501l = false;
        this.f47503n = new a();
        this.f47504o = 0.0f;
        this.f47505p = 0.0f;
        this.f47508s = false;
        this.f47509t = 0;
        c();
    }
}

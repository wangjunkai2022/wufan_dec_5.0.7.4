package com.join.mgps.customview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class BounceListView extends ListView implements AbsListView.OnScrollListener {

    /* renamed from: b  reason: collision with root package name */
    View f46417b;

    /* renamed from: c  reason: collision with root package name */
    View f46418c;

    /* renamed from: d  reason: collision with root package name */
    int f46419d;

    /* renamed from: e  reason: collision with root package name */
    int f46420e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = BounceListView.this.f46417b;
            view.setPadding(view.getPaddingLeft(), ((Integer) valueAnimator.getAnimatedValue()).intValue(), BounceListView.this.f46417b.getPaddingRight(), BounceListView.this.f46417b.getPaddingBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = BounceListView.this.f46418c;
            view.setPadding(view.getPaddingLeft(), BounceListView.this.f46418c.getPaddingTop(), BounceListView.this.f46418c.getPaddingRight(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public BounceListView(Context context) {
        super(context);
        d(context);
    }

    private void d(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.header_footer_bounce_listview, (ViewGroup) this, false);
        this.f46417b = inflate;
        addHeaderView(inflate);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.header_footer_bounce_listview, (ViewGroup) this, false);
        this.f46418c = inflate2;
        addFooterView(inflate2);
        super.setOnScrollListener(this);
    }

    protected void b(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i4 = 0; i4 < historySize; i4++) {
            int i5 = this.f46420e;
            View view = this.f46418c;
            view.setPadding(view.getPaddingLeft(), this.f46418c.getPaddingTop(), this.f46418c.getPaddingRight(), (i5 - ((int) motionEvent.getHistoricalY(i4))) / 2);
        }
    }

    protected void c(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i4 = 0; i4 < historySize; i4++) {
            View view = this.f46417b;
            view.setPadding(view.getPaddingLeft(), (((int) motionEvent.getHistoricalY(i4)) - this.f46420e) / 2, this.f46417b.getPaddingRight(), this.f46417b.getPaddingBottom());
        }
    }

    protected void e() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f46418c.getPaddingBottom(), 0);
        ofInt.addUpdateListener(new b());
        ofInt.setDuration(200L);
        ofInt.start();
    }

    protected void f() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f46417b.getPaddingTop(), 0);
        ofInt.addUpdateListener(new a());
        ofInt.setDuration(200L);
        ofInt.start();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        if (this.f46419d == 1) {
            if (i4 == 0) {
                this.f46417b.setVisibility(0);
            } else {
                this.f46417b.setVisibility(8);
                f();
            }
            if (getLastVisiblePosition() == i6 - 1) {
                this.f46418c.setVisibility(0);
                return;
            }
            this.f46418c.setVisibility(8);
            e();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        this.f46419d = i4;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        int y2 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f46420e = y2;
        } else if (action == 1) {
            if (getFirstVisiblePosition() == 0 && (this.f46417b.getBottom() < 0 || this.f46417b.getTop() <= 0)) {
                f();
            }
            ListAdapter adapter = getAdapter();
            if (adapter != null && getLastVisiblePosition() == adapter.getCount() - 1 && (this.f46418c.getTop() < getBottom() || this.f46418c.getBottom() <= getBottom())) {
                e();
            }
        } else if (action == 2) {
            c(motionEvent);
            b(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public BounceListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context);
    }

    public BounceListView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        d(context);
    }
}

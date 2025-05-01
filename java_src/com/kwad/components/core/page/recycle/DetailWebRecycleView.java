package com.kwad.components.core.page.recycle;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.kwad.components.core.s.o;
import com.kwad.sdk.utils.s;
/* loaded from: classes5.dex */
public class DetailWebRecycleView extends b {
    private int Qg;
    private boolean Qh;
    private boolean Qi;
    private int Qj;
    private int Qk;
    private boolean Ql;
    a Qm;
    private Runnable Qn;
    private o Qo;
    private int mf;

    /* loaded from: classes5.dex */
    public interface a {
        boolean qr();
    }

    public DetailWebRecycleView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        postDelayed(this.Qo, 50L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.components.core.page.recycle.b, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Qo);
    }

    @Override // com.kwad.components.core.page.recycle.b, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar = this.Qm;
        if (aVar == null || !aVar.qr()) {
            this.Qk = computeVerticalScrollOffset();
            if (motionEvent.getY() <= this.Qj - this.Qk) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f5, float f6) {
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        this.Qk = computeVerticalScrollOffset;
        if (computeVerticalScrollOffset >= this.Qj) {
            return false;
        }
        fling((int) f5, (int) f6);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        this.Qk = computeVerticalScrollOffset;
        if ((i5 > 0 && computeVerticalScrollOffset < this.Qj) && !this.Ql && computeVerticalScrollOffset < this.mf) {
            scrollBy(0, i5);
            iArr[1] = i5;
        }
        if (i5 < 0 && this.Qk > 0 && !ViewCompat.canScrollVertically(view, -1)) {
            scrollBy(0, i5);
            iArr[1] = i5;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i4) {
        super.onScrollStateChanged(i4);
        if (i4 == 0) {
            View childAt = getLayoutManager().getChildAt(getLayoutManager().getChildCount() - 1);
            if (childAt != null) {
                int bottom = childAt.getBottom();
                int bottom2 = getBottom() - getPaddingBottom();
                int position = getLayoutManager().getPosition(childAt);
                if (bottom == bottom2 && position == getLayoutManager().getItemCount() - 1) {
                    this.Ql = true;
                    return;
                }
            }
            this.Ql = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return (i4 & 2) != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.Qi) {
            this.Qi = false;
        } else if (this.Qh) {
        } else {
            super.requestChildFocus(view, view2);
        }
    }

    public void setInterceptRequestFocusForWeb(boolean z4) {
        this.Qh = z4;
    }

    public void setInterceptRequestFocusForWebFiredOnce(boolean z4) {
        this.Qi = z4;
    }

    public void setInterceptTouchListener(a aVar) {
        this.Qm = aVar;
    }

    public void setTopViewHeight(int i4) {
        this.Qj = i4;
    }

    public DetailWebRecycleView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DetailWebRecycleView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.Qg = 1000;
        this.Qh = false;
        this.Qi = false;
        Runnable runnable = new Runnable() { // from class: com.kwad.components.core.page.recycle.DetailWebRecycleView.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Object field = s.getField(DetailWebRecycleView.this, "mGapWorker");
                    if (field != null) {
                        s.callMethod(field, "postFromTraversal", DetailWebRecycleView.this, 0, Integer.valueOf(DetailWebRecycleView.this.Qg));
                    }
                } catch (RuntimeException e5) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(e5);
                }
            }
        };
        this.Qn = runnable;
        this.Qo = new o(runnable);
        if (context instanceof Activity) {
            this.mf = com.kwad.sdk.c.a.a.e((Activity) context);
        } else {
            this.mf = com.kwad.sdk.c.a.a.getScreenHeight(context);
        }
    }
}

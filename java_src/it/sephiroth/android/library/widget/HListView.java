package it.sephiroth.android.library.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ArrayAdapter;
import android.widget.Checkable;
import android.widget.ListAdapter;
import android.widget.RemoteViews;
import androidx.collection.SparseArrayCompat;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MyInnerScrollView;
import it.sephiroth.android.library.widget.AbsHListView;
import java.util.ArrayList;
@RemoteViews.RemoteView
/* loaded from: classes6.dex */
public class HListView extends AbsHListView {
    static final int I3 = -1;
    private static final float J3 = 0.33f;
    private static final int K3 = 2;
    private static final String L3 = "HListView";
    private boolean A3;
    private boolean B3;
    private boolean C3;
    private final Rect D3;
    private Paint E3;
    private final b F3;
    private d G3;
    private GestureDetector H3;

    /* renamed from: q3  reason: collision with root package name */
    private ArrayList<c> f69484q3;

    /* renamed from: r3  reason: collision with root package name */
    private ArrayList<c> f69485r3;

    /* renamed from: s3  reason: collision with root package name */
    Drawable f69486s3;

    /* renamed from: t3  reason: collision with root package name */
    int f69487t3;

    /* renamed from: u3  reason: collision with root package name */
    int f69488u3;

    /* renamed from: v3  reason: collision with root package name */
    Drawable f69489v3;

    /* renamed from: w3  reason: collision with root package name */
    Drawable f69490w3;

    /* renamed from: x3  reason: collision with root package name */
    private boolean f69491x3;

    /* renamed from: y3  reason: collision with root package name */
    private boolean f69492y3;

    /* renamed from: z3  reason: collision with root package name */
    private boolean f69493z3;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f69494a;

        /* renamed from: b  reason: collision with root package name */
        private int f69495b;

        private b() {
        }

        public int a() {
            return this.f69495b;
        }

        public int b() {
            return this.f69494a;
        }

        void c(int i4, int i5) {
            this.f69494a = i4;
            this.f69495b = i5;
        }
    }

    /* loaded from: classes6.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public View f69496a;

        /* renamed from: b  reason: collision with root package name */
        public Object f69497b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f69498c;
    }

    /* loaded from: classes6.dex */
    private class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private int f69499b;

        /* renamed from: c  reason: collision with root package name */
        private int f69500c;

        private d() {
        }

        public d a(int i4, int i5) {
            this.f69499b = i4;
            this.f69500c = i5;
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            HListView.this.setSelectionFromLeft(this.f69499b, this.f69500c);
        }
    }

    /* loaded from: classes6.dex */
    class e extends GestureDetector.SimpleOnGestureListener {
        e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            return Math.abs(f6) > Math.abs(f5);
        }
    }

    public HListView(Context context) {
        this(context, null);
    }

    private View A1(int i4, int i5) {
        View view;
        View view2;
        boolean z4 = i4 == this.f69442q;
        View K1 = K1(i4, i5, true, this.F1.top, z4);
        this.f69427b = i4;
        int i6 = this.f69487t3;
        if (!this.X1) {
            view = y1(i4 - 1, K1.getLeft() - i6);
            g1();
            view2 = z1(i4 + 1, K1.getRight() + i6);
            int childCount = getChildCount();
            if (childCount > 0) {
                p1(childCount);
            }
        } else {
            View z12 = z1(i4 + 1, K1.getRight() + i6);
            g1();
            View y12 = y1(i4 - 1, K1.getLeft() - i6);
            int childCount2 = getChildCount();
            if (childCount2 > 0) {
                o1(childCount2);
            }
            view = y12;
            view2 = z12;
        }
        return z4 ? K1 : view != null ? view : view2;
    }

    private View B1(View view) {
        boolean z4;
        ViewParent parent = view.getParent();
        while (true) {
            z4 = parent instanceof View;
            if (!z4 || parent == this) {
                break;
            }
            view = (View) parent;
            parent = parent.getParent();
        }
        if (z4) {
            return view;
        }
        return null;
    }

    private int D1(int i4, int i5, int i6) {
        return i6 > 0 ? i4 + i5 : i4;
    }

    private int E1(int i4, int i5, int i6) {
        return i6 != this.f69445t + (-1) ? i4 - i5 : i4;
    }

    private boolean F1(int i4) {
        View selectedView;
        if (i4 != 33 && i4 != 130) {
            throw new IllegalArgumentException("direction must be one of {View.FOCUS_UP, View.FOCUS_DOWN}");
        }
        int childCount = getChildCount();
        if (!this.C3 || childCount <= 0 || this.f69442q == -1 || (selectedView = getSelectedView()) == null || !selectedView.hasFocus() || !(selectedView instanceof ViewGroup)) {
            return false;
        }
        View findFocus = selectedView.findFocus();
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) selectedView, findFocus, i4);
        if (findNextFocus != null) {
            findFocus.getFocusedRect(this.D3);
            offsetDescendantRectToMyCoords(findFocus, this.D3);
            offsetRectIntoDescendantCoords(findNextFocus, this.D3);
            if (findNextFocus.requestFocus(i4, this.D3)) {
                return true;
            }
        }
        View findNextFocus2 = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), findFocus, i4);
        if (findNextFocus2 != null) {
            return I1(findNextFocus2, this);
        }
        return false;
    }

    private void G1(View view, int i4, int i5, boolean z4) {
        View childAt;
        boolean z5;
        if (i5 != -1) {
            int i6 = this.f69442q;
            int i7 = this.f69427b;
            int i8 = i6 - i7;
            int i9 = i5 - i7;
            boolean z6 = true;
            if (i4 == 33) {
                z5 = true;
                childAt = view;
                view = getChildAt(i9);
                i8 = i9;
                i9 = i8;
            } else {
                childAt = getChildAt(i9);
                z5 = false;
            }
            int childCount = getChildCount();
            if (view != null) {
                view.setSelected(!z4 && z5);
                L1(view, i8, childCount);
            }
            if (childAt != null) {
                childAt.setSelected((z4 || z5) ? false : false);
                L1(childAt, i9, childCount);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("newSelectedPosition needs to be valid");
    }

    private boolean H1(View view) {
        ArrayList<c> arrayList = this.f69484q3;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (view == arrayList.get(i4).f69496a) {
                return true;
            }
        }
        ArrayList<c> arrayList2 = this.f69485r3;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            if (view == arrayList2.get(i5).f69496a) {
                return true;
            }
        }
        return false;
    }

    private boolean I1(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && I1((View) parent, view2);
    }

    private int J1(int i4) {
        int i5 = this.f69427b;
        if (i4 == 130) {
            int i6 = this.f69442q;
            int i7 = i6 != -1 ? i6 + 1 : i5;
            if (i7 >= this.U.getCount()) {
                return -1;
            }
            if (i7 < i5) {
                i7 = i5;
            }
            int lastVisiblePosition = getLastVisiblePosition();
            ListAdapter adapter = getAdapter();
            while (i7 <= lastVisiblePosition) {
                if (adapter.isEnabled(i7) && getChildAt(i7 - i5).getVisibility() == 0) {
                    return i7;
                }
                i7++;
            }
        } else {
            int childCount = (getChildCount() + i5) - 1;
            int i8 = this.f69442q;
            if (i8 == -1) {
                i8 = getChildCount() + i5;
            }
            int i9 = i8 - 1;
            if (i9 >= 0 && i9 < this.U.getCount()) {
                if (i9 <= childCount) {
                    childCount = i9;
                }
                ListAdapter adapter2 = getAdapter();
                while (childCount >= i5) {
                    if (adapter2.isEnabled(childCount) && getChildAt(childCount - i5).getVisibility() == 0) {
                        return childCount;
                    }
                    childCount--;
                }
            }
        }
        return -1;
    }

    private View K1(int i4, int i5, boolean z4, int i6, boolean z5) {
        View g4;
        if (!this.f69439n && (g4 = this.A1.g(i4)) != null) {
            a2(g4, i4, i5, z4, i6, z5, true);
            return g4;
        }
        View q02 = q0(i4, this.f69355w2);
        a2(q02, i4, i5, z4, i6, z5, this.f69355w2[0]);
        return q02;
    }

    private void L1(View view, int i4, int i5) {
        int width = view.getWidth();
        N1(view);
        if (view.getMeasuredWidth() == width) {
            return;
        }
        V1(view);
        int measuredWidth = view.getMeasuredWidth() - width;
        while (true) {
            i4++;
            if (i4 >= i5) {
                return;
            }
            getChildAt(i4).offsetLeftAndRight(measuredWidth);
        }
    }

    private void N1(View view) {
        int makeMeasureSpec;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -1);
        }
        int i4 = this.G1;
        Rect rect = this.F1;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, rect.top + rect.bottom, layoutParams.height);
        int i5 = layoutParams.width;
        if (i5 > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(makeMeasureSpec, childMeasureSpec);
    }

    private void O1(View view, int i4, int i5) {
        int makeMeasureSpec;
        AbsHListView.LayoutParams layoutParams = (AbsHListView.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = (AbsHListView.LayoutParams) generateDefaultLayoutParams();
            view.setLayoutParams(layoutParams);
        }
        layoutParams.f69358a = this.U.getItemViewType(i4);
        layoutParams.f69360c = true;
        Rect rect = this.F1;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, rect.top + rect.bottom, ((ViewGroup.LayoutParams) layoutParams).height);
        int i6 = ((ViewGroup.LayoutParams) layoutParams).width;
        if (i6 > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(makeMeasureSpec, childMeasureSpec);
    }

    private View R1(View view, View view2, int i4, int i5, int i6) {
        View K1;
        View K12;
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i7 = this.f69442q;
        int D1 = D1(i5, horizontalFadingEdgeLength, i7);
        int E1 = E1(i5, horizontalFadingEdgeLength, i7);
        if (i4 > 0) {
            View K13 = K1(i7 - 1, view.getLeft(), true, this.F1.top, false);
            int i8 = this.f69487t3;
            K1 = K1(i7, K13.getRight() + i8, true, this.F1.top, true);
            if (K1.getRight() > E1) {
                int i9 = -Math.min(Math.min(K1.getLeft() - D1, K1.getRight() - E1), (i6 - i5) / 2);
                K13.offsetLeftAndRight(i9);
                K1.offsetLeftAndRight(i9);
            }
            if (!this.X1) {
                y1(this.f69442q - 2, K1.getLeft() - i8);
                g1();
                z1(this.f69442q + 1, K1.getRight() + i8);
            } else {
                z1(this.f69442q + 1, K1.getRight() + i8);
                g1();
                y1(this.f69442q - 2, K1.getLeft() - i8);
            }
        } else if (i4 < 0) {
            if (view2 != null) {
                K12 = K1(i7, view2.getLeft(), true, this.F1.top, true);
            } else {
                K12 = K1(i7, view.getLeft(), false, this.F1.top, true);
            }
            K1 = K12;
            if (K1.getLeft() < D1) {
                K1.offsetLeftAndRight(Math.min(Math.min(D1 - K1.getLeft(), E1 - K1.getRight()), (i6 - i5) / 2));
            }
            u1(K1, i7);
        } else {
            int left = view.getLeft();
            K1 = K1(i7, left, true, this.F1.top, true);
            if (left < i5 && K1.getRight() < i5 + 20) {
                K1.offsetLeftAndRight(i5 - K1.getLeft());
            }
            u1(K1, i7);
        }
        return K1;
    }

    private int T1(View view) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (I1(view, getChildAt(i4))) {
                return this.f69427b + i4;
            }
        }
        throw new IllegalArgumentException("newFocus is not a child of any of the children of the list!");
    }

    private void V1(View view) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = this.F1.top;
        int left = view.getLeft();
        view.layout(left, i4, measuredWidth + left, measuredHeight + i4);
    }

    private void W1(View view, ArrayList<c> arrayList) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (arrayList.get(i4).f69496a == view) {
                arrayList.remove(i4);
                return;
            }
        }
    }

    private void Z1(int i4) {
        int i5;
        int i6;
        r0(i4);
        int width = getWidth();
        Rect rect = this.F1;
        int i7 = width - rect.right;
        int i8 = rect.left;
        AbsHListView.l lVar = this.A1;
        if (i4 < 0) {
            int childCount = getChildCount();
            View childAt = getChildAt(childCount - 1);
            while (childAt.getRight() < i7 && (this.f69427b + childCount) - 1 < this.f69445t - 1) {
                childAt = e1(childAt, i6);
                childCount++;
            }
            if (childAt.getBottom() < i7) {
                r0(i7 - childAt.getRight());
            }
            View childAt2 = getChildAt(0);
            while (childAt2.getRight() < i8) {
                if (lVar.q(((AbsHListView.LayoutParams) childAt2.getLayoutParams()).f69358a)) {
                    detachViewFromParent(childAt2);
                    lVar.c(childAt2, this.f69427b);
                } else {
                    removeViewInLayout(childAt2);
                }
                childAt2 = getChildAt(0);
                this.f69427b++;
            }
            return;
        }
        View childAt3 = getChildAt(0);
        while (childAt3.getLeft() > i8 && (i5 = this.f69427b) > 0) {
            childAt3 = f1(childAt3, i5);
            this.f69427b--;
        }
        if (childAt3.getLeft() > i8) {
            r0(i8 - childAt3.getLeft());
        }
        int childCount2 = getChildCount() - 1;
        View childAt4 = getChildAt(childCount2);
        while (childAt4.getLeft() > i7) {
            if (lVar.q(((AbsHListView.LayoutParams) childAt4.getLayoutParams()).f69358a)) {
                detachViewFromParent(childAt4);
                lVar.c(childAt4, this.f69427b + childCount2);
            } else {
                removeViewInLayout(childAt4);
            }
            childCount2--;
            childAt4 = getChildAt(childCount2);
        }
    }

    @TargetApi(11)
    private void a2(View view, int i4, int i5, boolean z4, int i6, boolean z5, boolean z6) {
        int makeMeasureSpec;
        SparseArrayCompat<Boolean> sparseArrayCompat;
        boolean z7 = z5 && K0();
        boolean z8 = z7 != view.isSelected();
        int i7 = this.Q1;
        boolean z9 = i7 > 0 && i7 < 3 && this.L1 == i4;
        boolean z10 = z9 != view.isPressed();
        boolean z11 = !z6 || z8 || view.isLayoutRequested();
        AbsHListView.LayoutParams layoutParams = (AbsHListView.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = (AbsHListView.LayoutParams) generateDefaultLayoutParams();
        }
        int itemViewType = this.U.getItemViewType(i4);
        layoutParams.f69358a = itemViewType;
        if ((z6 && !layoutParams.f69360c) || (layoutParams.f69359b && itemViewType == -2)) {
            attachViewToParent(view, z4 ? -1 : 0, layoutParams);
        } else {
            layoutParams.f69360c = false;
            if (itemViewType == -2) {
                layoutParams.f69359b = true;
            }
            addViewInLayout(view, z4 ? -1 : 0, layoutParams, true);
        }
        if (z8) {
            view.setSelected(z7);
        }
        if (z10) {
            view.setPressed(z9);
        }
        if (this.M != 0 && (sparseArrayCompat = this.Q) != null) {
            if (view instanceof Checkable) {
                ((Checkable) view).setChecked(sparseArrayCompat.get(i4, Boolean.FALSE).booleanValue());
            } else if (Build.VERSION.SDK_INT >= 11) {
                view.setActivated(sparseArrayCompat.get(i4, Boolean.FALSE).booleanValue());
            }
        }
        if (z11) {
            int i8 = this.G1;
            Rect rect = this.F1;
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, rect.top + rect.bottom, ((ViewGroup.LayoutParams) layoutParams).height);
            int i9 = ((ViewGroup.LayoutParams) layoutParams).width;
            if (i9 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(makeMeasureSpec, childMeasureSpec);
        } else {
            cleanupLayoutState(view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = z4 ? i5 : i5 - measuredWidth;
        if (z11) {
            view.layout(i10, i6, measuredWidth + i10, measuredHeight + i6);
        } else {
            view.offsetLeftAndRight(i10 - view.getLeft());
            view.offsetTopAndBottom(i6 - view.getTop());
        }
        if (this.J1 && !view.isDrawingCacheEnabled()) {
            view.setDrawingCacheEnabled(true);
        }
        if (Build.VERSION.SDK_INT < 11 || !z6 || ((AbsHListView.LayoutParams) view.getLayoutParams()).f69361d == i4) {
            return;
        }
        view.jumpDrawablesToCurrentState();
    }

    private boolean b2() {
        return this.f69427b > 0 || getChildAt(0).getLeft() > getScrollX() + this.F1.left;
    }

    private boolean c2() {
        int childCount = getChildCount();
        return (this.f69427b + childCount) - 1 < this.f69445t - 1 || getChildAt(childCount + (-1)).getRight() < (getScrollX() + getWidth()) - this.F1.right;
    }

    private View e1(View view, int i4) {
        int i5 = i4 + 1;
        View q02 = q0(i5, this.f69355w2);
        a2(q02, i5, view.getRight() + this.f69487t3, true, this.F1.top, false, this.f69355w2[0]);
        return q02;
    }

    private View f1(View view, int i4) {
        int i5 = i4 - 1;
        View q02 = q0(i5, this.f69355w2);
        a2(q02, i5, view.getLeft() - this.f69487t3, false, this.F1.top, false, this.f69355w2[0]);
        return q02;
    }

    private void g1() {
        int childCount = getChildCount();
        if (childCount > 0) {
            int i4 = 0;
            if (!this.X1) {
                int left = getChildAt(0).getLeft() - this.F1.left;
                if (this.f69427b != 0) {
                    left -= this.f69487t3;
                }
                if (left >= 0) {
                    i4 = left;
                }
            } else {
                int right = getChildAt(childCount - 1).getRight() - (getWidth() - this.F1.right);
                if (this.f69427b + childCount < this.f69445t) {
                    right += this.f69487t3;
                }
                if (right <= 0) {
                    i4 = right;
                }
            }
            if (i4 != 0) {
                r0(-i4);
            }
        }
    }

    private int getArrowScrollPreviewLength() {
        return Math.max(2, getHorizontalFadingEdgeLength());
    }

    private int h1(int i4, int i5) {
        int width = getWidth();
        Rect rect = this.F1;
        int i6 = width - rect.right;
        int i7 = rect.left;
        int childCount = getChildCount();
        if (i4 == 130) {
            int i8 = childCount - 1;
            int i9 = i5 != -1 ? i5 - this.f69427b : i8;
            int i10 = this.f69427b + i9;
            View childAt = getChildAt(i9);
            int arrowScrollPreviewLength = i10 < this.f69445t + (-1) ? i6 - getArrowScrollPreviewLength() : i6;
            if (childAt.getRight() <= arrowScrollPreviewLength) {
                return 0;
            }
            if (i5 == -1 || arrowScrollPreviewLength - childAt.getLeft() < getMaxScrollAmount()) {
                int right = childAt.getRight() - arrowScrollPreviewLength;
                if (this.f69427b + childCount == this.f69445t) {
                    right = Math.min(right, getChildAt(i8).getRight() - i6);
                }
                return Math.min(right, getMaxScrollAmount());
            }
            return 0;
        }
        int i11 = i5 != -1 ? i5 - this.f69427b : 0;
        int i12 = this.f69427b + i11;
        View childAt2 = getChildAt(i11);
        int arrowScrollPreviewLength2 = i12 > 0 ? getArrowScrollPreviewLength() + i7 : i7;
        if (childAt2.getLeft() >= arrowScrollPreviewLength2) {
            return 0;
        }
        if (i5 == -1 || childAt2.getRight() - arrowScrollPreviewLength2 < getMaxScrollAmount()) {
            int left = arrowScrollPreviewLength2 - childAt2.getLeft();
            if (this.f69427b == 0) {
                left = Math.min(left, i7 - getChildAt(0).getLeft());
            }
            return Math.min(left, getMaxScrollAmount());
        }
        return 0;
    }

    private int i1(int i4, View view, int i5) {
        int i6;
        int arrowScrollPreviewLength;
        view.getDrawingRect(this.D3);
        offsetDescendantRectToMyCoords(view, this.D3);
        if (i4 == 33) {
            int i7 = this.D3.left;
            int i8 = this.F1.left;
            if (i7 < i8) {
                i6 = i8 - i7;
                if (i5 > 0) {
                    arrowScrollPreviewLength = getArrowScrollPreviewLength();
                    return i6 + arrowScrollPreviewLength;
                }
                return i6;
            }
            return 0;
        }
        int width = getWidth() - this.F1.right;
        Rect rect = this.D3;
        if (rect.bottom > width) {
            i6 = rect.right - width;
            if (i5 < this.f69445t - 1) {
                arrowScrollPreviewLength = getArrowScrollPreviewLength();
                return i6 + arrowScrollPreviewLength;
            }
            return i6;
        }
        return 0;
    }

    private b k1(int i4) {
        View findNextFocusFromRect;
        int J1;
        View selectedView = getSelectedView();
        if (selectedView != null && selectedView.hasFocus()) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, selectedView.findFocus(), i4);
        } else {
            if (i4 == 130) {
                int arrowScrollPreviewLength = this.F1.left + (this.f69427b > 0 ? getArrowScrollPreviewLength() : 0);
                if (selectedView != null && selectedView.getLeft() > arrowScrollPreviewLength) {
                    arrowScrollPreviewLength = selectedView.getLeft();
                }
                this.D3.set(arrowScrollPreviewLength, 0, arrowScrollPreviewLength, 0);
            } else {
                int width = (getWidth() - this.F1.right) - ((this.f69427b + getChildCount()) - 1 < this.f69445t ? getArrowScrollPreviewLength() : 0);
                if (selectedView != null && selectedView.getRight() < width) {
                    width = selectedView.getRight();
                }
                this.D3.set(width, 0, width, 0);
            }
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, this.D3, i4);
        }
        if (findNextFocusFromRect != null) {
            int T1 = T1(findNextFocusFromRect);
            int i5 = this.f69442q;
            if (i5 != -1 && T1 != i5 && (J1 = J1(i4)) != -1 && ((i4 == 130 && J1 < T1) || (i4 == 33 && J1 > T1))) {
                return null;
            }
            int i12 = i1(i4, findNextFocusFromRect, T1);
            int maxScrollAmount = getMaxScrollAmount();
            if (i12 < maxScrollAmount) {
                findNextFocusFromRect.requestFocus(i4);
                this.F3.c(T1, i12);
                return this.F3;
            } else if (q1(findNextFocusFromRect) < maxScrollAmount) {
                findNextFocusFromRect.requestFocus(i4);
                this.F3.c(T1, maxScrollAmount);
                return this.F3;
            }
        }
        return null;
    }

    private boolean l1(int i4) {
        View focusedChild;
        if (getChildCount() <= 0) {
            return false;
        }
        View selectedView = getSelectedView();
        int i5 = this.f69442q;
        int J1 = J1(i4);
        int h12 = h1(i4, J1);
        View view = null;
        b k12 = this.C3 ? k1(i4) : null;
        if (k12 != null) {
            J1 = k12.b();
            h12 = k12.a();
        }
        boolean z4 = k12 != null;
        if (J1 != -1) {
            G1(selectedView, i4, J1, k12 != null);
            setSelectedPositionInt(J1);
            setNextSelectedPositionInt(J1);
            selectedView = getSelectedView();
            if (this.C3 && k12 == null && (focusedChild = getFocusedChild()) != null) {
                focusedChild.clearFocus();
            }
            f();
            i5 = J1;
            z4 = true;
        }
        if (h12 > 0) {
            if (i4 != 33) {
                h12 = -h12;
            }
            Z1(h12);
            z4 = true;
        }
        if (this.C3 && k12 == null && selectedView != null && selectedView.hasFocus()) {
            View findFocus = selectedView.findFocus();
            if (!I1(findFocus, this) || q1(findFocus) > 0) {
                findFocus.clearFocus();
            }
        }
        if (J1 != -1 || selectedView == null || I1(selectedView, this)) {
            view = selectedView;
        } else {
            d0();
            this.f69334d2 = -1;
        }
        if (z4) {
            if (view != null) {
                y0(i5, view);
                this.W1 = view.getLeft();
            }
            if (!awakenScrollBars()) {
                invalidate();
            }
            j0();
            return true;
        }
        return false;
    }

    private void m1(ArrayList<c> arrayList) {
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbsHListView.LayoutParams layoutParams = (AbsHListView.LayoutParams) arrayList.get(i4).f69496a.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f69359b = false;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006e, code lost:
        if (C1(130) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009e, code lost:
        if (C1(33) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ca, code lost:
        if (C1(130) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00de, code lost:
        if (C1(33) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0172  */
    @android.annotation.TargetApi(11)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean n1(int r8, int r9, android.view.KeyEvent r10) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.HListView.n1(int, int, android.view.KeyEvent):boolean");
    }

    private void o1(int i4) {
        if (this.f69427b != 0 || i4 <= 0) {
            return;
        }
        int left = getChildAt(0).getLeft();
        int i5 = this.F1.left;
        int right = (getRight() - getLeft()) - this.F1.right;
        int i6 = left - i5;
        View childAt = getChildAt(i4 - 1);
        int right2 = childAt.getRight();
        int i7 = (this.f69427b + i4) - 1;
        if (i6 > 0) {
            int i8 = this.f69445t;
            if (i7 >= i8 - 1 && right2 <= right) {
                if (i7 == i8 - 1) {
                    g1();
                    return;
                }
                return;
            }
            if (i7 == i8 - 1) {
                i6 = Math.min(i6, right2 - right);
            }
            r0(-i6);
            if (i7 < this.f69445t - 1) {
                z1(i7 + 1, childAt.getRight() + this.f69487t3);
                g1();
            }
        }
    }

    private void p1(int i4) {
        if ((this.f69427b + i4) - 1 != this.f69445t - 1 || i4 <= 0) {
            return;
        }
        int right = ((getRight() - getLeft()) - this.F1.right) - getChildAt(i4 - 1).getRight();
        View childAt = getChildAt(0);
        int left = childAt.getLeft();
        if (right > 0) {
            int i5 = this.f69427b;
            if (i5 > 0 || left < this.F1.top) {
                if (i5 == 0) {
                    right = Math.min(right, this.F1.top - left);
                }
                r0(right);
                int i6 = this.f69427b;
                if (i6 > 0) {
                    y1(i6 - 1, childAt.getLeft() - this.f69487t3);
                    g1();
                }
            }
        }
    }

    private int q1(View view) {
        view.getDrawingRect(this.D3);
        offsetDescendantRectToMyCoords(view, this.D3);
        int right = getRight() - getLeft();
        Rect rect = this.F1;
        int i4 = right - rect.right;
        Rect rect2 = this.D3;
        int i5 = rect2.right;
        int i6 = rect.left;
        if (i5 < i6) {
            return i6 - i5;
        }
        int i7 = rect2.left;
        if (i7 > i4) {
            return i7 - i4;
        }
        return 0;
    }

    private void u1(View view, int i4) {
        int i5 = this.f69487t3;
        if (!this.X1) {
            y1(i4 - 1, view.getLeft() - i5);
            g1();
            z1(i4 + 1, view.getRight() + i5);
            return;
        }
        z1(i4 + 1, view.getRight() + i5);
        g1();
        y1(i4 - 1, view.getLeft() - i5);
    }

    private View v1(int i4) {
        int min = Math.min(this.f69427b, this.f69442q);
        this.f69427b = min;
        int min2 = Math.min(min, this.f69445t - 1);
        this.f69427b = min2;
        if (min2 < 0) {
            this.f69427b = 0;
        }
        return z1(this.f69427b, i4);
    }

    private View w1(int i4, int i5) {
        int i6 = i5 - i4;
        int A0 = A0();
        View K1 = K1(A0, i4, true, this.F1.top, true);
        this.f69427b = A0;
        int measuredWidth = K1.getMeasuredWidth();
        if (measuredWidth <= i6) {
            K1.offsetLeftAndRight((i6 - measuredWidth) / 2);
        }
        u1(K1, A0);
        if (!this.X1) {
            p1(getChildCount());
        } else {
            o1(getChildCount());
        }
        return K1;
    }

    private View x1(int i4, int i5, int i6) {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i7 = this.f69442q;
        int D1 = D1(i5, horizontalFadingEdgeLength, i7);
        int E1 = E1(i6, horizontalFadingEdgeLength, i7);
        View K1 = K1(i7, i4, true, this.F1.top, true);
        if (K1.getRight() > E1) {
            K1.offsetLeftAndRight(-Math.min(K1.getLeft() - D1, K1.getRight() - E1));
        } else if (K1.getLeft() < D1) {
            K1.offsetLeftAndRight(Math.min(D1 - K1.getLeft(), E1 - K1.getRight()));
        }
        u1(K1, i7);
        if (!this.X1) {
            p1(getChildCount());
        } else {
            o1(getChildCount());
        }
        return K1;
    }

    private View y1(int i4, int i5) {
        View view = null;
        int i6 = i5;
        while (true) {
            if (i6 <= 0 || i4 < 0) {
                break;
            }
            boolean z4 = i4 == this.f69442q;
            View K1 = K1(i4, i6, false, this.F1.top, z4);
            i6 = K1.getLeft() - this.f69487t3;
            if (z4) {
                view = K1;
            }
            i4--;
        }
        int i7 = i4 + 1;
        this.f69427b = i7;
        J0(i7, (getChildCount() + i7) - 1);
        return view;
    }

    private View z1(int i4, int i5) {
        int right = getRight() - getLeft();
        View view = null;
        int i6 = i5;
        while (true) {
            if (i6 >= right || i4 >= this.f69445t) {
                break;
            }
            boolean z4 = i4 == this.f69442q;
            View K1 = K1(i4, i6, true, this.F1.top, z4);
            i6 = this.f69487t3 + K1.getRight();
            if (z4) {
                view = K1;
            }
            i4++;
        }
        int i7 = this.f69427b;
        J0(i7, (getChildCount() + i7) - 1);
        return view;
    }

    boolean C1(int i4) {
        boolean z4 = false;
        if (i4 == 33) {
            if (this.f69442q != 0) {
                int o4 = o(0, true);
                if (o4 >= 0) {
                    this.S = 1;
                    setSelectionInt(o4);
                    j0();
                }
                z4 = true;
            }
        } else if (i4 == 130) {
            int i5 = this.f69442q;
            int i6 = this.f69445t;
            if (i5 < i6 - 1) {
                int o5 = o(i6 - 1, true);
                if (o5 >= 0) {
                    this.S = 3;
                    setSelectionInt(o5);
                    j0();
                }
                z4 = true;
            }
        }
        if (z4 && !awakenScrollBars()) {
            awakenScrollBars();
            invalidate();
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // it.sephiroth.android.library.widget.AbsHListView
    public void E0() {
        m1(this.f69484q3);
        m1(this.f69485r3);
        super.E0();
        this.S = 0;
    }

    public int[] M1(View view) {
        N1(view);
        return new int[]{view.getMeasuredWidth(), view.getMeasuredHeight()};
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView
    public void O0(int i4) {
        super.O0(i4);
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView
    public void P0(int i4) {
        super.P0(i4);
    }

    final int P1(int i4, int i5, int i6, int i7, int i8) {
        ListAdapter listAdapter = this.U;
        if (listAdapter == null) {
            Rect rect = this.F1;
            return rect.left + rect.right;
        }
        Rect rect2 = this.F1;
        int i9 = rect2.left + rect2.right;
        int i10 = 0;
        int i11 = (this.f69487t3 <= 0 || this.f69486s3 == null) ? 0 : 0;
        if (i6 == -1) {
            i6 = listAdapter.getCount() - 1;
        }
        AbsHListView.l lVar = this.A1;
        boolean U1 = U1();
        boolean[] zArr = this.f69355w2;
        while (i5 <= i6) {
            View q02 = q0(i5, zArr);
            O1(q02, i5, i4);
            if (i5 > 0) {
                i9 += i11;
            }
            if (U1 && lVar.q(((AbsHListView.LayoutParams) q02.getLayoutParams()).f69358a)) {
                lVar.c(q02, -1);
            }
            i9 += q02.getMeasuredWidth();
            if (i9 >= i7) {
                return (i8 < 0 || i5 <= i8 || i10 <= 0 || i9 == i7) ? i7 : i10;
            }
            if (i8 >= 0 && i5 >= i8) {
                i10 = i9;
            }
            i5++;
        }
        return i9;
    }

    final int[] Q1(int i4, int i5, int i6, int i7, int i8, int i9) {
        ListAdapter listAdapter = this.U;
        if (listAdapter == null) {
            Rect rect = this.F1;
            return new int[]{rect.left + rect.right, rect.top + rect.bottom};
        }
        Rect rect2 = this.F1;
        int i10 = rect2.left + rect2.right;
        int i11 = rect2.top + rect2.bottom;
        int i12 = (this.f69487t3 <= 0 || this.f69486s3 == null) ? 0 : 0;
        int i13 = i6;
        if (i13 == -1) {
            i13 = listAdapter.getCount() - 1;
        }
        AbsHListView.l lVar = this.A1;
        boolean U1 = U1();
        boolean[] zArr = this.f69355w2;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = i5; i16 <= i13; i16++) {
            View q02 = q0(i16, zArr);
            O1(q02, i16, i4);
            if (U1 && lVar.q(((AbsHListView.LayoutParams) q02.getLayoutParams()).f69358a)) {
                lVar.c(q02, -1);
            }
            i14 = Math.max(i14, q02.getMeasuredWidth() + i12);
            i15 = Math.max(i15, q02.getMeasuredHeight());
        }
        return new int[]{Math.min(i10 + i14, i7), Math.min(i11 + i15, i8)};
    }

    boolean S1(int i4) {
        int i5;
        boolean z4;
        int o4;
        if (i4 == 33) {
            i5 = Math.max(0, (this.f69442q - getChildCount()) - 1);
        } else if (i4 == 130) {
            i5 = Math.min(this.f69445t - 1, (this.f69442q + getChildCount()) - 1);
            z4 = true;
            if (i5 >= 0 || (o4 = o(i5, z4)) < 0) {
                return false;
            }
            this.S = 4;
            this.f69428c = getPaddingLeft() + getHorizontalFadingEdgeLength();
            if (z4 && o4 > this.f69445t - getChildCount()) {
                this.S = 3;
            }
            if (!z4 && o4 < getChildCount()) {
                this.S = 1;
            }
            setSelectionInt(o4);
            j0();
            if (!awakenScrollBars()) {
                invalidate();
            }
            return true;
        } else {
            i5 = -1;
        }
        z4 = false;
        if (i5 >= 0) {
        }
        return false;
    }

    @ViewDebug.ExportedProperty(category = "list")
    protected boolean U1() {
        return true;
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView
    protected void X(boolean z4) {
        int childCount = getChildCount();
        if (z4) {
            z1(this.f69427b + childCount, childCount > 0 ? this.f69487t3 + getChildAt(childCount - 1).getRight() : 0);
            p1(getChildCount());
            return;
        }
        y1(this.f69427b - 1, childCount > 0 ? getChildAt(0).getLeft() - this.f69487t3 : getWidth() - 0);
        o1(getChildCount());
    }

    public boolean X1(View view) {
        boolean z4 = false;
        if (this.f69485r3.size() > 0) {
            ListAdapter listAdapter = this.U;
            if (listAdapter != null && ((it.sephiroth.android.library.widget.b) listAdapter).d(view)) {
                AbsHListView.c cVar = this.T;
                if (cVar != null) {
                    cVar.onChanged();
                }
                z4 = true;
            }
            W1(view, this.f69485r3);
        }
        return z4;
    }

    public boolean Y1(View view) {
        boolean z4 = false;
        if (this.f69484q3.size() > 0) {
            ListAdapter listAdapter = this.U;
            if (listAdapter != null && ((it.sephiroth.android.library.widget.b) listAdapter).e(view)) {
                AbsHListView.c cVar = this.T;
                if (cVar != null) {
                    cVar.onChanged();
                }
                z4 = true;
            }
            W1(view, this.f69484q3);
        }
        return z4;
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView
    protected int Z(int i4) {
        int childCount = getChildCount();
        if (childCount > 0) {
            if (this.X1) {
                for (int i5 = childCount - 1; i5 >= 0; i5--) {
                    if (i4 >= getChildAt(i5).getLeft()) {
                        return this.f69427b + i5;
                    }
                }
                return -1;
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                if (i4 <= getChildAt(i6).getRight()) {
                    return this.f69427b + i6;
                }
            }
            return -1;
        }
        return -1;
    }

    public void a1(View view) {
        b1(view, null, true);
    }

    public void b1(View view, Object obj, boolean z4) {
        AbsHListView.c cVar;
        c cVar2 = new c();
        cVar2.f69496a = view;
        cVar2.f69497b = obj;
        cVar2.f69498c = z4;
        this.f69485r3.add(cVar2);
        if (this.U == null || (cVar = this.T) == null) {
            return;
        }
        cVar.onChanged();
    }

    public void c1(View view) {
        d1(view, null, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // it.sephiroth.android.library.widget.AdapterView, android.view.ViewGroup
    public boolean canAnimate() {
        return super.canAnimate() && this.f69445t > 0;
    }

    public void d1(View view, Object obj, boolean z4) {
        AbsHListView.c cVar;
        ListAdapter listAdapter = this.U;
        if (listAdapter != null && !(listAdapter instanceof it.sephiroth.android.library.widget.b)) {
            throw new IllegalStateException("Cannot add header view to list -- setAdapter has already been called.");
        }
        c cVar2 = new c();
        cVar2.f69496a = view;
        cVar2.f69497b = obj;
        cVar2.f69498c = z4;
        this.f69484q3.add(cVar2);
        if (this.U == null || (cVar = this.T) == null) {
            return;
        }
        cVar.onChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01be, code lost:
        if (r8.isEnabled(r3 + 1) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0117, code lost:
        if (r8.isEnabled(r7 + 1) == false) goto L65;
     */
    @Override // it.sephiroth.android.library.widget.AbsHListView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatchDraw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.HListView.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        return (dispatchKeyEvent || getFocusedChild() == null || keyEvent.getAction() != 0) ? dispatchKeyEvent : onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j4) {
        boolean drawChild = super.drawChild(canvas, view, j4);
        if (this.K1) {
            this.K1 = false;
        }
        return drawChild;
    }

    @Deprecated
    public long[] getCheckItemIds() {
        SparseArrayCompat<Boolean> sparseArrayCompat;
        ListAdapter listAdapter = this.U;
        if (listAdapter != null && listAdapter.hasStableIds()) {
            return getCheckedItemIds();
        }
        if (this.M == 0 || (sparseArrayCompat = this.Q) == null || this.U == null) {
            return new long[0];
        }
        int size = sparseArrayCompat.size();
        long[] jArr = new long[size];
        ListAdapter listAdapter2 = this.U;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            if (sparseArrayCompat.valueAt(i5).booleanValue()) {
                jArr[i4] = listAdapter2.getItemId(sparseArrayCompat.keyAt(i5));
                i4++;
            }
        }
        if (i4 == size) {
            return jArr;
        }
        long[] jArr2 = new long[i4];
        System.arraycopy(jArr, 0, jArr2, 0, i4);
        return jArr2;
    }

    public Drawable getDivider() {
        return this.f69486s3;
    }

    public int getDividerWidth() {
        return this.f69487t3;
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView
    public int getFooterViewsCount() {
        return this.f69485r3.size();
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView
    public int getHeaderViewsCount() {
        return this.f69484q3.size();
    }

    public boolean getItemsCanFocus() {
        return this.C3;
    }

    public int getMaxScrollAmount() {
        return (int) ((getRight() - getLeft()) * J3);
    }

    public Drawable getOverscrollFooter() {
        return this.f69490w3;
    }

    public Drawable getOverscrollHeader() {
        return this.f69489v3;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        boolean z4 = (this.K1 && this.f69491x3 && this.f69492y3) || super.isOpaque();
        if (z4) {
            Rect rect = this.F1;
            int paddingLeft = rect != null ? rect.left : getPaddingLeft();
            View childAt = getChildAt(0);
            if (childAt != null && childAt.getLeft() <= paddingLeft) {
                int width = getWidth();
                Rect rect2 = this.F1;
                int paddingRight = width - (rect2 != null ? rect2.right : getPaddingRight());
                View childAt2 = getChildAt(getChildCount() - 1);
                if (childAt2 == null || childAt2.getRight() < paddingRight) {
                }
            }
            return false;
        }
        return z4;
    }

    boolean j1(int i4) {
        try {
            this.f69435j = true;
            boolean l12 = l1(i4);
            if (l12) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i4));
            }
            return l12;
        } finally {
            this.f69435j = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // it.sephiroth.android.library.widget.AdapterView
    public int o(int i4, boolean z4) {
        int min;
        ListAdapter listAdapter = this.U;
        if (listAdapter != null && !isInTouchMode()) {
            int count = listAdapter.getCount();
            if (!this.B3) {
                if (z4) {
                    min = Math.max(0, i4);
                    while (min < count && !listAdapter.isEnabled(min)) {
                        min++;
                    }
                } else {
                    min = Math.min(i4, count - 1);
                    while (min >= 0 && !listAdapter.isEnabled(min)) {
                        min--;
                    }
                }
                if (min < 0 || min >= count) {
                    return -1;
                }
                return min;
            } else if (i4 >= 0 && i4 < count) {
                return i4;
            }
        }
        return -1;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        if (childCount > 0) {
            for (int i4 = 0; i4 < childCount; i4++) {
                c1(getChildAt(i4));
            }
            removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // it.sephiroth.android.library.widget.AbsHListView, android.view.View
    public void onFocusChanged(boolean z4, int i4, Rect rect) {
        super.onFocusChanged(z4, i4, rect);
        ListAdapter listAdapter = this.U;
        int i5 = 0;
        int i6 = -1;
        if (listAdapter != null && z4 && rect != null) {
            rect.offset(getScrollX(), getScrollY());
            if (listAdapter.getCount() < getChildCount() + this.f69427b) {
                this.S = 0;
                p0();
            }
            Rect rect2 = this.D3;
            int childCount = getChildCount();
            int i7 = this.f69427b;
            int i8 = 0;
            int i9 = -1;
            int i10 = Integer.MAX_VALUE;
            while (i5 < childCount) {
                if (listAdapter.isEnabled(i7 + i5)) {
                    View childAt = getChildAt(i5);
                    childAt.getDrawingRect(rect2);
                    offsetDescendantRectToMyCoords(childAt, rect2);
                    int c02 = AbsHListView.c0(rect, rect2, i4);
                    if (c02 < i10) {
                        i8 = childAt.getLeft();
                        i9 = i5;
                        i10 = c02;
                    }
                }
                i5++;
            }
            i5 = i8;
            i6 = i9;
        }
        if (i6 >= 0) {
            setSelectionFromLeft(i6 + this.f69427b, i5);
        } else {
            requestLayout();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView, it.sephiroth.android.library.widget.AdapterView, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(HListView.class.getName());
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView, it.sephiroth.android.library.widget.AdapterView, android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(HListView.class.getName());
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        return n1(i4, 1, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i4, int i5, KeyEvent keyEvent) {
        return n1(i4, i5, keyEvent);
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        return n1(i4, 1, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // it.sephiroth.android.library.widget.AbsHListView, android.view.View
    @TargetApi(11)
    public void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        ListAdapter listAdapter = this.U;
        int count = listAdapter == null ? 0 : listAdapter.getCount();
        this.f69445t = count;
        if (count <= 0 || !(mode == 0 || mode2 == 0)) {
            i6 = 0;
            i7 = 0;
        } else {
            View q02 = q0(0, this.f69355w2);
            O1(q02, 0, i5);
            int measuredWidth = q02.getMeasuredWidth();
            int measuredHeight = q02.getMeasuredHeight();
            r3 = Build.VERSION.SDK_INT >= 11 ? ViewGroup.combineMeasuredStates(0, q02.getMeasuredState()) : 0;
            if (U1() && this.A1.q(((AbsHListView.LayoutParams) q02.getLayoutParams()).f69358a)) {
                this.A1.c(q02, -1);
            }
            i6 = r3;
            i7 = measuredWidth;
            r3 = measuredHeight;
        }
        if (mode2 == 0) {
            Rect rect = this.F1;
            size2 = rect.top + rect.bottom + r3 + getHorizontalScrollbarHeight();
        } else if (mode2 == Integer.MIN_VALUE && this.f69445t > 0 && (i8 = this.f69488u3) > -1) {
            size2 = Q1(i5, i8, i8, size, size2, -1)[1];
        } else if (Build.VERSION.SDK_INT >= 11) {
            size2 |= (-16777216) & i6;
        }
        if (mode == 0) {
            Rect rect2 = this.F1;
            size = (getHorizontalFadingEdgeLength() * 2) + rect2.left + rect2.right + i7;
        }
        int i9 = size;
        if (mode == Integer.MIN_VALUE) {
            i9 = P1(i5, 0, -1, i9, -1);
        }
        setMeasuredDimension(i9, size2);
        this.G1 = i5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // it.sephiroth.android.library.widget.AbsHListView, android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        View focusedChild;
        if (getChildCount() > 0 && (focusedChild = getFocusedChild()) != null) {
            int indexOfChild = this.f69427b + indexOfChild(focusedChild);
            int left = focusedChild.getLeft() - Math.max(0, focusedChild.getRight() - (i4 - getPaddingLeft()));
            if (this.G3 == null) {
                this.G3 = new d();
            }
            post(this.G3.a(indexOfChild, left));
        }
        super.onSizeChanged(i4, i5, i6, i7);
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.H3.onTouchEvent(motionEvent)) {
            getParent().getParent().requestDisallowInterceptTouchEvent(false);
            try {
                if (getParent().getParent() instanceof MyInnerScrollView) {
                    ((MyInnerScrollView) getParent().getParent()).getParentScrollView().setIsInnerScroll(false);
                    return true;
                }
                return true;
            } catch (Exception e5) {
                e5.printStackTrace();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b1, code lost:
        r0 = getFocusedChild();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b5, code lost:
        if (r0 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b7, code lost:
        r0.clearFocus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ba, code lost:
        y0(-1, r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a A[Catch: all -> 0x026c, TryCatch #0 {all -> 0x026c, blocks: (B:5:0x000a, B:7:0x0014, B:11:0x001f, B:20:0x0046, B:23:0x004f, B:25:0x0055, B:27:0x005d, B:29:0x0062, B:36:0x0086, B:38:0x008a, B:39:0x008d, B:41:0x0091, B:45:0x009c, B:47:0x00a4, B:51:0x00b2, B:53:0x00c3, B:56:0x00cb, B:63:0x00de, B:65:0x00e4, B:66:0x00ec, B:68:0x00f1, B:78:0x013b, B:95:0x0187, B:97:0x018c, B:99:0x0191, B:101:0x0197, B:105:0x01a1, B:112:0x01b1, B:114:0x01b7, B:115:0x01ba, B:118:0x01cb, B:132:0x01ff, B:134:0x0205, B:135:0x0208, B:137:0x0211, B:138:0x0217, B:140:0x0226, B:141:0x0229, B:116:0x01be, B:107:0x01a7, B:117:0x01c8, B:119:0x01d2, B:123:0x01d9, B:125:0x01e4, B:127:0x01f2, B:130:0x01fa, B:126:0x01ea, B:79:0x0148, B:80:0x015b, B:82:0x015f, B:87:0x016a, B:86:0x0166, B:88:0x016f, B:93:0x017c, B:92:0x0178, B:94:0x0181, B:69:0x00f4, B:70:0x00fc, B:71:0x0106, B:72:0x0112, B:74:0x0120, B:75:0x0129, B:76:0x012e, B:60:0x00d5, B:62:0x00db, B:52:0x00c0, B:145:0x0232, B:146:0x026b, B:30:0x0072, B:33:0x007b), top: B:152:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091 A[Catch: all -> 0x026c, TRY_LEAVE, TryCatch #0 {all -> 0x026c, blocks: (B:5:0x000a, B:7:0x0014, B:11:0x001f, B:20:0x0046, B:23:0x004f, B:25:0x0055, B:27:0x005d, B:29:0x0062, B:36:0x0086, B:38:0x008a, B:39:0x008d, B:41:0x0091, B:45:0x009c, B:47:0x00a4, B:51:0x00b2, B:53:0x00c3, B:56:0x00cb, B:63:0x00de, B:65:0x00e4, B:66:0x00ec, B:68:0x00f1, B:78:0x013b, B:95:0x0187, B:97:0x018c, B:99:0x0191, B:101:0x0197, B:105:0x01a1, B:112:0x01b1, B:114:0x01b7, B:115:0x01ba, B:118:0x01cb, B:132:0x01ff, B:134:0x0205, B:135:0x0208, B:137:0x0211, B:138:0x0217, B:140:0x0226, B:141:0x0229, B:116:0x01be, B:107:0x01a7, B:117:0x01c8, B:119:0x01d2, B:123:0x01d9, B:125:0x01e4, B:127:0x01f2, B:130:0x01fa, B:126:0x01ea, B:79:0x0148, B:80:0x015b, B:82:0x015f, B:87:0x016a, B:86:0x0166, B:88:0x016f, B:93:0x017c, B:92:0x0178, B:94:0x0181, B:69:0x00f4, B:70:0x00fc, B:71:0x0106, B:72:0x0112, B:74:0x0120, B:75:0x0129, B:76:0x012e, B:60:0x00d5, B:62:0x00db, B:52:0x00c0, B:145:0x0232, B:146:0x026b, B:30:0x0072, B:33:0x007b), top: B:152:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c A[Catch: all -> 0x026c, TRY_ENTER, TryCatch #0 {all -> 0x026c, blocks: (B:5:0x000a, B:7:0x0014, B:11:0x001f, B:20:0x0046, B:23:0x004f, B:25:0x0055, B:27:0x005d, B:29:0x0062, B:36:0x0086, B:38:0x008a, B:39:0x008d, B:41:0x0091, B:45:0x009c, B:47:0x00a4, B:51:0x00b2, B:53:0x00c3, B:56:0x00cb, B:63:0x00de, B:65:0x00e4, B:66:0x00ec, B:68:0x00f1, B:78:0x013b, B:95:0x0187, B:97:0x018c, B:99:0x0191, B:101:0x0197, B:105:0x01a1, B:112:0x01b1, B:114:0x01b7, B:115:0x01ba, B:118:0x01cb, B:132:0x01ff, B:134:0x0205, B:135:0x0208, B:137:0x0211, B:138:0x0217, B:140:0x0226, B:141:0x0229, B:116:0x01be, B:107:0x01a7, B:117:0x01c8, B:119:0x01d2, B:123:0x01d9, B:125:0x01e4, B:127:0x01f2, B:130:0x01fa, B:126:0x01ea, B:79:0x0148, B:80:0x015b, B:82:0x015f, B:87:0x016a, B:86:0x0166, B:88:0x016f, B:93:0x017c, B:92:0x0178, B:94:0x0181, B:69:0x00f4, B:70:0x00fc, B:71:0x0106, B:72:0x0112, B:74:0x0120, B:75:0x0129, B:76:0x012e, B:60:0x00d5, B:62:0x00db, B:52:0x00c0, B:145:0x0232, B:146:0x026b, B:30:0x0072, B:33:0x007b), top: B:152:0x000a }] */
    @Override // it.sephiroth.android.library.widget.AbsHListView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p0() {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.HListView.p0():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r1(Canvas canvas, Rect rect, int i4) {
        Drawable drawable = this.f69486s3;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        int i4;
        int i5;
        int i6;
        int i7 = rect.left;
        rect.offset(view.getLeft(), view.getTop());
        rect.offset(-view.getScrollX(), -view.getScrollY());
        int width = getWidth();
        int scrollX = getScrollX();
        int i8 = scrollX + width;
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (b2() && (this.f69442q > 0 || i7 > horizontalFadingEdgeLength)) {
            scrollX += horizontalFadingEdgeLength;
        }
        int right = getChildAt(getChildCount() - 1).getRight();
        if (c2() && (this.f69442q < this.f69445t - 1 || rect.right < right - horizontalFadingEdgeLength)) {
            i8 -= horizontalFadingEdgeLength;
        }
        int i9 = rect.right;
        if (i9 > i8 && rect.left > scrollX) {
            if (rect.width() > width) {
                i6 = rect.left - scrollX;
            } else {
                i6 = rect.right - i8;
            }
            i4 = Math.min(i6 + 0, right - i8);
        } else if (rect.left >= scrollX || i9 >= i8) {
            i4 = 0;
        } else {
            if (rect.width() > width) {
                i5 = 0 - (i8 - rect.right);
            } else {
                i5 = 0 - (scrollX - rect.left);
            }
            i4 = Math.max(i5, getChildAt(0).getLeft() - scrollX);
        }
        boolean z5 = i4 != 0;
        if (z5) {
            Z1(-i4);
            y0(-1, view);
            this.W1 = view.getTop();
            invalidate();
        }
        return z5;
    }

    void s1(Canvas canvas, Drawable drawable, Rect rect) {
        int minimumWidth = drawable.getMinimumWidth();
        canvas.save();
        canvas.clipRect(rect);
        int i4 = rect.right;
        int i5 = rect.left;
        if (i4 - i5 < minimumWidth) {
            rect.right = i5 + minimumWidth;
        }
        drawable.setBounds(rect);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView
    public void setCacheColorHint(int i4) {
        boolean z4 = (i4 >>> 24) == 255;
        this.f69491x3 = z4;
        if (z4) {
            if (this.E3 == null) {
                this.E3 = new Paint();
            }
            this.E3.setColor(i4);
        }
        super.setCacheColorHint(i4);
    }

    public void setDivider(Drawable drawable) {
        boolean z4 = false;
        if (drawable != null) {
            this.f69487t3 = drawable.getIntrinsicWidth();
        } else {
            this.f69487t3 = 0;
        }
        this.f69486s3 = drawable;
        this.f69492y3 = (drawable == null || drawable.getOpacity() == -1) ? true : true;
        requestLayout();
        invalidate();
    }

    public void setDividerWidth(int i4) {
        this.f69487t3 = i4;
        requestLayout();
        invalidate();
    }

    public void setFooterDividersEnabled(boolean z4) {
        this.A3 = z4;
        invalidate();
    }

    public void setHeaderDividersEnabled(boolean z4) {
        this.f69493z3 = z4;
        invalidate();
    }

    public void setItemsCanFocus(boolean z4) {
        this.C3 = z4;
        if (z4) {
            return;
        }
        setDescendantFocusability(393216);
    }

    public void setOverscrollFooter(Drawable drawable) {
        this.f69490w3 = drawable;
        invalidate();
    }

    public void setOverscrollHeader(Drawable drawable) {
        this.f69489v3 = drawable;
        if (getScrollX() < 0) {
            invalidate();
        }
    }

    @Override // it.sephiroth.android.library.widget.AdapterView
    public void setSelection(int i4) {
        setSelectionFromLeft(i4, 0);
    }

    public void setSelectionAfterHeaderView() {
        int size = this.f69484q3.size();
        if (size > 0) {
            this.f69440o = 0;
        } else if (this.U != null) {
            setSelection(size);
        } else {
            this.f69440o = size;
            this.S = 2;
        }
    }

    public void setSelectionFromLeft(int i4, int i5) {
        if (this.U == null) {
            return;
        }
        if (!isInTouchMode()) {
            i4 = o(i4, true);
            if (i4 >= 0) {
                setNextSelectedPositionInt(i4);
            }
        } else {
            this.f69334d2 = i4;
        }
        if (i4 >= 0) {
            this.S = 4;
            this.f69428c = this.F1.left + i5;
            if (this.f69432g) {
                this.f69429d = i4;
                this.f69430e = this.U.getItemId(i4);
            }
            AbsHListView.k kVar = this.V1;
            if (kVar != null) {
                kVar.f();
            }
            requestLayout();
        }
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView
    public void setSelectionInt(int i4) {
        setNextSelectedPositionInt(i4);
        int i5 = this.f69442q;
        boolean z4 = true;
        if (i5 < 0 || (i4 != i5 - 1 && i4 != i5 + 1)) {
            z4 = false;
        }
        AbsHListView.k kVar = this.V1;
        if (kVar != null) {
            kVar.f();
        }
        p0();
        if (z4) {
            awakenScrollBars();
        }
    }

    void t1(Canvas canvas, Drawable drawable, Rect rect) {
        int minimumWidth = drawable.getMinimumWidth();
        canvas.save();
        canvas.clipRect(rect);
        int i4 = rect.right;
        if (i4 - rect.left < minimumWidth) {
            rect.left = i4 - minimumWidth;
        }
        drawable.setBounds(rect);
        drawable.draw(canvas);
        canvas.restore();
    }

    public HListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hlv_listViewStyle);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // it.sephiroth.android.library.widget.AdapterView
    public ListAdapter getAdapter() {
        return this.U;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // it.sephiroth.android.library.widget.AbsHListView, it.sephiroth.android.library.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        int o4;
        AbsHListView.c cVar;
        ListAdapter listAdapter2 = this.U;
        if (listAdapter2 != null && (cVar = this.T) != null) {
            listAdapter2.unregisterDataSetObserver(cVar);
        }
        E0();
        this.A1.d();
        if (this.f69484q3.size() <= 0 && this.f69485r3.size() <= 0) {
            this.U = listAdapter;
        } else {
            this.U = new it.sephiroth.android.library.widget.b(this.f69484q3, this.f69485r3, listAdapter);
        }
        this.f69448w = -1;
        this.f69449x = Long.MIN_VALUE;
        super.setAdapter(listAdapter);
        ListAdapter listAdapter3 = this.U;
        if (listAdapter3 != null) {
            this.B3 = listAdapter3.areAllItemsEnabled();
            this.f69446u = this.f69445t;
            this.f69445t = this.U.getCount();
            e();
            AbsHListView.c cVar2 = new AbsHListView.c();
            this.T = cVar2;
            this.U.registerDataSetObserver(cVar2);
            this.A1.p(this.U.getViewTypeCount());
            if (this.X1) {
                o4 = o(this.f69445t - 1, false);
            } else {
                o4 = o(0, true);
            }
            setSelectedPositionInt(o4);
            setNextSelectedPositionInt(o4);
            if (this.f69445t == 0) {
                f();
            }
        } else {
            this.B3 = true;
            e();
            f();
        }
        requestLayout();
    }

    public HListView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        boolean z4;
        this.f69484q3 = new ArrayList<>();
        this.f69485r3 = new ArrayList<>();
        boolean z5 = true;
        this.B3 = true;
        int i5 = 0;
        this.C3 = false;
        this.D3 = new Rect();
        CharSequence[] charSequenceArr = null;
        this.F3 = new b();
        this.H3 = new GestureDetector(new e());
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.HListView, i4, 0);
        int i6 = -1;
        if (obtainStyledAttributes != null) {
            charSequenceArr = obtainStyledAttributes.getTextArray(0);
            drawable = obtainStyledAttributes.getDrawable(1);
            drawable2 = obtainStyledAttributes.getDrawable(7);
            drawable3 = obtainStyledAttributes.getDrawable(6);
            i5 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            boolean z6 = obtainStyledAttributes.getBoolean(4, true);
            boolean z7 = obtainStyledAttributes.getBoolean(3, true);
            i6 = obtainStyledAttributes.getInteger(5, -1);
            obtainStyledAttributes.recycle();
            z4 = z7;
            z5 = z6;
        } else {
            drawable = null;
            drawable2 = null;
            drawable3 = null;
            z4 = true;
        }
        if (charSequenceArr != null) {
            setAdapter((ListAdapter) new ArrayAdapter(context, 17367043, charSequenceArr));
        }
        if (drawable != null) {
            setDivider(drawable);
        }
        if (drawable2 != null) {
            setOverscrollHeader(drawable2);
        }
        if (drawable3 != null) {
            setOverscrollFooter(drawable3);
        }
        if (i5 != 0) {
            setDividerWidth(i5);
        }
        this.f69493z3 = z5;
        this.A3 = z4;
        this.f69488u3 = i6;
    }
}

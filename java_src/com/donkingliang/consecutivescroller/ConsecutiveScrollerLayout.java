package com.donkingliang.consecutivescroller;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class ConsecutiveScrollerLayout extends ViewGroup implements ScrollingView, NestedScrollingParent2, NestedScrollingChild2 {
    public static final int A1 = 0;
    public static final int B1 = 1;
    public static final int C1 = 2;
    static final Interpolator D1 = new a();
    private static final int W = 0;

    /* renamed from: p0  reason: collision with root package name */
    private static final int f10216p0 = 1;

    /* renamed from: p1  reason: collision with root package name */
    private static final int f10217p1 = 2;

    /* renamed from: v1  reason: collision with root package name */
    private static final int f10218v1 = 1000;
    private int A;
    private int B;
    private int C;
    private EdgeEffect D;
    private EdgeEffect E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private int K;
    private View L;
    private final List<View> M;
    private final List<View> N;
    private int O;
    private final List<View> P;
    private int Q;
    private g R;
    private e S;
    private int T;
    private boolean U;
    private boolean V;

    /* renamed from: b  reason: collision with root package name */
    private int f10219b;

    /* renamed from: c  reason: collision with root package name */
    int f10220c;

    /* renamed from: d  reason: collision with root package name */
    private OverScroller f10221d;

    /* renamed from: e  reason: collision with root package name */
    private VelocityTracker f10222e;

    /* renamed from: f  reason: collision with root package name */
    private VelocityTracker f10223f;

    /* renamed from: g  reason: collision with root package name */
    private int f10224g;

    /* renamed from: h  reason: collision with root package name */
    private int f10225h;

    /* renamed from: i  reason: collision with root package name */
    private int f10226i;

    /* renamed from: j  reason: collision with root package name */
    private int f10227j;

    /* renamed from: k  reason: collision with root package name */
    private int f10228k;

    /* renamed from: l  reason: collision with root package name */
    private int f10229l;

    /* renamed from: m  reason: collision with root package name */
    private int f10230m;

    /* renamed from: n  reason: collision with root package name */
    private HashMap<Integer, Float> f10231n;

    /* renamed from: o  reason: collision with root package name */
    private final int[] f10232o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10233p;

    /* renamed from: q  reason: collision with root package name */
    private int f10234q;

    /* renamed from: r  reason: collision with root package name */
    protected f f10235r;

    /* renamed from: s  reason: collision with root package name */
    private int f10236s;

    /* renamed from: t  reason: collision with root package name */
    private NestedScrollingParentHelper f10237t;

    /* renamed from: u  reason: collision with root package name */
    private NestedScrollingChildHelper f10238u;

    /* renamed from: v  reason: collision with root package name */
    private final int[] f10239v;

    /* renamed from: w  reason: collision with root package name */
    private final int[] f10240w;

    /* renamed from: x  reason: collision with root package name */
    private View f10241x;

    /* renamed from: y  reason: collision with root package name */
    private int f10242y;

    /* renamed from: z  reason: collision with root package name */
    private int f10243z;

    /* loaded from: classes2.dex */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            float f6 = f5 - 1.0f;
            return (f6 * f6 * f6 * f6 * f6) + 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecyclerView f10251b;

        b(RecyclerView recyclerView) {
            this.f10251b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.donkingliang.consecutivescroller.c.y(this.f10251b);
        }
    }

    /* loaded from: classes2.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConsecutiveScrollerLayout.this.d(false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10254a;

        static {
            int[] iArr = new int[LayoutParams.Align.values().length];
            f10254a = iArr;
            try {
                iArr[LayoutParams.Align.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10254a[LayoutParams.Align.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10254a[LayoutParams.Align.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        void a(@NonNull List<View> list);
    }

    /* loaded from: classes2.dex */
    public interface f {
        void a(View view, int i4, int i5, int i6);
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a(@Nullable View view, @Nullable View view2);
    }

    public ConsecutiveScrollerLayout(Context context) {
        this(context, null);
    }

    private void A() {
        VelocityTracker velocityTracker = this.f10223f;
        if (velocityTracker == null) {
            this.f10223f = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void B() {
        VelocityTracker velocityTracker = this.f10222e;
        if (velocityTracker == null) {
            this.f10222e = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void C() {
        if (this.f10222e == null) {
            this.f10222e = VelocityTracker.obtain();
        }
    }

    private boolean F(int i4, int i5) {
        View x4 = x(i4, i5);
        if (x4 != null) {
            return com.donkingliang.consecutivescroller.c.t(x4);
        }
        return false;
    }

    private boolean G(MotionEvent motionEvent) {
        int findPointerIndex = motionEvent.findPointerIndex(this.f10236s);
        if (findPointerIndex < 0 || findPointerIndex >= motionEvent.getPointerCount()) {
            return true;
        }
        return F(com.donkingliang.consecutivescroller.c.j(this, motionEvent, findPointerIndex), com.donkingliang.consecutivescroller.c.k(this, motionEvent, findPointerIndex));
    }

    private boolean H() {
        if (this.N.size() == this.M.size()) {
            int size = this.N.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (this.N.get(i4) != this.M.get(i4)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private int N(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == 1073741824) {
            i5 = size;
        } else if (mode == Integer.MIN_VALUE) {
            i5 = Math.min(i5, size);
        }
        return ViewGroup.resolveSizeAndState(Math.max(i5, getSuggestedMinimumWidth()), i4, 0);
    }

    private void O(int i4, int i5) {
        int i6 = this.f10219b;
        j(i4);
        int i7 = this.f10219b - i6;
        this.f10238u.dispatchNestedScroll(0, i7, 0, i4 - i7, null, i5);
    }

    private void P(List<View> list) {
        e eVar = this.S;
        if (eVar != null) {
            eVar.a(list);
        }
    }

    private void Q(List<View> list) {
        this.N.clear();
        for (int i4 = 0; i4 < list.size(); i4++) {
            View view = list.get(i4);
            int w4 = w(list, i4);
            if (view.getTop() <= getStickyY() + w4) {
                view.setY(getStickyY() + w4);
                view.setClickable(true);
                this.N.add(view);
            }
        }
        if (H()) {
            return;
        }
        this.M.clear();
        this.M.addAll(this.N);
        this.N.clear();
        P(this.M);
    }

    private void R() {
        VelocityTracker velocityTracker = this.f10223f;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10223f = null;
        }
    }

    private void S() {
        VelocityTracker velocityTracker = this.f10222e;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10222e = null;
        }
    }

    private void T() {
        for (View view : getNonGoneChildren()) {
            view.setTranslationY(0.0f);
        }
    }

    private void U() {
        View m4 = m();
        this.f10241x = m4;
        if (m4 != null) {
            this.f10242y = getScrollY() - this.f10241x.getTop();
        }
    }

    private void V() {
        View view;
        View view2;
        List<View> stickyChildren = getStickyChildren();
        if (!stickyChildren.isEmpty()) {
            int size = stickyChildren.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                stickyChildren.get(i5).setTranslationY(0.0f);
            }
            if (this.G) {
                f();
                Q(stickyChildren);
                return;
            }
            g();
            int i6 = size - 1;
            int i7 = i6;
            while (true) {
                if (i7 < 0) {
                    view2 = null;
                    break;
                }
                View view3 = stickyChildren.get(i7);
                if (view3.getTop() <= getStickyY()) {
                    view2 = i7 != i6 ? stickyChildren.get(i7 + 1) : null;
                    view = view3;
                } else {
                    i7--;
                }
            }
            View view4 = this.L;
            if (view != null) {
                if (view2 != null && !L(view)) {
                    i4 = Math.max(0, view.getHeight() - (view2.getTop() - getStickyY()));
                }
                j0(view, i4);
            }
            if (view4 != view) {
                this.L = view;
                i0(view4, view);
                return;
            }
            return;
        }
        f();
        g();
    }

    private void W(int i4, int i5) {
        f fVar = this.f10235r;
        if (fVar != null) {
            fVar.a(this, i4, i5, this.T);
        }
    }

    private void X(View view, int i4) {
        View p4 = com.donkingliang.consecutivescroller.c.p(view);
        if (p4 instanceof AbsListView) {
            AbsListView absListView = (AbsListView) p4;
            if (Build.VERSION.SDK_INT >= 19) {
                absListView.scrollListBy(i4);
                return;
            }
            return;
        }
        boolean x4 = p4 instanceof RecyclerView ? com.donkingliang.consecutivescroller.c.x((RecyclerView) p4) : false;
        p4.scrollBy(0, i4);
        if (x4) {
            RecyclerView recyclerView = (RecyclerView) p4;
            recyclerView.postDelayed(new b(recyclerView), 0L);
        }
    }

    private void a0(int i4) {
        int i5;
        int i6;
        View bottomView;
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        do {
            int i7 = this.f10243z;
            int i8 = 0;
            if (i7 != -1) {
                View childAt = getChildAt(i7);
                i6 = (childAt.getTop() - this.B) - s(childAt);
                i5 = y(this.f10243z);
                if (this.C >= 1000 || getScrollY() + getPaddingTop() + i5 <= i6 || K()) {
                    this.f10243z = -1;
                    this.A = 0;
                    this.B = 0;
                    this.C = 0;
                    setScrollState(0);
                    break;
                }
            } else {
                i5 = 0;
                i6 = 0;
            }
            if (!K()) {
                if (getScrollY() < this.f10220c) {
                    bottomView = n();
                } else {
                    bottomView = getBottomView();
                }
                if (bottomView != null) {
                    awakenScrollBars();
                    int o4 = com.donkingliang.consecutivescroller.c.o(bottomView);
                    if (o4 < 0) {
                        i8 = Math.max(i4, o4);
                        if (this.f10243z != -1) {
                            i8 = Math.max(i8, i6 - ((getScrollY() + getPaddingTop()) + i5));
                        }
                        X(bottomView, i8);
                    } else {
                        int scrollY = getScrollY();
                        int max = Math.max(Math.max(i4, ((bottomView.getTop() + getPaddingBottom()) - scrollY) - getHeight()), -scrollY);
                        if (this.f10243z != -1) {
                            max = Math.max(max, i6 - ((getScrollY() + getPaddingTop()) + i5));
                        }
                        b0(scrollY + max);
                        i8 = max;
                    }
                    this.f10219b += i8;
                    i4 -= i8;
                }
            }
            if (i8 >= 0) {
                break;
            }
        } while (i4 < 0);
        int computeVerticalScrollOffset2 = computeVerticalScrollOffset();
        if (computeVerticalScrollOffset != computeVerticalScrollOffset2) {
            W(computeVerticalScrollOffset2, computeVerticalScrollOffset);
        }
    }

    private boolean b() {
        return (K() && J()) ? false : true;
    }

    private void b0(int i4) {
        if (i4 < 0) {
            i4 = 0;
        } else {
            int i5 = this.f10220c;
            if (i4 > i5) {
                i4 = i5;
            }
        }
        super.scrollTo(0, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z4, boolean z5) {
        int i4 = this.f10219b;
        View view = this.f10241x;
        if (view != null && z4) {
            if (indexOfChild(view) != -1) {
                b0(this.f10241x.getTop() + this.f10242y);
            }
        } else {
            b0(getScrollY());
        }
        e(true, z5);
        if (i4 != this.f10219b && this.f10241x != m()) {
            scrollTo(0, i4);
        }
        this.f10241x = null;
        this.f10242y = 0;
        T();
        V();
    }

    private void e(boolean z4, boolean z5) {
        int computeVerticalScrollOffset;
        if (z5 || (!this.f10233p && this.f10221d.isFinished() && this.f10243z == -1)) {
            int computeVerticalScrollOffset2 = computeVerticalScrollOffset();
            View m4 = m();
            if (m4 == null) {
                return;
            }
            int indexOfChild = indexOfChild(m4);
            if (z4) {
                while (true) {
                    int l4 = com.donkingliang.consecutivescroller.c.l(m4);
                    int top = m4.getTop() - getScrollY();
                    if (l4 <= 0 || top >= 0) {
                        break;
                    }
                    int min = Math.min(l4, -top);
                    b0(getScrollY() - min);
                    X(m4, min);
                }
            }
            for (int i4 = 0; i4 < indexOfChild; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() != 8 && com.donkingliang.consecutivescroller.c.t(childAt)) {
                    View m5 = com.donkingliang.consecutivescroller.c.m(childAt);
                    if (m5 instanceof com.donkingliang.consecutivescroller.a) {
                        List<View> scrolledViews = ((com.donkingliang.consecutivescroller.a) m5).getScrolledViews();
                        if (scrolledViews != null && !scrolledViews.isEmpty()) {
                            int size = scrolledViews.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                Y(scrolledViews.get(i5));
                            }
                        }
                    } else {
                        Y(m5);
                    }
                }
            }
            while (true) {
                indexOfChild++;
                if (indexOfChild >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(indexOfChild);
                if (childAt2.getVisibility() != 8 && com.donkingliang.consecutivescroller.c.t(childAt2) && (indexOfChild != getChildCount() - 1 || childAt2.getHeight() >= getHeight() || getScrollY() < this.f10220c)) {
                    View m6 = com.donkingliang.consecutivescroller.c.m(childAt2);
                    if (m6 instanceof com.donkingliang.consecutivescroller.a) {
                        List<View> scrolledViews2 = ((com.donkingliang.consecutivescroller.a) m6).getScrolledViews();
                        if (scrolledViews2 != null && !scrolledViews2.isEmpty()) {
                            int size2 = scrolledViews2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                Z(scrolledViews2.get(i6));
                            }
                        }
                    } else {
                        Z(m6);
                    }
                }
            }
            h();
            if (z4 && computeVerticalScrollOffset2 != (computeVerticalScrollOffset = computeVerticalScrollOffset())) {
                W(computeVerticalScrollOffset, computeVerticalScrollOffset2);
            }
            V();
        }
    }

    private void e0(int i4) {
        int i5;
        int i6;
        View bottomView;
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        do {
            int i7 = this.f10243z;
            int i8 = 0;
            if (i7 != -1) {
                View childAt = getChildAt(i7);
                i6 = (childAt.getTop() - this.B) - s(childAt);
                i5 = this.B < 0 ? y(this.f10243z) : 0;
                if (this.C >= 1000 || getScrollY() + getPaddingTop() + i5 >= i6 || J()) {
                    this.f10243z = -1;
                    this.A = 0;
                    this.B = 0;
                    this.C = 0;
                    setScrollState(0);
                    break;
                }
            } else {
                i5 = 0;
                i6 = 0;
            }
            if (!J()) {
                if (getScrollY() < this.f10220c) {
                    bottomView = m();
                } else {
                    bottomView = getBottomView();
                }
                if (bottomView != null) {
                    awakenScrollBars();
                    int l4 = com.donkingliang.consecutivescroller.c.l(bottomView);
                    if (l4 > 0) {
                        i8 = Math.min(i4, l4);
                        if (this.f10243z != -1) {
                            i8 = Math.min(i8, i6 - ((getScrollY() + getPaddingTop()) + i5));
                        }
                        X(bottomView, i8);
                    } else {
                        i8 = Math.min(i4, (bottomView.getBottom() - getPaddingTop()) - getScrollY());
                        if (this.f10243z != -1) {
                            i8 = Math.min(i8, i6 - ((getScrollY() + getPaddingTop()) + i5));
                        }
                        b0(getScrollY() + i8);
                    }
                    this.f10219b += i8;
                    i4 -= i8;
                }
            }
            if (i8 <= 0) {
                break;
            }
        } while (i4 > 0);
        int computeVerticalScrollOffset2 = computeVerticalScrollOffset();
        if (computeVerticalScrollOffset != computeVerticalScrollOffset2) {
            W(computeVerticalScrollOffset2, computeVerticalScrollOffset);
        }
    }

    private void f() {
        View view = this.L;
        if (view != null) {
            this.L = null;
            i0(view, null);
        }
    }

    private void g() {
        if (this.M.isEmpty()) {
            return;
        }
        this.M.clear();
        P(this.M);
    }

    private int getAdjustHeight() {
        List<View> stickyChildren = getStickyChildren();
        int i4 = this.J;
        int size = stickyChildren.size();
        if (this.G) {
            for (int i5 = 0; i5 < size; i5++) {
                View view = stickyChildren.get(i5);
                if (!L(view)) {
                    i4 += view.getMeasuredHeight();
                }
            }
            return i4;
        }
        for (int i6 = size - 1; i6 >= 0; i6--) {
            View view2 = stickyChildren.get(i6);
            if (!L(view2)) {
                return i4 + view2.getMeasuredHeight();
            }
        }
        return i4;
    }

    private View getBottomView() {
        List<View> effectiveChildren = getEffectiveChildren();
        if (effectiveChildren.isEmpty()) {
            return null;
        }
        return effectiveChildren.get(effectiveChildren.size() - 1);
    }

    private List<View> getEffectiveChildren() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && childAt.getHeight() > 0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private List<View> getNonGoneChildren() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, computeVerticalScrollRange() - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    private List<View> getStickyChildren() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && M(childAt)) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private int getStickyY() {
        return getScrollY() + getPaddingTop() + this.K;
    }

    private void h() {
        this.f10219b = computeVerticalScrollOffset();
    }

    private void h0() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!M(childAt) || L(childAt)) {
                arrayList.add(childAt);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = getChildAt(i5);
            if (M(childAt2) && !L(childAt2)) {
                arrayList.add(childAt2);
            }
        }
        this.P.clear();
        this.P.addAll(arrayList);
    }

    private void i(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        view.setOverScrollMode(2);
        ViewCompat.setNestedScrollingEnabled(view, false);
    }

    private void i0(View view, View view2) {
        g gVar = this.R;
        if (gVar != null) {
            gVar.a(view, view2);
        }
    }

    private void j(int i4) {
        if (i4 > 0) {
            e0(i4);
        } else if (i4 < 0) {
            a0(i4);
        }
    }

    private void j0(View view, int i4) {
        view.setY(getStickyY() - i4);
        view.setClickable(true);
    }

    private void k() {
        EdgeEffect edgeEffect = this.D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.E.onRelease();
        }
    }

    private void l() {
        if (getOverScrollMode() != 2) {
            if (this.D == null) {
                Context context = getContext();
                this.D = new EdgeEffect(context);
                this.E = new EdgeEffect(context);
                return;
            }
            return;
        }
        this.D = null;
        this.E = null;
    }

    private void o(int i4) {
        if (Math.abs(i4) > this.f10226i) {
            float f5 = i4;
            if (dispatchNestedPreFling(0.0f, f5)) {
                return;
            }
            dispatchNestedFling(0.0f, f5, (i4 < 0 && !K()) || (i4 > 0 && !J()));
            this.f10221d.fling(0, this.f10219b, 1, i4, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            startNestedScroll(2, 1);
            setScrollState(2);
            this.F = this.f10219b;
            invalidate();
        }
    }

    private int s(View view) {
        if (this.I && view == getChildAt(getChildCount() - 1)) {
            return getAdjustHeight();
        }
        return 0;
    }

    private int t(View view, int i4, int i5, int i6) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i7 = d.f10254a[layoutParams.f10250g.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                return i5 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            }
            return ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + i5 + ((((((i4 - view.getMeasuredWidth()) - i5) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - i6) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) / 2);
        }
        return ((i4 - view.getMeasuredWidth()) - i6) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    private int u(View view) {
        int measuredWidth = view.getMeasuredWidth();
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    private int w(List<View> list, int i4) {
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            View view = list.get(i6);
            if (!L(view)) {
                i5 += view.getMeasuredHeight();
            }
        }
        return i5;
    }

    private View x(int i4, int i5) {
        for (View view : getNonGoneChildren()) {
            if (com.donkingliang.consecutivescroller.c.w(view, i4, i5)) {
                return view;
            }
        }
        return null;
    }

    private int y(int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && com.donkingliang.consecutivescroller.c.t(childAt)) {
                i5 += com.donkingliang.consecutivescroller.c.f(childAt);
            }
            i4++;
        }
        return i5;
    }

    private void z() {
        if (this.f10223f == null) {
            this.f10223f = VelocityTracker.obtain();
        }
    }

    public boolean D() {
        return this.I;
    }

    public boolean E() {
        return this.H;
    }

    public boolean I() {
        return this.G;
    }

    public boolean J() {
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        if (size > 0) {
            boolean z4 = getScrollY() >= this.f10220c && !com.donkingliang.consecutivescroller.c.d(effectiveChildren.get(effectiveChildren.size() - 1), 1);
            if (z4) {
                for (int i4 = size - 1; i4 >= 0; i4--) {
                    View view = effectiveChildren.get(i4);
                    if (com.donkingliang.consecutivescroller.c.t(view) && com.donkingliang.consecutivescroller.c.d(view, 1)) {
                        return false;
                    }
                }
            }
            return z4;
        }
        return true;
    }

    public boolean K() {
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        if (size > 0) {
            boolean z4 = getScrollY() <= 0 && !com.donkingliang.consecutivescroller.c.d(effectiveChildren.get(0), -1);
            if (z4) {
                for (int i4 = size - 1; i4 >= 0; i4--) {
                    View view = effectiveChildren.get(i4);
                    if (com.donkingliang.consecutivescroller.c.t(view) && com.donkingliang.consecutivescroller.c.d(view, -1)) {
                        return false;
                    }
                }
            }
            return z4;
        }
        return true;
    }

    public boolean L(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            return ((LayoutParams) layoutParams).f10248e;
        }
        return false;
    }

    public boolean M(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            return ((LayoutParams) layoutParams).f10246c;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(View view) {
        int i4;
        do {
            i4 = 0;
            int l4 = com.donkingliang.consecutivescroller.c.l(view);
            if (l4 > 0) {
                int f5 = com.donkingliang.consecutivescroller.c.f(view);
                X(view, l4);
                i4 = f5 - com.donkingliang.consecutivescroller.c.f(view);
                continue;
            }
        } while (i4 != 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(View view) {
        int i4;
        do {
            i4 = 0;
            int o4 = com.donkingliang.consecutivescroller.c.o(view);
            if (o4 < 0) {
                int f5 = com.donkingliang.consecutivescroller.c.f(view);
                X(view, o4);
                i4 = f5 - com.donkingliang.consecutivescroller.c.f(view);
                continue;
            }
        } while (i4 != 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        List<View> scrolledViews;
        if (layoutParams instanceof LayoutParams) {
            com.donkingliang.consecutivescroller.b.a((LayoutParams) layoutParams);
        }
        super.addView(view, i4, layoutParams);
        if (com.donkingliang.consecutivescroller.c.t(view)) {
            View m4 = com.donkingliang.consecutivescroller.c.m(view);
            i(m4);
            if ((m4 instanceof com.donkingliang.consecutivescroller.a) && (scrolledViews = ((com.donkingliang.consecutivescroller.a) m4).getScrolledViews()) != null && !scrolledViews.isEmpty()) {
                int size = scrolledViews.size();
                for (int i5 = 0; i5 < size; i5++) {
                    i(scrolledViews.get(i5));
                }
            }
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipToPadding(false);
        }
    }

    public void c() {
        postDelayed(new c(), 20L);
    }

    public void c0(View view) {
        d0(view, 0);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i4) {
        if (i4 > 0) {
            return !J();
        }
        return !K();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        int i4;
        if (this.f10243z != -1 && (i4 = this.A) != 0) {
            if (i4 > 0 && i4 < 200) {
                this.A = i4 + 5;
            }
            int i5 = this.A;
            if (i5 < 0 && i5 > -200) {
                this.A = i5 - 5;
            }
            j(this.A);
            this.C++;
            invalidate();
            return;
        }
        if (this.f10221d.computeScrollOffset()) {
            int currY = this.f10221d.getCurrY();
            int i6 = currY - this.F;
            this.F = currY;
            int[] iArr = this.f10240w;
            iArr[1] = 0;
            dispatchNestedPreScroll(0, i6, iArr, null, 1);
            int i7 = i6 - this.f10240w[1];
            int i8 = this.f10219b;
            j(i7);
            int i9 = this.f10219b - i8;
            int i10 = i7 - i9;
            if ((i10 < 0 && K()) || (i10 > 0 && J())) {
                dispatchNestedScroll(0, i9, 0, i10, this.f10239v, 1);
                i10 += this.f10239v[1];
            }
            if ((i10 < 0 && K()) || (i10 > 0 && J())) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) {
                    l();
                    if (i10 < 0) {
                        if (this.D.isFinished()) {
                            this.D.onAbsorb((int) this.f10221d.getCurrVelocity());
                        }
                    } else if (this.E.isFinished()) {
                        this.E.onAbsorb((int) this.f10221d.getCurrVelocity());
                    }
                }
                k0();
            }
            invalidate();
        }
        if (this.T == 2 && this.f10221d.isFinished()) {
            stopNestedScroll(1);
            e(false, false);
            setScrollState(0);
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        int scrollY = getScrollY();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = nonGoneChildren.get(i4);
            if (com.donkingliang.consecutivescroller.c.t(view)) {
                scrollY += com.donkingliang.consecutivescroller.c.f(view);
            }
        }
        return scrollY;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        int height;
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            View view = nonGoneChildren.get(i5);
            if (!com.donkingliang.consecutivescroller.c.t(view)) {
                height = view.getHeight();
            } else if (com.donkingliang.consecutivescroller.c.c(view)) {
                View p4 = com.donkingliang.consecutivescroller.c.p(view);
                i4 += com.donkingliang.consecutivescroller.c.g(p4) + p4.getPaddingTop() + p4.getPaddingBottom();
            } else {
                height = view.getHeight();
            }
            i4 += height;
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (com.donkingliang.consecutivescroller.c.d(r8, -1) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (((getScrollY() + getPaddingTop()) + r8) < r2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d0(android.view.View r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.indexOfChild(r8)
            r1 = -1
            if (r0 == r1) goto L76
            int r2 = r8.getTop()
            int r2 = r2 - r9
            int r3 = r7.s(r8)
            int r2 = r2 - r3
            r3 = 0
            r4 = 1
            if (r9 < 0) goto L34
            int r5 = r7.getScrollY()
            int r6 = r7.getPaddingTop()
            int r5 = r5 + r6
            if (r5 <= r2) goto L21
            goto L44
        L21:
            int r5 = r7.getScrollY()
            int r6 = r7.getPaddingTop()
            int r5 = r5 + r6
            if (r5 >= r2) goto L2d
            goto L52
        L2d:
            boolean r8 = com.donkingliang.consecutivescroller.c.d(r8, r1)
            if (r8 == 0) goto L53
            goto L44
        L34:
            int r8 = r7.y(r0)
            int r5 = r7.getScrollY()
            int r6 = r7.getPaddingTop()
            int r5 = r5 + r6
            int r5 = r5 + r8
            if (r5 <= r2) goto L46
        L44:
            r3 = -1
            goto L53
        L46:
            int r5 = r7.getScrollY()
            int r6 = r7.getPaddingTop()
            int r5 = r5 + r6
            int r5 = r5 + r8
            if (r5 >= r2) goto L53
        L52:
            r3 = 1
        L53:
            if (r3 == 0) goto L76
            r7.f10243z = r0
            r7.k0()
            r7.B = r9
            r8 = 2
            r7.setScrollState(r8)
        L60:
            if (r3 >= 0) goto L68
            r8 = -200(0xffffffffffffff38, float:NaN)
            r7.j(r8)
            goto L6d
        L68:
            r8 = 200(0xc8, float:2.8E-43)
            r7.j(r8)
        L6d:
            int r8 = r7.C
            int r8 = r8 + r4
            r7.C = r8
            int r8 = r7.f10243z
            if (r8 != r1) goto L60
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.d0(android.view.View, int):void");
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f5, float f6, boolean z4) {
        return this.f10238u.dispatchNestedFling(f5, f6, z4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f5, float f6) {
        return this.f10238u.dispatchNestedPreFling(f5, f6);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i4, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f10238u.dispatchNestedScroll(i4, i5, i6, i7, iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x015e, code lost:
        if (F(r10[0], r10[1]) != false) goto L51;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        int i4;
        super.draw(canvas);
        if (this.O != getScrollY()) {
            this.O = getScrollY();
            V();
        }
        if (this.D != null) {
            int scrollY = getScrollY();
            int i5 = 0;
            if (!this.D.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int i6 = Build.VERSION.SDK_INT;
                if (i6 < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (i6 < 21 || !getClipToPadding()) {
                    i4 = scrollY;
                } else {
                    height -= getPaddingTop() + getPaddingBottom();
                    i4 = getPaddingTop() + scrollY;
                }
                canvas.translate(paddingLeft, i4);
                this.D.setSize(width, height);
                if (this.D.draw(canvas)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                canvas.restoreToCount(save);
            }
            if (this.E.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int i7 = scrollY + height2;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 21 || getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i5 = 0 + getPaddingLeft();
            }
            if (i8 >= 21 && getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                i7 -= getPaddingBottom();
            }
            canvas.translate(i5 - width2, i7);
            canvas.rotate(180.0f, width2, 0.0f);
            this.E.setSize(width2, height2);
            if (this.E.draw(canvas)) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public void f0(View view) {
        g0(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (com.donkingliang.consecutivescroller.c.d(r8, -1) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (((getScrollY() + getPaddingTop()) + r8) < r2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        r1 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g0(android.view.View r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.indexOfChild(r8)
            r1 = -1
            if (r0 == r1) goto L6f
            int r2 = r8.getTop()
            int r2 = r2 - r9
            int r3 = r7.s(r8)
            int r2 = r2 - r3
            r3 = 0
            r4 = 1
            if (r9 < 0) goto L34
            int r5 = r7.getScrollY()
            int r6 = r7.getPaddingTop()
            int r5 = r5 + r6
            if (r5 <= r2) goto L21
            goto L54
        L21:
            int r5 = r7.getScrollY()
            int r6 = r7.getPaddingTop()
            int r5 = r5 + r6
            if (r5 >= r2) goto L2d
            goto L51
        L2d:
            boolean r8 = com.donkingliang.consecutivescroller.c.d(r8, r1)
            if (r8 == 0) goto L53
            goto L54
        L34:
            int r8 = r7.y(r0)
            int r5 = r7.getScrollY()
            int r6 = r7.getPaddingTop()
            int r5 = r5 + r6
            int r5 = r5 + r8
            if (r5 <= r2) goto L45
            goto L54
        L45:
            int r1 = r7.getScrollY()
            int r5 = r7.getPaddingTop()
            int r1 = r1 + r5
            int r1 = r1 + r8
            if (r1 >= r2) goto L53
        L51:
            r1 = 1
            goto L54
        L53:
            r1 = 0
        L54:
            if (r1 == 0) goto L6f
            r7.f10243z = r0
            r7.k0()
            r7.B = r9
            r8 = 2
            r7.setScrollState(r8)
            if (r1 >= 0) goto L68
            r8 = -50
            r7.A = r8
            goto L6c
        L68:
            r8 = 50
            r7.A = r8
        L6c:
            r7.invalidate()
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.g0(android.view.View, int):void");
    }

    public int getAdjustHeightOffset() {
        return this.J;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i4, int i5) {
        int indexOfChild;
        return (this.P.size() <= i5 || (indexOfChild = indexOfChild(this.P.get(i5))) == -1) ? super.getChildDrawingOrder(i4, i5) : indexOfChild;
    }

    public View getCurrentStickyView() {
        return this.L;
    }

    public List<View> getCurrentStickyViews() {
        return this.M;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f10237t.getNestedScrollAxes();
    }

    public e getOnPermanentStickyChangeListener() {
        return this.S;
    }

    public g getOnStickyChangeListener() {
        return this.R;
    }

    public f getOnVerticalScrollChangeListener() {
        return this.f10235r;
    }

    public int getOwnScrollY() {
        return computeVerticalScrollOffset();
    }

    public int getScrollState() {
        return this.T;
    }

    public int getStickyOffset() {
        return this.K;
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i4) {
        return this.f10238u.hasNestedScrollingParent(i4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f10238u.isNestedScrollingEnabled();
    }

    public void k0() {
        if (this.f10221d.isFinished()) {
            return;
        }
        this.f10221d.abortAnimation();
        stopNestedScroll(1);
        if (this.f10243z == -1) {
            setScrollState(0);
        }
    }

    public boolean l0(View view) {
        boolean z4 = this.G;
        return (!z4 && this.L == view) || (z4 && this.M.contains(view));
    }

    public View m() {
        int scrollY = getScrollY() + getPaddingTop();
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = effectiveChildren.get(i4);
            if (view.getTop() <= scrollY && view.getBottom() > scrollY) {
                return view;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i4, int i5, int i6, int i7) {
        com.donkingliang.consecutivescroller.b.a((LayoutParams) view.getLayoutParams());
        super.measureChildWithMargins(view, i4, i5, i6, i7);
    }

    public View n() {
        int height = (getHeight() - getPaddingBottom()) + getScrollY();
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = effectiveChildren.get(i4);
            if (view.getTop() < height && view.getBottom() >= height) {
                return view;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
        if (F(r0[0], r0[1]) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
        if (r0 != 3) goto L9;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getActionMasked()
            if (r0 == 0) goto L34
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L28
            r3 = 2
            if (r0 == r3) goto L11
            r3 = 3
            if (r0 == r3) goto L28
            goto L3c
        L11:
            int r0 = r4.f10234q
            if (r0 == r3) goto L3c
            boolean r0 = r4.G(r5)
            if (r0 != 0) goto L27
            int[] r0 = r4.f10232o
            r1 = r0[r1]
            r0 = r0[r2]
            boolean r0 = r4.F(r1, r0)
            if (r0 == 0) goto L3c
        L27:
            return r2
        L28:
            r4.stopNestedScroll(r1)
            boolean r0 = r4.V
            if (r0 == 0) goto L3c
            int r0 = r4.f10234q
            if (r0 != 0) goto L3c
            return r2
        L34:
            r4.B()
            android.view.VelocityTracker r0 = r4.f10222e
            r0.addMovement(r5)
        L3c:
            boolean r5 = super.onInterceptTouchEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        this.f10220c = 0;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int measuredWidth = getMeasuredWidth();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i8 = 0;
        while (i8 < size) {
            View view = nonGoneChildren.get(i8);
            int measuredHeight = view.getMeasuredHeight() + paddingTop;
            int t4 = t(view, measuredWidth, paddingLeft, paddingRight);
            view.layout(t4, paddingTop, view.getMeasuredWidth() + t4, measuredHeight);
            this.f10220c += view.getHeight();
            i8++;
            paddingTop = measuredHeight;
        }
        int measuredHeight2 = this.f10220c - ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        this.f10220c = measuredHeight2;
        if (measuredHeight2 < 0) {
            this.f10220c = 0;
        }
        d(z4, false);
        h0();
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        U();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            View view = nonGoneChildren.get(i8);
            measureChildWithMargins(view, i4, 0, i5, s(view));
            i6 = Math.max(i6, u(view));
            i7 += view.getMeasuredHeight();
        }
        setMeasuredDimension(N(i4, i6 + getPaddingLeft() + getPaddingRight()), N(i5, i7 + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f5, float f6, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f6, true);
        o((int) f6);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f5, float f6) {
        return dispatchNestedPreFling(f5, f6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        onNestedPreScroll(view, i4, i5, iArr, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NonNull View view, int i4, int i5, int i6, int i7, int i8) {
        O(i7, i8);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i4, int i5) {
        this.f10237t.onNestedScrollAccepted(view, view2, i4, i5);
        e(false, false);
        startNestedScroll(2, i5);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return (layoutParams instanceof LayoutParams ? ((LayoutParams) layoutParams).f10245b : false) && (i4 & 2) != 0;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NonNull View view, int i4) {
        this.f10237t.onStopNestedScroll(view, i4);
        stopNestedScroll(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        if (r0 != 6) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: q */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollBy(int i4, int i5) {
        scrollTo(0, this.f10219b + i5);
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        j(i5 - this.f10219b);
    }

    public void setAdjustHeightOffset(int i4) {
        if (this.J != i4) {
            this.J = i4;
            requestLayout();
        }
    }

    public void setAutoAdjustHeightAtBottomView(boolean z4) {
        if (this.I != z4) {
            this.I = z4;
            requestLayout();
        }
    }

    public void setDisableChildHorizontalScroll(boolean z4) {
        this.H = z4;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z4) {
        this.f10238u.setNestedScrollingEnabled(z4);
    }

    public void setOnPermanentStickyChangeListener(e eVar) {
        this.S = eVar;
    }

    @Override // android.view.View
    @Deprecated
    public void setOnScrollChangeListener(View.OnScrollChangeListener onScrollChangeListener) {
    }

    public void setOnStickyChangeListener(g gVar) {
        this.R = gVar;
    }

    public void setOnVerticalScrollChangeListener(f fVar) {
        this.f10235r = fVar;
    }

    public void setPermanent(boolean z4) {
        if (this.G != z4) {
            this.G = z4;
            if (this.I) {
                requestLayout();
            } else {
                V();
            }
        }
    }

    void setScrollState(int i4) {
        if (i4 == this.T) {
            return;
        }
        this.T = i4;
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        W(computeVerticalScrollOffset, computeVerticalScrollOffset);
    }

    public void setStickyOffset(int i4) {
        if (this.K != i4) {
            this.K = i4;
            V();
        }
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i4, int i5) {
        return this.f10238u.startNestedScroll(i4, i5);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i4) {
        this.f10238u.stopNestedScroll(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int v(View view) {
        return this.P.indexOf(view);
    }

    public ConsecutiveScrollerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i4, int i5, @Nullable int[] iArr, @Nullable int[] iArr2, int i6) {
        return this.f10238u.dispatchNestedPreScroll(i4, i5, iArr, iArr2, i6);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, @Nullable int[] iArr, int i8) {
        return this.f10238u.dispatchNestedScroll(i4, i5, i6, i7, iArr, i8);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NonNull View view, int i4, int i5, @NonNull int[] iArr, int i6) {
        dispatchNestedPreScroll(i4, i5, iArr, null, i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        O(i7, 0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public ConsecutiveScrollerLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f10231n = new HashMap<>();
        this.f10232o = new int[2];
        this.f10233p = false;
        this.f10234q = 0;
        this.f10236s = -1;
        this.f10239v = new int[2];
        this.f10240w = new int[2];
        this.f10243z = -1;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.J = 0;
        this.K = 0;
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.O = 0;
        this.P = new ArrayList();
        this.Q = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        TypedArray typedArray = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.ConsecutiveScrollerLayout);
            this.G = typedArray.getBoolean(3, false);
            this.H = typedArray.getBoolean(2, false);
            this.K = typedArray.getDimensionPixelOffset(4, 0);
            this.I = typedArray.getBoolean(1, false);
            this.J = typedArray.getDimensionPixelOffset(0, 0);
            typedArray.recycle();
            this.f10221d = new OverScroller(getContext(), D1);
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f10225h = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f10226i = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f10227j = ViewConfiguration.getTouchSlop();
            setWillNotDraw(false);
            setVerticalScrollBarEnabled(true);
            this.f10237t = new NestedScrollingParentHelper(this);
            this.f10238u = new NestedScrollingChildHelper(this);
            setNestedScrollingEnabled(true);
            setChildrenDrawingOrderEnabled(true);
            setMotionEventSplittingEnabled(false);
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        onNestedScrollAccepted(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return onStartNestedScroll(view, view2, i4, 0);
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10244a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10245b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10246c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f10247d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f10248e;

        /* renamed from: f  reason: collision with root package name */
        public int f10249f;

        /* renamed from: g  reason: collision with root package name */
        public Align f10250g;

        /* loaded from: classes2.dex */
        public enum Align {
            LEFT(1),
            RIGHT(2),
            CENTER(3);
            
            int value;

            Align(int i4) {
                this.value = i4;
            }

            static Align get(int i4) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            return LEFT;
                        }
                        return CENTER;
                    }
                    return RIGHT;
                }
                return LEFT;
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10244a = true;
            this.f10245b = true;
            this.f10246c = false;
            this.f10247d = false;
            this.f10248e = false;
            this.f10250g = Align.LEFT;
            TypedArray typedArray = null;
            try {
                try {
                    typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.ConsecutiveScrollerLayout_Layout);
                    this.f10244a = typedArray.getBoolean(1, true);
                    this.f10245b = typedArray.getBoolean(2, true);
                    this.f10246c = typedArray.getBoolean(4, false);
                    this.f10247d = typedArray.getBoolean(5, false);
                    this.f10248e = typedArray.getBoolean(3, false);
                    this.f10250g = Align.get(typedArray.getInt(0, 1));
                    this.f10249f = typedArray.getResourceId(6, -1);
                } catch (Exception e5) {
                    e5.printStackTrace();
                    if (typedArray == null) {
                        return;
                    }
                }
                typedArray.recycle();
            } catch (Throwable th) {
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f10244a = true;
            this.f10245b = true;
            this.f10246c = false;
            this.f10247d = false;
            this.f10248e = false;
            this.f10250g = Align.LEFT;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10244a = true;
            this.f10245b = true;
            this.f10246c = false;
            this.f10247d = false;
            this.f10248e = false;
            this.f10250g = Align.LEFT;
        }
    }
}

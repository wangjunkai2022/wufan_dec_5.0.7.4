package com.donkingliang.consecutivescroller;

import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ScrollUtils.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    static Method f10262a;

    /* renamed from: b  reason: collision with root package name */
    static Method f10263b;

    /* renamed from: c  reason: collision with root package name */
    static Method f10264c;

    /* renamed from: d  reason: collision with root package name */
    private static final Rect f10265d = new Rect();

    private static void a(List<View> list, View view, int i4, int i5) {
        if (t(view) && w(view, i4, i5)) {
            list.add(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    a(list, viewGroup.getChildAt(i6), i4, i5);
                }
            }
        }
    }

    static boolean b(View view) {
        return t(view) && (view.canScrollHorizontally(1) || view.canScrollHorizontally(-1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(View view) {
        return t(view) && (d(view, 1) || d(view, -1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(View view, int i4) {
        View p4 = p(view);
        if (p4.getVisibility() == 8) {
            return false;
        }
        if (p4 instanceof AbsListView) {
            AbsListView absListView = (AbsListView) p4;
            if (Build.VERSION.SDK_INT >= 19) {
                return absListView.canScrollList(i4);
            }
            return false;
        } else if (p4 instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) p4;
            if ((recyclerView.canScrollHorizontally(1) || recyclerView.canScrollHorizontally(-1)) && !recyclerView.canScrollVertically(i4)) {
                return false;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (layoutManager != null && adapter != null && adapter.getItemCount() > 0) {
                if (layoutManager.findViewByPosition(i4 > 0 ? adapter.getItemCount() - 1 : 0) == null) {
                    return true;
                }
                int childCount = recyclerView.getChildCount();
                if (i4 > 0) {
                    for (int i5 = childCount - 1; i5 >= 0; i5--) {
                        View childAt = recyclerView.getChildAt(i5);
                        Rect rect = f10265d;
                        recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                        if (rect.bottom > recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            return true;
                        }
                    }
                    return false;
                }
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt2 = recyclerView.getChildAt(i6);
                    Rect rect2 = f10265d;
                    recyclerView.getDecoratedBoundsWithMargins(childAt2, rect2);
                    if (rect2.top < recyclerView.getPaddingTop()) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return p4.canScrollVertically(i4);
        }
    }

    static int e(View view) {
        View p4 = p(view);
        if (p4 instanceof ScrollingView) {
            return ((ScrollingView) p4).computeVerticalScrollExtent();
        }
        try {
            if (f10264c == null) {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollExtent", new Class[0]);
                f10264c = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = f10264c.invoke(p4, new Object[0]);
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return p4.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(View view) {
        View p4 = p(view);
        if (p4 instanceof ScrollingView) {
            return ((ScrollingView) p4).computeVerticalScrollOffset();
        }
        try {
            if (f10262a == null) {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollOffset", new Class[0]);
                f10262a = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = f10262a.invoke(p4, new Object[0]);
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return p4.getScrollY();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(View view) {
        View p4 = p(view);
        if (p4 instanceof ScrollingView) {
            return ((ScrollingView) p4).computeVerticalScrollRange();
        }
        try {
            if (f10263b == null) {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollRange", new Class[0]);
                f10263b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = f10263b.invoke(p4, new Object[0]);
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return p4.getHeight();
    }

    static boolean h(List<Integer> list, List<Integer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!list.get(i4).equals(list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    static List<ConsecutiveScrollerLayout> i(View view, int i4, int i5) {
        ArrayList arrayList = new ArrayList();
        for (View view2 : r(view, i4, i5)) {
            if (view2 instanceof ConsecutiveScrollerLayout) {
                arrayList.add((ConsecutiveScrollerLayout) view2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(View view, MotionEvent motionEvent, int i4) {
        float x4;
        if (Build.VERSION.SDK_INT >= 29) {
            x4 = motionEvent.getRawX(i4);
        } else {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            x4 = iArr[0] + motionEvent.getX(i4);
        }
        return (int) x4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(View view, MotionEvent motionEvent, int i4) {
        float y2;
        if (Build.VERSION.SDK_INT >= 29) {
            y2 = motionEvent.getRawY(i4);
        } else {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            y2 = iArr[1] + motionEvent.getY(i4);
        }
        return (int) y2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(View view) {
        if (t(view) && d(view, 1)) {
            return Math.max((g(view) - f(view)) - e(view), 1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View m(View view) {
        int i4;
        View findViewById;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ConsecutiveScrollerLayout.LayoutParams) && (i4 = ((ConsecutiveScrollerLayout.LayoutParams) layoutParams).f10249f) != -1 && (findViewById = view.findViewById(i4)) != null) {
                return findViewById;
            }
        }
        return view;
    }

    static List<Integer> n(List<View> list) {
        ArrayList arrayList = new ArrayList();
        for (View view : list) {
            arrayList.add(Integer.valueOf(f(view)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(View view) {
        if (t(view) && d(view, -1)) {
            return Math.min(-f(view), -1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View p(View view) {
        View m4 = m(view);
        while (m4 instanceof a) {
            View currentScrollerView = ((a) m4).getCurrentScrollerView();
            if (m4 == currentScrollerView) {
                return currentScrollerView;
            }
            m4 = currentScrollerView;
        }
        return m4;
    }

    static View q(ConsecutiveScrollerLayout consecutiveScrollerLayout, int i4, int i5) {
        int childCount = consecutiveScrollerLayout.getChildCount();
        View view = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = consecutiveScrollerLayout.getChildAt(i6);
            if (childAt.getVisibility() == 0 && w(childAt, i4, i5) && (view == null || ViewCompat.getZ(childAt) > ViewCompat.getZ(view) || (ViewCompat.getZ(childAt) == ViewCompat.getZ(view) && consecutiveScrollerLayout.v(childAt) > consecutiveScrollerLayout.v(view)))) {
                view = childAt;
            }
        }
        return view;
    }

    static List<View> r(View view, int i4, int i5) {
        ArrayList arrayList = new ArrayList();
        a(arrayList, view, i4, i5);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(View view) {
        while ((view.getParent() instanceof ViewGroup) && !(view.getParent() instanceof ConsecutiveScrollerLayout)) {
            view = (View) view.getParent();
        }
        if (view.getParent() instanceof ConsecutiveScrollerLayout) {
            return t(view);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t(View view) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ConsecutiveScrollerLayout.LayoutParams) {
                return ((ConsecutiveScrollerLayout.LayoutParams) layoutParams).f10244a;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean u(android.view.View r1, int r2, int r3) {
        /*
            java.util.List r1 = r(r1, r2, r3)
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            android.view.View r2 = (android.view.View) r2
            r3 = 1
            boolean r0 = r2.canScrollHorizontally(r3)
            if (r0 != 0) goto L22
            r0 = -1
            boolean r2 = r2.canScrollHorizontally(r0)
            if (r2 == 0) goto L8
        L22:
            return r3
        L23:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.donkingliang.consecutivescroller.c.u(android.view.View, int, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean v(View view, int i4, int i5) {
        List<ConsecutiveScrollerLayout> i6 = i(view, i4, i5);
        for (int size = i6.size() - 1; size >= 0; size--) {
            ConsecutiveScrollerLayout consecutiveScrollerLayout = i6.get(size);
            View q4 = q(consecutiveScrollerLayout, i4, i5);
            if (q4 != null && consecutiveScrollerLayout.M(q4) && consecutiveScrollerLayout.l0(q4) && !((ConsecutiveScrollerLayout.LayoutParams) q4.getLayoutParams()).f10247d) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean w(View view, int i4, int i5) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i6 = iArr[0];
        int i7 = iArr[1];
        return i4 >= i6 && i4 <= view.getMeasuredWidth() + i6 && i5 >= i7 && i5 <= view.getMeasuredHeight() + i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean x(RecyclerView recyclerView) {
        if ("InterceptRequestLayout".equals(recyclerView.getTag())) {
            try {
                Method declaredMethod = RecyclerView.class.getDeclaredMethod("startInterceptRequestLayout", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(recyclerView, new Object[0]);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void y(RecyclerView recyclerView) {
        if ("InterceptRequestLayout".equals(recyclerView.getTag())) {
            try {
                Method declaredMethod = RecyclerView.class.getDeclaredMethod("stopInterceptRequestLayout", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(recyclerView, Boolean.FALSE);
            } catch (Exception unused) {
            }
        }
    }
}

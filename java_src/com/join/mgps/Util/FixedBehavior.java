package com.join.mgps.Util;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.Field;
/* loaded from: classes3.dex */
public class FixedBehavior extends AppBarLayout.Behavior {

    /* renamed from: c  reason: collision with root package name */
    private static final String f27399c = "AppbarLayoutBehavior";

    /* renamed from: d  reason: collision with root package name */
    private static final int f27400d = 1;

    /* renamed from: a  reason: collision with root package name */
    private boolean f27401a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f27402b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {
        private a() {
        }

        static void a(String str, String str2) {
        }
    }

    public FixedBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private Field getFlingRunnableField() throws NoSuchFieldException {
        Class<? super Object> superclass = getClass().getSuperclass();
        try {
            if (Build.VERSION.SDK_INT <= 27) {
                Class<? super Object> superclass2 = superclass != null ? superclass.getSuperclass() : null;
                if (superclass2 != null) {
                    return superclass2.getDeclaredField("mFlingRunnable");
                }
                return null;
            }
            Class<? super Object> superclass3 = superclass.getSuperclass().getSuperclass();
            if (superclass3 != null) {
                return superclass3.getDeclaredField("flingRunnable");
            }
            return null;
        } catch (NoSuchFieldException unused) {
            Class<? super Object> superclass4 = superclass.getSuperclass().getSuperclass();
            if (superclass4 != null) {
                return superclass4.getDeclaredField("flingRunnable");
            }
            return null;
        }
    }

    private Field getScrollerField() throws NoSuchFieldException {
        Class<? super Object> superclass = getClass().getSuperclass();
        try {
            if (Build.VERSION.SDK_INT <= 27) {
                Class<? super Object> superclass2 = superclass != null ? superclass.getSuperclass() : null;
                if (superclass2 != null) {
                    return superclass2.getDeclaredField("mScroller");
                }
                return null;
            }
            Class<? super Object> superclass3 = superclass.getSuperclass().getSuperclass();
            if (superclass3 != null) {
                return superclass3.getDeclaredField("scroller");
            }
            return null;
        } catch (NoSuchFieldException unused) {
            Class<? super Object> superclass4 = superclass.getSuperclass().getSuperclass();
            if (superclass4 != null) {
                return superclass4.getDeclaredField("scroller");
            }
            return null;
        }
    }

    private void stopAppbarLayoutFling(AppBarLayout appBarLayout) {
        try {
            Field flingRunnableField = getFlingRunnableField();
            Field scrollerField = getScrollerField();
            if (flingRunnableField != null) {
                flingRunnableField.setAccessible(true);
            }
            if (scrollerField != null) {
                scrollerField.setAccessible(true);
            }
            Runnable runnable = flingRunnableField != null ? (Runnable) flingRunnableField.get(this) : null;
            OverScroller overScroller = (OverScroller) scrollerField.get(this);
            if (runnable != null) {
                a.a(f27399c, "存在flingRunnable");
                appBarLayout.removeCallbacks(runnable);
                flingRunnableField.set(this, null);
            }
            if (overScroller == null || overScroller.isFinished()) {
                return;
            }
            overScroller.abortAnimation();
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
        } catch (NoSuchFieldException e6) {
            e6.printStackTrace();
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
        a.a(f27399c, "onInterceptTouchEvent:" + appBarLayout.getTotalScrollRange());
        this.f27402b = this.f27401a;
        if (motionEvent.getActionMasked() == 0) {
            stopAppbarLayoutFling(appBarLayout);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, (View) appBarLayout, motionEvent);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4, int i5, int[] iArr, int i6) {
        a.a(f27399c, "onNestedPreScroll:" + appBarLayout.getTotalScrollRange() + " ,dx:" + i4 + " ,dy:" + i5 + " ,type:" + i6);
        if (i6 == 1) {
            this.f27401a = true;
        }
        if (this.f27402b) {
            return;
        }
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i4, i5, iArr, i6);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4, int i5, int i6, int i7, int i8) {
        a.a(f27399c, "onNestedScroll: target:" + view.getClass() + " ," + appBarLayout.getTotalScrollRange() + " ,dxConsumed:" + i4 + " ,dyConsumed:" + i5 + " ,type:" + i8);
        if (this.f27402b) {
            return;
        }
        super.onNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i4, i5, i6, i7, i8);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i4, int i5) {
        a.a(f27399c, "onStartNestedScroll");
        stopAppbarLayoutFling(appBarLayout);
        return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i4, i5);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4) {
        a.a(f27399c, "onStopNestedScroll");
        super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i4);
        this.f27401a = false;
        this.f27402b = false;
    }
}

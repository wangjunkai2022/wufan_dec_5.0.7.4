package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.youth.banner.Banner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: NestedScrollableHost.kt */
/* loaded from: classes4.dex */
public final class NestedScrollableHost extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private int f47468b;

    /* renamed from: c  reason: collision with root package name */
    private float f47469c;

    /* renamed from: d  reason: collision with root package name */
    private float f47470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47468b = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final boolean a(int i4, float f5) {
        int i5 = -((int) Math.signum(f5));
        if (i4 != 0) {
            if (i4 == 1) {
                View child = getChild();
                if (child != null) {
                    return child.canScrollVertically(i5);
                }
                return false;
            }
            throw new IllegalArgumentException();
        } else if (getChild() instanceof Banner) {
            return true;
        } else {
            View child2 = getChild();
            if (child2 != null) {
                return child2.canScrollHorizontally(i5);
            }
            return false;
        }
    }

    private final void b(MotionEvent motionEvent) {
        ViewPager2 parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            int orientation = parentViewPager.getOrientation();
            if (a(orientation, -1.0f) || a(orientation, 1.0f)) {
                if (motionEvent.getAction() == 0) {
                    this.f47469c = motionEvent.getX();
                    this.f47470d = motionEvent.getY();
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (motionEvent.getAction() == 2) {
                    float x4 = motionEvent.getX() - this.f47469c;
                    float y2 = motionEvent.getY() - this.f47470d;
                    boolean z4 = orientation == 0;
                    float abs = Math.abs(x4) * (z4 ? 0.5f : 1.0f);
                    float abs2 = Math.abs(y2) * (z4 ? 1.0f : 0.5f);
                    int i4 = this.f47468b;
                    if (abs > i4 || abs2 > i4) {
                        if (z4 == (abs2 > abs)) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                            return;
                        }
                        if (!z4) {
                            x4 = y2;
                        }
                        if (a(orientation, x4)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        } else {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        }
                    }
                }
            }
        }
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[LOOP:0: B:6:0x000d->B:11:0x001b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x000c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x000c -> B:6:0x000d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.viewpager2.widget.ViewPager2 getParentViewPager() {
        /*
            r3 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto Lc
            android.view.View r0 = (android.view.View) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L1e
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 != 0) goto L1e
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Lc
            android.view.View r0 = (android.view.View) r0
            goto Ld
        L1e:
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 == 0) goto L25
            r2 = r0
            androidx.viewpager2.widget.ViewPager2 r2 = (androidx.viewpager2.widget.ViewPager2) r2
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.customview.NestedScrollableHost.getParentViewPager():androidx.viewpager2.widget.ViewPager2");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent e5) {
        Intrinsics.checkNotNullParameter(e5, "e");
        b(e5);
        return super.onInterceptTouchEvent(e5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47468b = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}

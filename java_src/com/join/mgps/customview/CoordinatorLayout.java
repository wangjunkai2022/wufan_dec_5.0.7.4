package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.flipboard.bottomsheet.BottomSheetLayout;
/* loaded from: classes4.dex */
public class CoordinatorLayout extends androidx.coordinatorlayout.widget.CoordinatorLayout {

    /* renamed from: b  reason: collision with root package name */
    BottomSheetLayout f46737b;

    /* loaded from: classes4.dex */
    public interface a {
        boolean a();
    }

    public CoordinatorLayout(@NonNull Context context) {
        super(context);
    }

    boolean a() {
        BottomSheetLayout bottomSheetLayout = this.f46737b;
        return bottomSheetLayout != null && bottomSheetLayout.A();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return a() ? this.f46737b.dispatchTouchEvent(motionEvent) : super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (a()) {
            return this.f46737b.onInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return a() ? this.f46737b.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public void setSheetLayout(BottomSheetLayout bottomSheetLayout) {
        this.f46737b = bottomSheetLayout;
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}

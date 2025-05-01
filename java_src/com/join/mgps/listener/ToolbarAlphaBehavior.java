package com.join.mgps.listener;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public class ToolbarAlphaBehavior extends CoordinatorLayout.Behavior<Toolbar> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f53539e = "ToolbarAlphaBehavior";

    /* renamed from: a  reason: collision with root package name */
    private int f53540a;

    /* renamed from: b  reason: collision with root package name */
    private int f53541b;

    /* renamed from: c  reason: collision with root package name */
    private int f53542c;

    /* renamed from: d  reason: collision with root package name */
    private Context f53543d;

    public ToolbarAlphaBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53540a = 0;
        this.f53541b = 0;
        this.f53542c = 0;
        this.f53543d = context;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: a */
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, Toolbar toolbar, View view, int i4, int i5, int i6, int i7) {
        this.f53541b = 0;
        int dimensionPixelOffset = this.f53543d.getResources().getDimensionPixelOffset(R.dimen.list_margin_height) - toolbar.getHeight();
        this.f53542c = dimensionPixelOffset;
        int i8 = this.f53540a + i5;
        this.f53540a = i8;
        int i9 = this.f53541b;
        if (i8 <= i9) {
            toolbar.getBackground().setAlpha(0);
        } else if (i8 > i9 && i8 < dimensionPixelOffset) {
            toolbar.getBackground().setAlpha(Math.round(((i8 - i9) / dimensionPixelOffset) * 255.0f));
        } else if (i8 >= dimensionPixelOffset) {
            toolbar.getBackground().setAlpha(255);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: b */
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, Toolbar toolbar, View view, View view2, int i4) {
        return true;
    }
}

package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import com.join.mgps.ptr.PtrFrameLayout;
/* loaded from: classes4.dex */
public class XListView4ForumPost extends XListView4NewGame {
    public XListView4ForumPost(Context context) {
        super(context);
    }

    public static boolean y(View view) {
        if (!(view instanceof AbsListView)) {
            return view.getScrollY() > 0;
        }
        AbsListView absListView = (AbsListView) view;
        return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
    }

    public static boolean z(PtrFrameLayout ptrFrameLayout, View view, View view2) {
        return !y(view);
    }

    @Override // com.join.mgps.customview.XListView2
    public boolean d(PtrFrameLayout ptrFrameLayout, View view, View view2) {
        return z(ptrFrameLayout, view, view2);
    }

    public XListView4ForumPost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public XListView4ForumPost(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}

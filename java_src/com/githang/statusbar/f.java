package com.githang.statusbar;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.TTAdConstant;
/* compiled from: StatusBarKitkatImpl.java */
/* loaded from: classes3.dex */
class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f13027a = "ghStatusBarView";

    private static int b(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @Override // com.githang.statusbar.b
    @TargetApi(19)
    public void a(Window window, int i4, boolean z4) {
        window.addFlags(TTAdConstant.KEY_CLICK_AREA);
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        View findViewWithTag = viewGroup.findViewWithTag(f13027a);
        if (findViewWithTag == null) {
            findViewWithTag = new View(window.getContext());
            findViewWithTag.setTag(f13027a);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, b(window.getContext()));
            layoutParams.gravity = 48;
            findViewWithTag.setLayoutParams(layoutParams);
            viewGroup.addView(findViewWithTag);
        }
        findViewWithTag.setBackgroundColor(i4);
        c.b(window, true);
        d.a(window, z4);
    }
}

package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.TabPageIndicator;
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class ActivityArenaGamelistBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f15702b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f15703c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f15704d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final XListView2 f15705e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TabPageIndicator f15706f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TopbarLeftTitleBinding f15707g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ViewPager f15708h;

    private ActivityArenaGamelistBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull XListView2 xListView2, @NonNull TabPageIndicator tabPageIndicator, @NonNull TopbarLeftTitleBinding topbarLeftTitleBinding, @NonNull ViewPager viewPager) {
        this.f15702b = linearLayout;
        this.f15703c = relativeLayout;
        this.f15704d = view;
        this.f15705e = xListView2;
        this.f15706f = tabPageIndicator;
        this.f15707g = topbarLeftTitleBinding;
        this.f15708h = viewPager;
    }

    @NonNull
    public static ActivityArenaGamelistBinding bind(@NonNull View view) {
        int i4 = R.id.layout_others_list;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layout_others_list);
        if (relativeLayout != null) {
            i4 = R.id.line;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
            if (findChildViewById != null) {
                i4 = R.id.listview;
                XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listview);
                if (xListView2 != null) {
                    i4 = R.id.pageIndicator;
                    TabPageIndicator tabPageIndicator = (TabPageIndicator) ViewBindings.findChildViewById(view, R.id.pageIndicator);
                    if (tabPageIndicator != null) {
                        i4 = R.id.title_bar_layout;
                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.title_bar_layout);
                        if (findChildViewById2 != null) {
                            TopbarLeftTitleBinding bind = TopbarLeftTitleBinding.bind(findChildViewById2);
                            i4 = R.id.viewPager;
                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                            if (viewPager != null) {
                                return new ActivityArenaGamelistBinding((LinearLayout) view, relativeLayout, findChildViewById, xListView2, tabPageIndicator, bind, viewPager);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityArenaGamelistBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f15702b;
    }

    @NonNull
    public static ActivityArenaGamelistBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_arena_gamelist, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}

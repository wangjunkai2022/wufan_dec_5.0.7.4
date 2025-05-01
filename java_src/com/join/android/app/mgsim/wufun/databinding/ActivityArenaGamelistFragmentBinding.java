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
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.TabPageIndicator;
/* loaded from: classes3.dex */
public final class ActivityArenaGamelistFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f15709b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f15710c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f15711d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final XRecyclerView f15712e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TabPageIndicator f15713f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ViewPager f15714g;

    private ActivityArenaGamelistFragmentBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull XRecyclerView xRecyclerView, @NonNull TabPageIndicator tabPageIndicator, @NonNull ViewPager viewPager) {
        this.f15709b = linearLayout;
        this.f15710c = relativeLayout;
        this.f15711d = view;
        this.f15712e = xRecyclerView;
        this.f15713f = tabPageIndicator;
        this.f15714g = viewPager;
    }

    @NonNull
    public static ActivityArenaGamelistFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.layout_others_list;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layout_others_list);
        if (relativeLayout != null) {
            i4 = R.id.line;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
            if (findChildViewById != null) {
                i4 = R.id.listview;
                XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.listview);
                if (xRecyclerView != null) {
                    i4 = R.id.pageIndicator;
                    TabPageIndicator tabPageIndicator = (TabPageIndicator) ViewBindings.findChildViewById(view, R.id.pageIndicator);
                    if (tabPageIndicator != null) {
                        i4 = R.id.viewPager;
                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                        if (viewPager != null) {
                            return new ActivityArenaGamelistFragmentBinding((LinearLayout) view, relativeLayout, findChildViewById, xRecyclerView, tabPageIndicator, viewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityArenaGamelistFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f15709b;
    }

    @NonNull
    public static ActivityArenaGamelistFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_arena_gamelist_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}

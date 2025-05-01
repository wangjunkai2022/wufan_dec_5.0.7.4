package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class EverydayNewGameFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19333b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TabLayout f19334c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ViewPager2 f19335d;

    private EverydayNewGameFragmentBinding(@NonNull LinearLayout linearLayout, @NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2) {
        this.f19333b = linearLayout;
        this.f19334c = tabLayout;
        this.f19335d = viewPager2;
    }

    @NonNull
    public static EverydayNewGameFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.tablayout;
        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tablayout);
        if (tabLayout != null) {
            i4 = R.id.viewPager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.viewPager);
            if (viewPager2 != null) {
                return new EverydayNewGameFragmentBinding((LinearLayout) view, tabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static EverydayNewGameFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19333b;
    }

    @NonNull
    public static EverydayNewGameFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.everyday_new_game_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}

package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutPapaMainHomeV4RankBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23220b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23221c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23222d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f23223e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TabLayout f23224f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ViewPager2 f23225g;

    private LayoutPapaMainHomeV4RankBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull View view, @NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2) {
        this.f23220b = constraintLayout;
        this.f23221c = imageView;
        this.f23222d = textView;
        this.f23223e = view;
        this.f23224f = tabLayout;
        this.f23225g = viewPager2;
    }

    @NonNull
    public static LayoutPapaMainHomeV4RankBinding bind(@NonNull View view) {
        int i4 = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.arrow);
        if (imageView != null) {
            i4 = R.id.more;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.more);
            if (textView != null) {
                i4 = R.id.rank_more;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.rank_more);
                if (findChildViewById != null) {
                    i4 = R.id.tablayout;
                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tablayout);
                    if (tabLayout != null) {
                        i4 = R.id.viewpager;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.viewpager);
                        if (viewPager2 != null) {
                            return new LayoutPapaMainHomeV4RankBinding((ConstraintLayout) view, imageView, textView, findChildViewById, tabLayout, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutPapaMainHomeV4RankBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23220b;
    }

    @NonNull
    public static LayoutPapaMainHomeV4RankBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_papa_main_home_v4_rank, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}

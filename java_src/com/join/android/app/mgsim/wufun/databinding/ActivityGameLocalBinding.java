package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.TabPageIndicator;
/* loaded from: classes3.dex */
public final class ActivityGameLocalBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16243b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f16244c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f16245d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ViewPager f16246e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TabPageIndicator f16247f;

    private ActivityGameLocalBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull ViewPager viewPager, @NonNull TabPageIndicator tabPageIndicator) {
        this.f16243b = linearLayout;
        this.f16244c = linearLayout2;
        this.f16245d = view;
        this.f16246e = viewPager;
        this.f16247f = tabPageIndicator;
    }

    @NonNull
    public static ActivityGameLocalBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.lineTop;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.lineTop);
        if (findChildViewById != null) {
            i4 = R.id.mViewpagerV4;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.mViewpagerV4);
            if (viewPager != null) {
                i4 = R.id.pageIndicator;
                TabPageIndicator tabPageIndicator = (TabPageIndicator) ViewBindings.findChildViewById(view, R.id.pageIndicator);
                if (tabPageIndicator != null) {
                    return new ActivityGameLocalBinding(linearLayout, linearLayout, findChildViewById, viewPager, tabPageIndicator);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityGameLocalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16243b;
    }

    @NonNull
    public static ActivityGameLocalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_game_local, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}

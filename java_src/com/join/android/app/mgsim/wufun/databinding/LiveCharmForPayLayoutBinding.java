package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.TabPageIndicator;
/* loaded from: classes3.dex */
public final class LiveCharmForPayLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23507b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f23508c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TabPageIndicator f23509d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23510e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ViewPager f23511f;

    private LiveCharmForPayLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull TabPageIndicator tabPageIndicator, @NonNull TextView textView, @NonNull ViewPager viewPager) {
        this.f23507b = linearLayout;
        this.f23508c = view;
        this.f23509d = tabPageIndicator;
        this.f23510e = textView;
        this.f23511f = viewPager;
    }

    @NonNull
    public static LiveCharmForPayLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.line;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
        if (findChildViewById != null) {
            i4 = R.id.pageIndicator;
            TabPageIndicator tabPageIndicator = (TabPageIndicator) ViewBindings.findChildViewById(view, R.id.pageIndicator);
            if (tabPageIndicator != null) {
                i4 = R.id.payNow;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.payNow);
                if (textView != null) {
                    i4 = R.id.viewPager;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                    if (viewPager != null) {
                        return new LiveCharmForPayLayoutBinding((LinearLayout) view, findChildViewById, tabPageIndicator, textView, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LiveCharmForPayLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23507b;
    }

    @NonNull
    public static LiveCharmForPayLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.live_charm_for_pay_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}

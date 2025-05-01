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
public final class ActivityVoucherCodesboxBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17255b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f17256c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TabPageIndicator f17257d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ViewPager f17258e;

    private ActivityVoucherCodesboxBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull TabPageIndicator tabPageIndicator, @NonNull ViewPager viewPager) {
        this.f17255b = linearLayout;
        this.f17256c = view;
        this.f17257d = tabPageIndicator;
        this.f17258e = viewPager;
    }

    @NonNull
    public static ActivityVoucherCodesboxBinding bind(@NonNull View view) {
        int i4 = R.id.line;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
        if (findChildViewById != null) {
            i4 = R.id.pageIndicator;
            TabPageIndicator tabPageIndicator = (TabPageIndicator) ViewBindings.findChildViewById(view, R.id.pageIndicator);
            if (tabPageIndicator != null) {
                i4 = R.id.viewPager;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                if (viewPager != null) {
                    return new ActivityVoucherCodesboxBinding((LinearLayout) view, findChildViewById, tabPageIndicator, viewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityVoucherCodesboxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17255b;
    }

    @NonNull
    public static ActivityVoucherCodesboxBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_voucher_codesbox, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
